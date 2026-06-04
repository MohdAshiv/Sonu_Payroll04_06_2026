package _4942PasswordProtection_Page;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;



import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.AccessPermission;
import org.apache.pdfbox.pdmodel.encryption.StandardDecryptionMaterial;
import org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import pages.BasePage;
import utilities.ChangeWindow;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

public class VerifyResult extends BasePage {

	public VerifyResult(WebDriver driver) {
		super(driver);
	
	}
	 static String pageText;
	static String PDFtext;
	SoftAssert soft= new SoftAssert();

	private By employerNO= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_RBEmplrPwd_1']");

	private By enabledPassProtectionElem=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_RBEmplrPwd_0']");

	public void VerifyRecivedPayrollSummary(String Text) throws  Exception
	{
	
		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl01_lbtnFileName']")).click();
		
		Thread.sleep(11000);
//		Robot robot = new Robot();
//		// press Ctrl+S the Robot's way
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_TAB);
//
//		Thread.sleep(3000);
//
//		robot.keyPress(KeyEvent.VK_ENTER);
//
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		
//	
//
//        Thread.sleep(9000);

			File file = new File("C:\\Users\\Sonu Kumar\\Downloads\\Employer's Summary -2026-04-30.pdf");

            PDDocument document = PDDocument.load(file);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			PDFtext = pdfStripper.getText(document);
			
			//System.out.println(PDFtext);
			document.close();
			
			System.out.println(PDFtext);
			
			Assert.assertTrue(PDFtext.contains(Text));
			
			Reporter.log("Verify Recieved Email is Unprotected");
			
			 if(file.delete())
			System.out.println("file deleted");
}

	
	
	public void VerifyRecivedPayrollSummary1(String Text) throws  Exception
	{
	
		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']")).click();
		
		Thread.sleep(9000);
//		Robot robot = new Robot();
//		// press Ctrl+S the Robot's way
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_TAB);
//
//		Thread.sleep(3000);
//		
//		robot.keyPress(KeyEvent.VK_TAB);
//
//		robot.keyRelease(KeyEvent.VK_TAB);
//		Thread.sleep(3000);
//
//		robot.keyPress(KeyEvent.VK_ENTER);
//
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(3000);
//
//		
//		robot.keyPress(KeyEvent.VK_UP);
//		robot.keyRelease(KeyEvent.VK_UP);
//		Thread.sleep(3000);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(3000);
//		
//		robot.keyPress(KeyEvent.VK_SHIFT);
//		robot.keyPress(KeyEvent.VK_F10);
//		robot.keyRelease(KeyEvent.VK_SHIFT);
//		robot.keyRelease(KeyEvent.VK_F10);
//
//		Thread.sleep(3000);
//		
//		for(int i=0;i<=4;i++)
//		{
//		robot.keyPress(KeyEvent.VK_DOWN);
//		robot.keyRelease(KeyEvent.VK_DOWN);
//		Thread.sleep(3000);
//		}
//		
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(3000);
//		robot.keyPress(KeyEvent.VK_DOWN);
//		robot.keyRelease(KeyEvent.VK_DOWN);
//		Thread.sleep(3000);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(3000);
//
//
//	
//
//			File file = new File("C:\\Users\\Sonu\\Downloads\\Payslip\\Employer's Summary -2023-04-30.pdf");
//
//            PDDocument document = PDDocument.load(file);
//			PDFTextStripper pdfStripper = new PDFTextStripper();
//			PDFtext = pdfStripper.getText(document);
//			
//			//System.out.println(PDFtext);
//			document.close();
//			
//			System.out.println(PDFtext);
//			
//			Assert.assertTrue(PDFtext.contains(Text));
//			
//			Reporter.log("Verify Recieved Email is Unprotected");
//			
//			 if(file.delete())
//			System.out.println("file deleted");
}
	
	
	public void verifyAppearPasswordPage(String passPage)
	{
		
		String actualPage = m_Driver.findElement(By.xpath("(//*[text()='Change Password Preferences'])[1]")).getText();
		System.out.println("actualPage  ="+actualPage);
		
        assertEquals(actualPage, passPage);		
        
        Reporter.log("Verify Generete Password Page");
      
      
		
	}
	
	
	public void verifyTagsAndText()
	{
		
		
		WebElement select_drop_down = m_Driver.findElement(By.xpath("//select[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_ddlPwdPfr']"));
		
		Select select = new Select(select_drop_down);
		
		String [] verify=  {"Client Defined Password","Company UTR Number","Company Registration Date","Director's Name","Accountant Defined Password","Company Name","PAYE Reference Number","Accounts Office Reference"};
	    int k=0;
		List<WebElement> all_options = select.getOptions();
		
		int data=all_options.size();
		
		for (int i = 1; i <= 8; i++)   // till Accounts Office Reference
		{
		    String value = all_options.get(i).getText().trim();

		    System.out.println(value);
		
		soft .assertEquals(verify[k], value);
	     k++;
			
		}
//		
//		boolean text = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_textPassword2']")).isEnabled();
//		
//		soft.assertTrue(text,"Password text Not Enabled");

		
	}
	
	
	
	public void verifyEnterdPassword(String ExpectedPassword) throws Exception
	{
		//jsExec.executeScript("window.scrollBy(0,1000)");
		String actualpassword = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_Password1']")).getAttribute("value");
		System.out.println("actualpassword  ="+actualpassword);
		
       soft. assertEquals(actualpassword, ExpectedPassword);		
         
        Thread.sleep(1000);
       
        m_Driver.findElement(By.xpath("//*[@id='PasswordPopup1']/div/div/div[1]/button")).click();
       
        Reporter.log("Verify passsword");
        
		
		
	}
	
	
	public void verifyEnterdPassword2(String ExpectedPassword)
	{

		String actualpassword = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_textPassword2']")).getAttribute("value");
		System.out.println("actualpassword  ="+actualpassword);
		
       soft. assertEquals(actualpassword, ExpectedPassword);		
        
        Reporter.log("Verify password");
		
		
		
	}
	
	public void pdfOpenAndEnterPassword() throws  Exception
	{
	
	
		    m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl01_lbtnFileName']/b")).click();
			
			Thread.sleep(9000);
			Robot robot = new Robot();
			// press Ctrl+S the Robot's way
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);

			Thread.sleep(3000);

			robot.keyPress(KeyEvent.VK_ENTER);

			robot.keyRelease(KeyEvent.VK_ENTER);
			
		

			Thread.sleep(5000);
		
		
		
