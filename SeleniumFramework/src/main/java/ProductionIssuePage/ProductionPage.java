package ProductionIssuePage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import au.com.bytecode.opencsv.CSVReader;
import pages.BasePage;
import pages.reports;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

public class ProductionPage  extends BasePage{

	public ProductionPage(WebDriver driver) {
		super(driver);
		
	}
	
	SoftAssert soft= new SoftAssert();
	static String PDFtext;
	
	
	private By taxpayment= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_hrefReportP32']");
	private By _Reports_Elem = By.linkText("Reports");

    private By employerView= By.xpath("//*[@id='ctl00_ctl00_ParentContent_hrefEmployerDashboard']");
	
    private By employeeName= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[2]/td[1]/a");
	
	private By pdfIcnElem =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_A1']");

	private By csvIcnElem =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnExport']");

	private By selectCheckBox=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ReportEmployeePayHistoryDeatilsUC_rptrDisplayRecords_ctl00_chkGenerate']");
	
    private  By AddSchem=By.xpath("//*[@id='aspnetForm']/main/div/div[3]/header/div/div/div/a");
    
    private By PensionElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPension']/span");
    
    private By viewSchemElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefViewScheme']");
    
    private By editPensionElem= By.xpath("//*[@class='align-center']/preceding::td[@class='align-center']");
    private By deletPensionElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkDelete']");
    
    private By addScheamElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnAddScheme']");
    
    private By viewElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkView']");
    
    private By viewSubmitRtiElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkRunPayroll']");
    
    private By editElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkEdit']");
    
    private By editElemOnSubmit=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkViewEdit1']");

    private By viewEditElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkViewEditNotes']");
    
    private By threedotsElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/div/div/table/tbody/tr[2]/td[21]/div/a");

    private By editElem1=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkEditRunPayroll']");
    
    private By editSubmitRti=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkEditCompany']");

    private By viewEditElem1=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkViewEditNotes1']");

    private By openElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkOpen']");
 
    private By checkBoxElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_chkPayrollCompanyTranCode']");
    		
    private By runPayroll= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnSubmitOnline']");
    
    private By runPayroll1= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_lnkRunPayroll']");
    
    private By threeDotsElem1=By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[2]/div/div[1]/table/tbody/tr[2]/td[18]/div/a");
    
    
    private By threeDotsElem2=By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[2]/div/div/table/tbody/tr[2]/td[22]/div/a");

    private By xml= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkXMLPopup']");
    
    private By accountManagerElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddPrimaryUser']");
    
    private By RunPayrollFilterElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_ddlPayslip']");
    
    private By updateElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");
    
    private By companyNameElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_txtCompanyName']");
    
    private By statusFilter= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlStatusSearch']");
    
    private By submitBtnElem= By.linkText("Submit");
    private By notSubmitElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnDoNotSubmit']");
    
    private By emailbtnElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_lnlBtnEmailOverDues']");
    
    private By undoLastPayroll=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_btnUndoPayroll']");
    
	public void Click_EmployerView() throws InterruptedException
	{
		WebElement elem = getWebElement(employerView);
		
		elem.click();
		Thread.sleep(2000);
		Reporter.log("click Employer View");
		utilities.ChangeWindow.tabswitch(m_Driver);
		Thread.sleep(2000);
		
	}

	/**
 	 * Click  Reports 
	 * @throws InterruptedException 
     * @name Click  Reports 
     */
	public void Click__Reports_() throws InterruptedException
	{
        
		WebElement elem = getWebElement(_Reports_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Reports_", "Click__Reports_ failed. Unable to locate object: " + _Reports_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Reports_", "Click__Reports_ failed. Unable to locate object: " + _Reports_Elem.toString());

			Assert.fail("Unable to locate object: " + _Reports_Elem.toString());
        }

