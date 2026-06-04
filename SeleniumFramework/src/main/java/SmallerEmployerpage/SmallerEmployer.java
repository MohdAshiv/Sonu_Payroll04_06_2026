package SmallerEmployerpage;

import pages.BasePage;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.text.DecimalFormat;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/8e7160d2-5a88-4aa8-acf1-469a21362799
@TestModellerModule(guid = "8e7160d2-5a88-4aa8-acf1-469a21362799")
public class SmallerEmployer extends BasePage
{
	static double total_liability;
	static double Expected_liability=45000;
	static double parenting_pay;
	static double parenting_pay_recoverd;
	static double SPP_Recovery;
	static double SPP_Compensation;
	WebElement textArea1;
	
	 
	
	public SmallerEmployer (WebDriver driver)
	{
		super(driver);
	}


	private By gotoPayrollDashboardElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPayroll']");
	
	private By clickAllowances_SchemesElem = By.xpath("//A[contains(text(),'Allowances & Schemes')]");

	private By selectYestosmallERElem = By.xpath("//INPUT[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rbSmallEmployer_0']");

	private By selectNotosmallERElem = By.xpath("//INPUT[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rbSmallEmployer_1']");

	private By clickSaveElem = By.xpath("//A[@id='btnSave']");

	private By _Tax_Payment_Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPaymentManagement']");

	private By selectTaxYearElem = By.xpath("//label[contains(.,'Tax Year:')]/../select");

	private By clickStatPayamountElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec_ctl02_hyprlnkStatutoryPayRecovery']");

	private By getMonthElem = By.xpath("//TD[contains(text(),'30 Apr 2021')]");

	private By getParentingPayElem = By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/table/tbody/tr[2]/td[2]");

	private By getParentingPayrecoveryElem = By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/table/tbody/tr[2]/td[3]");

	private By getParenting_Pay_NIC_CompensationElem = By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/table/tbody/tr[2]/td[4]");
	
	private By gotoReportsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefReports']");
	
	private By clickPayrollSummaryElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefPayrollSummary']");
	
	private By getSMPSSPRecoveryElem = By.xpath("//*[text()='SMP/SPP Recovery']");

	private By getSMPSPPCompensationElem = By.xpath("//*[text()='SMP/SPP Compensation']");

	private By gotoFiling_ManagementElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefFilingMangment']");

//	private By clickFPSElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl12_lnkTaxReturnType']");
	
