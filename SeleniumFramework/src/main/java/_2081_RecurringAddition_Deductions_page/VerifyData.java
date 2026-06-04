package _2081_RecurringAddition_Deductions_page;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import au.com.bytecode.opencsv.CSVReader;
import pages.BasePage;
import utilities.ChangeWindow;

public class VerifyData extends BasePage {

	public VerifyData(WebDriver driver) {
		super(driver);
		
		
		
	}
	
	
	static String PDFtext;
	public void verifyRecurringAmount(String Value ,String expectedresult)
	{
		  String aprilAmount = m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div[2]/div/div/div/table/tbody/tr/td[1]")).get(1).getText();
		     
		  aprilAmount=aprilAmount.substring(1,6);
		  aprilAmount  =aprilAmount.replaceAll(",", "");
		  System.out.println("April amount = "+aprilAmount);
		  assertEquals(aprilAmount, Value, "not impacted April amount");
		  
		  String mayAmount = m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div[2]/div/div/div/table/tbody/tr/td[1]")).get(2).getText();
		  
		  mayAmount=mayAmount.substring(1,6);
		  mayAmount  =mayAmount.replaceAll(",", "");
		  System.out.println("May amount = "+mayAmount);
		  assertEquals(mayAmount, Value, "not impacted may amount");
		  
		  String juneAmount = m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div[2]/div/div/div/table/tbody/tr/td[1]")).get(3).getText();
		
		  juneAmount=juneAmount.substring(1,6);
		  juneAmount  =juneAmount.replaceAll(",", "");
		  System.out.println("June amount = "+juneAmount);
		  assertEquals(juneAmount, expectedresult, "Recuuring Amount apply from june");
		  
		  Reporter.log("Verify Recurrinng amount impacted month");
		  
		  utilities.TakeScreenshot.Getscreenshot("TC036_ verify impacted month amount", "2081", m_Driver);
	}
	
	
	public void verifyPensionAmount(String employee,String Employer)
	{
		
		
		List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div[2]/div/div/div/table/tbody/tr/td[4]"));
		List<WebElement> list2 = m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div[2]/div/div/div/table/tbody/tr/td[7]"));
		
		for(int i=0;i<=list.size()-1;i++)
		{
			
			List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div[2]/div/div/div/table/tbody/tr/td[4]"));
			
			WebElement element = list1.get(i);
		    String employeePension = element.getText();
		    employeePension=employeePension.substring(1, 4);
		    assertEquals(employeePension, employee, "Employee Pension is Calculate ");
		    
		    if(i==11)
		    {
		    	
		     System.out.println("employee pension is = "+employeePension);
		    }
		}
		
		for(int i=0;i<=list2.size()-1;i++)
		{
			
			List<WebElement> list3 = m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div[2]/div/div/div/table/tbody/tr/td[7]"));
			
			WebElement element = list3.get(i);
		    String employerPension = element.getText();
		    employerPension=employerPension.substring(1, 3);
		    assertEquals(employerPension, Employer, "Employee Pension is Calculate ");
		    
		    if(i==11)
		    {
		    	
		     System.out.println("Employer pension is = "+employerPension);
		     
		     
		    }
		}
		 Reporter.log("Verify Pension amount");
		 utilities.TakeScreenshot.Getscreenshot("TC037_ verify calculated pension amount for every month", "2081", m_Driver);
		
	}

	
	 public void verifyPensionAndBothAddedRecurringAddition(String expectedBonous,String expectedCommison,String expectedPension)
	 {
		 String pension = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div[2]/div/div/div/table/tbody/tr[3]/td[4]")).getText();
		String bonousAdditon = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div/div[1]/div[2]/div[1]/div[2]/div/div[2]")).getText();
		 String commisionAddition = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div/div[1]/div[2]/div[1]/div[2]/div/div[4]")).getText();
		bonousAdditon=bonousAdditon.substring(1,6);
		bonousAdditon=bonousAdditon.replaceAll(",", "");
		System.out.println("Addition Bonous = "+bonousAdditon);
		assertEquals(bonousAdditon, expectedBonous, "Bonous as expected");
		
		commisionAddition=commisionAddition.substring(1,4);
		System.out.println("Addition Commison = "+commisionAddition);
		assertEquals(commisionAddition, expectedCommison, "Commison as expected");
		
		pension=pension.substring(1,4);
		System.out.println("Pension amaount = " +pension);
		assertEquals(pension, expectedPension, "pension as expected");
		
		 Reporter.log("Verify Pension amount and Both added recurring addition"); 
		 utilities.TakeScreenshot.Getscreenshot("TC038_ Verify Pension amount and Both added recurring addition", "2081", m_Driver);
		 
		 
	 }
	 
	 
	 public void verifyReflectedAddition(String expected)
	 {
		String reflectAmount = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[3]/td[5]")).getText();
		 
		reflectAmount=reflectAmount.substring(1,6);
		reflectAmount=reflectAmount.replaceAll(",", "");
		System.out.println("Reflected amount on payroll dashboard = "+reflectAmount);
		
		 assertEquals(reflectAmount, expected);
		 
		 Reporter.log("Verify Reflected amount on payroll dashboard ");
		
		 
	 }
	 
