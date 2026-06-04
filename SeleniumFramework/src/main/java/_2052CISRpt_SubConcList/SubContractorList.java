package _2052CISRpt_SubConcList;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.BasePage;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

public class SubContractorList extends BasePage {

	public WebElement elem;
	public static String getTemplate;
	public SubContractorList (WebDriver driver)
	{
		super(driver);
	}

	private By Report = By.xpath("//span[text()='Reports']");
	
	private By SubconcList = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_hrefReportSubcontractorList']");
	
	private By Search = By.xpath("//select[@name='ctl00$ctl00$ParentContent$cPHFilter$ddlSearch']");
	
	private By Searchtextbox = By.xpath("//input[@name='ctl00$ctl00$ParentContent$cPHFilter$txtSearch']");
	
	private By Serchbtn = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");
	
	private By ContractorTable = By.xpath("//*[@id='tblContribution']/table/tbody/tr/td/a");
	
	private By Checkboxlist = By.xpath("//body[1]/form[1]/main[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody/tr//input[@type='checkbox']");
	
	private By Email = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cpHeaderRight_LinkButtonEx2']");
	
	private By Sendbtn = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnSave']");
	
	private By CustomrEmailChk = By.xpath("//input[@id='ctl00_ctl00_ParentContent_cpHeaderRight_chkCustomerEmail']");
	
	private By VerifyMsg = By.xpath("//body[1]/form[1]/main[1]/div[1]/div[3]/div[1]/div[1]");
	
	private By Exportcsv = By.xpath("//i[@title='Export Employee Pay Details']");
	
	private By Exportpdf = 	By.xpath("//body[1]/form[1]/main[1]/div[1]/div[3]/div[1]/div[2]/div[1]/a[2]/i[1]");	
	
    private By SubcontractorlistTemplate = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_TPnlEmailTemplate_rptrDisplayRecordsEmail_ctl34_lnkEdit']");

    private By TmplteSavebtn = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_btnSave']");
    
	private By Logo = By.xpath("//body[1]/form[1]/main[1]/header[1]/div[1]/div[2]/ul[1]/li[8]/a[1]/div[2]/span[1]/img[1]");

    private By Emaillog = By.xpath("//a[text()='Email Log']");
    
    private By EmailParagrph = By.xpath("//*[contains(text(),'Dear')]");

    
	/**
 	 * Click click on CIS Reports
     * @name Reports
     */
	public void Click_CISReport()
	{
        
		elem = getWebElement(Report);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_CISReport", "Click_CISReport failed. Unable to locate object: " + Report.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_CISReport", "Click_CISReport failed. Unable to locate object: " + Report.toString());

			Assert.fail("Unable to locate object: " + Report.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_CISReport");

		TestModellerLogger.PassStep(m_Driver, "Click_CISReport");
	}
	
	/**
	 * Click  on SubcontractorList
	* @name SubcontractorList
	*/
	public void Click_SubcontractorList()
	{

	elem = getWebElement(SubconcList);

	if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SubcontractorList", "Click_SubcontractorList failed. Unable to locate object: " + SubconcList.toString());

		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SubcontractorList", "Click_SubcontractorList failed. Unable to locate object: " + SubconcList.toString());

		Assert.fail("Unable to locate object: " + SubconcList.toString());
	}

	elem.click();
	  	

	ExtentReportManager.passStep(m_Driver, "Click_SubcontractorList");

