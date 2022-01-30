package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NonEditabelPersonalDetailsPOM {
	
	WebDriver driver;
	
	@FindBy(id="btnSave")
	private WebElement edit_btn;
		
	@FindBy(id="personal_txtEmployeeId")
	private WebElement employeeID;
		
	@FindBy(id="personal_txtNICNo")
	private WebElement SSNNumber;
	
	@FindBy(id="personal_txtSINNo")
	private WebElement SINNumber;
		
	@FindBy(id="personal_cmbNation")
	private WebElement nationality;
	
	@FindBy(id="personal_DOB")
	private WebElement dateOfBirth;
		
	@FindBy(id="btnSave")
	private WebElement save;
	
	@FindBy(linkText="Successfully Saved")
	private WebElement successfullySave;
	
	@FindBy(xpath="//select[@class='ui-datepicker-year']")
	private WebElement year;
	
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	private WebElement month;
	
	@FindBy(xpath="//a[@class='ui-state-default'][contains(text(),'3')]")
	private WebElement date;
		
	public NonEditabelPersonalDetailsPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getEdit_btn() {
		return edit_btn;
	}
	
	public WebElement getYear() {
		return year;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getEmployeeID() {
		return employeeID;
	}
	
	public WebElement getSSNNumber() {
		return SSNNumber;
	}

	public WebElement getSINNumber() {
		return SINNumber;
	}

	public WebElement getDateOfBirth() {
		return dateOfBirth;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getSuccessfullySave() {
		return successfullySave;
	}
	
}
