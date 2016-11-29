package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LiksTesting4 {

		public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://bing.com");
		WebElement header=driver.findElement(By.id("sc_hdu"));
		List<WebElement> links=header.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
		}
		driver.close();

	}

}








