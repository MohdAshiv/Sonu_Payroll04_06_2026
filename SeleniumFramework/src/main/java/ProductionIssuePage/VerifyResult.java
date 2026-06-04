package ProductionIssuePage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import au.com.bytecode.opencsv.CSVReader;
import pages.BasePage;
import pages.clickContinue;

public class VerifyResult extends BasePage {
	 boolean  con;

	private static String PDFtext;

	public VerifyResult(WebDriver driver) {
		super(driver);

	}

	 String path="E:\\LatestSeleniumFramework\\Sonu_Payroll_Selenium_New\\SeleniumFramework\\PdfFile\\";

	SoftAssert soft = new SoftAssert();

	public void verifyViewIcnWorkingFine(String expectedText) {

		try {

			utilities.ChangeWindow.Switchwindow(2, m_Driver);
			String actualText = m_Driver.findElement(By.xpath("//*[@class='page_title clearfix']/h2")).getText();

			System.out.println(actualText);

			soft.assertEquals(actualText, expectedText);

		} catch (Exception e) {
			soft.assertFalse(true, "welcome to catch block");

			System.out.println("Issue In verifyViewIcnWorkingFine" + e);
		}

		Reporter.log("verifyViewIcnWorkingFine");

	}

	public void verifyEditIcnWorkingFine(String expectedText) {

		try {

			utilities.ChangeWindow.Switchwindow(2, m_Driver);
			String actualText = m_Driver.findElement(By.xpath("//*[@class='page_title clearfix']/h2")).getText();

			System.out.println(actualText);

			soft.assertEquals(actualText, expectedText);

		} catch (Exception e) {
			System.out.println("Issue In verifyEditIcnWorkingFine" + e);
			soft.assertFalse(true, "welcome to catch block");

		}

		Reporter.log("verifyEditIcnWorkingFine");

	}

	public void verifyViewAndEditIcnWorkingFine(String expectedText) {

		try {

			utilities.ChangeWindow.Switchwindow(2, m_Driver);
			String actualText = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/header/h2"))
					.getText();

			System.out.println(actualText);

			soft.assertEquals(actualText, expectedText);

		} catch (Exception e) {
			System.out.println("Issue In verifyEditIcnWorkingFine" + e);
			soft.assertFalse(true, "welcome to catch block");

		}

		Reporter.log("verifyEditIcnWorkingFine");

	}

	public void verifyFilter(String expectedEditText) {

		try {

			String actualText = m_Driver
					.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkAcct']"))
					.getText();

			System.out.println(actualText);

			soft.assertEquals(actualText, expectedEditText);

		} catch (Exception e) {
			System.out.println("Issue In verifyEditIcnWorkingFine" + e);
			soft.assertFalse(true, "welcome to catch block");

		}

		Reporter.log("verifyFilter");

	}

	public void verifyFilter1(String expectedEditText) {

		try {

			String actualText = m_Driver.findElement(By.xpath(
					"//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[2]/div/div[1]/table/tbody/tr[2]/td[2]/a"))
					.getText();

			System.out.println(actualText);

			soft.assertEquals(actualText, expectedEditText);

		} catch (Exception e) {
			System.out.println("Issue In verifyEditIcnWorkingFine" + e);
			soft.assertFalse(true, "welcome to catch block");

		}

		Reporter.log("verifyFilterCompanyName");

	}

	public void verifyStatusFilter(String expectedEditText) {

		try {

			String actualText = m_Driver
					.findElement(By.xpath(
							"//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkSubmissionStatus']"))
					.getText();

			System.out.println(actualText);

			soft.assertEquals(actualText, expectedEditText);

		} catch (Exception e) {
			System.out.println("Issue In verifyEditIcnWorkingFine" + e);
			soft.assertFalse(true, "welcome to catch block");

		}

		Reporter.log("verifyStatusFilter");

	}

	public void verifySubmitAlert() {

		try {

			String actualText = m_Driver
					.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[1]")).getText();

			String alertMsg = actualText.replaceAll("×", "").trim();
			System.out.println(alertMsg);

			soft.assertEquals(alertMsg, "Error! Please select an transaction which you want to submit.");

			Thread.sleep(3000);

		} catch (Exception e) {
			System.out.println("Issue In verifyEditIcnWorkingFine" + e);
			soft.assertFalse(true, "welcome to catch block");

		}

		Reporter.log("verifySubmitAlert");

	}

