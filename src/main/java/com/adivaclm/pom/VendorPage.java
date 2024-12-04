package com.adivaclm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorPage {
	
	@FindBy(xpath = "//input[@value='New Vendor']")
	private WebElement nvenBtn;
	
	@FindBy(xpath = "(//input[@name='chk'])[2]")
	private WebElement chkBx;
	
	@FindBy(xpath="//input[@value='Delete']")
	private WebElement delBtn;
	
	public VendorPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getNvenBtn() {
		return nvenBtn;
	}

	public WebElement getChkBx() {
		return chkBx;
	}

	public WebElement getDelBtn() {
		return delBtn;
	}

}
