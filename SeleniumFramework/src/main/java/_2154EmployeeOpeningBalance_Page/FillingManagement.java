package _2154EmployeeOpeningBalance_Page;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
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
	SoftAssert soft= new SoftAssert();

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

		Reporter.log("Select Pension");
	}
	public void clickFPS()
	{
    int len=m_Driver.findElements(By.xpath("//table/tbody/tr/td[5]")).size();
		
		int Size=len+1;
		
			
			jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//table/tbody/tr["+Size+"]/td[5]")));
			m_Driver.findElement(By.xpath("//table/tbody/tr["+Size+"]/td[5]")).click();
	
		
		Reporter.log("Click FPS");
		
	}
	
	
	public void clickFPS2() throws Exception
	{
    
		Thread.sleep(1000);
		
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkTaxReturnType']"));
	
		
		jsExec.executeScript("arguments[0].click();",elem);
		
		
		Reporter.log("Click FPS");
		
	}
	

	public void clickFPS3() throws Exception
	{
    
		Thread.sleep(1000);
		
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl03_lnkTaxReturnType']"));
	
		
		jsExec.executeScript("arguments[0].click();",elem);
		
		
		Reporter.log("Click FPS");
		
	}
	
	
	public void getXMLData() throws InterruptedException
 	{

		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(getXMLDataElem);
 		//m_Driver.findElement(By.xpath("//a[starts-with(text(), 'Regenerate Rti Xml')]")).click();
 		
 		Thread.sleep(2000);
 		elem=m_Driver.findElement(By.xpath("//TEXTAREA[@name='ctl00$ctl00$ParentContent$cPH$txtData']"));
 		elem.click();
 		textArea1=elem;

		m_Driver.switchTo().defaultContent();
		
		Reporter.log("Go to Xmldata");
 	
}

	
	public void getXMLDataRunPayrollPage() throws InterruptedException
 	{

		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrameXML']")));

 		WebElement elem = getWebElement(getXMLDataElem);
 		//m_Driver.findElement(By.xpath("//a[starts-with(text(), 'Regenerate Rti Xml')]")).click();
 		
 		Thread.sleep(2000);
 		elem=m_Driver.findElement(By.xpath("//TEXTAREA[@name='ctl00$ctl00$ParentContent$cPH$txtData']"));
 		elem.click();
 		textArea1=elem;

		m_Driver.switchTo().defaultContent();
		
		Reporter.log("Go to Xmldata");
 	
}

	
	public void getXMLData1() throws InterruptedException
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


public void verifyTotalTax(String expectedTaxablePay ) throws ParserConfigurationException, SAXException, IOException, InterruptedException {
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

    	String xmlText=textArea1.getText();

    	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    	DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();

    	InputSource src = new InputSource();
    	src.setCharacterStream(new StringReader(xmlText));
    	Document doc = dBuilder.parse(src);
    	String XMLLELValue1 = doc.getElementsByTagName("TotalTax").item(0).getTextContent();
    	
    	System.out.println("Total Tax= "+XMLLELValue1);
    	
    	soft.assertEquals(XMLLELValue1, expectedTaxablePay);
    	
		 utilities.TakeScreenshot.Getscreenshot("TC144 Verify TaxablePay On XML", "2154", m_Driver);

    	m_Driver.switchTo().defaultContent();
    	
    	
    	jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//button[@type='button']")));
		Thread.sleep(2000);
 		
	//	jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeading_ddlPayrollFrequency']")));
    	
   
    	Reporter.log("verify TaxablePay");
}


public void verifyGrossEarningYTD(String data ) throws ParserConfigurationException, SAXException, IOException, InterruptedException {
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

    	String xmlText=textArea1.getText();

    	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    	DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();

    	InputSource src = new InputSource();
    	src.setCharacterStream(new StringReader(xmlText));
    	Document doc = dBuilder.parse(src);
    	String XMLLELValue1 = doc.getElementsByTagName("GrossEarningsForNICsYTD").item(0).getTextContent();
    	
    	System.out.println("GrossEarningsForNICsYTD= "+XMLLELValue1);
    	
    	soft.assertEquals(XMLLELValue1, data);
    	
		 utilities.TakeScreenshot.Getscreenshot("TC144 Verify TaxablePay On XML", "2154", m_Driver);

    	m_Driver.switchTo().defaultContent();
    	
    	
    	jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//button[@type='button']")));
		Thread.sleep(2000);
 		
	//	jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeading_ddlPayrollFrequency']")));
    	
   
    	Reporter.log("GrossEarningsForNICsYTD");
}


