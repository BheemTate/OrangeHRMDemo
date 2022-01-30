package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyInfoPOM {
	
	WebDriver driver;
	
	@FindBy(id="menu_pim_viewMyDetails")
	private WebElement MyInfo;
	
	@FindBy(xpath="//a[text()='Personal Details']")
	private WebElement Personal_Details;
	
	@FindBy(id="personal_txtEmpFirstName")
	private WebElement First_Name;
	
	public MyInfoPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getMyInfo() {
		return MyInfo;
	}
	
	public WebElement getPersonal_Details() {
		return Personal_Details;
	}
	
	public WebElement getFirst_Name() {
		return First_Name;
	}
		

}
