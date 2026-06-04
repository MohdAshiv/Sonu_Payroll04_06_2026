package pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import utilities.reports.ExtentReportManager;

public class DashboardPage  extends BasePage{

	public DashboardPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public static String text;
	
	private By payrollStatusElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_lnkPayrollStatus']");
	
	private By payrollAgentStatus= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkStatus']");
	private By notesElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefNotesHistory']");

	private By journalsElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefJournals']");

	private By mayNote= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl01_lblAccordian']/a/i");

	private By upcomingElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefUpcomingLeave']");
	
	private By sendSms= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnSendSMS']");

	
	private By emailDropDownIcnElem=By.xpath("//*[@id='aspnetForm']/main/header/div/div[3]/ul/li[4]/a/div[2]");

	
	public void clickEmailDropDown() throws Exception
	{
        
		Thread.sleep(3000);
		WebElement elem = getWebElement(emailDropDownIcnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEmailDropDown", "clickEmailDropDown failed. Unable to locate object: " + emailDropDownIcnElem.toString());

			Assert.fail("Unable to locate object: " + emailDropDownIcnElem.toString());
        }
		
       Thread.sleep(2000);
		elem.click();
		
		
	Thread.sleep(2000);
	Reporter.log("clickEmailDropDown");
	
}
	
	
	
	
	public void payrollStatusClick() throws Exception {
		
		WebElement elem = getWebElement(payrollStatusElem);
		
		elem.click();
		
		Thread.sleep(3000);
		Reporter.log("payrollStatusClick");

	}
	
	
public void payrollStatusClickAgent() throws Exception {
		
		WebElement elem = getWebElement(payrollAgentStatus);
		
		elem.click();
		
		Thread.sleep(3000);
		Reporter.log("payrollStatusClickAgent");

	}
	
	
public void payrollNotesClick() throws Exception {
		
		WebElement elem = getWebElement(notesElem);
		
		elem.click();
		
		Thread.sleep(2000);
		Reporter.log("payrollNotesClick");

	}



public void clickAndEnterMayNote() throws Exception {
	
	WebElement elem1 = getWebElement(mayNote);
	
	elem1.click();
	
	Thread.sleep(2000);
	
     text = RandomStringUtils.randomAlphabetic(9); 
    
   WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl01_rptrDisplayRecordsChild_ctl00_txtNotesHistory']"));
	
   elem.sendKeys(text);
   
  Reporter.log("clickAndEnterMayNote");

}
	
	

public void clickJournals() throws Exception {
	
	WebElement elem = getWebElement(journalsElem);
	
	elem.click();
	
	Thread.sleep(2000);
	Reporter.log("clickJournals");

}




public void clickUpcomingLeave() throws Exception {
	
	WebElement elem = getWebElement(upcomingElem);
	
	elem.click();
	
	Thread.sleep(2000);
	Reporter.log("clickUpcomingLeave");

}



public void saveNote() throws Exception {
	
	WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnSave']"));
	
	elem.click();
	
	Thread.sleep(2000);
	Reporter.log("saveNote");

}


public void clickSendSms() throws Exception {
	
	WebElement elem = getWebElement(sendSms);
	
	elem.click();
	
	Thread.sleep(2000);
	Reporter.log("clickSendSms");

}



public void selectPayrollStatusAndClickOnSaveBtn(String data) throws Exception {
	
	WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlStatus']"));
	
	Select sel = new  Select(elem);
	
	sel.selectByVisibleText(data);
	
	Thread.sleep(1000);

	m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSaveStatus']")).click();

	Thread.sleep(6000);
	Reporter.log("selectPayrollStatusAndClickOnSaveBtn");

}


      public void clickOnRequstHoursBtn() throws Exception {
    	  
    	 WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnRequestHours']"));
    	 
    	 elem.click();
    	 
    	 Thread.sleep(2000);
    	 
    	 Reporter.log("clickOnRequstHoursBtn");
    	 
      }
      
      
      
      public void enterDtaAndClickOnSearchBtn(String data) throws InterruptedException {
   	   
   	   
   	   WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_search_input']"));
   	   
   	   elem.sendKeys(data);
   	   
   	   Thread.sleep(1000);
   	   
   	   m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']")).click();
   	   
   	   Thread.sleep(5000);
   	   
      }
      
      
      public void clickOnEmployerView() throws Exception {
    	  
    	 WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_hrefEmployerDashboard']"));
    	 
    	 elem.click();
    	 
    	 Thread.sleep(3000);
    	 
    	 utilities.ChangeWindow.Switchwindow(3, m_Driver);
    	 
    	 Reporter.log("clickOnEmployerView");
      }
      

      public void clickOnSorting() throws Exception {
    	  
        WebElement sortButton = m_Driver.findElement(By.xpath("//*[contains(text(),'Gross')]"));
        sortButton.click();
    	 Thread.sleep(3000);
    	 
    	 Reporter.log("clickOnSorting");

    	  
      }
      
      
      

      public void clickOnSortingTaxCode() throws Exception {
    	  
        WebElement sortButton = m_Driver.findElement(By.xpath("//*[contains(text(),'Tax Code')]"));
        sortButton.click();
    	 Thread.sleep(3000);
    	 
    	 Reporter.log("clickOnSorting");

      }
      
      

      public void clickDepartment() throws Exception {
    	  
        WebElement sortButton = m_Driver.findElement(By.xpath("//*[contains(text(),'Department')]"));
        sortButton.click();
    	 Thread.sleep(3000);
    	 
    	 Reporter.log("clickDepartment");

      }
      
      
      public void clickOnEmailLog() throws Exception {
    	  
    	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_hrefInbox']"));
    	   
    	  elem.click();
      	 Thread.sleep(3000);
    	 Reporter.log("clickOnEmailLog");


      }
      
      
      
      public void clickSmsLog() throws Exception {
    	  
    	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_hrefSmsLog']"));
    	   
    	  elem.click();
      	 Thread.sleep(3000);
    	 Reporter.log("clickSmsLog");

      }
      
      
      public void clickChangePasswordBtn() throws Exception {
    	  
      	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/header/div/div[3]/ul/li[4]/ul/li[3]/a"));
      	  elem.click();
         Thread.sleep(3000);
      	 Reporter.log("clickChangePasswordBtn");

        }
      
      
      
      public void clickSignOut() throws Exception {
        	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_hrefLogout']"));
        	  elem.click();
           Thread.sleep(3000);
        	Reporter.log("clickSignOut");
          }
   
}
