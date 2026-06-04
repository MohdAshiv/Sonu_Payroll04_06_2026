package frequency;

import pages.BasePage;

import static org.testng.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ExcelData;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/88f20342-ca67-4d75-91ef-9df47489ed68
@TestModellerModule(guid = "88f20342-ca67-4d75-91ef-9df47489ed68")
public class SearchEmployee extends BasePage
{
	String startDate="";
	String endDate="";
	String requiredDate="";
	boolean b=false;
	
	
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;
	
	public SearchEmployee (WebDriver driver)
	{
		super(driver);
	}
	
	
	
	public void getPayrollDate() throws ParseException, InterruptedException
	{
		
		sTestCaseID="TC49";
        Sheet="Sheet1";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
     
     
     requiredDate=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPayrollDate']")).getText();
		System.out.println("requiredDate="+requiredDate);
		
		
		EPS.EMPSearchAndPaternitypage _EMPSearchAndPaternitypage = new EPS.EMPSearchAndPaternitypage(m_Driver);
		 TestModellerLogger.SetLastNodeGuid("7cb4ab9c-9920-4049-bbb2-cfffbbc1c65f");
		    _EMPSearchAndPaternitypage.Click_clickEmployeeList();
		    

		    TestModellerLogger.SetLastNodeGuid("3fd95f28-2ee3-423e-bb39-696f925e309a");
		    _EMPSearchAndPaternitypage.Select_selectEmployeeStatus(data[5]);
		    
		    
		    m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_txtSearch' and @type='text']")).sendKeys(data[6]);
		    

		    TestModellerLogger.SetLastNodeGuid("ffc5a6e7-cc13-493e-86f2-6023149d1833");
		    _EMPSearchAndPaternitypage.Click_clickSearch();
		    

		    TestModellerLogger.SetLastNodeGuid("b69f3861-c4f1-4301-91c4-586a41760159");
		    _EMPSearchAndPaternitypage.Click_clickonEmpName();
		    

		    TestModellerLogger.SetLastNodeGuid("de2cc3a7-c470-441a-ba87-11d78ae67dce");
		    _EMPSearchAndPaternitypage.Click_clickAddLeave();
		    
		    Thread.sleep(2000);
		    
		    jsExec.executeScript("arguments[0].scrollIntoView(true);", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtStartDatePaternity']")));
		    
		   startDate= m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtStartDatePaternity']")).getAttribute("value");
		   System.out.println("startdate="+startDate);
		   
		   
		   
		   
		    endDate= m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtEndDatePaternity']")).getAttribute("value");
		    System.out.println("enddate="+endDate);
		  
		    


		
		
		SimpleDateFormat ob=new SimpleDateFormat("dd/mm/yyyy");
		Date sDate=ob.parse(startDate);
		System.out.println("sDate="+sDate);
		Date eDate=ob.parse(endDate);
		System.out.println("eDate="+eDate);
		Date rDate=ob.parse(requiredDate);
		System.out.println("rDate="+rDate);
		
		

		if(rDate.after(sDate) && rDate.before(eDate))
		{
			 b=true;
			 System.out.println("b="+b);
			 
		}
		else {
			System.out.println("b="+b);
		}
				

	}
	
	
}
