package _11552_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import pages.BasePage;

public class _11552_VerifyPage extends BasePage  {

	public _11552_VerifyPage(WebDriver driver) {
		super(driver);
	}

	SoftAssert soft= new SoftAssert();

	
	
	
	public void verifyLeaveReportPeriod(String value)
	{
		
		String data = m_Driver. findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlPeriod']")).getText();
		
		soft.assertEquals(data, value);
		
		
		Reporter.log("verifyLeaveReportPeriod");
		
	}
	
	

	public void verifyLeaveBalance(String value)
	{
		
		String data = m_Driver. findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtBalanceLeaves']")).getAttribute("value");
		
		soft.assertEquals(data, value);
		
		
		Reporter.log("verifyLeaveBalance");
		
	}

	
	public void verifyLeaveDays(String value)
	{
		
		String data = m_Driver. findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div/div[1]/div/div/table/tbody/tr[3]/td[3]")).getText();
		
		soft.assertEquals(data, value);
		
		
		Reporter.log("verifyLeaveDays");
		
	}

	

	public void verifyLeaveHrs(String value)
	{
		
		String data = m_Driver. findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div/div[1]/div/div/table/tbody/tr[3]/td[4]")).getText();
		
		soft.assertEquals(data, value);
		
		
		Reporter.log("verifyLeaveHrs");
		
	}
	
	

	public void verifyLeaveHrs2(String value)
	{
		
		String data = m_Driver. findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtEntitlement']")).getAttribute("value");
		
		soft.assertEquals(data, value);
		
		
		Reporter.log("verifyLeaveHrs2");
		
	}
	
	public void verifyLeaveDays1(String value)
	{
		
		String data = m_Driver. findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div/div/div/table/tbody/tr[2]/td[5]")).getText();
		
		soft.assertEquals(data, value);
		
		
		Reporter.log("verifyLeaveDays1");
		
	}
	
	public void verifyLeaveReportPeriodFirst(String value)
	{
		
		//String data = m_Driver. findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlPeriod']")).getText();
		
		Select select = new Select(m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlPeriod']")));
		WebElement option = select.getFirstSelectedOption();
		String defaultItem = option.getText();
		System.out.println(defaultItem );
		
		soft.assertEquals(defaultItem, value);
		
		
		Reporter.log("verifyLeaveReportPeriodFirst");
		
	}
	

	public void verifyLeaveStartDate(String value)
	{
		String data = m_Driver. findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtStartDate']")).getAttribute("value");
		
		soft.assertEquals(data, value);
		
		Reporter.log("verifyLeaveStartDate");
		
	}
	
	
	public void verifyAnnualLeave(String value)
	{
		String data = m_Driver. findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtAnnualLeaveDays']")).getAttribute("value");
		
		soft.assertEquals(data, value);
		
		Reporter.log("verifyAnnualLeave");
		
	}
	
	
	public void verifyEntitlementLeave(String value)
	{
		String data = m_Driver. findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div/div[1]/div/div/table/tbody/tr[3]/td[3]")).getText();		
		soft.assertEquals(data, value);
		
		Reporter.log("verifyEntitlementLeave");
		
	}
	
	
	public void verifyEntitlementLeave2(String value)
	{
		String data = m_Driver. findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div/div[1]/div/div/table/tbody/tr[3]/td[4]")).getText();		
		soft.assertEquals(data, value);
		
		Reporter.log("verifyEntitlementLeave");
		
	}
	
	public void verifyLeaveDuration(String value)
	{
		String data = m_Driver. findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div/div/div/div/table/tbody/tr[2]/td[5]")).getText();		
		soft.assertEquals(data, value);
		
		Reporter.log("verifyEntitlementLeave");
		
	}
	
	
	public void verifyLeaveDurationAtReport(String value)
	{
		String data = m_Driver. findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div/div[1]/div/div/table/tbody/tr[3]/td[5]")).getText();		
		soft.assertEquals(data, value);
		
		Reporter.log("verifyLeaveDurationAtReport");
		
	}
	
	public void verifyLeaveHrsTakenReport(String value)
	{
		String data = m_Driver. findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div/div[1]/div/div/table/tbody/tr[3]/td[6]")).getText();		
		soft.assertEquals(data, value);
		
		Reporter.log("verifyLeaveDurationAtReport");
		
	}
	
	
	public void verifyLeaveDurationAtGeneralTerms(String value)
	{
		String data = m_Driver. findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtHolidayCount']")).getAttribute("value");		
		soft.assertEquals(data, value);
		
		Reporter.log("verifyLeaveDurationAtGeneralTerms");
		
	}
	
	

	public void verifyLeaveHrsDurationAtGeneralTerms(String value)
	{
		String data = m_Driver. findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtHolidayCount']")).getAttribute("value");		
		soft.assertEquals(data, value);
		
		Reporter.log("verifyLeaveDurationAtGeneralTerms");
		
	}
	
	  
    public void verifyPayslip(String LeaveEntitled) throws  Exception
		{
//		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));
//
//		 m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_dvsummary']/div/table/tbody/tr/td/label/a")).click();
//		 
//		 Thread.sleep(9000);
//		
//				File file = new File(path+"DepartmentalAnalysisReport_vqjrZJnmI.pdf");
//				PDDocument document = PDDocument.load(file);
//				PDFTextStripper pdfStripper = new PDFTextStripper();
//			String	PDFtext = pdfStripper.getText(document);
//				
//				System.out.println(PDFtext);
//				document.close();
				utilities.DownloadPdf pdf= new  utilities.DownloadPdf(m_Driver);
				String data=pdf.PDFtext;

			soft.assertTrue(data.contains(LeaveEntitled),"LeaveEntitled Not as expexted");
			
			//pdf.ReadPDF();
			
//			String file = pdf.FileName;
//			
//			Reporter.log("verifyEmailPopupAttachement");
//		
//					   if(file.delete())
//					    System.out.println("file deleted");
		}
    
    
	public void assertAll()
	   {
		   soft.assertAll();
		   
	   }
	 
	 
}
