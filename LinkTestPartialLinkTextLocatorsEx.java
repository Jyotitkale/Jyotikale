import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTestPartialLinkTextLocatorsEx {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.crome.driver", "C:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/facebook.html");
        
        //WebElement forgot = driver.findElement(By.linkText("Forgot your password?"));
       // forgot.click();
        
        WebElement forgot = driver.findElement(By.partialLinkText("pass"));
		forgot.click();

	}

}
