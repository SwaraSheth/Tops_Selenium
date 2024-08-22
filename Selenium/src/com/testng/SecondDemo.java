package com.testng;

import org.testng.annotations.Test;

public class SecondDemo {

	@Test(priority = 2)
	public void test() {
		System.out.println("This is test");
	}
	
	@Test(priority = 0)
	public void best() {
		System.out.println("This is best");
	}
	
	@Test(priority = 3)
	public void fest() {
		System.out.println("This is fest");
	}
	
	@Test(priority = 1)
	public void nest() {
		System.out.println("This is nest");
	}
}
