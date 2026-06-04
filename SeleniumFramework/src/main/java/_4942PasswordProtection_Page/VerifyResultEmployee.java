package _4942PasswordProtection_Page;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import pages.BasePage;


public class VerifyResultEmployee extends BasePage {

	public VerifyResultEmployee(WebDriver driver) {
		
		super(driver);
	
	}
	static String PDFtext;
	SoftAssert soft= new SoftAssert();

	private By EmployeeNoElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_RBEmpPwd_1']");
	 private static String fileDownloadpath = "C:\\Users\\Sonu\\Downloads";

     private By employerNO= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_RBEmplrPwd_1']");
	 
	 public void verifyFile(String fileName){


		Assert.assertTrue(isFileDownloaded(fileDownloadpath, fileName), "Failed to download Expected document");

		File directory = new File(fileDownloadpath);

		File[] content = directory.listFiles();
		 
		
		 for (int i = 0; i < content.length; i++) {
		 if (content[i].getName().equals(fileName))
		 {
			 content[i].delete();
			 System.out.println("File Deleted");
		      break;
		 }
		 }
				
		}

	 
	 public void verifywCsvFile(){


			Assert.assertTrue(isFileDownloaded(fileDownloadpath, "PayrollReportingPeriodSummary-2022-2023.csv"), "Failed to download Expected document");
			
	
			}
		// Check the downloaded file in the download folder

		

	   public boolean isFileDownloaded(String fileDownloadpath, String fileName) {

		boolean flag = false;

		File directory = new File(fileDownloadpath);

		File[] content = directory.listFiles();
		 
		
		 for (int i = 0; i < content.length; i++) {
		 if (content[i].getName().equals(fileName))
			 
			
			 
			 
		return flag=true;
	
		
		
		//content[i].delete();
		
		
		  		}
		return flag;
	
		 }



	


	public void PasswordNotEnabledEmployee() throws Exception
	{
		WebElement elem = getWebElement(EmployeeNoElem);

		
		boolean enabled = elem.isSelected();
		
      soft. assertTrue(enabled,"Element is disable");
        Thread.sleep(3000);
		Reporter.log(" Employee Password Protection Is Not Enabled");
  
      
		
	}
	
	

	public void PasswordNotEnabled() throws Exception
	{
		WebElement elem = getWebElement(employerNO);

		
		boolean enabled = elem.isSelected();
		
        assertTrue(enabled,"Element is disable");
        Thread.sleep(3000);
		Reporter.log("Password Protection Is Not Enabled");
  
      
		
	}
	
	public void Verify26EmployeePassword()
	{
		List<WebElement> list=m_Driver.findElements(By.xpath("//*[@class='attachments']/ul/li"));
		
		for(int i=0;i<=list.size()-1;i++)
		{
			List<WebElement> list1=m_Driver.findElements(By.xpath("//*[@class='attachments']/ul/li"));
			if(i<=25)
			{
			String fileName[]=list1.get(i).getText().split("_");
			System.out.println(fileName[0]);
			String [] data=fileName[1].split(" ");
			
			soft.assertEquals("pp.pdf", data[0]);
			}
			
		}
		
		
		
	}
	
	
	public void Verify26EmployerPassword()
	{
		List<WebElement> list=m_Driver.findElements(By.xpath("//*[@class='attachments']/ul/li"));
		
		for(int i=0;i<=list.size()-1;i++)
		{
			List<WebElement> list1=m_Driver.findElements(By.xpath("//*[@class='attachments']/ul/li"));
			
			String fileName[]=list1.get(i).getText().split("_");
			System.out.println(fileName[0]);
			String [] data=fileName[1].split(" ");
			
			soft.assertEquals("pp.pdf", data[0]);
			
			
		}
		
		
		
	}
	
	

	public void VerifPPFile()
	{
		List<WebElement> list=m_Driver.findElements(By.xpath("//*[@class='attachments0 col-lg-12 col-md-12 col-sm-12']/ul/li"));
		
		for(int i=0;i<=list.size()-1;i++)
		{
			List<WebElement> list1=m_Driver.findElements(By.xpath("//*[@class='attachments0 col-lg-12 col-md-12 col-sm-12']/ul/li"));
			
			String fileName[]=list1.get(i).getText().split("_");
			System.out.println(fileName[0]);
			String [] data=fileName[1].split(" ");
			
			soft.assertEquals("pp.pdf", data[0]);
			
			
		}
		
		
		
	}
	
	
	
