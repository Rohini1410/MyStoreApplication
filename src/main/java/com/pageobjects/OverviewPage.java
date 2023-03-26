package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.BaseClass.BaseClass;
import com.actiondriver.Action;

public class OverviewPage extends BaseClass {
	
	Action action = new Action();

	@FindBy(xpath="//div[text()='Shipping Information']")
	WebElement ship;
	
	@FindBy(xpath="//*[@id='finish']")
	WebElement finish;
	
	@FindBy(xpath="//div[text()='Price Total']")
	WebElement total;
	
	public OverviewPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void verifydetails() {
		action.fluentWait(driver, ship, 10);
		boolean displayed = action.isDisplayed(driver, ship);
		Assert.assertTrue(displayed);
		action.scrollByVisibilityOfElement(driver, total);
		action.isDisplayed(driver, finish);
		action.click(driver, finish);
	}
	
	/*public ConfirmationPage clickFinish() {
		action.fluentWait(driver, finish, 3);
		action.scrollByVisibilityOfElement(driver, finish);
		
		action.click(driver, finish);
		return new ConfirmationPage();

	}*/
}


