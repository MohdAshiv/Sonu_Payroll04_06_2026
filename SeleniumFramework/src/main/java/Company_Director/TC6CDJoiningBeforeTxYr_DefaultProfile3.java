package Company_Director;

import pages.BasePage;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/fb96c477-d712-4508-8219-c2b3949ffe0e
@TestModellerModule(guid = "fb96c477-d712-4508-8219-c2b3949ffe0e")
public class TC6CDJoiningBeforeTxYr_DefaultProfile3 extends BasePage
{
	
	WebElement textArea1;
	double LELAmount=0.0;
	double PTAmount=0.0;
	double UELAmount=0.0;
	static double AnnualPay=0.0;
	
	public TC6CDJoiningBeforeTxYr_DefaultProfile3 (WebDriver driver)
	{
		super(driver);
	}


	
	private By clickPayDetailsElem = By.xpath("//A[contains(text(),'Pay Details')]");

	private By getAnnualSalaryElem = By.xpath("//label[contains(.,'Annual Salary:')]/../div/input");

	private By gotoReportsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefReports']");

	private By click_P60P45P11D_FormsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefReportP60']");

	private By clickP60_PDF_DocumentIconElem = By.xpath("//A[@title='P60 PDF Document']");
	
	private By gotoFiling_ManagementElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefFilingMangment']");

//	private By clickFPSElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl12_lnkTaxReturnType']");
	
	private By getXMLDataElem = By.xpath("//TEXTAREA[@name='ctl00$ctl00$ParentContent$cPH$txtData']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/AccessFiles.aspx?type=P60&id=18783&PayrollCompanyCode=12228&TaxYearCode=8");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/AccessFiles.aspx?type=P60&id=18783&PayrollCompanyCode=12228&TaxYearCode=8");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/AccessFiles.aspx?type=P60&id=18783&PayrollCompanyCode=12228&TaxYearCode=8");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/AccessFiles.aspx?type=P60&id=18783&PayrollCompanyCode=12228&TaxYearCode=8";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/AccessFiles.aspx?type=P60&id=18783&PayrollCompanyCode=12228&TaxYearCode=8")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
   /**
	 * Click clickPayDetails
    * @name Click clickPayDetails
    */
	public void Click_clickPayDetails()
	{
       
		WebElement elem = getWebElement(clickPayDetailsElem);

		if (elem == null) {
   		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickPayDetails", "Click_clickPayDetails failed. Unable to locate object: " + clickPayDetailsElem.toString());

   		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickPayDetails", "Click_clickPayDetails failed. Unable to locate object: " + clickPayDetailsElem.toString());

			Assert.fail("Unable to locate object: " + clickPayDetailsElem.toString());
       }

		elem.click();
         	

		ExtentReportManager.passStep(m_Driver, "Click_clickPayDetails");

		TestModellerLogger.PassStep(m_Driver, "Click_clickPayDetails");
	}

     
	/**
	 * Enter getAnnualSalary
    * @name Enter getAnnualSalary
    */
	public void Enter_getAnnualSalary()
	{
	    
		WebElement elem = getWebElement(getAnnualSalaryElem);

		if (elem == null) {
   		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_getAnnualSalary", "Enter_getAnnualSalary failed. Unable to locate object: " + getAnnualSalaryElem.toString());

   		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_getAnnualSalary", "Enter_getAnnualSalary failed. Unable to locate object: " + getAnnualSalaryElem.toString());

			Assert.fail("Unable to locate object: " + getAnnualSalaryElem.toString());
        }

		String AnnualSalary=elem.getAttribute("value");
		
		System.out.println("Annual Salary="+AnnualSalary);
		
		AnnualPay=Double.parseDouble(AnnualSalary);
		
		
 		ExtentReportManager.passStep(m_Driver, "Enter_getAnnualSalary " + getAnnualSalaryElem);

 		TestModellerLogger.PassStep(m_Driver, "Enter_getAnnualSalary " + getAnnualSalaryElem);
	}

     
	/**
 	 * Click gotoReports
     * @name Click gotoReports
     */
	public void Click_gotoReports()
	{
        
		WebElement elem = getWebElement(gotoReportsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoReports", "Click_gotoReports failed. Unable to locate object: " + gotoReportsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoReports", "Click_gotoReports failed. Unable to locate object: " + gotoReportsElem.toString());

			Assert.fail("Unable to locate object: " + gotoReportsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoReports");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoReports");
	}

     
	/**
 	 * Click click_P60/P45/P11D Forms
     * @name Click click_P60/P45/P11D Forms
     */
	public void Click_click_P60P45P11D_Forms()
	{
        
		WebElement elem = getWebElement(click_P60P45P11D_FormsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_click_P60P45P11D_Forms", "Click_click_P60P45P11D_Forms failed. Unable to locate object: " + click_P60P45P11D_FormsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_click_P60P45P11D_Forms", "Click_click_P60P45P11D_Forms failed. Unable to locate object: " + click_P60P45P11D_FormsElem.toString());

			Assert.fail("Unable to locate object: " + click_P60P45P11D_FormsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_click_P60P45P11D_Forms");

		TestModellerLogger.PassStep(m_Driver, "Click_click_P60P45P11D_Forms");
	}

     
	/**
 	 * Click clickP60 PDF DocumentIcon
     * @name Click clickP60 PDF DocumentIcon
     */
	public void Click_clickP60_PDF_DocumentIcon()
	{
        
		WebElement elem = getWebElement(clickP60_PDF_DocumentIconElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickP60_PDF_DocumentIcon", "Click_clickP60_PDF_DocumentIcon failed. Unable to locate object: " + clickP60_PDF_DocumentIconElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickP60_PDF_DocumentIcon", "Click_clickP60_PDF_DocumentIcon failed. Unable to locate object: " + clickP60_PDF_DocumentIconElem.toString());

			Assert.fail("Unable to locate object: " + clickP60_PDF_DocumentIconElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickP60_PDF_DocumentIcon");

		TestModellerLogger.PassStep(m_Driver, "Click_clickP60_PDF_DocumentIcon");
	}
	
	
	/**
 	 * Click gotoFiling Management
     * @name Click gotoFiling Management
     */
	public void Click_gotoFiling_Management()
	{
        
		WebElement elem = getWebElement(gotoFiling_ManagementElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoFiling_Management", "Click_gotoFiling_Management failed. Unable to locate object: " + gotoFiling_ManagementElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoFiling_Management", "Click_gotoFiling_Management failed. Unable to locate object: " + gotoFiling_ManagementElem.toString());

			Assert.fail("Unable to locate object: " + gotoFiling_ManagementElem.toString());
        }

		elem.click();
		
		int len=m_Driver.findElements(By.xpath("//table/tbody/tr/td[5]")).size();
		
		
		
		for(int i=len;i<=len;i++)
		{
			
			jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")));
			m_Driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).click();
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoFiling_Management");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoFiling_Management");
	}
	
	
	
    
	/**
 	 * Enter getXMLData
     * @name Enter getXMLData
     */
 	public void Enter_getXMLData()
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(getXMLDataElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_getXMLData", "Enter_getXMLData failed. Unable to locate object: " + getXMLDataElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_getXMLData", "Enter_getXMLData failed. Unable to locate object: " + getXMLDataElem.toString());

 			Assert.fail("Unable to locate object: " + getXMLDataElem.toString());
         }

 		elem.click();
 		textArea1=elem;
 //		clickFpselem=elem;
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_getXMLData " + getXMLDataElem);

  		TestModellerLogger.PassStep(m_Driver, "Enter_getXMLData " + getXMLDataElem);
 	}
 	
 	
