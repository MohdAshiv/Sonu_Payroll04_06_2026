package _5885BuisnessLevelPopUP_Page;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import pages.BasePage;

public class PopUpCancelBtn extends BasePage {

	public PopUpCancelBtn(WebDriver driver) {
		super(driver);
		
			
	}

	SoftAssert soft= new SoftAssert();
	

	public void verifyCancelBtn() throws Exception
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

		WebElement cancel = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnCancel']"));

		jsExec.executeScript("arguments[0].scrollIntoView(true);", cancel);

		
		cancel.click();
	
		m_Driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
         boolean email = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_Lnkbtnemail']")).isDisplayed();
		 
		 soft.assertTrue(email);
		
		Reporter.log("verifyCancelBtn");
	}
	
	
	public void verifyCancelBtnPayslip() throws Exception
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

		WebElement cancel = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnCancel']"));

		jsExec.executeScript("arguments[0].scrollIntoView(true);", cancel);

		
		cancel.click();
	
		m_Driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
         boolean email = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_lnkRegenerate']")).isDisplayed();
		 
		 soft.assertTrue(email);
		
		Reporter.log("verifyCancelBtn");
	}
	
	public void verifyCancelBtn1() throws Exception
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrameEmployee']")));

		WebElement cancel = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnCancel']"));

		jsExec.executeScript("arguments[0].scrollIntoView(true);", cancel);

		
		cancel.click();
	
		m_Driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
         boolean email = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_lnkRegenerate']")).isDisplayed();
		 
		 soft.assertTrue(email);
		
		Reporter.log("verifyCancelBtn");
	}
	
	
	
	
	public void verifyCancelBtn2() throws Exception
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrameEmployee']")));

		WebElement cancel = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnCancel']"));

		jsExec.executeScript("arguments[0].scrollIntoView(true);", cancel);

		
		cancel.click();
	
		m_Driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

		WebElement cancel1 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnCancel']"));

		jsExec.executeScript("arguments[0].scrollIntoView(true);", cancel1);

		
		cancel1.click();
	
		m_Driver.switchTo().defaultContent();
		Thread.sleep(3000);
         boolean closeBtn = m_Driver.findElement(By.xpath("//*[@id='PopUpClose1']")).isDisplayed();
		 
		 soft.assertFalse(closeBtn);
		 
		
		Reporter.log("verifyCancelBtn");
	}
	
	
	public void verifyCloseBtn2() throws Exception
	{

		WebElement close = m_Driver.findElement(By.xpath("//*[@id='PopUpClose2']"));

		jsExec.executeScript("arguments[0].scrollIntoView(true);", close);

		
		close.click();
	
		Thread.sleep(3000);
		
		
		

		WebElement close1 = m_Driver.findElement(By.xpath("//*[@id='PopUpClose1']"));

		jsExec.executeScript("arguments[0].scrollIntoView(true);", close1);

		
		close1.click();
	
		Thread.sleep(3000);
         boolean closeBtn = m_Driver.findElement(By.xpath("//*[@id='PopUpClose1']")).isDisplayed();
		 
		 soft.assertFalse(closeBtn);
		 
		
		Reporter.log("verifyCancelBtn");
	}
	
	
	public void verifyCloseBtn() throws Exception
	{
	

		WebElement closeBtn = m_Driver.findElement(By.xpath("//*[@id='PopUpClose1']"));


		
		closeBtn.click();
	
		Thread.sleep(3000);
		
         boolean email = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_Lnkbtnemail']")).isDisplayed();
		 
		soft. assertTrue(email);
		
		Reporter.log("verifyCloseBtn");
	}
	
	public void verifyCloseBtnPayslip() throws Exception
	{
	

		WebElement closeBtn = m_Driver.findElement(By.xpath("//*[@id='PopUpClose1']"));


		
		closeBtn.click();
	
		Thread.sleep(3000);
		
         boolean email = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_lnkRegenerate']")).isDisplayed();
		 
		soft. assertTrue(email);
		
		Reporter.log("verifyCloseBtn");
	}
	
	public void verifyCloseBtn1() throws Exception
	{
	

		WebElement closeBtn = m_Driver.findElement(By.xpath("//*[@id='PopUpClose2']"));


		
		closeBtn.click();
	
		Thread.sleep(3000);
		
         boolean email = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_lnkRegenerate']")).isDisplayed();
		 
		soft. assertTrue(email);
		
		Reporter.log("verifyCloseBtn");
	}
	
	
	
	public void verifyCloseBtnOnDashboard() throws Exception
	{
	

		WebElement closeBtn = m_Driver.findElement(By.xpath("(//*[@id='PopUpClose1'])[2]"));


	    	closeBtn.click();
	
			boolean oneOffBtn = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnOneOff']")).isDisplayed();
				 
				soft. assertTrue(oneOffBtn);
		     Thread.sleep(3000);
		
       
		
		Reporter.log("verifyCloseBtn");
	}
	
	
	

	public void verifyCancelBtnFromSendSms() throws Exception
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='SendSMSFrame']")));

		WebElement cancel = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnCancelModal']"));


		cancel.click();
	
		m_Driver.switchTo().defaultContent();

		boolean oneOffBtn = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnOneOff']")).isDisplayed();
			 
			soft. assertTrue(oneOffBtn);
	     Thread.sleep(3000);
	
		
		Reporter.log("verifyCancelBtn");
	}
	   
	
	
	
	public void verifyCloseBtnFromSendSms() throws Exception
	{
	

		WebElement closeBtn = m_Driver.findElement(By.xpath("//*[@id='SendSMSClose']"));

		closeBtn.click();
	
		Thread.sleep(3000);
		
		boolean oneOffBtn = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnOneOff']")).isDisplayed();
		 
		soft. assertTrue(oneOffBtn);
		
		Reporter.log("verifyCloseBtn");
	}
	
	
	
	public void verifyCancelBtnTaxPayment() throws Exception
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrameEmail']")));

		WebElement cancel = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnCancel']"));
		jsExec.executeScript("arguments[0].click();",cancel);

	   // cancel.click();
	
		m_Driver.switchTo().defaultContent(); 

		Thread.sleep(3000);
		boolean close = m_Driver.findElement(By.xpath("(//*[@id=\"PopUpClose\"])[2]")).isDisplayed();
			 
		System.out.println(close);
		soft. assertFalse(close);
	
		
		Reporter.log("verifyCancelBtnHmrcElem");
	}
	   
	
	public void verifyCancelBtnTaxPayment1() throws Exception
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("(//*[@id='PopUpFrame'])[1]")));

		WebElement cancel = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnCancel']"));
		jsExec.executeScript("arguments[0].click();",cancel);

	   // cancel.click();
	
		m_Driver.switchTo().defaultContent(); 

		Thread.sleep(3000);
		boolean close = m_Driver.findElement(By.xpath("(//*[@id='PopUpClose'])[1]")).isDisplayed();
			 
		System.out.println(close);
		soft. assertFalse(close);
	
		
		Reporter.log("verifyCancelBtnHmrcElem");
	}
	
	public void verifyCloseBtnTaxPayment() throws Exception
	{
	

		WebElement closeBtn = m_Driver.findElement(By.xpath("(//*[@id='PopUpClose'])[2]"));

	     closeBtn.click();
	
		Thread.sleep(3000);
		
		soft. assertFalse(closeBtn.isDisplayed());
	  
		Reporter.log("verifyCloseBtnHmrcElem");
	}
	
	
	public void verifyCloseBtnTaxPayment1() throws Exception
	{
	

		WebElement closeBtn = m_Driver.findElement(By.xpath("(//*[@id='PopUpClose'])[1]"));

	     closeBtn.click();
	
		Thread.sleep(3000);
		
		soft. assertFalse(closeBtn.isDisplayed());
	  
		Reporter.log("verifyCloseBtnHmrcElem");
	}
	
	
	public void verifyCancelBtnOpeningBalance() throws Exception
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_openingbalancemodalIframe1']")));

		WebElement cancel = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnCancel']"));


	     cancel.click();
	
		m_Driver.switchTo().defaultContent();

		Thread.sleep(3000);
		boolean close = m_Driver.findElement(By.xpath("//*[@id='openingbalancemodalclose']")).isDisplayed();
			 
		soft. assertFalse(close);
	
		Thread.sleep(3000);
		
		Reporter.log("verifyCancelBtnOpeningBalance");
	}
	
	
	

	public void verifyCloseBtnOpeningBalance() throws Exception
	{
	

		WebElement closeBtn = m_Driver.findElement(By.xpath("//*[@id='openingbalancemodalclose']"));

	     closeBtn.click();
	
		Thread.sleep(3000);
		
		soft. assertFalse(closeBtn.isDisplayed());
	  
		Reporter.log("verifyCloseBtnHmrcElem");
	}
	
	
	public void verifyCloseBtnPayDate() throws Exception
	{
	

		WebElement closeBtn = m_Driver.findElement(By.xpath("//*[@id='PopUpClose1']"));

	     closeBtn.click();
	
		Thread.sleep(3000);
		
		soft. assertFalse(closeBtn.isDisplayed());
	  
		Reporter.log("verifyCloseBtnPayDate");
	}
	
	
	
	public void verifyCancelBtnLeaveReport() throws Exception
	{
		//m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

		WebElement cancel = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnCancel']"));
		jsExec.executeScript("arguments[0].scrollIntoView(true);", cancel);


	     cancel.click();
	
//		m_Driver.switchTo().defaultContent();
//
//		Thread.sleep(3000);
//		boolean close = m_Driver.findElement(By.xpath("//*[@id='PopUpClose']")).isDisplayed();
//			 
//		soft. assertFalse(close);
//	
		Thread.sleep(3000);
		
		Reporter.log("verifyCancelBtnAddLeave");
	}
	
	
	
	public void verifyCloseBtnLeaveReport() throws Exception
	{
	

		WebElement closeBtn = m_Driver.findElement(By.xpath("//*[@id='PopUpClose']"));

	     closeBtn.click();
	
		Thread.sleep(3000);
		
		soft. assertFalse(closeBtn.isDisplayed());
	  
		Reporter.log("verifyCloseBtnPayDate");
	}
	
	
	public void verifyCancelLinkedWithAccount() throws Exception
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

		WebElement cancel = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnCancel']"));

	     cancel.click();
	
		m_Driver.switchTo().defaultContent();

		Thread.sleep(3000);
		boolean close = m_Driver.findElement(By.xpath("//*[@id='PopUpClose1']")).isDisplayed();
			 
		soft. assertFalse(close);
	
		Thread.sleep(3000);
		
		Reporter.log("verifyCancelLinkedWithAccount");
	}
	
	
	public void verifyCloseBtnLinkedWithAccount() throws Exception
	{
	
		WebElement closeBtn = m_Driver.findElement(By.xpath("//*[@id='PopUpClose1']"));

	     closeBtn.click();
	
		Thread.sleep(3000);
		
		soft. assertFalse(closeBtn.isDisplayed());
	  
		Reporter.log("verifyCloseBtnLinkedWithAccount");
	}
	
	
	
	
	
	public void verifyCancelDepartment() throws Exception
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFramemd']")));

		WebElement cancel = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnCancel']"));

	     cancel.click();
	
		m_Driver.switchTo().defaultContent();

		Thread.sleep(3000);
		boolean close = m_Driver.findElement(By.xpath("//*[@id='PopUpClose2']")).isDisplayed();
			 
		soft. assertFalse(close);
	
		Thread.sleep(2000);
		
		Reporter.log("verifyCancelDepartment");
		
		
	}
	
	public void verifyCloseBtnDepartment() throws Exception
	{
	
		WebElement closeBtn = m_Driver.findElement(By.xpath("//*[@id='PopUpClose2']"));

	     closeBtn.click();
	
		Thread.sleep(3000);
		
		soft. assertFalse(closeBtn.isDisplayed());
	  
		Reporter.log("verifyCloseBtnLinkedWithAccount");
	}
	
	
	public void verifyCloseBtnDepartmentList() throws Exception
	{
	
		WebElement closeBtn = m_Driver.findElement(By.xpath("//*[@id='PopUpClose2']"));

	     closeBtn.click();
	
		Thread.sleep(3000);
		
		soft. assertFalse(closeBtn.isDisplayed());
	  
		Reporter.log("verifyCloseBtnDepartmentList");
	}
	
	
	
	public void verifyCancelBtnEditDepartmentList() throws Exception
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFramemd']")));

		WebElement cancel = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnCancel']"));

	     cancel.click();
	
		m_Driver.switchTo().defaultContent();

		Thread.sleep(3000);
		boolean close = m_Driver.findElement(By.xpath("//*[@id='PopUpClose2']")).isDisplayed();
			 
		soft. assertFalse(close);
	
		Thread.sleep(2000);
		
		Reporter.log("verifyCancelDepartment");
		
		
	}
	
	public void verifyCloseBtnEditDepartmentList() throws Exception
	{
	
		WebElement closeBtn = m_Driver.findElement(By.xpath("//*[@id='PopUpClose2']"));

	     closeBtn.click();
	
		Thread.sleep(3000);
		
		soft. assertFalse(closeBtn.isDisplayed());
	  
		Reporter.log("verifyCloseBtnDepartmentList");
	}
	
	
	public void verifyCancelBtnClosePayeScheme() throws Exception
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrameRefresh']")));

		WebElement cancel = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnCancel']"));

	     cancel.click();
	
		m_Driver.switchTo().defaultContent();

		Thread.sleep(3000);
		boolean close = m_Driver.findElement(By.xpath("//*[@id='PopUpClose3']")).isDisplayed();
			 
		soft. assertFalse(close);
	
		Thread.sleep(2000);
		
		Reporter.log("verifyCancelBtnClosePayeScheme");
		
		
	}
	
	
	public void verifyCloseBtnClosePayeSchem() throws Exception
	{
	
		WebElement closeBtn = m_Driver.findElement(By.xpath("//*[@id='PopUpClose3']"));

	     closeBtn.click();
	
		Thread.sleep(5000);
		boolean close = m_Driver.findElement(By.xpath("//*[@id='PopUpClose3']")).isDisplayed();
		 
		
		soft. assertFalse(close);
		Reporter.log("verifyCloseBtnClosePayeSchem");
	}
	
	
	
	public void verifyCancelBtnRegisterdCis() throws Exception
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrameRefresh']")));

		WebElement cancel = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnCancel']"));

	     cancel.click();
	
		m_Driver.switchTo().defaultContent();

		Thread.sleep(3000);
		boolean close = m_Driver.findElement(By.xpath("//*[@id='PopUpClose3']")).isDisplayed();
			 
		soft. assertFalse(close);
	
		Thread.sleep(2000);
		
		Reporter.log("verifyCancelBtnRegisterdCis");
		
		
	}
	
	public void verifyCloseBtnRegisterdCis() throws Exception
	{
	
		WebElement closeBtn = m_Driver.findElement(By.xpath("//*[@id='PopUpClose3']"));

	     closeBtn.click();
	
		Thread.sleep(3000);
		boolean close = m_Driver.findElement(By.xpath("//*[@id='PopUpClose3']")).isDisplayed();
		 
		soft. assertFalse(close);
		Reporter.log("verifyCloseBtnRegisterdCis");
	}
	
	
	
	public void verifyCancelBtnRegisterdCisCreate() throws Exception
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

		WebElement cancel = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnCancel']"));
		jsExec.executeScript("arguments[0].scrollIntoView(true);", cancel);

	     cancel.click();
	
		m_Driver.switchTo().defaultContent();
	

		Thread.sleep(3000);
		boolean close = m_Driver.findElement(By.xpath("//*[@id='PopUpClose1']")).isDisplayed();
			 
		soft. assertFalse(close);
	
		Thread.sleep(2000);
		
		Reporter.log("verifyCancelBtnRegisterdCisCreate");
		
		
	}
	
	public void verifyCloseBtnRegisterdCisCreate() throws Exception
	{
	
		WebElement closeBtn = m_Driver.findElement(By.xpath("//*[@id='PopUpClose1']"));

	     closeBtn.click();
	
		Thread.sleep(3000);
		boolean close = m_Driver.findElement(By.xpath("//*[@id='PopUpClose1']")).isDisplayed();
		 
		soft. assertFalse(close);
		Reporter.log("verifyCloseBtnRegisterdCisCreate");
	}
	
	
	public void verifyCancelBtnRegisterdCisLink() throws Exception
	{
		
			
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

			WebElement cancel = m_Driver.findElement(By.xpath("//*[@class='col-sm-4  col-xs-6  col-md-4']/a[2]"));

		     cancel.click();
		
			m_Driver.switchTo().defaultContent();
		

			Thread.sleep(3000);
			boolean close = m_Driver.findElement(By.xpath("//*[@id='PopUpClose1']")).isDisplayed();
				 
			soft. assertFalse(close);
		
			Thread.sleep(2000);
			
			Reporter.log("verifyCancelBtnRegisterdCisLink");
		
		
	}
	
	public void verifyCloseBtnRegisterdCisLink() throws Exception
	{
	
		WebElement closeBtn = m_Driver.findElement(By.xpath("//*[@id='PopUpClose1']"));

	     closeBtn.click();
	
		Thread.sleep(3000);
		boolean close = m_Driver.findElement(By.xpath("//*[@id='PopUpClose1']")).isDisplayed();
		 
		soft. assertFalse(close);
		Reporter.log("verifyCloseBtnRegisterdCisLink");
	}
	
	
	
	
	
	
	
	public void verifyCloseBtnPayslipTemplate() throws Exception
	{
	
		WebElement closeBtn = m_Driver.findElement(By.xpath("//*[@id='dvShowTemplatePopup']/div/div/div[1]/button"));

	     closeBtn.click();
	
		Thread.sleep(3000);
	//	boolean close = m_Driver.findElement(By.xpath("//*[@id='dvShowTemplatePopup']/div/div/div[1]/button")).isDisplayed();
		 
		soft. assertFalse(closeBtn.isDisplayed());
		Reporter.log("verifyCloseBtnPayslipTemplate");
	}
	
	
	
	
	public void verifyCancelBtnEmployerPasword() throws Exception
	{
		
			

			WebElement cancel = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_LinkButtonEx4']"));

		     cancel.click();
		
			m_Driver.switchTo().defaultContent();
		

			Thread.sleep(3000);
			boolean close = m_Driver.findElement(By.xpath("//*[@id='dvPasswordProtectionPopup2']/div/div/div[1]/button")).isDisplayed();
				 
			soft. assertFalse(close);
		
			Thread.sleep(3000);
			m_Driver.navigate().refresh();
			
			Thread.sleep(3000);
			
			
			Reporter.log("verifyCancelBtnEmployerPasword");
		
	
	}
	
	
	public void verifyCloseBtnEmployerPassword() throws Exception
	{
	
		WebElement closeBtn = m_Driver.findElement(By.xpath("//*[@id='dvPasswordProtectionPopup2']/div/div/div[1]/button"));

	     closeBtn.click();
	
		Thread.sleep(3000);
		//boolean close = m_Driver.findElement(By.xpath("//*[@id='dvPasswordProtectionPopup2']/div/div/div[1]/button")).isDisplayed();
		 
		soft. assertFalse(closeBtn.isDisplayed());
		Reporter.log("verifyCloseBtnEmployerPassword");
	}
	
	

	public void verifyCancelBtnEmployeePasword() throws Exception
	{
		
			WebElement cancel = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_LinkButtonEx5']"));

		     cancel.click();
		
			m_Driver.switchTo().defaultContent();
		

			Thread.sleep(3000);
			boolean close = m_Driver.findElement(By.xpath("//*[@id='dvPasswordProtectionPopup']/div/div/div[1]/button")).isDisplayed();
				 
			soft. assertFalse(close);
		
			Thread.sleep(2000);
			m_Driver.navigate().refresh();
			
			Thread.sleep(4000);
			
			Reporter.log("verifyCancelBtnEmployeePasword");
	
	}
	
	
	
	public void verifyCloseBtnEmployeePassword() throws Exception
	{
	
		WebElement closeBtn = m_Driver.findElement(By.xpath("//*[@id='dvPasswordProtectionPopup']/div/div/div[1]/button"));

	     closeBtn.click();
	
		Thread.sleep(3000);
		//boolean close = m_Driver.findElement(By.xpath("//*[@id='dvPasswordProtectionPopup2']/div/div/div[1]/button")).isDisplayed();
		 
		soft. assertFalse(closeBtn.isDisplayed());
		Reporter.log("verifyCloseBtnEmployerPassword");
	}
	
	
	public void verifyCloseBtnEmployeePassword1() throws Exception
	{
	
		WebElement closeBtn = m_Driver.findElement(By.xpath("//*[@id='PasswordPopup2']/div/div/div[1]/button"));

	     closeBtn.click();
	
		Thread.sleep(3000);
		//boolean close = m_Driver.findElement(By.xpath("//*[@id='dvPasswordProtectionPopup2']/div/div/div[1]/button")).isDisplayed();
		 
		soft. assertFalse(closeBtn.isDisplayed());
		Reporter.log("verifyCloseBtnEmployerPassword");
	}
	
	

	public void verifyCancelBtnEmployeeChangePasword() throws Exception
	{
		
			WebElement cancel = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_LinkButtonEx5']"));

		     cancel.click();
		
			
			Thread.sleep(3000);
			boolean close = m_Driver.findElement(By.xpath("//*[@id='dvPasswordProtectionPopup']/div/div/div[1]/button")).isDisplayed();
				 
			soft. assertFalse(close);
		
			
			
			Thread.sleep(4000);
			
			
	
			Reporter.log("verifyCancelBtnEmployeeChangePasword");
		
	
		
	}
	
	public void verifyCloseBtnEmployeeChangePassword() throws Exception
	{
	
		WebElement closeBtn = m_Driver.findElement(By.xpath("//*[@id='dvPasswordProtectionPopup']/div/div/div[1]/button"));

	     closeBtn.click();
	
		Thread.sleep(3000);
		//boolean close = m_Driver.findElement(By.xpath("//*[@id='dvPasswordProtectionPopup2']/div/div/div[1]/button")).isDisplayed();
		 
		soft. assertFalse(closeBtn.isDisplayed());
		Reporter.log("verifyCloseBtnEmployeeChangePassword");
	}
	
	
	
	
	public void verifyCloseBtnEmployerPassword1() throws Exception
	{
	
		WebElement closeBtn = m_Driver.findElement(By.xpath("//*[@id='PasswordPopup1']/div/div/div[1]/button"));

	     closeBtn.click();
	
		Thread.sleep(3000);
		//boolean close = m_Driver.findElement(By.xpath("//*[@id='dvPasswordProtectionPopup2']/div/div/div[1]/button")).isDisplayed();
		 
		soft. assertFalse(closeBtn.isDisplayed());
		Reporter.log("verifyCloseBtnEmployerPassword1");
	}
	
	
	
	
	public void verifyCancelBtnEmployerChangePasword() throws Exception
	{
		

			WebElement cancel = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_LinkButtonEx4']"));

		     cancel.click();
		
			
		

			Thread.sleep(3000);
			boolean close = m_Driver.findElement(By.xpath("//*[@id='dvPasswordProtectionPopup2']/div/div/div[1]/button")).isDisplayed();
				 
			soft. assertFalse(close);
		
			
			
			Thread.sleep(4000);
			
			
		
			Reporter.log("verifyCancelBtnEmployerChangePasword");
		
	
		
	}
	
	
	public void verifyCloseBtnEmployerChangePassword() throws Exception
	{
	
		WebElement closeBtn = m_Driver.findElement(By.xpath("//*[@id='dvPasswordProtectionPopup2']/div/div/div[1]/button"));

	     closeBtn.click();
	
		Thread.sleep(3000);
		//boolean close = m_Driver.findElement(By.xpath("//*[@id='dvPasswordProtectionPopup2']/div/div/div[1]/button")).isDisplayed();
		 
		soft. assertFalse(closeBtn.isDisplayed());
		Reporter.log("verifyCloseBtnEmployerChangePassword");
	}
	
	
	public void verifyCancelBtnRequestPayrollInformation() throws Exception
	{
	
			
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrameRefresh']")));

			WebElement cancel = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnCancel']"));

		     cancel.click();
		
			m_Driver.switchTo().defaultContent();
		

			Thread.sleep(3000);
			boolean close = m_Driver.findElement(By.xpath("//*[@id='PopUpClose3']")).isDisplayed();
				 
			soft. assertFalse(close);
		
			Thread.sleep(2000);
			
			Reporter.log("verifyCancelBtnRequestPayrollInformation");
			
		
	}
	
	
	
	public void verifyCloseBtnRequestPayrollInformation() throws Exception
	{
		WebElement closeBtn = m_Driver.findElement(By.xpath("//*[@id='PopUpClose3']"));

	     closeBtn.click();
	
		Thread.sleep(3000);
		boolean close = m_Driver.findElement(By.xpath("//*[@id='PopUpClose3']")).isDisplayed();
	 
		soft. assertFalse(close);
		Reporter.log("verifyCloseBtnRequestPayrollInformation");
	}
	
	
	

	public void verifyCancelBtnAutoPayroll() throws Exception
	{
		
			
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

			WebElement cancel = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_LinkButtonCancel']"));

		     cancel.click();
		
			m_Driver.switchTo().defaultContent();
		

			Thread.sleep(3000);
			boolean close = m_Driver.findElement(By.xpath("//*[@id='PopUpClose1']")).isDisplayed();
				 
			soft. assertFalse(close);
		
			Thread.sleep(2000);
			
			Reporter.log("verifyCancelBtnAutoPayroll");
	
	
		
	}
	
	public void verifyCloseBtnAutoPayroll() throws Exception//*[@id='ctl00_ctl00_ParentContent_cphFooter_LinkButtonCancel']
	{
		WebElement closeBtn = m_Driver.findElement(By.xpath("//*[@id='PopUpClose1']"));

	     closeBtn.click();
	
		Thread.sleep(3000);
	 
		soft. assertFalse(closeBtn.isDisplayed());
		Reporter.log("verifyCloseBtnRequestPayrollInformation");
	}
	
	
	
	public void verifyCancelBtnEmailSetting() throws Exception
	{
		
			
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_AutorunPayrollFrame']")));

			WebElement cancel = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_LinkButtonCancel']"));

		     cancel.click();
		
			m_Driver.switchTo().defaultContent();
		

			Thread.sleep(5000);
			boolean close = m_Driver.findElement(By.xpath("//*[@id='modalAutorunPayrollClose']")).isDisplayed();
				 
			soft. assertFalse(close);
		
			Thread.sleep(3000);
			 m_Driver.navigate().refresh();
			 Thread.sleep(3000);
			Reporter.log("verifyCancelBtnEmailSetting");
			
	
		
	}
	
	public void verifyCloseBtnEmailSetting() throws Exception
	{
		WebElement closeBtn = m_Driver.findElement(By.xpath("//*[@id='modalAutorunPayrollClose']"));

	     closeBtn.click();
	
		Thread.sleep(3000);
	 
		soft. assertFalse(closeBtn.isDisplayed());
		Reporter.log("verifyCloseBtnEmailSetting");
	}
	
	public void verifyCancelBtnEmployementAllowances() throws Exception
	{
	
			
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='EmploymentAllowanceEnableFrame']")));

			WebElement cancel = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnCancel']"));

		     cancel.click();
		
			m_Driver.switchTo().defaultContent();
		

			Thread.sleep(5000);
			boolean close = m_Driver.findElement(By.xpath("//*[@id='PopUpClose5']")).isDisplayed();
				 
			soft. assertFalse(close);
		
			Thread.sleep(2000);
			
			Reporter.log("verifyCancelBtnEmployementAllowances");
		
	
	}
	
	
	public void verifyCloseBtnEmployementAllowances() throws Exception
	{
		WebElement closeBtn = m_Driver.findElement(By.xpath("//*[@id='PopUpClose5']"));

	     closeBtn.click();
	
		Thread.sleep(3000);
	 
		soft. assertFalse(closeBtn.isDisplayed());
		Reporter.log("verifyCloseBtnEmailSetting");
	}
	
	
	public void verifyCloseBtnNetPayCalculator() throws Exception
	{
	
		WebElement closeBtn = m_Driver.findElement(By.xpath("//*[@id='cboxCloseNetPay']"));

	    closeBtn.click();
	
		Thread.sleep(3000);
	//	boolean close = m_Driver.findElement(By.xpath("//*[@id='dvShowTemplatePopup']/div/div/div[1]/button")).isDisplayed();
		 
		System.out.println(closeBtn.isDisplayed());
		soft. assertFalse(closeBtn.isDisplayed());
		Reporter.log("verifyCloseBtnPayslipTemplate");
	}
	
	
	public void verifyCloseBtnFPS() throws Exception
	{
	
		WebElement closeBtn = m_Driver.findElement(By.xpath("//*[@id='PopUpClose']"));

	    closeBtn.click();
	
		Thread.sleep(3000);
		 
		System.out.println(closeBtn.isDisplayed());
		soft. assertFalse(closeBtn.isDisplayed());
		Reporter.log("verifyCloseBtnFPS");
	}
	
	
	public void verifyCloseBtnEps() throws Exception
	{
	
		WebElement closeBtn = m_Driver.findElement(By.xpath("//*[@id='PopUpClose']"));

	    closeBtn.click();
	
		Thread.sleep(3000);
		 
		soft. assertFalse(closeBtn.isDisplayed());
		Reporter.log("verifyCloseBtnEps");
		
		
	}
	
	public void verifyCancelBtnAoePopUp() throws Exception
	{
			
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

			WebElement cancel = m_Driver.findElement(By.xpath("//*[@id='btnCancel']"));
			jsExec.executeScript("arguments[0].scrollIntoView(true);", cancel);

		     cancel.click();
		
			m_Driver.switchTo().defaultContent();
		

			Thread.sleep(5000);
			boolean close = m_Driver.findElement(By.xpath("//*[@id='PopUpClose1']")).isDisplayed();
				 
			soft. assertFalse(close);
		
			Thread.sleep(2000);
			
			Reporter.log("verifyCancelBtnAoePopUp");
	
	
	}
	
	public void verifyCloseBtnAoePopUp() throws Exception
	{
	
		WebElement closeBtn = m_Driver.findElement(By.xpath("//*[@id='PopUpClose1']"));

	    closeBtn.click();
	
		Thread.sleep(3000);
		 
		soft. assertFalse(closeBtn.isDisplayed());
		Reporter.log("verifyCloseBtnAoePopUp");
		
		
	}
	
	
	public void verifyCancelBtnFormEmailPopUp() throws Exception
	{
		
			
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

			WebElement cancel = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnCancel']"));

		     cancel.click();
		
			m_Driver.switchTo().defaultContent();
		

			Thread.sleep(5000);
			boolean close = m_Driver.findElement(By.xpath("//*[@id='PopUpClose']")).isDisplayed();
				 
			soft. assertFalse(close);
		
			Thread.sleep(2000);
			
			Reporter.log("verifyCancelBtnFormEmailPopUp");
			
		
	
	}
	
	
	public void verifyCloseBtnFormEmailPopUp() throws Exception
	{
	
		WebElement closeBtn = m_Driver.findElement(By.xpath("//*[@id='PopUpClose']"));

	    closeBtn.click();
	
		Thread.sleep(3000);
		 
		soft. assertFalse(closeBtn.isDisplayed());
		Reporter.log("verifyCloseBtnFormEmailPopUp");
		
		
	}
	
	public void verifyCancelBtnEmployerViewFormEmailPopUp() throws Exception
	{
		
			
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

			WebElement cancel = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnCancel']"));

		     cancel.click();
		
			m_Driver.switchTo().defaultContent();
		

			Thread.sleep(5000);
			boolean close = m_Driver.findElement(By.xpath("//*[@id='PopUpClose1']")).isDisplayed();
				 
			soft. assertFalse(close);
		
			Thread.sleep(2000);
			
			Reporter.log("verifyCancelBtnFormEmailPopUp");
			
		
	
	}
	
	public void verifyCloseBtnEmployerViewFormEmailPopUp() throws Exception
	{
	
		WebElement closeBtn = m_Driver.findElement(By.xpath("//*[@id='PopUpClose1']"));

	    closeBtn.click();
	
		Thread.sleep(3000);
		 
		soft. assertFalse(closeBtn.isDisplayed());
		Reporter.log("verifyCloseBtnFormEmailPopUp");
		
		
	}
	
	
	
	public void verifyCloseBtnEmployerViewPayDatePopUp() throws Exception
	{
	
		WebElement closeBtn = m_Driver.findElement(By.xpath("//*[@id='cboxClose']"));

	    closeBtn.click();
	
		Thread.sleep(3000);
		 
		soft. assertFalse(closeBtn.isDisplayed());
		Reporter.log("verifyCloseBtnFormEmailPopUp");
		
		
	}
	
	
	
	
	public void verifyCloseBtnOffPayrollPopUp() throws Exception
	{
	
		WebElement closeBtn = m_Driver.findElement(By.xpath("//*[@id='dvOffPayrollWorkerPopup']/div/div/div[1]/button"));

	    closeBtn.click();
	
		Thread.sleep(3000);
		 
		soft. assertFalse(closeBtn.isDisplayed());
		Reporter.log("verifyCloseBtnFormEmailPopUp");
		
		
	}
	
	
	public void verifyCloseBtnPensionXMLPopUp() throws Exception
	{
	
		WebElement closeBtn = m_Driver.findElement(By.xpath("//*[@id='PopUpClose']"));

	    closeBtn.click();
	
		Thread.sleep(3000);
		 
		soft. assertFalse(closeBtn.isDisplayed());
		Reporter.log("verifyCloseBtnPensionXMLPopUp");
		
		
	}
	
	
	public void verifyCancelBtnPensionPopUp() throws Exception
	{
		
			

			WebElement cancel = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_lnkbtnClosePopup']"));

		     cancel.click();
		
			Thread.sleep(5000);
			boolean close = m_Driver.findElement(By.xpath("//*[@id='cboxCloseNetPay']")).isDisplayed();
				 
			soft. assertFalse(close);
		
			Thread.sleep(2000);
			
			Reporter.log("verifyCancelBtnPensionPopUp");
			
		
	
	}
	
	
	public void verifyCloseBtnPensionNetPayPopUp() throws Exception
	{
	
		WebElement closeBtn = m_Driver.findElement(By.xpath("//*[@id='cboxCloseNetPay']"));

	    closeBtn.click();
	
		Thread.sleep(3000);
		 
		soft. assertFalse(closeBtn.isDisplayed());
		Reporter.log("verifyCloseBtnPensionNetPayPopUp");
		
		
	}
	
	   public void asserAll()
	   {
		   soft.assertAll();
		   
	   }
	
	
	
}
