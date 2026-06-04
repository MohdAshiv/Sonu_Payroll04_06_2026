package _5438_EmployerAllowancesDisable_Page;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import pages.BasePage;

public class VerifyData  extends BasePage{

	public VerifyData(WebDriver driver) {
		super(driver);
	}
	
	static String path="E:\\SeleniumFramework\\SonuPayrollNew\\SeleniumFramework\\PdfFile\\";
	SoftAssert soft= new SoftAssert();
     String PDFtext;
	WebElement textArea1;
	private By getXMLDataElem = By.xpath("//TEXTAREA[@name='ctl00$ctl00$ParentContent$cPH$txtData']");

	public void verifyAlertMsgAndFinishBtn(String expectedMsg)
	{
		
		
		try {
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='EmploymentAllowanceEnableFrame']")));

			WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_lblDisclaimer']"));

			String actualMsg = elem.getText();

			System.out.println(actualMsg);

			soft.assertEquals(actualMsg, expectedMsg, "Alert not as expected");
			
//			WebElement disable = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnSave']"));
//		
//			System.out.println(disable.isEnabled());
//			
//			soft.assertFalse(disable.isEnabled());
			
			m_Driver.switchTo().defaultContent();
			
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue In verifyAlertMsgAndFinishBtn"+e);
		}
		
