package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotationsDemo {
  @Test
  public void test() {
	  System.out.println("I am inside Test Method Annoations");
  }
  @BeforeTest
  public void beforetest() {
	  System.out.println("I am inside Before Test Method Annoations");
  }
  @AfterTest
  public void aftertest() {
	  System.out.println("I am inside After Test Method Annoations");
  }
  
  @BeforeSuite
  public void beforeSuiteTest() {
	  System.out.println("I am inside nefore Suite Method Annoations");
  }
  @AfterSuite
  public void afterSuiteTest() {
	  System.out.println("I am inside after suite Method Annoations");
  }
  
  @BeforeClass
  public void beforeClasstest() {
	  System.out.println("I am inside Before Class Test Method Annoations");
  }
  
  @AfterClass
  public void afterClasstest() {
	  System.out.println("I am inside After Class Test Method Annoations");
  }
  
  @BeforeMethod
  public void beforeMethodtest() {
	  System.out.println("I am inside Before Method Test Method Annoations");
  }
  @AfterMethod
  public void afterMethodtest() {
	  System.out.println("I am inside After Method Test Method Annoations");
  }
  
  
  
}
