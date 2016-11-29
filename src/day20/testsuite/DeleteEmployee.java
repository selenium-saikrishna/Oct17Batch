package day20.testsuite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DeleteEmployee  extends BaseClass{
	@Test
	public void deleteEmpTest()
	{
		//xpath of PIM
		driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/b")).click();
		driver.findElement(By.linkText("Employee List")).click();
		//id of the complete web table 
		WebElement table=driver.findElement(By.id("resultTable"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		for(int i=0;i<rows.size();i++)
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<cols.size();j++)
			{
				if(cols.get(j).getText().equals("12345"))
				{
					cols.get(j-1).click();
					break;
				}
			}
		}
		//id of 'Delete' button
		driver.findElement(By.id("btnDelete")).click();
		//id of 'OK' button
		driver.findElement(By.id("dialogDeleteBtn")).click();
	}
}

