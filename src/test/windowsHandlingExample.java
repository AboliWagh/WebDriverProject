package test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowsHandlingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webDriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(6000,TimeUnit.MILLISECONDS);
	
		String ParentWindow = driver.getWindowHandle();
		System.out.println("Beforre Clicking " + ParentWindow);
		
		WebElement newWindow = driver.findElement(By.xpath("//button[@id='windowButton']"));
		newWindow.click();
		System.out.println("After Clicking New Button " );
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> itr = handles.iterator();
		while(itr.hasNext()) {
			
			String currentVal = itr.next();
			System.out.println(currentVal);
			
			if(!currentVal.equals(ParentWindow)) {
				
				driver.switchTo().window(currentVal);
			}
			
			

		}
		
		WebElement heading = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(heading.getText());
		
		driver.close();
		
		driver.switchTo().window(ParentWindow);
		
		WebElement newTab = driver.findElement(By.xpath("//button[@id='tabButton']"));
		newTab.click();
		driver.close();
		
	}

}
