package _8566Page;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import pages.BasePage;

public class VerifyData  extends BasePage{

	public VerifyData(WebDriver driver) {
		super(driver);
	}
	SoftAssert soft= new SoftAssert();

	
	
	 public void verifyPayrollSummary(String summaryDate,String totalPayments, String TaxAmount ,String EmployeeNIAmount, String NetPayment, String EmployerNIAmount) throws InterruptedException
	 	{
	 		
				String summaryDate1 = m_Driver.findElement(By.xpath("//*[contains(text(),'PAYROLL SUMMARY')]")).getText();
				 
				 System.out.println(summaryDate1);
				 
			    soft.assertEquals(summaryDate1, summaryDate);

			 
	// TotalPayments		 
			 
			 	String payements=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(0).getText();
			      	String AtotalPayments=payements.replaceAll("[£]", "");
			      	AtotalPayments=AtotalPayments.replaceAll("[,]", "");
		
			  		System.out.println("This is totalPayments="+AtotalPayments);
					soft.assertEquals(AtotalPayments, totalPayments);

			 
			 
			 
	 		 
	//Tax Finding
	 	        		      	
	 	        		      	String Tax=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(1).getText();
	 	        		      	//System.out.println(Tax);
	 	        		      	String TaxAmount1=Tax.replaceAll("[£]", "");
	 	        		      	TaxAmount1=TaxAmount1.replaceAll("[,]", "");
	 	        		      	
	 	        		  		System.out.println("This is Tax amount="+TaxAmount1);
	 	       				soft.assertEquals(TaxAmount1, TaxAmount);

	 				  		

	//Employee NI Finding
	 	        		  		
	 	        		  		String EmployeeNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(4).getText();
	 	        		      	//System.out.println(EmployeeNI);
	 	        		  		String EmployeeNIAmount1=EmployeeNI.replaceAll("[£]", "");
	 	        		  		EmployeeNIAmount1=EmployeeNIAmount1.replaceAll("[,]", "");
	 	        		      	
	 	        		  		System.out.println("This is EmployeeNI amount="+EmployeeNIAmount1);
	 	        		  		
	 	 	       				soft.assertEquals(EmployeeNIAmount1, EmployeeNIAmount);

	 // NetPay	        		  		
	 	        		  		String netpay=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(5).getText();
	 	        		      	//System.out.println(EmployeeNI);
	 	        		  		String NetPayment1=netpay.replaceAll("[£]", "");
	 	        		  		NetPayment1=NetPayment1.replaceAll("[,]", "");
	 	        		      	
	 	        		  		System.out.println("This is NetPayment amount="+NetPayment1);
	 	 	       				soft.assertEquals(NetPayment1, NetPayment);

	 	        		  		
	 	        		  		
	//Employer NI Finding
	 	        		      	
	 	        		      	String EmployerNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(6).getText();
	 	        		      	//System.out.println(EmployerNI);
	 	        		      	String EmployerNIAmount1=EmployerNI.replaceAll("[£]", "");
	 	        		      	EmployerNIAmount1=EmployerNIAmount1.replaceAll("[,]", "");
	 	        		  		 
	  	        		  		System.out.println("This is EmployerNIAmount ="+EmployerNIAmount1);
	 	 	       				soft.assertEquals(EmployerNIAmount1, EmployerNIAmount);


	 	 	       				Reporter.log("verifyPayrollSummary");
				  		
				    }
	 
	 
	 
