package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropdownTesting1 {

	
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://ebay.in");
		driver.findElement(By.id("gh-cat")).sendKeys("Games, Consoles & Accessories");
	}

}
