import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.crome.driver", "C:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        
        WebElement radiobutton1= driver.findElement(By.xpath("//*[@value='Male']"));
        radiobutton1.click();
        
//        if(radiobutton1.isSelected())
//        {
//        	System.out.println("radion button is already selected");
//        	
//        }
//        else
//        {
//        	radiobutton1.click();
//        }
        
        List<WebElement> allradio = driver.findElements(By.xpath("//*[@type='radio']"));
        for(int i=0;i<allradio.size();i++)
        {
            //get attribute method is used to fetch the value of elemnetnts at per given keys

        	String value = allradio.get(i).getAttribute("value");
        	if(value.equalsIgnoreCase("male"))
        	{
        		allradio.get(i).click();
        	}
        }
	}

}
