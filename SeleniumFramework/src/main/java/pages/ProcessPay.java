package pages;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import pages.BasePage;
import utilities.reports.ExtentReportManager;

public class ProcessPay extends BasePage {

	public ProcessPay(WebDriver driver) {
		super(driver);
		
	}

    private By threeDots= By.xpath("(//*[@data-toggle='dropdown'])[2]");
    private By threeDots2Elem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[3]/td[14]/div/a");
    private By threeDots3Elem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[4]/td[14]/div/a");
    private By threeDots4Elem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[5]/td[14]/div/a");
    private By threeDots5Elem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[6]/td[14]/div/a");
    
    private By processPay= By.xpath("//*[@class='dropdown-menu dropdown-menu-left']/descendant::li/a[contains(text(),'Process Pay')]");
    private By processPay1=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[2]/td[14]/div/ul/li[3]/a");
    private By processPay2=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']//descendant::ul[2]/li/a[contains(text(),'Pay')]");
    private By processPay3=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']//descendant::ul[3]/li/a[contains(text(),'Pay')]");
    private By processPay4=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']//descendant::ul[4]/li/a[contains(text(),'Pay')]");
    private By processPay5=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']//descendant::ul[5]/li/a[contains(text(),'Pay')]");
	
	private By addMore =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_lnkAddMoreAddition']");
	
	private By applyOn= By.xpath("//*[@id='tblAddition']/descendant::button");
	
	private By applyOnDeduction= By.xpath("//*[@id='tblDeductions']/tbody/tr[2]/td[4]/div/button");

	
	private By applyOn2= By.xpath("//*[@id='tblAddition']/tbody/tr[3]/td[4]/div/button");
	
	private By deductionElem= By.xpath("//*[@id='__tab_ctl00_ctl00_ParentContent_cPH_tbContainer_tpDeduction']");
	
	private By addMoreDeduction=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpDeduction_lnkAddMoreDeduction']");
	
	private By applyOnDeductions=By.xpath("//*[@id='tblDeductions']/descendant::button");
	
	private By selectCodeElem= By.xpath("//*[@id='S-ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl00_ltAdditionAccount']");
	private By selectCodeElem2= By.xpath("//*[@id='S-ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl01_ltAdditionAccount']");
	
	private By descriptionElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl00_txtDescription']");
	private By descriptionElem2= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl01_txtDescription']");
	
	private By amountElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl00_txtAmount']");
	private By amountElem2= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl01_txtAmount']");
	
	private By saveBtn= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSave']");
	
	private By checkBxElem =By.xpath("//*[@id='chAllRTI']");
	
	private By checkBxElem1 =By.xpath("//*[@id='chAllRTI1']");
	private By deletElem =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnDelete']");
	
	private By payeTaxElem =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl00_chkPayeeTax']");
	
	private By employeeNameElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[2]/td[1]/a");
	
	private By sendPayslip= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ddlPaySlipTemplate']");
	
	private By selectPeriodElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPayrollDate']");
	
	private By basicPayElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtBasicPay']");
	
	private By employeeSalaryDetails =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplay_ctl51_ViewEmployeeSalaryDetails']");
	
	private By employeeSlaryDetailsElem= By.xpath("//*[text()='31 Mar 2023']");
	private By employeeSlaryDetailsElem1= By.xpath("//*[text()='31 Mar 2024']");

