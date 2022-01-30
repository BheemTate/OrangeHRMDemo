package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {
	
	public static ExtentReports extent;

	public static ExtentReports getExtentReports() {
		String reportPath=System.getProperty("user.dir")+"\\Reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(reportPath);
		reporter.config().setDocumentTitle("Test Report");
		reporter.config().setReportName("Automation Report");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("System", "Lenovo-PC");
		extent.setSystemInfo("QA", "Yogesh");
		extent.setSystemInfo("Environment", "Stage");
		extent.setSystemInfo("Browser", "Chrome");
		return extent;
		
	}
}
