package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {

	@Test
	public void sum()
	{
		int a=10;
		int b=20;
		Assert.assertEquals(a+b, 30);
	}
	@Test
	public void demo()
	{
		System.out.println("hi");
	}
	
}
