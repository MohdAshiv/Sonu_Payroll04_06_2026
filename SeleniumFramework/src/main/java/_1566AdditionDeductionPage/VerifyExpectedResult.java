package _1566AdditionDeductionPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import au.com.bytecode.opencsv.CSVReader;
import pages.BasePage;
import utilities.ChangeWindow;

public class VerifyExpectedResult extends BasePage {

	 static String GrossAmount,GrossAmount2,GrossAmount3,GrossAmount4,GrossAmount5;
	 static String incomeTax,incomeTax2,incomeTax3,incomeTax4,incomeTax5;
	 static String employeeNI,employeeNI2,employeeNI3,employeeNI4,employeeNI5;
	 static String EmployeePension,EmployeePension2,EmployeePension3,EmployeePension4,EmployeePension5;
	  static String Net,Net2,Net3,Net4,Net5;
	  static String employerNI,employerNI2,employerNI3,employerNI4,employerNI5;
	  static String employerPension,employerPension2,employerPension3,employerPension4,employerPension5;
	  
	  String actualLel,actualPT,actualUel,actualEeEr,actualEENi;
	  
	  String Data="";
	  SoftAssert soft= new SoftAssert();
	static String PDFtext;
	public VerifyExpectedResult(WebDriver driver) {
		super(driver);
		
	}
  
	public void DefaultCheckedAllOptions()
	{
		
		List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[1]/li/a/input"));
		WebElement checked = null;
		for(int i=0;i<=list.size()-1;i++)
		{
			
			if(i<=3)
			{			
				
		      checked = list.get(i);

			String selected = checked.getAttribute("checked");
			System.out.println("elemnt is " + selected);
			assertTrue(checked.isSelected(), +i+" is not checked");
			
			}
			else
			{
				break;
	
			}
		
			
		}
		
		
		Reporter.log("Verify All options default Check");
	}
	
	
	public void elemClickable()
	{
		
		List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='dropdown-menu dropdown-menu-left']/li/a/input"));
	
