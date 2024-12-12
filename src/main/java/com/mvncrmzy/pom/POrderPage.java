package com.mvncrmzy.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POrderPage {
	
	@FindBy(xpath = "//input[@value='New Purchase Order']")
	private WebElement npoBtn;
	
	@FindBy(xpath = "(//input[@name='chk'])[2]")
	private WebElement chkBx;
	
	@FindBy(xpath="//input[@value='Delete']")
	private WebElement delBtn;
	
	public POrderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getNpoBtn() {
		return npoBtn;
	}

	public WebElement getChkBx() {
		return chkBx;
	}

	public WebElement getDelBtn() {
		return delBtn;
	}

}
