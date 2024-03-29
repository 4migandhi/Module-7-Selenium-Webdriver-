/*W.a. junit program to use parameterized demo with multiple parameter of Facebook

 * login in junit.*/

package com.junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class Parameterized_FB_Login {
	
	FBLogin fd;
	String user_id, password;
	
	@Before
	public void before() {
		
		fd=new FBLogin();
	}
	
	public Parameterized_FB_Login(String user_id,String password ) {
		this.user_id=user_id;
		this.password=password;
		
	}
	
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList
				(new Object[][] {{"charmi@gmail.com" , "ch!123"},
								 {"arpita@gmail.com" , "ar%456"} , 
								 {"hemal@gmail.com" ,"he*789"}});
		
	}
	
	@Test
	public void test() {
		System.out.println("My id is : "+user_id);

		System.out.println("My Password is : "+password);
		try {
			fd.test(user_id, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	}

}