	private By unitElem= By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_RptrUnitDayType_ctl00_txtUnit10\"]");
	
	private By futurepayElem =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_Checkunit']");
	
	private  By addmoreRateElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_lnkAddMoreUnit']");
	
	
	private By rateChangeElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrUnit_ctl00_txtUnit10Rate']");
	private By rateElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrUnit_ctl00_txtUnit10Rate']");
	private By rateElem1= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrUnit_ctl01_txtUnit10Rate']");
	private By rateElem2= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrUnit_ctl03_txtUnit10Rate']");

	
	private By unitElem1= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrUnit_ctl01_txtUnit10']");
	private By unitElem2= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrUnit_ctl02_txtUnit10']");

	private By unitElem3= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrUnit_ctl03_txtUnit10']");
	
	private By payworkedDescriptionElem1=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrUnit_ctl01_txtUnit10LebelName']");
	
	private By payworkedDescriptionElem2=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrUnit_ctl02_txtUnit10LebelName']");

	private By payworkedDescriptionElem3=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrUnit_ctl03_txtUnit10LebelName']");
 
	private By netPayElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_LinkButtonEx1']");
	
	private By employeeSalaryDetailsWeekly= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplay_ctl52_lnkViewEmployeeSalaryDetails']");

	private By employeeSalaryDetailsFortnightly= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplay_ctl26_lnkViewEmployeeSalaryDetails']");

	private By fourweeklyElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplay_ctl12_lnkViewEmployeeSalaryDetails']");

	  public void clickNetPayCalculator() throws Exception
	    {

			WebElement elem = getWebElement(netPayElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickNetPayCalculator", "clickNetPayCalculator failed. Unable to locate object: " + netPayElem.toString());

				Assert.fail("Unable to locate object: " + netPayElem.toString());
	        }

			elem.click();
			Thread.sleep(3000);
			
			ExtentReportManager.passStep(m_Driver, "clickNetPayCalculator");
		
			   Reporter.log("clickNetPayCalculator");
	    }
	    
    public void click3Dots()
    {

		WebElement elem = getWebElement(threeDots);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "click3Dots", "click3Dots failed. Unable to locate object: " + threeDots.toString());

			Assert.fail("Unable to locate object: " + threeDots.toString());
        }

		elem.click();
		
		ExtentReportManager.passStep(m_Driver, "click3Dots");
	
		   Reporter.log("Click 3 dots");
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
    public void clickProcessPay()
    {
    	
    	WebElement elem = getWebElement(processPay);
    	

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickProcessPay", "clickProcessPay failed. Unable to locate object: " + processPay.toString());

			Assert.fail("Unable to locate object: " + processPay.toString());
        }

		elem.click();
		
		ExtentReportManager.passStep(m_Driver, "clickProcessPay");
	
		   Reporter.log("Click ProcessPay");
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
    public void clickProcessPay2()
    {
    	
    	WebElement elem = getWebElement(processPay2);
    	

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickProcessPay2", "clickProcessPay2 failed. Unable to locate object: " + processPay2.toString());

			Assert.fail("Unable to locate object: " + processPay2.toString());
        }

		elem.click();
		
		ExtentReportManager.passStep(m_Driver, "clickProcessPay2");
	
		   Reporter.log("Click ProcessPay");
    }  
    	
    public void clickProcessPay3()
    {
    	
    	WebElement elem = getWebElement(processPay3);
    	

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickProcessPay3", "clickProcessPay3 failed. Unable to locate object: " + processPay3.toString());

			Assert.fail("Unable to locate object: " + processPay3.toString());
        }

		elem.click();
		
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
    
    public void clickApplyBtn()
    {

		WebElement elem = getWebElement(applyOn);
		

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickApplyBtn", "clickApplyBtn failed. Unable to locate object: " + applyOn.toString());

			Assert.fail("Unable to locate object: " + applyOn.toString());
        }
		elem.click();
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
    
    public void enterAmount(String value)
    {

		WebElement elem = getWebElement(amountElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterAmount", "enterAmount failed. Unable to locate object: " + amountElem.toString());

			Assert.fail("Unable to locate object: " + amountElem.toString());
        }

		elem.sendKeys(value);
		ExtentReportManager.passStep(m_Driver, "enterAmount");
		Reporter.log("Enter Amount");
    }
    
    public void changeAmount(String value)
    {

		WebElement elem = getWebElement(amountElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterAmount", "enterAmount failed. Unable to locate object: " + amountElem.toString());

			Assert.fail("Unable to locate object: " + amountElem.toString());
        }
       elem.clear();
		elem.sendKeys(value);
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
		ExtentReportManager.passStep(m_Driver, "enterAmount2");
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
		Thread.sleep(4000);
		 Reporter.log("Click Save Btn");
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
    		
    		List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[1]/li/a/input"));
    	
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
    public void onlyCheckPayeTaxAndNI() throws InterruptedException
  	{
    		
    		List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[1]/li/a/input"));
    	
    		for(int i=2;i<=list.size()-1;i++)
    		{
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
    
    public void niableOnly3() throws InterruptedException
  	{
    		
    		List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[2]/li/a/input"));
    	
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
    
    public void niableDeductioinOnly() throws InterruptedException
  	{
    		
    		List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[2]/li/a/input"));
    	
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
 		 		    			
 		 		    			WebElement checked = list.get(i);
 		 		        		checked.click();
 		 		        		
 		 		        		i++;
 		 		        	
 		 		    		}	
 		 		    		Reporter.log("Untick Employee Pensionable");
 		 		    		
 		    		
 		 		  	
	}
 		 	             
 		 	             public void untickTaxEmployerPensionable() throws InterruptedException
 	 		 		  	{
 	 		 		    		
 	 		 		    		List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[1]/li/a/input"));
 	 		 		    	
 	 		 		    		for(int i=3;i<=list.size()-1;i++)
 	 		 		    		
 	 		 		    		{
 	 		 		    			
 	 		 		    			WebElement checked = list.get(i);
 	 		 		        		checked.click();
 	 		 		        	
 	 		 		    		}	
 	 		 		    		Reporter.log("Untick Employer Pensionable");
 	 		 		    		
 	 		    		
 	 		 		    		
 	 		 		  	
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
	 		    			WebElement checked = list.get(i);
	 		        		checked.click();
	 		        		
	 		        		
	 		        		
	 		    			
	 		    			
	 		    		}	
	 		    		Reporter.log("Only Tick Employee Pensionable");
	 		
}              
 		 	 
 		 	 public void onlyTickEmployeePensionable1() throws InterruptedException
	 		  	{
	 		    		
	 		    		List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[2]/li/a/input"));
	 		    	
	 		    		for(int i=0;i<=list.size()-1;i++)
	 		    		{
	 		    			
	 		    			if(i==2)
	 		        		{
	 		    				
	 		        			continue;
	 		        		}
	 		    			WebElement checked = list.get(i);
	 		        		checked.click();
	 		        		
	 		        
	 		    		}	
	 		    		Reporter.log("Only Tick Employee Pensionable");
	 		    		
	    		
}
 		 	 public void onlyTickEmployerPensionable() throws InterruptedException
	 		  	{
	 		    		
	 		    		List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[1]/li/a/input"));
	 		    	
	 		    		for(int i=0;i<=list.size()-1;i++)
	 		    		{
	 		    			
	 		    			if(i==3)
	 		        		{
	 		    				
	 		        			continue;
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
	 		    			WebElement checked = list.get(i);
	 		        		checked.click();
	 		        		
	 		        	
	 		    			
	 		    		}	
	 		    		Reporter.log("Only Tick Employer Pensionable and PayeTax");
	 		    		
	    		
}
 		 	 
 		 	 public void onlyTickEmployeePensionPayeTax() throws InterruptedException
	 		  	{
	 		    		
	 		    		List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[1]/li/a/input"));
	 		    	
	 		    		for(int i=0;i<=list.size()-1;i++)
	 		    		{
	 		    			
	 		    			if(i==0||i==2)
	 		        		{
	 		    				
	 		        			continue;
	 		        		}
	 		    			WebElement checked = list.get(i);
	 		        		checked.click();
	 		        		
	 		        	
	 		    			
	 		    		}	
	 		    		Reporter.log("Only Tick Employee Pensionable and PayeTax");
	 		    		
	    		
}
 		 	 
 		 	 public void onlyTickEmployeePensionPayeTax1() throws InterruptedException
	 		  	{
	 		    		
	 		    		List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[2]/li/a/input"));
	 		    	
	 		    		for(int i=0;i<=list.size()-1;i++)
	 		    		{
	 		    			
	 		    			if(i==0||i==2)
	 		        		{
	 		    				
	 		        			continue;
	 		        		}
	 		    			WebElement checked = list.get(i);
	 		        		checked.click();
	 		        		
	 		        	
	 		    			
	 		    		}	
	 		    		Reporter.log("Only Tick Employee Pensionable and PayeTax");
  		
}


 		 	 public void untickAllOptions2() throws InterruptedException  	{
		    		
		    		List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[2]/li/a/input"));
		    	
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
		    			
		    			WebElement checked = list.get(i);
		        		checked.click();
		        		
		        		
		    		}
		    		Reporter.log("Untick All Options");
		    		}
 		 	 public void untickTaxAndNI() throws InterruptedException
	 		  	{
	 		    		
	 		    		List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[1]/li/a/input"));
	 		    	
	 		    		for(int i=0;i<=list.size()-1;i++)
	 		    		{
	 		    			if(i==2 || i==3)
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
    			
    				Thread.sleep(4000);
    				ExtentReportManager.passStep(m_Driver, "clickEmployeeSalaryDetails");
    				
    				 Reporter.log("Click Emplyee salary details");
    		}
    		  
    		  
    		  
    		  public void clickEmployeeSalaryDetailsWeekly() throws InterruptedException
  			{
  		        
  				WebElement elem = getWebElement(employeeSalaryDetailsWeekly);

  				if (elem == null) {
  		    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEmployeeSalaryDetailsWeekly", "clickEmployeeSalaryDetailsWeekly failed. Unable to locate object: " + employeeSalaryDetailsWeekly.toString());

  					Assert.fail("Unable to locate object: " + employeeSalaryDetailsWeekly.toString());
  		        }
  				jsExec.executeScript("arguments[0].click();",elem);
  			
  				Thread.sleep(4000);
  				ExtentReportManager.passStep(m_Driver, "clickEmployeeSalaryDetailsWeekly");
  				
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
  			
  				Thread.sleep(4000);
  				ExtentReportManager.passStep(m_Driver, "clickEmployeeSalaryDetails2");
  				
  				 Reporter.log("Click Emplyee salary details");
  		}
  		  
    		  public void clickEmployeeSalaryDetails3() throws InterruptedException
  			  {
  		        
  				WebElement elem = getWebElement(employeeSlaryDetailsElem1);

  				if (elem == null) {
  		    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEmployeeSalaryDetails2", "clickEmployeeSalaryDetails2 failed. Unable to locate object: " + employeeSlaryDetailsElem1.toString());

  					Assert.fail("Unable to locate object: " + employeeSlaryDetailsElem1.toString());
  		        }
  				jsExec.executeScript("arguments[0].click();",elem);
  			
  				Thread.sleep(4000);
  				ExtentReportManager.passStep(m_Driver, "clickEmployeeSalaryDetails2");
  				
  				 Reporter.log("Click Emplyee salary details");
  		}
  		  
    		  
    		  public void clickEmployeeSalaryDetailsFortnightly() throws InterruptedException
  			  {
  		        
  				WebElement elem = getWebElement(employeeSalaryDetailsFortnightly);

  				if (elem == null) {
  		    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEmployeeSalaryDetailsFortnightly", "clickEmployeeSalaryDetailsFortnightly failed. Unable to locate object: " + employeeSalaryDetailsFortnightly.toString());

  					Assert.fail("Unable to locate object: " + employeeSalaryDetailsFortnightly.toString());
  		        }
  				jsExec.executeScript("arguments[0].click();",elem);
  			
  				Thread.sleep(4000);
  				ExtentReportManager.passStep(m_Driver, "clickEmployeeSalaryDetailsFortnightly");
  				
  				 Reporter.log("Click Emplyee salary details");
  		}
    		  
    		  public void clickEmployeeSalaryDetailsFourWeekly() throws InterruptedException
  			  {
  		        
  				WebElement elem = getWebElement(fourweeklyElem);

  				if (elem == null) {
  		    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEmployeeSalaryDetailsFourWeekly", "clickEmployeeSalaryDetailsFourWeekly failed. Unable to locate object: " + fourweeklyElem.toString());

  					Assert.fail("Unable to locate object: " + fourweeklyElem.toString());
  		        }
  				jsExec.executeScript("arguments[0].click();",elem);
  			
  				Thread.sleep(4000);
  				ExtentReportManager.passStep(m_Driver, "clickEmployeeSalaryDetailsFourWeekly");
  				
  				 Reporter.log("Click Emplyee salary details");
  		}
  		  
    		  
    		  public void enterUnit(String unit) throws Exception
    		    {

    				WebElement elem = getWebElement(unitElem);

    				if (elem == null) {
    		    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterUnit", "enterUnit failed. Unable to locate object: " + unitElem.toString());

    					Assert.fail("Unable to locate object: " + unitElem.toString());
    		        }
                     elem.clear();
    				 elem.sendKeys(unit);
    				
    				 Thread.sleep(1000);
    				ExtentReportManager.passStep(m_Driver, "enterUnit");
    			
    				 Reporter.log("Enter Unit");
    		    }
    	
    		  
    		  
    		  public void applyFuturePay()  {
  		  

  				WebElement elem = getWebElement(futurepayElem);

  				if (elem == null) {
  		    		ExtentReportManager.failStepWithScreenshot(m_Driver, "applyFuturePay", "applyFuturePay failed. Unable to locate object: " + futurepayElem.toString());

  					Assert.fail("Unable to locate object: " + futurepayElem.toString());
  		        }
                elem.click();
  				
  				ExtentReportManager.passStep(m_Driver, "applyFuturePay");
  			
  				 Reporter.log("ApplyFuturePay");
  		    } 		  
    		  
    		  
    		  
    		       public void addMoreRate()  {
    	  		  

    				WebElement elem = getWebElement(addmoreRateElem);

    				if (elem == null) {
    		    		ExtentReportManager.failStepWithScreenshot(m_Driver, "addMoreRate", "addMoreRate failed. Unable to locate object: " + addmoreRateElem.toString());

    					Assert.fail("Unable to locate object: " + addmoreRateElem.toString());
    		        }
                  elem.click();
    				
    				ExtentReportManager.passStep(m_Driver, "addMoreRate");
    			
    				 Reporter.log("Add more Rate");
    		    } 	
    		       
    		   
    		       
    		       
    	    		  public void enterUnit1(String unit)
    	    		    {

    	    				WebElement elem = getWebElement(unitElem1);

    	    				if (elem == null) {
    	    		    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterUnit1", "enterUnit1 failed. Unable to locate object: " + unitElem1.toString());

    	    					Assert.fail("Unable to locate object: " + unitElem1.toString());
    	    		        }
    	                    
    	    				 elem.sendKeys(unit);
    	    				
    	    				ExtentReportManager.passStep(m_Driver, "enterUnit1");
    	    			
    	    				 Reporter.log("Enter Unit");
    	    		    }
    	    	
    	    		  
    	    		  public void enterUnit2(String unit)
  	    		    {

  	    				WebElement elem = getWebElement(unitElem2);

  	    				if (elem == null) {
  	    		    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterUnit2", "enterUnit2 failed. Unable to locate object: " + unitElem2.toString());

  	    					Assert.fail("Unable to locate object: " + unitElem2.toString());
  	    		        }
  	                    
  	    				 elem.sendKeys(unit);
  	    				
  	    				ExtentReportManager.passStep(m_Driver, "enterUnit2");
  	    			
  	    				 Reporter.log("Enter Unit");
  	    		    } 
    	    		  
    	    		  
    	    		  
    	    		  public void enterUnit3(String unit)
    	    		    {

    	    				WebElement elem = getWebElement(unitElem3);

    	    				if (elem == null) {
    	    		    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterUnit3", "enterUnit3 failed. Unable to locate object: " + unitElem3.toString());

    	    					Assert.fail("Unable to locate object: " + unitElem3.toString());
    	    		        }
    	                    
    	    				 elem.sendKeys(unit);
    	    				
    	    				ExtentReportManager.passStep(m_Driver, "enterUnit3");
    	    			
    	    				 Reporter.log("Enter Unit");
    	    		    } 
    	    		  
    	    		  
    	    	      
    	    		  public void enterRate(String rate) throws Exception
    	    		    {

    	    				WebElement elem = getWebElement(rateElem);

    	    				if (elem == null) {
    	    		    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterRate", "enterRate failed. Unable to locate object: " + rateElem.toString());

    	    					Assert.fail("Unable to locate object: " + rateElem.toString());
    	    		        }
    	                     elem.clear();
    	                     
    	    				 elem.sendKeys(rate);
    	    				Thread.sleep(1000);
    	    				ExtentReportManager.passStep(m_Driver, "enterRate");
    	    			
    	    				 Reporter.log("Enter Rate");
    	    		    }
    	
    	    		  
    	    		  public void rateChange(String rate)
  	    		    {

  	    				WebElement elem = getWebElement(rateChangeElem);

  	    				if (elem == null) {
  	    		    		ExtentReportManager.failStepWithScreenshot(m_Driver, "rateChange", "rateChange failed. Unable to locate object: " + rateChangeElem.toString());

  	    					Assert.fail("Unable to locate object: " + rateChangeElem.toString());
  	    		        }
  	                     elem.clear();
  	    				 elem.sendKeys(rate);
  	    				
  	    				ExtentReportManager.passStep(m_Driver, "rateChange");
  	    			
  	    				 Reporter.log("Enter Rate");
  	    		    }
  	
    	    		  
    	    		  public void enterRate1(String rate)
  	    		    {

  	    				WebElement elem = getWebElement(rateElem1);

  	    				if (elem == null) {
  	    		    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterRate1", "enterRate1 failed. Unable to locate object: " + rateElem1.toString());

  	    					Assert.fail("Unable to locate object: " + rateElem1.toString());
  	    		        }
  	                     elem.clear();
  	    				 elem.sendKeys(rate);
  	    				
  	    				ExtentReportManager.passStep(m_Driver, "enterRate1");
  	    			
  	    				 Reporter.log("Enter Rate");
  	    		    }
    	  
    	    		  
    	    		  
    	    		  public void enterRate2(String rate)
  	    		      {

  	    				WebElement elem = getWebElement(rateElem2);

  	    				if (elem == null) {
  	    		    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterRate2", "enterRate2 failed. Unable to locate object: " + rateElem2.toString());

  	    					Assert.fail("Unable to locate object: " + rateElem1.toString());
  	    		        }
  	                     elem.clear();
  	    				 elem.sendKeys(rate);
  	    				
  	    				ExtentReportManager.passStep(m_Driver, "rateElem2");
  	    			
  	    				 Reporter.log("Enter Rate");
 
  	    		      
  	    		      }	    	
    	    		  
    	    		  
    	    		  
   public void payDescription1(String data)
   {
	   
	   WebElement elem = getWebElement(payworkedDescriptionElem1);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "payDescription1", "payDescription1 failed. Unable to locate object: " + payworkedDescriptionElem1.toString());

				Assert.fail("Unable to locate object: " + payworkedDescriptionElem1.toString());
	        }
         
			 elem.sendKeys(data);
			
			ExtentReportManager.passStep(m_Driver, "payDescription1");
		

			Reporter.log("Pay description  "+data); 
	   
   }
  
   public void payDescription2(String data)
   {
	   
		WebElement elem = getWebElement(payworkedDescriptionElem2);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "payDescription2",
					"payDescription2 failed. Unable to locate object: " + payworkedDescriptionElem2.toString());

			Assert.fail("Unable to locate object: " + payworkedDescriptionElem2.toString());
		}

		elem.sendKeys(data);

		ExtentReportManager.passStep(m_Driver, "payDescription2");


		Reporter.log("Pay description  "+data);
	   
   }
   
   
   public void payDescription3(String data)
   {
	   
		WebElement elem = getWebElement(payworkedDescriptionElem3);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "payDescription3",
					"payDescription3 failed. Unable to locate object: " + payworkedDescriptionElem3.toString());

			Assert.fail("Unable to locate object: " + payworkedDescriptionElem3.toString());
		}

		elem.sendKeys(data);

		ExtentReportManager.passStep(m_Driver, "payDescription3");

		Reporter.log("Pay description  "+data);
	   
   }
   
   
   public void clickEditBtn() throws Exception {
	   
	   
	  WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords_ctl02_dvDropDownMenu']/ul/li[1]/a"));
	  elem.click();
	  
	  Thread.sleep(5000);
	  
	  Reporter.log("clickEditBtn");
   }
   
   
   public void clickLeaveBtn() throws Exception {
	   
	   
		  WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords_ctl02_lnkLeaver']"));
		  elem.click();
		  
		  Thread.sleep(5000);
		  
		  Reporter.log("clickLeaveBtn");
	   }
	    
    	
   
   public void clickAddLeaveBtn() throws Exception {
	   
	   
		  WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords_ctl02_LiAddLeave']/a"));
		  elem.click();
		  
		  Thread.sleep(5000);
		  
		  Reporter.log("clickAddLeaveBtn");
	   }
	    
   
   
   public void clickAdditionDeductionBtn() throws Exception {
	   
	   
		  WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords_ctl02_dvDropDownMenu']/ul/li[5]/a"));
		  elem.click();
		  
		  Thread.sleep(5000);
		  
		  Reporter.log("clickAdditionDeductionBtn");
	   }
	    
   
   public void enterHoursRegular(String data) throws Exception {
	   
	   
	   Thread.sleep(3000);
	   WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrUnit_ctl00_txtUnit10']"));
	   
	   
	   
	   elem.sendKeys(data);
	   
	   Reporter.log("enterHoursRegular");
	   
	   
	   
   }
   
}
    		 
  

  
    
