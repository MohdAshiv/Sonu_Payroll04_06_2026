package _6664_PageClass;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import pages.BasePage;

public class VerifySendApproval  extends BasePage{

	public VerifySendApproval(WebDriver driver) {
		super(driver);
	}

	SoftAssert soft= new SoftAssert();

	static String queryText;
	static String queryTextEmployerNotes;
	static String summaryDate;
	static String cisvalue;
	
	double PAYE_NIValue=0;
	static double prevTax=0.0;
	static double prevBalowed=0.0;
	double TaxAmount=0;
	double EmployeeNIAmount=0;
	double EmployerNIAmount=0;
	double TotalAmount=0;
	double BalanceOwedAmount=0;
	
	double Totalamount=0;
	
	double BalancecarryAmount=0;
	
	double totalPayments=0;
	double NetPayment=0;
	double TotalCoastamount=0;
	
	double TotalNiAmount=0;
	double employeePensionAmount=0;
	double EmployerPensionAmount=0;
	public void verifyDisableSendApproval()
	{
		
		
		
		  List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSandforApproval'][@disabled='disabled']"));
		
		 System.out.println(list.size());
		 
		 boolean elem = list.isEmpty();
		 
		 soft.assertFalse(elem);
		 
		 Reporter.log("verifyDisableSendApproval");
	}
	
	
	public void verifyEnableSendApproval()
	{
		
		 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSandforApproval'][@disabled='disabled']"));
		
		 System.out.println(list.size());
		 
		 boolean elem = list.isEmpty();
		 
		 soft.assertTrue(elem);
		 
		 Reporter.log("verifyEnableSendApproval");
	}
	
	
	
	public void verifyContactDetail(String expectedText)
	{
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrameContact']")));

		String text = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/header/h2")).getText();
		System.out.println(text);
		soft.assertEquals(text, expectedText, "not as expexted");
		
		m_Driver.switchTo().defaultContent();
		
		 Reporter.log("verifyContactDetail");
	
	}
	
	
	
	public void verifyPeriodEnd(String expectedPeriodEnd)
	{
		
    
		 WebElement elem1 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPayrollDate']/option[@selected='selected']"));
	     
		String actualPeriodEnd=elem1.getText();
			
			
		System.out.println(actualPeriodEnd);
		soft.assertEquals(actualPeriodEnd, expectedPeriodEnd,"PeriodEnd selection not as expected");
		Reporter.log("verifyPeriodEnd");
	
		
	}
	
	
	
	public void verifyApprovedEmail( String expectedapproval,String expectedTagName,String expectedThanks)
	{
		//WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/div[2]/div[2]/div/p[2]/span[3]"));
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/div[2]/div[2]/div/p[2]/span"));

		
		String approval = elem.getText().trim();
		soft.assertEquals(approval, expectedapproval,"Approved Email not as expected");

		WebElement tag = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/div[2]/div[2]/div/p[1]/span"));
		
		String tagName = tag.getText().trim();
		soft.assertEquals(tagName, expectedTagName,"tagName not as expected");
		
		WebElement thanks = m_Driver.findElement(By.xpath("//*[contains(text(),'Thanks')]"));
		String thnksText = thanks.getText().replaceAll("\\n", " ");
		soft.assertEquals(thnksText, expectedThanks,"thanks not as expected");

		Reporter.log("verifyApprovedEmail");

	}
	
	
	public void verifyApprovedEmail1( String expectedapproval,String expectedTagName,String expectedThanks)
	{
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/div[2]/div[2]/div/p[2]/span[3]"));

		
		String approval = elem.getText().trim();
		soft.assertEquals(approval, expectedapproval,"Approved Email not as expected");

		WebElement tag = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/div[2]/div[2]/div/p[1]/span"));
		
		String tagName = tag.getText().trim();
		soft.assertEquals(tagName, expectedTagName,"tagName not as expected");
		
		WebElement thanks = m_Driver.findElement(By.xpath("//*[contains(text(),'Thanks')]"));
		String thnksText = thanks.getText().replaceAll("\\n", " ");
		soft.assertEquals(thnksText, expectedThanks,"thanks not as expected");

		Reporter.log("verifyApprovedEmail");

	}
	
	
	
	public void verifySendForApprovedEmail( String expectedFirstTagName,String expectedLastTagNames)
	{
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/div[2]/div[2]/div/p[1]/span"));
		
		
		String firstname = elem.getText().trim();
		soft.assertEquals(firstname, expectedFirstTagName,"Approved Email not as expected");

	
		WebElement thanks = m_Driver.findElement(By.xpath("//*[contains(text(),'Kind')]"));
		String thnksText = thanks.getText().replaceAll("\\n", " ");
		soft.assertEquals(thnksText, expectedLastTagNames,"Tag not as expected");

		Reporter.log("verifySendForApprovedEmail");

	}
	
	public void verifyQueryEmail()
	{
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/div[2]/div[2]/div/p[4]/span"));
		
		
		String[] query = elem.getText().split(" ");
		
		System.out.println(query[3]);

		soft.assertEquals(queryText, query[3]);
		
		
		
		Reporter.log("verifyQueryEmail");

	}
	
	
	public void verifyQueryEmailBody(String expectedQuery ,String expectedThanks )
	{
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/div[2]/div[2]/div/p[4]/span"));
		
		
		String[] query = elem.getText().split(" ");
		
		System.out.println(query[3]);

		soft.assertEquals(queryText, query[3]);
		

		WebElement elem1 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/div[2]/div[2]/div/p[2]/span"));
		
		
		String approvaQuery = elem1.getText().trim();
		soft.assertEquals(approvaQuery, expectedQuery,"Approved query not as expected");

		
		
		
		WebElement thanks = m_Driver.findElement(By.xpath("//*[contains(text(),'Thanks')]"));
		String thnksText = thanks.getText().replaceAll("\\n", " ");
		soft.assertEquals(thnksText, expectedThanks,"thanks not as expected");

		
		Reporter.log("verifyQueryEmail");

	}
	
	public void getquery() throws Exception
	{
		
	
	
	 List<WebElement> data  = m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_pnlMain']/div/div/table/tbody/tr/td/div/div[2]/textarea"));

		boolean con=data.isEmpty();
	     soft.assertFalse(con,"list is Empty");
		for(int i=data.size()-1;i>=0;i--)
		{

			 queryText = data.get(i).getText();
			
        System.out.println(queryText);
        break;
		}
		
	
	   //  queryText = data.get(data.size()-2).getText();
	     
	  
      Thread.sleep(2000);
	  Reporter.log("getquery");
	}
	
	
	
	public void verifyQueryEmployerNote() throws Exception
	{
		
	
	 List<WebElement> data  = m_Driver.findElements(By.xpath("//*[@class='panel-collapse show']/div/div/textarea"));

	 boolean con=data.isEmpty();
     soft.assertFalse(con,"list is Empty");
		for(int i=1;i<=data.size()-1;i++)
		{

			queryTextEmployerNotes = data.get(i).getText();
			
        System.out.println(queryTextEmployerNotes);
        break;
		}
		
		soft.assertEquals(queryText, queryTextEmployerNotes);

      Thread.sleep(2000);
	  Reporter.log("verifyQueryEmployerNote");
	}
	
	
	

	public void verifyCancelBtnQuery() throws Exception
	{

		WebElement cancel = m_Driver.findElement(By.xpath("//*[@id='lnkCancel']"));


	     cancel.click();
	
		m_Driver.switchTo().defaultContent();

		Thread.sleep(3000);
		boolean close = m_Driver.findElement(By.xpath("//*[@id='cboxQueryModel']")).isDisplayed();
			 
		System.out.println(close);
		soft. assertFalse(close);
	
	
		
		Reporter.log("verifyCancelBtnHmrcElem");
	}
	
	
	
	public void verifyCloseBtnQuery() throws Exception
	{
	

		WebElement closeBtn = m_Driver.findElement(By.xpath("//*[@id='cboxQueryModel']"));

	     closeBtn.click();
	
		Thread.sleep(3000);
		
		soft. assertFalse(closeBtn.isDisplayed());
	  
		Reporter.log("verifyCloseBtnHmrcElem");
	}
	
	
	
	
	
	
	 public void getSendApprovalSummary() throws InterruptedException
 	{
 		
		summaryDate = m_Driver.findElement(By.xpath("//*[contains(text(),'PAYROLL SUMMARY')]")).getText();
		 
		 System.out.println(summaryDate);
		 
// TotalPayments		 
		 
		 
		 
		 	String payements=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(0).getText();
		      	//System.out.println(Tax);
		      	String Pstr=payements.replaceAll("[£]", "");
		      	Pstr=Pstr.replaceAll("[,]", "");
		      	
		      	totalPayments = Double.parseDouble(Pstr);
		  		System.out.println("This is totalPayments="+totalPayments);
		      	
		 
		 
		 
 		 
//Tax Finding
 	        		      	
 	        		      	String Tax=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(1).getText();
 	        		      	//System.out.println(Tax);
 	        		      	String str=Tax.replaceAll("[£]", "");
 	        		      	str=str.replaceAll("[,]", "");
 	        		      	
 	        		      	TaxAmount = Double.parseDouble(str);
 	        		  		System.out.println("This is Tax amount="+TaxAmount);
 	        		      	
 				  		

//Employee NI Finding
 	        		  		
 	        		  		String EmployeeNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(4).getText();
 	        		      	//System.out.println(EmployeeNI);
 	        		  		String EmployeeNIstr=EmployeeNI.replaceAll("[£]", "");
 	        		  		EmployeeNIstr=EmployeeNIstr.replaceAll("[,]", "");
 	        		      	
 	        		  		 EmployeeNIAmount = Double.parseDouble(EmployeeNIstr);    	        		  		
 	        		  		System.out.println("This is EmployeeNI amount="+EmployeeNIAmount);
 	        		  		

 // NetPay	        		  		
 	        		  		String netpay=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(5).getText();
 	        		      	//System.out.println(EmployeeNI);
 	        		  		String netpayValue=netpay.replaceAll("[£]", "");
 	        		  		netpayValue=netpayValue.replaceAll("[,]", "");
 	        		      	
 	        		  		 NetPayment = Double.parseDouble(netpayValue);    	        		  		
 	        		  		System.out.println("This is NetPayment amount="+NetPayment);
 	        		  		
 	        		  		
 	        		  		
//Employer NI Finding
 	        		      	
 	        		      	String EmployerNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(6).getText();
 	        		      	//System.out.println(EmployerNI);
 	        		      	String EmployerNIstr=EmployerNI.replaceAll("[£]", "");
 	        		      	EmployerNIstr=EmployerNIstr.replaceAll("[,]", "");
 	        		      	
 	        		  		 EmployerNIAmount = Double.parseDouble(EmployerNIstr);    
 	        		  		 
 	        		  	
 	        		  		
//Balance owed (b/f)
 	        		  		
 	        		  		String BalanceOwed=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(0).getText();
 	        		      	//System.out.println(EmployerNI);
 	        		      	String BalanceOwedstr=BalanceOwed.replaceAll("[£]", "");
 	        		      	BalanceOwedstr=BalanceOwedstr.replaceAll("[,]", "");
 	        		      	
 	        		  		 BalanceOwedAmount = Double.parseDouble(BalanceOwedstr);   	        		  	
 	        		  		System.out.println("This is Balance owed="+BalanceOwedAmount);
	    				  	

 	        		  		
//Balance c/f 
 	        		  		
 	        		  		String Balancecarry=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(1).getText();
 	        		      	//System.out.println(EmployerNI);
 	        		      	String Balancecarrystr=Balancecarry.replaceAll("[£]", "");
 	        		      	Balancecarrystr=Balancecarrystr.replaceAll("[,]", "");
 	        		      	
 	        		  		 BalancecarryAmount = Double.parseDouble(Balancecarrystr);    	        		  	
 	        		  		System.out.println("This is Balance c/f="+BalancecarryAmount);
 	        		  		
 	        		  		
 	        		  		
//Payment DUE to HMRC				  		 
     				  		String PAYE_NI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'PAYE & NI')]//following::td/div/div")).get(0).getText();
     			      	
     			      	String PAYE_NIstr=PAYE_NI.replaceAll("[£]", "");
     			      			PAYE_NIstr=PAYE_NIstr.replaceAll("[,]", "");
     			      	
     			  		 PAYE_NIValue = Double.parseDouble(PAYE_NIstr);
     			  		 System.out.println("PAYE_NIValue="+PAYE_NIValue);
     			  		 
     			  		 
     			  		 
//Getting payment done in month
     			  		 
      			  		String TotalPayment=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Payment For ')]//following::td/div/div")).get(0).getText();
      		      	
      		      	String TotalPaymentstr=TotalPayment.replaceAll("[£]", "");
      		      			TotalPaymentstr=TotalPaymentstr.replaceAll("[,]", "");
      		      	
      		  		 Totalamount = Double.parseDouble(TotalPaymentstr);
      		  		System.out.println("TotalAmount="+Totalamount);
      		  		
      		  		
      		  		
// Total Coast for Period     
      		  		
      		  	String TotalCoast=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'TOTAL COST ')]//following::td/div/div")).get(0).getText();
  		      	
  		      	String totalCoastPeriod=TotalCoast.replaceAll("[£]", "");
  		      totalCoastPeriod=totalCoastPeriod.replaceAll("[,]", "");
  		      	
  		  		 TotalCoastamount = Double.parseDouble(totalCoastPeriod);
  		  		System.out.println("TotalCoastamount="+TotalCoastamount);
  		  		
  		  		
