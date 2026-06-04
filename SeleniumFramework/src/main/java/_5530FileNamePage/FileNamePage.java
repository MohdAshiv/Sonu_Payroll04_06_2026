package _5530FileNamePage;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import pages.BasePage;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

public class FileNamePage  extends BasePage{

	public FileNamePage(WebDriver driver) {
		super(driver);
		
	}

	private By employeeListCsvElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnExport']");
	
	private By selectForm = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlForm']");
	
	private By selectFormEmployerView=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphError_ddlForm']");

	private By employeeListPdfElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnExportToPdf']");
	
	private By smpPdfIcn=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_hrefDownload']");
	private By smpCsvIcn=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnExport']");

	private By iEPSCsvElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnExport']");
	
	private By apprenticeLevyCsvElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnExport']");
	
	private By apprenticeLevyPdfElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_hrefDownload']");


	private By iEPSPdfElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_A1']");
	
	private By bacsCsvElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnExportToCSV']");
	
	private By bacsPdfElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnExportToPdf']");

	private By exportCsvElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_LinkButton1']");
	
	private By payslipElem= By.xpath("//*[@data-original-title='Payslip download']");
	
	private By employerPayslipElem=By.xpath("//*[@data-original-title='Payslip']");
	private By payrollreportingCsvElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnExport']");
	
	private By payrollreportingPdfElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnExportToPdf']");
	
	private By taxpaymentCsvElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_Lnkbtncsv']");
	
	private By taxpaymentPdfElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_Lnkbtnpdf']");

	private By leaveTypeElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlStatutorypaytype']");
	
	private By statPayRecoverElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec_ctl02_hyprlnkStatutoryPayRecovery']");
	
	private By taxExportCsvElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_Lnkbtncsv']");
	
	private By taxExportPdfElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_Lnkbtnpdf']");
	
	private By cisSufferdElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec_ctl02_hyprlnkCISSuffered']");

	private By p45PdfElem= By.xpath("//*[@data-original-title='P45 PDF Document']");
	
	private By EmployerP45Elem=By.xpath("//*[@data-original-title='P45 PDF Document']");
	
	private By EmployeeP45Elem=By.xpath("//*[@title='P45']");

	private By p11PdfElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_hrefDownload']");
	
	private By p60PdfElem= By.xpath("//*[@data-original-title='P60 PDF Document']");
	
	private By employerP60Elem=By.xpath("//*[@title='P60']");
	
	private By employeeListElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_hrefEmployeeList']");
	
	private By employerExportCsv=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_Lnkbtncsv']");
	
	private By employerExportPdf=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_Lnkbtnpdf']");

	private By employerExportPdf1=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnExportToPdf']");

	
	
	public void clickEmployeeListCsvIcn() throws Exception
	{
		
			WebElement elem = getWebElement(employeeListCsvElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEmployeeListCsvIcn", "clickEmployeeListCsvIcn failed. Unable to locate object: " + employeeListCsvElem.toString());


				Assert.fail("Unable to locate object: " + employeeListCsvElem.toString());
	        }

			elem.click();
			Thread.sleep(9000);
			ExtentReportManager.passStep(m_Driver, "clickEmployeeListCsvIcn");

			
			Reporter.log("clickEmployeeListCsvIcn");
	

}
	
	
	public void clickEmployeeListBtn() throws Exception
	{
		
			WebElement elem = getWebElement(employeeListElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEmployeeListBtn", "clickEmployeeListBtn failed. Unable to locate object: " + employeeListElem.toString());


				Assert.fail("Unable to locate object: " + employeeListElem.toString());
	        }

			elem.click();
			Thread.sleep(5000);
			ExtentReportManager.passStep(m_Driver, "clickEmployeeListBtn");

			
			Reporter.log("clickEmployeeListBtn");
	

}
	

	public void clickTaxExportCsvIcn() throws Exception
	{
		
			WebElement elem = getWebElement(taxExportCsvElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickTaxExportCsvIcn", "clickTaxExportCsvIcn failed. Unable to locate object: " + taxExportCsvElem.toString());


				Assert.fail("Unable to locate object: " + taxExportCsvElem.toString());
	        }

			elem.click();
			Thread.sleep(9000);
	          	

			ExtentReportManager.passStep(m_Driver, "clickTaxExportCsvIcn");

			
			Reporter.log("clickTaxExportCsvIcn");
	

}
	
	
	public void clickTaxExportPdfIcn() throws Exception
	{
		
			WebElement elem = getWebElement(taxExportPdfElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickTaxExportPdfIcn", "clickTaxExportPdfIcn failed. Unable to locate object: " + taxExportPdfElem.toString());


				Assert.fail("Unable to locate object: " + taxExportPdfElem.toString());
	        }

			elem.click();
			Thread.sleep(9000);
	          	

			ExtentReportManager.passStep(m_Driver, "clickTaxExportPdfIcn");

			
			Reporter.log("clickTaxExportPdfIcn");
	

}
	

	public void clickEmployerTaxExportPdfIcn() throws Exception
	{
		
			WebElement elem = getWebElement(employerExportPdf1);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEmployerTaxExportPdfIcn", "clickEmployerTaxExportPdfIcn failed. Unable to locate object: " + employerExportPdf.toString());


				Assert.fail("Unable to locate object: " + employerExportPdf1.toString());
	        }

