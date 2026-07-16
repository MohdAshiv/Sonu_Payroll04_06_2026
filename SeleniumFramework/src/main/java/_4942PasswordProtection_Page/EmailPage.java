package _4942PasswordProtection_Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import pages.BasePage;
import utilities.reports.ExtentReportManager;

public class EmailPage extends BasePage {

	public EmailPage(WebDriver driver) {
		super(driver);
	
	}
		

	    private By emailPayslip = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_Lnkbtnemail']");
		
		private By selecttype=By.xpath("//*[@id='EmailType']");
		
		private By selectPeriodEndDate=By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPayrollDate']");
		
		private By selectTaxYear=By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlTaxYears']");

		private By sendBtn =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']");
		
		private By dropIcon= By.xpath("//*[@id='aspnetForm']/main/header/div/div[2]/ul/li[4]/a");
		
		private By emailLog= By.xpath("//*[@id='ctl00_ctl00_ParentContent_hrefInbox']");
		
		private By recivedpayrollElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailLog_ctl00_lbtnViewEmail']");
		

		private By emailElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_Lnkbtnemail']");
		
		private By emailElem1 = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_Lnkbtnemail']");

		private By emailPayslipElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_lnkbtnPaySlip']");

		private By emailTaxElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_Lnkbtnemail']");
	
		private By emailP60Elem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_LinkButtonEx1']");
		
		private By emailBtnElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_lnkPayslips']");
		private By emailBtnP11DElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_lnkP11DEmail']");

		private By emailP45= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_lnkP45Email']");
		
		private By regenerateElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_lnkRegenerate']");
		
		private By selectForm = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlForm']");
		
		
		public void clickEmailLog() throws InterruptedException
		{
			WebElement elem = getWebElement(dropIcon);
			elem.click();
			Thread.sleep(2000);
			WebElement elem1 = getWebElement(emailLog);
			elem1.click();
			
			Reporter.log("Click Email Log");
	}
		
		public void clickRecievedPayroll() throws Exception
		{
	        
			WebElement elem = getWebElement(recivedpayrollElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickRecievedPayroll", "clickRecievedPayroll failed. Unable to locate object: " + recivedpayrollElem.toString());

				Assert.fail("Unable to locate object: " + recivedpayrollElem.toString());
	        }
	         Thread.sleep(3000);
			elem.click();
			
			ExtentReportManager.passStep(m_Driver, "clickRecievedPayroll");
		
		
			   Reporter.log("Click  recievd payroll details ");
		
	}
		
		

		public void clickRegenerateBtn() throws Exception
		{
	        
			WebElement elem = getWebElement(regenerateElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "clickRegenerateBtn",
						"clickRegenerateBtn failed. Unable to locate object: " + regenerateElem.toString());

				Assert.fail("Unable to locate object: " + regenerateElem.toString());
			}
			Thread.sleep(2000);
			elem.click();
			Thread.sleep(4000);
			ExtentReportManager.passStep(m_Driver, "clickRegenerateBtn");