//Total Ni	  		
  		  		
  		   	String TotalNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'SMP/SSP Funding Rec.')]//following::td/div/div")).get(3).getText();
		      	
		      	String NiValue=TotalNI.replaceAll("[£]", "");
		      	NiValue=NiValue.replaceAll("[,]", "");
		      	
		  		 TotalNiAmount = Double.parseDouble(NiValue);
		  		System.out.println("TotalNiAmount="+TotalNiAmount);
		  		
		  		Reporter.log("getSendApprovalSummary");
		    }			
	 
	 
	 

	 public void getSendApprovalSummary_New() throws InterruptedException
 	{
 		
		summaryDate = m_Driver.findElement(By.xpath("//*[contains(text(),'PAYROLL SUMMARY')]")).getText();
		 
		 System.out.println(summaryDate);
		 
// TotalPayments		 
		 
		 
		 
		 	String payements=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(0).getText();
		      	//System.out.println(Tax);
		      	String Pstr=payements.replaceAll("[£]", "");
		      	Pstr=Pstr.replaceAll("[,]", "");
		      	
		      	totalPayments = Double.parseDouble(Pstr);
		  		System.out.println("This is totalPayments="+totalPayments);
		      	
		 
		 
		 
 		 
//Tax Finding
 	        		      	
 	        		      	String Tax=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(1).getText();
 	        		      	//System.out.println(Tax);
 	        		      	String str=Tax.replaceAll("[£]", "");
 	        		      	str=str.replaceAll("[,]", "");
 	        		      	
 	        		      	TaxAmount = Double.parseDouble(str);
 	        		  		System.out.println("This is Tax amount="+TaxAmount);
 	        		      	
 				  		

//Employee NI Finding
 	        		  		
 	        		  		String EmployeeNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(4).getText();
 	        		      	//System.out.println(EmployeeNI);
 	        		  		String EmployeeNIstr=EmployeeNI.replaceAll("[£]", "");
 	        		  		EmployeeNIstr=EmployeeNIstr.replaceAll("[,]", "");
 	        		      	
 	        		  		 EmployeeNIAmount = Double.parseDouble(EmployeeNIstr);    	        		  		
 	        		  		System.out.println("This is EmployeeNI amount="+EmployeeNIAmount);
 	        		  		

 // NetPay	        		  		
 	        		  		String netpay=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(5).getText();
 	        		      	//System.out.println(EmployeeNI);
 	        		  		String netpayValue=netpay.replaceAll("[£]", "");
 	        		  		netpayValue=netpayValue.replaceAll("[,]", "");
 	        		      	
 	        		  		 NetPayment = Double.parseDouble(netpayValue);    	        		  		
 	        		  		System.out.println("This is NetPayment amount="+NetPayment);
 	        		  		
 	        		  		
 	        		  		
//Employer NI Finding
 	        		      	
 	        		      	String EmployerNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(6).getText();
 	        		      	//System.out.println(EmployerNI);
 	        		      	String EmployerNIstr=EmployerNI.replaceAll("[£]", "");
 	        		      	EmployerNIstr=EmployerNIstr.replaceAll("[,]", "");
 	        		      	
 	        		  		 EmployerNIAmount = Double.parseDouble(EmployerNIstr);    
 	        		  		 
 	        		  	
 	        		  		
//Balance owed (b/f)
 	        		  		
 	        		  		String BalanceOwed=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(0).getText();
 	        		      	//System.out.println(EmployerNI);
 	        		      	String BalanceOwedstr=BalanceOwed.replaceAll("[£]", "");
 	        		      	BalanceOwedstr=BalanceOwedstr.replaceAll("[,]", "");
 	        		      	
 	        		  		 BalanceOwedAmount = Double.parseDouble(BalanceOwedstr);   	        		  	
 	        		  		System.out.println("This is Balance owed="+BalanceOwedAmount);
	    				  	

 	        		  		
//Balance c/f 
 	        		  		
 	        		  		String Balancecarry=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(1).getText();
 	        		      	//System.out.println(EmployerNI);
 	        		      	String Balancecarrystr=Balancecarry.replaceAll("[£]", "");
 	        		      	Balancecarrystr=Balancecarrystr.replaceAll("[,]", "");
 	        		      	
 	        		  		 BalancecarryAmount = Double.parseDouble(Balancecarrystr);    	        		  	
 	        		  		System.out.println("This is Balance c/f="+BalancecarryAmount);
 	        		  		
 	        		  		
 	        		  		
//Payment DUE to HMRC				  		 
     				  		String PAYE_NI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'PAYE & NI')]//following::td/div/div")).get(0).getText();
     			      	
     			      	String PAYE_NIstr=PAYE_NI.replaceAll("[£]", "");
     			      			PAYE_NIstr=PAYE_NIstr.replaceAll("[,]", "");
     			      	
     			  		 PAYE_NIValue = Double.parseDouble(PAYE_NIstr);
     			  		 System.out.println("PAYE_NIValue="+PAYE_NIValue);
     			  		 
     			  		 
     			  		 
//Getting payment done in month
     			  		 
      			  		String TotalPayment=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Payment For ')]//following::td/div/div")).get(0).getText();
      		      	
      		      	String TotalPaymentstr=TotalPayment.replaceAll("[£]", "");
      		      			TotalPaymentstr=TotalPaymentstr.replaceAll("[,]", "");
      		      	
      		  		 Totalamount = Double.parseDouble(TotalPaymentstr);
      		  		System.out.println("TotalAmount="+Totalamount);
      		  		
      		  		
      		  		
// Total Coast for Period     
      		  		
      		  	String TotalCoast=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'TOTAL COST ')]//following::td/div/div")).get(0).getText();
  		      	
  		      	String totalCoastPeriod=TotalCoast.replaceAll("[£]", "");
  		      totalCoastPeriod=totalCoastPeriod.replaceAll("[,]", "");
  		      	
  		  		 TotalCoastamount = Double.parseDouble(totalCoastPeriod);
  		  		System.out.println("TotalCoastamount="+TotalCoastamount);
  		  		
  		  		
//Total Ni	  		
  		  		
  		   	String TotalNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'SMP/SSP Funding Rec.')]//following::td/div/div")).get(6).getText();
		      	
		      	String NiValue=TotalNI.replaceAll("[£]", "");
		      	NiValue=NiValue.replaceAll("[,]", "");
		      	
		  		 TotalNiAmount = Double.parseDouble(NiValue);
		  		System.out.println("TotalNiAmount="+TotalNiAmount);
		  		
		  		Reporter.log("getSendApprovalSummary");
		    }			
	 
	 
	 
	 
	 
	 
	 public void getSendApprovalSummaryPension() throws InterruptedException
	 	{
	 		
			summaryDate = m_Driver.findElement(By.xpath("//*[contains(text(),'PAYROLL SUMMARY')]")).getText();
			 
			 System.out.println(summaryDate);
			 
	// TotalPayments		 
			 
			 
			 
			 	String payements=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(0).getText();
			      	//System.out.println(Tax);
			      	String Pstr=payements.replaceAll("[£]", "");
			      	Pstr=Pstr.replaceAll("[,]", "");
			      	
			      	totalPayments = Double.parseDouble(Pstr);
			  		System.out.println("This is totalPayments="+totalPayments);
			      	
			 
			 
			 
	 		 
	//Tax Finding
	 	        		      	
	 	        		      	String Tax=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(1).getText();
	 	        		      	//System.out.println(Tax);
	 	        		      	String str=Tax.replaceAll("[£]", "");
	 	        		      	str=str.replaceAll("[,]", "");
	 	        		      	
	 	        		      	TaxAmount = Double.parseDouble(str);
	 	        		  		System.out.println("This is Tax amount="+TaxAmount);
	 	        		      	
	 				  		

	//Employee NI Finding
	 	        		  		
	 	        		  		String EmployeeNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(4).getText();
	 	        		      	//System.out.println(EmployeeNI);
	 	        		  		String EmployeeNIstr=EmployeeNI.replaceAll("[£]", "");
	 	        		  		EmployeeNIstr=EmployeeNIstr.replaceAll("[,]", "");
	 	        		      	
	 	        		  		 EmployeeNIAmount = Double.parseDouble(EmployeeNIstr);    	        		  		
	 	        		  		System.out.println("This is EmployeeNI amount="+EmployeeNIAmount);
	 	        		  		

	 // NetPay	        		  		
	 	        		  		String netpay=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(5).getText();
	 	        		      	//System.out.println(EmployeeNI);
	 	        		  		String netpayValue=netpay.replaceAll("[£]", "");
	 	        		  		netpayValue=netpayValue.replaceAll("[,]", "");
	 	        		      	
	 	        		  		 NetPayment = Double.parseDouble(netpayValue);    	        		  		
	 	        		  		System.out.println("This is NetPayment amount="+NetPayment);
	 	        		  		
	 	        		  		
	 	        		  		
	//Employer NI Finding
	 	        		      	
	 	        		      	String EmployerNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(6).getText();
	 	        		      	//System.out.println(EmployerNI);
	 	        		      	String EmployerNIstr=EmployerNI.replaceAll("[£]", "");
	 	        		      	EmployerNIstr=EmployerNIstr.replaceAll("[,]", "");
	 	        		      	
	 	        		  		 EmployerNIAmount = Double.parseDouble(EmployerNIstr);    
	 	        		  		 
	 	        		  	
	 	        		  		
	//Balance owed (b/f)
	 	        		  		
	 	        		  		String BalanceOwed=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(0).getText();
	 	        		      	//System.out.println(EmployerNI);
	 	        		      	String BalanceOwedstr=BalanceOwed.replaceAll("[£]", "");
	 	        		      	BalanceOwedstr=BalanceOwedstr.replaceAll("[,]", "");
	 	        		      	
	 	        		  		 BalanceOwedAmount = Double.parseDouble(BalanceOwedstr);   	        		  	
	 	        		  		System.out.println("This is Balance owed="+BalanceOwedAmount);
		    				  	

	 	        		  		
	//Balance c/f 
	 	        		  		
	 	        		  		String Balancecarry=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(1).getText();
	 	        		      	//System.out.println(EmployerNI);
	 	        		      	String Balancecarrystr=Balancecarry.replaceAll("[£]", "");
	 	        		      	Balancecarrystr=Balancecarrystr.replaceAll("[,]", "");
	 	        		      	
	 	        		  		 BalancecarryAmount = Double.parseDouble(Balancecarrystr);    	        		  	
	 	        		  		System.out.println("This is Balance c/f="+BalancecarryAmount);
	 	        		  		
	 	        		  		
	 	        		  		
	//Payment DUE to HMRC				  		 
	     				  		String PAYE_NI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'PAYE & NI')]//following::td/div/div")).get(0).getText();
	     			      	
	     			      	String PAYE_NIstr=PAYE_NI.replaceAll("[£]", "");
	     			      			PAYE_NIstr=PAYE_NIstr.replaceAll("[,]", "");
	     			      	
	     			  		 PAYE_NIValue = Double.parseDouble(PAYE_NIstr);
	     			  		 System.out.println("PAYE_NIValue="+PAYE_NIValue);
	     			  		 
	     			  		 
	     			  		 
	//Getting payment done in month
	     			  		 
	      			  		String TotalPayment=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Payment For ')]//following::td/div/div")).get(0).getText();
	      		      	
	      		      	String TotalPaymentstr=TotalPayment.replaceAll("[£]", "");
	      		      			TotalPaymentstr=TotalPaymentstr.replaceAll("[,]", "");
	      		      	
	      		  		 Totalamount = Double.parseDouble(TotalPaymentstr);
	      		  		System.out.println("TotalAmount="+Totalamount);
	      		  		
	      		  		
	      		  		
	// Total Coast for Period     
	      		  		
	      		  	String TotalCoast=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'TOTAL COST ')]//following::td/div/div")).get(0).getText();
	  		      	
	  		      	String totalCoastPeriod=TotalCoast.replaceAll("[£]", "");
	  		      totalCoastPeriod=totalCoastPeriod.replaceAll("[,]", "");
	  		      	
	  		  		 TotalCoastamount = Double.parseDouble(totalCoastPeriod);
	  		  		System.out.println("TotalCoastamount="+TotalCoastamount);
	  		  		
	  		  		
	//Total Ni	  		
	  		  		
	  		   	String TotalNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'SMP/SSP Funding Rec.')]//following::td/div/div")).get(5).getText();
			      	
			      	String NiValue=TotalNI.replaceAll("[£]", "");
			      	NiValue=NiValue.replaceAll("[,]", "");
			      	
			  		 TotalNiAmount = Double.parseDouble(NiValue);
			  		System.out.println("TotalNiAmount="+TotalNiAmount);
			  		
			  		Reporter.log("getSendApprovalSummary");
			    }			
		 
	 
	 
	 public void verifyApproverdPayrollSummary() throws InterruptedException
 	{
 		
			String summaryDate1 = m_Driver.findElement(By.xpath("//*[contains(text(),'PAYROLL SUMMARY')]")).getText();
			 
			 System.out.println(summaryDate1);
			 
		    soft.assertEquals(summaryDate1, summaryDate);

		 
// TotalPayments		 
		 
		 	String payements=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(0).getText();
		      	//System.out.println(Tax);
		      	String Pstr=payements.replaceAll("[£]", "");
		      	Pstr=Pstr.replaceAll("[,]", "");
		      	
		      	 double AtotalPayments = Double.parseDouble(Pstr);
		  		System.out.println("This is totalPayments="+AtotalPayments);
				soft.assertEquals(AtotalPayments, totalPayments);

		 
		 
		 
 		 
//Tax Finding
 	        		      	
 	        		      	String Tax=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(1).getText();
 	        		      	//System.out.println(Tax);
 	        		      	String str=Tax.replaceAll("[£]", "");
 	        		      	str=str.replaceAll("[,]", "");
 	        		      	
 	        		      double TaxAmount1 = Double.parseDouble(str);
 	        		  		System.out.println("This is Tax amount="+TaxAmount1);
 	       				soft.assertEquals(TaxAmount1, TaxAmount);

 				  		

//Employee NI Finding
 	        		  		
 	        		  		String EmployeeNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(4).getText();
 	        		      	//System.out.println(EmployeeNI);
 	        		  		String EmployeeNIstr=EmployeeNI.replaceAll("[£]", "");
 	        		  		EmployeeNIstr=EmployeeNIstr.replaceAll("[,]", "");
 	        		      	
 	        		  		double EmployeeNIAmount1 = Double.parseDouble(EmployeeNIstr);    	        		  		
 	        		  		System.out.println("This is EmployeeNI amount="+EmployeeNIAmount1);
 	        		  		
 	 	       				soft.assertEquals(EmployeeNIAmount1, EmployeeNIAmount);

 // NetPay	        		  		
 	        		  		String netpay=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(5).getText();
 	        		      	//System.out.println(EmployeeNI);
 	        		  		String netpayValue=netpay.replaceAll("[£]", "");
 	        		  		netpayValue=netpayValue.replaceAll("[,]", "");
 	        		      	
 	        		  		double NetPayment1 = Double.parseDouble(netpayValue);    	        		  		
 	        		  		System.out.println("This is NetPayment amount="+NetPayment1);
 	 	       				soft.assertEquals(NetPayment1, NetPayment);

 	        		  		
 	        		  		
//Employer NI Finding
 	        		      	
 	        		      	String EmployerNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(6).getText();
 	        		      	//System.out.println(EmployerNI);
 	        		      	String EmployerNIstr=EmployerNI.replaceAll("[£]", "");
 	        		      	EmployerNIstr=EmployerNIstr.replaceAll("[,]", "");
 	        		  		double EmployerNIAmount1 = Double.parseDouble(EmployerNIstr);    
 	        		  		 
  	        		  		System.out.println("This is EmployerNIAmount ="+EmployerNIAmount1);
 	 	       				soft.assertEquals(EmployerNIAmount1, EmployerNIAmount);


 	        		  		
//Balance owed (b/f)
 	        		  		
 	        		  		String BalanceOwed=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(0).getText();
 	        		      	//System.out.println(EmployerNI);
 	        		      	String BalanceOwedstr=BalanceOwed.replaceAll("[£]", "");
 	        		      	BalanceOwedstr=BalanceOwedstr.replaceAll("[,]", "");
 	        		      	
 	        		  		double BalanceOwedAmount1 = Double.parseDouble(BalanceOwedstr);   	        		  	
 	        		  		System.out.println("This is Balance owed="+BalanceOwedAmount1);
 	 	       				soft.assertEquals(BalanceOwedAmount1, BalanceOwedAmount);


 	        		  		
//Balance c/f 
 	        		  		
 	        		  		String Balancecarry=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(1).getText();
 	        		      	//System.out.println(EmployerNI);
 	        		      	String Balancecarrystr=Balancecarry.replaceAll("[£]", "");
 	        		      	Balancecarrystr=Balancecarrystr.replaceAll("[,]", "");
 	        		      	
 	        		  		double BalancecarryAmount1 = Double.parseDouble(Balancecarrystr);    	        		  	
 	        		  		System.out.println("This is Balance c/f="+BalancecarryAmount1);
 	 	       				soft.assertEquals(BalancecarryAmount1, BalancecarryAmount);

 	        		  		
 	        		  		
//Payment DUE to HMRC				  		 
     				  		String PAYE_NI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'PAYE & NI')]//following::td/div/div")).get(0).getText();
     			      	
							String PAYE_NIstr = PAYE_NI.replaceAll("[£]", "");
							PAYE_NIstr = PAYE_NIstr.replaceAll("[,]", "");

							double PAYE_NIValue1 = Double.parseDouble(PAYE_NIstr);
							System.out.println("PAYE_NIValue=" + PAYE_NIValue1);
							soft.assertEquals(PAYE_NIValue1, PAYE_NIValue);
     			  		 
     			  		 
