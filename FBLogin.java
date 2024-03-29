/*W.a. junit program to use parameterized demo with multiple parameter of Facebook
 *  login in junit.*/
package com.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FBLogin {
	
WebDriver driver;
	
	
	public void test(String user_id , String password ) throws InterruptedException{
	
		System.setProperty("webdriver.edge.driver", 
				"D:\\Automation_Testing\\selenium\\msedgedriver.exe");
		
		driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
	
		driver.findElement(By.cssSelector("input#email"))
			.sendKeys(user_id);
		Thread.sleep(2000);
	
		driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi"))
				.sendKeys(password);
		Thread.sleep(2000);
	
		driver.findElement(By.cssSelector
				("button._42ft._4jy0._6lth._4jy6._4jy1.selected._51sy"))
			.click();
		Thread.sleep(10000);
	

	driver.close();

	}

}
