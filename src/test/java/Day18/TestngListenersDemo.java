package Day18;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestngListenersDemo1.class)
public class TestngListenersDemo {
  @Test
  public void test1() {
	  System.out.println("I am inside Test1");
  }
  @Test
  public void test2() {
	  System.out.println("I am inside Test2");
  }
  @Test
  public void test3() {
	  System.out.println("I am inside Test3");
  }
  
}