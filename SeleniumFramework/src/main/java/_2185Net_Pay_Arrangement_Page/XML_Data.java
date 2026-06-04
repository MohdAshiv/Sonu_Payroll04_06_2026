package _2185Net_Pay_Arrangement_Page;

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
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.xml.XmlTest;
import org.w3c.dom.Document;

import pages.BasePage;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class XML_Data extends BasePage {

	WebElement textArea1;
	public XML_Data(WebDriver driver) {
		super(driver);
		
	}

	
	
	private By getXMLDataElem = By.xpath("//TEXTAREA[@name='ctl00$ctl00$ParentContent$cPH$txtData']");
	private By gotoFiling_ManagementElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefFilingMangment']");

	public void Click_gotoFiling_Management()
	{
        
		WebElement elem = getWebElement(gotoFiling_ManagementElem);

		elem.click();
	
		
		int len=m_Driver.findElements(By.xpath("//table/tbody/tr/td[5]")).size();
		
		
		
		for(int i=len;i<=len;i++)
		{
			
			jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")));
			m_Driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).click();
		}
		
		Reporter.log("Click Filing Managment");
          	
	}

	public void Click_gotoFiling_Management2()
	{
        
		WebElement elem = getWebElement(gotoFiling_ManagementElem);

		elem.click();
	 
			  WebElement elem1 = m_Driver.findElement(By.xpath("//SELECT[@id='ctl00_ctl00_ParentContent_ddlTaxYears']"));
			
			  Select sel= new Select(elem1);
			  sel.selectByVisibleText("2020-2021");
			  
			  Reporter.log("Select Taxear");
			  
		
		
		int len=m_Driver.findElements(By.xpath("//table/tbody/tr/td[5]")).size();
		
		
		
		for(int i=len;i<=len;i++)
		{
			
			jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")));
			m_Driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).click();
		}
		
		Reporter.log("Click Filing Managment");
          	
	}
	
	
	public void Enter_getXMLData1() throws InterruptedException
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
 	
	public void verifyTax() throws ParserConfigurationException, SAXException, IOException, InterruptedException {
		
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
    	String XMLLELValue = doc.getElementsByTagName("TaxDeductedOrRefunded").item(0).getTextContent();
    	
    	System.out.println("Amount="+XMLLELValue);
    	int count=0;
    	if (XMLLELValue.contains("-"))
    	{
    		count+=1;
    		Assert.assertTrue(count==0);
    	}
    	

    	
    	m_Driver.switchTo().defaultContent();
    	
    	
		jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//button[@type='button']")));
		Thread.sleep(5000);
 		
	//	jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeading_ddlPayrollFrequency']")));
    	
    	System.out.println("Hi I'm Switch");
    	
    	m_Driver.switchTo().defaultContent();
    	Reporter.log("Verify Tax= "+XMLLELValue);
    	
		
	}
	
public void verifyTaxAndNIC(String Tax, String EmployeeNI,String EmployerNI) throws ParserConfigurationException, SAXException, IOException, InterruptedException {
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

    	String xmlText=textArea1.getText();

    	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    	DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();

    	InputSource src = new InputSource();
    	src.setCharacterStream(new StringReader(xmlText));
    	Document doc = dBuilder.parse(src);
    	String XMLLELValue1 = doc.getElementsByTagName("TaxablePay").item(1).getTextContent();
    	String XMLLELValue2 = doc.getElementsByTagName("EmpeeContribnsInPd").item(0).getTextContent();
    	String XMLLELValue3 = doc.getElementsByTagName("TotalEmpNICInPd").item(0).getTextContent();
    	System.out.println("TaxAmount="+XMLLELValue1);
    	System.out.println("EmployeeNI="+XMLLELValue2);
    	System.out.println("EmployerNI="+XMLLELValue3);
    	assertEquals(XMLLELValue1, Tax);
    	assertEquals(XMLLELValue2, EmployeeNI);
    	assertEquals(XMLLELValue3, EmployerNI);
    	
//    
//    	int count=0;
//    	if (XMLLELValue1.equals(Tax))
//    	{
//
//    		Assert.assertTrue(true,"TaxAmount verify sucsessful");
//    	}
//    	if (XMLLELValue2.equals(EmployeeNI))
//    	{
//    
//    		Assert.assertTrue(true,"EmployeeNI verifyied");
//    	}
//    	if (XMLLELValue3.equals(EmployerNI))
//    	{
//    		
//    		Assert.assertTrue(true,"EmployerNI verifyied");
//    	}
    	
    	m_Driver.switchTo().defaultContent();
    	
    	
		jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//button[@type='button']")));
		Thread.sleep(5000);
 		
	//	jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeading_ddlPayrollFrequency']")));
    	
    	System.out.println("Hi I'm Switch");
    	
    	m_Driver.switchTo().defaultContent();
    	Reporter.log("verify Tax and Ni contribution");
    	
		
	}
