import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExmple {

	public static void main(String[] args) {

		System.setProperty("webdriver.crome.driver", "C:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://adactinhotelapp.com/");
        
        //to maximize the window we can use below code
        driver.manage().window().maximize();
        
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
        
        WebElement username = driver.findElement(By.id("username"));
        wait.until(ExpectedConditions.visibilityOf(username));
        username.sendKeys("jyoti@123");
        
        WebElement password = driver.findElement(By.id("password"));
        wait.until(ExpectedConditions.visibilityOf(password));
        password.sendKeys("jyoti12");
        
        WebElement login = driver.findElement(By.id("login"));
        wait.until(ExpectedConditions.visibilityOf(login));
        login.click();
	}

}