	private By getXMLDataElem = By.xpath("//TEXTAREA[@name='ctl00$ctl00$ParentContent$cPH$txtData']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportStatutoryPayRecovery.aspx?PayrollCompanyCode=12125");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportStatutoryPayRecovery.aspx?PayrollCompanyCode=12125");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportStatutoryPayRecovery.aspx?PayrollCompanyCode=12125");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportStatutoryPayRecovery.aspx?PayrollCompanyCode=12125";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportStatutoryPayRecovery.aspx?PayrollCompanyCode=12125")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click clickAllowances & Schemes
     * @name Click clickAllowances & Schemes
     */
	public void Click_clickAllowances_Schemes()
	{
        
		WebElement elem = getWebElement(clickAllowances_SchemesElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickAllowances_Schemes", "Click_clickAllowances_Schemes failed. Unable to locate object: " + clickAllowances_SchemesElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickAllowances_Schemes", "Click_clickAllowances_Schemes failed. Unable to locate object: " + clickAllowances_SchemesElem.toString());

			Assert.fail("Unable to locate object: " + clickAllowances_SchemesElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickAllowances_Schemes");

		TestModellerLogger.PassStep(m_Driver, "Click_clickAllowances_Schemes");
	}

     
	/**
 	 * Click selectYestosmallER
	 * @throws InterruptedException 
     * @name Click selectYestosmallER
     */
	public void Click_selectYestosmallER() throws InterruptedException
	{
        
		WebElement elem = getWebElement(selectYestosmallERElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_selectYestosmallER", "Click_selectYestosmallER failed. Unable to locate object: " + selectYestosmallERElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_selectYestosmallER", "Click_selectYestosmallER failed. Unable to locate object: " + selectYestosmallERElem.toString());

			Assert.fail("Unable to locate object: " + selectYestosmallERElem.toString());
        }

		elem.click();
		
		Thread.sleep(3000);
		
	
		
		if(total_liability>Expected_liability)
		{
			String ActualMessageelse=m_Driver.findElement(By.xpath("//*[@id='dvSmallEmployersReliefAlertMessage']/div")).getText();
			System.out.println("ActualMessageelse="+ActualMessageelse);
			String ExpectedMessageesle="Warning! As per HMRC rules, you are not eligible for small employer relief as previous year employer & employee NI is greater than £45000.";
			
			
			
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click_selectYestosmallER");

		TestModellerLogger.PassStep(m_Driver, "Click_selectYestosmallER");
	}
	
	
	/**
 	 * Click selectYestosmallER
	 * @throws InterruptedException 
     * @name Click selectYestosmallER
     */
	public void Click_selectYestosmallER1() throws InterruptedException
	{
        
		WebElement elem = getWebElement(selectYestosmallERElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_selectYestosmallER", "Click_selectYestosmallER failed. Unable to locate object: " + selectYestosmallERElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_selectYestosmallER", "Click_selectYestosmallER failed. Unable to locate object: " + selectYestosmallERElem.toString());

			Assert.fail("Unable to locate object: " + selectYestosmallERElem.toString());
        }

		elem.click();
		
		Thread.sleep(3000);
		
	
		
//		if(total_liability>Expected_liability)
//		{
//			String ActualMessageelse=m_Driver.findElement(By.xpath("//*[@id='dvSmallEmployersReliefAlertMessage']/div")).getText();
//			System.out.println("ActualMessageelse="+ActualMessageelse);
//			String ExpectedMessageesle="Warning! As per HMRC rules, you are not eligible for small employer relief as previous year employer & employee NI is greater than £45000.";
//			
//			assertEquals(ActualMessageelse, ExpectedMessageesle);
//			
//		}
//          	

		ExtentReportManager.passStep(m_Driver, "Click_selectYestosmallER");

		TestModellerLogger.PassStep(m_Driver, "Click_selectYestosmallER");
	}

     
	/**
 	 * Click selectNotosmallER
     * @name Click selectNotosmallER
     */
	public void Click_selectNotosmallER()
	{
        
		WebElement elem = getWebElement(selectNotosmallERElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_selectNotosmallER", "Click_selectNotosmallER failed. Unable to locate object: " + selectNotosmallERElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_selectNotosmallER", "Click_selectNotosmallER failed. Unable to locate object: " + selectNotosmallERElem.toString());

			Assert.fail("Unable to locate object: " + selectNotosmallERElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_selectNotosmallER");

		TestModellerLogger.PassStep(m_Driver, "Click_selectNotosmallER");
	}

     
	/**
 	 * Click clickSave
	 * @throws Exception 
	 * @name Click clickSave
     */
	public void Click_clickSave() throws Exception
	{
        
		WebElement elem = getWebElement(clickSaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickSave", "Click_clickSave failed. Unable to locate object: " + clickSaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickSave", "Click_clickSave failed. Unable to locate object: " + clickSaveElem.toString());

			Assert.fail("Unable to locate object: " + clickSaveElem.toString());
        }

		elem.click();
		
		Thread.sleep(2000);
		
	
			String ActualMessage=m_Driver.findElement(By.xpath("//*[@class='alert alert-success']")).getText();
			System.out.println("ActualMessage="+ActualMessage);
			String ExpectedMessage="Success! Company record is updated successfully.";
			assertEquals(ActualMessage, ExpectedMessage);
	
		
	
		
		TakeScreenshot.takeScreenshot(m_Driver, "MessageofsmallerEmployer");
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickSave");

		TestModellerLogger.PassStep(m_Driver, "Click_clickSave");
	}
	
	
	
	/**
 	 * Click clickSave
	 * @throws Exception 
	 * @name Click clickSave
     */
	public void Click_clickSave1() throws Exception
	{
        
		WebElement elem = getWebElement(clickSaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickSave", "Click_clickSave failed. Unable to locate object: " + clickSaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickSave", "Click_clickSave failed. Unable to locate object: " + clickSaveElem.toString());

			Assert.fail("Unable to locate object: " + clickSaveElem.toString());
        }

		elem.click();
		
		Thread.sleep(2000);
		
//		if(total_liability<Expected_liability)
//		{
			String ActualMessage=m_Driver.findElement(By.xpath("//*[@class='alert alert-success']")).getText();
			System.out.println("ActualMessage="+ActualMessage);
			String ExpectedMessage="Success! Company record is updated successfully.";
			assertEquals(ActualMessage, ExpectedMessage);
