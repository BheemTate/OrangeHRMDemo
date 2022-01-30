package com.Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.Status;

public class Library {
	
	public static void custom_Sendkeys(WebElement element, String value, String field) {
		try {
			element.sendKeys(value);
			ObjectRepo.test.log(Status.PASS, field+"=Value Succesfully send="+value);
		}catch(Exception e) {
			ObjectRepo.test.log(Status.FAIL, "Unable to send value"+e);
		}
		
	}
	
	public static void custom_click(WebElement element, String field) {
		try {
		element.click();
		ObjectRepo.test.log(Status.PASS, "Clicked Successfully="+field);
		}catch(Exception e) {
			ObjectRepo.test.log(Status.FAIL, "Unable to click"+e);
		}
	}
	
	public static void custom_DropDown(WebElement element, String value, String field) {
		try {
		Select drpDown=new Select(element);
		drpDown.selectByVisibleText(value);
		ObjectRepo.test.log(Status.PASS, field+"=Successfully selected="+value);
		}catch(Exception e) {
			ObjectRepo.test.log(Status.FAIL, "Unable to Select"+e);
		}
	}
	
	public static void custom_clearData(WebElement element) {
		element.clear();		
	}	
	
}