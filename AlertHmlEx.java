import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHmlEx {

	public static void main(String[] args) throws InterruptedException {

		////////////////////monday//////
		System.setProperty("webdriver.crome.driver", "C:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		//to maximize the window we can use below code
		driver.manage().window().maximize();
		
		//to mininmize the window we can use below code
		driver.manage().window().minimize();
		
//      	WebElement button = driver.findElement(By.xpath("//*[@id=\'OKTab\']/button"));
//    	button.click();
//		
//       //1.to get text from alert box we will  use getext method
//		String text = driver.switchTo().alert().getText();
//       	System.out.println(text);
//		
//		//2.to accept the alert we can use accept method
//		driver.switchTo().alert().accept();
//		
//		WebElement button = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
//		button.click();
//		
//		WebElement button1 = driver.findElement(By.xpath("//*[@id=\'CancelTab\']/button"));
//		button1.click();
//		
//		//3.to dismiss the alert  we can use dismiss method
//		driver.switchTo().alert().dismiss();
//		
		WebElement button = driver.findElement(By.xpath("//html/body//div[1]/div/div/div[1]/ul/li[2]/a"));
		button.click();
		
		WebElement button1 = driver.findElement(By.xpath("//*[@id=\"]/button"));
		button1.click();
		Thread.sleep(3000);
		
	   //4.to enter the text value in alert we can use sendkeys method
		driver.switchTo().alert().sendKeys("jyoti");
		driver.switchTo().alert().accept();
	
		
	}

}
