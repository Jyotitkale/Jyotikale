import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedIsDisplayIsEnable {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.crome.driver", "C:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/facebook.html");
        
        WebElement username = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("pass"));
        
        //username
        boolean result1 = username.isDisplayed();
        boolean result2 = username.isEnabled();  
        
        System.out.println(result1);
        System.out.println(result2);
        
        //password
        boolean result3 = password.isDisplayed();
        boolean result4 = password.isEnabled();  
        
        System.out.println(result3);
        System.out.println(result4);
        
       
        // Is Dispaly method is used to validate element is present or not 
        //Is Eanble method is used to validate  element anable or display
        if(username.isDisplayed() && username.isEnabled())
        {
        	username.sendKeys("jyoti");
        }
        else
        {
        	System.out.println("username is not displayed");
        }
        if(password.isEnabled() && password.isEnabled())
        {
        	password.sendKeys("jyo123");
        }
        else
        {
        	System.out.println("password is not displayed");
        }
        
        WebElement  checkbox = driver.findElement(By.id("persist_box"));
        
        //Isselected method is used to validate checkbox or radio button is already selected or not
        boolean result=checkbox.isSelected();
        System.out.println(result);
        
        
        
	}

}