			elem.click();
			Thread.sleep(9000);
	          	

			ExtentReportManager.passStep(m_Driver, "clickEmployerTaxExportPdfIcn");

			
			Reporter.log("clickEmployerTaxExportPdfIcn");
	

}
	

	public void clickEmployerTaxExportCsvIcn() throws Exception
	{
		
			WebElement elem = getWebElement(employerExportCsv);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEmployerTaxExportCsvIcn", "clickEmployerTaxExportCsvIcn failed. Unable to locate object: " + employerExportCsv.toString());


				Assert.fail("Unable to locate object: " + employerExportCsv.toString());
	        }

			elem.click();
			Thread.sleep(9000);
	          	

			ExtentReportManager.passStep(m_Driver, "clickEmployerTaxExportCsvIcn");

			
			Reporter.log("clickEmployerTaxExportCsvIcn");
	

}
	
	
	
	

	public void clickStatPayRecovery() throws Exception
	{
		
			WebElement elem = getWebElement(statPayRecoverElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickStatPayRecovery", "clickStatPayRecovery failed. Unable to locate object: " + statPayRecoverElem.toString());


				Assert.fail("Unable to locate object: " + statPayRecoverElem.toString());
	        }

			elem.click();
			Thread.sleep(3000);
	          	

			ExtentReportManager.passStep(m_Driver, "clickStatPayRecovery");

			
			Reporter.log("clickStatPayRecovery");
	

}
	
	
	public void clickCisSufferd() throws Exception
	{
		
			WebElement elem = getWebElement(cisSufferdElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickCisSufferd", "clickCisSufferd failed. Unable to locate object: " + cisSufferdElem.toString());


				Assert.fail("Unable to locate object: " + cisSufferdElem.toString());
	        }

			elem.click();
			Thread.sleep(3000);
	          	

			ExtentReportManager.passStep(m_Driver, "clickCisSufferd");

			
			Reporter.log("clickCisSufferd");
	

}
	
	
	
	public void clickEmployeeListPdfIcn() throws Exception
	{
		
		
		
		
			WebElement elem = getWebElement(employeeListPdfElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEmployeeListPdfIcn", "clickEmployeeListPdfIcn failed. Unable to locate object: " + employeeListPdfElem.toString());


				Assert.fail("Unable to locate object: " + employeeListPdfElem.toString());
	        }

			elem.click();
			Thread.sleep(9000);
	          	

			ExtentReportManager.passStep(m_Driver, "clickEmployeeListPdfIcn");

			
			Reporter.log("clickEmployeeListPdfIcn");
	

}
	
	
	public void clickIEPScheduleCsvIcn() throws Exception
	{
		
		
		
		
			WebElement elem = getWebElement(iEPSCsvElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickIEPScheduleCsvIcn", "clickIEPScheduleCsvIcn failed. Unable to locate object: " + iEPSCsvElem.toString());


				Assert.fail("Unable to locate object: " + iEPSCsvElem.toString());
	        }

			elem.click();
			
			m_Driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		Thread.sleep(20000);
	          	

			ExtentReportManager.passStep(m_Driver, "clickIEPScheduleCsvIcn");

			
			Reporter.log("clickIEPScheduleCsvIcn");
	

}
	
	public void clickApprenticeLevyCsvIcn() throws Exception
	{
		
		
		
		
			WebElement elem = getWebElement(apprenticeLevyCsvElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickApprenticeLevyCsvIcn", "clickApprenticeLevyCsvIcn failed. Unable to locate object: " + apprenticeLevyCsvElem.toString());


				Assert.fail("Unable to locate object: " + apprenticeLevyCsvElem.toString());
	        }

			elem.click();
			Thread.sleep(9000);
	          	

			ExtentReportManager.passStep(m_Driver, "clickApprenticeLevyCsvIcn");

			
			Reporter.log("clickApprenticeLevyCsvIcn");
	

}
	
	
	
	public void clickIEPSchedulePdfIcn() throws Exception
	{
		
			WebElement elem = getWebElement(iEPSPdfElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickIEPSchedulePdfIcn", "clickIEPSchedulePdfIcn failed. Unable to locate object: " + iEPSPdfElem.toString());


				Assert.fail("Unable to locate object: " + iEPSPdfElem.toString());
	        }

			elem.click();
			Thread.sleep(20000);
	          	

			ExtentReportManager.passStep(m_Driver, "clickIEPSchedulePdfIcn");

			
			Reporter.log("clickIEPSchedulePdfIcn");
	

}
	
	public void clickApreniceLevyPdfIcn() throws Exception
	{
		
			WebElement elem = getWebElement(apprenticeLevyPdfElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickApreniceLevyPdfIcn", "clickApreniceLevyPdfIcn failed. Unable to locate object: " + apprenticeLevyPdfElem.toString());


				Assert.fail("Unable to locate object: " + apprenticeLevyPdfElem.toString());
	        }

			elem.click();
			Thread.sleep(9000);
	          	

			ExtentReportManager.passStep(m_Driver, "clickApreniceLevyPdfIcn");

			
			Reporter.log("clickApreniceLevyPdfIcn");
	

}

	
	public void clickExportPdf() throws Exception
	{
		
			WebElement elem = getWebElement(bacsPdfElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickBacsPdfIcn", "clickBacsPdfIcn failed. Unable to locate object: " + bacsPdfElem.toString());


				Assert.fail("Unable to locate object: " + bacsPdfElem.toString());
	        }

			elem.click();
			Thread.sleep(9000);
	          	

			ExtentReportManager.passStep(m_Driver, "clickBacsPdfIcn");

			
			Reporter.log("clickExportPdf");
	

}

	
	public void clickExportCsv() throws Exception
	{
		
			WebElement elem = getWebElement(bacsCsvElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickBacsCsvIcn", "clickBacsCsvIcn failed. Unable to locate object: " + bacsCsvElem.toString());


				Assert.fail("Unable to locate object: " + bacsCsvElem.toString());
	        }

			elem.click();
			Thread.sleep(9000);
	          	

			ExtentReportManager.passStep(m_Driver, "clickBacsCsvIcn");

			
			Reporter.log("clickExportCsv");
	

}
	
	
	public void clickPayrollReportingCsv() throws Exception
	{
		
			WebElement elem = getWebElement(payrollreportingCsvElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickPayrollReportingCsv", "clickPayrollReportingCsv failed. Unable to locate object: " + payrollreportingCsvElem.toString());


				Assert.fail("Unable to locate object: " + payrollreportingCsvElem.toString());
	        }

			elem.click();
			Thread.sleep(9000);
	          	

			ExtentReportManager.passStep(m_Driver, "clickPayrollReportingCsv");

			
			Reporter.log("clickPayrollReportingCsv");
	

}
	
	

	public void clickPayrollReportingPdf() throws Exception
	{
		
			WebElement elem = getWebElement(payrollreportingPdfElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickPayrollReportingPdf", "clickPayrollReportingPdf failed. Unable to locate object: " + payrollreportingPdfElem.toString());


				Assert.fail("Unable to locate object: " + payrollreportingPdfElem.toString());
	        }

			elem.click();
			Thread.sleep(9000);
	          	

			ExtentReportManager.passStep(m_Driver, "clickPayrollReportingPdf");

			
			Reporter.log("clickPayrollReportingPdf");
	
}
	
	public void clickTaxPaymentPdfIcn() throws Exception
	{
		
			WebElement elem = getWebElement(taxpaymentPdfElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickTaxPaymentPdfIcn", "clickTaxPaymentPdfIcn failed. Unable to locate object: " + taxpaymentPdfElem.toString());


				Assert.fail("Unable to locate object: " + taxpaymentPdfElem.toString());
	        }

			elem.click();
			Thread.sleep(9000);
	          	

			ExtentReportManager.passStep(m_Driver, "clickTaxPaymentPdfIcn");

			
			Reporter.log("clickTaxPaymentPdfIcn");
	

}

	
	public void clickTaxPaymentCsvIcn() throws Exception
	{
		
			WebElement elem = getWebElement(taxpaymentCsvElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickTaxPaymentCsvIcn", "clickTaxPaymentCsvIcn failed. Unable to locate object: " + taxpaymentCsvElem.toString());


				Assert.fail("Unable to locate object: " + taxpaymentCsvElem.toString());
	        }

			elem.click();
			Thread.sleep(9000);
	          	

			ExtentReportManager.passStep(m_Driver, "clickTaxPaymentCsvIcn");

			
			Reporter.log("clickTaxPaymentCsvIcn");
	

}

	
	public void clickSmpPdfIcn() throws Exception
	{
		
			WebElement elem = getWebElement(smpPdfIcn);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickSmpPdfIcn", "clickSmpPdfIcn failed. Unable to locate object: " + smpPdfIcn.toString());


				Assert.fail("Unable to locate object: " + smpPdfIcn.toString());
	        }

			elem.click();
			Thread.sleep(9000);
	          	

			ExtentReportManager.passStep(m_Driver, "clickSmpPdfIcn");

			
			Reporter.log("clickSmpPdfIcn");
	

}
	
	
	public void clickSmpCsvIcn() throws Exception
	{
		
			WebElement elem = getWebElement(smpCsvIcn);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickSmpCsvIcn", "clickSmpCsvIcn failed. Unable to locate object: " + smpCsvIcn.toString());


				Assert.fail("Unable to locate object: " + smpCsvIcn.toString());
	        }

			elem.click();
			Thread.sleep(9000);
	          	

			ExtentReportManager.passStep(m_Driver, "clickSmpCsvIcn");

			
			Reporter.log("clickSmpCsvIcn");
	

}


	
	public void clickExportCsv1() throws Exception
	{
		
			WebElement elem = getWebElement(exportCsvElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickExportCsv1", "clickExportCsv1 failed. Unable to locate object: " + exportCsvElem.toString());


				Assert.fail("Unable to locate object: " + exportCsvElem.toString());
	        }

			elem.click();
			Thread.sleep(9000);
	          	

			ExtentReportManager.passStep(m_Driver, "clickExportCsv1");

			
			Reporter.log("clickExportCsv1");
	

}
	

	public void selectLeaveType(String text) throws Exception
	{
		
			WebElement elem = getWebElement(leaveTypeElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectLeaveType", "selectLeaveType failed. Unable to locate object: " + leaveTypeElem.toString());


				Assert.fail("Unable to locate object: " + leaveTypeElem.toString());
	        }

			Select sel = new Select(elem);
			sel.selectByVisibleText(text);
			Thread.sleep(3000);
	          	

			ExtentReportManager.passStep(m_Driver, "selectLeaveType");

			
			Reporter.log("selectLeaveType");
	

}
	
	public void clickPayslipIcn() throws Exception
	{
		
			WebElement elem = getWebElement(payslipElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickPayslipIcn", "clickPayslipIcn failed. Unable to locate object: " + payslipElem.toString());


				Assert.fail("Unable to locate object: " + payslipElem.toString());
	        }

			elem.click();
			Thread.sleep(9000);
			
		    utilities.ChangeWindow.Switchwindow(3, m_Driver);
			Robot robot = new Robot();
			Thread.sleep(2000);
		
        

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_S);
			robot.keyRelease(KeyEvent.VK_CONTROL);    
			robot.keyRelease(KeyEvent.VK_S);

			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);

			ExtentReportManager.passStep(m_Driver, "clickPayslipIcn");

			
			Reporter.log("clickPayslipIcn");
	

}
	
	
	public void clickEmployerPayslipIcn() throws Exception
	{
		
			WebElement elem = getWebElement(employerPayslipElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEmployerPayslipIcn", "clickEmployerPayslipIcn failed. Unable to locate object: " + employerPayslipElem.toString());


				Assert.fail("Unable to locate object: " + employerPayslipElem.toString());
	        }

			elem.click();
			Thread.sleep(9000);
			
		    utilities.ChangeWindow.Switchwindow(4, m_Driver);
			Robot robot = new Robot();
			Thread.sleep(4000);
		
        

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_S);
			robot.keyRelease(KeyEvent.VK_CONTROL);    
			robot.keyRelease(KeyEvent.VK_S);

			Thread.sleep(4000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(4000);

			ExtentReportManager.passStep(m_Driver, "clickEmployerPayslipIcn");

			
			Reporter.log("clickEmployerPayslipIcn");
	

}
	
	
	public void clickP45PdfIcn() throws Exception
	{
		
			WebElement elem = getWebElement(p45PdfElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickP45PdfIcn", "clickP45PdfIcn failed. Unable to locate object: " + p45PdfElem.toString());


				Assert.fail("Unable to locate object: " + p45PdfElem.toString());
	        }

			elem.click();
			Thread.sleep(9000);
			
		    utilities.ChangeWindow.Switchwindow(3, m_Driver);
			Robot robot = new Robot();
			Thread.sleep(2000);
		
        

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_S);
			robot.keyRelease(KeyEvent.VK_CONTROL);    
			robot.keyRelease(KeyEvent.VK_S);

			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);

			ExtentReportManager.passStep(m_Driver, "clickP45PdfIcn");

			
			Reporter.log("clickP45PdfIcn");
	

}
	
	public void clickEmployerP45PdfIcn() throws Exception
	{
		
			WebElement elem = getWebElement(EmployerP45Elem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEmployerP45PdfIcn", "clickEmployerP45PdfIcn failed. Unable to locate object: " + EmployerP45Elem.toString());


				Assert.fail("Unable to locate object: " + EmployerP45Elem.toString());
	        }

			elem.click();
			Thread.sleep(9000);
			
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

			ExtentReportManager.passStep(m_Driver, "clickEmployerP45PdfIcn");

			
			Reporter.log("clickEmployerP45PdfIcn");
	

}
	
	
	public void clickEmployerEmployeeP45PdfIcn() throws Exception
	{
		
			WebElement elem = getWebElement(EmployeeP45Elem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEmployerP45PdfIcn", "clickEmployerP45PdfIcn failed. Unable to locate object: " + EmployerP45Elem.toString());


				Assert.fail("Unable to locate object: " + EmployerP45Elem.toString());
	        }

			elem.click();
			Thread.sleep(9000);
			
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

			ExtentReportManager.passStep(m_Driver, "clickEmployerP45PdfIcn");

			
			Reporter.log("clickEmployerP45PdfIcn");
	

}
	
	
	public void clickP60PdfIcn() throws Exception
	{
		
			WebElement elem = getWebElement(p60PdfElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickP60PdfIcn", "clickP60PdfIcn failed. Unable to locate object: " + p60PdfElem.toString());


				Assert.fail("Unable to locate object: " + p60PdfElem.toString());
	        }

			elem.click();
			Thread.sleep(9000);
			
		    utilities.ChangeWindow.Switchwindow(3, m_Driver);
			Robot robot = new Robot();
			Thread.sleep(2000);
		
        

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_S);
			robot.keyRelease(KeyEvent.VK_CONTROL);    
			robot.keyRelease(KeyEvent.VK_S);

			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);

			ExtentReportManager.passStep(m_Driver, "clickP60PdfIcn");

			
			Reporter.log("clickP60PdfIcn");
	

}
	
	
	

	public void clickEmployerP60PdfIcn() throws Exception
	{
		
			WebElement elem = getWebElement(employerP60Elem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEmployerP60PdfIcn", "clickEmployerP60PdfIcn failed. Unable to locate object: " + employerP60Elem.toString());


				Assert.fail("Unable to locate object: " + employerP60Elem.toString());
	        }

			elem.click();
			Thread.sleep(9000);
			
		    utilities.ChangeWindow.Switchwindow(4, m_Driver);
			Robot robot = new Robot();
			Thread.sleep(4000);
		
        

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_S);
			robot.keyRelease(KeyEvent.VK_CONTROL);    
			robot.keyRelease(KeyEvent.VK_S);

			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);

			ExtentReportManager.passStep(m_Driver, "clickP60PdfIcn");

			
			Reporter.log("clickEmployerP60PdfIcn");
	

}
	
	
	public void clickEmployerP60PdfIcn1() throws Exception
	{
		
			WebElement elem = getWebElement(p60PdfElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEmployerP60PdfIcn", "clickEmployerP60PdfIcn failed. Unable to locate object: " + employerP60Elem.toString());


				Assert.fail("Unable to locate object: " + employerP60Elem.toString());
	        }

			elem.click();
			Thread.sleep(5000);
			
		    utilities.ChangeWindow.Switchwindow(4, m_Driver);
			Robot robot = new Robot();
			Thread.sleep(11000);
		
        

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_S);
			robot.keyRelease(KeyEvent.VK_CONTROL);    
			robot.keyRelease(KeyEvent.VK_S);

			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);

			ExtentReportManager.passStep(m_Driver, "clickP60PdfIcn");

			
			Reporter.log("clickEmployerP60PdfIcn");
	

}
	

	public void clickP11PdfIcn() throws Exception
	{
		
			WebElement elem = getWebElement(p11PdfElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickP11PdfIcn", "clickP11PdfIcn failed. Unable to locate object: " + p11PdfElem.toString());


				Assert.fail("Unable to locate object: " + p11PdfElem.toString());
	        }

			elem.click();
			Thread.sleep(9000);
			
			
			Reporter.log("clickP11PdfIcn");
	

}
	
	
	public void clickPayrollSummaryCsv() throws Exception
	{
		 WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rvReport_ctl10_ctl04_ctl00_ButtonImg']"));
		  
		 elem.click();
		 
		 Thread.sleep(4000);
		 
		 m_Driver.findElement(By.linkText("Excel")).click();
		 Thread.sleep(9000);
		 
		 Reporter.log("clickPayrollSummaryCsv");
		 
		
	}
	
	
	public void clickPayrollSummaryPdf() throws Exception
	{
		 WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rvReport_ctl10_ctl04_ctl00_ButtonImg']"));
		  
		 elem.click();
		 
		 Thread.sleep(4000);
		 
		 m_Driver.findElement(By.linkText("PDF")).click();
		 Thread.sleep(9000);
		 
		 Reporter.log("clickPayrollSummaryCsv");
		 
		
	}
	
	public void selectForm(String Text) throws Exception
	{
		WebElement elem = getWebElement(selectForm);
		Thread.sleep(2000);
		Select sel = new Select(elem);
		sel.selectByVisibleText(Text);

		Thread.sleep(2000);

		Reporter.log("select Form");

		
		
	}
	
	
	public void selectEmployerViewForm(String Text) throws Exception
	{
		WebElement elem = getWebElement(selectFormEmployerView);
		Thread.sleep(2000);
		Select sel = new Select(elem);
		sel.selectByVisibleText(Text);

		Thread.sleep(2000);

		Reporter.log("select Form");

		
		
	}
	public void employerSelectForm(String Text) throws Exception
	{
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphError_ddlForm']"));
		Thread.sleep(2000);
		Select sel = new Select(elem);
		sel.selectByVisibleText(Text);

		Thread.sleep(2000);

		Reporter.log("select Form");

		
		
	}
	
	
	public void clickExportEmployersIndex1() throws Exception {
		 
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnExportEmployer']"));
		
		elem.click();
		
		Thread.sleep(5000);
		
		Reporter.log("clickExportEmployersIndex1");
		
		
	}


	public void clickExportEmployersIndex2() throws Exception {
		 
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefExport']"));
		
		elem.click();
		
		Thread.sleep(5000);
		
		Reporter.log("clickExportEmployersIndex2");
		
		
	}
	
	
	
	public void clickEmployerNotesCsv() throws Exception {
		 
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnExport']"));
		
		elem.click();
		
		Thread.sleep(5000);
		
		Reporter.log("clickEmployerNotesCsv");
		
		
	}

	

	public void clickEmployerNotesPdf() throws Exception {
		 
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_hrefDownload']"));
		
		elem.click();
		
		Thread.sleep(5000);
		
		Reporter.log("clickEmployerNotesCsv");
		
		
	}


	public void clickEmployerYearEndCsv() throws Exception {
		 
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnExport']"));
		
		elem.click();
		
		Thread.sleep(5000);
		
		Reporter.log("clickEmployerYearEndCsv");
		
		
	}

	

	public void clickEmployerYearEndPdf() throws Exception {
		 
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_hrefDownload']"));
		
		elem.click();
		
		Thread.sleep(5000);
		
		Reporter.log("clickEmployerYearEndCsv");
		
		
	}

	public void clickExportCompanyDataCsv() throws Exception {
		 
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_hrefDownload']"));
		
		elem.click();
		
		Thread.sleep(5000);
		
		Reporter.log("clickExportCompanyDataCsv");
		
		
	}
	
	
	public void clickExportCompanyDataPdf() throws Exception {
		 
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_BtnExportToPdf']"));
		
		elem.click();
		

		m_Driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		Reporter.log("clickExportCompanyDataPdf");
		
		
	}
	
	
	public void clickNiContributionReportCsv() throws Exception {
		 
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnExport']"));
		
		elem.click();
		
		Thread.sleep(8000);
		
		Reporter.log("clickNiContributionReportCsv");
		
		
	}
	
	

	public void clickNiContributionReportPdf() throws Exception {
		 
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_hrefDownload']"));
		
		elem.click();
		
		Thread.sleep(30000);
		
		Reporter.log("clickNiContributionReportPdf");
		
		
	}
	
	
	public void selectStatusAndSearchBtn(String data) throws Exception {
		
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlStatusSearch']"));
		
		Select sel = new Select(elem);
		
		sel.selectByVisibleText(data);
		Thread.sleep(3000);

		
		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']")).click();
		
		Thread.sleep(3000);
		Reporter.log("selectStatusAndSearchBtn");
		
	}
	
	
	public void exportToPdf() throws Exception {

		
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_btnExportToPdf']"));
		
		elem.click();
		
		Thread.sleep(30000);
		
		Reporter.log("exportToPdf");
		
		
	}
	
	
