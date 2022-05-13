package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
    
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\THANVIKA\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	
    WebElement from = driver.findElement(By.xpath("//input[@data-message='Please enter a source city']"));
    from.sendKeys("Chennai");
    
    WebElement to = driver.findElement(By.xpath("//input[@data-message='Please enter a destination city']"));
    to.sendKeys("Trichy");
}
}