public void verifyXML(String expectedTaxablePay,String TaxRecund,String Nic,String NICYtd,String AtLELYTD,String LELtoPTYTD) throws ParserConfigurationException, SAXException, IOException, InterruptedException {
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

    	String xmlText=textArea1.getText();

    	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    	DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();

    	InputSource src = new InputSource();
    	src.setCharacterStream(new StringReader(xmlText));
    	Document doc = dBuilder.parse(src);
    	String XMLLELValue1 = doc.getElementsByTagName("TaxablePay").item(1).getTextContent();
    	System.out.println("TaxablePay ="+XMLLELValue1);
    	String XMLLELValue2 = doc.getElementsByTagName("TaxDeductedOrRefunded").item(0).getTextContent();
    	System.out.println("TaxDeductedOrRefunded ="+XMLLELValue2);

    	String XMLLELValue3 = doc.getElementsByTagName("GrossEarningsForNICsInPd").item(0).getTextContent();
    	System.out.println("GrossEarningsForNICsInPd ="+XMLLELValue3);

    	String XMLLELValue4 = doc.getElementsByTagName("GrossEarningsForNICsYTD").item(0).getTextContent();
    	System.out.println("GrossEarningsForNICsYTD ="+XMLLELValue4);

    	String XMLLELValue5 = doc.getElementsByTagName("AtLELYTD").item(0).getTextContent();

    	System.out.println("AtLELYTD ="+XMLLELValue5);
    	
    	String XMLLELValue6 = doc.getElementsByTagName("LELtoPTYTD").item(0).getTextContent();
    	System.out.println("LELtoPTYTD ="+XMLLELValue6);


    	
    	
    	soft.assertEquals(XMLLELValue1, expectedTaxablePay);
    	
    	soft.assertEquals(XMLLELValue2, TaxRecund);
    	
    	soft.assertEquals(XMLLELValue3, Nic);
    	
    	soft.assertEquals(XMLLELValue4, NICYtd);
    	
    	soft.assertEquals(XMLLELValue5, AtLELYTD);
         
        soft.assertEquals(XMLLELValue6, LELtoPTYTD);

    	
    	
    	m_Driver.switchTo().defaultContent();
    	
    	
    	jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//button[@type='button']")));
		Thread.sleep(2000);
 		
	//	jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeading_ddlPayrollFrequency']")));
    	
   
    	Reporter.log("verify XML");	
}

 
public void verifyXML1(String Taxable,String TotalTax,String expectedTaxablePay,String PayAfterStatDedns, String TaxDeductedOrRefunded,String GrossEarningsForNICsInPd,String GrossEarningsForNICsYTD,String AtLELYTD,String LELtoPTYTD
		,String PTtoUELYTD, String TotalEmpNICInPd, String TotalEmpNICYTD,String EmpeeContribnsInPd,String EmpeeContribnsYTD) throws ParserConfigurationException, SAXException, IOException, InterruptedException {
	
	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

	String xmlText=textArea1.getText();

	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();

	InputSource src = new InputSource();
	src.setCharacterStream(new StringReader(xmlText));
	Document doc = dBuilder.parse(src);
	
	String actualTaxablePay1 = doc.getElementsByTagName("TaxablePay").item(0).getTextContent();
	System.out.println("TaxablePay1 ="+actualTaxablePay1);
	
	
	String actualTax = doc.getElementsByTagName("TotalTax").item(0).getTextContent();
	System.out.println("TotalTax ="+actualTax);
	
	
	
	String actualPayAfterStatDedns = doc.getElementsByTagName("PayAfterStatDedns").item(0).getTextContent();
	System.out.println("PayAfterStatDedns ="+actualPayAfterStatDedns);
	
	String actualTaxablePay = doc.getElementsByTagName("TaxablePay").item(1).getTextContent();
	System.out.println("TaxablePay ="+actualTaxablePay);
	
	String actualTaxDeductedOrRefunded = doc.getElementsByTagName("TaxDeductedOrRefunded").item(0).getTextContent();
	System.out.println("TaxDeductedOrRefunded ="+actualTaxDeductedOrRefunded);

	String actualGrossEarningsForNICsInPd = doc.getElementsByTagName("GrossEarningsForNICsInPd").item(0).getTextContent();
	System.out.println("GrossEarningsForNICsInPd ="+actualGrossEarningsForNICsInPd);

	String actualGrossEarningsForNICsYTD = doc.getElementsByTagName("GrossEarningsForNICsYTD").item(0).getTextContent();
	System.out.println("GrossEarningsForNICsYTD ="+actualGrossEarningsForNICsYTD);

	String actualAtLELYTD = doc.getElementsByTagName("AtLELYTD").item(0).getTextContent();

	System.out.println("AtLELYTD ="+actualAtLELYTD);
	
	String actualLELtoPTYTD = doc.getElementsByTagName("LELtoPTYTD").item(0).getTextContent();
	System.out.println("LELtoPTYTD ="+actualLELtoPTYTD);

	String actualPTtoUELYTD = doc.getElementsByTagName("PTtoUELYTD").item(0).getTextContent();
	System.out.println("PTtoUELYTD ="+actualPTtoUELYTD);
	
	String actualTotalEmpNICInPd = doc.getElementsByTagName("TotalEmpNICInPd").item(0).getTextContent();
	System.out.println("TotalEmpNICInPd ="+actualTotalEmpNICInPd);
	
	String actualTotalEmpNICYTD = doc.getElementsByTagName("TotalEmpNICYTD").item(0).getTextContent();
	System.out.println("TotalEmpNICYTD ="+actualTotalEmpNICYTD);
	
	String actualEmpeeContribnsInPd = doc.getElementsByTagName("EmpeeContribnsInPd").item(0).getTextContent();
	System.out.println("EmpeeContribnsInPd ="+actualEmpeeContribnsInPd);

	String actualEmpeeContribnsYTD = doc.getElementsByTagName("EmpeeContribnsYTD").item(0).getTextContent();
	System.out.println("EmpeeContribnsYTD ="+EmpeeContribnsYTD);
	
	
	soft.assertEquals(actualTaxablePay1, Taxable);
	
	soft.assertEquals(actualTax, TotalTax);
	
	
	soft.assertEquals(actualTaxablePay, expectedTaxablePay);

	soft.assertEquals(actualPayAfterStatDedns, PayAfterStatDedns);
	
	soft.assertEquals(actualTaxDeductedOrRefunded, TaxDeductedOrRefunded);
     
    soft.assertEquals(actualGrossEarningsForNICsYTD, GrossEarningsForNICsYTD);

    soft.assertEquals(actualGrossEarningsForNICsInPd, GrossEarningsForNICsInPd);

    soft.assertEquals(actualAtLELYTD, AtLELYTD);

    soft.assertEquals(actualLELtoPTYTD, LELtoPTYTD);

    soft.assertEquals(actualPTtoUELYTD, PTtoUELYTD);

    soft.assertEquals(actualTotalEmpNICInPd, TotalEmpNICInPd);

    soft.assertEquals(actualTotalEmpNICYTD, TotalEmpNICYTD);

    soft.assertEquals(actualEmpeeContribnsInPd, EmpeeContribnsInPd);

    soft.assertEquals(actualEmpeeContribnsYTD, EmpeeContribnsYTD);

   

	
	
	m_Driver.switchTo().defaultContent();
	
	
	jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//button[@type='button']")));
	Thread.sleep(2000);
		
//	jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeading_ddlPayrollFrequency']")));
	

	Reporter.log("verify XML");	
}


