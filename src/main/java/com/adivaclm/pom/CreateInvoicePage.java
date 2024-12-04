package com.adivaclm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateInvoicePage {
	
	@FindBy(xpath = "//input[@name='property(Subject)']")
	private WebElement subTbx;
	
	@FindBy(xpath = "//img[@title='Account Name Lookup']")
	private WebElement accLu;
	
	@FindBy(xpath = "//img[@title='Product Name Lookup']")
	private WebElement prodLu;
	
	@FindBy(xpath = "//img[@title='PriceBook Name Lookup']")
	private WebElement pbLu;
	
	@FindBy(id = "txtQty1")
	private WebElement qty;
	
	@FindBy(xpath="//input[@value='Save']")
	private WebElement saveBtn;
	
	@FindBy(xpath="//input[@value='Save & New']")
	private WebElement sandnBtn;
	
	@FindBy(xpath="//input[@value='Cancel']")
	private WebElement cancelBtn;
	
	public CreateInvoicePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getSubTbx() {
		return subTbx;
	}

	public WebElement getAccLu() {
		return accLu;
	}

	public WebElement getProdLu() {
		return prodLu;
	}

	public WebElement getPbLu() {
		return pbLu;
	}

	public WebElement getQty() {
		return qty;
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
