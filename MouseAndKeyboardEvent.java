/*W.A.J.Script To use Mouse and Keyboard event using Action class 

1.Mouse Hover Event
2. Keyboard event*/
package com.webdriverAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseAndKeyboardEvent {
public static void main(String[] args)throws InterruptedException {
		
		
		System.setProperty("webdriver.edge.driver", 
				"D:\\Automation_Testing\\selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		//[1] Mouse Hover Event
		driver.get("https://demo.automationtesting.in/WebTable.html");
		Thread.sleep(3000);
		
		WebElement home = driver.findElement(By.linkText("Home"));
		WebElement register = driver.findElement(By.linkText("Register"));
		WebElement SwitchTo = driver.findElement(By.linkText("SwitchTo"));
		
		Actions actions = new Actions(driver);
		
		Action a1=actions
				  .moveToElement(home)
				  .build();
		a1.perform();
		Thread.sleep(2000);
		
		Action a2=actions
				  .moveToElement(register)
				  .build();
		a2.perform();
		Thread.sleep(2000);
		
		Action a3=actions
				  .moveToElement(SwitchTo)
				  .build();
		a3.perform();
		Thread.sleep(2000);
		
		//[2] Keyboard event
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		WebElement email=driver.findElement(By.name("email"));
		
		
		Actions ac=new Actions(driver);
		
		//action is an interface
		Action a4=ac
				.moveToElement(email)
				.click()
				.keyDown(email, Keys.SHIFT)
				.sendKeys("charmi")
				.keyUp(email, Keys.SHIFT)
				.contextClick()
				.build();
		
		a4.perform();
		
		Thread.sleep(2000);
		
		driver.close();
}
}
