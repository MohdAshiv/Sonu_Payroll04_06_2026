package _8711Page;

import static org.testng.Assert.assertFalse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import pages.BasePage;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

public class Page extends BasePage {

	public Page(WebDriver driver) {
		super(driver);
	}

	
	
	private By editMainContactElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_rptrContactDetails_ctl00_btnEditEmployee']");
	
	private By editSecondryElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_rptrContactDetails_ctl01_btnEditEmployee']");

	private By edit3rdElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_rptrContactDetails_ctl02_btnEditEmployee']");

	private By edit4thElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_rptrContactDetails_ctl03_btnEditEmployee']");

	private By deletElem= By.xpath("//*[@id='btndeleteContact']");
	
	public void editMainContact() throws Exception
	{
        
		WebElement elem = getWebElement(editMainContactElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "editMainContact", "editMainContact failed. Unable to locate object: " + editMainContactElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "editMainContact", "editMainContact failed. Unable to locate object: " + editMainContactElem.toString());

			Assert.fail("Unable to locate object: " + editMainContactElem.toString());
        }

		elem.click();
		
		Thread.sleep(5000);
		Reporter.log("Click Search Btn");
          	

		ExtentReportManager.passStep(m_Driver, "editMainContact");

		
  		Reporter.log("editMainContact");

	}
	
	
	
	public void clickDeletBtn() throws Exception
	{
        
		WebElement elem = getWebElement(deletElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickDeletBtn", "clickDeletBtn failed. Unable to locate object: " + deletElem.toString());


			Assert.fail("Unable to locate object: " + deletElem.toString());
        }

		elem.click();
		
		m_Driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		Reporter.log("clickDeletBtn");
          	

		ExtentReportManager.passStep(m_Driver, "clickDeletBtn");

		
  		Reporter.log("clickDeletBtn");

	}
	
	
	public void editSecondryContact() throws Exception
	{
        
		WebElement elem = getWebElement(editSecondryElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "editSecondryContact", "editSecondryContact failed. Unable to locate object: " + editSecondryElem.toString());


			Assert.fail("Unable to locate object: " + editSecondryElem.toString());
        }

		elem.click();
		
		Thread.sleep(5000);
          	

		ExtentReportManager.passStep(m_Driver, "editSecondryContact");

		
  		Reporter.log("editSecondryContact");

	}
	
	public void edit3rdContact() throws Exception
	{
        
		WebElement elem = getWebElement(edit3rdElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "edit3rdContact", "edit3rdContact failed. Unable to locate object: " + edit3rdElem.toString());


			Assert.fail("Unable to locate object: " + edit3rdElem.toString());
        }

		elem.click();
		
		Thread.sleep(5000);
          	

		ExtentReportManager.passStep(m_Driver, "edit3rdContact");

		
  		Reporter.log("edit3rdContact");

	}
	
	
	public void edit4thContact() throws Exception
	{
        
		WebElement elem = getWebElement(edit4thElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "edit4thContact", "edit4thContact failed. Unable to locate object: " + edit4thElem.toString());


			Assert.fail("Unable to locate object: " + edit4thElem.toString());
        }

		elem.click();
		
		Thread.sleep(5000);
          	

		ExtentReportManager.passStep(m_Driver, "edit4thContact");

		
  		Reporter.log("edit4thContact");

	}
	
	
	
	public void clickAddOnSetting1() throws InterruptedException
	{
		
		WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_rptrContactDetails_ctl00_dvDropDownMenu']"));
		
		
		 elem.click();
		 
		 Thread.sleep(1000);
		 
		 
		 Reporter.log("clickAddOnSetting");
		 
		 
	}
	
	
	public void clickAddOnSetting2() throws InterruptedException
	{
		
		WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_rptrContactDetails_ctl01_dvDropDownMenu']"));
		
		
		 elem.click();
		 
		 Thread.sleep(1000);
		 
		 
		 Reporter.log("clickAddOnSetting");
		 
		 
	}
	
	
	
	
	public void clickAddOnSetting3() throws InterruptedException
	{
		
		WebElement elem = getWebElement(By.xpath("//*[@id='ContactDetails']/div[1]/div/div/div/table/tbody/tr[4]/td[7]/div/button"));
		
		
		 elem.click();
		 
		 Thread.sleep(1000);
		 
		 
		 Reporter.log("clickAddOnSetting");
		 
		 
	}
	

	public void clickAddOnSetting4() throws InterruptedException
	{
		
		WebElement elem = getWebElement(By.xpath("//*[@id='ContactDetails']/div[1]/div/div/div/table/tbody/tr[5]/td[7]/div/button"));
		
		
		 elem.click();
		 
		 Thread.sleep(1000);
		 
		 
		 Reporter.log("clickAddOnSetting");
		 
	}
	
	
	public void untickTickAllOptionsManinContact()
	{ 
      List<WebElement> list = getWebElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_chkPermission']/tbody/tr/td/input"));
    	boolean con=list.isEmpty();
      assertFalse(con); 
		    
      for(int i=0;i<=list.size()-1;i++)
      {
    	  
    	  WebElement elem = list.get(i);
    	  elem.click();
    	  
      }
      
      Reporter.log("untickAllOptionsManinContact");
		
	}
	
	

	public void onlyCheckLeaveManagement()
	{ 
      List<WebElement> list = getWebElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_chkPermission']/tbody/tr/td/input"));
    	boolean con=list.isEmpty();
      assertFalse(con); 
		    
      for(int i=0;i<=list.size()-1;i++)
      {
    	  
    	  if(i==2)
    	  {
    		  WebElement elem = list.get(i);
        	  elem.click(); 
    	  }
    	
    	  
      }
      
      Reporter.log("onlyCheckLeaveManagement");
		
	}
	
	
	public void onlyCheckTimesheetMnagement()
	{ 
      List<WebElement> list = getWebElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_chkPermission']/tbody/tr/td/input"));
    	boolean con=list.isEmpty();
      assertFalse(con); 
		    
      for(int i=0;i<=list.size()-1;i++)
      {
    	  
    	  if(i==1)
    	  {
    		  WebElement elem = list.get(i);
        	  elem.click(); 
    	  }
    	  
      }
      
      Reporter.log("onlyCheckTimesheetMnagement");
		
	}
	
	
	public void onlyCheckPayrollApproval()
	{ 
      List<WebElement> list = getWebElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_chkPermission']/tbody/tr/td/input"));
    	boolean con=list.isEmpty();
      assertFalse(con); 
		    
      for(int i=0;i<=list.size()-1;i++)
      {
    	  if(i==1||i==2||i==3)
    	  {
    		  break;
    	  }
    	
    		  WebElement elem = list.get(i);
        	  elem.click(); 
    	  
    	  
      }
      
      Reporter.log("onlyCheckPayrollApproval");
		
	}
	
	
	public void untickPayrollTimesheetLeave()
	{ 
      List<WebElement> list = getWebElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_chkPermission']/tbody/tr/td/input"));
		    
      boolean con=list.isEmpty();
      assertFalse(con); 
		    
      for(int i=0;i<=list.size()-1;i++)
      {
    	  
    	  if(i==3)
    	  {
    		  
    		  break;
    	  }
    	  WebElement elem = list.get(i);
    	  elem.click();
    	  
      }
      
      Reporter.log("untickAllOptionsManinContact");
		
	}
	
	
	
	public void untickTimesheetManagement()
	{ 
      List<WebElement> list = getWebElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_chkPermission']/tbody/tr/td/input"));
		    
      boolean con=list.isEmpty();
      assertFalse(con); 
		    
      for(int i=0;i<=list.size()-1;i++)
      {
    	  
    	  if(i==1)
    	  {
    		  WebElement elem = list.get(i);
        	  elem.click();
        	  
    	  }
    	 
    	 
      }
      
      Reporter.log("untickTimesheetManagement");
		
	}
	
	public void deletMainContact() throws Exception
	{
		   
		   getWebElement(By.xpath("(//*[@id='btndeleteContact'])[1]")).click();
		   
		   Thread.sleep(1000);
		   m_Driver.switchTo().alert().accept();
		   
		   Thread.sleep(3000);
		   
		   Reporter.log("deletMainContact");
	}
	
}
