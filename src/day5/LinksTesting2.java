package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTesting2 {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://bing.com");
		
		String expurl="http://www.bing.com/videos/trending";
		
		
		String acturl=driver.findElement(By.linkText("Videos")).getAttribute("href");
		if(expurl.equals(acturl))
		{
			System.out.println("Videos link is working correctly");
		}
		else
		{
			System.out.println("Videos link is not working correctly");
		}
		driver.close();
		
		

	}

}
