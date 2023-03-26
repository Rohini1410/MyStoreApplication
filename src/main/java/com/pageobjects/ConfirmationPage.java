package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.BaseClass.BaseClass;
import com.actiondriver.Action;

public class ConfirmationPage extends BaseClass {
	Action action = new Action();

	@FindBy(xpath="//h2[text()='Thank you for your order!']")
	WebElement confirm;


public ConfirmationPage() {
	PageFactory.initElements(driver, this);
	
}

public void verifyconfirm() {
action.fluentWait(driver, confirm, 10);
boolean displayed = action.isDisplayed(driver, confirm);
Assert.assertTrue(displayed);

}

}