package day19;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownloadAutoit {

	public static void main(String[] args) throws InterruptedException, IOException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://seleniumhq.org");
		driver.findElement(By.linkText("Download")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("3.0.1")).click();
		Thread.sleep(3000);
		java.lang.Runtime.getRuntime().exec("c:\\users\\sai\\desktop\\download.exe");
		

	}

}
