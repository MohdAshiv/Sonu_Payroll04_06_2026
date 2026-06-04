package frequency;

import pages.BasePage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ExcelData;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/800ad050-babf-4410-814d-43b1335d431e
@TestModellerModule(guid = "800ad050-babf-4410-814d-43b1335d431e")
public class ChngfrqMtoW extends BasePage
{
	static String payrollprocesseddate="";
	
	static String sendpayrooldate="";
    
	public ChngfrqMtoW (WebDriver driver)
	{
		super(driver);
	}
	
	public void getpayrollprocesseddate()
	{
		
		payrollprocesseddate=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPayrollDate']//*[@selected='selected']")).getText();
		System.out.println("payrollprocesseddate="+payrollprocesseddate);
		
		
	}
	
	public String senddate() 
	{
		sendpayrooldate=payrollprocesseddate;
	//	System.out.println("sendpayrooldate="+sendpayrooldate);
		return sendpayrooldate;
		
	}
	
}
