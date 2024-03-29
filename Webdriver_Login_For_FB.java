/*W.a. junit program to perform test with webdriver to login process of facebook*/
package com.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Webdriver_Login_For_FB {
	WebDriver driver;
	
	
	@Before
	public void before() throws InterruptedException{
	
		System.setProperty("webdriver.edge.driver", 
				"D:\\Automation_Testing\\selenium\\msedgedriver.exe");
		
		driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test
	public void test() throws InterruptedException{
		driver.findElement(By.cssSelector("input#email"))
			.sendKeys("charmi@gmail.com");
		Thread.sleep(2000);
	
		driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi"))
				.sendKeys("123");
		Thread.sleep(2000);
	
		driver.findElement(By.cssSelector("button._42ft._4jy0._6lth._4jy6._4jy1.selected._51sy"))
			.click();
		Thread.sleep(2000);
	}
	
	@After
	public void after() throws InterruptedException{
	driver.close();
	Thread.sleep(2000);
	}
}
