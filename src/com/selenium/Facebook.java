package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\THANVIKA\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();


    WebElement email = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
    email.sendKeys("prathi@gmail.com");
    String attribute = email.getAttribute("value");
    System.out.println(attribute);
    String attribute2 = email.getAttribute("class");
    System.out.println(attribute2);
    
    
    WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
    password.sendKeys("test");
    WebElement click = driver.findElement(By.xpath("//button[@type='submit']"));
    click.click();
    
    TakesScreenshot ts = (TakesScreenshot) driver;
    File srcFile = ts.getScreenshotAs(OutputType.FILE);
    File desFile = new File("C:\\Users\\THANVIKA\\eclipse-workspace\\Selenium\\Screenshot\\test.png");
    FileUtils.copyFile(srcFile, desFile);
}


}