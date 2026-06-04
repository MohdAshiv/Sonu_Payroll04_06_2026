package Company_Director;

import pages.BasePage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;



import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.EmptyFileException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/5b770965-4152-4d59-be83-9e08d74c5fe7
@TestModellerModule(guid = "5b770965-4152-4d59-be83-9e08d74c5fe7")
public class TC14_CD extends BasePage
{
	WebElement textArea1;
	float LELDuringTaxyr = 6240;
	float PTDuringTaxyr = 3328;
//	float UELDuringTaxyr = 0;
	float LELAmount;
	float PTAmount;
	float UELAmount;
	int length;
	float   TotalLELAmount;
	
	public TC14_CD (WebDriver driver)
	{
		super(driver);
	}


	
	private By gotoReportsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefReports']");

	private By clickP11Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefReportP11']");
	
	private By ctl00ctl00ParentContentcPHFilterddlEmployeeElem = By.xpath("//label[contains(.,'Employee :')]/../div/select");

	private By getLELAmountElem = By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div/div/div[2]/table/tbody/tr[13]/td[3]");

	private By getPTAmountElem = By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div/div/div[2]/table/tbody/tr[13]/td[4]");

	private By getUELAmountElem = By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div/div/div[2]/table/tbody/tr[13]/td[5]");

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
		
	//	jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div/div[1]")));
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickP11");

		TestModellerLogger.PassStep(m_Driver, "Click_clickP11");
	}
	
	
	
	
	/**
 	 * Select ctl00$ctl00$ParentContent$cPHFilter$ddlEmployee
     * @name Select ctl00$ctl00$ParentContent$cPHFilter$ddlEmployee
     */
    public void Select_ctl00ctl00ParentContentcPHFilterddlEmployee(String ctl00ctl00ParentContentcPHFilterddlEmployee)
 	{
 	    
 		WebElement elem = getWebElement(ctl00ctl00ParentContentcPHFilterddlEmployeeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlEmployee", "Select_ctl00ctl00ParentContentcPHFilterddlEmployee failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFilterddlEmployeeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlEmployee", "Select_ctl00ctl00ParentContentcPHFilterddlEmployee failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFilterddlEmployeeElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00ctl00ParentContentcPHFilterddlEmployeeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ctl00ctl00ParentContentcPHFilterddlEmployee);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlEmployee " + ctl00ctl00ParentContentcPHFilterddlEmployee);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlEmployee " + ctl00ctl00ParentContentcPHFilterddlEmployee);
 	}

	
	/**
	 * 
	 * finding No of Weeks Reamaining
	 * 
	 */
	
	
	
	
