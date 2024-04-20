import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.jdi.Value;

public class CheckBoxExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.crome.driver", "C:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        
        //to click on single checkbox we need to find out the element and need to click it
//        WebElement checkbox1 = driver.findElement(By.id("checkbox1"));
//        //checkbox1.click();
//        
//        // to check checkbox is already selected or not  we need to use below logic
//        
//        if(checkbox1.isSelected())
//        {
//        	System.out.println("checkbox1 is selected by default");
//        }
//        else
//        {
//        	checkbox1.click();
//        }
        
        // to select the multiple checkbox in single code we will use below method
        List<WebElement> checkboxes =  driver.findElements(By.xpath("//*[@type='checkbox']"));
        int size =checkboxes.size();
        System.out.println(size);
        
        //if you have multiple elements and you want to perform operation on specific index you 
       // checkboxes.get(0).click();
        
//        for (int i=0;i<size;i++)
//        {
//        	checkboxes.get(i).click();
//        }
        
        
        for(int i=0;i<size;i++)
        {
        //get attribute method is used to fetch the value of elemnetnts at per given keys
	   String value= checkboxes.get(i).getAttribute("value");
        if(value.equalsIgnoreCase("hockey"))
        {
        	checkboxes.get(i).click();
        }
        }
	
	
	}

}
