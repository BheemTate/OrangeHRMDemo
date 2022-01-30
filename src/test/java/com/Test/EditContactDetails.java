package com.Test;

import org.testng.annotations.Test;

import com.PageObject.ContactDetailsPOM;
import com.PageObject.EditContactDetailsPOM;
import com.PageObject.LoginPom;
import com.PageObject.MyInfoPOM;
import com.Utility.BaseClass;
import com.Utility.Library;

public class EditContactDetails extends BaseClass {
	
	@Test
	public void TC_MyInfo_010() {
		
		LoginPom login = new LoginPom(driver);
		Library.custom_Sendkeys(login.username(), excel.getStringData("Sheet1", 0, 0), "username");
		Library.custom_Sendkeys(login.password(), excel.getStringData("Sheet1", 1, 0), "password");
		Library.custom_click(login.Login_Btn(), "Login Button");

		MyInfoPOM myinfo = new MyInfoPOM(driver);
		Library.custom_click(myinfo.getMyInfo(), "MyInfo");
		
		ContactDetailsPOM contact=new ContactDetailsPOM(driver);
		Library.custom_click(contact.getLinkContactDetails(), "Contact details");
		
		EditContactDetailsPOM editcontact=new EditContactDetailsPOM(driver);
		Library.custom_click(editcontact.getbtn_edit(), "Edit Button");
		Library.custom_Sendkeys(editcontact.getAddress1(), "Shastri Nagar", "Address1");
		Library.custom_Sendkeys(editcontact.getAddress2(), "Pimpri", "Address2");
		Library.custom_Sendkeys(editcontact.getCity(), "Pune", "City");
		Library.custom_Sendkeys(editcontact.getState(), "Maharashtra", "State");
		Library.custom_Sendkeys(editcontact.getZipcode(), "411026", "Zip Code");
		Library.custom_DropDown(editcontact.getSelectCountry(), "India", "Country");
		Library.custom_Sendkeys(editcontact.getHomeTelephone(), "986002834", "Home Telephone");
		Library.custom_Sendkeys(editcontact.getMobile(), "9527909076", "Mobile");
		Library.custom_Sendkeys(editcontact.getWorkTelephone(), "022376543", "Work Telephone");
		Library.custom_Sendkeys(editcontact.getWorkEmail(), "123qrt@gmail.com", "Work Email");
		Library.custom_Sendkeys(editcontact.getOtherEmail(), "456stq@gmail.com", "Other email");
		Library.custom_click(editcontact.getBtn_save(), "Save Button");
		
	}

}