	TestModellerLogger.PassStep(m_Driver, "Click_SubcontractorList");
  }
	
	/**
	 * Select SearchDropdown
	* @throws InterruptedException 
	* @name SearchDropdown
	*/	
	public void Select_SearchDropdown(String Option) throws InterruptedException
	{

	 elem = getWebElement(Search);

	 if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SearchDropdown", "Select_SearchDropdown failed. Unable to locate object: " + Search.toString());

		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SearchDropdown", "Select_SearchDropdown failed. Unable to locate object: " + Search.toString());

		Assert.fail("Unable to locate object: " + Search.toString());
	  }

		Select sele = new Select(elem);
		sele.selectByVisibleText(Option);
		Thread.sleep(2000);

	    ExtentReportManager.passStep(m_Driver, "Select_SearchDropdown");

	    TestModellerLogger.PassStep(m_Driver, "Select_SearchDropdown");
	}
	
	/**
	 *  Enter Name of Subcontractor
	 * @name Search Textbox
	 */
	public void Enter_Searchtextbox(String type)
	{
	    
		elem = getWebElement(Searchtextbox);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Searchtextbox", "Enter_Searchtextbox failed. Unable to locate object: " + Searchtextbox.toString());

			TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Searchtextbox", "Enter_Searchtextbox failed. Unable to locate object: " + Searchtextbox.toString());

			Assert.fail("Unable to locate object: " + Searchtextbox.toString());
	    }
	    
		elem.sendKeys(type);
	      	

		ExtentReportManager.passStep(m_Driver, "Enter_Searchtextbox");

		TestModellerLogger.PassStep(m_Driver, "Enter_Searchtextbox");
	}
	


/**
	 * Edit EmailTemplate
 * @throws InterruptedException 
 * @throws IOException 
 * @throws FileNotFoundException 
 * @name DetailedPayReportTemplate
 */
public void Edit_EmailTemplate() throws InterruptedException, FileNotFoundException, IOException
{
	m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='ctl00_ctl00_ParentContent_cpHeaderRight_txtBody_ctl02_ctl00']")));
    
	/*elem = getWebElement(EmailParagrph);

	if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Edit_EmailTemplate", "Edit_EmailTemplate failed. Unable to locate object: " + EmailParagrph.toString());

		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Edit_EmailTemplate", "Edit_EmailTemplate failed. Unable to locate object: " + EmailParagrph.toString());

		Assert.fail("Unable to locate object: " + EmailParagrph.toString());
    }

	elem.clear();
	Thread.sleep(1000);
	FileReader fr = new FileReader("C:\\Users\\Shiv\\Documents\\EmailTemplate.txt");
	BufferedReader br = new BufferedReader(fr);
	String line = br.readLine();
	while(line!=null) {
			
	elem.sendKeys(line);	
	elem.sendKeys("\n");
	line = br.readLine();
	}
	br.close();
	

	String str = elem.getAttribute("value");
	System.out.println(str);

	
	m_Driver.switchTo().defaultContent();

      	

	ExtentReportManager.passStep(m_Driver, "Edit_EmailTemplate");

	TestModellerLogger.PassStep(m_Driver, "Edit_EmailTemplate");
	*/
}




	

	
	/**
 	 * Click Serchbtn
     * @name Click Serchbtn
     */
	public void Click_Searchbtn()
	{
        
		 elem = getWebElement(Serchbtn);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Searchbtn", "Click_Searchbtn failed. Unable to locate object: " + Serchbtn.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Searchbtn", "Click_Searchbtn failed. Unable to locate object: " + Serchbtn.toString());

			Assert.fail("Unable to locate object: " + Serchbtn.toString());
        }

		elem.click();
		
		
        ExtentReportManager.passStep(m_Driver, "Click_Searchbtn");

		TestModellerLogger.PassStep(m_Driver, "Click_Searchbtn");
	}
	

/**
 * Click click on Click_SummaryPayreptTemplate
 * @throws InterruptedException 
* @name SummaryPayReportTemplate
*/
public void Click_SummaryPayreptTemplate() throws InterruptedException
{
// To get this element Manually click Active+ icon then save for first time for every new client
elem = getWebElement(SubcontractorlistTemplate);

if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SummaryPayreptTemplate", "Click_SummaryPayreptTemplate failed. Unable to locate object: " + SubcontractorlistTemplate.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SummaryPayreptTemplate", "Click_SummaryPayreptTemplate failed. Unable to locate object: " + SubcontractorlistTemplate.toString());

	Assert.fail("Unable to locate object: " + SubcontractorlistTemplate.toString());
}
jsExec.executeScript("window.scrollBy(0,1000)");
Thread.sleep(1000);
elem.click();
  	

