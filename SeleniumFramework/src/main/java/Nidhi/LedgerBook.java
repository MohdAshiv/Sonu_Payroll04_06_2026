package Nidhi;

import pages.BasePage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ChangeWindow;
import utilities.ClosePopup;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/7a5e2c75-cc12-4844-a197-d44fb3c58828
@TestModellerModule(guid = "7a5e2c75-cc12-4844-a197-d44fb3c58828")
public class LedgerBook extends BasePage
{
	
	static List<String> Newlist=new ArrayList<String>();
	
	static int totalcount=0;
	
	public LedgerBook (WebDriver driver)
	{
		super(driver);
	}


	
	private By _Advisor_Tools_Elem = By.xpath("//BUTTON[@data-toggle='dropdown']");

	private By ReportsElem = By.xpath("//*[@id='ctl00_AccountantToolSpn']/div/div/div[1]/ul/li[7]/a");

	private By General_LedgerNominal_LedgerElem = By.xpath("//A[contains(text(),'General Ledger/Nominal Ledger')]");

	private By selectAccountTypeElem = By.xpath("//label[normalize-space()= 'Account Type:']/../div/select");

	private By AccountElem = By.xpath("//SPAN[@id='select2-ctl00_cPHFilter_ddlAccount-container']");

	private By selectDateRangeElem = By.xpath("//label[normalize-space()= 'Date Range:']/../div/select");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/ReportLedger.aspx?FYCode=116987&CompanyCode=16664&menuid=0&page=0&st=&at=&dd=-1&do==&ts=0&atp=21,0&a=0&lr=0&vo=");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/ReportLedger.aspx?FYCode=116987&CompanyCode=16664&menuid=0&page=0&st=&at=&dd=-1&do==&ts=0&atp=21,0&a=0&lr=0&vo=");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/ReportLedger.aspx?FYCode=116987&CompanyCode=16664&menuid=0&page=0&st=&at=&dd=-1&do==&ts=0&atp=21,0&a=0&lr=0&vo=");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/ReportLedger.aspx?FYCode=116987&CompanyCode=16664&menuid=0&page=0&st=&at=&dd=-1&do==&ts=0&atp=21,0&a=0&lr=0&vo=";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/ReportLedger.aspx?FYCode=116987&CompanyCode=16664&menuid=0&page=0&st=&at=&dd=-1&do==&ts=0&atp=21,0&a=0&lr=0&vo=")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click  Advisor Tools 
	 * @throws InterruptedException 
     * @name Click  Advisor Tools 
     */
	public void Click__Advisor_Tools_() throws InterruptedException
	{
        
		WebElement elem = getWebElement(_Advisor_Tools_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Advisor_Tools_", "Click__Advisor_Tools_ failed. Unable to locate object: " + _Advisor_Tools_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Advisor_Tools_", "Click__Advisor_Tools_ failed. Unable to locate object: " + _Advisor_Tools_Elem.toString());

			Assert.fail("Unable to locate object: " + _Advisor_Tools_Elem.toString());
        }
	//	Thread.sleep(5000);
		
	//	ClosePopup.ValidateAndPopUp(m_Driver); 
		elem.click();
		
		
		 	

		ExtentReportManager.passStep(m_Driver, "Click__Advisor_Tools_");

		TestModellerLogger.PassStep(m_Driver, "Click__Advisor_Tools_");
	}

     
	/**
 	 * Click Reports
     * @name Click Reports
     */
	public void Click_Reports()
	{
        
		WebElement elem = getWebElement(ReportsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Reports", "Click_Reports failed. Unable to locate object: " + ReportsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Reports", "Click_Reports failed. Unable to locate object: " + ReportsElem.toString());

			Assert.fail("Unable to locate object: " + ReportsElem.toString());
        }

	//	elem.click();
		
		jsExec.executeScript("arguments[0].click();", elem);
		
		ChangeWindow.tabswitch(m_Driver);
		
		
          	

		ExtentReportManager.passStep(m_Driver, "Click_Reports");

		TestModellerLogger.PassStep(m_Driver, "Click_Reports");
	}

     
	/**
 	 * Click General Ledger/Nominal Ledger
     * @name Click General Ledger/Nominal Ledger
     */
	public void Click_General_LedgerNominal_Ledger()
	{
        
		WebElement elem = getWebElement(General_LedgerNominal_LedgerElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_General_LedgerNominal_Ledger", "Click_General_LedgerNominal_Ledger failed. Unable to locate object: " + General_LedgerNominal_LedgerElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_General_LedgerNominal_Ledger", "Click_General_LedgerNominal_Ledger failed. Unable to locate object: " + General_LedgerNominal_LedgerElem.toString());

			Assert.fail("Unable to locate object: " + General_LedgerNominal_LedgerElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_General_LedgerNominal_Ledger");

		TestModellerLogger.PassStep(m_Driver, "Click_General_LedgerNominal_Ledger");
	}

    
	/**
 	 * Select selectAccountType
     * @name Select selectAccountType
     */
    public void Select_selectAccountType()
 	{
 	    
 		WebElement elem = getWebElement(selectAccountTypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_selectAccountType", "Select_selectAccountType failed. Unable to locate object: " + selectAccountTypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_selectAccountType", "Select_selectAccountType failed. Unable to locate object: " + selectAccountTypeElem.toString());

 			Assert.fail("Unable to locate object: " + selectAccountTypeElem.toString());
         }

// 		Select dropdown = new Select(elem);
//
// 		dropdown.selectByVisibleText(selectAccountType);
 		
 		WebElement wb1Element=m_Driver.findElement(By.xpath("//SPAN[@id='select2-ctl00_cPHFilter_ddlAccount-container']"));
 		
 		
 		List<WebElement> actype=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPHFilter_ddlAccountType']/option"));
 		elem=m_Driver.findElement(By.xpath("//label[normalize-space()= 'Account Type:']/../div/select"));
// 		int i=0;
 		for(int i=0;i<actype.size();i++)
 		{
 			actype=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPHFilter_ddlAccountType']/option"));
 			
 			String ACvalue=actype.get(i).getText();

 			elem=m_Driver.findElement(By.xpath("//label[normalize-space()= 'Account Type:']/../div/select"));
 		
 			Select dropdown = new Select(elem);
 		
	 		dropdown.selectByVisibleText(ACvalue);

	 		 wb1Element=m_Driver.findElement(By.xpath("//SPAN[@id='select2-ctl00_cPHFilter_ddlAccount-container']"));

	 		wb1Element.click();
	 		
	 		List<WebElement> acount=m_Driver.findElements(By.xpath("/html/body/span/span/span[2]/ul/li"));

	 		for(int j=1;j<acount.size();j++)
	 		{
	 			String Acountvalue=acount.get(j).getText();
	 			
	 			System.out.println(Acountvalue);
	 			Newlist.add(Acountvalue);
	 			totalcount++;
	 			
	 		}
 			
 			
 		}
 		//Newlist.re
 		
 		System.out.println(totalcount);
 		
 		ExtentReportManager.passStep(m_Driver, "Select_selectAccountType " );

 		TestModellerLogger.PassStep(m_Driver, "Select_selectAccountType " );
 	}

    
    
    /**
     * Match from Excel
     * @throws IOException 
     * @throws InvalidFormatException 
     * @throws EncryptedDocumentException 
     * 
     */
    public void matchFromExcel() throws EncryptedDocumentException, InvalidFormatException, IOException
    {
    	for(int k=0;k<Newlist.size();k++)
 		{
 			System.out.println("This is list Element no "+k+"="+Newlist.get(k));
 		}
 		
    	
    	/**
    	 * Declare Third list		
    	 */

    			List<String> li4=new ArrayList<String>();
    	/**
    	 * Reading Excel		
    	 */
    			FileInputStream fis = new FileInputStream("D:\\vikash\\Ticets Detail\\Pending Tickets\\Test cases PAYR-2078- Payment for Month(Tester status).xlsx");
    			Workbook wb = WorkbookFactory.create(fis);
    			Sheet sht = wb.getSheet("Sheet1");
    			int iRowNum= sht.getLastRowNum();
    			System.out.println("Excel totoal records :"+iRowNum);

    			 String[] arr=new String[iRowNum];
    			for(int j=1; j<=iRowNum; j++)
    			{
    			String ste=sht.getRow(j).getCell(0).toString();
    			arr[j-1]=ste;

    			}
    			
    			
    		int indexcount=0;	
    			
    	/**
    	 * Matching Data		
    	 */
    			for(int l=0;l<Newlist.size();l++)
    			{
    				
    				for(int n=0;n<iRowNum;n++)
    				{
    					
    					if(Newlist.get(l).contains(arr[n]))
    							{
    							
    								System.out.println(arr[n]+"="+Newlist.get(l));
    								
    								
    								li4.add(indexcount, arr[n]);
    				
    								
    							}
    					
    				}
    				
    			}
    			SoftAssert af=new SoftAssert();	
    	int index2count=0;
    			for(int i2=0; i2<arr.length;i2++)
    			{
    				
    			//	System.out.println(li4.get(i2));
    				index2count=0;
    				for(int j=0;j<li4.size();j++)
    				{
    					
    					if(arr[i2].equalsIgnoreCase(li4.get(j)))
    					{
    						
    						System.out.println(arr[i2]+"="+li4.get(j));
    						
    						
    						index2count++;
    						break;
    		
    					}
//    					else
//    					{
//    						index2count++;
//    						assertEquals(arr[i2], 0,"Text not match"+arr[i2]);
//    					}
    					
    				}
    				
    				
    				
    				if(index2count==0)
    				{
    					
    					af.assertEquals(0, 1,"Text not match="+arr[i2]);
    					
    				}
    			
    			}
    			
    			af.assertAll();
    	
    	
    	
    }
     
	/**
 	 * Click Account
     * @name Click Account
     */
	public void Click_Account()
	{
        
		WebElement elem = getWebElement(AccountElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Account", "Click_Account failed. Unable to locate object: " + AccountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Account", "Click_Account failed. Unable to locate object: " + AccountElem.toString());

			Assert.fail("Unable to locate object: " + AccountElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Account");

		TestModellerLogger.PassStep(m_Driver, "Click_Account");
	}

    
	/**
 	 * Select selectDateRange
     * @name Select selectDateRange
     */
    public void Select_selectDateRange(String selectDateRange)
 	{
 	    
 		WebElement elem = getWebElement(selectDateRangeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_selectDateRange", "Select_selectDateRange failed. Unable to locate object: " + selectDateRangeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_selectDateRange", "Select_selectDateRange failed. Unable to locate object: " + selectDateRangeElem.toString());

 			Assert.fail("Unable to locate object: " + selectDateRangeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(selectDateRange);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_selectDateRange " + selectDateRange);

 		TestModellerLogger.PassStep(m_Driver, "Select_selectDateRange " + selectDateRange);
 	}
}