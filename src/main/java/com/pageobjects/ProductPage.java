package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.BaseClass.BaseClass;
import com.actiondriver.Action;

public class ProductPage extends BaseClass {
	Action action= new Action();
	
	@FindBy(xpath="//div[text()='Sauce Labs Bolt T-Shirt']")
	WebElement backpag;
	@FindBy(id="add-to-cart-sauce-labs-bolt-t-shirt")
	WebElement addtocart;
	
public ProductPage() {
		
		PageFactory.initElements(driver, this);
	}
   

public void verifyPrdouct() {
	
	boolean result = action.isDisplayed(driver, backpag);
	Assert.assertTrue(result);
}

public void verifyaddtocartt() {
	
	boolean result = action.isDisplayed(driver, addtocart);
	Assert.assertTrue(result);
}

public void clickPrd() 
{
	action.click(driver, backpag);
	} 

public CartPage clicaddtocart() 
{
	action.click(driver,addtocart );
	return new CartPage();
		
	} 
}