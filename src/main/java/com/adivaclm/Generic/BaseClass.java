package com.adivaclm.Generic;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.adivaclm.pom.HomePage;
import com.adivaclm.pom.LoginPage;



public class BaseClass {
	
   public static WebDriver driver ;
   public FileLibrary f;
   WebdriverUtils w;
  
  @BeforeTest

   public void openBrowser()
  {
	   driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
  }

  @BeforeMethod
  public void login() throws IOException
  {
	  driver.get("http://192.168.145.129:8080/");
	  f= new FileLibrary();
	  String un = f.getPropertyData("username");
		 String pw = f.getPropertyData("password");
		
		LoginPage l = new LoginPage(driver);
		l.setLogin(un, pw);
	  
			  
  }
  @AfterMethod
  public void logout()
  
  {
	 HomePage h = new HomePage(driver);
	 h.getLgoutBtn().click();
	  	  
  }
@AfterTest

public void closeBrowser()
{
	driver.quit();
}

}
