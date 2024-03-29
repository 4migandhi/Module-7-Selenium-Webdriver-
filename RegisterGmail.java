//W.A.J.script to register your self in Gmail.

package com.webdriverAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterGmail {
	
public static void main(String[] args)throws InterruptedException {
		
		
		System.setProperty("webdriver.edge.driver", 
				"D:\\Automation_Testing\\selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com/lifecycle/steps/signup/name?"
				+ "continue=https://mail.google.com/mail/&dsh=S-49358776:"
				+ "1709887335101832&flowEntry=SignUp&flowName=GlifWebSignIn&"
				+ "service=mail&theme=glif&TL=ADg0xR27VteaKsugUwFglJCJ2q_E-"
				+ "MTLzpc96jnEgpDQZJwY4J5u6Gc7eOSXY9pf");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath
				("//*[@id=\"yDmH0d\"]/c-wiz/div[2]/div[2]/div/div[2]/div/div/div/div/button/span")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("firstName")).sendKeys("charmi");
		Thread.sleep(2000);
		
		driver.findElement(By.id("lastName")).sendKeys("Gandhi");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath
				("//*[@id=\"collectNameNext\"]/div/button/span")).click();
		Thread.sleep(2000);
		
		WebElement e1= driver.findElement(By.id("month"));
		
		Select s1=new Select(e1);
		
		s1.selectByIndex(5);
		Thread.sleep(2000);
		
		driver.findElement(By.id("day")).sendKeys("25");
		Thread.sleep(2000);
		
		driver.findElement(By.id("year")).sendKeys("2000");
		Thread.sleep(2000);
		
		/*for (int j = 2; j <5; j++) {
		driver.findElement(By.xpath("//*[@id=\"gender\"]/option"+j)).click();
		}*/
		driver.findElement(By.xpath("//*[@id=\"gender\"]/option[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath
				("//*[@id=\"birthdaygenderNext\"]/div/button/span")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"selectionc2\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"next\"]/div/button/span")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("Passwd")).sendKeys("Charmi@123");
		Thread.sleep(2000);
		
		driver.findElement(By.name("PasswdAgain")).sendKeys("Charmi@123");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath
				("//*[@id=\"yDmH0d\"]/c-wiz/div[2]/div[2]/div/div[1]/div/form/span/section/div/div/div/div[3]/div/div[1]/div/div/div[1]/div/input")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath
				("//*[@id=\"createpasswordNext\"]/div/button/span")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("phoneNumberId")).sendKeys("9898404850");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath
				("//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div/div/div/div/button/span")).click();
		Thread.sleep(2000);
		
		
		driver.close();
		}
}