		elem.click();
		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "Click__Reports_");

		TestModellerLogger.PassStep(m_Driver, "Click__Reports_");
		
		Reporter.log("Click Report Section");
	}
	
	
	public void clickEmployee() throws InterruptedException
	{
        
		WebElement elem = getWebElement(employeeName);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEmployee", "clickEmployee failed. Unable to locate object: " + employeeName.toString());


			Assert.fail("Unable to locate object: " + employeeName.toString());
        }

		elem.click();
		Thread.sleep(1000);
          	

		ExtentReportManager.passStep(m_Driver, "clickEmployee");

		
		Reporter.log("Click EmployeeName");
	}
	

	public void clickTaxPayment() throws InterruptedException
	{
        
		WebElement elem = getWebElement(taxpayment);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickTaxPayment", "clickTaxPayment failed. Unable to locate object: " + taxpayment.toString());


			Assert.fail("Unable to locate object: " + employeeName.toString());
        }

		elem.click();
		Thread.sleep(2000);
          	

		ExtentReportManager.passStep(m_Driver, "clickTaxPayment");

		
		Reporter.log("Click TaxPayment");
	}
	
	public void clickPdfICn()
 	{
 	    
 		WebElement elem = getWebElement(pdfIcnElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickPdfICn", "clickPdfICn failed. Unable to locate object: " + pdfIcnElem.toString());


 			Assert.fail("Unable to locate object: " + pdfIcnElem.toString());
         }

 		 elem.click();
 	
  		ExtentReportManager.passStep(m_Driver, "clickPdfICn " + pdfIcnElem);

  		Reporter.log("clickPdfICn");
 	}
	
	public void clickPension()
 	{
 	    
 		WebElement elem = getWebElement(PensionElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickPension", "clickPension failed. Unable to locate object: " + PensionElem.toString());


 			Assert.fail("Unable to locate object: " + PensionElem.toString());
         }

 		 elem.click();
 	
  		ExtentReportManager.passStep(m_Driver, "clickPdfICn " + PensionElem);

  		Reporter.log("clickPension");
 	}
	
	
	
	public void clickEmailBtn()
 	{
 	    
 		WebElement elem = getWebElement(emailbtnElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEmailBtn", "clickEmailBtn failed. Unable to locate object: " + PensionElem.toString());


 			Assert.fail("Unable to locate object: " + emailbtnElem.toString());
         }

 		 elem.click();
 	
  		ExtentReportManager.passStep(m_Driver, "clickEmailBtn " + emailbtnElem);

  		Reporter.log("clickEmailBtn");
 	}
	
	
	
	
	public void Click_SendBtn () throws InterruptedException
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='sendsmsmodalIframe1']")));
		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_chkCompanyEmail']")).click();
		Thread.sleep(1000);
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSave']"));
		
		elem.click();
		m_Driver.switchTo().defaultContent();
	
		Thread.sleep(1000);
		
		
		Reporter.log("Send Email");
	
}
	
	public void clickViewSchem() throws Exception
 	{
 	    
 		WebElement elem = getWebElement(viewSchemElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickViewSchem", "clickViewSchem failed. Unable to locate object: " + viewSchemElem.toString());


 			Assert.fail("Unable to locate object: " + viewSchemElem.toString());
         }

 		 elem.click();
 	
 		 Thread.sleep(2000);
  		ExtentReportManager.passStep(m_Driver, "clickPdfICn " + viewSchemElem);

  		Reporter.log("clickViewSchem");
 	}
	
	public void clickEditPension() throws Exception
 	{
 	    
 		WebElement elem = getWebElement(editPensionElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEditPension", "clickEditPension failed. Unable to locate object: " + editPensionElem.toString());


 			Assert.fail("Unable to locate object: " + editPensionElem.toString());
         }

 		 elem.click();
 		 Thread.sleep(2000);
  		ExtentReportManager.passStep(m_Driver, "clickEditPension " + editPensionElem);

  		Reporter.log("clickEditPension");
 	}
	
	
	public void clickDeletPension() throws Exception
 	{
 	    
 		WebElement elem = getWebElement(deletPensionElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickDeletPension", "clickDeletPension failed. Unable to locate object: " + deletPensionElem.toString());


 			Assert.fail("Unable to locate object: " + deletPensionElem.toString());
         }

 		 elem.click();
 		 Thread.sleep(2000);
  		ExtentReportManager.passStep(m_Driver, "clickDeletPension " + deletPensionElem);

  		Reporter.log("clickDeletPension");
 	}
	
	
	public void clickAddScheam1() throws Exception
 	{
 	    
 		WebElement elem = getWebElement(addScheamElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickAddScheam1", "clickAddScheam1 failed. Unable to locate object: " + deletPensionElem.toString());


 			Assert.fail("Unable to locate object: " + deletPensionElem.toString());
         }

 		 elem.click();
 		 Thread.sleep(2000);
  		ExtentReportManager.passStep(m_Driver, "clickAddScheam1 " + addScheamElem);

  		Reporter.log("clickAddScheam1");
 	}
	
	public void clickcsvICn()
 	{
 	    
 		WebElement elem = getWebElement(csvIcnElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickcsvICn", "clickcsvICn failed. Unable to locate object: " + csvIcnElem.toString());


 			Assert.fail("Unable to locate object: " + csvIcnElem.toString());
         }

 		 elem.click();
 	
  		ExtentReportManager.passStep(m_Driver, "clickcsvICn " + csvIcnElem);
  		Reporter.log("clickcsvICn");
 	}
	
	
	public void clickCheckBox() throws Exception
 	{
 	    
 		WebElement elem = getWebElement(selectCheckBox);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickCheckBox", "clickCheckBox failed. Unable to locate object: " + selectCheckBox.toString());


 			Assert.fail("Unable to locate object: " + selectCheckBox.toString());
         }

 		 elem.click();
 	    Thread.sleep(1000);
  		ExtentReportManager.passStep(m_Driver, "clickCheckBox " + selectCheckBox);

 	}


	
	


	 public void VerifyExportToPdf(String Gross, String NetPay) throws InterruptedException, IOException, AWTException
		{
	    	
		
	    	Thread.sleep(9000);
	   	   Robot robot = new Robot(); 
	        for(int i=0;i<=7;i++)
	        {
	       	 robot.keyPress(KeyEvent.VK_TAB);
	       	 robot.keyRelease(KeyEvent.VK_TAB);
	       	 Thread.sleep(3000);
	        }
	        
	               robot.keyPress(KeyEvent.VK_ENTER);
	      
	                robot.keyRelease(KeyEvent.VK_ENTER);
	                Thread.sleep(4000);
	                
	                utilities.ChangeWindow.Switchwindow(4, m_Driver);
	                
	       		   utilities.TakeScreenshot.Getscreenshot("TC001_ Verify Payslip", "ProductionIsuess", m_Driver);


	          
			File file = new File("C:\\Users\\Sonu\\Downloads\\IndividualEmployeePaySchedule-Mr. Manish Sharma.pdf");
			PDDocument document = PDDocument.load(file);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			PDFtext = pdfStripper.getText(document);
			
			document.close();
			    
			soft.assertTrue(PDFtext.contains(Gross));
			soft.assertTrue(PDFtext.contains(NetPay));
				  
				    if(file.delete())
				    System.out.println("file deleted");
				  
					
			  Reporter.log("Verify Export to PDF");
	          utilities.ChangeWindow.Switchwindow(3, m_Driver);

	  
		}
	 
	 public void VerifyExportToPdf1(String Gross, String NetPay) throws InterruptedException, IOException, AWTException
		{
	    	
		
	    	Thread.sleep(9000);
	   	 
			File file = new File("C:\\Users\\Sonu\\Downloads\\IndividualEmployeePaySchedule-Mr. Manish Sharma.pdf");
			PDDocument document = PDDocument.load(file);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			PDFtext = pdfStripper.getText(document);
			
			document.close();
			    
			soft.assertTrue(PDFtext.contains(Gross));
			soft.assertTrue(PDFtext.contains(NetPay));
				  
				    if(file.delete())
				    System.out.println("file deleted");
				  
					
			  Reporter.log("Verify Export to PDF");
	      
	  
		}
		
	   public void verifyCsvFile(String value) throws IOException, InterruptedException, AWTException {
          
           Thread.sleep(9000);

			CSVReader reader = new CSVReader(
			new FileReader("C:\\Users\\Sonu\\Downloads\\IndividualEmployeePaySchedule-Mr. Manish Sharma.csv"));

			List<String[]> list = reader.readAll();
			System.out.println("Total rows which we have is " + list.size());

			Iterator<String[]> iterator = list.iterator();

			// Iterate all values
			while (iterator.hasNext()) {

				String[] str = iterator.next();

				for (int i = 0; i < str.length; i++) {

					if (str[i].contains(value))

					{

						soft.assertTrue(str[i].contains(value));

						System.out.println("pass");
						break;
					}
				
					
				}
				System.out.println("   ");

			}
			Reporter.log("verify CSVFile");
 

      }
	   
	   
	   
	   public  void clickAddScheam() throws Exception
	   {
			WebElement elem = getWebElement(AddSchem);
		   
		     Actions act= new Actions(m_Driver);
		     act.moveToElement(elem).perform();
		     m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_lnkAddManually']")).click();
		     
		     Thread.sleep(2000);
	   }
	   
	   
	   public void verifyCancelBtn()
	   {
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='AddManuallyPopUpFrame']")));
		   
			WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnCancel']"));
		   
			boolean enabled = elem.isEnabled();
			
		    soft.assertTrue(enabled);
		    
    		 utilities.TakeScreenshot.Getscreenshot("TC003_ Verify CancelBtn", "ProductionIsuess", m_Driver);

		    elem.click();
		    m_Driver.switchTo().defaultContent();
		    Reporter.log("verifyCancelBtn");

	   }
	   
	   
	   
	   
	   
	   public void verifyCancelBtnFromEditBtn()
	   {
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));
		   
			WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnCancel']"));
		   
			boolean enabled = elem.isEnabled();
			
		    soft.assertTrue(enabled);
		    
		    elem.click();
		    m_Driver.switchTo().defaultContent();
		    Reporter.log("verifyCancelBtnFromEditBtn");

	   }
	   
	   
	   
	   public void verifyCancelBtnFromDeletBtn()
	   {
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));
		   
			WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnCancel']"));
		   
			boolean enabled = elem.isEnabled();
			
		    soft.assertTrue(enabled);
		    
		    elem.click();
		    m_Driver.switchTo().defaultContent();
		    Reporter.log("verifyCancelBtnFromDeletBtn");
	   }
	   
	   

	   public void verifyCancelBtnFromAddScheamBtn()
	   {
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));
		   
			WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnCancel']"));
		   
			boolean enabled = elem.isEnabled();
			
		    soft.assertTrue(enabled);
		    
		    elem.click();
		    m_Driver.switchTo().defaultContent();
		    Reporter.log("verifyCancelBtnFromAddScheamBtn");
	   }
	   
	   
	   
	   public void clickNewBtn() throws Exception
	   {
		   
		   
		  WebElement elem = m_Driver.findElement(By.xpath("//*[@class='dropdown btn btn-default bg-seagreen text-white btn-def']/a"));
		   
		  Actions act= new Actions(m_Driver);
		  
		  act.moveToElement(elem).perform();
		
		  
		WebElement submenue = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_lnkNewInvoice']"));
		 
		act.moveToElement(submenue).click().build().perform();
		
		Reporter.log("clickNewBtn");
		  
		  
	   }
	   
	    public void verifyNewInvoicePage()
	    {
	    	
	     boolean elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_divMainContent']/header/h2")).isDisplayed();
	    	   

	     soft.assertTrue(elem);
	     
	     Reporter.log("verifyNewInvoicePage");
	    }
		
    
	       public void verifyAccountOffice(String expectedData)
	       {
	    	   
	    	   String actualData=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_txtAORef']")).getAttribute("value");
	    	   
	    	   System.out.println(actualData);
	    	    soft.  assertEquals(actualData, expectedData);
	    	    
	    	   Reporter.log("verifyAccountOffice");
	    	   
	       }
	       
	       
	       public void verifyUTR(String expectedUTR)
	       {
	   		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_AddContractorFrame']")));

	    	   String actualUtr=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtUtrNo']")).getAttribute("value");
	    	   System.out.println("UTR NO---"+ actualUtr );
	    	   
	    	  soft. assertEquals(actualUtr, actualUtr, "UTR not as expected");
	    	   
	    	   Reporter.log("verifyUTR");
	    	   
	       }
	       
	       
	       public void verifySubContractorUTR(String expectedUTR)
	       {
	   		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

	    	   String actualUtr=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtUTR']")).getAttribute("value");
	    	   System.out.println("UTR NO---"+ actualUtr );
	    	   
	    	  soft. assertEquals(actualUtr, actualUtr, "UTR not as expected");
	    	   
	    	   Reporter.log("verifyUTR");
	    	   
	       }
	       
	       public void verifyAlertMsg(String ExpectedToastMessage)
	       {
		   	  m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='StatusPopUpFrame']")));

		
	    	  String toastMsg= m_Driver.findElement(By.xpath("//*[text()='Error!']")).getText();
	    	   
	    	   System.out.println(toastMsg);
	    	 
	    	soft. assertEquals(toastMsg,ExpectedToastMessage);
	       }
	       
	       
	       
	       public void verifysubContractorAlertMsg(String ExpectedToastMessage)
	       {
		   	  m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

		
	    	  String toastMsg= m_Driver.findElement(By.xpath("//*[text()='Error!']")).getText();
	    	   
	    	   System.out.println(toastMsg);
	    	 
	    	soft. assertEquals(toastMsg,ExpectedToastMessage);
	
	       }
	       
	       
	       public void clickCisSufferd() throws Exception
	       {
	    	   WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_lnkCISSuffered']"));
	    	   elem.click();
	    	   Thread.sleep(2000);
	    	   
	    	   Reporter.log("clickCisSufferd");
	    	   
	    	   
	    	   
	       }
	       
	       
	       public void enterValueSave(String value)
	       {
			  m_Driver.switchTo().frame(getWebElement(By.xpath("(//*[@id='PopUpFrame'])[1]")));

	    	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl05_txtCISSufferedAmount']"));
	    	elem.sendKeys(value);
	    	
	    	WebElement elem1 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']"));
	    	elem1.click();
	    	
	    	m_Driver.switchTo().defaultContent();
	        Reporter.log("enterValueSave");

	    	
	        
	       }
	       
	       
	       
	       public void enterCisUTR(String Utr)
	       {
			   m_Driver.switchTo().frame(getWebElement(By.xpath("(//*[@id='PopUpFrame'])[1]")));
			//   m_Driver.switchTo().frame(getWebElement(By.xpath("(//*[@id='PopUpFrame'])[1]")));

	    	   WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtCompanyUTR']"));
	    	   
	    	   elem.sendKeys(Utr);
		    	m_Driver.switchTo().defaultContent();

	    	   Reporter.log("enterd nUTR");
	    	   
	       }
	       
	       public void verifyCisSufferdUTR(String expectedUTR)
	       {
	   		m_Driver.switchTo().frame(getWebElement(By.xpath("(//*[@id='PopUpFrame'])[1]")));

	    	   String actualUtr=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtCompanyUTR']")).getAttribute("value");
	    	   System.out.println("UTR NO---"+ actualUtr );
	    	   
	    	  soft. assertEquals(actualUtr, actualUtr, "UTR not as expected");
	    	   
	    	   Reporter.log("verifyCisSufferdUTR");
	    	   
	       }
	       
	       
	       
	       
	       
	       
	       public void verifyAlertCisUtr(String expectedAlert) throws Exception
	       {


	    	   WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtCompanyUTR']"));
	    	   
	    	   for(int i=0;i<=4;i++) {  elem.sendKeys(Keys.BACK_SPACE);}
	    	 
	    	    m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnSaveUTR']")).click();
	    	   Thread.sleep(2000);
	    	   
	    	  String actualAlert = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_lblUTRmsg']")).getText();
	    	  System.out.println(actualAlert);
	    	  soft. assertEquals(actualAlert, expectedAlert, "UTR not as expected");

	    	  
		    	m_Driver.switchTo().defaultContent();

	    	   Reporter.log("verifyAlertCisUtr");
	    	   
	       }
	       
	       
	       
	       
	       public void verifyCompanyUTR(String expectedUTR)
	       {

	    	   String actualUtr=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_txtUtrNo']")).getAttribute("value");
	    	   System.out.println("UTR NO---"+ actualUtr );
	    	   
	    	  soft. assertEquals(actualUtr, actualUtr, "UTR not as expected");
	    	   
	    	   Reporter.log("verifyUTR");
	    	   
	       }
	       
	       
	       
	       
	       public void editCompanyUtr() throws Exception
	       {


	    	   WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_txtUtrNo']"));
	    	   
	    	   for(int i=0;i<=4;i++) {  elem.sendKeys(Keys.BACK_SPACE);}
	    	 
	    	    

	    	   Reporter.log("editCompanyUtr");
	    	   
	       }
	       
	       
	       
	       public void verifyCompanyAlertUtr(String expectedAlert) throws Exception
	       {


	    	   
	    	  String actualAlert = m_Driver.findElement(By.xpath("//*[text()='Error!']")).getText();
	    	
	    	  
	    	  System.out.println(actualAlert);
	    	  soft. assertEquals(actualAlert, expectedAlert, "UTR not as expected");

	    	  
		    	

	    	   Reporter.log("verifyCompanyUtr");
	    	   
	       }
	       
	       
	       
	       public void clickCreate() throws Exception
	       {
	   		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrameRefresh']")));

	    	   WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnCreate']"));
	    	   
	    	   
	    	 elem.click();
	    	 Thread.sleep(3000);
	    	 m_Driver.switchTo().defaultContent();
	    	   
	    	 Reporter.log("clickCreate");
	    	
	       }
	       
	       
	       public void enterCreateUTR(String Utr)
	       {
				m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrameRefresh']")));
				m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

				WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtUtrNo']"));

				elem.sendKeys(Utr);
				m_Driver.switchTo().defaultContent();
				m_Driver.switchTo().defaultContent();
				Reporter.log("enterd UTR");
	    	   
	       }
	       
	       
	       
	       public void verifyCreateUTR(String expectedUTR)
	       {
			   m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrameRefresh']")));
				m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

	    	   String actualUtr=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtUtrNo']")).getAttribute("value");
	    	   System.out.println("UTR NO---"+ actualUtr );
	    	   
	    	  soft. assertEquals(actualUtr, actualUtr, "UTR not as expected");
	    	   
	    	   Reporter.log("verifyUTR");
	    	   
	       }
	       
	       
	       public void verifyAlertCreateUtr(String expectedAlert) throws Exception
	       {


	    	   WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtUtrNo']"));
	    	   
	    	   for(int i=0;i<=4;i++) {  elem.sendKeys(Keys.BACK_SPACE);}
	    	 
	    	    m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']")).click();
	    	   Thread.sleep(2000);
	    	   
	    	  String actualAlert = m_Driver.findElement(By.xpath("//*[text()='Error!']")).getText();
	    	  System.out.println(actualAlert);
	    	  soft. assertEquals(actualAlert, expectedAlert, "UTR not as expected");

	    	  
		    	m_Driver.switchTo().defaultContent();

	    	   Reporter.log("verifyAlertCreateUtr");
	    	   
	       }
	       
	       
	   	public void clickviewIcn() throws Exception
	 	{
	 	    
	 		WebElement elem = getWebElement(viewElem);

	 		if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickviewIcn", "clickviewIcn failed. Unable to locate object: " + viewElem.toString());


	 			Assert.fail("Unable to locate object: " + viewElem.toString());
	         }

	 		 elem.click();
	 	
	 		 Thread.sleep(5000);
	  		ExtentReportManager.passStep(m_Driver, "clickviewIcn " + viewElem);
	  		Reporter.log("clickviewIcn");
	 	}
	       
	     
		   	public void clickviewIcn1() throws Exception
		 	{
		 	    
		 		WebElement elem = getWebElement(viewSubmitRtiElem);

		 		if (elem == null) {
		    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickviewIcn1", "clickviewIcn1 failed. Unable to locate object: " + viewSubmitRtiElem.toString());


		 			Assert.fail("Unable to locate object: " + viewSubmitRtiElem.toString());
		         }

		 		 elem.click();
		 	
		 		 Thread.sleep(5000);
		  		ExtentReportManager.passStep(m_Driver, "clickviewIcn " + viewSubmitRtiElem);
		  		Reporter.log("clickviewIcn");
		 	}
	   	
	   	
	   	public void clickEditIcn() throws Exception
	   	
		 	{
	   		
		 		WebElement elem = getWebElement(editElem);

		 		if (elem == null) {
		    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEditIcn", "clickEditIcn failed. Unable to locate object: " + editElem.toString());


		 			Assert.fail("Unable to locate object: " + editElem.toString());
		         }

		 		 elem.click();
		 	
		 		 Thread.sleep(5000);
		  		ExtentReportManager.passStep(m_Driver, "clickEditIcn " + editElem);
		  		Reporter.log("clickEditIcn");
		 	}
		      
	   	
	   	
	   	
	   	public void clickEditIcn1() throws Exception
	   	
		 	{
	   		
		 		WebElement elem = getWebElement(editElemOnSubmit);

		 		if (elem == null) {
		    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEditIcn1", "clickEditIcn failed. Unable to locate object: " + editElemOnSubmit.toString());


		 			Assert.fail("Unable to locate object: " + editElemOnSubmit.toString());
		         }

		 		 elem.click();
		 	
		 		 Thread.sleep(5000);
		  		ExtentReportManager.passStep(m_Driver, "clickEditIcn " + editElemOnSubmit);
		  		Reporter.log("clickEditIcn");
		 	}
		      
	       
		
	       
		
	   	public void clickViewandEditIcn() throws Exception
	   	
		 	{
		 		WebElement elem = getWebElement(viewEditElem);

		 		if (elem == null) {
		    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickViewandEditIcn", "clickViewandEditIcn failed. Unable to locate object: " + viewEditElem.toString());


		 			Assert.fail("Unable to locate object: " + viewEditElem.toString());
		         }

		 		 elem.click();
		 	
		 		 Thread.sleep(5000);
		  		ExtentReportManager.passStep(m_Driver, "clickViewandEditIcn " + viewEditElem);
		  		Reporter.log("clickViewandEditIcn");
		 	}
	   	
	   	
	   	
	   	
		
	   	public void click3Dots() throws Exception
	   	
		 	{
		 		WebElement elem = getWebElement(threedotsElem);

		 		if (elem == null) {
		    		ExtentReportManager.failStepWithScreenshot(m_Driver, "click3Dots", "click3Dots failed. Unable to locate object: " + viewEditElem.toString());


		 			Assert.fail("Unable to locate object: " + threedotsElem.toString());
		         }

		 		 elem.click();
		 	
		 		 Thread.sleep(5000);
		  		ExtentReportManager.passStep(m_Driver, "click3Dots " + threedotsElem);
		  		Reporter.log("click3Dots");
		 	}
	   	
	   	
	 	public void click3Dots1() throws Exception
	   	
	 	{
	 		WebElement elem = getWebElement(threeDotsElem1);

	 		if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "click3Dots1", "click3Dots1 failed. Unable to locate object: " + threeDotsElem1.toString());


	 			Assert.fail("Unable to locate object: " + threeDotsElem1.toString());
	         }

	 		 elem.click();
	 	
	 		 Thread.sleep(2000);
	  		ExtentReportManager.passStep(m_Driver, "click3Dots1 " + threeDotsElem1);
	  		Reporter.log("click3Dots1");
	 	}
		
	 	
