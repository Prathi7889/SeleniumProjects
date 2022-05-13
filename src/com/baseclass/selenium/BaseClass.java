package com.baseclass.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class BaseClass {
	
    public static WebDriver driver;//class variable
    
    
  //Method 1 (browser launch) 
	public static WebDriver browserLaunch(String browsername) {
		
		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\THANVIKA\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
			} 
			
			else if (browsername.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("util.dir")+("\\driver\\geckodriver.exe"));
				driver = new FirefoxDriver();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;	
		
	}
	
	//Method 2 (close)
	public static void close() {
		try {
			driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Method 3  (quit)
	 
	public static void quit() {
		try {
			driver.quit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	//Method 4 (navigate to)
	
	public static void navigateTo(String url) {
		driver.navigate().to(url);
			}
			
			
	//Method 5 (back)
			
	public static void back() {
		driver.navigate().back();
	}
	
	//Method 6 (forward)
	
	public static void forward() {
		driver.navigate().forward();
	}
	
	//Method 7 (refresh)
	
	public static void refresh() {
		driver.navigate().refresh();
	}
	
	
	//Method 8 (get)
	public static void get(String value) {
		try {
			driver.get(value);
		} catch (Exception e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	//Method 10 (action)
	
	public static void action(WebElement element) {
		Actions ac = new Actions (driver);
		ac.doubleClick().build().perform();
		ac.contextClick(element).build().perform();

	}
	
	//Method 11 (frames)
	
	public static void frames(WebElement elements) {
		driver.switchTo().frame(elements);
	}
	
	//Method 12 (robot)
	
	public static void robot(WebElement element, String value) throws AWTException {
		Actions ac = new Actions(driver);
		ac.contextClick(element).build().perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	//Method 13 (Window Handles)
	
	public static void windowHandles(WebElement element) {
		String window1 = driver.getWindowHandle();
		element.click();
		Set<String> window2 = driver.getWindowHandles();
		String y = null;
		for (String d : window2) {
			if (!d.equals(window1)) {
				y = d;
			}
		}
		driver.switchTo().window(y);
	}
		
		
	//Method 14 (Drop Down)
	public static void dropDown(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}	

   
	
	//Method 20 (Get title)
	
	public static void getTitle() {
		driver.getTitle();
			}
	
	//Method 21 (Get Current URL)
	public static void getCurrentUrl() {
		driver.getCurrentUrl();
	}
	
	//Method 22 (Get text)
	public static void getText(WebElement element) {
		System.out.println(element.getText());
	}
	
	
	//Method 23 (Get Attribute)
	public static void getAttribute(WebElement element) {
		System.out.println(element.getAttribute(null));
	}
	
	//Method 25  (Screenshot)
	
	public static void screenShot() throws Exception {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File desFile = new File("C:\\Users\\THANVIKA\\eclipse-workspace\\Selenium\\Screenshot\\test.png");
		Files.copy(srcFile, desFile);
	}
	
	//Method 26 (Scroll Up and Down)
	
	public static void scroll(WebElement elements) {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView();", elements);
		
	}
	
	//Method (Scroll by Pixel)
	
	public void pixel() {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,)");
	}
	//Method 27 (sendkeys)
	
	public static void sendKeys(WebElement element, String value) {
		element.sendKeys(value);
		
	}
	
	
	//Method 31 (click)
	
	public static void click(WebElement element) {
		Actions ac =  new Actions(driver);
		ac.click(element).build().perform();
		
	}
	
	//Method (Radio Button)
	public static void radiobutton(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Method (Alerts)

		public static void Alertsss(WebElement element, String var) {
			element.click();
			Alert alert = driver.switchTo().alert();
			if (var == "accept") {
				alert.accept();
				driver.switchTo().defaultContent();
			} else {
				alert.dismiss();
				driver.switchTo().defaultContent();

			}

		}
		
		// Method (explicit wait)

		public static void waitforvisibilityofelment(WebElement element) {

			try {
				WebDriverWait wb = new WebDriverWait(driver, 30);
				wb.until(ExpectedConditions.visibilityOf(element));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}



	
	
	
	
	
	
	
	
	
	
	
	

}
