package com.adivaclm.testscript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.adivaclm.Generic.BaseClass;
import com.adivaclm.Generic.WebdriverUtils;
import com.adivaclm.pom.CreateInvoicePage;
import com.adivaclm.pom.HomePage;
import com.adivaclm.pom.InvoicePage;
@Listeners(com.adivaclm.Generic.ListenerImplementation.class)
public class InvoiceModule extends BaseClass{
	
	@Test
	public void createInvoice() {
		
Actions a = new Actions(driver);
		
		for(int i =0; i <=40 ;i++) {
			
		a.click(driver.findElement(By.id("scrollright"))).perform();
		}
		
		HomePage h = new HomePage(driver);
		h.getInTb().click();
		
		InvoicePage in = new InvoicePage(driver);
		in.getNinvBtn().click();
		
		CreateInvoicePage ci = new CreateInvoicePage(driver);
		ci.getSubTbx().sendKeys("trensquo");
		
		ci.getAccLu().click();
		
		
		
		String wh = driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();
		for(String s : allwh)
		{
			driver.switchTo().window(s);
		}
		driver.findElement(By.linkText("hp")).click();
		
		driver.switchTo().window(wh);
		ci.getProdLu().click();
		Set<String> allwh1 = driver.getWindowHandles();
		for(String s : allwh1)
		{
			driver.switchTo().window(s);
		}
		
		driver.findElement(By.linkText("activa")).click();
		
		
		
		driver.switchTo().window(wh);
		driver.findElement(By.id("txtQty1")).sendKeys("1");
		
		ci.getPbLu().click();
		
		Set<String> allwh2= driver.getWindowHandles();
		for(String s : allwh2)
		{
			driver.switchTo().window(s);
			
		}
		
		driver.findElement(By.linkText("hondanew")).click();
		
		driver.switchTo().window(wh);
		
		ci.getSaveBtn().click();
		
		SoftAssert s = new SoftAssert();
		String text1 = driver.findElement(By.xpath("//td[@class='title hline']")).getText();
		 s.assertEquals(text1, "Invoice Details");
	}

}
