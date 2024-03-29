//W.a. TestNG program to check gmail login using with @beforetest,@aftertest,@Test
package com.TestNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Check_Gmail_Login {
WebDriver driver;
	
	@BeforeTest
	public void beforetest() throws InterruptedException{
	
		System.setProperty("webdriver.chrome.driver",
		"D:\\Automation_Testing\\selenium\\chromedriver-win64\\chromedriver-win64//chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://automationexercise.com/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test(priority = 1)
	public void password() throws InterruptedException{
		driver.findElement(By.name("password")).sendKeys("charmi@123");
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 0)
	public void username() throws InterruptedException{
		driver.findElement(By.name("email")).sendKeys("charmi@gmail.com");
		Thread.sleep(2000);
		
	}
	
	
	@Test(priority = 2)
	public void checkbox() throws InterruptedException{
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
		Thread.sleep(2000);
	}
		
		@AfterTest
		public void aftertest() throws InterruptedException{
		driver.close();
		
	}

}
