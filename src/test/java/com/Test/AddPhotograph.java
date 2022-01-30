package com.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObject.AddPhotographPOM;
import com.PageObject.LoginPom;
import com.PageObject.MyInfoPOM;
import com.Utility.BaseClass;
import com.Utility.Library;

public class AddPhotograph extends BaseClass {

	@Test
	public void TC_MyInfo_008() throws InterruptedException {

		LoginPom login = new LoginPom(driver);

		Library.custom_Sendkeys(login.username(), excel.getStringData("Sheet1", 0, 0), "username");
		Library.custom_Sendkeys(login.password(), excel.getStringData("Sheet1", 1, 0), "password");
		Library.custom_click(login.Login_Btn(), "Login Button");

		MyInfoPOM myinfo = new MyInfoPOM(driver);
		Library.custom_click(myinfo.getMyInfo(), "MyInfo");

		AddPhotographPOM photo = new AddPhotographPOM(driver);
		Library.custom_click(photo.getEditPhoto(), "Photo");
		Library.custom_Sendkeys(photo.getChooseFile(), "F:\\Wallpapers\\3D WALL\\3-d99d.jpg", "Choose File");
		Library.custom_click(photo.getBtn_Upload(), "Upload button");
		
		String success=photo.getSuccess_msg().getText();

		if (success.equalsIgnoreCase("Successfully Uploaded")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		Thread.sleep(10000);
	}

}
