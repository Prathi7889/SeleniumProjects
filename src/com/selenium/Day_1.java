package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_1 {

	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\THANVIKA\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		Thread.sleep(2000);
		driver.navigate().to("http://gmail.com/");
		Thread.sleep(2000);
		driver.navigate().to("http://www.flipkart.com/");
		Thread.sleep(2000);
		driver.navigate().to("http://greenstech.in/selenium-course-content.html");
		
		driver.navigate().back();
		driver.navigate().back();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		driver.quit();
		
		
	}

}