	public void verifyRunPayroll() {

		try {

			String actualText = m_Driver.findElement(By.xpath("//*[@id='statusMessage1']/div")).getText();

			String alertMsg = actualText.replaceAll("×", "").trim();
			System.out.println(alertMsg);

			soft.assertEquals(alertMsg, "Success! All selected transactions are processed.");

			Thread.sleep(3000);

		} catch (Exception e) {
			System.out.println("Issue In verifyEditIcnWorkingFine" + e);
			soft.assertFalse(true, "welcome to catch block");

		}

		Reporter.log("verifyRunPayroll");

	}

	public void verifyRunPayrollFilter(String expectedAlert) {

		try {

			String actualText = m_Driver.findElement(By.xpath("//*[@id='statusMessage1']/div")).getText();

			String alertMsg = actualText.replaceAll("×", "").trim();
			System.out.println(alertMsg);

			soft.assertEquals(alertMsg, expectedAlert);

			Thread.sleep(3000);

		} catch (Exception e) {
			System.out.println("Issue In verifyEditIcnWorkingFine" + e);
			soft.assertFalse(true, "welcome to catch block");

		}

		Reporter.log("verifyRunPayroll");

	}

	public void verifyRunPayrollWarning() {

		try {

			String actualText = m_Driver.findElement(By.xpath("//*[@id='statusMessage']/div")).getText();

			String alertMsg = actualText.replaceAll("×", "").trim();
			System.out.println(alertMsg);

			soft.assertEquals(alertMsg, "Warning! Please select transaction to process them.");

			Thread.sleep(3000);

		} catch (Exception e) {
			System.out.println("Issue In verifyRunPayrollWarning" + e);
			soft.assertFalse(true, "welcome to catch block");

		}

		Reporter.log("verifyRunPayrollWarning");

	}

	public void verifySubmitPensionContribution() {

		try {

			String actualText = m_Driver
					.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/h2")).getText();

			// String alertMsg = actualText.replaceAll("×", "").trim();
			System.out.println(actualText);

			soft.assertEquals(actualText, "Pension Contribution Submission");

			Thread.sleep(3000);

		} catch (Exception e) {
			System.out.println("Issue In verifySubmitPensionContribution" + e);
			soft.assertFalse(true, "welcome to catch block");

		}

		Reporter.log("verifySubmitPensionContribution");

	}

	public void verifyUndoLastPayroll() {

		try {

			String actualText = m_Driver
					.findElement(By.xpath(
							"//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[2]/div/table/tbody/tr/td[1]"))
					.getText();

			// String alertMsg = actualText.replaceAll("×", "").trim();
			System.out.println(actualText);

			soft.assertEquals(actualText, "Total Record : 0");

			Thread.sleep(3000);

		} catch (Exception e) {
			System.out.println("Issue In verifyUndoLastPayroll" + e);
			soft.assertFalse(true, "welcome to catch block");

		}

		Reporter.log("verifyUndoLastPayroll");

	}

	public void verifySendEmaill() {

		try {

			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='sendsmsmodalIframe1']")));

			String actualText = m_Driver.findElement(By.xpath("//*[@class='col-lg-12 col-md-12 col-sm-12']/div"))
					.getText();

			String alertMsg = actualText.replaceAll("×", "").trim();
			System.out.println(alertMsg);

			soft.assertEquals(alertMsg, "Success! Your email is in a queue to be sent.");

			Thread.sleep(3000);

		} catch (Exception e) {
			System.out.println("Issue In verifyEditIcnWorkingFine" + e);
			soft.assertFalse(true, "welcome to catch block");

		}

