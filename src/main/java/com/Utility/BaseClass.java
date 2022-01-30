package com.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

public static ConfigDataProvider config;
public static ExcelDataProvider excel;
public static WebDriver driver;


@BeforeSuite
public void bs() throws Exception {
config=new ConfigDataProvider();
excel=new ExcelDataProvider();
}

@BeforeMethod
public void OpenBrowser() {
		if(config.getBrowser().equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(config.getURL());
	}
	else if(config.getBrowser().equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(config.getURL());
	}		
}

@AfterMethod
public void TearDown() {
	driver.quit();
}

}
