package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import pages.BasePage;
import utilities.reports.ExtentReportManager;

public class Recurring extends BasePage {

	public Recurring(WebDriver driver) {
		super(driver);
	
	}

	private  By frequencyTab =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl00_ddlFrequency']");

	private  By frequencyTab1 =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl01_ddlFrequency']");

	private  By frequencyTab2 =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl02_ddlFrequency']");

	private By fromDateInput= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl00_txtPeriodApplyFrom']");

	private By fromDateInput1= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl01_txtPeriodApplyFrom']");

	private By fromDateInput2= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl02_txtPeriodApplyFrom']");

	private By accountCode=By.xpath("//*[@id='S-ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl00_ltAdditionAccount']");

	private By accountCode1=By.xpath("//*[@id='S-ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl01_ltAdditionAccount']");

	private By accountCode2=By.xpath("//*[@id='S-ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl02_ltAdditionAccount']");

	private By description= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl00_txtDescription']");

	private By description1= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl01_txtDescription']");

	private By description2= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl02_txtDescription']");

	private By amountInput =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl00_txtAmount']");
	
	private By amountInput1 =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl01_txtAmount']");

	private By amountInput2 =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl02_txtAmount']");

	//private By aoeElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[2]/td[15]/div/ul/li[5]/a");
	 
	private By aoeElem=By.linkText("Additions / Deductions / AOE");

	 
	private By saveBtnElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSave']");
	
	
	private By deductionTab=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpDeduction_tab']/span/span");

	private By fromDateDeduction= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpDeduction_rptrDeduction_ctl00_txtPeriodApplyFrom']");
     
	private By  toDateDeduction= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpDeduction_rptrDeduction_ctl00_txtPeriodApplyTo']");

	private By  toDateDeduction1= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpDeduction_rptrDeduction_ctl01_txtPeriodApplyTo']");

    private By accountCodeDeduction=By.xpath("//*[@id='S-ctl00_ctl00_ParentContent_cPH_tbContainer_tpDeduction_rptrDeduction_ctl00_ltDeductionAccount']");

	private By descriptionDeduction=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpDeduction_rptrDeduction_ctl00_txtDescription']");

	private By amountDeduction= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpDeduction_rptrDeduction_ctl00_txtAmount']");

	
	private By addMoreDeduction=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpDeduction_lnkAddMoreDeduction']");

	private By fromDateDeduction1=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpDeduction_rptrDeduction_ctl01_txtPeriodApplyFrom']");

    private By accountCodeDeduction1=By.xpath("//*[@id='S-ctl00_ctl00_ParentContent_cPH_tbContainer_tpDeduction_rptrDeduction_ctl01_ltDeductionAccount']");

	private By descriptionDeduction1=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpDeduction_rptrDeduction_ctl01_txtDescription']");

	private By amountDeduction1=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpDeduction_rptrDeduction_ctl01_txtAmount']");

	private By toDateInput= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl00_txtPeriodApplyTo']");

	private By toDateInput1= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl01_txtPeriodApplyTo']");

	public void enterFrequency(String value) throws Exception
	{
        
		WebElement elem = getWebElement(frequencyTab);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Frequency", "Enter_Frequency failed. Unable to locate object: " + frequencyTab.toString());

			
        }

		
		elem.sendKeys(value);
		
		ExtentReportManager.passStep(m_Driver, "Enter_Frequency");
	