	public void VerifyRecivedPayrollSummaryUnprotected(String Text) throws  Exception
	{
	
		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl01_lbtnFileName']/b")).click();
		

        Thread.sleep(11000);

			File file = new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2025-04-30.pdf");

            PDDocument document = PDDocument.load(file);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			PDFtext = pdfStripper.getText(document);
			
			//System.out.println(PDFtext);
			document.close();
			
			System.out.println(PDFtext);
			
			soft.assertTrue(PDFtext.contains(Text));
			
			Reporter.log("Verify Recieved Email is Unprotected");
			
			 if(file.delete())
			System.out.println("file deleted");
			 
			 
}
	
	

	public void VerifyRecivedPaySlipUnprotected(String Text) throws  Exception
	{
	
		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		

        Thread.sleep(11000);

			File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2025-04-30.pdf");

            PDDocument document = PDDocument.load(file);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			PDFtext = pdfStripper.getText(document);
			
			//System.out.println(PDFtext);
			document.close();
			
			System.out.println(PDFtext);
			
			soft.assertTrue(PDFtext.contains(Text));
			
			Reporter.log("Verify Recieved Email is Unprotected");
			
			 if(file.delete())
			System.out.println("file deleted");
			 
			 
}
	
	public void verifyAppearPasswordPage(String passPage)
	{
		
		String actualPage = m_Driver.findElement(By.xpath("(//*[text()='Generate Password'])[2]")).getText();
		System.out.println("actualPage  ="+actualPage);
		
       soft. assertEquals(actualPage, passPage);		
        
        Reporter.log("Verify Generete Password Page");
      
      
		
	}
	
	public void verifyTagsAndText()
	{
		
		
		WebElement select_drop_down = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_ddlPasswordTags']"));
		
		Select select = new Select(select_drop_down);
		
		String [] verify=  {"Select","First Name","Last Name","Tax Code","Post Code","Last 4 digit of NI Number","NI Number"};
	     int k=0;
		List<WebElement> all_options = select.getOptions();
		
		int data=all_options.size();
		
		for(int i=0;i<=all_options.size()-1;i++)
		{
		List<WebElement> all_options2 = select.getOptions();

		
		String value=all_options2.get(i).getText();
		System.out.println(value);
		
		soft .assertEquals(verify[k], value);
	   
		k++;	
		}
		
		boolean text = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_textPassword2']")).isEnabled();
		
		soft.assertTrue(text,"Password text Not Enabled");

		
	}
	

	public void verifyEnterdPassword(String ExpectedPassword) throws Exception
	{
		//jsExec.executeScript("window.scrollBy(0,1000)");
		String actualpassword = m_Driver.findElement(By.xpath("//table[contains(@class,'activity-table-modern')]/tbody/tr[last()]/td[1]")).getText();
		System.out.println("actualpassword  ="+actualpassword);
		
       soft. assertEquals(actualpassword, ExpectedPassword);		
         
        Thread.sleep(1000);
       
        m_Driver.findElement(By.xpath("//*[@id=\"FAAddEmailClose\"]/span")).click();
       
        Reporter.log("Verify passsword");
        
		
		
	}
	
	public  void VerifyRecivedPayslipPasswordProtected(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2025-04-30_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		 PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2025-04-30_pp.pdf"), "SuMit@007");
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
//		       
//		     } catch (IOException e){  
//		       System.err.println("Exception while trying to read pdf document - " + e);  
//			   soft.assertFalse(true,"welcome to catch block");
//
//		     }  
		     
	       soft.assertTrue(PDFtext.contains(Text));
	       document.close();
	       
		   if(file.delete())
		   		System.out.println("file deleted");

		Reporter.log("VerifyRecivedPayrollSummaryWithPassword");
		
		
	}
	
	public  void VerifyRecivedPayslipPasswordProtected1(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2025-04-30_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2025-04-30_pp.pdf"), "123@SoNU90");  
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document); 
		       document.close();

		    //   System.out.println(PDFtext); 
//		       
//		     } catch (IOException e){  
//		       System.err.println("Exception while trying to read pdf document - " + e);  
//			   soft.assertFalse(true,"welcome to catch block");
//
//		     }  
//		     
	       soft.assertTrue(PDFtext.contains(Text));

		   if(file.delete())
		   		System.out.println("file deleted");

