package _1566AdditionDeductionPage;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import pages.BasePage;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

public class FillingManagement extends BasePage {

	WebElement textArea1;
	WebElement pension;
	public FillingManagement(WebDriver driver) {
		super(driver);
		
	}
	private By getXMLDataElem = By.xpath("//TEXTAREA[@name='ctl00$ctl00$ParentContent$cPH$txtData']");

	private By gotoFilingManagementElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefFilingMangment']");
	
	private By selectPension= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeading_ddlPayrollFrequency']");
	
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
	
		ExtentReportManager.passStep(m_Driver, "Click_gotoFilingManagement");
		  Reporter.log("Click Filling Managment ");
	}
	
	public void scrollGotoFilingManagement() throws Exception
	{
        
		WebElement elem = getWebElement(gotoFilingManagementElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "scrollGotoFilingManagement", "scrollGotoFilingManagement failed. Unable to locate object: " + gotoFilingManagementElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoFilingManagement", "Click_gotoFilingManagement failed. Unable to locate object: " + gotoFilingManagementElem.toString());

			Assert.fail("Unable to locate object: " + gotoFilingManagementElem.toString());
        }

		jsExec.executeScript("arguments[0].click();", elem);
	
		ExtentReportManager.passStep(m_Driver, "scrollGotoFilingManagement");

	}
	
	public void selectPension(String value) throws Exception
	{
        
		WebElement elem = getWebElement(selectPension);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectPension", "selectPension failed. Unable to locate object: " + selectPension.toString());

    		
			Assert.fail("Unable to locate object: " + selectPension.toString());
        }

		elem.sendKeys(value);
	
		ExtentReportManager.passStep(m_Driver, "selectPension");

	}
	public void clickFPS()
	{
    int len=m_Driver.findElements(By.xpath("//table/tbody/tr/td[5]")).size();
		
		
		
		for(int i=len;i<=len;i++)
		{
			
			jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")));
			m_Driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).click();
		}
		
		Reporter.log("Click FPS");
		
	}
	
	public void getXMLData() throws InterruptedException
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(getXMLDataElem);
 		m_Driver.findElement(By.xpath("//a[starts-with(text(), 'Regenerate Rti Xml')]")).click();
 		
 		Thread.sleep(2000);
 		elem=m_Driver.findElement(By.xpath("//TEXTAREA[@name='ctl00$ctl00$ParentContent$cPH$txtData']"));
 		elem.click();
 		textArea1=elem;

 		
		m_Driver.switchTo().defaultContent();
		
		Reporter.log("Go to Xmldata");
 	
}

	
	public void getXMLData2() throws InterruptedException
 	{
		Thread.sleep(1000);
 	    m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_grdPensionFilling_ctl02_lnkPopup']")).click();
 	    Thread.sleep(1000);
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(getXMLDataElem);
 		elem=m_Driver.findElement(By.xpath("//TEXTAREA[@name='ctl00$ctl00$ParentContent$cPH$txtData']"));
 		elem.click();
 		pension=elem;

 		
		m_Driver.switchTo().defaultContent();
		
		Reporter.log("Go to Xmldata");
 	
}

public void verifyTaxablePay(String expectedTaxablePay ) throws ParserConfigurationException, SAXException, IOException, InterruptedException {
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

    	String xmlText=textArea1.getText();

    	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    	DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();

    	InputSource src = new InputSource();
    	src.setCharacterStream(new StringReader(xmlText));
    	Document doc = dBuilder.parse(src);
    	String XMLLELValue1 = doc.getElementsByTagName("TaxablePay").item(1).getTextContent();
    	

    	
    	assertEquals(XMLLELValue1, expectedTaxablePay);
    	
    	
    	m_Driver.switchTo().defaultContent();
    	
    	
    	jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//button[@type='button']")));
		Thread.sleep(2000);
 		
	//	jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeading_ddlPayrollFrequency']")));
    	
   
    	Reporter.log("verify TaxablePay");
}


//For  second Employee 
public void verifyTaxablePayAndNiable(String expectedTaxablePay, String expectedNiable ) throws ParserConfigurationException, SAXException, IOException, InterruptedException {
	
	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

	String xmlText=textArea1.getText();

	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();

	InputSource src = new InputSource();
	src.setCharacterStream(new StringReader(xmlText));
	Document doc = dBuilder.parse(src);
	String XMLLELValue1 = doc.getElementsByTagName("TaxablePay").item(1).getTextContent();
	
	String XMLLELValue2 = doc.getElementsByTagName("GrossEarningsForNICsInPd").item(0).getTextContent();
	

	
	assertEquals(XMLLELValue1, expectedTaxablePay);
	assertEquals(XMLLELValue2, expectedNiable);
	
	
	m_Driver.switchTo().defaultContent();
	
	
	jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//button[@type='button']")));
	Thread.sleep(3000);
		
//	jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeading_ddlPayrollFrequency']")));
	

	Reporter.log("verify TaxablePay And Niable");
}

 public void verifyPensionablePay(String expectedPensionablePay) throws Exception
 {
	 
	 m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

		String xmlText=pension.getText();

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();

		InputSource src = new InputSource();
		src.setCharacterStream(new StringReader(xmlText));
		Document doc = dBuilder.parse(src);
		String XMLLELValue1 = doc.getElementsByTagName("PensionableEarningsAmount").item(0).getTextContent();
		
		
	
		assertEquals(XMLLELValue1, expectedPensionablePay);
	
		
		
		m_Driver.switchTo().defaultContent();
		
		
		jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//button[@type='button']")));
		Thread.sleep(2000);
			
//		jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeading_ddlPayrollFrequency']")));
		

		Reporter.log("verify PensionablePay");
	 
 }

 
 public void verifyTaxablePayAndNiable2(String expectedTaxablePay, String expectedNiable ) throws ParserConfigurationException, SAXException, IOException, InterruptedException {
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

		String xmlText=textArea1.getText();

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();

		InputSource src = new InputSource();
		src.setCharacterStream(new StringReader(xmlText));
		Document doc = dBuilder.parse(src);
		String XMLLELValue1 = doc.getElementsByTagName("TaxablePay").item(3).getTextContent();
		XMLLELValue1=XMLLELValue1.substring(0, 4);
		String XMLLELValue2 = doc.getElementsByTagName("GrossEarningsForNICsInPd").item(1).getTextContent();
		
		XMLLELValue2=XMLLELValue2.substring(0, 4);
		
		assertEquals(XMLLELValue1, expectedTaxablePay);
		assertEquals(XMLLELValue2, expectedNiable);
		
		
		m_Driver.switchTo().defaultContent();
		
		
		jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//button[@type='button']")));
		Thread.sleep(3000);
			
//		jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeading_ddlPayrollFrequency']")));
		

		Reporter.log("verify TaxablePay contribution");
	}
 public void verifyPensionablePay2(String expectedPensionablePay) throws Exception
 {
	 
	 m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

		String xmlText=pension.getText();

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();

		InputSource src = new InputSource();
		src.setCharacterStream(new StringReader(xmlText));
		Document doc = dBuilder.parse(src);
		String XMLLELValue1 = doc.getElementsByTagName("PensionableEarningsAmount").item(1).getTextContent();
		
		XMLLELValue1=XMLLELValue1.substring(0,4);
	
		assertEquals(XMLLELValue1, expectedPensionablePay);
	
		
		
		m_Driver.switchTo().defaultContent();
		
		
		jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//button[@type='button']")));
		Thread.sleep(2000);
			
//		jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeading_ddlPayrollFrequency']")));
		

		Reporter.log("verify PensionablePay");
	 
 }

}

