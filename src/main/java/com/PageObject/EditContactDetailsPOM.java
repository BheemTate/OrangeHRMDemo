package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditContactDetailsPOM {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@value='Edit']")
	private WebElement btn_edit;
	
	@FindBy(xpath="//input[@id='contact_street1']")
	private WebElement address1;
	
	@FindBy(xpath="//input[@id='contact_street2']")
	private WebElement address2;
	
	@FindBy(xpath="//input[@id='contact_city']")
	private WebElement city;
	
	@FindBy(xpath="//input[@id='contact_province']")
	private WebElement state;
	
	@FindBy(xpath="//input[@id='contact_emp_zipcode']")
	private WebElement zipcode;
	
	@FindBy(xpath="//select[@id='contact_country']")
	private WebElement selectCountry;
	
	@FindBy(xpath="//input[@id='contact_emp_hm_telephone']")
	private WebElement homeTelephone;
	
	@FindBy(xpath="//input[@id='contact_emp_mobile']")
	private WebElement mobile;
	
	@FindBy(xpath="//input[@id='contact_emp_work_telephone']")
	private WebElement workTelephone;
	
	@FindBy(xpath="//input[@id='contact_emp_work_email']")
	private WebElement workEmail;
	
	@FindBy(xpath="//input[@id='contact_emp_oth_email']")
	private WebElement otherEmail;
	
	@FindBy(xpath="//input[@id='btnSave']")
	private WebElement btn_save;
	
	public EditContactDetailsPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);		
	}
	
	public WebElement getbtn_edit() {
		return btn_edit;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getAddress2() {
		return address2;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getZipcode() {
		return zipcode;
	}

	public WebElement getSelectCountry() {
		return selectCountry;
	}

	public WebElement getHomeTelephone() {
		return homeTelephone;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getWorkTelephone() {
		return workTelephone;
	}

	public WebElement getWorkEmail() {
		return workEmail;
	}

	public WebElement getOtherEmail() {
		return otherEmail;
	}

	public WebElement getBtn_save() {
		return btn_save;
	}

}