//	/**
//	 * 
//	 * Read PDF Value of LEL,PT,UEL
//	 * 
//	 */
//	
//	
//	public void readPDFInURL() throws EmptyFileException, IOException 
//	{
//		
//	//	 WebDriver driver = new ChromeDriver();
//       // page with example pdf document
//       m_Driver.get("https://assets.publishing.service.gov.uk/government/uploads/system/uploads/attachment_data/file/983259/CA44-2021_2022.pdf");
//       URL url = new URL(m_Driver.getCurrentUrl());
//		
////		URL url=new URL("https://assets.publishing.service.gov.uk/government/uploads/system/uploads/attachment_data/file/983259/CA44-2021_2022.pdf");
//		
//       InputStream is= url.openStream();
//		
//		BufferedInputStream fileToParse = new BufferedInputStream(is);
//		
//		PDDocument document = null;
//		
//		try {
//			document=PDDocument.load(fileToParse);
//			String pdfContent = new PDFTextStripper().getText(document);
//			System.out.println(pdfContent);
//			
//		}
//		
//		catch (Exception e) 
//		{
//			System.out.println(e);
//		}
//		
//		 if (document != null) {
//           document.close();
//       }
//       fileToParse.close();
//       is.close();
//		
//
//       
//    }
	
	
	
	
	
	

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
		
		ExtentReportManager.passStep(m_Driver, "Click_getLELAmount");

		TestModellerLogger.PassStep(m_Driver, "Click_getLELAmount");
	}

		
		
	public void Click_getLELAmount1()
		{
//		String Lel=elem.getText();
//		System.out.println("++++++");
		length=m_Driver.findElements(By.xpath("//main/div/div[3]/div/div[2]/div/div/div[2]/table/tbody/tr/td[3]")).size();
		System.out.println(length);
//Get LEL
		
		for(int i=2;i<=length;i++)
		{
			
			String LEL=m_Driver.findElement(By.xpath("//main/div/div[3]/div/div[2]/div/div/div[2]/table/tbody/tr["+i+"]/td[3]")).getText();
			 LEL=LEL.replaceAll("[£]", "");
			LEL=LEL.replaceAll("[,]", "");

	           TotalLELAmount = Float.parseFloat(LEL);
	        
	        LELAmount=LELAmount+TotalLELAmount;
	        
	        LELAmount=(float) (Math.round(LELAmount *100)/100.0);
	          
			
		}
		 System.out.println("This is LELAmount="+LELAmount);
		 
		 for(int i=length+1;i<=length+1;i++)
			{
			 
			 String LEL=m_Driver.findElement(By.xpath("//main/div/div[3]/div/div[2]/div/div/div[2]/table/tbody/tr["+i+"]/td[3]")).getText();
			 LEL=LEL.replaceAll("[£]", "");
			 LEL=LEL.replaceAll("[,]", "");

		        float   TotalLELAmount = Float.parseFloat(LEL);
		        System.out.println("This is TotalPTAmount="+TotalLELAmount);
		        
		        assertEquals(TotalLELAmount, LELDuringTaxyr);
		        assertEquals(TotalLELAmount, LELAmount);
			}
		 
		
	}
	
	
	
	public void Click_getPTAmount1()
	{


//Get LEL
	
	for(int i=2;i<=length;i++)
	{
		
		String PT=m_Driver.findElement(By.xpath("//main/div/div[3]/div/div[2]/div/div/div[2]/table/tbody/tr["+i+"]/td[4]")).getText();
		PT=PT.replaceAll("[£]", "");
		PT=PT.replaceAll("[,]", "");

        float   TotalPTAmount = Float.parseFloat(PT);
        
        PTAmount=PTAmount+TotalPTAmount;
        
          
		
	}
	 System.out.println("This is TotalPTAmount="+PTAmount);
	 
	 for(int i=length+1;i<=length+1;i++)
		{
		 
		 String PT=m_Driver.findElement(By.xpath("//main/div/div[3]/div/div[2]/div/div/div[2]/table/tbody/tr["+i+"]/td[4]")).getText();
			PT=PT.replaceAll("[£]", "");
			PT=PT.replaceAll("[,]", "");

	        float   TotalPTAmount = Float.parseFloat(PT);
	        System.out.println("This is TotalPTAmount="+TotalPTAmount);
	        assertEquals(TotalPTAmount, PTAmount);
		}
	 
}
	
	
	
	public void Click_getUELAmount1()
	{


//Get LEL
	
	for(int i=2;i<=length;i++)
	{
		
		String UEL=m_Driver.findElement(By.xpath("//main/div/div[3]/div/div[2]/div/div/div[2]/table/tbody/tr["+i+"]/td[5]")).getText();
		UEL=UEL.replaceAll("[£]", "");
		UEL=UEL.replaceAll("[,]", "");

        float   TotalUELAmount = Float.parseFloat(UEL);
        
        UELAmount=UELAmount+TotalUELAmount;
          
		
	}
	 System.out.println("This is UELAmount="+UELAmount);
	 
	 for(int i=length+1;i<=length+1;i++)
		{
		 
		 String UEL=m_Driver.findElement(By.xpath("//main/div/div[3]/div/div[2]/div/div/div[2]/table/tbody/tr["+i+"]/td[5]")).getText();
		 UEL=UEL.replaceAll("[£]", "");
		 UEL=UEL.replaceAll("[,]", "");

	        float   TotalUELAmount = Float.parseFloat(UEL);
	        System.out.println("This is TotalUELAmount="+TotalUELAmount);
	        assertEquals(TotalUELAmount, UELAmount);
		} 
	
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
		
		
		
////converting to float number from string
//		
//		String UELstr=UEL.replaceAll("[£]", "");
//			   UELstr=UELstr.replaceAll("[,]", "");
//
//	           UELAmount = Double.parseDouble(UELstr);
//	           System.out.println("This is UELAmount="+UELAmount);
//	           
//	           
//	           double UEL_During_TaxYr_2021_22=21999.96-PTDuringTaxyr;
//		  		
//			  	//	assertThat(null, null);
//			  		
//			  		boolean b=false;
//			  		if(UELAmount<=UEL_During_TaxYr_2021_22)
//			  		{
//			  			b=true;
//			  		}
//			  		else
//			  		{
//			  			System.out.println("Expected"+UEL_During_TaxYr_2021_22+"but found"+UELAmount);
//			  		}
//			  		
//			  		assertTrue(b);
//		
		jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/header/h2")));
          	

		ExtentReportManager.passStep(m_Driver, "Click_getUELAmount");

		TestModellerLogger.PassStep(m_Driver, "Click_getUELAmount");
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
    
    
  //Read data from XML File
    public void checkXML1() throws ParserConfigurationException, SAXException, IOException 
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
    	String GrossEarningsForNICsYTD = doc.getElementsByTagName("GrossEarningsForNICsYTD").item(0).getTextContent();
    	
    	float GrossEarning=Float.parseFloat(GrossEarningsForNICsYTD);
    	System.out.println("GrossEarning="+GrossEarning);
    	assertEquals(GrossEarning, LELAmount);
    	
    	float XMLLELAmount = Float.parseFloat(XMLLELValue);
    	System.out.println("..."+XMLLELAmount);
    	
    	assertEquals(XMLLELAmount, 0.0);
    	
    	float XMLPTAmount = Float.parseFloat(XMLPTValue);
    	System.out.println("..."+XMLPTAmount);
    	
    	assertEquals(XMLPTAmount, 0.0);
    	
    	float XMLUELAmount = Float.parseFloat(XMLUELValue);
    	System.out.println("..."+XMLUELValue);
    	
    	assertEquals(XMLUELAmount, 0.0);
    	
    //	String name = doc.getElementsByTagName("name").item(0).getTextContent();
    	
    	
    	m_Driver.switchTo().defaultContent();
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