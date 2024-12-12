package com.mvncrmzy.testscript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.mvncrmzy.Generic.BaseClass;
import com.mvncrmzy.pom.CreateProspectPage;
import com.mvncrmzy.pom.HomePage;
import com.mvncrmzy.pom.ProspectsPage;

@Listeners(com.mvncrmzy.Generic.ListenerImplementation.class)
public class ProspectsModule extends  BaseClass {

	@Test
	public void createProspects() throws InterruptedException {
		
		HomePage h = new HomePage(driver);
		h.getPotTb().click();
		Thread.sleep(1000);
		ProspectsPage p = new ProspectsPage(driver);
				p.getNewPotBtn().click();
				Thread.sleep(1000);
				CreateProspectPage cp = new CreateProspectPage(driver);
				Thread.sleep(1000);
				cp.getPotNameTbx().sendKeys("abc");
				Thread.sleep(1000);
				cp.getAccNameLu().click();
				String wh = driver.getWindowHandle();
				Set<String> whs = driver.getWindowHandles();
				Thread.sleep(1000);
				for(String s : whs) 
				{
					
					Thread.sleep(1000);
					
						driver.switchTo().window(s);
						Thread.sleep(1000);
						
					
				}
				driver.findElement(By.linkText("accenture")).click();
				Thread.sleep(3000);
				driver.switchTo().window(wh);
				cp.getCaldLu().click();
			    Set<String> allwh = driver.getWindowHandles();
				
				for(String s : allwh) 
				{
					driver.switchTo().window(s);
						Thread.sleep(1000);
				}
				
				driver.findElement(By.linkText("18")).click();//outside the loop;
					
				Thread.sleep(3000);
				driver.switchTo().window(wh);
				Thread.sleep(1000);
				cp.getStageDd();
				Thread.sleep(1000);
				cp.getSaveBtn().click();
				
				 String text = driver.findElement(By.xpath("//td[@class='title hline']")).getText();
				 SoftAssert s= new SoftAssert();
				 
				 s.assertEquals(text, "Potential Details");
	}
}
	
	

