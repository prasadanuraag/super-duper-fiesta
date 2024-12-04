package com.adivaclm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{

	@FindBy(id = "userName")
	private WebElement unTbx;
	
	@FindBy(id = "passWord")
	private WebElement pwdTbx;
	
	@FindBy(xpath = "//input[@title ='Sign In']")
	private WebElement siBtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}

	public void setLogin(String un,String pw)
	{
		unTbx.sendKeys(un);
		pwdTbx.sendKeys(pw);
		siBtn.click();
	}
	
}
