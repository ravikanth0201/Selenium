package Day14;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		
			

		    WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver(); 
			
			driver.get("https://jqueryui.com/datepicker/");
	        driver.manage().window().maximize();  
	        
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	      
	      driver.switchTo().frame(0); // switch to frame
	      
	     //Approach1
	       //driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("11/16/2023");
	     
	     //Approach2
	      
	       String year="2024";
	       String month="March";
	       String date="23";
	       
	       driver.findElement(By.xpath("//input[@id='datepicker']")).click(); // will open the date picker
	      
	      
	   // select month & year
	       while(true)
	       {
	    	 String mon=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	    	 String yr=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	    	 
	    	 if(mon.equals(month)&& yr.equals(year))
	    	 {
	    		 break;
	    	 }
	        driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); // next button
	      
	       }
	       
	        
	   //select date
	       List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-dateicker-calendar']//td"));
	       
	       for(WebElement dt:allDates)
	       {
	    	   if(dt.equals(date))
	    	   {
	    		   dt.click();
	    	   
	    	   }
	       }
	      
	      
	}

}
