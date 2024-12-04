package com.adivaclm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(id="Hometab")
	private WebElement homeTb;
	
	@FindBy(linkText = "Leads")
	private WebElement leadsTb;
	
	@FindBy(linkText  ="Campaigns")
	private WebElement campTb;
	
	@FindBy(linkText ="Potentials")
	private WebElement potTb;
	
	@FindBy(linkText ="Products")
	private WebElement prodTb;
	
	@FindBy(linkText ="Vendors")
	private WebElement vendTb;
	
	@FindBy(linkText ="Price Books")
	private WebElement pbTb;
	
	@FindBy(linkText ="Quotes")
	private WebElement quoTb;
	
	@FindBy(linkText ="Sales Orders")
	private WebElement soTb;
	
	@FindBy(linkText ="Purchase Orders")
	private WebElement poTb;
	
	@FindBy(linkText = "Invoices")
	private WebElement inTb;
	
	public WebElement getInTb() {
		return inTb;
	}

	@FindBy(linkText ="New Lead")
	private WebElement nleadLnk;
	
	@FindBy(linkText ="New Potential")
	private WebElement npolLnk;
	
	@FindBy(linkText ="New Campaign")
	private WebElement ncampLnk;
	
	@FindBy(linkText = "Logout [rashmi@dell.com]")
	private WebElement lgoutBtn;
	
	public WebElement getLgoutBtn() {
		return lgoutBtn;
	}

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getHomeTb() {
		return homeTb;
	}

	public WebElement getLeadsTb() {
		return leadsTb;
	}

	public WebElement getCampTb() {
		return campTb;
	}

	public WebElement getPotTb() {
		return potTb;
	}

	public WebElement getProdTb() {
		return prodTb;
	}

	public WebElement getVendTb() {
		return vendTb;
	}

	public WebElement getPbTb() {
		return pbTb;
	}

	public WebElement getQuoTb() {
		return quoTb;
	}

	public WebElement getSoTb() {
		return soTb;
	}

	public WebElement getPoTb() {
		return poTb;
	}

	public WebElement getNleadLnk() {
		return nleadLnk;
	}

	public WebElement getNpolLnk() {
		return npolLnk;
	}

	public WebElement getNcampLnk() {
		return ncampLnk;
	}
	
	

}