		Reporter.log("VerifyRecivedPayslipPasswordProtected1");
		
		
	}
	
	
	
	
	
	
	
	public  void xyz(String Text,String pass,String location,String FileFound) throws Exception
	{
	File file = new File(location);

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ct"+FileFound+"_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		 try (PDDocument document = PDDocument.load(new File(location), pass)) {  
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		     } catch (IOException e){  
		       System.err.println("Exception while trying to read pdf document - " + e);  
			   soft.assertFalse(true,"welcome to catch block");

		     }  
		     
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		Reporter.log("VerifyRecivedPayslipPasswordProtected1");
		
		
	}
	

	public  void VerifyRecivedPayslipPasswordProtected2(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2025-04-30_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		 PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2025-04-30_pp.pdf"), "Suraj"); 
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		      document.close();
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		Reporter.log("VerifyRecivedPayslipPasswordProtected2");
		
		
	}
	
	public  void VerifyRecivedPayslipPasswordProtected4(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2025-04-30_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		 PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2025-04-30_pp.pdf"), "Suraj@#977"); 
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		      
		    //   System.out.println(PDFtext); 
		       
//		     } catch (IOException e){  
//		       System.err.println("Exception while trying to read pdf document - " + e);  
//			   soft.assertFalse(true,"welcome to catch block");
//
//		     }  
		       document.close();

	       soft.assertTrue(PDFtext.contains(Text));

		   if(file.delete())
		   		System.out.println("file deleted");

		Reporter.log("VerifyRecivedPayslipPasswordProtected2");
		
		
	}
	
	
	
	
	public  void VerifyRecivedPayslipPasswordProtected6(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2025-04-30_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2025-04-30_pp.pdf"), "Singh"); 
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		      document.close();
		     
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		Reporter.log("VerifyRecivedPayslipPasswordProtected2");
		
		
	}
	
	
	public  void VerifyRecivedPayslipPasswordProtected8(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2025-04-30_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		 PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2025-04-30_pp.pdf"), "Singh#@123");  
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		      document.close();
		    
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		Reporter.log("VerifyRecivedPayslipPasswordProtected2");
		
		
	}
	
	
	public  void VerifyRecivedPayslipPasswordProtected10(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2025-04-30_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2025-04-30_pp.pdf"), "1257L");
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		      
		      document.close();
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		Reporter.log("VerifyRecivedPayslipPasswordProtected");
		
		
	}
	
	
	public  void VerifyRecivedZIPPayslipPasswordProtected() throws Exception
	{
	///File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[24097] - 2022-04-30_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
//		 try (PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[24097] - 2022-04-30_pp.pdf"), "1257L")) {  
//		       document.setAllSecurityToBeRemoved(true);  
//		       PDFTextStripper reader = new PDFTextStripper();  
//		      PDFtext = reader.getText(document);  
//		    //   System.out.println(PDFtext); 
//		       
//		     } catch (IOException e){  
//		       System.err.println("Exception while trying to read pdf document - " + e);  
//		       
//		     }  
//		     
//	       //soft.assertTrue(PDFtext.contains(Text));
//
//
//		   if(file.delete())
//		   		System.out.println("file deleted");

		Reporter.log("VerifyRecivedPayslipPasswordProtected");
		
		
	}

	public  void VerifyRecivedPayslipPasswordProtected14(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2025-04-30_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		 PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2025-04-30_pp.pdf"), "HA38DP");
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		      document.close();
		     
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		Reporter.log("VerifyRecivedPayslipPasswordProtected");
		
		
	}
	
	
	
	
	public  void VerifyRecivedPayslipPasswordProtected16(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2025-04-30_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		 PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2025-04-30_pp.pdf"), "8998");  
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		      document.close();
		     
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		Reporter.log("VerifyRecivedPayslipPasswordProtected");
		
		
	}
	
	public  void VerifyRecivedPayslipPasswordProtected18(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2025-04-30_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		 PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2025-04-30_pp.pdf"), "NA128998B");
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		      document.close();
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		Reporter.log("VerifyRecivedPayslipPasswordProtected");
		
		
	}
	
	public  void VerifyRecivedPayslipPasswordProtected20(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Manish Sharma[42807] - 2025-06-30_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Manish Sharma[42807] - 2025-06-30_pp.pdf"), "BH348945B");
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		      document.close();
		     
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		   
		   
		Reporter.log("VerifyRecivedPayslipPasswordProtected");
		
		
	}
	

	public  void VerifyRecivedPayslipPasswordProtected23(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Manish Sharma[42807] - 2025-07-31_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		 PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Manish Sharma[42807] - 2025-07-31_pp.pdf"), "8945");
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		      document.close();
		     
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		   
		   
		Reporter.log("VerifyRecivedPayslipPasswordProtected");
		
		
	}
	
	public  void VerifyRecivedPayslipPasswordProtected21(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Rana Kumar[42808] - 2025-06-30_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl01_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		 PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Rana Kumar[42808] - 2025-06-30_pp.pdf"), "AB128998C");
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		      document.close();
		     
		     
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		   
		   
		Reporter.log("VerifyRecivedPayslipPasswordProtected");
		
		
	}
	
	
	public  void VerifyRecivedPayslipPasswordProtected24(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Rana Kumar[42808] - 2025-07-31_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl01_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		 PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Rana Kumar[42808] - 2025-07-31_pp.pdf"), "8998");  
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		      document.close();
		     
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		   
		   
		Reporter.log("VerifyRecivedPayslipPasswordProtected");
		
		
	}


	
	public  void VerifyRecivedPayslipPasswordProtected22(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Rana Kumar[42808] - 2025-06-30_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		 PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Rana Kumar[42808] - 2025-06-30_pp.pdf"), "AB128998C");
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		      document.close();
		   
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		   
		   
		Reporter.log("VerifyRecivedPayslipPasswordProtected");
		
		
	}

	

	public  void VerifyRecivedPayslipPasswordProtected25(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Rana Kumar[42808] - 2025-07-31_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		 PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Rana Kumar[42808] - 2025-07-31_pp.pdf"), "8998"); 
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		      document.close(); 
		     
		     
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		   
		   
		Reporter.log("VerifyRecivedPayslipPasswordProtected");
		
		
	}
	
	public  void VerifyRecivedPayslipPasswordProtected26(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2025-07-31_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
	PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2025-07-31_pp.pdf"), "1257L");
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		      document.close();
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");		   
		   
		Reporter.log("VerifyRecivedPayslipPasswordProtected");
		
		
	}
	
	
	public  void VerifyRecivedPayslipPasswordProtected27(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2025-04-30_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		 PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2025-04-30_pp.pdf"), "1257L");
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		      document.close();
		     
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		   
		   
		Reporter.log("VerifyRecivedPayslipPasswordProtected");
		
		
	}
	
	
	public  void VerifyRecivedPayslipPasswordProtected28(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Manish Sharma[42807] - 2025-04-30_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		 try (PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Manish Sharma[42807] - 2025-04-30_pp.pdf"), "8945")) {  
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		     } catch (IOException e){  
		       System.err.println("Exception while trying to read pdf document - " + e);  
			   soft.assertFalse(true,"welcome to catch block");

		     }  
		     
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		   
		   
		Reporter.log("VerifyRecivedPayslipPasswordProtected");
		
		
	}
	
	public  void VerifyRecivedPayslipPasswordProtected29(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Manish Sharma[42807] - 2025-04-30_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		 try (PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Manish Sharma[42807] - 2025-04-30_pp.pdf"), "Manish")) {  
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		     } catch (IOException e){  
		       System.err.println("Exception while trying to read pdf document - " + e);  
			   soft.assertFalse(true,"welcome to catch block");

		     }  
		     
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		   
		   
		Reporter.log("VerifyRecivedPayslipPasswordProtected");
		
		
	}
	

	public  void VerifyRecivedPayslipPasswordProtected30(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Manish Sharma[42807] - 2025-04-30_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		 try (PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Manish Sharma[42807] - 2025-04-30_pp.pdf"), "Sharma")) {  
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		     } catch (IOException e){  
		       System.err.println("Exception while trying to read pdf document - " + e);  
			   soft.assertFalse(true,"welcome to catch block");

		     }  
		     
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		   
		   
		Reporter.log("VerifyRecivedPayslipPasswordProtected");
		
		
	}
	
	public  void VerifyRecivedPayslipPasswordProtected31(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Manish Sharma[42807] - 2025-04-30_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		 try (PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Manish Sharma[42807] - 2025-04-30_pp.pdf"), "1257L")) {  
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		     } catch (IOException e){  
		       System.err.println("Exception while trying to read pdf document - " + e);  
			   soft.assertFalse(true,"welcome to catch block");

		     }  
		     
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		   
		   
		Reporter.log("VerifyRecivedPayslipPasswordProtected");
		
		
	}
	
	public  void VerifyRecivedPayslipPasswordProtected33(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Manish Sharma[42807] - 2025-04-30_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		 try (PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Manish Sharma[42807] - 2025-04-30_pp.pdf"), "HA38DP")) {  
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		     } catch (IOException e){  
		       System.err.println("Exception while trying to read pdf document - " + e);  
			   soft.assertFalse(true,"welcome to catch block");

		     }  
		     
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		   
		   
		Reporter.log("VerifyRecivedPayslipPasswordProtected");
		
		
	}
	
	
	
	
	public  void VerifyRecivedPayslipPasswordProtected34(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Amarpali Singh[24124] - 2022-04-30_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		 try (PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Amarpali Singh[24124] - 2022-04-30_pp.pdf"), "8998")) {  
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		     } catch (IOException e){  
		       System.err.println("Exception while trying to read pdf document - " + e);  
			   soft.assertFalse(true,"welcome to catch block");

		     }  
		     
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		   
		   
		Reporter.log("VerifyRecivedPayslipPasswordProtected");
		
		
	}
	
	
	

	public  void VerifyRecivedPayslipPasswordProtected35(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Khusboo Kumari[42979] - 2025-04-30_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		 try (PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Khusboo Kumari[42979] - 2025-04-30_pp.pdf"), "HA38DP")) {  
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		     } catch (IOException e){  
		       System.err.println("Exception while trying to read pdf document - " + e);  
			   soft.assertFalse(true,"welcome to catch block");

		     }  
		     
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		   
		   
		Reporter.log("VerifyRecivedPayslipPasswordProtected");
		
		
	}
	
	
	public  void VerifyRecivedPayslipPasswordProtected36(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Khusboo Kumari[42979] - 2025-04-30_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		 try (PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Khusboo Kumari[42979] - 2025-04-30_pp.pdf"), "HA38DP")) {  
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		     } catch (IOException e){  
		       System.err.println("Exception while trying to read pdf document - " + e);  
			   soft.assertFalse(true,"welcome to catch block");

		     }  
		     
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		   
		   
		Reporter.log("VerifyRecivedPayslipPasswordProtected");
		
		
	}
	
	public  void VerifyRecivedPayslipPasswordProtected37(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Khusboo Kumari[42979] - 2025-04-30_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		 try (PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Khusboo Kumari[42979] - 2025-04-30_pp.pdf"), "HA38DP")) {  
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		     } catch (IOException e){  
		       System.err.println("Exception while trying to read pdf document - " + e);  
			   soft.assertFalse(true,"welcome to catch block");

		     }  
		     
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		   
		   
		Reporter.log("VerifyRecivedPayslipPasswordProtected");
		
		
	}
	
	
	
	public  void VerifyRecivedPayslipPasswordProtected38(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Khusboo Kumari[42979] - 2025-05-31_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		 try (PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Khusboo Kumari[42979] - 2025-05-31_pp.pdf"), "Khusboo")) {  
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		     } catch (IOException e){  
		       System.err.println("Exception while trying to read pdf document - " + e);  
			   soft.assertFalse(true,"welcome to catch block");

		     }  
		     
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		   
		   
		Reporter.log("VerifyRecivedPayslipPasswordProtected");
		
		
	}


	public  void VerifyRecivedEmployerP45(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Khusboo Kumari[43677]-P45_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[contains(text(),'Khusbo')]")).click();
		
		Thread.sleep(11000);
		
		 try (PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Khusboo Kumari[43677]-P45_pp.pdf"), "Kumari")) {  
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		     } catch (IOException e){  
		       System.err.println("Exception while trying to read pdf document - " + e);  
			   soft.assertFalse(true,"welcome to catch block");

		     }  
		     
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		   
		   
		Reporter.log("VerifyRecivedEmployerP45");
		
		
	}
	
	public  void VerifyRecivedEmployeeP45(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Shiva Singh[43680]-P45_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		 try (PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Shiva Singh[43680]-P45_pp.pdf"), "Singh")) {  
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		     } catch (IOException e){  
		       System.err.println("Exception while trying to read pdf document - " + e);  
			   soft.assertFalse(true,"welcome to catch block");

		     }  
		     
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		   
		   
		Reporter.log("VerifyRecivedEmployerP45");
		
		
	}
	
	public  void VerifyRecivedEmployer2P45(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Shiva Singh[43680]-P45_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[contains(text(),'Shiva')]")).click();
		
		Thread.sleep(11000);
		
		 try (PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Shiva Singh[43680]-P45_pp.pdf"), "Singh")) {  
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		     } catch (IOException e){  
		       System.err.println("Exception while trying to read pdf document - " + e);  
			   soft.assertFalse(true,"welcome to catch block");

		     }  
		     
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		   
		   
		Reporter.log("VerifyRecivedEmployerP45");
		
		
	}
	
	public  void VerifyRecivedPayslipPasswordProtected32(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Rana Kumar[42808] - 2025-04-30_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl01_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		 try (PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Rana Kumar[42808] - 2025-04-30_pp.pdf"), "1189L")) {  
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		     } catch (IOException e){  
		       System.err.println("Exception while trying to read pdf document - " + e);  
			   soft.assertFalse(true,"welcome to catch block");

		     }  
		     
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		   
		   
		Reporter.log("VerifyRecivedPayslipPasswordProtected");
		
		
	}
	
	



	public  void VerifyRecievedPayrollSummary(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2025-04-30_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl02_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		 try (PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2025-04-30_pp.pdf"), "S#@@222")) {  
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		     } catch (IOException e){  
		       System.err.println("Exception while trying to read pdf document - " + e);  
			   soft.assertFalse(true,"welcome to catch block");

		     }  
		     
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		   
		   
		Reporter.log("VerifyRecivedPayslipPasswordProtected");
		
		
	}

	
	public  void VerifyRecievedPayrollSummary1(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2025-04-30_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl02_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		 try (PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2025-04-30_pp.pdf"), "2#@@")) {  
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		     } catch (IOException e){  
		       System.err.println("Exception while trying to read pdf document - " + e);  
			   soft.assertFalse(true,"welcome to catch block");

		     }  
		     
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		   
		   
		Reporter.log("VerifyRecivedPayslipPasswordProtected");
		
		
	}
	
	public  void VerifyRecievedPayrollSummary2(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2025-04-30_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl02_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		 try (PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2025-04-30_pp.pdf"), "2PasswordEmployee")) {  
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		     } catch (IOException e){  
		       System.err.println("Exception while trying to read pdf document - " + e);  
			   soft.assertFalse(true,"welcome to catch block");

		     }  
		     
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		   
		   
		Reporter.log("VerifyRecivedPayslipPasswordProtected");
		
		
	}
	
	
	public  void VerifyRecievedPayrollSummary3(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2025-04-30_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl02_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		 try (PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2025-04-30_pp.pdf"), "A635")) {  
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		     } catch (IOException e){  
		       System.err.println("Exception while trying to read pdf document - " + e);  
			   soft.assertFalse(true,"welcome to catch block");

		     }  
		     
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		Reporter.log("VerifyRecivedPayslipPasswordProtected");
		
		
	}
	
	public  void VerifyRecievedPayrollSummary4(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2025-04-30_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl02_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		 try (PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2025-04-30_pp.pdf"), "635PC00000000")) {  
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		     } catch (IOException e){  
		       System.err.println("Exception while trying to read pdf document - " + e);  
			   soft.assertFalse(true,"welcome to catch block");

		     }  
		     
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		Reporter.log("VerifyRecivedPayslipPasswordProtected");
		
		
	}
	
	public  void VerifyRecievedPayrollSummary5(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2025-04-30_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl05_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		 try (PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2025-04-30_pp.pdf"), "A635")) {  
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		     } catch (IOException e){  
		       System.err.println("Exception while trying to read pdf document - " + e);  
			   soft.assertFalse(true,"welcome to catch block");

		     }  
		     
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		Reporter.log("VerifyRecivedPayslipPasswordProtected");
		
		
	}

	
	public  void VerifyRecivedPayslipPasswordProtectedJune(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2025-06-30_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl02_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2025-06-30_pp.pdf"), "1257L");
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		      document.close();
		     
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		Reporter.log("VerifyRecivedPayslipPasswordProtected");
		
		
	}
	
	
	
	public  void VerifyRecivedPayslipPasswordProtected3(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2026-03-31_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2026-03-31_pp.pdf"), "Suraj");  
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		      document.close();
		     
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		Reporter.log("VerifyRecivedPayslipPasswordProtected2");
		
		
	}
	
	public  void VerifyRecivedPayslipPasswordProtected5(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2026-03-31_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		 PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2026-03-31_pp.pdf"), "Suraj@#977"); 
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		    
		      document.close();
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		Reporter.log("VerifyRecivedPayslipPasswordProtected");
		
		
	}
	
	public  void VerifyRecivedPayslipPasswordProtected7(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2026-03-31_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		 PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2026-03-31_pp.pdf"), "Singh");
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		      document.close();
		   
 	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		Reporter.log("VerifyRecivedPayslipPasswordProtected");
		
		
	}
	
	
	public  void VerifyRecivedPayslipPasswordProtected9(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2026-03-31_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		 PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2026-03-31_pp.pdf"), "Singh#@123");  
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		      document.close();
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		Reporter.log("VerifyRecivedPayslipPasswordProtected");
		
		
	}
	
	public  void VerifyRecivedPayslipPasswordProtected11(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2026-03-31_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		   PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2026-03-31_pp.pdf"), "1257L"); 
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		      document.close();
		     
	       soft.assertTrue(PDFtext.contains(Text));

		   if(file.delete())
		   		System.out.println("file deleted");

		Reporter.log("VerifyRecivedPayslipPasswordProtected");
		
		
	}
	
	public  void VerifyRecivedPayslipPasswordProtected15(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2026-03-31_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		 PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2026-03-31_pp.pdf"), "HA38DP"); 
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		   
		      document.close();
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		Reporter.log("VerifyRecivedPayslipPasswordProtected");
		
		
	}
	
	public  void VerifyRecivedPayslipPasswordProtected17(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2026-03-31_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		 PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2026-03-31_pp.pdf"), "8998");
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		      document.close();
		     
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		Reporter.log("VerifyRecivedPayslipPasswordProtected");
		
		
	}
	
	
	public  void VerifyRecivedPayslipPasswordProtected19(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2026-03-31_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		 PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2026-03-31_pp.pdf"), "NA128998B");
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		      document.close();
		     
	       soft.assertTrue(PDFtext.contains(Text));

		   if(file.delete())
		   		System.out.println("file deleted");

		Reporter.log("VerifyRecivedPayslipPasswordProtected");
		
		
	}
	
	
		
	public  void VerifyRecivedPayslipPasswordProtected13(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2026-03-31_pp.pdf");

		
		Thread.sleep(2000);
	   m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2026-03-31_pp.pdf"), "K23");
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		      document.close();
		     
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		Reporter.log("VerifyRecivedPayslipPasswordProtected");
		
		
	}
	
	public  void VerifyRecivedPayslipPasswordProtected12(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2025-06-30_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		
		Thread.sleep(11000);
		
		 PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42739] - 2025-06-30_pp.pdf"), "1257L");
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		      document.close();
		     
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		Reporter.log("VerifyRecivedPayslipPasswordProtected");
		
		
	}
	
	
	public  void VerifyRecivedP60PasswordProtected(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Suraj Singh[24097]-P60_pp.pdf");

		
		Thread.sleep(4000);
	 // m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")));

		Thread.sleep(11000);
		
		PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Suraj Singh[42739]-P60_pp.pdf"), "Suraj");
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		    
		      document.close();
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		Reporter.log("VerifyRecivedP60PasswordProtected");
		
		
	}
	public  void VerifyRecivedP60PasswordProtected1(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Suraj Singh[42739]-P60_pp.pdf");

		
		Thread.sleep(4000);
	 // m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")));

		Thread.sleep(11000);
		
		PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Suraj Singh[42739]-P60_pp.pdf"), "Suraj@#977"); 
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		      document.close();
		     
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		Reporter.log("VerifyRecivedP60PasswordProtected");
		
		
	}
	
	public  void VerifyRecivedP60PasswordProtected2(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Suraj Singh[42739]-P60_pp.pdf");

		
		Thread.sleep(4000);
	 // m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")));

		Thread.sleep(11000);
		
		 PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Suraj Singh[42739]-P60_pp.pdf"), "Singh");
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		      document.close();
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		Reporter.log("VerifyRecivedP60PasswordProtected");
		
		
	}
	
	public  void VerifyRecivedP60PasswordProtected3(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Suraj Singh[42739]-P60_pp.pdf");

		
		Thread.sleep(4000);
	 // m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")));

		Thread.sleep(11000);
		
		PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Suraj Singh[42739]-P60_pp.pdf"), "Singh#@123");
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		      document.close();
		     
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		Reporter.log("VerifyRecivedP60PasswordProtected");
		
		
	}
	
	
	
	public  void VerifyRecivedP60PasswordProtected4(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Suraj Singh[42739]-P60_pp.pdf");

		
		Thread.sleep(4000);
	 // m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")));

		Thread.sleep(11000);
		
		 PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Suraj Singh[42739]-P60_pp.pdf"), "1257L");
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		      document.close();
		     
	       soft.assertTrue(PDFtext.contains(Text));

		   if(file.delete())
		   		System.out.println("file deleted");

		Reporter.log("VerifyRecivedP60PasswordProtected");
		
		
	}
	
	
	public  void VerifyRecivedP60PasswordProtected5(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Suraj Singh[42739]-P60_pp.pdf");

		
		Thread.sleep(4000);
	 // m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")));

		Thread.sleep(11000);
		
		 PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Suraj Singh[42739]-P60_pp.pdf"), "K23"); 
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		      document.close();
	       soft.assertTrue(PDFtext.contains(Text));

		   if(file.delete())
		   		System.out.println("file deleted");

		Reporter.log("VerifyRecivedP60PasswordProtected");
		
		
	}
	

	public  void VerifyRecivedP60PasswordProtected6(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Suraj Singh[42739]-P60_pp.pdf");

		
		Thread.sleep(4000);
	 // m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")));

		Thread.sleep(11000);
		
		PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Suraj Singh[42739]-P60_pp.pdf"), "HA38DP");  
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		      document.close();
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		Reporter.log("VerifyRecivedP60PasswordProtected");
		
		
	}
	
	public  void VerifyRecivedP60PasswordProtected7(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Suraj Singh[42739]-P60_pp.pdf");

		
		Thread.sleep(4000);
	 // m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")));

		Thread.sleep(11000);
		
		 PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Suraj Singh[42739]-P60_pp.pdf"), "8998"); 
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		      document.close();  
		    
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		Reporter.log("VerifyRecivedP60PasswordProtected");
		
		
	}
	
	public  void VerifyRecivedP60PasswordProtected8(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Suraj Singh[42739]-P60_pp.pdf");

		
		Thread.sleep(4000);
	 // m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")));

		Thread.sleep(11000);
		
		 PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Suraj Singh[42739]-P60_pp.pdf"), "NA128998B");
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		  
		      document.close();
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		Reporter.log("VerifyRecivedP60PasswordProtected");
		
		
	}
	
	
	public  void VerifyRecivedP60PasswordProtected9(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Rana Kumar[42978]-P60_pp.pdf");

		
		Thread.sleep(4000);
	 // m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[contains(text(),'Rana')]")));

		Thread.sleep(11000);
		
		 try (PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Rana Kumar[42978]-P60_pp.pdf"), "Kumar")) {  
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		     } catch (IOException e){  
		       System.err.println("Exception while trying to read pdf document - " + e);  
			   soft.assertFalse(true,"welcome to catch block");

		     }  
		     
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		Reporter.log("VerifyRecivedP60PasswordProtected");
		
		
	}
	
	
	public  void VerifyRecivedP60PasswordProtected10(String Text) throws Exception
	{
	File file = new File("C:\\Users\\Sonu\\Downloads\\Nima Sharma[42980]-P60_pp.pdf");

		
		Thread.sleep(4000);
	 // m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
		jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']")));

		Thread.sleep(11000);
		
		 try (PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Nima Sharma[42980]-P60_pp.pdf"), "Sharma")) {  
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		      PDFtext = reader.getText(document);  
		    //   System.out.println(PDFtext); 
		       
		     } catch (IOException e){  
		       System.err.println("Exception while trying to read pdf document - " + e);  
			   soft.assertFalse(true,"welcome to catch block");

		     }  
		     
	       soft.assertTrue(PDFtext.contains(Text));


		   if(file.delete())
		   		System.out.println("file deleted");

		Reporter.log("VerifyRecivedP60PasswordProtected");
		
		
	}
	
	
	public void previewIcnAndChangePassWord()
	{
		
	     boolean Icn = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_A5']")).isDisplayed();
		
		 boolean changePassWordIcn = m_Driver.findElement(By.xpath("//*[@text='Change Password']")).isDisplayed();
		 soft. assertTrue(Icn,"Preview Icon Not Displayed On Ui");
		 soft. assertTrue(changePassWordIcn,"Change Password Not Displayed On Ui");
		
	     Reporter.log("Verify  Preview Icon And Change Password");
	}
	
	
	public void verifyChangePasswordDialogueBox(String passPage)
	{
		
		String actualPage = m_Driver.findElement(By.xpath("(//*[text()='Generate Password'])[2]")).getText();
		System.out.println("actualPage  ="+actualPage);
		
        assertEquals(actualPage, passPage);	
        
        m_Driver.findElement(By.xpath("//*[@id='dvPasswordProtectionPopup']/div/div/div[1]/button")).click();
        
        Reporter.log("Verify Generete Password Page");
      
      
		
	}
	
	public void verifyPrintPayslip() throws Exception
	{
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnPrintAllToPdf']"));
		elem.click();
		Thread.sleep(9000);
	    utilities.ChangeWindow.Switchwindow(3, m_Driver);
	    
	   
	    Robot robot = new Robot();
	    
	    for(int i=0;i<=14;i++)
	    {
	    robot.keyPress(KeyEvent.VK_TAB);
	    robot.keyRelease(KeyEvent.VK_TAB);
	    Thread.sleep(2000);
	    	
	    }
        robot.keyPress(KeyEvent.VK_ENTER);
		
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_S);
		// press Enter
		Thread.sleep(5000);

		robot.keyPress(KeyEvent.VK_ENTER);
		
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
	}
	
	
	public void assertAll()
	{
		soft.assertAll();
		
	}
}
