package day12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Xpathcreation2 {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("https://news.google.co.in/");
		
	}
	@Test
	public void xpathTest()
	{
		//common xpath we created for all headline links
		List<WebElement> headlines=driver.findElements(By.xpath
				                                 ("//h2/a/span[@class='titletext']"));
		for(int i=0;i<headlines.size();i++)
		{
			System.out.println(headlines.get(i).getText());
		}
			
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	

}