		public void openPayslip() throws InterruptedException, AWTException
		{
			
			m_Driver.findElement(By.xpath("//*[@id='myTable1']/tbody/tr[3]/td[23]/a")).click();
		    
			ChangeWindow.tabswitch(m_Driver);
			
		  utilities.TakeScreenshot.Getscreenshot("TC039_ Verify Bonous and Comission Amount on payslip", "2081", m_Driver);
			Thread.sleep(6000);
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
			Reporter.log("Save Payslip");
	
		}
		public void openPayslip1() throws InterruptedException, AWTException
		{
			
			m_Driver.findElement(By.xpath("//*[@id='myTable1']/tbody/tr[2]/td[23]/a")).click();
		
			ChangeWindow.tabswitch(m_Driver);
			Thread.sleep(6000);
			 utilities.TakeScreenshot.Getscreenshot("TC041_ Verify Bonous and Commison ", "2081", m_Driver);
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
		
	         Reporter.log("Save Payslip");
		}
		
		public void getPayslip2(String expectedBonous,String expectedComission) throws InterruptedException, IOException
		{
			//Thread.sleep(3000);
			
			File file = new File("C:\\Users\\Sonu\\Downloads\\Employee-Payslip-Mr. Testing Data-31_05_2021.pdf");
			PDDocument document = PDDocument.load(file);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			PDFtext = pdfStripper.getText(document);
			
			document.close();
			
			String[] splitedString= PDFtext.split(" ");
			
					// System.out.println(splitedString.length);
					 for(int i=0; i<splitedString.length;i++)
					 {
						
						 System.out.println(i+"+="+splitedString[i]);
					 }
					
				    String bonousAmount = splitedString[20].substring(1,6).replaceAll(",", "");
				    String comissionAmount = splitedString[21].substring(1,4);
				     System.out.println("Addition Bonous is = "+bonousAmount);
				     System.out.println("Addition Comission is = "+comissionAmount);
				     assertEquals(bonousAmount, expectedBonous);
				     assertEquals(comissionAmount, expectedComission);
				  
				    if(file.delete())
				    System.out.println("file deleted");
				    ChangeWindow.tabswitch(m_Driver);
					
			  Reporter.log("Verify Bonous and Comission Amount");
			 
			
		}
		
		public void getPayslip(String expectedBonous, String expectedbasicPay) throws InterruptedException, IOException
		{
			//Thread.sleep(3000);
			
			File file = new File("C:\\Users\\Sonu\\Downloads\\Employee-Payslip-Mr. Employee A-31_07_2021.pdf");
			PDDocument document = PDDocument.load(file);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			PDFtext = pdfStripper.getText(document);
			
			document.close();
			
			String[] splitedString= PDFtext.split(" ");
			
					// System.out.println(splitedString.length);
					 for(int i=0; i<splitedString.length;i++)
					 {
						
						 System.out.println(i+"+="+splitedString[i]);
					 }
					
				    String bonousAmount = splitedString[19].substring(1,6).replaceAll(",", "");
				    String basicPay = splitedString[18].substring(1,4);
				   
				     System.out.println("Addition Bonous is on payslip = "+bonousAmount);
				     System.out.println("Basic pay is on payslip = "+basicPay);
				     
				     assertEquals(bonousAmount, expectedBonous);
				     
				     assertEquals(basicPay, expectedbasicPay);
				  
				    if(file.delete())
				    System.out.println("file deleted");
				    ChangeWindow.tabswitch(m_Driver);
					
			  Reporter.log("Verify Bonous and Commison");
			
		}
		
		public void verifyPayrollSummary(String expectedPayment)
		{
			
			String Payment = m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Testing Data')]//following::td/div/div")).get(0).getText();
			 Payment = Payment.replaceAll(",", "");
			
			 Payment = Payment.substring(0, 5).replaceAll("£", "");

			System.out.println("Employee Payement= "+Payment);
			assertEquals(Payment, expectedPayment);
			
			Reporter.log("Verify employee Payment");
			
		}
		public void xyz(String Data)
		{
			List<WebElement>list=m_Driver.findElements(By.xpath("//*[@class='outerT-dash outerT-dash_Print']/table/tbody/tr/td/a"));
			
			for(int i=0;i<=list.size()-1;i++)
			{
				List<WebElement>list1=m_Driver.findElements(By.xpath("//*[@class='outerT-dash outerT-dash_Print']/table/tbody/tr/td/a"));
				String MonthName=list1.get(i).getText();
				String MN[]=MonthName.split(" ");
				String MonthN=MN[1].trim();
				
				if(MonthN.equals(Data))
				{
					
                 m_Driver.findElement(By.xpath("//*[@class='outerT-dash outerT-dash_Print']/table/tbody/tr/td/a[contains(text(),'30/04/2021')]/following::td[contains(text(),'300')]"));
				}
				
			}
			
			
		}
		
        public void verifyRecurringStop(String expectedAmont)
        {
        	
        	String Julyamount = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[3]/td[5]")).getText();
        	String julyAmount = Julyamount.substring(1,6).replaceAll(",", "");
			System.out.println("July Gross without bonous= "+julyAmount);
			assertEquals(julyAmount, expectedAmont);
			 utilities.TakeScreenshot.Getscreenshot("TC040_ Recuring Stop from July", "2081", m_Driver);
        }
		
		
        
