import java.sql.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocatorsExample {

	public static void main(String[] args) {
		
		
          System.setProperty("webdriver.crome.driver", "C:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://demo.guru99.com/test/facebook.html");
           
           
           //to find the element by using id locators firstly we need to create reference variable od web element interface and need to use syntax
           
           WebElement username= driver.findElement(By.id("email"));
           
           WebElement password=driver.findElement(By.id("pass"));
           
           WebElement login= driver.findElement(By.id("u_0_b"));
          
           username.sendKeys("jyotikale12@gmail.com");
           password.sendKeys("jyoti123");
           
          // click method is use to click on any button,radio button checkbox or link
           
           login.click();
          
          
	}

}
