/*W.a. TestNG program to use parameterized demo with multiple parameter of Facebook 
 * login with TestNG.*/
package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_TestNG_FB_Login {
	  @Test
	  @Parameters({"username","password"})
	 
	  public void f(String username,String password) throws InterruptedException {
				System.setProperty("webdriver.edge.driver", 
						"D:\\Automation_Testing\\selenium\\msedgedriver.exe");
				
				WebDriver driver = new EdgeDriver();
				
				driver.get("https://www.facebook.com/");
				
				driver.manage().window().maximize();
				Thread.sleep(2000);
				
				//For Implicitly wait
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				driver.findElement(By.id("email")).sendKeys(username);
				Thread.sleep(2000);
				
				driver.findElement(By.id("pass")).sendKeys(password);
				Thread.sleep(2000);
				
				driver.findElement(By.name("login")).click();
				Thread.sleep(2000);
				
				driver.close();
	  }

}