        public void verifyPayrollSummaryPayments(String expectedValue)
        {
        	   String totalPayment = m_Driver.findElement(By.xpath("//*[starts-with(text(), 'Pankaj singh')]/parent::div/parent::td/following-sibling::td[2]/div/div")).getText();
        	   String totalPayments = totalPayment.substring(1,6).replaceAll(",", "");
        	   
        	   System.out.println("Total payements for Employee = "+totalPayments);
        	   
        	   assertEquals(totalPayments, expectedValue);
      
        	
        }
        
        
        public void VerifyPdfPayrollSummary(String expectedpayment, String expectedHMRC) throws InterruptedException, IOException, AWTException
		{
			  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rvReport_ctl10_ctl04_ctl00_ButtonLink']")).click();
			  Thread.sleep(1000);
			  WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rvReport_ctl10_ctl04_ctl00_Menu']/div[2]/a"));
			  Reporter.log("Click pdf icon");
			  
			  elem.click();
			  Thread.sleep(9000);
			  

//		       	 Robot robot = new Robot(); 
//		            for(int i=0;i<=1;i++)
//		            {
//		           	 robot.keyPress(KeyEvent.VK_TAB);
//		           	 robot.keyRelease(KeyEvent.VK_TAB);
//		           	 Thread.sleep(2000);
//		            }
//		            
//		            robot.keyPress(KeyEvent.VK_ENTER);
//		             
//                    robot.keyRelease(KeyEvent.VK_ENTER);
//                    Thread.sleep(2000);
//                    robot.keyPress(KeyEvent.VK_UP);
//                    robot.keyRelease(KeyEvent.VK_UP);
//                    Thread.sleep(2000);
//                    robot.keyPress(KeyEvent.VK_ENTER);
//                    
//                    robot.keyRelease(KeyEvent.VK_ENTER);
//                    Thread.sleep(2000);
//                    robot.keyPress(KeyEvent.VK_F);
//                    robot.keyPress(KeyEvent.VK_F2);
//                    
//                    robot.keyRelease(KeyEvent.VK_F);
//                    robot.keyRelease(KeyEvent.VK_F2);
//                    Thread.sleep(2000);
//                    robot.keyPress(KeyEvent.VK_RIGHT);
//                    robot.keyRelease(KeyEvent.VK_RIGHT);
//                    for(int j=0;j<=1;j++)
//                    {
//                    robot.keyPress(KeyEvent.VK_BACK_SPACE);
//                    robot.keyRelease(KeyEvent.VK_BACK_SPACE);
//                    Thread.sleep(2000);
//                    }
//                   robot.keyPress(KeyEvent.VK_ENTER);
//                    
//                    robot.keyRelease(KeyEvent.VK_ENTER);
		                    

		          
			//File file = new File("C:\\Users\\Sonu\\Downloads\\EmployerSummarywithPension.pdf");
			File file = new File("C:\\Users\\Sonu\\Downloads\\RecurringReports - Payroll Summary -31-07-2021.pdf");

			PDDocument document = PDDocument.load(file);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			PDFtext = pdfStripper.getText(document);
		
			document.close();
			
//			String[] splitedString= PDFtext.split(" ");
//			
//					// System.out.println(splitedString.length);
//					 for(int i=0; i<splitedString.length;i++)
//					 {
//						
//						 System.out.println(i+"+="+splitedString[i]);
//					 }
//					
//				    String actualPayment = splitedString[18].substring(1,6).replaceAll(",", "");
//				    String actualDuetoHMRC = splitedString[63].substring(1,4);
				   
//				     System.out.println("Payement with Addition Bonous is on payrollSummary = "+actualPayment);
//				     System.out.println("Actual due to HMRC = "+actualDuetoHMRC);
//				     
//				     assertEquals(actualPayment, expectedpayment);
//				     
//				     assertEquals(actualDuetoHMRC, expectedHMRC);
			
			Assert.assertTrue(PDFtext.contains(expectedpayment));
			//Assert.assertTrue(PDFtext.contains(expectedHMRC));

				  
				    if(file.delete())
				    System.out.println("file deleted");
				    utilities.ChangeWindow.Switchwindow(2, m_Driver);
					
			  Reporter.log("Verify Employee payment and HMRC ");
			
		}
        
        public void verifyEmailLog(String expeccted ) throws InterruptedException
    	{
//    	 WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailLog_ctl00_lbtnViewEmail']"));
//    		
//    	 elem.click();
//    	 
          Thread.sleep(1000);
          
          String employer = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/div[2]/div[2]/div/p[2]/i/span")).getText();
    	 
          System.out.println("Email tag = "+employer);
          assertEquals(employer, expeccted);
          Reporter.log("Verify EmailLog");
          
          
}
        
        
        public void verifyPayrollSummaryPeriodPayments(String expectedValue)
        {
        	   String bonous = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div/div/div/div/div/table/tbody/tr[2]/td[5]")).getText();
        	   String bonousAmount = bonous.substring(1,6).replaceAll(",", "");
        	   
        	   System.out.println("Bonous amount in Addition Couloum = "+bonousAmount);
        	   
        	   assertEquals(bonousAmount, expectedValue);
        	   utilities.TakeScreenshot.Getscreenshot("TC043_Verify Bonous Amount ", "2081", m_Driver);
        	
        }
        
        
     