ExtentReportManager.passStep(m_Driver, "Click_SummaryPayreptTemplate");

TestModellerLogger.PassStep(m_Driver, "Click_SummaryPayreptTemplate");
}

/**
 * Click Savebtn
* @name Click Savebtn
*/
public void Click_Savebtn()
{

 elem = getWebElement(TmplteSavebtn);

if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Savebtn", "Click_Savebtn failed. Unable to locate object: " + TmplteSavebtn.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Savebtn", "Click_Savebtn failed. Unable to locate object: " + TmplteSavebtn.toString());

	Assert.fail("Unable to locate object: " + TmplteSavebtn.toString());
}

elem.click();


ExtentReportManager.passStep(m_Driver, "Click_Savebtn");

TestModellerLogger.PassStep(m_Driver, "Click_Savebtn");
}

	
	/**
 	 * Click Email btn
     * @name Email
    */
	public void Click_Emailbtn()
	{
        
		 elem = getWebElement(Email);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Emailbtn", "Click_Emailbtn failed. Unable to locate object: " + Email.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Emailbtn", "Click_Emailbtn failed. Unable to locate object: " + Email.toString());

			Assert.fail("Unable to locate object: " + Email.toString());
        }

		elem.click();
		
	ExtentReportManager.passStep(m_Driver, "Click_Emailbtn");

		TestModellerLogger.PassStep(m_Driver, "Click_Emailbtn");
		
	}
/**
 	 * Click Send btn
     * @name Send
    */
	public void Click_Sendbtn() throws InterruptedException
	{
		 elem = getWebElement(Sendbtn);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Sendbtn", "Click_Sendbtn failed. Unable to locate object: " + Sendbtn.toString());

	    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Sendbtn", "Click_Sendbtn failed. Unable to locate object: " + Sendbtn.toString());

				Assert.fail("Unable to locate object: " + Sendbtn.toString());
	        }

			elem.click();
			Thread.sleep(2000);
			
		ExtentReportManager.passStep(m_Driver, "Click_Sendbtn");

			TestModellerLogger.PassStep(m_Driver, "Click_Sendbtn");
				
	}
	
/**
	 * Click_CustomerEmailChkbx
 * @name Click_CustomerEmailChkbx
 */
