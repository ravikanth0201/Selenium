package day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*get(url)
  getTitle()
  getCurrentURL()
  getPageSource()
  getWindowHandle()
  getWindowHandles()
 */

public class getmethod {


public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	System.out.println("tittle of the page:"+driver.getTitle());
	System.out.println("Current Url :"+ driver.getCurrentUrl());
	
	/*System.out.println("page source.....");
	String ps=driver.getPageSource();
	System.out.println(ps);
	System.out.println(ps.contains("html"));*/
	
	
}

}