public void payeNiLianlityCsv() throws Exception {

		
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnExport']"));
		
		elem.click();
		
		Thread.sleep(30000);
		
		Reporter.log("payeNiLianlityCsv");
		
		
	}
	


public void payeNiLianlityPdf() throws Exception {

	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnExportToPdf']"));
	
	elem.click();
	
	Thread.sleep(30000);
	
	Reporter.log("payeNiLianlityCsv");
	
	
}



public void payslipCountCsv() throws Exception {

	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnExport']"));
	
	elem.click();
	
	Thread.sleep(30000);
	
	Reporter.log("payslipCountCsv");
	
	
}



public void payslipCountPdf() throws Exception {

	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_hrefDownload']"));
	
	elem.click();
	
	Thread.sleep(30000);
	
	Reporter.log("payslipCountCsv");
	
	
}



public void fillingStatuPdf() throws Exception {

	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkSubmissionStatus']"));
	
	elem.click();
	
	Thread.sleep(3000);
	
	  m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

		WebElement elem1 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphError_btnExport']"));

		elem1.click();
	  
		Thread.sleep(6000);

	Reporter.log("fillingStatuPdf");
	
	
}



public void RtiSubmissionPdf() throws Exception {

	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_lnkExportToPdf']"));
	
	elem.click();
	
	Thread.sleep(5000);
	
	Reporter.log("RtiSubmissionPdf");
	
	
}