//		}
//		
//		else
//		{
//			String ActualMessageelse=m_Driver.findElement(By.xpath("//*[@class='alert alert-success']")).getText();
//			System.out.println("ActualMessageelse="+ActualMessageelse);
//			String ExpectedMessageesle="Warning! As per HMRC rule, you are not eligible for small employer relief as previous year employer & employee NI is greater than £45000.";
//			
//			//assertEquals(ActualMessageelse, ExpectedMessageesle);
//			
//		}
//		
//		TakeScreenshot.takeScreenshot(m_Driver, "MessageofsmallerEmployer");
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickSave");

		TestModellerLogger.PassStep(m_Driver, "Click_clickSave");
	}

     
	/**
 	 * Click  Tax Payment 
     * @name Click  Tax Payment 
     */
	public void Click__Tax_Payment_()
	{
        
		WebElement elem = getWebElement(_Tax_Payment_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Tax_Payment_", "Click__Tax_Payment_ failed. Unable to locate object: " + _Tax_Payment_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Tax_Payment_", "Click__Tax_Payment_ failed. Unable to locate object: " + _Tax_Payment_Elem.toString());

			Assert.fail("Unable to locate object: " + _Tax_Payment_Elem.toString());
        }

		//elem.click();
		
		jsExec.executeScript("arguments[0].click();", elem);
          	

		ExtentReportManager.passStep(m_Driver, "Click__Tax_Payment_");

		TestModellerLogger.PassStep(m_Driver, "Click__Tax_Payment_");
	}

	
	
