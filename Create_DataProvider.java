package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Create_DataProvider {
	@DataProvider(name="charmi")
	public Object[][] input() {
		return new Object[][] {{"Standard_user","sceret_sauce"},
			{"problem_user","sceret_sauce"}};
		
	}
	
	@Test(dataProvider = "charmi")
	public void f(String username,String password) throws InterruptedException {
		
			System.setProperty("webdriver.edge.driver", 
					"D:\\Automation_Testing\\selenium\\msedgedriver.exe");
			
			WebDriver driver = new EdgeDriver();
			
			driver.get("https://www.saucedemo.com/");
			
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			driver.findElement(By.id("user-name")).sendKeys(username);
			Thread.sleep(2000);
			
			driver.findElement(By.id("password")).sendKeys(password);
			Thread.sleep(2000);
			
			driver.findElement(By.id("login-button")).click();
			Thread.sleep(2000);
			
			driver.close();
	}

}
