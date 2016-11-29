package day18;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertHandling {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
	}
	@Test
	public void alertTest() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('Hello Selenium');");
		Thread.sleep(4000);
		alertHandling();
	}
	public void alertHandling()
	{
		try
		{
			Alert myAlert=driver.switchTo().alert();
			myAlert.accept();
		}
		catch(Exception e)
		{
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	

}
