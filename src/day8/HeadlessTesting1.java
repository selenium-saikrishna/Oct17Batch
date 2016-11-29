package day8;


import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import com.gargoylesoftware.htmlunit.BrowserVersion;

public class HeadlessTesting1 {

	
	public static void main(String[] args) {
		HtmlUnitDriver driver=new HtmlUnitDriver(BrowserVersion.INTERNET_EXPLORER_11);
		driver.get("http://gmail.com");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}

