public void RtiSubmissionCsv() throws Exception {

	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@data-original-title='Export to CSV']"));
	
	elem.click();
	
	Thread.sleep(5000);
	
	Reporter.log("RtiSubmissionCsv");
	
	
}
	


public void rtiStatusPopupPdf() throws Exception {

	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkSubmissionReport']"));
	
	elem.click();
	
	Thread.sleep(3000);
	
	  m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

		WebElement elem1 = m_Driver.findElement(By.xpath("//*[@class='col-sm-6']/following::div/a"));

		elem1.click();
	  
		
		Thread.sleep(6000);
		m_Driver.switchTo().defaultContent();

	Reporter.log("fillingStatuPdf");
	
	
}




public void p11DFailledPopupPdf() throws Exception {

	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkSubmissionStatus']"));
	
	elem.click();
	
	Thread.sleep(3000);
	
	  m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

		WebElement elem1 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphError_btnExport']"));

		elem1.click();
	  
		
		Thread.sleep(6000);
		m_Driver.switchTo().defaultContent();

	Reporter.log("fillingStatuPdf");
	
	
}



public void clickCloseBtn() throws Exception {
	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='PopUpClose']"));
	elem.click();Thread.sleep(2000);
	
}


public void clickTaxRateCsv() throws Exception {

	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnExport']"));
	
	elem.click();
	
	Thread.sleep(5000);
	
	Reporter.log("taxRateCsv");
	
	
}




