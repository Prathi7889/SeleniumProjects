package com.selenium;

import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ContextClickAction;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.support.ui.Select;

public class AddingCart {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\THANVIKA\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("//select[@title='Search in']"));
		search.click();
		
		Robot r = new Robot();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		WebElement type = driver.findElement(By.id("twotabsearchtextbox"));
		type.sendKeys("Kurtas for Women");
		
		Thread.sleep(2000);
		WebElement click = driver.findElement(By.id("nav-search-submit-button"));
		click.click();
		
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
		
		Thread.sleep(2000);
		WebElement jansya = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[7]"));
		jansya.click();
		
		WebElement add = driver.findElement(By.id("add-to-cart-button"));
		add.click();
		
		
		/*Thread.sleep(1000);
		WebElement size = driver.findElement(By.xpath("(//select[@data-action='a-dropdown-select'])[1]"));
	    size.click();
	    
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);*/
	
	}

}
