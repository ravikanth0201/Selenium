package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locatoridclass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//Tag and ID
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Mobiles");
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Mobiles");
		
        //Tag and Class
		driver.findElement(By.cssSelector("input.nav-a ")).sendKeys("Mobiles");
	    driver.findElement(By.cssSelector(".nav-a ")).sendKeys("Mobiles");
		
		//Tag and Attribute 
		driver.findElement(By.cssSelector("input[name='field-keywords']")).sendKeys("Mobiles");
		driver.findElement(By.cssSelector("[name='field-keywords']")).sendKeys("Mobiles");
		
		//Tag class Attribute
		driver.findElement(By.cssSelector("input.nav-a[name='field-keywords']")).sendKeys("Mobiles");
		driver.findElement(By.cssSelector(".nav-a[name='field-keywords']")).sendKeys("Mobiles");
	}

}