//
//		robot.keyPress(KeyEvent.VK_1);
//		robot.keyRelease(KeyEvent.VK_1);
//		Thread.sleep(2000);
//
//		robot.keyPress(KeyEvent.VK_2);
//		robot.keyRelease(KeyEvent.VK_2);
//		Thread.sleep(2000);
//
//		robot.keyPress(KeyEvent.VK_3);
//		robot.keyRelease(KeyEvent.VK_3);
//		
//		Thread.sleep(2000);
//		
//		robot.keyPress(KeyEvent.VK_SHIFT);
//		robot.keyPress(KeyEvent.VK_2);
//		robot.keyRelease(KeyEvent.VK_SHIFT);
//		robot.keyRelease(KeyEvent.VK_2);
//	
//		Thread.sleep(2000);
//		
//		robot.keyPress(KeyEvent.VK_0);
//		robot.keyRelease(KeyEvent.VK_0);
//	
//		Thread.sleep(2000);
//		
//		
//		robot.keyPress(KeyEvent.VK_0);
//		robot.keyRelease(KeyEvent.VK_0);
//	
//		Thread.sleep(2000);
//		
//		
//		robot.keyPress(KeyEvent.VK_7);
//		robot.keyRelease(KeyEvent.VK_7);
//	
//		Thread.sleep(2000);
//		
//		robot.keyPress(KeyEvent.VK_ENTER);
//
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		
//	
//
//		Thread.sleep(9000);
//    
	}

		
	public  void VerifyRecivedPayrollSummaryWithPassword(String Text) throws Exception
	{
		File file = new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2025-04-30_pp.pdf");

		Thread.sleep(2000);

	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl01_lbtnFileName']")).click();
		
		Thread.sleep(11000);
//		Robot robot = new Robot();
//		// press Ctrl+S the Robot's way
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_TAB);
//
//		Thread.sleep(3000);
//
//		robot.keyPress(KeyEvent.VK_ENTER);
//
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		
//	
//
//		Thread.sleep(5000);
		
		  PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2025-04-30_pp.pdf"), "123@007");  
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		       String pageText = reader.getText(document);  
		       System.out.println(pageText); 
		       
		       Assert.assertTrue(pageText.contains(Text));
		      
