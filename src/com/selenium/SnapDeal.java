package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\THANVIKA\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.snapdeal.com/login");
        driver.manage().window().maximize();
       WebElement mobile = driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']")); 
       mobile.sendKeys("1234567890");
	}

}