public void clickTaxRatePdf() throws Exception {

	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_lnkExportToPdf']"));
	
	elem.click();
	
	Thread.sleep(5000);
	
	Reporter.log("clickTaxRatePdf");
	
	
}
	



public void clickClientSpecificReport() throws Exception {

	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_lnkBtnReport']"));
	
	elem.click();
	
	Thread.sleep(3000);
	
	Reporter.log("clickClientSpecificReport");
	
	
}


public void selectReportType(String data) {
	
	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ddlPayrollCWRepName']"));
	
	Select sel = new Select(elem);
	
	sel.selectByVisibleText(data);
	
	Reporter.log("selectReportType");
}


public void selectCompany(String data) throws Exception
{
    
WebElement elem = m_Driver.findElement(By.xpath("//*[@id='search_input']"));

	
	elem.sendKeys(data);

	Thread.sleep(2000);

	//WebElement elem1 = m_Driver.findElement(By.xpath("(//a[normalize-space()="+data+"])[1]"));
	
	
	m_Driver.findElement(By.xpath("//*[contains(text(),'"+data+"')]")).click();

	Thread.sleep(1000);
//
//	elem1.click();
	
	
	m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnProceed']")).click();
	Thread.sleep(5000);

	utilities.ChangeWindow.Switchwindow(2, m_Driver);
	
	Thread.sleep(2000);
	ExtentReportManager.passStep(m_Driver, "searchClient");

	
	Reporter.log("selectCompany");

}



