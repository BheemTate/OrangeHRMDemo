package com.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.PageObject.MyInfoPOM;
import com.Utility.BaseClass;
import com.Utility.Library;

public class VerifyPersonalDetails extends BaseClass {
	
	@Test
	public void TC_MyInfo_005() {
		LoginPom login=new LoginPom(driver);
		
		Library.custom_Sendkeys(login.username(), excel.getStringData("Sheet1", 0, 0), "username");
		Library.custom_Sendkeys(login.password(), excel.getStringData("Sheet1", 1, 0), "password");
		Library.custom_click(login.Login_Btn(), "Login Button");
		
		MyInfoPOM myinfo=new MyInfoPOM(driver);
		Library.custom_click(myinfo.getMyInfo(), "MyInfo");
		Library.custom_click(myinfo.getPersonal_Details(), "Personal Details");
		
		Boolean firstName=myinfo.getFirst_Name().isDisplayed();
		
		if(firstName==true) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}

}
