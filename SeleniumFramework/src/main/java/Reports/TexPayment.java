package Reports;





import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import pages.BasePage;
import pages.reports;
import utilities.reports.ExtentReportManager;

public class TexPayment extends BasePage{
	
	
	
	
	private static final String data = null;




	public TexPayment(WebDriver driver) {
		super(driver);
		
			}
	
	
	
	
	public static String Month = null;
	public static String PayPeriod= null;
	public static String EENI= null;
	public static String ERNI= null;
	public static String ERNIonTerminationAward= null;
	public static String StudentLoan= null;
	public static String PostGraduateLoan= null;
	public static String StatPayFunding= null;
	public static String TaxRefundFunding= null;
	public static String StatPayRecovery= null;
	public static String PreviousYearOverpayment = null;
	public static String IncomeTax= null;
	public static String EmploymentAllowance= null;
	public static String CISTax= null;
	public static String CISSuffered= null;
	public static String AmountDueToHMRC= null;
	public static String AmountPaid= null;
	public static String BalanceduetoHMRC= null;
	
	
	SoftAssert soft=new SoftAssert();
	public static String FileName;
	
	
	private By TaxPaymentButton= By.xpath("//span[normalize-space()='Tax Payment']");
	
	private By SelectQuaterDropdown= By.xpath("//select[@id='ctl00_ctl00_ParentContent_cPH_ddlQuater']");
	
	private By SelectMonthDropdown= By.xpath("//select[@id='ctl00_ctl00_ParentContent_cPH_DdlMonth']");
	
	private By UpdateButton= By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_btnSearch']");

	private By EmailButton= By.xpath("//a[@id='ctl00_ctl00_ParentContent_cpHeaderRight_Lnkbtnemail']");

	private By HMRCAdjustmentsButton= By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_lnkHMRCAdjustments']");
	
	private By StatutoryPayFundingButton= By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_lnkStatutoryPayFunding']");

	private By TaxRefundButton= By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_lnkTaxRefund']");
	private By CISSufferedButton= By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_lnkCISSuffered']");
	private By HMRCPaymentsMadeButton= By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_lnkHMRCPaymentsMade']");
	private By ExportToCSV= By.xpath("//i[@class='fa fa-download']");
	private By ExportToPDF= By.xpath("//i[@class='fa fa-file-pdf-o']");
	
	
	
	public void clickCISSufferedButton() throws InterruptedException
 	{
         
 		WebElement elem = getWebElement(CISSufferedButton);

 		if (elem == null) {
     		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickExpensesAndBenefits", "clickExpensesAndBenefits failed. Unable to locate object: " + CISSufferedButton.toString());

     		
 			Assert.fail("Unable to locate object: " + CISSufferedButton.toString());
         }

 		elem.click();       
 		Thread.sleep(2000);

 		ExtentReportManager.passStep(m_Driver, "CISSufferedButton");
 		Reporter.log("CISSufferedButton");
 		System.out.println("CISSufferedButton");
 		
 	}
	
	
	public void clickTaxRefundButton() throws InterruptedException
 	{
         
 		WebElement elem = getWebElement(TaxRefundButton);

 		if (elem == null) {
     		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickExpensesAndBenefits", "clickExpensesAndBenefits failed. Unable to locate object: " + TaxRefundButton.toString());

     		
 			Assert.fail("Unable to locate object: " + TaxRefundButton.toString());
         }

 		elem.click();       
 		Thread.sleep(2000);

 		ExtentReportManager.passStep(m_Driver, "TaxRefundButton");
 		Reporter.log("TaxRefundButton");
 		System.out.println("TaxRefundButton");
 		
 	}

	public void clickStatutoryPayFundingButton() throws InterruptedException
 	{
         
 		WebElement elem = getWebElement(StatutoryPayFundingButton);

 		if (elem == null) {
     		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickExpensesAndBenefits", "clickExpensesAndBenefits failed. Unable to locate object: " + StatutoryPayFundingButton.toString());

     		
 			Assert.fail("Unable to locate object: " + StatutoryPayFundingButton.toString());
         }

 		elem.click();       
 		Thread.sleep(2000);

 		ExtentReportManager.passStep(m_Driver, "StatutoryPayFundingButton");
 		Reporter.log("StatutoryPayFundingButton");
 		System.out.println("StatutoryPayFundingButton");
 		
 	}
	
	
	public void clickHMRCAdjustmentsButton() throws InterruptedException
 	{
         
 		WebElement elem = getWebElement(HMRCAdjustmentsButton);

 		if (elem == null) {
     		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickExpensesAndBenefits", "clickExpensesAndBenefits failed. Unable to locate object: " + HMRCAdjustmentsButton.toString());

     		
 			Assert.fail("Unable to locate object: " + HMRCAdjustmentsButton.toString());
         }

 		elem.click();       
 		Thread.sleep(2000);

 		ExtentReportManager.passStep(m_Driver, "HMRCAdjustmentsButton");
 		Reporter.log("HMRCAdjustmentsButton");
 		System.out.println("HMRCAdjustmentsButton");
 		
 	}
	
	public void clickHMRCPaymentsMadeButton() throws InterruptedException
 	{
         
 		WebElement elem = getWebElement(HMRCPaymentsMadeButton);

 		if (elem == null) {
     		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickExpensesAndBenefits", "clickExpensesAndBenefits failed. Unable to locate object: " + HMRCPaymentsMadeButton.toString());

     		
 			Assert.fail("Unable to locate object: " + HMRCPaymentsMadeButton.toString());
         }

 		elem.click();       
 		Thread.sleep(2000);

 		ExtentReportManager.passStep(m_Driver, "HMRCPaymentsMadeButton");
 		Reporter.log("HMRCPaymentsMadeButton");
 		System.out.println("HMRCPaymentsMadeButton");
 		
 	}
	
	public void clickTaxPaymentButton() throws InterruptedException
 	{
         
 		WebElement elem = getWebElement(TaxPaymentButton);

 		if (elem == null) {
     		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickExpensesAndBenefits", "clickExpensesAndBenefits failed. Unable to locate object: " + TaxPaymentButton.toString());

     		
 			Assert.fail("Unable to locate object: " + TaxPaymentButton.toString());
         }

 		elem.click();       
 		Thread.sleep(4000);

 		ExtentReportManager.passStep(m_Driver, "TaxPaymentButton");
 		Reporter.log("TaxPaymentButton");
 		System.out.println("TaxPaymentButton");
 		
 	}
	
	
	
	 public void SelectQuaterDropdown(String data) throws Exception
	  	{
	  		WebElement elem = getWebElement(SelectQuaterDropdown);

	  		if (elem == null) {
	      		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectTaxYear", "selectTaxYear failed. Unable to locate object: " + SelectQuaterDropdown.toString());


	  			Assert.fail("Unable to locate object: " + SelectQuaterDropdown.toString());
	          }

				Select sel = new Select(elem);
				sel.selectByVisibleText(data);
				Thread.sleep(2000);
				ExtentReportManager.passStep(m_Driver, "SelectQuaterDropdown");
	    	Reporter.log("SelectOptionQuaterDropdown : "+data);
	    	System.out.println("SelectOptionQuaterDropdown : "+data);

	  	}
	    

	 public void SelectMonthDropdown(String data) throws Exception
	  	{
	  		WebElement elem = getWebElement(SelectMonthDropdown);

	  		if (elem == null) {
	      		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectTaxYear", "selectTaxYear failed. Unable to locate object: " + SelectMonthDropdown.toString());


	  			Assert.fail("Unable to locate object: " + SelectMonthDropdown.toString());
	          }

				Select sel = new Select(elem);
				sel.selectByVisibleText(data);
				Thread.sleep(2000);
				ExtentReportManager.passStep(m_Driver, "SelectMonthDropdown");
	    	Reporter.log("SelectMonthDropdown : "+data);
	    	System.out.println("SelectMonthDropdown : "+data);

	  	}
    
    
    public void clickUpdateButton() throws InterruptedException
 	{
         
 		WebElement elem = getWebElement(UpdateButton);

 		if (elem == null) {
     		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickExpensesAndBenefits", "clickExpensesAndBenefits failed. Unable to locate object: " + UpdateButton.toString());

     		
 			Assert.fail("Unable to locate object: " + EmailButton.toString());
         }

 		elem.click();       
 		Thread.sleep(2000);

 		ExtentReportManager.passStep(m_Driver, "UpdateButton");
 		Reporter.log("click UpdateButton");
 		System.out.println("Click UpdateButton");
 		
 	}
 
    public String verifyMonthOptions()
    {
    	String Options = null;
    	WebElement elem = getWebElement(By.xpath("//select[@id='ctl00_ctl00_ParentContent_cPH_DdlMonth']"));
    	
    	Select sl=new Select(elem);
    	List<WebElement> list = sl.getOptions();
    	
    	for(int i=0;i<=list.size()-1;i++)
    	{
    		List<WebElement> list2 = sl.getOptions();
    		String Op=list2.get(i).getText();
    		Options=Options+":"+Op;
    		
    	}
    	 return Options.substring(5);
    	
    }
    
    
    public void MonthYear_PayPeriodList(String Month_PayPeriod,String ExpYear,int index)
    {
    	String MonthName = null;
    	String Year = null;
    		 List<WebElement> list = getWebElements(By.xpath("//table[@id='ctl00_ctl00_ParentContent_cPH_gridDisplay']/tbody/tr/td["+index+"]"));
    		 for(int i=0;i<=list.size()-2;i++)
    		 {
    			 List<WebElement> list2 = getWebElements(By.xpath("//table[@id='ctl00_ctl00_ParentContent_cPH_gridDisplay']/tbody/tr/td["+index+"]"));
    			 jsExec.executeScript("arguments[0].scrollIntoView(true);", list2.get(i));
    			 String UiName[] = list2.get(i).getText().split(" ");
    			 MonthName=MonthName+":"+UiName[0].trim();
    			 Year=Year+":"+UiName[1].trim();
    		 }
    		 String ExpData =Month_PayPeriod;
 			 String ExpData2 =ExpYear;
 			 String UiMonth=MonthName.substring(5);
 			 String UiYear=Year.substring(5);
 			 
 			soft.assertEquals(ExpData, UiMonth);
  			soft.assertEquals(ExpData2, UiYear);
 			Reporter.log("verify Month and Pay Period List : "+UiMonth +" : "+ ExpData);
  	 		System.out.println("verify Month and Pay Period List : "+UiMonth +" : "+ ExpData); 
    	}
    	
    public void Month_PayPeriodList(String Month_PayPeriod,int index)
    {
    	String MonthName = null;
    		 List<WebElement> list = getWebElements(By.xpath("//table[@id='ctl00_ctl00_ParentContent_cPH_gridDisplay']/tbody/tr/td["+index+"]"));
    		 for(int i=0;i<=list.size()-2;i++)
    		 {
    			 List<WebElement> list2 = getWebElements(By.xpath("//table[@id='ctl00_ctl00_ParentContent_cPH_gridDisplay']/tbody/tr/td["+index+"]"));
    			 jsExec.executeScript("arguments[0].scrollIntoView(true);", list2.get(i));
    			 String UiName[] = list2.get(i).getText().split(" ");
    			 MonthName=MonthName+":"+UiName[0].trim();
    			 
    		 }
    		 String ExpData =Month_PayPeriod;
 			
 			 String UiMonth=MonthName.substring(5);
 			
 			 
 			soft.assertEquals(ExpData, UiMonth);
  		
 			Reporter.log("verify Month and Pay Period List : "+UiMonth +" : "+ ExpData);
  	 		System.out.println("verify Month and Pay Period List : "+UiMonth +" : "+ ExpData); 
    	}
    
    public void Month_PayPeriodListFeq(String Month_PayPeriod,int index)
    {
    	int c=1;
    	String MonthName = null;
    		 List<WebElement> list = getWebElements(By.xpath("//table[@id='ctl00_ctl00_ParentContent_cPH_gridDisplay']/tbody/tr/td["+index+"]"));
    		 for(int i=0;i<=list.size()-2;i++)
    		 {
    			 List<WebElement> list2 = getWebElements(By.xpath("//table[@id='ctl00_ctl00_ParentContent_cPH_gridDisplay']/tbody/tr/td["+index+"]"));
    			 jsExec.executeScript("arguments[0].scrollIntoView(true);", list2.get(i));
    			 String UiName = list2.get(i).getText();
    			 MonthName=MonthName+":"+UiName.trim();
    			 c++;
    		 }
    		 String ExpData =Month_PayPeriod;
 			
 			 String UiMonth=MonthName.substring(5);
 			
 			 
 			soft.assertEquals(ExpData, UiMonth);
  		
 			Reporter.log("verify Month and Pay Period List : "+UiMonth +" : "+ ExpData);
  	 		System.out.println("verify Month and Pay Period List : "+UiMonth +" : "+ ExpData); 
    	}
    
