// W.A.J.Script for Selecting multiple items in a drop dropdown.

package com.webdriverAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectingMultipleDropdown {
	
public static void main(String[] args)throws InterruptedException {
		
		
		System.setProperty("webdriver.edge.driver", 
				"D:\\Automation_Testing\\selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.get("http://the-internet.herokuapp.com/dropdown");
		Thread.sleep(3000);
		
		WebElement e1= driver.findElement(By.id("dropdown"));
		Select s1=new Select(e1);
		
		s1.selectByVisibleText("Option 1");
		Thread.sleep(2000);
		
		s1.selectByVisibleText("Option 2");
		Thread.sleep(2000);
		
		s1.selectByVisibleText("Please select an option");
		Thread.sleep(2000);
		
		driver.close();
	}

}
