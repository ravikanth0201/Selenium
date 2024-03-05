package Day13;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticTableDemo {
  
	private static String r1;
	private static String c1;
	private static String r;
	private static String c;

	public static void main(String[]args) {
		 
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	     
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	    driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
	//   1) find total number of column
		

		//	int rows1=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); //7 option1 preferred for multiple tables in webpage
       	//  int rows=driver.findElements(By.tagName("tr")).size();//8 option2 preferred only if you have one single table
		 // System.out.println("Number of rows:"+ rows1);
	
	//	2) find total number of column
         
		   int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		   System.out.println("Number of columns:"+ cols); //4
		
	//   3)Read specific row & column data
		 //  String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[1]")).getText();
		  // System.out.println(value);
		
	//   4) Read data from all the rows & columns
		   
		 
		int rows = 0;
		for(int r=2;r<=rows;r++);
		   {
			   for(int c=1;c<=cols;c++);
			   {
				  
				String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();  
			    System.out.println(value+"\t");
			   }
			   System.out.println();
			   
			   
			   }
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	}
	
	
	
	
	
	
	
	
	
	
	
	

