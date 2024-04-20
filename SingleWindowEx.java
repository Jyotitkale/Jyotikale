import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleWindowEx {

	
	//////////************absent***************19-tuesday
	
	public static void main(String[] args) {

		System.setProperty("webdriver.crome.driver", "C:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		//to maximize the window we can use below code
		driver.manage().window().maximize();
		
		//to mininmize the window we can use below code
         driver.manage().window().maximize();
		
		//getwindowhanlde method will store the unique session id of opened window
		String paretnSessionId = driver.getWindowHandle();
		System.out.println(paretnSessionId);
		
		WebElement button = driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button"));
		button.click();
		
		//it will store the all the opened window after clicking on button
	    Set<String> childwindow = driver.getWindowHandles();
		Iterator<String> i = childwindow.iterator();
		while(i.hasNext())
		{
		  String childwiwindow1 = i.next();
		  System.out.println(childwiwindow1);
		}			
	}

}