public void selectCompany1(String data) throws Exception
{
    
WebElement elem = m_Driver.findElement(By.xpath("//*[@id='search_input']"));

	
	elem.sendKeys(data);

	Thread.sleep(2000);

	//WebElement elem1 = m_Driver.findElement(By.xpath("(//a[normalize-space()="+data+"])[1]"));
	
	
	m_Driver.findElement(By.xpath("//*[contains(text(),'P11d')]")).click();

	Thread.sleep(1000);
//
//	elem1.click();
	
	
	m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnProceed']")).click();
	Thread.sleep(5000);

	utilities.ChangeWindow.Switchwindow(2, m_Driver);
	
	Thread.sleep(2000);
	ExtentReportManager.passStep(m_Driver, "searchClient");

	
	Reporter.log("selectCompany");

}



public void clickWagesJournalCsv() throws Exception {

	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkPopup']"));
	
	elem.click();
	
	Thread.sleep(3000);
	
	  m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

		WebElement elem1 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnExport']"));

		elem1.click();
	  
		Thread.sleep(5000);

	Reporter.log("clickWagesJournalCsv");
	
	
}



public void clickWagesJournalPdf() throws Exception {

	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkPopup']"));
	
	elem.click();
	
	Thread.sleep(3000);
	
	  m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

		WebElement elem1 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_A1']"));

		elem1.click();
	  
		Thread.sleep(5000);

	Reporter.log("clickWagesJournalPdf");
	
	
}