public void click3Dots2() throws Exception
	   	
	 	{
	 		WebElement elem = getWebElement(threeDotsElem2);

	 		if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "click3Dots2", "click3Dots2 failed. Unable to locate object: " + threeDotsElem2.toString());


	 			Assert.fail("Unable to locate object: " + threeDotsElem2.toString());
	         }

	 		 elem.click();
	 	
	 		 Thread.sleep(2000);
	  		ExtentReportManager.passStep(m_Driver, "click3Dots1 " + threeDotsElem1);
	  		Reporter.log("click3Dots2");
	 	}

	 	
	   	public void clickEdit() throws Exception
	   	
		 	{
		 		WebElement elem = getWebElement(editElem1);

		 		if (elem == null) {
		    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEdit", "clickEdit failed. Unable to locate object: " + editElem1.toString());


		 			Assert.fail("Unable to locate object: " + editElem1.toString());
		         }

		 		 elem.click();
		 	
		 		 Thread.sleep(5000);
		  		ExtentReportManager.passStep(m_Driver, "clickEdit " + editElem1);
		  		Reporter.log("clickEdit");
		 	}
	   	
	   	
	 	public void clickEdit1() throws Exception
	   	
	 	{
	 		WebElement elem = getWebElement(editSubmitRti);

	 		if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEdit1", "clickEdit1 failed. Unable to locate object: " + editSubmitRti.toString());


	 			Assert.fail("Unable to locate object: " + editSubmitRti.toString());
	         }

	 		 elem.click();
	 	
	 		 Thread.sleep(5000);
	  		ExtentReportManager.passStep(m_Driver, "clickEdit1 " + editSubmitRti);
	  		Reporter.log("clickEdit1");
	 	}
	   	
	  	public void clickViewAndEdit() throws Exception
	   	
	 	{
	 		WebElement elem = getWebElement(viewEditElem1);

	 		if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickViewAndEdit", "clickViewAndEdit failed. Unable to locate object: " + viewEditElem1.toString());


	 			Assert.fail("Unable to locate object: " + viewEditElem1.toString());
	         }

	 		 elem.click();
	 	
	 		 Thread.sleep(5000);
	  		ExtentReportManager.passStep(m_Driver, "clickEdit " + viewEditElem1);
	  		Reporter.log("clickViewAndEdit");
	 	}
   	
	  	
	  	
	  	
        public void clickOpen() throws Exception
	   	
	 	{
	 		WebElement elem = getWebElement(openElem);

	 		if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickOpen", "clickOpen failed. Unable to locate object: " + openElem.toString());


	 			Assert.fail("Unable to locate object: " + openElem.toString());
	         }

	 		 elem.click();
	 	
	 		 Thread.sleep(5000);
	  		ExtentReportManager.passStep(m_Driver, "clickOpen " + openElem);
	  		Reporter.log("clickOpen");
	 	}
   	
        
        public void clickRunPayrollBtn() throws Exception
	   	
    	 	{
    	 		WebElement elem = getWebElement(runPayroll);

    	 		if (elem == null) {
    	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickRunPayrollBtn", "clickRunPayrollBtn failed. Unable to locate object: " + runPayroll.toString());


    	 			Assert.fail("Unable to locate object: " + runPayroll.toString());
    	         }

    	 		 elem.click();
    	 	
    	 		 Thread.sleep(5000);
    	  		ExtentReportManager.passStep(m_Driver, "clickRunPayrollBtn " + runPayroll);
    	  		Reporter.log("clickRunPayrollBtn");
    	 	}
       	
        public void clickRunPayrollBtn1() throws Exception
	   	
	 	{
	 		WebElement elem = getWebElement(runPayroll1);

	 		if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickRunPayrollBtn", "clickRunPayrollBtn failed. Unable to locate object: " + runPayroll1.toString());


	 			Assert.fail("Unable to locate object: " + runPayroll1.toString());
	         }

	 		 elem.click();
	 	
	 		 Thread.sleep(15000);
	  		ExtentReportManager.passStep(m_Driver, "clickRunPayrollBtn " + runPayroll1);
	  		Reporter.log("clickRunPayrollBtn1");
	 	}
        
       public void clickRunPayrollBtn2() throws Exception
	   	
	 	{
	 		WebElement elem = getWebElement(runPayroll1);

	 		if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickRunPayrollBtn", "clickRunPayrollBtn failed. Unable to locate object: " + runPayroll1.toString());


	 			Assert.fail("Unable to locate object: " + runPayroll1.toString());
	         }

	 		 elem.click();
	 	
	 		 Thread.sleep(6000);
	  		ExtentReportManager.passStep(m_Driver, "clickRunPayrollBtn " + runPayroll1);
	  		Reporter.log("clickRunPayrollBtn2");
	 	}
       
       
       public void clickUndoPayroll() throws Exception
	   	
   	 	{
   	 		WebElement elem = getWebElement(undoLastPayroll);

   	 		if (elem == null) {
   	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickUndoPayroll", "clickUndoPayroll failed. Unable to locate object: " + undoLastPayroll.toString());


   	 			Assert.fail("Unable to locate object: " + undoLastPayroll.toString());
   	         }

   	 		 elem.click();
   	 	
   	 		 Thread.sleep(2000);
   	 		 
   	 		 m_Driver.switchTo().alert().accept();
   	 	    Thread.sleep(2000);
   	  		ExtentReportManager.passStep(m_Driver, "clickUndoPayroll " + undoLastPayroll);
   	  		Reporter.log("clickUndoPayroll");
   	 	}

   	
        
        
        public void clickcheckBox1() throws Exception
	   	
	 	{
	 		WebElement elem = getWebElement(checkBoxElem);

	 		if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickcheckBox", "clickcheckBox failed. Unable to locate object: " + checkBoxElem.toString());


	 			Assert.fail("Unable to locate object: " + checkBoxElem.toString());
	         }

	 		 elem.click();
	 	
	 		 Thread.sleep(1000);
	  		ExtentReportManager.passStep(m_Driver, "clickcheckBox " + checkBoxElem);
	  		Reporter.log("clickcheckBox");
	 	}

        
       public void clickXml() throws Exception
	   	
	 	{
	 		WebElement elem = getWebElement(xml);

	 		if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickXml", "clickXml failed. Unable to locate object: " + xml.toString());


	 			Assert.fail("Unable to locate object: " + xml.toString());
	         }

	 		 elem.click();
	 	
	 		 Thread.sleep(5000);
	  		ExtentReportManager.passStep(m_Driver, "clickXml " + xml);
	  		Reporter.log("clickXml");
	 	}
       
       
       
       
       
       public void selectAccountManger(String value) throws Exception
	   	
	 	{
	 		WebElement elem = getWebElement(accountManagerElem);

	 		if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectAccountManger", "selectAccountManger failed. Unable to locate object: " + accountManagerElem.toString());


	 			Assert.fail("Unable to locate object: " + accountManagerElem.toString());
	         }
	 		
	 		Select sel= new Select(elem);
	 		 sel.selectByVisibleText(value);
	 	
	 		 Thread.sleep(3000);
	  		ExtentReportManager.passStep(m_Driver, "selectAccountManger " + accountManagerElem);
	  		Reporter.log("selectAccountManger");
	 	}
       
       
       
       
       public void selectStatusFilter(String value) throws Exception
	   	
	 	{
	 		WebElement elem = getWebElement(statusFilter);

	 		if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectStatusFilter", "selectStatusFilter failed. Unable to locate object: " + statusFilter.toString());


	 			Assert.fail("Unable to locate object: " + statusFilter.toString());
	         }

	 		Select sel= new Select(elem);
	 		sel.selectByVisibleText(value);
	 	
	 		 Thread.sleep(3000);
	  		ExtentReportManager.passStep(m_Driver, "selectStatusFilter " + statusFilter);
	  		Reporter.log("selectStatusFilter");
	 	}
       
       
       
       
       public void clickUpdateBtn() throws Exception
	   	
	 	{
	 		WebElement elem = getWebElement(updateElem);

	 		if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickUpdateBtn", "clickUpdateBtn failed. Unable to locate object: " + updateElem.toString());


	 			Assert.fail("Unable to locate object: " + updateElem.toString());
	         }

	 		 elem.click();
	 	
	 		 Thread.sleep(4000);
	  		ExtentReportManager.passStep(m_Driver, "clickUpdateBtn " + updateElem);
	  		Reporter.log("clickUpdateBtn");
	 	}
       
       
       
       public void clickSubmitBtn() throws Exception
	   	
		{

			try {

				WebElement elem = getWebElement(submitBtnElem);

				if (elem == null) {
					ExtentReportManager.failStepWithScreenshot(m_Driver, "clickSubmitBtn",
							"clickSubmitBtn failed. Unable to locate object: " + submitBtnElem.toString());

					Assert.fail("Unable to locate object: " + submitBtnElem.toString());
				}
				Thread.sleep(3000);
				jsExec.executeScript("arguments[0].click();", elem);

				Thread.sleep(3000);
				ExtentReportManager.passStep(m_Driver, "clickSubmitBtn " + submitBtnElem);

			} catch (Exception e) {
				System.out.println("Issue In clickSubmitBtn" + e);
			}

			Reporter.log("clickSubmitBtn");

		}
       
       public void clickNotToSubmitBtn() throws Exception
	   	
    	 	{
    	 		WebElement elem = getWebElement(notSubmitElem);

    	 		if (elem == null) {
    	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickNotToSubmitBtn", "clickNotToSubmitBtn failed. Unable to locate object: " + notSubmitElem.toString());


    	 			Assert.fail("Unable to locate object: " + notSubmitElem.toString());
    	         }
    	 		jsExec.executeScript("arguments[0].scrollIntoView(true);", elem);
    	 		 elem.click();
    	 		 Thread.sleep(1000);
    	 	
    	 	
    	  		ExtentReportManager.passStep(m_Driver, "clickNotToSubmitBtn " + notSubmitElem);
    	  		Reporter.log("clickNotToSubmitBtn");
    	 	}
       
       
       public void enterTextNotes(String value) throws Exception

       {
    	   
    	   WebElement elem = m_Driver.findElement(By.xpath("//*[@id='txtNotes']"));
	 		jsExec.executeScript("arguments[0].scrollIntoView(true);", elem);

    	   elem.sendKeys(value);
    	   
    	   Thread.sleep(3000);
    	   Reporter.log("enterTextNotes");
    	   
       }
       
       public void enterCompanyName(String value) throws Exception
	   	
	 	{
	 		WebElement elem = getWebElement(companyNameElem);

	 		if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterCompanyName", "enterCompanyName failed. Unable to locate object: " + companyNameElem.toString());


	 			Assert.fail("Unable to locate object: " + companyNameElem.toString());
	         }

	 		 elem.sendKeys(value);
	 	
	 		 Thread.sleep(2000);
	  		ExtentReportManager.passStep(m_Driver, "enterCompanyName " + companyNameElem);
	  		Reporter.log("enterCompanyName");
	 	}
      
       
       
       
       public void selectRunPayrollFilter(String value) throws Exception
	   	
	 	{
	 		WebElement elem = getWebElement(RunPayrollFilterElem);

	 		if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectRunPayrollFilter", "selectRunPayrollFilter failed. Unable to locate object: " + RunPayrollFilterElem.toString());


	 			Assert.fail("Unable to locate object: " + RunPayrollFilterElem.toString());
	         }
	 		
	 		Select sel= new Select(elem);
	 		 sel.selectByVisibleText(value);
	 	
	 		 Thread.sleep(3000);
	  		ExtentReportManager.passStep(m_Driver, "selectRunPayrollFilter " + RunPayrollFilterElem);
	  		Reporter.log("selectRunPayrollFilter");
	 	}


       
       public void enterEmployeeAndSearchBtn(String data) throws InterruptedException {
    	   
    	   
    	   WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_search_input']"));
    	   
    	   elem.sendKeys(data);
    	   
    	   Thread.sleep(1000);
    	   
    	   m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']")).click();
    	   
    	   Thread.sleep(5000);
    	   
       }
       
       
       
 public void assertAll()
    {
    	 
    	soft.assertAll();
    	
     }
	

	

}
