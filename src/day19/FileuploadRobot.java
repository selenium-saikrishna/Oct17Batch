package day19;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileuploadRobot {

	public static void main(String[] args) throws InterruptedException, AWTException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://imgur.com");
		driver.findElement(By.className("upload-btn-text")).click();
		driver.findElement(By.className("browse-btn")).click();
		Thread.sleep(7000);
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_I);
		rb.keyRelease(KeyEvent.VK_I);
		rb.keyPress(KeyEvent.VK_M);
		rb.keyRelease(KeyEvent.VK_M);
		rb.keyPress(KeyEvent.VK_A);
		rb.keyRelease(KeyEvent.VK_A);
		rb.keyPress(KeyEvent.VK_G);
		rb.keyRelease(KeyEvent.VK_G);
		rb.keyPress(KeyEvent.VK_E);
		rb.keyRelease(KeyEvent.VK_E);
		rb.keyPress(KeyEvent.VK_PERIOD);
		rb.keyRelease(KeyEvent.VK_PERIOD);
		rb.keyPress(KeyEvent.VK_G);
		rb.keyRelease(KeyEvent.VK_G);
		rb.keyPress(KeyEvent.VK_I);
		rb.keyRelease(KeyEvent.VK_I);
		rb.keyPress(KeyEvent.VK_F);
		rb.keyRelease(KeyEvent.VK_F);
		Thread.sleep(3000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		

	}

}
