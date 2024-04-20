import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodPractical {

	public static void main(String[] args) {
	
		
		//This method will help you to set browser path which we need to use  to run the automation script
		 System.setProperty("webdriver.crome.driver", "C:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
		
		//to create Chrome driver object we need to create webdriver interface reference varible and need to
		//create Chrome object
		 WebDriver driver=new ChromeDriver();
		
		//1.this method use for open url 
		 driver.get("https://www.amazon.in/");
		
		//3.to get title of current open close url we can get title method
	     String title=driver.getTitle();
	     System.out.println(title);
		
		//4.to get the currently opend url we can use get current url method
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//5.to get the source code of open url we can use method for page source
		String source=driver.getPageSource();
		System.out.println(source);
		
		//6.to close the current open url we need close method
		driver.close();
		
		//7.to get the current poen url we need quite
		driver.quit();
		
		//2.to close use for url
		driver.close();
		

	}

}
