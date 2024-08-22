package com.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.validator.PublicClassValidator;

public class JunitAnnotation {
	
	@BeforeClass
	public static void brforeclass()  {
		System.out.println("before class");
	}
	
	@Before
	public void before()  {
		System.out.println("before method");
	}
	
	@Test
	public void test1()  {
		System.out.println("this is test1");
	}
	
//	@Ignore
	@Test
	public void test2()  {
		System.out.println("this is test2");
	}
	
	@After
	public void after()  {
		System.out.println("after method");
	}
	
	@AfterClass
	public static void afterclass()  {
		System.out.println("after class");
	}
}
