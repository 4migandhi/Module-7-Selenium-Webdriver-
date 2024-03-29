//W.a. TestNG program to create group with testing.xml file
package com.TestNG;

import org.testng.annotations.Test;

public class Create_Group {
	 @Test(groups = "A")
	  public void red1() {
		  System.out.println("This is A Group");
	  }
	  
	  @Test(groups = "A")
	  public void red2() {
		  System.out.println("This is A Group");
	  }
	  
	  @Test(groups = "A")
	  public void red3() {
		  System.out.println("This is A Group");
	  }
	  
	  @Test(groups = "B")
	  public void green1() {
		  System.out.println("This is B Group");
	  }
	  
	  @Test(groups = "B")
	  public void green2() {
		  System.out.println("This is B Group");
	  }
	  
	  @Test(groups = "B")
	  public void green3() {
		  System.out.println("This is B Group");
	  }
	   
	  @Test(groups = {"B","A"})
	  public void greenandred() {
		  System.out.println("This is B And Red A");
	  }

}
