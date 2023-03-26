package com.pageobjects;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.BaseClass.BaseClass;
import com.actiondriver.Action;

public class CartPage extends BaseClass {
	Action action = new Action();
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement cartlink;


public CartPage() {
	PageFactory.initElements(driver, this);
}

public void verypage() {

	boolean result = action.isDisplayed(driver, cartlink);
	Assert.assertTrue(result);

}


public void clicklink() {
	action.fluentWait(driver, cartlink, 20);
	action.click(driver, cartlink);
}
}



