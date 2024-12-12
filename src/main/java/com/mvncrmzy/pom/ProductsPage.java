package com.mvncrmzy.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	
	@FindBy(xpath = "//input[@value ='New Product']")
	private  WebElement  nprodBtn;
	

	@FindBy(xpath = "(//input[@name='chk'])[2]")
	private WebElement chkBx;
	
	@FindBy(xpath="//input[@value='Delete']")
	private WebElement delBtn;
	
	public ProductsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getNprodBtn() {
		return nprodBtn;
	}

	public WebElement getChkBx() {
		return chkBx;
	}

	public WebElement getDelBtn() {
		return delBtn;
	}
	
	

}
