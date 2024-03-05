package Day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverDemo {

	public static void main(String[] args) {


	    WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();  // to perform only one  browser window webpage or document.
        driver.manage().window().maximize();  
      
        driver.get("https://demo.opencart.com/");
        WebElement desktops=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
        
        WebElement mac= driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));

         Actions act = new Actions(driver);
         
         // Mouse Hover
         
         //act.moveToElement(desktops).moveToElement(mac).click().build().perform(); // creating action then after perform
         act.moveToElement(desktops).moveToElement(mac).click().perform();         // directly performing action
	
	
	}

}
