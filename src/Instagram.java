import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws Throwable{
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\THANVIKA\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com/");
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.navigate().to("https://www.facebook.com/");
	driver.navigate().forward();
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
    String title =driver.getTitle();
    System.out.println(title);
    driver.quit();
	}

}
