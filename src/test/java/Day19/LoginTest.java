package Day19;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	WebDriver driver;
	
	@BeforeClass
	void setup()  
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test
	void testlogo()
	{
		LoginpagePOM lp = new LoginpagePOM(driver);
		lp.checkLogoPresence();
		Assert.assertEquals(lp.checkLogoPresence(),true);
	}
	
	@Test
	void testLogin(LoginpagePOM lp)
	
	{
	lp.setUserName("Admin");
	lp.setpassword("admin123");
	lp.clicksubmit();
	 Assert.assertEquals(driver.getTitle(),"OrangeHRM");
driver.close();
}
	
}