/**
 * Calculate last tax year liability
 * 	
 */
	
	public void lastyearliability()
	{
		int length=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr/td[3]")).size();
		for(int i=length;i<=length;i++)
		{
			String totalEE_NI=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr["+i+"]/td[1]")).getText();
			
			String totalER_NI=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr["+i+"]/td[2]")).getText();
			
			String totalEE_NIstr=totalEE_NI.replaceAll("[£]", "");
			totalEE_NIstr=totalEE_NIstr.replaceAll("[,]", "");
			double totalEE_NInumber = Double.parseDouble(totalEE_NIstr);
			
			
			String totalER_NIstr=totalER_NI.replaceAll("[£]", "");
			totalER_NIstr=totalER_NIstr.replaceAll("[,]", "");
			double totalER_NInumber = Double.parseDouble(totalER_NIstr);
			
			total_liability=totalER_NInumber+totalEE_NInumber;
			System.out.println("total_liability="+total_liability);
			//Expected_liability=16734.23;
			
			//assertEquals(total_liability, Expected_liability);
			
		
		
		}
			
	}
	
	
	
    
	/**
 	 * Select selectTaxYear
     * @name Select selectTaxYear
     */
    public void Select_selectTaxYear(String selectTaxYear)
 	{
 	    
 		WebElement elem = getWebElement(selectTaxYearElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_selectTaxYear", "Select_selectTaxYear failed. Unable to locate object: " + selectTaxYearElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_selectTaxYear", "Select_selectTaxYear failed. Unable to locate object: " + selectTaxYearElem.toString());

 			Assert.fail("Unable to locate object: " + selectTaxYearElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(selectTaxYear);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_selectTaxYear " + selectTaxYear);

 		TestModellerLogger.PassStep(m_Driver, "Select_selectTaxYear " + selectTaxYear);
 	}

     
	/**
 	 * Click clickStatPayamount
     * @name Click clickStatPayamount
     */
	public void Click_clickStatPayamount()
	{
        
		WebElement elem = getWebElement(clickStatPayamountElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickStatPayamount", "Click_clickStatPayamount failed. Unable to locate object: " + clickStatPayamountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickStatPayamount", "Click_clickStatPayamount failed. Unable to locate object: " + clickStatPayamountElem.toString());

			Assert.fail("Unable to locate object: " + clickStatPayamountElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickStatPayamount");

		TestModellerLogger.PassStep(m_Driver, "Click_clickStatPayamount");
	}
	
	
	/**
	 * Calculating and verifying Parenting Pay Recovered
	 * 
	 */
	
	
	public void verifyparenting_pay_recoverd()
	{
		
		DecimalFormat df = new DecimalFormat("##.00");
		df.setMaximumFractionDigits(2);
		int length=m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/table/tbody/tr/td[2]")).size();
		if(total_liability<Expected_liability)
		{
			for(int i=2;i<=length;i++)
			{
				String str=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/table/tbody/tr["+i+"]/td[2]")).getText();
				if(!str.equalsIgnoreCase("£0.00"))
				{
					String Parentingstr=str.replaceAll("[£]", "");
					Parentingstr=Parentingstr.replaceAll("[,]", "");
					double Parenting_num = Double.parseDouble(Parentingstr);
					Parenting_num=Parenting_num*103;
					Parenting_num=Parenting_num/100;
					
					df.format(Parenting_num);
					System.out.println("Parenting_num="+Parenting_num);
					
					//Parenting pay recoverd
					String PPR=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/table/tbody/tr["+i+"]/td[3]")).getText();
					String PPRstr=PPR.replaceAll("[£]", "");
					PPRstr=PPRstr.replaceAll("[,]", "");
					double PPR_num = Double.parseDouble(PPRstr);
					df.format(PPR_num);
					System.out.println("PPR_num="+PPR_num);
					
					String PPNC=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/table/tbody/tr["+i+"]/td[4]")).getText();
					String PPNCstr=PPNC.replaceAll("[£]", "");
					PPNCstr=PPNCstr.replaceAll("[,]", "");
					double PPNC_num = Double.parseDouble(PPNCstr);
					df.format(PPNC_num);
					System.out.println("PPNC_num="+PPNC_num);
					double ActualPPNC=PPNC_num;
					
					
					double ExpectedPPNC=Parenting_num-PPR_num;
					ExpectedPPNC=(double) (Math.round(ExpectedPPNC *100)/100.0);
			//		ExpectedPPNC=ExpectedPPNC/100;
			//		ExpectedPPNC=ExpectedPPNC*100;
					System.out.println("ExpectedPPNC="+ExpectedPPNC);
					assertEquals(ActualPPNC, ExpectedPPNC);
				
				}
				
				
			}
		}
		else
		{
			System.out.println("Amount is not as expected");
		}
	}
	
	
	/**
	 * Calculating and verifying Parenting Pay Recovered
	 * 
	 */
	
	
	public void verifyparenting_pay_recoverd1()
	{
		
		DecimalFormat df = new DecimalFormat("##.00");
		df.setMaximumFractionDigits(2);
		int length=m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/table/tbody/tr/td[2]")).size();
		if(total_liability<Expected_liability)
		{
			for(int i=2;i<=length;i++)
			{
				String str=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/table/tbody/tr["+i+"]/td[2]")).getText();
				if(!str.equalsIgnoreCase("£0.00"))
				{
					String Parentingstr=str.replaceAll("[£]", "");
					Parentingstr=Parentingstr.replaceAll("[,]", "");
					double Parenting_num = Double.parseDouble(Parentingstr);
					Parenting_num=Parenting_num*92;
					Parenting_num=Parenting_num/100;
					
					Parenting_num=(double) (Math.round(Parenting_num *100)/100.0);
					
				//	df.format(Parenting_num);
					System.out.println("Parenting_num="+Parenting_num);
					
					//Parenting pay recoverd
					String PPR=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/table/tbody/tr["+i+"]/td[3]")).getText();
					String PPRstr=PPR.replaceAll("[£]", "");
					PPRstr=PPRstr.replaceAll("[,]", "");
					double PPR_num = Double.parseDouble(PPRstr);
					df.format(PPR_num);
					System.out.println("PPR_num="+PPR_num);
					
					String PPNC=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/table/tbody/tr["+i+"]/td[4]")).getText();
					String PPNCstr=PPNC.replaceAll("[£]", "");
					PPNCstr=PPNCstr.replaceAll("[,]", "");
					double PPNC_num = Double.parseDouble(PPNCstr);
					df.format(PPNC_num);
					System.out.println("PPNC_num="+PPNC_num);
					double ActualPPNC=PPNC_num;
					
					
					double ExpectedPPNC=Parenting_num-PPR_num;
					ExpectedPPNC=(double) (Math.round(ExpectedPPNC *100)/100.0);
			//		ExpectedPPNC=ExpectedPPNC/100;
			//		ExpectedPPNC=ExpectedPPNC*100;
					System.out.println("ExpectedPPNC="+ExpectedPPNC);
					assertEquals(ActualPPNC, ExpectedPPNC);
				
				}
				
				
			}
		}
		else
		{
			System.out.println("Amount is not as Expected");
		}
	}
	
	
	public void verifyparenting_pay_recoverd2()
	{
		
		DecimalFormat df = new DecimalFormat("##.00");
		df.setMaximumFractionDigits(2);
		int length=m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div/div/div/table/tbody/tr/td[2]")).size();
		if(total_liability<Expected_liability)
		{
			for(int i=2;i<=length;i++)
			{
				String str=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div/div/div/table/tbody/tr/td[3]")).getText();
				if(!str.equalsIgnoreCase("£0.00"))
				{
//					String Parentingstr=str.replaceAll("[£]", "");
//					Parentingstr=Parentingstr.replaceAll("[,]", "");
//					double Parenting_num = Double.parseDouble(Parentingstr);
//					Parenting_num=Parenting_num*92;
//					Parenting_num=Parenting_num/100;
//					
//					Parenting_num=(double) (Math.round(Parenting_num *100)/100.0);
//					
//				//	df.format(Parenting_num);
//					System.out.println("Parenting_num="+Parenting_num);
					
					//Parenting pay recoverd
					String PPR=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div/div/div/table/tbody/tr/td[3]")).getText();
					String PPRstr=PPR.replaceAll("[£]", "");
					PPRstr=PPRstr.replaceAll("[,]", "");
					double PPR_num = Double.parseDouble(PPRstr);
					
					System.out.println("PPR_num-="+PPR_num);
					SPP_Recovery=PPR_num;
					
					System.out.println("PPR_num="+SPP_Recovery);
//					df.format(PPR_num);
//					System.out.println("PPR_num="+PPR_num);
//					
					String PPNC=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div/div/div/table/tbody/tr/td[4]")).getText();
					String PPNCstr=PPNC.replaceAll("[£]", "");
					PPNCstr=PPNCstr.replaceAll("[,]", "");
					double PPNC_num = Double.parseDouble(PPNCstr);
					SPP_Compensation=PPNC_num;
					System.out.println("PPNC_num="+SPP_Compensation);
					
					
//					df.format(PPNC_num);
//					System.out.println("PPNC_num="+PPNC_num);
//					double ActualPPNC=PPNC_num;
//					
//					
//					double ExpectedPPNC=Parenting_num-PPR_num;
//					ExpectedPPNC=(double) (Math.round(ExpectedPPNC *100)/100.0);
//			//		ExpectedPPNC=ExpectedPPNC/100;
//			//		ExpectedPPNC=ExpectedPPNC*100;
//					System.out.println("ExpectedPPNC="+ExpectedPPNC);
//					assertEquals(ActualPPNC, ExpectedPPNC);
				
				}
				
				
			}
		}
		else
		{
			System.out.println("Amount is not as Expected");
		}
	}
	
	
	public void verifyparenting_pay_recoverd3()
	{
		
		DecimalFormat df = new DecimalFormat("##.00");
		df.setMaximumFractionDigits(2);
		int length=m_Driver.findElements(By.xpath("//main/div/div[3]/div/div[2]/div/div/div/div/table/tbody/tr/td[3]")).size();
		System.out.println("length="+length);
		if(total_liability<Expected_liability)
		{
			for(int i=2;i<=length;i++)
			{
				String str=m_Driver.findElement(By.xpath("//main/div/div[3]/div/div[2]/div/div/div/div/table/tbody/tr["+i+"]/td[3]")).getText();
				if(!str.equalsIgnoreCase("£0.00"))
				{
//					String Parentingstr=str.replaceAll("[£]", "");
//					Parentingstr=Parentingstr.replaceAll("[,]", "");
//					double Parenting_num = Double.parseDouble(Parentingstr);
//					Parenting_num=Parenting_num*92;
//					Parenting_num=Parenting_num/100;
//					
//					Parenting_num=(double) (Math.round(Parenting_num *100)/100.0);
//					
//				//	df.format(Parenting_num);
//					System.out.println("Parenting_num="+Parenting_num);
					
					//Parenting pay recoverd
					String PPR=m_Driver.findElement(By.xpath("//main/div/div[3]/div/div[2]/div/div/div/div/table/tbody/tr["+i+"]/td[3]")).getText();
					String PPRstr=PPR.replaceAll("[£]", "");
					PPRstr=PPRstr.replaceAll("[,]", "");
					double PPR_num = Double.parseDouble(PPRstr);
					
					System.out.println("PPR_num-="+PPR_num);
					SPP_Recovery=PPR_num;
					
					System.out.println("PPR_num="+SPP_Recovery);
//					df.format(PPR_num);
//					System.out.println("PPR_num="+PPR_num);
//					
					String PPNC=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div/div/div/table/tbody/tr["+i+"]/td[4]")).getText();
					String PPNCstr=PPNC.replaceAll("[£]", "");
					PPNCstr=PPNCstr.replaceAll("[,]", "");
					double PPNC_num = Double.parseDouble(PPNCstr);
					SPP_Compensation=PPNC_num;
					System.out.println("PPNC_num="+SPP_Compensation);
					
					
//					df.format(PPNC_num);
//					System.out.println("PPNC_num="+PPNC_num);
//					double ActualPPNC=PPNC_num;
//					
//					
//					double ExpectedPPNC=Parenting_num-PPR_num;
//					ExpectedPPNC=(double) (Math.round(ExpectedPPNC *100)/100.0);
//			//		ExpectedPPNC=ExpectedPPNC/100;
//			//		ExpectedPPNC=ExpectedPPNC*100;
//					System.out.println("ExpectedPPNC="+ExpectedPPNC);
//					assertEquals(ActualPPNC, ExpectedPPNC);
				
				}
				
				
			}
		}
		else
		{
			System.out.println("Amount is not as Expected");
		}
	}

	
	/**
 	 * Click gotoPayrollDashboard
	 * @throws InterruptedException 
     * @name Click gotoPayrollDashboard
     */
	public void Click_gotoPayrollDashboard() throws InterruptedException
	{
        
		WebElement elem = getWebElement(gotoPayrollDashboardElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoPayrollDashboard", "Click_gotoPayrollDashboard failed. Unable to locate object: " + gotoPayrollDashboardElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoPayrollDashboard", "Click_gotoPayrollDashboard failed. Unable to locate object: " + gotoPayrollDashboardElem.toString());

			Assert.fail("Unable to locate object: " + gotoPayrollDashboardElem.toString());
        }
		
		Thread.sleep(2000);

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoPayrollDashboard");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoPayrollDashboard");
	}
	
	
     
	/**
 	 * Click getMonth
     * @name Click getMonth
     */
	public void Click_getMonth()
	{
        
		WebElement elem = getWebElement(getMonthElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getMonth", "Click_getMonth failed. Unable to locate object: " + getMonthElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getMonth", "Click_getMonth failed. Unable to locate object: " + getMonthElem.toString());

			Assert.fail("Unable to locate object: " + getMonthElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_getMonth");

		TestModellerLogger.PassStep(m_Driver, "Click_getMonth");
	}

     
	/**
 	 * Click getParentingPay
     * @name Click getParentingPay
     */
	public void Click_getParentingPay()
	{
        
		WebElement elem = getWebElement(getParentingPayElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getParentingPay", "Click_getParentingPay failed. Unable to locate object: " + getParentingPayElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getParentingPay", "Click_getParentingPay failed. Unable to locate object: " + getParentingPayElem.toString());

			Assert.fail("Unable to locate object: " + getParentingPayElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_getParentingPay");

		TestModellerLogger.PassStep(m_Driver, "Click_getParentingPay");
	}

     
	/**
 	 * Click getParentingPayrecovery
     * @name Click getParentingPayrecovery
     */
	public void Click_getParentingPayrecovery()
	{
        
		WebElement elem = getWebElement(getParentingPayrecoveryElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getParentingPayrecovery", "Click_getParentingPayrecovery failed. Unable to locate object: " + getParentingPayrecoveryElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getParentingPayrecovery", "Click_getParentingPayrecovery failed. Unable to locate object: " + getParentingPayrecoveryElem.toString());

			Assert.fail("Unable to locate object: " + getParentingPayrecoveryElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_getParentingPayrecovery");

		TestModellerLogger.PassStep(m_Driver, "Click_getParentingPayrecovery");
	}

     
	/**
 	 * Click getParenting Pay NIC Compensation
     * @name Click getParenting Pay NIC Compensation
     */
	public void Click_getParenting_Pay_NIC_Compensation()
	{
        
		WebElement elem = getWebElement(getParenting_Pay_NIC_CompensationElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getParenting_Pay_NIC_Compensation", "Click_getParenting_Pay_NIC_Compensation failed. Unable to locate object: " + getParenting_Pay_NIC_CompensationElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getParenting_Pay_NIC_Compensation", "Click_getParenting_Pay_NIC_Compensation failed. Unable to locate object: " + getParenting_Pay_NIC_CompensationElem.toString());

			Assert.fail("Unable to locate object: " + getParenting_Pay_NIC_CompensationElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_getParenting_Pay_NIC_Compensation");

		TestModellerLogger.PassStep(m_Driver, "Click_getParenting_Pay_NIC_Compensation");
	}
	
	
	/**
 	 * Click gotoReports
     * @name Click gotoReports
     */
	public void Click_gotoReports()
	{
        
		WebElement elem = getWebElement(gotoReportsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoReports", "Click_gotoReports failed. Unable to locate object: " + gotoReportsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoReports", "Click_gotoReports failed. Unable to locate object: " + gotoReportsElem.toString());

			Assert.fail("Unable to locate object: " + gotoReportsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoReports");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoReports");
	}
	
	
	/**
 	 * Click clickPayrollSummary
	 * @throws IOException 
     * @name Click clickPayrollSummary
     */
	public void Click_clickPayrollSummary() throws IOException
	{
        
		WebElement elem = getWebElement(clickPayrollSummaryElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clickPayrollSummary", "Click_clickPayrollSummary failed. Unable to locate object: " + clickPayrollSummaryElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clickPayrollSummary", "Click_clickPayrollSummary failed. Unable to locate object: " + clickPayrollSummaryElem.toString());

			Assert.fail("Unable to locate object: " + clickPayrollSummaryElem.toString());
        }

		elem.click();
		
		

	   
          	

		ExtentReportManager.passStep(m_Driver, "Click_clickPayrollSummary");

		TestModellerLogger.PassStep(m_Driver, "Click_clickPayrollSummary");
	}
	
	
	/**
 	 * Click getSMP/SSPRecovery
     * @name Click getSMP/SSPRecovery
     */
	public void Click_getSMPSSPRecovery()
	{
        
		WebElement elem = getWebElement(getSMPSSPRecoveryElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getSMPSSPRecovery", "Click_getSMPSSPRecovery failed. Unable to locate object: " + getSMPSSPRecoveryElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getSMPSSPRecovery", "Click_getSMPSSPRecovery failed. Unable to locate object: " + getSMPSSPRecoveryElem.toString());

			Assert.fail("Unable to locate object: " + getSMPSSPRecoveryElem.toString());
        }

		elem.getText();
		String SMPSSPRecovery=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'SMP/SPP Recovery')]//following::td/div")).get(0).getText();
		SMPSSPRecovery=SMPSSPRecovery.replaceAll("[£]", "");
		SMPSSPRecovery=SMPSSPRecovery.replaceAll("[,]", "");
		SMPSSPRecovery=SMPSSPRecovery.replaceAll("[-]", "");
		double SMPRecovery=Double.parseDouble(SMPSSPRecovery);
		System.out.println("SMPSSPRecovery="+SMPRecovery);

		assertEquals(SMPRecovery, SPP_Recovery);
          	

		ExtentReportManager.passStep(m_Driver, "Click_getSMPSSPRecovery");

		TestModellerLogger.PassStep(m_Driver, "Click_getSMPSSPRecovery");
	}
	
	
	/**
 	 * Click getSMP/SPPCompensation
     * @name Click getSMP/SPPCompensation
     */
	public void Click_getSMPSPPCompensation()
	{
        
		WebElement elem = getWebElement(getSMPSPPCompensationElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getSMPSPPCompensation", "Click_getSMPSPPCompensation failed. Unable to locate object: " + getSMPSPPCompensationElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getSMPSPPCompensation", "Click_getSMPSPPCompensation failed. Unable to locate object: " + getSMPSPPCompensationElem.toString());

			Assert.fail("Unable to locate object: " + getSMPSPPCompensationElem.toString());
        }
		elem.getText();
		String SMPSPPCompensation=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'SMP/SPP Compensation')]//following::td/div")).get(0).getText();
		SMPSPPCompensation=SMPSPPCompensation.replaceAll("[£]", "");
		SMPSPPCompensation=SMPSPPCompensation.replaceAll("[,]", "");
		SMPSPPCompensation=SMPSPPCompensation.replaceAll("[-]", "");
		double SMPcomponsetion=Double.parseDouble(SMPSPPCompensation);
		System.out.println("SMPSSPComponsetion="+SMPcomponsetion);

		assertEquals(SMPcomponsetion, SPP_Compensation);

		ExtentReportManager.passStep(m_Driver, "Click_getSMPSPPCompensation");

		TestModellerLogger.PassStep(m_Driver, "Click_getSMPSPPCompensation");
	}
	
	
	/**
 	 * Click gotoFiling Management
     * @name Click gotoFiling Management
     */
	public void Click_gotoFiling_Management()
	{
        
		WebElement elem = getWebElement(gotoFiling_ManagementElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoFiling_Management", "Click_gotoFiling_Management failed. Unable to locate object: " + gotoFiling_ManagementElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoFiling_Management", "Click_gotoFiling_Management failed. Unable to locate object: " + gotoFiling_ManagementElem.toString());

			Assert.fail("Unable to locate object: " + gotoFiling_ManagementElem.toString());
        }

		elem.click();
		
		
		
		int len=m_Driver.findElements(By.xpath("//table/tbody/tr/td[5]")).size();
		
		
		
		for(int i=len+1;i<=len+1;i++)
		{
			
			jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")));
			m_Driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).click();
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoFiling_Management");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoFiling_Management");
	}
	
	
	
	/**
 	 * Click gotoFiling Management
     * @name Click gotoFiling Management
     */
	public void Click_gotoFiling_Management2(String selectTaxYear)
	{
        
		WebElement elem = getWebElement(gotoFiling_ManagementElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoFiling_Management", "Click_gotoFiling_Management failed. Unable to locate object: " + gotoFiling_ManagementElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoFiling_Management", "Click_gotoFiling_Management failed. Unable to locate object: " + gotoFiling_ManagementElem.toString());

			Assert.fail("Unable to locate object: " + gotoFiling_ManagementElem.toString());
        }

		elem.click();
		
		WebElement elem2=m_Driver.findElement(By.xpath("//label[contains(.,'Tax Year:')]/../select"));
		
		Select dropdown = new Select(elem2);

 		dropdown.selectByVisibleText(selectTaxYear);
		
		
		int len=m_Driver.findElements(By.xpath("//table/tbody/tr/td[5]")).size();
		
		
		
		for(int i=len+1;i<=len+1;i++)
		{
			
			jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")));
			m_Driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).click();
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoFiling_Management");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoFiling_Management");
	}
	
	
	
    
	/**
 	 * Enter getXMLData
     * @name Enter getXMLData
     */
 	public void Enter_getXMLData()
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(getXMLDataElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_getXMLData", "Enter_getXMLData failed. Unable to locate object: " + getXMLDataElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_getXMLData", "Enter_getXMLData failed. Unable to locate object: " + getXMLDataElem.toString());

 			Assert.fail("Unable to locate object: " + getXMLDataElem.toString());
         }

 		elem.click();
 		textArea1=elem;
 //		clickFpselem=elem;
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_getXMLData " + getXMLDataElem);

  		TestModellerLogger.PassStep(m_Driver, "Enter_getXMLData " + getXMLDataElem);
 	}
 	
 	
 	//Read data from XML File
    public void checkXML() throws ParserConfigurationException, SAXException, IOException 
    {
    	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));
