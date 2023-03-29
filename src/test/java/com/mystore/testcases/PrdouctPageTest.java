package com.mystore.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.actiondriver.Action;
import com.pageobjects.IndexPage;
import com.pageobjects.ProductPage;
import com.utility.DataProvider1;
import com.utility.Log;

public class PrdouctPageTest extends BaseClass{

	ProductPage productpage;
		Action action = new Action();
		IndexPage indexPage;
		@BeforeMethod
		public void setup() {
			launchApp(); 
		}
		
		
		@Test(dataProvider="dtestdata",dataProviderClass=DataProvider1.class)
		public void Productcheck(String dname,String pwd) {
		Log.startTestCase("Productcheck");
		indexPage = new IndexPage();
		Log.info("user is going to click on SignIn");
		Log.info("Enter Username and Password");
		indexPage.login(dname, pwd);
		productpage	 = new ProductPage();
		//Log.info("Verifying if user is able to login");
		//productpage.verifyPrdouct();
		//productpage.clickPrd();
		//productpage.verifyaddtocartt();
		//productpage.clicaddtocart();
		Log.info("Login is Sucess");
		Log.endTestCase("Productcheck");
	
			
	}
		
		@AfterMethod
		public void tearDown() {
			getDriver().quit();
		}
	
			
}
	

