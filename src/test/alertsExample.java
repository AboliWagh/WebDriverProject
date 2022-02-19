package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webDriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(6000,TimeUnit.MILLISECONDS);
		//accept 
		WebElement firstclick = driver.findElement(By.xpath("//button[@id='alertButton']"));
		firstclick.click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
		alert.accept();
		
		// Click on cancel
		WebElement thirdclick = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		firstclick.click();
		
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
		alert.dismiss();
		
		//sendkeys
		WebElement prompt = driver.findElement(By.xpath("//button[@id='promtButton']"));
		prompt.click();
		
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		
		alert2.sendKeys("Life");
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		alert2.accept();
		
		
		
	}

}