//Read data from XML File
    public void checkXML() throws ParserConfigurationException, SAXException, IOException 
    {
    	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));
//    	pages.Library lib=new pages.Library(m_Driver);
    	
    	
    	
    	String xmlText=textArea1.getText();
 
    	
    	
/*
 * XML Data verification
 *     	
 */
    	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    	DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();

        
    	
    	InputSource src = new InputSource();
    	src.setCharacterStream(new StringReader(xmlText));
    	Document doc = dBuilder.parse(src);
    	String XMLLELValue = doc.getElementsByTagName("AtLELYTD").item(0).getTextContent();
    	String XMLPTValue = doc.getElementsByTagName("LELtoPTYTD").item(0).getTextContent();
    	String XMLUELValue = doc.getElementsByTagName("PTtoUELYTD").item(0).getTextContent();
    	String GrossEarningForYr = doc.getElementsByTagName("GrossEarningsForNICsYTD").item(0).getTextContent();
    	
    	double XMLLELAmount = Double.parseDouble(XMLLELValue);
    	System.out.println("..."+XMLLELAmount);
    	
    
    	
    	double XMLPTAmount = Double.parseDouble(XMLPTValue);
    	System.out.println("..."+XMLPTAmount);
    	
    
    	
    	double XMLUELAmount = Double.parseDouble(XMLUELValue);
    	System.out.println("..."+XMLUELValue);
    	
  
    	
    	double GrossEarningsForNICsYTD=Double.parseDouble(GrossEarningForYr);
    	System.out.println("GrossEarningsForNICsYTD="+GrossEarningsForNICsYTD);
    	

    	
    	
    //	String name = doc.getElementsByTagName("name").item(0).getTextContent();
    	
    	
    	m_Driver.switchTo().defaultContent();
    }
    
	
	
	
}