        public void Click_PayslipIcn() throws InterruptedException
        {
        	 WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnExportToPdf']"));
			  
			 elem.click();
			  	
        }
        
        public void VerifyPdfPayrollSummaryPeriod(String expectedpayment) throws InterruptedException, IOException, AWTException
		{
        	
		
        	Thread.sleep(9000);
       	 Robot robot = new Robot(); 
            for(int i=0;i<=5;i++)
            {
           	 robot.keyPress(KeyEvent.VK_TAB);
           	 robot.keyRelease(KeyEvent.VK_TAB);
           	 Thread.sleep(3000);
            }
            
                   robot.keyPress(KeyEvent.VK_ENTER);
          
                    robot.keyRelease(KeyEvent.VK_ENTER);
                    Thread.sleep(3000);
                    robot.keyPress(KeyEvent.VK_UP);
                    robot.keyRelease(KeyEvent.VK_UP);
                    Thread.sleep(3000);
                    robot.keyPress(KeyEvent.VK_ENTER);
                    
                    robot.keyRelease(KeyEvent.VK_ENTER);
                    

              Thread.sleep(3000);
              
			File file = new File("C:\\Users\\Sonu\\Downloads\\PayrollReportingPeriodSummary-2021-2022.pdf");
			PDDocument document = PDDocument.load(file);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			PDFtext = pdfStripper.getText(document);
			
			document.close();
//			
//			String[] splitedString= PDFtext.split(" ");
//			
//					// System.out.println(splitedString.length);
//					 for(int i=0; i<splitedString.length;i++)
//					 {
//						
//						// System.out.println(i+"+="+splitedString[i]);
//					 }
//					
//				    String actualPayment = splitedString[20].substring(1,6).replaceAll(",", "");
//				     
//				     System.out.println("Addition Bonous = "+actualPayment);
//				    
//				     
//				     assertEquals(actualPayment, expectedpayment);
//				    
			 Assert.assertTrue(PDFtext.contains(expectedpayment));
				  
				    if(file.delete())
				    System.out.println("file deleted");
				  
					
			  Reporter.log("Verify Addition Amount on Payslip");
        
      
		}
        
        
		public void ReadCSVFile(String value) throws IOException, InterruptedException, AWTException {
			WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnExport']"));

			elem.click();
			Thread.sleep(9000);
//			Robot robot = new Robot();
//
//			for (int i = 0; i <= 6; i++) {
//				robot.keyPress(KeyEvent.VK_TAB);
//				robot.keyRelease(KeyEvent.VK_TAB);
//				Thread.sleep(2000);
//			}
//
//			robot.keyPress(KeyEvent.VK_ENTER);
//
//			robot.keyRelease(KeyEvent.VK_ENTER);
//			Thread.sleep(2000);
//			robot.keyPress(KeyEvent.VK_UP);
//			robot.keyRelease(KeyEvent.VK_UP);
//			Thread.sleep(2000);
//			robot.keyPress(KeyEvent.VK_ENTER);
//
//			robot.keyRelease(KeyEvent.VK_ENTER);
//			Thread.sleep(2000);
//			robot.keyPress(KeyEvent.VK_F);
//			robot.keyPress(KeyEvent.VK_F2);
//			
//			robot.keyRelease(KeyEvent.VK_F);
//			robot.keyRelease(KeyEvent.VK_F2);
//			Thread.sleep(2000);
//
//			robot.keyPress(KeyEvent.VK_RIGHT);
//			robot.keyRelease(KeyEvent.VK_RIGHT);
//			Thread.sleep(2000);
//
//			for (int j = 0; j <= 11; j++) {
//				robot.keyPress(KeyEvent.VK_BACK_SPACE);
//				robot.keyRelease(KeyEvent.VK_BACK_SPACE);
//				Thread.sleep(2000);
//			}
//			robot.keyPress(KeyEvent.VK_ENTER);
//
//			robot.keyRelease(KeyEvent.VK_ENTER);
//
//			Thread.sleep(2000);
			CSVReader reader = new CSVReader(
					new FileReader("C:\\Users\\Sonu\\Downloads\\PayrollReportingPeriodSummary-2021-2022.csv"));

			List<String[]> list = reader.readAll();
			System.out.println("Total rows which we have is " + list.size());

			// create Iterator reference
			Iterator<String[]> iterator = list.iterator();

			// Iterate all values
			while (iterator.hasNext()) {

				String[] str = iterator.next();

				// System.out.print(" Values are ");
				for (int i = 0; i < str.length; i++) {

					// System.out.print(" "+str[i]);

					if (str[i].contains(value))

					{
						// Thread.sleep(100);
						Assert.assertTrue(str[i].contains(value));

						System.out.println("pass");
						break;
					}

				}
				System.out.println("   ");

			}
			// utilities.ChangeWindow.Switchwindow(2, m_Driver);
			Reporter.log("verify Addition Amount csv File");

		}
        
