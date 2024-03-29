//W.A.J. script To write the script for image of logo facebook using xpath.
package com.webdriverAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ImageOfFB {
public static void main(String[] args)throws InterruptedException {
		
		
		System.setProperty("webdriver.edge.driver", 
				"D:\\Automation_Testing\\selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/accounts/password/reset/?hl=en");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("svg[fill='currentColor']")).click();
		Thread.sleep(3000);
		
			
		driver.close();
}
}
