package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
	
public class LoginPom {
	
	WebDriver driver;	
	
@FindBy(id="txtUsername")
private WebElement Username;

@FindBy(id="txtPassword")
private WebElement Password;

@FindBy(id="btnLogin")
private WebElement Btn_Login;

public LoginPom(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement username() {
	return Username;
}

public WebElement password() {
	return Password;
}

public WebElement Login_Btn() {
	return Btn_Login;
}

}
