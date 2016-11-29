package day23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginUsingProperties {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
	}
	@Test
	public void loginTest() throws IOException
	{
		FileInputStream file=new FileInputStream(".\\OrangeHRM.properties");
		Properties pr=new Properties();
		pr.load(file);
		driver.findElement(By.id(pr.getProperty("username"))).sendKeys("Admin");
		driver.findElement(By.xpath(pr.getProperty("password"))).sendKeys("admin");
		driver.findElement(By.cssSelector(pr.getProperty("login"))).click();
		
		
		
	}

}