    public String getEENI_Amount(int index)
    {
    	String Data=null;
    	
    	List<WebElement> list = getWebElements(By.xpath("//table[@class='table table-head-bg']/tbody/tr/td["+index+"]"));
    	for(int i=0;i<=list.size()-1;i++)
    	{
    		List<WebElement> list2 = getWebElements(By.xpath("//table[@class='table table-head-bg']/tbody/tr/td["+index+"]"));
			 jsExec.executeScript("arguments[0].scrollIntoView(true);", list2.get(i));
			 String UiData = list2.get(i).getText();
			 Data=Data+":"+UiData.trim();
    		
    		
    	}
    	String UiGetData=Data.substring(5).replaceAll("[£,]", "");
    	System.out.println(UiGetData);
		return UiGetData;
    	
    }
    
    
    public void verifyEENI_Amount(int index,double UserCount,String data)
    {
    	String Data=null;
    	String Data2=null;
    	List<WebElement> list = getWebElements(By.xpath("//table[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr/td["+index+"]"));
    	for(int i=0;i<=list.size()-2;i++)
    	{
    		List<WebElement> list2 = getWebElements(By.xpath("//table[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr/td["+index+"]"));
			 jsExec.executeScript("arguments[0].scrollIntoView(true);", list2.get(i));
			 String UiData = list2.get(i).getText();
			 Data=Data+":"+UiData.trim();
    		
    	}
    	String UiGetData=Data.substring(5).replaceAll("[£,]", "");
    	String[] UIAmount = UiGetData.split(":");
    	
    	
    	String A[]=data.split(":");
    			int arrySize=A.length;
    			for(int a=0;a<=arrySize-1;a++)
    			{
    					double EnterAmount = Double.parseDouble(A[a]);
    				 	double amount=EnterAmount*UserCount;
    					DecimalFormat df = new DecimalFormat("0.00");
    					String AcualAmount = df.format(amount);
    				
    				soft.assertEquals(AcualAmount, UIAmount[a]);
    				System.out.println(AcualAmount+"  :::  "+ UIAmount[a]);
    				
    			}
    	
    	
    			for(int i=0;i<=list.size()-1;i++)
    	    	{
    	    		List<WebElement> list2 = getWebElements(By.xpath("//table[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr/td["+index+"]"));
    				 jsExec.executeScript("arguments[0].scrollIntoView(true);", list2.get(i));
    				 String UiData = list2.get(i).getText();
    				 Data2=Data2+":"+UiData.trim();
    	    		
    	    	}
    			double amount3=0;
    			String UiGetData2=Data2.substring(5).replaceAll("[£,]", "");
    	    	String[] UIAmount2 = UiGetData2.split(":");
    	    	int arrySize2=UIAmount2.length-1;
    	    	for(int b=0;b<=arrySize-1;b++)
    			{
    					double EnterAmount = Double.parseDouble(UIAmount2[b]);
    					amount3=EnterAmount+amount3;
    			}
    	    	DecimalFormat df = new DecimalFormat("0.00");
				String AcualAmount = df.format(amount3);
    	    	
    	    	
    	    	double EnterAmount = Double.parseDouble(UIAmount2[arrySize2]);
    	    	String amount2 = df.format(EnterAmount);
			 	soft.assertEquals(AcualAmount, amount2,"Issue In NI Total Amount");
    }
    
    
    public void verifyEmploymentAllowance_Amount(int index,double UserCount,int payrollTime,String data)
    {
    	String Data=null;
    	String Data2=null;
    	List<WebElement> list = getWebElements(By.xpath("//table[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr/td["+index+"]"));
    	for(int i=0;i<=list.size()-2;i++)
    	{
    		List<WebElement> list2 = getWebElements(By.xpath("//table[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr/td["+index+"]"));
			 jsExec.executeScript("arguments[0].scrollIntoView(true);", list2.get(i));
			 String UiData = list2.get(i).getText();
			 Data=Data+":"+UiData.trim();
    		
    	}
    	String UiGetData=Data.substring(5).replaceAll("[£,]", "");
    	String[] UIAmount = UiGetData.split(":");
    	
    	
    	String A[]=data.split(":");
    			int arrySize=A.length;
    			for(int a=0;a<=payrollTime-1;a++)
    			{
    					double EnterAmount = Double.parseDouble(A[a]);
    				 	double amount=EnterAmount*UserCount;
    					DecimalFormat df = new DecimalFormat("0.00");
    					String AcualAmount = df.format(amount);
    				
    				soft.assertEquals(AcualAmount, UIAmount[a]);
    				System.out.println(AcualAmount+"  :::  "+ UIAmount[a]);
    				
    			}
    	
    	
//    			for(int i=0;i<=list.size()-1;i++)
//    	    	{
//    	    		List<WebElement> list2 = getWebElements(By.xpath("//table[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr/td["+index+"]"));
//    				 jsExec.executeScript("arguments[0].scrollIntoView(true);", list2.get(i));
//    				 String UiData = list2.get(i).getText();
//    				 Data2=Data2+":"+UiData.trim();
//    	    		
//    	    	}
//    			double amount3=0;
//    			String UiGetData2=Data2.substring(5).replaceAll("[£,]", "");
//    	    	String[] UIAmount2 = UiGetData2.split(":");
//    	    	int arrySize2=UIAmount2.length-1;
//    	    	for(int b=0;b<=arrySize-1;b++)
//    			{
//    					double EnterAmount = Double.parseDouble(UIAmount2[b]);
//    					amount3=EnterAmount+amount3;
//    			}
//    	    	DecimalFormat df = new DecimalFormat("0.00");
//				String AcualAmount = df.format(amount3);
//    	    	
//    	    	
//    	    	double EnterAmount = Double.parseDouble(UIAmount2[arrySize2]);
//    	    	String amount2 = df.format(EnterAmount);
//			 	soft.assertEquals(AcualAmount, amount2,"Issue In NI Total Amount");
    }
    
    
    public void verifyIncomeTex_Amount(int index,double UserCount,String data)
    {
    	String Data=null;
    	String Data2=null;
    	List<WebElement> list = getWebElements(By.xpath("//table[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr/td["+index+"]"));
    	for(int i=0;i<=list.size()-2;i++)
    	{
    		List<WebElement> list2 = getWebElements(By.xpath("//table[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr/td["+index+"]"));
			 jsExec.executeScript("arguments[0].scrollIntoView(true);", list2.get(i));
			 String UiData = list2.get(i).getText();
			 Data=Data+":"+UiData.trim();
    		
    	}
    	String UiGetData=Data.substring(5).replaceAll("[£,]", "");
    	String[] UIAmount = UiGetData.split(":");
    	
    	
    	String A[]=data.split(":");
    	int arrySize=A.length;
		int k=0;
		for(int a=0;a<=arrySize-1;a++)
		{
				double EnterAmount = Double.parseDouble(A[a]);
			 	double amount=EnterAmount*UserCount;
				DecimalFormat df = new DecimalFormat("0.00");
				String AcualAmount = df.format(amount);
			
			soft.assertEquals(AcualAmount, UIAmount[k]);
			System.out.println(AcualAmount+"  :::  "+ UIAmount[k]);
			k++;
		}
    	
    	
    			for(int i=0;i<=list.size()-1;i++)
    	    	{
    	    		List<WebElement> list2 = getWebElements(By.xpath("//table[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr/td["+index+"]"));
    				 jsExec.executeScript("arguments[0].scrollIntoView(true);", list2.get(i));
    				 String UiData = list2.get(i).getText();
    				 Data2=Data2+":"+UiData.trim();
    	    		
    	    	}
    			double amount3=0;
    			String UiGetData2=Data2.substring(5).replaceAll("[£,]", "");
    	    	String[] UIAmount2 = UiGetData2.split(":");
    	    	int arrySize2=UIAmount2.length-1;
    	    	for(int b=0;b<=arrySize-2;b++)
    			{
    					double EnterAmount = Double.parseDouble(UIAmount2[b]);
    					amount3=EnterAmount+amount3;
    			}
    	    	DecimalFormat df = new DecimalFormat("0.00");
				String AcualAmount = df.format(amount3);
    	    	
    	    	
    	    	double EnterAmount = Double.parseDouble(UIAmount2[arrySize2]);
    	    	String amount2 = df.format(EnterAmount);
			 	soft.assertEquals(AcualAmount, amount2,"Issue In NI Total Amount");
    }
    
    
    public void verifyIncomeTex_Amount2(int index,double UserCount,String data)
    {
    	String Data=null;
    	String Data2=null;
    	List<WebElement> list = getWebElements(By.xpath("//table[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr/td["+index+"]"));
    	for(int i=0;i<=list.size()-2;i++)
    	{
    		List<WebElement> list2 = getWebElements(By.xpath("//table[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr/td["+index+"]"));
			 jsExec.executeScript("arguments[0].scrollIntoView(true);", list2.get(i));
			 String UiData = list2.get(i).getText();
			 Data=Data+":"+UiData.trim();
    		
    	}
    	String UiGetData=Data.substring(5).replaceAll("[£,]", "");
    	String[] UIAmount = UiGetData.split(":");
    	
    	
    	String A[]=data.split(":");
    	if(A[0].equals(null))
    	{
    		int arrySize=A.length;
			int k=0;
			for(int a=1;a<=arrySize-1;a++)
			{
					double EnterAmount = Double.parseDouble(A[a]);
				 	double amount=EnterAmount*UserCount;
					DecimalFormat df = new DecimalFormat("0.00");
					String AcualAmount = df.format(amount);
				
				soft.assertEquals(AcualAmount, UIAmount[k]);
				System.out.println(AcualAmount+"  :::  "+ UIAmount[k]);
				k++;
			}
    	}
    	int arrySize=A.length;
		int k=0;
		for(int a=0;a<=arrySize-1;a++)
		{
				double EnterAmount = Double.parseDouble(A[a]);
			 	double amount=EnterAmount*UserCount;
				DecimalFormat df = new DecimalFormat("0.00");
				String AcualAmount = df.format(amount);
			
			soft.assertEquals(AcualAmount, UIAmount[k]);
			System.out.println(AcualAmount+"  :::  "+ UIAmount[k]);
			k++;
		}
    	
    	
    			for(int i=0;i<=list.size()-1;i++)
    	    	{
    	    		List<WebElement> list2 = getWebElements(By.xpath("//table[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr/td["+index+"]"));
    				 jsExec.executeScript("arguments[0].scrollIntoView(true);", list2.get(i));
    				 String UiData = list2.get(i).getText();
    				 Data2=Data2+":"+UiData.trim();
    	    		
    	    	}
    			double amount3=0;
    			String UiGetData2=Data2.substring(5).replaceAll("[£,]", "");
    	    	String[] UIAmount2 = UiGetData2.split(":");
    	    	int arrySize2=UIAmount2.length-1;
    	    	for(int b=0;b<=arrySize-1;b++)
    			{
    					double EnterAmount = Double.parseDouble(UIAmount2[b]);
    					amount3=EnterAmount+amount3;
    			}
    	    	DecimalFormat df = new DecimalFormat("0.00");
				String AcualAmount = df.format(amount3);
    	    	
    	    	
    	    	double EnterAmount = Double.parseDouble(UIAmount2[arrySize2]);
    	    	String amount2 = df.format(EnterAmount);
			 	soft.assertEquals(AcualAmount, amount2,"Issue In NI Total Amount");
    }
    
    public String verifyStudentPostGraduateLoan_Amount(int index,double UserCount,String data,String Salary)
    {
    
    	List<WebElement> list = getWebElements(By.xpath("//table[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr/td["+index+"]"));
    	for(int i=0;i<=list.size()-2;i++)
    	{
    		List<WebElement> list2 = getWebElements(By.xpath("//table[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr/td["+index+"]"));
			 jsExec.executeScript("arguments[0].scrollIntoView(true);", list2.get(i));
			 String UiData = list2.get(i).getText();
			 String STLoan = UiData.trim();
			 
			 String A[]=data.split("=");
			 	double Threshold = Double.parseDouble(A[0].substring(1).replaceAll("[,]", ""));
			 	double EmpSalary = Double.parseDouble(Salary);
			 	double amount=Threshold-EmpSalary;
			 	double ThresholdPR = Double.parseDouble(A[1].substring(0, A[1].length()-1));
				double amountmain2=amount*ThresholdPR/100;
			 	double amountmain = amountmain2*UserCount;
				DecimalFormat df = new DecimalFormat("0.00");
				String AcualAmount = df.format(amountmain);
				String ThresholdAmount = AcualAmount.replaceAll("[-]", "").substring(0, AcualAmount.length()-4);
				String STLoanUI = STLoan.substring(1).replaceAll("[,]", "").substring(0, STLoan.length()-4);
				System.out.println(ThresholdAmount+"  : "+STLoanUI);
				soft.assertEquals(ThresholdAmount, STLoanUI);
    		
    	}
    	List<WebElement> list2 = getWebElements(By.xpath("//table[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr/td["+index+"]"));
    	int s=list2.size()-1;
    	String total = list2.get(s).getText();
    	 String A[]=data.split("=");
		 	double Threshold = Double.parseDouble(A[0].substring(1).replaceAll("[,]", ""));
		 	double EmpSalary = Double.parseDouble(Salary);
		 	double amount=Threshold-EmpSalary;
		 	double ThresholdPR = Double.parseDouble(A[1].substring(0, A[1].length()-1));
			double amountmain2=amount*ThresholdPR/100;
		 	double amountmain = amountmain2*UserCount;
			DecimalFormat df = new DecimalFormat("0.00");
			String AcualAmount = df.format(amountmain);
			String ThresholdAmount = AcualAmount.replaceAll("[-]", "").substring(0, AcualAmount.length()-4);
			double TotalAmount = Double.parseDouble(ThresholdAmount);
			double TB = TotalAmount*s;
			String TB1 = df.format(TB);
			String TB2 = TB1.replaceAll("[-]", "").substring(0, TB1.length()-3);
			String STLoanUI = total.substring(1).replaceAll("[,]", "").substring(0, total.length()-4);
			System.out.println(TB2+"  : "+STLoanUI);
			soft.assertEquals(TB2, STLoanUI);
			return STLoanUI;
    	
    }
    
    public void verifyStatPayFunding_StatPayRecovery_Amount(int index,double UserCount,String data)
    {
    
    	List<WebElement> list = getWebElements(By.xpath("//table[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr/td["+index+"]"));
    	for(int i=0;i<=list.size()-2;i++)
    	{
    		List<WebElement> list2 = getWebElements(By.xpath("//table[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr/td["+index+"]"));
			 jsExec.executeScript("arguments[0].scrollIntoView(true);", list2.get(i));
			 String UiData = list2.get(i).getText();
			 String STLoan = UiData.trim();
			 String z[]=STLoan.split("", 3);
			 if("-".equals(z[0]))
			 {
				 String STLoanUI = STLoan.substring(2).replaceAll("[,]", "");
					System.out.println(data+"  : "+STLoanUI);
					soft.assertEquals(data, STLoanUI);
			 }
			 else
			 {
				 String STLoanUI = STLoan.substring(1).replaceAll("[,]", "");
					System.out.println(data+"  : "+STLoanUI);
					soft.assertEquals(data, STLoanUI);
			 }
				
    		
    	}
    	List<WebElement> list2 = getWebElements(By.xpath("//table[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr/td["+index+"]"));
    	int s=list2.size()-1;
    	String total = list2.get(s).getText();
    	
		 	double Threshold = Double.parseDouble(data.replaceAll("[,]", ""));
		 
		 	
		 	double amountmain = Threshold*UserCount;
			DecimalFormat df = new DecimalFormat("0.00");
			String AcualAmount = df.format(amountmain);
			String ThresholdAmount = AcualAmount;
			double TotalAmount = Double.parseDouble(ThresholdAmount);
			double TB = TotalAmount*s;
			String TB1 = df.format(TB);
			
			 String z[]=total.split("", 3);
			 if("-".equals(z[0]))
			 {
				 String STLoanUI = total.substring(2).replaceAll("[,]", "");
				 System.out.println(TB1+"  : "+STLoanUI);
					soft.assertEquals(TB1, STLoanUI);
			 }
			 else
			 {
					String STLoanUI = total.substring(1).replaceAll("[,]", "");
					System.out.println(TB1+"  : "+STLoanUI);
					soft.assertEquals(TB1, STLoanUI); 
			 }
		
    	
    }
    
