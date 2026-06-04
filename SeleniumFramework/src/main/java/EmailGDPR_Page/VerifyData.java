package EmailGDPR_Page;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import pages.BasePage;

public class VerifyData extends BasePage {

	public VerifyData(WebDriver driver) {
		super(driver);
	
	}
	SoftAssert soft= new SoftAssert();

	
	public void verifyRecievedEmployeePayslip() throws Exception
	{
		
		Thread.sleep(9000);
		try {
			
		
			 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));
			
			 System.out.println(list.size());
			boolean con=list.isEmpty();
		     soft.assertFalse(con);
		    
			for (int i=0;i<=19;i++)
			{
				
				List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));

				WebElement elem = list1.get(i);
				elem.click();
				
				Thread.sleep(3000);
				utilities.ChangeWindow.Switchwindow(3, m_Driver);
				
				WebElement tagData = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[4]/div/div/div[2]/div[2]/div/p[1]/span[2]"));

				String name = tagData.getText();
				
				//String[] name = tagData.getText().split(" ");

				//System.out.println(name[1]);
				System.out.println(name);
				
	            WebElement  payslipdata= m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b"));
				
				String[] payslipname = payslipdata.getText().split(" ");
				
				System.out.println(payslipname[4]);

				//soft.assertEquals(name[1], payslipname[4]);
				
				soft.assertEquals(name, payslipname[4]);

				
				List<WebElement> attachmentsList = m_Driver.findElements(By.xpath("//*[contains(text(),'Employee Payslip')]"));
				
				int Count = attachmentsList.size();
				System.out.println("Payslip attachement count = "+Count);
				
			    soft.assertEquals(Count, 1);
				WebElement backBtn = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/div/a"));
				backBtn.click();
				Thread.sleep(4000);
				utilities.ChangeWindow.Switchwindow(1, m_Driver);

			
			}
			Reporter.log("verifyRecievedEmployeePayslip ");

		} catch (Exception e) {
         System.out.println("Issue In verifyRecievedEmployeePayslip"+e);
 	    soft.assertFalse(true,"welcome to catch block");

		}
		
	}
	
	
	public void verifyRecievedEmployeePayslip1()
	{
		
		
		try {
//			WebElement backBtn = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/div/a"));
//			backBtn.click();
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));
			
			boolean con=list.isEmpty();
		     soft.assertFalse(con);
			
			for (int i=1;i<=20;i++)
			{
				
					List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));

					WebElement elem = list1.get(i);
					elem.click();
					
					Thread.sleep(3000);
					utilities.ChangeWindow.Switchwindow(3, m_Driver);
					WebElement tagData = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[4]/div/div/div[2]/div[2]/div/p[1]/span[2]"));
					
					//String[] name = tagData.getText().split(" ");
					String name = tagData.getText();

					//System.out.println(name[1]);
					System.out.println(name);

					
		            WebElement  payslipdata= m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b"));
					
					String[] payslipname = payslipdata.getText().split(" ");
					
					System.out.println(payslipname[4]);

					soft.assertEquals(name, payslipname[4]);
					
					
					List<WebElement> attachmentsList = m_Driver.findElements(By.xpath("//*[contains(text(),'Employee Payslip')]"));
					
					int Count = attachmentsList.size();
					System.out.println("Payslip attachement count = "+Count);
					
				    soft.assertEquals(Count, 1);
					WebElement backBtn = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/div/a"));
					backBtn.click();
					Thread.sleep(4000);
					utilities.ChangeWindow.Switchwindow(1, m_Driver);

				
				
			}
			
			Reporter.log("verifyRecievedEmployeePayslip");

		} catch (Exception e) {
			System.out.println("Issue In verifyRecievedEmployeePayslip"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}
		
	}
	
	
	
	
	
	public void verifyRecievedEmployeeIEPSPayslip(int value)
	{
		
		
		try {
			
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));
			
			boolean con=list.isEmpty();
		     soft.assertFalse(con);
			for (int i=0;i<=19;i++)
			{
				
				List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));

				WebElement elem = list1.get(i);
				elem.click();
				
				Thread.sleep(3000);
				utilities.ChangeWindow.Switchwindow(3, m_Driver);
				WebElement tagData = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[4]/div/div/div[2]/div[2]/div/p[1]/span[2]"));
				
				String[] name = tagData.getText().split(" ");
				
				System.out.println(name[1]);
				
	              List<WebElement> employeelist = m_Driver.findElements(By.xpath("//*[contains(text(),'Employee Payslip')]"));
				
	              for(int j=0;j<=employeelist.size()-1;j++)
	              {
	            	  
	         
	            		String[] payslipname = employeelist.get(j).getText().split(" ");
	    				
	    				System.out.println(payslipname[4]);
	    				soft.assertEquals(name[1], payslipname[4]);
	    		     
	            	  
	              }
	            
				List<WebElement> attachmentsList = m_Driver.findElements(By.xpath("//*[contains(text(),'Employee Payslip')]"));
				
				int Count = attachmentsList.size();
				System.out.println("Payslip attachement count = "+Count);
				
			    soft.assertEquals(Count, value);
			    WebElement backBtn = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/div/a"));

				backBtn.click();
				Thread.sleep(4000);
				utilities.ChangeWindow.Switchwindow(1, m_Driver);
			}
			
			Reporter.log("verifyRecievedEmployeePayslip");

		} catch (Exception e) {
			System.out.println("Issue In verifyRecievedEmployeePayslip"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}
		
	}
	
	
	public void verifyRecievedEmployerIEPSPayslip(String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,String data12,String data13,String data14,String data15,String data16,String data17, String data18,String data19,String data20,int value)
	{
		
		
		try {
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));
			boolean con=list.isEmpty();
		     soft.assertFalse(con);
			 ArrayList<String> ar= new ArrayList<String>();
			 
				
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
				ar.add(data13);
				ar.add(data14);
				ar.add(data15);
				ar.add(data16);
				ar.add(data17);
				ar.add(data18);
				ar.add(data19);
				ar.add(data20);
			for (int i=0;i<=19;i++)
			{
				
				List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));

				WebElement elem = list1.get(i);
				elem.click();
				
				Thread.sleep(3000);
				utilities.ChangeWindow.Switchwindow(3, m_Driver);

				
						String[] name = ar.get(i).split(" ");
						

						 List<WebElement> employeelist = m_Driver.findElements(By.xpath("//*[contains(text(),'Employee Payslip')]"));
							
			              for(int j=0;j<=employeelist.size()-1;j++)
			              {
			            	  
			         
			            		String[] payslipname = employeelist.get(j).getText().split(" ");
			    				
			            		System.out.println(name[1]);
			    				System.out.println(payslipname[4]);
			    				soft.assertEquals(name[1], payslipname[4]);
			    		     
			            	  
			              }
			          	List<WebElement> attachmentsList = m_Driver.findElements(By.xpath("//*[contains(text(),'Employee Payslip')]"));
						
						int Count = attachmentsList.size();
						System.out.println("Payslip attachement count = "+Count);
						
					    soft.assertEquals(Count, value);
					    WebElement backBtn = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/div/a"));

						backBtn.click();
						Thread.sleep(4000);
						utilities.ChangeWindow.Switchwindow(1, m_Driver);

						
			      }
				
				
			Reporter.log("verifyRecievedEmployerIEPSPayslip");

		} catch (Exception e) {
			System.out.println("Issue In verifyRecievedEmployerIEPSPayslip"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}
		
	}
	
	
	public void verifyRecievedP60()
	{
		
		
		try {
			
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));
			
			boolean con=list.isEmpty();
		     soft.assertFalse(con);
			for (int i=0;i<=19;i++)
			{
				
				List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));

				WebElement elem = list1.get(i);
				elem.click();
				
				Thread.sleep(3000);
				utilities.ChangeWindow.Switchwindow(3, m_Driver);
				WebElement tagData = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[4]/div/div/div[2]/div[2]/div/p[1]/span[1]"));
				
				String[] name = tagData.getText().split(" ");
				
				System.out.println(name[1]);
				
	            WebElement  p60data= m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b"));
				
				String[] p60dataIndividual = p60data.getText().split(" ");
				
				System.out.println(p60dataIndividual[1]);

				soft.assertEquals(name[1].replaceAll(",", ""), p60dataIndividual[1]);
				
				List<WebElement> attachmentsList = m_Driver.findElements(By.xpath("//*[contains(text(),'.pdf')]"));
				
				int Count = attachmentsList.size();
				System.out.println("Payslip attachement count = "+Count);
				
			    soft.assertEquals(Count, 2);
			    WebElement backBtn = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/div/a"));

				backBtn.click();
				Thread.sleep(5000);
				utilities.ChangeWindow.Switchwindow(1, m_Driver);
			}
			
			Reporter.log("verifyRecievedP60");

		} catch (Exception e) {
			System.out.println("Issue In verifyRecievedP60"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}
		
	}
	
	

	public void verifyRecievedP11D()
	{
		
		
		try {
			
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));
			
			boolean con=list.isEmpty();
		     soft.assertFalse(con);
			for (int i=0;i<=19;i++)
			{

				List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));

				WebElement elem = list1.get(i);
				elem.click();
				
				Thread.sleep(3000);
				utilities.ChangeWindow.Switchwindow(3, m_Driver);
				
               WebElement subData = m_Driver.findElement(By.xpath("//*[contains(text(),'2024')]"));
				
				String[] subject = subData.getText().split(" ");
				
				System.out.println(subject[2]);
				
				soft.assertEquals(subject[2], "P11D");
				
				
				WebElement tagData = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[4]/div/div/div[2]/div[2]/div/p[1]/span[1]"));
				
				String[] name = tagData.getText().split(" ");
				
				System.out.println(name[1]);
				
	            WebElement  p11data= m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b"));
				
				String[] p11dataIndividual = p11data.getText().split(" ");
				
				System.out.println(p11dataIndividual[1]);

				soft.assertEquals(name[1].replaceAll(",", ""), p11dataIndividual[1]);
				
				List<WebElement> attachmentsList = m_Driver.findElements(By.xpath("//*[contains(text(),'.pdf')]"));
				
				int Count = attachmentsList.size();
				System.out.println("P11D attachement count = "+Count);
				
			    soft.assertEquals(Count, 2);

				WebElement backBtn = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/div/a"));				backBtn.click();
				Thread.sleep(4000);
				utilities.ChangeWindow.Switchwindow(1, m_Driver);
			}
			
			Reporter.log("verifyRecievedP11D");

		} catch (Exception e) {
			System.out.println("Issue In verifyRecievedP11D"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}
		
	}
	
	
	
	
	
	
	public void verifyRecievedP45()
	{
		
		
		try {
			
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));
			
			boolean con=list.isEmpty();
		     soft.assertFalse(con);
			for (int i=0;i<=19;i++)
			{
		
				List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));

				WebElement elem = list1.get(i);
				elem.click();
				
				Thread.sleep(3000);
				
				
               WebElement subData = m_Driver.findElement(By.xpath("//*[contains(text(),'2024')]"));
				
				String[] subject = subData.getText().split(" ");
				
				System.out.println(subject[2]);
				
				soft.assertEquals(subject[2], "P45");
				
				
				WebElement tagData = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/div[2]/div[2]/div/p[1]/font/span"));
				
				String[] name = tagData.getText().split(" ");
				
				System.out.println(name[1]);
				
	            WebElement  p11data= m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b"));
				
				String[] p11dataIndividual = p11data.getText().split(" ");
				
				System.out.println(p11dataIndividual[1]);

				soft.assertEquals(name[1].replaceAll(",", ""), p11dataIndividual[1]);
				
				List<WebElement> attachmentsList = m_Driver.findElements(By.xpath("//*[contains(text(),'.pdf')]"));
				
				int Count = attachmentsList.size();
				System.out.println("P11D attachement count = "+Count);
				
			    soft.assertEquals(Count, 2);
				WebElement backBtn = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_lbtn_ViewEmail']"));
				backBtn.click();
				Thread.sleep(4000);
			}
			
			Reporter.log("verifyRecievedP45");

		} catch (Exception e) {
			System.out.println("Issue In verifyRecievedP45"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}
		
	}
	
	
	public void verifyRecievedP45AfterDownload()
	{
		
		
		try {
			
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));
			
			boolean con=list.isEmpty();
		     soft.assertFalse(con);
			for (int i=0;i<=19;i++)
			{
		
				List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));

				WebElement elem = list1.get(i);
				elem.click();
				
				Thread.sleep(3000);
				utilities.ChangeWindow.Switchwindow(3, m_Driver);
			      WebElement subData = m_Driver.findElement(By.xpath("//*[contains(text(),'2025')]"));
	               
					
					String[] subject = subData.getText().split(" ");
					
					System.out.println(subject[2]);
					
					soft.assertEquals(subject[2], "P45");
					
				
				String FileName= m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).getText();
				String File=FileName.trim();
			    m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
			 
			 
              Thread.sleep(7000);
				
				WebElement tagData = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[4]/div/div/div[2]/div[2]/div/p[1]/font/span"));
				
				String[] name = tagData.getText().split(" ");
				
				System.out.println(name[1]);
				
			 
			     
	            WebElement  p45data= m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b"));
				
				String[] p45dataIndividual = p45data.getText().split(" ");
				
				System.out.println(p45dataIndividual[1]);

				soft.assertEquals(name[1].replaceAll(",", ""), p45dataIndividual[1]);
				
				List<WebElement> attachmentsList = m_Driver.findElements(By.xpath("//*[contains(text(),'.pdf')]"));
				
				int Count = attachmentsList.size();
				System.out.println("P11D attachement count = "+Count);
				
			    soft.assertEquals(Count, 2);
			    
			    File file = new File("C:\\Users\\Sonu Kumar\\Downloads\\"+File);
				PDDocument document = PDDocument.load(file);
				PDFTextStripper pdfStripper = new PDFTextStripper();
				String PDFtext = pdfStripper.getText(document);
				//System.out.println(PDFtext);
				 document.close();
				 
			     soft.assertTrue(PDFtext.contains(name[1].replaceAll(",", "")));
			     if(file.delete()) {
			    	 System.out.println("file deleted");
			     }
			     
				jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/div/a")));

