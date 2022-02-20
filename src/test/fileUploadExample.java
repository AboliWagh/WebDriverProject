package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUploadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webDriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/upload/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(6000,TimeUnit.MILLISECONDS);

		WebElement FileUpload = driver.findElement(By.xpath("//input[@name='uploadfile_0']"));
		
		FileUpload.sendKeys("C:\\Users\\aboli_xzqs16p\\OneDrive\\Documents");
		
		WebElement Tnc = driver.findElement(By.xpath("//input[@class='field_check']"));
		Tnc.click();
		WebElement submit = driver.findElement(By.xpath("//button[@id='submitbutton']"));
		submit.click();
		
		
	}

}