    public void verifyDueToHMRC_Amount(int index,int index2,double UserCount,String data)
    {
    
    	List<WebElement> list = getWebElements(By.xpath("//table[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr["+index2+"]/td["+index+"]"));
    	for(int i=0;i<=list.size()-1;i++)
    	{
    		List<WebElement> list2 = getWebElements(By.xpath("//table[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr["+index2+"]/td["+index+"]"));
			 jsExec.executeScript("arguments[0].scrollIntoView(true);", list2.get(i));
			 String UiData = list2.get(i).getText();
			 String STLoan = UiData.trim();
				String STLoanUI = STLoan.replaceAll("[,£]", "");
				System.out.println(data+"  : "+STLoanUI);
				soft.assertEquals(data, STLoanUI);
    		
    	}
//    	List<WebElement> list2 = getWebElements(By.xpath("//table[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr/td["+index+"]"));
//    	int s=list2.size()-1;
//    	String total = list2.get(s).getText();
//    	
//		 	double Threshold = Double.parseDouble(data.replaceAll("[,]", ""));
//		 
//		 	
//		 	double amountmain = Threshold*UserCount;
//			DecimalFormat df = new DecimalFormat("0.00");
//			String AcualAmount = df.format(amountmain);
//			String ThresholdAmount = AcualAmount;
//			double TotalAmount = Double.parseDouble(ThresholdAmount);
//			double TB = TotalAmount*s;
//			String TB1 = df.format(TB);
//			String STLoanUI = total.replaceAll("[,£]", "");
//			System.out.println(TB1+"  : "+STLoanUI);
//			soft.assertEquals(TB1, STLoanUI);
    	
    }
    
    public String GetColumnDatabiIndexInText(int line,int index)
    {
    
    	String STLoanUI;
    		WebElement list2 = getWebElement(By.xpath("//table[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr["+line+"]/td["+index+"]"));
			 jsExec.executeScript("arguments[0].scrollIntoView(true);", list2);
			 String UiData = list2.getText();
			 String STLoan = UiData.trim();
			 String z[]=STLoan.split("", 3);
			 if("-".equals(z[0]))
			 {
				  STLoanUI = STLoan.substring(2).replaceAll("[,]", "");
					System.out.println("data  : "+STLoanUI); 
			 }
			 else
			 {
				 STLoanUI = STLoan.substring(1).replaceAll("[,]", "");
					System.out.println("data  : "+STLoanUI); 
			 }
				
    		
    
		return STLoanUI;
    	
    }
    
    public void verifyTerminationAward_Amount(int index,double UserCount,String Amount,String Per)
    {
    
    	List<WebElement> list = getWebElements(By.xpath("//table[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr/td["+index+"]"));
    	for(int i=0;i<=list.size()-2;i++)
    	{
    		List<WebElement> list2 = getWebElements(By.xpath("//table[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr/td["+index+"]"));
			 jsExec.executeScript("arguments[0].scrollIntoView(true);", list2.get(i));
			 String UiData = list2.get(i).getText();
			 String STLoan = UiData.trim();
			 
			
			 	double EnterAmount = Double.parseDouble(Amount);
			 	double YearPer = Double.parseDouble(Per);
			 	double CondicitionAmount=EnterAmount-30000;
			 	double TAAmount2 = CondicitionAmount*YearPer/100;
			 	double TAAmount = TAAmount2*UserCount;
				DecimalFormat df = new DecimalFormat("0.00");
				String ExpAmount = df.format(TAAmount);
				String STLoanUI = STLoan.substring(1).replaceAll("[,]", "");
				String[] z=ExpAmount.split("", 3);
				if(z[0].equals("-"))
				{
					soft.assertEquals("0.00", STLoanUI," In Case of amount less than 30000 thasound ");
				}
				else
				{
					System.out.println(ExpAmount+"  :  "+STLoanUI);
					soft.assertEquals(ExpAmount, STLoanUI);
				}
				
			
    		
    	}
    	
    	List<WebElement> list2 = getWebElements(By.xpath("//table[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr/td["+index+"]"));
    	int s=list2.size()-1;
    	String total = list2.get(s).getText();
    	
    	double EnterAmount = Double.parseDouble(Amount);
	 	double YearPer = Double.parseDouble(Per);
	 	double CondicitionAmount=EnterAmount-30000;
	 	double TAAmount2 = CondicitionAmount*YearPer/100;
	 	double TAAmount3 = TAAmount2*UserCount;
	 	double TAAmount = TAAmount3*s;
		DecimalFormat df = new DecimalFormat("0.00");
		String ExpAmount = df.format(TAAmount);
		String STLoanUI = total.substring(1).replaceAll("[,]", "");
		String[] z=ExpAmount.split("", 3);
		if(z[0].equals("-"))
		{
			soft.assertEquals("0.00", STLoanUI," In Case of amount less than 30000 thasound ");
		}
		else
		{
			System.out.println(ExpAmount+"  :  "+STLoanUI);
			soft.assertEquals(ExpAmount, STLoanUI);
		}
		
    	
    }
    