		Reporter.log("verifyRunPayroll");

	}

	public void verifyNotSubmitAlert() {

		try {

			String actualText = m_Driver
					.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[1]")).getText();

			String alertMsg = actualText.replaceAll("×", "").trim();
			System.out.println(alertMsg);

			soft.assertEquals(alertMsg, "Error! Please select an transaction which you want not to submit.");

		} catch (Exception e) {
			System.out.println("Issue In verifyNotSubmitAlert" + e);
			soft.assertFalse(true, "welcome to catch block");

		}

		Reporter.log("verifyNotSubmitAlert");

	}

	public void verifyRunPayrollPage() {
	
	
		
		WebElement elem=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSubmitOnline']"));
		
		elem.click();
		
		
		try {
		    WebElement element = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnExportToPdf']"));
		    Assert.fail("Element should not exist but was found");
		} catch (NoSuchElementException e) {
		    // Element not found, assert or perform further actions as needed
			
			System.err.println("(((((Please  check once Manual))))");
			
		}
		
		
//		WebElement element = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnExportToPdf']"));
//		boolean isDisabled = (boolean) jsExec.executeScript("return arguments[0].hasAttribute('disabled');", element);
//
//		System.out.println(isDisabled);
		//jsExec.executeScript("setTimeout(function() { console.log('Delay completed.'); }, 3600000);"); // 1 hour delay


//	        System.out.println("skis");
//		 WebElement elem1 = m_Driver
//				.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnSearch']"));
//		
//		if(elem1==null)
//		{
//System.out.println("if condition");
//			
//		}
//		
//		else {
//			System.out.println("in else");
//		}
       
//	String data = m_Driver.getPageSource();
//	
//	boolean d = data.contains("Search");
//
//	System.out.println(d);
//	
//	
//
//		boolean con = list.isEnabled();
//		System.out.println("_________________");
//		System.out.println(con);
//
//		soft.assertTrue(con, "edit Icn click not as expected");
//
//		List<WebElement> list1 = m_Driver
//				.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplay_ctl00_lnkEmpName']"));
//		boolean con1 = list1.isEmpty();
//		System.out.println(con1);
//
//		soft.assertTrue(con1, "employee name click not as expected");
//
//		List<WebElement> list2 = m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnSearch']"));
//		boolean con2 = list2.isEmpty();
//		System.out.println(con2);
//		soft.assertTrue(con2, "search btn not as expected");
//
//		List<WebElement> list3 = m_Driver
//				.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnExportToCSV']"));
//		boolean con3 = list3.isEmpty();
//		System.out.println(con3);
//
//		soft.assertTrue(con3, "Export to csv btn not as expected");
//
//		List<WebElement> list4 = m_Driver
//				.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnExportToPdf']"));
//		boolean con4 = list4.isEmpty();
//		System.out.println(con4);
//
//		soft.assertTrue(con4, "Export to pdf btn not as expected");
//
//		String data = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/header/h2/span")).getText();
//		
//		System.out.println(data);
//		System.out.println("ddlk;slss");

	}
	
	public void verifyOffPayWorkerNote(String expecteData) {
		
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_dvOffPayrollWorker']"));
		String data=elem.getText();
		
		System.out.println(data);
		
		soft.assertEquals(data, expecteData );
		Reporter.log("verifyOffPayWorkerNote");
	}
	
	

	public void verifyOffPayWorkerNote1(String expecteData) {
		
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ReportP32UC_dvOffPayrollWorker']"));
		String data=elem.getText();
		
		System.out.println(data);
		
		soft.assertEquals(data, expecteData );
		Reporter.log("verifyOffPayWorkerNote");
	}
	
	
	
public void verifyOffPayWorkerNoteCSV(String value) throws InterruptedException, Exception {
	File file = new File("C:\\Users\\Sonu\\Downloads\\TaxPaymentReconciliation-2024-2025.csv");

	m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_Lnkbtncsv']")).click();
	Thread.sleep(9000);
    CSVReader reader = new CSVReader(
            new FileReader(file));

   List<String[]> list = reader.readAll();
    System.out.println("Total rows which we have is " + list.size());

   // create Iterator reference
    Iterator<String[]> iterator = list.iterator();

    
	// Iterate all values
    while (iterator.hasNext()) {

       String[] str = iterator.next();
      
    	   boolean data = str[0].contentEquals(value);
           con = data;
            System.out.println(con); 
      
       }
   
    if(con==true)
    {
    	System.out.println("if condition");
 	   
 	soft. assertTrue(con);
 	   
    }
    
    else
    {
    	System.out.println("else condition");
    	
     	soft. assertTrue(con);

    }
    
    reader.close();
    if(file.delete())
	    System.out.println("file deleted");
   
    
    
    Reporter.log("verifyOffPayWorkerNoteCSV");

}



