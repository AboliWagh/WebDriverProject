package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTableExample {

	private static Object WebElement;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webDriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(6000,TimeUnit.MILLISECONDS);
		
		List<WebElement> tbRows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println("Total Rows are " + tbRows.size()  );
		
		List<WebElement> tbColumns = driver.findElements(By.xpath("//table[@id='customers']//th"));
		System.out.println("Total Columns are " + tbColumns.size() );
		
		List<WebElement> tbData = driver.findElements(By.xpath("//table[@id='customers']//tr[4]/td"));
		for(WebElement elm : tbData) {
		System.out.println(elm.getText());
		}
	//int column = 1 ;
	//String Xpath = "//table[@id='customers']//td[" + column "];
		
		List<WebElement> coumndata = driver.findElements(By.xpath("//td[text()='Island Trading']/parent::tr/td"));
		
		for (WebElement elm1 :coumndata )
		System.out.println(elm1.getText());
			
			
	}
	
}
		//List<WebElement> columndata = driver.findElements(By.xpath("//table[@id='customers']//tr/td[1]"));
		
	


