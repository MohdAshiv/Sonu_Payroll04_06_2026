package _2081_RecurringAddition_Deductions_page;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.util.List;

import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;
import pages.BasePage;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

public class EmployeePage extends BasePage {

	public EmployeePage(WebDriver driver) {
		super(driver);
		
		
		
	}

	
	private By clickonEmpNameElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[2]/td[1]/a");
	
	private By additionDeductionTab=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefphRecuringAdditionDeduction']");
	
	private  By frequencyTab =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl00_ddlFrequency']");
	
	private  By frequencyTab1 =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl01_ddlFrequency']");
	
	private By fromDateInput= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl00_txtPeriodApplyFrom']");
	
	private By fromDateInput1= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl01_txtPeriodApplyFrom']");

	private By fromDateDeduction= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpDeduction_rptrDeduction_ctl00_txtPeriodApplyFrom']");
	private By fromDateDeduction1=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpDeduction_rptrDeduction_ctl01_txtPeriodApplyFrom']");
	private By toDateInput= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl00_txtPeriodApplyTo']");
	
	private By toDateInput1= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl01_txtPeriodApplyTo']");
	
	private By toDateDeduction=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpDeduction_rptrDeduction_ctl00_txtPeriodApplyTo']");
	private By toDateDeduction1=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpDeduction_rptrDeduction_ctl01_txtPeriodApplyTo']");
	private By accountCode=By.xpath("//*[@id='S-ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl00_ltAdditionAccount']");
	
	private By accountCode1=By.xpath("//*[@id='S-ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl01_ltAdditionAccount']");
	 
    private By accountCodeDeduction=By.xpath("//*[@id='S-ctl00_ctl00_ParentContent_cPH_tbContainer_tpDeduction_rptrDeduction_ctl00_ltDeductionAccount']");
    private By accountCodeDeduction1=By.xpath("//*[@id='S-ctl00_ctl00_ParentContent_cPH_tbContainer_tpDeduction_rptrDeduction_ctl01_ltDeductionAccount']");
	private By description= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl00_txtDescription']");
	
	private By description1= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl01_txtDescription']");
	private By descriptionDeduction=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpDeduction_rptrDeduction_ctl00_txtDescription']");
	private By descriptionDeduction1=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpDeduction_rptrDeduction_ctl01_txtDescription']");
	private By amountInput =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl00_txtAmount']");
	
	private By amountInput1 =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl01_txtAmount']");
	private By amountDeduction= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpDeduction_rptrDeduction_ctl00_txtAmount']");
	private By amountDeduction1=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpDeduction_rptrDeduction_ctl01_txtAmount']");
	private By saveBtn= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSave']");
	 
	private By clickonEmpNameElem1= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[3]/td[1]/a");
	
	private By addMoreElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_lnkAddMoreAddition']");
	
	private By addMoreDeduction=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpDeduction_lnkAddMoreDeduction']");
	private By deductionTab=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpDeduction_tab']/span/span");
	