//Getting payment done in month
     			  		 
      			  		String TotalPayment=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Payment For ')]//following::td/div/div")).get(0).getText();
      		      	
						String TotalPaymentstr = TotalPayment.replaceAll("[£]", "");
						TotalPaymentstr = TotalPaymentstr.replaceAll("[,]", "");

						double Totalamount1 = Double.parseDouble(TotalPaymentstr);
						System.out.println("TotalAmount=" + Totalamount1);
						soft.assertEquals(Totalamount1, Totalamount);

      		  		
// Total Coast for Period     
      		  		
      		  	String TotalCoast=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'TOTAL COST ')]//following::td/div/div")).get(0).getText();

				String totalCoastPeriod = TotalCoast.replaceAll("[£]", "");
				totalCoastPeriod = totalCoastPeriod.replaceAll("[,]", "");

			double	TotalCoastamount1 = Double.parseDouble(totalCoastPeriod);
				System.out.println("TotalCoastamount="+TotalCoastamount1);
				soft.assertEquals(TotalCoastamount1, TotalCoastamount);

  		  		
//Total Ni	  		
  		  		
  		   	String TotalNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'SMP/SSP Funding Rec.')]//following::td/div/div")).get(3).getText();

			String NiValue = TotalNI.replaceAll("[£]", "");
			NiValue = NiValue.replaceAll("[,]", "");

	     	double	TotalNiAmount1 = Double.parseDouble(NiValue);
			System.out.println("TotalNiAmount="+TotalNiAmount1);
			soft.assertEquals(TotalNiAmount1, TotalNiAmount);

			
			Reporter.log("verifyApproverdPayrollSummary");
		  		
		    }	
	 
	 
	 
	 public void verifyApproverdPayrollSummary_New() throws InterruptedException
 	{
 		
			String summaryDate1 = m_Driver.findElement(By.xpath("//*[contains(text(),'PAYROLL SUMMARY')]")).getText();
			 
			 System.out.println(summaryDate1);
			 
		    soft.assertEquals(summaryDate1, summaryDate);

		 
// TotalPayments		 
		 
		 	String payements=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(0).getText();
		      	//System.out.println(Tax);
		      	String Pstr=payements.replaceAll("[£]", "");
		      	Pstr=Pstr.replaceAll("[,]", "");
		      	
		      	 double AtotalPayments = Double.parseDouble(Pstr);
		  		System.out.println("This is totalPayments="+AtotalPayments);
				soft.assertEquals(AtotalPayments, totalPayments);

		 
		 
		 
 		 
//Tax Finding
 	        		      	
 	        		      	String Tax=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(1).getText();
 	        		      	//System.out.println(Tax);
 	        		      	String str=Tax.replaceAll("[£]", "");
 	        		      	str=str.replaceAll("[,]", "");
 	        		      	
 	        		      double TaxAmount1 = Double.parseDouble(str);
 	        		  		System.out.println("This is Tax amount="+TaxAmount1);
 	       				soft.assertEquals(TaxAmount1, TaxAmount);

 				  		

//Employee NI Finding
 	        		  		
 	        		  		String EmployeeNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(4).getText();
 	        		      	//System.out.println(EmployeeNI);
 	        		  		String EmployeeNIstr=EmployeeNI.replaceAll("[£]", "");
 	        		  		EmployeeNIstr=EmployeeNIstr.replaceAll("[,]", "");
 	        		      	
 	        		  		double EmployeeNIAmount1 = Double.parseDouble(EmployeeNIstr);    	        		  		
 	        		  		System.out.println("This is EmployeeNI amount="+EmployeeNIAmount1);
 	        		  		
 	 	       				soft.assertEquals(EmployeeNIAmount1, EmployeeNIAmount);

 // NetPay	        		  		
 	        		  		String netpay=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(5).getText();
 	        		      	//System.out.println(EmployeeNI);
 	        		  		String netpayValue=netpay.replaceAll("[£]", "");
 	        		  		netpayValue=netpayValue.replaceAll("[,]", "");
 	        		      	
 	        		  		double NetPayment1 = Double.parseDouble(netpayValue);    	        		  		
 	        		  		System.out.println("This is NetPayment amount="+NetPayment1);
 	 	       				soft.assertEquals(NetPayment1, NetPayment);

 	        		  		
 	        		  		
//Employer NI Finding
 	        		      	
 	        		      	String EmployerNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(6).getText();
 	        		      	//System.out.println(EmployerNI);
 	        		      	String EmployerNIstr=EmployerNI.replaceAll("[£]", "");
 	        		      	EmployerNIstr=EmployerNIstr.replaceAll("[,]", "");
 	        		  		double EmployerNIAmount1 = Double.parseDouble(EmployerNIstr);    
 	        		  		 
  	        		  		System.out.println("This is EmployerNIAmount ="+EmployerNIAmount1);
 	 	       				soft.assertEquals(EmployerNIAmount1, EmployerNIAmount);


 	        		  		
//Balance owed (b/f)
 	        		  		
 	        		  		String BalanceOwed=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(0).getText();
 	        		      	//System.out.println(EmployerNI);
 	        		      	String BalanceOwedstr=BalanceOwed.replaceAll("[£]", "");
 	        		      	BalanceOwedstr=BalanceOwedstr.replaceAll("[,]", "");
 	        		      	
 	        		  		double BalanceOwedAmount1 = Double.parseDouble(BalanceOwedstr);   	        		  	
 	        		  		System.out.println("This is Balance owed="+BalanceOwedAmount1);
 	 	       				soft.assertEquals(BalanceOwedAmount1, BalanceOwedAmount);


 	        		  		
//Balance c/f 
 	        		  		
 	        		  		String Balancecarry=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(1).getText();
 	        		      	//System.out.println(EmployerNI);
 	        		      	String Balancecarrystr=Balancecarry.replaceAll("[£]", "");
 	        		      	Balancecarrystr=Balancecarrystr.replaceAll("[,]", "");
 	        		      	
 	        		  		double BalancecarryAmount1 = Double.parseDouble(Balancecarrystr);    	        		  	
 	        		  		System.out.println("This is Balance c/f="+BalancecarryAmount1);
 	 	       				soft.assertEquals(BalancecarryAmount1, BalancecarryAmount);

 	        		  		
 	        		  		
//Payment DUE to HMRC				  		 
     				  		String PAYE_NI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'PAYE & NI')]//following::td/div/div")).get(0).getText();
     			      	
							String PAYE_NIstr = PAYE_NI.replaceAll("[£]", "");
							PAYE_NIstr = PAYE_NIstr.replaceAll("[,]", "");

							double PAYE_NIValue1 = Double.parseDouble(PAYE_NIstr);
							System.out.println("PAYE_NIValue=" + PAYE_NIValue1);
							soft.assertEquals(PAYE_NIValue1, PAYE_NIValue);
     			  		 
     			  		 
//Getting payment done in month
     			  		 
      			  		String TotalPayment=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Payment For ')]//following::td/div/div")).get(0).getText();
      		      	
						String TotalPaymentstr = TotalPayment.replaceAll("[£]", "");
						TotalPaymentstr = TotalPaymentstr.replaceAll("[,]", "");

						double Totalamount1 = Double.parseDouble(TotalPaymentstr);
						System.out.println("TotalAmount=" + Totalamount1);
						soft.assertEquals(Totalamount1, Totalamount);

      		  		
// Total Coast for Period     
      		  		
      		  	String TotalCoast=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'TOTAL COST ')]//following::td/div/div")).get(0).getText();

				String totalCoastPeriod = TotalCoast.replaceAll("[£]", "");
				totalCoastPeriod = totalCoastPeriod.replaceAll("[,]", "");

			double	TotalCoastamount1 = Double.parseDouble(totalCoastPeriod);
				System.out.println("TotalCoastamount="+TotalCoastamount1);
				soft.assertEquals(TotalCoastamount1, TotalCoastamount);

  		  		
