package com.mvncrmzy.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuotePage {
	
	@FindBy(xpath = "//input[@value='New Quote']")
	private WebElement nqtBtn;
	
	@FindBy(xpath = "(//input[@name='chk'])[2]")
	private WebElement chkBx;
	
	@FindBy(xpath="//input[@value='Delete']")
	private WebElement delBtn;
	
	public QuotePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getNqtBtn() {
		return nqtBtn;
	}

	public WebElement getChkBx() {
		return chkBx;
	}

	public WebElement getDelBtn() {
		return delBtn;
	}

}
