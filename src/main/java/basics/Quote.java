package basics;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class Quote {
	public static void main(String[] args)
	{

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("http://192.168.145.129:8080/");
	driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
	driver.findElement(By.id("passWord")).sendKeys("123456" + Keys.ENTER);
	
	Actions a = new Actions(driver);
	
	for(int i = 0; i <5; i++) {
	a.click(driver.findElement(By.id("scrollright"))).perform();
	}
	
	driver.findElement(By.linkText("Quotes")).click();
	driver.findElement(By.xpath("//input[@value='New Quote']")).click();
	driver.findElement(By.xpath("//input[@name='property(Subject)']")).sendKeys("trensquo");
	
	driver.findElement(By.xpath("//img[@title='Account Name Lookup']")).click();
	String wh = driver.getWindowHandle();
	Set<String> allwh = driver.getWindowHandles();
	for(String s : allwh)
	{
		driver.switchTo().window(s);
	}
	driver.findElement(By.linkText("hp")).click();
	
	driver.switchTo().window(wh);
	driver.findElement(By.xpath("//img[@title='Product Name Lookup']")).click();
	
	
	Set<String> allwh1 = driver.getWindowHandles();
	for(String s : allwh1)
	{
		driver.switchTo().window(s);
	}
	
	driver.findElement(By.linkText("activa")).click();
	
	
	
	driver.switchTo().window(wh);
	driver.findElement(By.id("txtQty1")).sendKeys("1");
	
	driver.findElement(By.xpath("//img[@title='PriceBook Name Lookup']")).click();
	
	Set<String> allwh2= driver.getWindowHandles();
	for(String s : allwh2)
	{
		driver.switchTo().window(s);
		
	}
	
	driver.findElement(By.linkText("hondanew")).click();
	
	driver.switchTo().window(wh);
	
	
	
	driver.findElement(By.xpath("//input[@value='Save']")).click();
	
	SoftAssert s = new SoftAssert();
	String text1 = driver.findElement(By.xpath("//td[@class='title hline']")).getText();
	 s.assertEquals(text1, "Quote Details");
	 
	 driver.findElement(By.xpath("//input[@value='New Sales Order']")).click();
	 driver.findElement(By.xpath("//input[@name='property(Subject)']")).clear();
	 driver.findElement(By.xpath("//input[@name='property(Subject)']")).sendKeys("trensso");
	 
	 driver.findElement(By.xpath("//input[@value='Save']")).click();
	 
	 driver.findElement(By.xpath("//input[@value='New Invoice']")).click();
	 driver.findElement(By.xpath("//input[@name='property(Subject)']")).clear();
	 driver.findElement(By.xpath("//input[@name='property(Subject)']")).sendKeys("trensInv");
	 	 
	 driver.findElement(By.xpath("//input[@value='Save']")).click();
	
	//driver.findElement(By.linkText("Logout [rashmi@dell.com]")).click();
	//driver.quit();

}
}