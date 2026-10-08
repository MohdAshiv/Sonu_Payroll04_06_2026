package Reports;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import pages.BasePage;
import pages.reports;
import utilities.reports.ExtentReportManager;

public class P60P45AndP11DformsReports extends BasePage{
	
	
	
	
	public P60P45AndP11DformsReports(WebDriver driver) {
		super(driver);
		
			}
	
	
	SoftAssert soft=new SoftAssert();
	public static String FileName;
	
	
	private By FormDropdown= By.xpath("//select[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlForm']");
	
	private By EmployerAndEmployeerDropdown= By.xpath("//select[@id='EmailType']");
	
	private By EmailButton= By.xpath("//a[@id='ctl00_ctl00_ParentContent_cpHeaderRight_lnkPayslips']");
	
	private By availableToDateElem= By.xpath("//*[@id='txtavailabletodate']");

	private By fuelTypeElem= By.xpath("//*[@id='ddlfuel']");

	private By listPriceElem= By.xpath("//*[@id='txtlistprice']");
	
	private By addCarDetailsElem= By.xpath("//*[@id='btnaddcar']");

	private By taxYearElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpExpensesandBenefits_EmployeeExpensesBenefitsUC_ddl_TaxYear']");

	
	 public void selectForm(String data) throws Exception
	  	{
	  		WebElement elem = getWebElement(FormDropdown);

	  		if (elem == null) {
	      		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectTaxYear", "selectTaxYear failed. Unable to locate object: " + FormDropdown.toString());


	  			Assert.fail("Unable to locate object: " + FormDropdown.toString());
	          }

				Select sel = new Select(elem);
				sel.selectByVisibleText(data);
				Thread.sleep(2000);
				ExtentReportManager.passStep(m_Driver, "selectForm");
	    	Reporter.log("selectForm : "+data);
	    	System.out.println("selectForm : "+data);

	  	}
	    

	 public void selectEmployerAndEmployeer(String data) throws Exception
	  	{
	  		WebElement elem = getWebElement(EmployerAndEmployeerDropdown);

	  		if (elem == null) {
	      		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectTaxYear", "selectTaxYear failed. Unable to locate object: " + EmployerAndEmployeerDropdown.toString());


	  			Assert.fail("Unable to locate object: " + EmployerAndEmployeerDropdown.toString());
	          }

				Select sel = new Select(elem);
				sel.selectByVisibleText(data);
				Thread.sleep(2000);
				ExtentReportManager.passStep(m_Driver, "selectEmployerAndEmployeer");
	    	Reporter.log("selectEmployerAndEmployeer : "+data);
	    	System.out.println("selectEmployerAndEmployeer : "+data);

	  	}
    
    
    public void clickEmailButton() throws InterruptedException
 	{
         
 		WebElement elem = getWebElement(EmailButton);

 		if (elem == null) {
     		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickExpensesAndBenefits", "clickExpensesAndBenefits failed. Unable to locate object: " + EmailButton.toString());

     		
 			Assert.fail("Unable to locate object: " + EmailButton.toString());
         }

 		elem.click();       
 		Thread.sleep(2000);

 		ExtentReportManager.passStep(m_Driver, "clickEmailButton");
 		Reporter.log("click clickEmailButton");
 		System.out.println("clickEmailButton");
 		
 	}
    public void clickEmailButtonInP45Reports() throws InterruptedException
   	{
           
   		WebElement elem = getWebElement(By.xpath("//a[@id='ctl00_ctl00_ParentContent_cpHeaderRight_lnkP45Email']"));

   		if (elem == null) {
       		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickExpensesAndBenefits", "clickExpensesAndBenefits failed. Unable to locate object: " + EmailButton.toString());

       		
   			Assert.fail("Unable to locate object: " + EmailButton.toString());
           }

   		elem.click();       
   		Thread.sleep(2000);

   		ExtentReportManager.passStep(m_Driver, "clickEmailButton");
   		Reporter.log("click clickEmailButton");
   		System.out.println("clickEmailButton");
   		
   	}
    
