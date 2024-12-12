package com.mvncrmzy.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBPage {
	
	@FindBy(xpath = "//input[@value ='New Price Book']")
	private WebElement npbBtn;
	
	@FindBy(xpath = "(//input[@name='chk'])[2]")
	private WebElement chkBx;
	
	@FindBy(xpath="//input[@value='Delete']")
	private WebElement delBtn;
	
	public PBPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getNpbBtn() {
		return npbBtn;
	}

	public WebElement getChkBx() {
		return chkBx;
	}

	public WebElement getDelBtn() {
		return delBtn;
	}

}
