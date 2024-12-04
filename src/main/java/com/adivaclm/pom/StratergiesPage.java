package com.adivaclm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StratergiesPage {
	@FindBy(xpath = "//input[@value ='New Campaign']")
	private WebElement newchBtn;
	
	@FindBy(xpath = "(//input[@name='chk'])[2]")
	private WebElement chkBx;
	
	@FindBy(xpath="//input[@value='Delete']")
	private WebElement delBtn;
	
 public StratergiesPage(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }

public WebElement getNewchBtn() {
	return newchBtn;
}

public WebElement getChkBx() {
	return chkBx;
}

public WebElement getDelBtn() {
	return delBtn;
}
 

}
