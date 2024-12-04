package com.adivaclm.testscript;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.adivaclm.Generic.BaseClass;
import com.adivaclm.pom.AddPriceBookPage;
import com.adivaclm.pom.CreatePBPage;
import com.adivaclm.pom.HomePage;
import com.adivaclm.pom.PBDetailsPage;
import com.adivaclm.pom.PBPage;

@Listeners(com.adivaclm.Generic.ListenerImplementation.class)
public class PriceBookModule extends BaseClass {
	
	@Test
	
	public void addProducts() {
		
		HomePage h= new HomePage(driver);
		h.getPbTb().click();
		PBPage p = new PBPage(driver);
		p.getNpbBtn().click();
		
		CreatePBPage cp = new CreatePBPage(driver);
		cp.getPbTbx().sendKeys("imp");
		cp.getSaveBtn().click();
		SoftAssert s= new SoftAssert();
		String text = driver.findElement(By.xpath("//td[@class='title hline']")).getText();
		 s.assertEquals(text, "Price Book Details");
		 
		 PBDetailsPage pd = new PBDetailsPage(driver);
		 pd.getAddprodBtn().click();
		 
 AddPriceBookPage ap = new AddPriceBookPage(driver);
		 
 ap.getAddprodBtn().click();
		 driver.switchTo().alert().accept();
		 ap.getChkBx().click();
		 ap.getAddprodBtn().click();
		 driver.switchTo().alert().accept();
		 ap.getPriceTbx().sendKeys("3000.0");
		 
		 ap.getAddprodBtn().click();
		 
		/*  text = driver.findElement(By.xpath("//td[@class='title hline']")).getText();
		 s= new SoftAssert();
		 
		 s.assertEquals(text, "Price Book Details ");*/
		
	}

}