    public String clickOnStatPayRecoveryLink(int Index)
    {
    	//Start Index With 2 Mens click on 1st value
    	
    	WebElement elem = getWebElement(By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec_ctl0"+Index+"_hyprlnkStatutoryPayRecovery']"));
    	elem.click();
    	String SPRAmount = getWebElement(By.xpath("//tbody/tr["+Index+"]/td[3]")).getText().trim();
    	String SPRAmount1 = SPRAmount.substring(1).replaceAll(",", "");
    	
		return SPRAmount1;
    	
    }
    
    public void EnterAmountInPopupByMonthWise(String PopupName,String MonthNameAndYear,String Amount,String Vali) throws InterruptedException
    {
    	//Statutory Pay Funding	
    	//Apr-2023
    													  
    	m_Driver.switchTo().frame(getWebElement(By.xpath("//div[@class='modal-dialog modal-dialog-centered modal-md']//iframe[@id='PopUpFrame']")));
    	String PopupN = getWebElement(By.xpath("//h2[normalize-space()='"+PopupName+"']")).getText();
    	soft.assertEquals(PopupName, PopupN);
    	WebElement elem = getWebElement(By.xpath("//div[@id='ctl00_ctl00_ParentContent_cPH_divMonths']/div/div/div/div/label[contains(text(),'"+MonthNameAndYear+"')]/parent::div/parent::div/div[2]/input"));
    	String selectAll = Keys.chord(Keys.CONTROL, "a");
 		elem.sendKeys(selectAll);
    	elem.sendKeys(Amount);
    	System.out.println("Enter Amount : "+Amount);
    	Reporter.log("Enter Amount : "+Amount);
    	getWebElement(By.xpath("//a[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']")).click();
    	
//    	List<WebElement> list = getWebElements(By.xpath("//label[normalize-space()='Company UTR:']"));
//    	boolean con = list.isEmpty();
//    	if(con==false)
//    	{
//    		getWebElement(By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_txtCompanyUTR']")).sendKeys("1000000110");
//        	getWebElement(By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_btnSaveUTR']")).click();
//    	}
    		String ValiMsg = getWebElement(By.xpath("//div[@class='alert alert-success']")).getText();
        	soft.assertEquals(Vali, ValiMsg);
        	m_Driver.switchTo().defaultContent();
        	Thread.sleep(7000);
        	
    }
    
    public void EnterCISAmountInPopupByMonthWise(String PopupName,String MonthNameAndYear,String Amount) throws InterruptedException
    {
    	//Statutory Pay Funding	
    	//Apr-2023
    													  
    	m_Driver.switchTo().frame(getWebElement(By.xpath("//div[@class='modal-dialog modal-dialog-centered modal-md']//iframe[@id='PopUpFrame']")));
    	String PopupN = getWebElement(By.xpath("//h2[normalize-space()='"+PopupName+"']")).getText();
    	soft.assertEquals(PopupName, PopupN);
    	WebElement elem = getWebElement(By.xpath("//div[@id='ctl00_ctl00_ParentContent_cPH_divMonths']/div/div/div/div/label[contains(text(),'"+MonthNameAndYear+"')]/parent::div/parent::div/div[2]/input"));
    	String selectAll = Keys.chord(Keys.CONTROL, "a");
 		elem.sendKeys(selectAll);
    	elem.sendKeys(Amount);
    	System.out.println("Enter Amount : "+Amount);
    	Reporter.log("Enter Amount : "+Amount);
    	getWebElement(By.xpath("//a[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']")).click();
    	
    	List<WebElement> list = getWebElements(By.xpath("//label[normalize-space()='Company UTR:']"));
    	boolean con = list.isEmpty();
    	if(con==false)
    	{
    		getWebElement(By.xpath("//input[@id='ctl00_ctl00_ParentContent_cPH_txtCompanyUTR']")).sendKeys("1000000110");
        	getWebElement(By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_btnSaveUTR']")).click();
    	}
    	
    	else
    	{
    		System.out.println("UTR no is alreday entered");
        	
    	}
    	m_Driver.switchTo().defaultContent();
    	Thread.sleep(7000);
    }
    
    public void EnterAmountInPopupByMonthWise2(String PopupName,String MonthNameAndYear,String Amount) throws InterruptedException
    {
    	//Statutory Pay Funding	
    	//Apr-2023
    	
    	m_Driver.switchTo().frame(getWebElement(By.xpath("//div[@class='modal-dialog modal-dialog-centered modal-md']//iframe[@id='PopUpFrame']")));
    	String PopupN = getWebElement(By.xpath("//h2[normalize-space()='"+PopupName+"']")).getText();
    	soft.assertEquals(PopupName, PopupN);
    	WebElement elem = getWebElement(By.xpath("//div[@id='ctl00_ctl00_ParentContent_cPH_divMonths']/div/div/div/div/label[contains(text(),'"+MonthNameAndYear+"')]/parent::div/parent::div/div[2]/input"));
    	String selectAll = Keys.chord(Keys.CONTROL, "a");
 		elem.sendKeys(selectAll);
    	elem.sendKeys(Amount);
    	System.out.println("Enter Amount : "+Amount);
    	Reporter.log("Enter Amount : "+Amount);
    	getWebElement(By.xpath("//a[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']")).click();

    	String ValiMsg = getWebElement(By.xpath("//div[@class='alert alert-success']")).getText();
    	soft.assertEquals("Success! Over payment to HMRC is updated successfully.", ValiMsg);
    	m_Driver.switchTo().defaultContent();
    	Thread.sleep(7000);
    }
	  
    
    public void DeleteCSv_PDF()
	{
		try
		{
 
			File folder = new File(System.getProperty("user.dir")+"\\SonuPDF\\"+"File");
			//List the files on that folder
			File[] listOfFiles = folder.listFiles();
			boolean found = false;
			File f = null;
			     //Look for the file in the files
			     // You should write smart REGEX according to the filename
			     for (File listOfFile : listOfFiles) {
			         if (listOfFile.isFile()) {
			              String fileName = listOfFile.getName();
			               System.out.println("File " + listOfFile.getName());
			               Thread.sleep(2000);
			               if ((new File(System.getProperty("user.dir")+"\\SonuPDF\\"+"\\File\\"+ listOfFile.getName())).delete()) {
			                   System.out.println("Delete : "+listOfFile.getName());     
			               }
			            }
			        }
		Assert.assertFalse(found, "Delete document is not found");
		}
		catch (Exception e)
		{
		System.out.println("Issue in Delete CSV = "+e);
		}
	}
    
    public void DownloadEXCEL()
	{
		
		try
		{
			WebElement DownloadBtn = getWebElement(By.xpath("//i[@class='fa fa-download']"));
			DownloadBtn.click();
//			WebElement ExportToCSvBtn = m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_btnExportToExcel']/i"));
//		ExportToCSvBtn.click();
			System.out.println("Download CSV File");
			Reporter.log("Download CSV File");
			
			File folder = new File(System.getProperty("user.dir")+"\\SonuPDF\\"+"\\File\\");
			//List the files on that folder
			Thread.sleep(5000);
			File[] listOfFiles = folder.listFiles();
			boolean found = false;
			File f = null;
			     //Look for the file in the files
			     // You should write smart REGEX according to the filename
			     for (File listOfFile : listOfFiles) {
			         if (listOfFile.isFile()) {
			              String fileName = listOfFile.getName();
			               System.out.println("File " + listOfFile.getName());
			               if (fileName.matches(fileName)) {
			                   f = new File(fileName);
			                   found = true;
			                   FileName=fileName;
			                }
			            }
			        }
			Assert.assertTrue(found, "Downloaded document is not found");
			f.deleteOnExit();
			
			
			
		}
		catch (Exception e)
		{
		System.out.println("Issue in DwonloadCSv = "+e);
		}
		
	}
    
    public void DownloadPDF()
   	{
   		
   		try
   		{
   			WebElement DownloadBtn = getWebElement(By.xpath("//i[@class='fa fa-file-pdf-o']"));
   			DownloadBtn.click();
//   			WebElement ExportToCSvBtn = m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_btnExportToExcel']/i"));
//   		ExportToCSvBtn.click();
   			System.out.println("Download CSV File");
   			Reporter.log("Download CSV File");
   			
   			File folder = new File(System.getProperty("user.dir")+"\\SonuPDF\\"+"\\File\\");
   			//List the files on that folder
   			Thread.sleep(5000);
   			File[] listOfFiles = folder.listFiles();
   			boolean found = false;
   			File f = null;
   			     //Look for the file in the files
   			     // You should write smart REGEX according to the filename
   			     for (File listOfFile : listOfFiles) {
   			         if (listOfFile.isFile()) {
   			              String fileName = listOfFile.getName();
   			               System.out.println("File " + listOfFile.getName());
   			               if (fileName.matches(fileName)) {
   			                   f = new File(fileName);
   			                   found = true;
   			                   FileName=fileName;
   			                }
   			            }
   			        }
   			Assert.assertTrue(found, "Downloaded document is not found");
   			f.deleteOnExit();
   			
   			
   			
   		}
   		catch (Exception e)
   		{
   		System.out.println("Issue in DwonloadCSv = "+e);
   		}
   		
   	}
    
    public static void readAllDataAtOnce(String file) 
    { 
        try { 
        	
        	String Path = "C:\\AAA\\SeleniumFramework\\SeleniumFramework\\Git_Payroll\\Ashiv_Payroll_New\\PayrollSeleniumFramework\\SonuPDF\\File\\"+FileName;
            // Create an object of file reader 
            // class with CSV file as a parameter. 
            FileReader filereader = new FileReader(Path); 
      
            // create csvReader object and skip first Line 
            CSVReader csvReader = new CSVReaderBuilder(filereader) 
                                      .withSkipLines(5) 
                                      .build(); 
            List<String[]> allData = csvReader.readAll(); 
      
            // print Data 
            for (String[] row : allData) { 
                for (String cell : row) { 
                    System.out.print(cell + "\t"); 
                } 
                System.out.println(); 
            } 
        } 
        catch (Exception e) { 
            e.printStackTrace(); 
        } 
    } 
    
    public static void readDataLineByLine(String file) 
    { 
  
        try { 
        	String Path = "C:\\AAA\\SeleniumFramework\\SeleniumFramework\\Git_Payroll\\Ashiv_Payroll_New\\PayrollSeleniumFramework\\SonuPDF\\File\\"+FileName;
            // Create an object of filereader class 
            // with CSV file as a parameter. 
            FileReader filereader = new FileReader(Path); 
  
            // create csvReader object passing 
            // filereader as parameter 
            CSVReader csvReader = new CSVReader(filereader); 
           List<String[]> list = csvReader.readAll();
   		
   		Iterator<String[]>ite= list.iterator();
   		
   		while(ite.hasNext()){
   			String[] data = ite.next();
   		//System.out.println(data[0]+","+data[1]+","+data[2]+","+data[3]+","+data[4]+","+data[5]);
   		if(data.length==18)
   		{
   			HashMap<String, String>hm=new HashMap<String,String>();
   			hm.put(data[0], data[1]);
   			System.out.println(hm);
   		
   			HashMap<String, String>hm1=new HashMap<String,String>();
   			hm1.put(data[2], data[3]);
   			//System.out.println(hm);
   			System.out.println(hm1);
   			
   			HashMap<String, String>hm2=new HashMap<String,String>();
   			hm2.put(data[4], data[5]);
   			System.out.println(hm2);
   			
   			HashMap<String, String>hm3=new HashMap<String,String>();
   			hm3.put(data[6], data[7]);
   			System.out.println(hm3);
   			
   			HashMap<String, String>hm4=new HashMap<String,String>();
   			hm4.put(data[8],data[9]);
   			System.out.println(hm4);
   			
   			HashMap<String, String>hm5=new HashMap<String,String>();
   			hm5.put(data[10],data[11]);
   			System.out.println(hm5);
   			
   			HashMap<String, String>hm6=new HashMap<String,String>();
   			hm6.put(data[12],data[13]);
   			System.out.println(hm6);
   			
   			HashMap<String, String>hm7=new HashMap<String,String>();
   			hm7.put(data[14],data[15]);
   			System.out.println(hm7);
   			
   			HashMap<String, String>hm8=new HashMap<String,String>();
   			hm8.put(data[16],data[17]);
   			System.out.println(hm8);
   		
   		
   	   		
   	for(Map.Entry<String , String>dd:hm.entrySet())
	{
   		Month=Month+"~"+dd.getKey();
   		PayPeriod=PayPeriod+"~"+dd.getValue();
		
	}
	for(Map.Entry<String , String>dd1:hm1.entrySet())
	{
		EENI=EENI+"~"+dd1.getKey();
		ERNI=ERNI+"~"+dd1.getValue();
		
	}
	for(Map.Entry<String , String>dd1:hm2.entrySet())
	{
		ERNIonTerminationAward=ERNIonTerminationAward+"~"+dd1.getKey();
		StudentLoan=StudentLoan+"~"+dd1.getValue();

	}
	for(Map.Entry<String , String>dd1:hm3.entrySet())
	{
		PostGraduateLoan=PostGraduateLoan+"~"+dd1.getKey();
		StatPayFunding=StatPayFunding+"~"+dd1.getValue();

	}
	for(Map.Entry<String , String>dd1:hm4.entrySet())
	{
		TaxRefundFunding=TaxRefundFunding+"~"+dd1.getKey();
		StatPayRecovery=StatPayRecovery+"~"+dd1.getValue();
	}
	
	for(Map.Entry<String , String>dd1:hm5.entrySet())
	{
		PreviousYearOverpayment=PreviousYearOverpayment+"~"+dd1.getKey();
		IncomeTax=IncomeTax+"~"+dd1.getValue();
	}
	
	for(Map.Entry<String , String>dd1:hm6.entrySet())
	{
		EmploymentAllowance=EmploymentAllowance+"~"+dd1.getKey();
		CISTax=CISTax+"~"+dd1.getValue();
	}
	
	for(Map.Entry<String , String>dd1:hm7.entrySet())
	{
		CISSuffered=CISSuffered+"~"+dd1.getKey();
		AmountDueToHMRC=AmountDueToHMRC+"~"+dd1.getValue();
	}
	
	for(Map.Entry<String , String>dd1:hm8.entrySet())
	{
		AmountPaid=AmountPaid+"~"+dd1.getKey();
		BalanceduetoHMRC=BalanceduetoHMRC+"~"+dd1.getValue();
	}
	
   		}
   		}
        }
        catch (Exception e) { 
            e.printStackTrace(); 
        } 
    } 
    
    
    
    
      public void Dataverify()
   	{
   		String AA="";
   		
   		int p=2;
   		int p1=1;
   		
   	
   		String ExcelMonth[]= Month.split("~");
   		String ExcelPayPeriod[]=PayPeriod.split("~");
   		String ExcelEENI[]=EENI.split("~");
   		String ExcelERNI[]=ERNI.split("~");
   		String ExcelERNIonTerminationAward[]=ERNIonTerminationAward.split("~");
   		String ExcelStudentLoan[]=StudentLoan.split("~");
   		String ExcelPostGraduateLoan[]=PostGraduateLoan.split("~");
   		String ExcelStatPayFunding[]=StatPayFunding.split("~");
   		String ExcelTaxRefundFunding[]=TaxRefundFunding.split("~");
   		String ExcelStatPayRecovery[]=StatPayRecovery.split("~");
   		
   		String ExcelPreviousYearOverpayment[]=PreviousYearOverpayment.split("~");
   		String ExcelIncomeTax[]=IncomeTax.split("~");
   		String ExcelEmploymentAllowance[]=EmploymentAllowance.split("~");
   		String ExcelCISTax[]=CISTax.split("~");
   		String ExcelCISSuffered[]=CISSuffered.split("~");
   		String ExcelAmountduetoHMRC[]=AmountDueToHMRC.split("~");
   		String ExcelAmountPaid[]=AmountPaid.split("~");
   		String ExcelBalanceduetoHMRC[]=BalanceduetoHMRC.split("~");
   		

   		
   		List<WebElement>list=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr"));
   		
   		for(int i=1;i<=list.size();i++)
   		{
   			System.out.println("-----------------"+i);
   				
   				List<WebElement>list2=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr["+i+"]/td"));
   				List<WebElement>list3=getWebElements(By.xpath("//table[@id='ctl00_ctl00_ParentContent_cPH_gridDisplay']/tbody/tr["+i+"]/td"));
   				
   				
   				
   				
   					soft.assertEquals(ExcelMonth[p].trim(), list3.get(0).getText().trim());
   					System.out.println(ExcelMonth[p].trim()+"="+list3.get(0).getText().trim());
   					
   					if(list3.get(0).getText().trim().equals("Total"))
   					{
   						System.out.println("Pay Period is not visible due to total line");
   						
   					}
   					else
   					{
   						soft.assertEquals(ExcelPayPeriod[p].trim(), list3.get(1).getText().trim());
   	   					System.out.println(ExcelPayPeriod[p].trim()+"="+list3.get(1).getText().trim());
   					}
   					
   					//Verify EENI Amount
   					String EENI=list2.get(0).getText().substring(1);
   					String EENIA=EENI.replaceAll(",", "");
   					double D_EENI = Double.parseDouble(ExcelEENI[p]);
   					DecimalFormat df = new DecimalFormat("0.00");
   					String EENIAmount = df.format(D_EENI);
   					soft.assertEquals(EENIAmount.trim(), EENIA);
   					System.out.println(EENIAmount.trim()+"="+EENIA);
   				
   					//Verify ERNI Amount
   					String ERNI=list2.get(1).getText().substring(1);
   					String ERNIA=ERNI.replaceAll(",", "");
   					double D_ERNI = Double.parseDouble(ExcelERNI[p]);
   					String ERNIAmount = df.format(D_ERNI);
   					soft.assertEquals(ERNIAmount.trim(), ERNIA);
   					System.out.println(ERNIAmount.trim()+"="+ERNIA);
   					
   					
   					
   					//Verify ERNIonTerminationAward Amount
   					String ERNIonTerminationAward=list2.get(2).getText().substring(1);
   					String ERNIonTerminationAwardA=ERNIonTerminationAward.replaceAll(",", "");
   					double D_ERNIonTerminationAward = Double.parseDouble(ExcelERNIonTerminationAward[p]);
   					String D_ERNIonTerminationAwardAmount = df.format(D_ERNIonTerminationAward);
   					soft.assertEquals(D_ERNIonTerminationAwardAmount.trim(), ERNIonTerminationAwardA);
   					System.out.println(D_ERNIonTerminationAwardAmount.trim()+"="+ERNIonTerminationAwardA);
   					
   					//Verify StudentLoan Amount
   					String StudentLoan=list2.get(3).getText().substring(1);
   					String StudentLoanA=StudentLoan.replaceAll(",", "");
   					double D_StudentLoan = Double.parseDouble(ExcelStudentLoan[p]);
   					String D_StudentLoanAmount = df.format(D_StudentLoan);
   					soft.assertEquals(D_StudentLoanAmount.trim(), StudentLoanA);
   					System.out.println(D_StudentLoanAmount.trim()+"="+StudentLoanA);
   					
   					
   					//Verify PostGraduateLoan Amount
   					String PostGraduateLoan=list2.get(4).getText().substring(1);
   					String PostGraduateLoanA=PostGraduateLoan.replaceAll(",", "");
   					double D_PostGraduateLoan = Double.parseDouble(ExcelPostGraduateLoan[p]);
   					String D_PostGraduateLoanAmount = df.format(D_PostGraduateLoan);
   					soft.assertEquals(D_PostGraduateLoanAmount.trim(), PostGraduateLoanA);
   					System.out.println(D_PostGraduateLoanAmount.trim()+"="+PostGraduateLoanA);
   					
   					
   					//Verify StatPayFunding Amount
   					String StatPayFunding=list2.get(5).getText().substring(1);
   					String StatPayFundingA=StatPayFunding.replaceAll(",", "");
   					double D_StatPayFunding = Double.parseDouble(ExcelStatPayFunding[p]);
   					String D_StatPayFundingAmount = df.format(D_StatPayFunding);
   					soft.assertEquals(D_StatPayFundingAmount.trim(), StatPayFundingA);
   					System.out.println(D_StatPayFundingAmount.trim()+"="+StatPayFundingA);
   					
   					
   					//Verify TaxRefundFunding Amount
   					String TaxRefundFunding=list2.get(6).getText().substring(1);
   					String TaxRefundFundingA=TaxRefundFunding.replaceAll(",", "");
   					double D_TaxRefundFunding = Double.parseDouble(ExcelTaxRefundFunding[p]);
   					String D_TaxRefundFundingAmount = df.format(D_TaxRefundFunding);
   					soft.assertEquals(D_TaxRefundFundingAmount.trim(), TaxRefundFundingA);
   					System.out.println(D_TaxRefundFundingAmount.trim()+"="+TaxRefundFundingA);
   					
   					
   					//Verify StatPayRecovery Amount
   					String StatPayRecovery=list2.get(7).getText().substring(1);
   					String StatPayRecoveryA=StatPayRecovery.replaceAll(",", "");
   					double D_StatPayRecovery = Double.parseDouble(ExcelStatPayRecovery[p]);
   					String D_StatPayRecoveryAmount = df.format(D_StatPayRecovery);
   					soft.assertEquals(D_StatPayRecoveryAmount.trim(), StatPayRecoveryA);
   					System.out.println(D_StatPayRecoveryAmount.trim()+"="+StatPayRecoveryA);
   					
   					
   					//Verify PreviousYearOverpaymentA Amount
   					String PreviousYearOverpayment=list2.get(8).getText().substring(1);
   					String PreviousYearOverpaymentA=PreviousYearOverpayment.replaceAll(",", "");
   					double D_PreviousYearOverpayment = Double.parseDouble(ExcelPreviousYearOverpayment[p]);
   					String D_PreviousYearOverpaymentAmount = df.format(D_PreviousYearOverpayment);
   					soft.assertEquals(D_PreviousYearOverpaymentAmount.trim(), PreviousYearOverpaymentA);
   					System.out.println(D_PreviousYearOverpaymentAmount.trim()+"="+PreviousYearOverpaymentA);
   					
   					
   					//Verify IncomeTaxA Amount
   					String IncomeTax=list2.get(9).getText().substring(1);
   					String IncomeTaxA=IncomeTax.replaceAll(",", "");
   					double D_IncomeTax = Double.parseDouble(ExcelIncomeTax[p]);
   					String D_IncomeTaxAmount = df.format(D_IncomeTax);
   					soft.assertEquals(D_IncomeTaxAmount.trim(), IncomeTaxA);
   					System.out.println(D_IncomeTaxAmount.trim()+"="+IncomeTaxA);
   					
   					
   					//Verify EmploymentAllowance Amount
   					String EmploymentAllowance=list2.get(10).getText().substring(1);
   					String EmploymentAllowanceA=EmploymentAllowance.replaceAll(",", "");
   					double D_EmploymentAllowance = Double.parseDouble(ExcelEmploymentAllowance[p]);
   					String D_EmploymentAllowanceAmount = df.format(D_EmploymentAllowance);
   					soft.assertEquals(D_EmploymentAllowanceAmount.trim(), EmploymentAllowanceA);
   					System.out.println(D_EmploymentAllowanceAmount.trim()+"="+EmploymentAllowanceA);
   					
   					
   					//Verify CISTax Amount
   					String CISTax;
   					String z[]=list2.get(11).getText().split("", 3);
   					if(z[0].equals("-"))
   					{
   						CISTax=list2.get(11).getText().replaceAll("£", "");
   					}
   					else
   					{
   						CISTax=list2.get(11).getText().substring(1);
   					}
   					String CISTaxA=CISTax.replaceAll(",", "");
   					double D_CISTax = Double.parseDouble(ExcelCISTax[p]);
   					String D_CISTaxAmount = df.format(D_CISTax);
   					soft.assertEquals(D_CISTaxAmount.trim(), CISTaxA);
   					System.out.println(D_CISTaxAmount.trim()+"="+CISTaxA);
   					
   					
   					//Verify D_CISSuffered Amount
   					String CISSuffered;
   					String z5[]=list2.get(12).getText().split("", 3);
   					if(z5[0].equals("-"))
   					{
   						CISSuffered=list2.get(12).getText().replaceAll("£", "");
   					}
   					else
   					{
   						CISSuffered=list2.get(12).getText().substring(1);
   					}
   					String CISSufferedA=CISTax.replaceAll(",", "");
   					double D_CISSuffered = Double.parseDouble(ExcelCISSuffered[p]);
   					String D_CISSufferedAmount = df.format(D_CISSuffered);
   					soft.assertEquals(D_CISSufferedAmount.trim(), CISSufferedA);
   					System.out.println(D_CISSufferedAmount.trim()+"="+CISSufferedA);
   					
   					
   					//Verify AmountduetoHMRC Amount
   					String AmountduetoHMRC;
   					String z1[]=list2.get(13).getText().split("", 3);
   					if(z1[0].equals("-"))
   					{
   						AmountduetoHMRC=list2.get(13).getText().replaceAll("£", "");
   					}
   					else
   					{
   						AmountduetoHMRC=list2.get(13).getText().substring(1);
   					}
   					String AmountduetoHMRCA=AmountduetoHMRC.replaceAll(",", "");
   					double D_AmountduetoHMRC = Double.parseDouble(ExcelAmountduetoHMRC[p]);
   					String D_AmountduetoHMRCAmount = df.format(D_AmountduetoHMRC);
   					soft.assertEquals(D_AmountduetoHMRCAmount.trim(), AmountduetoHMRCA);
   					System.out.println(D_AmountduetoHMRCAmount.trim()+"="+AmountduetoHMRCA);
   					
   					
   					//Verify AmountPaid Amount
   					String AmountPaid;
   					String z2[]=list2.get(14).getText().split("", 3);
   					if(z2[0].equals("-"))
   					{
   						AmountPaid=list2.get(14).getText().replaceAll("£", "");
   					}
   					else
   					{
   						AmountPaid=list2.get(14).getText().substring(1);
   					}
   					String AmountPaidA=AmountPaid.replaceAll(",", "");
   					double D_AmountPaid = Double.parseDouble(ExcelAmountPaid[p]);
   					String D_AmountPaidAmount = df.format(D_AmountPaid);
   					soft.assertEquals(D_AmountPaidAmount.trim(), AmountPaidA);
   					System.out.println(D_AmountPaidAmount.trim()+"="+AmountPaidA);
   					
   					
   					
   					if(i!=13)
   					{
   					//Verify BalanceduetoHMRC Amount
   	   					String BalanceduetoHMRC;
   	   					String z3[]=list2.get(15).getText().split("", 3);
   	   					if(z3[0].equals("-"))
   	   					{
   	   						BalanceduetoHMRC=list2.get(15).getText().replaceAll("£", "");
   	   					}
   	   					else
   	   					{
   	   						BalanceduetoHMRC=list2.get(15).getText().substring(1);
   	   					}
   	   					String BalanceduetoHMRCA=BalanceduetoHMRC.replaceAll(",", "");
   	   					double D_BalanceduetoHMRC = Double.parseDouble(ExcelBalanceduetoHMRC[p]);
   	   					String D_BalanceduetoHMRCAmount = df.format(D_BalanceduetoHMRC);
   	   					soft.assertEquals(D_BalanceduetoHMRCAmount.trim(), BalanceduetoHMRCA);
   	   					System.out.println(D_BalanceduetoHMRCAmount.trim()+"="+BalanceduetoHMRCA);
   					}
   					p++;
   			}
   		
   			
   				
   			}
      
      
      public void DataverifyPDF()
     	{
     		String AA="";
     		
     		int p=1;
     		int p1=1;
     		
     	
     		//String ExcelMonth[]= Month.split("~");
     		String ExcelPayPeriod[]=PayPeriod.split("~");
     		String ExcelEENI[]=EENI.split("~");
     		String ExcelERNI[]=ERNI.split("~");
     		String ExcelERNIonTerminationAward[]=ERNIonTerminationAward.split("~");
     		String ExcelStudentLoan[]=StudentLoan.split("~");
     		String ExcelPostGraduateLoan[]=PostGraduateLoan.split("~");
     		String ExcelStatPayFunding[]=StatPayFunding.split("~");
     		String ExcelTaxRefundFunding[]=TaxRefundFunding.split("~");
     		String ExcelStatPayRecovery[]=StatPayRecovery.split("~");
     		
     		String ExcelPreviousYearOverpayment[]=PreviousYearOverpayment.split("~");
     		String ExcelIncomeTax[]=IncomeTax.split("~");
     		String ExcelEmploymentAllowance[]=EmploymentAllowance.split("~");
     		String ExcelCISTax[]=CISTax.split("~");
     		String ExcelCISSuffered[]=CISSuffered.split("~");
     		String ExcelAmountduetoHMRC[]=AmountDueToHMRC.split("~");
     		String ExcelAmountPaid[]=AmountPaid.split("~");
     		String ExcelBalanceduetoHMRC[]=BalanceduetoHMRC.split("~");
     		

     		
     		List<WebElement>list=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr"));
     		
     		for(int i=1;i<=list.size()-1;i++)
     		{
     			System.out.println("-----------------"+i);
     				
     				List<WebElement>list2=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr["+i+"]/td"));
     				List<WebElement>list3=getWebElements(By.xpath("//table[@id='ctl00_ctl00_ParentContent_cPH_gridDisplay']/tbody/tr["+i+"]/td"));
     				
     				
     				
     				
     				//	soft.assertEquals(ExcelMonth[p].trim(), list3.get(0).getText().trim());
     				//	System.out.println(ExcelMonth[p].trim()+"="+list3.get(0).getText().trim());
     					
     					if(list3.get(0).getText().trim().equals("Total"))
     					{
     						System.out.println("Pay Period is not visible due to total line");
     						
     					}
     					else
     					{
     						soft.assertEquals(ExcelPayPeriod[p].trim(), list3.get(1).getText().trim());
     	   					System.out.println(ExcelPayPeriod[p].trim()+"="+list3.get(1).getText().trim());
     					}
     					
     					//Verify EENI Amount
     					String EENI=list2.get(0).getText().substring(1);
     					String EENIA=EENI.replaceAll(",", "");
     					double D_EENI = Double.parseDouble(ExcelEENI[p]);
     					DecimalFormat df = new DecimalFormat("0.00");
     					String EENIAmount = df.format(D_EENI);
     					soft.assertEquals(EENIAmount.trim(), EENIA);
     					System.out.println(EENIAmount.trim()+"="+EENIA);
     				
     					//Verify ERNI Amount
     					String ERNI=list2.get(1).getText().substring(1);
     					String ERNIA=ERNI.replaceAll(",", "");
     					double D_ERNI = Double.parseDouble(ExcelERNI[p]);
     					String ERNIAmount = df.format(D_ERNI);
     					soft.assertEquals(ERNIAmount.trim(), ERNIA);
     					System.out.println(ERNIAmount.trim()+"="+ERNIA);
     					
     					
     					
     					//Verify ERNIonTerminationAward Amount
     					String ERNIonTerminationAward=list2.get(2).getText().substring(1);
     					String ERNIonTerminationAwardA=ERNIonTerminationAward.replaceAll(",", "");
     					double D_ERNIonTerminationAward = Double.parseDouble(ExcelERNIonTerminationAward[p]);
     					String D_ERNIonTerminationAwardAmount = df.format(D_ERNIonTerminationAward);
     					soft.assertEquals(D_ERNIonTerminationAwardAmount.trim(), ERNIonTerminationAwardA);
     					System.out.println(D_ERNIonTerminationAwardAmount.trim()+"="+ERNIonTerminationAwardA);
     					
     					//Verify StudentLoan Amount
     					String StudentLoan=list2.get(3).getText().substring(1);
     					String StudentLoanA=StudentLoan.replaceAll(",", "");
     					double D_StudentLoan = Double.parseDouble(ExcelStudentLoan[p]);
     					String D_StudentLoanAmount = df.format(D_StudentLoan);
     					soft.assertEquals(D_StudentLoanAmount.trim(), StudentLoanA);
     					System.out.println(D_StudentLoanAmount.trim()+"="+StudentLoanA);
     					
     					
     					//Verify PostGraduateLoan Amount
     					String PostGraduateLoan=list2.get(4).getText().substring(1);
     					String PostGraduateLoanA=PostGraduateLoan.replaceAll(",", "");
     					double D_PostGraduateLoan = Double.parseDouble(ExcelPostGraduateLoan[p]);
     					String D_PostGraduateLoanAmount = df.format(D_PostGraduateLoan);
     					soft.assertEquals(D_PostGraduateLoanAmount.trim(), PostGraduateLoanA);
     					System.out.println(D_PostGraduateLoanAmount.trim()+"="+PostGraduateLoanA);
     					
     					
     					//Verify StatPayFunding Amount
     					String StatPayFunding=list2.get(5).getText().substring(1);
     					String StatPayFundingA=StatPayFunding.replaceAll(",", "");
     					double D_StatPayFunding = Double.parseDouble(ExcelStatPayFunding[p]);
     					String D_StatPayFundingAmount = df.format(D_StatPayFunding);
     					soft.assertEquals(D_StatPayFundingAmount.trim(), StatPayFundingA);
     					System.out.println(D_StatPayFundingAmount.trim()+"="+StatPayFundingA);
     					
     					
     					//Verify TaxRefundFunding Amount
     					String TaxRefundFunding=list2.get(6).getText().substring(1);
     					String TaxRefundFundingA=TaxRefundFunding.replaceAll(",", "");
     					double D_TaxRefundFunding = Double.parseDouble(ExcelTaxRefundFunding[p]);
     					String D_TaxRefundFundingAmount = df.format(D_TaxRefundFunding);
     					soft.assertEquals(D_TaxRefundFundingAmount.trim(), TaxRefundFundingA);
     					System.out.println(D_TaxRefundFundingAmount.trim()+"="+TaxRefundFundingA);
     					
     					
     					//Verify StatPayRecovery Amount
     					String StatPayRecovery=list2.get(7).getText().substring(1);
     					String StatPayRecoveryA=StatPayRecovery.replaceAll(",", "");
     					double D_StatPayRecovery = Double.parseDouble(ExcelStatPayRecovery[p]);
     					String D_StatPayRecoveryAmount = df.format(D_StatPayRecovery);
     					soft.assertEquals(D_StatPayRecoveryAmount.trim(), StatPayRecoveryA);
     					System.out.println(D_StatPayRecoveryAmount.trim()+"="+StatPayRecoveryA);
     					
     					
     					//Verify PreviousYearOverpaymentA Amount
     					String PreviousYearOverpayment=list2.get(8).getText().substring(1);
     					String PreviousYearOverpaymentA=PreviousYearOverpayment.replaceAll(",", "");
     					double D_PreviousYearOverpayment = Double.parseDouble(ExcelPreviousYearOverpayment[p]);
     					String D_PreviousYearOverpaymentAmount = df.format(D_PreviousYearOverpayment);
     					soft.assertEquals(D_PreviousYearOverpaymentAmount.trim(), PreviousYearOverpaymentA);
     					System.out.println(D_PreviousYearOverpaymentAmount.trim()+"="+PreviousYearOverpaymentA);
     					
     					
     					//Verify IncomeTaxA Amount
     					String IncomeTax=list2.get(9).getText().substring(1);
     					String IncomeTaxA=IncomeTax.replaceAll(",", "");
     					double D_IncomeTax = Double.parseDouble(ExcelIncomeTax[p]);
     					String D_IncomeTaxAmount = df.format(D_IncomeTax);
     					soft.assertEquals(D_IncomeTaxAmount.trim(), IncomeTaxA);
     					System.out.println(D_IncomeTaxAmount.trim()+"="+IncomeTaxA);
     					
     					
     					//Verify EmploymentAllowance Amount
     					String EmploymentAllowance=list2.get(10).getText().substring(1);
     					String EmploymentAllowanceA=EmploymentAllowance.replaceAll(",", "");
     					double D_EmploymentAllowance = Double.parseDouble(ExcelEmploymentAllowance[p]);
     					String D_EmploymentAllowanceAmount = df.format(D_EmploymentAllowance);
     					soft.assertEquals(D_EmploymentAllowanceAmount.trim(), EmploymentAllowanceA);
     					System.out.println(D_EmploymentAllowanceAmount.trim()+"="+EmploymentAllowanceA);
     					
     					
     					//Verify CISTax Amount
     					String CISTax;
     					String z[]=list2.get(11).getText().split("", 3);
     					if(z[0].equals("-"))
     					{
     						CISTax=list2.get(11).getText().replaceAll("£", "");
     					}
     					else
     					{
     						CISTax=list2.get(11).getText().substring(1);
     					}
     					String CISTaxA=CISTax.replaceAll(",", "");
     					double D_CISTax = Double.parseDouble(ExcelCISTax[p]);
     					String D_CISTaxAmount = df.format(D_CISTax);
     					soft.assertEquals(D_CISTaxAmount.trim(), CISTaxA);
     					System.out.println(D_CISTaxAmount.trim()+"="+CISTaxA);
     					
     					
     					//Verify D_CISSuffered Amount
     					String CISSuffered;
     					String z5[]=list2.get(12).getText().split("", 3);
     					if(z5[0].equals("-"))
     					{
     						CISSuffered=list2.get(12).getText().replaceAll("£", "");
     					}
     					else
     					{
     						CISSuffered=list2.get(12).getText().substring(1);
     					}
     					String CISSufferedA=CISTax.replaceAll(",", "");
     					double D_CISSuffered = Double.parseDouble(ExcelCISSuffered[p]);
     					String D_CISSufferedAmount = df.format(D_CISSuffered);
     					soft.assertEquals(D_CISSufferedAmount.trim(), CISSufferedA);
     					System.out.println(D_CISSufferedAmount.trim()+"="+CISSufferedA);
     					
     					
     					//Verify AmountduetoHMRC Amount
     					String AmountduetoHMRC;
     					String z1[]=list2.get(13).getText().split("", 3);
     					if(z1[0].equals("-"))
     					{
     						AmountduetoHMRC=list2.get(13).getText().replaceAll("£", "");
     					}
     					else
     					{
     						AmountduetoHMRC=list2.get(13).getText().substring(1);
     					}
     					String AmountduetoHMRCA=AmountduetoHMRC.replaceAll(",", "");
     					double D_AmountduetoHMRC = Double.parseDouble(ExcelAmountduetoHMRC[p]);
     					String D_AmountduetoHMRCAmount = df.format(D_AmountduetoHMRC);
     					soft.assertEquals(D_AmountduetoHMRCAmount.trim(), AmountduetoHMRCA);
     					System.out.println(D_AmountduetoHMRCAmount.trim()+"="+AmountduetoHMRCA);
     					
     					
     					//Verify AmountPaid Amount
     					String AmountPaid;
     					String z2[]=list2.get(14).getText().split("", 3);
     					if(z2[0].equals("-"))
     					{
     						AmountPaid=list2.get(14).getText().replaceAll("£", "");
     					}
     					else
     					{
     						AmountPaid=list2.get(14).getText().substring(1);
     					}
     					String AmountPaidA=AmountPaid.replaceAll(",", "");
     					double D_AmountPaid = Double.parseDouble(ExcelAmountPaid[p]);
     					String D_AmountPaidAmount = df.format(D_AmountPaid);
     					soft.assertEquals(D_AmountPaidAmount.trim(), AmountPaidA);
     					System.out.println(D_AmountPaidAmount.trim()+"="+AmountPaidA);
     					
     					
     					
     					if(i!=13)
     					{
     					//Verify BalanceduetoHMRC Amount
     	   					String BalanceduetoHMRC;
     	   					String z3[]=list2.get(15).getText().split("", 3);
     	   					if(z3[0].equals("-"))
     	   					{
     	   						BalanceduetoHMRC=list2.get(15).getText().replaceAll("£", "");
     	   					}
     	   					else
     	   					{
     	   						BalanceduetoHMRC=list2.get(15).getText().substring(1);
     	   					}
     	   					String BalanceduetoHMRCA=BalanceduetoHMRC.replaceAll(",", "");
     	   					double D_BalanceduetoHMRC = Double.parseDouble(ExcelBalanceduetoHMRC[p]);
     	   					String D_BalanceduetoHMRCAmount = df.format(D_BalanceduetoHMRC);
     	   					soft.assertEquals(D_BalanceduetoHMRCAmount.trim(), BalanceduetoHMRCA);
     	   					System.out.println(D_BalanceduetoHMRCAmount.trim()+"="+BalanceduetoHMRCA);
     					}
     					p++;
     			}
     		
     			
     				
     			}
   			
   	
      public void ReadFull_FilletedPDFReportofDividentVoucher(int day, String Amount) throws Exception
		{
    //	  String Path = "C:\\AAA\\SeleniumFramework\\SeleniumFramework\\Git_Payroll\\Ashiv_Payroll_New\\PayrollSeleniumFramework\\SonuPDF\\File\\"+FileName;
		    File file = new File("C:\\AAA\\SeleniumFramework\\SeleniumFramework\\Git_Payroll\\Ashiv_Payroll_New\\PayrollSeleniumFramework\\SonuPDF\\File\\"+FileName);
		    PDDocument document = PDDocument.load(file);
		    PDFTextStripper pdfStripper = new PDFTextStripper();
//		    pdfStripper.setStartPage(StartPg);
//		    pdfStripper.setEndPage(EndPg);

		   //load all lines into a string
		    String pages = pdfStripper.getText(document);

		   //split by detecting newline
		    String[] lines = pages.split("\r\n|\r|\n");

		   int count=0;   //Just to indicate line number
		    for(String temp:lines)
		    {
		        System.out.println(count+" "+temp);
		        count++;
		    }    
		      for (int k=46;k<=count-2;k++) 
		   {
			   
				String getlinedata1 = lines[k];
	 
				String[] getlinedata = getlinedata1.split(" ");
				
			
				
				if (getlinedata.length == 17) {
					String trans2 = getlinedata[0].replaceAll("[,£)(]", "");
					PayPeriod = PayPeriod + "~" + trans2;
					System.out.println("Get PayPeriod in  PDF -->" + PayPeriod);
	 
					String dd = getlinedata[1].replaceAll("[,£)(]", "");
					EENI = EENI + "~" + dd;
					System.out.println("Get PDf EENI is-->" + EENI);
	 
					String dd1 = getlinedata[2].replaceAll("[,£)(]", "");
					ERNI = ERNI + "~" + dd1;
					System.out.println("Get PDF ERNI is-->" + ERNI);
	 
					String dd2 = getlinedata[3].replaceAll("[,£)(]", "");
					ERNIonTerminationAward = ERNIonTerminationAward + "~" + dd2;
					System.out.println("Get PDF ERNIonTerminationAward is-->" + ERNIonTerminationAward);
	 
					String dd3 = getlinedata[4].replaceAll("[,£)(]", "");
	 
					StudentLoan = StudentLoan + "~" + dd3;
					System.out.println("Get PDF StudentLoan Amt  is-->" + StudentLoan);
	 
					String dd4 = getlinedata[5].replaceAll("[,£)(]", "");
					PostGraduateLoan = PostGraduateLoan + "~" + dd4;
					System.out.println("Get PDF PostGraduateLoan is-->" + PostGraduateLoan);
				
					String dd5 = getlinedata[6].replaceAll("[,£)(]", "");
					StatPayFunding = StatPayFunding + "~" + dd5;
					System.out.println("Get StatPayFunding in  PDF -->" + StatPayFunding);
	 
					String dd6 = getlinedata[7].replaceAll("[,£)(]", "");
					TaxRefundFunding = TaxRefundFunding + "~" + dd6;
					System.out.println("Get PDf TaxRefundFunding is-->" + TaxRefundFunding);
	 
					String dd7 = getlinedata[8].replaceAll("[,£)(]", "");
					StatPayRecovery = StatPayRecovery + "~" + dd7;
					System.out.println("Get PDF StatPayRecovery is-->" + StatPayRecovery);
	 
					String dd8 = getlinedata[9].replaceAll("[,£)(]", "");
					PreviousYearOverpayment = PreviousYearOverpayment + "~" + dd8;
					System.out.println("Get PDF PreviousYearOverpayment is-->" + PreviousYearOverpayment);
					
					
					String Data = getlinedata[10].replaceAll("[,£)(]", "");
					IncomeTax = IncomeTax + "~" + Data;
					System.out.println("Get PDF IncomeTax is-->" + IncomeTax);
					
					String Data1 = getlinedata[11].replaceAll("[,£)(]", "");
					EmploymentAllowance = EmploymentAllowance + "~" + Data1;
					System.out.println("Get PDF EmploymentAllowance is-->" + EmploymentAllowance);
					
					
					String Data3 = getlinedata[12].replaceAll("[,£)(]", "");
					CISTax = CISTax + "~" + Data3;
					System.out.println("Get PDF CISTax is-->" + CISTax);
					
					String Data4 = getlinedata[13].replaceAll("[,£)(]", "");
					CISSuffered = CISSuffered + "~" + Data4;
					System.out.println("Get PDF CISSuffered is-->" + CISSuffered);
					
					String Data5 = getlinedata[14].replaceAll("[,£)(]", "");
					AmountDueToHMRC = AmountDueToHMRC + "~" + Data5;
					System.out.println("Get PDF AmountDueToHMRC is-->" + AmountDueToHMRC);
					
					String Data6 = getlinedata[15].replaceAll("[,£)(]", "");
					AmountPaid = AmountPaid + "~" + Data6;
					System.out.println("Get PDF AmountPaid is-->" + AmountPaid);
					
					String Data7 = getlinedata[16].replaceAll("[,£)(]", "");
					BalanceduetoHMRC = BalanceduetoHMRC + "~" + Data7;
					System.out.println("Get PDF BalanceduetoHMRC is-->" + BalanceduetoHMRC);
	 
				}
					
				
			}
	 
			document.close();
	 
			Thread.sleep(2000);
	 
			if (file.delete() == true)
				
			{
				System.out.println("Test PDF File is deleted");
			}
		}
 
  
      public String getAmountByNameAndIndexInDashboard(String EmpName, int index)
      {
      	String Data=null;
      	List<WebElement> list = getWebElements(By.xpath("(//a[normalize-space()='"+EmpName+"'])[1]/following::td["+index+"]"));
      	for(int i=0;i<=list.size()-1;i++)
      	{
      		List<WebElement> list2 = getWebElements(By.xpath("(//a[normalize-space()='"+EmpName+"'])[1]/following::td["+index+"]"));
  			 jsExec.executeScript("arguments[0].scrollIntoView(true);", list2.get(i));
  			 String UiData = list2.get(i).getText();
  			 Data=UiData.trim();
      		
      		
      	}
      	String UiGetData=Data.replaceAll("[£,]", "");
  		return UiGetData;
      	
      }
      
      
      public void VerifyTexCalculation(String Salary,String Tex)
      {
    	  
    	  double SalaryA = Double.parseDouble(Salary.replaceAll(",", ""));
    	  double TexA = Double.parseDouble(Tex.replaceAll(",", ""));
    	  double texamountmonth=1048.25;
    	  double Allowances=SalaryA-texamountmonth;
    	  
    	  DecimalFormat df = new DecimalFormat("#.##");
			String AllowancesAmount = df.format(Allowances); 
			String TaxablePay=AllowancesAmount.substring(0, AllowancesAmount.length()-3);
			 double TaxablePayA = Double.parseDouble(TaxablePay.replaceAll(",", ""));
    	  if(3141.67>=TaxablePayA)
    	  {
    		  double texAmoumt=TaxablePayA*20/100;
    		  String ExpAmount = df.format(TexA); 
    		  String AcualAmount = df.format(texAmoumt); 
    		  soft.assertEquals(ExpAmount, AcualAmount);
    		  System.out.println("Verify Tex Exp : "+ExpAmount +"  Acual "+AcualAmount);
    		  Reporter.log("Verify Tex Exp : "+ExpAmount +"  Acual "+AcualAmount);
    	  }
    	  if(3141.67<TaxablePayA && 10428.33>TaxablePayA)
    	  {
    		  double twentyTexAmoumt=3141.67*20/100;
    		 double PendingTaxablePayAmount= TaxablePayA-3141.67;
    		 double fortyTexAmount = PendingTaxablePayAmount*40/100;
    		 double Total = fortyTexAmount+twentyTexAmoumt;
    		  String ExpAmount = df.format(TexA); 
    		  DecimalFormat df2 = new DecimalFormat("0.000000");
    		  String AcualAmount2 = df2.format(Total); 
    		 String AcualAmount=AcualAmount2.substring(0, AcualAmount2.length()-4);
    		  soft.assertEquals(ExpAmount, AcualAmount);
    		  System.out.println("Verify Tex Exp : "+ExpAmount +"  Acual "+AcualAmount);
    		  Reporter.log("Verify Tex Exp : "+ExpAmount +"  Acual "+AcualAmount);
    	  }
    	  
    	  
    	  if(10428.33<=TaxablePayA)
    	  {
    		  double twentyTexAmoumt=3141.67*20/100;
    		 double PendingTaxablePayAmount= 10428.33-3141.67;
    		 double fortyTexAmount = PendingTaxablePayAmount*40/100;
    		 double FortyFiveTextAmount = TaxablePayA-10428.33;   		 
    		double FortyFive=FortyFiveTextAmount*45/100;
    		double Total=twentyTexAmoumt+fortyTexAmount+FortyFive;
    		double rounded = Math.ceil(Total * 10000) / 10000.0;
           
            
    		 
    		  DecimalFormat df2 = new DecimalFormat("0.00");
    		  String ExpAmount = df2.format(TexA); 
    		  String AcualAmount = df2.format(rounded); 
    		
    		  soft.assertEquals(ExpAmount, AcualAmount);
    		  System.out.println("Verify Tex Exp : "+ExpAmount +"  Acual "+AcualAmount);
    		  Reporter.log("Verify Tex Exp : "+ExpAmount +"  Acual "+AcualAmount);
    	  }
    	  
    	  
    	  
    	  
      }
      
      
      public void VerifyTexCalculationWeekly(String Salary,String Tex)
      {
    	  
    	  double SalaryA = Double.parseDouble(Salary.replaceAll(",", ""));
    	  double TexA = Double.parseDouble(Tex.replaceAll(",", ""));
    	  double texamountmonth=241.90;
    	  double Allowances=SalaryA-texamountmonth;
    	  
    	  DecimalFormat df = new DecimalFormat("0.00");
			String AllowancesAmount = df.format(Allowances); 
			String TaxablePay=AllowancesAmount.substring(0, AllowancesAmount.length()-3);
			 double TaxablePayA = Double.parseDouble(TaxablePay.replaceAll(",", ""));
    	  if(725>=TaxablePayA)
    	  {
    		  double texAmoumt=TaxablePayA*20/100;
    		  String ExpAmount = df.format(TexA); 
    		  String AcualAmount = df.format(texAmoumt); 
    		  soft.assertEquals(ExpAmount, AcualAmount);
    		  System.out.println("Verify Tex Exp : "+ExpAmount +"  Acual "+AcualAmount);
    		  Reporter.log("Verify Tex Exp : "+ExpAmount +"  Acual "+AcualAmount);
    	  }
    	  if(725<TaxablePayA && 2406.54>TaxablePayA)
    	  {
    		  double twentyTexAmoumt=725*20/100;
    		 double PendingTaxablePayAmount= TaxablePayA-725;
    		 double fortyTexAmount = PendingTaxablePayAmount*40/100;
    		 double Total = fortyTexAmount+twentyTexAmoumt;
    		  String ExpAmount = df.format(TexA); 
    		  DecimalFormat df2 = new DecimalFormat("0.000000");
    		  String AcualAmount2 = df2.format(Total); 
    		 String AcualAmount=AcualAmount2.substring(0, AcualAmount2.length()-4);
    		  soft.assertEquals(ExpAmount, AcualAmount);
    		  System.out.println("Verify Tex Exp : "+ExpAmount +"  Acual "+AcualAmount);
    		  Reporter.log("Verify Tex Exp : "+ExpAmount +"  Acual "+AcualAmount);
    	 
    	  }
    	  
    	  if(2406.54<=TaxablePayA)
    	  {
    		  double twentyTexAmoumt=725*20/100;
    		 double PendingTaxablePayAmount= 2406.54-725;
    		 double fortyTexAmount = PendingTaxablePayAmount*40/100;
    		 double FortyFiveTextAmount = TaxablePayA-2406.54;   		 
    		double FortyFive=FortyFiveTextAmount*45/100;
    		double Total=twentyTexAmoumt+fortyTexAmount+FortyFive;
    		double rounded = Math.ceil(Total * 10000) / 10000.0;
           
            
    		String ExpAmount = df.format(TexA); 
    		  DecimalFormat df2 = new DecimalFormat("0.000000");
    		  String AcualAmount2 = df2.format(rounded); 
    		  String AcualAmount=AcualAmount2.substring(0, AcualAmount2.length()-4);
    		  soft.assertEquals(ExpAmount, AcualAmount);
    		  System.out.println("Verify Tex Exp : "+ExpAmount +"  Acual "+AcualAmount);
    		  Reporter.log("Verify Tex Exp : "+ExpAmount +"  Acual "+AcualAmount);
    	  }
      }
      
      
      public void VerifyTexCalculationFortnightly(String Salary,String Tex)
      {
    	  
    	  double SalaryA = Double.parseDouble(Salary.replaceAll(",", ""));
    	  double TexA = Double.parseDouble(Tex.replaceAll(",", ""));
    	  double texamountmonth=483.81;
    	  double Allowances=SalaryA-texamountmonth;
    	  
    	  DecimalFormat df = new DecimalFormat("0.00");
			String AllowancesAmount = df.format(Allowances); 
			String TaxablePay=AllowancesAmount.substring(0, AllowancesAmount.length()-3);
			 double TaxablePayA = Double.parseDouble(TaxablePay.replaceAll(",", ""));
    	  if(1450>=TaxablePayA)
    	  {
    		  double texAmoumt=TaxablePayA*20/100;
    		  String ExpAmount = df.format(TexA); 
    		  String AcualAmount = df.format(texAmoumt); 
    		  soft.assertEquals(ExpAmount, AcualAmount);
    		  System.out.println("Verify Tex Exp : "+ExpAmount +"  Acual "+AcualAmount);
    		  Reporter.log("Verify Tex Exp : "+ExpAmount +"  Acual "+AcualAmount);
    	  }
    	  if(1450<TaxablePayA && 4813.07>TaxablePayA)
    	  {
    		  double twentyTexAmoumt=1450*20/100;
    		 double PendingTaxablePayAmount= TaxablePayA-1450;
    		 double fortyTexAmount = PendingTaxablePayAmount*40/100;
    		 double Total = fortyTexAmount+twentyTexAmoumt;
    		  String ExpAmount = df.format(TexA); 
    		  DecimalFormat df2 = new DecimalFormat("0.000000");
    		  String AcualAmount2 = df2.format(Total); 
    		 String AcualAmount=AcualAmount2.substring(0, AcualAmount2.length()-4);
    		  soft.assertEquals(ExpAmount, AcualAmount);
    		  System.out.println("Verify Tex Exp : "+ExpAmount +"  Acual "+AcualAmount);
    		  Reporter.log("Verify Tex Exp : "+ExpAmount +"  Acual "+AcualAmount);
    	 
    	  }
    	  if(4813.07<=TaxablePayA)
    	  {
    		  double twentyTexAmoumt=1450*20/100;
    		 double PendingTaxablePayAmount= 4813.07-1450;
    		 double fortyTexAmount = PendingTaxablePayAmount*40/100;
    		 double FortyFiveTextAmount = TaxablePayA-4813.07;   		 
    		double FortyFive=FortyFiveTextAmount*45/100;
    		double Total=twentyTexAmoumt+fortyTexAmount+FortyFive;
    		double rounded = Math.ceil(Total * 10000) / 10000.0;
           
            
    		String ExpAmount = df.format(TexA); 
    		  DecimalFormat df2 = new DecimalFormat("0.000000");
    		  String AcualAmount2 = df2.format(rounded); 
    		  String AcualAmount=AcualAmount2.substring(0, AcualAmount2.length()-4);
    		  soft.assertEquals(ExpAmount, AcualAmount);
    		  System.out.println("Verify Tex Exp : "+ExpAmount +"  Acual "+AcualAmount);
    		  Reporter.log("Verify Tex Exp : "+ExpAmount +"  Acual "+AcualAmount);
    	  }
      }
      
      
      
      
    	  public void VerifyTexCalculationFortnightlyInCaseOfRunPayroll(String Salary,String Tex,int Period)
          {
        	
        	  double SalaryA = Double.parseDouble(Salary.replaceAll(",", ""));
        	  double TexA = Double.parseDouble(Tex.replaceAll(",", ""));
        	  double texamountmonth=483.81*Period;
        	  double Allowances=SalaryA-texamountmonth;
        	  
        	  DecimalFormat df = new DecimalFormat("0.00");
    			String AllowancesAmount = df.format(Allowances); 
    			String TaxablePay=AllowancesAmount.substring(0, AllowancesAmount.length()-3);
    			 double TaxablePayA = Double.parseDouble(TaxablePay.replaceAll(",", ""));
        	  if(1450>=TaxablePayA)
        	  {
        		  double texAmoumt=TaxablePayA*20/100;
        		  String ExpAmount = df.format(TexA); 
        		  String  AcualAmount=df.format(texAmoumt); 
        		  System.out.println("Verify Tex Exp : "+ExpAmount +"  Acual "+AcualAmount);
        		  Reporter.log("Verify Tex Exp : "+ExpAmount +"  Acual "+AcualAmount);
        	  }
        	  if(1450<TaxablePayA && 4813.07>TaxablePayA)
        	  {
        		  double tewntyPAmount=1450*Period;
        		  double twentyTexAmoumt=tewntyPAmount*20/100;
        		 double PendingTaxablePayAmount= TaxablePayA-tewntyPAmount;
        		 double fortyTexAmount = PendingTaxablePayAmount*40/100;
        		 double Total = fortyTexAmount+twentyTexAmoumt;
        		  String ExpAmount = df.format(TexA); 
        		  DecimalFormat df2 = new DecimalFormat("0.000000");
        		  String AcualAmount2 = df2.format(Total); 
        		  String  AcualAmount= AcualAmount2.substring(0, AcualAmount2.length()-4);
        		  System.out.println("Verify Tex Exp : "+ExpAmount +"  Acual "+AcualAmount);
        		  Reporter.log("Verify Tex Exp : "+ExpAmount +"  Acual "+AcualAmount);
        	 
        	  }
    	  
    	  if(4813.07<=TaxablePayA)
    	  {
    		  double tewntyPAmount=1450*Period;
    		  double twentyTexAmoumt=tewntyPAmount*20/100;
    		  double PendingTaxablePayAmount= 4813.07-1450;
    		 double fortyTexAmount = PendingTaxablePayAmount*40/100;
    		 double FortyFiveTextAmount = TaxablePayA-4813.07;   		 
    		double FortyFive=FortyFiveTextAmount*45/100;
    		double Total=twentyTexAmoumt+fortyTexAmount+FortyFive;
    		double rounded = Math.ceil(Total * 10000) / 10000.0;
           
            
    		String ExpAmount = df.format(TexA); 
    		  DecimalFormat df2 = new DecimalFormat("0.000000");
    		  String AcualAmount2 = df2.format(rounded); 
    		  String AcualAmount=AcualAmount2.substring(0, AcualAmount2.length()-4);
    		  System.out.println("Verify Tex Exp : "+ExpAmount +"  Acual "+AcualAmount);
    		  Reporter.log("Verify Tex Exp : "+ExpAmount +"  Acual "+AcualAmount);
    	  }
		
    	  
    	  
      }
      
      public void VerifyTexCalculationInCaseOfAddEmpInMid(String Salary,String Tex,String MonthNO)
      {
    	  
    	  double SalaryA = Double.parseDouble(Salary.replaceAll(",", ""));
    	  double TexA = Double.parseDouble(Tex.replaceAll(",", ""));
    	  double Month = Double.parseDouble(MonthNO.replaceAll(",", ""));
    	  double texamountmonth=1048.25*Month;
    	  double Allowances=SalaryA-texamountmonth;
    	  
    	  DecimalFormat df = new DecimalFormat("0.00");
			String AllowancesAmount = df.format(Allowances); 
			String TaxablePay=AllowancesAmount.substring(0, AllowancesAmount.length()-3);
			 double TaxablePayA = Double.parseDouble(TaxablePay.replaceAll(",", ""));
			 
			 
    	  if(texamountmonth>=SalaryA)
    	  {
    		  String ExpAmount = df.format(TexA); 
    		  soft.assertEquals(ExpAmount, "0.00");
    		  System.out.println("Verify Tex Exp : "+ExpAmount +"  Acual  0.00");
    		  Reporter.log("Verify Tex Exp : "+ExpAmount +"  Acual 0.00");
    	  }
    	  if(texamountmonth<SalaryA)
    	  {
    		
    		  double twentyTexAmoumt=3141.67*20/100;
     		 double PendingTaxablePayAmount= TaxablePayA-3141.67;
     		 double fortyTexAmount = PendingTaxablePayAmount*40/100;
     		 double Total = fortyTexAmount+twentyTexAmoumt;
     		  String ExpAmount = df.format(TexA); 
     		  DecimalFormat df2 = new DecimalFormat("0.000000");
     		  String AcualAmount2 = df2.format(Total); 
     		 String AcualAmount=AcualAmount2.substring(0, AcualAmount2.length()-4);
     		  soft.assertEquals(ExpAmount, AcualAmount);
     		  System.out.println("Verify Tex Exp : "+ExpAmount +"  Acual "+AcualAmount);
     		  Reporter.log("Verify Tex Exp : "+ExpAmount +"  Acual "+AcualAmount);
    	  }
      }
      
      
      public void VerifyWeeklyTexCalculationInCaseOfAddEmpInMid(String Salary,String Tex,String WeekNo)
      {
    	  
    	  double SalaryA = Double.parseDouble(Salary.replaceAll(",", ""));
    	  double TexA = Double.parseDouble(Tex.replaceAll(",", ""));
    	  double Week = Double.parseDouble(WeekNo.replaceAll(",", ""));
    	  double texamountmonth=241.90*Week;
    	  double Allowances=SalaryA-texamountmonth;
    	  
    	  DecimalFormat df = new DecimalFormat("0.00");
			String AllowancesAmount = df.format(Allowances); 
			String TaxablePay=AllowancesAmount.substring(0, AllowancesAmount.length()-3);
			 double TaxablePayA = Double.parseDouble(TaxablePay.replaceAll(",", ""));
			 
			 
    	  if(texamountmonth>=SalaryA)
    	  {
    		  String ExpAmount = df.format(TexA); 
    		  soft.assertEquals(ExpAmount, "0.00");
    		  System.out.println("Verify Tex Exp : "+ExpAmount +"  Acual  0.00");
    		  Reporter.log("Verify Tex Exp : "+ExpAmount +"  Acual 0.00");
    	  }
    	  if(texamountmonth<SalaryA)
    	  {
    		
    		  double twentyTexAmoumt=3141.67*20/100;
     		 double PendingTaxablePayAmount= TaxablePayA-3141.67;
     		 double fortyTexAmount = PendingTaxablePayAmount*40/100;
     		 double Total = fortyTexAmount+twentyTexAmoumt;
     		  String ExpAmount = df.format(TexA); 
     		  DecimalFormat df2 = new DecimalFormat("0.000000");
     		  String AcualAmount2 = df2.format(Total); 
     		 String AcualAmount=AcualAmount2.substring(0, AcualAmount2.length()-4);
     		  soft.assertEquals(ExpAmount, AcualAmount);
     		  System.out.println("Verify Tex Exp : "+ExpAmount +"  Acual "+AcualAmount);
     		  Reporter.log("Verify Tex Exp : "+ExpAmount +"  Acual "+AcualAmount);
    	  }
      }
      
      
      public String clickOnDateLinkByIndexInEmpDashboard(int Index ,String GetDataByName)
      {
    	  WebElement elemLink = getWebElement(By.xpath("//td[normalize-space()='"+Index+"']/parent::tr/td[2]/a[@class='border-btm-dotted']"));
    	  elemLink.click();
    	  m_Driver.switchTo().frame(getWebElement(By.xpath("//iframe[@id='PopUpFrame']")));
    	  WebElement elem = getWebElement(By.xpath("//label[normalize-space()='"+GetDataByName+"']/parent::div/div"));
    	  String Data = elem.getText().trim();
    	  String UiGetData=Data.replaceAll("[£,]", "");
    	  m_Driver.switchTo().defaultContent();
    	  getWebElement(By.xpath("//button[@id='PopUpClose1']//span[@aria-hidden='true'][normalize-space()='×']")).click();
    	  return UiGetData; 
      }
    
      
      public void VerifyTex(String Freq,String TexCode,String Salary,String Tex,int Period,String AllreadyPaid,String CurrentDue)
      {
    	  double TexRatePValue=37700;
		  double Allowancesyearly=0;
		  double TexRatePValueInCaseOf45=125140;
		  
		  String TexRateP_MonthValue1 = null;
		  String Allowancesyearly_MonthValue1 = null;
		  String TexRatePValueInCaseOf45_MonthValue1 = null;
		  
		  if(TexCode.equals("1257L")||TexCode.equals("1257M")||TexCode.equals("1257N")||TexCode.equals("1257T"))
		  {
			  Allowancesyearly=12579;
		  }
		  
		  if(Freq.equals("Monthly"))
    	  {
    		  double TexRateP_MonthValue = TexRatePValue/12;
    		  double Allowancesyearly_MonthValue = Allowancesyearly/12;
    		  double TexRatePValueInCaseOf45_MonthValue = TexRatePValueInCaseOf45/12;
    		  
    		  DecimalFormat df3 = new DecimalFormat("0.00");
    		  
    		   TexRateP_MonthValue1 = df3.format(TexRateP_MonthValue); 
    		   Allowancesyearly_MonthValue1 = df3.format(Allowancesyearly_MonthValue); 
    		   TexRatePValueInCaseOf45_MonthValue1 = df3.format(TexRatePValueInCaseOf45_MonthValue);
    	  }
		  
		  if(Freq.equals("Weekly"))
    	  {
    		  double TexRateP_MonthValue = TexRatePValue/52;
    		  double Allowancesyearly_MonthValue = Allowancesyearly/52;
    		  double TexRatePValueInCaseOf45_MonthValue = TexRatePValueInCaseOf45/52;
    		  
    		  DecimalFormat df3 = new DecimalFormat("0.00");
    		  
    		   TexRateP_MonthValue1 = df3.format(TexRateP_MonthValue); 
    		   Allowancesyearly_MonthValue1 = df3.format(Allowancesyearly_MonthValue); 
    		   TexRatePValueInCaseOf45_MonthValue1 = df3.format(TexRatePValueInCaseOf45_MonthValue);
    	  }
		  
		  if(Freq.equals("Fortnightly"))
    	  {
    		  double TexRateP_MonthValue = TexRatePValue/26;
    		  double Allowancesyearly_MonthValue = Allowancesyearly/26;
    		  double TexRatePValueInCaseOf45_MonthValue = TexRatePValueInCaseOf45/26;
    		  
    		  DecimalFormat df3 = new DecimalFormat("0.00");
    		  
    		   TexRateP_MonthValue1 = df3.format(TexRateP_MonthValue); 
    		   Allowancesyearly_MonthValue1 = df3.format(Allowancesyearly_MonthValue); 
    		   TexRatePValueInCaseOf45_MonthValue1 = df3.format(TexRatePValueInCaseOf45_MonthValue);
    	  }
		  
		  if(Freq.equals("Fourweekly"))
    	  {
    		  double TexRateP_MonthValue = TexRatePValue/13;
    		  double Allowancesyearly_MonthValue = Allowancesyearly/13;
    		  double TexRatePValueInCaseOf45_MonthValue = TexRatePValueInCaseOf45/13;
    		  
    		  DecimalFormat df3 = new DecimalFormat("0.00");
    		  
    		   TexRateP_MonthValue1 = df3.format(TexRateP_MonthValue); 
    		   Allowancesyearly_MonthValue1 = df3.format(Allowancesyearly_MonthValue); 
    		   TexRatePValueInCaseOf45_MonthValue1 = df3.format(TexRatePValueInCaseOf45_MonthValue);
    	  }
		  
		  if(Freq.equals("Annually"))
    	  {
			  Allowancesyearly=12579.25;
    		  double TexRateP_MonthValue = TexRatePValue;
    		  double Allowancesyearly_MonthValue = Allowancesyearly;
    		  double TexRatePValueInCaseOf45_MonthValue = TexRatePValueInCaseOf45;
    		  
    		  DecimalFormat df3 = new DecimalFormat("0.00");
    		  
    		   TexRateP_MonthValue1 = df3.format(TexRateP_MonthValue); 
    		   Allowancesyearly_MonthValue1 = df3.format(Allowancesyearly_MonthValue); 
    		   TexRatePValueInCaseOf45_MonthValue1 = df3.format(TexRatePValueInCaseOf45_MonthValue);
    	  }
		  
		  
    		 
    		  double TexRateP_MonthValue3 = Double.parseDouble(TexRateP_MonthValue1.replaceAll(",", ""));
    		  double Allowancesyearly_MonthValue3 = Double.parseDouble(Allowancesyearly_MonthValue1.replaceAll(",", ""));
    		  double TexRatePValueInCaseOf45_MonthValue3 = Double.parseDouble(TexRatePValueInCaseOf45_MonthValue1.replaceAll(",", ""));
    		  double SalaryA = Double.parseDouble(Salary.replaceAll(",", ""));
        	  double TexA = Double.parseDouble(Tex.replaceAll(",", ""));
        	  
        	  double texamountmonth=Allowancesyearly_MonthValue3*Period;
        	  double TtwentyAndFortyP=TexRateP_MonthValue3*Period;
        	  double FortyFiveP=TexRatePValueInCaseOf45_MonthValue3*Period;
        	  
        	  double Allowances=SalaryA-texamountmonth;
        	  
        	  DecimalFormat df = new DecimalFormat("0.00000");
    			String AllowancesAmount = df.format(Allowances); 
    			String TaxablePay=AllowancesAmount.substring(0, AllowancesAmount.length()-6);
    			 double TaxablePayA = Double.parseDouble(TaxablePay.replaceAll(",", ""));
    			 String a[]= TaxablePay.split("", 3);
    			 
    			 if(a[0].equals("-"))
    			 {
    				 	soft.assertEquals(Tex, "0.00");
              		  System.out.println("Verify Tex Exp : "+Tex +"  Acual "+"0.00");
              		  Reporter.log("Verify Tex Exp : "+Tex +"  Acual "+"0.00"); 
    				 
    			 }
    			 else
    			 {
    				 if(TtwentyAndFortyP>=TaxablePayA)
    	        	  {
    	        		  double texAmoumt=TaxablePayA*20/100;
    	        		  String ExpAmount2 = df.format(TexA); 
    	        		  String AcualAmount2 = df.format(texAmoumt); 
    	        		 String AcualAmount=AcualAmount2.substring(0, AcualAmount2.length()-3);
    	        		 String ExpAmount=ExpAmount2.substring(0, ExpAmount2.length()-3);
    	        		 if(ExpAmount.equals(AcualAmount))
      	        		  {
      	        			  
      	        			  System.out.println("Amount ok");
      	        			  
      	        		  }
      	        		  else
      	        		  {
      	        			DecimalFormat dfD = new DecimalFormat("0.00");
      	        			   AcualAmount = dfD.format(texAmoumt); 
          	        		   ExpAmount = dfD.format(TexA);
          	        		
      	        		  }
    	        		 
    	        		 if(Period!=1)
    	        		 {
    	        			 DecimalFormat dfD = new DecimalFormat("0.00");
    	        			 String AcualAmount3 = dfD.format(texAmoumt); 
    	        			 double AcualAmount4 = Double.parseDouble(AcualAmount3.replaceAll(",", ""));
    	        			 double TexUI = Double.parseDouble(Tex.replaceAll(",", ""));
    	        			 soft.assertEquals(Tex, AcualAmount3);
    	        			 double AllreadyPaid1 = Double.parseDouble(AllreadyPaid.replaceAll(",", ""));
    	        			 double DueT=AcualAmount4-AllreadyPaid1;
    	        			 String DueTRoundUp = dfD.format(DueT); 
    	        			 double CurrentDueUI = Double.parseDouble(CurrentDue.replaceAll(",", ""));
    	        			 String CurrentDueUIRoundup = dfD.format(CurrentDueUI); 
    	        			 soft.assertEquals(CurrentDueUIRoundup, DueTRoundUp);
    	           		  System.out.println("Verify Tex Exp : "+CurrentDueUIRoundup +"  Acual "+DueTRoundUp);
    	           		  Reporter.log("Verify Tex Exp : "+CurrentDueUIRoundup +"  Acual "+DueTRoundUp); 
    	        		 }
    	        		 else
    	        		 {
    	        			  soft.assertEquals(ExpAmount, AcualAmount);
    	            		  System.out.println("Verify Tex Exp : "+ExpAmount +"  Acual "+AcualAmount);
    	            		  Reporter.log("Verify Tex Exp : "+ExpAmount +"  Acual "+AcualAmount); 
    	        		 }
    	        		
    	        	  }
    	        	  if(TtwentyAndFortyP<TaxablePayA && FortyFiveP>TaxablePayA)
    	        	  {
    	        		  double twentyTexAmoumt=TtwentyAndFortyP*20/100;
    	        		 double PendingTaxablePayAmount= TaxablePayA-TtwentyAndFortyP;
    	        		 double fortyTexAmount = PendingTaxablePayAmount*40/100;
    	        		 double Total = fortyTexAmount+twentyTexAmoumt;
    	        		  String AcualAmount2 = df.format(Total); 
    	        		  String ExpAmount2 = df.format(TexA);
    	        		 String AcualAmount=AcualAmount2.substring(0, AcualAmount2.length()-3);
    	        		 String ExpAmount=ExpAmount2.substring(0, ExpAmount2.length()-3);
    	        		 if(ExpAmount.equals(AcualAmount))
   	        		  {
   	        			  
   	        			  System.out.println("Amount ok");
   	        			  
   	        		  }
   	        		  else
   	        		  {
   	        			DecimalFormat dfD = new DecimalFormat("0.00");
   	        			   AcualAmount = dfD.format(Total); 
       	        		   ExpAmount = dfD.format(TexA);
       	        		
   	        		  }
    	        		 if(Period!=1)
    	        		 {
    	        			 DecimalFormat dfD = new DecimalFormat("0.00");
    	        			 String AcualAmount3 = AcualAmount;
    	        			 double AcualAmount4 = Double.parseDouble(AcualAmount3.replaceAll(",", ""));
    	        			 double TexUI = Double.parseDouble(Tex.replaceAll(",", ""));
    	        			 soft.assertEquals(Tex, AcualAmount3);
    	        			 double AllreadyPaid1 = Double.parseDouble(AllreadyPaid.replaceAll(",", ""));
    	        			 double DueT=AcualAmount4-AllreadyPaid1;
    	        			 String DueTRoundUp = dfD.format(DueT); 
    	        			 double CurrentDueUI = Double.parseDouble(CurrentDue.replaceAll(",", ""));
    	        			 String CurrentDueUIRoundup = dfD.format(CurrentDueUI); 
    	        			 soft.assertEquals(CurrentDueUIRoundup, DueTRoundUp);
    	           		  System.out.println("Verify Tex Exp : "+CurrentDueUIRoundup +"  Acual "+DueTRoundUp);
    	           		  Reporter.log("Verify Tex Exp : "+CurrentDueUIRoundup +"  Acual "+DueTRoundUp); 
    	        		 }
    	        		 else
    	        		 {
    	        			  soft.assertEquals(ExpAmount, AcualAmount);
    	            		  System.out.println("Verify Tex Exp : "+ExpAmount +"  Acual "+AcualAmount);
    	            		  Reporter.log("Verify Tex Exp : "+ExpAmount +"  Acual "+AcualAmount); 
    	        		 }
    	        		 
    	        		 
    	        		
    	        	  }
    	        	  
    	        	  
    	        	  if(FortyFiveP<=TaxablePayA)
    	        	  {
    	        		  double twentyTexAmoumt=TtwentyAndFortyP*20/100;
    	        		  double PendingTaxablePayAmount= FortyFiveP-TtwentyAndFortyP;
    	         		 double fortyTexAmount = PendingTaxablePayAmount*40/100;
    	        		 double FortyFiveTextAmount = TaxablePayA-FortyFiveP;   		 
    	        		double FortyFive=FortyFiveTextAmount*45/100;
    	        		double Total=twentyTexAmoumt+fortyTexAmount+FortyFive;
    	        		double rounded = Math.ceil(Total * 10000) / 10000.0;
    	        		  DecimalFormat df2 = new DecimalFormat("0.00");
    	        		  String ExpAmount = df2.format(TexA); 
    	        		  String AcualAmount = df2.format(rounded); 
    	        		  if(ExpAmount.equals(AcualAmount))
    	        		  {
    	        			  
    	        			  System.out.println("Amount ok");
    	        			  
    	        		  }
    	        		  else
    	        		  {
    	        			  String AcualAmount2 = df.format(Total); 
        	        		  String ExpAmount2 = df.format(TexA);
        	        		  AcualAmount=AcualAmount2.substring(0, AcualAmount2.length()-3);
        	        		  ExpAmount=ExpAmount2.substring(0, ExpAmount2.length()-3);
    	        		  }
    	        		  
    	        		  
    	        		
    	        		  if(Period!=1)
    	         		 {
    	        			  DecimalFormat dfD = new DecimalFormat("0.00");
    	         			 String AcualAmount3 = AcualAmount;
    	         			double AcualAmount4 = Double.parseDouble(AcualAmount.replaceAll(",", ""));
    	         			double TexUI = Double.parseDouble(Tex.replaceAll(",", ""));
    	         			soft.assertEquals(Tex, AcualAmount3);
    	         			 double AllreadyPaid1 = Double.parseDouble(AllreadyPaid.replaceAll(",", ""));
    	         			 double DueT=AcualAmount4-AllreadyPaid1;
    	         			 String DueTRoundUp = dfD.format(DueT); 
    	         			 double CurrentDueUI = Double.parseDouble(CurrentDue.replaceAll(",", ""));
    	         			 String CurrentDueUIRoundup = dfD.format(CurrentDueUI); 
    	         			 soft.assertEquals(CurrentDueUIRoundup, DueTRoundUp);
    	            		  System.out.println("Verify Tex Exp : "+CurrentDueUIRoundup +"  Acual "+DueTRoundUp);
    	            		  Reporter.log("Verify Tex Exp : "+CurrentDueUIRoundup +"  Acual "+DueTRoundUp); 
    	         		 }
    	         		 else
    	         		 {
    	         			  soft.assertEquals(ExpAmount, AcualAmount);
    	             		  System.out.println("Verify Tex Exp : "+ExpAmount +"  Acual "+AcualAmount);
    	             		  Reporter.log("Verify Tex Exp : "+ExpAmount +"  Acual "+AcualAmount); 
    	         		 }
    	        		 
    	        	  }    		  
    	    	  } 
    			 }
        	 

      
      
      
    public void assertAll()
    {
    	soft.assertAll();
    }
    
}
