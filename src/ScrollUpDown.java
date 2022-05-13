	
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	
	public class ScrollUpDown {

		public static void main(String[] args) throws Throwable  {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\THANVIKA\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://www.amazon.in");
	        driver.manage().window().maximize();
	        
	        WebElement scrollDown = driver.findElement(By.xpath("(//a[@class='nav_a'])[40]"));
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView();", scrollDown);
	        Thread.sleep(2000);
	        
	        WebElement scrollUp = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	        js.executeScript("arguments[0].scrollIntoView();", scrollUp);
	        js.executeScript("window.scrollBy(0,1200)");
		}

	}
	

