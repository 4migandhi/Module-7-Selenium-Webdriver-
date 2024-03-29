//W.A.J. script to use different methods to manage the windows-alerts and pop ups.
package com.webdriverAssignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Windows_Alerts_And_Pop_Ups {
public static void main(String[] args)throws InterruptedException {
		
		
		System.setProperty("webdriver.edge.driver", 
				"D:\\Automation_Testing\\selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/popup.php");
		Thread.sleep(3000);
		
		String main_w= driver.getWindowHandle();
		
		System.out.println("Main Window :"+main_w);
		
		driver.findElement(By.partialLinkText("Cli")).click();
		Thread.sleep(2000);
		
		Set<String> all_w = driver.getWindowHandles();
		
		Iterator<String> i1 = all_w.iterator();
		while (i1.hasNext()) {
			String child_w = i1.next();
			System.out.println(child_w);
			
			if (!main_w.equals(child_w)) {
				driver.switchTo().window(child_w);
				Thread.sleep(2000);
				
				driver.findElement(By.name("emailid")).sendKeys("c@gmail.com");
				Thread.sleep(2000);
				
				driver.findElement(By.name("btnLogin")).click();
				Thread.sleep(2000);
				driver.close();
			}
		}
		Thread.sleep(2000);
		driver.switchTo().window(main_w);
		Thread.sleep(2000);
	}
}

