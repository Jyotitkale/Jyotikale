import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	public static void main(String[] args) {
		
		/////-------21-thursday-----absent

		System.setProperty("webdriver.chrome.driver", "F:\\Automation Projects\\software\\chrome\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		
		// to fetch the all the columns from the table we well use the below code
		
		List<WebElement> columns = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		int size = columns.size();
		System.out.println("Total number of columns are "+size);
		
		for(int i = 0;i<size;i++)
		{
			String columnName = columns.get(i).getText();
			System.out.println(columnName);
			if(columnName.equalsIgnoreCase("Company"))
			{
				System.out.println("We have column name as per requirement");
			}
		}
		
		// to fetch the all the rows from the table we well use the below code
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		int size1 = rows.size();
		System.out.println("Total number of rows are "+size1);
		for(int i = 0;i<size1;i++)
		{
			String rowsName = rows.get(i).getText();
			System.out.println(rowsName);
			
		}	
			
		//to fetch the cell data we will use the below code 
		
		WebElement cellData = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[6]/td[3]"));
		System.out.println(cellData.getText());
		
		
		
	}


		
	}


