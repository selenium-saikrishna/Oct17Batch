package day23;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddEmployee {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
	}
	@Test
	public void linkTest() throws IOException
	{
		
		
		FileInputStream file=new FileInputStream
				                 (".\\src\\com\\projectname\\excelfiles\\EmployeeList.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Row r=null;
		int rowCount=ws.getLastRowNum();
		for(int i=1;i<=rowCount;i++)
		{
			driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/b")).click();
			driver.findElement(By.id("menu_pim_addEmployee")).click();
			r=ws.getRow(i);
			driver.findElement(By.id("firstName")).sendKeys(r.getCell(0).getStringCellValue());
			driver.findElement(By.id("middleName")).sendKeys(r.getCell(1).getStringCellValue());
			driver.findElement(By.id("lastName")).sendKeys(r.getCell(2).getStringCellValue());
			driver.findElement(By.id("employeeId")).clear();
			driver.findElement(By.id("employeeId")).sendKeys(r.getCell(3).getStringCellValue());
			if(r.getCell(4).getStringCellValue().equals("Y"))
			{
				if(!driver.findElement(By.id("chkLogin")).isSelected())
					driver.findElement(By.id("chkLogin")).click();
				driver.findElement(By.id("user_name")).sendKeys(r.getCell(5).getStringCellValue());
				driver.findElement(By.id("user_password")).sendKeys(r.getCell(6).getStringCellValue());
				driver.findElement(By.id("re_password")).sendKeys(r.getCell(7).getStringCellValue());
				driver.findElement(By.id("status")).sendKeys(r.getCell(8).getStringCellValue());
			}
			else
			{
				if(driver.findElement(By.id("chkLogin")).isSelected())
					driver.findElement(By.id("chkLogin")).click();
			}
			driver.findElement(By.id("btnSave")).click();
		}
			
			
	}


			
			
			
			
			
			
			
			
			
		

}
