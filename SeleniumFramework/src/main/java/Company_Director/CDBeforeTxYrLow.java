package Company_Director;

import pages.BasePage;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.io.StringReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;

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
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/5b770965-4152-4d59-be83-9e08d74c5fe7
@TestModellerModule(guid = "5b770965-4152-4d59-be83-9e08d74c5fe7")
public class CDBeforeTxYrLow extends BasePage
{
	WebElement textArea1;
	double LELAmount;
	double PTAmount;
	double UELAmount;
	
	public CDBeforeTxYrLow (WebDriver driver)
	{
		super(driver);
	}


	
	private By gotoReportsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefReports']");

	private By clickP11Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefReportP11']");

	private By getLELAmountElem = By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div/div/div[2]/table/tbody/tr[14]/td[3]");

	private By getPTAmountElem = By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div/div/div[2]/table/tbody/tr[14]/td[4]");

	private By getUELAmountElem = By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div/div/div[2]/table/tbody/tr[14]/td[5]");

	private By gotoFiling_ManagementElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefFilingMangment']");

//	private By clickFPSElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl12_lnkTaxReturnType']");
	
	private By getXMLDataElem = By.xpath("//TEXTAREA[@name='ctl00$ctl00$ParentContent$cPH$txtData']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportP11.aspx?PayrollCompanyCode=12046");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportP11.aspx?PayrollCompanyCode=12046");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportP11.aspx?PayrollCompanyCode=12046");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportP11.aspx?PayrollCompanyCode=12046";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportP11.aspx?PayrollCompanyCode=12046")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
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
 	 * Click clickP11
     * @name Click clickP11
     */
	public void Click_clickP11()
	{
        
		WebElement elem = getWebElement(clickP11Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickP11", "Click_clickP11 failed. Unable to locate object: " + clickP11Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickP11", "Click_clickP11 failed. Unable to locate object: " + clickP11Elem.toString());

			Assert.fail("Unable to locate object: " + clickP11Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickP11");

		TestModellerLogger.PassStep(m_Driver, "Click_clickP11");
	}


	/**
 	 * Click getLELAmount
     * @name Click getLELAmount
     */
	public void Click_getLELAmount()
	{
        
		WebElement elem = getWebElement(getLELAmountElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getLELAmount", "Click_getLELAmount failed. Unable to locate object: " + getLELAmountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getLELAmount", "Click_getLELAmount failed. Unable to locate object: " + getLELAmountElem.toString());

			Assert.fail("Unable to locate object: " + getLELAmountElem.toString());
        }

		String Lel=elem.getText();
		
		
//converting to float from string
		
		String Lelstr=Lel.replaceAll("[£]", "");
			   Lelstr=Lelstr.replaceAll("[,]", "");
      	
  		 LELAmount = Double.parseDouble(Lelstr);
  		System.out.println("This is LELAmount="+LELAmount);
  		
  		double LEL_During_TaxYr_2021_22=6240.0;
  		
  	//	assertThat(null, null);
  		
  		boolean b=false;
  		if(LELAmount<=LEL_During_TaxYr_2021_22)
  		{
  			b=true;
  		}
  		else
  		{
  			System.out.println("Expected"+LEL_During_TaxYr_2021_22+"but found"+LELAmount);
  		}
  		
  		assertTrue(b);
          	

		ExtentReportManager.passStep(m_Driver, "Click_getLELAmount");

		TestModellerLogger.PassStep(m_Driver, "Click_getLELAmount");
	}

     
	/**
 	 * Click getPTAmount
     * @name Click getPTAmount
     */
	public void Click_getPTAmount()
	{
        
		WebElement elem = getWebElement(getPTAmountElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getPTAmount", "Click_getPTAmount failed. Unable to locate object: " + getPTAmountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getPTAmount", "Click_getPTAmount failed. Unable to locate object: " + getPTAmountElem.toString());

			Assert.fail("Unable to locate object: " + getPTAmountElem.toString());
        }

		String PT=elem.getText();
		
		
//converting to float number from string
		
		String PTstr=PT.replaceAll("[£]", "");
		       PTstr=PTstr.replaceAll("[,]", "");
	
		   PTAmount = Double.parseDouble(PTstr);
		   System.out.println("This is PTAmount="+PTAmount);
		   
		   
			double PT_During_TaxYr_2021_22=9568.0-6240.0;
	  		
		  	//	assertThat(null, null);
		  		
		  		boolean b=false;
		  		if(PTAmount<=PT_During_TaxYr_2021_22)
		  		{
		  			b=true;
		  		}
		  		else
		  		{
		  			System.out.println("Expected"+PT_During_TaxYr_2021_22+"but found"+PTAmount);
		  		}
		  		
		  		
		   
          	

		ExtentReportManager.passStep(m_Driver, "Click_getPTAmount");

		TestModellerLogger.PassStep(m_Driver, "Click_getPTAmount");
	}

     
	/**
 	 * Click getUELAmount
     * @name Click getUELAmount
     */
	public void Click_getUELAmount()
	{
        
		WebElement elem = getWebElement(getUELAmountElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getUELAmount", "Click_getUELAmount failed. Unable to locate object: " + getUELAmountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getUELAmount", "Click_getUELAmount failed. Unable to locate object: " + getUELAmountElem.toString());

			Assert.fail("Unable to locate object: " + getUELAmountElem.toString());
        }

		String UEL=elem.getText();
		
		
		