//Total Ni	  		
  		  		
  		   	String TotalNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'SMP/SSP Funding Rec.')]//following::td/div/div")).get(6).getText();

			String NiValue = TotalNI.replaceAll("[£]", "");
			NiValue = NiValue.replaceAll("[,]", "");

	     	double	TotalNiAmount1 = Double.parseDouble(NiValue);
			System.out.println("TotalNiAmount="+TotalNiAmount1);
			soft.assertEquals(TotalNiAmount1, TotalNiAmount);

			
			Reporter.log("verifyApproverdPayrollSummary");
		  		
		    }	
	 
	 
	 public void verifyApproverdPayrollSummaryPension() throws InterruptedException
	 	{
	 		
				String summaryDate1 = m_Driver.findElement(By.xpath("//*[contains(text(),'PAYROLL SUMMARY')]")).getText();
				 
				 System.out.println(summaryDate1);
				 
			    soft.assertEquals(summaryDate1, summaryDate);

			 
	// TotalPayments		 
			 
			 	String payements=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(0).getText();
			      	//System.out.println(Tax);
			      	String Pstr=payements.replaceAll("[£]", "");
			      	Pstr=Pstr.replaceAll("[,]", "");
			      	
			      	 double AtotalPayments = Double.parseDouble(Pstr);
			  		System.out.println("This is totalPayments="+AtotalPayments);
					soft.assertEquals(AtotalPayments, totalPayments);

			 
			 
			 
	 		 
	//Tax Finding
	 	        		      	
	 	        		      	String Tax=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(1).getText();
	 	        		      	//System.out.println(Tax);
	 	        		      	String str=Tax.replaceAll("[£]", "");
	 	        		      	str=str.replaceAll("[,]", "");
	 	        		      	
	 	        		      double TaxAmount1 = Double.parseDouble(str);
	 	        		  		System.out.println("This is Tax amount="+TaxAmount1);
	 	       				soft.assertEquals(TaxAmount1, TaxAmount);

	 				  		

	//Employee NI Finding
	 	        		  		
	 	        		  		String EmployeeNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(4).getText();
	 	        		      	//System.out.println(EmployeeNI);
	 	        		  		String EmployeeNIstr=EmployeeNI.replaceAll("[£]", "");
	 	        		  		EmployeeNIstr=EmployeeNIstr.replaceAll("[,]", "");
	 	        		      	
	 	        		  		double EmployeeNIAmount1 = Double.parseDouble(EmployeeNIstr);    	        		  		
	 	        		  		System.out.println("This is EmployeeNI amount="+EmployeeNIAmount1);
	 	        		  		
	 	 	       				soft.assertEquals(EmployeeNIAmount1, EmployeeNIAmount);

	 // NetPay	        		  		
	 	        		  		String netpay=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(5).getText();
	 	        		      	//System.out.println(EmployeeNI);
	 	        		  		String netpayValue=netpay.replaceAll("[£]", "");
	 	        		  		netpayValue=netpayValue.replaceAll("[,]", "");
	 	        		      	
	 	        		  		double NetPayment1 = Double.parseDouble(netpayValue);    	        		  		
	 	        		  		System.out.println("This is NetPayment amount="+NetPayment1);
	 	 	       				soft.assertEquals(NetPayment1, NetPayment);

	 	        		  		
	 	        		  		
	//Employer NI Finding
	 	        		      	
	 	        		      	String EmployerNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(6).getText();
	 	        		      	//System.out.println(EmployerNI);
	 	        		      	String EmployerNIstr=EmployerNI.replaceAll("[£]", "");
	 	        		      	EmployerNIstr=EmployerNIstr.replaceAll("[,]", "");
	 	        		  		double EmployerNIAmount1 = Double.parseDouble(EmployerNIstr);    
	 	        		  		 
	  	        		  		System.out.println("This is EmployerNIAmount ="+EmployerNIAmount1);
	 	 	       				soft.assertEquals(EmployerNIAmount1, EmployerNIAmount);


	 	        		  		
	//Balance owed (b/f)
	 	        		  		
	 	        		  		String BalanceOwed=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(0).getText();
	 	        		      	//System.out.println(EmployerNI);
	 	        		      	String BalanceOwedstr=BalanceOwed.replaceAll("[£]", "");
	 	        		      	BalanceOwedstr=BalanceOwedstr.replaceAll("[,]", "");
	 	        		      	
	 	        		  		double BalanceOwedAmount1 = Double.parseDouble(BalanceOwedstr);   	        		  	
	 	        		  		System.out.println("This is Balance owed="+BalanceOwedAmount1);
	 	 	       				soft.assertEquals(BalanceOwedAmount1, BalanceOwedAmount);


	 	        		  		
	//Balance c/f 
	 	        		  		
	 	        		  		String Balancecarry=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(1).getText();
	 	        		      	//System.out.println(EmployerNI);
	 	        		      	String Balancecarrystr=Balancecarry.replaceAll("[£]", "");
	 	        		      	Balancecarrystr=Balancecarrystr.replaceAll("[,]", "");
	 	        		      	
	 	        		  		double BalancecarryAmount1 = Double.parseDouble(Balancecarrystr);    	        		  	
	 	        		  		System.out.println("This is Balance c/f="+BalancecarryAmount1);
	 	 	       				soft.assertEquals(BalancecarryAmount1, BalancecarryAmount);

	 	        		  		
	 	        		  		
	//Payment DUE to HMRC				  		 
	     				  		String PAYE_NI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'PAYE & NI')]//following::td/div/div")).get(0).getText();
	     			      	
								String PAYE_NIstr = PAYE_NI.replaceAll("[£]", "");
								PAYE_NIstr = PAYE_NIstr.replaceAll("[,]", "");

								double PAYE_NIValue1 = Double.parseDouble(PAYE_NIstr);
								System.out.println("PAYE_NIValue=" + PAYE_NIValue1);
								soft.assertEquals(PAYE_NIValue1, PAYE_NIValue);
	     			  		 
	     			  		 
	//Getting payment done in month
	     			  		 
	      			  		String TotalPayment=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Payment For ')]//following::td/div/div")).get(0).getText();
	      		      	
							String TotalPaymentstr = TotalPayment.replaceAll("[£]", "");
							TotalPaymentstr = TotalPaymentstr.replaceAll("[,]", "");

							double Totalamount1 = Double.parseDouble(TotalPaymentstr);
							System.out.println("TotalAmount=" + Totalamount1);
							soft.assertEquals(Totalamount1, Totalamount);

	      		  		
	// Total Coast for Period     
	      		  		
	      		  	String TotalCoast=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'TOTAL COST ')]//following::td/div/div")).get(0).getText();

					String totalCoastPeriod = TotalCoast.replaceAll("[£]", "");
					totalCoastPeriod = totalCoastPeriod.replaceAll("[,]", "");

				double	TotalCoastamount1 = Double.parseDouble(totalCoastPeriod);
					System.out.println("TotalCoastamount="+TotalCoastamount1);
					soft.assertEquals(TotalCoastamount1, TotalCoastamount);

	  		  		
	//Total Ni	  		
	  		  		
	  		   	String TotalNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'SMP/SSP Funding Rec.')]//following::td/div/div")).get(5).getText();

				String NiValue = TotalNI.replaceAll("[£]", "");
				NiValue = NiValue.replaceAll("[,]", "");

		     	double	TotalNiAmount1 = Double.parseDouble(NiValue);
				System.out.println("TotalNiAmount="+TotalNiAmount1);
				soft.assertEquals(TotalNiAmount1, TotalNiAmount);

				
				Reporter.log("verifyApproverdPayrollSummary");
			  		
			    }
	
	 
	 
	 public void verifyAlertMsg()
		{
			
			try {
				String alert = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphError_dvPAyrollApproval']")).getText();
				
				String alertMsg = alert.replaceAll("×", "").trim();
				System.out.println(alertMsg);
				soft.assertEquals(alertMsg, "Success! You have received a message from your employer regarding payroll approval. Please check the employer’s notes.");
				
				
			} catch (Exception e) {
			    soft.assertFalse(true,"welcome to catch block");

				System.out.println("Issue in verifyAlertMsg"+e);
			}
			Reporter.log("verifyAlertMsg");
		}
	 
	 

		
	 public void getSendApprovalSummaryCIS() throws InterruptedException
	 
 	{
 		
			
			summaryDate = m_Driver.findElement(By.xpath("//*[contains(text(),'PAYROLL SUMMARY')]")).getText();
			 
			 System.out.println(summaryDate);
			 
	// TotalPayments		 
			 
			 
			 
			 	String payements=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(0).getText();
			      	//System.out.println(Tax);
			      	String Pstr=payements.replaceAll("[£]", "");
			      	Pstr=Pstr.replaceAll("[,]", "");
			      	
			      	totalPayments = Double.parseDouble(Pstr);
			  		System.out.println("This is totalPayments="+totalPayments);
			      	
			 
			 
			 
	 		 
	//Tax Finding
	 	        		      	
	 	        		      	String Tax=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(1).getText();
	 	        		      	//System.out.println(Tax);
	 	        		      	String str=Tax.replaceAll("[£]", "");
	 	        		      	str=str.replaceAll("[,]", "");
	 	        		      	
	 	        		      	TaxAmount = Double.parseDouble(str);
	 	        		  		System.out.println("This is Tax amount="+TaxAmount);
	 	        		      	
	 				  		

	//Employee NI Finding
	 	        		  		
	 	        		  		String EmployeeNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(4).getText();
	 	        		      	//System.out.println(EmployeeNI);
	 	        		  		String EmployeeNIstr=EmployeeNI.replaceAll("[£]", "");
	 	        		  		EmployeeNIstr=EmployeeNIstr.replaceAll("[,]", "");
	 	        		      	
	 	        		  		 EmployeeNIAmount = Double.parseDouble(EmployeeNIstr);    	        		  		
	 	        		  		System.out.println("This is EmployeeNI amount="+EmployeeNIAmount);
	 	        		  		

	 // NetPay	        		  		
	 	        		  		String netpay=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(5).getText();
	 	        		      	//System.out.println(EmployeeNI);
	 	        		  		String netpayValue=netpay.replaceAll("[£]", "");
	 	        		  		netpayValue=netpayValue.replaceAll("[,]", "");
	 	        		      	
	 	        		  		 NetPayment = Double.parseDouble(netpayValue);    	        		  		
	 	        		  		System.out.println("This is NetPayment amount="+NetPayment);
	 	        		  		
	 	        		  		
	 	        		  		
	//Employer NI Finding
	 	        		      	
	 	        		      	String EmployerNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(6).getText();
	 	        		      	//System.out.println(EmployerNI);
	 	        		      	String EmployerNIstr=EmployerNI.replaceAll("[£]", "");
	 	        		      	EmployerNIstr=EmployerNIstr.replaceAll("[,]", "");
	 	        		      	
	 	        		  		 EmployerNIAmount = Double.parseDouble(EmployerNIstr);    
	 	        		  		 
	 	        		  	
	 	        		  		
	//Balance owed (b/f)
	 	        		  		
	 	        		  		String BalanceOwed=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(0).getText();
	 	        		      	//System.out.println(EmployerNI);
	 	        		      	String BalanceOwedstr=BalanceOwed.replaceAll("[£]", "");
	 	        		      	BalanceOwedstr=BalanceOwedstr.replaceAll("[,]", "");
	 	        		      	
	 	        		  		 BalanceOwedAmount = Double.parseDouble(BalanceOwedstr);   	        		  	
	 	        		  		System.out.println("This is Balance owed="+BalanceOwedAmount);
		    				  	

	 	        		  		
	//Balance c/f 
	 	        		  		
	 	        		  		String Balancecarry=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(1).getText();
	 	        		      	//System.out.println(EmployerNI);
	 	        		      	String Balancecarrystr=Balancecarry.replaceAll("[£]", "");
	 	        		      	Balancecarrystr=Balancecarrystr.replaceAll("[,]", "");
	 	        		      	
	 	        		  		 BalancecarryAmount = Double.parseDouble(Balancecarrystr);    	        		  	
	 	        		  		System.out.println("This is Balance c/f="+BalancecarryAmount);
	 	        		  		
	 	        		  		
	 	        		  		
	//Payment DUE to HMRC				  		 
	     				  		String PAYE_NI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'PAYE & NI')]//following::td/div/div")).get(0).getText();
	     			      	
	     			      	String PAYE_NIstr=PAYE_NI.replaceAll("[£]", "");
	     			      			PAYE_NIstr=PAYE_NIstr.replaceAll("[,]", "");
	     			      	
	     			  		 PAYE_NIValue = Double.parseDouble(PAYE_NIstr);
	     			  		 System.out.println("PAYE_NIValue="+PAYE_NIValue);
	     			  		 
	     			  		 
	     			  		 
	//Getting payment done in month
	     			  		 
	      			  		String TotalPayment=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Payment For ')]//following::td/div/div")).get(0).getText();
	      		      	
	      		      	String TotalPaymentstr=TotalPayment.replaceAll("[£]", "");
	      		      			TotalPaymentstr=TotalPaymentstr.replaceAll("[,]", "");
	      		      	
	      		  		 Totalamount = Double.parseDouble(TotalPaymentstr);
	      		  		System.out.println("TotalAmount="+Totalamount);
	      		  		
	      		  		
	      		  		
	// Total Coast for Period     
	      		  		
	      		  	String TotalCoast=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'TOTAL COST ')]//following::td/div/div")).get(0).getText();
	  		      	
	  		      	String totalCoastPeriod=TotalCoast.replaceAll("[£]", "");
	  		      totalCoastPeriod=totalCoastPeriod.replaceAll("[,]", "");
	  		      	
	  		  		 TotalCoastamount = Double.parseDouble(totalCoastPeriod);
	  		  		System.out.println("TotalCoastamount="+TotalCoastamount);
	  		  		
	  		  		
	//Total Ni	  		
	  		  		
	  		   	String TotalNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'SMP/SSP Funding Rec.')]//following::td/div/div")).get(5).getText();
			      	
			      	String NiValue=TotalNI.replaceAll("[£]", "");
			      	NiValue=NiValue.replaceAll("[,]", "");
			      	
			  		 TotalNiAmount = Double.parseDouble(NiValue);
			  		System.out.println("TotalNiAmount="+TotalNiAmount);
			  		
		  		
	//CIS	  		
		  		
	  cisvalue=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'CIS Suffered')]//following::td/div/div")).get(0).getText();
		      	
		     System.out.println(cisvalue);
		     
		  		Reporter.log("getSendApprovalSummary");
		    }			
	 
	 
 
	 
	 public void verifyApproverdPayrollSummaryCIS() throws InterruptedException
 	{
 		
		 String summaryDate1 = m_Driver.findElement(By.xpath("//*[contains(text(),'PAYROLL SUMMARY')]")).getText();
		 
		 System.out.println(summaryDate1);
		 
	    soft.assertEquals(summaryDate1, summaryDate);

	 
//TotalPayments		 
	 
	 	String payements=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(0).getText();
	      	//System.out.println(Tax);
	      	String Pstr=payements.replaceAll("[£]", "");
	      	Pstr=Pstr.replaceAll("[,]", "");
	      	
	      	 double AtotalPayments = Double.parseDouble(Pstr);
	  		System.out.println("This is totalPayments="+AtotalPayments);
			soft.assertEquals(AtotalPayments, totalPayments);

	 
	 
	 
		 
//Tax Finding
	        		      	
	        		      	String Tax=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(1).getText();
	        		      	//System.out.println(Tax);
	        		      	String str=Tax.replaceAll("[£]", "");
	        		      	str=str.replaceAll("[,]", "");
	        		      	
	        		      double TaxAmount1 = Double.parseDouble(str);
	        		  		System.out.println("This is Tax amount="+TaxAmount1);
	       				soft.assertEquals(TaxAmount1, TaxAmount);

				  		

//Employee NI Finding
	        		  		
	        		  		String EmployeeNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(4).getText();
	        		      	//System.out.println(EmployeeNI);
	        		  		String EmployeeNIstr=EmployeeNI.replaceAll("[£]", "");
	        		  		EmployeeNIstr=EmployeeNIstr.replaceAll("[,]", "");
	        		      	
	        		  		double EmployeeNIAmount1 = Double.parseDouble(EmployeeNIstr);    	        		  		
	        		  		System.out.println("This is EmployeeNI amount="+EmployeeNIAmount1);
	        		  		
	 	       				soft.assertEquals(EmployeeNIAmount1, EmployeeNIAmount);

// NetPay	        		  		
	        		  		String netpay=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(5).getText();
	        		      	//System.out.println(EmployeeNI);
	        		  		String netpayValue=netpay.replaceAll("[£]", "");
	        		  		netpayValue=netpayValue.replaceAll("[,]", "");
	        		      	
	        		  		double NetPayment1 = Double.parseDouble(netpayValue);    	        		  		
	        		  		System.out.println("This is NetPayment amount="+NetPayment1);
	 	       				soft.assertEquals(NetPayment1, NetPayment);

	        		  		
	        		  		
//Employer NI Finding
	        		      	
	        		      	String EmployerNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(6).getText();
	        		      	//System.out.println(EmployerNI);
	        		      	String EmployerNIstr=EmployerNI.replaceAll("[£]", "");
	        		      	EmployerNIstr=EmployerNIstr.replaceAll("[,]", "");
	        		  		double EmployerNIAmount1 = Double.parseDouble(EmployerNIstr);    
	        		  		 
	        		  		System.out.println("This is EmployerNIAmount ="+EmployerNIAmount1);
	 	       				soft.assertEquals(EmployerNIAmount1, EmployerNIAmount);


	        		  		
//Balance owed (b/f)
	        		  		
	        		  		String BalanceOwed=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(0).getText();
	        		      	//System.out.println(EmployerNI);
	        		      	String BalanceOwedstr=BalanceOwed.replaceAll("[£]", "");
	        		      	BalanceOwedstr=BalanceOwedstr.replaceAll("[,]", "");
	        		      	
	        		  		double BalanceOwedAmount1 = Double.parseDouble(BalanceOwedstr);   	        		  	
	        		  		System.out.println("This is Balance owed="+BalanceOwedAmount1);
	 	       				soft.assertEquals(BalanceOwedAmount1, BalanceOwedAmount);


	        		  		
//Balance c/f 
	        		  		
	        		  		String Balancecarry=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(1).getText();
	        		      	//System.out.println(EmployerNI);
	        		      	String Balancecarrystr=Balancecarry.replaceAll("[£]", "");
	        		      	Balancecarrystr=Balancecarrystr.replaceAll("[,]", "");
	        		      	
	        		  		double BalancecarryAmount1 = Double.parseDouble(Balancecarrystr);    	        		  	
	        		  		System.out.println("This is Balance c/f="+BalancecarryAmount1);
	 	       				soft.assertEquals(BalancecarryAmount1, BalancecarryAmount);

	        		  		
	        		  		
//Payment DUE to HMRC				  		 
 				  		String PAYE_NI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'PAYE & NI')]//following::td/div/div")).get(0).getText();
 			      	
						String PAYE_NIstr = PAYE_NI.replaceAll("[£]", "");
						PAYE_NIstr = PAYE_NIstr.replaceAll("[,]", "");

						double PAYE_NIValue1 = Double.parseDouble(PAYE_NIstr);
						System.out.println("PAYE_NIValue=" + PAYE_NIValue1);
						soft.assertEquals(PAYE_NIValue1, PAYE_NIValue);
 			  		 
 			  		 
