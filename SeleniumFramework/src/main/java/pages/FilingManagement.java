package pages;

import pages.BasePage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/88f20342-ca67-4d75-91ef-9df47489ed68
@TestModellerModule(guid = "88f20342-ca67-4d75-91ef-9df47489ed68")
public class FilingManagement extends BasePage
{
	public FilingManagement (WebDriver driver)
	{
		super(driver);
	}


	
	private By gotoPayrollElem = By.xpath("//A[@id='ctl00_SideMenu1_hrefPayroll']");

	private By ClickThreeDotElem = By.xpath("//A[@class='report_icon dropdown-toggle']");

	private By SelectLeaverElem = By.xpath("//A[contains(text(),'Leaver')]");

	private By EnterLeavingDateElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtLeavingDate']");

	private By SaveButtonElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']");

	private By RunPayroll1Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll']");

	private By RunPayroll2Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSubmitOnline']");

	private By gotoFilingManagementElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefFilingMangment']");

	
	private By fpsElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl01_lnkTaxReturnType']");

	private By epsElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkTaxReturnType']");

	private By statusElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ddlStatusSearch']");
	private By selectResonElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ddlSubmitReason']");

	private By selectCheckBoxElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_checkall']");
	private By selectCheckBoxElem1= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_cbSelect']");

	private By NotesElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtNotes']");
	private By NotesElem1= By.xpath("//*[@id='txtNotes']");

	private By notToSubmitElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnDoNotSubmit']");
	
	private By SubmitElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnSubmitRTI']");

	private By selectPension= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeading_ddlPayrollFrequency']");

	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/FilingManagment.aspx?PayrollCompanyCode=12001");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/FilingManagment.aspx?PayrollCompanyCode=12001");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/FilingManagment.aspx?PayrollCompanyCode=12001");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/FilingManagment.aspx?PayrollCompanyCode=12001";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/FilingManagment.aspx?PayrollCompanyCode=12001")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click gotoPayroll
	 * @throws InterruptedException 
     * @name Click gotoPayroll
     */
	public void Click_gotoPayroll() throws InterruptedException
	{
        
		WebElement elem = getWebElement(gotoPayrollElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoPayroll", "Click_gotoPayroll failed. Unable to locate object: " + gotoPayrollElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoPayroll", "Click_gotoPayroll failed. Unable to locate object: " + gotoPayrollElem.toString());

			Assert.fail("Unable to locate object: " + gotoPayrollElem.toString());
        }

		//elem.click();
		jsExec.executeScript("arguments[0].click();", elem);
		
int tableSize=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr")).size();
		
		System.out.println(tableSize);
		
		for(int i=2;i<=tableSize;i++)
		{
			m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr["+i+"]/td[12]/div/a")).click();
			System.out.println("three dot");
			//String winHandle=m_Driver.getWindowHandle();
			m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords_ctl0"+i+"_lileaver']/a")).click();
			
			System.out.println("leaver");
			Thread.sleep(1000);
//			for(int j=i;j<tableSize;j++)
//			{	
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));
			System.out.println("frameswitch");
			for(int j=0;j<10;j++)
			{	
			m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtLeavingDate']")).sendKeys(Keys.BACK_SPACE);
			}
			m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtLeavingDate']")).sendKeys("24/05/2020");
			
			System.out.println("enterdate");
			//m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']")).click();
			jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']")));
			
			Thread.sleep(2000);
//			break;
//			}
			m_Driver.switchTo().defaultContent();
			
			System.out.println("clicksave");
			
		}
		
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoPayroll");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoPayroll");
	}
	
	
//     
//	/**
// 	 * Click ClickThreeDot
//     * @name Click ClickThreeDot
//     */
/*	public void Click_ClickThreeDot()
	{
        
		WebElement elem = getWebElement(ClickThreeDotElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickThreeDot", "Click_ClickThreeDot failed. Unable to locate object: " + ClickThreeDotElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickThreeDot", "Click_ClickThreeDot failed. Unable to locate object: " + ClickThreeDotElem.toString());

			Assert.fail("Unable to locate object: " + ClickThreeDotElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClickThreeDot");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickThreeDot");
	}

     
	/**
 	 * Click SelectLeaver
     * @name Click SelectLeaver
     */
