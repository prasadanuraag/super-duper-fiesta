package com.mvncrmzy.testscript;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.mvncrmzy.Generic.BaseClass;
import com.mvncrmzy.pom.CreatePOrderPage;
import com.mvncrmzy.pom.CreateProductPage;
import com.mvncrmzy.pom.CreateVendorPage;
import com.mvncrmzy.pom.HomePage;
import com.mvncrmzy.pom.VendorDetailsPage;
import com.mvncrmzy.pom.VendorPage;

@Listeners(com.mvncrmzy.Generic.ListenerImplementation.class)
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