		Reporter.log("verifyAlertMsgAndFinishBtn");
	}
	
	
	
	
	
	
	
	public void verifyAlertMsg(String expectedMsg)
	{
		
		
		try {
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='EmploymentAllowanceEnableFrame']")));

			WebElement elem = m_Driver.findElement(By.xpath("//*[@id='dvAlertMessage']/preceding-sibling::div"));

			String actualMsg = elem.getText();

			String alertMsg = actualMsg.replaceAll("×", "").trim();
			System.out.println(alertMsg);

			soft.assertEquals(alertMsg, expectedMsg, "Alert not as expected");
			
		
			m_Driver.switchTo().defaultContent();
			
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue In verifyAlertMsgAndFinishBtn"+e);
		}
		
		Reporter.log("verifyAlertMsgAndFinishBtn");
	}
	
	
	public void enabledEmploymentAllowanceEA()
	{
		
		try {
			
			WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rbEmploymentAllowance_0']"));
			
			System.out.println(elem.isSelected());
			
			soft.assertTrue(elem.isSelected());
			
			
			
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue In enabledEmploymentAllowanceEA");
		}
		
		Reporter.log("enabledEmploymentAllowanceEA");
		
	}
	
	
	public void disableEmploymentAllowanceEA()
	{
		
		try {
			
			WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rbEmploymentAllowance_1']"));
			
			System.out.println(elem.isSelected());
			
			soft.assertTrue(elem.isSelected());
			
			
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue In disableEmploymentAllowanceEA");
		}
		
		Reporter.log("disableEmploymentAllowanceEA");
		
	}
	
	
	public void verifyEmployementAllowance(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,String data12)
	{
		
		try {
			 List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr/td[11]"));
			 ArrayList<String> ar= new ArrayList<String>();
				ar.add(data);
				ar.add(data1);
				ar.add(data2);
				ar.add(data3);
				ar.add(data4);
				ar.add(data5);
				ar.add(data6);
				ar.add(data7);
				ar.add(data8);
				ar.add(data9);
				ar.add(data10);
				ar.add(data11);
				ar.add(data12);

				System.out.println(list.size());

				boolean con=list.isEmpty();
			     soft.assertFalse(con);
				
			 for (int i =0;i<=list.size()-1;i++)
			 {
				 
				 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr/td[11]"));

				 WebElement elem = list1.get(i);
				 
				String actualData = elem.getText();
				actualData = actualData.replaceAll("[£]", "");
				actualData = actualData.replaceAll("[,]", "");

				System.out.println(actualData);
				 soft.assertEquals(actualData, ar.get(i));
				
			 }
			 
			
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verifyEmployementAllowance"+e);
		}
	}
	
	
	

	public void verifyEmployementAllowanceOpeningBalance(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,String data12,String data13)
	{
		
		try {
			 List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr/td[11]"));
			 ArrayList<String> ar= new ArrayList<String>();
				ar.add(data);
				ar.add(data1);
				ar.add(data2);
				ar.add(data3);
				ar.add(data4);
				ar.add(data5);
				ar.add(data6);
				ar.add(data7);
				ar.add(data8);
				ar.add(data9);
				ar.add(data10);
				ar.add(data11);
				ar.add(data12);
				ar.add(data13);

				
				boolean con=list.isEmpty();
			     soft.assertFalse(con);
				
			
			 for (int i =0;i<=list.size()-1;i++)
			 {
				 
				 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr/td[11]"));

				 WebElement elem = list1.get(i);
				 
				String actualData = elem.getText();
				actualData = actualData.replaceAll("[£]", "");
				actualData = actualData.replaceAll("[,]", "");

				System.out.println(actualData);
				 soft.assertEquals(actualData, ar.get(i));
				
			 }
			
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verifyEmployementAllowance"+e);
		}
	}
	
	
	
	public void verifyMultipleEmployementAllowance(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,String data12, String data13)
	{
		
		try {
			 List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr/td[11]"));
			 ArrayList<String> ar= new ArrayList<String>();
				ar.add(data);
				ar.add(data1);
				ar.add(data2);
				ar.add(data3);
				ar.add(data4);
				ar.add(data5);
				ar.add(data6);
				ar.add(data7);
				ar.add(data8);
				ar.add(data9);
				ar.add(data10);
				ar.add(data11);
				ar.add(data12);

				ar.add(data13);

				
				boolean con=list.isEmpty();
			     soft.assertFalse(con);
				
			 for (int i =0;i<=list.size()-1;i++)
			 {
				 
				 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr/td[11]"));

				 WebElement elem = list1.get(i);
				 
				String actualData = elem.getText();
				actualData = actualData.replaceAll("[£]", "");
				actualData = actualData.replaceAll("[,]", "");

				System.out.println(actualData);
				 soft.assertEquals(actualData, ar.get(i));
				
			 }
			
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verifyEmployementAllowance"+e);
		}
	}
	

	public void verifyEmployementAllowanceWeekly(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,String data12,String data13,String data14, String data15)
	{
		
		try {
			 List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr/td[11]"));
			 ArrayList<String> ar= new ArrayList<String>();
				ar.add(data);
				ar.add(data1);
				ar.add(data2);
				ar.add(data3);
				ar.add(data4);
				ar.add(data5);
				ar.add(data6);
				ar.add(data7);
				ar.add(data8);
				ar.add(data9);
				ar.add(data10);
				ar.add(data11);
				ar.add(data12);
				ar.add(data13);
				ar.add(data14);
				ar.add(data15);



				
				boolean con=list.isEmpty();
			     soft.assertFalse(con);
				
			
			 for (int i =0;i<=list.size()-1;i++)
			 {
				 
				 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr/td[11]"));

				 WebElement elem = list1.get(i);
				 
				String actualData = elem.getText();
				actualData = actualData.replaceAll("[£]", "");
				actualData = actualData.replaceAll("[,]", "");

				System.out.println(actualData);
				 soft.assertEquals(actualData, ar.get(i));
				
			 }
			
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verifyEmployementAllowanceWeekly"+e);
		}
	}
	
	
	public void verifyEmployementAllowanceWeekly1(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,String data12,String data13,String data14, String data15,String data16,String data17,String data18,String data19,String data20,String data21,String data22,String data23,String data24,String data25,String data26,String data27,String data28,String data29,String data30,String data31,String data32,String data33,String data34,String data35,String data36,String data37,String data38,String data39,String data40,String data41,String data42,String data43,String data44,String data45,String data46,String data47,String data48,String data49)
	{
		
		try {
			 List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr/td[11]"));
			 ArrayList<String> ar= new ArrayList<String>();
				ar.add(data);
				ar.add(data1);
				ar.add(data2);
				ar.add(data3);
				ar.add(data4);
				ar.add(data5);
				ar.add(data6);
				ar.add(data7);
				ar.add(data8);
				ar.add(data9);
				ar.add(data10);
				ar.add(data11);
				ar.add(data12);
				ar.add(data13);
				ar.add(data14);
				ar.add(data15);
				ar.add(data16);
				ar.add(data17);
				ar.add(data18);
				ar.add(data19);
				ar.add(data20);
				ar.add(data21);
				ar.add(data22);
				ar.add(data23);
				ar.add(data24);
				ar.add(data25);
				ar.add(data26);
				ar.add(data27);
				ar.add(data28);
				ar.add(data29);
				ar.add(data30);
				ar.add(data31);
				ar.add(data32);

				ar.add(data33);
				ar.add(data34);
				ar.add(data35);
				ar.add(data36);
				ar.add(data37);
				ar.add(data38);
				ar.add(data39);
				ar.add(data40);
				ar.add(data41);
				ar.add(data42);
				ar.add(data43);
				ar.add(data44);
				ar.add(data45);
				ar.add(data46);
				ar.add(data47);
				ar.add(data48);
				ar.add(data49);
				


				
				boolean con=list.isEmpty();
			     soft.assertFalse(con);
				
			
			 for (int i =0;i<=list.size()-1;i++)
			 {
				 
				 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr/td[11]"));

				 WebElement elem = list1.get(i);
				 
				String actualData = elem.getText();
				actualData = actualData.replaceAll("[£]", "");
				actualData = actualData.replaceAll("[,]", "");

				System.out.println(actualData);
				 soft.assertEquals(actualData, ar.get(i));
				
			 }
			
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verifyEmployementAllowanceWeekly"+e);
		}
	}
	
	
	
	
	public void verifyEmployementAllowanceWeekly2(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,String data12,String data13,String data14, String data15,String data16,String data17,String data18,String data19,String data20,String data21,String data22,String data23,String data24,String data25,String data26,String data27,String data28,String data29,String data30,String data31,String data32,String data33,String data34,String data35,String data36,String data37,String data38,String data39,String data40,String data41,String data42,String data43,String data44,String data45,String data46,String data47,String data48,String data49, String data50, String data51)
	{
		
		try {
			 List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr/td[11]"));
			 ArrayList<String> ar= new ArrayList<String>();
				ar.add(data);
				ar.add(data1);
				ar.add(data2);
				ar.add(data3);
				ar.add(data4);
				ar.add(data5);
				ar.add(data6);
				ar.add(data7);
				ar.add(data8);
				ar.add(data9);
				ar.add(data10);
				
				ar.add(data11);
				ar.add(data12);
				ar.add(data13);
				ar.add(data14);
				ar.add(data15);
				ar.add(data16);
				ar.add(data17);
				ar.add(data18);
				ar.add(data19);
				ar.add(data20);
				ar.add(data21);
				ar.add(data22);
				ar.add(data23);
				ar.add(data24);
				ar.add(data25);
				ar.add(data26);
				ar.add(data27);
				ar.add(data28);
				ar.add(data29);
				ar.add(data30);
				ar.add(data31);
				ar.add(data32);

				ar.add(data33);
				ar.add(data34);
				ar.add(data35);
				ar.add(data36);
				ar.add(data37);
				ar.add(data38);
				ar.add(data39);
				ar.add(data40);
				ar.add(data41);
				ar.add(data42);
				ar.add(data43);
				ar.add(data44);
				ar.add(data45);
				ar.add(data46);
				ar.add(data47);
				ar.add(data48);
				ar.add(data49);
				ar.add(data50);
				ar.add(data51);
				



				
				boolean con=list.isEmpty();
			     soft.assertFalse(con);
				
			 for (int i =0;i<=list.size()-1;i++)
			 {
				 
				 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr/td[11]"));

				 WebElement elem = list1.get(i);
				 
				String actualData = elem.getText();
				actualData = actualData.replaceAll("[£]", "");
				actualData = actualData.replaceAll("[,]", "");

				System.out.println(actualData);
				 soft.assertEquals(actualData, ar.get(i));
				
			 }
			
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verifyEmployementAllowanceWeekly"+e);
		}
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
	
	

public void verifyEA_Tag(String expectedTag ) throws ParserConfigurationException, SAXException, IOException, InterruptedException {
	
	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

	String xmlText=textArea1.getText();

	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();

	InputSource src = new InputSource();
	src.setCharacterStream(new StringReader(xmlText));
	Document doc = dBuilder.parse(src);
	String XMLLELValue1 = doc.getElementsByTagName("EmpAllceInd").item(0).getTextContent();
	
	System.out.println("EmpAllceInd= "+XMLLELValue1);
	
	soft.assertEquals(XMLLELValue1, expectedTag);
	

	m_Driver.switchTo().defaultContent();
	
	
	jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//button[@type='button']")));
	Thread.sleep(2000);
		
//	jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeading_ddlPayrollFrequency']")));
	

	Reporter.log("verifyEA_Tag");
}



public void verifyEPSDateTag(String fromDate ,String toDate  ) throws ParserConfigurationException, SAXException, IOException, InterruptedException {
	
	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

	String xmlText=textArea1.getText();

	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();

	InputSource src = new InputSource();
	src.setCharacterStream(new StringReader(xmlText));
	Document doc = dBuilder.parse(src);
	String XMLLELValue1 = doc.getElementsByTagName("From").item(0).getTextContent();
	String XMLLELValue2 = doc.getElementsByTagName("To").item(0).getTextContent();

	System.out.println("From= "+XMLLELValue1);
	System.out.println("To= "+XMLLELValue2);

	
	soft.assertEquals(XMLLELValue1, fromDate);
	soft.assertEquals(XMLLELValue2, toDate);


	m_Driver.switchTo().defaultContent();
	
	
	jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//button[@type='button']")));
	Thread.sleep(2000);
		
//	jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeading_ddlPayrollFrequency']")));
	
	Reporter.log("verifyEPSDateTag");
}




public void verifyEPSCisTag(String CIS  ) throws ParserConfigurationException, SAXException, IOException, InterruptedException {
	
	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

	String xmlText=textArea1.getText();

	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();

	InputSource src = new InputSource();
	src.setCharacterStream(new StringReader(xmlText));
	Document doc = dBuilder.parse(src);
	String XMLLELValue1 = doc.getElementsByTagName("CISDeductionsSuffered").item(0).getTextContent();

	System.out.println("From= "+XMLLELValue1);

	
	soft.assertEquals(XMLLELValue1, CIS);


	m_Driver.switchTo().defaultContent();
	
	
	jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//button[@type='button']")));
	Thread.sleep(2000);
		
//	jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeading_ddlPayrollFrequency']")));
	
	Reporter.log("verifyEPSDateTag");
}


public void verifyEPSCisTagXml(String EmpAllceInd, String SMPRecovered,String SPPRecovered, String NICCompensationOnSMP ,String NICCompensationOnSPP,String CISDeductionsSuffered) throws ParserConfigurationException, SAXException, IOException, InterruptedException {
	
	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

	String xmlText=textArea1.getText();

	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();

	InputSource src = new InputSource();
	src.setCharacterStream(new StringReader(xmlText));
	Document doc = dBuilder.parse(src);
	String XMLLELValue1 = doc.getElementsByTagName("EmpAllceInd").item(0).getTextContent();

	System.out.println("From= "+XMLLELValue1);

	String XMLLELValue2 = doc.getElementsByTagName("SMPRecovered").item(0).getTextContent();

	String XMLLELValue3 = doc.getElementsByTagName("SPPRecovered").item(0).getTextContent();

	String XMLLELValue4 = doc.getElementsByTagName("NICCompensationOnSMP").item(0).getTextContent();

	String XMLLELValue5 = doc.getElementsByTagName("NICCompensationOnSPP").item(0).getTextContent();

	String XMLLELValue6 = doc.getElementsByTagName("CISDeductionsSuffered").item(0).getTextContent();

	soft.assertEquals(XMLLELValue1, EmpAllceInd);

	soft.assertEquals(XMLLELValue2, SMPRecovered);

	soft.assertEquals(XMLLELValue3, SPPRecovered);

	soft.assertEquals(XMLLELValue4, NICCompensationOnSMP);

	soft.assertEquals(XMLLELValue5, NICCompensationOnSPP);

	soft.assertEquals(XMLLELValue6, CISDeductionsSuffered);

	m_Driver.switchTo().defaultContent();
	
	
	jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//button[@type='button']")));
	Thread.sleep(2000);
		
//	jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeading_ddlPayrollFrequency']")));
	
	Reporter.log("verifyEPSCisTagXml");
}

public void verifyPayrollSummary(String expectedData, String expectedData1)
{
	
	
	try {
		WebElement elem = m_Driver.findElement(By.xpath("//*[contains(text(),'-£')]"));
		
		String data = elem.getText();
		data = data.replaceAll("[£]", "");
		data = data.replaceAll("[,]", "");
		soft.assertEquals(data, expectedData);

		  WebElement list = m_Driver.findElement(By.xpath("(//*[text()='PAYE & NI DUE TO HMRC']/ following::div[@aria-label='Report text']/div/ancestor::div)[9]"));
		   String hmrc = list.getText();
		   hmrc = hmrc.replaceAll("[£]", "");
		   hmrc = hmrc.replaceAll("[,]", "");
		  soft.assertEquals(hmrc, expectedData1);

		
	} catch (Exception e) {
	    soft.assertFalse(true,"welcome to catch block");

		System.out.println("Issue In verifyPayrollSummary"+e);
	}
	
	Reporter.log("verifyPayrollSummary");
}


public void verifyPayrollSummary1( String expectedData)
{
	
	
	try {
		

		  WebElement list = m_Driver.findElement(By.xpath("(//*[text()='PAYE & NI DUE TO HMRC']/ following::div[@aria-label='Report text']/div/ancestor::div)[9]"));
		   String hmrc = list.getText();
		   hmrc = hmrc.replaceAll("[£]", "");
		   hmrc = hmrc.replaceAll("[,]", "");
		  soft.assertEquals(hmrc, expectedData);

		
	} catch (Exception e) {
	    soft.assertFalse(true,"welcome to catch block");

		System.out.println("Issue In verifyPayrollSummary"+e);
	}
	
	Reporter.log("verifyPayrollSummary");
}



public void VerifyRecievedEmailPayrollSummary( String data1,String data2) throws  Exception
{
    

       m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl02_lbtnFileName']")).click();

       Thread.sleep(11000);
       
		File file = new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2023-03-31.pdf");
		PDDocument document = PDDocument.load(file);
		PDFTextStripper pdfStripper = new PDFTextStripper();
		PDFtext = pdfStripper.getText(document);
		
		//System.out.println(PDFtext);
		document.close();
		
	
	soft.assertTrue(PDFtext.contains(data1));
	soft.assertTrue(PDFtext.contains(data2));
	

	Reporter.log("VerifyRecievedEmailPayrollSummary");

			    if(file.delete())
			    System.out.println("file deleted");
			
}

public void verifyJournalEntry(String expected)
{
	
	try {
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div[2]/div/div/div/div/table/tbody/tr[7]/td[2]"));
	
	String data = elem.getText();
	
	soft.assertEquals(data, expected);

	m_Driver.switchTo().defaultContent();
	
	} catch (Exception e) {
	    soft.assertFalse(true,"welcome to catch block");

	
	Reporter.log("verifyJournalEntry");
	}
}



public void P11Report( String Lel,String Pt,String Uel, String EmployeeEmployer,String employee)
{  
	
	
	  List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='rowFinal'])[2]/td[contains(text(),'£')]"));
	  
	 
	  jsExec.executeScript("window.scrollBy(0,300)"); 
		String actualLel = list.get(0).getText();
		actualLel = actualLel.replaceAll("£", "");
		actualLel = actualLel.replaceAll(",", "");
		soft.assertEquals(actualLel, Lel);

		String actualPT = list.get(1).getText();
		actualPT = actualPT.replaceAll("£", "");
		actualPT = actualPT.replaceAll(",", "");

		soft.assertEquals(actualPT, Pt);

		String actualUel = list.get(2).getText();

		actualUel = actualUel.replaceAll("£", "");
		actualUel = actualUel.replaceAll(",", "");
		soft.assertEquals(actualUel, Uel);

		String actualEeEr = list.get(3).getText();
		actualEeEr = actualEeEr.replaceAll("£", "");
		actualEeEr = actualEeEr.replaceAll(",", "");
		soft.assertEquals(actualEeEr, EmployeeEmployer);

		String actualEENi = list.get(4).getText();
		actualEENi = actualEENi.replaceAll("£", "");
		actualEENi = actualEENi.replaceAll(",", "");
		soft.assertEquals(actualEENi, employee);
		 
	     Reporter.log("Verify P11 ");
	  
	
	
}

