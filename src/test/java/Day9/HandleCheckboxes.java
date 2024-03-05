package Day9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckboxes {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.navigate().to("https://www.hyrtutorials.com/p/basic-controls.html");
	    	
     
	    //select specific one checkbox
	    
	    driver.findElement(By.xpath("//input[@id='hindichbx']")).click();
	    
	    //total number of checkboxes
	   List<WebElement> checkboxes= driver.findElements(By.xpath("input[@class='form-check-input'and @type='Checkbox']"));
	    System.out.println("Total number of checkboxes:"+checkboxes.size());
	    
	    
	}

}
