import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleiframeEx {

	public static void main(String[] args) {
		
		/////////////////////absent//////////monday
		
		System.setProperty("webdriver.crome.driver", "C:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		//to maximize the window we can use below code
		driver.manage().window().maximize();
		
		//to mininmize the window we can use below code
		driver.manage().window().minimize();
		
		List<WebElement> noOfFrame = driver.findElements(By.tagName("iframe"));
		int size = noOfFrame.size();
		System.out.println("No of iframes in HTML page is "+size);
		
		//1. switch by index
//		driver.switchTo().frame(0);
		
		//2. switch by id
//		driver.switchTo().frame("singleframe");
		
		//3. switch by name
		driver.switchTo().frame("SingleFrame");
		
		WebElement text = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		text.sendKeys("Jyoti");
	}

}
