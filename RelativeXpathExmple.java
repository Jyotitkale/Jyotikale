import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathExmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.crome.driver", "C:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/facebook.html");
        
        //1.by using simple xpath method bybusing tag and attributes
        
//        WebElement un = driver.findElement(By.xpath("//input[@id='email']"));
//        WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
//        WebElement login = driver.findElement(By.xpath("//input[@value='Log In']"));
//      //
        //2.
//        WebElement un = driver.findElement(By.xpath("//input[@id='email' and @class='inputtext']"));
//        WebElement pass = driver.findElement(By.xpath("//input[@id='pass' and @tabindex='2']"));
//        WebElement login = driver.findElement(By.xpath("//input[@value=\"Log In\" and @type=\"submit\"]")); 
//        
        //3.
//         WebElement un = driver.findElement(By.xpath("//input[@id='email' or @class='inputtex']"));   
//         WebElement pass = driver.findElement(By.xpath("//input[@id='pass' or @tabindex='3']"));
//         WebElement login = driver.findElement(By.xpath("//input[@value=\"Log In\" or @type=\"click\"]")); 
//        
         //4.using contains method
//         WebElement un = driver.findElement(By.xpath("//input[contains(@id,'ma')]"));   
//         WebElement pass = driver.findElement(By.xpath("//input[contains(@name,'ss')]"));
//         WebElement login = driver.findElement(By.xpath("//input[contains(@type,'mi')]")); 
//        
        
        // 5.using starts-with method
        WebElement un = driver.findElement(By.xpath("//input[starts-with(@name,'em')]"));   
        WebElement pass = driver.findElement(By.xpath("//input[starts-with(@type,'pa')]"));
        WebElement login = driver.findElement(By.xpath("//input[starts-with(@value,'Lo')]")); 
     
      
        un.sendKeys("jyoti");
        pass.sendKeys("jyoti123");
        login.click();
        
//        //6.by text  method
//        WebElement link = driver.findElement(By.xpath("//*[text()='Agile Project']"));   
//        link.click();
//
        
        
	}

}