//				WebElement backBtn = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_lbtn_ViewEmail']"));
//				backBtn.click();
				Thread.sleep(4000);
				utilities.ChangeWindow.Switchwindow(1, m_Driver);
			}
			Reporter.log("verifyRecievedP45AfterDownload");

			
		} catch (Exception e) {
			System.out.println("Issue In verifyRecievedP45AfterDownload"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}
		
	}
	
	
	public void verifyPayslipWithSummary() throws InterruptedException
	{
		
		Thread.sleep(9000);
		try {
			
			List<WebElement> attachmentsEmplyeeList = m_Driver.findElements(By.xpath("//*[contains(text(),'Employee Payslip')]"));
			
		
			int payslipCount = attachmentsEmplyeeList.size();
			System.out.println("Payslip attachement count = "+payslipCount);
			soft.assertEquals(payslipCount, 20);
			
			
       List<WebElement> attachmentsEmployerList = m_Driver.findElements(By.xpath("//*[contains(text(),'Employer')]"));
			
			int payrollSummaryCount = attachmentsEmployerList.size();
			System.out.println("payrollSummaryCount attachement count = "+payrollSummaryCount);
			soft.assertEquals(payrollSummaryCount, 1);
			Reporter.log("verifyPayslipWithSummary");

		} catch (Exception e) {
		
			System.out.println("Issue In verifyPayslipWithSummary"+ e);
		    soft.assertFalse(true,"welcome to catch block");

		}

	}
	
	
	
	public void verifyPayslipWithSummaryOneEmployee() throws InterruptedException
	{
		
		Thread.sleep(9000);
		try {
			
			List<WebElement> attachmentsEmplyeeList = m_Driver.findElements(By.xpath("//*[contains(text(),'Employee Payslip')]"));
			
		
			int payslipCount = attachmentsEmplyeeList.size();
			System.out.println("Payslip attachement count = "+payslipCount);
			soft.assertEquals(payslipCount, 1);
			
			
       List<WebElement> attachmentsEmployerList = m_Driver.findElements(By.xpath("//*[contains(text(),'Employer')]"));
			
			int payrollSummaryCount = attachmentsEmployerList.size();
			System.out.println("payrollSummaryCount attachement count = "+payrollSummaryCount);
			soft.assertEquals(payrollSummaryCount, 1);
			Reporter.log("verifyPayslipWithSummary");

		} catch (Exception e) {
		
			System.out.println("Issue In verifyPayslipWithSummary"+ e);
		    soft.assertFalse(true,"welcome to catch block");

		}

	}
	
	
	public void verifyPayslipWithSummary1()
	{
		
		try {
			
			List<WebElement> attachmentsEmplyeeList = m_Driver.findElements(By.xpath("//*[contains(text(),'Employee Payslip')]"));
			
		
			int payslipCount = attachmentsEmplyeeList.size();
			System.out.println("Payslip attachement count = "+payslipCount);
			soft.assertEquals(payslipCount, 20);
			
			
       List<WebElement> attachmentsEmployerList = m_Driver.findElements(By.xpath("//*[contains(text(),'Summary')]"));
			
			int payrollSummaryCount = attachmentsEmployerList.size();
			System.out.println("payrollSummaryCount attachement count = "+payrollSummaryCount);
			soft.assertEquals(payrollSummaryCount, 1);
			Reporter.log("verifyPayslipWithSummary");

		} catch (Exception e) {
		
			System.out.println("Issue In verifyPayslipWithSummary"+ e);
		    soft.assertFalse(true,"welcome to catch block");

		}

	}
	
	public void verifyPayslipWithoutSummary()
	{
		
		try {
			
			List<WebElement> attachmentsEmplyeeList = m_Driver.findElements(By.xpath("//*[contains(text(),'Employee Payslip')]"));

			
			int payslipCount = attachmentsEmplyeeList.size();
			System.out.println("Payslip attachement count = "+payslipCount);
			soft.assertEquals(payslipCount, 20);
			
			
       List<WebElement> attachmentsEmployerList = m_Driver.findElements(By.xpath("//*[contains(text(),'Employer')]"));
			
			int payrollSummaryCount = attachmentsEmployerList.size();
			System.out.println("payrollSummaryCount attachement count = "+payrollSummaryCount);
			soft.assertEquals(payrollSummaryCount, 0);
			Reporter.log("verifyPayslipWithSummary");

		} catch (Exception e) {
		
			System.out.println("Issue In verifyPayslipWithSummary"+ e);
		    soft.assertFalse(true,"welcome to catch block");

		}

	}
	
	public void verifyPayslipWithoutSummary1()
	{
		
		try {
			
			List<WebElement> attachmentsEmplyeeList = m_Driver.findElements(By.xpath("//*[contains(text(),'Employee Payslip')]"));

			
			
			int payslipCount = attachmentsEmplyeeList.size();
			System.out.println("Payslip attachement count = "+payslipCount);
			soft.assertEquals(payslipCount, 20);
			
			
       List<WebElement> attachmentsEmployerList = m_Driver.findElements(By.xpath("//*[contains(text(),'Summary')]"));
			
			int payrollSummaryCount = attachmentsEmployerList.size();
			System.out.println("payrollSummaryCount attachement count = "+payrollSummaryCount);
			soft.assertEquals(payrollSummaryCount, 0);
			Reporter.log("verifyPayslipWithSummary");

		} catch (Exception e) {
		
			System.out.println("Issue In verifyPayslipWithSummary"+ e);
		    soft.assertFalse(true,"welcome to catch block");

		}

	}
	
	
	
	public void verifySummaryWithoutPayslip()
	{
		
		try {
			
			List<WebElement> attachmentsEmplyeeList = m_Driver.findElements(By.xpath("//*[contains(text(),'Employee Payslip')]"));
			
			int payslipCount = attachmentsEmplyeeList.size();
			System.out.println("Payslip attachement count = "+payslipCount);
			soft.assertEquals(payslipCount, 0);
			
			
       List<WebElement> attachmentsEmployerList = m_Driver.findElements(By.xpath("//*[contains(text(),'Employer')]"));
			
			int payrollSummaryCount = attachmentsEmployerList.size();
			System.out.println("payrollSummaryCount attachement count = "+payrollSummaryCount);
			soft.assertEquals(payrollSummaryCount, 1);
			Reporter.log("verifySummaryWithoutPayslip");

		} catch (Exception e) {
		
			System.out.println("Issue In verifySummaryWithoutPayslip"+ e);
		    soft.assertFalse(true,"welcome to catch block");

		}

	}
	
	public void verifySummaryWithoutPayslip1()
	{
		
		try {
			
			List<WebElement> attachmentsEmplyeeList = m_Driver.findElements(By.xpath("//*[contains(text(),'Employee Payslip')]"));
			
			int payslipCount = attachmentsEmplyeeList.size();
			System.out.println("Payslip attachement count = "+payslipCount);
			soft.assertEquals(payslipCount, 0);
			
			
       List<WebElement> attachmentsEmployerList = m_Driver.findElements(By.xpath("//*[contains(text(),'Summary')]"));
			
			int payrollSummaryCount = attachmentsEmployerList.size();
			System.out.println("payrollSummaryCount attachement count = "+payrollSummaryCount);
			soft.assertEquals(payrollSummaryCount, 1);
			Reporter.log("verifySummaryWithoutPayslip");

		} catch (Exception e) {
		
			System.out.println("Issue In verifySummaryWithoutPayslip"+ e);
		    soft.assertFalse(true,"welcome to catch block");

		}

	}
	public void assertAll()
	{
		soft.assertAll();
		
	}
	
	
	
	public void verifyP60forEmployer()
	{
		
		try {
			
       List<WebElement> attachmentsEmployerList = m_Driver.findElements(By.xpath("//*[contains(text(),'.pdf')]"));
			
			int p60Reports = attachmentsEmployerList.size();
			System.out.println("p60 attachement count = "+p60Reports);
			soft.assertEquals(p60Reports, 40);
			Reporter.log("verifyP60forEmployer");

		} catch (Exception e) {
		
			System.out.println("Issue In verifyP60forEmployer"+ e);
		    soft.assertFalse(true,"welcome to catch block");

		}

	}
	
	
	
	public void verifyP11DforEmployer()
	{
		
		try {
			
			
		//	utilities.ChangeWindow.Switchwindow(3, m_Driver);
            WebElement subData = m_Driver.findElement(By.xpath("//*[contains(text(),'2024')]"));
				
				String[] subject = subData.getText().split(" ");
				
				System.out.println(subject[2]);
				
				soft.assertEquals(subject[2], "P11D");
			
       List<WebElement> attachmentsEmployerList = m_Driver.findElements(By.xpath("//*[contains(text(),'.pdf')]"));
			
			int p11DReports = attachmentsEmployerList.size();
			System.out.println("p60 attachement count = "+p11DReports);
			soft.assertEquals(p11DReports, 42);
			Reporter.log("verifyP60forEmployer");

		} catch (Exception e) {
		
			System.out.println("Issue In verifyP60forEmployer"+ e);
		    soft.assertFalse(true,"welcome to catch block");

		}

	}
	
	

	public void verifyP45forEmployer()
	{
		
		try {
			
			//utilities.ChangeWindow.Switchwindow(3, m_Driver);

            WebElement subData = m_Driver.findElement(By.xpath("//*[contains(text(),'2025')]"));
				
				String[] subject = subData.getText().split(" ");
				
				System.out.println(subject[3]);
				
				soft.assertEquals(subject[3], "P45");
			
       List<WebElement> attachmentsEmployerList = m_Driver.findElements(By.xpath("//*[contains(text(),'.pdf')]"));
			
			int p45DReports = attachmentsEmployerList.size();
			System.out.println("p45 attachement count = "+p45DReports);
			soft.assertEquals(p45DReports, 40);
			Reporter.log("verifyP60forEmployer");

		} catch (Exception e) {
		
			System.out.println("Issue In verifyP45forEmployer"+ e);
		    soft.assertFalse(true,"welcome to catch block");

		}

	}
	
	
	
	

	public void verifyRecievedAssessEmployee()
	{
		
		
		try {
			
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));
			
			boolean con=list.isEmpty();
		     soft.assertFalse(con);
			for (int i=0;i<=19;i++)
			{
		
				
				List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));

				WebElement elem = list1.get(i);
				elem.click();
				
				Thread.sleep(3000);
				
				utilities.ChangeWindow.Switchwindow(3, m_Driver);
				WebElement tagData = m_Driver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_divSubContent\"]/div[4]/div/div/div[2]/div[2]/div/p[1]/font"));
				
				String[] name = tagData.getText().split(" ");
				
				System.out.println(name[0]);
				
	            WebElement  p11data= m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b"));
				
				String[] EmrolmentIndividual = p11data.getText().split(" ");
				
				System.out.println(EmrolmentIndividual[1]);

				soft.assertEquals(name[0].replaceAll(",", ""), EmrolmentIndividual[1]);
				
				List<WebElement> attachmentsList = m_Driver.findElements(By.xpath("//*[contains(text(),'AUTOEN')]"));
				
				int Count = attachmentsList.size();
				System.out.println("Emrolment Letter = "+Count);
				
			    soft.assertEquals(Count, 1);
			    WebElement backBtn = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/div/a"));

				backBtn.click();
				Thread.sleep(4000);
				utilities.ChangeWindow.Switchwindow(1, m_Driver);

			}
			
			Reporter.log("verifyRecievedAssessEmployee");

		} catch (Exception e) {
			System.out.println("Issue In verifyRecievedAssessEmployee"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}
		
	}
	
	
	public void verifyRecievedAssessEmployer(String value)
	{
		
		
		try {
			
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));
			
			boolean con=list.isEmpty();
		     soft.assertFalse(con);
			for (int i=0;i<=19;i++)
			{
		
				
				List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));

				WebElement elem = list1.get(i);
				elem.click();
				
				Thread.sleep(3000);
				
				utilities.ChangeWindow.Switchwindow(3, m_Driver);
				WebElement tagData = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[4]/div/div/div[2]/div[2]/div/p[1]/span"));
				
				String[] name = tagData.getText().split(" ");
				
				System.out.println(name[1]);
				
	            WebElement  p11data= m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b"));
				
				String[] EmrolmentIndividual = p11data.getText().split(" ");
				
				System.out.println(EmrolmentIndividual[1]);

				soft.assertEquals(name[1].replaceAll(",", ""), value);
				
				List<WebElement> attachmentsList = m_Driver.findElements(By.xpath("//*[contains(text(),'AUTOEN')]"));
				
				int Count = attachmentsList.size();
				System.out.println("Emrolment Letter = "+Count);
				
			    soft.assertEquals(Count, 20);
