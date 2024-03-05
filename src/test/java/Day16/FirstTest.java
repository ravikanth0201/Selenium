package Day16;

import org.testng.annotations.Test;

public class FirstTest {
	
	@Test(priority=1)           // annotations
    void test1()
    {
    	System.out.println("testing 1");    
    }
	
	@Test(priority=2)
    void test2()
    {
		System.out.println("testing 2"); 	
    	
    	
    }
    @Test(priority=3)
    void test3()
    {
    	System.out.println("testing 3"); 
    	
    }
    }

