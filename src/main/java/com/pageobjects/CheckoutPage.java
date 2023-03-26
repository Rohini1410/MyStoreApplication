package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.BaseClass.BaseClass;
import com.actiondriver.Action;

public class CheckoutPage extends BaseClass {
	Action action = new Action();
	
	@FindBy(id="checkout")
	WebElement checkout;

	@FindBy(id="first-name")
	WebElement fname;
	
	@FindBy(id="last-name")
	WebElement lname;
	
	@FindBy(id="postal-code")
	WebElement pcode;
	
	@FindBy(id="continue")
	WebElement con;
	
	
	
public CheckoutPage() {
		
		PageFactory.initElements(driver, this);
	}
	
public void verifyTitle() {
	
String actual = driver.getTitle();
System.out.println(actual);

Assert.assertEquals("Swag Labs", actual);
}
public void clickoncheckout() {
	action.click(driver, checkout);
	
}

public OverviewPage enterdetails() {
	action.fluentWait(driver,fname,10);
	action.type(fname, "rohini");
	action.type(lname, "jay");
	action.type(pcode, "888888");
	action.click(driver, con);
	return new OverviewPage();
	
}

}

