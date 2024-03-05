package Day17;

import org.testng.annotations.Test;
/*
 loginByEmail    - sanity & regression
 loginByfacebook - sanity
 loginBytwitter  - sanity
 
 signupByEmail    - sanity & regression
 signupByfacebook -regression
 signupByTwitter  - regression
 
 paymentinrepees   - sanity & regression
 paymentindollar    - sanity
 paymentreturnbybank -  regression
 */




public class Grouping {
	
	
	@Test(priority=1,groups= {"sanity & regression"})
	void loginByEmail()
	{
		System.out.println("this is login by email");
	}
    @Test(priority=2,groups= {"sanity"})
	void loginByfacebook()
	{
		System.out.println("this is login by facebook");
	}
    @Test(priority=3,groups= {"sanity"})
    void loginByTwitter()
    {
    	System.out.println("this is login by twitter");
    }
    @Test(priority=4,groups= {"sanity & regression"})
    void loginbyemail()
    {
    	System.out.println("this is signup by email");
    }
    @Test(priority=5,groups= {"regression"})
    void signupbyfacebook()
    {
    	System.out.println("this is signup by facebook");
    }
    @Test(priority=6,groups= {"regreesion"})
    void signupbytwitter()
    {
    	System.out.println("this is signup by twitter");
    }
    @Test(priority=7,groups= {"sanity & regression"})
    void paymentinrupees()
    {
    	System.out.println("this is payment in ruppes");
    }
    @Test(priority=8,groups = {"sanity"})
    void paymentindollar()
    {
    	System.out.println("this is payment in dollar");
    	
    }
     @Test(priority=9,groups = {"regression"})
     void paymentreturnbybank()
     {
      System.out.println("this is payment return by bank");
     }
}
