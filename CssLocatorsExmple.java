import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocatorsExmple {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.crome.driver", "C:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/facebook.html");
        
//        //1.by using tag and class name(we have use dot for combine)
//        WebElement un=driver.findElement(By.cssSelector("input.inputtext"));
//        
//        //2.by using tag and id(we have use # for combine)
//        WebElement pass=driver.findElement(By.cssSelector("input#pass"));
//        
//        un.sendKeys("jyoti");
//        pass.sendKeys("jyo123");
        

        
//        //3.by using tag and attributes(by using "[]")
//        WebElement un=driver.findElement(By.cssSelector("input[type='text'][name='email']"));
//        
//        //4.by using tag,class and attributes
//        // for tag=input.inputtext and attributes=square brackets'[]'
//        
//        WebElement pass= driver.findElement(By.cssSelector("input.inputtext[type='password'][tabindex='2']"));
//        
//        un.sendKeys("jyoti");
//        un.sendKeys("jyo123");
//        
//        
//        //5.by using tag id and attributes 
//        WebElement login=driver.findElement(By.cssSelector("input#u_0_b[type='submit'][value='Log In']"));
//        
//        login.click();
        
        //--------[main imp- below 5 methods]----------
        
        //6.by using starts with - it will find the locators based on starting character
        WebElement un = driver.findElement(By.cssSelector("input[name^='ema']"));
        un.sendKeys("jyoti");
        
        //7.by using end with-it will find locators based on ending character
        WebElement pass= driver.findElement(By.cssSelector("input[type$='word']"));
        pass.sendKeys("jyoti123");
        
        //8.by using the contais-it will find the locators based on character which is preset or not
        WebElement login = driver.findElement(By.cssSelector("input#u_0_b[type*='bm']"));
        login.click();
        
        
        
	}

}
