package day16;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reports {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ATUTestRecorderException 
	 */
	public static void main(String[] args) throws IOException, ATUTestRecorderException {
		ExtentReports reports=new ExtentReports("c:\\users\\sai\\desktop\\myReport.html",true);
		ExtentTest test=reports.startTest("My Sample Test");
		ATUTestRecorder recorder=new ATUTestRecorder("c:\\users\\sai\\desktop\\Recording\\","myRecording",false);
		recorder.start();
		FirefoxDriver driver=new FirefoxDriver();
		test.log(LogStatus.INFO,"Browser launched");
		driver.get("http://opensource.demo.orangehrmlive.com/");
		test.log(LogStatus.INFO,"navigated to url");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		test.log(LogStatus.INFO,"Entered the username");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		test.log(LogStatus.INFO,"entered the password");
		test.log(LogStatus.INFO,"Browser launched");
		test.log(LogStatus.INFO,"Clicked on login");
		driver.findElement(By.id("btnLogin")).click();
		recorder.stop();
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile,new File("c:\\users\\sai\\desktop\\newtours.png"));
		Sleeper.sleepTightInSeconds(5);
		test.addScreencast("c:\\users\\sai\\desktop\\Recording\\myRecording.mov");;
		//test.addScreenCapture("c:\\users\\sai\\desktop\\Recording\\myRecording.mov");
		test.addScreenCapture("c:\\users\\sai\\desktop\\newtours.png");
		reports.endTest(test);
		reports.flush();

	}

}