//Getting payment done in month
 			  		 
  			  		String TotalPayment=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Payment For ')]//following::td/div/div")).get(0).getText();
  		      	
					String TotalPaymentstr = TotalPayment.replaceAll("[£]", "");
					TotalPaymentstr = TotalPaymentstr.replaceAll("[,]", "");

					double Totalamount1 = Double.parseDouble(TotalPaymentstr);
					System.out.println("TotalAmount=" + Totalamount1);
					soft.assertEquals(Totalamount1, Totalamount);

  		  		
//Total Coast for Period     
  		  		
  		  	String TotalCoast=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'TOTAL COST ')]//following::td/div/div")).get(0).getText();

			String totalCoastPeriod = TotalCoast.replaceAll("[£]", "");
			totalCoastPeriod = totalCoastPeriod.replaceAll("[,]", "");

		double	TotalCoastamount1 = Double.parseDouble(totalCoastPeriod);
			System.out.println("TotalCoastamount="+TotalCoastamount1);
			soft.assertEquals(TotalCoastamount1, TotalCoastamount);

		  		
//Total Ni	  		
		  		
		   	String TotalNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'SMP/SSP Funding Rec.')]//following::td/div/div")).get(5).getText();

		String NiValue = TotalNI.replaceAll("[£]", "");
		NiValue = NiValue.replaceAll("[,]", "");

     	double	TotalNiAmount1 = Double.parseDouble(NiValue);
		System.out.println("TotalNiAmount="+TotalNiAmount1);
		soft.assertEquals(TotalNiAmount1, TotalNiAmount);

