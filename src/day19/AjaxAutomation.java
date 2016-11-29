package day19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AjaxAutomation {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://google.com");
		
	}
	@Test
	public void  ajaxTest() throws InterruptedException
	{
		driver.findElement(By.name("q")).sendKeys("trump");
		Thread.sleep(3000);
		WebElement block=driver.findElement(By.xpath("//*[@id='sbtc']/div[2]/div[2]/div[1]"));
		List<WebElement> ajax=block.findElements(By.xpath("//*[starts-with(@id,'sbse')]/div[2]"));
		System.out.println(ajax.size());
		for(int i=0;i<ajax.size();i++)
		{
			System.out.println(ajax.get(i).getText());
		}
	}

}
