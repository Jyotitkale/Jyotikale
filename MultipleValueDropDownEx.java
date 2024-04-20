import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleValueDropDownEx {

	public static void main(String[] args) {

		System.setProperty("webdriver.crome.driver", "C:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://output.jsbin.com/osebed/2");
        
        WebElement fruits = driver.findElement(By.id("fruits"));
        Select select = new Select(fruits);
        
        //to check if we can select multiple value from the dropdown we can use ismultiple method
        if(select.isMultiple())
        {
        	select.selectByIndex(0);
        	select.selectByVisibleText("Apple");
        	select.selectByValue("orange");
        }
        //to check if we can unselect multiple value from the dropdown we can use ismultiple method

//        select.deselectByIndex(0);
//        select.deselectByVisibleText("Apple");
//        select.deselectByValue("orange");
        select.deselectAll();	}

}
