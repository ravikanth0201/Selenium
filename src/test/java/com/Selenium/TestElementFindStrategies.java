package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestElementFindStrategies {
	
	public static void main(String[]args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
	Thread.sleep(3000);
	driver.close();
	
	

}
}
