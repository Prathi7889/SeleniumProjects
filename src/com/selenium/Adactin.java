package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin {

	public static void main(String[] args) {
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\THANVIKA\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
          
          WebDriver driver = new ChromeDriver();
          driver.get("http://adactinhotelapp.com/");
          driver.manage().window().maximize();      
          
          
          WebElement email = driver.findElement(By.xpath("//input[@name='username']"));
          email.sendKeys("Prathi");
          
          WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
          password.sendKeys("test123");
          
	}

	

}
