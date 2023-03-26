package com.mystore.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.actiondriver.Action;
import com.pageobjects.CartPage;
import com.pageobjects.IndexPage;
import com.pageobjects.ProductPage;

public class CartPageTest extends BaseClass {
	CartPage cartpage;
	
	ProductPage productpage;
	Action action = new Action();
	IndexPage indexPage;
	@BeforeMethod
	public void setup() {
		launchApp(); 
	}
	
	
  @Test(priority=0)
  
	public void addtocart() {
	indexPage = new IndexPage();
	indexPage.login(prop.getProperty("username"), prop.getProperty("password"));
	productpage	 = new ProductPage();
	productpage.verifyPrdouct();
	productpage.clickPrd();
	productpage.verifyaddtocartt();
	productpage.clicaddtocart();	
	cartpage = new CartPage();	
	cartpage.clicklink();
}
  
  @AfterMethod
	public void teardown() {
		driver.quit();
	}

}
