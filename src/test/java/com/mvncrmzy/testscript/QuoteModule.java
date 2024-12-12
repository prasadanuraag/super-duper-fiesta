package com.mvncrmzy.testscript;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.mvncrmzy.Generic.BaseClass;
import com.mvncrmzy.Generic.WebdriverUtils;
import com.mvncrmzy.pom.CreateQuotePage;
import com.mvncrmzy.pom.HomePage;
import com.mvncrmzy.pom.QuotePage;

@Listeners(com.mvncrmzy.Generic.ListenerImplementation.class)
public class QuoteModule extends BaseClass {
	
	@Test
	
	public void createQuoteInvoice() throws InterruptedException, IOException {
		
		Actions a = new Actions(driver);
		
		for(int i = 0; i <5; i++) {
		a.click(driver.findElement(By.id("scrollright"))).perform();
		}
		
		HomePage h = new HomePage(driver);
		h.getQuoTb().click();
		
		QuotePage q = new QuotePage(driver);
		q.getNqtBtn().click();
		
		CreateQuotePage cq = new CreateQuotePage(driver);
		cq.getSubTbx().sendKeys(f.getExcelData("quotes", 1, 1)+"quo");
		
		cq.getAccLu().click();
		String wh = driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();
		WebdriverUtils w  = new WebdriverUtils();
		w.lookup();
		/*for(String s : allwh)
		{
			driver.switchTo().window(s);
		}*/
		driver.findElement(By.linkText("hp")).click();
		
		driver.switchTo().window(wh);
		cq.getProdLu().click();
		Set<String> allwh1 = driver.getWindowHandles();
		for(String s : allwh1)
		{
			driver.switchTo().window(s);
		}
		
		driver.findElement(By.linkText("activa")).click();
		
		
		
		driver.switchTo().window(wh);
		driver.findElement(By.id("txtQty1")).sendKeys("1");
		
		cq.getPbLu().click();
		
		Set<String> allwh2= driver.getWindowHandles();
		for(String s : allwh2)
		{
			driver.switchTo().window(s);
			
		}
		
		driver.findElement(By.linkText("hondanew")).click();
		
		driver.switchTo().window(wh);
		
		cq.getSaveBtn().click();
		
		SoftAssert s = new SoftAssert();
		String text1 = driver.findElement(By.xpath("//td[@class='title hline']")).getText();
		 s.assertEquals(text1, "Quote Details");
		 
		 cq.getNsoBTn().click();
		 cq.getSubTbx().clear();
		 cq.getSubTbx().sendKeys(f.getExcelData("quotes", 1, 1)+"so");
		 cq.getSaveBtn().click();
		
			String text2 = driver.findElement(By.xpath("//td[@class='title hline']")).getText();
			 s.assertEquals(text2, "Sales Order Details");
		 
		 cq.getNivBTn().click();
		 cq.getSubTbx().clear();
		 cq.getSubTbx().sendKeys(f.getExcelData("quotes", 1, 1)+"inv");
		 cq.getSaveBtn().click();
		 Thread.sleep(2000);
		 
		/*	String text3 = driver.findElement(By.xpath("//td[@class='title hline']")).getText();
			 s.assertEquals(text3, "Invoice Details");*/
	
}
}