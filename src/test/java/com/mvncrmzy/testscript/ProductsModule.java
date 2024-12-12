package com.mvncrmzy.testscript;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.mvncrmzy.Generic.BaseClass;
import com.mvncrmzy.pom.AddPriceBookPage;
import com.mvncrmzy.pom.CreateLeadsPage;
import com.mvncrmzy.pom.CreateProductPage;
import com.mvncrmzy.pom.CreateProspectPage;
import com.mvncrmzy.pom.HomePage;
import com.mvncrmzy.pom.ProductDetailsPage;
import com.mvncrmzy.pom.ProductsPage;

@Listeners(com.mvncrmzy.Generic.ListenerImplementation.class)
public class ProductsModule extends BaseClass {
	@Test
	public void createProduct() throws IOException {
		
		HomePage h = new HomePage(driver);
		h.getProdTb().click();
		ProductsPage p = new ProductsPage(driver);
		p.getNprodBtn().click();
		
		CreateProductPage cp = new CreateProductPage(driver);
		cp.getProdNameTbx().sendKeys(f.getExcelData("products", 1, 1));
		
		cp.getSaveBtn().click();
		
		String text = driver.findElement(By.xpath("//td[@class='title hline']")).getText();
		 SoftAssert s= new SoftAssert();
		 
		 s.assertEquals(text, "Product Details");
				
	}
	
	@Test
	
	public void productLeads() throws IOException, InterruptedException
	{
		HomePage h = new HomePage(driver);
		h.getProdTb().click();
		ProductsPage p = new ProductsPage(driver);
		p.getNprodBtn().click();
		
		CreateProductPage cp = new CreateProductPage(driver);
		cp.getProdNameTbx().sendKeys(f.getExcelData("products", 1, 1));
		
		cp.getSaveBtn().click();
		
		String text = driver.findElement(By.xpath("//td[@class='title hline']")).getText();
		 SoftAssert s= new SoftAssert();
		 
		 s.assertEquals(text, "Product Details");
		 ProductDetailsPage pd = new ProductDetailsPage(driver);
		 pd.getNewLeadBtn().click();
		 CreateLeadsPage cl = new CreateLeadsPage(driver);
			cl.getSaveBtn().click();
			driver.switchTo().alert().accept();
			Thread.sleep(2000);
			cl.getCompNameTbx().sendKeys("vis");
			cl.getSaveBtn().click();
			driver.switchTo().alert().accept();
			cl.getLastnTbx().sendKeys("wan");;
			cl.getFirstnTbx().sendKeys("vision");
			cl.getSaveBtn().submit();
			h.getLeadsTb().click();
	}
	
	@Test
	
	public void productProspects() throws InterruptedException, IOException {
		
		HomePage h = new HomePage(driver);
		h.getProdTb().click();
		ProductsPage p = new ProductsPage(driver);
		p.getNprodBtn().click();
		
		CreateProductPage cp = new CreateProductPage(driver);
		cp.getProdNameTbx().sendKeys(f.getExcelData("products", 1, 1));
		
		cp.getSaveBtn().click();
		
		String text = driver.findElement(By.xpath("//td[@class='title hline']")).getText();
		 SoftAssert s= new SoftAssert();
		 
		 s.assertEquals(text, "Product Details");
		 ProductDetailsPage pd = new ProductDetailsPage(driver);
		 pd.getNewPotBtn().click();
		 
		 CreateProspectPage cpr = new CreateProspectPage(driver);
			Thread.sleep(1000);
			cpr.getPotNameTbx().sendKeys("abc");
			Thread.sleep(1000);
			cpr.getAccNameLu().click();
			String wh = driver.getWindowHandle();
			Set<String> whs = driver.getWindowHandles();
			Thread.sleep(1000);
			for(String s1 : whs) 
			{
				
					driver.switchTo().window(s1);
					Thread.sleep(1000);
					
				
			}
			driver.findElement(By.linkText("accenture")).click();
			Thread.sleep(3000);
			driver.switchTo().window(wh);
			cpr.getCaldLu().click();
		    Set<String> allwh = driver.getWindowHandles();
			
			for(String s2 : allwh) 
			{
				driver.switchTo().window(s2);
					Thread.sleep(1000);
			}
			
			driver.findElement(By.linkText("18")).click();
			
			Thread.sleep(3000);
			driver.switchTo().window(wh);
			Thread.sleep(1000);
			cpr.getStageDd();
			Thread.sleep(1000);
			cpr.getSaveBtn().click();
			
			 String text1 = driver.findElement(By.xpath("//td[@class='title hline']")).getText();
			 s.assertEquals(text1, "Potential Details");
		
	}
	@Test
	public void productPBooks() throws IOException
	{
		HomePage h = new HomePage(driver);
		h.getProdTb().click();
		ProductsPage p = new ProductsPage(driver);
		p.getNprodBtn().click();
		
		CreateProductPage cp = new CreateProductPage(driver);
		cp.getProdNameTbx().sendKeys(f.getExcelData("products", 1, 1));
		
		cp.getSaveBtn().click();
		
		String text = driver.findElement(By.xpath("//td[@class='title hline']")).getText();
		 SoftAssert s= new SoftAssert();
		 
		 s.assertEquals(text, "Product Details");
		 
		 ProductDetailsPage pd = new ProductDetailsPage(driver);
		 pd.getAddpbBtn().click();
		 
		 AddPriceBookPage ap = new AddPriceBookPage(driver);
		 
		 ap.getAddpbBtn().click();
		 driver.switchTo().alert().accept();
		 ap.getChkBx().click();
		 ap.getAddpbBtn().click();
		 driver.switchTo().alert().accept();
		 ap.getPriceTbx().sendKeys("3000.0");
		 
		 ap.getAddpbBtn().click();
		 
		  text = driver.findElement(By.xpath("//td[@class='title hline']")).getText();
		 s= new SoftAssert();
		 
		 s.assertEquals(text, "Product Details");
		 
		 
				
		
		
	}

}