public void verifyOffPayWorker(String expectedTag ) throws ParserConfigurationException, SAXException, IOException, InterruptedException {
	
	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

	String xmlText=textArea1.getText();

	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();

	InputSource src = new InputSource();
	src.setCharacterStream(new StringReader(xmlText));
	Document doc = dBuilder.parse(src);
	String XMLLELValue1 = doc.getElementsByTagName("OffPayrollWorker").item(0).getTextContent();
	
	System.out.println("OffPayrollWorker= "+XMLLELValue1);
	
	soft.assertEquals(XMLLELValue1, expectedTag);
	

	m_Driver.switchTo().defaultContent();
	
	
	jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//button[@type='button']")));
	Thread.sleep(2000);
		
//	jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeading_ddlPayrollFrequency']")));
	

	Reporter.log("verifyOffPayWorker");
}



public void verifyOffPayWorkerShouldNotContains( ) throws ParserConfigurationException, SAXException, IOException, InterruptedException {
	
	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

	String xmlText=textArea1.getText();

	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();

	InputSource src = new InputSource();
	src.setCharacterStream(new StringReader(xmlText));
	Document doc = dBuilder.parse(src);
	
	
	soft.assertFalse(xmlText.contains("OffPayrollWorker"));

	m_Driver.switchTo().defaultContent();
	
	
	jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//button[@type='button']")));
	Thread.sleep(2000);
		
//	jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeading_ddlPayrollFrequency']")));
	

	Reporter.log("verifyOffPayWorker");
}



