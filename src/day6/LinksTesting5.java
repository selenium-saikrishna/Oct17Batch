package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class LinksTesting5 {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://pvrcinemas.com");
		driver.manage().window().maximize();
		//xpath of the complete General section
		WebElement general=driver.findElement(By.xpath("html/body/div[7]/div[1]/div[2]"));
		List<WebElement> links=general.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
			links.get(i).click();
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			Sleeper.sleepTightInSeconds(5);
			general=driver.findElement(By.xpath("html/body/div[7]/div[1]/div[2]"));
			links=general.findElements(By.tagName("a"));
			
		}
		
	}
}






