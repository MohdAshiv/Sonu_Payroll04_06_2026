package _5852_NoEmployerNIC_Page;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import au.com.bytecode.opencsv.CSVReader;
import pages.BasePage;


public class VerifyPage extends BasePage {

	public VerifyPage(WebDriver driver) {
		super(driver);
		
	}
	WebElement textArea1;
	static String PDFtext;

	SoftAssert soft= new SoftAssert();
	private By getXMLDataElem = By.xpath("//TEXTAREA[@name='ctl00$ctl00$ParentContent$cPH$txtData']");

	
	public void taxNIGrossYTD(String expextedTax , String expectedEmployeeNI,String expectedEmployerNI,String expectedGross )
	{
		 m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));
		 
		String taxYTD = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[16]/div")).getText();
		String employeeNI = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[14]/div")).getText();
		String employerNI = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[17]/div")).getText();
		String gross = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[13]/div")).getText();
		
		soft.assertEquals(taxYTD, expextedTax, "expected result not matched");
		soft.assertEquals(employeeNI, expectedEmployeeNI, "employeeNI expected result not matched");
		soft.assertEquals(employerNI, expectedEmployerNI, "employerNI expected result not matched");
		
		//Reporter.log("Gross amount is not matched " +gross+"="+expectedGross);
		soft.assertEquals(gross, expectedGross, "Gross YTD expected result not matched");
		
		
		m_Driver.switchTo().defaultContent();
        Reporter.log("Verify Tax Ni and Gross YTD");
		
		
	}
	
	
	public void VerifyEmployeeEmployerNIOnPayslipReport( String employeeNI,String employerNI) throws  Exception
	{
	       Thread.sleep(5000);

	       m_Driver.findElement(By.xpath("//*[@id='myTable1']/tbody/tr[2]/td[23]/a")).click();
    
	       Thread.sleep(11000);
	       
	       
	       utilities.ChangeWindow.Switchwindow(3, m_Driver);
	   			Robot robot = new Robot();
	   			Thread.sleep(5000);
	   		
	           

	   			robot.keyPress(KeyEvent.VK_CONTROL);
	   			robot.keyPress(KeyEvent.VK_S);
	   			robot.keyRelease(KeyEvent.VK_CONTROL);    
	   			robot.keyRelease(KeyEvent.VK_S);

	   			Thread.sleep(5000);
	   			robot.keyPress(KeyEvent.VK_ENTER);
	   			robot.keyRelease(KeyEvent.VK_ENTER);
	   			Thread.sleep(9000);


			File file = new File("C:\\Users\\Sonu\\Downloads\\Employee-Payslip-Mr. Ravi Singh-31_07_2022.pdf");
			PDDocument document = PDDocument.load(file);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			PDFtext = pdfStripper.getText(document);
			
			//System.out.println(PDFtext);
			document.close();
			
		
		soft.assertTrue(PDFtext.contains(employeeNI));
		soft.assertTrue(PDFtext.contains(employerNI));
		

		Reporter.log("VerifyDepartmentOnPayslip");
	
				    if(file.delete())
				    System.out.println("file deleted");
				
	}
	

	
	
	public void VerifyRecievedEmailPayslip( String employeeNI,String employerNI) throws  Exception
	{
	    

	       m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']")).click();
    
	       Thread.sleep(11000);
	       
	       
	      


			File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Ravi Singh[56373] - 2022-07-31.pdf");
			PDDocument document = PDDocument.load(file);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			PDFtext = pdfStripper.getText(document);
			
			//System.out.println(PDFtext);
			document.close();
			
		
		soft.assertTrue(PDFtext.contains(employeeNI));
		soft.assertTrue(PDFtext.contains(employerNI));
		

		Reporter.log("VerifyDepartmentOnPayslip");
	
				    if(file.delete())
				    System.out.println("file deleted");
				
	}
	
	
	
	public void VerifyEmployeeViewIEPSExportToPdf( String employeeNI,String employerNI) throws  Exception
	{
	      


			File file = new File("C:\\Users\\Sonu\\Downloads\\IndividualEmployeePaySchedule-Mr. Ravi Singh.pdf");
			PDDocument document = PDDocument.load(file);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			PDFtext = pdfStripper.getText(document);
			
			//System.out.println(PDFtext);
			document.close();
			
		
		soft.assertTrue(PDFtext.contains(employeeNI));
		soft.assertTrue(PDFtext.contains(employerNI));
		

		Reporter.log("VerifyEmployeeViewIEPSExportToPdf");
	
				    if(file.delete())
				    System.out.println("file deleted");
				
	}
	
	
	
	
	public void ReadCSVFileEmployeeViewIEPS(String value) throws IOException, InterruptedException, AWTException {
		   
	    String path="C:\\Users\\Sonu\\Downloads\\IndividualEmployeePaySchedule-Mr. Ravi Singh.csv";

	        CSVReader reader = new CSVReader(
	                new FileReader(path));

	       


	       List<String[]> list = reader.readAll();
	        System.out.println("Total rows which we have is " + list.size());



	       // create Iterator reference
	        Iterator<String[]> iterator = list.iterator();



	       // Iterate all values
	        while (iterator.hasNext()) {



	           String[] str = iterator.next();



	           // System.out.print(" Values are ");
	            for (int i = 0; i < str.length; i++) {



	               // System.out.print(" "+str[i]);



	               if (str[i].contains(value))



	               {
	                    // Thread.sleep(100);
	                    soft.assertTrue(str[i].contains(value));



	                   System.out.println("pass");
	                   
	            
	                    break;
	                }

	            

	           }
	            
	            System.out.println("   ");



	       }
	     
	   		reader.close();
	   		
			File file = new File(path);

		    if(file.delete())
		    System.out.println("file deleted");
	    
	        Reporter.log("verify Department");



	   }
		
	
	
	public void verifyIndividualPaySchedule(String incomeTax, String employeeNI, String employerNI,String netPayment)
	{
		try {
			
		     List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='rowFinal']/td"));
		     
		     String taxPayment = list.get(4).getText();
		     taxPayment = taxPayment.replaceAll("[£]", "");
		     taxPayment = taxPayment.replaceAll("[,]", "");
		     
			 System.out.println("taxPayment-- "+taxPayment);
			
		     soft.assertEquals(taxPayment, incomeTax);

			 String employeeNi = list.get(5).getText();
			 employeeNi = employeeNi.replaceAll("[£]", "");
		     employeeNi = employeeNi.replaceAll("[,]", "");
			 System.out.println("employeeNi--"+employeeNi);
			 
		     soft.assertEquals(employeeNi, employeeNI);

			 
			 String employerNi = list.get(10).getText();
			 employerNi = employerNi.replaceAll("[£]", "");
			 employerNi = employerNi.replaceAll("[,]", "");
			 System.out.println("employerNi--"+employerNi);
			 
		     soft.assertEquals(employerNi, employerNI);

			 
			 String netPay = list.get(9).getText();
			 netPay = netPay.replaceAll("[£]", "");
			 netPay = netPay.replaceAll("[,]", "");
			 System.out.println("netPay--"+netPay);
		     
		     soft.assertEquals(netPay, netPayment);

		} catch (Exception e) {
			System.out.println("Issue In verifyIndividualPaySchedule"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}
		
		Reporter.log(" verifyIndividualPaySchedule");

        
	}
	
	
	
	public void verifyPayrollReportingPeriodSummary(String incomeTax, String employeeNI, String employerNI,String netPayment)
	{
		try {
			
		     List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='rowFinal']/td"));
		     
		     System.out.println(list.size());
		     String taxPayment = list.get(5).getText();
		     taxPayment = taxPayment.replaceAll("[£]", "");
		     taxPayment = taxPayment.replaceAll("[,]", "");
		     
			 System.out.println("taxPayment-- "+taxPayment);
			
		     soft.assertEquals(taxPayment, incomeTax);

			 String employeeNi = list.get(6).getText();
			 employeeNi = employeeNi.replaceAll("[£]", "");
		     employeeNi = employeeNi.replaceAll("[,]", "");
			 System.out.println("employeeNi--"+employeeNi);
			 
		     soft.assertEquals(employeeNi, employeeNI);

			 
			 String employerNi = list.get(11).getText();
			 employerNi = employerNi.replaceAll("[£]", "");
			 employerNi = employerNi.replaceAll("[,]", "");
			 System.out.println("employerNi--"+employerNi);
			 
		     soft.assertEquals(employerNi, employerNI);

			 
			 String netPay = list.get(10).getText();
			 netPay = netPay.replaceAll("[£]", "");
			 netPay = netPay.replaceAll("[,]", "");
			 System.out.println("netPay--"+netPay);
		     
		     soft.assertEquals(netPay, netPayment);

			System.out.println("taxPayment--"+taxPayment);
		} catch (Exception e) {
			System.out.println("Issue In PayrollReportingPeriodSummary"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}
		
		
		Reporter.log("verifyPayrollReportingPeriodSummary");
        
	}

	
	public void verifyPayrollSummary(String incomeTax, String employeeNI, String employerNI,String netPayment)
	{
		try {
			
		     List<WebElement> list = m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div"));
		     
		     System.out.println(list.size());
		     String taxPayment = list.get(1).getText();
		     taxPayment = taxPayment.replaceAll("[£]", "");
		     taxPayment = taxPayment.replaceAll("[,]", "");
		     
			 System.out.println("taxPayment-- "+taxPayment);
			
		     soft.assertEquals(taxPayment, incomeTax);

			 String employeeNi = list.get(4).getText();
			 employeeNi = employeeNi.replaceAll("[£]", "");
		     employeeNi = employeeNi.replaceAll("[,]", "");
			 System.out.println("employeeNi--"+employeeNi);
			 
		     soft.assertEquals(employeeNi, employeeNI);

			 
			 String employerNi = list.get(6).getText();
			 employerNi = employerNi.replaceAll("[£]", "");
			 employerNi = employerNi.replaceAll("[,]", "");
			 System.out.println("employerNi--"+employerNi);
			 
		     soft.assertEquals(employerNi, employerNI);

			 
			 String netPay = list.get(5).getText();
			 netPay = netPay.replaceAll("[£]", "");
			 netPay = netPay.replaceAll("[,]", "");
			 System.out.println("netPay--"+netPay);
		     
		     soft.assertEquals(netPay, netPayment);

			System.out.println("taxPayment--"+taxPayment);
		} catch (Exception e) {
			System.out.println("Issue In verifyPayrollSummary"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}
		
		
		Reporter.log("verifyPayrollSummary");
        
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

	
public void verifyXML(String Nic,String NICYtd,String AtLELYTD,String LELtoPTYTD, String PTtoUELYTD,String TotalEmpNICInPd,String TotalEmpNICYTD,String EmpeeContribnsInPd,String EmpeeContribnsYTD ) throws ParserConfigurationException, SAXException, IOException, InterruptedException {
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

   
	String xmlText=textArea1.getText();

   	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
   	DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();

   	InputSource src = new InputSource();
   	src.setCharacterStream(new StringReader(xmlText));
   	Document doc = dBuilder.parse(src);
//   	String XMLLELValue1 = doc.getElementsByTagName("TaxablePay").item(1).getTextContent();
//   	System.out.println("TaxablePay ="+XMLLELValue1);
//   	String XMLLELValue2 = doc.getElementsByTagName("TaxDeductedOrRefunded").item(0).getTextContent();
//   	System.out.println("TaxDeductedOrRefunded ="+XMLLELValue2);

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
   	
  
   	Reporter.log("verifyXML");	
}


public void verifyEmployerNic(String EmployerNI)
{
	
	try {
		
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[2]/td[12]"));
		
		String actualEmployerNi=elem.getText();
		System.out.println("actualEmployerNi ="+ actualEmployerNi);
		soft.assertEquals(actualEmployerNi, EmployerNI);

		
	} catch (Exception e) {
		System.out.println("Issue In  verifyEmployerNic "+e);
	    soft.assertFalse(true,"welcome to catch block");

	}
}

public void verifyTaxPaymentReport(String incomeTax, String employeeNI, String employerNI,String employementAllowance)
{
	double valueSum = 0;
	double valueSum1 = 0;

	double valueSum2 = 0;
	double valueSum3 = 0;


	String totalTaxSum = null;
	String totalEmployeeNI = null;
	String totalEmployerNI = null;
	String totalEmploymentAllownce = null;
	
	try {
		List<WebElement> list = m_Driver
				.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr/td[10]"));

	
		
		for (int i = 0; i < list.size() - 1; i++) {
			
			String value = list.get(i).getText();
			value = value.replaceAll("[£]", "");
			value = value.replaceAll("[,]", "");

			valueSum = valueSum + Double.parseDouble(value);
			totalTaxSum = String.format("%.2f", valueSum);

		}
		System.out.println("totalTax Sum- "+totalTaxSum);

		soft.assertEquals(totalTaxSum, incomeTax);

		List<WebElement> list1 = m_Driver
				.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr/td[1]"));

		for (int i = 0; i < list.size() - 1; i++) {
			String value = list1.get(i).getText();
			value = value.replaceAll("[£]", "");
			value = value.replaceAll("[,]", "");

			valueSum1 = valueSum1 + Double.parseDouble(value);
			totalEmployeeNI = String.format("%.2f", valueSum1);

		}
		System.out.println("totalEmployeeNI- "+totalEmployeeNI);

		soft.assertEquals(totalEmployeeNI, employeeNI);

		List<WebElement> list2 = m_Driver
				.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr/td[2]"));

		for (int i = 0; i < list.size() - 1; i++) {
			String value = list2.get(i).getText();
			value = value.replaceAll("[£]", "");
			value = value.replaceAll("[,]", "");

			valueSum2 = valueSum2 + Double.parseDouble(value);
			totalEmployerNI = String.format("%.2f", valueSum2);

		}
		System.out.println("totalEmployerNI- "+totalEmployerNI);


		soft.assertEquals(totalEmployerNI, employerNI);

		List<WebElement> list3 = m_Driver
				.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr/td[11]"));

		for (int i = 0; i < list.size() - 1; i++) {
			String value = list3.get(i).getText();
			value = value.replaceAll("[£]", "");
			value = value.replaceAll("[,]", "");

			valueSum3 = valueSum3 + Double.parseDouble(value);
			totalEmploymentAllownce = String.format("%.2f", valueSum3);

		}
		System.out.println("totalEmploymentAllownce- "+totalEmploymentAllownce);

		soft.assertEquals(totalEmploymentAllownce, employementAllowance);

	} catch (Exception e) {
		System.out.println("Issue in verifyTaxPaymentReport " + e);
	    soft.assertFalse(true,"welcome to catch block");

	}

	Reporter.log("Verify Employe Allowances");
    
}


public void enabledNoEmployerNIC()
{
	
	try {
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_chkIsEmployerNICLiable']"));
		
		
		System.out.println(elem.isEnabled());
		soft.assertTrue(elem.isEnabled());
		
	} catch (Exception e) {
		
		System.out.println("Issue In enabledNoEmployerNIC"+e);
	    soft.assertFalse(true,"welcome to catch block");

	}
	
	Reporter.log("enabledNoEmployerNIC");
}



public void verifyERNI(String ErNI,String ErNI1)
{
	
	
	try {
		
		List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr/td[5]"));
		
		
		for(int i=0;i<=list.size()-1;i++)
		{
			WebElement elem = list.get(i);
			String data=elem.getText();
             System.out.println(data);
			
			if(i<=3)
			{
								
				soft.assertEquals(data, ErNI);


			}
			
			else
			{
				soft.assertEquals(data, ErNI1);

				
			}
			
		}
        
		
	} catch (Exception e) {
		System.out.println("Issue In verifyERNI");
	    soft.assertFalse(true,"welcome to catch block");

	}
}




	 public void assertAll()
	   {
		   soft.assertAll();
		   
	   }
}