        public void DownloadPayslipClikable() throws InterruptedException
        {
        	m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnDownloadPayslips']")).click();
        	
        	Thread.sleep(3000);
       
        	File file = new File("C:\\Users\\Sonu\\Downloads\\Payslips.zip");
              
        	 if(file.delete()) {
			System.out.println("file deleted");
			
			Reporter.log("Verify Download Payslip Clickable");
        }
        
        }
        
        public void ReadCSVFile2(String value) throws IOException, AWTException, InterruptedException
        {
        	
        	  WebElement csv = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnExport']"));
        	
        	    csv.click();
        	    Thread.sleep(9000);
           	 Robot robot = new Robot();

                
                
                for(int i=0;i<=7;i++)
                {
               	 robot.keyPress(KeyEvent.VK_TAB);
               	 robot.keyRelease(KeyEvent.VK_TAB);
               	 Thread.sleep(3000);
                }
                
                       robot.keyPress(KeyEvent.VK_ENTER);
              
                        robot.keyRelease(KeyEvent.VK_ENTER);
                        Thread.sleep(3000);
//                        robot.keyPress(KeyEvent.VK_UP);
//                        robot.keyRelease(KeyEvent.VK_UP);
//                        Thread.sleep(2000);
//                        robot.keyPress(KeyEvent.VK_ENTER);
//                        
//                        robot.keyRelease(KeyEvent.VK_ENTER);
//                        Thread.sleep(2000);
//                        robot.keyPress(KeyEvent.VK_F);
//                        robot.keyPress(KeyEvent.VK_F2);
//                        robot.keyRelease(KeyEvent.VK_F);
//                       robot.keyRelease(KeyEvent.VK_F2);
//         			   Thread.sleep(2000);
//
//                        robot.keyPress(KeyEvent.VK_RIGHT);
//                        robot.keyRelease(KeyEvent.VK_RIGHT);
//            			Thread.sleep(2000);
//
//                        for(int j=0;j<=11;j++)
//                        {
//                        robot.keyPress(KeyEvent.VK_BACK_SPACE);
//                        robot.keyRelease(KeyEvent.VK_BACK_SPACE);
//                        Thread.sleep(2000);
//                        }
//                       robot.keyPress(KeyEvent.VK_ENTER);
//                        
//                        robot.keyRelease(KeyEvent.VK_ENTER);

                
               
        	    CSVReader reader = new CSVReader(new FileReader("C:\\Users\\Sonu\\Downloads\\IndividualEmployeePaySchedule-Mr. Pankaj singh.csv"));
           
        	 
        	  List<String[]> list=reader.readAll();
        	  System.out.println("Total rows which we have is "+list.size());
        	  
        	 
        	 // create Iterator reference
        	  Iterator<String[]>iterator= list.iterator();
        	    
        	 // Iterate all values 
        	   while(iterator.hasNext()){
        	     
        	   String[] str=iterator.next();
        	   
        	// System.out.print(" Values are ");
        	
        	   for(int i=0;i<str.length;i++)
            	{
                           
         	 //  System.out.print(" "+str[i]);
         	  
         	   
         	   if(str[i].contains(value))
         		   
         	   {
         		 //  Thread.sleep(100);
         		  Assert.assertTrue(str[i].contains(value));
         		  
         		 System.out.println("pass");
         		 break;
         	   }
         	 
        	
         	   System.out.println(" ");
        	
         	   
        	  	    
        	}
        	
            
        }
        	   
        	   
        }
        
        public void Individually_EmployeePaySchedulePDF(String expectedresult) throws InterruptedException, IOException, AWTException
		{
        	
        	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_A1']"));
		    elem.click();
        	
            Thread.sleep(9000);
          	 Robot robot = new Robot();

               
               
               for(int i=0;i<=6;i++)
               {
              	 robot.keyPress(KeyEvent.VK_TAB);
              	 robot.keyRelease(KeyEvent.VK_TAB);
              	 Thread.sleep(2000);
               }
               
                      robot.keyPress(KeyEvent.VK_ENTER);
             
                       robot.keyRelease(KeyEvent.VK_ENTER);
                       Thread.sleep(3000);
//                       robot.keyPress(KeyEvent.VK_UP);
//                       robot.keyRelease(KeyEvent.VK_UP);
//                       Thread.sleep(2000);
//                       robot.keyPress(KeyEvent.VK_ENTER);
//                       
//                       robot.keyRelease(KeyEvent.VK_ENTER);
//                       Thread.sleep(2000);
//                       robot.keyPress(KeyEvent.VK_F);
//                       robot.keyPress(KeyEvent.VK_F2);
//                       robot.keyRelease(KeyEvent.VK_F);
//                      robot.keyRelease(KeyEvent.VK_F2);
//                      Thread.sleep(2000);
//
//                       robot.keyPress(KeyEvent.VK_RIGHT);
//                       robot.keyRelease(KeyEvent.VK_RIGHT);
//                       Thread.sleep(2000);
//
//                       for(int j=0;j<=11;j++)
//                       {
//                       robot.keyPress(KeyEvent.VK_BACK_SPACE);
//                       robot.keyRelease(KeyEvent.VK_BACK_SPACE);
//                       Thread.sleep(2000);
//                       }
//                      robot.keyPress(KeyEvent.VK_ENTER);
//                       
//                       robot.keyRelease(KeyEvent.VK_ENTER);
//
//                 Thread.sleep(2000);
              
			File file = new File("C:\\Users\\Sonu\\Downloads\\IndividualEmployeePaySchedule-Mr. Pankaj singh.pdf");
			PDDocument document = PDDocument.load(file);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			PDFtext = pdfStripper.getText(document);
			
			//System.out.println(PDFtext);
			document.close();
			
			
				     
			 Assert.assertTrue(PDFtext.contains(expectedresult));
				    
				  
				    if(file.delete())
				    System.out.println("file deleted");
				  
					
			  Reporter.log("Verify Addition Amount ");
        
      
		}
        
        
        public void Grossamountverify(String date,String expected)
        {
        	WebElement Grossamount=m_Driver.findElement(By.xpath("//*[@class='outerT-dash outerT-dash_Print mt-0']/table/tbody/tr/td[contains(text(),'"+date+"')]/following-sibling::td[3]"));
            String actual=Grossamount.getText();
           String actualdata = actual.substring(1, 6).replaceAll(",", "");
            System.out.println(actualdata);
            assertEquals(actualdata, expected);
            
            
            Reporter.log("Verify GrossPay");
        	
        }
        
        
        

