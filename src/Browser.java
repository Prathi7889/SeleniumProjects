import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\THANVIKA\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();  
		driver.get("https://www.facebook.com/");
	}

}
