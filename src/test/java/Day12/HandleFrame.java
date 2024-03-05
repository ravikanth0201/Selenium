package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFrame {

	public static void main(String[] args) throws InterruptedException {
	

		    WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();  // to perform only one  browser window webpage or document.
	        driver.manage().window().maximize();  
	      
	        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	        driver.findElement(By.id("name")).sendKeys("Text1");
	        Thread.sleep(5000);
	        driver.switchTo().frame("frm1");  // frame1

	        Select courseName_dd = new Select(driver.findElement(By.id("course"))); // creating a instance 
		    courseName_dd.selectByVisibleText("java");  //to perform a operation on web element
		    Thread.sleep(5000);
		    driver.switchTo().defaultContent(); //main document
		    
           
		    driver.switchTo().frame("frm2");  // frame2
		    driver.findElement(By.id("firstName")).sendKeys("Text2");
		    Thread.sleep(5000);
		    driver.switchTo().defaultContent();//main document
		    driver.switchTo().frame("frm1");   //frame1
		    
	        courseName_dd.selectByVisibleText("Dot Net");
	        Thread.sleep(5000);
	        
	        driver.switchTo().defaultContent(); //main document
		    driver.findElement(By.id("name")).clear();
		    driver.findElement(By.id("name")).sendKeys("Text2");
		
	
		
		
		
		
		
	}

}
