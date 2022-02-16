package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webDriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(6000,TimeUnit.MILLISECONDS);
		
		WebElement UserName = driver.findElement(By.xpath("//input[@name='email']"));
		WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		//WebElement RememberMe = driver.findElement(By.className("rememberMe"));
		
		UserName.sendKeys("abc@qwe.com");
		Password.sendKeys("Xyzabcd@1234");

		login.click();
		
		//driver.manage().timeouts().implicitlyWait(7000,TimeUnit.MILLISECONDS);
		
		//driver.close();
	}

}
