package TestNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

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
}
