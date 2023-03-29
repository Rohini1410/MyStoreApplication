package com.BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.utility.ExtentManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
 // Declare ThreadLocal Driver
	public static ThreadLocal<RemoteWebDriver> driver1 = new ThreadLocal<RemoteWebDriver>();
	
	public static WebDriver driver;

public static Properties prop;
	
	//loadConfig method is to load the configuration


@BeforeSuite
public void loadConfig() {
	
	DOMConfigurator.configure("log4j.xml");
	ExtentManager.setExtent();

	try {
		prop = new Properties();
		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir") + "\\Configuration\\config.properties");
		prop.load(ip);

	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
	
		/*@BeforeTest
	public void loadConfig() {
		try {
			prop = new Properties();
	    	FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "\\Configuration\\config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}*/

		
public static WebDriver getDriver() {
	// Get Driver from threadLocalmap
	return driver1.get();
}


	public void launchApp() {
		String browsename = prop.getProperty("browser");
		if(browsename.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
		else {
			
			System.out.println("invalid");
			}
		
		driver.get(prop.getProperty("url"));
		}


@AfterSuite(groups = { "Smoke", "Regression","Sanity" })
public void afterSuite() {
	ExtentManager.endReport();
}
}