//converting to float number from string
		
		String UELstr=UEL.replaceAll("[£]", "");
			   UELstr=UELstr.replaceAll("[,]", "");

	           UELAmount = Double.parseDouble(UELstr);
	           System.out.println("This is UELAmount="+UELAmount);
	           
	           
	           double UEL_During_TaxYr_2021_22=21999.96-9568.0;
		  		
			  	//	assertThat(null, null);
			  		
			  		boolean b=false;
			  		if(UELAmount<=UEL_During_TaxYr_2021_22)
			  		{
			  			b=true;
			  		}
			  		else
			  		{
			  			System.out.println("Expected"+UEL_During_TaxYr_2021_22+"but found"+UELAmount);
			  		}
			  		
			  		assertTrue(b);
		
		jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/header/h2")));
          	

		ExtentReportManager.passStep(m_Driver, "Click_getUELAmount");

		TestModellerLogger.PassStep(m_Driver, "Click_getUELAmount");
	}
	
	
	
	/**
	 * getEE_Contribution above PT
	 * 
	 */
	public void get_ContributionabovePT()
	{
		float abovePTamount=0;
		int length=m_Driver.findElements(By.xpath("//main/div/div[3]/div/div[2]/div/div/div[2]/table/tbody/tr/td[7]")).size();
		for(int i=1;i<length;i++)
		{
			String abovePT=m_Driver.findElement(By.xpath("//main/div/div[3]/div/div[2]/div/div/div[2]/table/tbody/tr/td[7]")).getText();
			abovePT=abovePT.replaceAll("[£]", "");
			abovePT=abovePT.replaceAll("[,]", "");
			
			float PTamount=Float.parseFloat(abovePT);
			abovePTamount=abovePTamount+PTamount;
			
		}
		
		System.out.println("abovePTAmount="+abovePTamount);
		assertEquals(abovePTamount, 0);
	}
	
	/**
	 * Calling Annual Salary
	 * 
	 */
	
	public void CalledAnnualSalary()
	{
		getEMPJoiningDate ob=new getEMPJoiningDate(m_Driver);
		
		double AnnualPay=ob.sendAnnualPay();

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
    	
    	double XMLLELAmount = Double.parseDouble(XMLLELValue);
    	System.out.println("..."+XMLLELAmount);
    	
    	assertEquals(XMLLELAmount, LELAmount);
    	
    	double XMLPTAmount = Double.parseDouble(XMLPTValue);
    	System.out.println("..."+XMLPTAmount);
    	
    	assertEquals(XMLPTAmount, PTAmount);
    	
    	double XMLUELAmount = Double.parseDouble(XMLUELValue);
    	System.out.println("..."+XMLUELValue);
    	
    	assertEquals(XMLUELAmount, UELAmount);
    	
    //	String name = doc.getElementsByTagName("name").item(0).getTextContent();
    	
    	
    	m_Driver.switchTo().defaultContent();
    }
    
    
    /**
     * NILetter and Total Income verification
     * @throws ParserConfigurationException 
     * @throws IOException 
     * @throws SAXException 
     * 
     */
    public void verifyNILetter() throws ParserConfigurationException, SAXException, IOException
    {
    	
    	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));
//    	pages.Library lib=new pages.Library(m_Driver);
    	
    	
    	
    	String xmlText=textArea1.getText();
 
    	
    	double GrossEarninginYr=0;
/*
 * XML Data verification
 *     	
 */
    	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    	DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();

        
    	
    	InputSource src = new InputSource();
    	src.setCharacterStream(new StringReader(xmlText));
    	Document doc = dBuilder.parse(src);
    	
    	NodeList nlist=doc.getElementsByTagName("NIletter");
    	for(int i=0;i<nlist.getLength();i++)
    	{
    	
    	String NIlettertype = doc.getElementsByTagName("NIletter").item(i).getTextContent();
    	System.out.println(NIlettertype);
    	
    	if(i==0)
    	{
    		assertEquals(NIlettertype, "C");
    	}
    	
    	if(i==1)
    	{
    		assertEquals(NIlettertype, "A");
    	}
    	
    	String GrossEarningsForNICsYTD = doc.getElementsByTagName("GrossEarningsForNICsYTD").item(i).getTextContent();
    	
    	double Grossvalue= Double.parseDouble(GrossEarningsForNICsYTD);
    	GrossEarninginYr=GrossEarninginYr+Grossvalue;
    	}
    	
    	System.out.println(GrossEarninginYr);
    	
    	double totalEarninginYear=LELAmount+PTAmount+UELAmount;
    	assertEquals(GrossEarninginYr, totalEarninginYear);
    	
    }
    
    
    

     
//	/**
// 	 * Click clickFPS
//     * @name Click clickFPS
//     */
//	public void Click_clickFPS()
//	{
//        
//		WebElement elem = getWebElement(clickFPSElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickFPS", "Click_clickFPS failed. Unable to locate object: " + clickFPSElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickFPS", "Click_clickFPS failed. Unable to locate object: " + clickFPSElem.toString());
//
//			Assert.fail("Unable to locate object: " + clickFPSElem.toString());
//        }
//
//		elem.click();
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click_clickFPS");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_clickFPS");
//	}
}