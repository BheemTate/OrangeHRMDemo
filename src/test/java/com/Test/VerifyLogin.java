package com.Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class VerifyLogin extends BaseClass {
	boolean dash;
	
  @Test(dataProvider="TestData", threadPoolSize = 4)
  public void TC_001(String username, String pass, String dataType) throws Exception {
	  LoginPom login=new LoginPom(driver);
	  
	  Library.custom_Sendkeys(login.username(), username, "Username");
	  Library.custom_Sendkeys(login.password(), pass, "Password");
	  Library.custom_click(login.Login_Btn(), "Login_Button");  
	    
	  try {
		  dash=driver.findElement(By.linkText("Dashboard")).isDisplayed();
	  }catch(Exception e) {
		  dash=false;
	  }
	  
	 	  
	  if(dataType.equalsIgnoreCase("valid")) {
		  if(dash==true) {
			  Assert.assertTrue(true);
		  }
		  else {
			  Assert.assertTrue(false);
		  }
	  }else if(dataType.equalsIgnoreCase("invalid")) {
		  if(dash==true) {
			  Assert.assertTrue(false);
		  }
		  else {
			  Assert.assertTrue(true);
		  }
	  }
  }
  
  
  @DataProvider(name="TestData")
  public Object[][] dataProvider() {
	  Object[][] data= {{"Admin", "admin123", "valid"}, 
			  			{"Admin", "admin12345", "invalid"},
			  			{"admin2", "admin123", "invalid"},
			  			{"admin3", "admin1234567", "invalid"}};
	  
	  return data;
  }
}


