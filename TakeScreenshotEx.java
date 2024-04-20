import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenshotEx {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.crome.driver", "C:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/index.php");
	    driver.manage().window().maximize();
	    
	    //firstly we are creating reference of Takescreenshot interface
	    TakesScreenshot ts =(TakesScreenshot) driver;
	    
	    //caliing getscreenshot method to create image
	    File srcFile = ts.getScreenshotAs(OutputType.FILE);
	    
	    //Move the file into new destination folder
	    File destFile = new File("C:\\ImagesAuto\\error.png");
	    
	    //we will copy the ss into destination folder
	    Files.copy(srcFile,destFile);
	    
	    
	    
	}

}