	 public void verifyPayrollSummary1(String summaryDate,String totalPayments, String TaxAmount ,String EmployeeNIAmount, String NetPayment, String EmployerNIAmount,String HMRC) throws InterruptedException
	 	{
	 		
				String summaryDate1 = m_Driver.findElement(By.xpath("//*[contains(text(),'PAYROLL SUMMARY')]")).getText();
				 
				 System.out.println(summaryDate1);
				 
			    soft.assertEquals(summaryDate1, summaryDate);

			 
	// TotalPayments		 
			 
			 	String payements=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(0).getText();
			      	String AtotalPayments=payements.replaceAll("[£]", "");
			      	AtotalPayments=AtotalPayments.replaceAll("[,]", "");
		
			  		System.out.println("This is totalPayments="+AtotalPayments);
					soft.assertEquals(AtotalPayments, totalPayments);

			 
			 
			 
	 		 
	//Tax Finding
	 	        		      	
	 	        		      	String Tax=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(1).getText();
	 	        		      	//System.out.println(Tax);
	 	        		      	String TaxAmount1=Tax.replaceAll("[£]", "");
	 	        		      	TaxAmount1=TaxAmount1.replaceAll("[,]", "");
	 	        		      	
	 	        		  		System.out.println("This is Tax amount="+TaxAmount1);
	 	       				soft.assertEquals(TaxAmount1, TaxAmount);

	 				  		

	//Employee NI Finding
	 	        		  		
	 	        		  		String EmployeeNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(4).getText();
	 	        		      	//System.out.println(EmployeeNI);
	 	        		  		String EmployeeNIAmount1=EmployeeNI.replaceAll("[£]", "");
	 	        		  		EmployeeNIAmount1=EmployeeNIAmount1.replaceAll("[,]", "");
	 	        		      	
	 	        		  		System.out.println("This is EmployeeNI amount="+EmployeeNIAmount1);
	 	        		  		
	 	 	       				soft.assertEquals(EmployeeNIAmount1, EmployeeNIAmount);

	 // NetPay	        		  		
	 	        		  		String netpay=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(5).getText();
	 	        		      	//System.out.println(EmployeeNI);
	 	        		  		String NetPayment1=netpay.replaceAll("[£]", "");
	 	        		  		NetPayment1=NetPayment1.replaceAll("[,]", "");
	 	        		      	
	 	        		  		System.out.println("This is NetPayment amount="+NetPayment1);
	 	 	       				soft.assertEquals(NetPayment1, NetPayment);

	 	        		  		
	 	        		  		
	//Employer NI Finding
	 	        		      	
	 	        		      	String EmployerNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(6).getText();
	 	        		      	//System.out.println(EmployerNI);
	 	        		      	String EmployerNIAmount1=EmployerNI.replaceAll("[£]", "");
	 	        		      	EmployerNIAmount1=EmployerNIAmount1.replaceAll("[,]", "");
	 	        		  		 
	  	        		  		System.out.println("This is EmployerNIAmount ="+EmployerNIAmount1);
	 	 	       				soft.assertEquals(EmployerNIAmount1, EmployerNIAmount);


	 	 	       				Reporter.log("verifyPayrollSummary");
				  		
	//Payment DUE to HMRC				  		 
	 	 	       			String PAYE_NI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'PAYE & NI')]//following::td/div/div")).get(0).getText();
	 	 	       		
	 	 	       		String PAYE_NIstr=PAYE_NI.replaceAll("[£]", "");
	 	 	       				PAYE_NIstr=PAYE_NIstr.replaceAll("[,]", "");
	 	 	       		
	 	 	       		 System.out.println("PAYE_NIValue="+PAYE_NIstr); 	
	 	 	       		 
	 	         			soft.assertEquals(PAYE_NIstr, HMRC);

	 	 	       				
				    }
	 
	 
	 
	 public void verifyPayrollSummaryCis(String summaryDate,String totalPayments, String TaxAmount ,String EmployeeNIAmount, String NetPayment, String EmployerNIAmount,String HMRC, String BalanceOwedAmount,String BalancecarryAmount, String cisvalue) throws InterruptedException
	 	{
	 		
				String summaryDate1 = m_Driver.findElement(By.xpath("//*[contains(text(),'PAYROLL SUMMARY')]")).getText();
				 
				 System.out.println(summaryDate1);
				 
			    soft.assertEquals(summaryDate1, summaryDate);

			 
	// TotalPayments		 
			 
			 	String payements=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(0).getText();
			      	String AtotalPayments=payements.replaceAll("[£]", "");
			      	AtotalPayments=AtotalPayments.replaceAll("[,]", "");
		
			  		System.out.println("This is totalPayments="+AtotalPayments);
					soft.assertEquals(AtotalPayments, totalPayments);

	//Tax Finding
	 	        		      	
	 	        		      	String Tax=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(1).getText();
	 	        		      	//System.out.println(Tax);
	 	        		      	String TaxAmount1=Tax.replaceAll("[£]", "");
	 	        		      	TaxAmount1=TaxAmount1.replaceAll("[,]", "");
	 	        		      	
	 	        		  		System.out.println("This is Tax amount="+TaxAmount1);
	 	       				     soft.assertEquals(TaxAmount1, TaxAmount);

	 				  		

	//Employee NI Finding
	 	        		  		
	 	        		  		String EmployeeNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(4).getText();
	 	        		      	//System.out.println(EmployeeNI);
	 	        		  		String EmployeeNIAmount1=EmployeeNI.replaceAll("[£]", "");
	 	        		  		EmployeeNIAmount1=EmployeeNIAmount1.replaceAll("[,]", "");
	 	        		      	
	 	        		  		System.out.println("This is EmployeeNI amount="+EmployeeNIAmount1);
	 	        		  		
	 	 	       				soft.assertEquals(EmployeeNIAmount1, EmployeeNIAmount);

	 // NetPay	        		  		
	 	        		  		String netpay=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(5).getText();
	 	        		      	//System.out.println(EmployeeNI);
	 	        		  		String NetPayment1=netpay.replaceAll("[£]", "");
	 	        		  		NetPayment1=NetPayment1.replaceAll("[,]", "");
	 	        		      	
	 	        		  		System.out.println("This is NetPayment amount="+NetPayment1);
	 	 	       				soft.assertEquals(NetPayment1, NetPayment);

	 	        		  		
	 	        		  		
	//Employer NI Finding
	 	        		      	
	 	        		      	String EmployerNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(6).getText();
	 	        		      	//System.out.println(EmployerNI);
	 	        		      	String EmployerNIAmount1=EmployerNI.replaceAll("[£]", "");
	 	        		      	EmployerNIAmount1=EmployerNIAmount1.replaceAll("[,]", "");
	 	        		  		 
	  	        		  		System.out.println("This is EmployerNIAmount ="+EmployerNIAmount1);
	 	 	       				soft.assertEquals(EmployerNIAmount1, EmployerNIAmount);


	 	 	       				Reporter.log("verifyPayrollSummary");
				  		
	//Payment DUE to HMRC				  		 
	 	 	       			String PAYE_NI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'PAYE & NI')]//following::td/div/div")).get(0).getText();
	 	 	       		
	 	 	       		      String PAYE_NIstr=PAYE_NI.replaceAll("[£]", "");
	 	 	       				PAYE_NIstr=PAYE_NIstr.replaceAll("[,]", "");
	 	 	       		
	 	 	       		       System.out.println("PAYE_NIValue="+PAYE_NIstr); 	
	 	 	       		 
	 	         			soft.assertEquals(PAYE_NIstr, HMRC);
	        		  		
//Balance owed (b/f)
	 	         			        		  		
	 	         				String BalanceOwed=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(0).getText();
	 	         				String BalanceOwedstr=BalanceOwed.replaceAll("[£]", "");
	 	         			    BalanceOwedstr=BalanceOwedstr.replaceAll("[,]", "");
	 	         			        		      	
	 	         			    System.out.println("This is BalanceOwed ="+BalanceOwedstr);

	 	         			 	soft.assertEquals(BalanceOwedstr, BalanceOwedAmount);

