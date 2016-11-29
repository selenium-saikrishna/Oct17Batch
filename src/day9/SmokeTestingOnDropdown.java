package day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SmokeTestingOnDropdown {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.findElement(By.linkText("REGISTER")).click();
		WebElement drop=driver.findElement(By.name("country"));
		List<WebElement> dropdown=drop.findElements(By.tagName("option"));
		int i=myRandomNo(dropdown.size()-1);
		dropdown.get(i).click();
		if(dropdown.get(i).isSelected())
			System.out.println(dropdown.get(i).getText()+" is active");
		else
			System.out.println(dropdown.get(i).getText()+" is inactive");
		driver.close();
		

	}
	
	public static int myRandomNo(int a)
	{
		double d=Math.random()*a;
		int i=(int)d;
		return i;
	}
}
