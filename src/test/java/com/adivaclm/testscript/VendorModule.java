package com.adivaclm.testscript;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.adivaclm.Generic.BaseClass;
import com.adivaclm.pom.CreatePOrderPage;
import com.adivaclm.pom.CreateProductPage;
import com.adivaclm.pom.CreateVendorPage;
import com.adivaclm.pom.HomePage;
import com.adivaclm.pom.VendorDetailsPage;
import com.adivaclm.pom.VendorPage;

@Listeners(com.adivaclm.Generic.ListenerImplementation.class)
public class VendorModule extends BaseClass {
	
	@Test
	public void createVendor() {
		
		HomePage h = new HomePage(driver);
		h.getVendTb().click();
		
		VendorPage v = new VendorPage(driver);
		v.getNvenBtn().click();
		
		CreateVendorPage cv = new CreateVendorPage(driver);
		cv.getVnameTbx().sendKeys("godrej");
		cv.getSaveBtn().click();
		SoftAssert s = new SoftAssert();
		String text1 = driver.findElement(By.xpath("//td[@class='title hline']")).getText();
		 s.assertEquals(text1, "Vendor Details");
		
		}
	@Test
	public void vendorPOrder() throws IOException {
		
		HomePage h = new HomePage(driver);
		h.getVendTb().click();
		
		VendorPage v = new VendorPage(driver);
		v.getNvenBtn().click();
		
		CreateVendorPage cv = new CreateVendorPage(driver);
		cv.getVnameTbx().sendKeys(f.getExcelData("vendor", 1, 1));
		cv.getSaveBtn().click();
		
		SoftAssert s = new SoftAssert();
		String text1 = driver.findElement(By.xpath("//td[@class='title hline']")).getText();
		 s.assertEquals(text1, "Vendor Details");
		 
		VendorDetailsPage vd = new VendorDetailsPage(driver);
		vd.getNpoBtn().click();
		
		CreatePOrderPage po = new CreatePOrderPage(driver);
		po.getSubTbx().sendKeys(f.getExcelData("vendor", 1, 2));
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
		String text2 = driver.findElement(By.xpath("//td[@class='title hline']")).getText();
		 s.assertEquals(text2, "Purchase Order Details ");
	
	}
	
	@Test
	public void vendorProduct() throws IOException {
		
		HomePage h = new HomePage(driver);
		h.getVendTb().click();
		
		VendorPage v = new VendorPage(driver);
		v.getNvenBtn().click();
		
		CreateVendorPage cv = new CreateVendorPage(driver);
		cv.getVnameTbx().sendKeys(f.getExcelData("vendor", 1, 1));
		cv.getSaveBtn().click();
		SoftAssert s = new SoftAssert();
		String text1 = driver.findElement(By.xpath("//td[@class='title hline']")).getText();
		 s.assertEquals(text1, "Vendor Details");
		 
		 VendorDetailsPage vd = new VendorDetailsPage(driver);
		 vd.getNprodBtn().click();
		 
		 CreateProductPage cp = new CreateProductPage(driver);
		 cp.getProdNameTbx().sendKeys(f.getExcelData("products", 1, 1));
			
			cp.getSaveBtn().click();
			
			String text = driver.findElement(By.xpath("//td[@class='title hline']")).getText();
			 			 
			 s.assertEquals(text, "Product Details");
		
		
	}

}