//Balance c/f 
	 	         			   String Balancecarry=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(1).getText();
	 	         			   String Balancecarrystr=Balancecarry.replaceAll("[£]", "");
	 	         			   Balancecarrystr=Balancecarrystr.replaceAll("[,]", "");
	 	         			        		      	
	 	         			    System.out.println("This is Balance c/f="+Balancecarrystr);
	 	         			 	soft.assertEquals(Balancecarrystr, BalancecarryAmount);

//CIS sufferd 
	 	         				
	 	         				 String cisSufferd=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'CIS Suffered')]//following::td/div/div")).get(0).getText();
	 	         		      	
	 	         				 String cisSufferdStr=cisSufferd.replaceAll("[£]", "");
	 	         				 cisSufferdStr=cisSufferdStr.replaceAll("[,]", "");
	 	         			     System.out.println("cisvalue" +cisSufferdStr);
	 	         			     soft.assertEquals(cisSufferdStr, cisvalue);

	 	         			
	 	 	       				
				    }
	 
	 
	 public void verifyPayrollSummaryCFBF_Ammount(String summaryDate,String totalPayments, String TaxAmount ,String EmployeeNIAmount, String NetPayment, String EmployerNIAmount,String HMRC, String BalanceOwedAmount,String BalancecarryAmount) throws InterruptedException
	 	{
	 		
				String summaryDate1 = m_Driver.findElement(By.xpath("//*[contains(text(),'PAYROLL SUMMARY')]")).getText();
				 
				 System.out.println(summaryDate1);
				 
			    soft.assertEquals(summaryDate1, summaryDate);

			 
	// TotalPayments		 
			 
			 	String payements=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(0).getText();
			      	String AtotalPayments=payements.replaceAll("[£]", "");
			      	AtotalPayments=AtotalPayments.replaceAll("[,]", "");
		
			  		System.out.println("This is totalPayments="+AtotalPayments);
					soft.assertEquals(AtotalPayments, totalPayments);

	//Tax Finding
	 	        		      	
	 	        		      	String Tax=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(1).getText();
	 	        		      	//System.out.println(Tax);
	 	        		      	String TaxAmount1=Tax.replaceAll("[£]", "");
	 	        		      	TaxAmount1=TaxAmount1.replaceAll("[,]", "");
	 	        		      	
	 	        		  		System.out.println("This is Tax amount="+TaxAmount1);
	 	       				     soft.assertEquals(TaxAmount1, TaxAmount);

	 				  		

	//Employee NI Finding
	 	        		  		
	 	        		  		String EmployeeNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(4).getText();
	 	        		      	//System.out.println(EmployeeNI);
	 	        		  		String EmployeeNIAmount1=EmployeeNI.replaceAll("[£]", "");
	 	        		  		EmployeeNIAmount1=EmployeeNIAmount1.replaceAll("[,]", "");
	 	        		      	
	 	        		  		System.out.println("This is EmployeeNI amount="+EmployeeNIAmount1);
	 	        		  		
	 	 	       				soft.assertEquals(EmployeeNIAmount1, EmployeeNIAmount);

	 // NetPay	        		  		
	 	        		  		String netpay=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(5).getText();
	 	        		      	//System.out.println(EmployeeNI);
	 	        		  		String NetPayment1=netpay.replaceAll("[£]", "");
	 	        		  		NetPayment1=NetPayment1.replaceAll("[,]", "");
	 	        		      	
	 	        		  		System.out.println("This is NetPayment amount="+NetPayment1);
	 	 	       				soft.assertEquals(NetPayment1, NetPayment);

	 	        		  		
	 	        		  		
	//Employer NI Finding
	 	        		      	
	 	        		      	String EmployerNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(6).getText();
	 	        		      	//System.out.println(EmployerNI);
	 	        		      	String EmployerNIAmount1=EmployerNI.replaceAll("[£]", "");
	 	        		      	EmployerNIAmount1=EmployerNIAmount1.replaceAll("[,]", "");
	 	        		  		 
	  	        		  		System.out.println("This is EmployerNIAmount ="+EmployerNIAmount1);
	 	 	       				soft.assertEquals(EmployerNIAmount1, EmployerNIAmount);


	 	 	       				Reporter.log("verifyPayrollSummary");
				  		
	//Payment DUE to HMRC				  		 
	 	 	       			String PAYE_NI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'PAYE & NI')]//following::td/div/div")).get(0).getText();
	 	 	       		
	 	 	       		      String PAYE_NIstr=PAYE_NI.replaceAll("[£]", "");
	 	 	       				PAYE_NIstr=PAYE_NIstr.replaceAll("[,]", "");
	 	 	       		
	 	 	       		       System.out.println("PAYE_NIValue="+PAYE_NIstr); 	
	 	 	       		 
	 	         			soft.assertEquals(PAYE_NIstr, HMRC);
	        		  		
//Balance owed (b/f)
	 	         			        		  		
	 	         				String BalanceOwed=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(0).getText();
	 	         				String BalanceOwedstr=BalanceOwed.replaceAll("[£]", "");
	 	         			    BalanceOwedstr=BalanceOwedstr.replaceAll("[,]", "");
	 	         			        		      	
	 	         			    System.out.println("This is BalanceOwed ="+BalanceOwedstr);

	 	         			 	soft.assertEquals(BalanceOwedstr, BalanceOwedAmount);

