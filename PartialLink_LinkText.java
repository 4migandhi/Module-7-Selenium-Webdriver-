// W.A.J.Script for Locating links by linkText() and partialLinkText().
package com.webdriverAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PartialLink_LinkText {
	public static void main(String[] args)throws InterruptedException {
		
		
		System.setProperty("webdriver.edge.driver", 
				"D:\\Automation_Testing\\selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.get("https://thedemosite.co.uk/");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("About")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Contact")).click();
		Thread.sleep(5000);
		
		driver.close();
	}

}
