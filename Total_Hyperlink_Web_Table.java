package com.webdriverAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Total_Hyperlink_Web_Table {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", 
				"D:\\Automation_Testing\\selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		List<WebElement> th =driver.findElements
		(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		
		System.out.println("No Of Col Is: "+ th.size());
		
		List<WebElement> tr = driver.findElements(By.xpath
				("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		
		System.out.println("No Of Row Is :"+ tr.size());
		
		
		for (int i =1 ; i <= tr.size(); i++) {
			for (int j = 1; j <=th.size(); j++) {
				
			String t_data = driver.findElement
				(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
			
			System.out.print("    |   "+t_data);
				
			}
			Thread.sleep(1000);
			System.out.println();
			
		}
		driver.close();
	}
}
