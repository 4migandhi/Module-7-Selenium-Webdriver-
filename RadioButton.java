//W.A.J. Script To perform the radio button to select one by one in loop 
//http://demo.guru99.com/test/radio.html
package com.webdriverAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RadioButton {
	
public static void main(String[] args)throws InterruptedException {
		
		
		System.setProperty("webdriver.edge.driver", 
				"D:\\Automation_Testing\\selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		
		driver.findElement(By.name("radiooptions")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath
				("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input")).click();
		Thread.sleep(2000);
		
		driver.close();
}
}
