package _4996Page;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import pages.BasePage;
import pages.reports;

public class Verify4996  extends BasePage{

	public Verify4996(WebDriver driver) {
		super(driver);
	}
	
	SoftAssert soft= new SoftAssert();

	 String path="E:\\LatestSeleniumFramework\\Sonu_Payroll_Selenium_New\\SeleniumFramework\\PdfFile\\";

	
	
	public void verifyUndoLastPayrollCancelBtn() throws Exception
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUndoPayrollFrame']")));

		WebElement cancel = m_Driver.findElement(By.xpath("//*[@class='col-sm-12 col-xs-12']/a[2]"));

	     cancel.click();
	
		m_Driver.switchTo().defaultContent();

		Thread.sleep(3000);
		boolean close = m_Driver.findElement(By.xpath("//*[@id='btnPopUpClose']")).isDisplayed();
			 
		System.out.println(close);
		soft. assertFalse(close);
	
		Thread.sleep(2000);
		
		Reporter.log("verifyCancelDepartment");
		
		
	}
	
	  public void verifyCheckBoxSelcted()
	  {
		  
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUndoPayrollFrame']")));

		   List<WebElement> list = getWebElements(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr/td/span/input") );
		  
		   
		   for(int i=0;i<=list.size()-1;i++)
		   {   
			   
			   WebElement elem = list.get(i);
			       
			   boolean selected = elem.isSelected();
			   
			   System.out.println(selected);
			   
			   soft.assertTrue(selected,"not as expected");
			   
			  Reporter.log("verifyCheckBox");
			   
		   }
		   
		   m_Driver.switchTo().defaultContent();
		   
	  }
	
	  
	  
	  public void verifyCheckBoxNotSelcted()
	  {
		  
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUndoPayrollFrame']")));

			
			getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_chkSelectAll']")).click();
			
		   List<WebElement> list = getWebElements(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr/td/span/input") );
		  
		   
		   for(int i=0;i<=list.size()-1;i++)
		   {   
			   
			   WebElement elem = list.get(i);
			       
			   boolean selected = elem.isSelected();
			   
			   System.out.println(selected);
			   
			   soft.assertFalse(selected,"not as expected");
			   
			  Reporter.log("verifyCheckBoxNotSelcted");
			   
		   }
		   
		   m_Driver.switchTo().defaultContent();
		   
	  }
	  
	  
	  public void verifyUndoLastPayrollCloseBtn() throws Exception
		{
		
			WebElement closeBtn = m_Driver.findElement(By.xpath("//*[@id='btnPopUpClose']"));

		     closeBtn.click();
		
			Thread.sleep(3000);
			
			soft. assertFalse(closeBtn.isDisplayed());
		  
			Reporter.log("verifyUndoLastPayrollCloseBtn");
		}
		
	  
	  
	  public void verifyAlertMsg(String expectedText) throws Exception
	  {
		  
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUndoPayrollFrame']")));
		
		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnUndo']")).click();
		 Thread.sleep(1000);

		 String actualText= m_Driver.switchTo().alert().getText();
		  System.out.println(actualText);
		  soft.assertEquals(actualText, expectedText, "AlertNotAsExpected");
		 
		 m_Driver.switchTo().alert().dismiss();
		
		 m_Driver.switchTo().defaultContent();
		 
		 Thread.sleep(2000);
		 Reporter.log("verifyAlertMsg");
	  }
	
	  
	  public void verifyAlertMsgNormal(String expectedText) throws Exception
	  {
		  
		 String actualText= m_Driver.switchTo().alert().getText();
		  System.out.println(actualText);
		  soft.assertEquals(actualText, expectedText, "AlertNotAsExpected");
		 
		 m_Driver.switchTo().alert().accept();
		
		 
		 Thread.sleep(2000);
		 Reporter.log("verifyAlertMsg");
	  }
	  
	  
	  public void verifyAlertMsg1(String expectedText) throws Exception
	  {
		  
		 String actualText= m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphError_divUndoPayrollAlert']")).getText();
		  System.out.println(actualText);
		  soft.assertEquals(actualText, expectedText, "AlertNotAsExpected");
		 
		 Thread.sleep(3000);
		 Reporter.log("verifyAlertMsg1");
	  }
	
	  
	  public void verifyPendingPayrollForApproval(String expectedEmployee,String expectedHeader) throws Exception
	  {
		  
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUndoPayrollEmpListFrame']")));
		
		  String actualText= m_Driver.findElement(By.xpath("//td[normalize-space()='Employee C']")).getText();
		  System.out.println(actualText);
		  soft.assertEquals(actualText, expectedEmployee, "employeeNotAsExpected");
		 
		  String actualText1= m_Driver.findElement(By.xpath("//h2[normalize-space()='Pending Payroll for Past Period']")).getText();
		  System.out.println(actualText1);
		  soft.assertEquals(actualText1, expectedHeader, "employeeNotAsExpected");
		 
		 m_Driver.switchTo().defaultContent();
		 Reporter.log("verifyPendingPayrollForApproval");
		  
	  }
	  
	  public void verifyPayslip(String employee)
	  {
		  
		   List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table-responsive']/table/tbody/tr/td[2]"));
		  
			System.out.println(list.size());

			boolean con=list.isEmpty();
		     soft.assertFalse(con);

		     soft.assertEquals(list.size(), 20);
		   
		   for(int i=0;i<=list.size()-1;i++)
		   {
			   
			   
			  String data = list.get(i).getText();
			   System.out.println(data);
			   soft.assertFalse(data.contains(employee),"UndoLastPayroll Employee is Visible");
		   }
		  
		   
		   Reporter.log("verifyPayslip");
		   
	  }
	  
	  public void verifyPayrollReportingPeriodSummary(String employee)
	  {
		  
		   List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[1]"));
		  
			System.out.println(list.size());

			boolean con=list.isEmpty();
		     soft.assertFalse(con);

		     soft.assertEquals(list.size(), 20);
		   
		   for(int i=0;i<=list.size()-1;i++)
		   {
			   
			   
			  String data = list.get(i).getText();
			   System.out.println(data);
			   soft.assertFalse(data.contains(employee),"UndoLastPayroll Employee is Visible");
		   }
		  
		   
		   Reporter.log("verifyPayrollReportingPeriodSummary");
		   
	  }
	  
	  
	  
	  public void verifyPayrollSummary(String employee)
	  {
		  
		   List<WebElement> list = m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Employee')]//following::tr/td[1]"));
		  
			System.out.println(list.size());

			boolean con=list.isEmpty();
		     soft.assertFalse(con);

		   
		   for(int i=0;i<=list.size()-1;i++)
		   {
			   
			   if(i==20)
			   {
				   break;
			   }
			   
			  String data = list.get(i).getText();
			   System.out.println(data);
			   soft.assertFalse(data.contains(employee),"UndoLastPayroll Employee is Visible");
		   }
		  
		   
		   Reporter.log("verifyPayrollReportingPeriodSummary");
		   
	  }
	  
	  
	  
	  public void verifyIndividualEmployeePaySchedule()
	  {
		  
		    WebElement elem = getWebElement(By.xpath("//*[@id='SelectAllRecord']") );
		  
			   boolean selected = elem.isSelected();
			   
			   System.out.println(selected);
			   
			   soft.assertFalse(selected,"not as expected");
			   
			  Reporter.log("verifyIndividualEmployeePaySchedule");
		
	  }
	
	  
	  public void verifyRunPayrollPage(String employee) throws InterruptedException
	  {
		  
		  Thread.sleep(3000);
		   List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='table-responsive'])[1]/table/tbody/tr/td[1]"));
		  
			System.out.println(list.size());

			boolean con=list.isEmpty();
		     soft.assertFalse(con);
		   
		   for(int i=0;i<=list.size()-1;i++)
		   {
			   
			   
			  String data = list.get(i).getText();
			   System.out.println(data);
			   soft.assertFalse(data.contains(employee),"UndoLastPayroll Employee is Visible");
		   }
		  
		   
		   Reporter.log("verifyPayrollReportingPeriodSummary");
		   
	  }
	  
	  
	  
	  
	  
	  public void verifyInlineElementIsClickable() {
		  
		  
		  try {
			  WebElement elementToClick = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords_ctl04_dvDropDownMenu']/a")); // Replace with your element locator

		        // Create WebDriverWait object with timeout of 10 seconds
		        WebDriverWait wait = new WebDriverWait(m_Driver, Duration.ofSeconds(10));
			  
			  wait.until(ExpectedConditions.elementToBeClickable(elementToClick));

	            // If no exception is thrown, element is clickable
	            elementToClick.click();
	            System.out.println("Element is clickable. Performing click action...");

		} catch (Exception e) {
			
			
			// System.out.println("Element is not clickable or not found within specified timeout.");
	       //  e.printStackTrace();
			 soft.fail("Element is not clickable or not found within specified timeout.");

		}
		  
		   Reporter.log("verifyInlineElementIsClickable");

		  
	  }
	  
	  
	  public void verifyUndoEmployeeClickable() throws Exception
	  {
		  
		  Thread.sleep(3000);
		  WebElement list = m_Driver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_gridDisplayRecords_ctl04_lnkEditEmp\"]"));
		  
			
		   
		  
		     list.click();
		    
			   
			  Thread.sleep(3000);
  
					  
			WebElement elem = getWebElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/header/h2/span"));
				String actualData=elem.getText();
				soft.assertEquals(actualData, "Mr. Employee C");
		   
		   Reporter.log("verifyUndoEmployeeClickable");
	  }
	  
	  
	  
	  
	  public void verifyUndoEmployeeFromLastPeriod(String employee) throws InterruptedException
	  {
		  
		  Thread.sleep(3000);
		   List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[1]"));
		  
			System.out.println(list.size());

			boolean con=list.isEmpty();
		     soft.assertFalse(con);
		   
		   for(int i=0;i<=list.size()-1;i++)
		   {
			   
			   if(i==2)
			   {
				   String data = list.get(i).getText();
				   System.out.println(data);
				   soft.assertTrue(data.contains(employee),"UndoLastPayroll Employee is Visible");
			   }
			   
			   else {
				   
				   String data = list.get(i).getText();
				   System.out.println(data);
				   soft.assertFalse(data.contains(employee),"UndoLastPayroll Employee is Visible");
			   }
			
		   }
		  
		   
		   Reporter.log("verifyUndoEmployeeFromLastPeriod");
		   
	  }
	  
	  
	  
		
		public void VerifyP11( String Lel,String Pt,String Uel, String EmployeeEmployer,String employee)
		{  
			
			
			  List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='rowFinal'])[2]/td[contains(text(),'£')]"));
			  
			 
			  jsExec.executeScript("window.scrollBy(0,300)"); 
				String actualLel = list.get(0).getText();
				actualLel = actualLel.replaceAll("£", "");
				actualLel = actualLel.replaceAll(",", "");
				soft.assertEquals(actualLel, Lel);

				String actualPT = list.get(1).getText();
				actualPT = actualPT.replaceAll("£", "");
				actualPT = actualPT.replaceAll(",", "");

				soft.assertEquals(actualPT, Pt);

				String actualUel = list.get(2).getText();

				actualUel = actualUel.replaceAll("£", "");
				actualUel = actualUel.replaceAll(",", "");
				soft.assertEquals(actualUel, Uel);

				String actualEeEr = list.get(3).getText();
				actualEeEr = actualEeEr.replaceAll("£", "");
				actualEeEr = actualEeEr.replaceAll(",", "");
				soft.assertEquals(actualEeEr, EmployeeEmployer);

				String actualEENi = list.get(4).getText();
				actualEENi = actualEENi.replaceAll("£", "");
				actualEENi = actualEENi.replaceAll(",", "");
				soft.assertEquals(actualEENi, employee);
				 
			     Reporter.log("Verify P11 ");
			  
			
			
		}
		
		
		public void checkAbsenceOfEmployeeP11()
		{
			
			

	        // Locate the dropdown element
	        WebElement dropdown = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlEmployee']")); // Replace with your dropdown locator

	        // Create a Select object
	        Select select = new Select(dropdown);

	        // Get all options from the dropdown
	        java.util.List<WebElement> options = select.getOptions();

	        // Text to verify absence
	        String textToVerify = "Mr. Employee C";

	        boolean found = false;

	        // Iterate through each option to check if the text is present
	        for (WebElement option : options) {
	            if (option.getText().equals(textToVerify)) {
	                found = true;
	                break;
	            }
	        }

	        // Verification: If 'found' is false, the text is not present in the dropdown
	        if (!found) {
	            System.out.println("Dropdown does not contain the text: " + textToVerify);
	            
	            
	        } else {
	            System.out.println("Dropdown contains the text: " + textToVerify);
	            soft.assertFalse(found);
	        }


		}
		
		
		public void verifyDepartmentUndoneEmployee(String data)
		{
				
			try {
				WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[4]/td[4]"));
				
				 String actualDepartment=elem.getText();
				 
				 System.out.println("actualDepartment-"+actualDepartment);
				 
					soft.assertEquals(actualDepartment, data);

			} catch (Exception e) {
				
				System.out.println("Issue In verifyDepartment"+e);
			    soft.assertFalse(true,"welcome to catch block");

			}	
				
			Reporter.log("verifyDepartment");
		}
		
		
		public void verifyLeaveRecordAlert()
		{
			
			
			WebElement elem = getWebElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[1]"));
			
			String actualAlert=elem.getText();
			
			soft.assertEquals(actualAlert, "Success! Leave record is Saved successfully.");

			Reporter.log("verifyLeaveRecordAlert");
		}
		
		
		public void verifyPayrollDashboardGross(String data)
		{
				
			try {
				WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[4]/td[5]"));
				
				 String actualGrosst=elem.getText();
				 
				 System.out.println("actualGrosst-"+actualGrosst);
				 
					soft.assertEquals(actualGrosst, data);

			} catch (Exception e) {
				
				System.out.println("Issue In verifyDepartment"+e);
			    soft.assertFalse(true,"welcome to catch block");

			}	
				
			Reporter.log("verifyPayrollDashboardGross");
		}
		
		
		
		public void verifyPayrollDashboardDirector(String data)
		{
				
			try {
				WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[4]/td[3]"));
				
				 String actualDirectod=elem.getText();
				 
				 System.out.println("actualGrosst-"+actualDirectod);
				 
					soft.assertEquals(actualDirectod, data);

			} catch (Exception e) {
				
				System.out.println("Issue In verifyPayrollDashboardDirector"+e);
			    soft.assertFalse(true,"welcome to catch block");

			}	
				
			Reporter.log("verifyPayrollDashboardDirector");
		}
		
		
		
		
		public void verifyPayrollDashboardGrossNetpay(String data)
		{
				
			try {
				WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[4]/td[11]"));
				
				 String actualGrosst=elem.getText();
				 
				 System.out.println("actualGrosst-"+actualGrosst);
				 
					soft.assertEquals(actualGrosst, data);

			} catch (Exception e) {
				
				System.out.println("Issue In verifyPayrollDashboardGrossNetpay"+e);
			    soft.assertFalse(true,"welcome to catch block");

			}	
				
			Reporter.log("verifyPayrollDashboardNetpay");
		}
		
		
		
		public void verifyPayrollDashboardTaxNIGrossNetPension(String expectedGross,String expectedTax, String expectedEmployeeNI,String expectedEmployeePension,String expectedNetPay,String expectedEmployerNI,String expectedEmployerPension)
		{
				
			try {
				 List<WebElement> elem = m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[4]/td"));
				
				 String actualGross=elem.get(4).getText();
				 actualGross=actualGross.replaceAll(",", "");
				 actualGross=actualGross.replaceAll("£", "");
				 System.out.println("actualGrosst-"+actualGross);
				soft.assertEquals(actualGross, expectedGross ,"Gross not as expected");
				
				
				String actualIncomeTax = elem.get(5).getText();
				actualIncomeTax = actualIncomeTax.replaceAll(",", "");
				actualIncomeTax = actualIncomeTax.replaceAll("£", "");
				System.out.println("actualIncomeTax-" + actualIncomeTax);
				soft.assertEquals(actualIncomeTax, expectedTax,"Tax not as expected");

				String actualEmployeeNI = elem.get(9).getText();
				actualEmployeeNI = actualEmployeeNI.replaceAll(",", "");
				actualEmployeeNI = actualEmployeeNI.replaceAll("£", "");
				System.out.println("actualEmployeeNI-" + actualEmployeeNI);
				soft.assertEquals(actualEmployeeNI, expectedEmployeeNI,"EmployeeNi not as expected");


				String actualEmployeePension = elem.get(10).getText();
				actualEmployeePension = actualEmployeePension.replaceAll(",", "");
				actualEmployeePension = actualEmployeePension.replaceAll("£", "");
				System.out.println("actualEmployeePension-" + actualEmployeePension);
				soft.assertEquals(actualEmployeePension, expectedEmployeePension,"EmployeePension not as expected");

				String actualNetPay= elem.get(11).getText();
				actualNetPay = actualNetPay.replaceAll(",", "");
				actualNetPay = actualNetPay.replaceAll("£", "");
				System.out.println("actualNetPay-" + actualNetPay);
				soft.assertEquals(actualNetPay, expectedNetPay,"Net not as expected");

				String actualEmployerNI= elem.get(12).getText();
				actualEmployerNI = actualEmployerNI.replaceAll(",", "");
				actualEmployerNI = actualEmployerNI.replaceAll("£", "");
				System.out.println("actualEmployerNI-" + actualEmployerNI);
				soft.assertEquals(actualEmployerNI, expectedEmployerNI,"EmployerNI not as expected");
				
				String actualEmployerPension= elem.get(13).getText();
				actualEmployerPension = actualEmployerPension.replaceAll(",", "");
				actualEmployerPension = actualEmployerPension.replaceAll("£", "");
				System.out.println("actualEmployerPension-" + actualEmployerPension);
				soft.assertEquals(actualEmployerPension, expectedEmployerPension,"employerPension not as expected");


				
				
			} catch (Exception e) {
				
				System.out.println("Issue In verifyPayrollDashboardGrossNetpay"+e);
			    soft.assertFalse(true,"welcome to catch block");

			}	
				
			Reporter.log("verifyPayrollDashboardTaxNIGrossNetPension");
		}
		
		
		
		
		
		public void verifyPayrollDashboardTaxNIGrossNetPension1(String expectedGross,String expectedTax, String expectedEmployeeNI,String expectedEmployeePension,String expectedNetPay,String expectedEmployerNI,String expectedEmployerPension)
		{
				
			try {
				 List<WebElement> elem = m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[3]/td"));
				
				 String actualGross=elem.get(4).getText();
				 actualGross=actualGross.replaceAll(",", "");
				 actualGross=actualGross.replaceAll("£", "");
				 System.out.println("actualGrosst-"+actualGross);
				soft.assertEquals(actualGross, expectedGross ,"Gross not as expected");
				
				
				String actualIncomeTax = elem.get(5).getText();
				actualIncomeTax = actualIncomeTax.replaceAll(",", "");
				actualIncomeTax = actualIncomeTax.replaceAll("£", "");
				System.out.println("actualIncomeTax-" + actualIncomeTax);
				soft.assertEquals(actualIncomeTax, expectedTax,"Tax not as expected");

				String actualEmployeeNI = elem.get(9).getText();
				actualEmployeeNI = actualEmployeeNI.replaceAll(",", "");
				actualEmployeeNI = actualEmployeeNI.replaceAll("£", "");
				System.out.println("actualEmployeeNI-" + actualEmployeeNI);
				soft.assertEquals(actualEmployeeNI, expectedEmployeeNI,"EmployeeNi not as expected");


				String actualEmployeePension = elem.get(10).getText();
				actualEmployeePension = actualEmployeePension.replaceAll(",", "");
				actualEmployeePension = actualEmployeePension.replaceAll("£", "");
				System.out.println("actualEmployeePension-" + actualEmployeePension);
				soft.assertEquals(actualEmployeePension, expectedEmployeePension,"EmployeePension not as expected");

				String actualNetPay= elem.get(11).getText();
				actualNetPay = actualNetPay.replaceAll(",", "");
				actualNetPay = actualNetPay.replaceAll("£", "");
				System.out.println("actualNetPay-" + actualNetPay);
				soft.assertEquals(actualNetPay, expectedNetPay,"Net not as expected");

				String actualEmployerNI= elem.get(12).getText();
				actualEmployerNI = actualEmployerNI.replaceAll(",", "");
				actualEmployerNI = actualEmployerNI.replaceAll("£", "");
				System.out.println("actualEmployerNI-" + actualEmployerNI);
				soft.assertEquals(actualEmployerNI, expectedEmployerNI,"EmployerNI not as expected");
				
				String actualEmployerPension= elem.get(13).getText();
				actualEmployerPension = actualEmployerPension.replaceAll(",", "");
				actualEmployerPension = actualEmployerPension.replaceAll("£", "");
				System.out.println("actualEmployerPension-" + actualEmployerPension);
				soft.assertEquals(actualEmployerPension, expectedEmployerPension,"employerPension not as expected");


				
				
			} catch (Exception e) {
				
				System.out.println("Issue In verifyPayrollDashboardGrossNetpay"+e);
			    soft.assertFalse(true,"welcome to catch block");

			}	
				
			Reporter.log("verifyPayrollDashboardTaxNIGrossNetPension");
		}
		
		
		
		public void verifyPayrollDashboardTaxNIGrossNet(String expectedGross,String expectedTax, String expectedEmployeeNI,String expectedNetPay,String expectedEmployerNI)
		{
				
			try {
				 List<WebElement> elem = m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[3]/td"));
				
				 String actualGross=elem.get(4).getText();
				 actualGross=actualGross.replaceAll(",", "");
				 actualGross=actualGross.replaceAll("£", "");
				 System.out.println("actualGrosst-"+actualGross);
				soft.assertEquals(actualGross, expectedGross ,"Gross not as expected");
				
				
				String actualIncomeTax = elem.get(5).getText();
				actualIncomeTax = actualIncomeTax.replaceAll(",", "");
				actualIncomeTax = actualIncomeTax.replaceAll("£", "");
				System.out.println("actualIncomeTax-" + actualIncomeTax);
				soft.assertEquals(actualIncomeTax, expectedTax,"Tax not as expected");

				String actualEmployeeNI = elem.get(9).getText();
				actualEmployeeNI = actualEmployeeNI.replaceAll(",", "");
				actualEmployeeNI = actualEmployeeNI.replaceAll("£", "");
				System.out.println("actualEmployeeNI-" + actualEmployeeNI);
				soft.assertEquals(actualEmployeeNI, expectedEmployeeNI,"EmployeeNi not as expected");



				String actualNetPay= elem.get(10).getText();
				actualNetPay = actualNetPay.replaceAll(",", "");
				actualNetPay = actualNetPay.replaceAll("£", "");
				System.out.println("actualNetPay-" + actualNetPay);
				soft.assertEquals(actualNetPay, expectedNetPay,"Net not as expected");

				String actualEmployerNI= elem.get(11).getText();
				actualEmployerNI = actualEmployerNI.replaceAll(",", "");
				actualEmployerNI = actualEmployerNI.replaceAll("£", "");
				System.out.println("actualEmployerNI-" + actualEmployerNI);
				soft.assertEquals(actualEmployerNI, expectedEmployerNI,"EmployerNI not as expected");
				

				
				
			} catch (Exception e) {
				
				System.out.println("Issue In verifyPayrollDashboardGrossNetpay"+e);
			    soft.assertFalse(true,"welcome to catch block");

			}	
				
			Reporter.log("verifyPayrollDashboardTaxNIGrossNetPension");
		}
		
		
		
		

		public void verifEmployeePageAlertMsg(String data)
		{
			
			try {
				

				String alert = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[1]")).getText();
				
				String alertMsg = alert.replaceAll("×", "").trim();
				System.out.println(alertMsg);
				soft.assertEquals(alertMsg, data);
				
				
			} catch (Exception e) {
				System.out.println("Issue in verifyDepatrmentSavedMsg"+e);
			    soft.assertFalse(true,"welcome to catch block");

			}
			Reporter.log("verifyDepatrmentSavedMsg");
		}
		
			
		public void verifyOffPayWorkerNotSelected()
		{
			try {
				
			WebElement yes = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_rblOffPayWorker_0']"));
				
		
			System.out.println("OffPayrollReturning--"+yes.isSelected());
			
			soft.assertFalse(yes.isSelected());
			} catch (Exception e) {
			    soft.assertFalse(true,"welcome to catch block");
				
				System.out.println("Issue IN verifyOffPayWorkerNotSelected"+e);
			}
			
			Reporter.log("verifyOffPayWorkerNotSelected");
			
		}
		
		
		public void verifyAdditionalFps()
		{
			
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table-responsive']/table/tbody/tr/td[6]"));
			
			boolean con=list.isEmpty();
		     soft.assertFalse(con);
			for(int i=0;i<=list.size()-1;i++) {
				
				if(i==0) {
				
				WebElement elem = list.get(i);
				String actualData=elem.getText();
				
				soft.assertEquals(actualData, "1");
				}
				
				else
				{
					WebElement elem = list.get(i);
					String actualData=elem.getText();
					
					soft.assertEquals(actualData, "4");
				}
				
			}
			
			Reporter.log("verifyAdditionalFps");

		}
		
		
		public void verifyAdditionalFpsAnnually()
		{
			
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table-responsive']/table/tbody/tr/td[6]"));
			
			boolean con=list.isEmpty();
		     soft.assertFalse(con);
			for(int i=0;i<=list.size()-1;i++) {
				
				if(i==0||i==1) {
				
				WebElement elem = list.get(i);
				String actualData=elem.getText();
				
				soft.assertEquals(actualData, "4");
				}
				
				else
				{
					WebElement elem = list.get(i);
					String actualData=elem.getText();
					
					soft.assertEquals(actualData, "1");
				}
				
			}
			
			Reporter.log("verifyAdditionalFps");

		}
		
		
		public void verifyAdditionalFpsWeekly()
		{
			
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table-responsive']/table/tbody/tr/td[6]"));
			
			boolean con=list.isEmpty();
		     soft.assertFalse(con);
			for(int i=0;i<=list.size()-1;i++) {
				
				if(i==0) {
				
				WebElement elem = list.get(i);
				String actualData=elem.getText();
				
				soft.assertEquals(actualData, "1");
				}
				
				else
				{
					WebElement elem = list.get(i);
					String actualData=elem.getText();
					
					soft.assertEquals(actualData, "4");
				}
				
			}
			
			Reporter.log("verifyAdditionalFps");

		}
		
		

		public void verifyTax(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11)
		{
			
			try {
				 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[6]"));
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

				
					boolean con=list.isEmpty();
				     soft.assertFalse(con);
					
				 for (int i =0;i<=list.size()-1;i++)
				 {
					 
					 List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[6]"));

					 WebElement elem = list1.get(i);
					 
					String actualData = elem.getText();
					actualData = actualData.replaceAll("[£]", "");
					actualData = actualData.replaceAll("[,]", "");

					System.out.println(actualData);
					 soft.assertEquals(actualData, ar.get(i));
					
				 }
				 
			} catch (Exception e) {
			    soft.assertFalse(true,"welcome to catch block");

				System.out.println("Issue IN verifyTax"+e);
			}
			Reporter.log("verifyTax");

		}
		
		
		public void verifyPayslipTax(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11)
		{
			
			try {
				 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[10]"));
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

				
					boolean con=list.isEmpty();
				     soft.assertFalse(con);
					
				 for (int i =0;i<=list.size()-1;i++)
				 {
					 
					 List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[10]"));

					 WebElement elem = list1.get(i);
					 
					String actualData = elem.getText();
					actualData = actualData.replaceAll("[£]", "");
					actualData = actualData.replaceAll("[,]", "");

					System.out.println(actualData);
					 soft.assertEquals(actualData, ar.get(i));
					
				 }
				 
			} catch (Exception e) {
			    soft.assertFalse(true,"welcome to catch block");

				System.out.println("Issue IN verifyTax"+e);
			}
			Reporter.log("verifyTax");

		}

		
		
		public void verifyEmployeeNI(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11)
		{
			
			try {
				 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[10]"));
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

				
					boolean con=list.isEmpty();
				     soft.assertFalse(con);
					
				 for (int i =0;i<=list.size()-1;i++)
				 {
					 
					 List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[10]"));

					 WebElement elem = list1.get(i);
					 
					String actualData = elem.getText();
					actualData = actualData.replaceAll("[£]", "");
					actualData = actualData.replaceAll("[,]", "");

					System.out.println(actualData);
					 soft.assertEquals(actualData, ar.get(i));
					
				 }
				 
			} catch (Exception e) {
			    soft.assertFalse(true,"welcome to catch block");

				System.out.println("Issue IN verifyEmployeeNI"+e);
			}
			
			Reporter.log("verifyEmployeeNI");
		}
		
		
		
		public void verifyPayslipEmployeeNI(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11)
		{
			
			try {
				 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[11]"));
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

				
					boolean con=list.isEmpty();
				     soft.assertFalse(con);
					
				 for (int i =0;i<=list.size()-1;i++)
				 {
					 
					 List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[11]"));

					 WebElement elem = list1.get(i);
					 
					String actualData = elem.getText();
					actualData = actualData.replaceAll("[£]", "");
					actualData = actualData.replaceAll("[,]", "");

					System.out.println(actualData);
					 soft.assertEquals(actualData, ar.get(i));
					
				 }
				 
			} catch (Exception e) {
			    soft.assertFalse(true,"welcome to catch block");

				System.out.println("Issue IN verifyEmployeeNI"+e);
			}
			
			Reporter.log("verifyPayslipEmployeeNI");
		}
		
		public void verifyEmployerNI(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11)
		{
			
			try {
				 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[12]"));
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

				
					boolean con=list.isEmpty();
				     soft.assertFalse(con);
					
				 for (int i =0;i<=list.size()-1;i++)
				 {
					 
					 List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[12]"));

					 WebElement elem = list1.get(i);
					 
					String actualData = elem.getText();
					actualData = actualData.replaceAll("[£]", "");
					actualData = actualData.replaceAll("[,]", "");

					System.out.println(actualData);
					 soft.assertEquals(actualData, ar.get(i));
					
				 }
				 
			} catch (Exception e) {
			    soft.assertFalse(true,"welcome to catch block");

				System.out.println("Issue IN verifyEmployeeNI"+e);
			}
			
			Reporter.log("verifyEmployerNI");

		}
		
		
		
		public void verifySmpLeave(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11)
		{
			
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table-responsive']/table/tbody/tr/td[3]"));
			boolean con=list.isEmpty();
		     soft.assertFalse(con);
		     
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
				
				for (int i =0;i<=list.size()-1;i++)
				 {
					 
					 List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table-responsive']/table/tbody/tr/td[3]"));

					 WebElement elem = list1.get(i);
					 
					String actualData = elem.getText();
					actualData = actualData.replaceAll("[£]", "");
					actualData = actualData.replaceAll("[,]", "");

					System.out.println(actualData);
					soft.assertEquals(actualData, ar.get(i));
					
				 }     
			
				Reporter.log("verifySmpLeave");
			
		    }
		
		
		
		

		public void verifyPayslipEmployerNI(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11)
		{
			
			try {
				 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[15]"));
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

				
					boolean con=list.isEmpty();
				     soft.assertFalse(con);
					
				 for (int i =0;i<=list.size()-1;i++)
				 {
					 
					 List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[15]"));

					 WebElement elem = list1.get(i);
					 
					String actualData = elem.getText();
					actualData = actualData.replaceAll("[£]", "");
					actualData = actualData.replaceAll("[,]", "");

					System.out.println(actualData);
				    soft.assertEquals(actualData, ar.get(i));
					
				 }
				 
			} catch (Exception e) {
			    soft.assertFalse(true,"welcome to catch block");

				System.out.println("Issue IN verifyEmployeeNI"+e);
			}
			
			Reporter.log("verifyEmployerNI");

		}
		
		
		public void verifyEmployerNI2(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11)
		{
			
			try {
				 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[13]"));
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

				
					boolean con=list.isEmpty();
				     soft.assertFalse(con);
					
				 for (int i =0;i<=list.size()-1;i++)
				 {
					 
					 List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[13]"));

					 WebElement elem = list1.get(i);
					 
					String actualData = elem.getText();
					actualData = actualData.replaceAll("[£]", "");
					actualData = actualData.replaceAll("[,]", "");

					System.out.println(actualData);
					 soft.assertEquals(actualData, ar.get(i));
					
				 }
				 
			} catch (Exception e) {
			    soft.assertFalse(true,"welcome to catch block");

				System.out.println("Issue IN verifyEmployeeNI"+e);
			}
			
			Reporter.log("verifyEmployerNI");

		}
		
		
		public void verifyEmployeePension(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11)
		{
			
			try {
				 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[11]"));
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

				
					boolean con=list.isEmpty();
				     soft.assertFalse(con);
					
				 for (int i =0;i<=list.size()-1;i++)
				 {
					 
					 List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[11]"));

					 WebElement elem = list1.get(i);
					 
					String actualData = elem.getText();
					actualData = actualData.replaceAll("[£]", "");
					actualData = actualData.replaceAll("[,]", "");

					System.out.println(actualData);
					 soft.assertEquals(actualData, ar.get(i));
					
				 }
				 
			} catch (Exception e) {
			    soft.assertFalse(true,"welcome to catch block");

				System.out.println("Issue IN verifyTax"+e);
			}
			Reporter.log("verifyEmployeePension");

		}
		
		
		
		public void verifyEmployeePensionPayslip(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11)
		{
			
			try {
				 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[12]"));
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

				
					boolean con=list.isEmpty();
				     soft.assertFalse(con);
					
				 for (int i =0;i<=list.size()-1;i++)
				 {
					 
					 List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[12]"));

					 WebElement elem = list1.get(i);
					 
					String actualData = elem.getText();
					actualData = actualData.replaceAll("[£]", "");
					actualData = actualData.replaceAll("[,]", "");

					System.out.println(actualData);
					 soft.assertEquals(actualData, ar.get(i));
					
				 }
				 
			} catch (Exception e) {
			    soft.assertFalse(true,"welcome to catch block");

				System.out.println("Issue IN verifyTax"+e);
			}
			Reporter.log("verifyEmployeePension");

		}
		
		
		
		public void verifyEmployerPension(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11)
		{
			
			try {
				 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[14]"));
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

				
					boolean con=list.isEmpty();
				     soft.assertFalse(con);
					
				 for (int i =0;i<=list.size()-1;i++)
				 {
					 
					 List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[14]"));

					 WebElement elem = list1.get(i);
					 
					String actualData = elem.getText();
					actualData = actualData.replaceAll("[£]", "");
					actualData = actualData.replaceAll("[,]", "");

					System.out.println(actualData);
					 soft.assertEquals(actualData, ar.get(i));
					
				 }
				 
			} catch (Exception e) {
			    soft.assertFalse(true,"welcome to catch block");

				System.out.println("Issue IN verifyTax"+e);
			}
			Reporter.log("verifyEmployerPension");

		}
		
		
		
		
		
		public void verifyEmployerPensionPayslip(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11)
		{
			
			try {
				 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[16]"));
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

				
					boolean con=list.isEmpty();
				     soft.assertFalse(con);
					
				 for (int i =0;i<=list.size()-1;i++)
				 {
					 
					 List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[16]"));

					 WebElement elem = list1.get(i);
					 
					String actualData = elem.getText();
					actualData = actualData.replaceAll("[£]", "");
					actualData = actualData.replaceAll("[,]", "");

					System.out.println(actualData);
					 soft.assertEquals(actualData, ar.get(i));
					
				 }
				 
			} catch (Exception e) {
			    soft.assertFalse(true,"welcome to catch block");

				System.out.println("Issue IN verifyTax"+e);
			}
			Reporter.log("verifyEmployerPension");

		}
		
		
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
		 	        		  		String netpay=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(6).getText();
		 	        		      	//System.out.println(EmployeeNI);
		 	        		  		String NetPayment1=netpay.replaceAll("[£]", "");
		 	        		  		NetPayment1=NetPayment1.replaceAll("[,]", "");
		 	        		      	
		 	        		  		System.out.println("This is NetPayment amount="+NetPayment1);
		 	 	       				soft.assertEquals(NetPayment1, NetPayment);

		 	        		  		
		 	        		  		
		//Employer NI Finding
		 	        		      	
		 	        		      	String EmployerNI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div")).get(7).getText();
		 	        		      	//System.out.println(EmployerNI);
		 	        		      	String EmployerNIAmount1=EmployerNI.replaceAll("[£]", "");
		 	        		      	EmployerNIAmount1=EmployerNIAmount1.replaceAll("[,]", "");
		 	        		  		 
		  	        		  		System.out.println("This is EmployerNIAmount ="+EmployerNIAmount1);
		 	 	       				soft.assertEquals(EmployerNIAmount1, EmployerNIAmount);


		 	 	       				Reporter.log("verifyPayrollSummary");
					  		
					    }
		 
		 
		 public void verifyP45PTaxPayToDate(String pay) throws  Exception
			{
				
			 m_Driver.findElement(By.xpath("//*[@id='tblP45']/tbody/tr[2]/td[7]")).click();
			 
			 Thread.sleep(20000);
			
					File file = new File(path+"P45-2023-2024-Mr. Employee A.pdf");
					PDDocument document = PDDocument.load(file);
					PDFTextStripper pdfStripper = new PDFTextStripper();
				String	PDFtext = pdfStripper.getText(document);
					
					System.out.println(PDFtext);
					document.close();
					
				soft.assertTrue(PDFtext.contains(pay),"Tax pay to date Not as expexted");
			
				Reporter.log("verifyP45PTaxPayToDate");
			
						   if(file.delete())
						    System.out.println("file deleted");
						
			}
		 
		 
		 public void verifyP45PTaxPayToDateTotalTax(String pay,String Tax) throws  Exception
			{
				
			 m_Driver.findElement(By.xpath("//*[@id='tblP45']/tbody/tr[2]/td[7]")).click();
			 
			 Thread.sleep(20000);
			
					File file = new File(path+"P45-2023-2024-Mr. Employee A.pdf");
					PDDocument document = PDDocument.load(file);
					PDFTextStripper pdfStripper = new PDFTextStripper();
				String	PDFtext = pdfStripper.getText(document);
					
					System.out.println(PDFtext);
					document.close();
					
				soft.assertTrue(PDFtext.contains(pay),"Tax pay to date Not as expexted");
				
				soft.assertTrue(PDFtext.contains(Tax),"Total tax to date");

			
				Reporter.log("verifyP45PTaxPayToDate");
			
						   if(file.delete())
						    System.out.println("file deleted");
						
			}
		 
		 public void verifyP45PTaxPayToDateTotalTax2(String pay,String Tax) throws  Exception
			{
				
			 m_Driver.findElement(By.xpath("//*[@id='tblP45']/tbody/tr[2]/td[7]")).click();
			 
			 Thread.sleep(20000);
			
					File file = new File(path+"P45-2024-2025-Mr. Employee NA.pdf");
					PDDocument document = PDDocument.load(file);
					PDFTextStripper pdfStripper = new PDFTextStripper();
				String	PDFtext = pdfStripper.getText(document);
					
					System.out.println(PDFtext);
					document.close();
					
				soft.assertTrue(PDFtext.contains(pay),"Tax pay to date Not as expexted");
				
				soft.assertTrue(PDFtext.contains(Tax),"Total tax to date");

			
				Reporter.log("verifyP45PTaxPayToDate");
			
						   if(file.delete())
						    System.out.println("file deleted");
						
			}

		 
		 public void verifyPayslip(String gross, String tax, String employeeNi, String NetPay, String EmployerNi) {
			 
			 
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td"));
			String actualGross = list.get(8).getText();
			String actualIncomeTax = list.get(9).getText();
			String actualEmployeeNi = list.get(10).getText();
			String actualNetPay = list.get(13).getText();
			String actualEmployerNI = list.get(14).getText();

 			soft.assertEquals(actualGross, gross);
 			soft.assertEquals(actualIncomeTax, tax);
 			soft.assertEquals(actualEmployeeNi, employeeNi);
 			soft.assertEquals(actualNetPay, NetPay);
 			soft.assertEquals(actualEmployerNI, EmployerNi);

			 Reporter.log("verifyPayslip");
			 
		 }
	public void assertAll()
	{
		soft.assertAll();
		
	}
	
	

}
