//W.a. TestNG program to perform test with webdriver to login process of facebook.
package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Webdriver_Login_FB {

	WebDriver driver;
	
	@BeforeTest
	public void beforetest() throws InterruptedException{
	
		System.setProperty("webdriver.edge.driver", 
				"D:\\Automation_Testing\\selenium\\msedgedriver.exe");
		
		driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test(priority = 1)
	public void enterpassword() throws InterruptedException{
		driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi"))
		.sendKeys("123");
		Thread.sleep(2000);
	}
	
	@Test(priority = 0)
	public void enterusername() throws InterruptedException{
		driver.findElement(By.cssSelector("input#email"))
		.sendKeys("charmi@gmail.com");
	Thread.sleep(2000);
	}
			
	@Test(priority = 2)
	public void ClickLogin() throws InterruptedException{
		driver.findElement(By.cssSelector
				("button._42ft._4jy0._6lth._4jy6._4jy1.selected._51sy"))
		.click();
		
	}
	
	@AfterTest
	public void aftertest() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
		
	}
}