public void clickCisDeductionPdf() throws Exception {

	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_Lnkbtnpdf']"));
	
	elem.click();
	
	Thread.sleep(5000);
	
	Reporter.log("clickCisDeductionPdf");
	
	
}



public void clickCisDeductionCsv() throws Exception {

	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_Lnkbtncsv']"));
	
	elem.click();
	
	Thread.sleep(5000);
	
	Reporter.log("clickCisDeductionCsv");
	
	
}


public void clickCompanyPaySummaryCsv() throws Exception {
	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnExport']"));
	
	elem.click();
	
	Thread.sleep(5000);
	
	Reporter.log("clickCompanyPaySummaryCsv");

}


public void clickCompanyPaySummaryPdf() throws Exception {
	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnExportToPdf']"));
	
	elem.click();
	
	Thread.sleep(5000);
	
	Reporter.log("clickCompanyPaySummaryPdf");

}


public void clickEmployeeLeavesPdf() throws Exception {
	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_hrefDownload']"));
	
	elem.click();
	
	Thread.sleep(5000);
	
	Reporter.log("clickEmployeeLeavesPdf");

}


public void clickEmployeeLeavesCsv() throws Exception {
	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnExport']"));
	
	elem.click();
	
	Thread.sleep(5000);
	
	Reporter.log("clickEmployeeLeavesCsv");

}



public void clickNICRPdf() throws Exception {
	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_hrefDownload']"));
	
	elem.click();
	
	Thread.sleep(5000);
	
	Reporter.log("clickNICRPdf");

}



public void clickExportToSinglePdf() throws Exception {
	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnExportSinglePdf']"));
	
	elem.click();
	
	Thread.sleep(9000);
	
	Reporter.log("clickNICRPdf");

}



public void clickP11DBPdf() throws Exception {
	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[1]/div[3]/div[1]/div/div/div/table/tbody/tr[2]/td[10]"));
	
	elem.click();
	
	Thread.sleep(5000);
	
	Reporter.log("clickP11DBPdf");

}


public void clickP11DPdf() throws Exception {
	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ReportP11DUC_rptrDisplayRecords_ctl00_btnPdf']"));
	
	elem.click();
	
	Thread.sleep(5000);
	
	Reporter.log("clickP11DBPdf");

}



public void RtiSubmissionPdf1() throws Exception {

	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_LnkSubmissionStatus']"));
	
	elem.click();
	
	Thread.sleep(2000);
	
	
	 m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopSubmissionStatusFrame']")));

		WebElement elem1 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnExport']"));

		elem1.click();
	  
		Thread.sleep(6000);
	
	
	Reporter.log("RtiSubmissionPdf1");
	
	
}



public void clickSppPdf() throws Exception {
	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear']"));
	
    Select sel = new  Select(elem);
    
    sel.selectByVisibleText("2023-2024");
    
    Thread.sleep(7000);
    
    
    m_Driver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_btnExportToPdf\"]")).click();
    
    Thread.sleep(19000);
    
    Reporter.log("clickSppPdf");

}