//CIS sufferd 
			
			String cisSufferd=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'CIS Suffered')]//following::td/div/div")).get(0).getText();
	      	
		     System.out.println("cisvalue" +cisSufferd);
		     
		     soft.assertEquals(cisSufferd, cisvalue);

			
			
			Reporter.log("verifyApproverdPayrollSummary");
		  		
		    }	
	 
	 
	 
	 public void getSendApprovalSummaryCis() throws InterruptedException
	 
	 	{
	 		
				summaryDate = m_Driver.findElement(By.xpath("//*[contains(text(),'PAYROLL SUMMARY')]")).getText();
				 
				 System.out.println(summaryDate);
				 
		// TotalPayments		 
				 
				 
				 
				 	String payements=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(0).getText();
				      	//System.out.println(Tax);
				      	String Pstr=payements.replaceAll("[£]", "");
				      	Pstr=Pstr.replaceAll("[,]", "");
				      	
				      	totalPayments = Double.parseDouble(Pstr);
				  		System.out.println("This is totalPayments="+totalPayments);
				      	
				 
				 
				 
		 		 
		//Tax Finding
		 	        		      	
		 	        		      	String Tax=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(1).getText();
		 	        		      	//System.out.println(Tax);
		 	        		      	String str=Tax.replaceAll("[£]", "");
		 	        		      	str=str.replaceAll("[,]", "");
		 	        		      	
		 	        		      	TaxAmount = Double.parseDouble(str);
		 	        		  		System.out.println("This is Tax amount="+TaxAmount);
		 	        		      	
		 				  		

		//Employee NI Finding
		 	        		  		
		 	        		  		String EmployeeNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(4).getText();
		 	        		      	//System.out.println(EmployeeNI);
		 	        		  		String EmployeeNIstr=EmployeeNI.replaceAll("[£]", "");
		 	        		  		EmployeeNIstr=EmployeeNIstr.replaceAll("[,]", "");
		 	        		      	
		 	        		  		 EmployeeNIAmount = Double.parseDouble(EmployeeNIstr);    	        		  		
		 	        		  		System.out.println("This is EmployeeNI amount="+EmployeeNIAmount);
		 	        		  		

		 // NetPay	        		  		
		 	        		  		String netpay=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(5).getText();
		 	        		      	//System.out.println(EmployeeNI);
		 	        		  		String netpayValue=netpay.replaceAll("[£]", "");
		 	        		  		netpayValue=netpayValue.replaceAll("[,]", "");
		 	        		      	
		 	        		  		 NetPayment = Double.parseDouble(netpayValue);    	        		  		
		 	        		  		System.out.println("This is NetPayment amount="+NetPayment);
		 	        		  		
		 	        		  		
		 	        		  		
		//Employer NI Finding
		 	        		      	
		 	        		      	String EmployerNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(6).getText();
		 	        		      	//System.out.println(EmployerNI);
		 	        		      	String EmployerNIstr=EmployerNI.replaceAll("[£]", "");
		 	        		      	EmployerNIstr=EmployerNIstr.replaceAll("[,]", "");
		 	        		      	
		 	        		  		 EmployerNIAmount = Double.parseDouble(EmployerNIstr);    
		 	        		  		 
		 	        		  	
		 	        		  		
		//Balance owed (b/f)
		 	        		  		
		 	        		  		String BalanceOwed=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(0).getText();
		 	        		      	//System.out.println(EmployerNI);
		 	        		      	String BalanceOwedstr=BalanceOwed.replaceAll("[£]", "");
		 	        		      	BalanceOwedstr=BalanceOwedstr.replaceAll("[,]", "");
		 	        		      	
		 	        		  		 BalanceOwedAmount = Double.parseDouble(BalanceOwedstr);   	        		  	
		 	        		  		System.out.println("This is Balance owed="+BalanceOwedAmount);
			    				  	

		 	        		  		
		//Balance c/f 
		 	        		  		
		 	        		  		String Balancecarry=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(1).getText();
		 	        		      	//System.out.println(EmployerNI);
		 	        		      	String Balancecarrystr=Balancecarry.replaceAll("[£]", "");
		 	        		      	Balancecarrystr=Balancecarrystr.replaceAll("[,]", "");
		 	        		      	
		 	        		  		 BalancecarryAmount = Double.parseDouble(Balancecarrystr);    	        		  	
		 	        		  		System.out.println("This is Balance c/f="+BalancecarryAmount);
		 	        		  		
		 	        		  		
		 	        		  		
		//Payment DUE to HMRC				  		 
		     				  		String PAYE_NI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'PAYE & NI')]//following::td/div/div")).get(0).getText();
		     			      	
		     			      	String PAYE_NIstr=PAYE_NI.replaceAll("[£]", "");
		     			      			PAYE_NIstr=PAYE_NIstr.replaceAll("[,]", "");
		     			      	
		     			  		 PAYE_NIValue = Double.parseDouble(PAYE_NIstr);
		     			  		 System.out.println("PAYE_NIValue="+PAYE_NIValue);
		     			  		 
		     			  		 
		     			  		 
		//Getting payment done in month
		     			  		 
		      			  		String TotalPayment=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Payment For ')]//following::td/div/div")).get(0).getText();
		      		      	
		      		      	String TotalPaymentstr=TotalPayment.replaceAll("[£]", "");
		      		      			TotalPaymentstr=TotalPaymentstr.replaceAll("[,]", "");
		      		      	
		      		  		 Totalamount = Double.parseDouble(TotalPaymentstr);
		      		  		System.out.println("TotalAmount="+Totalamount);
		      		  		
		      		  		
		      		  		
		// Total Coast for Period     
		      		  		
		      		  	String TotalCoast=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'TOTAL COST ')]//following::td/div/div")).get(0).getText();
		  		      	
		  		      	String totalCoastPeriod=TotalCoast.replaceAll("[£]", "");
		  		      totalCoastPeriod=totalCoastPeriod.replaceAll("[,]", "");
		  		      	
		  		  		 TotalCoastamount = Double.parseDouble(totalCoastPeriod);
		  		  		System.out.println("TotalCoastamount="+TotalCoastamount);
		  		  		
		  		  		
		//Total Ni	  		
		  		  		
		  		   	String TotalNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'SMP/SSP Funding Rec.')]//following::td/div/div")).get(5).getText();
				      	
				      	String NiValue=TotalNI.replaceAll("[£]", "");
				      	NiValue=NiValue.replaceAll("[,]", "");
				      	
				  		 TotalNiAmount = Double.parseDouble(NiValue);
				  		System.out.println("TotalNiAmount="+TotalNiAmount);
				  		
			  		
		//CIS	  		
			  		
		 cisvalue=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'CIS Suffered')]//following::td/div/div")).get(0).getText();
			      	
			     System.out.println(cisvalue);
			     
			     
			     
			  		Reporter.log("getSendApprovalSummary");
			    }			
		 
		 
	 public void getSendApprovalSummaryCISPension() throws InterruptedException
	 
	 	{
	 		
				
				summaryDate = m_Driver.findElement(By.xpath("//*[contains(text(),'PAYROLL SUMMARY')]")).getText();
				 
				 System.out.println(summaryDate);
				 
		// TotalPayments		 
				 
				 
				 
				 	String payements=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(0).getText();
				      	//System.out.println(Tax);
				      	String Pstr=payements.replaceAll("[£]", "");
				      	Pstr=Pstr.replaceAll("[,]", "");
				      	
				      	totalPayments = Double.parseDouble(Pstr);
				  		System.out.println("This is totalPayments="+totalPayments);
				      	
				 
				 
				 
		 		 
		//Tax Finding
		 	        		      	
		 	        		      	String Tax=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(1).getText();
		 	        		      	//System.out.println(Tax);
		 	        		      	String str=Tax.replaceAll("[£]", "");
		 	        		      	str=str.replaceAll("[,]", "");
		 	        		      	
		 	        		      	TaxAmount = Double.parseDouble(str);
		 	        		  		System.out.println("This is Tax amount="+TaxAmount);
		 	        		      	
		 				  		

		//Employee NI Finding
		 	        		  		
		 	        		  		String EmployeeNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(4).getText();
		 	        		      	//System.out.println(EmployeeNI);
		 	        		  		String EmployeeNIstr=EmployeeNI.replaceAll("[£]", "");
		 	        		  		EmployeeNIstr=EmployeeNIstr.replaceAll("[,]", "");
		 	        		      	
		 	        		  		 EmployeeNIAmount = Double.parseDouble(EmployeeNIstr);    	        		  		
		 	        		  		System.out.println("This is EmployeeNI amount="+EmployeeNIAmount);
		 	        		  
		 	     
		//EmployeePension 	        		  		
		 	        		  		String EmployeePension=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(5).getText();
		 	        		      	//System.out.println(EmployeeNI);
		 	        		  		String ePension=EmployeePension.replaceAll("[£]", "");
		 	        		  		ePension=ePension.replaceAll("[,]", "");
		 	        		      	
		 	        		  		 employeePensionAmount = Double.parseDouble(ePension);    	        		  		
		 	        		  		System.out.println("This is employeePensionAmount ="+employeePensionAmount);	
		 	        		  		
		 	        		  		

		 // NetPay	        		  		
		 	        		  		String netpay=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(6).getText();
		 	        		      	//System.out.println(EmployeeNI);
		 	        		  		String netpayValue=netpay.replaceAll("[£]", "");
		 	        		  		netpayValue=netpayValue.replaceAll("[,]", "");
		 	        		      	
		 	        		  		 NetPayment = Double.parseDouble(netpayValue);    	        		  		
		 	        		  		System.out.println("This is NetPayment amount="+NetPayment);
		 	        		  		
		 	        		  		
		 	        		  		
		//Employer NI Finding
		 	        		      	
		 	        		      	String EmployerNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(7).getText();
		 	        		      	//System.out.println(EmployerNI);
		 	        		      	String EmployerNIstr=EmployerNI.replaceAll("[£]", "");
		 	        		      	EmployerNIstr=EmployerNIstr.replaceAll("[,]", "");
		 	        		      	
		 	        		  		 EmployerNIAmount = Double.parseDouble(EmployerNIstr);    
		 	        		  		 
		 	        		  	
		//Employer Pension 	        		  		 
		 	        		  	 	String EmployerPension=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(8).getText();
		 	        		      	//System.out.println(EmployerNI);
		 	        		      	String erPension=EmployerPension.replaceAll("[£]", "");
		 	        		      	erPension=erPension.replaceAll("[,]", "");
		 	        		      	
		 	        		  		 EmployerPensionAmount = Double.parseDouble(erPension); 
		 	        		  		
		//Balance owed (b/f)
		 	        		  		
		 	        		  		String BalanceOwed=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(0).getText();
		 	        		      	//System.out.println(EmployerNI);
		 	        		      	String BalanceOwedstr=BalanceOwed.replaceAll("[£]", "");
		 	        		      	BalanceOwedstr=BalanceOwedstr.replaceAll("[,]", "");
		 	        		      	
		 	        		  		 BalanceOwedAmount = Double.parseDouble(BalanceOwedstr);   	        		  	
		 	        		  		System.out.println("This is Balance owed="+BalanceOwedAmount);
			    				  	

		 	        		  		
		//Balance c/f 
		 	        		  		
		 	        		  		String Balancecarry=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(1).getText();
		 	        		      	//System.out.println(EmployerNI);
		 	        		      	String Balancecarrystr=Balancecarry.replaceAll("[£]", "");
		 	        		      	Balancecarrystr=Balancecarrystr.replaceAll("[,]", "");
		 	        		      	
		 	        		  		 BalancecarryAmount = Double.parseDouble(Balancecarrystr);    	        		  	
		 	        		  		System.out.println("This is Balance c/f="+BalancecarryAmount);
		 	        		  		
		 	        		  		
		 	        		  		
		//Payment DUE to HMRC				  		 
		     				  		String PAYE_NI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'PAYE & NI')]//following::td/div/div")).get(0).getText();
		     			      	
		     			      	String PAYE_NIstr=PAYE_NI.replaceAll("[£]", "");
		     			      			PAYE_NIstr=PAYE_NIstr.replaceAll("[,]", "");
		     			      	
		     			  		 PAYE_NIValue = Double.parseDouble(PAYE_NIstr);
		     			  		 System.out.println("PAYE_NIValue="+PAYE_NIValue);
		     			  		 
		     			  		 
		     			  		 
		//Getting payment done in month
		     			  		 
		      			  		String TotalPayment=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Payment For ')]//following::td/div/div")).get(0).getText();
		      		      	
		      		      	String TotalPaymentstr=TotalPayment.replaceAll("[£]", "");
		      		      			TotalPaymentstr=TotalPaymentstr.replaceAll("[,]", "");
		      		      	
		      		  		 Totalamount = Double.parseDouble(TotalPaymentstr);
		      		  		System.out.println("TotalAmount="+Totalamount);
		      		  		
		      		  		
		      		  		
		// Total Coast for Period     
		      		  		
		      		  	String TotalCoast=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'TOTAL COST ')]//following::td/div/div")).get(0).getText();
		  		      	
		  		      	String totalCoastPeriod=TotalCoast.replaceAll("[£]", "");
		  		      totalCoastPeriod=totalCoastPeriod.replaceAll("[,]", "");
		  		      	
		  		  		 TotalCoastamount = Double.parseDouble(totalCoastPeriod);
		  		  		System.out.println("TotalCoastamount="+TotalCoastamount);
		  		  		
		  		  		
		//Total Ni	  		
		  		  		
		  		   	String TotalNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'SMP/SSP Funding Rec.')]//following::td/div/div")).get(5).getText();
				      	
				      	String NiValue=TotalNI.replaceAll("[£]", "");
				      	NiValue=NiValue.replaceAll("[,]", "");
				      	
				  		 TotalNiAmount = Double.parseDouble(NiValue);
				  		System.out.println("TotalNiAmount="+TotalNiAmount);
				  		
			  		
		//CIS	  		
			  		
		 cisvalue=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'CIS Suffered')]//following::td/div/div")).get(0).getText();
			      	
			     System.out.println(cisvalue);
			     
			     
			     
			  		Reporter.log("getSendApprovalSummary");
			    }			
		 	 
	 
	 
	 
 public void getSendApprovalSummaryCISPensionQuarterly() throws InterruptedException
 
 	{
 		
			
			summaryDate = m_Driver.findElement(By.xpath("//*[contains(text(),'PAYROLL SUMMARY')]")).getText();
			 
			 System.out.println(summaryDate);
			 
	// TotalPayments		 
			 
			 
			 
			 	String payements=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(0).getText();
			      	//System.out.println(Tax);
			      	String Pstr=payements.replaceAll("[£]", "");
			      	Pstr=Pstr.replaceAll("[,]", "");
			      	
			      	totalPayments = Double.parseDouble(Pstr);
			  		System.out.println("This is totalPayments="+totalPayments);
			      	
			 
			 
			 
	 		 
	//Tax Finding
	 	        		      	
	 	        		      	String Tax=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(1).getText();
	 	        		      	//System.out.println(Tax);
	 	        		      	String str=Tax.replaceAll("[£]", "");
	 	        		      	str=str.replaceAll("[,]", "");
	 	        		      	
	 	        		      	TaxAmount = Double.parseDouble(str);
	 	        		  		System.out.println("This is Tax amount="+TaxAmount);
	 	        		      	
	 				  		

	//Employee NI Finding
	 	        		  		
	 	        		  		String EmployeeNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(4).getText();
	 	        		      	//System.out.println(EmployeeNI);
	 	        		  		String EmployeeNIstr=EmployeeNI.replaceAll("[£]", "");
	 	        		  		EmployeeNIstr=EmployeeNIstr.replaceAll("[,]", "");
	 	        		      	
	 	        		  		 EmployeeNIAmount = Double.parseDouble(EmployeeNIstr);    	        		  		
	 	        		  		System.out.println("This is EmployeeNI amount="+EmployeeNIAmount);
	 	        		  
	 	     
	//EmployeePension 	        		  		
	 	        		  		String EmployeePension=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(5).getText();
	 	        		      	//System.out.println(EmployeeNI);
	 	        		  		String ePension=EmployeePension.replaceAll("[£]", "");
	 	        		  		ePension=ePension.replaceAll("[,]", "");
	 	        		      	
	 	        		  		 employeePensionAmount = Double.parseDouble(ePension);    	        		  		
	 	        		  		System.out.println("This is employeePensionAmount ="+employeePensionAmount);	
	 	        		  		
	 	        		  		

	 // NetPay	        		  		
	 	        		  		String netpay=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(6).getText();
	 	        		      	//System.out.println(EmployeeNI);
	 	        		  		String netpayValue=netpay.replaceAll("[£]", "");
	 	        		  		netpayValue=netpayValue.replaceAll("[,]", "");
	 	        		      	
	 	        		  		 NetPayment = Double.parseDouble(netpayValue);    	        		  		
	 	        		  		System.out.println("This is NetPayment amount="+NetPayment);
	 	        		  		
	 	        		  		
	 	        		  		
	//Employer NI Finding
	 	        		      	
	 	        		      	String EmployerNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(7).getText();
	 	        		      	//System.out.println(EmployerNI);
	 	        		      	String EmployerNIstr=EmployerNI.replaceAll("[£]", "");
	 	        		      	EmployerNIstr=EmployerNIstr.replaceAll("[,]", "");
	 	        		      	
	 	        		  		 EmployerNIAmount = Double.parseDouble(EmployerNIstr);    
	 	        		  		 
	 	        		  	
	//Employer Pension 	        		  		 
	 	        		  	 	String EmployerPension=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(8).getText();
	 	        		      	//System.out.println(EmployerNI);
	 	        		      	String erPension=EmployerPension.replaceAll("[£]", "");
	 	        		      	erPension=erPension.replaceAll("[,]", "");
	 	        		      	
	 	        		  		 EmployerPensionAmount = Double.parseDouble(erPension); 
	 	        		  		
	//Balance owed (b/f)
	 	        		  		
	 	        		  		String BalanceOwed=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(0).getText();
	 	        		      	//System.out.println(EmployerNI);
	 	        		      	String BalanceOwedstr=BalanceOwed.replaceAll("[£]", "");
	 	        		      	BalanceOwedstr=BalanceOwedstr.replaceAll("[,]", "");
	 	        		      	
	 	        		  		 BalanceOwedAmount = Double.parseDouble(BalanceOwedstr);   	        		  	
	 	        		  		System.out.println("This is Balance owed="+BalanceOwedAmount);
		    				  	

	 	        		  		
	//Balance c/f 
	 	        		  		
	 	        		  		String Balancecarry=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(1).getText();
	 	        		      	//System.out.println(EmployerNI);
	 	        		      	String Balancecarrystr=Balancecarry.replaceAll("[£]", "");
	 	        		      	Balancecarrystr=Balancecarrystr.replaceAll("[,]", "");
	 	        		      	
	 	        		  		 BalancecarryAmount = Double.parseDouble(Balancecarrystr);    	        		  	
	 	        		  		System.out.println("This is Balance c/f="+BalancecarryAmount);
	 	        		  		
	 	        		  		
	 	        		  		
	//Payment DUE to HMRC				  		 
	     				  		String PAYE_NI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'PAYE & NI')]//following::td/div/div")).get(0).getText();
	     			      	
	     			      	String PAYE_NIstr=PAYE_NI.replaceAll("[£]", "");
	     			      			PAYE_NIstr=PAYE_NIstr.replaceAll("[,]", "");
	     			      	
	     			  		 PAYE_NIValue = Double.parseDouble(PAYE_NIstr);
	     			  		 System.out.println("PAYE_NIValue="+PAYE_NIValue);
	     			  		 
	     			  		 
	     			  		 
	//Getting payment done in month
	     			  		 
	      			  		String TotalPayment=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Payment For ')]//following::td/div/div")).get(0).getText();
	      		      	
	      		      	String TotalPaymentstr=TotalPayment.replaceAll("[£]", "");
	      		      			TotalPaymentstr=TotalPaymentstr.replaceAll("[,]", "");
	      		      	
	      		  		 Totalamount = Double.parseDouble(TotalPaymentstr);
	      		  		System.out.println("TotalAmount="+Totalamount);
	      		  		
	      		  		
	      		  		
	// Total Coast for Period     
	      		  		
	      		  	String TotalCoast=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'TOTAL COST ')]//following::td/div/div")).get(0).getText();
	  		      	
	  		      	String totalCoastPeriod=TotalCoast.replaceAll("[£]", "");
	  		      totalCoastPeriod=totalCoastPeriod.replaceAll("[,]", "");
	  		      	
	  		  		 TotalCoastamount = Double.parseDouble(totalCoastPeriod);
	  		  		System.out.println("TotalCoastamount="+TotalCoastamount);
	  		  		
	  		  		
	//Total Ni	  		
	  		  		
	  		   	String TotalNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'SMP/SSP Funding Rec.')]//following::td/div/div")).get(6).getText();
			      	
			      	String NiValue=TotalNI.replaceAll("[£]", "");
			      	NiValue=NiValue.replaceAll("[,]", "");
			      	
			  		 TotalNiAmount = Double.parseDouble(NiValue);
			  		System.out.println("TotalNiAmount="+TotalNiAmount);
			  		
		  		
	//CIS	  		
		  		
	 cisvalue=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'CIS Suffered')]//following::td/div/div")).get(0).getText();
		      	
		     System.out.println(cisvalue);
		     
		     
		     
		  		Reporter.log("getSendApprovalSummary");
		    }	
	 
	 
	 
	 public void verifyApproverdPayrollSummaryCISPension() throws InterruptedException
 	{
 		
		 String summaryDate1 = m_Driver.findElement(By.xpath("//*[contains(text(),'PAYROLL SUMMARY')]")).getText();
		 
		 System.out.println(summaryDate1);
		 
	    soft.assertEquals(summaryDate1, summaryDate);

	 
//TotalPayments		 
	 
	 	String payements=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(0).getText();
	      	//System.out.println(Tax);
	      	String Pstr=payements.replaceAll("[£]", "");
	      	Pstr=Pstr.replaceAll("[,]", "");
	      	
	      	 double AtotalPayments = Double.parseDouble(Pstr);
	  		System.out.println("This is totalPayments="+AtotalPayments);
			soft.assertEquals(AtotalPayments, totalPayments);

	 
	 
	 
		 
//Tax Finding
	        		      	
	        		      	String Tax=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(1).getText();
	        		      	//System.out.println(Tax);
	        		      	String str=Tax.replaceAll("[£]", "");
	        		      	str=str.replaceAll("[,]", "");
	        		      	
	        		      double TaxAmount1 = Double.parseDouble(str);
	        		  		System.out.println("This is Tax amount="+TaxAmount1);
	       				soft.assertEquals(TaxAmount1, TaxAmount);

				  		

//Employee NI Finding
	        		  		
	        		  		String EmployeeNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(4).getText();
	        		      	//System.out.println(EmployeeNI);
	        		  		String EmployeeNIstr=EmployeeNI.replaceAll("[£]", "");
	        		  		EmployeeNIstr=EmployeeNIstr.replaceAll("[,]", "");
	        		      	
	        		  		double EmployeeNIAmount1 = Double.parseDouble(EmployeeNIstr);    	        		  		
	        		  		System.out.println("This is EmployeeNI amount="+EmployeeNIAmount1);
	        		  		
	 	       				soft.assertEquals(EmployeeNIAmount1, EmployeeNIAmount);
	 	       				
	 	       				
 //EmployeePension 	        		  		
 	        		  		String EmployeePension=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(5).getText();
 	        		      	//System.out.println(EmployeeNI);
 	        		  		String ePension=EmployeePension.replaceAll("[£]", "");
 	        		  		ePension=ePension.replaceAll("[,]", "");
 	        		      	
 	        		  		double  employeePensionAmount1 = Double.parseDouble(ePension);    	        		  		
 	        		  		System.out.println("This is employeePensionAmount ="+employeePensionAmount1);	
 	        		  		
	 	       				soft.assertEquals(employeePensionAmount1, employeePensionAmount);


// NetPay	        		  		
	        		  		String netpay=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(6).getText();
	        		      	//System.out.println(EmployeeNI);
	        		  		String netpayValue=netpay.replaceAll("[£]", "");
	        		  		netpayValue=netpayValue.replaceAll("[,]", "");
	        		      	
	        		  		double NetPayment1 = Double.parseDouble(netpayValue);    	        		  		
	        		  		System.out.println("This is NetPayment amount="+NetPayment1);
	 	       				soft.assertEquals(NetPayment1, NetPayment);

	        		  		
	        		  		
//Employer NI Finding
	        		      	
	        		      	String EmployerNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(7).getText();
	        		      	//System.out.println(EmployerNI);
	        		      	String EmployerNIstr=EmployerNI.replaceAll("[£]", "");
	        		      	EmployerNIstr=EmployerNIstr.replaceAll("[,]", "");
	        		  		double EmployerNIAmount1 = Double.parseDouble(EmployerNIstr);    
	        		  		 
	        		  		System.out.println("This is EmployerNIAmount ="+EmployerNIAmount1);
	 	       				soft.assertEquals(EmployerNIAmount1, EmployerNIAmount);
	 	       				
	 	       				
//Employer Pension 	        		  		 
 	        		  	 	String EmployerPension=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(8).getText();
 	        		      	//System.out.println(EmployerNI);
 	        		      	String erPension=EmployerPension.replaceAll("[£]", "");
 	        		      	erPension=erPension.replaceAll("[,]", "");
 	        		      	
 	        		  		double EmployerPensionAmount1 = Double.parseDouble(erPension); 
 	        		  		
	 	       				soft.assertEquals(EmployerPensionAmount1, EmployerPensionAmount);


	        		  		
//Balance owed (b/f)
	        		  		
	        		  		String BalanceOwed=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(0).getText();
	        		      	//System.out.println(EmployerNI);
	        		      	String BalanceOwedstr=BalanceOwed.replaceAll("[£]", "");
	        		      	BalanceOwedstr=BalanceOwedstr.replaceAll("[,]", "");
	        		      	
	        		  		double BalanceOwedAmount1 = Double.parseDouble(BalanceOwedstr);   	        		  	
	        		  		System.out.println("This is Balance owed="+BalanceOwedAmount1);
	 	       				soft.assertEquals(BalanceOwedAmount1, BalanceOwedAmount);


	        		  		
//Balance c/f 
	        		  		
	        		  		String Balancecarry=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(1).getText();
	        		      	//System.out.println(EmployerNI);
	        		      	String Balancecarrystr=Balancecarry.replaceAll("[£]", "");
	        		      	Balancecarrystr=Balancecarrystr.replaceAll("[,]", "");
	        		      	
	        		  		double BalancecarryAmount1 = Double.parseDouble(Balancecarrystr);    	        		  	
	        		  		System.out.println("This is Balance c/f="+BalancecarryAmount1);
	 	       				soft.assertEquals(BalancecarryAmount1, BalancecarryAmount);

	        		  		
	        		  		
//Payment DUE to HMRC				  		 
 				  		String PAYE_NI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'PAYE & NI')]//following::td/div/div")).get(0).getText();
 			      	
						String PAYE_NIstr = PAYE_NI.replaceAll("[£]", "");
						PAYE_NIstr = PAYE_NIstr.replaceAll("[,]", "");

						double PAYE_NIValue1 = Double.parseDouble(PAYE_NIstr);
						System.out.println("PAYE_NIValue=" + PAYE_NIValue1);
						soft.assertEquals(PAYE_NIValue1, PAYE_NIValue);
 			  		 
 			  		 
