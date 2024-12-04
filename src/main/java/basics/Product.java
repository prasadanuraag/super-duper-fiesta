package basics;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Product {

	public static void main(String[]args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://192.168.145.129:8080/");
		driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
		driver.findElement(By.id("passWord")).sendKeys("123456" + Keys.ENTER);
		
		/*(driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.xpath("//input[@value='New Product']")).click();
		driver.findElement(By.xpath("//input[@name='property(Product Name)']")).sendKeys("car");
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		driver.findElement(By.xpath("//input[@value='Add to Price Books '] ")).click();
		driver.findElement(By.xpath("(//input[@name='chk'] )[3] ")).click();
		driver.findElement(By.xpath("(//input[@name='listPrice1'])[3]")).sendKeys("100.0");
		driver.findElement(By.xpath("//input[@value='Add to Price Books ']")).click();*/
		
		driver.findElement(By.linkText("Vendors")).click();
		driver.findElement(By.xpath("//input[@value='New Vendor']")).click();
		driver.findElement(By.xpath("//input[@name ='property(Vendor Name)']")).sendKeys("godrej");
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		
		
		driver.findElement(By.xpath("//input[@value='New Purchase Order']")).click();
		driver.findElement(By.xpath("//input[@name='property(Subject)']")).sendKeys("po");
		driver.findElement(By.xpath("//img[@title='Vendor Name Lookup']")).click();
		String wh = driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();
		for(String s : allwh)
		{
			driver.switchTo().window(s);
		}
		driver.findElement(By.linkText("trends")).click();
		
		driver.switchTo().window(wh);
		
		driver.findElement(By.xpath("//img[@title='Product Name Lookup']")).click();
		
		
		Set<String> allwh1 = driver.getWindowHandles();
		for(String s : allwh1)
		{
			driver.switchTo().window(s);
		}
		
		driver.findElement(By.linkText("jeans")).click();
		
		
		
		driver.switchTo().window(wh);
		driver.findElement(By.id("txtQty1")).sendKeys("2");
		
		driver.findElement(By.xpath("//img[@title='PriceBook Name Lookup']")).click();
		
		Set<String> allwh2= driver.getWindowHandles();
		for(String s : allwh2)
		{
			driver.switchTo().window(s);
			
		}
		
		driver.findElement(By.linkText("trends_pb")).click();
		
		driver.switchTo().window(wh);
		
		
		
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		
		SoftAssert s = new SoftAssert();
		String text1 = driver.findElement(By.xpath("//td[@class='title hline']")).getText();
		 s.assertEquals(text1, "Purchase Order Details ");
		 
		
		
		driver.findElement(By.linkText("Logout [rashmi@dell.com]")).click();
		driver.quit();
		
		
		
		
		
	}
}
