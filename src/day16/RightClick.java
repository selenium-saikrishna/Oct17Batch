package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RightClick {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://google.com");
		
	}
	@Test
	public void rightClickTest() throws InterruptedException
	{
		Actions action=new Actions(driver);
		Thread.sleep(7000);
		WebElement gmail=driver.findElement(By.linkText("Gmail"));
		action.contextClick(gmail).sendKeys("L").build().perform();
		
		
		
		
		
		
		
		
		
		
		
	}

}
