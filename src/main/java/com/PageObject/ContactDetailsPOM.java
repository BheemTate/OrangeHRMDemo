package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactDetailsPOM {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'Contact Details')]")
	private WebElement linkContactDetails;
	
	@FindBy(xpath="//*[@id=\"contact-details\"]")
	private WebElement textContactDetails;
	
	@FindBy(xpath="//label[contains(text(),\"Address Street 1\")]")
	private WebElement address1;
	
	public ContactDetailsPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLinkContactDetails() {
		return linkContactDetails;
	}

	public WebElement getTextContactDetails() {
		return textContactDetails;
	}

	public WebElement getAddress1() {
		return address1;
	}
	

}
