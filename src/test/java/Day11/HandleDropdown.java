package Day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
     Thread.sleep(5000);
     WebElement courseElement = driver.findElement(By.id("course"));
     Select CourseNameDropdown = new Select(courseElement);
     List<WebElement> CourseNameDropdownOptions = CourseNameDropdown.getOptions();
     for (WebElement option : CourseNameDropdownOptions) {
    	 System.out.println(option.getText());
     }
     CourseNameDropdown.selectByIndex(3);   //javascript
     Thread.sleep(5000);
     CourseNameDropdown.selectByValue("net");
     Thread.sleep(5000);
     CourseNameDropdown.selectByVisibleText("Javascript");
     Thread.sleep(5000);
     String selectedText = CourseNameDropdown.getFirstSelectedOption().getText();
     System.out.println("Selected visible text - "+selectedText);
    
		
		
	}

}