//Getting payment done in month
 			  		 
  			  		String TotalPayment=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Payment For ')]//following::td/div/div")).get(0).getText();
  		      	
					String TotalPaymentstr = TotalPayment.replaceAll("[£]", "");
					TotalPaymentstr = TotalPaymentstr.replaceAll("[,]", "");

					double Totalamount1 = Double.parseDouble(TotalPaymentstr);
					System.out.println("TotalAmount=" + Totalamount1);
					soft.assertEquals(Totalamount1, Totalamount);

  		  		
//Total Coast for Period     
  		  		
  		  	String TotalCoast=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'TOTAL COST ')]//following::td/div/div")).get(0).getText();

			String totalCoastPeriod = TotalCoast.replaceAll("[£]", "");
			totalCoastPeriod = totalCoastPeriod.replaceAll("[,]", "");

		double	TotalCoastamount1 = Double.parseDouble(totalCoastPeriod);
			System.out.println("TotalCoastamount="+TotalCoastamount1);
			soft.assertEquals(TotalCoastamount1, TotalCoastamount);

		  		
//Total Ni	  		
		  		
		   	String TotalNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'SMP/SSP Funding Rec.')]//following::td/div/div")).get(5).getText();

		String NiValue = TotalNI.replaceAll("[£]", "");
		NiValue = NiValue.replaceAll("[,]", "");

     	double	TotalNiAmount1 = Double.parseDouble(NiValue);
		System.out.println("TotalNiAmount="+TotalNiAmount1);
		soft.assertEquals(TotalNiAmount1, TotalNiAmount);

//CIS sufferd 
			
			String cisSufferd=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'CIS Suffered')]//following::td/div/div")).get(0).getText();
	      	
		     System.out.println("cisvalue" +cisSufferd);
		     
		     soft.assertEquals(cisSufferd, cisvalue);

			
			
			Reporter.log("verifyApproverdPayrollSummary");
		  		
		    }	
	 
	 
	 
	 
	 
	 public void verifyApproverdPayrollSummaryCISPensionQuarterly() throws InterruptedException
 	{
 		
		 String summaryDate1 = m_Driver.findElement(By.xpath("//*[contains(text(),'PAYROLL SUMMARY')]")).getText();
		 
		 System.out.println(summaryDate1);
		 
	    soft.assertEquals(summaryDate1, summaryDate);

	 
//TotalPayments		 
	 
	 	String payements=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(0).getText();
	      	//System.out.println(Tax);
	      	String Pstr=payements.replaceAll("[£]", "");
	      	Pstr=Pstr.replaceAll("[,]", "");
	      	
	      	 double AtotalPayments = Double.parseDouble(Pstr);
	  		System.out.println("This is totalPayments="+AtotalPayments);
			soft.assertEquals(AtotalPayments, totalPayments);

	 
	 
	 
		 
//Tax Finding
	        		      	
	        		      	String Tax=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(1).getText();
	        		      	//System.out.println(Tax);
	        		      	String str=Tax.replaceAll("[£]", "");
	        		      	str=str.replaceAll("[,]", "");
	        		      	
	        		      double TaxAmount1 = Double.parseDouble(str);
	        		  		System.out.println("This is Tax amount="+TaxAmount1);
	       				soft.assertEquals(TaxAmount1, TaxAmount);

				  		

//Employee NI Finding
	        		  		
	        		  		String EmployeeNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(4).getText();
	        		      	//System.out.println(EmployeeNI);
	        		  		String EmployeeNIstr=EmployeeNI.replaceAll("[£]", "");
	        		  		EmployeeNIstr=EmployeeNIstr.replaceAll("[,]", "");
	        		      	
	        		  		double EmployeeNIAmount1 = Double.parseDouble(EmployeeNIstr);    	        		  		
	        		  		System.out.println("This is EmployeeNI amount="+EmployeeNIAmount1);
	        		  		
	 	       				soft.assertEquals(EmployeeNIAmount1, EmployeeNIAmount);
	 	       				
	 	       				
 //EmployeePension 	        		  		
 	        		  		String EmployeePension=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(5).getText();
 	        		      	//System.out.println(EmployeeNI);
 	        		  		String ePension=EmployeePension.replaceAll("[£]", "");
 	        		  		ePension=ePension.replaceAll("[,]", "");
 	        		      	
 	        		  		double  employeePensionAmount1 = Double.parseDouble(ePension);    	        		  		
 	        		  		System.out.println("This is employeePensionAmount ="+employeePensionAmount1);	
 	        		  		
	 	       				soft.assertEquals(employeePensionAmount1, employeePensionAmount);


// NetPay	        		  		
	        		  		String netpay=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(6).getText();
	        		      	//System.out.println(EmployeeNI);
	        		  		String netpayValue=netpay.replaceAll("[£]", "");
	        		  		netpayValue=netpayValue.replaceAll("[,]", "");
	        		      	
	        		  		double NetPayment1 = Double.parseDouble(netpayValue);    	        		  		
	        		  		System.out.println("This is NetPayment amount="+NetPayment1);
	 	       				soft.assertEquals(NetPayment1, NetPayment);

	        		  		
	        		  		
//Employer NI Finding
	        		      	
	        		      	String EmployerNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(7).getText();
	        		      	//System.out.println(EmployerNI);
	        		      	String EmployerNIstr=EmployerNI.replaceAll("[£]", "");
	        		      	EmployerNIstr=EmployerNIstr.replaceAll("[,]", "");
	        		  		double EmployerNIAmount1 = Double.parseDouble(EmployerNIstr);    
	        		  		 
	        		  		System.out.println("This is EmployerNIAmount ="+EmployerNIAmount1);
	 	       				soft.assertEquals(EmployerNIAmount1, EmployerNIAmount);
	 	       				
	 	       				
//Employer Pension 	        		  		 
 	        		  	 	String EmployerPension=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(8).getText();
 	        		      	//System.out.println(EmployerNI);
 	        		      	String erPension=EmployerPension.replaceAll("[£]", "");
 	        		      	erPension=erPension.replaceAll("[,]", "");
 	        		      	
 	        		  		double EmployerPensionAmount1 = Double.parseDouble(erPension); 
 	        		  		
	 	       				soft.assertEquals(EmployerPensionAmount1, EmployerPensionAmount);


	        		  		
//Balance owed (b/f)
	        		  		
	        		  		String BalanceOwed=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(0).getText();
	        		      	//System.out.println(EmployerNI);
	        		      	String BalanceOwedstr=BalanceOwed.replaceAll("[£]", "");
	        		      	BalanceOwedstr=BalanceOwedstr.replaceAll("[,]", "");
	        		      	
	        		  		double BalanceOwedAmount1 = Double.parseDouble(BalanceOwedstr);   	        		  	
	        		  		System.out.println("This is Balance owed="+BalanceOwedAmount1);
	 	       				soft.assertEquals(BalanceOwedAmount1, BalanceOwedAmount);


	        		  		
//Balance c/f 
	        		  		
	        		  		String Balancecarry=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(1).getText();
	        		      	//System.out.println(EmployerNI);
	        		      	String Balancecarrystr=Balancecarry.replaceAll("[£]", "");
	        		      	Balancecarrystr=Balancecarrystr.replaceAll("[,]", "");
	        		      	
	        		  		double BalancecarryAmount1 = Double.parseDouble(Balancecarrystr);    	        		  	
	        		  		System.out.println("This is Balance c/f="+BalancecarryAmount1);
	 	       				soft.assertEquals(BalancecarryAmount1, BalancecarryAmount);

	        		  		
	        		  		
//Payment DUE to HMRC				  		 
 				  		String PAYE_NI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'PAYE & NI')]//following::td/div/div")).get(0).getText();
 			      	
						String PAYE_NIstr = PAYE_NI.replaceAll("[£]", "");
						PAYE_NIstr = PAYE_NIstr.replaceAll("[,]", "");

						double PAYE_NIValue1 = Double.parseDouble(PAYE_NIstr);
						System.out.println("PAYE_NIValue=" + PAYE_NIValue1);
						soft.assertEquals(PAYE_NIValue1, PAYE_NIValue);
 			  		 
 			  		 
//Getting payment done in month
 			  		 
  			  		String TotalPayment=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Payment For ')]//following::td/div/div")).get(0).getText();
  		      	
					String TotalPaymentstr = TotalPayment.replaceAll("[£]", "");
					TotalPaymentstr = TotalPaymentstr.replaceAll("[,]", "");

					double Totalamount1 = Double.parseDouble(TotalPaymentstr);
					System.out.println("TotalAmount=" + Totalamount1);
					soft.assertEquals(Totalamount1, Totalamount);

  		  		
//Total Coast for Period     
  		  		
  		  	String TotalCoast=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'TOTAL COST ')]//following::td/div/div")).get(0).getText();

			String totalCoastPeriod = TotalCoast.replaceAll("[£]", "");
			totalCoastPeriod = totalCoastPeriod.replaceAll("[,]", "");

		double	TotalCoastamount1 = Double.parseDouble(totalCoastPeriod);
			System.out.println("TotalCoastamount="+TotalCoastamount1);
			soft.assertEquals(TotalCoastamount1, TotalCoastamount);

		  		
//Total Ni	  		
		  		
		   	String TotalNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'SMP/SSP Funding Rec.')]//following::td/div/div")).get(6).getText();

		String NiValue = TotalNI.replaceAll("[£]", "");
		NiValue = NiValue.replaceAll("[,]", "");

     	double	TotalNiAmount1 = Double.parseDouble(NiValue);
		System.out.println("TotalNiAmount="+TotalNiAmount1);
		soft.assertEquals(TotalNiAmount1, TotalNiAmount);

