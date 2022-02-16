package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webDriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webDriver.gecko.driver","geckodriver.exe");
		
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.simplilearn.com/");
	
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(6000,TimeUnit.MILLISECONDS);
		
		//WebDriverWait wait = new WebDriverWait(driver,50);
		//wait.until(ExpectedConditions.elementToBeClickable(LoginLink));
	
		
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		
		LoginLink.click();
		
		WebElement UserName = driver.findElement(By.name("user_login"));
		WebElement Password = driver.findElement(By.id("password"));
		WebElement LoginButton = driver.findElement(By.name("btn_login"));
		WebElement RememberMe = driver.findElement(By.className("rememberMe"));
		
		UserName.sendKeys("abc@qwe.com");
		Password.sendKeys("Xyzabcd@1234");
		RememberMe.click();
		LoginButton.click();
		
		WebElement ErrorMsg = driver.findElement(By.id("msg_box"));
		String ActualMsg = ErrorMsg.getText();
		String ExpeMsg = "The email or password you have entered is invalid.";
		
		if (ActualMsg.equals(ExpeMsg)) {
			System.out.println("TC Passed");
	
		}
		else {
			System.out.println("TC Failed");
		}
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Links are  " + links.size());
		
		for(WebElement elm : links) {
		
		System.out.println(elm.getAttribute("href"));
		}
		
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		driver.close();
		
		

	}

}
