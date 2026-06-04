package _1566AdditionDeductionPage;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import pages.BasePage;
import utilities.WaitUtility;
import utilities.reports.ExtentReportManager;

public class ProcessPay extends BasePage {

	public ProcessPay(WebDriver driver) {
		super(driver);
		
	}
	WaitUtility wt=new WaitUtility();
//    private By threeDots= By.xpath("//*[@id='tblReportData']/tbody/tr/td[12]/div/a");//sandbox
    private By threeDots= By.xpath("//*[@id='tblReportData']/tbody/tr/td[14]/div/a"); //uat

    private By editBtnElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrEditButton_ctl00_PayUnits']");

    private By editBtns= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords_ctl02_dvDropDownMenu']/ul/li[1]/a");
    
    private By editBtnElem1= By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[5]/div[3]/div[2]/div/div/table/tbody/tr[2]/td/a");

    private By threeDot2= By.xpath("(//*[@data-toggle='dropdown'])[3]");
    private By threeDot3= By.xpath("(//*[@data-toggle='dropdown'])[4]");
    private By threeDot4= By.xpath("(//*[@data-toggle='dropdown'])[5]");
    private By threeDot5= By.xpath("(//*[@data-toggle='dropdown'])[6]");

    private By threeDot6= By.xpath("(//*[@data-toggle='dropdown'])[7]");

    private By threeDot7= By.xpath("(//*[@data-toggle='dropdown'])[8]");

    private By threeDot8= By.xpath("(//*[@data-toggle='dropdown'])[9]");

    private By threeDot9= By.xpath("(//*[@data-toggle='dropdown'])[10]");

    private By threeDot10= By.xpath("(//*[@data-toggle='dropdown'])[11]");

    private By threeDots2Elem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[3]/td[15]/div/a");
    private By threeDots3Elem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[4]/td[15]/div/a");
    private By threeDots4Elem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[5]/td[15]/div/a");
    private By threeDots5Elem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[6]/td[15]/div/a");
    private By UndoneprocessPay= By.xpath("(//*[@class='dropdown-menu dropdown-menu-left']/descendant::li/a[contains(text(),'Process Pay')])[2]");

    private By processPay= By.xpath("//a[normalize-space()='Process Pay']");
    private By processPay1=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[2]/td[15]/div/ul/li[3]/a");
    private By processPay2=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']//descendant::ul[2]/li/a[contains(text(),'Pay')]");
    private By processPay3=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']//descendant::ul[3]/li/a[contains(text(),'Pay')]");
    private By processPay4=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']//descendant::ul[4]/li/a[contains(text(),'Pay')]");
    private By processPay5=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']//descendant::ul[5]/li/a[contains(text(),'Pay')]");
	
    private By processPay6=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']//descendant::ul[6]/li/a[contains(text(),'Pay')]");

    private By processPay7=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']//descendant::ul[7]/li/a[contains(text(),'Pay')]");

    private By processPay8=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']//descendant::ul[8]/li/a[contains(text(),'Pay')]");

    private By processPay9=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']//descendant::ul[9]/li/a[contains(text(),'Pay')]");

    private By processPay10=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']//descendant::ul[10]/li/a[contains(text(),'Pay')]");

	private By addMore =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_lnkAddMoreAddition']");
	
	private By applyOn= By.xpath("//*[@id='tblAddition']/tbody/tr[2]/td[4]/div/button");
	
	private By applyOnDeduction= By.xpath("//*[@id='tblDeductions']/tbody/tr[2]/td[4]/div/button");

	
	private By applyOn2= By.xpath("//*[@id='tblAddition']/tbody/tr[3]/td[4]/div/button");
	
	private By deductionElem= By.xpath("//*[@id='__tab_ctl00_ctl00_ParentContent_cPH_tbContainer_tpDeduction']");
	
	private By addMoreDeduction=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpDeduction_lnkAddMoreDeduction']");
	
	private By applyOnDeductions=By.xpath("//*[@id='tblDeductions']/descendant::button");
	
	private By selectCodedeductionElem= By.xpath("//*[@id='S-ctl00_ctl00_ParentContent_cPH_tbContainer_tpDeduction_rptrDeduction_ctl00_ltDeductionAccount']");

	private By selectCodeElem= By.xpath("//*[@id='S-ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl00_ltAdditionAccount']");
	private By selectCodeElem2= By.xpath("//*[@id='S-ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl01_ltAdditionAccount']");
	private By selectCodeElem3= By.xpath("//*[@id='S-ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl02_ltAdditionAccount']");

	private By deductionDescriptionElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpDeduction_rptrDeduction_ctl00_txtDescription']");

	private By descriptionElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl00_txtDescription']");
	private By descriptionElem2= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl01_txtDescription']");
	private By descriptionElem3= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl02_txtDescription']");

	private By amountElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl00_txtAmount']");
	private By amountElem2= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl01_txtAmount']");
	private By amountElem3= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl02_txtAmount']");
	private By amountdeductionElem2= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpDeduction_rptrDeduction_ctl00_txtAmount']");

	private By saveBtn= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSave']");
	private By saveNextBtn= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_lnkSaveNext']");

	private By NextBtnEElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_lnkSaveNext']");

	private By PreviousBtnEElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_lnkSavePrevious']");

	private By savePreviousBtn= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_lnkSavePrevious']");

	private By checkBxElem =By.xpath("//*[@id='chAllRTI']");
	
	private By checkBxElem1 =By.xpath("//*[@id='chAllRTI1']");
	private By deletElem =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnDelete']");
	
	private By payeTaxElem =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl00_chkPayeeTax']");
	
	private By employeeNameElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[2]/td[1]/a");
	
	private By sendPayslip= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ddlPaySlipTemplate']");
	
	private By selectPeriodElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPayrollDate']");
	
	private By basicPayElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtBasicPay']");
	
	private By employeeSalaryDetails =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplay_ctl51_lnkViewEmployeeSalaryDetails']");
	
	private By employeeSlaryDetailsElem= By.xpath("//*[text()='31 Mar 2023']");
	
	private By netPayCalculatorElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_LinkButtonEx1']");
	
	private By inputNetPayElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtNetPay']");
	
	private By claculateElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnNetPay']");
	
    public void click3Dots() throws Exception
    {

		WebElement elem = getWebElement(threeDots);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "click3Dots", "click3Dots failed. Unable to locate object: " + threeDots.toString());

