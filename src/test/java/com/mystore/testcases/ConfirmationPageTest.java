package com.mystore.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.actiondriver.Action;
import com.pageobjects.CartPage;
import com.pageobjects.CheckoutPage;
import com.pageobjects.ConfirmationPage;
import com.pageobjects.IndexPage;
import com.pageobjects.OverviewPage;
import com.pageobjects.ProductPage;

public class ConfirmationPageTest extends BaseClass {
	
    CartPage cartpage;
	ProductPage productpage;
	CheckoutPage checkout;
	OverviewPage overpage;
	ConfirmationPage confirmpage;
	Action action = new Action();
	IndexPage indexPage;
	@BeforeMethod
	public void setup() {
		launchApp(); 
		driver.manage().window().maximize();
	}
		
  @Test(priority=0)
  
	public void addtocart() throws InterruptedException {
	indexPage = new IndexPage();
	indexPage.login(prop.getProperty("username"), prop.getProperty("password"));
	productpage	 = new ProductPage();
	productpage.verifyPrdouct();
	productpage.clickPrd();
	productpage.verifyaddtocartt();
	productpage.clicaddtocart();	
	cartpage = new CartPage();	
	cartpage.clicklink();
	checkout = new CheckoutPage();
	checkout.verifyTitle();
	checkout.clickoncheckout();
	checkout.enterdetails();
	System.out.println("You lost me");

	OverviewPage overpage = new OverviewPage();
	overpage.verifydetails();
	confirmpage = new ConfirmationPage();

	confirmpage.verifyconfirm();
	
}
  @BeforeMethod
  public void teardown(){
	  driver.quit();
	  
  }
  
 

}
