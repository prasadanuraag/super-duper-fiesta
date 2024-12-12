package com.mvncrmzy.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProspectsPage {
	
	@FindBy(xpath = "//input[@value ='New Potential']")
	private WebElement newPotBtn;
	
	@FindBy(xpath = "(//input[@name='chk'])[2]")
	private WebElement chkBx;
	
	@FindBy(xpath="//input[@value='Delete']")
	private WebElement delBtn;
	
 public ProspectsPage(WebDriver driver)
 {
	 
	 PageFactory.initElements(driver, this);
 }





public WebElement getNewPotBtn() {
	return newPotBtn;
}



public WebElement getChkBx() {
	return chkBx;
}

public WebElement getDelBtn() {
	return delBtn;
}

}
