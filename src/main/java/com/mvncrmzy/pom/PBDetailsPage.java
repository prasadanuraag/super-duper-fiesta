package com.mvncrmzy.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBDetailsPage {
	
	@FindBy(xpath ="//input[@value='Add Products']")
	private WebElement addprodBtn;
	
	@FindBy(xpath = "//input[@name ='edit2']")
	private WebElement editBtn;
	
	@FindBy(xpath = "//input[@name ='Delete2']")
	private WebElement delBtn;
	
	@FindBy(xpath = "//input[@name ='Clone2']")
	private WebElement cloneBtn;
	
	@FindBy(xpath ="//input[@name ='Print2']")
	private WebElement ppBtn;
	
	public PBDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

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

}