public void verifyGrossPay(String expectedGrossPay) throws ParserConfigurationException, SAXException, IOException, InterruptedException {
	
	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));
	String xmlText=textArea1.getText();
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();
	InputSource src = new InputSource();
	src.setCharacterStream(new StringReader(xmlText));
	Document doc = dBuilder.parse(src);
	String actualGrossPay = doc.getElementsByTagName("TaxablePay").item(1).getTextContent();
	 utilities.TakeScreenshot.Getscreenshot("TC034_verify Gross Amount _qualifying", "2185", m_Driver);
	System.out.println("Gross Amount = "+actualGrossPay);
	assertEquals(actualGrossPay, expectedGrossPay);
	m_Driver.switchTo().defaultContent();
	jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//button[@type='button']")));
	Thread.sleep(5000);
	m_Driver.switchTo().defaultContent();
	Reporter.log("Verify GrossPay = "+actualGrossPay);
	
	
}
public void verifyERandEE_NI( String EmployeeNI,String EmployerNI) throws ParserConfigurationException, SAXException, IOException, InterruptedException {
	
	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

	String xmlText=textArea1.getText();

	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();

	InputSource src = new InputSource();
	src.setCharacterStream(new StringReader(xmlText));
	Document doc = dBuilder.parse(src);
	String XMLLELValue2 = doc.getElementsByTagName("EmpeeContribnsInPd").item(0).getTextContent();
	String XMLLELValue3 = doc.getElementsByTagName("TotalEmpNICInPd").item(0).getTextContent();
	System.out.println("EmployeeNI="+XMLLELValue2);
	System.out.println("EmployerNI="+XMLLELValue3);
	
	assertEquals(XMLLELValue2, EmployeeNI);
	assertEquals(XMLLELValue3, EmployerNI);

	utilities.TakeScreenshot.Getscreenshot("verify Tax and NI", "2185", m_Driver);
	m_Driver.switchTo().defaultContent();
	
	
	jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//button[@type='button']")));
	Thread.sleep(5000);
	
	System.out.println("Hi I'm Switch");
	
	m_Driver.switchTo().defaultContent();
	Reporter.log("verify Tax and Ni for ER's And EE");
	
	
}
public void verifyTaxable_Employee( String actualTaxablePayEmployeeA,String actualTaxablePayEmployeeB) throws ParserConfigurationException, SAXException, IOException, InterruptedException {
	
	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

	String xmlText=textArea1.getText();
	 
	

	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();

	InputSource src = new InputSource();
	src.setCharacterStream(new StringReader(xmlText));
	Document doc = dBuilder.parse(src);

	String TaxablePayEmployeeA = doc.getElementsByTagName("TaxablePay").item(1).getTextContent();
	String TaxablePayEmployeeB = doc.getElementsByTagName("TaxablePay").item(3).getTextContent();
	
	System.out.println("EmployeeATaxable ="+TaxablePayEmployeeA);
	System.out.println("EmployeeBTaxable ="+TaxablePayEmployeeB);
	
	assertEquals(actualTaxablePayEmployeeA,TaxablePayEmployeeA);
	assertEquals(actualTaxablePayEmployeeB, TaxablePayEmployeeB);
	m_Driver.switchTo().defaultContent();
	jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//button[@type='button']")));
	Thread.sleep(5000);
	m_Driver.switchTo().defaultContent();
	Reporter.log("verify TaxablePay for Both Employee");
	
	
}
public void verifyNIable_Employee( String actualNIablePayEmployeeA,String actualNIablePayEmployeeB) throws ParserConfigurationException, SAXException, IOException, InterruptedException {
	
	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

	String xmlText=textArea1.getText();
	 
	

	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();

	InputSource src = new InputSource();
	src.setCharacterStream(new StringReader(xmlText));
	Document doc = dBuilder.parse(src);

	String NIablePayEmployeeA = doc.getElementsByTagName("GrossEarningsForNICsInPd").item(0).getTextContent();
	String NIablePayEmployeeB = doc.getElementsByTagName("GrossEarningsForNICsInPd").item(1).getTextContent();
	System.out.println("EmployeeATaxable ="+NIablePayEmployeeA);
	System.out.println("EmployeeBTaxable ="+NIablePayEmployeeB);
	
	assertEquals(actualNIablePayEmployeeA,NIablePayEmployeeA);
	assertEquals(actualNIablePayEmployeeB, NIablePayEmployeeB);
	m_Driver.switchTo().defaultContent();
	jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//button[@type='button']")));
	Thread.sleep(5000);
	m_Driver.switchTo().defaultContent();
	Reporter.log("verify TaxablePay for Both Employee");
	
	
}
}
