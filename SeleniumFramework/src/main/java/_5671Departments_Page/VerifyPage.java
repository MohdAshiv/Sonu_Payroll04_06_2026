package _5671Departments_Page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import au.com.bytecode.opencsv.CSVReader;
import pages.BasePage;
import utilities.reports.ExtentReportManager;

public class VerifyPage  extends BasePage{

	public VerifyPage(WebDriver driver) {
		super(driver);
	
	}
	SoftAssert soft= new SoftAssert();
	static String PDFtext;

	
	private By saveMsgElem= By.xpath("");
	 private By deletDepartmentElem1= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnDelete']");

	
			
		public void verifyDepartmentSavedMsg(String data)
	{
		
		try {
			
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFramemd']")));

			String alert = m_Driver.findElement(By.xpath("//*[@class='alert alert-success']")).getText();
			
			String alertMsg = alert.replaceAll("×", "").trim();
			System.out.println(alertMsg);
			soft.assertEquals(alertMsg, data);
			
			m_Driver.switchTo().defaultContent();
			
		} catch (Exception e) {
			System.out.println("Issue in verifyDepatrmentSavedMsg"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}
		Reporter.log("verifyDepatrmentSavedMsg");
	}
	
		
		
		
	public void verifyDepartmentShouldNotDuplicate(String data)
	{
		
		try {
			
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFramemd']")));

			String alert = m_Driver.findElement(By.xpath("//*[@class='alert alert-danger alert-dismissible']")).getText();
			
			String alertMsg = alert.replaceAll("×", "").trim();
			System.out.println(alertMsg);
			soft.assertEquals(alertMsg, data);
			
			m_Driver.switchTo().defaultContent();
			
		} catch (Exception e) {
			System.out.println("Issue in verifyDepatrmentSavedMsg"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}
		Reporter.log("verifyDepatrmentSavedMsg");
	}
		
	
	
	
	public void verifyDepartmentName(String data)
	{
		
		try {
			

			String actualName = m_Driver.findElement(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr/td[1]")).getText();
			
			System.out.println(actualName);
			
			soft.assertEquals(actualName, data);
			

			
		} catch (Exception e) {
			System.out.println("Issue in verifyDepartmentName"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}
		Reporter.log("verifyDepartmentName");
	}
		
		
		
	public void verifyDeletAlert(String expectedAlert)
	{
		
		try {
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFramemd']")));

	 		WebElement elem = getWebElement(deletDepartmentElem1);

	 		if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickDeletDepartment1", "clickDeletDepartment1 failed. Unable to locate object: " + deletDepartmentElem1.toString());

	 			Assert.fail("Unable to locate object: " + deletDepartmentElem1.toString());
	         }

	 	    elem.click();


           String actualAlert = m_Driver.switchTo().alert().getText();			
           m_Driver.switchTo().alert().accept();

           System.out.println(actualAlert);
			soft.assertEquals(actualAlert, expectedAlert);
			
		} catch (Exception e) {
			System.out.println("Issue in verifyDeletAlert"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}
		Reporter.log("verifyDeletAlert");
	}
		
	
	
	
	public void verifyDeletDepartmentDisable()
	{
		
		try {
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFramemd']")));

	 		boolean enabled = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtDepartmentName']")).isEnabled();

		
           System.out.println(enabled);
		   
           soft.assertFalse(enabled);
			

		} catch (Exception e) {
			System.out.println("Issue in verifyDeletDepartmentDisable"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}
		Reporter.log("verifyDeletDepartmentDisable");
	}
		
		
		
		public void verifyNumberOfStaff(String data)
	{
		
		try {
			
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFramemd']")));

			String alert = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div/p")).getText();
			
			String alertMsg = alert.replaceAll("×", "").trim();
			System.out.println(alertMsg);
			soft.assertEquals(alertMsg, data);
			
			m_Driver.switchTo().defaultContent();
			
		} catch (Exception e) {
			System.out.println("Issue in verifyDepatrmentSavedMsg"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}
		Reporter.log("verifyDepatrmentSavedMsg");
	}
		
		
		
		public void verifyMsgWithEmptyDepartment(String data)
	{
		
		try {
			
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFramemd']")));

			String alert = m_Driver.findElement(By.xpath("//*[@class='alert alert-danger alert-dismissible']")).getText();
			
			String alertMsg = alert.replaceAll("×", "").trim();
			System.out.println(alertMsg);
			soft.assertEquals(alertMsg, data);
			
			m_Driver.switchTo().defaultContent();
			
		} catch (Exception e) {
			System.out.println("Issue in verifyMsgWithEmptyDepartment"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}
		Reporter.log("verifyMsgWithEmptyDepartment");
	}
		
		
		
		
  public void verifyDepartmentDeletMsg(String data)
{
	
	try {
		
		List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr/td[4]"));
		
		for (int i=0;i<=10;i++)
		{
//			
//			List<WebElement> list1 = m_Driver.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr/td[4]"));
//
//			
//			
//			elem.click();
			
			m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_rptrDepartmentDetails_ctl00_lnkDelete']")).click();
			Thread.sleep(2000);
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFramemd']")));

			m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnDelete']")).click();
		
			m_Driver.switchTo().alert().accept();
			

			String alert = m_Driver.findElement(By.xpath("//*[@class='alert alert-success']")).getText();
			
			String alertMsg = alert.replaceAll("×", "").trim();
			System.out.println(alertMsg);
			soft.assertEquals(alertMsg, data);
			
			m_Driver.switchTo().defaultContent();
			
			Thread.sleep(9000);
			
			
			
		}

		
	} catch (Exception e) {
		System.out.println("Issue in verifyDepartmentDeletMsg"+e);
	    soft.assertFalse(true,"welcome to catch block");

	}
	Reporter.log("verifyDepartmentDeletMsg");
}
		
  
  public void verifyDepartmentDeletMsg1(String data)
{
	
	try {
		
		List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr/td[4]"));
		
		for (int i=0;i<=10;i++)
		{
//			
//			List<WebElement> list1 = m_Driver.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr/td[4]"));
//
//			
//			
//			elem.click();
			
			m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_rptrDepartmentDetails_ctl00_lnkDelete']")).click();
			Thread.sleep(2000);
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFramemd']")));

			m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnDelete']")).click();
		
			m_Driver.switchTo().alert().accept();
			

			String alert = m_Driver.findElement(By.xpath("//*[@class='alert alert-success']")).getText();
			
			String alertMsg = alert.replaceAll("×", "").trim();
			System.out.println(alertMsg);
			soft.assertEquals(alertMsg, data);
			
			m_Driver.switchTo().defaultContent();
			
			Thread.sleep(1000);
			break;
			
			
			
		}

		
	} catch (Exception e) {
		System.out.println("Issue in verifyDepartmentDeletMsg"+e);
	    soft.assertFalse(true,"welcome to catch block");

	}
	Reporter.log("verifyDepartmentDeletMsg");
}
		

	public void verifyDepartmentFirstEmployee(String data)
	{
			
		try {
			WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[2]/td[4]"));
			
			 String actualDepartment=elem.getText();
			 
			 System.out.println("actualDepartment-"+actualDepartment);
			 
				soft.assertEquals(actualDepartment, data);

		} catch (Exception e) {
			
			System.out.println("Issue In verifyDepartment"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}	
			
		Reporter.log("verifyDepartment");
	}
	
	
	
	
	public void verifyDepartmentOnP11D(String data)
	{
			
		try {
			WebElement elem = m_Driver.findElement(By.xpath("//*[@id='tblRptP11D']/tbody/tr[2]/td[5]"));
			
			 String actualDepartment=elem.getText();
			 
			 System.out.println("actualDepartment-"+actualDepartment);
			 
				soft.assertEquals(actualDepartment, data);

		} catch (Exception e) {
			
			System.out.println("Issue In verifyDepartment"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}	
			
		Reporter.log("verifyDepartment");
	}
	
		
	
	public void verifyDepartmentSecondEmployee(String data)
	{
			
		try {
			WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[3]/td[4]"));
			
			 String actualDepartment=elem.getText();
			 
			 System.out.println("actualDepartment-"+actualDepartment);
			 
				soft.assertEquals(actualDepartment, data);

		} catch (Exception e) {
			
			System.out.println("Issue In verifyDepartment"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}	
			
		Reporter.log("verifyDepartment");
	}
	
	
	
	public void verifyDepartmentsEmployerViewEmployee(String data)
	{
			
		try {
			WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_lblDepartment']"));
			
			 String actualDepartment=elem.getText();
			 
			 System.out.println("actualDepartment-"+actualDepartment);
			 
				soft.assertEquals(actualDepartment, data);

		} catch (Exception e) {
			
			System.out.println("Issue In verifyDepartmentsEmployerViewEmployee"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}	
			
		Reporter.log("verifyDepartmentsEmployerViewEmployee");
	}
	

	public void verifyDepartmentsPayrollSummary(String data,String data1)
	{
			
		try {
			WebElement elem = m_Driver.findElement(By.xpath("//*[starts-with(text(), 'pooja Singh')]//following::td[1]"));
			
			 String actualDepartment=elem.getText();
			 
			 System.out.println("actualDepartment-"+actualDepartment);
			 
			 soft.assertEquals(actualDepartment, data);
			 
			 WebElement elem1 = m_Driver.findElement(By.xpath("//*[starts-with(text(), 'Ravi')]//following::td[1]"));
				
			 String actualDepartment1=elem1.getText();
			 System.out.println("actualDepartment-"+actualDepartment1);

			 soft.assertEquals(actualDepartment1, data1);


		} catch (Exception e) {
			
			System.out.println("Issue In verifyDepartmentsPayrollSummary"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}	
			
		Reporter.log("verifyDepartmentsPayrollSummary");
	}
		
	
	
	public void verifyMultipleDepartmentsPayrollSummary(String data,String data1,String data2,String data3,String data4,String data5,String data6,String data7,String data8,String data9)
	{
			
		try {
			 List<WebElement> list = m_Driver.findElements(By.xpath("//td[2]"));
			
			 String actualDepartment=list.get(13).getText();
			 
			 System.out.println("actualDepartment-"+actualDepartment);
			 
			 soft.assertEquals(actualDepartment, data);
			 
              String actualDepartment1=list.get(14).getText();
			 
			 System.out.println("actualDepartment-"+actualDepartment1);
			 
			 soft.assertEquals(actualDepartment1, data1);

				String actualDepartment2 = list.get(15).getText();

				System.out.println("actualDepartment-" + actualDepartment2);

				soft.assertEquals(actualDepartment2, data2);

				String actualDepartment3 = list.get(16).getText();

				System.out.println("actualDepartment-" + actualDepartment3);

				soft.assertEquals(actualDepartment3, data3);

				String actualDepartment4 = list.get(17).getText();

				System.out.println("actualDepartment-" + actualDepartment4);

				soft.assertEquals(actualDepartment4, data4);

				String actualDepartment5 = list.get(18).getText();

				System.out.println("actualDepartment-" + actualDepartment5);

				soft.assertEquals(actualDepartment5, data5);

				String actualDepartment6 = list.get(19).getText();

				System.out.println("actualDepartment-" + actualDepartment6);

				soft.assertEquals(actualDepartment6, data6);

				String actualDepartment7 = list.get(20).getText();

				System.out.println("actualDepartment-" + actualDepartment7);

				soft.assertEquals(actualDepartment7, data7);

				String actualDepartment8 = list.get(21).getText();

				System.out.println("actualDepartment-" + actualDepartment8);

				soft.assertEquals(actualDepartment8, data8);

				String actualDepartment9 = list.get(22).getText();

				System.out.println("actualDepartment-" + actualDepartment9);

				soft.assertEquals(actualDepartment9, data9);

		} catch (Exception e) {
			
			System.out.println("Issue In verifyMultipleDepartmentsPayrollSummary"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}	
			
		Reporter.log("verifyMultipleDepartmentsPayrollSummary");
	}
		
	
	

	public void verifyDepartmentsPayrollReportingPeriodSummary(String data,String data1)
	{
			
		try {
			 List<WebElement> elem = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]"));
			
			 String actualDepartment=elem.get(0).getText();
			 
			 System.out.println("actualDepartment-"+actualDepartment);
			 
			 soft.assertEquals(actualDepartment, data);
			 
		//	 WebElement elem1 = m_Driver.findElement(By.xpath("//*[starts-with(text(), 'Ravi')]//following::td[1]"));
				
			 String actualDepartment1=elem.get(1).getText();
			 System.out.println("actualDepartment-"+actualDepartment1);

			 soft.assertEquals(actualDepartment1, data1);


		} catch (Exception e) {
			
			System.out.println("Issue In verifyDepartmentsPayrollReportingPeriodSummary"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}	
			
		Reporter.log("verifyDepartmentsPayrollReportingPeriodSummary");
	}
		
	
	
	public void verifyDepartmentsEmployeeDetailsList(String data,String data1)
	{
			
		try {
			 List<WebElement> elem = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[7]"));
			
			 String actualDepartment=elem.get(0).getText();
			 
			 System.out.println("actualDepartment-"+actualDepartment);
			 
			 soft.assertEquals(actualDepartment, data);
			 
		//	 WebElement elem1 = m_Driver.findElement(By.xpath("//*[starts-with(text(), 'Ravi')]//following::td[1]"));
				
			 String actualDepartment1=elem.get(1).getText();
			 System.out.println("actualDepartment-"+actualDepartment1);

			 soft.assertEquals(actualDepartment1, data1);


		} catch (Exception e) {
			
			System.out.println("Issue In verifyDepartmentsEmployeeDetailsList"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}	
			
		Reporter.log("verifyDepartmentsEmployeeDetailsList");
	}
		
	
	public void verifyDepartmentsOnEmployerView(String data,String data1)
	{
			
		try {
			 List<WebElement> elem = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[4]"));
			
			 String actualDepartment=elem.get(0).getText();
			 
			 System.out.println("actualDepartment-"+actualDepartment);
			 
			 soft.assertEquals(actualDepartment, data);
			 
		//	 WebElement elem1 = m_Driver.findElement(By.xpath("//*[starts-with(text(), 'Ravi')]//following::td[1]"));
				
			 String actualDepartment1=elem.get(1).getText();
			 System.out.println("actualDepartment-"+actualDepartment1);

			 soft.assertEquals(actualDepartment1, data1);


		} catch (Exception e) {
			
			System.out.println("Issue In verifyDepartmentsEmployeeDetailsList"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}	
			
		Reporter.log("verifyDepartmentsEmployeeDetailsList");
	}
		
	
	
	public void verifyDepartmentsPayslip(String data,String data1)
	{
			
		try {
			 List<WebElement> elem = m_Driver.findElements(By.xpath("//*[@class=\"table table-head-bg\"]/tbody/tr/td[2]"));
			
			 String actualDepartment=elem.get(0).getText();
			 
			 System.out.println("actualDepartment-"+actualDepartment);
			 
			 soft.assertEquals(actualDepartment, data);
			 
		//	 WebElement elem1 = m_Driver.findElement(By.xpath("//*[starts-with(text(), 'Ravi')]//following::td[1]"));
				
			 String actualDepartment1=elem.get(1).getText();
			 System.out.println("actualDepartment-"+actualDepartment1);

			 soft.assertEquals(actualDepartment1, data1);


		} catch (Exception e) {
			
			System.out.println("Issue In verifyDepartmentsEmployeeDetailsList"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}	
			
		Reporter.log("verifyDepartmentsEmployeeDetailsList");
	}
		
	

	public void verifyDepartmentsIndividualEmployeePaySchedule(String data)
	{
			
		try {
			WebElement elem = m_Driver.findElement(By.xpath("//*[@id='tblRptIndivisualPaySlip']/tbody/tr[2]/td[3]"));
			
			 String actualDepartment=elem.getText();
			 
			 System.out.println("actualDepartment-"+actualDepartment);
			 
			 soft.assertEquals(actualDepartment, data);
			 
			
		} catch (Exception e) {
			
			System.out.println("Issue In verifyDepartmentsIndividualEmployeePaySchedule"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}	
			
		Reporter.log("verifyDepartmentsIndividualEmployeePaySchedule");
	}
	
	
	
	public void verifyEmployeeSelectionDisable()
	{
			
		try {
			WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlEmployee']"));
			
			
			 soft.assertFalse(elem.isEnabled(), "element is Not disabled");
			 
			
		} catch (Exception e) {
			
			System.out.println("Issue In verifyEmployeeSelectionDisable"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}	
			
		Reporter.log("verifyEmployeeSelectionDisable");
	}
		
	

	
	public void VerifyDepartmentOnRecievedPayrollSummary( String department, String department1) throws  Exception
	{
	       Thread.sleep(2000);

	       m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl02_lbtnFileName']")).click();
    
	       Thread.sleep(15000);
			File file = new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2022-04-30.pdf");
			PDDocument document = PDDocument.load(file);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			PDFtext = pdfStripper.getText(document);
			
			//System.out.println(PDFtext);
			document.close();
			
		soft.assertTrue(PDFtext.contains(department));
		soft.assertTrue(PDFtext.contains(department1));
		

		Reporter.log("VerifyDepartmentOnRecievedPayrollSummary");
	
				    if(file.delete())
				    System.out.println("file deleted");
				
	}
	
	
	
	
	public void VerifyDepartmentOnIEPScheduleExportToPdf( String path ,String department) throws  Exception
	{
	       Thread.sleep(2000);

	       m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_A1']")).click();
    
	       Thread.sleep(11000);
			File file = new File(path);
			PDDocument document = PDDocument.load(file);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			PDFtext = pdfStripper.getText(document);
			
			//System.out.println(PDFtext);
			document.close();
			
		
		soft.assertTrue(PDFtext.contains(department));
		

		Reporter.log("VerifyDepartmentOnRecievedPayrollSummary");
	
				    if(file.delete())
				    System.out.println("file deleted");
				
	}
	
	
	
	
	public void VerifyDepartmentOnPayrollReportingPeriodSummaryExportToPdf( String department, String department1) throws  Exception
	{
	       Thread.sleep(2000);

	       m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnExportToPdf']")).click();
    
	       Thread.sleep(11000);
			File file = new File("C:\\Users\\Sonu\\Downloads\\PayrollReportingPeriodSummary-2022-2023.pdf");
			PDDocument document = PDDocument.load(file);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			PDFtext = pdfStripper.getText(document);
			
			//System.out.println(PDFtext);
			document.close();
			
		
		soft.assertTrue(PDFtext.contains(department));
		
		soft.assertTrue(PDFtext.contains(department1));

		Reporter.log("VerifyDepartmentOnPayrollReportingPeriodSummaryExportToPdf");
	
				    if(file.delete())
				    System.out.println("file deleted");
				
	}
	
	
	public void VerifyDepartmentOnEmployeeDetailsListExportToPdf( String department, String department1) throws  Exception
	{
	       Thread.sleep(2000);

	       m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnExportToPdf']")).click();
    
	       Thread.sleep(11000);
			File file = new File("C:\\Users\\Sonu\\Downloads\\Department-EmployeeDetailsList.pdf");
			PDDocument document = PDDocument.load(file);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			PDFtext = pdfStripper.getText(document);
			
			//System.out.println(PDFtext);
			document.close();
			
		
		soft.assertTrue(PDFtext.contains(department));
		
		soft.assertTrue(PDFtext.contains(department1));

		Reporter.log("VerifyDepartmentOnEmployeeDetailsListExportToPdf");
	
				    if(file.delete())
				    System.out.println("file deleted");
				
	}
	
	
	
	public void VerifyDepartmentOnPayslipReport( String department) throws  Exception
	{
	       Thread.sleep(2000);

	       m_Driver.findElement(By.xpath("//*[@id='myTable1']/tbody/tr[2]/td[23]/a")).click();
    
	       Thread.sleep(11000);
	       
	       
	       utilities.ChangeWindow.Switchwindow(3, m_Driver);
	   			Robot robot = new Robot();
	   		//	Thread.sleep(5000);
	   		
	   			robot.keyPress(KeyEvent.VK_CONTROL);
	   			robot.keyPress(KeyEvent.VK_S);
	   			robot.keyRelease(KeyEvent.VK_CONTROL);    
	   			robot.keyRelease(KeyEvent.VK_S);

	   			Thread.sleep(5000);
	   			robot.keyPress(KeyEvent.VK_ENTER);
	   			robot.keyRelease(KeyEvent.VK_ENTER);
	   			Thread.sleep(5000);


			File file = new File("C:\\Users\\Sonu\\Downloads\\Employee-Payslip-Miss pooja Singh-30_04_2022.pdf");
			PDDocument document = PDDocument.load(file);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			PDFtext = pdfStripper.getText(document);
			
			//System.out.println(PDFtext);
			document.close();
			
		
		soft.assertTrue(PDFtext.contains(department));
		

		Reporter.log("VerifyDepartmentOnPayslip");
	
				    if(file.delete())
				    System.out.println("file deleted");
				
	}
	
	
	
	public void VerifyDepartmentOnPayslipReport1( String department) throws  Exception
	{
	       Thread.sleep(2000);

	       m_Driver.findElement(By.xpath("//*[@id='myTable2']/tbody/tr[3]/td[23]/a")).click();
    
	       Thread.sleep(11000);
	       
	       
	       utilities.ChangeWindow.Switchwindow(4, m_Driver);
	   			Robot robot = new Robot();
	   		//	Thread.sleep(5000);
	   		
	   			robot.keyPress(KeyEvent.VK_CONTROL);
	   			robot.keyPress(KeyEvent.VK_S);
	   			robot.keyRelease(KeyEvent.VK_CONTROL);    
	   			robot.keyRelease(KeyEvent.VK_S);

	   			Thread.sleep(5000);
	   			robot.keyPress(KeyEvent.VK_ENTER);
	   			robot.keyRelease(KeyEvent.VK_ENTER);
	   			Thread.sleep(5000);


			File file = new File("C:\\Users\\Sonu\\Downloads\\Employee-Payslip-Mr. Ravi Singh-30_04_2022.pdf");
			PDDocument document = PDDocument.load(file);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			PDFtext = pdfStripper.getText(document);
			
			//System.out.println(PDFtext);
			document.close();
			
		
		soft.assertTrue(PDFtext.contains(department));
		

		Reporter.log("VerifyDepartmentOnPayslip");
	
				    if(file.delete())
				    System.out.println("file deleted");
				
	}
	
	
	
	
	public void VerifyDepartmentOnPayrollSummaryExportToPdf( String department, String department1) throws  Exception
	{
	       Thread.sleep(5000);
			File file = new File("C:\\Users\\Sonu\\Downloads\\Department - Payroll Summary -30-04-2022.pdf");
			PDDocument document = PDDocument.load(file);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			PDFtext = pdfStripper.getText(document);
			
			//System.out.println(PDFtext);
			document.close();
			
		
		soft.assertTrue(PDFtext.contains(department));
		
		soft.assertTrue(PDFtext.contains(department1));

		Reporter.log("VerifyDepartmentOnEmployeeDetailsListExportToPdf");
	
				    if(file.delete())
				    System.out.println("file deleted");
				
	}
	
	
	public void ReadCSVFile(String path,String value) throws IOException, InterruptedException, AWTException {
		   
     WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnExport']"));



       elem.click();
        Thread.sleep(15000);
      //  File file = new File(path);

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
    
        Reporter.log("verify Department");



   }
	
	
	
	public void verifyPayrollReportingPeriodSummaryCsv(String department,String department1) throws IOException, InterruptedException, AWTException {
		   
	     WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnExport']"));



	       elem.click();
	        Thread.sleep(15000);
	    

	        CSVReader reader = new CSVReader(
	                new FileReader("C:\\Users\\Sonu\\Downloads\\PayrollReportingPeriodSummary-2022-2023.csv"));

	       


	       List<String[]> list = reader.readAll();
	        System.out.println("Total rows which we have is " + list.size());



	       // create Iterator reference
	        Iterator<String[]> iterator = list.iterator();



	       // Iterate all values
	        while (iterator.hasNext()) {



	           String[] str = iterator.next();



	           // System.out.print(" Values are ");
	            for (int i = 0; i < str.length; i++) {


	               if (str[i].contains(department))

	               {
	                   
	                    soft.assertTrue(str[i].contains(department));



	                   System.out.println("pass");
	                   
	            
	                    break;
	                }

	               

	               if (str[i].contains(department1))

	               {
	                   
	                    soft.assertTrue(str[i].contains(department1));



	                   System.out.println("pass");
	                   
	            
	                    break;
	                }
	            

	           }
	            
	            System.out.println("   ");



	       }
	     
	   		reader.close();
	    
	   	  File file = new File("C:\\Users\\Sonu\\Downloads\\PayrollReportingPeriodSummary-2022-2023.csv");
	   	 if(file.delete())
			    System.out.println("file deleted");
			
	        Reporter.log("verify Department");


	   }
	
	
	
	public void verifyPayrollSummaryCsv(String department,String department1) throws IOException, InterruptedException, AWTException {
		   
	    
	        Thread.sleep(5000);
	    

	        CSVReader reader = new CSVReader(
	                new FileReader("C:\\Users\\Sonu\\Downloads\\Department - Payroll Summary -30-04-2022.xlsx"));

	       


	       List<String[]> list = reader.readAll();
	        System.out.println("Total rows which we have is " + list.size());



	       // create Iterator reference
	        Iterator<String[]> iterator = list.iterator();



	       // Iterate all values
	        while (iterator.hasNext()) {



	           String[] str = iterator.next();



	           // System.out.print(" Values are ");
	            for (int i = 0; i < str.length; i++) {


	               if (str[i].contains(department))

	               {
	                   
	                    soft.assertTrue(str[i].contains(department));



	                   System.out.println("pass");
	                   
	            
	                    break;
	                }

	               

	               if (str[i].contains(department1))

	               {
	                   
	                    soft.assertTrue(str[i].contains(department1));



	                   System.out.println("pass");
	                   
	            
	                    break;
	                }
	            

	           }
	            
	            System.out.println("   ");



	       }
	     
	   		reader.close();
	    
	   	  File file = new File("C:\\Users\\Sonu\\Downloads\\Department - Payroll Summary -30-04-2022.xlsx");
	   	 if(file.delete())
			    System.out.println("file deleted");
			
	        Reporter.log("verify Department");


	   }
	
	public void verifyEmployeeDetailsListCsv(String department,String department1) throws IOException, InterruptedException, AWTException {
		   
	     WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnExport']"));



	       elem.click();
	        Thread.sleep(15000);
	    

	        CSVReader reader = new CSVReader(
	                new FileReader("C:\\Users\\Sonu\\Downloads\\Department-EmployeeDetailsList.csv"));

	       


	       List<String[]> list = reader.readAll();
	        System.out.println("Total rows which we have is " + list.size());



	       // create Iterator reference
	        Iterator<String[]> iterator = list.iterator();



	       // Iterate all values
	        while (iterator.hasNext()) {



	           String[] str = iterator.next();



	           // System.out.print(" Values are ");
	            for (int i = 0; i < str.length; i++) {


	               if (str[i].contains(department))

	               {
	                   
	                    soft.assertTrue(str[i].contains(department));



	                   System.out.println("pass");
	                   
	            
	                    break;
	                }

	               

	               if (str[i].contains(department1))

	               {
	                   
	                    soft.assertTrue(str[i].contains(department1));



	                   System.out.println("pass");
	                   
	            
	                    break;
	                }
	            

	           }
	            
	            System.out.println("   ");



	       }
	     
	   		reader.close();
	    
	   	  File file = new File("C:\\Users\\Sonu\\Downloads\\PayrollReportingPeriodSummary-2022-2023.csv");
	   	 if(file.delete())
			    System.out.println("file deleted");
			
	        Reporter.log("verify Department");


	   }
	
	 
	 public void deletFilename(String fileName){

	 String fileDownloadpath = "C:\\Users\\Sonu\\Downloads";


		File directory = new File(fileDownloadpath);

		File[] content = directory.listFiles();
		 
		
		 for (int i = 0; i < content.length; i++) {
		 if (content[i].getName().equals(fileName))
		 {
			 content[i].delete();
			 System.out.println("File Deleted ");
		      break;
		 }
		 }
				
		 Reporter.log("Verify Downloaded FileName");
		}

	 
	 
	 
	public void deletCsv(String path,String path1) throws Exception
	{
		Thread.sleep(5000);
		File file = new File(path);
		
		 if(file.delete())
			    System.out.println("file deleted");

		File file1 = new File(path1);
		  		   if(file1.delete())
			    System.out.println("file deleted");
		
		   Reporter.log("FileDeleted");
	}
	
	
	public void verifyMulipleDepartments(String departments00,String departments01,String departments02,String departments03,String departments04,String departments05,String departments06,String departments07,String departments08,String departments09)
	{
		
		try {
			
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[4]"));
			
			ArrayList<String> ar= new ArrayList<String>();
			ar.add(departments00);
			ar.add(departments01);
			ar.add(departments02);
			ar.add(departments03);
			ar.add(departments04);
			ar.add(departments05);
			ar.add(departments06);
			ar.add(departments07);
			ar.add(departments08);
			ar.add(departments09);
			for(int i=0;i<=list.size()-1;i++)
			{
				
			
				List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[4]"));
 
				WebElement elem = list1.get(i);
				String data=elem.getText();
				
				System.out.println(ar.get(i));
				 soft.assertEquals(data, ar.get(i));

			}
			
		} catch (Exception e) {
		 
			System.out.println("Issue In verifyMulipleDirectors ");
		    soft.assertFalse(true,"welcome to catch block");

		}
	}
	
	
	
	public void verifyMulipleDepartmentsPayrollReportingPeriodSummary(String departments00,String departments01,String departments02,String departments03,String departments04,String departments05,String departments06,String departments07,String departments08,String departments09)
	{
		
		try {
			
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]"));
			
			ArrayList<String> ar= new ArrayList<String>();
			ar.add(departments00);
			ar.add(departments01);
			ar.add(departments02);
			ar.add(departments03);
			ar.add(departments04);
			ar.add(departments05);
			ar.add(departments06);
			ar.add(departments07);
			ar.add(departments08);
			ar.add(departments09);
			for(int i=0;i<=list.size()-1;i++)
			{
				
			
				List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]"));
 
				WebElement elem = list1.get(i);
				String data=elem.getText();
				
				System.out.println(ar.get(i));
				 soft.assertEquals(data, ar.get(i));

			}
			
		} catch (Exception e) {
		 
			System.out.println("Issue In verifyMulipleDepartmentsPayrollReportingPeriodSummary ");
		    soft.assertFalse(true,"welcome to catch block");

		}
		
		Reporter.log("verifyMulipleDepartmentsPayrollReportingPeriodSummary");
	}
		  public void assertAll()
		   {
			   soft.assertAll();
			   
		   }

	

}
