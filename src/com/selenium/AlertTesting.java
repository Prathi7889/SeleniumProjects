package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTesting {
        
        public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\THANVIKA\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get("http://demo.automationtesting.in/Alerts.html");
         driver.manage().window().maximize();
        
         WebElement alert = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
         alert.click();
         
         WebElement alert1 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
       alert1.click();
         driver.switchTo().alert().accept();
         
         WebElement alert2 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
         alert2.click();
	
         WebElement alert3 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
         alert3.click();
         driver.switchTo().alert().dismiss();
         
      
         WebElement text = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[3]"));
         text.click();
         
         WebElement text2 =driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
         text2.click();
         driver.switchTo().alert().sendKeys("Welcome");
         driver.switchTo().alert().accept();         
}
}