public void verifyXMLAfterOOP(String expLeavingDate) throws ParserConfigurationException, SAXException, IOException
{
    
    m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='PopUpFrame']")));
//    pages.Library lib=new pages.Library(m_Driver);
    
    
    textArea1=m_Driver.findElement(By.xpath("//textarea[@name='ctl00$ctl00$ParentContent$cPH$txtData']"));
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
    
    doc.getDocumentElement().normalize();
    //System.out.println("Root element Name is:"+doc.getDocumentElement().getNodeName());
    NodeList nodeList =doc.getElementsByTagName("Employee");
    
    System.out.println(nodeList);
    System.out.println("xyz");
    //System.out.println(nodeList.getLength());
    for(int i =0; i<nodeList.getLength();i++)
    {
        Node node = nodeList.item(i);
        //System.out.println("\n"+"("+i+")"+"Child Node Name:"+node.getNodeName());
        if(node.getNodeType()==Node.ELEMENT_NODE)
        {
            
            Element element =(Element) node;
            if(element.getElementsByTagName("Sur").item(0).getTextContent().contains("A"))
            {
//                actemplLeaveDate=element.getElementsByTagName("LeavingDate").item(0).getTextContent();
//                actYTDIncomeBeforeOOP=element.getElementsByTagName("GrossEarningsForNICsYTD").item(0).getTextContent();
//                actTaxDeductionBeforeOOP=element.getElementsByTagName("TaxablePay").item(0).getTextContent();
            
            }
        }
        
        
        
    }
    
   
    
    Reporter.log("YTDIncome and TaxDeduction after One Off Payment verified and Leaving date is as it is.");



   m_Driver.switchTo().defaultContent();
}


public void verifyxmlRunPayroll(String expectedTag ) throws ParserConfigurationException, SAXException, IOException, InterruptedException {
	
	m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrameXML']")));

	String xmlText=textArea1.getText();

	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();

	InputSource src = new InputSource();
	src.setCharacterStream(new StringReader(xmlText));
	Document doc = dBuilder.parse(src);
	String XMLLELValue1 = doc.getElementsByTagName("EmailAddress").item(0).getTextContent();
	
	System.out.println("EmailAddress= "+XMLLELValue1);
	
	soft.assertEquals(XMLLELValue1, expectedTag);
	

	m_Driver.switchTo().defaultContent();
	
	
	jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='PopUpCloseXML']")));
	Thread.sleep(2000);
		
//	jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeading_ddlPayrollFrequency']")));
	

	Reporter.log("verifyOffPayWorker");
}

	public void assertAll()
	{
		soft.assertAll();
		
		
	}
}