//Balance c/f 
	 	         			   String Balancecarry=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(1).getText();
	 	         			   String Balancecarrystr=Balancecarry.replaceAll("[£]", "");
	 	         			   Balancecarrystr=Balancecarrystr.replaceAll("[,]", "");
	 	         			        		      	
	 	         			    System.out.println("This is Balance c/f="+Balancecarrystr);
	 	         			 	soft.assertEquals(Balancecarrystr, BalancecarryAmount);

	 	         			
	 	 	       				
				    }
	 
	 
	 public void taxPayement ( String employeeNI,String employerNi,String tax, String HMRC) throws Exception
		{		
			
			
			 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr[13]/td[contains(text(),'£')]"));
			   
			 
			    String actualemployeeNi = list.get(0).getText();
			    actualemployeeNi = actualemployeeNi.replaceAll("£", "");
				actualemployeeNi = actualemployeeNi.replaceAll(",", "");
				System.out.println("Employee NI ="+actualemployeeNi);
			    soft.assertEquals(actualemployeeNi, employeeNI);
			 
				String actualemployerNi = list.get(1).getText();
				actualemployerNi = actualemployerNi.replaceAll("£", "");
				actualemployerNi = actualemployerNi.replaceAll(",", "");
				System.out.println("Employer NI ="+actualemployerNi);

				soft.assertEquals(actualemployerNi, employerNi);
			 
				
				String actualTax = list.get(9).getText();
				actualTax = actualTax.replaceAll("£", "");
				actualTax = actualTax.replaceAll(",", "");
				System.out.println("Tax  ="+actualTax);

			      soft.assertEquals(actualTax, tax);
				
				String actualHmrc = list.get(13).getText();
				actualHmrc = actualHmrc.replaceAll("£", "");
				actualHmrc = actualHmrc.replaceAll(",", "");
				System.out.println("HMRC  ="+actualHmrc);

			    soft. assertEquals(actualHmrc, HMRC);
	
			
				Reporter.log("Verify TaxPayement");
		}

	 
		public void verifyCisSufferd(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,String data12)
		{
			
			try {
				 List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr/td[13]"));
				 ArrayList<String> ar= new ArrayList<String>();
					ar.add(data);
					ar.add(data1);
					ar.add(data2);
					ar.add(data3);
					ar.add(data4);
					ar.add(data5);
					ar.add(data6);
					ar.add(data7);
					ar.add(data8);
					ar.add(data9);
					ar.add(data10);
					ar.add(data11);
					ar.add(data12);

				
					boolean con=list.isEmpty();
				     soft.assertFalse(con);
					
				 for (int i =0;i<=list.size()-1;i++)
				 {
					 
					 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr/td[13]"));

					 WebElement elem = list1.get(i);
					 
					String actualData = elem.getText();
					actualData = actualData.replaceAll("[£]", "");
					actualData = actualData.replaceAll("[,]", "");

					System.out.println(actualData);
					 soft.assertEquals(actualData, ar.get(i));
					
				 }
				 
				
			} catch (Exception e) {
			    soft.assertFalse(true,"welcome to catch block");

				System.out.println("Issue IN verifyEmployementAllowance"+e);
			}
		}
		
		
		
		public void VerifyRecivedPayrollSummary(String Text) throws  Exception
		{
		
			m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl11_lbtnFileName']")).click();
			
			Thread.sleep(11000);


				File file = new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2023-10-31.pdf");

	            PDDocument document = PDDocument.load(file);
				PDFTextStripper pdfStripper = new PDFTextStripper();
			String	PDFtext = pdfStripper.getText(document);
				
				//System.out.println(PDFtext);
				document.close();
				
				System.out.println(PDFtext);
				
				soft.assertTrue(PDFtext.contains(Text));
				
				Reporter.log("Verify Recieved Email is Unprotected");
				
				 if(file.delete())
				System.out.println("file deleted");
	}

		

		public void VerifyRecivedEmailPayrollSummary(String path,String TotalNI,String TotalPension,String TotalTax, String NetPaid,String Hmrc,String TotalCoast) throws  Exception
		{
		
			m_Driver.findElement(By.xpath("//*[contains(text(),' Summary')]")).click();
			
			Thread.sleep(11000);


				File file = new File(path);

	            PDDocument document = PDDocument.load(file);
				PDFTextStripper pdfStripper = new PDFTextStripper();
			  String	PDFtext = pdfStripper.getText(document);
				
				//System.out.println(PDFtext);
				document.close();
				
				System.out.println(PDFtext);
				soft.assertTrue(PDFtext.contains(TotalNI),"TotalNI Not as expected");
				soft.assertTrue(PDFtext.contains(TotalPension),"TotalPension not as expected");
				soft.assertTrue(PDFtext.contains(TotalTax),"TotalTax not as expected");
				soft.assertTrue(PDFtext.contains(NetPaid),"NetPaid not as expected");
				soft.assertTrue(PDFtext.contains(Hmrc),"Hmrc not as expected");
				soft.assertTrue(PDFtext.contains(TotalCoast),"TotalCoast not as expected");

				Reporter.log("Verify Recieved Email is Unprotected");
				
				 if(file.delete())
				System.out.println("file deleted");
	}
		
		public void VerifyRecivedEmailPayrollSummaryWithCIS(String path,String TotalNI,String TotalPension,String TotalTax, String NetPaid,String Hmrc,String TotalCoast,String CISSufferd) throws  Exception
		{
		
			m_Driver.findElement(By.xpath("//*[contains(text(),' Summary')]")).click();
			
			Thread.sleep(11000);


				File file = new File(path);

	            PDDocument document = PDDocument.load(file);
				PDFTextStripper pdfStripper = new PDFTextStripper();
			  String	PDFtext = pdfStripper.getText(document);
				
				//System.out.println(PDFtext);
				document.close();
				
				System.out.println(PDFtext);
				soft.assertTrue(PDFtext.contains(TotalNI),"TotalNI Not as expected");
				soft.assertTrue(PDFtext.contains(TotalPension),"TotalPension not as expected");
				soft.assertTrue(PDFtext.contains(TotalTax),"TotalTax not as expected");
				soft.assertTrue(PDFtext.contains(NetPaid),"NetPaid not as expected");
				soft.assertTrue(PDFtext.contains(Hmrc),"Hmrc not as expected");
				soft.assertTrue(PDFtext.contains(TotalCoast),"TotalCoast not as expected");
				soft.assertTrue(PDFtext.contains(CISSufferd),"CISSufferd not as expected");

				Reporter.log("Verify Recieved Email is Unprotected");
				
				 if(file.delete())
				System.out.println("file deleted");
	}

		
		 
		 public void verifySummaryPension(String  summaryDate ,String totalPayments,String TaxAmount,String expectedStudentLoan, String EmployeeNIAmount, String employeePensionAmount,String NetPayment,String EmployerNIAmount,String EmployerPensionAmount, String BalanceOwedAmount,String BalancecarryAmount,String PAYE_NIValue,String expectedPensionPayOut,String TotalCoastamount) throws InterruptedException
	 	{
	 		
			 String summaryDate1 = m_Driver.findElement(By.xpath("//*[contains(text(),'PAYROLL SUMMARY')]")).getText();
			 
			 System.out.println(summaryDate1);

		    soft.assertEquals(summaryDate1, summaryDate);

		 
	//TotalPayments		 
		 
		 	String payements=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(0).getText();
		      	//System.out.println(Tax);
		      	String AtotalPayments=payements.replaceAll("[£]", "");
		      	AtotalPayments=AtotalPayments.replaceAll("[,]", "");
		  		System.out.println("This is AtotalPayments amount="+AtotalPayments);

		      	
				soft.assertEquals(AtotalPayments, totalPayments);

		 
		 
		 
			 
	//Tax Finding
		        		      	
		        		      	String Tax=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(1).getText();
		        		      	//System.out.println(Tax);
		        		      	String TaxAmount1=Tax.replaceAll("[£]", "");
		        		      	TaxAmount1=TaxAmount1.replaceAll("[,]", "");
		        		  		System.out.println("This is TaxAmount1 amount="+TaxAmount1);

		       				   soft.assertEquals(TaxAmount1, TaxAmount);

					  		
	//StudendLoan Finding
	        		      	
	        		      	String loan=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(2).getText();
	        		      	//System.out.println(Tax);
	        		      	String studentLoan=loan.replaceAll("[£]", "");
	        		      	studentLoan=studentLoan.replaceAll("[,]", "");
	        		  		System.out.println("This is studentLoan amount="+studentLoan);

	       				soft.assertEquals(studentLoan,expectedStudentLoan);

	//Employee NI Finding
		        		  		
		        		  		String EmployeeNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(4).getText();
		        		      	//System.out.println(EmployeeNI);
		        		  		String EmployeeNIstr=EmployeeNI.replaceAll("[£]", "");
		        		  		EmployeeNIstr=EmployeeNIstr.replaceAll("[,]", "");
		        		      	
		        		  		System.out.println("This is EmployeeNI amount="+EmployeeNIstr);
		 	       				soft.assertEquals(EmployeeNIstr, EmployeeNIAmount);
		 	       				
		 	       				
	 //EmployeePension 	        		  		
	 	        		  		String EmployeePension=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(5).getText();
	 	        		      	//System.out.println(EmployeeNI);
	 	        		  		String ePension=EmployeePension.replaceAll("[£]", "");
	 	        		  		ePension=ePension.replaceAll("[,]", "");
	 	        		      	
	 	        		  		System.out.println("This is employeePensionAmount ="+ePension);	
	 	        		  		
		 	       				soft.assertEquals(ePension, employeePensionAmount);


	// NetPay	        		  		
		        		  		String netpay=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(6).getText();
		        		      	//System.out.println(EmployeeNI);
		        		  		String netpayValue=netpay.replaceAll("[£]", "");
		        		  		netpayValue=netpayValue.replaceAll("[,]", "");
		        		      	
		        		  		System.out.println("This is NetPayment amount="+netpayValue);
		 	       				soft.assertEquals(netpayValue, NetPayment);

		        		  		
		        		  		
	//Employer NI Finding
		        		      	
		        		      	String EmployerNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(7).getText();
		        		      	//System.out.println(EmployerNI);
		        		      	String EmployerNIstr=EmployerNI.replaceAll("[£]", "");
		        		      	EmployerNIstr=EmployerNIstr.replaceAll("[,]", "");
		        		  		 
		        		  		System.out.println("This is EmployerNIAmount ="+EmployerNIstr);
		 	       				soft.assertEquals(EmployerNIstr, EmployerNIAmount);
		 	       				
		 	       				
	//Employer Pension 	        		  		 
	 	        		  	 	String EmployerPension=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(8).getText();
	 	        		      	//System.out.println(EmployerNI);
	 	        		      	String erPension=EmployerPension.replaceAll("[£]", "");
	 	        		      	erPension=erPension.replaceAll("[,]", "");
	 	        		      	
		        		  		System.out.println("This is erPension ="+erPension);

		 	       				soft.assertEquals(erPension, EmployerPensionAmount);


		        		  		
	//Balance owed (b/f)
		        		  		
		        		  		String BalanceOwed=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(0).getText();
		        		      	//System.out.println(EmployerNI);
		        		      	String BalanceOwedstr=BalanceOwed.replaceAll("[£]", "");
		        		      	BalanceOwedstr=BalanceOwedstr.replaceAll("[,]", "");
		        		      	
		        		  		System.out.println("This is Balance owed="+BalanceOwedstr);
		 	       				soft.assertEquals(BalanceOwedstr, BalanceOwedAmount);


		        		  		
	//Balance c/f 
		        		  		
		        		  		String Balancecarry=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(1).getText();
		        		      	//System.out.println(EmployerNI);
		        		      	String Balancecarrystr=Balancecarry.replaceAll("[£]", "");
		        		      	Balancecarrystr=Balancecarrystr.replaceAll("[,]", "");
		        		      	
		        		  		System.out.println("This is Balance c/f="+Balancecarrystr);
		 	       				soft.assertEquals(Balancecarrystr, BalancecarryAmount);

		        		  		
		        		  		
	//Payment DUE to HMRC				  		 
	 				  		String PAYE_NI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'PAYE & NI')]//following::td/div/div")).get(0).getText();
	 			      	
							String PAYE_NIstr = PAYE_NI.replaceAll("[£]", "");
							PAYE_NIstr = PAYE_NIstr.replaceAll("[,]", "");

							System.out.println("PAYE_NIValue=" + PAYE_NIstr);
							soft.assertEquals(PAYE_NIstr, PAYE_NIValue);
	 		
	//PensionPayOut
				  		  	String PayOut=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'PENSION PAYOUT')]//following::td/div/div")).get(0).getText();

							String pensionPayOut = PayOut.replaceAll("[£]", "");
							pensionPayOut = pensionPayOut.replaceAll("[,]", "");

							System.out.println("pensionPayOut="+pensionPayOut);
							soft.assertEquals(pensionPayOut, expectedPensionPayOut);

						  								
	 			  		 
	
	  		  		
	//Total Coast for Period     
	  		  		
	  		  	String TotalCoast=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'TOTAL COST ')]//following::td/div/div")).get(0).getText();

				String totalCoastPeriod = TotalCoast.replaceAll("[£]", "");
				totalCoastPeriod = totalCoastPeriod.replaceAll("[,]", "");

				System.out.println("TotalCoastamount="+totalCoastPeriod);
				soft.assertEquals(totalCoastPeriod, TotalCoastamount);

			  		

	
				
				Reporter.log("verifyApproverdPayrollSummary");
			  		
			    }	
		 
		 
		 
		 
		 public void verifySummaryPension42Employee(String totalPayments,String TaxAmount,String expectedStudentLoan, String EmployeeNIAmount, String employeePensionAmount,String NetPayment,String EmployerNIAmount,String EmployerPensionAmount, String BalanceOwedAmount,String BalancecarryAmount,String PAYE_NIValue,String expectedPensionPayOut,String TotalCoastamount) throws InterruptedException
		 	{
		 		
				    m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rvReport_ctl10_ctl00_Next_ctl00_ctl00']")).click();
				
			  Thread.sleep(3000);
		//TotalPayments		 
			 
			 	String payements=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(0).getText();
			      	//System.out.println(Tax);
			      	String AtotalPayments=payements.replaceAll("[£]", "");
			      	AtotalPayments=AtotalPayments.replaceAll("[,]", "");
			  		System.out.println("This is AtotalPayments amount="+AtotalPayments);

			      	
					soft.assertEquals(AtotalPayments, totalPayments);

			 
			 
			 
				 
		//Tax Finding
			        		      	
			        		      	String Tax=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(1).getText();
			        		      	//System.out.println(Tax);
			        		      	String TaxAmount1=Tax.replaceAll("[£]", "");
			        		      	TaxAmount1=TaxAmount1.replaceAll("[,]", "");
			        		  		System.out.println("This is TaxAmount1 amount="+TaxAmount1);

			       				   soft.assertEquals(TaxAmount1, TaxAmount);

						  		
		//StudendLoan Finding
		        		      	
		        		      	String loan=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(2).getText();
		        		      	//System.out.println(Tax);
		        		      	String studentLoan=loan.replaceAll("[£]", "");
		        		      	studentLoan=studentLoan.replaceAll("[,]", "");
		        		  		System.out.println("This is studentLoan amount="+studentLoan);

		       				soft.assertEquals(studentLoan,expectedStudentLoan);

		//Employee NI Finding
			        		  		
			        		  		String EmployeeNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(4).getText();
			        		      	//System.out.println(EmployeeNI);
			        		  		String EmployeeNIstr=EmployeeNI.replaceAll("[£]", "");
			        		  		EmployeeNIstr=EmployeeNIstr.replaceAll("[,]", "");
			        		      	
			        		  		System.out.println("This is EmployeeNI amount="+EmployeeNIstr);
			 	       				soft.assertEquals(EmployeeNIstr, EmployeeNIAmount);
			 	       				
			 	       				
		 //EmployeePension 	        		  		
		 	        		  		String EmployeePension=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(5).getText();
		 	        		      	//System.out.println(EmployeeNI);
		 	        		  		String ePension=EmployeePension.replaceAll("[£]", "");
		 	        		  		ePension=ePension.replaceAll("[,]", "");
		 	        		      	
		 	        		  		System.out.println("This is employeePensionAmount ="+ePension);	
		 	        		  		
			 	       				soft.assertEquals(ePension, employeePensionAmount);


		// NetPay	        		  		
			        		  		String netpay=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(6).getText();
			        		      	//System.out.println(EmployeeNI);
			        		  		String netpayValue=netpay.replaceAll("[£]", "");
			        		  		netpayValue=netpayValue.replaceAll("[,]", "");
			        		      	
			        		  		System.out.println("This is NetPayment amount="+netpayValue);
			 	       				soft.assertEquals(netpayValue, NetPayment);

			        		  		
			        		  		
		//Employer NI Finding
			        		      	
			        		      	String EmployerNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(7).getText();
			        		      	//System.out.println(EmployerNI);
			        		      	String EmployerNIstr=EmployerNI.replaceAll("[£]", "");
			        		      	EmployerNIstr=EmployerNIstr.replaceAll("[,]", "");
			        		  		 
			        		  		System.out.println("This is EmployerNIAmount ="+EmployerNIstr);
			 	       				soft.assertEquals(EmployerNIstr, EmployerNIAmount);
			 	       				
			 	       				
		//Employer Pension 	        		  		 
		 	        		  	 	String EmployerPension=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(8).getText();
		 	        		      	//System.out.println(EmployerNI);
		 	        		      	String erPension=EmployerPension.replaceAll("[£]", "");
		 	        		      	erPension=erPension.replaceAll("[,]", "");
		 	        		      	
			        		  		System.out.println("This is erPension ="+erPension);

			 	       				soft.assertEquals(erPension, EmployerPensionAmount);


			        		  		
		//Balance owed (b/f)
			        		  		
			        		  		String BalanceOwed=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(0).getText();
			        		      	//System.out.println(EmployerNI);
			        		      	String BalanceOwedstr=BalanceOwed.replaceAll("[£]", "");
			        		      	BalanceOwedstr=BalanceOwedstr.replaceAll("[,]", "");
			        		      	
			        		  		System.out.println("This is Balance owed="+BalanceOwedstr);
			 	       				soft.assertEquals(BalanceOwedstr, BalanceOwedAmount);


			        		  		
		//Balance c/f 
			        		  		
			        		  		String Balancecarry=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(1).getText();
			        		      	//System.out.println(EmployerNI);
			        		      	String Balancecarrystr=Balancecarry.replaceAll("[£]", "");
			        		      	Balancecarrystr=Balancecarrystr.replaceAll("[,]", "");
			        		      	
			        		  		System.out.println("This is Balance c/f="+Balancecarrystr);
			 	       				soft.assertEquals(Balancecarrystr, BalancecarryAmount);

			        		  		
			        		  		
		//Payment DUE to HMRC				  		 
		 				  		String PAYE_NI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'PAYE & NI')]//following::td/div/div")).get(0).getText();
		 			      	
								String PAYE_NIstr = PAYE_NI.replaceAll("[£]", "");
								PAYE_NIstr = PAYE_NIstr.replaceAll("[,]", "");

								System.out.println("PAYE_NIValue=" + PAYE_NIstr);
								soft.assertEquals(PAYE_NIstr, PAYE_NIValue);
		 		
		//PensionPayOut
					  		  	String PayOut=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'PENSION PAYOUT')]//following::td/div/div")).get(0).getText();

								String pensionPayOut = PayOut.replaceAll("[£]", "");
								pensionPayOut = pensionPayOut.replaceAll("[,]", "");

								System.out.println("pensionPayOut="+pensionPayOut);
								soft.assertEquals(pensionPayOut, expectedPensionPayOut);

							  								
		 			  		 
		
		  		  		
		//Total Coast for Period     
		  		  		
		  		  	String TotalCoast=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'TOTAL COST ')]//following::td/div/div")).get(0).getText();

					String totalCoastPeriod = TotalCoast.replaceAll("[£]", "");
					totalCoastPeriod = totalCoastPeriod.replaceAll("[,]", "");

					System.out.println("TotalCoastamount="+totalCoastPeriod);
					soft.assertEquals(totalCoastPeriod, TotalCoastamount);

				  		

		
					
					Reporter.log("verifyApproverdPayrollSummary");
				  		
				    }	

		 
		 
		 
		 public void verifySummaryPensionWithCIS(String  summaryDate ,String totalPayments,String TaxAmount,String expectedStudentLoan, String EmployeeNIAmount, String employeePensionAmount,String NetPayment,String EmployerNIAmount,String EmployerPensionAmount, String BalanceOwedAmount,String BalancecarryAmount,String PAYE_NIValue,String expectedPensionPayOut,String TotalCoastamount, String cisvalue) throws InterruptedException
	 	{
	 		
			 String summaryDate1 = m_Driver.findElement(By.xpath("//*[contains(text(),'PAYROLL SUMMARY')]")).getText();
			 
			 System.out.println(summaryDate1);

		    soft.assertEquals(summaryDate1, summaryDate);

		 
	//TotalPayments		 
		 
		 	String payements=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(0).getText();
		      	//System.out.println(Tax);
		      	String AtotalPayments=payements.replaceAll("[£]", "");
		      	AtotalPayments=AtotalPayments.replaceAll("[,]", "");
		  		System.out.println("This is AtotalPayments amount="+AtotalPayments);

		      	
				soft.assertEquals(AtotalPayments, totalPayments);

		 
		 
		 
			 
	//Tax Finding
		        		      	
		        		      	String Tax=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(1).getText();
		        		      	//System.out.println(Tax);
		        		      	String TaxAmount1=Tax.replaceAll("[£]", "");
		        		      	TaxAmount1=TaxAmount1.replaceAll("[,]", "");
		        		  		System.out.println("This is TaxAmount1 amount="+TaxAmount1);

		       				   soft.assertEquals(TaxAmount1, TaxAmount);

					  		
	//StudendLoan Finding
	        		      	
	        		      	String loan=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(2).getText();
	        		      	//System.out.println(Tax);
	        		      	String studentLoan=loan.replaceAll("[£]", "");
	        		      	studentLoan=studentLoan.replaceAll("[,]", "");
	        		  		System.out.println("This is studentLoan amount="+studentLoan);

	       				soft.assertEquals(studentLoan,expectedStudentLoan);

	//Employee NI Finding
		        		  		
		        		  		String EmployeeNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(4).getText();
		        		      	//System.out.println(EmployeeNI);
		        		  		String EmployeeNIstr=EmployeeNI.replaceAll("[£]", "");
		        		  		EmployeeNIstr=EmployeeNIstr.replaceAll("[,]", "");
		        		      	
		        		  		System.out.println("This is EmployeeNI amount="+EmployeeNIstr);
		 	       				soft.assertEquals(EmployeeNIstr, EmployeeNIAmount);
		 	       				
		 	       				
	 //EmployeePension 	        		  		
	 	        		  		String EmployeePension=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(5).getText();
	 	        		      	//System.out.println(EmployeeNI);
	 	        		  		String ePension=EmployeePension.replaceAll("[£]", "");
	 	        		  		ePension=ePension.replaceAll("[,]", "");
	 	        		      	
	 	        		  		System.out.println("This is employeePensionAmount ="+ePension);	
	 	        		  		
		 	       				soft.assertEquals(ePension, employeePensionAmount);


	// NetPay	        		  		
		        		  		String netpay=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(6).getText();
		        		      	//System.out.println(EmployeeNI);
		        		  		String netpayValue=netpay.replaceAll("[£]", "");
		        		  		netpayValue=netpayValue.replaceAll("[,]", "");
		        		      	
		        		  		System.out.println("This is NetPayment amount="+netpayValue);
		 	       				soft.assertEquals(netpayValue, NetPayment);

		        		  		
		        		  		
	//Employer NI Finding
		        		      	
		        		      	String EmployerNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(7).getText();
		        		      	//System.out.println(EmployerNI);
		        		      	String EmployerNIstr=EmployerNI.replaceAll("[£]", "");
		        		      	EmployerNIstr=EmployerNIstr.replaceAll("[,]", "");
		        		  		 
		        		  		System.out.println("This is EmployerNIAmount ="+EmployerNIstr);
		 	       				soft.assertEquals(EmployerNIstr, EmployerNIAmount);
		 	       				
		 	       				
	//Employer Pension 	        		  		 
	 	        		  	 	String EmployerPension=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(8).getText();
	 	        		      	//System.out.println(EmployerNI);
	 	        		      	String erPension=EmployerPension.replaceAll("[£]", "");
	 	        		      	erPension=erPension.replaceAll("[,]", "");
	 	        		      	
		        		  		System.out.println("This is erPension ="+erPension);

		 	       				soft.assertEquals(erPension, EmployerPensionAmount);


		        		  		
	//Balance owed (b/f)
		        		  		
		        		  		String BalanceOwed=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(0).getText();
		        		      	//System.out.println(EmployerNI);
		        		      	String BalanceOwedstr=BalanceOwed.replaceAll("[£]", "");
		        		      	BalanceOwedstr=BalanceOwedstr.replaceAll("[,]", "");
		        		      	
		        		  		System.out.println("This is Balance owed="+BalanceOwedstr);
		 	       				soft.assertEquals(BalanceOwedstr, BalanceOwedAmount);


		        		  		
	//Balance c/f 
		        		  		
		        		  		String Balancecarry=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(1).getText();
		        		      	//System.out.println(EmployerNI);
		        		      	String Balancecarrystr=Balancecarry.replaceAll("[£]", "");
		        		      	Balancecarrystr=Balancecarrystr.replaceAll("[,]", "");
		        		      	
		        		  		System.out.println("This is Balance c/f="+Balancecarrystr);
		 	       				soft.assertEquals(Balancecarrystr, BalancecarryAmount);

		        		  		
		        		  		
	//Payment DUE to HMRC				  		 
	 				  		String PAYE_NI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'PAYE & NI')]//following::td/div/div")).get(0).getText();
	 			      	
							String PAYE_NIstr = PAYE_NI.replaceAll("[£]", "");
							PAYE_NIstr = PAYE_NIstr.replaceAll("[,]", "");

							System.out.println("PAYE_NIValue=" + PAYE_NIstr);
							soft.assertEquals(PAYE_NIstr, PAYE_NIValue);
	 		
	//PensionPayOut
				  		  	String PayOut=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'PENSION PAYOUT')]//following::td/div/div")).get(0).getText();

							String pensionPayOut = PayOut.replaceAll("[£]", "");
							pensionPayOut = pensionPayOut.replaceAll("[,]", "");

							System.out.println("pensionPayOut="+pensionPayOut);
							soft.assertEquals(pensionPayOut, expectedPensionPayOut);

						  								
	 			  		 
	
	  		  		
	//Total Coast for Period     
	  		  		
	  		  	String TotalCoast=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'TOTAL COST ')]//following::td/div/div")).get(0).getText();

				String totalCoastPeriod = TotalCoast.replaceAll("[£]", "");
				totalCoastPeriod = totalCoastPeriod.replaceAll("[,]", "");

				System.out.println("TotalCoastamount="+totalCoastPeriod);
				soft.assertEquals(totalCoastPeriod, TotalCoastamount);


	//CIS suffered 
					 	         				
				 String cisSufferd=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'CIS Suffered')]//following::td/div/div")).get(0).getText();
					 	         		      	
				String cisSufferdStr=cisSufferd.replaceAll("[£]", "");
				cisSufferdStr=cisSufferdStr.replaceAll("[,]", "");
				System.out.println("cisvalue" +cisSufferdStr);
				 soft.assertEquals(cisSufferdStr, cisvalue);	
			  	
				
				Reporter.log("verifySummaryPensionWithCIS");
			  		
			    }	
		 
	
	public void assertAll()
	   {
		   soft.assertAll();
		   
	   }
}


