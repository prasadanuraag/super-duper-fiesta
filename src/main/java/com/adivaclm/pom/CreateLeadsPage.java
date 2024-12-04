package com.adivaclm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateLeadsPage {
	
	@FindBy(xpath = "//input[@name='property(Company)']")
	private WebElement compNameTbx;
	
	@FindBy(xpath = "//input[@name='property(Last Name)']")
	private WebElement lastnTbx;
	
	@FindBy(xpath = "//input[@name='property(First Name)']")
		private WebElement firstnTbx;
	
	@FindBy(xpath="//input[@value='Save']")
	private WebElement saveBtn;
	
	@FindBy(xpath="//input[@value='Save & New']")
	private WebElement sandnBtn;
	
	@FindBy(xpath="//input[@value='Cancel']")
	private WebElement cancelBtn;
	
	public  CreateLeadsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCompNameTbx() {
		return compNameTbx;
	}

	public WebElement getLastnTbx() {
		return lastnTbx;
	}

	public WebElement getFirstnTbx() {
		return firstnTbx;
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
