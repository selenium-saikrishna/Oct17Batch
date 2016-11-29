package day20.testsuite;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Logout  extends BaseClass{

	@Test
	public void logoutTest()
	{
		driver.findElement(By.linkText("Welcome Admin")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
}
















