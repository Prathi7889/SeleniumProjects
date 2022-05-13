package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IPhone {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\THANVIKA\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		 
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement type = driver.findElement(By.id("twotabsearchtextbox"));
		type.sendKeys("IPhone 13");
		
		WebElement search = driver.findElement(By.id("nav-search-submit-button"));
		search.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		
		
		WebElement iPhone = driver.findElement(By.xpath("(//span[contains(text(),'Apple iPhone 13 (128GB)')])[6]"));
		iPhone.click();
		
		Thread.sleep(2000);
		//WebElement scroll = driver.findElement(By.xpath("//span[contains(text(),'No Cost EMI available')]"));
		js.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(2000); 
		
		WebElement add = driver.findElement(By.id("add-to-cart-button"));
		add.click();
		System.out.println("Added IPhone 13 in cart");
		
		
	}

}