public void verifyOffPayWorkerNotePdf(String xpath,String Note) throws  Exception
{
	  
	jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath(xpath)));

	Thread.sleep(9000);

		File file = new File("C:\\Users\\Sonu\\Downloads\\TaxPaymentReconciliation-2024-2025.pdf");
		PDDocument document = PDDocument.load(file);
		PDFTextStripper pdfStripper = new PDFTextStripper();
		PDFtext = pdfStripper.getText(document);
		
	
		  String [] str = PDFtext.split("Month : All");
		  String[] data = str[1].split("Month");
		  
		  System.out.println(data[0].trim());
		  
		  soft.assertEquals(data[0].trim(), Note);
		
		

	Reporter.log("verifyOffPayWorkejrNotePdf");
	document.close();

			    if(file.delete())
			    System.out.println("file deleted");
			
}


public void verifyOffPayWorkerNotePdf1(String xpath,String Note) throws  Exception
{
	  
	jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath(xpath)));

	Thread.sleep(9000);

		File file = new File("C:\\Users\\Sonu\\Downloads\\TaxPaymentReconciliationReport.pdf");
		PDDocument document = PDDocument.load(file);
		PDFTextStripper pdfStripper = new PDFTextStripper();
		PDFtext = pdfStripper.getText(document);
		
		 String [] str = PDFtext.split("Month : All");
		  String[] data = str[1].split("Month");
		  
		  System.out.println(data[0].trim());
		  
		  soft.assertEquals(data[0].trim(), Note);
		
		

	Reporter.log("verifyOffPayWorkerNotePdf");
	document.close();

			    if(file.delete())
			    System.out.println("file deleted");
			
}


public void verifyEmailToTaxPayement() throws Exception
{


	WebElement closeBtn = m_Driver.findElement(By.xpath("(//*[@id='PopUpClose'])[2]"));


	Thread.sleep(5000);
	
	soft. assertFalse(closeBtn.isDisplayed());
  
	Reporter.log("verifyEmailToTaxPayement");
}



public void VerifyErEeAtRunPayrollPage(String expecteEmployeeNi,String expecteEmployerNi ) {
	
WebElement data = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_td5']"));
	
	 String employeeNi = data.getText();
	
	System.out.println(employeeNi);
	
	
WebElement data1 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_td8']"));
	
	 String employerNi = data1.getText();
	 
	 System.out.println(employerNi);
	

	
	soft.assertEquals(employeeNi, expecteEmployeeNi );
	soft.assertEquals(employerNi, expecteEmployerNi );

	
	Reporter.log("VerifyErEeAtRunPayrollPage");
}

   
	
public void verifyFillingManagmentGross(String expectedData) {
	
	
	
	 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[7]"));
	
	 boolean con=list.isEmpty();
     soft.assertFalse(con);
     
     for (int i=0;i<=list.size()-1;i++)
     {
    	  String data = list.get(i).getText();
    	  
    	  System.out.println(data);
    	  
    	  soft.assertEquals(data, expectedData);
    	 
     }
     Reporter.log("verifyFillingManagmentGross");
     
}



public void payrollReportingPeriodSummary(String expectedData) {
	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/header/h2/span"));
	String data = elem.getText();
	
	System.out.println(data);
	
	soft.assertEquals(data, expectedData);
	
	Reporter.log("payrollReportingPeriodSummary");
}

       

public void verifyEmployeeName(String expectedData) {
	
	
	String data = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords_ctl02_lnkEditEmp']")).getText();
	
	
	soft.assertEquals(data, expectedData);
	
	Reporter.log("verifyEmployeeName");
	
	
}




