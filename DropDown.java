//W.A.J.Script To write a script for drop down. 
//http://demo.guru99.com/test/newtours/register.php
package com.webdriverAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public static void main(String[] args)throws InterruptedException {
		
		
		System.setProperty("webdriver.edge.driver", 
				"D:\\Automation_Testing\\selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		
		WebElement e1= driver.findElement(By.id("Skills"));
		
		Select s1=new Select(e1);
		
		s1.selectByIndex(5);
		Thread.sleep(2000);
		
		driver.close();
}
}