public void clickSprCsv() throws Exception {
	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_Lnkbtncsv']"));
	
	elem.click();
	
	Thread.sleep(5000);
	
	Reporter.log("clickSprCsv");

}


public void clickSprPdf() throws Exception {
	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_Lnkbtnpdf']"));
	
	elem.click();
	
	Thread.sleep(5000);
	
	Reporter.log("clickSprPdf");

}



public void submitRtiP11D () throws Exception {
	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_btnExportToPdf']"));
	
	elem.click();
	
	Thread.sleep(11000);
	
	Reporter.log("submitRtiP11D");

}



public void clickSspPdf() throws Exception {
	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear']"));
	
    Select sel = new  Select(elem);
    
    sel.selectByVisibleText("2023-2024");
    
    Thread.sleep(7000);
    
    
    m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnExportToPdf']")).click();
    
    Thread.sleep(19000);
    
    Reporter.log("clickSspPdf");

}



public void clickSmpPdf() throws Exception {
	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear']"));
	
    Select sel = new  Select(elem);
    
    sel.selectByVisibleText("2023-2024");
    
    Thread.sleep(7000);
    
    
    m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_hrefDownload']")).click();
    
    Thread.sleep(19000);
    
    Reporter.log("clickSppPdf");

}



public void taxPayementCsv() throws Exception {
	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_Lnkbtncsv']"));
	
	elem.click();
	
	Thread.sleep(9000);
	
	Reporter.log("taxPayementCsv");

}



public void taxPayementPdf() throws Exception {
	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnExportToPdf']"));
	
	elem.click();
	
	Thread.sleep(9000);
	
	Reporter.log("taxPayementCsv");

}


public void departmentAnalysisCsv() throws Exception {
	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnExport']"));
	
	elem.click();
	
	Thread.sleep(5000);
	
	Reporter.log("departmentAnalysisCsv");

}


public void departmentAnalysisPdf() throws Exception {
	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_BtnExportToPdf']"));
	
	elem.click();
	
	Thread.sleep(5000);
	
	Reporter.log("departmentAnalysisPdf");

}



public void paymentSummaryCsv() throws Exception {
	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnExport']"));
	
	elem.click();
	
	Thread.sleep(5000);
	
	Reporter.log("departmentAnalysisCsv");

}



public void paymentSummaryPdf() throws Exception {
	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnExportToPdf']"));
	
	elem.click();
	
	Thread.sleep(5000);
	
	Reporter.log("departmentAnalysisCsv");

}



public void journalCsv() throws Exception {

	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefJournals']"));
	
	elem.click();
	
	Thread.sleep(2000);
	
    WebElement elem1 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkPopup']"));
	
	elem1.click();
	
	Thread.sleep(2000);
	
	
	 m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

		WebElement elem3 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnExport']"));

		elem3.click();
	  
		Thread.sleep(6000);
	
	
	Reporter.log("journalCsv");
	
	
}


public void journalPdf() throws Exception {

	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefJournals']"));
	
	elem.click();
	
	Thread.sleep(2000);
	
    WebElement elem1 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkPopup']"));
	
	elem1.click();
	
	Thread.sleep(2000);
	
	
	 m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

		WebElement elem3 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_A1']"));

		elem3.click();
	  
		Thread.sleep(6000);
	
	
	Reporter.log("journalPdf");
	
	
}


public void notesPdf() throws Exception {
	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefNotesHistory']"));
	
	elem.click();
	
	Thread.sleep(2000);
	
WebElement elem1 = m_Driver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cpHeaderRight_hrefDownload\"]"));
	
	elem1.click();
	Thread.sleep(6000);

	Reporter.log("notesPdf");

}



public void leaveCsv() throws Exception {
	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnExport']"));
	
	elem.click();
	
	Thread.sleep(5000);
	
	Reporter.log("leaveCsv");

}



public void leavePdf() throws Exception {
	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnExportToPdf']"));
	
	elem.click();
	
	Thread.sleep(5000);
	
	Reporter.log("leavePdf");

}




public void attachmentEarningCsv() throws Exception {
	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnExport']"));
	
	elem.click();
	
	Thread.sleep(5000);
	
	Reporter.log("attachmentEarningCsv");

}


public void attachmentEarningPdf() throws Exception {
	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnExportToPdf']"));
	
	elem.click();
	
	Thread.sleep(5000);
	
	Reporter.log("attachmentEarningPdf");

}





public void iepsFile() throws Exception {
	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnDownloadPayslips']"));
	
	elem.click();
	
	Thread.sleep(5000);
	
	Reporter.log("iepsFile");

}


public void clickShow() throws Exception {
	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphError_btnSearch']"));
	
	elem.click();
	
	Thread.sleep(5000);
	
	Reporter.log("clickShow");

}





public void clicApsCsv() throws Exception {
	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnExport']"));
	
	elem.click();
	
	Thread.sleep(5000);
	
	Reporter.log("clicApsCsv");

}



public void clickApsPdf() throws Exception {
	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnExportToPdf']"));
	
	elem.click();
	
	Thread.sleep(5000);
	
	Reporter.log("clickApsPdf");

}



}
