package com.mystore.testcases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitTest {
	
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebDriverWait w = new WebDriverWait(driver,10);
		WebElement button = driver.findElement(By.name("btnK"));
		//w.until(ExpectedConditions.elementToBeClickable(button));
		Wait<WebDriver> w1 = new FluentWait(driver).withTimeout(Duration.ofMinutes(20)).pollingEvery(Duration.ofMillis(100)).ignoring(Throwable.class);
		w1.until(ExpectedConditions.elementToBeClickable(button));
		
		button.click();
	}

}
