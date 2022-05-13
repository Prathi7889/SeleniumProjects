package com.selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazonproject {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\THANVIKA\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions as = new Actions(driver);
		WebElement ramphone = driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(2000);
		ramphone.sendKeys("iphone11");
		Thread.sleep(2000);
		as.doubleClick(ramphone).perform();
		as.click();
		
		Robot r = new Robot();
		
		WebElement rob = driver.findElement(By.name("field-keywords"));
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		
		driver.findElement(By.linkText("YashMart Electroplated Case for iPhone 11, Back TPU Square Edges Case Back Cover for iPhone 11 (White)")).click();
		Thread.sleep(2000);
		
		WebElement scroll = driver.findElement(By.xpath("//h5[@class='a-size-base']"));
		
		Thread.sleep(3000);
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView();", scroll);
		Thread.sleep(2000);
		//WebElement frame = driver.findElement(By.id("submit.add-to-cart-announce"));
		//driver.switchTo().frame(frame);
		Thread.sleep(2000);
		WebElement add = driver.findElement(By.xpath("//input[@title='Add to Shopping Cart']"));
		add.click();
		
	}

}