    	public void PensionAmount(String employee,String employee1)
    	{
    		
    		
    		List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div[2]/div/div/div/table/tbody/tr/td[4]"));
    		List<WebElement> list2 = m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div[2]/div/div/div/table/tbody/tr/td[7]"));
    		
    		for(int i=0;i<=list.size()-1;i++)
    		{
    			
    			List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div[2]/div/div/div/table/tbody/tr/td[4]"));
    			
    			
    			
    			if(i<=3)
    			{
    				WebElement element = list1.get(i);
        		    String employeePension = element.getText();
        		    employeePension=employeePension.substring(1, 3);
        		    assertEquals(employeePension, employee);	
    			}
    			
    			else
    			{
    				WebElement element = list1.get(i);
        		    String employeePension = element.getText();
        		    employeePension=employeePension.substring(1, 3);
        		    assertEquals(employeePension, employee1);	
    				
    			}
    		    
    		   
    		
    		 
    		
    		}
    		
    		Reporter.log("Verify Pension Amount");
    	}
    	
    	
    	public void PensionAmount3(String employee,String employee1)
    	{
    		
    		
    		List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div[2]/div/div/div/table/tbody/tr/td[4]"));
    	//	List<WebElement> list2 = m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div[2]/div/div/div/table/tbody/tr/td[7]"));
    		
    		for(int i=0;i<=list.size()-1;i++)
    		{
    			
    			List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div[2]/div/div/div/table/tbody/tr/td[4]"));
    			
    			
    			
    			if(i<=1)
    			{
    				WebElement element = list1.get(i);
        		    String employeePension = element.getText();
        		    employeePension=employeePension.substring(1, 3);
        		    assertEquals(employeePension, employee);	
    			}
    			
    			else if(i>=8)
    			{
    				WebElement element = list1.get(i);
        		    String employeePension = element.getText();
        		    employeePension=employeePension.substring(1, 3);
        		    assertEquals(employeePension, employee);	
    			}
    			
    			
    			else
    			{
    				WebElement element = list1.get(i);
        		    String employeePension = element.getText();
        		    employeePension=employeePension.substring(1, 3);
        		    assertEquals(employeePension, employee1);	
    				
    			}
    		    
    		   
    		
    		 
    		
    		}
    		
    		Reporter.log("Verify Pension Amount");
    	}
    	
    	
    	
