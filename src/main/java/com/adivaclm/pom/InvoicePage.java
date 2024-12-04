package com.adivaclm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvoicePage {
	@FindBy(xpath = "//input[@value ='New Invoice']")
	private WebElement ninvBtn;
	
	@FindBy(xpath = "(//input[@name='chk'])[2]")
	private WebElement chkBx;
	
	@FindBy(xpath="//input[@value='Delete']")
	private WebElement delBtn;
	
	public InvoicePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		

}

	

	public WebElement getNinvBtn() {
		return ninvBtn;
	}



	public WebElement getChkBx() {
		return chkBx;
	}

	public WebElement getDelBtn() {
		return delBtn;
	}
}
