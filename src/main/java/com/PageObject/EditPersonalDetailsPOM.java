package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditPersonalDetailsPOM {
	
	WebDriver driver;
	
	@FindBy(id="btnSave")
	private WebElement edit_btn;
	
	@FindBy(id="personal_txtEmpFirstName")
	private WebElement firstName;
	
	@FindBy(id="personal_txtEmpMiddleName")
	private WebElement middleName;
	
	@FindBy(id="personal_txtEmpLastName")
	private WebElement lastName;
	
	@FindBy(id="personal_txtEmployeeId")
	private WebElement employeeID;
	
	@FindBy(id="personal_txtOtherID")
	private WebElement otherID;
	
	@FindBy(id="personal_txtLicenNo")
	private WebElement licenseNo;
	
	@FindBy(id="personal_txtLicExpDate")
	private WebElement licExpiryDate;
	
	@FindBy(id="personal_txtNICNo")
	private WebElement SSNNumber;
	
	@FindBy(id="personal_txtSINNo")
	private WebElement SINNumber;
	
	@FindBy(id="personal_optGender_1")
	private WebElement genderMale;
	
	@FindBy(id="personal_cmbMarital")
	private WebElement maritalStatus;
	
	@FindBy(id="personal_cmbNation")
	private WebElement nationality;
	
	@FindBy(id="personal_DOB")
	private WebElement dateOfBirth;
	
	@FindBy(id="personal_txtEmpNickName")
	private WebElement nickName;
	
	@FindBy(id="personal_chkSmokeFlag")
	private WebElement smoker;
	
	@FindBy(id="personal_txtMilitarySer")
	private WebElement military;
	
	@FindBy(id="btnSave")
	private WebElement save;
	
	@FindBy(linkText="Successfully Saved")
	private WebElement successfullySave;
		
	public EditPersonalDetailsPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getEdit_btn() {
		return edit_btn;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getMiddleName() {
		return middleName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmployeeID() {
		return employeeID;
	}

	public WebElement getOtherID() {
		return otherID;
	}

	public WebElement getLicenseNo() {
		return licenseNo;
	}

	public WebElement getLicExpiryDate() {
		return licExpiryDate;
	}

	public WebElement getSSNNumber() {
		return SSNNumber;
	}

	public WebElement getSINNumber() {
		return SINNumber;
	}

	public WebElement getGenderMale() {
		return genderMale;
	}

	public WebElement getMaritalStatus() {
		return maritalStatus;
	}

	public WebElement getNationality() {
		return nationality;
	}

	public WebElement getDateOfBirth() {
		return dateOfBirth;
	}

	public WebElement getNickName() {
		return nickName;
	}

	public WebElement getSmoker() {
		return smoker;
	}

	public WebElement getMilitary() {
		return military;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getSuccessfullySave() {
		return successfullySave;
	}
	
}
