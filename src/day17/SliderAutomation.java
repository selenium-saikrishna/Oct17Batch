package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SliderAutomation {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.myntra.com/men-tshirts?src=tNav&f=price%3A99%2C7999");
		driver.manage().window().maximize();
		
	}
	@Test
	public void sliderTest()
	{
		Actions action=new Actions(driver);
		WebElement slider=driver.findElement(By.xpath("//*[@id='sidebar']/div/div[8]/div[2]/div[2]/div[3]"));
		int x=slider.getLocation().x;
		int y=slider.getLocation().y;
		System.out.println(x+"----"+y);
		action.dragAndDropBy(slider,x, 500).build().perform();
		
		
		//action.doubleClick(WebElement).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
