package _2051CISRpt_SumryPaytotal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.BasePage;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

public class SummarisedPayTotals extends BasePage {

	public WebElement elem;
	public static String getTemplate;
	public SummarisedPayTotals (WebDriver driver)
	{
		super(driver);
	}

	private By Report = By.xpath("//span[text()='Reports']");
	
	private By Summarypaytotal = By.xpath("//a[contains(text(),'Summarised')]");
	
	private By Name = By.xpath("(//label[text()='Name:'])[2]");
	
	private By NamFilter = By.xpath("//b[@class='caret']");

	private By Updatebtn = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");

	private By FincYer = By.xpath("//select[@name='ctl00$ctl00$ParentContent$cPHFilter$ddlTaxYears']");
	
	private By Columnlist = By.xpath("//body[1]/form[1]/main[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]");
	
	private By Chkboxlist = By.xpath("//body[1]/form[1]/main[1]/div[1]/div[3]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr//input[@type='checkbox']");
	
	private By Email = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cpHeaderRight_LinkButtonEx1']");
	
	private By CustomrEmailChk = By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPHFilter_chkCustomerEmail']");
	
	private By Sendbtn = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSave']");
	
	private By VerifyMsg = By.xpath("//body[1]/form[1]/main[1]/div[1]/div[3]/div[1]/div[1]");
	
	private By Exportcsv = By.xpath("//i[@title='Export Employee Pay Details']");
			
	private By Exportpdf = 	By.xpath("//body[1]/form[1]/main[1]/div[1]/div[3]/div[1]/div[2]/div[1]/a[2]/i[1]");	
	
	private By Logo = By.xpath("//body[1]/form[1]/main[1]/header[1]/div[1]/div[2]/ul[1]/li[8]/a[1]/div[2]/span[1]/img[1]");
	
    private By Emaillog = By.xpath("//a[text()='Email Log']");
    
    private By SumryPayTotalTemplate = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_TPnlEmailTemplate_rptrDisplayRecordsEmail_ctl32_lnkEdit']");
    
    private By EmailParagrph = By.xpath("/html[1]/body[1]/p[1]");
    
    private By TmplteSavebtn = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_btnSave']");
	
	

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
 * Click  on SummarisedPayTotal
 * @name SummarisedPayTotal
 */
public void Click_SummarisedPayTotal()
{
    
	elem = getWebElement(Summarypaytotal);

	if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SummarisedPayTotal", "Click_SummarisedPayTotal failed. Unable to locate object: " + Summarypaytotal.toString());

		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SummarisedPayTotal", "Click_SummarisedPayTotal failed. Unable to locate object: " + Summarypaytotal.toString());

		Assert.fail("Unable to locate object: " + Summarypaytotal.toString());
    }

	elem.click();
      	

	ExtentReportManager.passStep(m_Driver, "Click_SummarisedPayTotal");

	TestModellerLogger.PassStep(m_Driver, "Click_SummarisedPayTotal");
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
    
	elem = getWebElement(EmailParagrph);

	if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Edit_EmailTemplate", "Edit_EmailTemplate failed. Unable to locate object: " + SumryPayTotalTemplate.toString());

		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Edit_EmailTemplate", "Edit_EmailTemplate failed. Unable to locate object: " + SumryPayTotalTemplate.toString());