//		     } catch (IOException e){  
//		       System.err.println("Exception while trying to read pdf document - " + e);  
//		     }  
		     
				document.close();


		 if(file.delete())
		   		System.out.println("file deleted");

		
		
		Reporter.log("Verify Recieved Email is protected");
		
					 
		
	}
	
	
	public  void VerifyRecivedPayrollSummaryWithPassword1(String Text) throws Exception
	{
		File file = new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2025-04-30_pp.pdf");

		
		Thread.sleep(2000);
	  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl01_lbtnFileName']")).click();
		
		Thread.sleep(11000);
//		Robot robot = new Robot();
//		// press Ctrl+S the Robot's way
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_TAB);
//
//		Thread.sleep(3000);
//
//		robot.keyPress(KeyEvent.VK_ENTER);
//
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		
//	
//
//		Thread.sleep(5000);
		
		 PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2025-04-30_pp.pdf"), "Sumit@007");
		       document.setAllSecurityToBeRemoved(true);  
		       PDFTextStripper reader = new PDFTextStripper();  
		       String pageText = reader.getText(document);  
		       System.out.println(pageText); 
		       
		       soft.assertTrue(pageText.contains(Text));
		      
//		     } catch (IOException e){  
//		       System.err.println("Exception while trying to read pdf document - " + e);  
//		     }  
		     
				document.close();


		 if(file.delete())
		   		System.out.println("file deleted");

		
		
		Reporter.log("VerifyRecivedPayrollSummaryWithPassword1");
		
					 
		
	}
	
	public void previewIcnAndChangePassWord()
	{
		
	     boolean Icn = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_A4']")).isDisplayed();
		
		 boolean changePassWordIcn = m_Driver.findElement(By.xpath("//*[@text='Change Password']")).isDisplayed();
		 soft. assertTrue(Icn,"Preview Icon Not Displayed On Ui");
		 soft. assertTrue(changePassWordIcn,"Change Password Not Displayed On Ui");
		
	     Reporter.log("Verify  Preview Icon And Change Password");
	}


	 public void EnabledPassProtectionEmployer() throws Exception
		{
	        

			WebElement elem = getWebElement(enabledPassProtectionElem);
            boolean yesIsSelected = elem.isSelected();
			assertTrue(yesIsSelected);
			
			Reporter.log("verify enabledPassProtection");

			
		}
	
	 

		public void VerifyRecivedPaySlipUnProtected(String Text) throws  Exception
		{
		
			m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']")).click();
			
			Thread.sleep(11000);
//			Robot robot = new Robot();
//			// press Ctrl+S the Robot's way
//			robot.keyPress(KeyEvent.VK_TAB);
//			robot.keyRelease(KeyEvent.VK_TAB);
//
//			Thread.sleep(3000);
//			
//			robot.keyPress(KeyEvent.VK_TAB);
//			robot.keyRelease(KeyEvent.VK_TAB);
//
//			Thread.sleep(3000);
//
//			robot.keyPress(KeyEvent.VK_ENTER);
//
//			robot.keyRelease(KeyEvent.VK_ENTER);
//			
//		
//
//	        Thread.sleep(9000);

				File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42278] - 2025-04-30.pdf");

	            PDDocument document = PDDocument.load(file);
				PDFTextStripper pdfStripper = new PDFTextStripper();
				PDFtext = pdfStripper.getText(document);
				
				//System.out.println(PDFtext);
				document.close();
				
				System.out.println(PDFtext);
				
				soft.assertTrue(PDFtext.contains(Text));
				
				Reporter.log("Verify VerifyRecivedPaySlipUnProtected");
				
				 if(file.delete())
				System.out.println("file deleted");
	}
		

		public void VerifyRecivedPaySlipUnProtected1(String Text) throws  Exception
		{
		
			m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
				
		

	        Thread.sleep(11000);

				File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[42280] - 2025-04-30.pdf");

	            PDDocument document = PDDocument.load(file);
				PDFTextStripper pdfStripper = new PDFTextStripper();
				PDFtext = pdfStripper.getText(document);
				
				//System.out.println(PDFtext);
				document.close();
				
				System.out.println(PDFtext);
				
				soft.assertTrue(PDFtext.contains(Text));
				
				Reporter.log("Verify VerifyRecivedPaySlipUnProtected");
				
				 if(file.delete())
				System.out.println("file deleted");
	}
		
		public void VerifyRecivedPaySlipUnProtected2(String Text) throws  Exception
		{
		
			m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
				
		

	        Thread.sleep(11000);

				File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Sonu kumar[42282] - 2025-04-30.pdf");

	            PDDocument document = PDDocument.load(file);
				PDFTextStripper pdfStripper = new PDFTextStripper();
				PDFtext = pdfStripper.getText(document);
				
				//System.out.println(PDFtext);
				
				System.out.println(PDFtext);
				
				soft.assertTrue(PDFtext.contains(Text));
				document.close();

				Reporter.log("Verify VerifyRecivedPaySlipUnProtected");
				
				 if(file.delete())
				System.out.println("file deleted");
	}
		
		
		
		public void VerifyRecivedPaySlipUnProtected3(String Text) throws  Exception
		{
		
			m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl01_lbtnFileName']/b")).click();
				
		

	        Thread.sleep(11000);

				File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - ffff Kumar[42721] - 2025-05-31.pdf");

	            PDDocument document = PDDocument.load(file);
				PDFTextStripper pdfStripper = new PDFTextStripper();
				PDFtext = pdfStripper.getText(document);
				
				//System.out.println(PDFtext);
				document.close();
				
				System.out.println(PDFtext);
				
				soft.assertTrue(PDFtext.contains(Text));
				
				Reporter.log("Verify VerifyRecivedPaySlipUnProtected");
				
				 if(file.delete())
				System.out.println("file deleted");
	}
		
		
		
		public void PasswordNotEnabled() throws Exception
		{
			
			
			jsExec.executeScript("window.scrollBy(0,1000)");


			WebElement elem = getWebElement(employerNO);

			
			boolean enabled = elem.isSelected();
            Thread.sleep(1000);
 
            soft.  assertTrue(enabled,"Element is Enabled");
			Reporter.log("Password Protection Is Not Enabled");

          
			
		}
	
		public  void VerifyRecivedPayrollSummaryWithPassword2(String Text) throws Exception
		{
		File file = new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2025-04-30_pp.pdf");

			
			Thread.sleep(2000);
		  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl01_lbtnFileName']/b")).click();
			
			Thread.sleep(11000);
//			Robot robot = new Robot();
//			// press Ctrl+S the Robot's way
//			robot.keyPress(KeyEvent.VK_TAB);
//			robot.keyRelease(KeyEvent.VK_TAB);
//
//			Thread.sleep(3000);
//
//			robot.keyPress(KeyEvent.VK_ENTER);
//
//			robot.keyRelease(KeyEvent.VK_ENTER);
//			
//			Thread.sleep(5000);
//			
			 PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2025-04-30_pp.pdf"), "Nomismalimited");  
			       document.setAllSecurityToBeRemoved(true);  
			       PDFTextStripper reader = new PDFTextStripper();  
			      pageText = reader.getText(document);  
			       System.out.println(pageText); 
			     
			     
		       soft.assertTrue(pageText.contains(Text));
				document.close();


			   if(file.delete())
			   		System.out.println("file deleted");

			Reporter.log("VerifyRecivedPayrollSummaryWithPassword2");
			
			
		}
		
		
		
		public  void VerifyRecivedPayrollSummaryWithPassword3(String Text) throws Exception
		{
		File file = new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2025-04-30_pp.pdf");

			
		//	Thread.sleep(2000);
		     m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl01_lbtnFileName']/b")).click();
			
			Thread.sleep(11000);
//			Robot robot = new Robot();
//			// press Ctrl+S the Robot's way
//			robot.keyPress(KeyEvent.VK_TAB);
//			robot.keyRelease(KeyEvent.VK_TAB);
//
//			Thread.sleep(3000);
//
//			robot.keyPress(KeyEvent.VK_ENTER);
//
//			robot.keyRelease(KeyEvent.VK_ENTER);
//			
//			Thread.sleep(5000);
			
			PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2025-04-30_pp.pdf"), "Nomismalimited@#877");
			 
			       document.setAllSecurityToBeRemoved(true);  
			       PDFTextStripper reader = new PDFTextStripper();  
			      pageText = reader.getText(document);  
			       System.out.println(pageText); 
			       
//			     } catch (IOException e){  
//			       System.err.println("Exception while trying to read pdf document - " + e);  
//			       
//			     }  
			     
		       soft.assertTrue(pageText.contains(Text));
				document.close();

			   if(file.delete())
			   		System.out.println("file deleted");

			Reporter.log("VerifyRecivedPayrollSummaryWithPassword3");
			
			
		}
		
		public  void VerifyRecivedPayrollSummaryWithPassword4(String Text) throws Exception
		{
		File file = new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2025-04-30_pp.pdf");

			
			Thread.sleep(2000);
		  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl01_lbtnFileName']/b")).click();
			
			Thread.sleep(11000);

			
			 PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2025-04-30_pp.pdf"), "A635");
			       document.setAllSecurityToBeRemoved(true);  
			       PDFTextStripper reader = new PDFTextStripper();  
			      pageText = reader.getText(document);  
			       System.out.println(pageText); 
 
			     
		       soft.assertTrue(pageText.contains(Text));
				document.close();


			   if(file.delete())
			   		System.out.println("file deleted");

			Reporter.log("VerifyRecivedPayrollSummaryWithPassword3");
			
			
		}
			
		public  void VerifyRecivedPayrollSummaryWithPassword5(String Text) throws Exception
		{
		File file = new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2025-04-30_pp.pdf");

			
			Thread.sleep(2000);
		  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl01_lbtnFileName']/b")).click();
			
			Thread.sleep(11000);
			
			 PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2025-04-30_pp.pdf"), "A635@007");  
			       document.setAllSecurityToBeRemoved(true);  
			       PDFTextStripper reader = new PDFTextStripper();  
			      pageText = reader.getText(document);  
			       System.out.println(pageText); 
			       
			     
			     
		       soft.assertTrue(pageText.contains(Text));
				document.close();


				Reporter.log("VerifyRecivedPayrollSummaryWithPassword");

				Thread.sleep(3000);
				if(file.delete())
			   		System.out.println("file deleted");

			
			
		}
			
		public  void VerifyRecivedPayrollSummaryWithPassword6(String Text) throws Exception
		{
		File file = new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2025-04-30_pp.pdf");

			
			Thread.sleep(2000);
		  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl01_lbtnFileName']/b")).click();
			
			Thread.sleep(11000);
			
			 PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2025-04-30_pp.pdf"), "635PC00000000");
			       document.setAllSecurityToBeRemoved(true);  
			       PDFTextStripper reader = new PDFTextStripper();  
			      pageText = reader.getText(document);  
			       System.out.println(pageText); 
//			       
//			     } catch (IOException e){  
//			       System.err.println("Exception while trying to read pdf document - " + e);  
//			       
//			     }  
			     

		       soft.assertTrue(pageText.contains(Text));

				document.close();

			   if(file.delete())
			   		System.out.println("file deleted");

			Reporter.log("VerifyRecivedPayrollSummaryWithPassword");
			
			
		}
		
		
		
		public  void VerifyRecivedPayrollSummaryWithPassword7(String Text) throws Exception
		{
		File file = new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2025-04-30_pp.pdf");

			
			Thread.sleep(2000);
		  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl01_lbtnFileName']/b")).click();
			
			Thread.sleep(11000);
			
			PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2025-04-30_pp.pdf"), "635PC00000000@007");
			       document.setAllSecurityToBeRemoved(true);  
			       PDFTextStripper reader = new PDFTextStripper();  
			      pageText = reader.getText(document);  
			       System.out.println(pageText); 
			       
			    
			     
		       soft.assertTrue(pageText.contains(Text));

				document.close();

			   if(file.delete())
			   		System.out.println("file deleted");

			Reporter.log("VerifyRecivedPayrollSummaryWithPassword");
			
			
		}
		
		public  void VerifyRecivedPayrollSummaryWithPassword8(String Text) throws Exception
		{
		File file = new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2025-04-30_pp.pdf");

			
			Thread.sleep(2000);
		  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl01_lbtnFileName']/b")).click();
			
			Thread.sleep(11000);
			
			 PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2025-04-30_pp.pdf"), "123@000777");  
			       document.setAllSecurityToBeRemoved(true);  
			       PDFTextStripper reader = new PDFTextStripper();  
			      pageText = reader.getText(document);  
			       System.out.println(pageText); 
			       
			    
			     
		       soft.assertTrue(pageText.contains(Text));

		       document.close();
			   if(file.delete())
			   		System.out.println("file deleted");

			Reporter.log("VerifyRecivedPayrollSummaryWithPassword");
			
			
		}
		
		
		
		public  void VerifyRecivedPayrollSummaryWithPassword9(String Text) throws Exception
		{
		File file = new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2025-04-30_pp.pdf");

			
			Thread.sleep(2000);
		  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl01_lbtnFileName']/b")).click();
			
			Thread.sleep(11000);
			
			 try (PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2025-04-30_pp.pdf"), "Sameer@007")) {  
			       document.setAllSecurityToBeRemoved(true);  
			       PDFTextStripper reader = new PDFTextStripper();  
			      pageText = reader.getText(document);  
			       System.out.println(pageText); 
			       
			     } catch (IOException e){  
			       System.err.println("Exception while trying to read pdf document - " + e);  
			       
			     }  
			     
		       soft.assertTrue(pageText.contains(Text));


			   if(file.delete())
			   		System.out.println("file deleted");

			Reporter.log("VerifyRecivedPayrollSummaryWithPassword");
			
			
		}
		
		
		
		public  void VerifyRecivedPayrollSummaryWithPassword11(String Text) throws Exception
		{
		File file = new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2025-04-06_pp.pdf");

			
			Thread.sleep(2000);
		  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl01_lbtnFileName']/b")).click();
			
			Thread.sleep(11000);
			
			 try (PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2025-04-06_pp.pdf"), "PasswordWeekly")) {  
			       document.setAllSecurityToBeRemoved(true);  
			       PDFTextStripper reader = new PDFTextStripper();  
			      pageText = reader.getText(document);  
			       System.out.println(pageText); 
			       
			     } catch (IOException e){  
			       System.err.println("Exception while trying to read pdf document - " + e);  
			       
			     }  
			     
		       soft.assertTrue(pageText.contains(Text));


			   if(file.delete())
			   		System.out.println("file deleted");

			Reporter.log("VerifyRecivedPayrollSummaryWithPassword");
			
			
		}
		
		public  void VerifyRecivedPayrollSummaryWithPassword12(String Text) throws Exception
		{
		File file = new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2025-04-08_pp.pdf");

			
			Thread.sleep(2000);
		  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl01_lbtnFileName']/b")).click();
			
			Thread.sleep(11000);
			
			 try (PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2025-04-08_pp.pdf"), "2WeeklyPassword")) {  
			       document.setAllSecurityToBeRemoved(true);  
			       PDFTextStripper reader = new PDFTextStripper();  
			      pageText = reader.getText(document);  
			     //  System.out.println(pageText); 
			       
			     } catch (IOException e){  
			       System.err.println("Exception while trying to read pdf document - " + e);  
			       
			     }  
			     
		       soft.assertTrue(pageText.contains(Text));


			   if(file.delete())
			   		System.out.println("file deleted");

			Reporter.log("VerifyRecivedPayrollSummaryWithPassword");
			
			
		}
			
		
		public  void VerifyRecivedPayrollSummaryWithPassword13(String Text) throws Exception
		{
		File file = new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2025-10-08_pp.pdf");

			
			Thread.sleep(2000);
		  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl01_lbtnFileName']/b")).click();
			
			Thread.sleep(11000);
			
			 try (PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2025-10-08_pp.pdf"), "4WeeklyPassword")) {  
			       document.setAllSecurityToBeRemoved(true);  
			       PDFTextStripper reader = new PDFTextStripper();  
			      pageText = reader.getText(document);  
			     //  System.out.println(pageText); 
			       
			     } catch (IOException e){  
			       System.err.println("Exception while trying to read pdf document - " + e);  
			       
			     }  
			     
		       soft.assertTrue(pageText.contains(Text));


			   if(file.delete())
			   		System.out.println("file deleted");

			Reporter.log("VerifyRecivedPayrollSummaryWithPassword");
			
			
		}
			
		
		public  void VerifyRecivedPayrollSummaryWithPassword10(String Text) throws Exception
		{
		File file = new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2025-05-31_pp.pdf");

			
			Thread.sleep(2000);
		  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl01_lbtnFileName']/b")).click();
			
			Thread.sleep(11000);
			
			 try (PDDocument document = PDDocument.load(new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2025-05-31_pp.pdf"), "Sameer@007")) {  
			       document.setAllSecurityToBeRemoved(true);  
			       PDFTextStripper reader = new PDFTextStripper();  
			      pageText = reader.getText(document);  
			       System.out.println(pageText); 
			       
			     } catch (IOException e){  
			       System.err.println("Exception while trying to read pdf document - " + e);  
			       
			     }  
			     
		       soft.assertTrue(pageText.contains(Text));

			   if(file.delete())
			   		System.out.println("file deleted");

			Reporter.log("VerifyRecivedPayrollSummaryWithPassword");
			
			
		}

	public void assertAll()
	{
		soft.assertAll();
		
	}
}