public void verifyErrorMsg() {
	
	
	String data = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[1]/div")).getText();
	
	System.out.println(data);
	
	soft.assertTrue(data.contains("Error"));
	
	Reporter.log("verifyErrorMsg");
	
	
}



public void verifyLeaveDaysTaken() {
	
	 WebElement elem = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div/div[1]/div/div/table/tbody/tr[3]/td[5]"));
	 
	String data = elem.getText();
	
	
	soft.assertEquals(data, "2.00");
	
	Reporter.log("verifyLeaveDaysTaken");
}



public void verifyLeaveDaysTaken1() {
	
	 WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtHolidayCount']"));
	 
	String data = elem.getAttribute("value");
	
	
	soft.assertEquals(data, "2.00");
	
	Reporter.log("verifyLeaveDaysTaken");
}


public void verifyTypes(String expectedData, String expectedData1, String expectedData2) throws InterruptedException {
	
	
	Thread.sleep(3000);
	 WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrUnit_ctl00_txtUnit10LebelName']"));
	 
	String data = elem.getAttribute("value");
	
	System.out.println(data);
	soft.assertEquals(data, expectedData);
	
	

	WebElement elem1 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrUnit_ctl01_txtUnit10LebelName']"));
	 
	String data1 = elem1.getAttribute("value");
	System.out.println(data1);
	soft.assertEquals(data1, expectedData1);
	

   WebElement elem2 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrUnit_ctl02_txtUnit10LebelName']"));
	 
	String data2 = elem2.getAttribute("value");
	System.out.println(data2);
	soft.assertEquals(data2, expectedData2);
	
	
	  Reporter.log("verifyTypes");
}




public void verifyFailledStatusPopup(String expectedData) {
	
	m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div[3]/div/div/table/tbody/tr[1]/th"));
	String data = elem.getText();
	
	System.out.println(data);
	
	soft.assertEquals(data, expectedData);
	
	m_Driver.switchTo().defaultContent();
	
	Reporter.log("verifyFailledStatusPopup");
}



public void verifyHmrcPaymentBtn(String expectedData) throws Exception {
	
	m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_lnkHMRCPaymentsMade']")).click();
	Thread.sleep(2000);
	
	m_Driver.switchTo().frame(getWebElement(By.xpath("(//*[@id='PopUpFrame'])[1]")));

	
	WebElement elem = m_Driver.findElement(By.xpath("//*[contains(text(),'Actually Paid')]"));
	String data = elem.getText();
	
	System.out.println(data);
	
	soft.assertEquals(data, expectedData);
	
	m_Driver.switchTo().defaultContent();
	
	Reporter.log("verifyHmrcPaymentBtn");
}




public void verifyLeaveEditBtn(String expectedData) throws Exception {
	
	m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div[1]/div[3]/div/div[2]/div/div/div[1]/div/table[1]/tbody/tr[2]/td[10]/a")).click();
	Thread.sleep(2000);
	

	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div[1]/div[3]/header/h2/span"));
	String data = elem.getText();
	
	System.out.println(data);
	
	soft.assertEquals(data, expectedData);
	
	
	Reporter.log("verifyLeaveEditBtn");
}