//    	pages.Library lib=new pages.Library(m_Driver);
    	
    	
    	
    	String xmlText=textArea1.getText();
 
    	
    	
/*
 * XML Data verification
 *     	
 */
    	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    	DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();

        
    	
    	InputSource src = new InputSource();
    	src.setCharacterStream(new StringReader(xmlText));
    	Document doc = dBuilder.parse(src);
    	String SPPRecovered = doc.getElementsByTagName("SPPRecovered").item(0).getTextContent();
    	String NICCompensationOnSPP = doc.getElementsByTagName("NICCompensationOnSPP").item(0).getTextContent();
//    	String XMLUELValue = doc.getElementsByTagName("PTtoUELYTD").item(0).getTextContent();
    	
    	double SPPRecoveredAmount = Double.parseDouble(SPPRecovered);
    	System.out.println("SPPRecovered...="+SPPRecovered);
    	
    	assertEquals(SPPRecoveredAmount, SPP_Recovery);
    	
    	double NICCompensationOnSPPAmount = Double.parseDouble(NICCompensationOnSPP);
    	System.out.println("NICCompensationOnSPPAmount...="+NICCompensationOnSPPAmount);
    	
    	assertEquals(NICCompensationOnSPPAmount, SPP_Compensation);
    	
//    	double XMLUELAmount = Double.parseDouble(XMLUELValue);
//    	System.out.println("..."+XMLUELValue);
//    	
//    	assertEquals(XMLUELAmount, UELAmount);
    	
    //	String name = doc.getElementsByTagName("name").item(0).getTextContent();
    	
    	
    	m_Driver.switchTo().defaultContent();
    }
}