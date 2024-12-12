package com.mvncrmzy.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProspectsDetailsPage {

	@FindBy(xpath= "//input[@value='Add Products']")
	private WebElement addprodBtn;
	
	@FindBy(xpath = "//input[@name ='edit2']")
	private WebElement editBtn;
	
	@FindBy(xpath = "//input[@name ='Delete2']")
	private WebElement delBtn;
	
	@FindBy(xpath = "//input[@name ='Clone2']")
	private WebElement cloneBtn;
	
	@FindBy(xpath ="//input[@name ='Print2']")
	private WebElement ppBtn;
	
	@FindBy(xpath= "//input[@value='New Quote']")
	private WebElement newQuBtn;
	
	@FindBy(xpath= "//input[@value='New Sales Order']")
	private WebElement nsoBtn;
	
		public WebElement getAddprodBtn() {
		return addprodBtn;
	}

	public WebElement getEditBtn() {
		return editBtn;
	}

	public WebElement getDelBtn() {
		return delBtn;
	}

	public WebElement getCloneBtn() {
		return cloneBtn;
	}

	public WebElement getPpBtn() {
		return ppBtn;
	}

	public WebElement getNewQuBtn() {
		return newQuBtn;
	}

	public WebElement getNsoBtn() {
		return nsoBtn;
	}

		public ProspectsDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
}
