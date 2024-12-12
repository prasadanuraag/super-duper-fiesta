package com.mvncrmzy.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ConvertLeadsPage {
	
	@FindBy(xpath = "//input[@value=' rashmi']")
	private WebElement assgnTbx;
	
	@FindBy(xpath= "//input[@value='sda-']")
	private WebElement potNameTbx;
	
	@FindBy(xpath = "//span/img[@src='/crm/images/cal.gif']")
	private WebElement calnBtn;
	
	@FindBy(linkText = "20")
	private WebElement pCloseTbx;
	
	

	@FindBy(xpath = "//input[@id ='closedate']")
	private WebElement potCloseTbx;
	
	@FindBy(xpath="//select[@name='probability']")
	private WebElement pstage;
	
	@FindBy(xpath = "//input[@name='save']")
	private WebElement saveBtn;
	
	@FindBy(xpath = "//input[@value='Reset']")
	private WebElement resetBtn;
	
  public ConvertLeadsPage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }

public WebElement getAssgnTbx() {
	return assgnTbx;
}
public WebElement getPotCloseTbx() {
	return potCloseTbx;
}

public WebElement getPotNameTbx() {
	return potNameTbx;
}

public WebElement getCalnBtn() {
	return calnBtn;
}

public WebElement getpCloseTbx() {
	return pCloseTbx;
}

public String  getPstage() {
	
	Select s= new Select(pstage);
	 s.selectByIndex(2);
	 
	return pstage.getText();
}

public WebElement getSaveBtn() {
	return saveBtn;
}

public WebElement getResetBtn() {
	return resetBtn;
}
  
}