public void verifyLeaveDeletBtn(String expectedData) throws Exception {
	
	m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div[1]/div[3]/div/div[2]/div/div/div[1]/div/table[1]/tbody/tr[2]/td[11]/a")).click();
	Thread.sleep(2000);
	

	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div[1]/div[3]/header/h2/span"));
	String data = elem.getText();
	
	System.out.println(data);
	
	soft.assertEquals(data, expectedData);
	
	
	Reporter.log("verifyLeaveDeletBtn");
}

 public void verifyGrossData(String data, String data1, String data2, String data3) {
	 
		
		try {
			 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[5]"));
			 ArrayList<String> ar= new ArrayList<String>();
				ar.add(data);
				ar.add(data1);
				ar.add(data2);
				ar.add(data3);

				System.out.println(list.size());

				boolean con=list.isEmpty();
			     soft.assertFalse(con);
				
			 for (int i =0;i<=list.size()-1;i++)
			 {
				 
				 List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[5]"));

				 WebElement elem = list1.get(i);
				 
				String actualData = elem.getText();
//				actualData = actualData.replaceAll("[£]", "");
//				actualData = actualData.replaceAll("[,]", "");

				System.out.println(actualData);
				 soft.assertEquals(actualData, ar.get(i));
				
			 }
			 
			
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verifyGrossData"+e);
		}
	 
	 
	 
 }

 
 public void verifyP11DemployeeIsClickable(String expectedData) {
	 
	 WebElement elem = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div[1]/div[3]/header/h2"));
	 String data = elem.getText();
	 
	 System.out.println(data);
	 
	 soft.assertEquals(data, expectedData);
	 Reporter.log("verifyP11DemployeeIsClickable");
 
	 
 }
 
 
 public void verifyP11DemployeeIsClickable1(String expectedData) {
	 
	 WebElement elem1 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ReportP11DUC_rptrDisplayRecords_ctl00_Label1']"));

	 elem1.click();
	 
	 
	 
	 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div[1]/div[3]/header/h2"));
	 
	 
	  soft.assertEquals(list.size(), 0);
	 Reporter.log("verifyP11DemployeeIsClickable1");
 
	 
 }
 
   public void verifyP11dNiRate(String xpath,String data) throws Exception {
	   
	   m_Driver.findElement(By.xpath(xpath)).click();
	   
	   Thread.sleep(15000);
	  File file = new File("C:\\Users\\Sonu\\Downloads\\P11D(b)-P11d-2023-2024.pdf");
		PDDocument document = PDDocument.load(file);
		PDFTextStripper pdfStripper = new PDFTextStripper();
		String PDFtext = pdfStripper.getText(document);
		System.out.println(PDFtext);
		 document.close();

	     soft.assertTrue(PDFtext.contains(data));
	     
	     file.delete();
	     Reporter.log("verifyP11dNiRate");
   }
   
   
   
  public void verifyP11dNiRate1(String data) throws Exception {
	   
	   m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ReportP11DUC_rptrDisplayRecords_ctl00_btnPdf']")).click();
	   
	   Thread.sleep(15000);
	   File file = new File("C:\\Users\\Sonu\\Downloads\\Mr. MAnish  Employee-P11D Form-2023-2024.pdf");
		PDDocument document = PDDocument.load(file);
		PDFTextStripper pdfStripper = new PDFTextStripper();
		String PDFtext = pdfStripper.getText(document);
		//System.out.println(PDFtext);
		 document.close();
 	     soft.assertTrue(PDFtext.contains(data));
	     
	     file.delete();
 
	     Reporter.log("verifyP11dNiRate");
   }
  
  
  public void verifyNumberOfStaff(String expectedData) {
		 
		 WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_rptrDepartmentDetails_ctl00_lnkNoOfStaff']"));
		 String data = elem.getText();
		 
		 System.out.println(data);
		 
		 soft.assertEquals(data, expectedData);
		 Reporter.log("verifyNumberOfStaff");
	 
		 
	 }
  
  
  public void verifyGrossOnSubmitRtiBtnAgentPage(String data1)
  {
	  
	  WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[2]/div/div/table/tbody/tr[2]/td[9]"));
	  
	  String data = elem.getText();
	  
	  System.out.println(data);
		 soft.assertEquals(data, data1);

	  Reporter.log("verifyGrossOnSubmitRtiBtnAgentPage");
  }
 
  public void verifySubmissionDateAndApproveDate() throws Exception {

	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkSubmissionStatus']")).click();
	  
	  Thread.sleep(3000);
	  
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

	  
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[2]/div/div/div/table/tbody/tr[2]/td[2]"));
		String actualDateTime = elem.getText();
		String[] actualDate = actualDateTime.split(" ");
		
		System.err.println(actualDate[0]);
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
		String formattedDate = sdf.format(date);
		System.out.println(formattedDate); // 23-Aug-2024
		

		soft.assertEquals(actualDate[0], formattedDate);


	}
  
  
  public  void verifySaveBtnIsHideAndUnHide(int expectedCount,int expectedCount1 ) {
	  
	  List<WebElement> list = m_Driver.findElements(By.xpath("//*[@type='submit'][@aria-hidden='false']"));
	  
	  int actualCount=list.size();
	  System.out.println(actualCount);
	  
	  soft.assertEquals(actualCount, expectedCount);
	  
	  
  List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@type='button'][@aria-hidden='false']"));
	  
	  int actualCount1=list1.size();
	  System.out.println(actualCount1);
	  
	  soft.assertEquals(actualCount1, expectedCount1);
	  Reporter.log("verifySaveBtnIsHide");
	  
  }
  
 
  public void verifySuccessMsg(String data1) {
	  
	  WebElement elem = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div[1]/div[3]/div/div[1]"));
	   String data = elem.getText();
	   System.out.println(data);
	   soft.assertEquals(data, data1);

	 System.out.println("verifySuccessMsg");

  }
  
  

  public void verifyRTISubmissionSuccessMsg(String data1) {
	  
	  WebElement elem = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div[1]/div[3]/div/div[1]"));
	   String data = elem.getText();
	   System.out.println(data);
	   soft.assertEquals(data, data1);

	 System.out.println("verifyRTISubmissionSuccessMsg");

  }
  
  
  public void PensionDahboard(String data, String data1, String data2 ){
	  
	  List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[1]"));
	 
	                     boolean count = list.isEmpty();
	                    
	          soft.assertFalse(count);
	          ArrayList<String> ar= new ArrayList<String>();
				ar.add(data);
				ar.add(data1);
				ar.add(data2);
	          
	          for(int i=0; i<=list.size()-1;i++) {
	        	  
	        	 String actualData = list.get(i).getText().trim();
	        	 
	        	 System.out.println(actualData);
	        	 
	        	 soft.assertEquals(actualData, ar.get(i));
	        	  
	        	 Reporter.log("PensionDahboard");
	          }

  }
  
  
  
  public void AssessPage(String data, String data1 ){
	  
	  List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[4]"));
	 
	                     boolean count = list.isEmpty();
	                    
	          soft.assertFalse(count);
	          ArrayList<String> ar= new ArrayList<String>();
				ar.add(data);
				ar.add(data1);
	          
	          for(int i=0; i<=list.size()-1;i++) {
	        	  
	        	 String actualData = list.get(i).getText().trim();
	        	 
	        	 System.out.println(actualData);
	        	 
	        	 soft.assertEquals(actualData, ar.get(i));
	        	  
	        	 Reporter.log("AssessPage");
	          }

  }
  
  
  public void PensionDahboardRow(String data, String data1, String data2,String data3){
	  
	  List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr[4]/td"));
	 
	         
	 String pensionablePay = list.get(4).getText();
	 System.out.println(pensionablePay);
	 soft.assertEquals(pensionablePay, data);

	 String eeAmount = list.get(7).getText();
	 System.out.println(eeAmount);
	 soft.assertEquals(eeAmount, data1);
	 
	 String erAmount = list.get(8).getText();
	 System.out.println(erAmount);
	 soft.assertEquals(erAmount, data2);
	 
	 String total = list.get(9).getText();
	 System.out.println(total);
	 soft.assertEquals(total, data3);
    Reporter.log("PensionDahboardRow");
	 
	          }
  
  
  
  public void verifyZeroPensionList(String expectedData1, String expectedData2, int count1,int count2) {
	  
	  String data1 = m_Driver.findElement(By.xpath("//*[contains(text(), 'C Employee')]")).getText();
	  System.out.println(data1);
	  soft.assertEquals(data1, expectedData1);

	  String data2 = m_Driver.findElement(By.xpath("//*[contains(text(), 'D Employee')]")).getText();

	  System.out.println(data2);
	  
	  soft.assertEquals(data2, expectedData2);
	  
	  List<WebElement> list = m_Driver.findElements(By.xpath("//*[contains(text(), 'B Employee')]"));

	  soft.assertEquals(list.size(), count1);
	  
	  List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[contains(text(), 'E Employee')]"));

	  soft.assertEquals(list1.size(), count2);
	  
	  Reporter.log("verifyZeroPensionList");
	    
	  
	  
  }
	          
  
  public void verifyRtiSubmissionId(int expectedCount) {
	  
	 WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtEmployeePayId']"));
	  
	  String data = elem.getAttribute("value");
	  
      int characterCount = data.length();
      
      System.out.println(characterCount);
      
      soft.assertEquals(characterCount, expectedCount);
      Reporter.log("verifyRtiSubmissionId");
	  
  }
    
  
  public void verifyStatus(int expectedCount)
  {
	  
	   List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[1]"));
	  
	     int actualCount= list.size();
	     
	     System.out.println(actualCount);
	     
	     soft.assertEquals(actualCount, expectedCount);
	  
	     Reporter.log("verifyStatus");
	   
  }
  
  
  
  public void verifyStatusSubmitAndNotToSubmit(int expectedCount, String expectedData)
  {
	  
	   List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[1]"));
	     int actualCount= list.size();
	     
	    System.out.println(actualCount);
	     
	    soft.assertEquals(actualCount, expectedCount);
	     
	    WebElement elem = m_Driver.findElement(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[9]"));
	    String actualData  =elem.getText();
	    
	    System.out.println(actualData);
	    
	    soft.assertEquals(actualData, expectedData);

	    Reporter.log("verifyStatusSubmitAndNotToSubmit");
	   
  }
  
  
  
  public void verifNoRecordStatus(String expectedData) {
	  
	 WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_grdPensionFilling']/tbody/tr/td"));
	  
	    String data = elem.getText();
	    
	    System.out.println(data);
	    soft.assertEquals(data, expectedData);
	    
	    Reporter.log("verifNoRecordStatus");
	 
  }
  
  
  public void verifyPayslip(String pay) throws  Exception
	{
		
	 m_Driver.findElement(By.xpath("//*[@id='myTable1']/tbody/tr[2]/td[21]/a")).click();
	 
	 Thread.sleep(20000);
	
			File file = new File(path+"Employee-Payslip-Mr. Aniket Singh-31_08_2024.pdf");
			PDDocument document = PDDocument.load(file);
			PDFTextStripper pdfStripper = new PDFTextStripper();
		  String	PDFtext = pdfStripper.getText(document);
			
			System.out.println(PDFtext);
			document.close();
			
		soft.assertTrue(PDFtext.contains(pay),"Basic pay not as expected");
	
		Reporter.log("verifyPayslip");
		
		 if(file.delete())
		 System.out.println("verifyPayslip");
				
	}
  
  
  
  public void verifyLeaveOnPayslip(String leaveEntitel,String leaveTaken,String leaveBalance ) throws  Exception
 	{
 		
 	 m_Driver.findElement(By.xpath("//*[@id='myTable1']/tbody/tr[2]/td[21]/a")).click();
 	 
 	 Thread.sleep(20000);
 	
 			File file = new File(path+"Employee-Payslip-Mr. Employee A-31_01_2024.pdf");
 			PDDocument document = PDDocument.load(file);
 			PDFTextStripper pdfStripper = new PDFTextStripper();
 		  String	PDFtext = pdfStripper.getText(document);
 			
 			System.out.println(PDFtext);
 			document.close();
 			
 		soft.assertTrue(PDFtext.contains(leaveEntitel),"leaveEntitel pay not as expected");
 	
 		soft.assertTrue(PDFtext.contains(leaveTaken),"leaveTaken  not as expected");
 		soft.assertTrue(PDFtext.contains(leaveBalance),"leaveBalance  not as expected");

 		Reporter.log("verifyPayslip");
 		
 		 if(file.delete())
 		 System.out.println("verifyPayslip");
 				
 	}
  
  
  
  
  public void verifySubmissionLogDate() throws Exception {

	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnAuditTrail']")).click();
	  
	  Thread.sleep(3000);
	 

		WebElement elem = m_Driver.findElement(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]"));
		String actualDateTime = elem.getText();
		String[] actualDate = actualDateTime.split(" ");
		
		System.err.println(actualDate[0]);
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String formattedDate = sdf.format(date);
		System.out.println(formattedDate); // 23/09/2024
		

		soft.assertEquals(actualDate[0], formattedDate);
		Reporter.log("verifySubmissionLogDate");

	}
  
	public void assertAll() {

		soft.assertAll();

	}

	
	
}
