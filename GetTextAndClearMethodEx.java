import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAndClearMethodEx {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.crome.driver", "C:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/facebook.html");
        
        //clear method
        //to clear the populated text in text box we need use clear method
        WebElement username=driver.findElement(By.id("email"));
        username.sendKeys("jyoti");
        
        username.clear();
        
        WebElement text= driver.findElement(By.tagName("h1"));
        
        
        //to fetch value of particular elements we are use gettext method
        String value= text.getText();
        System.out.println(value);
        

	}

}
