package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.actiondriver.Action;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.pageobjects.IndexPage;
import com.utility.ExtentManager;
import com.utility.Log;

public class IndexPageTest extends BaseClass {
	Action action = new Action();
	IndexPage indexPage;
	
	

	
	@BeforeMethod
	public void setup() {
		launchApp(); 
		ExtentManager.setExtent();
	}
	
	
	
  @Test
	public void loginTest() {
	indexPage = new IndexPage();
	indexPage.login(prop.getProperty("username"), prop.getProperty("password"));
	Log.startTestCase("loginTest");
	Log.info("user is going to click on SignIn");
	Log.info("Enter Username and Password");
	Log.info("Verifying if user is able to login");
	Log.info("Login is Sucess");
	Log.endTestCase("loginTest");
	
}
  
@AfterMethod
public void teardown() {
	
	ExtentManager.endReport();
}
}
