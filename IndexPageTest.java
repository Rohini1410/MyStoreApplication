package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.actiondriver.Action;
import com.pageobjects.IndexPage;

public class IndexPageTest extends BaseClass {
	Action action = new Action();
	IndexPage indexPage;
	
	@BeforeMethod
	public void setup() {
		launchApp(); 
	}
	
	
  @Test
	public void loginTest() {
	indexPage = new IndexPage();
	indexPage.login(prop.getProperty("username"), prop.getProperty("password"));
	
}

	


}
