package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.PageObject.EditPersonalDetailsPOM;
import com.PageObject.LoginPom;
import com.PageObject.MyInfoPOM;
import com.Utility.BaseClass;
import com.Utility.Library;

public class EditPersonalDetails extends BaseClass {

	@Test
	public void TC_MyInfo_006() throws Exception {

		LoginPom login = new LoginPom(driver);
		Library.custom_Sendkeys(login.username(), excel.getStringData("Sheet1", 0, 0), "username");
		Library.custom_Sendkeys(login.password(), excel.getStringData("Sheet1", 1, 0), "password");
		Library.custom_click(login.Login_Btn(), "Login Button");

		MyInfoPOM myinfo = new MyInfoPOM(driver);
		Library.custom_click(myinfo.getMyInfo(), "MyInfo");
		Library.custom_click(myinfo.getPersonal_Details(), "Personal Details");

		EditPersonalDetailsPOM edit = new EditPersonalDetailsPOM(driver);
		Library.custom_click(edit.getEdit_btn(), "Edit Button");
		Library.custom_clearData(edit.getFirstName());
		Library.custom_Sendkeys(edit.getFirstName(), excel.getStringData("Personal_Details", 0, 0), "First Name");
		Library.custom_clearData(edit.getMiddleName());
		Library.custom_Sendkeys(edit.getMiddleName(), excel.getStringData("Personal_Details", 1, 0), "Middle Name");
		Library.custom_clearData(edit.getLastName());
		Library.custom_Sendkeys(edit.getLastName(), excel.getStringData("Personal_Details", 2, 0), "Last Name");
		Library.custom_clearData(edit.getOtherID());
		Library.custom_Sendkeys(edit.getOtherID(), excel.getStringData("Personal_Details", 4, 0), "Other ID");		
		Library.custom_click(edit.getGenderMale(), "Gender Male");
		Library.custom_DropDown(edit.getMaritalStatus(), "Married", "Marital Status");
		Library.custom_DropDown(edit.getNationality(), "British", "Nationality");
		date_picker();

	}

	public void date_picker() {
		WebElement datePicker = driver.findElement(By.id("personal_txtLicExpDate"));
		datePicker.click();

		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select yearselect = new Select(year);
		yearselect.selectByIndex(102);

		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select monthselect = new Select(month);
		monthselect.selectByIndex(7);

		WebElement date = driver.findElement(By.xpath("//a[@class='ui-state-default'][contains(text(),'3')]"));
		date.click();
	}

}
