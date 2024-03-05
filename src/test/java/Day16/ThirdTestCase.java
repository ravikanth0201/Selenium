package Day16;
import org.testng.annotations.Test;

public class ThirdTestCase {
	
	@Test(priority=1)           // annotations
    void OpenApp()
    {
    	System.out.println("testing 1");    
    }
	
	@Test(priority=2)
    void login()
    {
		System.out.println("testing 2"); 	
    	
    	
    }
    @Test(priority=3)
    void closeApp()
    {
    	System.out.println("testing 3"); 
    	
    }
    }