public void Click_CustomerEmailChkbx()
{
    
	 elem = getWebElement(CustomrEmailChk);

	if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_CustomerEmailChkbx", "Click_CustomerEmailChkbx failed. Unable to locate object: " + CustomrEmailChk.toString());

		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_CustomerEmailChkbx", "Click_CustomerEmailChkbx failed. Unable to locate object: " + CustomrEmailChk.toString());

		Assert.fail("Unable to locate object: " + CustomrEmailChk.toString());
    }

	if(elem.isSelected())
	{
	 System.out.println("Customer Email is already selected");	
	}	
	else
	{	
	elem.click();
	}
	
    ExtentReportManager.passStep(m_Driver, "Click_CustomerEmailChkbx");

	TestModellerLogger.PassStep(m_Driver, "Click_CustomerEmailChkbx");
}

	
	/**
 	 * Click Export to CSV icon
     * @name Download icon
    */
	public void Click_ExptoCSV() throws InterruptedException
	{
		 elem = getWebElement(Exportcsv);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ExptoCSV", "Click_ExptoCSV failed. Unable to locate object: " + Exportcsv.toString());

	    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ExptoCSV", "Click_ExptoCSV failed. Unable to locate object: " + Exportcsv.toString());

				Assert.fail("Unable to locate object: " + Exportcsv.toString());
	        }

			elem.click();
			System.out.println("CSV icon Clicked? "+ elem.isEnabled());
			Thread.sleep(3000);
		ExtentReportManager.passStep(m_Driver, "Click_ExptoCSV");

			TestModellerLogger.PassStep(m_Driver, "Click_ExptoCSV");
				
	}
	
	/**
 	 * Click Export to PDF icon
     * @name PDF icon
    */
	public void Click_ExptoPDF() throws InterruptedException
	{
		 elem = getWebElement(Exportpdf);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ExptoPDF", "Click_ExptoPDF failed. Unable to locate object: " + Exportpdf.toString());

	    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ExptoPDF", "Click_ExptoPDF failed. Unable to locate object: " + Exportpdf.toString());

				Assert.fail("Unable to locate object: " + Exportpdf.toString());
	        }

			elem.click();
			System.out.println("PDF icon Clicked? "+ elem.isEnabled());
			Thread.sleep(3000);
		ExtentReportManager.passStep(m_Driver, "Click_ExptoPDF");

			TestModellerLogger.PassStep(m_Driver, "Click_ExptoPDF");
				
	}

	/**
 	 * Verify Sent Email Alert
	 * @throws Exception 
     * @name Sent Email Alert
    */
	
	public void Verify_SentEmailAlert(String ExpMessage) throws Exception
	{
		 elem = getWebElement(VerifyMsg);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Get_SentEmailAlert", "Get_SentEmailAlert failed. Unable to locate object: " + VerifyMsg.toString());

	    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Get_SentEmailAlert", "Get_SentEmailAlert failed. Unable to locate object: " + VerifyMsg.toString());

				Assert.fail("Unable to locate object: " + VerifyMsg.toString());
	        }
		
		String actMsg = elem.getText();
		String AcualMsg= actMsg.replaceAll("×", "");
		String AA=AcualMsg.trim();
	    System.out.println("The Actual Message is ="+AA);
	    System.out.println("The Expected Message is ="+ExpMessage);
		
	    Assert.assertEquals(AA,ExpMessage,"Alert Message are not matched");
			
		ExtentReportManager.passStep(m_Driver, "Get_SentEmailAlert");

			TestModellerLogger.PassStep(m_Driver, "Get_SentEmailAlert");
				
	}
	
	










/**
	 * Click_ Profile Icon
 * @name Profile Icon
 */
public void Click_ProfileIcon()
{
    
	 elem = getWebElement(Logo);

	if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ProfileIcon", "Click_ProfileIcon failed. Unable to locate object: " + Logo.toString());

		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ProfileIcon", "Click_ProfileIcon failed. Unable to locate object: " + Logo.toString());

		Assert.fail("Unable to locate object: " + Logo.toString());
    }

	elem.click();
	
	
    ExtentReportManager.passStep(m_Driver, "Click_ProfileIcon");

	TestModellerLogger.PassStep(m_Driver, "Click_ProfileIcon");
}

/**
 * Choose Name Checkbox
 * @throws InterruptedException 
 * @name Checkbox
 */
public void Choose_NameCheckbox(int NoOfNames) throws InterruptedException
{
    
	 List<WebElement> chkbxlist = getWebElements(Checkboxlist);

	if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Choose_NameCheckbox", "Choose_NameCheckbox failed. Unable to locate object: " + chkbxlist.toString());

		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Choose_NameCheckbox", "Choose_NameCheckbox failed. Unable to locate object: " + chkbxlist.toString());

		Assert.fail("Unable to locate object: " + Checkboxlist.toString());
    }


     if(NoOfNames<chkbxlist.size())
     {	 
      WebElement ele = chkbxlist.get(NoOfNames);
      ele.click();
      
    }	
   	else
    {
      System.out.println("Invalid count of Names");	
    }	
  
    

	ExtentReportManager.passStep(m_Driver, "Choose_NameCheckbox");

	TestModellerLogger.PassStep(m_Driver, "Choose_NameCheckbox");
}

/**
 * Get Number of Total Records
 * @throws InterruptedException 
 * @name Subcontractor list
 */
