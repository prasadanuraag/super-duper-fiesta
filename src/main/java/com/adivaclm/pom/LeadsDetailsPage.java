package com.adivaclm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsDetailsPage {
	
	@FindBy(xpath = "//input[@name ='edit2']")
	private WebElement editBtn;
	
	@FindBy(xpath = "//input[@name ='Delete2']")
	private WebElement delBtn;
	
	@FindBy(xpath = "//input[@name ='Clone2']")
	private WebElement cloneBtn;
	
	@FindBy(xpath ="//input[@name ='Print2']")
	private WebElement ppBtn;
	
	@FindBy(xpath="//input[@name ='Convert2']")
	private WebElement conPotBtn;
	
	@FindBy(xpath="//input[@name ='Duplicate2')]")
	private WebElement dandmtn;
	
	public LeadsDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
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

	public WebElement getConPotBtn() {
		return conPotBtn;
	}

	public WebElement getDandmtn() {
		return dandmtn;
	}

}
