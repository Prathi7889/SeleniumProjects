package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\THANVIKA\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.gmail.com");
        driver.manage().window().maximize();
        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
      email.sendKeys("gurutomail@gmail.com");
     
   
	}

}