public void Get_TotalNoOfRecords() throws InterruptedException
{
	int rows_count =0;
	
	if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_EmailLogs", "Click_EmailLogs failed. Unable to locate object: " + ContractorTable.toString());

		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_EmailLogs", "Click_EmailLogs failed. Unable to locate object: " + ContractorTable.toString());

		Assert.fail("Unable to locate object: " + ContractorTable.toString());
	}
		
	List<WebElement> list=m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div/div[2]/br/following-sibling::a"));
	int size=list.size();
	
    for(int i =1;i<=list.size()-1;i++)
    {
	m_Driver.findElement(By.xpath("//a[text()='"+i+"']")).click();
	List<WebElement> Conclist = getWebElements(ContractorTable);
	
	
		for(WebElement ele:Conclist)
		{
			rows_count++;
		}	
    }

    System.out.println("Total No. of Records = "+rows_count);

	
	ExtentReportManager.passStep(m_Driver, "Get_TotalNoOfRecords");

	TestModellerLogger.PassStep(m_Driver, "Get_TotalNoOfRecords");
}

/**
 * Click_ EmailLogs
* @name Email Logs
*/
public void Click_EmailLogs()
{

 elem = getWebElement(Emaillog);

if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_EmailLogs", "Click_EmailLogs failed. Unable to locate object: " + Emaillog.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_EmailLogs", "Click_EmailLogs failed. Unable to locate object: " + Emaillog.toString());

	Assert.fail("Unable to locate object: " + Emaillog.toString());
}

elem.click();


ExtentReportManager.passStep(m_Driver, "Click_EmailLogs");

TestModellerLogger.PassStep(m_Driver, "Click_EmailLogs");
}

/**
 * Get SubcontractorList EmailTemplate  EmailTemplate from Agent Page
*/
public void Get_SCListEmailTemplate() 
{
 m_Driver.switchTo().frame(getWebElement(By.xpath("//body[1]/form[1]/main[1]/div[6]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/iframe[1]")));

 elem = getWebElement(EmailParagrph);
 if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Get_SCListEmailTemplate", "Get_SCListEmailTemplate failed. Unable to locate object: " + EmailParagrph.toString());

		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Get_SCListEmailTemplate", "Get_SCListEmailTemplate failed. Unable to locate object: " + EmailParagrph.toString());

		Assert.fail("Unable to locate object: " + EmailParagrph.toString());
}
 getTemplate = elem.getText();
 System.out.println(getTemplate);

 m_Driver.switchTo().defaultContent();

 ExtentReportManager.passStep(m_Driver, "Get_SCListEmailTemplate");

 TestModellerLogger.PassStep(m_Driver, "Get_SCListEmailTemplate");
 
}

/**
 * Verify SCList EmailTemplate 
 * @name SubcontractorList EmailTemplate 
	*/
public void Verify_SCListEmailTemplate() 
{
 m_Driver.switchTo().frame(getWebElement(By.xpath("//body[1]/form[1]/main[1]/div[1]/div[3]/header[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/iframe[1]")));

 elem = getWebElement(EmailParagrph);
 if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Verify_SCListEmailTemplate", "Verify_SCListEmailTemplate failed. Unable to locate object: " + EmailParagrph.toString());

		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Verify_SCListEmailTemplate", "Verify_SCListEmailTemplate failed. Unable to locate object: " + EmailParagrph.toString());

		Assert.fail("Unable to locate object: " + EmailParagrph.toString());
}
 String Actualtemplate = elem.getText();
 String Expectedtemplate = getTemplate;
 Assert.assertEquals(Actualtemplate, Expectedtemplate, "Email Templates are not matched");

 m_Driver.switchTo().defaultContent();

 ExtentReportManager.passStep(m_Driver, "Verify_SCListEmailTemplate");

 TestModellerLogger.PassStep(m_Driver, "Verify_SCListEmailTemplate");
 
}
	
	/**
	 * Take Screen shot of Page

	*/
	public void TakeShot(String name) throws Exception
	{
		TakeScreenshot.takeScreenshot(m_Driver, name);	
	}
	

	


}
