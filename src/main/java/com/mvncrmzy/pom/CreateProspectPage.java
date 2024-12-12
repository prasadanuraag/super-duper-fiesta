package com.mvncrmzy.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateProspectPage {
	
	@FindBy(xpath = "//input[@name='property(Potential Name)']")
	private WebElement potNameTbx;
	
	@FindBy(xpath ="//input[@name='property(Account Name)']")
	private WebElement accNameTbx;
	
	@FindBy(xpath = "//img[@title='Account Name Lookup']")
	private WebElement accNameLu;
	
	@FindBy(xpath = "//img[@title='Calendar']")
	private WebElement caldLu;
	
	@FindBy(xpath = "//select[@name='property(Stage)']")
	private WebElement stageDd;
	
	@FindBy(xpath="//input[@value='Save']")
	private WebElement saveBtn;
	
	@FindBy(xpath="//input[@value='Save & New']")
	private WebElement sandnBtn;
	
	@FindBy(xpath="//input[@value='Cancel']")
	private WebElement cancelBtn;
	
	@FindBy(xpath = "//input[@name='property(Closing Date)']")
	private WebElement clDateTbx;
	
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	

	public WebElement getClDateTbx() {
		return clDateTbx;
	}


	public WebElement getSandnBtn() {
		return sandnBtn;
	}

	public WebElement getCancelBtn() {
		return cancelBtn;
	}
	

	public CreateProspectPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getPotNameTbx() {
		return potNameTbx;
	}

	public WebElement getAccNameTbx() {
		return accNameTbx;
	}

	public WebElement getAccNameLu() {
		return accNameLu;
	}

	public WebElement getCaldLu() {
		return caldLu;
	}

	public String getStageDd() {
		
		Select s = new Select(stageDd);
				s.selectByIndex(4);
		return stageDd.getText();
	}

}