    public void verifyP60EmailPopup(String PopupName)
    {
    	m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='PopUpFrame']")));
    	String PopNameUI = getWebElement(By.xpath("//span[@class='h1A']")).getText();
    	soft.assertEquals(PopupName, PopNameUI,"popup is not getting opened");
    	Reporter.log("verify P60 Email Popup");
 		System.out.println("verify P60 Email Popup");
 		m_Driver.switchTo().defaultContent();
    }
    
    public void chkCompanyEmailAddressChkBox()
    {
    	m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='PopUpFrame']")));
    	 List<WebElement> ChkOrNot = getWebElements(By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_chkCustomerEmail'][@checked='checked']"));
    	
    	 boolean con = ChkOrNot.isEmpty();
    	if(con==true)
    	{
    		 WebElement chkCompanyEmailAddress = getWebElement(By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_chkCustomerEmail']"));
        	 chkCompanyEmailAddress.click();
    	}
    	Reporter.log("chkCompanyEmailAddressChkBox");
 		System.out.println("chkCompanyEmailAddressChkBox");
 		m_Driver.switchTo().defaultContent();
    }
    
    public void verifyChkCompanyEmailAddressChkBox()
    {
    	m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='PopUpFrame']")));
    	 List<WebElement> ChkOrNot = getWebElements(By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_chkCustomerEmail'][@checked='checked']"));
    	
    	 boolean con = ChkOrNot.isEmpty();
    	if(con==true)
    	{
    		 soft.assertFalse(con, "Company Email Address Chk Box is not chked by default");
    	}
    	Reporter.log("chkCompanyEmailAddressChkBox");
 		System.out.println("chkCompanyEmailAddressChkBox");
 		m_Driver.switchTo().defaultContent();
    }
    public void chkMySelfChkBox()
    {
    	m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='PopUpFrame']")));
    	 WebElement chkMySelf = getWebElement(By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_chkMarkMySelf']"));
    	 chkMySelf.click();
    	Reporter.log("chkMySelfChkBox");
 		System.out.println("chkMySelfChkBox");
 		m_Driver.switchTo().defaultContent();
    }
    public void EmailSendTo(String EmailAdd)
    {
    	m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='PopUpFrame']")));
    	 WebElement To = getWebElement(By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_txtEmail']"));
    	 To.clear();
    	 To.sendKeys(EmailAdd);
    	Reporter.log("EmailSendTo : "+EmailAdd);
 		System.out.println("EmailSendTo : "+EmailAdd);
 		m_Driver.switchTo().defaultContent();
    }
    
    public void EmailReplyTo(String EmailAdd)
    {
    	m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='PopUpFrame']")));
    	 WebElement ReplyTo = getWebElement(By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_txtReplyTo']"));
    	 ReplyTo.clear();
    	 ReplyTo.sendKeys(EmailAdd);
    	Reporter.log("EmailReplyTo : "+EmailAdd);
 		System.out.println("EmailReplyTo : "+EmailAdd);
 		m_Driver.switchTo().defaultContent();
    }
    
    public void EmailSubject(String EmailAdd)
    {
    	m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='PopUpFrame']")));
    	 WebElement Subject = getWebElement(By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_txtSubject']"));
    	 Subject.clear();
    	 Subject.sendKeys(EmailAdd);
    	Reporter.log("EmailSubject : "+EmailAdd);
 		System.out.println("EmailSubject : "+EmailAdd);
 		m_Driver.switchTo().defaultContent();
    }
    
    public void clickEmailSaveButton()
    {
    	m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='PopUpFrame']")));
    	 WebElement SaveButton = getWebElement(By.xpath("//a[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']"));
    	 SaveButton.click();
    	Reporter.log("clickEmailSaveButton");
 		System.out.println("clickEmailSaveButton");
 		m_Driver.switchTo().defaultContent();
    }
    
    public void clickEmailCancelButton()
    {
    	m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='PopUpFrame']")));
    	 WebElement Cancel = getWebElement(By.xpath("//a[@id='ctl00_ctl00_ParentContent_cphFooter_btnCancel']"));
    	 Cancel.click();
    	Reporter.log("clickEmailCancelButton");
 		System.out.println("clickEmailCancelButton");
 		m_Driver.switchTo().defaultContent();
    }
    
    public void verifyErrorValidationOfP60EmailPopup(String ExpVali)
    {
    	m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='PopUpFrame']")));
    	String Validation = getWebElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
    	String Validation2 = Validation.replaceAll("\\n", "").substring(1);
    	soft.assertEquals(ExpVali, Validation2,"Validation Msg Is Not Getting Matched");
    	Reporter.log("verify Error Validation Of P60 Email Popup : ");
 		System.out.println("verify Error Validation Of P60 Email Popup");
 		m_Driver.switchTo().defaultContent();
    }
    public void verifySuccessValidationOfP60EmailPopup(String ExpVali)
    {
    	m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='PopUpFrame']")));
    	String Validation = getWebElement(By.xpath("//div[@class='alert alert-success']")).getText();
    	soft.assertEquals(ExpVali, Validation,"Validation Msg Is Not Getting Matched");
    	Reporter.log("verify Success Validation Of P60 Email Popup : ");
 		System.out.println("verify Success Validation Of P60 Email Popup");
 		m_Driver.switchTo().defaultContent();
    }
    
    
    public void enterEmailInEmailBody(String Data)
    {
    	m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='PopUpFrame']")));
    	m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_ctl00_ParentContent_cPH_txtBody_ctl02_ctl00']")));
    	 WebElement Body = getWebElement(By.xpath("//body"));
    	// String selectAll = Keys.chord(Keys.CONTROL, "a");
    	 Body.clear();
    	 Body.sendKeys(Data);
    	Reporter.log("enterEmailInEmailBody");
 		System.out.println("enterEmailInEmailBody");
 		m_Driver.switchTo().defaultContent();
 		m_Driver.switchTo().defaultContent();
    }
    
    
    public void chkAnyEnteryByName(String EMName)
    {
    	WebElement elem = getWebElement(By.xpath("//span[normalize-space()='"+EMName+"']//ancestor::tr/td[1]/span/input"));
    	elem.click();
    	Reporter.log("chkAnyEnteryByName : "+EMName);
 		System.out.println("chkAnyEnteryByName : "+EMName);
    	
    	
    }
    
    
    public void clickOnEmployerName(String Name)
    {
    	WebElement elem = getWebElement(By.xpath("//span[normalize-space()='"+Name+"']"));
    	elem.click();
    	Reporter.log("clickOnEmployerName : "+Name);
 		System.out.println("clickOnEmployerName : "+Name);
    }
 	
    public void selectTaxYear(String data) throws Exception
   	{
           
 		
   		WebElement elem = getWebElement(By.xpath("//span[@id='select2-ctl00_ctl00_ParentContent_ddlTaxYears-container']"));

   		if (elem == null) {
       		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectTaxYear", "selectTaxYear failed. Unable to locate object: " + taxYearElem.toString());


   			Assert.fail("Unable to locate object: " + taxYearElem.toString());
           }

   		m_Driver.findElement(By.xpath("//span[@id='select2-ctl00_ctl00_ParentContent_ddlTaxYears-container']")).click();
   		m_Driver.findElement(By.xpath("//li[normalize-space()='"+data+"']")).click();
   		
   		
 			
 			Thread.sleep(2000);
 			ExtentReportManager.passStep(m_Driver, "selectTaxYear");

   		
     	Reporter.log("selectTaxYear");

   	}
    
    public void clickOnGenerateButton()
    {
    WebElement Button = getWebElement(By.xpath("//a[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnGenerateP60']"));
    Button.click();
    Reporter.log("click On Generate Button");
		System.out.println("click On Generate Button");
    }
    
    public void clickOnGenerateButtonInP45Report()
    {
    WebElement Button = getWebElement(By.xpath("//a[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnGenerateP45']"));
    Button.click();
    Reporter.log("click On Generate Button");
		System.out.println("click On Generate Button");
    }
    
    public void clickOnChkSelectAllButton()
    {
    WebElement Button = getWebElement(By.xpath("//input[@id='chkSelectAll']"));
    Button.click();
    Reporter.log("click On Generate Button");
		System.out.println("click On Generate Button");
    }
    
    public void clickOnChkSelectAllButtonInP45Reports()
    {
    WebElement Button = getWebElement(By.xpath("//input[@id='chkAll']"));
    Button.click();
    Reporter.log("click On Generate Button");
		System.out.println("click On Generate Button");
    }
    
    
    public void verifyChkSelectAllButton()
    {
    	
    	List<WebElement> chkboxList = getWebElements(By.xpath("//input[@class='selectAll']"));
    	int chkboxCount=chkboxList.size();
    	List<WebElement> chkedboxList = getWebElements(By.xpath("//input[@class='selectAll'][@checked='checked']"));
    	int chkedbox=chkedboxList.size();
    	soft.assertEquals(chkedbox, chkboxCount,"ChkSelectAllButton is not working as expected");
    	Reporter.log("verify Chk Select All Button");
		System.out.println("verify Chk Select All Button");
    }
    
    public void verifyChkSelectAllButtonInP45Reports()
    {
    	
    	List<WebElement> chkboxList = getWebElements(By.xpath("//input[@id='chkemail']"));
    	int chkboxCount=chkboxList.size();
    	List<WebElement> chkedboxList = getWebElements(By.xpath("//input[@id='chkemail'][@checked='checked']"));
    	int chkedbox=chkedboxList.size();
    	soft.assertEquals(chkedbox, chkboxCount,"ChkSelectAllButton is not working as expected");
    	Reporter.log("verify Chk Select All Button");
		System.out.println("verify Chk Select All Button");
    }
    
    public void verifyEmployerName(String Name)
    {
    	System.out.println("");
    	String UiName = null;
    	List<WebElement> listpage = getWebElements(By.xpath("//div[@id='ctl00_ctl00_ParentContent_cPH_DvP60Page']//ul/li"));
    	boolean con=listpage.isEmpty();
    	if(con==true)
    	{
    		 List<WebElement> list = getWebElements(By.xpath("//*[@class='border-btm-dotted']"));
    		 for(int i=0;i<=list.size()-1;i++)
    		 {
    			 List<WebElement> list2 = getWebElements(By.xpath("//*[@class='border-btm-dotted']"));
    			 UiName = list2.get(i).getText().trim();
    			 if(UiName.equals(Name))
    			 {
    	     	    	Reporter.log("EmployerName : "+Name);
    	     	 		System.out.println("EmployerName : "+Name); 
    				 break;
    			 }
    			 else
    			 {
 	     	 		System.out.println("EmployerName : "+Name);  
    			 }
    			
    		 }
    	}
    	else
    	{
    		List<WebElement> listpage2 = getWebElements(By.xpath("//div[@id='ctl00_ctl00_ParentContent_cPH_DvP60Page']//ul/li"));
    		int Size=listpage2.size();
    		for(int i=1;i<=Size-2;i++)
    		{
    			if(i!=1)
    			{
    				WebElement nextButton = getWebElement(By.xpath("(//i[@class='fa fa-chevron-right'])[1]"));
        			nextButton.click();	
    			}
    		
    			 List<WebElement> list = getWebElements(By.xpath("//*[@class='border-btm-dotted']"));
        		 for(int p=0;p<list.size()-1;p++)
        		 {
        			 List<WebElement> list2 = getWebElements(By.xpath("//*[@class='border-btm-dotted']"));
        			 UiName = list2.get(p).getText().trim();
        			 if(UiName.equals(Name))
        			 {
        	     	    	Reporter.log("clickOnEmployerName : "+Name);
        	     	 		System.out.println("clickOnEmployerName : "+Name); 
        				 break;
        			 }
         	    
        		 }
    			
    		}
    	}
    	
    	soft.assertEquals(Name, UiName,"Issue In verifyEmployerName");
    }
    
    
    
    public void verifyAllTaxYear(String data) throws Exception
   	{
   		WebElement elem = getWebElement(By.xpath("//select[@id='ctl00_ctl00_ParentContent_ddlTaxYears']"));
   		if (elem == null) {
       		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectTaxYear", "selectTaxYear failed. Unable to locate object: " + taxYearElem.toString());
   			Assert.fail("Unable to locate object: " + taxYearElem.toString());
           }

 			Select sel = new Select(elem);
 			List<WebElement> list = sel.getOptions();
 			boolean con=list.isEmpty();
 			if(con==true)
 			{
 				soft.assertTrue(con,"without any run payroll year is getting visible on p60 reports");
 				Reporter.log("verifyTaxYear Without any run payroll : "+data);
     	 		System.out.println("verifyTaxYear Without any run payroll : "+data); 
 				
 			}
 			else
 			{
 				for(int i=0;i<=list.size()-1;i++)
 				{
 					String year = list.get(i).getText();
 					String[] data2 = data.split(":");
 					soft.assertEquals(data2[i].trim(), year.trim());
 					Reporter.log("verify TaxYear run payroll "+list.size()+" year : "+data);
 	     	 		System.out.println("verify TaxYear run payroll "+list.size()+" year : acual :"+year.trim()+" Expected :"+data2[i]); 
 				}
 			}
 			ExtentReportManager.passStep(m_Driver, "selectTaxYear");
 			Reporter.log("selectTaxYear");
   	}
    
    public void verifyselectTaxYear(String data) throws Exception
   	{
           
 		
   		WebElement elem = getWebElement(By.xpath("//select[@id='ctl00_ctl00_ParentContent_ddlTaxYears']"));

   		if (elem == null) {
       		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectTaxYear", "selectTaxYear failed. Unable to locate object: " + taxYearElem.toString());


   			Assert.fail("Unable to locate object: " + taxYearElem.toString());
           }

 			Select sel = new Select(elem);
 			WebElement setectedYearElem=sel.getFirstSelectedOption();
 			String setectedYear = setectedYearElem.getText();
 			
 			soft.assertEquals(data, setectedYear);
 			
 			Reporter.log("verify selected Tax Year : "+data);
  	 		System.out.println("verify selected Tax Year : "+data); 
 			ExtentReportManager.passStep(m_Driver, "selectTaxYear");
     	Reporter.log("selectTaxYear");
   	}

    
    
    public void verifyEmployerNameList(String title,String First,String Last)
    {
    	int A=0;
    	System.out.println("Data");
    	String UiName = null;
    	List<WebElement> listpage = getWebElements(By.xpath("//div[@id='ctl00_ctl00_ParentContent_cPH_DvP60Page']//ul/li"));
    	boolean con=listpage.isEmpty();
    	if(con==true)
    	{
    		 List<WebElement> list = getWebElements(By.xpath("//table[@id='tblP60']/tbody/tr/td[2]/a"));
    		 for(int i=0;i<=list.size()-1;i++)
    		 {
    			 List<WebElement> list2 = getWebElements(By.xpath("//table[@id='tblP60']/tbody/tr/td[2]/a"));
    			 UiName = list2.get(i).getText().trim();
    			 String[] Last2 = Last.split(" ");
    			 String ExcelName = title+" "+First+" "+Last2[A];
    			soft.assertEquals(ExcelName, UiName);
    			Reporter.log("Verify Employee Name : "+ExcelName);
     	 		System.out.println("Verify Employee Name : "+ExcelName); 
     	 		A++;
    			
    		 }
    	}
    	else
    	{
    		List<WebElement> listpage2 = getWebElements(By.xpath("//div[@id='ctl00_ctl00_ParentContent_cPH_DvP60Page']//ul/li"));
    		int Size=listpage2.size();
    		for(int i=1;i<=Size-2;i++)
    		{
    			if(i!=1)
    			{
    				WebElement nextButton = getWebElement(By.xpath("(//i[@class='fa fa-chevron-right'])[1]"));
        			nextButton.click();	
        			
    			}
    		
    			 List<WebElement> list = getWebElements(By.xpath("//table[@id='tblP60']/tbody/tr/td[2]/a"));
        		 for(int p=0;p<=list.size()-1;p++)
        		 {
        			 List<WebElement> list2 = getWebElements(By.xpath("//table[@id='tblP60']/tbody/tr/td[2]/a"));
        			 UiName = list2.get(p).getText().trim();
        			 String[] Last2 = Last.split(" ");
        			 String ExcelName = title+" "+First+" "+Last2[A];
        			 soft.assertEquals(ExcelName, UiName);
         			Reporter.log("Verify Employee Name : "+ExcelName);
          	 		System.out.println("Verify Employee Name : "+ExcelName); 
          	 		A++;
        		 }
    		}
    	}
    }
    
    
    public void verifyEmployerNameListInP45Reports(String title,String First,String Last)
    {
    	int A=0;
    	System.out.println("Data");
    	String UiName = null;
    	List<WebElement> listpage = getWebElements(By.xpath("//div[@id='ctl00_ctl00_ParentContent_cPH_DvP45Page']//ul/li"));
    	boolean con=listpage.isEmpty();
    	if(con==true)
    	{
    		 List<WebElement> list = getWebElements(By.xpath("//table[@id='tblP45']/tbody/tr/td[2]/a"));
    		 for(int i=0;i<=list.size()-1;i++)
    		 {
    			 List<WebElement> list2 = getWebElements(By.xpath("//table[@id='tblP45']/tbody/tr/td[2]/a"));
    			 UiName = list2.get(i).getText().trim();
    			 String[] Last2 = Last.split(" ");
    			 String ExcelName = title+" "+First+" "+Last2[A];
    			soft.assertEquals(ExcelName, UiName);
    			Reporter.log("Verify Employee Name : "+ExcelName);
     	 		System.out.println("Verify Employee Name : "+ExcelName); 
     	 		A++;
    			
    		 }
    	}
    	else
    	{
    		List<WebElement> listpage2 = getWebElements(By.xpath("//div[@id='ctl00_ctl00_ParentContent_cPH_DvP45Page']//ul/li"));
    		int Size=listpage2.size();
    		for(int i=1;i<=Size-2;i++)
    		{
    			if(i!=1)
    			{
    				WebElement nextButton = getWebElement(By.xpath("(//i[@class='fa fa-chevron-right'])[1]"));
        			nextButton.click();	
        			
    			}
    		
    			 List<WebElement> list = getWebElements(By.xpath("//table[@id='tblP45']/tbody/tr/td[2]/a"));
        		 for(int p=0;p<=list.size()-1;p++)
        		 {
        			 List<WebElement> list2 = getWebElements(By.xpath("//table[@id='tblP45']/tbody/tr/td[2]/a"));
        			 UiName = list2.get(p).getText().trim();
        			 String[] Last2 = Last.split(" ");
        			 String ExcelName = title+" "+First+" "+Last2[A];
        			 soft.assertEquals(ExcelName, UiName);
         			Reporter.log("Verify Employee Name : "+ExcelName);
          	 		System.out.println("Verify Employee Name : "+ExcelName); 
          	 		A++;
        		 }
    		}
    	}
    }
    
    public void verifyEmployerNameListCountAccrodingPaginationByName(String Count,String Name)
    {
    	List<WebElement> listpage = getWebElements(By.xpath("//div[@id='ctl00_ctl00_ParentContent_cPH_DvP"+Name+"Page']//ul/li"));
    	boolean con=listpage.isEmpty();
    	if(con==true)
    	{
    		 soft.assertFalse(con, "Pagination is not getting visible");
    	}
    	if(con==false)
    	{
    			 List<WebElement> list = getWebElements(By.xpath("//table[@id='tblP"+Name+"']/tbody/tr/td[2]/a"));
        		 int s = list.size();
        		 String CountUI = String.valueOf(s);
        		 soft.assertEquals(Count, CountUI);
    		
    	}
    }
    
   
    
    
    public void clickOnchkButtonByName(String Name)
    {
    	System.out.println("");
    	String UiName = null;
    	List<WebElement> listpage = getWebElements(By.xpath("//div[@id='ctl00_ctl00_ParentContent_cPH_DvP60Page']//ul/li"));
    	boolean con=listpage.isEmpty();
    	if(con==true)
    	{
    		 List<WebElement> list = getWebElements(By.xpath("//*[@class='border-btm-dotted']"));
    		 for(int i=0;i<=list.size()-1;i++)
    		 {
    			 List<WebElement> list2 = getWebElements(By.xpath("//*[@class='border-btm-dotted']"));
    			 UiName = list2.get(i).getText().trim();
    			 if(UiName.equals(Name))
    			 {
    	     	    	Reporter.log("EmployerName : "+Name);
    	     	 		System.out.println("EmployerName : "+Name); 
    	     	 		WebElement chkButton = getWebElement(By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl0"+i+"_chkGenerate']"));
    	     	 		chkButton.click();
    	     	 		break;
    			 }
    			 else
    			 {
 	     	 		System.out.println("EmployerName : "+Name);  
    			 }
    			
    		 }
    	}
    	else
    	{
    		boolean found = false;
    		List<WebElement> listpage2 = getWebElements(By.xpath("//div[@id='ctl00_ctl00_ParentContent_cPH_DvP60Page']//ul/li"));
    		int Size=listpage2.size();
    		for(int i=1;i<=Size-2;i++)
    		{
    			
    			if(i!=1)
    			{
    				WebElement nextButton = getWebElement(By.xpath("(//i[@class='fa fa-chevron-right'])[1]"));
        			nextButton.click();	
    			}
    		
    			 List<WebElement> list = getWebElements(By.xpath("//*[@class='border-btm-dotted']"));
        		 for(int p=0;p<list.size()-1;p++)
        		 {
        			 List<WebElement> list2 = getWebElements(By.xpath("//*[@class='border-btm-dotted']"));
        			 UiName = list2.get(p).getText().trim();
        			 if(UiName.equals(Name))
        			 {
        					Reporter.log("EmployerName : "+Name);
        	     	 		System.out.println("EmployerName : "+Name); 
        	     	 		WebElement chkButton = getWebElement(By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl0"+p+"_chkGenerate']"));
        	     	 		chkButton.click();
        	     	 		found = true;
        	     	 		break;
        			 }
        		 }
        		 if (found) {
                     break; // Outer loop ko break karna
                 }
    		}
    	}
    	
    	soft.assertEquals(Name, UiName,"Issue In verifyEmployerName");
    }
    
    public void clickOnchkButtonByNameInP45Report(String Name)
    {
    	System.out.println("");
    	String UiName = null;
    	List<WebElement> listpage = getWebElements(By.xpath("//div[@id='ctl00_ctl00_ParentContent_cPH_DvP45Page']//ul/li"));
    	boolean con=listpage.isEmpty();
    	if(con==true)
    	{
    		 List<WebElement> list = getWebElements(By.xpath("//*[@class='border-btm-dotted']"));
    		 for(int i=0;i<=list.size()-1;i++)
    		 {
    			 List<WebElement> list2 = getWebElements(By.xpath("//*[@class='border-btm-dotted']"));
    			 UiName = list2.get(i).getText().trim();
    			 if(UiName.equals(Name))
    			 {
    	     	    	Reporter.log("EmployerName : "+Name);
    	     	 		System.out.println("EmployerName : "+Name); 
    	     	 		WebElement chkButton = getWebElement(By.xpath("//input[@name='ctl00$ctl00$ParentContent$cPH$rptrDisplayP45Records$ctl0"+i+"$chkemail']"));
    	     	 		chkButton.click();
    	     	 		break;
    			 }
    			 else
    			 {
 	     	 		System.out.println("EmployerName : "+Name);  
    			 }
    			
    		 }
    	}
    	else
    	{
    		boolean found = false;
    		List<WebElement> listpage2 = getWebElements(By.xpath("//div[@id='ctl00_ctl00_ParentContent_cPH_DvP45Page']//ul/li"));
    		int Size=listpage2.size();
    		for(int i=1;i<=Size-2;i++)
    		{
    			
    			if(i!=1)
    			{
    				WebElement nextButton = getWebElement(By.xpath("(//i[@class='fa fa-chevron-right'])[1]"));
        			nextButton.click();	
    			}
    		
    			 List<WebElement> list = getWebElements(By.xpath("//*[@class='border-btm-dotted']"));
        		 for(int p=0;p<list.size()-1;p++)
        		 {
        			 List<WebElement> list2 = getWebElements(By.xpath("//*[@class='border-btm-dotted']"));
        			 UiName = list2.get(p).getText().trim();
        			 if(UiName.equals(Name))
        			 {
        					Reporter.log("EmployerName : "+Name);
        	     	 		System.out.println("EmployerName : "+Name); 
        	     	 		WebElement chkButton = getWebElement(By.xpath("//input[@name='ctl00$ctl00$ParentContent$cPH$rptrDisplayP45Records$ctl0"+p+"$chkemail']"));
        	     	 		chkButton.click();
        	     	 		found = true;
        	     	 		break;
        			 }
        		 }
        		 if (found) {
                     break; // Outer loop ko break karna
                 }
    		}
    	}
    	
    	soft.assertEquals(Name, UiName,"Issue In verifyEmployerName");
    }
    
    public void clickOnEmpLinkByName(String Name) throws InterruptedException
    {
    	System.out.println("");
    	String UiName = null;
    	List<WebElement> listpage = getWebElements(By.xpath("//div[@id='ctl00_ctl00_ParentContent_cPH_DvP60Page']//ul/li"));
    	boolean con=listpage.isEmpty();
    	if(con==true)
    	{
    		 List<WebElement> list = getWebElements(By.xpath("//*[@class='border-btm-dotted']"));
    		 for(int i=0;i<=list.size()-1;i++)
    		 {
    			 List<WebElement> list2 = getWebElements(By.xpath("//*[@class='border-btm-dotted']"));
    			 UiName = list2.get(i).getText().trim();
    			 if(UiName.equals(Name))
    			 {
    				 	list2.get(i).click();
    	     	    	Reporter.log("Click On EmployerName : "+Name);
    	     	 		System.out.println("Click On EmployerName : "+Name); 
    	     	 		break;
    			 }
    			 else
    			 {
 	     	 		System.out.println("EmployerName : "+Name);  
    			 }
    			
    		 }
    	}
    	else
    	{
    		boolean found = false;
    		List<WebElement> listpage2 = getWebElements(By.xpath("//div[@id='ctl00_ctl00_ParentContent_cPH_DvP60Page']//ul/li"));
    		int Size=listpage2.size();
    		for(int i=1;i<=Size-2;i++)
    		{
    			
    			if(i!=1)
    			{
    				WebElement nextButton = getWebElement(By.xpath("(//i[@class='fa fa-chevron-right'])[1]"));
        			nextButton.click();	
    			}
    		
    			 List<WebElement> list = getWebElements(By.xpath("//*[@class='border-btm-dotted']"));
        		 for(int p=0;p<list.size()-1;p++)
        		 {
        			 List<WebElement> list2 = getWebElements(By.xpath("//*[@class='border-btm-dotted']"));
        			 UiName = list2.get(p).getText().trim();
        			 if(UiName.equals(Name))
        			 {
        				 	list2.get(p).click();
     	     	    		Reporter.log("Click On EmployerName : "+Name);
     	     	    		System.out.println("Click On EmployerName : "+Name); 
     	     	 		
        	     	 		found = true;
        	     	 		break;
        			 }
        		 }
        		 if (found) {
                     break; // Outer loop ko break karna
                 }
    		}
    	}
    	Thread.sleep(2000);
    	String EmpName = getWebElement(By.xpath("//span[@id='select2-ddlEmployee-container']")).getAttribute("title").trim();
    	soft.assertEquals(EmpName, UiName,"Issue In verify Opened Employer Name");
    }
    
    
    public void GotoMailURL1()

	{
	jsExec.executeScript("window.open()");
	utilities.ChangeWindow.tabswitch(m_Driver);
	m_Driver.get("https://www.disposablemail.com");
	utilities.ChangeWindow.Switchwindow(3, m_Driver);
	System.out.println("GotoMailURL");
	 Reporter.log("GotoMailURL");
	}
    
    public void CopyEmailonTemporary() throws HeadlessException, IOException, AWTException, InterruptedException {
    	   Thread.sleep(8000);//*[@id='mail']

    	   WebElement elem=m_Driver.findElement(By.xpath("//*[@id='home']/div/div[3]/ul/li[1]/a"));
    	   elem.click();
    	   System.out.println("temporary mail"+elem);
    	   utilities.Screenshotcapture.captureAsImage(m_Driver, "CopyEmailonTemporary");

    	}
    
    public String DisposbleEmail() throws InterruptedException {
    	utilities.ChangeWindow.Switchwindow(2, m_Driver);
    	 String Email=Keys.chord(Keys.CONTROL, "v");
    	Reporter.log("ChangestatusInviteToRe_invitestatus");
    	return Email;
    }
    
    
    
    public String VerifyClientInEmail(String Name) throws InterruptedException {
    	utilities.ChangeWindow.tabswitch(m_Driver);
    	m_Driver.get("https://www.disposablemail.com");
    	Thread.sleep(2000);
    	m_Driver.navigate().refresh();
    	m_Driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    	m_Driver.navigate().refresh();

    	jsExec.executeScript("arguments[0].scrollIntoView(true);",
    			m_Driver.findElement(By.xpath("//*[@id='schranka']/tr[1]/td[2]")));
    	jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='schranka']/tr[1]/td[2]")));

    	m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='iframeMail']")));

    	 WebElement DearClient = m_Driver.findElement(By.xpath("//*[contains(text(),'"+Name+"')]"));
    	 String text = DearClient.getText();
    
    	 	System.out.println("Get Client Name :"+text);
    	 	Reporter.log("Get Client Name :"+text);
    		m_Driver.switchTo().defaultContent();
    		utilities.ChangeWindow.tabswitch(m_Driver);
    		Reporter.log("clickPayNowbtnOnEmaiL");
			return text;
    	

    }
    
    public String VerifyClientInEmailInP45(String Name) throws InterruptedException {
    	utilities.ChangeWindow.tabswitch(m_Driver);
    	m_Driver.get("https://www.disposablemail.com");
    	Thread.sleep(2000);
    	m_Driver.navigate().refresh();
    	m_Driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    	m_Driver.navigate().refresh();

    	jsExec.executeScript("arguments[0].scrollIntoView(true);",
    			m_Driver.findElement(By.xpath("//*[@id='schranka']/tr[1]/td[2]")));
    	jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='schranka']/tr[1]/td[2]")));

    	m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='iframeMail']")));

    	 WebElement DearClient = m_Driver.findElement(By.xpath("//*[normalize-space()='"+Name+"']"));
    	 String text = DearClient.getText();
    	
    	 	System.out.println("Get Client Name :"+text);
    	 	Reporter.log("Get Client Name :"+text);
    		m_Driver.switchTo().defaultContent();
    		utilities.ChangeWindow.tabswitch(m_Driver);
    		Reporter.log("clickPayNowbtnOnEmaiL");
			return text;
    	

    }
    
    public String VerifyEmailSubject(String Sub) throws InterruptedException {
    	utilities.ChangeWindow.tabswitch(m_Driver);
    	m_Driver.get("https://www.disposablemail.com");
    	Thread.sleep(2000);
    	m_Driver.navigate().refresh();
    	m_Driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    	m_Driver.navigate().refresh();

    	

    	 WebElement DearClient = m_Driver.findElement(By.xpath("//td[normalize-space()='"+Sub+"']"));
    	 String text = DearClient.getText();
    	
    	 	System.out.println("Get Client Name :"+text);
    	 	Reporter.log("Get Client Name :"+text);
    		m_Driver.switchTo().defaultContent();
    		utilities.ChangeWindow.tabswitch(m_Driver);
    		Reporter.log("clickPayNowbtnOnEmaiL");
			return text;
    	

    }
    
    
    public void AlertThatEmailIdForReleavntEmployeeAreNotAdded(String aMsg) throws InterruptedException
    {
    	Thread.sleep(4000);
    	String AlertMsg = m_Driver.switchTo().alert().getText();
    	soft.assertEquals(aMsg, AlertMsg);
    	System.out.println("Verify Alert Msg :"+AlertMsg);
	 	Reporter.log("Verify Alert Msg :"+AlertMsg);
    	m_Driver.switchTo().alert().accept();
    	System.out.println("Accept Alert ");
	 	Reporter.log("Accept Alert");
    }
    
    
	public void DeleteCSv_PDF()
	{
		try
		{

			File folder = new File(System.getProperty("user.dir")+"\\SonuPDF\\"+"File");
			//List the files on that folder
			File[] listOfFiles = folder.listFiles();
			boolean found = false;
			File f = null;
			     //Look for the file in the files
			     // You should write smart REGEX according to the filename
			     for (File listOfFile : listOfFiles) {
			         if (listOfFile.isFile()) {
			              String fileName = listOfFile.getName();
			               System.out.println("File " + listOfFile.getName());
			               Thread.sleep(2000);
			               if ((new File(System.getProperty("user.dir")+"\\SonuPDF\\"+"\\File\\"+ listOfFile.getName())).delete()) {
			                   System.out.println("Delete");     
			               } 
			            }
			        }
		Assert.assertFalse(found, "Delete document is not found");
		}
		catch (Exception e)
		{
		System.out.println("Issue in Delete CSV = "+e);
		}
	}
	
	
	
	
	public void ReadFullHours_FilletedPDFReportofDividentVoucher(int StartPg,int EndPg, int LineNo, String Amount) throws Exception
	{
		Thread.sleep(2000);
	    File file = new File(System.getProperty("user.dir")+"\\SonuPDF\\"+"\\File\\"+FileName);
	 //   File file = new File("C:\\Jmeter\\down\\Ashish-INVOICE#INV-10253_3.pdf");
	  
	    PDDocument document = PDDocument.load(file);
	    PDFTextStripper pdfStripper = new PDFTextStripper();
	    pdfStripper.setStartPage(1);
	    pdfStripper.setEndPage(1);

	   //load all lines into a string
	    String pages = pdfStripper.getText(document);

		
		System.out.println(pages);
	   //split by detecting newline
	    String[] lines = pages.split("\r\n|\r|\n");

	   int count=0;   //Just to indicate line number
	    for(String temp:lines)
	    {
	        System.out.println(count+" "+temp);
	        count++;
	    }    
		    String Actvalue3 = lines[LineNo];
		    String aa1=Actvalue3.trim();
	  //  String aa2=Act1[3].trim();
	    System.out.println(aa1);
	    String InPDFAmount = aa1;
	    //System.out.println(ActDividentamt);
//	    double EnterAmount = Double.parseDouble(InPDFAmount);
//	    double AcualEnterAmount = Double.parseDouble(Amount);
//		DecimalFormat df = new DecimalFormat("0.00");
//		String AcualAmount = df.format(AcualEnterAmount);
//		String ExpecAmount = df.format(EnterAmount);
	   soft.assertEquals(InPDFAmount, Amount, "Data is not matched in PDF");
	    document.close();
	    Thread.sleep(2000);
//	    if(file.delete()==true);
//	    {    
//	     System.out.println("Test PDF File is deleted");
//	    }
	}
	
	
	public void ReadFullHours_FilletedPDFReportofDividentVoucherForAmount(int StartPg,int EndPg, int LineNo, String Amount) throws Exception
	{
		Thread.sleep(2000);
	    File file = new File(System.getProperty("user.dir")+"\\SonuPDF\\"+"\\File\\"+FileName);
	 //   File file = new File("C:\\Jmeter\\down\\Ashish-INVOICE#INV-10253_3.pdf");
	  
	    PDDocument document = PDDocument.load(file);
	    PDFTextStripper pdfStripper = new PDFTextStripper();
	    pdfStripper.setStartPage(1);
	    pdfStripper.setEndPage(1);

	   //load all lines into a string
	    String pages = pdfStripper.getText(document);

		
		System.out.println(pages);
	   //split by detecting newline
	    String[] lines = pages.split("\r\n|\r|\n");

	   int count=0;   //Just to indicate line number
	    for(String temp:lines)
	    {
	        System.out.println(count+" "+temp);
	        count++;
	    }    
		    String Actvalue3 = lines[LineNo];
		    String[] Actvalue4 = Actvalue3.split(" ");
		    String aa1=Actvalue4[0].trim();
	  //  String aa2=Act1[3].trim();
	    System.out.println(aa1);
	    String InPDFAmount = aa1;
	    //System.out.println(ActDividentamt);
//	    double EnterAmount = Double.parseDouble(InPDFAmount);
//	    double AcualEnterAmount = Double.parseDouble(Amount);
//		DecimalFormat df = new DecimalFormat("0.00");
//		String AcualAmount = df.format(AcualEnterAmount);
//		String ExpecAmount = df.format(EnterAmount);
	   soft.assertEquals(InPDFAmount, Amount, "Data is not matched in PDF");
	    document.close();
	    Thread.sleep(2000);
//	    if(file.delete()==true);
//	    {    
//	     System.out.println("Test PDF File is deleted");
//	    }
	}
    
    
	 public void downloadPDFByName(String Name) throws InterruptedException
	    {
	    	System.out.println("");
	    	String UiName = null;
	    	List<WebElement> listpage = getWebElements(By.xpath("//div[@id='ctl00_ctl00_ParentContent_cPH_DvP60Page']//ul/li"));
	    	boolean con=listpage.isEmpty();
	    	if(con==true)
	    	{
	    		 List<WebElement> list = getWebElements(By.xpath("//*[@class='border-btm-dotted']"));
	    		 for(int i=0;i<=list.size()-1;i++)
	    		 {
	    			 List<WebElement> list2 = getWebElements(By.xpath("//*[@class='border-btm-dotted']"));
	    			 UiName = list2.get(i).getText().trim();
	    			 if(UiName.equals(Name))
	    			 {
	    	     	    	Reporter.log("PDF Download By Employer Name : "+Name);
	    	     	 		System.out.println("PDF Download By Employer Name : "+Name); 
	    	     	 		List<WebElement> PDF = getWebElements(By.xpath("//i[@class='fa fa-file-pdf-o']"));
	    	     	 		PDF.get(i).click();
	    	     	 		Thread.sleep(20000);
	    	    			System.out.println("Download PDF File");
	    	    			Reporter.log("Download PDF File");
	    	    			File folder = new File(System.getProperty("user.dir")+"\\SonuPDF\\"+"File");
	    	    			//List the files on that folder
	    	    			//Thread.sleep(5000);
	    	    			File[] listOfFiles = folder.listFiles();
	    	    			boolean found = false;
	    	    			File f = null;
	    	    			     //Look for the file in the files
	    	    			     // You should write smart REGEX according to the filename
	    	    			     for (File listOfFile : listOfFiles) {
	    	    			         if (listOfFile.isFile()) {
	    	    			              String fileName = listOfFile.getName();
	    	    			               System.out.println("File " + listOfFile.getName());
	    	    			               if (fileName.matches(fileName)) {
	    	    			                   f = new File(fileName);
	    	    			                   found = true;
	    	    			                  FileName=fileName;
	    	    			                }
	    	    			            }
	    	    			        }
	    	    			     Assert.assertTrue(found, "Downloaded document is not found");
	    	    			f.deleteOnExit();
	    	    			Thread.sleep(10000);
	    	    			
	    	     	 		break;
	    			 }
	    			 else
	    			 {
	 	     	 		System.out.println("EmployerName : "+Name);  
	    			 }
	    			
	    		 }
	    	}
	    	else
	    	{
	    		boolean found = false;
	    		List<WebElement> listpage2 = getWebElements(By.xpath("//div[@id='ctl00_ctl00_ParentContent_cPH_DvP60Page']//ul/li"));
	    		int Size=listpage2.size();
	    		for(int i=1;i<=Size-2;i++)
	    		{
	    			
	    			if(i!=1)
	    			{
	    				WebElement nextButton = getWebElement(By.xpath("(//i[@class='fa fa-chevron-right'])[1]"));
	        			nextButton.click();	
	    			}
	    		
	    			 List<WebElement> list = getWebElements(By.xpath("//*[@class='border-btm-dotted']"));
	        		 for(int p=0;p<list.size()-1;p++)
	        		 {
	        			 List<WebElement> list2 = getWebElements(By.xpath("//*[@class='border-btm-dotted']"));
	        			 UiName = list2.get(p).getText().trim();
	        			 if(UiName.equals(Name))
	        			 {
	        				 Reporter.log("PDF Download By Employer Name : "+Name);
		    	     	 		System.out.println("PDF Download By Employer Name : "+Name); 
		    	     	 		List<WebElement> PDF = getWebElements(By.xpath("//i[@class='fa fa-file-pdf-o']"));
		    	     	 		PDF.get(p).click();
		    	     	 		Thread.sleep(10000);
		    	    			System.out.println("Download PDF File");
		    	    			Reporter.log("Download PDF File");
		    	    			File folder = new File(System.getProperty("user.dir")+"\\SonuPDF\\"+"File");
		    	    			//List the files on that folder
		    	    			//Thread.sleep(5000);
		    	    			File[] listOfFiles = folder.listFiles();
		    	    			 found = false;
		    	    			File f = null;
		    	    			     //Look for the file in the files
		    	    			     // You should write smart REGEX according to the filename
		    	    			     for (File listOfFile : listOfFiles) {
		    	    			         if (listOfFile.isFile()) {
		    	    			              String fileName = listOfFile.getName();
		    	    			               System.out.println("File " + listOfFile.getName());
		    	    			               if (fileName.matches(fileName)) {
		    	    			                   f = new File(fileName);
		    	    			                   found = true;
		    	    			                  FileName=fileName;
		    	    			                }
		    	    			            }
		    	    			        }
		    	    			     soft.assertTrue(found, "Downloaded document is not found");
		    	    			f.deleteOnExit();
		    	    			Thread.sleep(5000);
		    	     	 		break;
	        			 }
	        		 }
	        		 if (found) {
	                     break; // Outer loop ko break karna
	                 }
	    		}
	    	}
	    	
	    	soft.assertEquals(Name, UiName,"Issue In verifyEmployerName");
	    }
    
    
    
	  public void veifyAllColumnDataByName(String Name,String ColumnName,String ColumnData)
	    {
	    	System.out.println("");
	    	String UiName = null;
	    	List<WebElement> listpage = getWebElements(By.xpath("//div[@id='ctl00_ctl00_ParentContent_cPH_DvP60Page']//ul/li"));
	    	boolean con=listpage.isEmpty();
	    	if(con==true)
	    	{
	    		 List<WebElement> list = getWebElements(By.xpath("//*[@class='border-btm-dotted']"));
	    		 for(int i=0;i<=list.size()-1;i++)
	    		 {
	    			 List<WebElement> list2 = getWebElements(By.xpath("//*[@class='border-btm-dotted']"));
	    			 UiName = list2.get(i).getText().trim();
	    			 soft.assertEquals(Name, UiName,"Emp Name is not getting matched");
	    				Reporter.log("Verify Emp Name : "+Name +"  :  "+UiName);
    	     	 		System.out.println("Verify Emp Name : "+Name+"  :  "+UiName); 
//	    			 if(UiName.equals(Name))
//	    			 {
	    				 if("Department".equals(ColumnName))
	    				 {
	    					 	List<WebElement> DeparmentList = getWebElements(By.xpath("//td[@class='align-left'][2]"));
	    					 	String DName = DeparmentList.get(i).getText();
		    				 	soft.assertEquals(ColumnData, DName,"Deparment Name is not getting matched");
		    				 	Reporter.log("Verify Department Name : "+DName);
		    	     	 		System.out.println("Verify Department Name : "+DName); 
		    				 break;
	    				 }
	    				 if("Works No".equals(ColumnName))
	    				 {
	    					 	List<WebElement> WorkNoList = getWebElements(By.xpath("//td[@class='align-left'][3]"));
	    					 	String WName = WorkNoList.get(i).getText();
		    				 	soft.assertEquals(ColumnData, WName,"Works No Name is not getting matched");
		    				 	Reporter.log("Verify Works No : "+WName);
		    	     	 		System.out.println("Verify Works No : "+WName); 
		    				 break;
	    				 }
	    				 if("National Insurance No".equals(ColumnName))
	    				 {
	    					 	List<WebElement> NIList = getWebElements(By.xpath("//td[@class='align-left'][4]"));
	    					 	String NINo = NIList.get(i).getText();
		    				 	soft.assertEquals(ColumnData, NINo,"National Insurance No Name is not getting matched");
		    				 	Reporter.log("Verify National Insurance No : "+NINo);
		    	     	 		System.out.println("Verify National Insurance No : "+NINo); 
		    				 break;
	    				 }
	    				 
	    				 
	    	     	    	
	    	     	 		
	    			// }
	    			 else
	    			 {
	 	     	 		System.out.println("EmployerName : "+Name);  
	    			 }
	    			
	    		 }
	    	}
	    	else
	    	{
	    		boolean found = false;
	    		List<WebElement> listpage2 = getWebElements(By.xpath("//div[@id='ctl00_ctl00_ParentContent_cPH_DvP60Page']//ul/li"));
	    		int Size=listpage2.size();
	    		for(int i=1;i<=Size-2;i++)
	    		{
	    			
	    			if(i!=1)
	    			{
	    				WebElement nextButton = getWebElement(By.xpath("(//i[@class='fa fa-chevron-right'])[1]"));
	        			nextButton.click();	
	    			}
	    		
	    			 List<WebElement> list = getWebElements(By.xpath("//*[@class='border-btm-dotted']"));
	        		 for(int p=0;p<list.size()-1;p++)
	        		 {
	        			 List<WebElement> list2 = getWebElements(By.xpath("//*[@class='border-btm-dotted']"));
	        			 UiName = list2.get(p).getText().trim();
	        			 if(UiName.equals(Name))
	        			 {
	        				 if("Department".equals(ColumnName))
		    				 {
		    					 	List<WebElement> DeparmentList = getWebElements(By.xpath("//td[@class='align-left'][2]"));
		    					 	String DName = DeparmentList.get(i).getText();
			    				 	soft.assertEquals(ColumnData, DName,"Deparment Name is not getting matched");
			    				 	Reporter.log("Verify Department Name : "+Name);
			    	     	 		System.out.println("Verify Department Name : "+Name); 
			    				
		    				 }
		    				 if("Works No".equals(ColumnName))
		    				 {
		    					 	List<WebElement> WorkNoList = getWebElements(By.xpath("//td[@class='align-left'][3]"));
		    					 	String WName = WorkNoList.get(i).getText();
			    				 	soft.assertEquals(ColumnData, WName,"Works No Name is not getting matched");
			    				 	Reporter.log("Verify Works No : "+Name);
			    	     	 		System.out.println("Verify Works No : "+Name); 
			    				
		    				 }
		    				 if("National Insurance No".equals(ColumnName))
		    				 {
		    					 	List<WebElement> NIList = getWebElements(By.xpath("//td[@class='align-left'][2]"));
		    					 	String NINo = NIList.get(i).getText();
			    				 	soft.assertEquals(ColumnData, NINo,"National Insurance No Name is not getting matched");
			    				 	Reporter.log("Verify National Insurance No : "+Name);
			    	     	 		System.out.println("Verify National Insurance No : "+Name); 
			    				
		    				 }
		    				 
		    					found = true;
	        	     	 		break;
	        	     	 	
	        			 }
	        		 }
	        		 if (found) {
	                     break; // Outer loop ko break karna
	                 }
	    		}
	    	}
	    	
	    	soft.assertEquals(Name, UiName,"Issue In verifyEmployerName");
	    }
	  
	  
	  public void veifyAllColumnDataByNameInP45Reports(String Name,String ColumnName,String ColumnData)
	    {
	    	System.out.println("");
	    	String UiName = null;
	    	List<WebElement> listpage = getWebElements(By.xpath("//div[@id='ctl00_ctl00_ParentContent_cPH_DvP45Page']//ul/li"));
	    	boolean con=listpage.isEmpty();
	    	if(con==true)
	    	{
	    		 List<WebElement> list = getWebElements(By.xpath("//*[@class='border-btm-dotted']"));
	    		 for(int i=0;i<=list.size()-1;i++)
	    		 {
	    			 List<WebElement> list2 = getWebElements(By.xpath("//*[@class='border-btm-dotted']"));
	    			 UiName = list2.get(i).getText().trim();
	    			 if(UiName.equals(Name))
	    			 {
	    				 if("Department".equals(ColumnName))
	    				 {
	    					 int ii=i+2;
	    					 	List<WebElement> DeparmentList = getWebElements(By.xpath("//*[@id='tblP45']/tbody/tr["+ii+"]/td[3]"));
	    					 	String DName = DeparmentList.get(0).getText();
		    				 	soft.assertEquals(ColumnData, DName,"Deparment Name is not getting matched");
		    				 	Reporter.log("Verify Department Name : "+DName);
		    	     	 		System.out.println("Verify Department Name : "+DName); 
		    				 break;
	    				 }
	    				 if("Works No".equals(ColumnName))
	    				 {
	    					 int ii=i+2;
	    					 	List<WebElement> WorkNoList = getWebElements(By.xpath("//*[@id='tblP45']/tbody/tr["+ii+"]/td[5]"));
	    					 	String WName = WorkNoList.get(0).getText();
		    				 	soft.assertEquals(ColumnData, WName,"Works No Name is not getting matched");
		    				 	Reporter.log("Verify Works No : "+WName);
		    	     	 		System.out.println("Verify Works No : "+WName); 
		    				 break;
	    				 }
	    				 if("National Insurance No".equals(ColumnName))
	    				 {
	    					 int ii=i+2;
	    					 List<WebElement> NIList = getWebElements(By.xpath("//*[@id='tblP45']/tbody/tr["+ii+"]/td[4]"));
	    					 	String NINo = NIList.get(0).getText();
		    				 	soft.assertEquals(ColumnData, NINo,"National Insurance No Name is not getting matched");
		    				 	Reporter.log("Verify National Insurance No : "+NINo);
		    	     	 		System.out.println("Verify National Insurance No : "+NINo); 
		    				 break;
	    				 }
	    				 
	    				 
	    	     	    	
	    	     	 		
	    			 }
	    			 else
	    			 {
	 	     	 		System.out.println("EmployerName : "+Name);  
	    			 }
	    			
	    		 }
	    	}
	    	else
	    	{
	    		boolean found = false;
	    		List<WebElement> listpage2 = getWebElements(By.xpath("//div[@id='ctl00_ctl00_ParentContent_cPH_DvP45Page']//ul/li"));
	    		int Size=listpage2.size();
	    		for(int i=1;i<=Size-2;i++)
	    		{
	    			
	    			if(i!=1)
	    			{
	    				WebElement nextButton = getWebElement(By.xpath("(//i[@class='fa fa-chevron-right'])[1]"));
	        			nextButton.click();	
	    			}
	    		
	    			 List<WebElement> list = getWebElements(By.xpath("//*[@class='border-btm-dotted']"));
	        		 for(int p=0;p<list.size()-1;p++)
	        		 {
	        			 List<WebElement> list2 = getWebElements(By.xpath("//*[@class='border-btm-dotted']"));
	        			 UiName = list2.get(p).getText().trim();
	        			 if(UiName.equals(Name))
	        			 {
	        				 if("Department".equals(ColumnName))
		    				 {
		    					 	List<WebElement> DeparmentList = getWebElements(By.xpath("//td[@class='align-left'][2]"));
		    					 	String DName = DeparmentList.get(i).getText();
			    				 	soft.assertEquals(ColumnData, DName,"Deparment Name is not getting matched");
			    				 	Reporter.log("Verify Department Name : "+Name);
			    	     	 		System.out.println("Verify Department Name : "+Name); 
			    				
		    				 }
		    				 if("Works No".equals(ColumnName))
		    				 {
		    					 	List<WebElement> WorkNoList = getWebElements(By.xpath("//td[@class='align-left'][3]"));
		    					 	String WName = WorkNoList.get(i).getText();
			    				 	soft.assertEquals(ColumnData, WName,"Works No Name is not getting matched");
			    				 	Reporter.log("Verify Works No : "+Name);
			    	     	 		System.out.println("Verify Works No : "+Name); 
			    				
		    				 }
		    				 if("National Insurance No".equals(ColumnName))
		    				 {
		    					 	List<WebElement> NIList = getWebElements(By.xpath("//td[@class='align-left'][2]"));
		    					 	String NINo = NIList.get(i).getText();
			    				 	soft.assertEquals(ColumnData, NINo,"National Insurance No Name is not getting matched");
			    				 	Reporter.log("Verify National Insurance No : "+Name);
			    	     	 		System.out.println("Verify National Insurance No : "+Name); 
			    				
		    				 }
		    				 
		    					found = true;
	        	     	 		break;
	        	     	 	
	        			 }
	        		 }
	        		 if (found) {
	                     break; // Outer loop ko break karna
	                 }
	    		}
	    	}
	    	
	    	soft.assertEquals(Name, UiName,"Issue In verifyEmployerName");
	    }
    
    
	  public void clickOnEmpLinkByNameInDashboard(String Name) throws InterruptedException
	    {
	    	System.out.println("");
	    	String UiName = null;
	    	List<WebElement> listpage = getWebElements(By.xpath("//div[@class='paginationInner clearfix']//ul/li"));
	    	boolean con=listpage.isEmpty();
	    	if(con==true)
	    	{
	    		 List<WebElement> list = getWebElements(By.xpath("//*[@class='border-btm-dotted grid-action-link']"));
	    		 for(int i=0;i<=list.size()-1;i++)
	    		 {
	    			 List<WebElement> list2 = getWebElements(By.xpath("//*[@class='border-btm-dotted grid-action-link']"));
	    			 UiName = list2.get(i).getText().trim();
	    			 if(UiName.equals(Name))
	    			 {
	    				 	list2.get(i).click();
	    	     	    	Reporter.log("Click On EmployerName : "+Name);
	    	     	 		System.out.println("Click On EmployerName : "+Name); 
	    	     	 		
	    	     	 		WebElement EditEmployeeButton = getWebElement(By.xpath("//a[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefEditEmployee']"));
	    	     	 		EditEmployeeButton.click();
	    	     	 		Reporter.log("Click On Edit Employer");
	    	     	 		System.out.println("Click On Edit Employer"); 
	    	     	 		break;
	    			 }
	    			 else
	    			 {
	 	     	 		System.out.println("EmployerName : "+Name);  
	    			 }
	    			
	    		 }
	    	}
	    	else
	    	{
	    		boolean found = false;
	    		List<WebElement> listpage2 = getWebElements(By.xpath("//div[@class='paginationInner clearfix']//ul/li"));
	    		int Size=listpage2.size();
	    		for(int i=1;i<=Size-2;i++)
	    		{
	    			
	    			if(i!=1)
	    			{
	    				WebElement nextButton = getWebElement(By.xpath("(//i[@class='fa fa-chevron-right'])[1]"));
	        			nextButton.click();	
	    			}
	    		
	    			 List<WebElement> list = getWebElements(By.xpath("//*[@class='border-btm-dotted']"));
	        		 for(int p=0;p<list.size()-1;p++)
	        		 {
	        			 List<WebElement> list2 = getWebElements(By.xpath("//*[@class='border-btm-dotted']"));
	        			 UiName = list2.get(p).getText().trim();
	        			 if(UiName.equals(Name))
	        			 {
	        				 	list2.get(p).click();
	     	     	    		Reporter.log("Click On EmployerName : "+Name);
	     	     	    		System.out.println("Click On EmployerName : "+Name); 
	     	     	    		
	     	     	    		WebElement EditEmployeeButton = getWebElement(By.xpath("//a[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefEditEmployee']"));
		    	     	 		EditEmployeeButton.click();
		    	     	 		Reporter.log("Click On Edit Employer");
		    	     	 		System.out.println("Click On Edit Employer"); 
	     	     	 		
	        	     	 		found = true;
	        	     	 		break;
	        			 }
	        		 }
	        		 if (found) {
	                     break; // Outer loop ko break karna
	                 }
	    		}
	    	}
	    	Thread.sleep(2000);
	    	String EmpName = getWebElement(By.xpath("//span[@id='select2-ddlEmployee-container']")).getAttribute("title").trim();
	    	soft.assertEquals(EmpName, UiName,"Issue In verify Opened Employer Name");
	    }
    
	  public void clickOnEmpLinkByNameInDashboardWithoutEdit(String Name) throws InterruptedException
	    {
	    	System.out.println("");
	    	String UiName = null;
	    	List<WebElement> listpage = getWebElements(By.xpath("//div[@class='paginationInner clearfix']//ul/li"));
	    	boolean con=listpage.isEmpty();
	    	if(con==true)
	    	{
	    		 List<WebElement> list = getWebElements(By.xpath("//*[@class='border-btm-dotted grid-action-link']"));
	    		 for(int i=0;i<=list.size()-1;i++)
	    		 {
	    			 List<WebElement> list2 = getWebElements(By.xpath("//*[@class='border-btm-dotted grid-action-link']"));
	    			 UiName = list2.get(i).getText().trim();
	    			 if(UiName.equals(Name))
	    			 {
	    				 	list2.get(i).click();
	    	     	    	Reporter.log("Click On EmployerName : "+Name);
	    	     	 		System.out.println("Click On EmployerName : "+Name); 
	    	     	 		
//	    	     	 		WebElement EditEmployeeButton = getWebElement(By.xpath("//a[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefEditEmployee']"));
//	    	     	 		EditEmployeeButton.click();
//	    	     	 		Reporter.log("Click On Edit Employer");
//	    	     	 		System.out.println("Click On Edit Employer"); 
	    	     	 		break;
	    			 }
	    			 else
	    			 {
	 	     	 		System.out.println("EmployerName : "+Name);  
	    			 }
	    			
	    		 }
	    	}
	    	else
	    	{
	    		boolean found = false;
	    		List<WebElement> listpage2 = getWebElements(By.xpath("//div[@class='paginationInner clearfix']//ul/li"));
	    		int Size=listpage2.size();
	    		for(int i=1;i<=Size-2;i++)
	    		{
	    			
	    			if(i!=1)
	    			{
	    				WebElement nextButton = getWebElement(By.xpath("(//i[@class='fa fa-chevron-right'])[1]"));
	        			nextButton.click();	
	    			}
	    		
	    			 List<WebElement> list = getWebElements(By.xpath("//*[@class='border-btm-dotted grid-action-link']"));
	        		 for(int p=0;p<list.size()-1;p++)
	        		 {
	        			 List<WebElement> list2 = getWebElements(By.xpath("//*[@class='border-btm-dotted grid-action-link']"));
	        			 UiName = list2.get(p).getText().trim();
	        			 if(UiName.equals(Name))
	        			 {
	        				 	list2.get(p).click();
	     	     	    		Reporter.log("Click On EmployerName : "+Name);
	     	     	    		System.out.println("Click On EmployerName : "+Name); 
	     	     	    		
//	     	     	    		WebElement EditEmployeeButton = getWebElement(By.xpath("//a[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefEditEmployee']"));
//		    	     	 		EditEmployeeButton.click();
//		    	     	 		Reporter.log("Click On Edit Employer");
//		    	     	 		System.out.println("Click On Edit Employer"); 
	     	     	 		
	        	     	 		found = true;
	        	     	 		break;
	        			 }
	        		 }
	        		 if (found) {
	                     break; // Outer loop ko break karna
	                 }
	    		}
	    	}
	    	Thread.sleep(2000);
//	    	String EmpName = getWebElement(By.xpath("//span[@id='select2-ddlEmployee-container']")).getAttribute("title").trim();
//	    	soft.assertEquals(EmpName, UiName,"Issue In verify Opened Employer Name");
	    }
	  public void selectedEmpInP11Reports(String EmpName)
	  {
		 WebElement elem = getWebElement(By.xpath("//select[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlEmployee']"));
		  Select sl=new Select(elem);
		  sl.selectByVisibleText(EmpName);
		  System.out.println("selectedEmpInP11Reports : "+EmpName);
		  Reporter.log("selectedEmpInP11Reports : "+EmpName);
	  }
	  
	  
	  public String GetDataByIndexInP11Reports(int Index)
	  {
		 List<WebElement> list = getWebElements(By.xpath("//div[normalize-space()='End of Year Summary']/following-sibling::div[1]/div/div/div/div/table/tbody/tr/td"));
		 String Data = list.get(Index).getText().trim();
		  System.out.println("GetDataByIndexInP11Reports : "+Index+" : "+Data);
		  Reporter.log("GetDataByIndexInP11Reports : "+Index+" : "+Data);
		return Data;
		  
	  }
	  
	  
	  

		public void ReadFullPDF_VerifyContains(int StartPg,int EndPg, String Amount) throws Exception
		{
			Thread.sleep(2000);
		    File file = new File(System.getProperty("user.dir")+"\\SonuPDF\\"+"\\File\\"+FileName);
		 //   File file = new File("C:\\Jmeter\\down\\Ashish-INVOICE#INV-10253_3.pdf");
		  
		    PDDocument document = PDDocument.load(file);
		    PDFTextStripper pdfStripper = new PDFTextStripper();
		    pdfStripper.setStartPage(1);
		    pdfStripper.setEndPage(1);

		   //load all lines into a string
		    String pages = pdfStripper.getText(document);

			
			System.out.println(pages);
		   //split by detecting newline
//		    String[] lines = pages.split("\r\n|\r|\n");
//		   int count=0;   //Just to indicate line number
//		    for(String temp:lines)
//		    {
//		        System.out.println(count+" "+temp);
//		        count++;
//		    }    
			
			try {
				String contect = pages.replaceAll("\\n", "-");
				boolean con =contect.contains(Amount);
				   soft.assertTrue(contect.contains(Amount));
				   
			} catch (Exception e) {
				System.out.println(e);
			}
			
//		   Assert.assertEquals(pages.contentEquals(Amount),true, "Data is not matched in PDF");
		    document.close();
		    Thread.sleep(2000);

		}
		
		public void EnterDataInSearchInput(String Data) throws InterruptedException
		{
			WebElement elem = getWebElement(By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPHFilter_search_input']"));
			String selectAll = Keys.chord(Keys.CONTROL, "a");
			elem.sendKeys(selectAll);
			elem.sendKeys(Data);
			 System.out.println("EnterDataInSearchInput : "+Data);
			  Reporter.log("EnterDataInSearchInput : "+Data);
			
			WebElement SearchBtn = getWebElement(By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']"));
			SearchBtn.click();
			Thread.sleep(5000);
			System.out.println("click on Search Btn");
			  Reporter.log("click on Search Btn"+Data);
		}
	  
    public void assertAll()
    {
    	soft.assertAll();
    }
    
}
