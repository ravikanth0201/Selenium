package Day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlerts {

	public static void main(String[] args) {
	 
		WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        driver.manage().window().maximize();
      
        //Alert Box
        System.out.println(driver.findElement(By.id("output")).getText());
        driver.findElement(By.id("alertBox")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        System.out.println(driver.findElement(By.id("output")).getText());
        
        //confirm box
        System.out.println(driver.findElement(By.id("output")).getText());
        driver.findElement(By.id("confirmBox")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();                          //  to click ok button
        //driver.switchTo().alert().dismiss();                         //  to cancel the button
        System.out.println(driver.findElement(By.id("output")).getText());
        
        //prompt Box
        System.out.println(driver.findElement(By.id("output")).getText());
        driver.findElement(By.id("promptBox")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().sendKeys("Ravikanth");
        driver.switchTo().alert().accept();     
        System.out.println(driver.findElement(By.id("output")).getText());
        
        driver.quit();
        
        
        
        
	}

}
