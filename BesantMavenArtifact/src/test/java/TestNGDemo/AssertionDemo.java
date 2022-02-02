package TestNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
  @Test
  public void testMethod1() {
	  Assert.assertTrue(20>18);
  }
  @Test
  public void testMethod2() {
	  Assert.assertTrue("Hello".equals("HI"));
  }
  
  @Test
  public void testMethod3() {
	  Assert.assertFalse(20>18);
  }
  @Test
  public void testMethod4() {
	  Assert.assertFalse("Hello".equals("HI"));
  }
  
  @Test
  public void testMethod5() {
	  int actual=10;
	  int expected=10;
	  Assert.assertEquals(actual, expected);
  }
  @Test
  public void testMethod6() {
	  String actual="Hello";
	  String expected="Hi";
	  Assert.assertEquals(actual,expected);
  }
  
  @Test
  public void testMethod7() {
	 Object obj=null;
	  Assert.assertNull(obj);
  }
  @Test
  public void testMethod8() {
	 Object obj=new Object();
	 Assert.assertNull(obj);
  }
  
  @Test
  public void testMethod9() {
	 Object obj1=new Object();
	 Object obj2=new Object();
	  Assert.assertSame(obj1, obj2);
  }
  @Test
  public void testMethod10() {
	  Object obj1=new Object();
		 Object obj2=obj1;
		  Assert.assertSame(obj1, obj2);
  }
  
  @Test
  public void testMethod11() {
		  Assert.fail("I am intentionally failing this TestCases");
  }
  
  @Test
  public void testMethod12() {
		  
System.out.println("This is for Hard Assertion: Assert");
System.out.println("This is for Hard Assertion: This will skip the rest of the code if the first assert failes if we have multiple assertion statement");
Assert.assertFalse(20>18);//First Condition

System.out.println("This Sttement will skip and will not run during execution");

String actual="Hello";
String expected="Hi";
Assert.assertEquals(actual,expected);//This is second Condition
  
  }
  
  @Test
  public void testMethod13() {
		  
System.out.println("This is for Soft Assertion:SoftAssert");
System.out.println("This is for Soft Assertion: This will not skip the rest of the code if the first assert failes if we have multiple assertion statement");

SoftAssert sa=new SoftAssert();
sa.assertFalse(20>18);
System.out.println("This Sttement will not skip and will  run during execution Since we have implement the soft Assert Object");

String actual="Hello";
String expected="Hi";
sa.assertEquals(actual,expected);

sa.assertAll();
  }

}