//CIS sufferd 
			
			String cisSufferd=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'CIS Suffered')]//following::td/div/div")).get(0).getText();
	      	
		     System.out.println("cisvalue" +cisSufferd);
		     
		     soft.assertEquals(cisSufferd, cisvalue);

			
			
			Reporter.log("verifyApproverdPayrollSummary");
		  		
		    }	
	 
	 
	 
	 
 public void getSendApprovalSummaryCISQuarterly() throws InterruptedException
 
 	{
 		
			
			summaryDate = m_Driver.findElement(By.xpath("//*[contains(text(),'PAYROLL SUMMARY')]")).getText();
			 
			 System.out.println(summaryDate);
			 
	// TotalPayments		 
			 
			 
			 
			 	String payements=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(0).getText();
			      	//System.out.println(Tax);
			      	String Pstr=payements.replaceAll("[£]", "");
			      	Pstr=Pstr.replaceAll("[,]", "");
			      	
			      	totalPayments = Double.parseDouble(Pstr);
			  		System.out.println("This is totalPayments="+totalPayments);
			      	
			 
			 
			 
	 		 
	//Tax Finding
	 	        		      	
	 	        		      	String Tax=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(1).getText();
	 	        		      	//System.out.println(Tax);
	 	        		      	String str=Tax.replaceAll("[£]", "");
	 	        		      	str=str.replaceAll("[,]", "");
	 	        		      	
	 	        		      	TaxAmount = Double.parseDouble(str);
	 	        		  		System.out.println("This is Tax amount="+TaxAmount);
	 	        		      	
	 				  		

	//Employee NI Finding
	 	        		  		
	 	        		  		String EmployeeNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(4).getText();
	 	        		      	//System.out.println(EmployeeNI);
	 	        		  		String EmployeeNIstr=EmployeeNI.replaceAll("[£]", "");
	 	        		  		EmployeeNIstr=EmployeeNIstr.replaceAll("[,]", "");
	 	        		      	
	 	        		  		 EmployeeNIAmount = Double.parseDouble(EmployeeNIstr);    	        		  		
	 	        		  		System.out.println("This is EmployeeNI amount="+EmployeeNIAmount);
	 	        		  
	 	     
	//EmployeePension 	        		  		
//	 	        		  		String EmployeePension=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(5).getText();
//	 	        		      	//System.out.println(EmployeeNI);
//	 	        		  		String ePension=EmployeePension.replaceAll("[£]", "");
//	 	        		  		ePension=ePension.replaceAll("[,]", "");
//	 	        		      	
//	 	        		  		 employeePensionAmount = Double.parseDouble(ePension);    	        		  		
//	 	        		  		System.out.println("This is employeePensionAmount ="+employeePensionAmount);	
	 	        		  		
	 	        		  		

	 // NetPay	        		  		
	 	        		  		String netpay=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(5).getText();
	 	        		      	//System.out.println(EmployeeNI);
	 	        		  		String netpayValue=netpay.replaceAll("[£]", "");
	 	        		  		netpayValue=netpayValue.replaceAll("[,]", "");
	 	        		      	
	 	        		  		 NetPayment = Double.parseDouble(netpayValue);    	        		  		
	 	        		  		System.out.println("This is NetPayment amount="+NetPayment);
	 	        		  		
	 	        		  		
	 	        		  		
	//Employer NI Finding
	 	        		      	
	 	        		      	String EmployerNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(6).getText();
	 	        		      	//System.out.println(EmployerNI);
	 	        		      	String EmployerNIstr=EmployerNI.replaceAll("[£]", "");
	 	        		      	EmployerNIstr=EmployerNIstr.replaceAll("[,]", "");
	 	        		      	
	 	        		  		 EmployerNIAmount = Double.parseDouble(EmployerNIstr);    
	 	        		  		 
	 	        		  	
//	//Employer Pension 	        		  		 
//	 	        		  	 	String EmployerPension=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(8).getText();
//	 	        		      	//System.out.println(EmployerNI);
//	 	        		      	String erPension=EmployerPension.replaceAll("[£]", "");
//	 	        		      	erPension=erPension.replaceAll("[,]", "");
//	 	        		      	
//	 	        		  		 EmployerPensionAmount = Double.parseDouble(erPension); 
	 	        		  		
	//Balance owed (b/f)
	 	        		  		
	 	        		  		String BalanceOwed=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(0).getText();
	 	        		      	//System.out.println(EmployerNI);
	 	        		      	String BalanceOwedstr=BalanceOwed.replaceAll("[£]", "");
	 	        		      	BalanceOwedstr=BalanceOwedstr.replaceAll("[,]", "");
	 	        		      	
	 	        		  		 BalanceOwedAmount = Double.parseDouble(BalanceOwedstr);   	        		  	
	 	        		  		System.out.println("This is Balance owed="+BalanceOwedAmount);
		    				  	

	 	        		  		
	//Balance c/f 
	 	        		  		
	 	        		  		String Balancecarry=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(1).getText();
	 	        		      	//System.out.println(EmployerNI);
	 	        		      	String Balancecarrystr=Balancecarry.replaceAll("[£]", "");
	 	        		      	Balancecarrystr=Balancecarrystr.replaceAll("[,]", "");
	 	        		      	
	 	        		  		 BalancecarryAmount = Double.parseDouble(Balancecarrystr);    	        		  	
	 	        		  		System.out.println("This is Balance c/f="+BalancecarryAmount);
	 	        		  		
	 	        		  		
	 	        		  		
	//Payment DUE to HMRC				  		 
	     				  		String PAYE_NI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'PAYE & NI')]//following::td/div/div")).get(0).getText();
	     			      	
	     			      	String PAYE_NIstr=PAYE_NI.replaceAll("[£]", "");
	     			      			PAYE_NIstr=PAYE_NIstr.replaceAll("[,]", "");
	     			      	
	     			  		 PAYE_NIValue = Double.parseDouble(PAYE_NIstr);
	     			  		 System.out.println("PAYE_NIValue="+PAYE_NIValue);
	     			  		 
	     			  		 
	     			  		 
	//Getting payment done in month
	     			  		 
	      			  		String TotalPayment=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Payment For ')]//following::td/div/div")).get(0).getText();
	      		      	
	      		      	String TotalPaymentstr=TotalPayment.replaceAll("[£]", "");
	      		      			TotalPaymentstr=TotalPaymentstr.replaceAll("[,]", "");
	      		      	
	      		  		 Totalamount = Double.parseDouble(TotalPaymentstr);
	      		  		System.out.println("TotalAmount="+Totalamount);
	      		  		
	      		  		
	      		  		
	// Total Coast for Period     
	      		  		
	      		  	String TotalCoast=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'TOTAL COST ')]//following::td/div/div")).get(0).getText();
	  		      	
	  		      	String totalCoastPeriod=TotalCoast.replaceAll("[£]", "");
	  		      totalCoastPeriod=totalCoastPeriod.replaceAll("[,]", "");
	  		      	
	  		  		 TotalCoastamount = Double.parseDouble(totalCoastPeriod);
	  		  		System.out.println("TotalCoastamount="+TotalCoastamount);
	  		  		
	  		  		
	//Total Ni	  		
	  		  		
	  		   	String TotalNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'SMP/SSP Funding Rec.')]//following::td/div/div")).get(5).getText();
			      	
			      	String NiValue=TotalNI.replaceAll("[£]", "");
			      	NiValue=NiValue.replaceAll("[,]", "");
			      	
			  		 TotalNiAmount = Double.parseDouble(NiValue);
			  		System.out.println("TotalNiAmount="+TotalNiAmount);
			  		
		  		
	//CIS	  		
		  		
	 cisvalue=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'CIS Suffered')]//following::td/div/div")).get(0).getText();
		      	
		     System.out.println(cisvalue);
		     
		     
		     
		  		Reporter.log("getSendApprovalSummary");
		    }	
 
 

 public void verifyApproverdPayrollSummaryCISQuarterly() throws InterruptedException
	{
		
	 String summaryDate1 = m_Driver.findElement(By.xpath("//*[contains(text(),'PAYROLL SUMMARY')]")).getText();
	 
	 System.out.println(summaryDate1);
	 
    soft.assertEquals(summaryDate1, summaryDate);

 
//TotalPayments		 
 
 	String payements=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(0).getText();
      	//System.out.println(Tax);
      	String Pstr=payements.replaceAll("[£]", "");
      	Pstr=Pstr.replaceAll("[,]", "");
      	
      	 double AtotalPayments = Double.parseDouble(Pstr);
  		System.out.println("This is totalPayments="+AtotalPayments);
		soft.assertEquals(AtotalPayments, totalPayments);

 
 
 
	 
//Tax Finding
        		      	
        		      	String Tax=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(1).getText();
        		      	//System.out.println(Tax);
        		      	String str=Tax.replaceAll("[£]", "");
        		      	str=str.replaceAll("[,]", "");
        		      	
        		      double TaxAmount1 = Double.parseDouble(str);
        		  		System.out.println("This is Tax amount="+TaxAmount1);
       				soft.assertEquals(TaxAmount1, TaxAmount);

			  		

//Employee NI Finding
        		  		
        		  		String EmployeeNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(4).getText();
        		      	//System.out.println(EmployeeNI);
        		  		String EmployeeNIstr=EmployeeNI.replaceAll("[£]", "");
        		  		EmployeeNIstr=EmployeeNIstr.replaceAll("[,]", "");
        		      	
        		  		double EmployeeNIAmount1 = Double.parseDouble(EmployeeNIstr);    	        		  		
        		  		System.out.println("This is EmployeeNI amount="+EmployeeNIAmount1);
        		  		
 	       				soft.assertEquals(EmployeeNIAmount1, EmployeeNIAmount);
 	       				
 	       				
//EmployeePension 	        		  		
//	        		  		String EmployeePension=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(5).getText();
//	        		      	//System.out.println(EmployeeNI);
//	        		  		String ePension=EmployeePension.replaceAll("[£]", "");
//	        		  		ePension=ePension.replaceAll("[,]", "");
//	        		      	
//	        		  		double  employeePensionAmount1 = Double.parseDouble(ePension);    	        		  		
//	        		  		System.out.println("This is employeePensionAmount ="+employeePensionAmount1);	
//	        		  		
// 	       				soft.assertEquals(employeePensionAmount1, employeePensionAmount);


//NetPay	        		  		
        		  		String netpay=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(5).getText();
        		      	//System.out.println(EmployeeNI);
        		  		String netpayValue=netpay.replaceAll("[£]", "");
        		  		netpayValue=netpayValue.replaceAll("[,]", "");
        		      	
        		  		double NetPayment1 = Double.parseDouble(netpayValue);    	        		  		
        		  		System.out.println("This is NetPayment amount="+NetPayment1);
 	       				soft.assertEquals(NetPayment1, NetPayment);

        		  		
        		  		
//Employer NI Finding
        		      	
        		      	String EmployerNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(6).getText();
        		      	//System.out.println(EmployerNI);
        		      	String EmployerNIstr=EmployerNI.replaceAll("[£]", "");
        		      	EmployerNIstr=EmployerNIstr.replaceAll("[,]", "");
        		  		double EmployerNIAmount1 = Double.parseDouble(EmployerNIstr);    
        		  		 
        		  		System.out.println("This is EmployerNIAmount ="+EmployerNIAmount1);
 	       				soft.assertEquals(EmployerNIAmount1, EmployerNIAmount);
 	       				
 	       				
//Employer Pension 	        		  		 
//	        		  	 	String EmployerPension=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(8).getText();
//	        		      	//System.out.println(EmployerNI);
//	        		      	String erPension=EmployerPension.replaceAll("[£]", "");
//	        		      	erPension=erPension.replaceAll("[,]", "");
//	        		      	
//	        		  		double EmployerPensionAmount1 = Double.parseDouble(erPension); 
//	        		  		
// 	       				soft.assertEquals(EmployerPensionAmount1, EmployerPensionAmount);


        		  		
//Balance owed (b/f)
        		  		
        		  		String BalanceOwed=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(0).getText();
        		      	//System.out.println(EmployerNI);
        		      	String BalanceOwedstr=BalanceOwed.replaceAll("[£]", "");
        		      	BalanceOwedstr=BalanceOwedstr.replaceAll("[,]", "");
        		      	
        		  		double BalanceOwedAmount1 = Double.parseDouble(BalanceOwedstr);   	        		  	
        		  		System.out.println("This is Balance owed="+BalanceOwedAmount1);
 	       				soft.assertEquals(BalanceOwedAmount1, BalanceOwedAmount);


        		  		
//Balance c/f 
        		  		
        		  		String Balancecarry=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(1).getText();
        		      	//System.out.println(EmployerNI);
        		      	String Balancecarrystr=Balancecarry.replaceAll("[£]", "");
        		      	Balancecarrystr=Balancecarrystr.replaceAll("[,]", "");
        		      	
        		  		double BalancecarryAmount1 = Double.parseDouble(Balancecarrystr);    	        		  	
        		  		System.out.println("This is Balance c/f="+BalancecarryAmount1);
 	       				soft.assertEquals(BalancecarryAmount1, BalancecarryAmount);

        		  		
        		  		
//Payment DUE to HMRC				  		 
				  		String PAYE_NI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'PAYE & NI')]//following::td/div/div")).get(0).getText();
			      	
					String PAYE_NIstr = PAYE_NI.replaceAll("[£]", "");
					PAYE_NIstr = PAYE_NIstr.replaceAll("[,]", "");

					double PAYE_NIValue1 = Double.parseDouble(PAYE_NIstr);
					System.out.println("PAYE_NIValue=" + PAYE_NIValue1);
					soft.assertEquals(PAYE_NIValue1, PAYE_NIValue);
			  		 
			  		 
//Getting payment done in month
			  		 
			  		String TotalPayment=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Payment For ')]//following::td/div/div")).get(0).getText();
		      	
				String TotalPaymentstr = TotalPayment.replaceAll("[£]", "");
				TotalPaymentstr = TotalPaymentstr.replaceAll("[,]", "");

				double Totalamount1 = Double.parseDouble(TotalPaymentstr);
				System.out.println("TotalAmount=" + Totalamount1);
				soft.assertEquals(Totalamount1, Totalamount);

		  		
//Total Coast for Period     
		  		
		  	String TotalCoast=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'TOTAL COST ')]//following::td/div/div")).get(0).getText();

		String totalCoastPeriod = TotalCoast.replaceAll("[£]", "");
		totalCoastPeriod = totalCoastPeriod.replaceAll("[,]", "");

	double	TotalCoastamount1 = Double.parseDouble(totalCoastPeriod);
		System.out.println("TotalCoastamount="+TotalCoastamount1);
		soft.assertEquals(TotalCoastamount1, TotalCoastamount);

	  		
//Total Ni	  		
	  		
	   	String TotalNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'SMP/SSP Funding Rec.')]//following::td/div/div")).get(5).getText();

	String NiValue = TotalNI.replaceAll("[£]", "");
	NiValue = NiValue.replaceAll("[,]", "");

 	double	TotalNiAmount1 = Double.parseDouble(NiValue);
	System.out.println("TotalNiAmount="+TotalNiAmount1);
	soft.assertEquals(TotalNiAmount1, TotalNiAmount);

//CIS sufferd 
		
		String cisSufferd=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'CIS Suffered')]//following::td/div/div")).get(0).getText();
      	
	     System.out.println("cisvalue" +cisSufferd);
	     
	     soft.assertEquals(cisSufferd, cisvalue);

		
		
		Reporter.log("verifyApproverdPayrollSummary");
	  		
	    }	
	 	 
	 public void assertAll()
	   {
		   soft.assertAll();
		   
	   }
}
