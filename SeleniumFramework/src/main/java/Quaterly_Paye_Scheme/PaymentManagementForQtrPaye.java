package Quaterly_Paye_Scheme;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ExcelData;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/c8cee4c9-2bf5-4b28-bc44-ec0fdddb3880
@TestModellerModule(guid = "c8cee4c9-2bf5-4b28-bc44-ec0fdddb3880")
public class PaymentManagementForQtrPaye extends BasePage
{
	
	static float total_taxPaid=0;
	static float monthtax1=0;
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;
	
	public PaymentManagementForQtrPaye (WebDriver driver)
	{
		super(driver);
	}


	
	private By SelectPaymentManagementYesElem = By.xpath("//INPUT[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rbPaymentManagement_0']");

	private By clickSaveElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSave']");

	private By gotoTaxPaymentElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPaymentManagement']");

	private By clickHMRCPaymentsMadeElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_lnkHMRCPaymentsMade']");

	private By EnterNICActualPaidAmountElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl02_txtNICActualPaidAmount']");

	private By clickSave_1Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']");

	private By DownloadExport_to_PDFElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_Lnkbtnpdf']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/PaymentManagementDashboard.aspx?PayrollCompanyCode=11982");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/PaymentManagementDashboard.aspx?PayrollCompanyCode=11982");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/PaymentManagementDashboard.aspx?PayrollCompanyCode=11982");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/PaymentManagementDashboard.aspx?PayrollCompanyCode=11982";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/PaymentManagementDashboard.aspx?PayrollCompanyCode=11982")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click SelectPaymentManagementYes
	 * @throws InterruptedException 
     * @name Click SelectPaymentManagementYes
     */
	public void Click_SelectPaymentManagementYes() throws InterruptedException
	{
        
		WebElement elem = getWebElement(SelectPaymentManagementYesElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SelectPaymentManagementYes", "Click_SelectPaymentManagementYes failed. Unable to locate object: " + SelectPaymentManagementYesElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SelectPaymentManagementYes", "Click_SelectPaymentManagementYes failed. Unable to locate object: " + SelectPaymentManagementYesElem.toString());

			Assert.fail("Unable to locate object: " + SelectPaymentManagementYesElem.toString());
        }

		elem.click();
          	Thread.sleep(2000);

		ExtentReportManager.passStep(m_Driver, "Click_SelectPaymentManagementYes");

		TestModellerLogger.PassStep(m_Driver, "Click_SelectPaymentManagementYes");
	}

     
	/**
 	 * Click clickSave
	 * @throws InterruptedException 
     * @name Click clickSave
     */
	public void Click_clickSave() throws InterruptedException
	{
        
		WebElement elem = getWebElement(clickSaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickSave", "Click_clickSave failed. Unable to locate object: " + clickSaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickSave", "Click_clickSave failed. Unable to locate object: " + clickSaveElem.toString());

			Assert.fail("Unable to locate object: " + clickSaveElem.toString());
        }

		elem.click();
		Thread.sleep(5000);	

		ExtentReportManager.passStep(m_Driver, "Click_clickSave");

		TestModellerLogger.PassStep(m_Driver, "Click_clickSave");
	}

     
	/**
 	 * Click gotoTaxPayment
     * @name Click gotoTaxPayment
     */
	public void Click_gotoTaxPayment()
	{
        
		WebElement elem = getWebElement(gotoTaxPaymentElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoTaxPayment", "Click_gotoTaxPayment failed. Unable to locate object: " + gotoTaxPaymentElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoTaxPayment", "Click_gotoTaxPayment failed. Unable to locate object: " + gotoTaxPaymentElem.toString());

			Assert.fail("Unable to locate object: " + gotoTaxPaymentElem.toString());
        }

		//elem.click();
          jsExec.executeScript("arguments[0].click();", elem);	
          
          System.out.println("I'm clicked gototaxpayment");

		ExtentReportManager.passStep(m_Driver, "Click_gotoTaxPayment");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoTaxPayment");
	}

     
	/**
 	 * Click clickHMRCPaymentsMade
	 * @throws InterruptedException 
     * @name Click clickHMRCPaymentsMade
     */
	public void Click_clickHMRCPaymentsMade() throws InterruptedException
	{
        
		WebElement elem = getWebElement(clickHMRCPaymentsMadeElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickHMRCPaymentsMade", "Click_clickHMRCPaymentsMade failed. Unable to locate object: " + clickHMRCPaymentsMadeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickHMRCPaymentsMade", "Click_clickHMRCPaymentsMade failed. Unable to locate object: " + clickHMRCPaymentsMadeElem.toString());

			Assert.fail("Unable to locate object: " + clickHMRCPaymentsMadeElem.toString());
        }

		elem.click();