		Assert.fail("Unable to locate object: " + SumryPayTotalTemplate.toString());
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
}



	/**
 	 * Select FinacialYear
	 * @throws InterruptedException 
     * @name FinacialYear
     */	
	public void Select_FinacialYear(String year) throws InterruptedException
	{
        
		 elem = getWebElement(FincYer);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_FinacialYear", "Select_FinacialYear failed. Unable to locate object: " + FincYer.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_FinacialYear", "Select_FinacialYear failed. Unable to locate object: " + FincYer.toString());

			Assert.fail("Unable to locate object: " + FincYer.toString());
        }

 		Select sele = new Select(elem);
 		sele.selectByVisibleText(year);
 		Thread.sleep(2000);

		ExtentReportManager.passStep(m_Driver, "Select_FinacialYear");

		TestModellerLogger.PassStep(m_Driver, "Select_FinacialYear");
	}
	
	/**
	 * Click  Element Name Text
	 * @throws InterruptedException 
	 * @name Element Name 
	 */
	public void Click_ElementNameText() throws InterruptedException
	{
	    
		elem = getWebElement(Name);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ElementNameText", "Click_ElementNameText failed. Unable to locate object: " + Name.toString());

			TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ElementNameText", "Click_ElementNameText failed. Unable to locate object: " + Name.toString());

			Assert.fail("Unable to locate object: " + Name.toString());
	    }

	    elem.click();

		ExtentReportManager.passStep(m_Driver, "Click_ElementNameText");

		TestModellerLogger.PassStep(m_Driver, "Click_ElementNameText");
	}
	
	/**
 	 * Click Updatebtn
     * @name Click Updatebtn
     */
	public void Click_Updatebtn()
	{
        
		 elem = getWebElement(Updatebtn);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Updatebtn", "Click_Updatebtn failed. Unable to locate object: " + Updatebtn.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Updatebtn", "Click_Updatebtn failed. Unable to locate object: " + Updatebtn.toString());

			Assert.fail("Unable to locate object: " + Updatebtn.toString());
        }

		elem.click();
		
		
        ExtentReportManager.passStep(m_Driver, "Click_Updatebtn");

		TestModellerLogger.PassStep(m_Driver, "Click_Updatebtn");
	}
	

/**
 * Click click on Click_SummaryPayreptTemplate
 * @throws InterruptedException 
* @name SummaryPayReportTemplate
*/
public void Click_SummaryPayreptTemplate() throws InterruptedException
{
// To get this element Manually click Active+ icon then save for first time for every new client
elem = getWebElement(SumryPayTotalTemplate);

if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SummaryPayreptTemplate", "Click_SummaryPayreptTemplate failed. Unable to locate object: " + SumryPayTotalTemplate.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SummaryPayreptTemplate", "Click_SummaryPayreptTemplate failed. Unable to locate object: " + SumryPayTotalTemplate.toString());

	Assert.fail("Unable to locate object: " + SumryPayTotalTemplate.toString());
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
 * Verify Name Filter
* @throws Exception 
* @name Name Filter
*/

public void Verify_Name(String Exptxt) throws Exception
{
 elem = getWebElement(Name);

	if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Verify_Name", "Verify_Name failed. Unable to locate object: " + Name.toString());

		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Verify_Name", "Verify_Name failed. Unable to locate object: " + Name.toString());

		Assert.fail("Unable to locate object: " + Name.toString());
    }
if(elem.isDisplayed()){
String act = elem.getText();
String Acualtxt = act.replace(":","");
System.out.println("The Actual Text is ="+Acualtxt);


System.out.println("The Expected Text is ="+Exptxt);

Assert.assertEquals(Acualtxt,Exptxt,"Element Text are not matched");
	
ExtentReportManager.passStep(m_Driver, "Verify_Name");

	TestModellerLogger.PassStep(m_Driver, "Verify_Name");
}				
}

/**
 * Select All in Name Filter By default
* @throws InterruptedException 
* @name Name Filter
*/
public void VerifyAllSelected() throws InterruptedException
{

 elem = getWebElement(NamFilter);
 elem.click();

if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "VerifyAllSelected", "VerifyAllSelected failed. Unable to locate object: " + NamFilter.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "VerifyAllSelected", "VerifyAllSelected failed. Unable to locate object: " + NamFilter.toString());

	Assert.fail("Unable to locate object: " + NamFilter.toString());
}

elem = m_Driver.findElement(By.xpath("//label[text()=' All']"));
elem.click();
Thread.sleep(1000);
elem = getWebElement(Name);
elem.click();
Thread.sleep(1000);
m_Driver.navigate().refresh();
Thread.sleep(2000);
ExtentReportManager.passStep(m_Driver, "VerifyAllSelected");

TestModellerLogger.PassStep(m_Driver, "VerifyAllSelected");
}

