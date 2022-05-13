import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\THANVIKA\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement course = driver.findElement(By.xpath("//a[text()='Register']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		
		
		
		WebElement skill = driver.findElement(By.id("Skills"));
		
		Select sc = new Select(skill);
		sc.selectByValue("Android");
		
		
		//WebElement dob = driver.findElement(By.xpath("//label[text()='Date Of Birth']"));
		
		
		WebElement year = driver.findElement(By.id("yearbox"));
		Select sc1 = new Select(year);
		sc1.selectByVisibleText("1921");
		
		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select sc2 = new Select(month);
		sc2.selectByIndex(3);
		
		
		
		
	}
}
