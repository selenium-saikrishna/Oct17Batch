package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class TestCase2 {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://yahoo.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("UHSearchBox")).sendKeys("Selenium");
		driver.findElement(By.id("UHSearchWeb")).click();
		System.out.println("########################################");
		Sleeper.sleepTightInSeconds(4);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}




