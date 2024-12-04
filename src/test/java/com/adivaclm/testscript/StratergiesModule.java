package com.adivaclm.testscript;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.adivaclm.Generic.BaseClass;
import com.adivaclm.pom.CreateLeadsPage;
import com.adivaclm.pom.CreateStratergiesPage;
import com.adivaclm.pom.HomePage;
import com.adivaclm.pom.StratergiesDetails;
import com.adivaclm.pom.StratergiesPage;

@Listeners(com.adivaclm.Generic.ListenerImplementation.class)
public class StratergiesModule extends BaseClass {
	
	@Test
	public void createStrategy() throws IOException
	{
		HomePage h = new HomePage(driver);
		h.getCampTb().click();
		StratergiesPage s = new StratergiesPage(driver);
		
		s.getNewchBtn().click();
		
		CreateStratergiesPage cs = new CreateStratergiesPage(driver);
		cs.getSaveBtn().click();
		driver.switchTo().alert().accept();
		cs.getCampTbx().sendKeys(f.getExcelData("campaign", 1, 1));
		cs.getSaveBtn().submit();
		
		 String text = driver.findElement(By.xpath("//td[@class='title hline']")).getText();
		 SoftAssert sa= new SoftAssert();
		 sa.assertEquals(text, "Campaign Details");
				 	 
		 }
	
	
	@Test
	
	public void creatStrategyLead() throws IOException
	{
		
HomePage h = new HomePage(driver);
		
		h.getCampTb().click();
		StratergiesPage s= new StratergiesPage(driver);
		
		s.getNewchBtn().click();
		
		CreateStratergiesPage cs = new CreateStratergiesPage(driver);
		cs.getSaveBtn().click();
		driver.switchTo().alert().accept();
		cs.getCampTbx().sendKeys(f.getExcelData("campaign", 2, 1));
		cs.getSaveBtn().submit();
		
		 String text = driver.findElement(By.xpath("//td[@class='title hline']")).getText();
		 SoftAssert sa= new SoftAssert();
		 sa.assertEquals(text, "Campaign Details");
		
		StratergiesDetails sd = new StratergiesDetails(driver);
		sd.getNewLeadBtn().click();
		CreateLeadsPage cl = new CreateLeadsPage(driver);
		cl.getSaveBtn().click();
		driver.switchTo().alert().accept();
		cl.getCompNameTbx().sendKeys(f.getExcelData("leads",2, 1));
		cl.getSaveBtn().click();;
		driver.switchTo().alert().accept();
		cl.getLastnTbx().sendKeys(f.getExcelData("leads", 2, 2));;
		cl.getFirstnTbx().sendKeys(f.getExcelData("leads", 2, 3));
		cl.getSaveBtn().submit();
		h.getLeadsTb().click();
	
		
	}
	@Test(dependsOnMethods = "createStrategy")
	
	public void deleteStrategy()
	{
		
       HomePage h = new HomePage(driver);
		
		h.getCampTb().click();
		StratergiesPage s= new StratergiesPage(driver);
		
		/*s.getNewchBtn().click();
		
		CreateStratergiesPage cs = new CreateStratergiesPage(driver);
		cs.getSaveBtn().click();
		driver.switchTo().alert().accept();
		cs.getCampTbx().sendKeys("honda");
		cs.getSaveBtn().submit();
		
		 String text = driver.findElement(By.xpath("//td[@class='title hline']")).getText();
		 SoftAssert sa= new SoftAssert();
		 sa.assertEquals(text, "Campaign Details");*/
				 	 
		h.getCampTb().click();
		s.getChkBx();
		s.getDelBtn().click();
		driver.switchTo().alert().accept();
		
		
		
	}

}
