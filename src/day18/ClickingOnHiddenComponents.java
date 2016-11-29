package day18;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClickingOnHiddenComponents {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://yssofindia.org");
		
	}
	@Test
	public void hiddenElementTest() throws InterruptedException
	{
		
		
		WebElement emailUs=driver.findElement(By.xpath("//*[@id='topmenu']/div/ul/li[5]/ul/li[9]/ul/li[1]/a"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();",emailUs);
		
		
		
		
		js.executeScript("window.location='http://facebook.com'");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
