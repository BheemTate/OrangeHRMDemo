package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddPhotographPOM {
	
	WebDriver driver;
	
	@FindBy(xpath="//img[@id='empPic']")
	private WebElement editPhoto;
	
	@FindBy(xpath="//input[@id='photofile']")
	private WebElement chooseFile;
	
	@FindBy(xpath="//input[@id='btnSave']")
	private WebElement btn_Upload;
	
	@FindBy(xpath="//div[@class='message success fadable']")
	private WebElement success_msg;
	
	public AddPhotographPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getEditPhoto() {
		return editPhoto;
	}

	public WebElement getChooseFile() {
		return chooseFile;
	}

	public WebElement getBtn_Upload() {
		return btn_Upload;
	}

	public WebElement getSuccess_msg() {
		return success_msg;
	}

}
