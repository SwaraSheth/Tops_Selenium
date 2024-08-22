package com.testng;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.testng.SkipException;


public class FirstDemo {
	@org.testng.annotations.Test
	public void test() {
		System.out.println("this test is passed");
	}
	
	@org.testng.annotations.Test
	public void test2() {
		System.out.println("fail test");
		fail();
	}
	
	@org.testng.annotations.Test
	public void test3() {
		System.out.println("this is skip test");
		throw new SkipException("self skip");
	}

}
