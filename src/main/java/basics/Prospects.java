package basics;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Prospects {
	public static void main(String[]args) throws InterruptedException
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("http://192.168.145.129:8080/");
	driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
	driver.findElement(By.id("passWord")).sendKeys("123456" + Keys.ENTER);
	Actions a = new Actions(driver);
	int i = 0;
	
	//driver.findElement(By.linkText("Purchase Orders"))
	boolean b = false;
	while(i<20) {
		System.out.println("hi");
		a.click(driver.findElement(By.id("scrollright"))).perform();
		Thread.sleep(1000);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Purchase Orders")));
		//b = driver.findElement(By.linkText("Purchase Orders")).isDisplayed();
		if(b == true)
		{
			break;
		}
	System.out.println("hi");
	i++;
	System.out.println(i);
	}
	
	
	
	/*driver.findElement(By.linkText("Potentials")).click();
	driver.findElement(By.xpath("//input[@value ='New Potential']")).click();
	driver.findElement(By.xpath("//img[@title='Calendar']")).click();
	Set<String> allwh = driver.getWindowHandles();
	for(String s : allwh){
		driver.switchTo().window(s);
	}
	
	driver.findElement(By.linkText("18")).click();*/
	
	driver.findElement(By.linkText("Logout [rashmi@dell.com]")).click();
	driver.quit();
	
	}
}