			Reporter.log("clickRegenerateBtn ");
		
	}
		

		public void clickEmailBtn() throws Exception
		{
	        
			WebElement elem = getWebElement(emailElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEmailBtn", "clickEmailBtn failed. Unable to locate object: " + emailElem.toString());

				Assert.fail("Unable to locate object: " + emailElem.toString());
	        }
	         Thread.sleep(2000);
			elem.click();
			
			
		Thread.sleep(4000);
		Reporter.log("Click  Email Btn");
		
	}
		
		public void tickAllEmployeP11D() throws Exception
		{
	         Thread.sleep(2000);

			WebElement elem = getWebElement(By.xpath("//*[@id='chkAllP11D']"));

			
			elem.click();
			
		Thread.sleep(4000);
		Reporter.log("tickAllEmployeP11D");
		
	}
		
		public void tickAllEmployeP60() throws Exception
		{
	         Thread.sleep(2000);

			WebElement elem = getWebElement(By.xpath("//*[@id='chkSelectAll']"));

			
			elem.click();
			
		Thread.sleep(4000);
		Reporter.log("tickAllEmployeP60");
		
	}
		
		public void tickAllEmployeP45() throws Exception
		{
	         Thread.sleep(2000);

			WebElement elem = getWebElement(By.xpath("//*[@id='chkAll']"));

			
			elem.click();
			
		Thread.sleep(4000);
		Reporter.log("tickAllEmployeP45");
		
	}
		
		public void clickDepartmentalEmailBtn() throws Exception
		{
	        
			WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_Lnkbtnemail']"));

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEmailBtn", "clickEmailBtn failed. Unable to locate object: " + emailElem.toString());

				Assert.fail("Unable to locate object: " + emailElem.toString());
	        }
	         Thread.sleep(2000);
			elem.click();
			
			
		Thread.sleep(4000);
		Reporter.log("clickDepartmentalEmailBtn");
		
	}
		
		
		
		public void clickAnnualPayScheduleEmailBtn() throws Exception
		{
			
			WebElement elem1 = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphError_btnSearch']"));
			
			elem1.click();
			
			WebDriverWait wait = new WebDriverWait(m_Driver, Duration.ofSeconds(300));

			wait.until(ExpectedConditions.presenceOfElementLocated(
			    By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_divPAYEPaymentsToHMRC']/div/table/tbody/tr[2]/td[1]")));

	        
			
	  	WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_lnkBtnEmail']"));
		
			elem.click();
			
		Thread.sleep(4000);
		Reporter.log("clickAnnualPayScheduleEmailBtn");
		
	}
		public void clickHoursSummaryEmailBtn() throws Exception
		{
	        
			WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_LnkEmail']"));

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEmailBtn", "clickEmailBtn failed. Unable to locate object: " + emailElem.toString());

				Assert.fail("Unable to locate object: " + emailElem.toString());
	        }
	         Thread.sleep(2000);
			elem.click();
			
			
		Thread.sleep(4000);
		Reporter.log("clickHoursSummaryEmailBtn");
		
	}
		
		
		public void clickAttachmentEarningEmailBtn() throws Exception
		{
	        
			WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_LnkBtnEmail']"));

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEmailBtn", "clickEmailBtn failed. Unable to locate object: " + emailElem.toString());

				Assert.fail("Unable to locate object: " + emailElem.toString());
	        }
	         Thread.sleep(2000);
			elem.click();
			
			
		Thread.sleep(4000);
		Reporter.log("clickAttachmentEarningEmailBtn");
		
	}
		
		
		public void clickPayrollReportingPeriodSummaryEmailBtn() throws Exception
		{
	        
			WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_LnkBtnEmail']"));

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEmailBtn", "clickEmailBtn failed. Unable to locate object: " + emailElem.toString());

				Assert.fail("Unable to locate object: " + emailElem.toString());
	        }
	         Thread.sleep(2000);
			elem.click();
			
			
		Thread.sleep(4000);
		Reporter.log("clickPayrollReportingPeriodSummaryEmailBtn");
		
	}
		
		
		public void clickPaymentSummaryEmailBtn() throws Exception
		{
	        
			WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_LnkBtnEmail']"));

		
	         Thread.sleep(2000);
			elem.click();
			
			
		Thread.sleep(4000);
		Reporter.log("clickPaymentSummaryEmailBtn");
		
	}
		
		public void clickPayslipEmailBtn() throws Exception
		{
	        
			WebElement elem = getWebElement(emailElem1);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEmailBtn", "clickEmailBtn failed. Unable to locate object: " + emailElem1.toString());

				Assert.fail("Unable to locate object: " + emailElem1.toString());
	        }
	         Thread.sleep(2000);
			elem.click();
			
			
		Thread.sleep(4000);
		Reporter.log("clickPayslipEmailBtn");
		
	}
		
		public void clickEmailPayslipBtn() throws Exception
		{
	        
			WebElement elem = getWebElement(emailPayslipElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEmailBtn", "clickEmailBtn failed. Unable to locate object: " + emailPayslipElem.toString());

				Assert.fail("Unable to locate object: " + emailPayslipElem.toString());
	        }
	         Thread.sleep(2000);
			elem.click();
			
			
		Thread.sleep(2000);
		Reporter.log("Click  Email Btn");
		
	}
		
		

		public void clickEmailTaxBtn() throws Exception
		{
	        
			WebElement elem = getWebElement(emailTaxElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEmailTaxBtn", "clickEmailTaxBtn failed. Unable to locate object: " + emailTaxElem.toString());

				Assert.fail("Unable to locate object: " + emailTaxElem.toString());
	        }
	         Thread.sleep(2000);
			elem.click();
			
			
		Thread.sleep(2000);
		Reporter.log("Click  Email Btn");
		
	}
		
		public void clickCheckBoxAllP60() throws Exception
		{
			WebElement elem = m_Driver.findElement(By.xpath("//*[@id='chkSelectAll']"));
			elem.click();
			Thread.sleep(2000);
			
		}

		
		public void clickCheckBoxAllP45() throws Exception
		{
			WebElement elem = m_Driver.findElement(By.xpath("//*[@id='chkAll']"));
			elem.click();
			Thread.sleep(2000);
			
		}
		
		public void clickCheckBoxAllP11D() throws Exception
		{
			WebElement elem = m_Driver.findElement(By.xpath("//*[@id='chkAllP11D']"));
			elem.click();
			Thread.sleep(2000);
			
		}

		public void clickEmailBtnP60() throws Exception
		{
	        
			WebElement elem = getWebElement(emailBtnElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEmailBtnP60", "clickEmailBtnP60 failed. Unable to locate object: " + emailBtnElem.toString());

				Assert.fail("Unable to locate object: " + emailElem.toString());
	        }
	         Thread.sleep(2000);
			elem.click();
			
			
		Thread.sleep(2000);
		Reporter.log("Click  Email Btn");
		
	}
		
		
		public void clickEmailBtnP60EmployerView() throws Exception
		{
	        
			WebElement elem = getWebElement(emailP60Elem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEmailBtnP60", "clickEmailBtnP60 failed. Unable to locate object: " + emailP60Elem.toString());

				Assert.fail("Unable to locate object: " + emailP60Elem.toString());
	        }
	         Thread.sleep(2000);
			elem.click();
			
			
		Thread.sleep(2000);
		Reporter.log("Click  Email Btn");
		
	}
		
		
		

		public void clickEmailBtnP11D() throws Exception
		{
	        
			WebElement elem = getWebElement(emailBtnP11DElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEmailBtnP11D", "clickEmailBtnP11D failed. Unable to locate object: " + emailBtnP11DElem.toString());

				Assert.fail("Unable to locate object: " + emailBtnP11DElem.toString());
	        }
	         Thread.sleep(2000);
			elem.click();
			
			
		Thread.sleep(2000);
		Reporter.log("Click  Email Btn");
		
	}
		

		public void clickEmailBtnP45() throws Exception
		{
	        
			WebElement elem = getWebElement(emailP45);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickEmailBtnP45", "clickEmailBtnP45 failed. Unable to locate object: " + emailP45.toString());

				Assert.fail("Unable to locate object: " + emailP45.toString());
	        }
	         Thread.sleep(2000);
			elem.click();
			
			
		Thread.sleep(2000);
		Reporter.log("clickEmailBtnP45");
		
	}
		
		
		public void clickSendBtn() throws Exception
		{
			  m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

				jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']")));

				Thread.sleep(5000);
				
				ExtentReportManager.passStep(m_Driver, "selectPayrollSummary");
			
			 
			    Reporter.log("click Send Btn");
			    m_Driver.switchTo().defaultContent();
		        
		}
		
		public void clickTaxPaymentSendBtn() throws Exception
		{
			  m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrameEmail']")));

				jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']")));

				Thread.sleep(5000);
				
				ExtentReportManager.passStep(m_Driver, "selectPayrollSummary");
			
			 
			    Reporter.log("click Send Btn");
			    m_Driver.switchTo().defaultContent();
		        
		}
		
		
		public void clickDepartmentalSendBtn() throws Exception
		{
			  m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

				jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_BtnSave']")));

				Thread.sleep(5000);
				
				ExtentReportManager.passStep(m_Driver, "selectPayrollSummary");
			
			 
			    Reporter.log("click Send Btn");
			    m_Driver.switchTo().defaultContent();			
		}
		
		
		public void clickHoursSummarySendBtn() throws Exception
		{
			  m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

				jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_BtnSave']")));

				Thread.sleep(5000);
				
				ExtentReportManager.passStep(m_Driver, "selectPayrollSummary");
			
			 
			    Reporter.log("click Send Btn");
			    m_Driver.switchTo().defaultContent();			
		}
		
		
		public void clickAttachmentEarningSendBtn() throws Exception
		{
			  m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

				jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_BtnSave']")));

				Thread.sleep(5000);
				
				ExtentReportManager.passStep(m_Driver, "selectPayrollSummary");
			
			 
			    Reporter.log("click Send Btn");
			    m_Driver.switchTo().defaultContent();			
		}
		
		
		
		public void clickPayrollReportingPeriodSummarySendBtn() throws Exception
		{
			  m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ReportPeriodTotalSummartEmailFrame']")));

				jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_BtnSave']")));

				Thread.sleep(5000);
				
				ExtentReportManager.passStep(m_Driver, "selectPayrollSummary");
			
			 
			    Reporter.log("click Send Btn");
			    m_Driver.switchTo().defaultContent();			
		}
		
		
		public void clickPaymentSummarySendBtn() throws Exception
		{
			  m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PaymentSummartEmailFrame']")));

				jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_BtnSave']")));

				Thread.sleep(5000);
				
				ExtentReportManager.passStep(m_Driver, "selectPayrollSummary");
			
			 
			    Reporter.log("click Send Btn");
			    m_Driver.switchTo().defaultContent();			
		}
		
		
		
		public void clickRequesthrsSendBtn() throws Exception
		{
			  m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrameRequestHour']")));

				jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']")));

				Thread.sleep(5000);
				
				ExtentReportManager.passStep(m_Driver, "clickRequesthrsSendBtn");
			
			 
			    Reporter.log("clickRequesthrsSendBtn");
			    m_Driver.switchTo().defaultContent();
		        
			
		}
		
		public void clickSendBtnEmployee() throws Exception
		{
			  m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrameEmployee']")));

				jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']")));

				Thread.sleep(5000);
				
				ExtentReportManager.passStep(m_Driver, "selectPayrollSummary");
			
			 
			    Reporter.log("click Send Btn");
			    m_Driver.switchTo().defaultContent();
		        
			
		}
		public void clickSendBtnP60() throws Exception
		{
			  m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

				jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']")));

				Thread.sleep(5000);
				
				ExtentReportManager.passStep(m_Driver, "clickSendBtnP60");
			
			 
			    Reporter.log("click Send Btn");
			    m_Driver.switchTo().defaultContent();
		        
			
		}
		
		
		
		public void closePopup() throws Exception
		{
			
			WebElement elem = m_Driver.findElement(By.xpath("//*[@id='PopUpClose1']/span"));
			
			elem.click();
			
			Thread.sleep(2000);
			
			Reporter.log("Click close Btn");
			
		}
		
		
		public void closePopupP60() throws Exception
		{
			
			WebElement elem = m_Driver.findElement(By.xpath("//*[@id='PopUpClose']/span"));
			
			elem.click();
			
			Thread.sleep(2000);
			
			Reporter.log("Click close Btn");
			
		}

		public void selectEmailType(String Text) throws Exception
		{
			
			WebElement elem = getWebElement(selecttype);
			
			Thread.sleep(2000);
			Select sel = new Select(elem);
			sel.selectByVisibleText(Text);
	
			Thread.sleep(2000);

			Reporter.log("selectEmailType");

		}
		
		
		public void selectEmailTypeForms(String emailType) {
		    WebDriverWait wait = new WebDriverWait(m_Driver, Duration.ofSeconds(10));

		    // Open Email Type dropdown
		    wait.until(ExpectedConditions.elementToBeClickable(
		            By.xpath("//span[contains(@id,'select2-EmailType-container')]")))
		            .click();

		    // Search box
		    WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(
		            By.xpath("//input[@class='select2-search__field']")));

		    search.sendKeys(emailType);
		    search.sendKeys(Keys.ENTER);
		}
		
		
		public void selectPeriodEndDate(String Text) throws Exception
		{
			
			WebElement elem = getWebElement(selectPeriodEndDate);
			
			Thread.sleep(2000);
			Select sel = new Select(elem);
			sel.selectByVisibleText(Text);
	
			Thread.sleep(2000);

			Reporter.log("selectPeriodEndDate");

		}
		
		public void selectTaxYear(String Text) throws Exception
		{
			
			WebElement elem = getWebElement(selectTaxYear);
			
			Thread.sleep(2000);
			Select sel = new Select(elem);
			sel.selectByVisibleText(Text);
	
			Thread.sleep(2000);

			Reporter.log("selectTaxYear");

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
		
		
	}