	public void Click_clickonEmpName() throws InterruptedException
	{
        
		WebElement elem = getWebElement(clickonEmpNameElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickonEmpName", "Click_clickonEmpName failed. Unable to locate object: " + clickonEmpNameElem.toString());

			Assert.fail("Unable to locate object: " + clickonEmpNameElem.toString());
        }

		elem.click();
		
		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "Click_clickonEmpName");
	
	
		   Reporter.log("Click to Employee name");
	}
	
	public void Click_deductionTab() throws InterruptedException
	{
        
		WebElement elem = getWebElement(deductionTab);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_deductionTab", "Click_deductionTab failed. Unable to locate object: " + deductionTab.toString());

			Assert.fail("Unable to locate object: " + deductionTab.toString());
        }

		elem.click();
		Thread.sleep(1000);
		
		ExtentReportManager.passStep(m_Driver, "Click_deductionTab");
	
	
		   Reporter.log("Click Deduction Tab");
	}
	public void Click_AddMore() throws InterruptedException
	{
        
		WebElement elem = getWebElement(addMoreElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_AddMore", "Click_AddMore failed. Unable to locate object: " + addMoreElem.toString());

			Assert.fail("Unable to locate object: " + clickonEmpNameElem.toString());
        }

		elem.click();
		Thread.sleep(1000);
		
		ExtentReportManager.passStep(m_Driver, "addMoreElem");
	
	
		   Reporter.log("Click to AddMore name");
	}
	
	public void Click_AddMoreDeduction() throws InterruptedException
	{
        
		WebElement elem = getWebElement(addMoreDeduction);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_AddMoreDeduction", "Click_AddMoreDeduction failed. Unable to locate object: " + addMoreDeduction.toString());

			Assert.fail("Unable to locate object: " + addMoreDeduction.toString());
        }

		elem.click();
		Thread.sleep(1000);
		
		ExtentReportManager.passStep(m_Driver, "addMoreDeduction");
	
	
		   Reporter.log("Click to AddMore name");
	}
	
	
	public void Click_clickonEmpName1()
	{
        
		WebElement elem = getWebElement(clickonEmpNameElem1);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickonEmpName1", "Click_clickonEmpName1 failed. Unable to locate object: " + clickonEmpNameElem1.toString());

			Assert.fail("Unable to locate object: " + clickonEmpNameElem1.toString());
        }

		elem.click();
		
		ExtentReportManager.passStep(m_Driver, "clickonEmpNameElem1");
	
	
		   Reporter.log("Click to Employee name");
	}
	
	
	
	public void Enter_Frequency(String value)
	{
        
		WebElement elem = getWebElement(frequencyTab);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Frequency", "Enter_Frequency failed. Unable to locate object: " + frequencyTab.toString());

			
        }

		elem.sendKeys(value);
		
		ExtentReportManager.passStep(m_Driver, "Enter_Frequency");
	
		Reporter.log("Select Frequency ="+value);
	
	}
	
	public void Enter_Frequency1(String value)
	{
        
		WebElement elem = getWebElement(frequencyTab1);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Frequency1", "Enter_Frequency1 failed. Unable to locate object: " + frequencyTab1.toString());

			
        }

		elem.sendKeys(value);
		
		ExtentReportManager.passStep(m_Driver, "Enter_Frequency");
	
		Reporter.log("Select Frequency ="+value);
	
	}
	
	
	public void Enter_FromDate(String value) throws InterruptedException
 	{
 		
 		WebElement elem= getWebElement(fromDateInput);
 		
 		
 		for(int i=0;i<10;i++)
 		{
 		elem.sendKeys(Keys.BACK_SPACE);
 		}
 		Thread.sleep(1000);
 		
 		elem.sendKeys(value);


		m_Driver.findElement(By.xpath("//*[@id='tblAddition']/tbody/tr[1]/th[2]")).click();
	    Thread.sleep(1000);
	    Reporter.log("Select From Date ="+value);
}
	
	public void Enter_FromDate1(String value) throws InterruptedException
 	{
 		
 		WebElement elem= getWebElement(fromDateInput1);
 		
 		for(int i=0;i<10;i++)
 		{
 		elem.sendKeys(Keys.BACK_SPACE);
 		}
 		Thread.sleep(1000);
 		
 		elem.sendKeys(value);


		m_Driver.findElement(By.xpath("//*[@id='tblAddition']/tbody/tr[1]/th[2]")).click();
	    Thread.sleep(1000);
	    Reporter.log("Select From Date ="+value);
}
	
	public void Enter_FromDateDeduction(String value) throws InterruptedException
 	{
 		
 		WebElement elem= getWebElement(fromDateDeduction);
 		
 		
 	
 		for(int i=0;i<10;i++)
 		{
 		elem.sendKeys(Keys.BACK_SPACE);
 		}
 		Thread.sleep(1000);
 		
 		elem.sendKeys(value);


		m_Driver.findElement(By.xpath("//*[@id='tblDeductions']/tbody/tr[1]/th[3]")).click();
	    Thread.sleep(1000);
	    Reporter.log("Select From Date ="+value);
}
	public void Enter_FromDateDeduction1(String value) throws InterruptedException
 	{
 		
 		WebElement elem= getWebElement(fromDateDeduction1);
 		
 		
 	
 		for(int i=0;i<10;i++)
 		{
 		elem.sendKeys(Keys.BACK_SPACE);
 		}
 		Thread.sleep(1000);
 		
 		elem.sendKeys(value);


		m_Driver.findElement(By.xpath("//*[@id='tblDeductions']/tbody/tr[1]/th[3]")).click();
	    Thread.sleep(1000);
	    Reporter.log("Select From Date ="+value);
}
	
	
	public void Enter_toDate(String value) throws InterruptedException
 	{
 		
 		WebElement elem= getWebElement(toDateInput);
 		
 		for(int i=0;i<10;i++)
 		{
 		elem.sendKeys(Keys.BACK_SPACE);
 		}
 		Thread.sleep(1000);
 		
 		elem.sendKeys(value);

 		
 		m_Driver.findElement(By.xpath("//*[@id='tblAddition']/tbody/tr[1]/th[2]")).click();
 		Thread.sleep(1000);
 		 Reporter.log("Select To Date ="+value);
}
	
	
	public void Enter_toDate1(String value) throws InterruptedException
 	{
 		
 		WebElement elem= getWebElement(toDateInput1);
 		
 		for(int i=0;i<10;i++)
 		{
 		elem.sendKeys(Keys.BACK_SPACE);
 		}
 		Thread.sleep(1000);
 		
 		elem.sendKeys(value);

 		
 		m_Driver.findElement(By.xpath("//*[@id='tblAddition']/tbody/tr[1]/th[2]")).click();
 		Thread.sleep(1000);
 		 Reporter.log("Select To Date ="+value);
}
	
	
	public void Enter_toDateDeduction(String value) throws InterruptedException
 	{
 		
 		WebElement elem= getWebElement(toDateDeduction);
 		
 		for(int i=0;i<10;i++)
 		{
 		elem.sendKeys(Keys.BACK_SPACE);
 		}
 		Thread.sleep(1000);
 		
 		elem.sendKeys(value);

 		
 		m_Driver.findElement(By.xpath("//*[@id='tblDeductions']/tbody/tr[1]/th[3]")).click();
 		Thread.sleep(1000);
 		 Reporter.log("Select To Date ="+value);
}
	
	public void Enter_toDateDeduction1(String value) throws InterruptedException
 	{
 		
 		WebElement elem= getWebElement(toDateDeduction1);
 		
 		for(int i=0;i<10;i++)
 		{
 		elem.sendKeys(Keys.BACK_SPACE);
 		}
 		Thread.sleep(1000);
 		
 		elem.sendKeys(value);

 		
 		m_Driver.findElement(By.xpath("//*[@id='tblDeductions']/tbody/tr[1]/th[3]")).click();
 		Thread.sleep(1000);
 		 Reporter.log("Select To Date ="+value);
}
	public void Enter_AcountCode(String value)
	{
        
		WebElement elem = getWebElement(accountCode);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_AcountCode", "Enter_AcountCode failed. Unable to locate object: " + accountCode.toString());

			
        }

		elem.sendKeys(value);
		
		ExtentReportManager.passStep(m_Driver, "Enter_AcountCode");
	
		 Reporter.log("Select the Acount Code ="+value);
	}
	public void Enter_AcountCode1(String value)
	{
        
		WebElement elem = getWebElement(accountCode1);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_AcountCode1", "Enter_AcountCode1 failed. Unable to locate object: " + accountCode1.toString());

			
        }

		elem.sendKeys(value);
		
		ExtentReportManager.passStep(m_Driver, "Enter_AcountCode1");
	
		 Reporter.log("Select the Acount Code ="+value);
	}
	
	public void Enter_AcountCodeDeduction(String value)
	{
        
		WebElement elem = getWebElement(accountCodeDeduction);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_AcountCodeDeduction", "Enter_AcountCodeDeduction failed. Unable to locate object: " + accountCodeDeduction.toString());

			
        }

		elem.sendKeys(value);
		
		ExtentReportManager.passStep(m_Driver, "Enter_AcountCodeDeduction");
	
		 Reporter.log("Select the Acount Code ="+value);
	}
	
	public void Enter_AcountCodeDeduction1(String value)
	{
        
		WebElement elem = getWebElement(accountCodeDeduction1);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_AcountCodeDeduction1", "Enter_AcountCodeDeduction1 failed. Unable to locate object: " + accountCodeDeduction1.toString());

			
        }

		elem.sendKeys(value);
		
		ExtentReportManager.passStep(m_Driver, "Enter_AcountCodeDeduction1");
	
		 Reporter.log("Select the Acount Code ="+value);
	}
	
	public void Enter_description(String value) throws InterruptedException
	{
        
		WebElement elem = getWebElement(description);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_description", "Enter_description failed. Unable to locate object: " + description.toString());

			Assert.fail("Unable to locate object: " + description.toString());
        }

		elem.sendKeys(value);
		
		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "Enter_description");
	
		 Reporter.log("Enter Description ="+value);
	}
	
	public void Enter_description1(String value) throws InterruptedException
	{
        
		WebElement elem = getWebElement(description1);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_description1", "Enter_description1 failed. Unable to locate object: " + description1.toString());

			Assert.fail("Unable to locate object: " + description.toString());
        }

		elem.sendKeys(value);
		
		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "Enter_description1");
	
		 Reporter.log("Enter Description ="+value);
	}
	
	public void Enter_descriptionDeduction(String value) throws InterruptedException
	{
        
		WebElement elem = getWebElement(descriptionDeduction);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_descriptionDeduction", "Enter_descriptionDeduction failed. Unable to locate object: " + descriptionDeduction.toString());

			Assert.fail("Unable to locate object: " + descriptionDeduction.toString());
        }

		elem.sendKeys(value);
		
		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "Enter_descriptionDeduction");
	
		 Reporter.log("Enter Description ="+value);
	}
	
	public void Enter_descriptionDeduction1(String value) throws InterruptedException
	{
        
		WebElement elem = getWebElement(descriptionDeduction1);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_descriptionDeduction1", "Enter_descriptionDeduction1 failed. Unable to locate object: " + descriptionDeduction1.toString());

			Assert.fail("Unable to locate object: " + descriptionDeduction1.toString());
        }

		elem.sendKeys(value);
		
		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "Enter_descriptionDeduction1");
	
		 Reporter.log("Enter Description ="+value);
	}
	
	public void Enter_Amount(String value)
	{
        
	
		WebElement elem = getWebElement(amountInput);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Amount", "Enter_Amount failed. Unable to locate object: " + amountInput.toString());

			Assert.fail("Unable to locate object: " + amountInput.toString());
        }
		
	

		//jsExec.executeScript("arguments[0].scrollIntoView();",elem);

		elem.sendKeys(value);
		
		ExtentReportManager.passStep(m_Driver, "Enter_Amount");
	
		 Reporter.log("Enter Amount ="+value);
	}
	
	public void Enter_Amount1(String value)
	{
        
	
		WebElement elem = getWebElement(amountInput1);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Amount1", "Enter_Amount1 failed. Unable to locate object: " + amountInput1.toString());

			Assert.fail("Unable to locate object: " + amountInput1.toString());
		}
           elem.sendKeys(value);
		
		ExtentReportManager.passStep(m_Driver, "Enter_Amount1");
	
		 Reporter.log("Enter Amount ="+value);
		
        }
		
		public void Enter_AmountDeduction(String value)
		{
	        
		
			WebElement elem = getWebElement(amountDeduction);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_AmountDeduction", "Enter_AmountDeduction failed. Unable to locate object: " + amountDeduction.toString());

				Assert.fail("Unable to locate object: " + amountDeduction.toString());
	        }

		elem.sendKeys(value);
		
		ExtentReportManager.passStep(m_Driver, "Enter_AmountDeduction");
	
		 Reporter.log("Enter Amount ="+value);
	}
		
		public void Enter_AmountDeduction1(String value)
		{
	        
		
			WebElement elem = getWebElement(amountDeduction1);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_AmountDeduction1", "Enter_AmountDeduction1 failed. Unable to locate object: " + amountDeduction1.toString());

				Assert.fail("Unable to locate object: " + amountDeduction.toString());
	        }
	

		//jsExec.executeScript("arguments[0].scrollIntoView();",elem);

		elem.sendKeys(value);
		
		ExtentReportManager.passStep(m_Driver, "Enter_AmountDeduction1");
	
		 Reporter.log("Enter Amount ="+value);
	}
	
	public void Click_ViewAditionDeduction() throws InterruptedException
	{
        
		WebElement elem = getWebElement(additionDeductionTab);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ViewAditionDeduction", "Click_ViewAditionDeduction failed. Unable to locate object: " + clickonEmpNameElem.toString());

			Assert.fail("Unable to locate object: " + clickonEmpNameElem.toString());
        }

		elem.click();
		Thread.sleep(1000);
		
		ExtentReportManager.passStep(m_Driver, "Click_ViewAditionDeduction");
	
		 Reporter.log("Click View Addition Detuction");
	
}

	public void Click_ApplyOn() throws InterruptedException
	{
		
		 WebElement elem = m_Driver.findElement(By.xpath("//*[@id='tblAddition']/tbody/tr[2]/td[7]/div/button"));
		 
		 elem.click();
		 
		 Thread.sleep(100);
		  List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='dropdown-menu dropdown-menu-left']/li/a/input"));
			 
	       for(int i=0;i<=3;i++)
	       {
	    	   List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='dropdown-menu dropdown-menu-left']/li/a/input"));
	    	   
	   
	    	 WebElement data = list1.get(i);
	    	 data.click();
	    	 
	    	   
	       }
		 Thread.sleep(1000);
		 
		 Reporter.log("Click Apply On");

	}
	
	public void Click_ApplyOnDeduction() throws InterruptedException
	{
		
		 WebElement elem = m_Driver.findElement(By.xpath("//*[@id='tblDeductions']/tbody/tr[2]/td[11]/div/button"));
		 
		 elem.click();
		  Thread.sleep(1000);
       List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='dropdown-menu dropdown-menu-left']/li/a/input"));
		 
       for(int i=4;i<=list.size()-1;i++)
       {
    	   List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='dropdown-menu dropdown-menu-left']/li/a/input"));
    	   
   
    	 WebElement data = list1.get(i);
    	 data.click();
    	 
    	   
       }
         
    
		 Thread.sleep(1000);
		 
		 Reporter.log("Click Apply On");

	}
	
	public void Click_ApplyOn1() throws InterruptedException
	{
		
		 WebElement elem = m_Driver.findElement(By.xpath("//*[@id='tblAddition']/tbody/tr[3]/td[7]/div/button"));
		 
		 elem.click();
		 
		 Thread.sleep(1000);
         WebElement elem1 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl01_chkPayeeTax']"));
		 
         
        
		 elem1.click();
		 Thread.sleep(1000);
		 
		 Reporter.log("Click Apply On");

	}
	
	public void Click_SaveBtn() throws InterruptedException
	{
        
		WebElement elem = getWebElement(saveBtn);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SavaBtn", "Click_SavaBtn failed. Unable to locate object: " + saveBtn.toString());

			Assert.fail("Unable to locate object: " + saveBtn.toString());
        }
		jsExec.executeScript("arguments[0].click();",elem);
	
		
		ExtentReportManager.passStep(m_Driver, "Click_SavaBtn");
		Thread.sleep(100);
		 Reporter.log("Click Save Btn");
	
		
	}
	
	public void Click_Savedata() throws InterruptedException
	{
        
		WebElement elem = getWebElement(saveBtn);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SavaBtn", "Click_SavaBtn failed. Unable to locate object: " + saveBtn.toString());

			Assert.fail("Unable to locate object: " + saveBtn.toString());
        }
		 elem.click();
		 
		Thread.sleep(1000);
	
		
		ExtentReportManager.passStep(m_Driver, "Click_SavaBtn");
		 Reporter.log("Click Save Btn");
	
		
	}
	
	public void verifyRecuringaddition(String expecteddata)
	{
		String actualdata = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl00_txtAmount']")).getAttribute("value");
		 
	         System.out.println(actualdata+" = Addition recurring");
		    assertEquals(actualdata,expecteddata );
		    Reporter.log("Verify Addition Bonous");
		    utilities.TakeScreenshot.Getscreenshot("TC035_ system is able to add Bonous", "2081", m_Driver);
	}
	
	public void Delet_Addition() throws InterruptedException
	{
		
	   WebElement elem = m_Driver.findElement(By.xpath("//*[@id='chAllRTI']"));
       elem.click();
       
       Thread.sleep(1000);
       WebElement elem1 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnDelete']"));
       elem1.click();
       m_Driver.switchTo().alert().accept();
       Thread.sleep(2000);
       Reporter.log("Delet Addition Bonus");
	}
	
	public void Delet_Deduction() throws InterruptedException
	{
		
	   WebElement elem = m_Driver.findElement(By.xpath("//*[@id='chAllRTI1']"));
       elem.click();
       
       Thread.sleep(1000);
       WebElement elem1 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnDelete']"));
       elem1.click();
       m_Driver.switchTo().alert().accept();
       Thread.sleep(2000);
       Reporter.log("Delet Addition Bonus");
	}
	
	public void Select_TaxYear(String value) throws InterruptedException
	{  
		  WebElement elem = m_Driver.findElement(By.xpath("//SELECT[@id='ctl00_ctl00_ParentContent_ddlTaxYears']"));
		
		  Select sel= new Select(elem);
		  sel.selectByVisibleText(value);
		  Thread.sleep(1000);
		  Reporter.log("Select Taxyear = "+value);
	
}
	
	  public void GotoProcessPay() throws InterruptedException
	  {
		   WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[2]/td[15]/div"));
		    elem.click();
		    
		    WebElement elem2 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[2]/td[15]/div/ul/li[3]/a"));
		    elem2.click();
		    Thread.sleep(2000);
		  
		    Reporter.log("Click Process Pay");
		  
	  }
	  
	  public void GotoProcessPayPage() throws InterruptedException
	  {
		   WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[2]/td[15]/div"));
		    elem.click();
		    
		    WebElement elem2 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[2]/td[15]/div/ul/li[2]/a"));
		    elem2.click();
		    Thread.sleep(2000);
		  
		    Reporter.log("Click Process Pay");
		  
	  }
}