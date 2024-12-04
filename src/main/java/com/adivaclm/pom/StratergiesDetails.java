package com.adivaclm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StratergiesDetails {
	
	@FindBy(xpath = "//input[@name='newLead']")
	private WebElement newLeadBtn;
	
	@FindBy(xpath = "//input[@name ='New1']")
	private WebElement newPotBtn;
	
	@FindBy(xpath = "//input[@name ='edit2']")
	private WebElement editBtn;
	
	@FindBy(xpath = "//input[@name ='Delete2']")
	private WebElement delBtn;
	
	@FindBy(xpath = "//input[@name ='Clone2']")
	private WebElement cloneBtn;
	
	@FindBy(xpath ="//input[@name ='Print2']")
	private WebElement ppBtn;
	
	public StratergiesDetails(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getNewLeadBtn() {
		return newLeadBtn;
	}

	public WebElement getNewPotBtn() {
		return newPotBtn;
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