/**
 * Select All in Name Filter By default
* @throws InterruptedException 
* @name Name Filter
*/
public void MultipleSubConc_Selected(int NoOfSubConc) throws InterruptedException
{

 elem = getWebElement(NamFilter);
 elem.click();

if (elem == null) {
	ExtentReportManager.failStepWithScreenshot(m_Driver, "VerifyAllSelected", "VerifyAllSelected failed. Unable to locate object: " + NamFilter.toString());

	TestModellerLogger.FailStepWithScreenshot(m_Driver, "VerifyAllSelected", "VerifyAllSelected failed. Unable to locate object: " + NamFilter.toString());

	Assert.fail("Unable to locate object: " + NamFilter.toString());
}

List<WebElement> SClist = m_Driver.findElements(By.xpath("//body[1]/form[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/span[1]/div[1]/ul[1]/li/a[1]/label/input"));
if(NoOfSubConc<SClist.size())
{	 
 WebElement ele0 = SClist.get(0);
 ele0.click();
 for(int i=1;i<NoOfSubConc;i++)
 {
	 SClist.get(i).click();
 }

 }	
	else
{
 System.out.println("Invalid count of Sub-Contractor");	
}	
	

ExtentReportManager.passStep(m_Driver, "VerifyAllSelected");

TestModellerLogger.PassStep(m_Driver, "VerifyAllSelected");
}

/**
 * Verify Column List
* @throws Exception 
* @name Columns 
*/

public void Verify_ColumnList() 
{
 elem = getWebElement(Columnlist);

	if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Verify_ColumnList", "Verify_ColumnList failed. Unable to locate object: " + Columnlist.toString());

		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Verify_ColumnList", "Verify_ColumnList failed. Unable to locate object: " + Columnlist.toString());

		Assert.fail("Unable to locate object: " + Columnlist.toString());
    }

if(elem.isDisplayed())
{	
System.out.println(elem.getText());
}
else
{
  System.out.println("Column List seems to be not updated"); 	
}	
	
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
    
	 List<WebElement> chkbxlist = getWebElements(Chkboxlist);

	if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Choose_NameCheckbox", "Choose_NameCheckbox failed. Unable to locate object: " + chkbxlist.toString());

		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Choose_NameCheckbox", "Choose_NameCheckbox failed. Unable to locate object: " + chkbxlist.toString());

		Assert.fail("Unable to locate object: " + chkbxlist.toString());
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
 * Get SummaraisedPayTotal EmailTemplate from Agent Page
*/
public void Get_SPTEmailTemplate() 
{
 m_Driver.switchTo().frame(getWebElement(By.xpath("//body[1]/form[1]/main[1]/div[6]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/iframe[1]")));

 elem = getWebElement(EmailParagrph);
 if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Get_SPTEmailTemplate", "Get_SPTEmailTemplate failed. Unable to locate object: " + EmailParagrph.toString());

		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Get_SPTEmailTemplate", "Get_SPTEmailTemplate failed. Unable to locate object: " + EmailParagrph.toString());

		Assert.fail("Unable to locate object: " + EmailParagrph.toString());
}
 getTemplate = elem.getText();
 System.out.println(getTemplate);

 m_Driver.switchTo().defaultContent();

 ExtentReportManager.passStep(m_Driver, "Get_SPTEmailTemplate");

 TestModellerLogger.PassStep(m_Driver, "Get_SPTEmailTemplate");
 
}

/**
 * Verify SPT EmailTemplate 
 * @name SummaraisedPayTotal EmailTemplate 
	*/
public void Verify_SPTEmailTemplate() 
{
 m_Driver.switchTo().frame(getWebElement(By.xpath("//body[1]/form[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/iframe[1]")));

 elem = getWebElement(EmailParagrph);
 if (elem == null) {
		ExtentReportManager.failStepWithScreenshot(m_Driver, "Verify_SPTEmailTemplate", "Verify_SPTEmailTemplate failed. Unable to locate object: " + EmailParagrph.toString());

		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Verify_SPTEmailTemplate", "Verify_SPTEmailTemplate failed. Unable to locate object: " + EmailParagrph.toString());

		Assert.fail("Unable to locate object: " + EmailParagrph.toString());
}
 String Actualtemplate = elem.getText();
 String Expectedtemplate = getTemplate;
 Assert.assertEquals(Actualtemplate, Expectedtemplate, "Email Templates are not matched");

 m_Driver.switchTo().defaultContent();

 ExtentReportManager.passStep(m_Driver, "Verify_SPTEmailTemplate");

 TestModellerLogger.PassStep(m_Driver, "Verify_SPTEmailTemplate");
 
}
	
	/**
	 * Take Screen shot of Email Alert

	*/
	public void TakeShot(String name) throws Exception
	{
		TakeScreenshot.takeScreenshot(m_Driver, name);	
	}
	

}
