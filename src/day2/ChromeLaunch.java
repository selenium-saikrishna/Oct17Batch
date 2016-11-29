package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class ChromeLaunch {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://yahoomail.com");
		driver.findElement(By.name("username")).sendKeys("saikrishna_rhce");
		driver.findElement(By.id("login-signin")).click();
		Sleeper.sleepTightInSeconds(3);
		driver.findElement(By.id("login-passwd")).sendKeys("asdfg");
		driver.findElement(By.id("login-signin")).click();

	}

}












