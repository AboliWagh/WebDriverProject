package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webDriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(6000,TimeUnit.MILLISECONDS);
		
		WebElement createacc = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
		createacc.click();
		WebElement Name = driver.findElement(By.cssSelector("input[name='firstname']"));
		WebElement surname = driver.findElement(By.xpath("//input[@name='lastname']"));
		WebElement mobile = driver.findElement(By.xpath("//*[contains(@aria-label,'Mobile number or email address')]"));
		WebElement password = driver.findElement(By.cssSelector("input#password_step_input"));
		WebElement signup = driver.findElement(By.xpath("//button[@name='websubmit']"));
		
		Name.sendKeys("ABC");
		surname.sendKeys("XYZ");
		mobile.sendKeys("1234567898");
		password.sendKeys("Xyz@12345");
		
		String strGender = "Male";
        
        //input[@value='1']
        //input[@value='2']
        //input[@value='-1']
        
        //label[text()='Male']/following-sibling::input
        //label[text()='Female']/following-sibling::input
        //label[text()='Custom']/following-sibling::input
        
        String genXpath = "//label[text()='" + strGender + "']/following-sibling::input";
        
        WebElement gen = driver.findElement(By.xpath(genXpath));
        gen.click();
		//WebElement gen = driver.findElement(By.xpath("//input[@value='1']"));
		//gen.click();
        
     /* WebElement birthdate = driver.findElement(By.xpath("//select[@name='birthday_day']//following-sibling::option[15]"));
        birthdate.click();
        WebElement birthmonth = driver.findElement(By.xpath("//select[@name='birthday_month']//following-sibling::option[3]"));
        birthmonth.click();
        WebElement birthyear = driver.findElement(By.xpath("//select[@name='birthday_year']//following-sibling::option[22]"));
        birthyear.click();*/
        
        List<WebElement> Months = driver.findElements(By.xpath("//select[@title='Month']/option"));
        
        for(WebElement elm : Months) {
            
            //System.out.println(elm.getText());
        }
        
        List<WebElement> Date = driver.findElements(By.xpath("//select[@name='birthday_day']/option"));
        
        for(WebElement elm : Date) {
            
           // System.out.println(elm.getText());
        		
             
        }
        List<WebElement> Year = driver.findElements(By.xpath("//select[@aria-label='Year']/option"));
        
        for(WebElement elm : Year) {
            
           // System.out.println(elm.getText());
        }
        
        WebElement Currmonth = driver.findElement(By.xpath("//select[@name='birthday_month']/option[@selected='1']"));
        System.out.println("Current Month **** " + Currmonth.getText());
        
        WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
        
        Select ddDay = new Select(Day);
        ddDay.selectByVisibleText("25");
        

		
		WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select ddMonth = new Select(Month);
		ddMonth.selectByVisibleText("Jul");
		
		WebElement birthYear = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select ddYear = new Select(birthYear);
		ddYear.selectByVisibleText("1990");

        
      driver.manage().timeouts().implicitlyWait(7000,TimeUnit.MILLISECONDS);
        
        signup.click();
        driver.manage().timeouts().implicitlyWait(7000,TimeUnit.MILLISECONDS);
        driver.close();
	}

}
