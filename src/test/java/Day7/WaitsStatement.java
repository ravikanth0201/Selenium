package Day7;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitsStatement {

	private static final WebDriver WebElement = null;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	
		//thread.sleep(3000);
		
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000)); 
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("vvrkr2000@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.cssSelector("input#ap_password")).sendKeys("TIger@8106");
	
	
		//declaring a explicit waits
	WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
	
	WebElement email=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ap_email']")));
	}

	
}