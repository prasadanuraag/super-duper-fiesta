package com.adivaclm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddPriceBookPage {
	
	@FindBy(xpath = "(//input[@name='chk'])[3]")
	private WebElement chkBx;
	
	@FindBy(xpath = "(//input[@name='listPrice1'])[3]")
	private WebElement priceTbx;
	
	@FindBy(xpath = "//input[@value='Add to Price Books ']")
	private WebElement addpbBtn;
	
	@FindBy(xpath = "//input[@value='Add to Products']")
	private WebElement addprodBtn;
	
	

	public WebElement getAddprodBtn() {
		return addprodBtn;
	}

	public AddPriceBookPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getChkBx() {
		return chkBx;
	}

	public WebElement getPriceTbx() {
		return priceTbx;
	}

	public WebElement getAddpbBtn() {
		return addpbBtn;
	}

}
