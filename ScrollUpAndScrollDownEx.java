import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpAndScrollDownEx {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.crome.driver", "C:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://moneyboats.com/");
	    driver.manage().window().maximize();
	    
	    //to scrolldown we need to give positive value
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    Thread.sleep(1000);
	    js.executeScript("window.scrollBy(0,500)");
	    
	    //scrollup we need to give negative value
	    js.executeScript("window.scrollBy(0,-500)");
	}

}
