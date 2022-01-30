package com.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.PageObject.MyInfoPOM;
import com.PageObject.NonEditabelPersonalDetailsPOM;
import com.Utility.BaseClass;
import com.Utility.Library;

public class NonEditabelPersonalDetails extends BaseClass {
	
	@Test
	public void TC_MyInfo_007() throws InterruptedException {
		
		LoginPom login = new LoginPom(driver);
		Library.custom_Sendkeys(login.username(), excel.getStringData("Sheet1", 0, 0), "username");
		Library.custom_Sendkeys(login.password(), excel.getStringData("Sheet1", 1, 0), "password");
		Library.custom_click(login.Login_Btn(), "Login Button");

		MyInfoPOM myinfo = new MyInfoPOM(driver);
		Library.custom_click(myinfo.getMyInfo(), "MyInfo");
		Library.custom_click(myinfo.getPersonal_Details(), "Personal Details");
		
		
		NonEditabelPersonalDetailsPOM noneditable=new NonEditabelPersonalDetailsPOM(driver);
		Library.custom_click(noneditable.getEdit_btn(), "Edit Button");
		Library.custom_Sendkeys(noneditable.getEmployeeID(), "36542", "EmployeeID");
		Library.custom_Sendkeys(noneditable.getSSNNumber(), "27653", "SSNnumber");
		Library.custom_Sendkeys(noneditable.getSINNumber(), "87325", "SINnumber");
		Library.custom_click(noneditable.getDateOfBirth(), "DOB");
		Library.custom_DropDown(noneditable.getYear(), "1977", "Year");
		Library.custom_DropDown(noneditable.getMonth(), "Jan", "Month");
		Library.custom_click(noneditable.getDate(), "Date");
				
		String employeeID=noneditable.getEmployeeID().getAttribute("value");
		String SSNnumber=noneditable.getSSNNumber().getAttribute("value");
		String SINnumber=noneditable.getSINNumber().getAttribute("value");
				
		if(employeeID.equals("36542")) {
			Assert.assertTrue(false);
		}else {
			Assert.assertTrue(true);
		}
		
		if(SSNnumber.equals("27653")) {
			Assert.assertTrue(false);
		}else {
			Assert.assertTrue(true);
		}
		
		if(SINnumber.equals("87325")) {
			Assert.assertTrue(false);
		}else {
			Assert.assertTrue(true);
		}
		
	}
	

}
