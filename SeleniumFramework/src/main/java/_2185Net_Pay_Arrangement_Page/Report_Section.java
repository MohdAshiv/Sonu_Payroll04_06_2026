package _2185Net_Pay_Arrangement_Page;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.EmptyFileException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import pages.BasePage;
import utilities.ChangeWindow;
import utilities.WaitUtility;

public class Report_Section  extends BasePage{
	WaitUtility wt=new WaitUtility();
	
	static String PDFtext;
	
	
	int PAYE_NI=0;
	
	
	public Report_Section(WebDriver driver) {
		super(driver);
		
	}

	private By filinmanagement= By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefFilingMangment']/span");
	private By reportSection =By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefReports']/span");
	
	private By paySlip =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_hrefReportCompanyPayHistory']");
	
	private By downloadPayslip=By.xpath("//*[@id='myTable1']/tbody/tr[2]/td[22]/a");
	
	private By payrollSummary= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_hrefPayrollSummary']");
	
	private By p11Report= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_hrefReportP11']");
	
	private By p60Report=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_hrefReportP60']");
	
	private By reportingSummary=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_hrefReportPeriodTotal']");
	
	
	public void Click_ReportSection()
	{
		
		WebElement elem = getWebElement(reportSection);
		wt.explicitWait_visibilityOf(m_Driver, 500, elem);
		elem.click();
		Reporter.log("click on Report Section");
	}
	
	public void Click_Payslip()
	{
		WebElement elem = getWebElement(paySlip);
		wt.explicitWait_visibilityOf(m_Driver, 500, elem);
		elem.click();
		Reporter.log("click on Payslip Section");
	}
	
	public void openPayslip() throws InterruptedException, AWTException
	{
		
		m_Driver.findElement(By.xpath("//a[@data-original-title='Payslip download']")).click();
	
		ChangeWindow.tabswitch(m_Driver);
		
		Thread.sleep(9000);
		Robot robot = new Robot();
		// press Ctrl+S the Robot's way
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_S);
		Thread.sleep(3000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_S);
		// press Enter
		Thread.sleep(3000);

		robot.keyPress(KeyEvent.VK_ENTER);
		
		robot.keyRelease(KeyEvent.VK_ENTER);
				
