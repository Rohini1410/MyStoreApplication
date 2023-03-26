package com.mystore.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.actiondriver.Action;
import com.pageobjects.IndexPage;
import com.pageobjects.ProductPage;
import com.utility.DataProvider1;

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
		indexPage = new IndexPage();
		indexPage.login(dname, pwd);
		productpage	 = new ProductPage();
		productpage.verifyPrdouct();
		productpage.clickPrd();
		productpage.verifyaddtocartt();
		productpage.clicaddtocart();
		driver.quit();
			
	}
		
	
			
}
	