			Assert.fail("Unable to locate object: " + threeDots.toString());
        }

		elem.click();
	   Thread.sleep(2000);
		
		ExtentReportManager.passStep(m_Driver, "click3Dots");
	
		   Reporter.log("Click 3 dots");
    }
    
    
    public void clickEditGoToProcessPay() throws Exception
    {

		WebElement elem = getWebElement(editBtnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEditGoToProcessPay", "clickEditGoToProcessPay failed. Unable to locate object: " + editBtnElem.toString());

			Assert.fail("Unable to locate object: " + editBtnElem.toString());
        }

		elem.click();
	   Thread.sleep(2000);
		
		ExtentReportManager.passStep(m_Driver, "clickEditGoToProcessPay");
	
		Reporter.log("clickEditGoToProcessPay");
    }
    
    
    public void clickEditBtns() throws Exception
    {

		WebElement elem = getWebElement(editBtns);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEditBtns", "clickEditBtns failed. Unable to locate object: " + editBtns.toString());

			Assert.fail("Unable to locate object: " + editBtns.toString());
        }

		elem.click();
	   Thread.sleep(2000);
		
		ExtentReportManager.passStep(m_Driver, "clickEditBtns");
	
		Reporter.log("clickEditBtns");
    }
    
    
    
    public void clickEditGoToProcessPayRunPayroll() throws Exception
    {
		WebElement elem = getWebElement(editBtnElem1);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEditGoToProcessPayRunPayroll", "clickEditGoToProcessPayRunPayroll failed. Unable to locate object: " + editBtnElem1.toString());

			Assert.fail("Unable to locate object: " + editBtnElem1.toString());
        }

		elem.click();
	   Thread.sleep(2000);
		
		ExtentReportManager.passStep(m_Driver, "clickEditGoToProcessPayRunPayroll");
	
		Reporter.log("clickEditGoToProcessPayRunPayroll");
    }
    
    
    public void click3Dot2() throws Exception
    {

		WebElement elem = getWebElement(threeDot2);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "click3Dot2", "click3Dot2 failed. Unable to locate object: " + threeDot2.toString());

			Assert.fail("Unable to locate object: " + threeDot2.toString());
        }

		elem.click();
	   Thread.sleep(2000);
		
		ExtentReportManager.passStep(m_Driver, "click3Dots");
	
		   Reporter.log("click3Dot2");
    }
    
    public void click3Dot3() throws Exception
    {

		WebElement elem = getWebElement(threeDot3);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "click3Dot3", "click3Dot3 failed. Unable to locate object: " + threeDot3.toString());

			Assert.fail("Unable to locate object: " + threeDot3.toString());
        }

		elem.click();
	   Thread.sleep(2000);
		
		ExtentReportManager.passStep(m_Driver, "click3Dots");
	
		   Reporter.log("click3Dot2");
    }
    
    public void click3Dot4() throws Exception
    {

		WebElement elem = getWebElement(threeDot4);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "click3Dot4", "click3Dot4 failed. Unable to locate object: " + threeDot4.toString());

			Assert.fail("Unable to locate object: " + threeDot4.toString());
        }

		elem.click();
	   Thread.sleep(2000);
		
		ExtentReportManager.passStep(m_Driver, "click3Dot4");
	
		   Reporter.log("click3Dot4");
    }
    
    
    public void click3Dot5() throws Exception
    {

		WebElement elem = getWebElement(threeDot5);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "click3Dot5", "click3Dot5 failed. Unable to locate object: " + threeDot5.toString());

			Assert.fail("Unable to locate object: " + threeDot4.toString());
        }

		elem.click();
	   Thread.sleep(2000);
		
		ExtentReportManager.passStep(m_Driver, "click3Dot5");
	
		Reporter.log("click3Dot5");
    }
    
    
    
    public void click3Dot6() throws Exception
    {

		WebElement elem = getWebElement(threeDot6);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "click3Dot6", "click3Dot6 failed. Unable to locate object: " + threeDot6.toString());

			Assert.fail("Unable to locate object: " + threeDot6.toString());
        }

		elem.click();
	   Thread.sleep(2000);
		
		ExtentReportManager.passStep(m_Driver, "click3Dot6");
	
		Reporter.log("click3Dot6");
    }
    
    
    public void click3Dot7() throws Exception
    {

		WebElement elem = getWebElement(threeDot7);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "click3Dot7", "click3Dot7 failed. Unable to locate object: " + threeDot7.toString());

			Assert.fail("Unable to locate object: " + threeDot7.toString());
        }

		elem.click();
	   Thread.sleep(2000);
		
		ExtentReportManager.passStep(m_Driver, "click3Dot7");
	
		Reporter.log("click3Dot7");
    }
    
    
    public void click3Dot8() throws Exception
    {

		WebElement elem = getWebElement(threeDot8);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "click3Dot8", "click3Dot8 failed. Unable to locate object: " + threeDot8.toString());

			Assert.fail("Unable to locate object: " + threeDot8.toString());
        }

		elem.click();
	   Thread.sleep(2000);
		
		ExtentReportManager.passStep(m_Driver, "click3Dot8");
	
		Reporter.log("click3Dot8");
    }
    
    
    
    public void click3Dot9() throws Exception
    {

		WebElement elem = getWebElement(threeDot9);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "click3Dot9", "click3Dot9 failed. Unable to locate object: " + threeDot9.toString());

			Assert.fail("Unable to locate object: " + threeDot9.toString());
        }

		elem.click();
	   Thread.sleep(2000);
		
		ExtentReportManager.passStep(m_Driver, "click3Dot9");
	
		Reporter.log("click3Dot9");
    }
    
    
    
    
    public void click3Dot10() throws Exception
    {

		WebElement elem = getWebElement(threeDot10);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "click3Dot10", "click3Dot10 failed. Unable to locate object: " + threeDot10.toString());

			Assert.fail("Unable to locate object: " + threeDot10.toString());
        }

		elem.click();
	   Thread.sleep(2000);
		
		ExtentReportManager.passStep(m_Driver, "click3Dot10");
	
		Reporter.log("click3Dot10");
    }
    

    
    
    public void clickNetPayCalculator() throws Exception
    {

		WebElement elem = getWebElement(netPayCalculatorElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickNetPayCalculator", "clickNetPayCalculator failed. Unable to locate object: " + netPayCalculatorElem.toString());

			Assert.fail("Unable to locate object: " + netPayCalculatorElem.toString());
        }

		elem.click();
	   Thread.sleep(2000);
		
		ExtentReportManager.passStep(m_Driver, "clickNetPayCalculator");
	
		   Reporter.log("clickNetPayCalculator");
    }
    
    
    
    public void enterNetPayInput(String value) throws Exception
    {

		WebElement elem = getWebElement(inputNetPayElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterNetPayInput", "enterNetPayInput failed. Unable to locate object: " + inputNetPayElem.toString());

			Assert.fail("Unable to locate object: " + inputNetPayElem.toString());
        }
       elem.clear();
		elem.sendKeys(value);
	   Thread.sleep(2000);
		
		ExtentReportManager.passStep(m_Driver, "enterNetPayInput");
	
		   Reporter.log("enterNetPayInput");
    }
    
    
    public void clickCalculatBtn() throws Exception
    {

		WebElement elem = getWebElement(claculateElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickCalculatBtn", "clickCalculatBtn failed. Unable to locate object: " + claculateElem.toString());

			Assert.fail("Unable to locate object: " + claculateElem.toString());
        }

		elem.click();
	   Thread.sleep(2000);
		
		ExtentReportManager.passStep(m_Driver, "clickCalculatBtn");
	
		   Reporter.log("clickCalculatBtn");
    }
    
    public void click3Dots2()
    {

		WebElement elem = getWebElement(threeDots2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "click3Dots2", "click3Dots2 failed. Unable to locate object: " + threeDots2Elem.toString());

			Assert.fail("Unable to locate object: " + threeDots2Elem.toString());
        }

		elem.click();
		
		ExtentReportManager.passStep(m_Driver, "click3Dots");
	
		   Reporter.log("Click 3 dots");
    }
    
    public void click3Dots3()
    {

		WebElement elem = getWebElement(threeDots3Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "click3Dots3", "click3Dots3 failed. Unable to locate object: " + threeDots3Elem.toString());

			Assert.fail("Unable to locate object: " + threeDots3Elem.toString());
        }

		elem.click();
		
		ExtentReportManager.passStep(m_Driver, "click3Dots3");
	
		   Reporter.log("Click 3 dots");
    }
    
    public void click3Dots4()
    {

		WebElement elem = getWebElement(threeDots4Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "click3Dots4", "click3Dots4 failed. Unable to locate object: " + threeDots4Elem.toString());

			Assert.fail("Unable to locate object: " + threeDots4Elem.toString());
        }

		elem.click();
		
		ExtentReportManager.passStep(m_Driver, "click3Dots4");
	
		   Reporter.log("Click 3 dots");
    }
    
    public void click3Dots5()
    {
		WebElement elem = getWebElement(threeDots5Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "click3Dots5", "click3Dots5 failed. Unable to locate object: " + threeDots5Elem.toString());

			Assert.fail("Unable to locate object: " + threeDots4Elem.toString());
        }

		elem.click();
		ExtentReportManager.passStep(m_Driver, "threeDots5Elem");
		   Reporter.log("Click 3 dots");
    }
    
    
    
    public void clickProcessPay6()
    {
    	
    	WebElement elem = getWebElement(processPay6);
    	

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickProcessPay6", "clickProcessPay6 failed. Unable to locate object: " + processPay6.toString());

			Assert.fail("Unable to locate object: " + processPay6.toString());
        }

		elem.click();
		
		ExtentReportManager.passStep(m_Driver, "clickProcessPay6");
	
		   Reporter.log("Click ProcessPay");
    }  
    
    
    public void clickProcessPay7()
    {
    	
    	WebElement elem = getWebElement(processPay7);
    	

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickProcessPay7", "clickProcessPay7 failed. Unable to locate object: " + processPay7.toString());

			Assert.fail("Unable to locate object: " + processPay7.toString());
        }

		elem.click();
		
		ExtentReportManager.passStep(m_Driver, "clickProcessPay7");
	
		   Reporter.log("clickProcessPay");
    }  
    
    
    public void clickProcessPay8()
    {
    	
    	WebElement elem = getWebElement(processPay8);
    	

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickProcessPay8", "clickProcessPay8 failed. Unable to locate object: " + processPay8.toString());

			Assert.fail("Unable to locate object: " + processPay8.toString());
        }

		elem.click();
		
		ExtentReportManager.passStep(m_Driver, "clickProcessPay8");
	
		   Reporter.log("Click ProcessPay");
    }  
    
    public void clickProcessPay9()
    {
    	
    	WebElement elem = getWebElement(processPay9);
    	

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickProcessPay9", "clickProcessPay9 failed. Unable to locate object: " + processPay9.toString());

			Assert.fail("Unable to locate object: " + processPay9.toString());
        }

		elem.click();
		
		ExtentReportManager.passStep(m_Driver, "clickProcessPay9");
	
		   Reporter.log("clickProcessPay9");
    }  
    
    
    public void clickProcessPay10()
    {
    	
    	WebElement elem = getWebElement(processPay10);
    	

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickProcessPay10", "clickProcessPay10 failed. Unable to locate object: " + processPay10.toString());

			Assert.fail("Unable to locate object: " + processPay10.toString());
        }

		elem.click();
		
		ExtentReportManager.passStep(m_Driver, "clickProcessPay10");

		 Reporter.log("clickProcessPay10");
    }  
    	
    public void clickProcessPay1()
    {
    	
    	WebElement elem = getWebElement(processPay1);
    	

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickProcessPay1", "clickProcessPay1 failed. Unable to locate object: " + processPay1.toString());

			Assert.fail("Unable to locate object: " + processPay1.toString());
        }

		elem.click();
		
		ExtentReportManager.passStep(m_Driver, "clickProcessPay1");
	
		   Reporter.log("Click ProcessPay");
    }  
    public void clickProcessPay2() throws InterruptedException
    {
    	
    	WebElement elem = getWebElement(processPay2);
    	

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickProcessPay2", "clickProcessPay2 failed. Unable to locate object: " + processPay2.toString());

			Assert.fail("Unable to locate object: " + processPay2.toString());
        }
		Thread.sleep(2000);

		elem.click();
		Thread.sleep(2000);

		ExtentReportManager.passStep(m_Driver, "clickProcessPay2");
	
		   Reporter.log("Click ProcessPay");
    }  
    	
    public void clickProcessPay3() throws InterruptedException
    {
    	
    	WebElement elem = getWebElement(processPay3);
    	

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickProcessPay3", "clickProcessPay3 failed. Unable to locate object: " + processPay3.toString());

			Assert.fail("Unable to locate object: " + processPay3.toString());
        }

		Thread.sleep(2000);
		elem.click();
		Thread.sleep(2000);

		ExtentReportManager.passStep(m_Driver, "clickProcessPay3");
	
		   Reporter.log("Click ProcessPay");
    } 
    
    public void clickProcessPay4()
    {
    	
    	WebElement elem = getWebElement(processPay4);
    	

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickProcessPay4", "clickProcessPay4 failed. Unable to locate object: " + processPay4.toString());

			Assert.fail("Unable to locate object: " + processPay4.toString());
        }

		elem.click();
		
		ExtentReportManager.passStep(m_Driver, "clickProcessPay4");
	
		   Reporter.log("Click ProcessPay");
    } 
    
    public void clickProcessPay5()
    {
    	
    	WebElement elem = getWebElement(processPay5);
    	

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickProcessPay5", "clickProcessPay5 failed. Unable to locate object: " + processPay5.toString());

			Assert.fail("Unable to locate object: " + processPay5.toString());
        }

		elem.click();
		
		ExtentReportManager.passStep(m_Driver, "clickProcessPay5");
	
		   Reporter.log("Click ProcessPay");
    } 
    
    
    public void clickProcessPay()
    {
    	
    	WebElement elem = getWebElement(processPay);
    	

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickProcessPay5", "clickProcessPay5 failed. Unable to locate object: " + processPay5.toString());

			Assert.fail("Unable to locate object: " + processPay.toString());
        }

		elem.click();
		
		ExtentReportManager.passStep(m_Driver, "clickProcessPay5");
	
		   Reporter.log("Click ProcessPay");
    } 
    
    public void enterUnit(String data) {
    	
    	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrUnit_ctl00_txtUnit10']"));
    	
    	
    	elem.sendKeys(data);
    	
    	Reporter.log("enterUnit");
  
    }
    
    
    public void clickUndoneProcessPay()
    {
		   jsExec.executeScript("window.scrollBy(0,500)");

    	
    	WebElement elem = getWebElement(UndoneprocessPay);
    	

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickUndoneProcessPay", "clickUndoneProcessPay failed. Unable to locate object: " + UndoneprocessPay.toString());

			Assert.fail("Unable to locate object: " + UndoneprocessPay.toString());
        }

		elem.click();
		
		ExtentReportManager.passStep(m_Driver, "clickUndoneProcessPay");
		 Reporter.log("clickUndoneProcessPay");
    } 
    
    
    
    public void clickAddMore()
    {
    	
	  WebElement elem = getWebElement(addMore);
	  

		if (elem == null) {
  		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickAddMore", "clickAddMore failed. Unable to locate object: " + addMore.toString());

			Assert.fail("Unable to locate object: " + addMore.toString());
		}
		elem.click();
		
		ExtentReportManager.passStep(m_Driver, "clickAddMore");
		
		   Reporter.log("Click AddMore");
  }   
    
    
    public void clickAddMoreDeduction()
    {
    	
		 WebElement elem = getWebElement(addMoreDeduction);
		 if (elem == null) {
	  		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickAddMoreDeduction", "clickAddMoreDeduction failed. Unable to locate object: " + addMoreDeduction.toString());

				Assert.fail("Unable to locate object: " + addMoreDeduction.toString());
			}
			elem.click();
			
			ExtentReportManager.passStep(m_Driver, "clickAddMoreDeduction");
			
			Reporter.log("Click AddMore");
    }
    
    public void clickApplyBtn() throws Exception 
    {
      
    	
		WebElement ele = getWebElement(applyOn);

	

		if (ele == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickApplyBtn", "clickApplyBtn failed. Unable to locate object: " + applyOn.toString());

			Assert.fail("Unable to locate object: " + applyOn.toString());
        }
	
		Thread.sleep(3000);
		ele.click();

		
		ExtentReportManager.passStep(m_Driver, "clickApplyBtn");
		Reporter.log("Click ApplyOn");
    }
    
    public void clickApplyBtnDeduction()
    {

		WebElement elem = getWebElement(applyOnDeduction);
		

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickApplyBtnDeduction", "clickApplyBtnDeduction failed. Unable to locate object: " + applyOnDeduction.toString());

			Assert.fail("Unable to locate object: " + applyOnDeduction.toString());
        }
		elem.click();
		ExtentReportManager.passStep(m_Driver, "clickApplyBtnDeduction");
		Reporter.log("Click ApplyOn Deduction");
    }
    public void clickApplyBtn2()
    {

		WebElement elem = getWebElement(applyOn2);
		

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickApplyBtn2", "clickApplyBtn2 failed. Unable to locate object: " + applyOn2.toString());

			Assert.fail("Unable to locate object: " + applyOn2.toString());
        }
		elem.click();
		ExtentReportManager.passStep(m_Driver, "clickApplyBtn2");
		Reporter.log("Click ApplyOn");
    }
    
    public void clickApplyOnDeduction()
    {
		WebElement elem = getWebElement(applyOnDeductions);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickApplyOnDeduction", "clickApplyOnDeduction failed. Unable to locate object: " + applyOnDeductions.toString());

			Assert.fail("Unable to locate object: " + applyOnDeductions.toString());
        }

		elem.click();
		ExtentReportManager.passStep(m_Driver, "clickApplyOnDeduction");
		Reporter.log("Click ApplyOn");
    }
    
    
    public void clickDeductionTab()
    {

		WebElement elem = getWebElement(deductionElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickDeductionTab", "clickDeductionTab failed. Unable to locate object: " + deductionElem.toString());

			Assert.fail("Unable to locate object: " + deductionElem.toString());
        }

		elem.click();
		ExtentReportManager.passStep(m_Driver, "clickDeductionTab");
		Reporter.log("Click DeductionTab");
    }
    
    
    public void enterAccountCode(String value)
    {

		WebElement elem = getWebElement(selectCodeElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterAccountCode", "enterAccountCode failed. Unable to locate object: " + selectCodeElem.toString());

			Assert.fail("Unable to locate object: " + selectCodeElem.toString());
        }

		elem.sendKeys(value);
		ExtentReportManager.passStep(m_Driver, "enterAccountCode");
		Reporter.log("Select AccountCode");
    }
    
    
    
    
    public void enterAccountCodeDeduction(String value)
    {

		WebElement elem = getWebElement(selectCodedeductionElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterAccountCodeDeduction", "enterAccountCode failed. Unable to locate object: " + selectCodedeductionElem.toString());

			Assert.fail("Unable to locate object: " + selectCodedeductionElem.toString());
        }

		elem.sendKeys(value);
		ExtentReportManager.passStep(m_Driver, "enterAccountCodeDeduction");
		Reporter.log("Select AccountCode");
    }
    
    
    public void enterAccountCode2(String value)
    {

		WebElement elem = getWebElement(selectCodeElem2);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterAccountCode2", "enterAccountCode2 failed. Unable to locate object: " + selectCodeElem2.toString());

			Assert.fail("Unable to locate object: " + selectCodeElem2.toString());
        }

		elem.sendKeys(value);
		ExtentReportManager.passStep(m_Driver, "enterAccountCode2");
		Reporter.log("Select AccountCode");
    }
    
    public void enterAccountCode3(String value)
    {

		WebElement elem = getWebElement(selectCodeElem3);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterAccountCode3", "enterAccountCode3 failed. Unable to locate object: " + selectCodeElem3.toString());

			Assert.fail("Unable to locate object: " + selectCodeElem3.toString());
        }

		elem.sendKeys(value);
		ExtentReportManager.passStep(m_Driver, "enterAccountCode3");
		Reporter.log("Select AccountCode");
    }
    
    public void enterDescription(String value)
    {

		WebElement elem = getWebElement(descriptionElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterDescription", "enterDescription failed. Unable to locate object: " + descriptionElem.toString());

			Assert.fail("Unable to locate object: " + descriptionElem.toString());
        }

		elem.sendKeys(value);
		ExtentReportManager.passStep(m_Driver, "enterDescription");
		Reporter.log("Enter Description");
    }
    
    
    public void enterDeductionDescription(String value)
    {

		WebElement elem = getWebElement(deductionDescriptionElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterDeductionDescription", "enterDeductionDescription failed. Unable to locate object: " + deductionDescriptionElem.toString());

			Assert.fail("Unable to locate object: " + deductionDescriptionElem.toString());
        }

		elem.sendKeys(value);
		ExtentReportManager.passStep(m_Driver, "enterDeductionDescription");
		Reporter.log("Enter Description");
    }
    
    public void enterDescription2(String value)
    {

		WebElement elem = getWebElement(descriptionElem2);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterDescription2", "enterDescription2 failed. Unable to locate object: " + descriptionElem2.toString());

			Assert.fail("Unable to locate object: " + descriptionElem2.toString());
        }

		elem.sendKeys(value);
		ExtentReportManager.passStep(m_Driver, "enterDescription2");
		Reporter.log("Enter Description");
    }
    
    
    public void enterDescription3(String value)
    {

		WebElement elem = getWebElement(descriptionElem3);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterDescription3", "enterDescription3 failed. Unable to locate object: " + descriptionElem3.toString());

			Assert.fail("Unable to locate object: " + descriptionElem3.toString());
        }

		elem.sendKeys(value);
		ExtentReportManager.passStep(m_Driver, "enterDescription3");
		Reporter.log("Enter Description");
    }
    public void enterAmount(String value) throws Exception
    {

		WebElement elem = getWebElement(amountElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterAmount", "enterAmount failed. Unable to locate object: " + amountElem.toString());

			Assert.fail("Unable to locate object: " + amountElem.toString());
        }

		elem.sendKeys(value);
		elem.sendKeys(Keys.TAB);
		ExtentReportManager.passStep(m_Driver, "enterAmount");
		Reporter.log("Enter Amount");
    }
    
    
    public void enterAmount2(String value)
    {

		WebElement elem = getWebElement(amountElem2);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterAmount2", "enterAmount2 failed. Unable to locate object: " + amountElem2.toString());

			Assert.fail("Unable to locate object: " + amountElem2.toString());
        }

		elem.sendKeys(value);
		elem.sendKeys(Keys.TAB);
		ExtentReportManager.passStep(m_Driver, "enterAmount2");
		Reporter.log("Enter Amount");
    }
    
    
    public void enterdeductionAmount(String value)
    {

		WebElement elem = getWebElement(amountdeductionElem2);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterdeductionAmount", "enterdeductionAmount failed. Unable to locate object: " + amountdeductionElem2.toString());

			Assert.fail("Unable to locate object: " + amountdeductionElem2.toString());
        }

		elem.sendKeys(value);
		elem.sendKeys(Keys.TAB);
		ExtentReportManager.passStep(m_Driver, "enterdeductionAmount");
		Reporter.log("Enter Amount");
    }
    
    public void enterAmount3(String value)
    {

		WebElement elem = getWebElement(amountElem3);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterAmount3", "enterAmount3 failed. Unable to locate object: " + amountElem3.toString());

			Assert.fail("Unable to locate object: " + amountElem3.toString());
        }

		elem.sendKeys(value);
		elem.sendKeys(Keys.TAB);
		ExtentReportManager.passStep(m_Driver, "enterAmount3");
		Reporter.log("Enter Amount");
    }
    
    public void clickSaveBtn() throws InterruptedException
	{
        
		WebElement elem = getWebElement(saveBtn);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickSaveBtn", "clickSaveBtn failed. Unable to locate object: " + saveBtn.toString());

			Assert.fail("Unable to locate object: " + saveBtn.toString());
        }
		jsExec.executeScript("arguments[0].click();",elem);
	
		
		ExtentReportManager.passStep(m_Driver, "clickSaveBtn");
		Thread.sleep(3000);
		 Reporter.log("Click Save Btn");
}

    
    public void clickSaveNextBtn() throws InterruptedException
  	{
          
  		WebElement elem = getWebElement(saveNextBtn);

  		if (elem == null) {
      		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickSaveBtn", "clickSaveBtn failed. Unable to locate object: " + saveNextBtn.toString());

  			Assert.fail("Unable to locate object: " + saveNextBtn.toString());
          }
  		jsExec.executeScript("arguments[0].click();",elem);
  	
  		
  		ExtentReportManager.passStep(m_Driver, "clickSaveBtn");
  		Thread.sleep(1000);
  		 Reporter.log("clickSaveNextBtn");
  }
    
    
    
    public void clickNextBtn() throws InterruptedException
  	{
          
  		WebElement elem = getWebElement(NextBtnEElem);

  		if (elem == null) {
      		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickNextBtn", "clickNextBtn failed. Unable to locate object: " + NextBtnEElem.toString());

  			Assert.fail("Unable to locate object: " + NextBtnEElem.toString());
          }
  		jsExec.executeScript("arguments[0].click();",elem);
  	
  		
  		ExtentReportManager.passStep(m_Driver, "clickNextBtn");
  		Thread.sleep(1000);
  		 Reporter.log("clickNextBtn");
  }

    
    public void clickPreviousBtn() throws InterruptedException
  	{
          
  		WebElement elem = getWebElement(PreviousBtnEElem);

  		if (elem == null) {
      		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickPreviousBtn", "clickPreviousBtn failed. Unable to locate object: " + PreviousBtnEElem.toString());

  			Assert.fail("Unable to locate object: " + PreviousBtnEElem.toString());
          }
  		jsExec.executeScript("arguments[0].click();",elem);
  	
  		
  		ExtentReportManager.passStep(m_Driver, "clickPreviousBtn");
  		Thread.sleep(1000);
  		 Reporter.log("clickPreviousBtn");
  }
    
    
    public void clickSavePreviousBtn() throws InterruptedException
  	{
          
  		WebElement elem = getWebElement(savePreviousBtn);

  		if (elem == null) {
      		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickSavePreviousBtn", "clickSavePreviousBtn failed. Unable to locate object: " + savePreviousBtn.toString());

  			Assert.fail("Unable to locate object: " + savePreviousBtn.toString());
          }
  		jsExec.executeScript("arguments[0].click();",elem);
  	
  		
  		ExtentReportManager.passStep(m_Driver, "clickSavePreviousBtn");
  		Thread.sleep(1000);
  		 Reporter.log("clickSavePreviousBtn");
  }
    
    public void selectCheckBx() throws InterruptedException
  	{
          
  		WebElement elem = getWebElement(checkBxElem);

  		if (elem == null) {
      		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectCheckBx", "selectCheckBx failed. Unable to locate object: " + checkBxElem.toString());

  			Assert.fail("Unable to locate object: " + checkBxElem.toString());
          }
  		
  		elem.click();
  		ExtentReportManager.passStep(m_Driver, "selectCheckBx");
  	     Reporter.log("Click check Box");
  }
    
    public void selectCheckBx1() throws InterruptedException
  	{
          
  		WebElement elem = getWebElement(checkBxElem1);

  		if (elem == null) {
      		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectCheckBx", "selectCheckBx failed. Unable to locate object: " + checkBxElem1.toString());

  			Assert.fail("Unable to locate object: " + checkBxElem1.toString());
          }
  		
  		elem.click();
  		ExtentReportManager.passStep(m_Driver, "selectCheckBx1");
  	    Reporter.log("Click check Box");
  }
    
    public void clickDeletBtn() throws Exception 
  	{
          
  		WebElement elem = getWebElement(deletElem);

  		if (elem == null) {
      		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickDeletBtn", "clickDeletBtn failed. Unable to locate object: " + deletElem.toString());

  			Assert.fail("Unable to locate object: " + deletElem.toString());
          }
  		
  		elem.click();
  		m_Driver.switchTo().alert().accept();
  		Thread.sleep(2000);
  		ExtentReportManager.passStep(m_Driver, "clickDeletBtn");
  	     Reporter.log("Click Delect Btn");
  }
    
    
    public void onlyCheckPayeTax() throws InterruptedException
  	{
    		
    		//List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[1]/li/a/input"));
    	    
    	List<WebElement> list =   m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[1]/li/a/input"));
    		for(int i=1;i<=list.size()-1;i++)
    		{
              
    			WebElement checked = list.get(i);
    			
    			checked.click();
    			
    		}
    
    	Reporter.log("PAYE tax can be deducted");
    	
  	}
    
    public void onlyCheckPayeTaxForProcessPay() throws InterruptedException
  	{
    		
    		//List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[1]/li/a/input"));
    	    
    	List<WebElement> list =   m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[1]/li/a/input"));
    		for(int i=1;i<=list.size()-1;i++)
    		{
    			if(i==4)
    			{
    				break;
    			}
              
    			WebElement checked = list.get(i);
    			
    			checked.click();
    			
    		}
    
    	Reporter.log("PAYE tax can be deducted");
    	
  	}
    
    
    public void tickNotinalPay() throws InterruptedException
  	{
    		
    		//List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[1]/li/a/input"));
    	    
    	List<WebElement> list =   m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[1]/li/a/input"));
    		for(int i=1;i<=list.size()-1;i++)
    		{
    			if(i==0||i==1||i==2|i==3)
    			{
    				continue;
    			}
              
    			WebElement checked = list.get(i);
    			
    			checked.click();
    			
    		}
    
    	Reporter.log("PAYE tax can be deducted");
    	
  	}
    
    public void tickNotinalPay1() throws InterruptedException
  	{
    		
    		//List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[1]/li/a/input"));
    	    
    	List<WebElement> list =   m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[2]/li/a/input"));
    		for(int i=1;i<=list.size()-1;i++)
    		{
    			if(i==0||i==1||i==2|i==3)
    			{
    				continue;
    			}
              
    			WebElement checked = list.get(i);
    			
    			checked.click();
    			
    		}
    
    	Reporter.log("PAYE tax can be deducted");
    	
  	}
    
    
    
    public void checkedAllOption() throws InterruptedException
  	{
    		
    		//List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[1]/li/a/input"));
    	    
    	List<WebElement> list =   m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[1]/li/a/input"));
    		for(int i=1;i<=list.size()-1;i++)
    		{
    			if(i==4)
    			{
    				WebElement checked = list.get(i);
        			
        			checked.click();
        			break;
    			}
              
    			
    			
    		}
    
    	Reporter.log("PAYE tax can be deducted");
    	
  	}
    public void onlyCheckPayeTaxAndNI() throws InterruptedException
  	{
    		
    		List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[1]/li/a/input"));
    	
    		for(int i=2;i<=list.size()-1;i++)
    		{
    			if(i==4)
    			{
    				break;
    			}
    			WebElement checked = list.get(i);
    			checked.click();
    			
    		}
    		
    	Reporter.log("PAYE tax can be deducted");
    	
  	}
    
    public void onlyCheckPayeTaxDeduction() throws InterruptedException
  	{
    		
    		List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='tblDeductions']/tbody/tr[2]/td[4]/div/ul/li/a/input"));
    	
    		for(int i=1;i<=list.size()-1;i++)
    		{
    			WebElement checked = list.get(i);
    			checked.click();
    			
    		}
    		
    	Reporter.log("PAYE tax can be deducted");
    	
  	}
    public void onlyCheckPayeTax1() throws InterruptedException
  	{
    		
    		List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='tblDeductions']/tbody/tr[2]/td[11]/div/ul/li/a/input"));
    	
    		for(int i=1;i<=list.size()-1;i++)
    		{
    			WebElement checked = list.get(i);
    			checked.click();
    			
    		}
    		
    	Reporter.log("PAYE tax can be deducted");
    	
  	}
    public void onlyCheckPayeTaxDeductions() throws InterruptedException
   	{
     		
     		List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='tblDeductions']/tbody/tr[2]/td[11]/div/ul/li/a/input"));
     	
     		for(int i=1;i<=list.size()-1;i++)
     		{
     			WebElement checked = list.get(i);
     			checked.click();
     			
     		}
     		
     	Reporter.log("PAYE tax can be deducted");
     	
   	}
    
    
    public void onlyNiableDeductions() throws InterruptedException
   	{
     		
     		List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='tblDeductions']/tbody/tr[2]/td[11]/div/ul/li/a/input"));
     	
     		for(int i=0;i<=list.size()-1;i++)
    		{
    			
    			if(i==1)
        		{
    				
        			continue;
        		}
    			WebElement checked = list.get(i);
        		checked.click();
        	
    		}
     		
     	Reporter.log("onlyNiableDeductions");
     	
   	}
    
    public void untickAllOption() throws InterruptedException
  	{
    		
    		List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='tblDeductions']/tbody/tr[3]/td[11]/div/ul/li/a/input"));
    	
    		for(int i=0;i<=list.size()-1;i++)
    		{
    			WebElement checked = list.get(i);
    			checked.click();
    			
    		}
    		
    	Reporter.log("All Options untick");
    	
  	}
    
    
    public void niableOnly() throws InterruptedException
  	{
    		
    		List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='tblDeductions']/tbody/tr[3]/td[11]/div/ul/li/a/input"));
    	
    		for(int i=0;i<=list.size()-1;i++)
	    		{
	    			
	    			if(i==1)
	        		{
	    				
	        			continue;
	        		}
	    			WebElement checked = list.get(i);
	        		checked.click();
	        	
	    		}
    		
        	Reporter.log("Niable only");
  	}
    
    public void niableOnly1() throws InterruptedException
  	{
    		
    		List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[1]/li/a/input"));
    	
    		for(int i=0;i<=list.size()-1;i++)
	    		{
    			
    			
	    			
	    			if(i==1)
	        		{
	    				
	        			continue;
	        		}
	    			WebElement checked = list.get(i);
	        		checked.click();
	        	
	    		}
    		
        	Reporter.log("Niable only");
  	}
    
    public void onlyCheckNiable() throws InterruptedException
  	{
    		
    		List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[1]/li/a/input"));
    	
    		for(int i=0;i<=list.size()-1;i++)
	    		{

    			if(i==1)
        		{
    				
        			break;
        		}
    			
    		
	    			
	    			if(i==1)
	        		{
	    				
	        			continue;
	        		}
	    			WebElement checked = list.get(i);
	        		checked.click();
	        	
	    		}
    		
        	Reporter.log("Niable only");
  	}
    
    
    public void onlyTickNIC() throws InterruptedException
  	{
    		
    		List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[1]/li/a/input"));
    	
    		for(int i=0;i<=list.size()-1;i++)
	    		{

    		
	    			
	    			if(i==1)
	        		{
	    				
	        			continue;
	        		}
	    			WebElement checked = list.get(i);
	        		checked.click();
	        	
	    		}
    		
        	Reporter.log("onlyTickNIC");
  	}
    
    public void onlyCheckNiable2() throws InterruptedException
  	{
    		
    		List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[2]/li/a/input"));
    	
    		for(int i=0;i<=list.size()-1;i++)
	    		{

    			if(i==4)
        		{
    				
        			break;
        		}
    			
    		
	    			
	    			if(i==1)
	        		{
	    				
	        			continue;
	        		}
	    			WebElement checked = list.get(i);
	        		checked.click();
	        	
	    		}
    		
        	Reporter.log("Niable only");
  	}
    public void untickNIC() throws InterruptedException
  	{
    		
    		List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[1]/li/a/input"));
    	
    		for(int i=0;i<=list.size()-1;i++)
    		{
    			
    			if(i==1)
    			{
    				WebElement checked = list.get(i);
        			checked.click();
        			break;
    			}
    			
    			
    		}
    		Reporter.log("Untick NIC");
    		}
    
    public void untickNIC2() throws InterruptedException
  	{
    		
    		List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[2]/li/a/input"));
    	
    		for(int i=0;i<=list.size()-1;i++)
    		{
    			
    			if(i==1)
    			{
    				WebElement checked = list.get(i);
        			checked.click();
        			break;
    			}
    			
    			
    		}
    		Reporter.log("Untick NIC");
    		}
    		
    		 public void untickPayeTax() throws InterruptedException
    		  	{
    		    		
    		    		List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[1]/li/a/input"));
    		    	
    		    		for(int i=0;i<=list.size()-1;i++)
    		    		{
    		    			
    		    			if(i==0)
    		    			{
    		    				WebElement checked = list.get(i);
    		        			checked.click();
    		        			break;
    		    			}
    		    			
    		    			
    		    		}
    		    		Reporter.log("Untick Paye Tax");
  	}
    	
    		 public void untickPensionable() throws InterruptedException  	{
 		    		
 		    		List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[1]/li/a/input"));
 		    	
 		    		for(int i=2;i<=list.size()-1;i++)
 		    		{
 		    			
 		    			if(i==4)
 		    			{
 		    				break;
 		    			}
 		    			WebElement checked = list.get(i);
 		        		checked.click();
 		        		
 		        		
 		    			
 		    		}
 		    		Reporter.log("Untick Pensionable");
 		    		}
    		 
    		 
    		 public void untickPensionable2() throws InterruptedException  	{
		    		
		    		List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[3]/li/a/input"));
		    	
		    		for(int i=2;i<=list.size()-1;i++)
		    		{
		    			
		    			WebElement checked = list.get(i);
		        		checked.click();
		        		
		        		
		    			
		    		}
		    		Reporter.log("Untick Pensionable");
		    		}
    		 
    		 public void untickPensionable2Addition() throws InterruptedException  	{
		    		
		    		List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[2]/li/a/input"));
		    	
		    		for(int i=2;i<=list.size()-1;i++)
		    		{
		    			
		    			WebElement checked = list.get(i);
		        		checked.click();
		        		
		        		
		    			
		    		}
		    		Reporter.log("Untick Pensionable");
		    		}
    		 
    		 
 		 	 public void untickTaxEmployeePensionable() throws InterruptedException
 		 		  	{
 		 		    		
 		 		    		List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[1]/li/a/input"));
 		 		    	
 		 		    		for(int i=0;i<=list.size()-1;i++)
 		 		    		{
 		 		    			
 		 		    			if(i==2)
 		 		    			{
 		 		    			WebElement checked = list.get(i);
 		 		        		checked.click();
 		 		        		
 		 		        		break;
 		 		    			}
 		 		        		
 		 		    			
 		 		    			
 		 		    		}	
 		 		    		Reporter.log("Untick Employee Pensionable");
 		 		    		
 		    		
	}
 		 	 
 		 	 public void onlyTickEmployeePensionable() throws InterruptedException
	 		  	{
	 		    		
	 		    		List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[1]/li/a/input"));
	 		    	
	 		    		for(int i=0;i<=list.size()-1;i++)
	 		    		{
	 		    			
	 		    			if(i==2)
	 		        		{
	 		    				
	 		        			continue;
	 		        		}
	 		    			if(i==4)
	 		    			{
	 		    				
	 		    				break;
	 		    			}
	 		    			WebElement checked = list.get(i);
	 		        		checked.click();
	 		        		
	 		        		
	 		        		
	 		    			
	 		    			
	 		    		}	
	 		    		Reporter.log("Only Tick Employee Pensionable");
	 		    		
	    		
}
 		 	 
 		 	 
 		 	 public void onlyTickPensionable() throws InterruptedException
	 		  	{
	 		    		
	 		    		List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[1]/li/a/input"));
	 		    	
	 		    		for(int i=0;i<=list.size()-1;i++)
	 		    		{
	 		    			
	 		    			if(i==2||i==3)
	 		        		{
	 		    				
	 		        			continue;
	 		        		}
	 		    			if(i==4)
	 		    			{
	 		    				
	 		    				break;
	 		    			}
	 		    			WebElement checked = list.get(i);
	 		        		checked.click();
	 		        		
	 		    		}	
	 		    		Reporter.log("Only Tick Employee Pensionable");
	 		    		
	    		
}
 		 	 
 		 	 public void onlyTickPensionable2() throws InterruptedException
	 		  	{
	 		    		
	 		    		List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[2]/li/a/input"));
	 		    	
	 		    		for(int i=0;i<=list.size()-1;i++)
	 		    		{
	 		    			
	 		    			if(i==2||i==3)
	 		        		{
	 		    				
	 		        			continue;
	 		        		}
	 		    			if(i==4)
	 		    			{
	 		    				
	 		    				break;
	 		    			}
	 		    			WebElement checked = list.get(i);
	 		        		checked.click();
	 		        		
	 		    		}	
	 		    		Reporter.log("Only Tick Employee Pensionable");
	 		    		
	    		
}
 		 	 public void onlyTickEmployeePensionNIable() throws InterruptedException
	 		  	{
	 		    		
	 		    		List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[1]/li/a/input"));
	 		    	
	 		    		for(int i=0;i<=list.size()-1;i++)
	 		    		{
	 		    			
	 		    			if(i==2||i==1)
	 		        		{
	 		    				
	 		        			continue;
	 		        		}
	 		    			if(i==4)
	 		    			{
	 		    				break;
	 		    			}
	 		    			WebElement checked = list.get(i);
	 		        		checked.click();
	 		        		
	 		        		
	 		        		
	 		    			
	 		    			
	 		    		}	
	 		    		Reporter.log("Only Tick Employee Pensionable and Niable");
	 		    		
	    		
}
 		
 		 	 public void onlyTickEmployerPensionPayeTax() throws InterruptedException
	 		  	{
	 		    		
	 		    		List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[1]/li/a/input"));
	 		    	
	 		    		for(int i=0;i<=list.size()-1;i++)
	 		    		{
	 		    			
	 		    			if(i==0||i==3)
	 		        		{
	 		    				
	 		        			continue;
	 		        		}
	 		    			
	 		    			if(i==4)
	 		    			{
	 		    				break;
	 		    			}
	 		    			WebElement checked = list.get(i);
	 		        		checked.click();
	 		        		
	 		        	
	 		    			
	 		    		}	
	 		    		Reporter.log("Only Tick Employer Pensionable and PayeTax");
	 		    		
	    		
}
 		 	 
 		 	 public void onlyTickPensionPayeTax() throws InterruptedException
	 		  	{
	 		    		
	 		    		List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[1]/li/a/input"));
	 		    	
	 		    		for(int i=0;i<=list.size()-1;i++)
	 		    		{
	 		    			
	 		    			if(i==0||i==3||i==2)
	 		        		{
	 		    				
	 		        			continue;
	 		        		}
	 		    			
	 		    		
	 		    			WebElement checked = list.get(i);
	 		        		checked.click();
	 		        		
	 		        	
	 		    			
	 		    		}	
	 		    		Reporter.log("onlyTickPensionPayeTax");
	 		    		
	    		
}

 		 	 public void untickAllOptions2() throws InterruptedException  	{
		    		
		    		List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[2]/li/a/input"));
		    	
		    		for(int i=0;i<=list.size()-1;i++)
		    		{
		    			
		    			if(i==4)
		    			{
		    				break;
		    			}
		    			
		    			WebElement checked = list.get(i);
		        		checked.click();
		        		
		        		
		    		}
		    		Reporter.log("Untick All Options");
		    		}
 		 	 
 		 	 
 		 	 
 		 	 
 		 	 

 		 	 public void untickAllOptionsDeduction() throws InterruptedException  	{
		    		
		    		List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='tblDeductions']/tbody/tr[2]/td[4]/div/ul/li/a/input"));
		    	
		    		for(int i=0;i<=list.size()-1;i++)
		    		{
		    		
		    			
		    			WebElement checked = list.get(i);
		        		checked.click();
		        		
		        		
		    		}
		    		Reporter.log("Untick All Options");
		    		}
 		 	 
 		 	 
 		 	 
 		 	 
 		 	 public void untickAllOptions() throws InterruptedException  	{
		    		
		    		List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[1]/li/a/input"));
		    	
		    		for(int i=0;i<=list.size()-1;i++)
		    		{
		    			if(i==4)
		    			{
		    				break;
		    			}
		    			
		    			WebElement checked = list.get(i);
		        		checked.click();
		        		
		        		
		    		}
		    		Reporter.log("Untick  All Options");
		    		}
 		 	 public void untickTaxAndNI() throws InterruptedException
	 		  	{
	 		    		
	 		    		List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[1]/li/a/input"));
	 		    	
	 		    		for(int i=0;i<=list.size()-1;i++)
	 		    		{
	 		    			if(i==2 || i==3||i==4)
	 		        		{
	 		        			
	 		        			break;
	 		        		}
	 		    			
	 		    			WebElement checked = list.get(i);
	 		        		checked.click();
	 		        		
	 		        	
	 		        		
	 		    			
	 		    			
	 		    		}	
	 		    		Reporter.log("Untick PayeTax and NIC");
	 		    		
	    		
}
 		 	 
    		 public void clickEmployeeName()
    		 {
    		    

    				WebElement elem = getWebElement(employeeNameElem);

    				if (elem == null) {
    		    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEmployeeName", "clickEmployeeName failed. Unable to locate object: " + employeeNameElem.toString());

    					Assert.fail("Unable to locate object: " + employeeNameElem.toString());
    		        }

    				elem.click();
    				
    				ExtentReportManager.passStep(m_Driver, "clickEmployeeName");
    			
    				   Reporter.log("Click EmployeeName");
    		    }


    		 
    		 
    public void selectPeriod(String Value)
    {

     	WebElement elem = getWebElement(selectPeriodElem);
		if (elem == null) {
   		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectPeriod", "selectPeriod failed. Unable to locate object: " + selectPeriodElem.toString());

			Assert.fail("Unable to locate object: " + selectPeriodElem.toString());
       }

		elem.sendKeys(Value);
		
		ExtentReportManager.passStep(m_Driver, "selectPeriod");
	
		   Reporter.log("Select Period");
   }		 
    		    
  	
   
    		 public void selectType(String Value)
    		 {
    		    

    		    	WebElement elem = getWebElement(sendPayslip);
    				if (elem == null) {
    		    		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectType", "selectType failed. Unable to locate object: " + sendPayslip.toString());

    					Assert.fail("Unable to locate object: " + sendPayslip.toString());
    		        }

    				elem.sendKeys(Value);
    				
    				ExtentReportManager.passStep(m_Driver, "selectType");
    			
    				   Reporter.log("select main contact");
    		    }

    		 
    		 
    		 public void enterBasicPay(String Value)
    		 {
    		    

    		    	WebElement elem = getWebElement(basicPayElem);
    				if (elem == null) {
    		    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterBasicPay", "enterBasicPay failed. Unable to locate object: " + basicPayElem.toString());

    					Assert.fail("Unable to locate object: " + basicPayElem.toString());
    		        }
                     
    			    elem.clear();
    				elem.sendKeys(Value);
    				
    				ExtentReportManager.passStep(m_Driver, "enterBasicPay");
    			
    				   Reporter.log("Enter basicPay");
    		    }

    		 public void clearBasicPay()
    		 {
    		    

    		    	WebElement elem = getWebElement(basicPayElem);
    				if (elem == null) {
    		    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clearBasicPay", "clearBasicPay failed. Unable to locate object: " + basicPayElem.toString());

    					Assert.fail("Unable to locate object: " + basicPayElem.toString());
    		        }
                     
    			    elem.clear();
    				
    				
    				ExtentReportManager.passStep(m_Driver, "clearBasicPay");
    			
    				   Reporter.log("Enter basicPay");
    		    }
    	
    		 
    		  public void clickEmployeeSalaryDetails() throws InterruptedException
    			{
    		        
    				WebElement elem = getWebElement(employeeSalaryDetails);

    				if (elem == null) {
    		    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEmployeeSalaryDetails", "clickEmployeeSalaryDetails failed. Unable to locate object: " + employeeSalaryDetails.toString());

    					Assert.fail("Unable to locate object: " + employeeSalaryDetails.toString());
    		        }
    				jsExec.executeScript("arguments[0].click();",elem);
    			
    			//	m_Driver.navigate().refresh();
    				
    				//jsExec.executeScript("arguments[0].click();",elem);
    			    Thread.sleep(6000);
    			
    				ExtentReportManager.passStep(m_Driver, "clickEmployeeSalaryDetails");
    				
    				 Reporter.log("Click Emplyee salary details");
    		}
    		  
    		 
    		  public void clickEmployeeSalaryDetails2() throws InterruptedException
  			  {
  		        
  				WebElement elem = getWebElement(employeeSlaryDetailsElem);

  				if (elem == null) {
  		    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEmployeeSalaryDetails2", "clickEmployeeSalaryDetails2 failed. Unable to locate object: " + employeeSlaryDetailsElem.toString());

  					Assert.fail("Unable to locate object: " + employeeSalaryDetails.toString());
  		        }
  				jsExec.executeScript("arguments[0].click();",elem);
  			
  				Thread.sleep(6000);
  				ExtentReportManager.passStep(m_Driver, "clickEmployeeSalaryDetails2");
  				
  				 Reporter.log("Click Emplyee salary details");
  		}
  		  
    		  
    		
}
    		 
  

  
    
