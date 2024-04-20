import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommand {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.crome.driver", "C:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//1.t open the url  we use navigate.to method
		driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
		
		//to refresh the page
		driver.navigate().refresh();
		
		//3.to redirect on one step back
		WebElement flight = driver.findElement(By.linkText("Flights"));
		flight.click();
	
		Thread.sleep(3000);   // to hold some time page
		driver.navigate().back();
		
		//4.to redirect on one step forword
		driver.navigate().forward();
		
	
	
	
	}

}