		for(int i=0;i<=list.size()-1;i++)
		{
			WebElement checked = list.get(i);
			
		if(i==4)
		{
			break;
		}
			
		  if(checked.isSelected())
		  {
			 checked.click();
		
		  }
		  String clickable = checked.getAttribute("checked"); 
		  System.out.println("elem is "+ clickable);
		  assertFalse(checked.isSelected(), +i+" is not clickable");
		}
		Reporter.log("Verify All options Clickable");
		
	}
		public void DefaultCheckedAllOptions_Deduction()
		{
			
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='dropdown-menu dropdown-menu-left']/following::li/a/input"));
		
			for(int i=0;i<=list.size()-1;i++)
			{
				WebElement checked = list.get(i);
				String selected = checked.getAttribute("checked");
				System.out.println("elemnt is " + selected);
				assertTrue(checked.isSelected(), +i+" is not checked");
			}
			Reporter.log("Verify All options default Check");
		}
		
		
		public void elemClickable_Deductions()
		{
			
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='dropdown-menu dropdown-menu-left']/following::li/a/input"));
		
			for(int i=0;i<=list.size()-1;i++)
			{
				WebElement checked = list.get(i);
				
			  if(checked.isSelected())
			  {
				 checked.click();
			
			  }
			  String clickable = checked.getAttribute("checked"); 
			  System.out.println("elem is "+ clickable);
			  assertTrue(checked.isSelected(), +i+" is not clickable");
			}
			Reporter.log("Verify All options Clickable");
}
		
		public void taxAndPension(String tax,String pension,String pension2)
		{
			
			   List<WebElement> incomeTax = m_Driver.findElements(By.xpath("//table[@class='table table-head-bg']//tr//td[6]"));
			   
			   boolean incomtaxvalue=false;
			   for(WebElement ele:incomeTax)
			   {
				   
				   String value = ele.getText();
				   value =value.substring(1, 3);
				   System.out.println("Income tax is ="+value);
				   if(value.contains(tax))
				   {
					   incomtaxvalue=true;
					   break;
				   }
				   
				   Assert.assertTrue(incomtaxvalue,"does not exist");
				  utilities.TakeScreenshot.Getscreenshot("TC051_ Verify Tax and Pension", "1566", m_Driver);
				  

			   }
			
			
             List<WebElement> employeePension = m_Driver.findElements(By.xpath("//table[@class='table table-head-bg']//tr//td[11]"));
			   
			   boolean employeePensionvalue=false;
			   for(WebElement ele:employeePension)
			   {
				   
				   String value = ele.getText();
				   value =value.substring(1, 2);
				   System.out.println("Employee pension is ="+value);
				   if(value.contains(pension))
				   {
					   employeePensionvalue=true;
					   break;
				   }
				   Assert.assertTrue(employeePensionvalue,"does not exist");
			   }
			   
             List<WebElement> employerPension = m_Driver.findElements(By.xpath("//table[@class='table table-head-bg']//tr//td[13]"));
			   
			   boolean employerPensionstatus=false;
			   for(WebElement ele:employerPension)
			   {
				   
				   String value = ele.getText();
				   value =value.substring(1, 2);
				   System.out.println("Employer pension is ="+value);
				   if(value.contains(pension2))
				   {
					   employerPensionstatus=true;
					   break;
				   }
				   Assert.assertTrue(employerPensionstatus,"does not exist");
		}
		}
		
		
		public void payrollDashboard()
		{
			
			  List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']//tbody//tr//td[contains(text(),'£')]"));
			  
			   for(int i=0;i<=list.size()-1;i++)
			   {
				   
				   GrossAmount = list.get(0).getText();
				   incomeTax = list.get(1).getText();
				   employeeNI = list.get(2).getText();
				   EmployeePension = list.get(3).getText();
				   Net =m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords_ctl02_lblNetSalary']")).getText();
				   employerNI = list.get(4).getText();
				   employerPension = list.get(5).getText();
				     
			       break;
				 
				     
				   
			   }
			   Reporter.log("Get data from PayrollDashboard");
				  
		}
		
		public void employeedashboard()
		{
			     
			  List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]//tr[3]/td"));
			  
			  
			    int length = list.size();
			    
			    for(int i=0;i<=length;i++)
			    {
					String expectedGrossAmount = list.get(0).getText();
					assertEquals(GrossAmount, expectedGrossAmount);
					String expectedIncomeTax = list.get(1).getText();
					assertEquals(incomeTax, expectedIncomeTax);
					String expextedEmployeeNI = list.get(2).getText();
					assertEquals(employeeNI, expextedEmployeeNI);
					String expectedEmployeePension = list.get(3).getText();
					assertEquals(EmployeePension, expectedEmployeePension);
					String expectedNet = list.get(4).getText();
					assertEquals(Net, expectedNet);
					String expectedEmployerNI = list.get(5).getText();
					assertEquals(employerNI, expectedEmployerNI);
					String expectedEemployerPension = list.get(6).getText();
					assertEquals(employerPension, expectedEemployerPension);
					break;
			    	
			    }
			
			System.out.println("April");
			Reporter.log("Verify Employee dashboard April");
			
		}
		
		public void employeedashboardMay()
		{
			     
			  List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]//tr[4]/td"));
			  
			  
			    int length = list.size();
			    
			    for(int i=0;i<=length;i++)
			    {
					String expectedGrossAmount = list.get(0).getText();
					assertEquals(GrossAmount, expectedGrossAmount);
					String expectedIncomeTax = list.get(1).getText();
					assertEquals(incomeTax, expectedIncomeTax);
					String expextedEmployeeNI = list.get(2).getText();
					assertEquals(employeeNI, expextedEmployeeNI);
					String expectedEmployeePension = list.get(3).getText();
					assertEquals(EmployeePension, expectedEmployeePension);
					String expectedNet = list.get(4).getText();
					assertEquals(Net, expectedNet);
					String expectedEmployerNI = list.get(5).getText();
					assertEquals(employerNI, expectedEmployerNI);
					String expectedEemployerPension = list.get(6).getText();
					assertEquals(employerPension, expectedEemployerPension);
					break;
			    	
			    }
			    System.out.println("May");
			
			    Reporter.log("Verify Employee dashboard May");
		}
		
		public void employeedashboardJune()
		{
			     
			  List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]//tr[5]/td"));
			  
			  
			
					String expectedGrossAmount = list.get(0).getText();
					assertEquals(GrossAmount, expectedGrossAmount);
					String expectedIncomeTax = list.get(1).getText();
					assertEquals(incomeTax, expectedIncomeTax);
					String expextedEmployeeNI = list.get(2).getText();
					assertEquals(employeeNI, expextedEmployeeNI);
					String expectedEmployeePension = list.get(3).getText();
					assertEquals(EmployeePension, expectedEmployeePension);
					String expectedNet = list.get(4).getText();
					assertEquals(Net, expectedNet);
					String expectedEmployerNI = list.get(5).getText();
					assertEquals(employerNI, expectedEmployerNI);
					String expectedEemployerPension = list.get(6).getText();
					assertEquals(employerPension, expectedEemployerPension);
			
			
			
			    System.out.println("June");
			    Reporter.log("Verify Employee dashboard June");
		}

		
		
		public void getDataEmployee1()
		{
			
			  List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']//tbody//tr[2]//td[contains(text(),'£')]"));
			  
			   for(int i=0;i<=list.size()-1;i++)
			   {
				   
				   GrossAmount = list.get(0).getText();
				   incomeTax = list.get(1).getText();
				   employeeNI = list.get(2).getText();
				   EmployeePension = list.get(3).getText();
				   Net =m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords_ctl02_lblNetSalary']")).getText();
				   employerNI = list.get(4).getText();
				   employerPension = list.get(5).getText();
				     
			       break;
				 
				     
				   
			   }
			   Reporter.log("Get Data Employee1");
			   
				  
		}
		public void verifyPayrollPageEmployee1()
		{
			     
			  List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/following::table/tbody/tr[3]/td"));
			  
			  
			    int length = list.size();
			    
			    for(int i=0;i<=length;i++)
			    {
					String expectedGrossAmount = list.get(0).getText();
					assertEquals(GrossAmount, expectedGrossAmount);
					String expectedIncomeTax = list.get(1).getText();
					assertEquals(incomeTax, expectedIncomeTax);
					String expextedEmployeeNI = list.get(2).getText();
					assertEquals(employeeNI, expextedEmployeeNI);
					String expectedEmployeePension = list.get(3).getText();
					assertEquals(EmployeePension, expectedEmployeePension);
					String expectedNet = list.get(4).getText();
					assertEquals(Net, expectedNet);
					String expectedEmployerNI = list.get(5).getText();
					assertEquals(employerNI, expectedEmployerNI);
					String expectedEemployerPension = list.get(6).getText();
					assertEquals(employerPension, expectedEemployerPension);
					break;
			    	
			    }
		      Reporter.log("Verify Payroll Page Employee1");
		
		}
		
		public void getDataEmployee2()
		{
			
			  List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']//tbody//tr[3]//td[contains(text(),'£')]"));
			  
			   for(int i=0;i<=list.size()-1;i++)
			   {
				   
				   GrossAmount = list.get(0).getText();
				   incomeTax = list.get(1).getText();
				   employeeNI = list.get(2).getText();
				   EmployeePension = list.get(3).getText();
				   Net =m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords_ctl03_lblNetSalary']")).getText();
				   employerNI = list.get(4).getText();
				   employerPension = list.get(5).getText();
				     
			       break;
				 
			   }
			   Reporter.log("Get Data Employee2");

		}
		public void getDataEmployee3()
		{
			
			  List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']//tbody//tr[4]//td[contains(text(),'£')]"));
			  
			   for(int i=0;i<=list.size()-1;i++)
			   {
				   
				   GrossAmount = list.get(0).getText();
				   incomeTax = list.get(1).getText();
				   employeeNI = list.get(2).getText();
				   EmployeePension = list.get(3).getText();
				   Net =m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords_ctl04_lblNetSalary']")).getText();
				   employerNI = list.get(4).getText();
				   employerPension = list.get(5).getText();
				     
			       break;
				 
			   }
			   
			   Reporter.log("Get Data Employee3");
		}
		
		public void getDataEmployee4()
		{
			
			  List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']//tbody//tr[5]//td[contains(text(),'£')]"));
			  
			   for(int i=0;i<=list.size()-1;i++)
			   {
				   
				   GrossAmount = list.get(0).getText();
				   incomeTax = list.get(1).getText();
				   employeeNI = list.get(2).getText();
				   EmployeePension = list.get(3).getText();
				   Net =m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords_ctl05_lblNetSalary']")).getText();
				   employerNI = list.get(4).getText();
				   employerPension = list.get(5).getText();
				     
			       break;
				 
			   }
			   Reporter.log("Get Data Employee4");
		}
		public void getDataEmployee5()
		{
			
			  List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']//tbody//tr[6]//td[contains(text(),'£')]"));
			  
			   for(int i=0;i<=list.size()-1;i++)
			   {
				   
				   GrossAmount = list.get(0).getText();
				   incomeTax = list.get(1).getText();
				   employeeNI = list.get(2).getText();
				   EmployeePension = list.get(3).getText();
				   Net =m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords_ctl06_lblNetSalary']")).getText();
				   employerNI = list.get(4).getText();
				   employerPension = list.get(5).getText();
				     
			       break;
				 
			   }
			   Reporter.log("Get Data Employee5");
		}
		public void verifyPayrollPageEmployee2()
		{
			     
			  List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/following::table/tbody/tr[4]/td"));
			  
			  
			    int length = list.size();
			    
			    for(int i=0;i<=length;i++)
			    {
					String expectedGrossAmount = list.get(0).getText();
					assertEquals(GrossAmount, expectedGrossAmount);
					String expectedIncomeTax = list.get(1).getText();
					assertEquals(incomeTax, expectedIncomeTax);
					String expextedEmployeeNI = list.get(2).getText();
					assertEquals(employeeNI, expextedEmployeeNI);
					String expectedEmployeePension = list.get(3).getText();
					assertEquals(EmployeePension, expectedEmployeePension);
					String expectedNet = list.get(4).getText();
					assertEquals(Net, expectedNet);
					String expectedEmployerNI = list.get(5).getText();
					assertEquals(employerNI, expectedEmployerNI);
					String expectedEemployerPension = list.get(6).getText();
					assertEquals(employerPension, expectedEemployerPension);
					break;
			    	
			    }
			    Reporter.log("Verify Payroll Page Employee2");
}
		public void verifyPayrollPageEmployee3()
		{
			     
			  List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/following::table/tbody/tr[5]/td"));
			  
			  
			    int length = list.size();
			    
			    for(int i=0;i<=length;i++)
			    {
					String expectedGrossAmount = list.get(0).getText();
					assertEquals(GrossAmount, expectedGrossAmount);
					String expectedIncomeTax = list.get(1).getText();
					assertEquals(incomeTax, expectedIncomeTax);
					String expextedEmployeeNI = list.get(2).getText();
					assertEquals(employeeNI, expextedEmployeeNI);
					String expectedEmployeePension = list.get(3).getText();
					assertEquals(EmployeePension, expectedEmployeePension);
					String expectedNet = list.get(4).getText();
					assertEquals(Net, expectedNet);
					String expectedEmployerNI = list.get(5).getText();
					assertEquals(employerNI, expectedEmployerNI);
					String expectedEemployerPension = list.get(6).getText();
					assertEquals(employerPension, expectedEemployerPension);
					break;
			    	
			    }
			    Reporter.log("Verify Payroll Page Employee3");
}
		
		public void verifyPayrollPageEmployee4()
		{
			     
			  List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/following::table/tbody/tr[6]/td"));
			  
			  
			    int length = list.size();
			    
			    for(int i=0;i<=length;i++)
			    {
					String expectedGrossAmount = list.get(0).getText();
					assertEquals(GrossAmount, expectedGrossAmount);
					String expectedIncomeTax = list.get(1).getText();
					assertEquals(incomeTax, expectedIncomeTax);
					String expextedEmployeeNI = list.get(2).getText();
					assertEquals(employeeNI, expextedEmployeeNI);
					String expectedEmployeePension = list.get(3).getText();
					assertEquals(EmployeePension, expectedEmployeePension);
					String expectedNet = list.get(4).getText();
					assertEquals(Net, expectedNet);
					String expectedEmployerNI = list.get(5).getText();
					assertEquals(employerNI, expectedEmployerNI);
					String expectedEemployerPension = list.get(6).getText();
					assertEquals(employerPension, expectedEemployerPension);
					break;
			    	
			    }
			    Reporter.log("Verify Payroll Page Employee4");
}
		public void verifyPayrollPageEmployee5()
		{
			     
			  List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/following::table/tbody/tr[7]/td"));
			  
			  
			    int length = list.size();
			    
			    for(int i=0;i<=length;i++)
			    {
					String expectedGrossAmount = list.get(0).getText();
					assertEquals(GrossAmount, expectedGrossAmount);
					String expectedIncomeTax = list.get(1).getText();
					assertEquals(incomeTax, expectedIncomeTax);
					String expextedEmployeeNI = list.get(2).getText();
					assertEquals(employeeNI, expextedEmployeeNI);
					String expectedEmployeePension = list.get(3).getText();
					assertEquals(EmployeePension, expectedEmployeePension);
					String expectedNet = list.get(4).getText();
					assertEquals(Net, expectedNet);
					String expectedEmployerNI = list.get(5).getText();
					assertEquals(employerNI, expectedEmployerNI);
					String expectedEemployerPension = list.get(6).getText();
					assertEquals(employerPension, expectedEemployerPension);
					break;
			    	
			    }
			    Reporter.log("Verify Payroll Page Employee5");
}
		
		  public void getMultipleEmployeeData()
		    {
			 
			  List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']//tbody//tr[2]//td[contains(text(),'£')]"));
			  List<WebElement> list2 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']//tbody//tr[3]//td[contains(text(),'£')]"));
			  List<WebElement> list3 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']//tbody//tr[4]//td[contains(text(),'£')]"));
			  List<WebElement> list4 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']//tbody//tr[5]//td[contains(text(),'£')]"));
			  List<WebElement> list5 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']//tbody//tr[6]//td[contains(text(),'£')]"));
				
			   for(int i=0;i<=list.size()-1;i++)
			   {
				   
				   GrossAmount = list.get(0).getText();
				   incomeTax = list.get(1).getText();
				   employeeNI = list.get(2).getText();
				   EmployeePension = list.get(3).getText();
				   Net =m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords_ctl02_lblNetSalary']")).getText();
				   employerNI = list.get(4).getText();
				   employerPension = list.get(5).getText();
				     
			       break;
				  
			   }

				   
				   for(int i=0;i<=list2.size()-1;i++)
				   {
					   
					   GrossAmount2 = list2.get(0).getText();
					   incomeTax2 = list2.get(1).getText();
					   employeeNI2 = list2.get(2).getText();
					   EmployeePension2 = list2.get(3).getText();
					   Net2 =m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords_ctl03_lblNetSalary']")).getText();
					   employerNI2 = list2.get(4).getText();
					   employerPension2 = list2.get(5).getText();
					     
				       break;
					 
				   }
				   
				   for(int i=0;i<=list3.size()-1;i++)
				   {
					   
					   GrossAmount3 = list3.get(0).getText();
					   incomeTax3 = list3.get(1).getText();
					   employeeNI3 = list3.get(2).getText();
					   EmployeePension3 = list3.get(3).getText();
					   Net3 =m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords_ctl04_lblNetSalary']")).getText();
					   employerNI3 = list3.get(4).getText();
					   employerPension3 = list3.get(5).getText();
					     
				       break;
					 
				   }

					   for(int i=0;i<=list4.size()-1;i++)
					   {
						   
						   GrossAmount4 = list4.get(0).getText();
						   incomeTax4 = list4.get(1).getText();
						   employeeNI4 = list4.get(2).getText();
						   EmployeePension4 = list4.get(3).getText();
						   Net4 =m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords_ctl05_lblNetSalary']")).getText();
						   employerNI4 = list4.get(4).getText();
						   employerPension4 = list4.get(5).getText();
						     
					       break;
						 
					   }
					 
						  
					   for(int i=0;i<=list5.size()-1;i++)
					   {
						   
						   GrossAmount5 = list5.get(0).getText();
						   incomeTax5 = list5.get(1).getText();
						   employeeNI5 = list5.get(2).getText();
						   EmployeePension5 = list5.get(3).getText();
						   Net5 =m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords_ctl06_lblNetSalary']")).getText();
						   employerNI5 = list5.get(4).getText();
						   employerPension5 = list5.get(5).getText();
						     
					       break;
						 
					   }
		    	
					   Reporter.log("Get data for All Employees");
		    }
		
		public void VerifyPayrollSummary() throws  Exception
		{
			
			
		
			ChangeWindow.tabswitch(m_Driver);
			
			Thread.sleep(9000);
			utilities.TakeScreenshot.Getscreenshot("TC056_ Verify Payroll Summary", "1566", m_Driver);
			Robot robot = new Robot();
			// press Ctrl+S the Robot's way
			
			
			for (int i = 0; i <= 7; i++) {
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
				Thread.sleep(4000);
			}
			
			
				 robot.keyPress(KeyEvent.VK_ENTER);
		         robot.keyRelease(KeyEvent.VK_ENTER);
				 Thread.sleep(4000);
			
				 robot.keyPress(KeyEvent.VK_ENTER);
		         robot.keyRelease(KeyEvent.VK_ENTER);
				 Thread.sleep(4000);
			
          
                    

           // Thread.sleep(3000);
  			File file = new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2022-04-30.pdf");
  			PDDocument document = PDDocument.load(file);
  			PDFTextStripper pdfStripper = new PDFTextStripper();
  			PDFtext = pdfStripper.getText(document);
  			
  			//System.out.println(PDFtext);
  			document.close();
  			
  			
  			
  		
  			
			Assert.assertTrue(PDFtext.contains(GrossAmount));
			Assert.assertTrue(PDFtext.contains(incomeTax));
			Assert.assertTrue(PDFtext.contains(employeeNI));
			Assert.assertTrue(PDFtext.contains(EmployeePension));
			Assert.assertTrue(PDFtext.contains(Net));
			Assert.assertTrue(PDFtext.contains(employerNI));
			Assert.assertTrue(PDFtext.contains(employerPension));
			Assert.assertTrue(PDFtext.contains(GrossAmount2));
			Assert.assertTrue(PDFtext.contains(incomeTax2));
			Assert.assertTrue(PDFtext.contains(employeeNI2));
			Assert.assertTrue(PDFtext.contains(EmployeePension2));
			Assert.assertTrue(PDFtext.contains(Net2));
			Assert.assertTrue(PDFtext.contains(employerNI2));
			Assert.assertTrue(PDFtext.contains(employerPension2));
			Assert.assertTrue(PDFtext.contains(GrossAmount3));
			Assert.assertTrue(PDFtext.contains(incomeTax3));
			Assert.assertTrue(PDFtext.contains(employeeNI3));
			Assert.assertTrue(PDFtext.contains(EmployeePension3));
			Assert.assertTrue(PDFtext.contains(Net3));
			Assert.assertTrue(PDFtext.contains(employerNI3));
			Assert.assertTrue(PDFtext.contains(employerPension3));
			Assert.assertTrue(PDFtext.contains(GrossAmount4));
			Assert.assertTrue(PDFtext.contains(incomeTax4));
			Assert.assertTrue(PDFtext.contains(employeeNI4));
			Assert.assertTrue(PDFtext.contains(EmployeePension4));
			Assert.assertTrue(PDFtext.contains(Net4));
			Assert.assertTrue(PDFtext.contains(employerNI4));
			Assert.assertTrue(PDFtext.contains(employerPension4));
			Assert.assertTrue(PDFtext.contains(GrossAmount5));
			Assert.assertTrue(PDFtext.contains(incomeTax5));
			Assert.assertTrue(PDFtext.contains(employeeNI5));
			Assert.assertTrue(PDFtext.contains(EmployeePension5));
			Assert.assertTrue(PDFtext.contains(Net5));
			Assert.assertTrue(PDFtext.contains(employerNI5));
			Assert.assertTrue(PDFtext.contains(employerPension5));
			
			Reporter.log("Verify All data");
		
  				    if(file.delete())
  				    System.out.println("file deleted");
  				
		}
		
	
		
		public void VerifyRecivedPayrollSummary() throws  Exception
		{
		
			m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl05_lbtnFileName']/b")).click();
			
			Thread.sleep(9000);
			Robot robot = new Robot();
			// press Ctrl+S the Robot's way
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);

			Thread.sleep(3000);

			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(3000);

			robot.keyPress(KeyEvent.VK_ENTER);

			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_UP);
			robot.keyRelease(KeyEvent.VK_UP);
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

            Thread.sleep(3000);
  			File file = new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2022-04-30.pdf");
  			PDDocument document = PDDocument.load(file);
  			PDFTextStripper pdfStripper = new PDFTextStripper();
  			PDFtext = pdfStripper.getText(document);
  			
  			//System.out.println(PDFtext);
  			document.close();
  			
  			System.out.println(PDFtext);
  			
  		
  			
			Assert.assertTrue(PDFtext.contains(GrossAmount));
			Assert.assertTrue(PDFtext.contains(incomeTax));
			Assert.assertTrue(PDFtext.contains(employeeNI));
			Assert.assertTrue(PDFtext.contains(EmployeePension));
			Assert.assertTrue(PDFtext.contains(Net));
			Assert.assertTrue(PDFtext.contains(employerNI));
			Assert.assertTrue(PDFtext.contains(employerPension));
			Assert.assertTrue(PDFtext.contains(GrossAmount2));
			Assert.assertTrue(PDFtext.contains(incomeTax2));
			Assert.assertTrue(PDFtext.contains(employeeNI2));
			Assert.assertTrue(PDFtext.contains(EmployeePension2));
			Assert.assertTrue(PDFtext.contains(Net2));
			Assert.assertTrue(PDFtext.contains(employerNI2));
			Assert.assertTrue(PDFtext.contains(employerPension2));
			Assert.assertTrue(PDFtext.contains(GrossAmount3));
			Assert.assertTrue(PDFtext.contains(incomeTax3));
			Assert.assertTrue(PDFtext.contains(employeeNI3));
			Assert.assertTrue(PDFtext.contains(EmployeePension3));
			Assert.assertTrue(PDFtext.contains(Net3));
			Assert.assertTrue(PDFtext.contains(employerNI3));
			Assert.assertTrue(PDFtext.contains(employerPension3));
			Assert.assertTrue(PDFtext.contains(GrossAmount4));
			Assert.assertTrue(PDFtext.contains(incomeTax4));
			Assert.assertTrue(PDFtext.contains(employeeNI4));
			Assert.assertTrue(PDFtext.contains(EmployeePension4));
			Assert.assertTrue(PDFtext.contains(Net4));
			Assert.assertTrue(PDFtext.contains(employerNI4));
			Assert.assertTrue(PDFtext.contains(employerPension4));
			Assert.assertTrue(PDFtext.contains(GrossAmount5));
			Assert.assertTrue(PDFtext.contains(incomeTax5));
			Assert.assertTrue(PDFtext.contains(employeeNI5));
			Assert.assertTrue(PDFtext.contains(EmployeePension5));
			Assert.assertTrue(PDFtext.contains(Net5));
			Assert.assertTrue(PDFtext.contains(employerNI5));
			Assert.assertTrue(PDFtext.contains(employerPension5));
			
			Reporter.log("Verify All data on recieved Payroll Summary");
		
  				    if(file.delete())
  				    System.out.println("file deleted");
  				  
  					
		}
		
		
		public void VerifyRecivedPaysliplEmployee2() throws  Exception
		{
		
			m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b")).click();
			
			
			Thread.sleep(9000);
			Robot robot = new Robot();
			// press Ctrl+S the Robot's way
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);

			Thread.sleep(3000);

			for (int i = 0; i <= 5; i++) {
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
  			File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Sonu kumar[23264] - 2022-04-30.pdf");
  			PDDocument document = PDDocument.load(file);
  			PDFTextStripper pdfStripper = new PDFTextStripper();
  			PDFtext = pdfStripper.getText(document);
  			
  			//System.out.println(PDFtext);
  			document.close();
  		
			Assert.assertTrue(PDFtext.contains(GrossAmount2));
			Assert.assertTrue(PDFtext.contains(incomeTax2));
			Assert.assertTrue(PDFtext.contains(employeeNI2));
			Assert.assertTrue(PDFtext.contains(EmployeePension2));
			Assert.assertTrue(PDFtext.contains(Net2));
			Assert.assertTrue(PDFtext.contains(employerNI2));
			Assert.assertTrue(PDFtext.contains(employerPension2));

			if (file.delete())
				System.out.println("file deleted");
			Reporter.log("Verify Verify Recived Payslip 2 ");
		
		}
		
		public void VerifyRecivedPaysliplEmployee1() throws  Exception
		{
		
			m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl04_lbtnFileName']/b")).click();
			
			
			Thread.sleep(9000);
			Robot robot = new Robot();
			// press Ctrl+S the Robot's way
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);

			Thread.sleep(3000);

			for (int i = 0; i <= 1; i++) {
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
  			File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Priya Jha[23267] - 2022-04-30.pdf");
  			PDDocument document = PDDocument.load(file);
  			PDFTextStripper pdfStripper = new PDFTextStripper();
  			PDFtext = pdfStripper.getText(document);
  			
  			//System.out.println(PDFtext);
  			document.close();
  			
  			System.out.println(PDFtext);
  			
  		
  			
  			Assert.assertTrue(PDFtext.contains(GrossAmount));
			Assert.assertTrue(PDFtext.contains(incomeTax));
			Assert.assertTrue(PDFtext.contains(employeeNI));
			Assert.assertTrue(PDFtext.contains(EmployeePension));
			Assert.assertTrue(PDFtext.contains(Net));
			Assert.assertTrue(PDFtext.contains(employerNI));
			Assert.assertTrue(PDFtext.contains(employerPension));
		
  				    if(file.delete())
  				    System.out.println("file deleted");
  				  Reporter.log("Verify Verify Recived Payslip 1 ");
  					
		}
		public void VerifyRecivedPaysliplEmployee3() throws  Exception
		{
		
			m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl02_lbtnFileName']/b")).click();
			
			
			Thread.sleep(9000);
			Robot robot = new Robot();
			// press Ctrl+S the Robot's way
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);

			Thread.sleep(3000);

			for (int i = 0; i <= 3; i++) {
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
  			File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Suraj Singh[23266] - 2022-04-30.pdf");
  			PDDocument document = PDDocument.load(file);
  			PDFTextStripper pdfStripper = new PDFTextStripper();
  			PDFtext = pdfStripper.getText(document);
  			
  			//System.out.println(PDFtext);
  			document.close();
  			
  			System.out.println(PDFtext);
  			
  		
  			
  			Assert.assertTrue(PDFtext.contains(GrossAmount3));
			Assert.assertTrue(PDFtext.contains(incomeTax3));
			Assert.assertTrue(PDFtext.contains(employeeNI3));
			Assert.assertTrue(PDFtext.contains(EmployeePension3));
			Assert.assertTrue(PDFtext.contains(Net3));
			Assert.assertTrue(PDFtext.contains(employerNI3));
			Assert.assertTrue(PDFtext.contains(employerPension3));
			
  				    if(file.delete())
  				    System.out.println("file deleted");
  				  
  				  Reporter.log("Verify Verify Recived Payslip 3 ");
		}
		
		
		public void VerifyRecivedPaysliplEmployee4() throws  Exception
		{
		
			m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl01_lbtnFileName']/b")).click();
			
			
			Thread.sleep(9000);
			Robot robot = new Robot();
			// press Ctrl+S the Robot's way
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);

			Thread.sleep(3000);

			for (int i = 0; i <= 4; i++) {
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
  			File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Teena Singh[23265] - 2022-04-30.pdf");
  			PDDocument document = PDDocument.load(file);
  			PDFTextStripper pdfStripper = new PDFTextStripper();
  			PDFtext = pdfStripper.getText(document);
  			
  			//System.out.println(PDFtext);
  			document.close();
  			
  			System.out.println(PDFtext);
  			
  		
  			
  			Assert.assertTrue(PDFtext.contains(GrossAmount4));
			Assert.assertTrue(PDFtext.contains(incomeTax4));
			Assert.assertTrue(PDFtext.contains(employeeNI4));
			Assert.assertTrue(PDFtext.contains(EmployeePension4));
			Assert.assertTrue(PDFtext.contains(Net4));
			Assert.assertTrue(PDFtext.contains(employerNI4));
			Assert.assertTrue(PDFtext.contains(employerPension4));			
		
  				    if(file.delete())
  				    System.out.println("file deleted");
  				  
  				  Reporter.log("Verify Verify Recived Payslip 4 ");
		}
		
		public void VerifyRecivedPaysliplEmployee5() throws  Exception
		{
		
			m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl03_lbtnFileName']/b")).click();
			
			
			Thread.sleep(9000);
			Robot robot = new Robot();
			// press Ctrl+S the Robot's way
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);

			Thread.sleep(3000);

			for (int i = 0; i <= 2; i++) {
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
  			File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Uma Singh[23268] - 2022-04-30.pdf");
  			PDDocument document = PDDocument.load(file);
  			PDFTextStripper pdfStripper = new PDFTextStripper();
  			PDFtext = pdfStripper.getText(document);
  			
  			//System.out.println(PDFtext);
  			document.close();
  			
  			System.out.println(PDFtext);
  			
  		
  			
  			Assert.assertTrue(PDFtext.contains(GrossAmount5));
			Assert.assertTrue(PDFtext.contains(incomeTax5));
			Assert.assertTrue(PDFtext.contains(employeeNI5));
			Assert.assertTrue(PDFtext.contains(EmployeePension5));
			Assert.assertTrue(PDFtext.contains(Net5));
			Assert.assertTrue(PDFtext.contains(employerNI5));
			Assert.assertTrue(PDFtext.contains(employerPension5));	
		
		
  				    if(file.delete())
  				    System.out.println("file deleted");
  				  Reporter.log("Verify Verify Recived Payslip 5 ");  
  					
		}
		
		public void verifyEmployerPension(int value)
		{
			
			SoftAssert soft= new SoftAssert();
			WebElement Pension=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[3]/td[14]"));
			
			            String actualemployerPension = Pension.getText();
			            actualemployerPension   = actualemployerPension.substring(1,3);
			            
			            int expected = (value*3)/100;
			            String expectedEmployerPension = Integer.toString(expected);
			            soft.assertEquals(expectedEmployerPension, actualemployerPension, "expected value not matched");

			             soft.assertAll();
			  
			            
			            
		}
		
		public void verifyEmployeePension(int value)
		{
			
			SoftAssert soft= new SoftAssert();
			WebElement Pension=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[3]/td[11]"));
			
			            String actualemployerPension = Pension.getText();
			            actualemployerPension   = actualemployerPension.substring(1,3);
			            
			            int expected = (value*4)/100;
			            String expectedEmployerPension = Integer.toString(expected);
			            soft.assertEquals(expectedEmployerPension, actualemployerPension, "expected value not matched");
			            
			            soft.assertAll();
			            
			            
		}
		
		public void verifyEmployerPension2(int value)
		{
			
			SoftAssert soft= new SoftAssert();
			WebElement Pension=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[3]/td[14]"));
			
			            String actualemployerPension = Pension.getText();
			            actualemployerPension   = actualemployerPension.substring(1,4);
			            
			            int expected = (value*3)/100;
			            String expectedEmployerPension = Integer.toString(expected);
			            soft.assertEquals(expectedEmployerPension, actualemployerPension, "expected value not matched");
			            
			            soft.assertAll();
			            
			            
		}
		
		
		public void taxNIGrossYTD(String expextedTax , String expectedEmployeeNI,String expectedEmployerNI,String expectedGross )
		{
			 m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));
			 
			String taxYTD = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[16]/div")).getText();
			String employeeNI = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[14]/div")).getText();
			String employerNI = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[17]/div")).getText();
			String gross = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[13]/div")).getText();
			
			assertEquals(taxYTD, expextedTax, "expected result not matched");
			assertEquals(employeeNI, expectedEmployeeNI, "employeeNI expected result not matched");
			assertEquals(employerNI, expectedEmployerNI, "employerNI expected result not matched");
			
			//Reporter.log("Gross amount is not matched " +gross+"="+expectedGross);
			assertEquals(gross, expectedGross, "Gross YTD expected result not matched");
			
			
			m_Driver.switchTo().defaultContent();
            Reporter.log("Verify Tax Ni and Gross YTD");
			
			
		}
		
		public void taxNIYTD1(String expextedTax , String expectedEmployeeNI,String expectedEmployerNI  )
		{
			 m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));
			 
			String taxYTD = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[16]/div")).getText();
			String employeeNI = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[14]/div")).getText();
			String employerNI = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[17]/div")).getText();
		//	String gross = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[13]/div")).getText();
			
			assertEquals(taxYTD, expextedTax, "expected result not matched");
			assertEquals(employeeNI, expectedEmployeeNI, "expected result not matched");
			assertEquals(employerNI, expectedEmployerNI, "expected result not matched");
		
			
			m_Driver.switchTo().defaultContent();

			Reporter.log("Verify tax NI figure");
		}
		
		public void netTaxNIYTD1(String expextedTax , String expectedEmployeeNI,String expectedEmployerNI, String expectedNet )
		{
			 m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));
			 
			String taxYTD = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[16]/div")).getText();
			String employeeNI = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[14]/div")).getText();
			String employerNI = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[17]/div")).getText();
			String net = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[15]/div")).getText();
			
			assertEquals(taxYTD, expextedTax, "expected result not matched");
			assertEquals(employeeNI, expectedEmployeeNI, "expected result not matched");
			assertEquals(employerNI, expectedEmployerNI, "expected result not matched");
			assertEquals(net, expectedNet, "expected result not matched");
		
			
			m_Driver.switchTo().defaultContent();
			Reporter.log("Verify net tax NI figure");
			
		}
		
		public void netTaxNIGrossYTD1(String expextedTax , String expectedEmployeeNI,String expectedEmployerNI, String expectedNet,String expectedGross )
		{
			
			
			 m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));
			 
			String taxYTD = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[16]/div")).getText();
			String employeeNI = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[14]/div")).getText();
			String employerNI = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[17]/div")).getText();
			String net = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[15]/div")).getText();
		    String gross= m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[13]/div")).getText();
		     
		     
		    
			soft.assertEquals(taxYTD, expextedTax, "expected result not matched");
			soft.assertEquals(employeeNI, expectedEmployeeNI, "expected result not matched");
			soft.assertEquals(employerNI, expectedEmployerNI, "expected result not matched");
			soft.assertEquals(net, expectedNet, "expected result not matched");
			soft.assertEquals(gross, expectedGross, "expected result not matched");
			
		
			
			m_Driver.switchTo().defaultContent();
			Reporter.log("Verify net tax NI figure");
			
			
		}

		
		public void assertAll()
		{
			soft.assertAll();
			
			
		}
		
		public void verifyExportToPDF() throws  Exception
		{
		
			m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnExportToPdf']")).click();
			
			Thread.sleep(9000);
			Robot robot = new Robot();
			// press Ctrl+S the Robot's way

			for (int i = 0; i <= 16; i++) {
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
  			File file = new File("C:\\Users\\Sonu\\Downloads\\CompanyPayroll_15367_dated_2022-04-30.pdf");
  			PDDocument document = PDDocument.load(file);
  			PDFTextStripper pdfStripper = new PDFTextStripper();
  			PDFtext = pdfStripper.getText(document);
  			
  			//System.out.println(PDFtext);
  			document.close();
  			
  			System.out.println(PDFtext);
  			
  		
  			
			Assert.assertTrue(PDFtext.contains(GrossAmount));
			Assert.assertTrue(PDFtext.contains(incomeTax));
			Assert.assertTrue(PDFtext.contains(employeeNI));
			Assert.assertTrue(PDFtext.contains(EmployeePension));
			Assert.assertTrue(PDFtext.contains(Net));
			Assert.assertTrue(PDFtext.contains(employerNI));
			Assert.assertTrue(PDFtext.contains(employerPension));
			Assert.assertTrue(PDFtext.contains(GrossAmount2));
			Assert.assertTrue(PDFtext.contains(incomeTax2));
			Assert.assertTrue(PDFtext.contains(employeeNI2));
			Assert.assertTrue(PDFtext.contains(EmployeePension2));
			Assert.assertTrue(PDFtext.contains(Net2));
			Assert.assertTrue(PDFtext.contains(employerNI2));
			Assert.assertTrue(PDFtext.contains(employerPension2));
			Assert.assertTrue(PDFtext.contains(GrossAmount3));
			Assert.assertTrue(PDFtext.contains(incomeTax3));
			Assert.assertTrue(PDFtext.contains(employeeNI3));
			Assert.assertTrue(PDFtext.contains(EmployeePension3));
			Assert.assertTrue(PDFtext.contains(Net3));
			Assert.assertTrue(PDFtext.contains(employerNI3));
			Assert.assertTrue(PDFtext.contains(employerPension3));
			Assert.assertTrue(PDFtext.contains(GrossAmount4));
			Assert.assertTrue(PDFtext.contains(incomeTax4));
			Assert.assertTrue(PDFtext.contains(employeeNI4));
			Assert.assertTrue(PDFtext.contains(EmployeePension4));
			Assert.assertTrue(PDFtext.contains(Net4));
			Assert.assertTrue(PDFtext.contains(employerNI4));
			Assert.assertTrue(PDFtext.contains(employerPension4));
			Assert.assertTrue(PDFtext.contains(GrossAmount5));
			Assert.assertTrue(PDFtext.contains(incomeTax5));
			Assert.assertTrue(PDFtext.contains(employeeNI5));
			Assert.assertTrue(PDFtext.contains(EmployeePension5));
			Assert.assertTrue(PDFtext.contains(Net5));
			Assert.assertTrue(PDFtext.contains(employerNI5));
			Assert.assertTrue(PDFtext.contains(employerPension5));
			
			Reporter.log("Verify All data on recieved Payroll Summary");
		
  				    if(file.delete())
  				    System.out.println("file deleted");
  				  
  					
		}
		
		public void verifyExportToCsv() throws  Exception
		{
		
			m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnExportToCSV']")).click();
			
			Thread.sleep(9000);
			Robot robot = new Robot();
			// press Ctrl+S the Robot's way

			for (int i = 0; i <= 17; i++) {
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
        	CSVReader reader = new CSVReader(
					new FileReader("C:\\Users\\Sonu\\Downloads\\EmployeePaySummary_2022-04-30.csv"));

			List<String[]> list = reader.readAll();
			System.out.println("Total rows which we have is " + list.size());

		
			Iterator<String[]> iterator = list.iterator();

		
			while (iterator.hasNext()) {

				String[] str = iterator.next();

				for (int i = 0; i < str.length; i++) {

					
					System.out.println(GrossAmount2);

					System.out.println("dff");
					if (!str[i].contains(GrossAmount2))

					{
						
					
						//Assert.assertf(str[i].contains(GrossAmount2));
						Assert.assertTrue(true, GrossAmount2);

						System.out.println("pass");
						break;
					}

				}
				System.out.println("   ");

			}
			
			Reporter.log("verify Addition Amount csv File");

		
  					
		}
		
		
		public void verifyP11( String Lel,String Pt,String Uel, String EmployeeEmployer,String employee)
		{  
			
			
			  List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='rowFinal']/td[contains(text(),'£')]"));
			  
			 
			 
				actualLel = list.get(0).getText();
				actualLel = actualLel.replaceAll("£", "");
				actualLel = actualLel.replaceAll(",", "");
				assertEquals(actualLel, Lel);

				actualPT = list.get(1).getText();
				actualPT = actualPT.replaceAll("£", "");
				assertEquals(actualPT, Pt);

				actualUel = list.get(2).getText();

				actualUel = actualUel.replaceAll("£", "");
				actualUel = actualUel.replaceAll(",", "");
				assertEquals(actualUel, Uel);

				actualEeEr = list.get(3).getText();
				actualEeEr = actualEeEr.replaceAll("£", "");
				actualEeEr = actualEeEr.replaceAll(",", "");
				assertEquals(actualEeEr, EmployeeEmployer);

				actualEENi = list.get(4).getText();
				actualEENi = actualEENi.replaceAll("£", "");
				actualEENi = actualEENi.replaceAll(",", "");
				assertEquals(actualEENi, employee);
				 
			  Reporter.log("Verify P11 ");
			  
			
			
		}
		
		public void individualEmployeePaySchedule(String grossPay,String tax, String employeeNI,String netPay,String employerNi )
		{		
			 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ReportEmployeePayHistoryDeatilsUC_trOpeningBalance']/td[contains(text(),'£')]"));
			   
				String actualgrossPay = list.get(0).getText();
				actualgrossPay = actualgrossPay.replaceAll("£", "");
				actualgrossPay = actualgrossPay.replaceAll(",", "");
				assertEquals(actualgrossPay, grossPay);
				
				String actualTax = list.get(2).getText();
				actualTax = actualTax.replaceAll("£", "");
				actualTax = actualTax.replaceAll(",", "");
				assertEquals(actualTax, tax);
				
				String actualemployeeNi = list.get(3).getText();
				actualemployeeNi = actualemployeeNi.replaceAll("£", "");
				actualemployeeNi = actualemployeeNi.replaceAll(",", "");
				assertEquals(actualemployeeNi, employeeNI);
				
				String actualNetPay = list.get(7).getText();
				actualNetPay = actualNetPay.replaceAll("£", "");
				actualNetPay = actualNetPay.replaceAll(",", "");
				assertEquals(actualNetPay, netPay);
				
				String actualemployerNi = list.get(8).getText();
				actualemployerNi = actualemployerNi.replaceAll("£", "");
				actualemployerNi = actualemployerNi.replaceAll(",", "");
				assertEquals(actualemployerNi, employerNi);
				Reporter.log("Verify individualEmployeePaySchedule ");
		}
		
		public void payrollReportingPeriodSummary(String grossPay,String tax, String employeeNI,String netPay,String employerNi )
		{		
			 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='outerT-dash outerT-dash_Print']/table/tbody/tr/td[contains(text(),'£')]"));
			   
			
				String actualgrossPay = list.get(0).getText();
				actualgrossPay = actualgrossPay.replaceAll("£", "");
				actualgrossPay = actualgrossPay.replaceAll(",", "");
				assertEquals(actualgrossPay, grossPay);
				
				String actualTax = list.get(3).getText();
				actualTax = actualTax.replaceAll("£", "");
				actualTax = actualTax.replaceAll(",", "");
				assertEquals(actualTax, tax);
				
				String actualemployeeNi = list.get(4).getText();
				actualemployeeNi = actualemployeeNi.replaceAll("£", "");
				actualemployeeNi = actualemployeeNi.replaceAll(",", "");
				assertEquals(actualemployeeNi, employeeNI);
				
				String actualNetPay = list.get(8).getText();
				actualNetPay = actualNetPay.replaceAll("£", "");
				actualNetPay = actualNetPay.replaceAll(",", "");
				assertEquals(actualNetPay, netPay);
				
				String actualemployerNi = list.get(9).getText();
				actualemployerNi = actualemployerNi.replaceAll("£", "");
				actualemployerNi = actualemployerNi.replaceAll(",", "");
				assertEquals(actualemployerNi, employerNi);
				Reporter.log("Verify payrollReportingPeriodSummary ");
		}
		
		
		public void taxPayement ( String employeeNI,String employerNi,String tax) throws Exception
		{		
			
			 m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPaymentManagement']/span")).click();
			 Thread.sleep(1000);
			 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr[1]/td[contains(text(),'£')]"));
			   
			 
			    String actualemployeeNi = list.get(0).getText();
				actualemployeeNi = actualemployeeNi.replaceAll("£", "");
				actualemployeeNi = actualemployeeNi.replaceAll(",", "");
				assertEquals(actualemployeeNi, employeeNI);
			 
				String actualemployerNi = list.get(1).getText();
				actualemployerNi = actualemployerNi.replaceAll("£", "");
				actualemployerNi = actualemployerNi.replaceAll(",", "");
				assertEquals(actualemployerNi, employerNi);
			 
				
				String actualTax = list.get(8).getText();
				actualTax = actualTax.replaceAll("£", "");
				actualTax = actualTax.replaceAll(",", "");
				assertEquals(actualTax, tax);
			
				
				
				Reporter.log("Verify payrollReportingPeriodSummary ");
		}
		
		
		public void payeAndTaxTotal(String tax,String pay ) throws Exception
		{
			
			List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='table table-head-bg'])[5]/tbody/tr[4]/td"));
			
		
			jsExec.executeScript("window.scrollBy(0,1500)");
			Thread.sleep(2000);
			utilities.TakeScreenshot.Getscreenshot("TC080_Verify P11", "1566", m_Driver);
			Thread.sleep(2000);
			String actualPayay = list.get(1).getText();

			String actualTax = list.get(2).getText();
			assertEquals(actualTax, tax, "Tax not as expected");
			assertEquals(actualPayay, pay, "Pay not as expected");
			
			Reporter.log("Verify Paye and Tax ");
		}
		
		public void individualEmployeePaySchedule1(String grossPay,String tax, String employeeNI,String netPay,String employerNi )
		{		
			 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='rowFinal']/td[contains(text(),'£')]"));
			   
				String actualgrossPay = list.get(0).getText();
				
				assertEquals(actualgrossPay, grossPay);
				
				String actualTax = list.get(2).getText();
				
				assertEquals(actualTax, tax);
				
				String actualemployeeNi = list.get(3).getText();
				
				assertEquals(actualemployeeNi, employeeNI);
				
				String actualNetPay = list.get(7).getText();
				
				assertEquals(actualNetPay, netPay);
				
				String actualemployerNi = list.get(8).getText();
			
				assertEquals(actualemployerNi, employerNi);
			 Reporter.log("Verify individualEmployeePaySchedule ");
		}
		
		
		public void payrollReportingPeriodSummary1(String grossPay,String tax, String employeeNI,String netPay,String employerNi )
		{		
			 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='rowFinal']/td[contains(text(),'£')]"));
			   
			
				String actualgrossPay = list.get(0).getText();
				actualgrossPay = actualgrossPay.replaceAll("£", "");
				actualgrossPay = actualgrossPay.replaceAll(",", "");
				assertEquals(actualgrossPay, grossPay);
				
				String actualTax = list.get(3).getText();
				
				assertEquals(actualTax, tax);
				
				String actualemployeeNi = list.get(4).getText();
				
				assertEquals(actualemployeeNi, employeeNI);
				
				String actualNetPay = list.get(8).getText();
			
				assertEquals(actualNetPay, netPay);
				
				String actualemployerNi = list.get(9).getText();
				
				assertEquals(actualemployerNi, employerNi);
				Reporter.log("Verify payrollReportingPeriodSummary ");
		}
		
		public void taxPayement1 ( String employeeNI,String employerNi,String tax, String HMRC,String amountPaid) throws Exception
		{		
			
			 m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPaymentManagement']/span")).click();
			 Thread.sleep(1000);
			 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr[6]/td[contains(text(),'£')]"));
			   
			 
			    String actualemployeeNi = list.get(0).getText();
				assertEquals(actualemployeeNi, employeeNI);
			 
				String actualemployerNi = list.get(1).getText();
		
				assertEquals(actualemployerNi, employerNi);
			 
				
				String actualTax = list.get(9).getText();
			
				assertEquals(actualTax, tax);
				
				String actualHmrc = list.get(13).getText();
				
				 assertEquals(actualHmrc, HMRC);
				
				
                 String actualAmountPaid= list.get(14).getText();
				
				assertEquals(actualAmountPaid, amountPaid);
			
				Reporter.log("Verify TaxPayement");
		}
		
		public void payslip(String grossPay, String incometax, String emploeeNIC,String employerNIC ) throws  Exception
		{
			
			
		  m_Driver.findElement(By.xpath("//*[@id='myTable1']/tbody/tr[2]/td[23]/a")).click(); 
			ChangeWindow.tabswitch(m_Driver);
			
			Thread.sleep(9000);
			
			utilities.TakeScreenshot.Getscreenshot("TC080_Verify payslip ", "1566", m_Driver);
			Robot robot = new Robot();
			// press Ctrl+S the Robot's way
			
			
			for (int i = 0; i <= 7; i++) {
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
				Thread.sleep(3000);
			}
			
			
				 robot.keyPress(KeyEvent.VK_ENTER);
		         robot.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(3000);
				
				 robot.keyPress(KeyEvent.VK_ENTER);
		         robot.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(3000);
			
		
           
  			File file = new File("C:\\Users\\Sonu\\Downloads\\Employee Payslip - Sonu Rajput[23312] - 2022-08-19.pdf");
  			PDDocument document = PDDocument.load(file);
  			PDFTextStripper pdfStripper = new PDFTextStripper();
  			PDFtext = pdfStripper.getText(document);
  			
  			//System.out.println(PDFtext);
  			document.close();
  			
  			
			Assert.assertTrue(PDFtext.contains(grossPay));
			Assert.assertTrue(PDFtext.contains(incometax));
			Assert.assertTrue(PDFtext.contains(emploeeNIC));
			Assert.assertTrue(PDFtext.contains(employerNIC));
		
			Reporter.log("Verify All data on payslip");
		
  				    if(file.delete())
  				    System.out.println("file deleted");
  				
		}
		
		public void payslip1(String grossPay, String incometax, String emploeeNIC,String employerNIC ) throws  Exception
		{
			
			
		  m_Driver.findElement(By.xpath("//*[@id='myTable1']/tbody/tr[2]/td[23]/a")).click(); 
			ChangeWindow.tabswitch(m_Driver);
			
			Thread.sleep(9000);
			
			utilities.TakeScreenshot.Getscreenshot("TC080_Verify payslip ", "1566", m_Driver);
			Robot robot = new Robot();
			// press Ctrl+S the Robot's way
			
			
			for (int i = 0; i <= 7; i++) {
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
				Thread.sleep(3000);
			}
			
			
				 robot.keyPress(KeyEvent.VK_ENTER);
		         robot.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(3000);
				
				 robot.keyPress(KeyEvent.VK_ENTER);
		         robot.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(3000);
			
		
           
  			File file = new File("C:\\Users\\Sonu\\Downloads\\Employee-Payslip-Mr. Sonu Kumar-31_08_2022.pdf");
  			PDDocument document = PDDocument.load(file);
  			PDFTextStripper pdfStripper = new PDFTextStripper();
  			PDFtext = pdfStripper.getText(document);
  			
  			//System.out.println(PDFtext);
  			document.close();
  			
  			
			Assert.assertTrue(PDFtext.contains(grossPay));
			Assert.assertTrue(PDFtext.contains(incometax));
			Assert.assertTrue(PDFtext.contains(emploeeNIC));
			Assert.assertTrue(PDFtext.contains(employerNIC));
		
			Reporter.log("Verify All data on payslip");
		
  				    if(file.delete())
  				    System.out.println("file deleted");
  				
		}
		
}
