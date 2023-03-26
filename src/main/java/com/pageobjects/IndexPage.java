package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;
import com.actiondriver.Action;

public class IndexPage extends BaseClass {
	
	
	ProductPage productPage;
	Action action= new Action();

	
	@FindBy(id = "user-name")
	private WebElement unamebox;
	
	@FindBy(id="password")
	private WebElement pwdbox;
	
	@FindBy(id="login-button")
	private WebElement loginbtn;

	
	public IndexPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
public ProductPage login(String uname,String pd) {
		
		action.type(unamebox, uname);
		action.type(pwdbox, pd);
		action.click(driver, loginbtn);
		return new ProductPage();
		

	}
}
