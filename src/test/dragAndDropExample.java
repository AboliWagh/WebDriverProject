package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDropExample {
	
	public static void main(String[] args) {
		
System.setProperty("webDriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(6000,TimeUnit.MILLISECONDS);
	
		WebElement From = driver.findElement(By.xpath("//li[@id='credit2']/a"));
		WebElement To = driver.findElement(By.xpath("//ol[@id='bank']/li"));
	
		Actions act = new Actions (driver);
		
		act.dragAndDrop(From, To).build().perform();
		
		WebElement From1 = driver.findElement(By.xpath("//li[@class='block13 ui-draggable']/a"));
		WebElement To1 = driver.findElement(By.xpath("//ol[@id='amt7']/li"));
		act.dragAndDrop(From1, To1).build().perform();
		
	}
}
