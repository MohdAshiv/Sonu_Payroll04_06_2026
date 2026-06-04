package _2134;

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
public class XML_SMPCheck extends BasePage
{
	WebElement textArea1;
	double LELAmount;
	double PTAmount;
	double UELAmount;
	
	public XML_SMPCheck (WebDriver driver)
	{
		super(driver);
	}


	
	private By gotoFiling_ManagementElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefFilingMangment']");
	
	private By gotoReportsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefReports']");


	
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


		ExtentReportManager.passStep(m_Driver, "Click_gotoFiling_Management");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoFiling_Management");
	}


	
    
	/**
 	 * Enter getXMLData
	 * @throws InterruptedException 
	 * @throws ParserConfigurationException 
	 * @throws IOException 
	 * @throws SAXException 
     * @name Enter getXMLData
     */
 	public void Enter_getXMLSMPData() throws InterruptedException, ParserConfigurationException, SAXException, IOException
 	{
 	    
//		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));
 		
 		List<WebElement> options=m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div/div/div/div/table/tbody/tr/td[5]"));
 		
 		for(WebElement option:options)
 		{
 			
 			System.out.println(option.getText());
 			
 			if(option.getText().equalsIgnoreCase("FPS"))
 			{
 				option.click();
 				m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));
 				
 				m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnReGenerate']")).click();
 				Thread.sleep(2000);
 				
 				
 				WebElement textArea= m_Driver.findElement(By.xpath("//TEXTAREA[@name='ctl00$ctl00$ParentContent$cPH$txtData']"));
 				String xmlText=textArea.getText();
 				/*
 				 * XML Data verification
 				 *     	
 				 */
 				    	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
 				    	DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();

 				        
 				    	
 				    	InputSource src = new InputSource();
 //				    	String xmlText = "";
						src.setCharacterStream(new StringReader(xmlText));
 				    	Document doc = dBuilder.parse(src);
 				    	
 				    	String nlist=doc.getElementsByTagName("TaxablePay").item(0).getTextContent();
 				    	System.out.println(nlist);
 				    	
 				
 				
 				m_Driver.switchTo().defaultContent();
 				break;
 			}
 			
 		}

 
 	}


	public void DSBAmountValue() 
	{
		
		List<WebElement> options=m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div/div/div/div/table/tbody/tr/td[7]"));
 		
 		for(WebElement option:options)
 		{
 			
 			System.out.println(option.getText());
 			
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


	public void vrfyStarterTag() throws SAXException, IOException, InterruptedException, ParserConfigurationException {
		
		
List<WebElement> options=m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div/div/div/div/table/tbody/tr/td[6]"));
 		
 		for(WebElement option:options)
 		{
 			
 			System.out.println(option.getText());
 			
 			if(option.getText().equalsIgnoreCase("6"))
 			{
 				option=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl04_lnkTaxReturnType']"));
 				option.click();
 				m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));
 				
 				m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnReGenerate']")).click();
 				Thread.sleep(2000);
 				
 				
 				WebElement textArea= m_Driver.findElement(By.xpath("//TEXTAREA[@name='ctl00$ctl00$ParentContent$cPH$txtData']"));
 				String xmlText=textArea.getText();
 				/*
 				 * XML Data verification
 				 *     	
 				 */
 				    	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
 				    	DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();

 				        
 				    	
 				    	InputSource src = new InputSource();
 //				    	String xmlText = "";
						src.setCharacterStream(new StringReader(xmlText));
 				    	Document doc = dBuilder.parse(src);
 				    	
 				    	String nlist=doc.getElementsByTagName("StartDate").item(0).getTextContent();
 				    	System.out.println(nlist);
 				    	
 				
 				
 				m_Driver.switchTo().defaultContent();
 				break;
 			}
 			
 		}
		
		
	}
 	


}