    	public void PensionAmount1(String employee,String employer)
    	{
    		
    		
    		List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div[2]/div/div/div/table/tbody/tr/td[4]"));
    		List<WebElement> list2 = m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div[2]/div/div/div/table/tbody/tr/td[7]"));
    		
    		for(int i=0;i<=list.size()-1;i++)
    		{
    			
    			List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div[2]/div/div/div/table/tbody/tr/td[4]"));
    			
    			
    			
    				WebElement element = list1.get(i);
        		    String employeePension = element.getText();
        		    employeePension=employeePension.substring(1, 3);
        		    assertEquals(employeePension, employee);	
    				
    		
    		}
    		for(int i=0;i<=list2.size()-1;i++)
    		{
    			
    		
    				WebElement element = list2.get(i);
        		    String employerPension = element.getText();
        		    employerPension=employerPension.substring(1, 3);
        		    assertEquals(employerPension, employer);	
    		
    		}
    		
    		Reporter.log("Verify Pension Amount");
    	}
    	public void verifyAdditionDeduction(String expectedAddition,String expectedDeduction)
    	{
    		
    		String Addition = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl00_txtAmount']")).getAttribute("value");
    		
    		System.out.println("Addition Bonous is "+Addition);
    		assertEquals(Addition, expectedAddition);
    		
    	
    		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpDeduction_tab']/span/span"));
    		elem.click();
    		
    		String Deduction = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpDeduction_rptrDeduction_ctl00_txtAmount']")).getAttribute("value");
    		System.out.println("Deduction Advance page is "+Deduction);
    		assertEquals(Deduction, expectedDeduction);
    		Reporter.log("Verify Addition and Deduction  On ProcessPage");
	
    	}
    	public void verifyAdditionDeductions(String expectedAddition, String expectedAddion1 ,String expectedDeduction,String expectedDeduction1)
    	{
    		
    		String Addition = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl00_txtAmount']")).getAttribute("value");
    		
    		System.out.println("Addition Bonous is "+Addition);
    		assertEquals(Addition, expectedAddition);
    		
             String Addition1 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl01_txtAmount']")).getAttribute("value");
    		
    		System.out.println("Addition Bonous is "+Addition1);
    		assertEquals(Addition1, expectedAddion1);
    		
    	
    		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpDeduction_tab']/span/span"));
    		elem.click();
    		
    		String Deduction = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpDeduction_rptrDeduction_ctl00_txtAmount']")).getAttribute("value");
    		System.out.println("Deduction Advance page is "+Deduction);
    		assertEquals(Deduction, expectedDeduction);
    		
    		String Deduction1 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpDeduction_rptrDeduction_ctl01_txtAmount']")).getAttribute("value");
    		System.out.println("Deduction Advance page is "+Deduction1);
    		assertEquals(Deduction1, expectedDeduction1);
    		Reporter.log("Verify Addition and Deduction  On ProcessPage");
	
    	}
    	
    	
    	public void GrossPay(String expectedGross)
    	{
    		
           
           
            	WebElement Grossamount=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[2]/td[5]"));
                String actual=Grossamount.getText();
                String actulGross = actual.substring(1,6);
                actulGross = actulGross.replaceAll(",", "");
                System.out.println("Gross Amount on PayrollDashboard "+actulGross);
                assertEquals(actulGross, expectedGross);
                
                
                Reporter.log("Verify Gross Amount On PayrollDashboard");
            	
            
    	
    	}
    	
    	
    	public void openPayslip3() throws InterruptedException, AWTException
		{
			

    		m_Driver.findElement(By.xpath("//*[@id='myTable1']/tbody/tr[2]/td[23]")).click();
		    
			ChangeWindow.tabswitch(m_Driver);
			Thread.sleep(6000);
			utilities.TakeScreenshot.Getscreenshot("TC046_ Verify Addition deduction", "2081", m_Driver);
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
			Reporter.log("Save Payslip");
	
		}
    	
    	
        public void payslipAdditionDeduction(String expectedAddition,String expectedDeduction ) throws InterruptedException, IOException
    		{
            	
            
            	//Thread.sleep(4000);
    		
    			File file = new File("C:\\Users\\Sonu\\Downloads\\Employee-Payslip-Mr. Raja kumar-31_08_2021.pdf");
    			PDDocument document = PDDocument.load(file);
    			PDFTextStripper pdfStripper = new PDFTextStripper();
    			PDFtext = pdfStripper.getText(document);
    			
    			//System.out.println(PDFtext);
    			document.close();
    			
    			
    				     
    			 Assert.assertTrue(PDFtext.contains(expectedAddition));
    			 Assert.assertTrue(PDFtext.contains(expectedDeduction));
    			 
    				    
    				  
    				    if(file.delete())
    				    System.out.println("file deleted");
    				    utilities.ChangeWindow.Switchwindow(2, m_Driver);
    					
    			  Reporter.log("Verify Payslip ");
            
          
    		}
        
        public void AdditionDeductionPayrollReporting(String date,String expectedAddition,String expectedDeduction)
    	{
    		
    		WebElement addition = m_Driver.findElement(By.xpath("//*[@class=\"outerT-dash outerT-dash_Print\"]/table/tbody/tr/td/a[contains(text(),'"+date+"')]/following::td[4]"));
    		 String actual = addition.getText();
    		   actual=actual.substring(1,4);
    		
    		   assertEquals(actual, expectedAddition);
    		 
    		   WebElement deduction = m_Driver.findElement(By.xpath("//*[@class=\"outerT-dash outerT-dash_Print\"]/table/tbody/tr/td/a[contains(text(),'"+date+"')]/following::td[5]"));
      		    String actual1 = deduction.getText();
      		   actual1=actual1.substring(1,4);
      		   
      		   assertEquals(actual1, expectedDeduction);
      		   
      		   System.out.println("Addition "+actual+" and Deduction "+actual1+" for "+date);
      		 
        
        }
        
        public void PayrollSummary(String expectedPay) {
        	
        	String payment = m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Raja kumar')]//following::td/div/div")).get(0).getText();
        	
        	payment=payment.substring(1,6).replaceAll(",", "");
        	
        	assertEquals(payment, expectedPay);
        	
        	System.out.println("payment on payrollsummary "+payment);
        	Reporter.log("Verify Payroll Summary Payment");
        	
        }
        
        public void individualEmployeePaySchedule(String expected,String expected1)
        {
        	
        	
        	List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='outerT-dash outerT-dash_Print mt-0']/table/tbody/tr/td[6]"));
        	
