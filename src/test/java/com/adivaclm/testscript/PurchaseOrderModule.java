package com.adivaclm.testscript;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.adivaclm.Generic.BaseClass;
import com.adivaclm.pom.CreatePOrderPage;
import com.adivaclm.pom.HomePage;
import com.adivaclm.pom.POrderPage;

@Listeners(com.adivaclm.Generic.ListenerImplementation.class)
public class PurchaseOrderModule extends BaseClass{
	
	@Test
	public void createPurchaseOrder() throws InterruptedException
	{
		HomePage h = new HomePage(driver);
		
Actions a = new Actions(driver);
		//boolean b = true;
		int i = 0;
		while(i<25) {
			Thread.sleep(1000);
			a.click(driver.findElement(By.id("scrollright"))).perform();
			
		System.out.println("hi");
		
		/*if(h.getPoTb().isDisplayed())
		{
			b= false;
		break;
		}
		else
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.visibilityOf(h.getPoTb()));
		}*/
		i++;
		}
		
			
		
		
	
	h.getPoTb().click();
	POrderPage p = new POrderPage(driver);
	p.getNpoBtn().click();
	
	CreatePOrderPage po = new CreatePOrderPage(driver);
	po.getSubTbx().sendKeys("p order");
	po.getVenLu().click();
	
	String wh = driver.getWindowHandle();
	Set<String> allwh = driver.getWindowHandles();
	for(String s1 : allwh)
	{
		driver.switchTo().window(s1);
	}
	driver.findElement(By.linkText("trends")).click();
	
	driver.switchTo().window(wh);
	
	po.getProdLu().click();
	
	Set<String> allwh1 = driver.getWindowHandles();
	for(String s2 : allwh1)
	{
		driver.switchTo().window(s2);
	}
	
	driver.findElement(By.linkText("jeans")).click();
	
	driver.switchTo().window(wh);
	po.getQtyTbx().sendKeys("2");
	
	po.getPbLu().click();
	
	Set<String> allwh2= driver.getWindowHandles();
	for(String s3 : allwh2)
	{
		driver.switchTo().window(s3);
		
	}
	
	driver.findElement(By.linkText("trends_pb")).click();
	
	driver.switchTo().window(wh);
	
	po.getSaveBtn().click();
	SoftAssert s = new SoftAssert();
	String text2 = driver.findElement(By.xpath("//td[@class='title hline']")).getText();
	 s.assertEquals(text2, "Purchase Order Details ");

	
	
	
	}

}
