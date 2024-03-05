package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//open app
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Tag and ID
		//driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Iphone");
		//driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Iphone");

		//Tag and Attribute 
		//driver.findElement(By.cssSelector("[name='field-keywords']")).sendKeys("MacBook");
		driver.findElement(By.cssSelector("input[name='field-keywords']")).sendKeys("MacBook");
		Thread.sleep(3000);
		driver.quit();
	}

}
