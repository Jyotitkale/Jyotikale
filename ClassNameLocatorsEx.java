import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocatorsEx {

	public static void main(String[] args) {

		System.setProperty("webdriver.crome.driver", "C:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/facebook.html");
        
        WebElement username=driver.findElement(By.className("inputtext"));
        WebElement password=driver.findElement(By.className("inputtext"));
        
        username.sendKeys("jyoti");
        password.sendKeys("jyoti12");
         

	}

}