//				WebElement backBtn = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_lbtn_ViewEmail']"));
//				backBtn.click();
//				Thread.sleep(4000);
			    break;
			}
			
			Reporter.log("verifyRecievedAssessEmployer");

		} catch (Exception e) {
			System.out.println("Issue In verifyRecievedAssessEmployer"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}
		
	}
	
	public void verifyRecievedEmployeePayslipOne() throws Exception
	{
		
		Thread.sleep(9000);
		try {
			
		
			 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));
			
			 System.out.println(list.size());
			boolean con=list.isEmpty();
		     soft.assertFalse(con);
		    
			for (int i=0;i<=1;i++)
			{
				
				List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));

				WebElement elem = list1.get(i);
				elem.click();
				
				Thread.sleep(3000);
				utilities.ChangeWindow.Switchwindow(4, m_Driver);
				
				WebElement tagData = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[4]/div/div/div[2]/div[2]/div/p[1]/span[2]"));

				String name = tagData.getText();
				
				//String[] name = tagData.getText().split(" ");

				//System.out.println(name[1]);
				System.out.println(name);
				
	            WebElement  payslipdata= m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b"));
				
				String[] payslipname = payslipdata.getText().split(" ");
				
				System.out.println(payslipname[4]);

				//soft.assertEquals(name[1], payslipname[4]);
				
				soft.assertEquals(name, payslipname[4]);

				
				List<WebElement> attachmentsList = m_Driver.findElements(By.xpath("//*[contains(text(),'Employee Payslip')]"));
				
				int Count = attachmentsList.size();
				System.out.println("Payslip attachement count = "+Count);
				
			    soft.assertEquals(Count, 1);
				WebElement backBtn = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/div/a"));
				backBtn.click();
				Thread.sleep(4000);
				utilities.ChangeWindow.Switchwindow(1, m_Driver);

			
			}
			Reporter.log("verifyRecievedEmployeePayslip ");

		} catch (Exception e) {
         System.out.println("Issue In verifyRecievedEmployeePayslip"+e);
 	    soft.assertFalse(true,"welcome to catch block");

		}
		
	}
	
	
	
	public void verifyRecievedEmployeePayslipOneEmployerView() throws Exception
	{
		
		Thread.sleep(9000);
		try {
			
		
			 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));
			
			 System.out.println(list.size());
			boolean con=list.isEmpty();
		     soft.assertFalse(con);
		    
			for (int i=0;i<=1;i++)
			{
				
				List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));

				WebElement elem = list1.get(i);
				elem.click();
				
				Thread.sleep(3000);
				utilities.ChangeWindow.Switchwindow(5, m_Driver);
				
				WebElement tagData = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[4]/div/div/div[2]/div[2]/div/p[1]/span[2]"));

				String name = tagData.getText();
				
				//String[] name = tagData.getText().split(" ");

				//System.out.println(name[1]);
				System.out.println(name);
				
	            WebElement  payslipdata= m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b"));
				
				String[] payslipname = payslipdata.getText().split(" ");
				
				System.out.println(payslipname[4]);

				//soft.assertEquals(name[1], payslipname[4]);
				
				soft.assertEquals(name, payslipname[4]);

				
				List<WebElement> attachmentsList = m_Driver.findElements(By.xpath("//*[contains(text(),'Employee Payslip')]"));
				
				int Count = attachmentsList.size();
				System.out.println("Payslip attachement count = "+Count);
				
			    soft.assertEquals(Count, 1);
				WebElement backBtn = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/div/a"));
				backBtn.click();
				Thread.sleep(4000);
				utilities.ChangeWindow.Switchwindow(1, m_Driver);

			
			}
			Reporter.log("verifyRecievedEmployeePayslip ");

		} catch (Exception e) {
         System.out.println("Issue In verifyRecievedEmployeePayslip"+e);
 	    soft.assertFalse(true,"welcome to catch block");

		}
		
		
		

		
	}
	
	
	
	public void verifyTop10EmployeesNI(String frequency) {

	    // Get top 3 employee rows from table
	    List<WebElement> employeeRows = m_Driver.findElements(
	            By.xpath("//table/tbody/tr[not(th)][position()<=10]"));

	    // Loop through each employee row
	    for (WebElement row : employeeRows) {

	        // Fetch employee name
	        String employeeName = row.findElement(
	                By.xpath(".//td[1]")).getText().trim();

	        // Fetch gross salary
	        String grossText = row.findElement(
	                By.xpath(".//td[5]")).getText()
	                .replace("£", "")
	                .replace(",", "")
	                .trim();

	        // Fetch Employee NI from UI
	        String employeeNIText = row.findElement(
	                By.xpath(".//td[10]")).getText()
	                .replace("£", "")
	                .replace(",", "")
	                .trim();

	        // Fetch Employer NI from UI
	        String employerNIText = row.findElement(
	                By.xpath(".//td[13]")).getText()
	                .replace("£", "")
	                .replace(",", "")
	                .trim();

	        // Convert String values to double
	        double grossSalary = Double.parseDouble(grossText);
	        double actualEmployeeNI = Double.parseDouble(employeeNIText);
	        double actualEmployerNI = Double.parseDouble(employerNIText);

	        // Declare threshold values
	        double primaryThreshold = 0.0;      // PT
	        double upperEarningsLimit = 0.0;    // UEL
	        double employerThreshold = 0.0;     // ST

	        // Set thresholds based on frequency
	        if (frequency.equalsIgnoreCase("Weekly")) {

	            primaryThreshold = 242.00;
	            upperEarningsLimit = 967.00;
	            employerThreshold = 96.00;

	        } else if (frequency.equalsIgnoreCase("Fortnightly")
	                || frequency.equalsIgnoreCase("Two Weekly")) {

	            primaryThreshold = 484.00;
	            upperEarningsLimit = 1934.00;
	            employerThreshold = 193.00;

	        } else if (frequency.equalsIgnoreCase("Four Weekly")) {

	            primaryThreshold = 967.00;
	            upperEarningsLimit = 3867.00;
	            employerThreshold = 385.00;

	        } else if (frequency.equalsIgnoreCase("Monthly")) {

	            primaryThreshold = 1048.00;
	            upperEarningsLimit = 4189.00;
	            employerThreshold = 417.00;

	        } else if (frequency.equalsIgnoreCase("Quarterly")) {

	            primaryThreshold = 3143.00;
	            upperEarningsLimit = 12568.00;
	            employerThreshold = 1250.00;

	        } else if (frequency.equalsIgnoreCase("Half Yearly")) {

	            primaryThreshold = 6285.00;
	            upperEarningsLimit = 25135.00;
	            employerThreshold = 2500.00;

	        } else if (frequency.equalsIgnoreCase("Annually")
	                || frequency.equalsIgnoreCase("Yearly")) {

	            primaryThreshold = 12570.00;
	            upperEarningsLimit = 50270.00;
	            employerThreshold = 5000.00;

	        } else {

	            System.out.println("Invalid Frequency Selected");
	            return;
	        }

	        // Employee NI rate below UEL = 8%
	        double employeeRateBelowLimit = 0.08;

	        // Employee NI rate above UEL = 2%
	        double employeeRateAboveLimit = 0.02;

	        // Employer NI rate = 15%
	        double employerRate = 0.15;

	        // Initialize expected values
	        double expectedEmployeeNI = 0.0;
	        double expectedEmployerNI = 0.0;

	        // Employee NI calculation
	        if (grossSalary > primaryThreshold) {

	            // If salary is within UEL
	            if (grossSalary <= upperEarningsLimit) {

	                expectedEmployeeNI =
	                        (grossSalary - primaryThreshold)
	                                * employeeRateBelowLimit;

	            } else {

	                // If salary is above UEL
	                expectedEmployeeNI =
	                        ((upperEarningsLimit - primaryThreshold)
	                                * employeeRateBelowLimit)

	                                +

	                        ((grossSalary - upperEarningsLimit)
	                                * employeeRateAboveLimit);
	            }
	        }

	        // Employer NI calculation
	        if (grossSalary > employerThreshold) {

	            expectedEmployerNI =
	                    (grossSalary - employerThreshold)
	                            * employerRate;
	        }

	        // Round values to 2 decimal places
	        expectedEmployeeNI =
	                Math.round(expectedEmployeeNI * 100.0) / 100.0;

	        expectedEmployerNI =
	                Math.round(expectedEmployerNI * 100.0) / 100.0;

	        // Print values for debugging
	        System.out.println("Employee Name : " + employeeName);
	        System.out.println("Frequency : " + frequency);
	        System.out.println("Gross Salary : £" + grossSalary);

	        System.out.println("Expected Employee NI : £" + expectedEmployeeNI);
	        System.out.println("Actual Employee NI : £" + actualEmployeeNI);

	        System.out.println("Expected Employer NI : £" + expectedEmployerNI);
	        System.out.println("Actual Employer NI : £" + actualEmployerNI);

	        // Validate Employee NI
	      assertEquals(
	                actualEmployeeNI,
	                expectedEmployeeNI,
	                "Employee NI mismatch for : " + employeeName
	        );

	        // Validate Employer NI
	       assertEquals(
	                actualEmployerNI,
	                expectedEmployerNI,
	                "Employer NI mismatch for : " + employeeName
	        );
	    }
	}	
	
	
	
	
	public void verifyTop10EmployeesFreeportNI(String frequency) {

	    // Get top 10 employee rows
	    List<WebElement> employeeRows = m_Driver.findElements(
	            By.xpath("//table/tbody/tr[not(th)][position()<=10]"));

	    for (WebElement row : employeeRows) {

	        String employeeName = row.findElement(
	                By.xpath(".//td[1]")).getText().trim();

	        String grossText = row.findElement(
	                By.xpath(".//td[5]")).getText()
	                .replace("£", "")
	                .replace(",", "")
	                .trim();

	        String employeeNIText = row.findElement(
	                By.xpath(".//td[10]")).getText()
	                .replace("£", "")
	                .replace(",", "")
	                .trim();

	        String employerNIText = row.findElement(
	                By.xpath(".//td[13]")).getText()
	                .replace("£", "")
	                .replace(",", "")
	                .trim();

	        double grossSalary = Double.parseDouble(grossText);
	        double actualEmployeeNI = employeeNIText.isEmpty()
	                ? 0.0 : Double.parseDouble(employeeNIText);

	        double actualEmployerNI = employerNIText.isEmpty()
	                ? 0.0 : Double.parseDouble(employerNIText);

	        double primaryThreshold = 0.0;
	        double upperEarningsLimit = 0.0;

	        // Thresholds by frequency
	        if (frequency.equalsIgnoreCase("Weekly")) {
	            primaryThreshold = 242.00;
	            upperEarningsLimit = 967.00;

	        } else if (frequency.equalsIgnoreCase("Fortnightly")
	                || frequency.equalsIgnoreCase("Two Weekly")) {
	            primaryThreshold = 484.00;
	            upperEarningsLimit = 1934.00;

	        } else if (frequency.equalsIgnoreCase("Four Weekly")) {
	            primaryThreshold = 967.00;
	            upperEarningsLimit = 3867.00;

	        } else if (frequency.equalsIgnoreCase("Monthly")) {
	            primaryThreshold = 1048.00;
	            upperEarningsLimit = 4189.00;

	        } else if (frequency.equalsIgnoreCase("Quarterly")) {
	            primaryThreshold = 3143.00;
	            upperEarningsLimit = 12568.00;

	        } else if (frequency.equalsIgnoreCase("Half Yearly")) {
	            primaryThreshold = 6285.00;
	            upperEarningsLimit = 25135.00;

	        } else if (frequency.equalsIgnoreCase("Annually")
	                || frequency.equalsIgnoreCase("Yearly")) {
	            primaryThreshold = 12570.00;
	            upperEarningsLimit = 50270.00;
	        }

	        double employeeRateBelowLimit = 0.08; // 8%
	        double employeeRateAboveLimit = 0.02; // 2%

	        double expectedEmployeeNI = 0.0;
	        double expectedEmployerNI = 0.0; // Freeport Employer NI = 0

	        // Employee NI calculation
	        if (grossSalary > primaryThreshold) {

	            if (grossSalary <= upperEarningsLimit) {

	                expectedEmployeeNI =
	                        (grossSalary - primaryThreshold)
	                                * employeeRateBelowLimit;

	            } else {

	                expectedEmployeeNI =
	                        ((upperEarningsLimit - primaryThreshold)
	                                * employeeRateBelowLimit)
	                        +
	                        ((grossSalary - upperEarningsLimit)
	                                * employeeRateAboveLimit);
	            }
	        }

	        expectedEmployeeNI =
	                Math.round(expectedEmployeeNI * 100.0) / 100.0;

	        assertEquals(actualEmployeeNI, expectedEmployeeNI,
	                "Freeport Employee NI mismatch for : " + employeeName);

	        assertEquals(actualEmployerNI, expectedEmployerNI,
	                "Freeport Employer NI mismatch for : " + employeeName);
	    }
	}
	
	
	
	public void verifyTop10EmployeesDirectorNI() {

	    // Get top 10 employee rows
	    List<WebElement> employeeRows = m_Driver.findElements(
	            By.xpath("//table/tbody/tr[not(th)][position()<=10]"));

	    for (WebElement row : employeeRows) {

	        String employeeName = row.findElement(
	                By.xpath(".//td[1]")).getText().trim();

	        String grossText = row.findElement(
	                By.xpath(".//td[5]")).getText()
	                .replace("£", "")
	                .replace(",", "")
	                .trim();

	        String employeeNIText = row.findElement(
	                By.xpath(".//td[10]")).getText()
	                .replace("£", "")
	                .replace(",", "")
	                .trim();

	        String employerNIText = row.findElement(
	                By.xpath(".//td[13]")).getText()
	                .replace("£", "")
	                .replace(",", "")
	                .trim();

	        double grossSalary = Double.parseDouble(grossText);
	        double actualEmployeeNI = employeeNIText.isEmpty()
	                ? 0.0 : Double.parseDouble(employeeNIText);

	        double actualEmployerNI = employerNIText.isEmpty()
	                ? 0.0 : Double.parseDouble(employerNIText);

	        // Director uses yearly thresholds
	        double primaryThreshold = 12570.00;
	        double upperEarningsLimit = 50270.00;
	        double employerThreshold = 5000.00;

	        double employeeRateBelowLimit = 0.08; // 8%
	        double employeeRateAboveLimit = 0.02; // 2%
	        double employerRate = 0.15;           // 15%

	        double expectedEmployeeNI = 0.0;
	        double expectedEmployerNI = 0.0;

	        // Employee NI calculation
	        if (grossSalary > primaryThreshold) {

	            if (grossSalary <= upperEarningsLimit) {

	                expectedEmployeeNI =
	                        (grossSalary - primaryThreshold)
	                                * employeeRateBelowLimit;

	            } else {

	                expectedEmployeeNI =
	                        ((upperEarningsLimit - primaryThreshold)
	                                * employeeRateBelowLimit)
	                        +
	                        ((grossSalary - upperEarningsLimit)
	                                * employeeRateAboveLimit);
	            }
	        }

	        // Employer NI calculation
	        if (grossSalary > employerThreshold) {

	            expectedEmployerNI =
	                    (grossSalary - employerThreshold)
	                            * employerRate;
	        }

	        expectedEmployeeNI =
	                Math.round(expectedEmployeeNI * 100.0) / 100.0;

	        expectedEmployerNI =
	                Math.round(expectedEmployerNI * 100.0) / 100.0;

	        assertEquals(actualEmployeeNI, expectedEmployeeNI,
	                "Director Employee NI mismatch for : " + employeeName);

	        assertEquals(actualEmployerNI, expectedEmployerNI,
	                "Director Employer NI mismatch for : " + employeeName);
	    }
	}
	public void verifyIncomeTax(String frequency) {

	    int periods = Map.of(
	            "WEEKLY", 52,
	            "FORTNIGHTLY", 26,
	            "FOUR_WEEKLY", 13,
	            "MONTHLY", 12,
	            "QUARTERLY", 4,
	            "HALF_YEARLY", 2,
	            "ANNUALLY", 1
	    ).getOrDefault(frequency.toUpperCase(), 12);

	    List<WebElement> rows = m_Driver.findElements(
	            By.xpath("//table/tbody/tr[not(th)][position()<=10]"));

	    for (WebElement row : rows) {

	        String name = row.findElement(By.xpath(".//td[1]")).getText().trim();
	        String code = row.findElement(By.xpath(".//td[2]")).getText().trim();

	        double gross = Double.parseDouble(
	                row.findElement(By.xpath(".//td[5]"))
	                        .getText().replace("£", "").replace(",", "").trim());

	        double actTax = Double.parseDouble(
	                row.findElement(By.xpath(".//td[6]"))
	                        .getText().replace("£", "").replace(",", "").trim());

	        // =========================
	        // ✔ FIXED: W1/M1 cleaning (UNCHANGED)
	        // =========================
	        String taxCode = code.toUpperCase()
	                .replaceAll("\\s+", "")
	                .replaceAll("\\(W1/M1\\)", "")
	                .replaceAll("\\(M1/W1\\)", "")
	                .replaceAll("W1M1", "")
	                .replaceAll("W1", "")
	                .replaceAll("M1", "")
	                .trim();

	        // =========================
	        // ✔ ALLOWANCE
	        // =========================
	        double allowanceAnnual = 0.0;

	        if (!taxCode.equals("NT") &&
	            !taxCode.equals("BR") &&
	            !taxCode.equals("D0") &&
	            !taxCode.equals("D1")) {

	            String digits = taxCode.replaceAll("[^0-9]", "");

	            if (!digits.isEmpty()) {
	                allowanceAnnual = Double.parseDouble(digits) * 10;
	            }
	        }

	        double periodAllowance = allowanceAnnual / periods;

	        // =========================
	        // ✔ ONLY CHANGE: K CODE LOGIC
	        // =========================
	        boolean isKCode = taxCode.startsWith("K");

	        double taxable;

	        if (isKCode) {
	            taxable = gross + periodAllowance;   // ✅ K code (K585 etc.)
	        } else {
	            taxable = Math.max(0, gross - periodAllowance); // existing logic
	        }

	        // =========================
	        // ✔ TAX CALCULATION (UNCHANGED)
	        // =========================
	        double periodTax = 0.0;

	        double BASIC = 37700.0 / periods;
	        double HIGH  = 125140.0 / periods;

	        if (taxCode.equals("NT")) {

	            periodTax = 0;

	        } else if (taxCode.equals("BR")) {

	            periodTax = gross * 0.20;

	        } else if (taxCode.equals("D0")) {

	            periodTax = gross * 0.40;

	        } else if (taxCode.equals("D1")) {

	            periodTax = gross * 0.45;

	        } else if (taxCode.startsWith("S") && taxCode.endsWith("L")) {

	            double b1 = 3967.0 / periods;
	            double b2 = 16956.0 / periods;
	            double b3 = 31092.0 / periods;
	            double b4 = 62430.0 / periods;
	            double b5 = 125140.0 / periods;

	            if (taxable > 0)
	                periodTax += Math.min(taxable, b1) * 0.19;

	            if (taxable > b1)
	                periodTax += (Math.min(taxable, b2) - b1) * 0.20;

	            if (taxable > b2)
	                periodTax += (Math.min(taxable, b3) - b2) * 0.21;

	            if (taxable > b3)
	                periodTax += (Math.min(taxable, b4) - b3) * 0.42;

	            if (taxable > b4)
	                periodTax += (Math.min(taxable, b5) - b4) * 0.45;

	            if (taxable > b5)
	                periodTax += (taxable - b5) * 0.48;

	        } else {

	            if (taxable > 0)
	                periodTax += Math.min(taxable, BASIC) * 0.20;

	            if (taxable > BASIC)
	                periodTax += (Math.min(taxable, HIGH) - BASIC) * 0.40;

	            if (taxable > HIGH)
	                periodTax += (taxable - HIGH) * 0.45;
	        }

	        double expTax = Math.round(periodTax * 100.0) / 100.0;
	        double tolerance = 1.00;

	        boolean pass = Math.abs(actTax - expTax) <= tolerance;

	        Reporter.log("================================", true);
	        Reporter.log("Name   : " + name, true);
	        Reporter.log("Code   : " + taxCode, true);
	        Reporter.log("Gross  : £" + gross, true);
	        Reporter.log("Allow  : £" + allowanceAnnual, true);
	        Reporter.log("Exp    : £" + expTax, true);
	        Reporter.log("Act    : £" + actTax, true);
	        Reporter.log("Result : " + (pass ? "PASS" : "FAIL"), true);
	        Reporter.log("================================", true);

	        assertTrue(pass,
	                "Income Tax mismatch for " + name +
	                " [" + taxCode + "] [" + frequency + "]\n" +
	                "Expected: £" + expTax +
	                " | Actual: £" + actTax);

	        Reporter.log("");
	    }
	}
}
