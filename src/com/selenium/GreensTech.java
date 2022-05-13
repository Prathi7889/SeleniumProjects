package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTech {
       public static void main(String[] args) 
       {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\THANVIKA\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.google.com/");
	   driver.manage().window().maximize();
	   
	   WebElement enter = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	   enter.sendKeys("Greens Technology");
	   WebElement search=driver.findElement(By.xpath("//input[@class='gNO89b']"));
	   search.click();
}
}