        	for(int i=0;i<=list.size()-1;i++)
        	{
        		List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='outerT-dash outerT-dash_Print mt-0']/table/tbody/tr/td[6]"));
        		
        		String deductiom = list1.get(i).getText();
        		deductiom=deductiom.substring(1, 4).replaceAll(",", "");
        		
        		
        		if(i==4)
        		{
        			String deductiomamt = list1.get(i).getText();
        			deductiomamt=deductiomamt.substring(1, 2);
        			assertEquals(deductiomamt, expected1);
                  break;
        		}
        		assertEquals(deductiom, expected);
        		
        	}
        	System.out.println("Pass");
        	 Reporter.log("Verify  deduction Coulom ");
        }
    
        
        public void verifyNetPayt(String expectedTillJuly,String expectedTillMarch)
    	{
    		
    		
    		List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div[2]/div/div/div/table/tbody/tr/td[5]"));
    		
    		
    		for(int i=0;i<=list.size()-1;i++)
    		{
    			
    			List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div[2]/div/div/div/table/tbody/tr/td[5]"));
    	   
    		    if(i==4||i==5||i==6||i==7||i==8||i==9||i==10||i==11)
    		    {
    		    	
    		    	 WebElement element = list1.get(i);
    	    		    String netpay = element.getText();
    	    		    netpay=netpay.substring(1, 6).replaceAll(",", "");
    	    		    assertEquals(netpay, expectedTillMarch);
    		    
    		     continue;
    		    }
    		    WebElement element = list1.get(i);
    		    String netpay = element.getText();
    		    netpay=netpay.substring(1, 6).replaceAll(",", "");
    		    assertEquals(netpay, expectedTillJuly);
    	
    		}
    		System.out.println("expected netPay til July = "+expectedTillJuly);
    		System.out.println("expected netPay til March = "+expectedTillMarch);
    		}
        
        
        public void AutostopDeduction(String expectedDeduction) throws Exception
        {
        m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplay_ctl04_lnkViewEmployeeSalaryDetails']")).click();
        Reporter.log("click Aug Finalize payroll");
        
        Thread.sleep(4000);
        m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));
           
           String deduction= m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[11]/div")).getText();
        	
           deduction=deduction.substring(1,2);
           
           m_Driver.switchTo().defaultContent();
           
           
           //close popup
           m_Driver.findElement(By.xpath("//*[@id='PopUpClose1']")).click();
           
           Reporter.log("Verify Stop Deduction");
           
        }
        
        public void GrossAmount(String expectedGross)
    	{
    		
           
           
            	WebElement Grossamount=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[2]/td[5]"));
                String actual=Grossamount.getText();
                String actulGross = actual.substring(1,4);
                actulGross = actulGross.replaceAll(",", "");
                System.out.println("Gross Amount on PayrollDashboard "+actulGross);
                assertEquals(actulGross, expectedGross);
                Reporter.log("Verify Gross Amount On PayrollDashboard");
            	
            
    	
    	}
        
        public void openPayslip4() throws InterruptedException, AWTException
		{
			
			m_Driver.findElement(By.xpath("//*[@id='myTable1']/tbody/tr[2]/td[23]")).click();
		    
			ChangeWindow.tabswitch(m_Driver);
			Thread.sleep(9000);
			utilities.TakeScreenshot.Getscreenshot("TC047_ Verify Addition deduction on payslip", "2081", m_Driver);
			Robot robot = new Robot();
			// press Ctrl+S the Robot's way
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_S);
			
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_S);
			// press Enter
			Thread.sleep(3000);

			robot.keyPress(KeyEvent.VK_ENTER);
			
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
			Reporter.log("Save Payslip");
	
		}
        
        public void payslipAdditionDeductions(String expectedAddition,String expectedAddition1,String expectedDeduction,String expectedDeduction1) throws InterruptedException, IOException
		{
        	
        
        	//Thread.sleep(4000);
		
			File file = new File("C:\\Users\\Sonu\\Downloads\\Employee-Payslip-Mr. Suraj Singh-30_11_2021.pdf");
			PDDocument document = PDDocument.load(file);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			PDFtext = pdfStripper.getText(document);
			
			//System.out.println(PDFtext);
			document.close();
			
			
				     
			 Assert.assertTrue(PDFtext.contains(expectedAddition));
			 Assert.assertTrue(PDFtext.contains(expectedAddition1));
			 
			 Assert.assertTrue(PDFtext.contains(expectedDeduction));
			 Assert.assertTrue(PDFtext.contains(expectedDeduction1));
				    
				  
				    if(file.delete())
				    System.out.println("file deleted");
			
					
			  Reporter.log("Verify Payslip ");
        
      
		}
    	
        
        public void AutostopDeductionfromDec(String expectedDeduction)
        {
        m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplay_ctl08_lnkViewEmployeeSalaryDetails']")).click();
        Reporter.log("click Aug Finalize payroll");
        m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));
           
           String deduction= m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[11]/div")).getText();
        	
           deduction=deduction.substring(1,2);
           
           m_Driver.switchTo().defaultContent();
           
           
           //close popup
           m_Driver.findElement(By.xpath("//*[@id='PopUpClose1']")).click();
           
           Reporter.log("Verify Stop Deduction");
           
        }
}
        
        