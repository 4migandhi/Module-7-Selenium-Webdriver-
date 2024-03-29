//W.A.J. Script How to handled Alert in selenium 
//"http://demo.guru99.com/test/delete_customer.php "
package com.webdriverAssignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandledAlert {
public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", 
				"D:\\Automation_Testing\\selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(3000);
		
		String main_w= driver.getWindowHandle();
		
		driver.findElement(By.name("cusid")).sendKeys("123");
		Thread.sleep(2000);
		
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		
		// Alert is Interface
		
		Alert a1 = driver.switchTo().alert();
		
		System.out.println(a1.getText());
		
		//a1.dismiss();   			//for close alert box
		
		a1.accept();
		Thread.sleep(2000);
		
		Alert a2 = driver.switchTo().alert();
		System.out.println(a2.getText());
		
		a2.accept();
		Thread.sleep(2000);
		driver.close();
		
	}
}