public void verifyXml(String Nic,String NICYtd,String AtLELYTD,String LELtoPTYTD, String PTtoUELYTD,String TotalEmpNICInPd,String TotalEmpNICYTD,String EmpeeContribnsInPd,String EmpeeContribnsYTD ) throws ParserConfigurationException, SAXException, IOException, InterruptedException {
	
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

  	String xmlText=textArea1.getText();

  	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
  	DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();

  	InputSource src = new InputSource();
  	src.setCharacterStream(new StringReader(xmlText));
  	Document doc = dBuilder.parse(src);
//  	String XMLLELValue1 = doc.getElementsByTagName("TaxablePay").item(1).getTextContent();
//  	System.out.println("TaxablePay ="+XMLLELValue1);
//  	String XMLLELValue2 = doc.getElementsByTagName("TaxDeductedOrRefunded").item(0).getTextContent();
//  	System.out.println("TaxDeductedOrRefunded ="+XMLLELValue2);

  	String XMLLELValue1 = doc.getElementsByTagName("GrossEarningsForNICsInPd").item(0).getTextContent();
  	System.out.println("GrossEarningsForNICsInPd ="+XMLLELValue1);

  	String XMLLELValue2 = doc.getElementsByTagName("GrossEarningsForNICsYTD").item(0).getTextContent();
  	System.out.println("GrossEarningsForNICsYTD ="+XMLLELValue2);

  	String XMLLELValue3 = doc.getElementsByTagName("AtLELYTD").item(0).getTextContent();

  	System.out.println("AtLELYTD ="+XMLLELValue3);
  	
  	String XMLLELValue4 = doc.getElementsByTagName("LELtoPTYTD").item(0).getTextContent();
  	System.out.println("LELtoPTYTD ="+XMLLELValue4);

  	String XMLLELValue5 = doc.getElementsByTagName("PTtoUELYTD").item(0).getTextContent();
  	System.out.println("PTtoUELYTD ="+XMLLELValue5);


  	String XMLLELValue6 = doc.getElementsByTagName("TotalEmpNICInPd").item(0).getTextContent();
  	System.out.println("TotalEmpNICInPd ="+XMLLELValue6);

  	String XMLLELValue7 = doc.getElementsByTagName("TotalEmpNICYTD").item(0).getTextContent();
  	System.out.println("TotalEmpNICYTD ="+XMLLELValue7);

  	String XMLLELValue8 = doc.getElementsByTagName("EmpeeContribnsInPd").item(0).getTextContent();
  	System.out.println("EmpeeContribnsInPd ="+XMLLELValue8);

  	String XMLLELValue9 = doc.getElementsByTagName("EmpeeContribnsYTD").item(0).getTextContent();
  	System.out.println("EmpeeContribnsYTD ="+XMLLELValue9);


  	
  	
  	
  	
  	
  	soft.assertEquals(XMLLELValue1, Nic);
  	
  	soft.assertEquals(XMLLELValue2, NICYtd);
  	
  	soft.assertEquals(XMLLELValue3, AtLELYTD);
       
      soft.assertEquals(XMLLELValue4, LELtoPTYTD);

      soft.assertEquals(XMLLELValue5, PTtoUELYTD);
      soft.assertEquals(XMLLELValue6, TotalEmpNICInPd);
      soft.assertEquals(XMLLELValue7, TotalEmpNICYTD);
      soft.assertEquals(XMLLELValue8, EmpeeContribnsInPd);
      soft.assertEquals(XMLLELValue9, EmpeeContribnsYTD);

  	
  	
  	m_Driver.switchTo().defaultContent();
  	
  	
  	jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//button[@type='button']")));
		Thread.sleep(2000);
		
	//	jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeading_ddlPayrollFrequency']")));
  	
 
  	Reporter.log("verify XML");	
}



