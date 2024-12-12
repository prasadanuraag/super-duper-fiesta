package com.mvncrmzy.testscript;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.mvncrmzy.Generic.BaseClass;
import com.mvncrmzy.pom.ConvertLeadsPage;
import com.mvncrmzy.pom.CreateLeadsPage;
import com.mvncrmzy.pom.HomePage;
import com.mvncrmzy.pom.LeadsDetailsPage;
import com.mvncrmzy.pom.LeadsPage;
@Listeners(com.mvncrmzy.Generic.ListenerImplementation.class)
public class LeadsModule extends BaseClass {
	
	@Test
	public void createLeads() throws IOException
	{
		HomePage h = new HomePage(driver);
		h.getLeadsTb().click();
		LeadsPage l = new LeadsPage(driver);
		l.getNleadBtn().click();
		CreateLeadsPage cl = new CreateLeadsPage(driver);
		cl.getSaveBtn().click();
		driver.switchTo().alert().accept();
		cl.getCompNameTbx().sendKeys(f.getExcelData("leads", 3, 1));
		cl.getSaveBtn().click();
		driver.switchTo().alert().accept();
		cl.getLastnTbx().sendKeys(f.getExcelData("leads", 3, 2));
		cl.getFirstnTbx().sendKeys(f.getExcelData("leads",3, 3));
		cl.getSaveBtn().submit();
		 String text = driver.findElement(By.xpath("//td[@class='title hline']")).getText();
		 SoftAssert s= new SoftAssert();
		 
		 s.assertEquals(text, "Lead Details");
		
	}
	
	@Test(enabled=false)
	
	public void convertLeads() throws InterruptedException
	{
		HomePage h = new HomePage(driver);
		h.getLeadsTb().click();
		LeadsPage l = new LeadsPage(driver);
		l.getNleadBtn().click();
		CreateLeadsPage cl = new CreateLeadsPage(driver);
		cl.getSaveBtn().click();
		driver.switchTo().alert().accept();
		cl.getCompNameTbx().sendKeys("abc");
		cl.getSaveBtn().click();
		driver.switchTo().alert().accept();
		cl.getLastnTbx().sendKeys("stark");
		cl.getFirstnTbx().sendKeys("tony");
		cl.getSaveBtn().submit();
		 String text = driver.findElement(By.xpath("//td[@class='title hline']")).getText();
		 SoftAssert s= new SoftAssert();
		 
		 s.assertEquals(text, "Lead Details");
		 
		 LeadsDetailsPage ld = new LeadsDetailsPage(driver);
		 ld.getConPotBtn().click();
	
		ConvertLeadsPage conl = new ConvertLeadsPage(driver);
		conl.getCalnBtn().click();
		String wh = driver.getWindowHandle();
		Set<String> whs = driver.getWindowHandles();
		for(String s1 : whs)
		{
			driver.switchTo().window(s1);
		}
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("16")).click();
		driver.switchTo().window(wh);
		Thread.sleep(2000);
		conl.getPstage();
		Thread.sleep(2000);
		conl.getSaveBtn().click();
		Thread.sleep(2000);
		String text1 = driver.findElement(By.xpath("//td[@class='title hline']")).getText();
		
		 
		 s.assertEquals(text1, "Account Details");
		
	}
	@Test
	
	public void deleteLeads()
	{
		HomePage h = new HomePage(driver);
		h.getLeadsTb().click();
		LeadsPage l = new LeadsPage(driver);
		l.getChkBx().click();
		l.getDelBtn().click();
		
		driver.switchTo().alert().accept();
		
	}

}
