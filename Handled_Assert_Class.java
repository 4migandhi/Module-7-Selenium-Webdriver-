/*W.a.junit program to handled Assert class with all method to check its pass 
or fail.*/
package com.junit;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import com.google.common.annotations.VisibleForTesting;

public class Handled_Assert_Class {
	@Ignore
	@Test
	public void method() {
		
		int a=10;
		int b=11;
	
		Assert.assertTrue(a<b);
		Assert.assertFalse(a>b);
	}
	@Ignore
	@Test
	public void method1() {
		
		String s1="Charmi";
		String s2=null;
		
		Assert.assertNull(s2);
		Assert.assertNotNull(s1);
	}
	@Ignore
	@Test
	public void method2() {
		int i1=10;
		int i2=11;
		
		//Assert.assertEquals(i1, i2);
		Assert.assertNotEquals(i1, i2);
		
		String s1="Charmi";
		String s2="charmi";
		
	//	Assert.assertSame(s1, s2);
		Assert.assertNotSame(s1, s2);
	}
	
	@Test
	public void method3() {
		
		int[] a= {1,2,3,4,5};
		int[] b= {1,2,3,4,5};
		
		Assert.assertArrayEquals(a, b);	
	}
	
}
