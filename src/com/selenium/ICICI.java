package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ICICI {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\THANVIKA\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//input[@name='DUMMY1']"));
		username.sendKeys("Prathi");
		WebElement arrow = driver.findElement(By.xpath("//img[@onclick='goUserId();']"));
		arrow.click();
		WebElement password = driver.findElement(By.xpath("//input[@title='Password']"));
		password.sendKeys("12345");
	}

}
