import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TaskFacebook {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.crome.driver", "C:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        

       // by name
        WebElement username=driver.findElement(By.name("email"));
        WebElement password=driver.findElement(By.name("pass"));
        WebElement login=driver.findElement(By.name("login"));
        
      //  username.sendKeys("jyotikale1210@gmail.com");
     //   password.sendKeys("Jyoti@1212");
        
//        //by Id
//        WebElement username=driver.findElement(By.id("email"));
//        WebElement password=driver.findElement(By.id("pass"));
//        WebElement login=driver.findElement(By.name("login"));
//        
//        //by class
//        WebElement username=driver.findElement(By.className("inputtext"));
//        WebElement password=driver.findElement(By.className("inputtext"));
//        WebElement login=driver.findElement(By.name("_42ft"));
//        
//        //CSS Selector
//        
//        //1.tag and class
//        WebElement un=driver.findElement(By.cssSelector("input.inputtext"));
//        WebElement pass=driver.findElement(By.cssSelector("input.pass"));
//        WebElement login=driver.findElement(By.cssSelector("button[value='1']"));
//        
//        //2.tag and ID
//        WebElement un=driver.findElement(By.cssSelector("input#email"));
//        WebElement pass=driver.findElement(By.cssSelector("input#pass"));
//        WebElement login=driver.findElement(By.cssSelector("button[value='1']"));
//        
//        //3.by tag,attributes
//        WebElement un=driver.findElement(By.cssSelector("input[type='text']"));
//        WebElement pass=driver.findElement(By.cssSelector("input[type='password']"));
//        WebElement login=driver.findElement(By.cssSelector("button[value='1']"));
//        
//        //4.by tag,class,attributes
//        WebElement un=driver.findElement(By.cssSelector("input.inputtext[type='text']"));
//        WebElement pass=driver.findElement(By.cssSelector("input.inputtext[type='password']"));
//        WebElement login=driver.findElement(By.cssSelector("button._42ft[value='1']"));
//        
//        //5.tag,Id,attributes
//        WebElement un=driver.findElement(By.cssSelector("input#email[type='text']"));
//        WebElement pass=driver.findElement(By.cssSelector("input#pass[type='password']"));
//        WebElement login=driver.findElement(By.cssSelector("button[value='1']"));
        
   
//      username.sendKeys("Jyoti Kale Bhakade");
//      password.sendKeys("Jyoti@1212");
//      login.click();
//        
        
        
        
           
        
        
     
        
        
        
        

	}

}
