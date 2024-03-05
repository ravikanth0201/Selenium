package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amozan {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//open app
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//search box 
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Tv");
	 
		// search button
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);
		
		//link text 
		//driver.findElement(By.linkText("Redmi 80 cm (32 inches) F Series HD Ready Smart LED Fire TV L32R8-FVIN (Black)")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Redmi 80 cm (32 inches")).click();
		Thread.sleep(3000);
		
		// Find Total Number of images in Home page
		   List<WebElement> images=driver.findElements(By.tagName("img"));
	       System.out.println("Total number of images:"+images.size());
	       
	    // Find Total number of links
	       List<WebElement>links=driver.findElements(By.tagName("a"));
	       System.out.println("Total number of links:"+links.size());
	       
	       driver.quit();
	

}
}
