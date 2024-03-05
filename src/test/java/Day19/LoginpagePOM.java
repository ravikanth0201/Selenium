package Day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginpagePOM {
	WebDriver driver;

 //constructor
	LoginpagePOM(WebDriver driver)
	{
		this.driver=driver;
	}


// locators
 By img_logo_loc=By.xpath("//img[@alt='company-branding']");
 By txt_username_loc=By.name("username");
 By txt_password_loc=By.cssSelector("input[placeholder='Password']");
 By btn_submit_loc=By.xpath("//button[normalize-space()='Login']");
 
//Action methods
  
 public void setUserName(String username)
 {
	 driver.findElement(txt_username_loc).sendKeys(username);
 }
 public void setpassword(String password)
 {
	 driver.findElement(txt_password_loc).sendKeys(password);
 }
 public void clicksubmit()
 {
	 driver.findElement(btn_submit_loc).click();
 }
 public boolean checkLogoPresence()
 {
	 boolean status=driver.findElement(img_logo_loc).isDisplayed();
	 return status;
 }
 
 
 
}