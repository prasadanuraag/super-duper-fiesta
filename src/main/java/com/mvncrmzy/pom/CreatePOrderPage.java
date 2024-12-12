package com.mvncrmzy.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePOrderPage {
	
	@FindBy(xpath = "//input[@name='property(Subject)']")
	private WebElement subTbx;
	
	@FindBy(xpath = "//img[@title='Vendor Name Lookup']")
	private WebElement venLu;
	
	@FindBy(xpath = "//img[@title='Product Name Lookup']")
	private WebElement prodLu;
	
    @FindBy(xpath = "//img[@title='PriceBook Name Lookup']")
    private WebElement pbLu;
    
    @FindBy(id = "txtQty1")
    private WebElement qtyTbx;
    
    @FindBy(xpath="//input[@value='Save']")
	private WebElement saveBtn;
	
	@FindBy(xpath="//input[@value='Save & New']")
	private WebElement sandnBtn;
	
	@FindBy(xpath="//input[@value='Cancel']")
	private WebElement cancelBtn;
    
    public CreatePOrderPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
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


	public WebElement getSubTbx() {
		return subTbx;
	}

	public WebElement getVenLu() {
		return venLu;
	}

	public WebElement getProdLu() {
		return prodLu;
	}

	public WebElement getPbLu() {
		return pbLu;
	}

	public WebElement getQtyTbx() {
		return qtyTbx;
	}
 
}
