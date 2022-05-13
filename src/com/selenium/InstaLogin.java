package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaLogin {

	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\THANVIKA\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
        username.sendKeys("Prathi");
        
        WebElement password= driver.findElement(By.xpath("//input[@aria-label='Password']"));
        password.sendKeys("12345");
	}

}
