import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.ToStringMethod;

public class JavaScriptExcutorEx {

	public static void main(String[] args) {

		System.setProperty("webdriver.crome.driver", "C:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/index.php");
	    driver.manage().window().maximize();
	    
	       //1.firstly we need to create reference variable of javascript excutor interface
	       JavascriptExecutor js = (JavascriptExecutor)driver;
	       
	       //2.in  javacript excutor interface we have 2method excutescript and excuteAsyncsript
	       
	       driver.findElement(By.name("uid")).sendKeys("jyoti");
	       driver.findElement(By.name("password")).sendKeys("jyoti123");
	       
	       WebElement login = driver.findElement(By.name("btnLogin"));
	       
//	       //we will use below javascript to click on login button
//	       js.executeScript("arguments[0].click();",login);
//	       
//	       //we will use below javascript to handle the alert
//	       js.executeScript("alert('User or Password is not valid');");
//	       
	       //we will use below script to get all the details of webpage  like title ,
	       
	       String domainName = js.executeScript("return document.domain;").toString();
	       System.out.println(domainName);
	       
	       String title = js.executeScript("return document.title;").toString();
	       System.out.println(title);
	       
	       String url = js.executeScript("return  document.URL;").toString();
	       System.out.println(url);
	       
	       //we will use below script to launch the new url
	       js.executeScript("window.loction='https://demo.guru99.com/v4/index.php'");
	       
	}

}
