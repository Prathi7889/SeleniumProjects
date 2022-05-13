package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\THANVIKA\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.swiggy.com/");
        driver.manage().window().maximize();
        
        WebElement location = driver.findElement(By.xpath("//input[@placeholder='Enter your delivery location']"));
        location.sendKeys("Chennai");
	}

}
