package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	
public static Properties pro;	

public 	ConfigDataProvider() throws Exception {
	String path=System.getProperty("user.dir")+"\\Config\\Config.properties";
	File data=new File(path);
	FileInputStream file=new FileInputStream(data);
	
	pro=new Properties();
	pro.load(file);		
}

public String getBrowser() {
	return pro.getProperty("Browser");
}

public String getURL() {
	return pro.getProperty("URL");
}
}
