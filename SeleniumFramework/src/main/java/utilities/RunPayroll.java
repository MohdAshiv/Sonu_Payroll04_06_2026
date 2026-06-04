package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

public class RunPayroll {

	public static void runpayroll (WebDriver m_Driver) throws Exception
	{
		
		try {
			m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll']")).click();
			m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSubmitOnline']")).click();
			Thread.sleep(1000);
		
		}
		catch (Exception e) 
		{
			System.out.println("elem not found");
		}

	}

}

