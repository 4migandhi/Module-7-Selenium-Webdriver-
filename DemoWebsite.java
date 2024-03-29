//Demo Websites To Practice selenium Webdriver.
//1. List of Websites to Practice Selenium

package com.webdriverAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoWebsite {
public static void main(String[] args)throws InterruptedException {
		
	
		System.setProperty("webdriver.edge.driver", 
				"D:\\Automation_Testing\\selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
	
		driver.get("https://phptravels.com/demo/");
		Thread.sleep(3000);
		
		driver.get("http://thedemosite.co.uk/");
		Thread.sleep(2000);
		
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(2000);
		
		driver.get("http://the-internet.herokuapp.com/");
		Thread.sleep(2000);
		
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(2000);
		
		driver.get("http://book.theautomatedtester.co.uk/");
		Thread.sleep(2000);
		
		driver.get("https://s1.demo.opensourcecms.com/wordpress/");
		Thread.sleep(2000);
		
		driver.close();
}
}