public void verifyP60Director(String pay, String taxDeducted, String lel,String pt, String uel ,String employeePT) throws  Exception
{
	

   Thread.sleep(4000);
		File file = new File("C:\\Users\\Sonu\\Downloads\\P60-2022-2023-Mr. Mohit jha.pdf");
		PDDocument document = PDDocument.load(file);
		PDFTextStripper pdfStripper = new PDFTextStripper();
		PDFtext = pdfStripper.getText(document);
		
		//System.out.println(PDFtext);
		document.close();
		
		
	soft.assertTrue(PDFtext.contains(pay));
	soft.assertTrue(PDFtext.contains(taxDeducted));
	soft.assertTrue(PDFtext.contains(lel));
	soft.assertTrue(PDFtext.contains(pt));
	soft.assertTrue(PDFtext.contains(uel));
	soft.assertTrue(PDFtext.contains(employeePT));

	Reporter.log("verifyP60Director");

			    if(file.delete())
			    System.out.println("file deleted");
			
}



public void verifyP60Director1(String pay, String taxDeducted, String lel,String pt, String uel ,String employeePT) throws  Exception
{
	

    // Thread.sleep(4000);
		File file = new File(path+"P60-2022-2023-Mr. Mohit jha.pdf");
		PDDocument document = PDDocument.load(file);
		PDFTextStripper pdfStripper = new PDFTextStripper();
		PDFtext = pdfStripper.getText(document);
		
		//System.out.println(PDFtext);
		document.close();
		
		
	soft.assertTrue(PDFtext.contains(pay));
	soft.assertTrue(PDFtext.contains(taxDeducted));
	soft.assertTrue(PDFtext.contains(lel));
	soft.assertTrue(PDFtext.contains(pt));
	soft.assertTrue(PDFtext.contains(uel));
	soft.assertTrue(PDFtext.contains(employeePT));

	Reporter.log("verifyP60Director");

			    if(file.delete())
			    System.out.println("file deleted");
			
}


	 public void assertAll()
	   {
		   soft.assertAll();
		   
	   }

}
