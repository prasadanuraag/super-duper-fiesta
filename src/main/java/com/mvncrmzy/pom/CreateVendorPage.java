package com.mvncrmzy.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateVendorPage {
	
	@FindBy(xpath = "//input[@name ='property(Vendor Name)']")
	private  WebElement  vnameTbx;
	
	@FindBy(xpath="//input[@value='Save']")
	private WebElement saveBtn;
	
	@FindBy(xpath="//input[@value='Save & New']")
	private WebElement sandnBtn;
	
	@FindBy(xpath="//input[@value='Cancel']")
	private WebElement cancelBtn;
	
	public CreateVendorPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getVnameTbx() {
		return vnameTbx;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getSandnBtn() {
		return sandnBtn;
	}

	public WebElement getCancelBtn() {
		return cancelBtn;
	}

}