		Reporter.log("Select Frequency ="+value);
	
	}
	
	public void enterFromDate(String value) throws InterruptedException
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
	
	public void enterAcountCode(String value)
	{
        
		WebElement elem = getWebElement(accountCode);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_AcountCode", "Enter_AcountCode failed. Unable to locate object: " + accountCode.toString());

			
        }

		elem.sendKeys(value);
		
		ExtentReportManager.passStep(m_Driver, "Enter_AcountCode");
	
		 Reporter.log("Select the Acount Code ="+value);
	}

	
	public void enterdescription(String value) throws InterruptedException
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
	
	public void enterAmount(String value)
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
	
	public void changeAmount(String value)
	{
        
	
		WebElement elem = getWebElement(amountInput);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Amount", "Enter_Amount failed. Unable to locate object: " + amountInput.toString());

			Assert.fail("Unable to locate object: " + amountInput.toString());
        }
		
        elem.clear();
		elem.sendKeys(value);
		
		ExtentReportManager.passStep(m_Driver, "Enter_Amount");
	
		Reporter.log("Enter Amount ="+value);
	}
	
	public void clickAdditionDeductions() throws InterruptedException
	{
        
		WebElement elem = getWebElement(aoeElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickAoe", "clickAoe failed. Unable to locate object: " + aoeElem.toString());

			Assert.fail("Unable to locate object: " + aoeElem.toString());
        }

		elem.click();
		
		Thread.sleep(1000);
		ExtentReportManager.passStep(m_Driver, "clickAoe");
	
		 Reporter.log("Click AoE");
	}
	
	
	public void clickSaveBtn() throws InterruptedException
	{
        
		WebElement elem = getWebElement(saveBtnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickSaveBtn", "clickSaveBtn failed. Unable to locate object: " + saveBtnElem.toString());

			Assert.fail("Unable to locate object: " + saveBtnElem.toString());
        }
		Thread.sleep(1000);
		elem.click();
		
	
		ExtentReportManager.passStep(m_Driver, "clickSaveBtn");
	
		 Reporter.log("Click SaveBtn");
	}
	
	public void enterFrequency1(String value)
	{
        
		WebElement elem = getWebElement(frequencyTab1);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterFrequency1", "enterFrequency1 failed. Unable to locate object: " + frequencyTab1.toString());

			
        }

		elem.sendKeys(value);
		
		ExtentReportManager.passStep(m_Driver, "enterFrequency1");
	
		Reporter.log("Select Frequency ="+value);
	
	}
	
	public void enterFrequency2(String value)
	{
        
		WebElement elem = getWebElement(frequencyTab2);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterFrequency2", "enterFrequency2 failed. Unable to locate object: " + frequencyTab2.toString());

			
        }

		elem.sendKeys(value);
		
		ExtentReportManager.passStep(m_Driver, "enterFrequency2");
	
		Reporter.log("Select Frequency ="+value);
	
	}
	public void enterFromDate1(String value) throws InterruptedException
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
	
	public void enterFromDate2(String value) throws InterruptedException
 	{
 		
 		WebElement elem= getWebElement(fromDateInput2);
 		
 		for(int i=0;i<10;i++)
 		{
 		elem.sendKeys(Keys.BACK_SPACE);
 		}
 		Thread.sleep(1000);
 		
 		elem.sendKeys(value);


		m_Driver.findElement(By.xpath("//*[@id='tblAddition']/tbody/tr[1]/th[1]")).click();
	    Thread.sleep(1000);
	    Reporter.log("Select From Date ="+value);
}
	
	public void enterAcountCode1(String value)
	{
        
		WebElement elem = getWebElement(accountCode1);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterAcountCode1", "enterAcountCode1 failed. Unable to locate object: " + accountCode1.toString());

			
        }

		elem.sendKeys(value);
		
		ExtentReportManager.passStep(m_Driver, "enterAcountCode1");
	
		 Reporter.log("Select the Acount Code ="+value);
	}
	
	public void enterAcountCode2(String value)
	{
        
		WebElement elem = getWebElement(accountCode2);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterAcountCode2", "enterAcountCode2 failed. Unable to locate object: " + accountCode2.toString());

        }

		elem.sendKeys(value);
		
		ExtentReportManager.passStep(m_Driver, "enterAcountCode2");
	
		 Reporter.log("Select the Acount Code ="+value);
	}
	public void enterDescription1(String value) throws InterruptedException
	{
        
		WebElement elem = getWebElement(description1);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterDescription1", "enterDescription1 failed. Unable to locate object: " + description1.toString());

			Assert.fail("Unable to locate object: " + description1.toString());
        }

		elem.sendKeys(value);
		
		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "enterDescription1");
	
		 Reporter.log("Enter Description ="+value);
	}
	
	public void enterDescription2(String value) throws InterruptedException
	{
        
		WebElement elem = getWebElement(description2);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterDescription2", "enterDescription2 failed. Unable to locate object: " + description2.toString());

			Assert.fail("Unable to locate object: " + description2.toString());
        }

		elem.sendKeys(value);
		
		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "enterDescription2");
	
		 Reporter.log("Enter Description ="+value);
	}
	public void enterAmount1(String value)
	{
        
	
		WebElement elem = getWebElement(amountInput1);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterAmount1", "enterAmount1 failed. Unable to locate object: " + amountInput1.toString());

			Assert.fail("Unable to locate object: " + amountInput1.toString());
		}
           elem.sendKeys(value);
		
		ExtentReportManager.passStep(m_Driver, "enterAmount1");
	
		 Reporter.log("Enter Amount ="+value);
		
        }
	
	public void enterAmount2(String value)
	{
        
	
		WebElement elem = getWebElement(amountInput2);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterAmount2", "enterAmount2 failed. Unable to locate object: " + amountInput2.toString());

			Assert.fail("Unable to locate object: " + amountInput2.toString());
		}
           elem.sendKeys(value);
		
		ExtentReportManager.passStep(m_Driver, "enterAmount2");
	
		 Reporter.log("Enter Amount ="+value);
		
        }
	public void applyOnBtn()
	{
		 WebElement elem = m_Driver.findElement(By.xpath("//*[@id='tblAddition']/tbody/tr[2]/td[7]/div/button"));
		
		  elem.click();
		  
		  Reporter.log("Click Apply On Btn");
	
	}
	   
	public void applyOnBtn1()
	{
		 WebElement elem = m_Driver.findElement(By.xpath("//*[@id='tblAddition']/tbody/tr[3]/td[7]/div/button"));
		
		  elem.click();
		  
		  Reporter.log("Click Apply On Btn");
	}
	
	public void applyOnBtn2()
	{
		 WebElement elem = m_Driver.findElement(By.xpath("//*[@id='tblAddition']/tbody/tr[4]/td[7]/div/button"));
		
		  elem.click();
		  
		  Reporter.log("Click Apply On Btn");
	}
	
	public void applyOnBtndeduction()
	{
		 WebElement elem = m_Driver.findElement(By.xpath("//*[@id='tblDeductions']/tbody/tr[2]/td[11]/div"));
		
		  elem.click();
		  
		  Reporter.log("Click Apply On Btn");
	}
	
	public void applyOnBtndeduction1()
	{
		 WebElement elem = m_Driver.findElement(By.xpath("//*[@id='tblDeductions']/tbody/tr[3]/td[11]/div/button"));
		
		  elem.click();
		  
		  Reporter.log("Click Apply On Btn");
	}
	
	public void clickdeductionTab() throws InterruptedException
	{
        
		WebElement elem = getWebElement(deductionTab);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickdeductionTab", "clickdeductionTab failed. Unable to locate object: " + deductionTab.toString());

			Assert.fail("Unable to locate object: " + deductionTab.toString());
        }

		elem.click();
		Thread.sleep(1000);
		
		ExtentReportManager.passStep(m_Driver, "clickdeductionTab");
	
	
		   Reporter.log("Click Deduction Tab");
	}
	
	public void enterFromDateDeduction(String value) throws InterruptedException
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
	
	public void enterToDateDeduction(String value) throws InterruptedException
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
	    Reporter.log("Select From Date ="+value);
}
	
	public void enterToDateDeduction1(String value) throws InterruptedException
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
	    Reporter.log("Select From Date ="+value);
}
	
	public void enterFromDateDeduction1(String value) throws InterruptedException
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
	
	
	public void enterAcountCodeDeduction(String value)
	{
        
		WebElement elem = getWebElement(accountCodeDeduction);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterAcountCodeDeduction", "enterAcountCodeDeduction failed. Unable to locate object: " + accountCodeDeduction.toString());

			
        }

		elem.sendKeys(value);
		
		ExtentReportManager.passStep(m_Driver, "enterAcountCodeDeduction");
	
		 Reporter.log("Select the Acount Code ="+value);
	}
	
	
	public void enterAcountCodeDeduction1(String value)
	{
        
		WebElement elem = getWebElement(accountCodeDeduction1);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterAcountCodeDeduction1", "enterAcountCodeDeduction1 failed. Unable to locate object: " + accountCodeDeduction1.toString());

			
        }

		elem.sendKeys(value);
		
		ExtentReportManager.passStep(m_Driver, "enterAcountCodeDeduction1");
	
		 Reporter.log("Select the Acount Code ="+value);
	}
	
	
	
	
	public void enterDescriptionDeduction(String value) throws InterruptedException
	{
        
		WebElement elem = getWebElement(descriptionDeduction);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterDescriptionDeduction", "enterDescriptionDeduction failed. Unable to locate object: " + descriptionDeduction.toString());

			Assert.fail("Unable to locate object: " + descriptionDeduction.toString());
        }

		elem.sendKeys(value);
		
		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "enterDescriptionDeduction");
	
		 Reporter.log("Enter Description ="+value);
	}
	
	public void enterDescriptionDeduction1(String value) throws InterruptedException
	{
        
		WebElement elem = getWebElement(descriptionDeduction1);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterDescriptionDeduction", "enterDescriptionDeduction failed. Unable to locate object: " + descriptionDeduction1.toString());

			Assert.fail("Unable to locate object: " + descriptionDeduction1.toString());
        }

		elem.sendKeys(value);
		
		Thread.sleep(2000);
		ExtentReportManager.passStep(m_Driver, "enterDescriptionDeduction1");
	
		 Reporter.log("Enter Description ="+value);
	}
	
	public void enterAmountDeduction(String value)
	{
        
	
		WebElement elem = getWebElement(amountDeduction);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterAmountDeduction", "enterAmountDeduction failed. Unable to locate object: " + amountDeduction.toString());

			Assert.fail("Unable to locate object: " + amountDeduction.toString());
        }

	elem.sendKeys(value);
	
	ExtentReportManager.passStep(m_Driver, "enterAmountDeduction");

	 Reporter.log("Enter Amount ="+value);
}
	
	
	public void enterAmountDeduction1(String value)
	{
        
	
		WebElement elem = getWebElement(amountDeduction1);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "enterAmountDeduction1", "enterAmountDeduction1 failed. Unable to locate object: " + amountDeduction1.toString());

			Assert.fail("Unable to locate object: " + amountDeduction1.toString());
        }

	elem.sendKeys(value);
	
	ExtentReportManager.passStep(m_Driver, "enterAmountDeduction1");

	 Reporter.log("Enter Amount ="+value);
}
	
	
	public void clickAddMoreDeduction() throws InterruptedException
	{
        
		WebElement elem = getWebElement(addMoreDeduction);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickAddMoreDeduction", "clickAddMoreDeduction failed. Unable to locate object: " + addMoreDeduction.toString());

			Assert.fail("Unable to locate object: " + addMoreDeduction.toString());
        }

		elem.click();
		Thread.sleep(1000);
		
		ExtentReportManager.passStep(m_Driver, "clickAddMoreDeduction");
	
	
		   Reporter.log("Click to AddMore name");
	}

}