/*	public void Click_SelectLeaver()
	{
        
		WebElement elem = getWebElement(SelectLeaverElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SelectLeaver", "Click_SelectLeaver failed. Unable to locate object: " + SelectLeaverElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SelectLeaver", "Click_SelectLeaver failed. Unable to locate object: " + SelectLeaverElem.toString());

			Assert.fail("Unable to locate object: " + SelectLeaverElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_SelectLeaver");

		TestModellerLogger.PassStep(m_Driver, "Click_SelectLeaver");
	}
*/
   /*   
	/**
 	 * Enter EnterLeavingDate
	 * @throws Exception 
     * @name Enter EnterLeavingDate
     */
 /*	public void Enter_EnterLeavingDate(String EnterLeavingDate) throws Exception
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(EnterLeavingDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterLeavingDate", "Enter_EnterLeavingDate failed. Unable to locate object: " + EnterLeavingDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterLeavingDate", "Enter_EnterLeavingDate failed. Unable to locate object: " + EnterLeavingDateElem.toString());

 			Assert.fail("Unable to locate object: " + EnterLeavingDateElem.toString());
         }

 		elem.sendKeys(EnterLeavingDate);
 		
 	//	m_Driver.switchTo().defaultContent();
 		
	//TakeScreenshot.takeScreenshot(m_Driver, "LeavingDateError");
//		
// 		Thread.sleep(5000);
//		elem.clear();
// 		elem.sendKeys("28/05/2020");
 		
 		
	m_Driver.switchTo().defaultContent();
//		
//		m_Driver.navigate().refresh();
//		elem.sendKeys("28/05/2020");
//		

		
		

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterLeavingDate " + EnterLeavingDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterLeavingDate " + EnterLeavingDate);
 	}
*/
  /*   
	/**
 	 * Click SaveButton
	 * @throws Exception 
	 * @name Click SaveButton
     */
	/*public void Click_SaveButton() throws Exception
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(SaveButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());

			Assert.fail("Unable to locate object: " + SaveButtonElem.toString());
        }

		//elem.click();
		
		jsExec.executeScript("arguments[0].click();", elem);
		
//		Thread.sleep(3000);
//		TakeScreenshot.takeScreenshot(m_Driver, "LeavingDateError");
//        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_SaveButton");

		TestModellerLogger.PassStep(m_Driver, "Click_SaveButton");
	}

    */ 
	/**
 	 * Click RunPayroll1
     * @name Click RunPayroll1
     */
	public void Click_RunPayroll1()
	{
        
		WebElement elem = getWebElement(RunPayroll1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_RunPayroll1", "Click_RunPayroll1 failed. Unable to locate object: " + RunPayroll1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_RunPayroll1", "Click_RunPayroll1 failed. Unable to locate object: " + RunPayroll1Elem.toString());

			Assert.fail("Unable to locate object: " + RunPayroll1Elem.toString());
        }

		//elem.click();
		jsExec.executeScript("arguments[0].click();", elem);
		
		//m_Driver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll\"]")).click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_RunPayroll1");

		TestModellerLogger.PassStep(m_Driver, "Click_RunPayroll1");
	}

     
	/**
 	 * Click RunPayroll2
     * @name Click RunPayroll2
     */
	public void Click_RunPayroll2()
	{
        
		WebElement elem = getWebElement(RunPayroll2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_RunPayroll2", "Click_RunPayroll2 failed. Unable to locate object: " + RunPayroll2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_RunPayroll2", "Click_RunPayroll2 failed. Unable to locate object: " + RunPayroll2Elem.toString());

			Assert.fail("Unable to locate object: " + RunPayroll2Elem.toString());
        }

		//elem.click();
		jsExec.executeScript("arguments[0].click();", elem);
          	

		ExtentReportManager.passStep(m_Driver, "Click_RunPayroll2");

		TestModellerLogger.PassStep(m_Driver, "Click_RunPayroll2");
	}

     
	/**
 	 * Click gotoFilingManagement
	 * @throws Exception 
     * @name Click gotoFilingManagement
     */
	public void Click_gotoFilingManagement() throws Exception
	{
        
		WebElement elem = getWebElement(gotoFilingManagementElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoFilingManagement", "Click_gotoFilingManagement failed. Unable to locate object: " + gotoFilingManagementElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoFilingManagement", "Click_gotoFilingManagement failed. Unable to locate object: " + gotoFilingManagementElem.toString());

			Assert.fail("Unable to locate object: " + gotoFilingManagementElem.toString());
        }

		elem.click();
		
		Thread.sleep(3000);
		TakeScreenshot.takeScreenshot(m_Driver, "EmployerOpeningBalanceEPS&FPS");
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoFilingManagement");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoFilingManagement");
		Reporter.log("Click_gotoFilingManagement");

	}
	
	
	public void clickFps() throws Exception
	{
        
		WebElement elem = getWebElement(fpsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickFps", "clickFps failed. Unable to locate object: " + fpsElem.toString());


			Assert.fail("Unable to locate object: " + fpsElem.toString());
        }

		elem.click();
		Thread.sleep(3000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "clickFps");
          	

		ExtentReportManager.passStep(m_Driver, "clickFps");
		Reporter.log("clickFps");


	}
	
	public void clickEps() throws Exception
	{
        
		WebElement elem = getWebElement(epsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEps", "clickEps failed. Unable to locate object: " + epsElem.toString());


			Assert.fail("Unable to locate object: " + epsElem.toString());
        }

		elem.click();
		Thread.sleep(3000);

		
		TakeScreenshot.takeScreenshot(m_Driver, "epsElem");
          	

		ExtentReportManager.passStep(m_Driver, "epsElem");

		Reporter.log("clickEps");
	}
	
	
	
	public void selectStatus(String value) throws Exception
	{
        
		WebElement elem = getWebElement(statusElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectStatus", "selectStatus failed. Unable to locate object: " + statusElem.toString());


			Assert.fail("Unable to locate object: " + statusElem.toString());
        }

		 Select sel = new Select(elem);
		 sel.selectByVisibleText(value);
		 
		Thread.sleep(3000);

		ExtentReportManager.passStep(m_Driver, "selectStatus");
		Reporter.log("selectStatus");


	}
	
	
	public void selectFrequency(String value) throws Exception
	{
        
		WebElement elem = getWebElement(selectPension);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectPension", "selectPension failed. Unable to locate object: " + selectPension.toString());


			Assert.fail("Unable to locate object: " + selectPension.toString());
        }

		 Select sel = new Select(elem);
		 sel.selectByVisibleText(value);
		 
		Thread.sleep(3000);

		ExtentReportManager.passStep(m_Driver, "selectPension");
		Reporter.log("selectPension");


	}
	
	public void selectReson(String value) throws Exception
	{
        
		WebElement elem = getWebElement(selectResonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectReson", "selectReson failed. Unable to locate object: " + selectResonElem.toString());


			Assert.fail("Unable to locate object: " + selectResonElem.toString());
        }

		 Select sel = new Select(elem);
		 sel.selectByVisibleText(value);
		 
		Thread.sleep(3000);

		ExtentReportManager.passStep(m_Driver, "selectReson");
		Reporter.log("selectReson");


	}
	
	public void clickCheckBox() throws Exception
	{
        
		WebElement elem = getWebElement(selectCheckBoxElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickCheckBox", "clickCheckBox failed. Unable to locate object: " + selectCheckBoxElem.toString());


			Assert.fail("Unable to locate object: " + selectCheckBoxElem.toString());
        }

		elem.click();
		Thread.sleep(3000);

		
		TakeScreenshot.takeScreenshot(m_Driver, "clickCheckBox");
          	

		ExtentReportManager.passStep(m_Driver, "clickCheckBox");

		Reporter.log("clickCheckBox");
	}
	
	
	public void clickCheckBox1() throws Exception
	{
        
		WebElement elem = getWebElement(selectCheckBoxElem1);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickCheckBox1", "clickCheckBox1 failed. Unable to locate object: " + selectCheckBoxElem1.toString());


			Assert.fail("Unable to locate object: " + selectCheckBoxElem1.toString());
        }

		elem.click();
		Thread.sleep(3000);

		
		TakeScreenshot.takeScreenshot(m_Driver, "clickCheckBox1");
          	

		ExtentReportManager.passStep(m_Driver, "clickCheckBox1");

		Reporter.log("clickCheckBox1");
	}
	
	
	public void enterNotes() throws Exception
	{
        
		WebElement elem = getWebElement(NotesElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterNotes", "enterNotes failed. Unable to locate object: " + NotesElem.toString());


			Assert.fail("Unable to locate object: " + NotesElem.toString());
        }

		elem.sendKeys("XYZ");
		Thread.sleep(2000);

		
		TakeScreenshot.takeScreenshot(m_Driver, "enterNotes");
          	

		ExtentReportManager.passStep(m_Driver, "enterNotes");

		Reporter.log("enterNotes");
	}
	
	
	public void enterNotes1() throws Exception
	{
        
		WebElement elem = getWebElement(NotesElem1);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterNotes1", "enterNotes1 failed. Unable to locate object: " + NotesElem1.toString());


			Assert.fail("Unable to locate object: " + NotesElem1.toString());
        }

		elem.sendKeys("XYZ");
		Thread.sleep(2000);

		
		TakeScreenshot.takeScreenshot(m_Driver, "enterNotes1");
          	

		ExtentReportManager.passStep(m_Driver, "enterNotes1");

		Reporter.log("enterNotes1");
	}
	
	
	public void clickNottoSubmit() throws Exception
	{
        
		WebElement elem = getWebElement(notToSubmitElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickNottoSubmit", "clickCheckBox failed. Unable to locate object: " + notToSubmitElem.toString());


			Assert.fail("Unable to locate object: " + notToSubmitElem.toString());
        }

		elem.click();
		Thread.sleep(3000);

		
		TakeScreenshot.takeScreenshot(m_Driver, "clickNottoSubmit");
          	

		ExtentReportManager.passStep(m_Driver, "clickNottoSubmit");

		Reporter.log("clickNottoSubmit");
	}
	
	

	public void clickSubmitHmrc() throws Exception
	{
        
		WebElement elem = getWebElement(SubmitElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickSubmitHmrc", "clickSubmitHmrc failed. Unable to locate object: " + SubmitElem.toString());


			Assert.fail("Unable to locate object: " + SubmitElem.toString());
        }

		elem.click();
		Thread.sleep(6000);

		//m_Driver.navigate().refresh();
		//Thread.sleep(2000);

		TakeScreenshot.takeScreenshot(m_Driver, "clickSubmitHmrc");
          	

		ExtentReportManager.passStep(m_Driver, "clickSubmitHmrc");

		Reporter.log("clickSubmitHmrc");
	}
	
	
	
	public void clickSubmitHmrcBtn500Time() throws Exception
	{
        
		
		
	      for(int i =1; i<=1000;i++)
	      {
	  		WebElement elem = getWebElement(SubmitElem);

	    	  elem.click();
	    	  
	    	  Thread.sleep(1000);
	    	  System.out.println("Click on SubmitHMRCButton-  "+i);
	  		Reporter.log("Click on SubmitHMRCButton-  "+i);

	      }


	}
	
	
	
	
	
	   public void undoRti() throws Exception
	    {
	        List<WebElement> list = m_Driver.findElements(By.xpath("//*[@type='submit']"));
	        
	        
	        for(int i=1;i<=list.size()-1;i++)
	        {
	            List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@type='submit']"));



	           WebElement elem = list1.get(i);
	            elem.click();
	            m_Driver.switchTo().alert().accept();
	            Thread.sleep(3000);
	        
	        }
	        
	        Reporter.log("undoRti");
	    }
	   public void undoRti1() throws Exception
	    {
	        List<WebElement> list = m_Driver.findElements(By.xpath("//*[@type='submit']"));
	        
	        
	        for(int i=0;i<=list.size()-1;i++)
	        {
	            List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@type='submit']"));



	           WebElement elem = list1.get(i);
	            elem.click();
	            m_Driver.switchTo().alert().accept();
	            Thread.sleep(3000);
	            break;
	        
	        }
	        
	        Reporter.log("undoRti");
	    }
	   
	 
	public void clickUndo() throws Exception {
		
		
		List<WebElement> list = m_Driver.findElements(By.xpath("//*[@type='submit']"));
		
		int data = list.size();
		
		for(int i=0;i<=25; i++)
			
		{
			
		if(data !=2)
		{
			
			m_Driver.navigate().refresh();
			
			Thread.sleep(3000);
			
			
		}
		else
		{
			
			System.out.println("nihdi");
		}
		
		
		}
	}
	
	
	public void GetSubmitStatusClick(int index,String EStatus) throws InterruptedException
	{
		Thread.sleep(2000);
		
		m_Driver.navigate().refresh();
		Thread.sleep(2000);

		//String Status2 = getWebElement(By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl0"+index+"_lnkStatus']")).getText();
		for(int i=0;i<=20;i++)
		{
			String Status = getWebElement(By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl0"+index+"_lnkStatus']")).getText();
			
			if(Status.trim().equals(EStatus))
			{
				getWebElement(By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl0"+index+"_btnUndo']")).click();
				
				m_Driver.switchTo().alert().accept();
				System.out.println("Click on "+Status+" Email Status");
				Reporter.log("Click on "+Status+" Email Status");
				break;
				
				
			}
			else
			{
				m_Driver.navigate().refresh();
				System.out.println("Refresh");
				Thread.sleep(5000);
			}
			
		}
  
		
		
	}
		public void GetSubmitStatusClick1(int index,String EStatus) throws InterruptedException
		{
			Thread.sleep(2000);
			
			
			m_Driver.navigate().refresh();
			Thread.sleep(2000);

			//String Status2 = getWebElement(By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl0"+index+"_lnkStatus']")).getText();
			for(int i=0;i<=20;i++)
			{
				String Status = getWebElement(By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl0"+index+"_lnkStatus']")).getText();
				
				if(Status.trim().equals(EStatus))
				{
                   break; 					
					
				}
				else
				{
					m_Driver.navigate().refresh();
					System.out.println("Refresh");
					Thread.sleep(5000);
				}
				
			}
}
	
	public void clickOnZeroPension() throws Exception {
		
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_grdPensionFilling_ctl02_LnkbtnFillReason']"));
		
		elem.click();
		
		Thread.sleep(3000);
		
		Reporter.log("clickOnZeroPension");
	
	}
	
	
	    public void clickOnCheckBox() throws Exception {
	    	
	     WebElement element = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_grdPensionFilling_ctl02_cbSelect']"));
		
	     element.click();
	     
		 Thread.sleep(3000);

	     Reporter.log("clickOnCheckBox");
	     
	     }
	
	    
	    

	    public void clickOnCheckBox2() throws Exception {
	    	
	     WebElement element = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_grdPensionFilling_ctl03_cbSelect']"));
		
	     element.click();
	     
		 Thread.sleep(3000);

	     Reporter.log("clickOnCheckBox");
	     
	     }
	    
        public void clickSumbimtBtn() throws Exception {
	    	
		     WebElement element = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnSubmit']"));
			
		     element.click();
		     
			 Thread.sleep(3000);

		     Reporter.log("clickSumbimtBtn");
		     
		     }
		   
        
        public void clickPensionNotToSubmitBtn() throws Exception {
	    	
		     WebElement element = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnDoNotSubmit']"));
			
		     element.click();
		     
			 Thread.sleep(3000);

		     Reporter.log("clickSumbimtBtn");
		     
		     }
        
        
        
        public void selectPensionStatus(String data) throws Exception {
	    	
		     WebElement element = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlStatusSearch']"));

		     Select sel = new Select(element);
		     
		     sel.selectByVisibleText(data);
		     
			 Thread.sleep(3000);

		     Reporter.log("selectPensionStatus");
		     
		     }  
        
        
        
        public void enterPensionNotes() throws Exception {
	    	
		     WebElement element = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtNotes']"));
			
		     element.sendKeys("xyz");
		     
			 Thread.sleep(3000);

		     Reporter.log("clickSumbimtBtn");
		     
		     }
	    
}