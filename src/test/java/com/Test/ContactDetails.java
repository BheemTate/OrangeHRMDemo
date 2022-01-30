package com.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObject.ContactDetailsPOM;
import com.PageObject.LoginPom;
import com.PageObject.MyInfoPOM;
import com.Utility.BaseClass;
import com.Utility.Library;

public class ContactDetails extends BaseClass {
	
	@Test
	public void TC_MyInfo_009() {
		
		LoginPom login = new LoginPom(driver);
		Library.custom_Sendkeys(login.username(), excel.getStringData("Sheet1", 0, 0), "username");
		Library.custom_Sendkeys(login.password(), excel.getStringData("Sheet1", 1, 0), "password");
		Library.custom_click(login.Login_Btn(), "Login Button");

		MyInfoPOM myinfo = new MyInfoPOM(driver);
		Library.custom_click(myinfo.getMyInfo(), "MyInfo");
		
		ContactDetailsPOM contact=new ContactDetailsPOM(driver);
		Library.custom_click(contact.getLinkContactDetails(), "Contact details");
		
		boolean conDetails=contact.getTextContactDetails().isDisplayed();
		boolean address=contact.getAddress1().isDisplayed();
		
		Assert.assertTrue(conDetails);
		Assert.assertTrue(address);

	}
	
}	
