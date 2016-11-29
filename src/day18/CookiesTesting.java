package day18;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CookiesTesting {

	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://mirror.co.uk");
		
	}
	@Test
	public void cookiesTest()
	{
		//capture all cookies 
		Set<Cookie> myCookies=driver.manage().getCookies();
		System.out.println(myCookies.size());
		Iterator<Cookie> it=myCookies.iterator();
		while(it.hasNext())
		{
			Cookie c=it.next();
			System.out.println(c.getName()+"----"+c.getDomain());
		}
		//delete all cookies
		driver.manage().deleteAllCookies();
	}
}