		Thread.sleep(3000);
		
	}
	
	public void getPayslip(String actualGrossPay) throws InterruptedException, IOException
	{
		//Thread.sleep(3000);
		
		File file = new File("C:\\Users\\Sonu\\Downloads\\Employee-Payslip-Mr. Testing Data-30_06_2021.pdf");
		PDDocument document = PDDocument.load(file);
		PDFTextStripper pdfStripper = new PDFTextStripper();
		//Retrieving text from PDF document
		 PDFtext = pdfStripper.getText(document);
		 utilities.TakeScreenshot.Getscreenshot("TC026 _VeryfyPDF ", "2185", m_Driver);
	    //Closing the document
		document.close();
		
		String[] splitedString= PDFtext.split(" ");
		
				// System.out.println(splitedString.length);
				 for(int i=0; i<splitedString.length;i++)
				 {
				 System.out.println(i+"+="+splitedString[i]);
		
				 }
				// splitedString[42]= splitedString[42].replaceAll("£", "");
				// splitedString[42]= splitedString[42].replaceAll(",", "");
			    String expectedTaxableGrossPay1 = splitedString[43].substring(3,14).replaceAll("£", "");
			    String xyz = expectedTaxableGrossPay1.replaceAll(",", "");
			    String expectedTaxableGrossPay=xyz.trim();
			     System.out.println(expectedTaxableGrossPay+ "=TaxableGrossPay ");
			     assertEquals(actualGrossPay, expectedTaxableGrossPay);
			    if(file.delete())
			    System.out.println("file deleted");
			    
			    ChangeWindow.tabswitch(m_Driver);
				
			    Reporter.log("Verify TaxableGrossPay");
			   
		
	}


	public void getPayslip2(String actualTaxableGrossPay) throws InterruptedException, IOException
	{
		//Thread.sleep(3000);
		
		File file = new File("C:\\Users\\Sonu\\Downloads\\Employee-Payslip-Mr. Employee A-30_06_2021.pdf");
		PDDocument document = PDDocument.load(file);
		PDFTextStripper pdfStripper = new PDFTextStripper();
		PDFtext = pdfStripper.getText(document);
		utilities.TakeScreenshot.Getscreenshot("TC027 _VeryfyPDF ", "2185", m_Driver);
		document.close();
		
		String[] splitedString= PDFtext.split(" ");
		
				// System.out.println(splitedString.length);
				 for(int i=0; i<splitedString.length;i++)
				 {
					
					 System.out.println(i+"+="+splitedString[i]);
				 }
				
			    String expectedTaxableGrossPay1 = splitedString[43].substring(3,14).replaceAll("£", "");
			    String xyz = expectedTaxableGrossPay1.replaceAll(",", "");
			    String expectedTaxableGrossPay=xyz.trim();	
			    System.out.println(expectedTaxableGrossPay+ "=TaxableGrossPay ");
			    assertEquals(actualTaxableGrossPay, expectedTaxableGrossPay);
			  
			    if(file.delete())
			    System.out.println("file deleted");
			    ChangeWindow.tabswitch(m_Driver);
				
		  Reporter.log("Verify TaxableGrossPay");
		
	}
	
	public void Click_PayrollSummary()
	{
		WebElement elem = getWebElement(payrollSummary);
		wt.explicitWait_visibilityOf(m_Driver, 500, elem);
		elem.click();
		Reporter.log("click on PayrollSummary");
	}
		
	
	
	  public void verifyPayrollSummaryA() throws Exception
	    {
		   double TaxAmount=0;
			double EmployeeNIAmount=0;
			double EmployerNIAmount=0;
			double EmployeePensionAmount=0;
			double EmployerPensionAmount=0;
			double TotalAmount=0;
			double BalanceOwedAmount=0;
			double NetPayAmount=0;
			double GrossAmountt=0;
		  
		  
		  System.out.println("Employee A Details");
		
    //Gross Finding
		  
		    String Gross=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Amit kumar')]//following::td/div/div")).get(0).getText();
	      	//System.out.println(Tax);
	      	String Grossstr=Gross.replaceAll("[^0-9]", "");
	      	
	  		double num = Double.parseDouble(Grossstr);
	  		num=num/100;
	  		
	  		GrossAmountt=GrossAmountt+num;
	  		System.out.println("This is Gross amount"+GrossAmountt);
	  		assertEquals(GrossAmountt, 2500.00);
		  
		  
	//Tax Finding
	      	
	      	String Tax=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Amit kumar')]//following::td/div/div")).get(1).getText();
	      	//System.out.println(Tax);
	      	String str=Tax.replaceAll("[^0-9]", "");
	      	
	  		double number = Double.parseDouble(str);
	  		number=number/100;
	  		
	  		TaxAmount=TaxAmount+number;
	  		System.out.println("This is Tax amount"+TaxAmount);
	  		assertEquals(TaxAmount, 0.0);
	      	
	  		
	//Employee NI Finding
	  		
	  		String EmployeeNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Amit kumar')]//following::td/div/div")).get(4).getText();
	      	//System.out.println(EmployeeNI);
	  		String EmployeeNIstr=EmployeeNI.replaceAll("[^0-9]", "");
	      	
	  		double number1 = Double.parseDouble(EmployeeNIstr);
	  		number1=number1/100;
	  		
	  		EmployeeNIAmount=EmployeeNIAmount+number1;
	  		System.out.println("This is EmployeeNI amount"+EmployeeNIAmount);
	  		assertEquals(EmployeeNIAmount, 204.36);
	      	
	      	
	//Employer NI Finding
	      	
	      	String EmployerNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Amit kumar')]//following::td/div/div")).get(7).getText();
	      	//System.out.println(EmployerNI);
	      	String EmployerNIstr=EmployerNI.replaceAll("[^0-9]", "");
	      	
	  		double number2 = Double.parseDouble(EmployerNIstr);
	  		number2=number2/100;
	  		
	  		EmployerNIAmount=EmployerNIAmount+number2;
	  		System.out.println("This is EmployerNI amount"+EmployerNIAmount);
	  		
	  		
	 //Employee Pension
	  		
	  		
	  		String EmployeePension=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Amit kumar')]//following::td/div/div")).get(5).getText();
	      	//System.out.println(EmployerNI);
	      	String EmployeePensionstr=EmployeePension.replaceAll("[^0-9]", "");
	      	
	  		double number3 = Double.parseDouble(EmployeePensionstr);
	  		number3=number3/100;
	  		
	  		EmployeePensionAmount=EmployeePensionAmount+number3;
	  		System.out.println("This is EmployeePension amaount amount"+EmployeePensionAmount);
	  		
 //Employer Pension
	  		
	  		
	  		String EmployerPension=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Amit kumar')]//following::td/div/div")).get(8).getText();
	      	String EmployerPensionstr=EmployerPension.replaceAll("[^0-9]", "");
	      	
	  		double number4 = Double.parseDouble(EmployerPensionstr);
	  		number4=number4/100;
	  		
	  		EmployerPensionAmount=EmployerPensionAmount+number4;
	  		System.out.println("This is EmployerPension amaount amount"+EmployerPensionAmount);
	  		
  // Net Pay Finding
	  		
	  		String NetPay=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Amit kumar')]//following::td/div/div")).get(6).getText();
	      	String NetPaystr=NetPay.replaceAll("[^0-9]", "");
	      	
	  		double number5 = Double.parseDouble(NetPaystr);
	  		number5=number5/100;
	  		
	  		NetPayAmount=NetPayAmount+number5;
	  		System.out.println("This is NetPAY amaount amount"+NetPayAmount);
	  		
	  		Reporter.log("Verify Employee A expected result");
	  		

	}
		
	  	public void verifySummaryB()
	  	{
	  		
	  		double TaxAmount=0;
	  		double EmployeeNIAmount=0;
	  		double EmployerNIAmount=0;
	  		double EmployeePensionAmount=0;
	  		double EmployerPensionAmount=0;
	  		double TotalAmount=0;
	  		double BalanceOwedAmount=0;
	  		double NetPayAmount=0;
	  		double GrossAmountt=0;
	  	  System.out.println("Employee B Details");
	  	//Gross Finding
		  
		    String Gross=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Raja kumar')]//following::td/div/div")).get(0).getText();
	      	//System.out.println(Tax);
	      	String Grossstr=Gross.replaceAll("[£]", "");
	      	String GrossAmount = Grossstr.replaceAll(",", "");
	  		System.out.println("This is Gross amount"+GrossAmount);
	  		assertEquals(GrossAmount, "2000.00");
	  		
	  		
		  
	  	//Tax Finding
	  	      	
	  	      	String Tax=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Raja kumar')]//following::td/div/div")).get(1).getText();
	  	      	//System.out.println(Tax);
	  	      	String str=Tax.replaceAll("[^0-9]", "");
	  	      	
	  	  		double number = Double.parseDouble(str);
	  	  		number=number/100;
	  	  		
	  	  		TaxAmount=TaxAmount+number;
	  	  		System.out.println("This is Tax amount"+TaxAmount);
	  	  	
	  	      	
	  	  		
	  	//Employee NI Finding
	  	  		
	  	  		String EmployeeNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Raja kumar')]//following::td/div/div")).get(4).getText();
	  	      	//System.out.println(EmployeeNI);
	  	  		String EmployeeNIstr=EmployeeNI.replaceAll("[^0-9]", "");
	  	      	
	  	  		double number1 = Double.parseDouble(EmployeeNIstr);
	  	  		number1=number1/100;
	  	  		
	  	  		EmployeeNIAmount=EmployeeNIAmount+number1;
	  	  		System.out.println("This is EmployeeNI amount"+EmployeeNIAmount);
	  	  		
	  	      	
	  	      	
	  	//Employer NI Finding
	  	      	
	  	      	String EmployerNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Raja kumar')]//following::td/div/div")).get(7).getText();
	  	      	//System.out.println(EmployerNI);
	  	      	String EmployerNIstr=EmployerNI.replaceAll("[^0-9]", "");
	  	      	
	  	  		double number2 = Double.parseDouble(EmployerNIstr);
	  	  		number2=number2/100;
	  	  		
	  	  		EmployerNIAmount=EmployerNIAmount+number2;
	  	  		System.out.println("This is EmployerNI amount"+EmployerNIAmount);
	  	  		
	  	  		
	  	 //Employee Pension
	  	  		
	  	  		
	  	  		String EmployeePension=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Raja kumar')]//following::td/div/div")).get(5).getText();
	  	      	//System.out.println(EmployerNI);
	  	      	String EmployeePensionstr=EmployeePension.replaceAll("[^0-9]", "");
	  	      	
	  	  		double number3 = Double.parseDouble(EmployeePensionstr);
	  	  		number3=number3/100;
	  	  		
	  	  		EmployeePensionAmount=EmployeePensionAmount+number3;
	  	  		System.out.println("This is EmployeePension amaount amount"+EmployeePensionAmount);
	  	  		
	   //Employer Pension
	  	  		
	  	  		
	  	  		String EmployerPension=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Raja kumar')]//following::td/div/div")).get(8).getText();
	  	      	String EmployerPensionstr=EmployerPension.replaceAll("[^0-9]", "");
	  	      	
	  	  		double number4 = Double.parseDouble(EmployerPensionstr);
	  	  		number4=number4/100;
	  	  		
	  	  		EmployerPensionAmount=EmployerPensionAmount+number4;
	  	  		System.out.println("This is EmployerPension amaount amount"+EmployerPensionAmount);
	  	  		
	    // Net Pay Finding
	  	  		
	  	  		String NetPay=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Raja kumar')]//following::td/div/div")).get(6).getText();
	  	      	String NetPaystr=NetPay.replaceAll("[^0-9]", "");
	  	      	
	  	  		double number5 = Double.parseDouble(NetPaystr);
	  	  		number5=number5/100;
	  	  		
	  	  		NetPayAmount=NetPayAmount+number5;
	  	  		System.out.println("This is NetPAY amaount amount"+NetPayAmount);
	  	  		
	  	     	Reporter.log("Verify Employee A expected result");
	  		
	  	}
	  	
		public void Click_P11Report()
		{
			WebElement elem = getWebElement(p11Report);
			wt.explicitWait_visibilityOf(m_Driver, 500, elem);
			elem.click();
			Reporter.log("click on P11 Report");
		}
		
		public void Click_ReportingSummary()
		{
			WebElement elem = getWebElement(reportingSummary);
			wt.explicitWait_visibilityOf(m_Driver, 500, elem);
			elem.click();
			Reporter.log("click on ReportingSummar");
		}
		
		public void Click_P60Report()
		{
			WebElement elem = getWebElement(p60Report);
			wt.explicitWait_visibilityOf(m_Driver, 500, elem);
			elem.click();
			Reporter.log("click on P60 Report");
		}
		
		public void Click_FilingM()
		{
			WebElement elem = getWebElement(filinmanagement);
			wt.explicitWait_visibilityOf(m_Driver, 500, elem);
			elem.click();
			Reporter.log("click on Filing Management");
		}
		
		public void Select_TaxYear(String value) throws InterruptedException
		{  
			  WebElement elem = m_Driver.findElement(By.xpath("//SELECT[@id='ctl00_ctl00_ParentContent_ddlTaxYears']"));
			
			  Select sel= new Select(elem);
			  sel.selectByVisibleText(value);
			  Thread.sleep(2000);
			  Reporter.log("Select Taxyear = "+value);
			  
		}
		
		public void Select_Taxyear(String value) throws InterruptedException
		{  
			  WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear']"));
			
			  Select sel= new Select(elem);
			  sel.selectByVisibleText(value);
			  
			  Reporter.log("Select Taxyear = "+value);
			  
		}
	
		
		public void VerifyTotalStatuary(double Amount)
		{
			double valueexcel=Amount;
			
			List<WebElement>list=m_Driver.findElements(By.xpath("(//table[@class='tblborder'])[3]/tbody/tr/td[3]"));
			
			for(int i=0;i<=list.size()-1;i++)
			{
				List<WebElement>list1=m_Driver.findElements(By.xpath("(//table[@class='tblborder'])[3]/tbody/tr/td[3]"));
				
				String value=list1.get(i).getText().replaceAll("£", "");
				String value2=value.replaceAll(",", "");
				double valueA=Double.parseDouble(value2);
				assertEquals(valueexcel, valueA);
			//	System.out.println(valueexcel+"="+valueA);
				
				
			}	
			 Reporter.log("Verify Statuary");
}
		
		
		public void VerifyTotalPaytoDate(double Amount)
		{
			double valueexcel=Amount;
			List<WebElement>list=m_Driver.findElements(By.xpath("(//table[@class='tblborder'])[3]/tbody/tr/td[4]"));
			
			for(int i=0;i<=list.size()-1;i++)
			{
				List<WebElement>list1=m_Driver.findElements(By.xpath("(//table[@class='tblborder'])[3]/tbody/tr/td[4]"));
				
				String value=list1.get(i).getText().replaceAll("£", "");
				//String value2[]=value.split()
				String value2=value.replaceAll(",", "");
				double valueA=Double.parseDouble(value2);
				assertEquals(valueexcel, valueA);
				//System.out.println(valueexcel+"="+valueA);
				valueexcel=valueexcel+Amount;
			}
			 Reporter.log("Verify Pay to date");
			}
				
			public void VerifyTotalFreepay(double Amount)
			{
				double valueexcel=Amount;
				List<WebElement>list=m_Driver.findElements(By.xpath("(//table[@class='tblborder'])[3]/tbody/tr/td[5]"));
				
				for(int i=0;i<=list.size()-1;i++)
				{
					List<WebElement>list1=m_Driver.findElements(By.xpath("(//table[@class='tblborder'])[3]/tbody/tr/td[5]"));
					
					String value=list1.get(i).getText().replaceAll("£", "");
					String value2=value.replaceAll(",", "");
					double valueA=Double.parseDouble(value2);
					assertEquals(valueexcel, valueA);
					//System.out.println(valueexcel+"="+valueA);
					valueexcel=valueexcel+Amount;
					
				}
				 Reporter.log("Verify Total Free pay");
				
			}
				public void VerifyTotalTaxablePay(double Amount)
				{
					double valueexcel=Amount;
					List<WebElement>list=m_Driver.findElements(By.xpath("(//table[@class='tblborder'])[3]/tbody/tr/td[6]"));
					
					for(int i=0;i<=list.size()-1;i++)
					{
						List<WebElement>list1=m_Driver.findElements(By.xpath("(//table[@class='tblborder'])[3]/tbody/tr/td[6]"));
						
						String value=list1.get(i).getText().replaceAll("£", "");
						String value2=value.replaceAll(",", "");
						double valueA=Double.parseDouble(value2);
						assertEquals(valueexcel, valueA);
						//System.out.println(valueexcel+"="+valueA);
						valueexcel=valueexcel+Amount;
						
					}
					 Reporter.log("Verify Total  Taxablepay");
				}
					
				public void VerifyTotalTaxDue(double Amount)
					{

					double valueexcel=Amount;
					List<WebElement>list=m_Driver.findElements(By.xpath("(//table[@class='tblborder'])[3]/tbody/tr/td[7]"));
					
					for(int i=0;i<=list.size()-1;i++)
					{
						List<WebElement>list1=m_Driver.findElements(By.xpath("(//table[@class='tblborder'])[3]/tbody/tr/td[7]"));
						
						String value=list1.get(i).getText().replaceAll("£", "");
						String value2=value.replaceAll(",", "");
						double valueA=Double.parseDouble(value2);
						assertEquals(valueexcel, valueA);
						//System.out.println(valueexcel+"="+valueA);
						
						break;		
						}	
					 Reporter.log("Verify Total TaxDue");
					
		}
				
				
				public void openP60Report() throws InterruptedException, AWTException
				{
					
					m_Driver.findElement(By.xpath("//a[@data-original-title='P60 PDF Document']")).click();
					ChangeWindow.tabswitch(m_Driver);
					
					Thread.sleep(9000);
					Robot robot = new Robot();
					// press Ctrl+S the Robot's way
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_S);
					Thread.sleep(3000);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					robot.keyRelease(KeyEvent.VK_S);
					// press Enter
					Thread.sleep(3000);

					robot.keyPress(KeyEvent.VK_ENTER);
					
					robot.keyRelease(KeyEvent.VK_ENTER);
					Thread.sleep(3000);	
					
				}
				public void getP60Report(String actual) throws InterruptedException, IOException
				{
					//Thread.sleep(2000);
					
					File file = new File("C:\\Users\\Sonu\\Downloads\\P60-2020-2021-Mr. Sonu Kumar.pdf");
					PDDocument document = PDDocument.load(file);
					PDFTextStripper pdfStripper = new PDFTextStripper();
					PDFtext = pdfStripper.getText(document);
					utilities.TakeScreenshot.Getscreenshot("TC031 _VeryfyPDF_P60 ", "2185", m_Driver);
					document.close();
					
					String[] splitedString= PDFtext.split(" ");
					
							// System.out.println(splitedString.length);
							 for(int i=0; i<splitedString.length;i++)
							 {
								
								// System.out.println(i+"+="+splitedString[i]);
							 }
							
						    String xyz = splitedString[393].substring(51,57);
						    String expectedTaxdeducted=xyz.trim();					
						    System.out.println(expectedTaxdeducted+ "=Total tax deduction ");
						    assertEquals(actual, expectedTaxdeducted, "Tax deduction matched in p60 ");
						  
						    if(file.delete())
						    System.out.println("file deleted");
						//    ChangeWindow.tabswitch(m_Driver);
							
					  Reporter.log("Verify Total deducted Tax");

}
				
			
				
				public void verifyTaxableP16(String actualdata)
				{
					
					jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div[11]/div/div/div/div/table/tbody/tr[4]/td[3]")));
					String totalTax = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div[11]/div/div/div/div/table/tbody/tr[4]/td[3]")).getText();
					
					totalTax =totalTax.replaceAll("£", "");
					totalTax =totalTax.replaceAll(",", "");
					System.out.println(totalTax +"= Taxable Payement");
					assertEquals(actualdata, totalTax);
				     utilities.TakeScreenshot.Getscreenshot("TC034_verify TotalTaxable from P16", "2185", m_Driver);
					 Reporter.log("Verify Taxable Payement");
				}
				
			
				public void verifyTaxableSummaryPeriod(String actualdata)
				{
					
					jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div/div/div/div/div/table/tbody/tr[26]/td[5]")));
					String totalTax = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div/div/div/div/div/table/tbody/tr[26]/td[5]")).getText();
					
					totalTax =totalTax.replaceAll("£", "");
					totalTax =totalTax.replaceAll(",", "");
					System.out.println(totalTax +"= Taxable Payement");
					assertEquals(actualdata, totalTax);
					utilities.TakeScreenshot.Getscreenshot("TC034_verify TotalTaxable from summary period", "2185", m_Driver);
					Reporter.log("Verify Taxable Payement");
				}
				
}