//		m_Driver.findElement(By.xpath("//INPUT[@type='text'][@value!='2010.64']")).clear();
//        	m_Driver.findElement(By.xpath("//INPUT[@type='text'][@value!='2010.64']")).sendKeys("");
		Thread.sleep(2000);
		 System.out.println("I'm clicked HMRC paymntMade");
		
	//	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));
//		int size=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_divMonths']/div")).size();
//		
//		System.out.println(size);
		
//		for(int i=size;i<=size;i++)
//		{
//			System.out.println("Hello"+i);
//			WebElement wb=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_divMonths']/div["+i+"]/div/div/div[2]"));
//			Thread.sleep(1000);
//			jsExec.executeScript("arguments[0].value='100';", wb);
			//int a=1000;
//			jsExec.executeScript("document.getElementById('firstName').value='1000'");
			
//			m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_divMonths']/div["+i+"]/div/div/div[2]")).sendKeys(Keys.DELETE);
//			Thread.sleep(1000);
//			m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_divMonths']/div["+i+"]/div/div/div[2]")).sendKeys(String.valueOf(1000));

			
			
			//value1.sendKeys(Keys.ENTER);
			//value1.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
//			m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_divMonths']/div["+i+"]/div/div/div[2]")).clear();
//			int value=1000;
//			jsExec.executeScript("arguments[0].value='"+ value +"';", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_divMonths']/div[\"+i+\"]/div/div/div[2]")));
	//	}
		
		
	//	m_Driver.switchTo().defaultContent();
		
		
		
		ExtentReportManager.passStep(m_Driver, "Click_clickHMRCPaymentsMade");

		TestModellerLogger.PassStep(m_Driver, "Click_clickHMRCPaymentsMade");
	}

      
	/**
 	 * Enter EnterNICActualPaidAmount
     * @name Enter EnterNICActualPaidAmount
     */
 	public void Enter_EnterNICActualPaidAmount(String EnterNICActualPaidAmount)
 	{
 	    
 		sTestCaseID="TC37";
        Sheet="Sheet1";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
 		
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(EnterNICActualPaidAmountElem);

		if (elem == null) {
   		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterNICActualPaidAmount", "Enter_EnterNICActualPaidAmount failed. Unable to locate object: " + EnterNICActualPaidAmountElem.toString());

   		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterNICActualPaidAmount", "Enter_EnterNICActualPaidAmount failed. Unable to locate object: " + EnterNICActualPaidAmountElem.toString());

			Assert.fail("Unable to locate object: " + EnterNICActualPaidAmountElem.toString());
         }
		System.out.println("I'm swithced");
		elem.click();
		elem.clear();
 		elem.sendKeys(EnterNICActualPaidAmount);
 	//	jsExec.executeScript("arguments[0].click();", elem);
		m_Driver.switchTo().defaultContent();

		String date=data[6];
	     	System.out.println("date value is :"+date);
	      	String month=date.replaceAll("[^0-9]", "");
	      	String value="30092020";
	      	int monthvalue=0;
	      	String Augvalue="30082020";
	      	if(month==value || month==Augvalue)
	      	{
			      	 monthvalue =Integer.parseInt(month);
			      	monthvalue=monthvalue/10000;
			      	monthvalue=monthvalue%10;
	      	}
	      	else
	      	{
	      		 monthvalue =Integer.parseInt(month);
		      	monthvalue=monthvalue/10000;
		      	monthvalue=monthvalue%100;
		      	System.out.println("This is another month value"+monthvalue);
	      	}
	      	
	      	//int count=m_Driver.findElements(By.xpath("//tbody/tr/td[16]")).size();
	      	
	      	
	      	if(monthvalue==01)
	      	{
	      		for(int i=1; i<=10;i++)
		      	{
		      		String paidtax=m_Driver.findElement(By.xpath("//*[@class='table table-head-bg']/tbody/tr["+i+"]/td[16]")).getText();
		      		String paidtaxIstr=paidtax.replaceAll("[^0-9]", "");
		          	
		      		float paidtaxnum = Float.parseFloat(paidtaxIstr);
		      		paidtaxnum=paidtaxnum/100;
		      		
		      		total_taxPaid=total_taxPaid+paidtaxnum;
		      	}
	      		
	      		for(int i=10; i<=10;i++)
		      	{
		      		String monthtax=m_Driver.findElement(By.xpath("//*[@class='table table-head-bg']/tbody/tr["+i+"]/td[16]")).getText();
		      		String monthtaxIstr=monthtax.replaceAll("[^0-9]", "");
		          	
		      		float monthtaxnum = Float.parseFloat(monthtaxIstr);
		      		monthtaxnum=monthtaxnum/100;
		      		
		      		monthtax1=monthtax1+monthtaxnum;
		      	}
	      		
	      	}
	      	else if(monthvalue==02)
	      	{
	      		for(int i=1; i<=11;i++)
		      	{
		      		String paidtax=m_Driver.findElement(By.xpath("//*[@class='table table-head-bg']/tbody/tr["+i+"]/td[16]")).getText();
		      		String paidtaxIstr=paidtax.replaceAll("[^0-9]", "");
		          	
		      		float paidtaxnum = Float.parseFloat(paidtaxIstr);
		      		paidtaxnum=paidtaxnum/100;
		      		
		      		total_taxPaid=total_taxPaid+paidtaxnum;
		      	}
	      		
	      		for(int i=11; i<=11;i++)
		      	{
		      		String monthtax=m_Driver.findElement(By.xpath("//*[@class='table table-head-bg']/tbody/tr["+i+"]/td[16]")).getText();
		      		String monthtaxIstr=monthtax.replaceAll("[^0-9]", "");
		          	
		      		float monthtaxnum = Float.parseFloat(monthtaxIstr);
		      		monthtaxnum=monthtaxnum/100;
		      		
		      		monthtax1=monthtax1+monthtaxnum;
		      	}
	      		
	      	}
	      	else if(monthvalue==03)
	      	{
	      		for(int i=1; i<=12;i++)
		      	{
		      		String paidtax=m_Driver.findElement(By.xpath("//*[@class='table table-head-bg']/tbody/tr["+i+"]/td[16]")).getText();
		      		String paidtaxIstr=paidtax.replaceAll("[^0-9]", "");
		          	
		      		float paidtaxnum = Float.parseFloat(paidtaxIstr);
		      		paidtaxnum=paidtaxnum/100;
		      		
		      		total_taxPaid=total_taxPaid+paidtaxnum;
		      	}
	      		
	      		for(int i=12; i<=12;i++)
		      	{
		      		String monthtax=m_Driver.findElement(By.xpath("//*[@class='table table-head-bg']/tbody/tr["+i+"]/td[16]")).getText();
		      		String monthtaxIstr=monthtax.replaceAll("[^0-9]", "");
		          	
		      		float monthtaxnum = Float.parseFloat(monthtaxIstr);
		      		monthtaxnum=monthtaxnum/100;
		      		
		      		monthtax1=monthtax1+monthtaxnum;
		      	}
	      		
	      	}
	      	
	      	
	      	else
	      	{
	      			for(int i=1; i<monthvalue-3;i++)
			      	{
			      		String paidtax=m_Driver.findElement(By.xpath("//*[@class='table table-head-bg']/tbody/tr["+i+"]/td[16]")).getText();
			      		String paidtaxIstr=paidtax.replaceAll("[^0-9]", "");
			          	
			      		float paidtaxnum = Float.parseFloat(paidtaxIstr);
			      		paidtaxnum=paidtaxnum/100;
			      		
			      		total_taxPaid=total_taxPaid+paidtaxnum;
			      	}
	      			
	      			for(int i=monthvalue-3; i<=monthvalue-3;i++)
			      	{
			      		String monthtax=m_Driver.findElement(By.xpath("//*[@class='table table-head-bg']/tbody/tr["+i+"]/td[16]")).getText();
			      		String monthtaxIstr=monthtax.replaceAll("[^0-9]", "");
			          	
			      		float monthtaxnum = Float.parseFloat(monthtaxIstr);
			      		monthtaxnum=monthtaxnum/100;
			      		
			      		monthtax1=monthtax1+monthtaxnum;
			      		System.out.println("monthtax1"+monthtax1);
			      	}
	      	}     	
	      	
	      	
	      	
		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterNICActualPaidAmount " + EnterNICActualPaidAmount);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterNICActualPaidAmount " + EnterNICActualPaidAmount);
  		
  		//return total_taxPaid ;
 	}
 	
 	
	/**
 	 * Enter EnterNICActualPaidAmount
     * @name Enter EnterNICActualPaidAmount
     */
 	public void Enter_EnterNICActualPaidAmount1(String EnterNICActualPaidAmount)
 	{
 	    
 		sTestCaseID="TC37";
        Sheet="Sheet1";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
 		
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(EnterNICActualPaidAmountElem);

		if (elem == null) {
   		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterNICActualPaidAmount", "Enter_EnterNICActualPaidAmount failed. Unable to locate object: " + EnterNICActualPaidAmountElem.toString());

   		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterNICActualPaidAmount", "Enter_EnterNICActualPaidAmount failed. Unable to locate object: " + EnterNICActualPaidAmountElem.toString());

			Assert.fail("Unable to locate object: " + EnterNICActualPaidAmountElem.toString());
         }
		System.out.println("I'm swithced");
		elem.click();
		elem.clear();
 		elem.sendKeys(EnterNICActualPaidAmount);
 	//	jsExec.executeScript("arguments[0].click();", elem);
		m_Driver.switchTo().defaultContent();

//		String date=data[6];
//	     	System.out.println("date value is :"+date);
//	      	String month=date.replaceAll("[^0-9]", "");
//	      	String value="30092020";
//	      	int monthvalue=0;
//	      	String Augvalue="30082020";
//	      	if(month==value || month==Augvalue)
//	      	{
//			      	 monthvalue =Integer.parseInt(month);
//			      	monthvalue=monthvalue/10000;
//			      	monthvalue=monthvalue%10;
//	      	}
//	      	else
//	      	{
//	      		 monthvalue =Integer.parseInt(month);
//		      	monthvalue=monthvalue/10000;
//		      	monthvalue=monthvalue%100;
//		      	System.out.println("This is another month value"+monthvalue);
//	      	}
//	      	
//	      	//int count=m_Driver.findElements(By.xpath("//tbody/tr/td[16]")).size();
//	      	
//	      	
//	      	if(monthvalue==01)
//	      	{
//	      		for(int i=1; i<=10;i++)
//		      	{
//		      		String paidtax=m_Driver.findElement(By.xpath("//*[@class='table table-head-bg']/tbody/tr["+i+"]/td[16]")).getText();
//		      		String paidtaxIstr=paidtax.replaceAll("[^0-9]", "");
//		          	
//		      		float paidtaxnum = Float.parseFloat(paidtaxIstr);
//		      		paidtaxnum=paidtaxnum/100;
//		      		
//		      		total_taxPaid=total_taxPaid+paidtaxnum;
//		      	}
//	      		
//	      		for(int i=10; i<=10;i++)
//		      	{
//		      		String monthtax=m_Driver.findElement(By.xpath("//*[@class='table table-head-bg']/tbody/tr["+i+"]/td[16]")).getText();
//		      		String monthtaxIstr=monthtax.replaceAll("[^0-9]", "");
//		          	
//		      		float monthtaxnum = Float.parseFloat(monthtaxIstr);
//		      		monthtaxnum=monthtaxnum/100;
//		      		
//		      		monthtax1=monthtax1+monthtaxnum;
//		      	}
//	      		
//	      	}
//	      	else if(monthvalue==02)
//	      	{
//	      		for(int i=1; i<=11;i++)
//		      	{
//		      		String paidtax=m_Driver.findElement(By.xpath("//*[@class='table table-head-bg']/tbody/tr["+i+"]/td[16]")).getText();
//		      		String paidtaxIstr=paidtax.replaceAll("[^0-9]", "");
//		          	
//		      		float paidtaxnum = Float.parseFloat(paidtaxIstr);
//		      		paidtaxnum=paidtaxnum/100;
//		      		
//		      		total_taxPaid=total_taxPaid+paidtaxnum;
//		      	}
//	      		
//	      		for(int i=11; i<=11;i++)
//		      	{
//		      		String monthtax=m_Driver.findElement(By.xpath("//*[@class='table table-head-bg']/tbody/tr["+i+"]/td[16]")).getText();
//		      		String monthtaxIstr=monthtax.replaceAll("[^0-9]", "");
//		          	
//		      		float monthtaxnum = Float.parseFloat(monthtaxIstr);
//		      		monthtaxnum=monthtaxnum/100;
//		      		
//		      		monthtax1=monthtax1+monthtaxnum;
//		      	}
//	      		
//	      	}
//	      	else if(monthvalue==03)
//	      	{
//	      		for(int i=1; i<=12;i++)
//		      	{
//		      		String paidtax=m_Driver.findElement(By.xpath("//*[@class='table table-head-bg']/tbody/tr["+i+"]/td[16]")).getText();
//		      		String paidtaxIstr=paidtax.replaceAll("[^0-9]", "");
//		          	
//		      		float paidtaxnum = Float.parseFloat(paidtaxIstr);
//		      		paidtaxnum=paidtaxnum/100;
//		      		
//		      		total_taxPaid=total_taxPaid+paidtaxnum;
//		      	}
//	      		
//	      		for(int i=12; i<=12;i++)
//		      	{
//		      		String monthtax=m_Driver.findElement(By.xpath("//*[@class='table table-head-bg']/tbody/tr["+i+"]/td[16]")).getText();
//		      		String monthtaxIstr=monthtax.replaceAll("[^0-9]", "");
//		          	
//		      		float monthtaxnum = Float.parseFloat(monthtaxIstr);
//		      		monthtaxnum=monthtaxnum/100;
//		      		
//		      		monthtax1=monthtax1+monthtaxnum;
//		      	}
//	      		
//	      	}
//	      	
//	      	
//	      	else
//	      	{
//	      			for(int i=1; i<monthvalue-3;i++)
//			      	{
//			      		String paidtax=m_Driver.findElement(By.xpath("//*[@class='table table-head-bg']/tbody/tr["+i+"]/td[16]")).getText();
//			      		String paidtaxIstr=paidtax.replaceAll("[^0-9]", "");
//			          	
//			      		float paidtaxnum = Float.parseFloat(paidtaxIstr);
//			      		paidtaxnum=paidtaxnum/100;
//			      		
//			      		total_taxPaid=total_taxPaid+paidtaxnum;
//			      	}
//	      			
//	      			for(int i=monthvalue-3; i<=monthvalue-3;i++)
//			      	{
//			      		String monthtax=m_Driver.findElement(By.xpath("//*[@class='table table-head-bg']/tbody/tr["+i+"]/td[16]")).getText();
//			      		String monthtaxIstr=monthtax.replaceAll("[^0-9]", "");
//			          	
//			      		float monthtaxnum = Float.parseFloat(monthtaxIstr);
//			      		monthtaxnum=monthtaxnum/100;
//			      		
//			      		monthtax1=monthtax1+monthtaxnum;
//			      		System.out.println("monthtax1"+monthtax1);
//			      	}
//	      	}     	
//	      	
	      	
	      	
		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterNICActualPaidAmount " + EnterNICActualPaidAmount);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterNICActualPaidAmount " + EnterNICActualPaidAmount);
  		
  		//return total_taxPaid ;
 	}
 	
 	
 	public float PaidtaxAmount()
 	{
 		System.out.println("return paid tax amount="+total_taxPaid);
		return total_taxPaid;
 	}
 	
 	public static float monthtaxamount()
 	{
 		System.out.println("single month tax"+monthtax1);
 		return monthtax1;
 		
 	}

     
	/**
 	 * Click clickSave
	 * @throws InterruptedException 
     * @name Click clickSave
     */
	public void Click_clickSave_1() throws InterruptedException
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(clickSave_1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickSave_1", "Click_clickSave_1 failed. Unable to locate object: " + clickSave_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickSave_1", "Click_clickSave_1 failed. Unable to locate object: " + clickSave_1Elem.toString());

			Assert.fail("Unable to locate object: " + clickSave_1Elem.toString());
        }
		Thread.sleep(1000);
		//elem.click();
		jsExec.executeScript("arguments[0].click();", elem);
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_clickSave_1");

		TestModellerLogger.PassStep(m_Driver, "Click_clickSave_1");
	}

     
	/**
 	 * Click DownloadExport to PDF
     * @name Click DownloadExport to PDF
     */
	public void Click_DownloadExport_to_PDF()
	{
        
		WebElement elem = getWebElement(DownloadExport_to_PDFElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_DownloadExport_to_PDF", "Click_DownloadExport_to_PDF failed. Unable to locate object: " + DownloadExport_to_PDFElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_DownloadExport_to_PDF", "Click_DownloadExport_to_PDF failed. Unable to locate object: " + DownloadExport_to_PDFElem.toString());

			Assert.fail("Unable to locate object: " + DownloadExport_to_PDFElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_DownloadExport_to_PDF");

		TestModellerLogger.PassStep(m_Driver, "Click_DownloadExport_to_PDF");
	}
}