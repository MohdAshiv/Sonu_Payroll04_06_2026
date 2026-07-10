package PayrollDashboardPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.apache.log4j.helpers.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import pages.BasePage;

public class VerifyData extends BasePage{
	
	
	
	

	public VerifyData(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private static String actualPeriodEnd;
	
	SoftAssert soft= new SoftAssert();

	
	
	public void verifyTagsAndText()
	{
		
		
		WebElement select_drop_down = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlStatus']"));
		
		Select select = new Select(select_drop_down);
		
		String [] verify=  {"In Progress","Not Started","On Hold","Query Received","Awaiting Approval","Approved"};
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
		
	

		
	}
	
	
	public void  verifyDashboardRecord(String data1,String data2, String data3, String data4, String data5, String data6, String data7,String data8, String data9, String data10,String data11,String Frequency) {
		
		WebElement elem1 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/h2/span[2]/span[3]/strong"));
		
		String data = elem1.getText();
		System.out.println(data);
		
		soft.assertEquals(data, Frequency);
		
		List<WebElement> elem = m_Driver.findElements(By.xpath("//*[@class='table-responsive']/table/tbody/tr[1]/td"));
		
		String name = elem.get(0).getText();
		System.out.println(name);
		String taxCode = elem.get(3).getText();
		System.out.println(taxCode);
		String director = elem.get(4).getText();
		System.out.println(director);
		String department = elem.get(5).getText();
		System.out.println(department);
		String gross = elem.get(6).getText();
		System.out.println(gross);
//		String incomeTax = elem.get(5).getText();
//		System.out.println(incomeTax);
//		String employeeNi = elem.get(9).getText();
//		System.out.println(employeeNi);
//		String employeePension = elem.get(10).getText();
//		System.out.println(employeePension);
//		String netPay = elem.get(11).getText();
//		System.out.println(netPay);
//		String employerNI = elem.get(12).getText();
//		System.out.println(employerNI);
//		String epmployerPension = elem.get(13).getText();
//		System.out.println(epmployerPension);

		soft.assertEquals(name, data1);
		soft.assertEquals(taxCode, data2);
		soft.assertEquals(director, data3);
		soft.assertEquals(department, data4);
		soft.assertEquals(gross, data5);
//		soft.assertEquals(incomeTax, data6);
//		soft.assertEquals(employeeNi, data7);
//		soft.assertEquals(employeePension, data8);
//		soft.assertEquals(netPay, data9);
//		soft.assertEquals(employerNI, data10);
//		soft.assertEquals(epmployerPension, data11);
		
		Reporter.log("verifyDashboardRecord");
	}
	
	

	public void  verifyDashboardRecord1(String data1,String data2, String data3, String data4, String data5, String data6, String data7,String data8, String data9, String data10,String data11,String Frequency) {
		
		WebElement elem1 = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div[1]/div[3]/div/div[2]/div[1]/div[1]/h5/div/div[3]/strong/i"));
		
		String data = elem1.getText();
		System.out.println(data);
		
		soft.assertEquals(data, Frequency);
		
		List<WebElement> elem = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr[2]/td"));
		
		String name = elem.get(0).getText();
		System.out.println(name);
		String taxCode = elem.get(1).getText();
		System.out.println(taxCode);
		String director = elem.get(2).getText();
		System.out.println(director);
		String department = elem.get(3).getText();
		System.out.println(department);
		String gross = elem.get(4).getText();
		System.out.println(gross);
		String incomeTax = elem.get(5).getText();
		System.out.println(incomeTax);
		String employeeNi = elem.get(9).getText();
		System.out.println(employeeNi);
		String employeePension = elem.get(10).getText();
		System.out.println(employeePension);
		String netPay = elem.get(11).getText();
		System.out.println(netPay);
		String employerNI = elem.get(12).getText();
		System.out.println(employerNI);
		String epmployerPension = elem.get(13).getText();
		System.out.println(epmployerPension);

		soft.assertEquals(name, data1);
		soft.assertEquals(taxCode, data2);
		soft.assertEquals(director, data3);
		soft.assertEquals(department, data4);
		soft.assertEquals(gross, data5);
		soft.assertEquals(incomeTax, data6);
		soft.assertEquals(employeeNi, data7);
		soft.assertEquals(employeePension, data8);
		soft.assertEquals(netPay, data9);
		soft.assertEquals(employerNI, data10);
		soft.assertEquals(epmployerPension, data11);
		
		Reporter.log("verifyDashboardRecord");
	}
	
	
	public void verifyWagesJournal() {
		
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div[1]/div[3]/header/h2/span"));
		String data=elem.getText();
		System.out.println(data);
		soft.assertEquals(data, "Wages Journal");
		Reporter.log("verifyWagesJournal");
		
	}
	
	public void verifyEditBtns(String expectedData) {
  	  
  	  WebElement elem = m_Driver.findElement(By.xpath("//*[@id='PersonalDetails']/div[1]/div/h3"));
  	  
  	  String data = elem.getText();
  	  System.out.println(data);
  	  
  	  soft.assertEquals(data, expectedData);
  	
  	  Reporter.log("verifyEditBtns");
  	
  	
    }
	

	
  public void verifyApplyToFuturePay(String expectedData) {
    	  
    	  
    	  WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_lblPayroll']"));
    	  
    	  String data = elem.getText();
    	  System.out.println(data);
    	  
    	soft.assertEquals(data, expectedData);
    	
    	Reporter.log("verifyApplyToFuturePay");
    	
    	
      }
  
  
  public void verifyOpeningBalancePage(String expecteData) {
	   
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='openingbalancemodalIframe1']")));
		
		String data = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/header/h2/span")).getText();
		
		System.out.println(data);
		
		soft.assertEquals(data, expecteData);
		
		Reporter.log("verifyOpeningBalancePage");
 }

  
public void verifyAdditionDeductionBtn(String expectedData) {
 	  
 	  WebElement elem = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div[1]/div[3]/header/h2/span"));
 	  
 	  String[] data = elem.getText().split("/");
 	  System.out.println(data[0]);
 	  
 	   soft.assertEquals(data[0].trim(), expectedData);
 	
 	   Reporter.log("verifyAdditionDeductionBtn");
 	
   }



public void verifyPayRateClickable(String expecteData) {
	   
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));
		
		String data = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/header/h2/span")).getText();
		
		System.out.println(data);
		
		soft.assertEquals(data, expecteData);
		
		Reporter.log("verifyPayRateClickable");
}


   public void verifyPayslipExportToPdf() throws InterruptedException
   {
	   
		   WebElement elem = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div[1]/div[3]/div/div[3]/div[3]/div[2]/div/div/table/tbody/tr[2]/td[2]/a"));
		   elem.click();
		   Thread.sleep(5000);
		   
		   utilities.ChangeWindow.Switchwindow(3, m_Driver);
		   String data = m_Driver.getCurrentUrl();
		   
           soft.assertTrue(data.contains("Payslip&id"));
	Reporter.log("verifyPayslipExportToPdf");

   }
   
   
   public void verifyGrossList(String data1, String data2) {
	   
	  List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr/td[1]"));
        
	  
	  System.out.println(list.size());
	  soft.assertEquals(list.size(), 13);
	  
	  for(int i=1;i<=list.size()-1;i++)
	  {
		 
		 String data = list.get(i).getText();
		 System.out.println(data);
		  
		 if(i==1) {
			 
			 soft.assertEquals(data, data1);
		 }
		 
		 else
		 {
			 soft.assertEquals(data, data2);

			 
		 }

	  }
	  
	 Reporter.log("verifyGrossList");
	  
   }
   
   
   public  void checkEmployeeNaemAlphabeticalOrder() {
	      // Locate the elements containing employee names
	      // For example, assuming names are in a list with a specific class
	      List<WebElement> nameElements = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[1]")); // Replace with actual selector

	      // Extract text from elements
	      List<String> names = new ArrayList<>();
	      for (WebElement element : nameElements) {
	          names.add(element.getText());
	      }

	      // Verify the names are in alphabetical order
	      List<String> sortedNames = new ArrayList<>(names);
	      Collections.sort(sortedNames);
	   
	      boolean isSorted = names.equals(sortedNames);

	      // Output results
	      System.out.println("Employee names: " + names);
	      System.out.println("Sorted list: " + sortedNames);
	      System.out.println("Employee names are in alphabetical order: " + isSorted);
	      
	      soft.assertTrue(isSorted);
	  }

	  
	  
	  
	  public  void checkGrossAcendingOrder() {
	      // Locate the elements containing employee names
	      // For example, assuming names are in a list with a specific class
	      List<WebElement> nameElements = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[5]")); // Replace with actual selector

	      // Extract text from elements
	      List<String> names = new ArrayList<>();
	      for (WebElement element : nameElements) {
	          names.add(element.getText());
	      }

	      // Verify the names are in alphabetical order
	      List<String> sortedNames = new ArrayList<>(names);
	      //Collections.sort(sortedNames);
	   
	      Collections.sort(sortedNames, Collections.reverseOrder()); // Descending order

	      boolean isSorted = names.equals(sortedNames);

	      
	      // Output results
	      System.out.println("Employee names: " + names);
	      System.out.println("Sorted list: " + sortedNames);

	      System.out.println("Employee names are in alphabetical order: " + isSorted);
	      
	      soft.assertTrue(isSorted);
	  }
	  
	  public void paginationPayrollDashBoard() throws Exception
		{
			
			 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='paginationInner clearfix']/ul/li/a"));
		    
				boolean con=list.isEmpty();
			     soft.assertFalse(con);

			
			for(int i=0;i<=list.size()-1;i++) {
				
				 List<WebElement> list2 = m_Driver.findElements(By.xpath("//*[@class='paginationInner clearfix']/ul/li/a"));
					WebElement data = list2.get(i);

					
					if(i==0)
					{
						
						continue;
					}
					else
					{
						data.click();
						i++;

				          Thread.sleep(1000);
						
					}
					
					
					
				    List<WebElement> nameElements = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[1]")); // Replace with actual selector

				      // Extract text from elements
				      List<String> names = new ArrayList<>();
				      for (WebElement element : nameElements) {
				          names.add(element.getText());
				      }

				      // Verify the names are in alphabetical order
				      List<String> sortedNames = new ArrayList<>(names);
				      Collections.sort(sortedNames);
				   
				      boolean isSorted = names.equals(sortedNames);

				      // Output results
				      System.out.println("Employee names: " + names);
				      System.out.println("Sorted list: " + sortedNames);
				      System.out.println("Employee names are in alphabetical order: " + isSorted);
				      
				      soft.assertTrue(isSorted);
					
			 
			}
			
			Reporter.log("paginationReport");
		}

	  
	  
	  public void paginatiOnRunPayrollPage() throws Exception
	 	{
	 		
	 		 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='paginationInner clearfix']/ul/li/a"));
	 	    
	 			boolean con=list.isEmpty();
	 		     soft.assertFalse(con);

	 		
	 		for(int i=0;i<=list.size()-1;i++) {
	 			
	 			 List<WebElement> list2 = m_Driver.findElements(By.xpath("//*[@class='paginationInner clearfix']/ul/li/a"));
	 				WebElement data = list2.get(i);

	 				
	 				if(i==0)
	 				{
	 					
	 					continue;
	 				}
	 				else
	 				{
	 					data.click();
	 					i++;

	 			          Thread.sleep(1000);
	 					
	 				}
	 				
	 				
	 				
	 			    List<WebElement> nameElements = m_Driver.findElements(By.xpath("(//*[@class='table table-head-bg'])[1]/tbody/tr/td[1]")); // Replace with actual selector

	 			    
	 			        
	 			      // Extract text from elements
	 			      List<String> names = new ArrayList<>();
	 			      for (WebElement element : nameElements) {
	 			          names.add(element.getText());
	 			      }

	 			      // Verify the names are in alphabetical order
	 			      List<String> sortedNames = new ArrayList<>(names);
	 			      Collections.sort(sortedNames);
	 			   
	 			      boolean isSorted = names.equals(sortedNames);

	 			      // Output results
	 			      System.out.println("Employee names: " + names);
	 			      System.out.println("Sorted list: " + sortedNames);
	 			      System.out.println("Employee names are in alphabetical order: " + isSorted);
	 			      soft.assertTrue(isSorted); 		 
	 		}
	 		
	 		Reporter.log("paginatiOnRunPayrollPage");
	 	}

	  
	  
	   public void verifyPayrollStatusDashboard(String expectedData) {
		   
		     String data = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_lnkPayrollStatus']")).getText();
		   
		     
		     System.out.println(data);
		     
			  soft.assertEquals(data, expectedData);
		   
			  Reporter.log("verifyPayrollStatusDasboard");
	   }
	  
	   

	   public void verifyPayrollStatusAgentRunPayroll(String expectedData) {
		   
		     String data = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkStatus']")).getText();
		   
		     
		     System.out.println(data);
		     
			  soft.assertEquals(data, expectedData);
		   
			  Reporter.log("verifyPayrollStatusDasboard");
	   }
	  
	   
	   public void verifyPayrollType(String expectedData) {
		   
		     String data = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div[1]/div[3]/div/div[1]/div[1]/div[1]/h5/div/div[2]/strong/i")).getText();
		   
		     
		     System.out.println(data);
		     
			  soft.assertEquals(data, expectedData);
		   
			  Reporter.log("verifyPayrollType");
	   }
	   
	   
	   
	   public void verifyEmployeeDeletSuccessMsg(String expectedData, int size) {
		   
		     String data = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div[1]/div[3]/div/div[1]")).getText();
		   
		     
		     System.out.println(data);
		     
			  soft.assertEquals(data, expectedData);
		   
			  
			  List<WebElement> list = m_Driver.findElements(By.xpath("//*[contains(text(),'Aniket')]"));

			  soft.assertEquals(list.size(), size);
			  
			  Reporter.log("verifyEmployeeDeletSuccessMsg");
	   }
  
	   
	   
	   
	   public void verifyDeletBtn(int size) {
		   
	
			  List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords_ctl02_lnkEmpDelete']"));

			  soft.assertEquals(list.size(), size);
			  
			  Reporter.log("verifyDeletBtn");
	   }
  
	   
	   public void verifyNotesOnDashboard(int size) {
		   
	
			  List<WebElement> list = m_Driver.findElements(By.xpath("//*[@title='View Notes']"));
			  
			  System.out.println(list.size());
			  soft.assertEquals(list.size(), size);

			  
			  Reporter.log("verifyDeletBtn");
	   }
  
	   
	   
	   public void verifyEnterdNote() throws InterruptedException {
		   
			m_Driver.findElement(By.xpath("//*[@title='View Notes']")).click();
		   
		      Thread.sleep(1000);
		      
		      
		      pages.DashboardPage abc= new 	pages.DashboardPage(m_Driver);
		 		
		 		String data = abc.text;
		      
		     String expectedData= m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_rptrDisplayRecordsChild_ctl00_txtNotesHistory']")).getText();
		      
		     System.out.println(expectedData);
		     
			  soft.assertEquals(data, expectedData);

			  Reporter.log("verifyEnterdNote");
	   }
	   
	   
	   
	   
	   public void verifyUpcomingLeave(String expectedData) {
		   
		     String data = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div[1]/div[3]/header/h2/span")).getText();
		   
		     
		     System.out.println(data);
		     
			  soft.assertEquals(data, expectedData);
		   
			  Reporter.log("verifyUpcomingLeave");
	   }
	   
	   
	   
	   
	   
	   public void verifySendSMS(String expectedData) {
		   
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='SendSMSFrame']")));

			String data = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/header/h2/span")).getText();

			System.out.println(data);

			soft.assertEquals(data, expectedData);

			Reporter.log("verifySendSMS");
	   }
	   
	   
	   

		public void verifyRequestHourBtn(String expectedText)
		{
			
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrameContact']")));

			String text = m_Driver.findElement(By.xpath("//*[contains(text(),'Contact Details')]")).getText();
			System.out.println(text);
			soft.assertEquals(text, expectedText, "not as expexted");
			m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnCancel']")).click();
			
			
			m_Driver.switchTo().defaultContent();
			
			 Reporter.log("verifyContactDetail");
		
		}
		
		   public void verifyRequestHoursBtnNotVisible(int size) {
			   
				
				  List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnRequestHours']"));

				  soft.assertEquals(list.size(), size);
				  
				  Reporter.log("verifyRequestHoursBtnNotVisible");
		   }
		   
		   
		   public void verifyNMWAlert(String expectedData) {
			   
			   
			   String data = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphError_dvWageAlert']")).getText();

				System.out.println(data);

				soft.assertEquals(data, expectedData);
				
	           List<WebElement> list = m_Driver.findElements(By.xpath("//*[@title='Employee is currently paid less than National Minimum Wage, Please Check!']"));
			System.out.println(list.size());
			  soft.assertEquals(list.size(), 1);


				Reporter.log("verifyNMWAlert");
		   }
		   
		   
		   
		   
		   public void verifyLeaverEmployee( int size) {
			   
		
				  List<WebElement> list = m_Driver.findElements(By.xpath("//*[contains(text(),'Testing')]"));

				  System.out.println("0");
				  soft.assertEquals(list.size(), size);
				  
				  Reporter.log("verifyEmployeeDeletSuccessMsg");
		   }
		   
		   
		   

		       public void verifyUndoneEmployeeSerchIcn( int size) {
		
				  List<WebElement> list = m_Driver.findElements(By.xpath("//*[@title='View employees whose payslips is not yet finalized']"));

				  soft.assertEquals(list.size(), size);
				  
				  Reporter.log("verifyUndoneEmployeeSerchIcn");
		   }
		   
		   
		   public void verifyRunPayrollAndUndoLastPayrollBtn(int RunPayroll, int UndoLastPayroll) {
			   
			   
				  List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll']"));

				  System.out.println("Run payroll btn----" + list.size());
				  soft.assertEquals(list.size(), RunPayroll);
				  
				  List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnUndoPayroll']"));

				  System.out.println("UndoLastPayroll btn----" + list1.size());
				  soft.assertEquals(list1.size(), UndoLastPayroll);
				  				  
				  Reporter.log("verifyRunPayrollAndUndoLastPayrollBtn");
		   }
		   
		   

			public void verifyAlertMsg(String expectedText)
			{
				m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFramemd']")));


				String text = m_Driver.findElement(By.xpath("//*[contains(text(),'processed')]")).getText();
				System.out.println(text);
				soft.assertEquals(text, expectedText, "not as expexted");
				
				m_Driver.switchTo().defaultContent();
				
				
				 Reporter.log("verifyAlertMsg");
			
			}
	   
			

public void verifyEmployeeName(String expectedData) {
	
	
	String data = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords_ctl02_lnkEditEmp']")).getText();
	
	
	System.out.println(data);
	soft.assertEquals(data, expectedData);
	
	Reporter.log("verifyEmployeeName");
	
	
}


public void testSortDescending(int index) throws Exception {
    // Click the sort button
//    WebElement sortButton = m_Driver.findElement(By.xpath("//*[contains(text(),'Gross')]"));
//    sortButton.click();

    // Extract the list of items
    List<WebElement> items = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td["+index+"]"));
    
    List<Double> itemTexts = new ArrayList<>();
    for (WebElement item : items) {
    	
       String data = item.getText().replaceAll("£", "").replaceAll(",", "");
       
       
//       if (data.endsWith(".00")) {
//           data = data.substring(0, data.length() - 3);
//       }
       
       double number = Double.parseDouble(data);

        itemTexts.add(number);
        
    }

    // Create a copy of the list and sort it
    List<Double> sortedItemTexts = new ArrayList<>(itemTexts);
    
    Collections.sort(sortedItemTexts.reversed());

    System.out.println("Sorted list In Reverse Order: " + sortedItemTexts);

    // Verify the sorting
    soft.assertEquals(itemTexts, sortedItemTexts, "Items are not sorted in Descending order");
}



public void testSortAscending(int index) throws Exception {
    // Click the sort button
//    WebElement sortButton = m_Driver.findElement(By.xpath("//*[contains(text(),'Gross')]"));
//    sortButton.click();

    // Extract the list of items
    List<WebElement> items = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td["+index+"]"));
    
    List<Double> itemTexts = new ArrayList<>();
    for (WebElement item : items) {
    	
       String data = item.getText().replaceAll("£", "").replaceAll(",", "");
       
       
//       if (data.endsWith(".00")) {
//           data = data.substring(0, data.length() - 3);
//       }
       
       double number = Double.parseDouble(data);

        itemTexts.add(number);
        
    }

    // Create a copy of the list and sort it
    List<Double> sortedItemTexts = new ArrayList<>(itemTexts);
    
    Collections.sort(sortedItemTexts);
    
    System.out.println("Sorted list: " + sortedItemTexts);

    // Verify the sorting
    soft.assertEquals(itemTexts, sortedItemTexts, "Items are not sorted in ascending order");
}




public void testSortAscending1(int index) throws Exception {
 

    // Extract the list of items
    List<WebElement> items = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td["+index+"]"));
    
    List<String> itemTexts = new ArrayList<>();
    for (WebElement item : items) {
    	
       String data = item.getText().replaceAll("£", "").replaceAll(",", "");
       
             

        itemTexts.add(data);
        
    }

    // Create a copy of the list and sort it
    List<String> sortedItemTexts = new ArrayList<>(itemTexts);
    
    Collections.sort(sortedItemTexts);
    
    System.out.println("Sorted list: " + sortedItemTexts);

    // Verify the sorting
    soft.assertEquals(itemTexts, sortedItemTexts, "Items are not sorted in ascending order");
}






public void testSortDescending1(int index) throws Exception {
 

    // Extract the list of items
    List<WebElement> items = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td["+index+"]"));
    
    List<String> itemTexts = new ArrayList<>();
    for (WebElement item : items) {
    	
       String data = item.getText().replaceAll("£", "").replaceAll(",", "");
       
             

        itemTexts.add(data);
        
    }

    // Create a copy of the list and sort it
    List<String> sortedItemTexts = new ArrayList<>(itemTexts);
    
    Collections.sort(sortedItemTexts.reversed());
    
    System.out.println("Sorted list reverse Order: " + sortedItemTexts);

    // Verify the sorting
    soft.assertEquals(itemTexts, sortedItemTexts, "Items are not sorted in ascending order");
    
    Reporter.log("testSortDescending1");
}




    public void verifyEmployerView(String expectedData) {
	
	WebElement elem = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[4]/header/h2"));
	
	  String data = elem.getText();
	  
	  System.out.println(data);
	  
	  soft.assertEquals(data, expectedData);
	  
	  Reporter.log("verifyEmployerView");
	  
}
    
    

    
    public void verifyHeaderTop(String expectedData ) {
    	
    	
    	String data = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/header/h2")).getText().trim();
    	
    	System.out.println(data);
    	
  	    soft.assertEquals(data, expectedData);

        Reporter.log("verifyHeaderTop");
    	
    }

    
 public void verifyChangePassword(String expectedData ) {
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='changepasswordIframe1']")));
    	
    	String data = m_Driver.findElement(By.xpath("//*[@id='tit_pro']")).getText().trim();
    	
    	System.out.println(data);
    	
  	    soft.assertEquals(data, expectedData);

  	    m_Driver.switchTo().defaultContent();
        Reporter.log("verifyChangePassword");
    	
    }
 
 
 public void verifySignOutBtn(String expectedData ) {
 	
 	
 	String data = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div/div[2]/div/div/div[2]/h1")).getText().trim();
 	
 	System.out.println(data);
 	
	    soft.assertEquals(data, expectedData);

     Reporter.log("verifySignOutBtn");
 	
 }

 
 public void getPeriodEndDate()
	{
	
		 WebElement elem1 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPayrollDate']/option[@selected='selected']"));
	     
		 actualPeriodEnd=elem1.getText().trim();
			
			
		System.out.println(actualPeriodEnd);
		Reporter.log("getPeriodEndDate");
	
		
	}
 

 public void verifyCurrentPeriodOnRunPayrollPage()
	{
	
		 WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tblheading']/tbody/tr/td/span"));
	     
		String[] expectedText=elem.getText().split(":");
		
		System.out.println(expectedText[1].trim());
		
		soft.assertEquals(actualPeriodEnd, expectedText[1].trim());
		
		Reporter.log("verifyCurrentPeriodOnRunPayrollPage");
	
	}
 
 
 
 

	public void verifyTop10EmployeesNI(String frequency) {

	    // Get top employee rows from table
		
		WebDriverWait wait = new WebDriverWait(m_Driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.visibilityOfElementLocated(
		        By.xpath("//table/tbody/tr[not(th)][position()<=10]")));
		
		
	    List<WebElement> employeeRows = m_Driver.findElements(
	            By.xpath("//table/tbody/tr[not(th)][position()<=10]"));

	    

	    // ✅ FIX 2: Guard check — if rows are empty, fail immediately instead of silently passing
	    Reporter.log("Rows found in table: " + employeeRows.size(), true);
	    assertTrue(employeeRows.size() > 0,
	            "No employee rows found! XPath may be wrong or table did not load. " +
	            "Frequency: " + frequency);   
	    
	    
	    // Loop through each employee row
	    for (WebElement row : employeeRows) {

	        // Fetch employee name
	        String employeeName = row.findElement(
	                By.xpath(".//td[1]")).getText().trim();

	        // Fetch gross salary
	        String grossText = row.findElement(
	                By.xpath(".//td[7]")).getText()
	                .replace("£", "")
	                .replace(",", "")
	                .trim();

	        // Fetch Employee NI from UI
	        String employeeNIText = row.findElement(
	                By.xpath(".//td[9]")).getText()
	                .replace("£", "")
	                .replace(",", "")
	                .trim();

	        // Fetch Employer NI from UI
	        String employerNIText = row.findElement(
	                By.xpath(".//td[12]")).getText()
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
	        Reporter.log("================================", true);

	        Reporter.log("Employee Name : " + employeeName, true);
	        Reporter.log("Frequency : " + frequency, true);
	        Reporter.log("Gross Salary : £" + grossSalary, true);

	        Reporter.log("Expected Employee NI : £" + expectedEmployeeNI, true);
	        Reporter.log("Actual Employee NI : £" + actualEmployeeNI, true);

	        Reporter.log("Expected Employer NI : £" + expectedEmployerNI, true);
	        Reporter.log("Actual Employer NI : £" + actualEmployerNI, true);

	        Reporter.log("================================", true);
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
	

	public void verifyTop10EmployeesNIRunPayroll(String frequency) {

	    // Get top 3 employee rows from table
		
		WebDriverWait wait = new WebDriverWait(m_Driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.visibilityOfElementLocated(
		        By.xpath("//table[contains(@class,'table-head-bg')]//tbody/tr")));
		
	    List<WebElement> employeeRows = m_Driver.findElements(
	            By.xpath("//table[contains(@class,'table-head-bg')]//tbody/tr"));
	    // ✅ FIX 2: Guard check — if rows are empty, fail immediately instead of silently passing
	    Reporter.log("Rows found in table: " + employeeRows.size(), true);
	    assertTrue(employeeRows.size() > 0,
	            "No employee rows found! XPath may be wrong or table did not load. " +
	            "Frequency: " + frequency);   
	    
	    
	    // Loop through each employee row
	    for (WebElement row : employeeRows) {

	        // Fetch employee name
	        String employeeName = row.findElement(
	                By.xpath(".//td[2]/a")).getText().trim();

	        // Fetch gross salary
	        String grossText = row.findElement(
	                By.xpath(".//td[5]")).getText()
	                .replace("£", "")
	                .replace(",", "")
	                .trim();

	        // Fetch Employee NI from UI
	        String employeeNIText = row.findElement(
	                By.xpath(".//td[7]")).getText()
	                .replace("£", "")
	                .replace(",", "")
	                .trim();

	        // Fetch Employer NI from UI
	        String employerNIText = row.findElement(
	                By.xpath(".//td[10]")).getText()
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
	        Reporter.log("================================", true);

	        Reporter.log("Employee Name : " + employeeName, true);
	        Reporter.log("Frequency : " + frequency, true);
	        Reporter.log("Gross Salary : £" + grossSalary, true);

	        Reporter.log("Expected Employee NI : £" + expectedEmployeeNI, true);
	        Reporter.log("Actual Employee NI : £" + actualEmployeeNI, true);

	        Reporter.log("Expected Employer NI : £" + expectedEmployerNI, true);
	        Reporter.log("Actual Employer NI : £" + actualEmployerNI, true);

	        Reporter.log("================================", true);
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

	    // ✅ FIX 2: Guard check — if rows are empty, fail immediately instead of silently passing
	    Reporter.log("Rows found in table: " + employeeRows.size(), true);
	    assertTrue(employeeRows.size() > 0,
	            "No employee rows found! XPath may be wrong or table did not load. " +
	            "Frequency: " + frequency);   
	    
	    
	    for (WebElement row : employeeRows) {

	        // Employee Name
	        String employeeName = row.findElement(
	                By.xpath(".//td[1]")).getText().trim();

	        // Gross Salary
	        String grossText = row.findElement(
	                By.xpath(".//td[7]")).getText()
	                .replace("£", "")
	                .replace(",", "")
	                .trim();

	        // Employee NI from UI
	        String employeeNIText = row.findElement(
	                By.xpath(".//td[9]")).getText()
	                .replace("£", "")
	                .replace(",", "")
	                .trim();

	        // Employer NI from UI
	        String employerNIText = row.findElement(
	                By.xpath(".//td[12]")).getText()
	                .replace("£", "")
	                .replace(",", "")
	                .trim();

	        // Convert values
	        double grossSalary = Double.parseDouble(grossText);

	        double actualEmployeeNI = employeeNIText.isEmpty()
	                ? 0.0
	                : Double.parseDouble(employeeNIText);

	        double actualEmployerNI = employerNIText.isEmpty()
	                ? 0.0
	                : Double.parseDouble(employerNIText);

	        // Thresholds
	        double primaryThreshold = 0.0;          // PT
	        double upperEarningsLimit = 0.0;        // UEL
	        double freeportEmployerThreshold = 0.0; // FUST

	        // Set thresholds by frequency
	        if (frequency.equalsIgnoreCase("Weekly")) {

	            primaryThreshold = 242.00;
	            upperEarningsLimit = 967.00;
	            freeportEmployerThreshold = 481.00;

	        } else if (frequency.equalsIgnoreCase("Fortnightly")
	                || frequency.equalsIgnoreCase("Two Weekly")) {

	            primaryThreshold = 484.00;
	            upperEarningsLimit = 1934.00;
	            freeportEmployerThreshold = 962.00;

	        } else if (frequency.equalsIgnoreCase("Four Weekly")) {

	            primaryThreshold = 967.00;
	            upperEarningsLimit = 3867.00;
	            freeportEmployerThreshold = 1924.00;

	        } else if (frequency.equalsIgnoreCase("Monthly")) {

	            primaryThreshold = 1048.00;
	            upperEarningsLimit = 4189.00;
	            freeportEmployerThreshold = 2083.00;

	        } else if (frequency.equalsIgnoreCase("Quarterly")) {

	            primaryThreshold = 3143.00;
	            upperEarningsLimit = 12568.00;
	            freeportEmployerThreshold = 6249.00;

	        } else if (frequency.equalsIgnoreCase("Half Yearly")) {

	            primaryThreshold = 6285.00;
	            upperEarningsLimit = 25135.00;
	            freeportEmployerThreshold = 12498.00;

	        } else if (frequency.equalsIgnoreCase("Annually")
	                || frequency.equalsIgnoreCase("Yearly")) {

	            primaryThreshold = 12570.00;
	            upperEarningsLimit = 50270.00;
	            freeportEmployerThreshold = 25000.00;

	        } else {

	            System.out.println("Invalid Frequency Selected");
	            return;
	        }

	        // Rates
	        double employeeRateBelowLimit = 0.08; // 8%
	        double employeeRateAboveLimit = 0.02; // 2%
	        double employerRate = 0.15;           // 15%

	        double expectedEmployeeNI = 0.0;
	        double expectedEmployerNI = 0.0;

	        // Employee NI Calculation
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

	        // Freeport Employer NI Calculation
	        if (grossSalary > freeportEmployerThreshold) {

	            expectedEmployerNI =
	                    (grossSalary - freeportEmployerThreshold)
	                            * employerRate;

	        } else {

	            expectedEmployerNI = 0.0;
	        }

	        // Round values
	        expectedEmployeeNI =
	                Math.round(expectedEmployeeNI * 100.0) / 100.0;

	        expectedEmployerNI =
	                Math.round(expectedEmployerNI * 100.0) / 100.0;

	        // Print values
	        Reporter.log("======================================", true);
	        Reporter.log("FREEPORT NI VALIDATION", true);

	        Reporter.log("Employee Name : " + employeeName, true);
	        Reporter.log("Frequency : " + frequency, true);
	        Reporter.log("Gross Salary : £" + grossSalary, true);

	        Reporter.log("Expected Employee NI : £" + expectedEmployeeNI, true);
	        Reporter.log("Actual Employee NI : £" + actualEmployeeNI, true);

	        Reporter.log("Expected Employer NI : £" + expectedEmployerNI, true);
	        Reporter.log("Actual Employer NI : £" + actualEmployerNI, true);

	        Reporter.log("======================================", true);
	        // Validation
	        assertEquals(
	                actualEmployeeNI,
	                expectedEmployeeNI,
	                "Freeport Employee NI mismatch for : " + employeeName
	        );

	        assertEquals(
	                actualEmployerNI,
	                expectedEmployerNI,
	                "Freeport Employer NI mismatch for : " + employeeName
	        );
	    }
	}
	
	
	
	public void verifyTop10EmployeesFreeportNiRunPayroll(String frequency) {

	    // Get top 10 employee rows
	    List<WebElement> employeeRows = m_Driver.findElements(
	            By.xpath("//table[contains(@class,'table-head-bg')]//tbody/tr[position()>0]"));

	    // ✅ FIX 2: Guard check — if rows are empty, fail immediately instead of silently passing
	    Reporter.log("Rows found in table: " + employeeRows.size(), true);
	    assertTrue(employeeRows.size() > 0,
	            "No employee rows found! XPath may be wrong or table did not load. " +
	            "Frequency: " + frequency);
	    for (WebElement row : employeeRows) {

	        // Employee Name
	        String employeeName = row.findElement(
	                By.xpath(".//td[2]/a")).getText().trim();

	        // Gross Salary
	        String grossText = row.findElement(
	                By.xpath(".//td[5]")).getText()
	                .replace("£", "")
	                .replace(",", "")
	                .trim();

	        // Employee NI from UI
	        String employeeNIText = row.findElement(
	                By.xpath(".//td[7]")).getText()
	                .replace("£", "")
	                .replace(",", "")
	                .trim();

	        // Employer NI from UI
	        String employerNIText = row.findElement(
	                By.xpath(".//td[10]")).getText()
	                .replace("£", "")
	                .replace(",", "")
	                .trim();

	        // Convert values
	        double grossSalary = Double.parseDouble(grossText);

	        double actualEmployeeNI = employeeNIText.isEmpty()
	                ? 0.0
	                : Double.parseDouble(employeeNIText);

	        double actualEmployerNI = employerNIText.isEmpty()
	                ? 0.0
	                : Double.parseDouble(employerNIText);

	        // Thresholds
	        double primaryThreshold = 0.0;          // PT
	        double upperEarningsLimit = 0.0;        // UEL
	        double freeportEmployerThreshold = 0.0; // FUST

	        // Set thresholds by frequency
	        if (frequency.equalsIgnoreCase("Weekly")) {

	            primaryThreshold = 242.00;
	            upperEarningsLimit = 967.00;
	            freeportEmployerThreshold = 481.00;

	        } else if (frequency.equalsIgnoreCase("Fortnightly")
	                || frequency.equalsIgnoreCase("Two Weekly")) {

	            primaryThreshold = 484.00;
	            upperEarningsLimit = 1934.00;
	            freeportEmployerThreshold = 962.00;

	        } else if (frequency.equalsIgnoreCase("Four Weekly")) {

	            primaryThreshold = 967.00;
	            upperEarningsLimit = 3867.00;
	            freeportEmployerThreshold = 1924.00;

	        } else if (frequency.equalsIgnoreCase("Monthly")) {

	            primaryThreshold = 1048.00;
	            upperEarningsLimit = 4189.00;
	            freeportEmployerThreshold = 2083.00;

	        } else if (frequency.equalsIgnoreCase("Quarterly")) {

	            primaryThreshold = 3143.00;
	            upperEarningsLimit = 12568.00;
	            freeportEmployerThreshold = 6249.00;

	        } else if (frequency.equalsIgnoreCase("Half Yearly")) {

	            primaryThreshold = 6285.00;
	            upperEarningsLimit = 25135.00;
	            freeportEmployerThreshold = 12498.00;

	        } else if (frequency.equalsIgnoreCase("Annually")
	                || frequency.equalsIgnoreCase("Yearly")) {

	            primaryThreshold = 12570.00;
	            upperEarningsLimit = 50270.00;
	            freeportEmployerThreshold = 25000.00;

	        } else {

	            System.out.println("Invalid Frequency Selected");
	            return;
	        }

	        // Rates
	        double employeeRateBelowLimit = 0.08; // 8%
	        double employeeRateAboveLimit = 0.02; // 2%
	        double employerRate = 0.15;           // 15%

	        double expectedEmployeeNI = 0.0;
	        double expectedEmployerNI = 0.0;

	        // Employee NI Calculation
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

	        // Freeport Employer NI Calculation
	        if (grossSalary > freeportEmployerThreshold) {

	            expectedEmployerNI =
	                    (grossSalary - freeportEmployerThreshold)
	                            * employerRate;

	        } else {

	            expectedEmployerNI = 0.0;
	        }

	        // Round values
	        expectedEmployeeNI =
	                Math.round(expectedEmployeeNI * 100.0) / 100.0;

	        expectedEmployerNI =
	                Math.round(expectedEmployerNI * 100.0) / 100.0;

	        // Print values
	        Reporter.log("======================================", true);
	        Reporter.log("FREEPORT NI VALIDATION", true);

	        Reporter.log("Employee Name : " + employeeName, true);
	        Reporter.log("Frequency : " + frequency, true);
	        Reporter.log("Gross Salary : £" + grossSalary, true);

	        Reporter.log("Expected Employee NI : £" + expectedEmployeeNI, true);
	        Reporter.log("Actual Employee NI : £" + actualEmployeeNI, true);

	        Reporter.log("Expected Employer NI : £" + expectedEmployerNI, true);
	        Reporter.log("Actual Employer NI : £" + actualEmployerNI, true);

	        Reporter.log("======================================", true);
	        // Validation
	        assertEquals(
	                actualEmployeeNI,
	                expectedEmployeeNI,
	                "Freeport Employee NI mismatch for : " + employeeName
	        );

	        assertEquals(
	                actualEmployerNI,
	                expectedEmployerNI,
	                "Freeport Employer NI mismatch for : " + employeeName
	        );
	    }
	}
	
	public void verifyDirectorNI(String method, int currentPeriod, String frequency) {

	    // ✅ ANNUALLY aur HALF_YEARLY add karo
	    int periods = frequency.equalsIgnoreCase("WEEKLY")      ? 52
	                : frequency.equalsIgnoreCase("FORTNIGHTLY") ? 26
	                : frequency.equalsIgnoreCase("FOUR_WEEKLY") ? 13
	                : frequency.equalsIgnoreCase("MONTHLY")     ? 12
	                : frequency.equalsIgnoreCase("QUARTERLY")   ?  4
	                : frequency.equalsIgnoreCase("HALF_YEARLY") ?  2
	                : frequency.equalsIgnoreCase("ANNUALLY")    ?  1 : 12; // ✅ Added

	    double PT  = 12570.00 / periods;
	    double UEL = 50270.00 / periods;
	    double ST  =  5000.00 / periods;

	    List<WebElement> rows = m_Driver.findElements(
	            By.xpath("//table/tbody/tr[not(th)][position()<=10]"));

	    // ✅ FIX 2: Guard check — if rows are empty, fail immediately instead of silently passing
	    Reporter.log("Rows found in table: " + rows.size(), true);
	    assertTrue(rows.size() > 0,
	            "No employee rows found! XPath may be wrong or table did not load. " +
	            "Frequency: " + frequency);
	    for (WebElement row : rows) {

	        String name  = row.findElement(By.xpath(".//td[1]")).getText().trim();
	        double gross = Double.parseDouble(row.findElement(By.xpath(".//td[7]"))
	                .getText().replace("£","").replace(",","").trim());
	        double actEE = Double.parseDouble(row.findElement(By.xpath(".//td[9]"))
	                .getText().replace("£","").replace(",","").trim());
	        double actER = Double.parseDouble(row.findElement(By.xpath(".//td[12]"))
	                .getText().replace("£","").replace(",","").trim());

	        double expEE, expER;

	        if (method.equalsIgnoreCase("ALTERNATIVE")) {
	            expEE = gross <= PT  ? 0.0
	                  : gross <= UEL ? (gross - PT) * 0.08
	                  : ((UEL - PT) * 0.08) + ((gross - UEL) * 0.02);
	            expER = gross > ST ? (gross - ST) * 0.15 : 0.0;

	        } else { // CUMULATIVE
	            double cG   = gross * currentPeriod,        pG   = gross * (currentPeriod - 1);
	            double cPT  = PT  * currentPeriod,          pPT  = PT   * (currentPeriod - 1);
	            double cUEL = UEL * currentPeriod,          pUEL = UEL  * (currentPeriod - 1);
	            double cST  = ST  * currentPeriod,          pST  = ST   * (currentPeriod - 1);

	            double cEE = cG<=cPT ? 0 : cG<=cUEL ? (cG-cPT)*0.08 : ((cUEL-cPT)*0.08)+((cG-cUEL)*0.02);
	            double pEE = pG<=pPT ? 0 : pG<=pUEL ? (pG-pPT)*0.08 : ((pUEL-pPT)*0.08)+((pG-pUEL)*0.02);

	            expEE = cEE - pEE;
	            expER = (cG > cST ? (cG - cST) * 0.15 : 0.0)
	                  - (pG > pST ? (pG - pST) * 0.15 : 0.0);
	        }

	        expEE = new BigDecimal(String.valueOf(expEE)).setScale(2, RoundingMode.HALF_UP).doubleValue();
	        expER = new BigDecimal(String.valueOf(expER)).setScale(2, RoundingMode.HALF_UP).doubleValue();
	        Reporter.log("--- " + name + " | " + method + " | " + frequency + " | Period: " + currentPeriod + " ---", true);

	        Reporter.log(
	                "EE NI → Expected: £" + expEE +
	                " | Actual: £" + actEE +
	                (Math.abs(actEE - expEE) <= 0.11 ? " ✓" : " ✗"),
	                true
	        );

	        Reporter.log(
	                "ER NI → Expected: £" + expER +
	                " | Actual: £" + actER +
	                (Math.abs(actER - expER) <= 0.11 ? " ✓" : " ✗"),
	                true
	        );
	        Assert.assertTrue(Math.abs(actEE - expEE) <= 0.11,
	                "EE NI mismatch for " + name + " Expected: £" + expEE + " Actual: £" + actEE);
	        Assert.assertTrue(Math.abs(actER - expER) <= 0.11,
	                "ER NI mismatch for " + name + " Expected: £" + expER + " Actual: £" + actER);
	    }
	}
	   
	
	public void verifyDirectorNiRunPayroll(String method, int currentPeriod, String frequency) {

	    // ✅ ANNUALLY aur HALF_YEARLY add karo
	    int periods = frequency.equalsIgnoreCase("WEEKLY")      ? 52
	                : frequency.equalsIgnoreCase("FORTNIGHTLY") ? 26
	                : frequency.equalsIgnoreCase("FOUR_WEEKLY") ? 13
	                : frequency.equalsIgnoreCase("MONTHLY")     ? 12
	                : frequency.equalsIgnoreCase("QUARTERLY")   ?  4
	                : frequency.equalsIgnoreCase("HALF_YEARLY") ?  2
	                : frequency.equalsIgnoreCase("ANNUALLY")    ?  1 : 12; // ✅ Added

	    double PT  = 12570.00 / periods;
	    double UEL = 50270.00 / periods;
	    double ST  =  5000.00 / periods;

	    List<WebElement> rows = m_Driver.findElements(
	            By.xpath("//table[contains(@class,'table-head-bg')]//tbody/tr"));

	    // ✅ FIX 2: Guard check — if rows are empty, fail immediately instead of silently passing
	    Reporter.log("Rows found in table: " + rows.size(), true);
	    assertTrue(rows.size() > 0,
	            "No employee rows found! XPath may be wrong or table did not load. " +
	            "Frequency: " + frequency);
	    
	    for (WebElement row : rows) {

	        String name  = row.findElement(By.xpath(".//td[2]/a")).getText().trim();
	        double gross = Double.parseDouble(row.findElement(By.xpath(".//td[5]"))
	                .getText().replace("£","").replace(",","").trim());
	        double actEE = Double.parseDouble(row.findElement(By.xpath(".//td[7]"))
	                .getText().replace("£","").replace(",","").trim());
	        double actER = Double.parseDouble(row.findElement(By.xpath(".//td[10]"))
	                .getText().replace("£","").replace(",","").trim());

	        double expEE, expER;

	        if (method.equalsIgnoreCase("ALTERNATIVE")) {
	            expEE = gross <= PT  ? 0.0
	                  : gross <= UEL ? (gross - PT) * 0.08
	                  : ((UEL - PT) * 0.08) + ((gross - UEL) * 0.02);
	            expER = gross > ST ? (gross - ST) * 0.15 : 0.0;

	        } else { // CUMULATIVE
	            double cG   = gross * currentPeriod,        pG   = gross * (currentPeriod - 1);
	            double cPT  = PT  * currentPeriod,          pPT  = PT   * (currentPeriod - 1);
	            double cUEL = UEL * currentPeriod,          pUEL = UEL  * (currentPeriod - 1);
	            double cST  = ST  * currentPeriod,          pST  = ST   * (currentPeriod - 1);

	            double cEE = cG<=cPT ? 0 : cG<=cUEL ? (cG-cPT)*0.08 : ((cUEL-cPT)*0.08)+((cG-cUEL)*0.02);
	            double pEE = pG<=pPT ? 0 : pG<=pUEL ? (pG-pPT)*0.08 : ((pUEL-pPT)*0.08)+((pG-pUEL)*0.02);

	            expEE = cEE - pEE;
	            expER = (cG > cST ? (cG - cST) * 0.15 : 0.0)
	                  - (pG > pST ? (pG - pST) * 0.15 : 0.0);
	        }

	        expEE = new BigDecimal(String.valueOf(expEE)).setScale(2, RoundingMode.HALF_UP).doubleValue();
	        expER = new BigDecimal(String.valueOf(expER)).setScale(2, RoundingMode.HALF_UP).doubleValue();
	        Reporter.log("--- " + name + " | " + method + " | " + frequency + " | Period: " + currentPeriod + " ---", true);

	        Reporter.log(
	                "EE NI → Expected: £" + expEE +
	                " | Actual: £" + actEE +
	                (Math.abs(actEE - expEE) <= 0.11 ? " ✓" : " ✗"),
	                true
	        );

	        Reporter.log(
	                "ER NI → Expected: £" + expER +
	                " | Actual: £" + actER +
	                (Math.abs(actER - expER) <= 0.11 ? " ✓" : " ✗"),
	                true
	        );
	        Assert.assertTrue(Math.abs(actEE - expEE) <= 0.11,
	                "EE NI mismatch for " + name + " Expected: £" + expEE + " Actual: £" + actEE);
	        Assert.assertTrue(Math.abs(actER - expER) <= 0.11,
	                "ER NI mismatch for " + name + " Expected: £" + expER + " Actual: £" + actER);
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
	        String code = row.findElement(By.xpath(".//td[4]")).getText().trim();

	        double gross = Double.parseDouble(
	                row.findElement(By.xpath(".//td[7]"))
	                        .getText().replace("£", "").replace(",", "").trim());

	        double actTax = Double.parseDouble(
	                row.findElement(By.xpath(".//td[8]"))
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
	
	
	public void verifyIncomeTaxPensionNPA(String frequency) {

	    int periods = Map.of(
	            "WEEKLY", 52,
	            "FORTNIGHTLY", 26,
	            "FOUR_WEEKLY", 13,
	            "MONTHLY", 12,
	            "QUARTERLY", 4,
	            "HALF_YEARLY", 2,
	            "ANNUALLY", 1
	    ).getOrDefault(frequency.toUpperCase(), 12);
	    
	    
		
		WebDriverWait wait = new WebDriverWait(m_Driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.visibilityOfElementLocated(
		        By.xpath("//table/tbody/tr[not(th)][position()<=10]")));
		

	    List<WebElement> rows = m_Driver.findElements(
	            By.xpath("//table/tbody/tr[not(th)][position()<=10]"));

	    for (WebElement row : rows) {

	        String name = row.findElement(By.xpath(".//td[1]")).getText().trim();
	        String code = row.findElement(By.xpath(".//td[4]")).getText().trim();

	        double gross = Double.parseDouble(
	                row.findElement(By.xpath(".//td[7]"))
	                        .getText().replace("£", "").replace(",", "").trim());

	        double actTax = Double.parseDouble(
	                row.findElement(By.xpath(".//td[8]"))
	                        .getText().replace("£", "").replace(",", "").trim());

	        // ✔ EE Pension (Net Pay Arrangement) — taxable gross se minus hogi
	        double pension = 0.0;
	        try {
	            String pensionText = row.findElement(By.xpath(".//td[10]"))
	                    .getText().replace("£", "").replace(",", "").trim();
	            if (!pensionText.isEmpty() && !pensionText.equals("-")) {
	                pension = Double.parseDouble(pensionText);
	            }
	        } catch (Exception e) {
	            Reporter.log("Pension column not found or empty for: " + name, true);
	        }

	        // ✔ W1/M1 cleaning
	        String taxCode = code.toUpperCase()
	                .replaceAll("\\s+", "")
	                .replaceAll("\\(W1/M1\\)", "")
	                .replaceAll("\\(M1/W1\\)", "")
	                .replaceAll("W1M1", "")
	                .replaceAll("W1", "")
	                .replaceAll("M1", "")
	                .trim();

	        // ✔ ALLOWANCE
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

	        // ✔ K CODE LOGIC
	        boolean isKCode = taxCode.startsWith("K");

	        // ✔ Net Pay Arrangement — pension gross se pehle katega
	        double taxableGross = isKCode ? gross + pension : gross - pension;

	        double taxable;
	        if (isKCode) {
	            taxable = taxableGross + periodAllowance;
	        } else {
	            taxable = Math.max(0, taxableGross - periodAllowance);
	        }

	        // ✔ TAX CALCULATION
	        double periodTax = 0.0;

	        double BASIC = 37700.0 / periods;
	        double HIGH  = 125140.0 / periods;

	        if (taxCode.equals("NT")) {

	            periodTax = 0;

	        } else if (taxCode.equals("BR")) {

	            periodTax = taxableGross * 0.20;

	        } else if (taxCode.equals("D0")) {

	            periodTax = taxableGross * 0.40;

	        } else if (taxCode.equals("D1")) {

	            periodTax = taxableGross * 0.45;

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
	        Reporter.log("Pension: £" + pension, true);
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
	
	
	public void verifyIncomeTaxRunPayroll(String frequency) {

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
	            By.xpath("//table[contains(@class,'table-head-bg')]//tbody/tr[position()>0]"));


	    // ✅ FIX 2: Guard check — if rows are empty, fail immediately instead of silently passing
	    Reporter.log("Rows found in table: " + rows.size(), true);
	    assertTrue(rows.size() > 0,
	            "No employee rows found! XPath may be wrong or table did not load. " +
	            "Frequency: " + frequency);   
	    
	    
	    for (WebElement row : rows) {

	        String name = row.findElement(By.xpath(".//td[2]/a")).getText().trim();
	        String code = row.findElement(By.xpath(".//td[3]")).getText().trim();

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
	        // ✔ K CODE LOGIC
	        // =========================
	        boolean isKCode = taxCode.startsWith("K");

	        double taxable;

	        if (isKCode) {
	            taxable = gross + periodAllowance;
	        } else {
	            taxable = Math.max(0, gross - periodAllowance);
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
	public void verifyPension(String frequency,
	        String pensionBasis,
	        String calculationMethod) {

	// =========================
	// ✔ SCHEME RATES
	// =========================
	double schemeEmployeeRate = 5.00;
	double employerRate       = 3.00;

	// =========================
	// ✔ EE RATE BASED ON METHOD
	// RAS              -> 5% x 80% = 4%  (HMRC adds 20% relief)
	// NET_PAY          -> 5%              (deducted before tax)
	// SALARY_SACRIFICE -> 5%              (salary reduced pre-tax)
	// NO_TAX_RELIEF    -> 5%              (no HMRC top-up, no adjustment)
	// =========================
	double employeeRate;

	switch (calculationMethod.toUpperCase()) {
	    case "RAS":
	        employeeRate = schemeEmployeeRate * 0.80;  // 4%
	        break;
	    case "NET_PAY":
	    case "SALARY_SACRIFICE":
	    case "NO_TAX_RELIEF":
	    default:
	        employeeRate = schemeEmployeeRate;          // 5%
	        break;
	}

	// =========================
	// ✔ FREQUENCY PERIODS
	// =========================
	int periods = Map.of(
	    "WEEKLY",      52,
	    "FORTNIGHTLY", 26,
	    "FOUR_WEEKLY", 13,
	    "MONTHLY",     12,
	    "QUARTERLY",    4,
	    "HALF_YEARLY",  2,
	    "ANNUALLY",     1
	).getOrDefault(frequency.toUpperCase(), 12);

	// =========================
	// ✔ 2026-27 THRESHOLDS
	// LEL = £6,240  UEL = £50,270
	// =========================
	double lowerLimit = 6240.0  / periods;
	double upperLimit = 50270.0 / periods;

	// =========================
	// ✔ FETCH TABLE ROWS
	// =========================
	List<WebElement> rows = m_Driver.findElements(
	    By.xpath("//table/tbody/tr[not(th)][position()<=10]"));

	for (WebElement row : rows) {

	    // =========================
	    // ✔ READ FROM UI
	    // Name       -> td[1]
	    // Gross      -> td[5]
	    // EE Pension -> td[8]
	    // ER Pension -> td[11]
	    // =========================
	    String employeeName = row.findElement(
	        By.xpath(".//td[1]")).getText().trim();

	    double grossPay = Double.parseDouble(
	        row.findElement(By.xpath(".//td[7]"))
	            .getText()
	            .replace("£", "")
	            .replace(",", "")
	            .trim());

	    double actualEE = Double.parseDouble(
	        row.findElement(By.xpath(".//td[10]"))
	            .getText()
	            .replace("£", "")
	            .replace(",", "")
	            .trim());

	    double actualER = Double.parseDouble(
	        row.findElement(By.xpath(".//td[13]"))
	            .getText()
	            .replace("£", "")
	            .replace(",", "")
	            .trim());

	    double actualTotal = Math.round(
	        (actualEE + actualER) * 100.0) / 100.0;

	    // =========================
	    // ✔ PENSIONABLE PAY
	    // QUALIFYING -> Cap at UEL, minus LEL
	    // CUSTOM     -> Full Gross
	    // =========================
	    double pensionablePay;

	    if (pensionBasis.equalsIgnoreCase("QUALIFYING")) {
	        pensionablePay = Math.max(
	            0,
	            Math.min(grossPay, upperLimit) - lowerLimit);
	    } else {
	        // CUSTOM
	        pensionablePay = grossPay;
	    }

	    // =========================
	    // ✔ EXPECTED CONTRIBUTIONS
	    // RAS              -> Employee pays 80% only; HMRC adds 20%
	    // NET_PAY          -> Full 5% deducted pre-tax; no gross adjustment
	    // SALARY_SACRIFICE -> Full 5% from reduced salary pre-tax/NI
	    // NO_TAX_RELIEF    -> Full 5% from net pay; no HMRC top-up at all
	    // =========================
	    double expectedEE    = Math.round(
	        ((pensionablePay * employeeRate) / 100) * 100.0) / 100.0;

	    double expectedER    = Math.round(
	        ((pensionablePay * employerRate) / 100) * 100.0) / 100.0;

	    double expectedTotal = Math.round(
	        (expectedEE + expectedER) * 100.0) / 100.0;

	    // =========================
	    // ✔ PASS / FAIL CHECK
	    // =========================
	    double tolerance = 1.00;

	    boolean passEE    = Math.abs(expectedEE    - actualEE)    <= tolerance;
	    boolean passER    = Math.abs(expectedER    - actualER)    <= tolerance;
	    boolean passTotal = Math.abs(expectedTotal - actualTotal) <= tolerance;
	    boolean pass      = passEE && passER && passTotal;

	    // =========================
	    // ✔ REPORTING
	    // =========================
	    String eeLog = "EE Pension    Exp: £" + expectedEE +
	             " | Act: £" + actualEE +
	             " | " + (passEE ? "PASS" : "FAIL");

	    String erLog = "ER Pension    Exp: £" + expectedER +
	             " | Act: £" + actualER +
	             " | " + (passER ? "PASS" : "FAIL");

	    String totalLog = "Total         Exp: £" + expectedTotal +
	                " | Act: £" + actualTotal +
	                " | " + (passTotal ? "PASS" : "FAIL");

	    Reporter.log("======================================", true);
	    Reporter.log("Employee      : " + employeeName,                    true);
	    Reporter.log("Frequency     : " + frequency,                       true);
	    Reporter.log("Basis         : " + pensionBasis.toUpperCase(),      true);
	    Reporter.log("Method        : " + calculationMethod.toUpperCase(), true);
	    Reporter.log("EE Rate       : " + employeeRate + "%",              true);
	    Reporter.log("ER Rate       : " + employerRate + "%",              true);
	    Reporter.log("Gross Pay     : £" + grossPay,                       true);
	    Reporter.log("Pensionable   : £" + pensionablePay,                 true);
	    Reporter.log("--------------------------------------",              true);
	    Reporter.log(eeLog,                                                 true);
	    Reporter.log(erLog,                                                 true);
	    Reporter.log(totalLog,                                              true);
	    Reporter.log("--------------------------------------",              true);
	    Reporter.log("FINAL RESULT  : " + (pass ? "PASS" : "FAIL"),       true);
	    Reporter.log("======================================",              true);

	    // =========================
	    // ✔ ASSERTION
	    // =========================
	    assertTrue(pass,
	        "Pension mismatch for " + employeeName +
	        " [" + frequency + "]" +
	        " [" + pensionBasis.toUpperCase() + "]" +
	        " [" + calculationMethod.toUpperCase() + "]" +
	        "\nEE Pension    Expected: £" + expectedEE +
	        " | Actual: £" + actualEE +
	        "\nER Pension    Expected: £" + expectedER +
	        " | Actual: £" + actualER +
	        "\nTotal         Expected: £" + expectedTotal +
	        " | Actual: £" + actualTotal);
	}
}
	
	
	public void verifyPensionRunPayroll(String frequency,
	        String pensionBasis,
	        String calculationMethod) {

	// =========================
	// ✔ SCHEME RATES
	// =========================
	double schemeEmployeeRate = 5.00;
	double employerRate       = 3.00;

	// =========================
	// ✔ EE RATE BASED ON METHOD
	// RAS              -> 5% x 80% = 4%  (HMRC adds 20% relief)
	// NET_PAY          -> 5%              (deducted before tax)
	// SALARY_SACRIFICE -> 5%              (salary reduced pre-tax)
	// NO_TAX_RELIEF    -> 5%              (no HMRC top-up, no adjustment)
	// =========================
	double employeeRate;

	switch (calculationMethod.toUpperCase()) {
	    case "RAS":
	        employeeRate = schemeEmployeeRate * 0.80;  // 4%
	        break;
	    case "NET_PAY":
	    case "SALARY_SACRIFICE":
	    case "NO_TAX_RELIEF":
	    default:
	        employeeRate = schemeEmployeeRate;          // 5%
	        break;
	}

	// =========================
	// ✔ FREQUENCY PERIODS
	// =========================
	int periods = Map.of(
	    "WEEKLY",      52,
	    "FORTNIGHTLY", 26,
	    "FOUR_WEEKLY", 13,
	    "MONTHLY",     12,
	    "QUARTERLY",    4,
	    "HALF_YEARLY",  2,
	    "ANNUALLY",     1
	).getOrDefault(frequency.toUpperCase(), 12);

	// =========================
	// ✔ 2026-27 THRESHOLDS
	// LEL = £6,240  UEL = £50,270
	// =========================
	double lowerLimit = 6240.0  / periods;
	double upperLimit = 50270.0 / periods;

	// =========================
	// ✔ FETCH TABLE ROWS
	// =========================
	List<WebElement> rows = m_Driver.findElements(
	    By.xpath("//table[contains(@class,'table-head-bg')]//tbody/tr[position()>0]"));

	for (WebElement row : rows) {

	    // =========================
	    // ✔ READ FROM UI
	    // Name       -> td[1]
	    // Gross      -> td[5]
	    // EE Pension -> td[8]
	    // ER Pension -> td[11]
	    // =========================
	    String employeeName = row.findElement(
	        By.xpath(".//td[2]/a")).getText().trim();

	    double grossPay = Double.parseDouble(
	        row.findElement(By.xpath(".//td[5]"))
	            .getText()
	            .replace("£", "")
	            .replace(",", "")
	            .trim());

	    double actualEE = Double.parseDouble(
	        row.findElement(By.xpath(".//td[8]"))
	            .getText()
	            .replace("£", "")
	            .replace(",", "")
	            .trim());

	    double actualER = Double.parseDouble(
	        row.findElement(By.xpath(".//td[11]"))
	            .getText()
	            .replace("£", "")
	            .replace(",", "")
	            .trim());

	    double actualTotal = Math.round(
	        (actualEE + actualER) * 100.0) / 100.0;

	    // =========================
	    // ✔ PENSIONABLE PAY
	    // QUALIFYING -> Cap at UEL, minus LEL
	    // CUSTOM     -> Full Gross
	    // =========================
	    double pensionablePay;

	    if (pensionBasis.equalsIgnoreCase("QUALIFYING")) {
	        pensionablePay = Math.max(
	            0,
	            Math.min(grossPay, upperLimit) - lowerLimit);
	    } else {
	        // CUSTOM
	        pensionablePay = grossPay;
	    }

	    // =========================
	    // ✔ EXPECTED CONTRIBUTIONS
	    // RAS              -> Employee pays 80% only; HMRC adds 20%
	    // NET_PAY          -> Full 5% deducted pre-tax; no gross adjustment
	    // SALARY_SACRIFICE -> Full 5% from reduced salary pre-tax/NI
	    // NO_TAX_RELIEF    -> Full 5% from net pay; no HMRC top-up at all
	    // =========================
	    double expectedEE    = Math.round(
	        ((pensionablePay * employeeRate) / 100) * 100.0) / 100.0;

	    double expectedER    = Math.round(
	        ((pensionablePay * employerRate) / 100) * 100.0) / 100.0;

	    double expectedTotal = Math.round(
	        (expectedEE + expectedER) * 100.0) / 100.0;

	    // =========================
	    // ✔ PASS / FAIL CHECK
	    // =========================
	    double tolerance = 1.00;

	    boolean passEE    = Math.abs(expectedEE    - actualEE)    <= tolerance;
	    boolean passER    = Math.abs(expectedER    - actualER)    <= tolerance;
	    boolean passTotal = Math.abs(expectedTotal - actualTotal) <= tolerance;
	    boolean pass      = passEE && passER && passTotal;

	    // =========================
	    // ✔ REPORTING
	    // =========================
	    String eeLog = "EE Pension    Exp: £" + expectedEE +
	             " | Act: £" + actualEE +
	             " | " + (passEE ? "PASS" : "FAIL");

	    String erLog = "ER Pension    Exp: £" + expectedER +
	             " | Act: £" + actualER +
	             " | " + (passER ? "PASS" : "FAIL");

	    String totalLog = "Total         Exp: £" + expectedTotal +
	                " | Act: £" + actualTotal +
	                " | " + (passTotal ? "PASS" : "FAIL");

	    Reporter.log("======================================", true);
	    Reporter.log("Employee      : " + employeeName,                    true);
	    Reporter.log("Frequency     : " + frequency,                       true);
	    Reporter.log("Basis         : " + pensionBasis.toUpperCase(),      true);
	    Reporter.log("Method        : " + calculationMethod.toUpperCase(), true);
	    Reporter.log("EE Rate       : " + employeeRate + "%",              true);
	    Reporter.log("ER Rate       : " + employerRate + "%",              true);
	    Reporter.log("Gross Pay     : £" + grossPay,                       true);
	    Reporter.log("Pensionable   : £" + pensionablePay,                 true);
	    Reporter.log("--------------------------------------",              true);
	    Reporter.log(eeLog,                                                 true);
	    Reporter.log(erLog,                                                 true);
	    Reporter.log(totalLog,                                              true);
	    Reporter.log("--------------------------------------",              true);
	    Reporter.log("FINAL RESULT  : " + (pass ? "PASS" : "FAIL"),       true);
	    Reporter.log("======================================",              true);

	    // =========================
	    // ✔ ASSERTION
	    // =========================
	    assertTrue(pass,
	        "Pension mismatch for " + employeeName +
	        " [" + frequency + "]" +
	        " [" + pensionBasis.toUpperCase() + "]" +
	        " [" + calculationMethod.toUpperCase() + "]" +
	        "\nEE Pension    Expected: £" + expectedEE +
	        " | Actual: £" + actualEE +
	        "\nER Pension    Expected: £" + expectedER +
	        " | Actual: £" + actualER +
	        "\nTotal         Expected: £" + expectedTotal +
	        " | Actual: £" + actualTotal);
	}
}
	
	
	
	public void verifyNetPay() {

		
		WebDriverWait wait = new WebDriverWait(m_Driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.visibilityOfElementLocated(
		        By.xpath("//table/tbody/tr[not(th)][position()<=10]")));
		
		
	    List<WebElement> rows = m_Driver.findElements(
	            By.xpath("//table/tbody/tr[not(th)][position()<=10]"));

	    for (WebElement row : rows) {

	        // =========================
	        // ✔ READ FROM UI
	        // Name      -> td[1]
	        // Gross     -> td[5]
	        // Tax       -> td[6]
	        // EE NI     -> td[7]
	        // Pension   -> td[8]
	        // Net Pay   -> td[9]
	        // =========================

	        String employeeName = row.findElement(
	                By.xpath(".//td[1]")).getText().trim();

	        double grossPay = Double.parseDouble(
	                row.findElement(By.xpath(".//td[7]"))
	                        .getText()
	                        .replace("£", "")
	                        .replace(",", "")
	                        .trim());

	        double incomeTax = Double.parseDouble(
	                row.findElement(By.xpath(".//td[8]"))
	                        .getText()
	                        .replace("£", "")
	                        .replace(",", "")
	                        .trim());

	        double employeeNI = Double.parseDouble(
	                row.findElement(By.xpath(".//td[9]"))
	                        .getText()
	                        .replace("£", "")
	                        .replace(",", "")
	                        .trim());

	        double employeePension = Double.parseDouble(
	                row.findElement(By.xpath(".//td[10]"))
	                        .getText()
	                        .replace("£", "")
	                        .replace(",", "")
	                        .trim());

	        double actualNetPay = Double.parseDouble(
	                row.findElement(By.xpath(".//td[11]"))
	                        .getText()
	                        .replace("£", "")
	                        .replace(",", "")
	                        .trim());

	        // =========================
	        // ✔ EXPECTED NET PAY
	        // Net = Gross - Tax - NI - Pension
	        // =========================

	        double expectedNetPay = Math.round(
	                (grossPay - incomeTax - employeeNI - employeePension)
	                * 100.0) / 100.0;

	        // =========================
	        // ✔ PASS / FAIL CHECK
	        // =========================

	        double tolerance = 0.01;

	        boolean pass = Math.abs(
	                expectedNetPay - actualNetPay) <= tolerance;

	        // =========================
	        // ✔ REPORTING
	        // =========================

	        Reporter.log("======================================", true);
	        Reporter.log("Employee      : " + employeeName, true);
	        Reporter.log("Gross Pay     : £" + grossPay, true);
	        Reporter.log("Income Tax    : £" + incomeTax, true);
	        Reporter.log("EE NI         : £" + employeeNI, true);
	        Reporter.log("EE Pension    : £" + employeePension, true);
	        Reporter.log("--------------------------------------", true);
	        Reporter.log("Expected Net  : £" + expectedNetPay, true);
	        Reporter.log("Actual Net    : £" + actualNetPay, true);
	        Reporter.log("--------------------------------------", true);
	        Reporter.log("FINAL RESULT  : " + 
	                (pass ? "PASS" : "FAIL"), true);
	        Reporter.log("======================================", true);

	        // =========================
	        // ✔ ASSERTION
	        // =========================

	        assertTrue(pass,
	                "Net Pay mismatch for " + employeeName +
	                "\nExpected: £" + expectedNetPay +
	                " | Actual: £" + actualNetPay);
	    }
	}
	        
	

	public void verifyNetPayRunPayroll() {

		
		
		WebDriverWait wait = new WebDriverWait(m_Driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.visibilityOfElementLocated(
		        By.xpath("//table[contains(@class,'table-head-bg')]//tbody/tr[position()>0]")));
		
	    List<WebElement> rows = m_Driver.findElements(
	            By.xpath("//table[contains(@class,'table-head-bg')]//tbody/tr[position()>0]"));

	    for (WebElement row : rows) {

	        // =========================
	        // ✔ READ FROM UI
	        // Name      -> td[1]
	        // Gross     -> td[5]
	        // Tax       -> td[6]
	        // EE NI     -> td[7]
	        // Pension   -> td[8]
	        // Net Pay   -> td[9]
	        // =========================

	        String employeeName = row.findElement(
	                By.xpath(".//td[2]/a")).getText().trim();

	        double grossPay = Double.parseDouble(
	                row.findElement(By.xpath(".//td[5]"))
	                        .getText()
	                        .replace("£", "")
	                        .replace(",", "")
	                        .trim());

	        double incomeTax = Double.parseDouble(
	                row.findElement(By.xpath(".//td[6]"))
	                        .getText()
	                        .replace("£", "")
	                        .replace(",", "")
	                        .trim());

	        double employeeNI = Double.parseDouble(
	                row.findElement(By.xpath(".//td[7]"))
	                        .getText()
	                        .replace("£", "")
	                        .replace(",", "")
	                        .trim());

	        double employeePension = Double.parseDouble(
	                row.findElement(By.xpath(".//td[8]"))
	                        .getText()
	                        .replace("£", "")
	                        .replace(",", "")
	                        .trim());

	        double actualNetPay = Double.parseDouble(
	                row.findElement(By.xpath(".//td[9]"))
	                        .getText()
	                        .replace("£", "")
	                        .replace(",", "")
	                        .trim());

	        // =========================
	        // ✔ EXPECTED NET PAY
	        // Net = Gross - Tax - NI - Pension
	        // =========================

	        double expectedNetPay = Math.round(
	                (grossPay - incomeTax - employeeNI - employeePension)
	                * 100.0) / 100.0;

	        // =========================
	        // ✔ PASS / FAIL CHECK
	        // =========================

	        double tolerance = 0.01;

	        boolean pass = Math.abs(
	                expectedNetPay - actualNetPay) <= tolerance;

	        // =========================
	        // ✔ REPORTING
	        // =========================

	        Reporter.log("======================================", true);
	        Reporter.log("Employee      : " + employeeName, true);
	        Reporter.log("Gross Pay     : £" + grossPay, true);
	        Reporter.log("Income Tax    : £" + incomeTax, true);
	        Reporter.log("EE NI         : £" + employeeNI, true);
	        Reporter.log("EE Pension    : £" + employeePension, true);
	        Reporter.log("--------------------------------------", true);
	        Reporter.log("Expected Net  : £" + expectedNetPay, true);
	        Reporter.log("Actual Net    : £" + actualNetPay, true);
	        Reporter.log("--------------------------------------", true);
	        Reporter.log("FINAL RESULT  : " + 
	                (pass ? "PASS" : "FAIL"), true);
	        Reporter.log("======================================", true);

	        // =========================
	        // ✔ ASSERTION
	        // =========================

	        assertTrue(pass,
	                "Net Pay mismatch for " + employeeName +
	                "\nExpected: £" + expectedNetPay +
	                " | Actual: £" + actualNetPay);
	    }
	}
	
	
public void verifyWorkerTypeAndAEStatusForAllRows(String expectedWorkerType, String expectedAEStatus) {

List<WebElement> rows = m_Driver.findElements(
By.xpath("//table/tbody/tr[not(contains(@style,'display: none'))]"));

Assert.assertTrue(rows.size() > 0, "No employee records found.");

for (int i = 1; i <= rows.size(); i++) {

String workerType = m_Driver.findElement(
By.xpath("(//table/tbody/tr)[" + i + "]/td[2]"))
.getText()
.replace("\n", " ")
.trim();

String aeStatus = m_Driver.findElement(
By.xpath("(//table/tbody/tr)[" + i + "]/td[3]"))
.getText()
.trim();

Assert.assertEquals(workerType,
expectedWorkerType,
"Worker Type mismatch at row " + i);

Assert.assertEquals(aeStatus,
expectedAEStatus,
"AE Status mismatch at row " + i);

System.out.println("Row " + i +
" | Worker Type: " + workerType +
" | AE Status: " + aeStatus);
}
}
	


public void verifyTotalCostKPI() {

    double grossTotal = 0;
    double erNiTotal = 0;
    double erPensionTotal = 0;

    List<WebElement> rows = m_Driver.findElements(By.xpath("//tbody/tr"));

    if (rows.isEmpty()) {
        Assert.fail("No employee records found in the grid.");
    }
    
    for (int i = 1; i <= rows.size(); i++) {

        double gross = Double.parseDouble(m_Driver.findElement(
                By.xpath("(//tbody/tr)[" + i + "]/td[7]"))
                .getText().replace("£", "").replace(",", "").trim());

        double erNi = Double.parseDouble(m_Driver.findElement(
                By.xpath("(//tbody/tr)[" + i + "]/td[12]"))
                .getText().replace("£", "").replace(",", "").trim());

        double erPension = Double.parseDouble(m_Driver.findElement(
                By.xpath("(//tbody/tr)[" + i + "]/td[13]"))
                .getText().replace("£", "").replace(",", "").trim());

        grossTotal += gross;
        erNiTotal += erNi;
        erPensionTotal += erPension;
    }

    double expectedTotalCost = grossTotal + erNiTotal + erPensionTotal;

    String actualKPI = m_Driver.findElement(
            By.xpath("//*[@id=\"lblTotalCost\"]"))
            .getText()
            .replace("£", "")
            .replace(",", "")
            .trim();

    double actualTotalCost = Double.parseDouble(actualKPI);
    
    Reporter.log("Gross Total : £" + grossTotal, true);
    Reporter.log("ER NI Total : £" + erNiTotal, true);
    Reporter.log("ER Pension Total : £" + erPensionTotal, true);
    Reporter.log("Expected Total Cost : £" + expectedTotalCost, true);
    Reporter.log("Actual Total Cost KPI : £" + actualTotalCost, true);


    Assert.assertEquals(actualTotalCost, expectedTotalCost, 0.01,
            "Total Cost KPI mismatch");
    Reporter.log("Total Cost KPI verified successfully.", true);


}
	

public void verifyTotalNetPayKPI() {

    List<WebElement> netValues = m_Driver.findElements(By.xpath("//tbody/tr/td[11]"));

    if (netValues.isEmpty()) {
        Reporter.log("No Net Pay values found.", true);
        Assert.fail("No Net Pay values found.");
    }

    double expectedNetPay = 0;

    for (WebElement value : netValues) {

        double rowNetPay = Double.parseDouble(
                value.getText()
                     .replace("£", "")
                     .replace(",", "")
                     .trim());

        Reporter.log("Row Net Pay : £" + rowNetPay, true);

        expectedNetPay += rowNetPay;
    }

    String actualNetPayText = m_Driver.findElement(
            By.xpath("//*[@id='lblTotalNetPay']"))
            .getText()
            .replace("£", "")
            .replace(",", "")
            .trim();

    double actualNetPay = Double.parseDouble(actualNetPayText);

    Reporter.log("Expected Total Net Pay : £" + expectedNetPay, true);
    Reporter.log("Actual Total Net Pay KPI : £" + actualNetPay, true);

    Assert.assertEquals(actualNetPay, expectedNetPay, 0.01,
            "Total Net Pay KPI mismatch");

    Reporter.log("Total Net Pay KPI verified successfully.", true);
}


public void verifyTotalTaxesKPI() {

    List<WebElement> taxValues = m_Driver.findElements(By.xpath("//tbody/tr/td[8]"));

    if (taxValues.isEmpty()) {
        Reporter.log("No Tax values found.", true);
        Assert.fail("No Tax values found.");
    }

    double expectedTax = 0;

    for (WebElement value : taxValues) {

        double rowTax = Double.parseDouble(
                value.getText()
                     .replace("£", "")
                     .replace(",", "")
                     .trim());

        Reporter.log("Row Tax : £" + rowTax, true);

        expectedTax += rowTax;
    }

    String actualTaxText = m_Driver.findElement(
            By.xpath("//*[@id='lblTotalTaxes']"))
            .getText()
            .replace("£", "")
            .replace(",", "")
            .trim();

    double actualTax = Double.parseDouble(actualTaxText);

    Reporter.log("Expected Total Tax : £" + expectedTax, true);
    Reporter.log("Actual Total Taxes KPI : £" + actualTax, true);

    Assert.assertEquals(actualTax, expectedTax, 0.01,
            "Total Taxes KPI mismatch");

    Reporter.log("Total Taxes KPI verified successfully.", true);
}


public void verifyTotalNIKPI() {

    List<WebElement> eeNiValues = m_Driver.findElements(By.xpath("//tbody/tr/td[9]"));
    List<WebElement> erNiValues = m_Driver.findElements(By.xpath("//tbody/tr/td[12]"));

    if (eeNiValues.isEmpty() || erNiValues.isEmpty()) {
        Reporter.log("NI values not found.", true);
        Assert.fail("NI values not found.");
    }

    double eeNiTotal = 0;
    double erNiTotal = 0;

    for (WebElement value : eeNiValues) {

        double eeNi = Double.parseDouble(
                value.getText()
                     .replace("£", "")
                     .replace(",", "")
                     .trim());

        Reporter.log("Row EE NI : £" + eeNi, true);

        eeNiTotal += eeNi;
    }

    for (WebElement value : erNiValues) {

        double erNi = Double.parseDouble(
                value.getText()
                     .replace("£", "")
                     .replace(",", "")
                     .trim());

        Reporter.log("Row ER NI : £" + erNi, true);

        erNiTotal += erNi;
    }

    double expectedNI = eeNiTotal + erNiTotal;

    String actualNIText = m_Driver.findElement(
            By.xpath("//*[@id='lblTotalNI']"))
            .getText()
            .replace("£", "")
            .replace(",", "")
            .trim();

    double actualNI = Double.parseDouble(actualNIText);

    Reporter.log("EE NI Total : £" + eeNiTotal, true);
    Reporter.log("ER NI Total : £" + erNiTotal, true);
    Reporter.log("Expected Total NI : £" + expectedNI, true);
    Reporter.log("Actual Total NI KPI : £" + actualNI, true);

    Assert.assertEquals(actualNI, expectedNI, 0.01,
            "Total NI KPI mismatch");

    Reporter.log("Total NI KPI verified successfully.", true);
}


public void verifyEmployeeSearch(String searchText) throws InterruptedException {

	Reporter.log("Searching Employee : " + searchText, true);

	
	WebElement txtSearch = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_search_input']"));
    txtSearch.clear();
    txtSearch.sendKeys(searchText);
    Thread.sleep(2000);

    List<WebElement> employeeList = m_Driver.findElements(
            By.xpath("//*[@id='tblReportData']/tbody/tr/td[1]/a"));

    boolean validEmployeeFound = false;

    for (WebElement employee : employeeList) {

        String employeeName = employee.getText().trim();

        if (employeeName.isEmpty()) {
            continue;
        }

        Reporter.log("Employee Name : " + employeeName, true);
        Reporter.log("Employee Name : " + employeeName, true);

        Assert.assertTrue(
                employeeName.toUpperCase().contains(searchText.toUpperCase()),
                "Unexpected employee displayed : " + employeeName);

        validEmployeeFound = true;
    }

    Assert.assertTrue(validEmployeeFound,
            "No employee found for search text : " + searchText);

    Reporter.log("Search verification passed for : " + searchText, true);
}

public void verifyEmployeeSearchRunPayroll(String searchText) throws InterruptedException {

	Reporter.log("Searching Employee : " + searchText, true);

	
	WebElement txtSearch = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_search_input']"));
    txtSearch.clear();
    txtSearch.sendKeys(searchText);
    Thread.sleep(2000);

    List<WebElement> employeeList = m_Driver.findElements(
            By.xpath(".//td[2]/a"));

    boolean validEmployeeFound = false;

    for (WebElement employee : employeeList) {

        String employeeName = employee.getText().trim();

        if (employeeName.isEmpty()) {
            continue;
        }

        Reporter.log("Employee Name : " + employeeName, true);
        Reporter.log("Employee Name : " + employeeName, true);

        Assert.assertTrue(
                employeeName.toUpperCase().contains(searchText.toUpperCase()),
                "Unexpected employee displayed : " + employeeName);

        validEmployeeFound = true;
    }

    Assert.assertTrue(validEmployeeFound,
            "No employee found for search text : " + searchText);

    Reporter.log("Search verification passed for : " + searchText, true);
}



public void verifyViewDraftPayslipEmployeeSearch(String searchText) throws InterruptedException {

	Reporter.log("Searching Employee : " + searchText, true);

	
	WebElement txtSearch = m_Driver.findElement(By.xpath("//*[@id='employeeSearchBox']"));
    txtSearch.clear();
    txtSearch.sendKeys(searchText);
    Thread.sleep(2000);

    List<WebElement> employeeList = m_Driver.findElements(
            By.xpath("//*[@id='employeeTable']/tbody/tr/td[2]"));

    boolean validEmployeeFound = false;

    for (WebElement employee : employeeList) {

        String employeeName = employee.getText().trim();

        if (employeeName.isEmpty()) {
            continue;
        }

        Reporter.log("Employee Name : " + employeeName, true);
        Reporter.log("Employee Name : " + employeeName, true);

        Assert.assertTrue(
                employeeName.toUpperCase().contains(searchText.toUpperCase()),
                "Unexpected employee displayed : " + employeeName);

        validEmployeeFound = true;
    }

    Assert.assertTrue(validEmployeeFound,
            "No employee found for search text : " + searchText);

    Reporter.log("Search verification passed for : " + searchText, true);
}
public void verifyAllRowsLoadedByScrolling() throws InterruptedException {
    JavascriptExecutor js = (JavascriptExecutor) m_Driver;

    WebDriverWait wait = new WebDriverWait(m_Driver, Duration.ofSeconds(60));
    WebElement totalRecordLabel = wait.until(driver -> {
        WebElement el = driver.findElement(
            By.xpath("(//*[contains(text(),'Total Record')])[2]"));
        String text = el.getText().replaceAll("[^0-9]", "").trim();
        return text.isEmpty() ? null : el;
    });

    int expectedCount = Integer.parseInt(
        totalRecordLabel.getText().replaceAll("[^0-9]", "").trim());
    Reporter.log("Expected row count: " + expectedCount, true);

    int previousCount = 0;
    while (true) {
        List<WebElement> rows = m_Driver.findElements(By.xpath("//table/tbody/tr"));
        int currentCount = rows.size();
        Reporter.log("Rows loaded so far: " + currentCount, true);

        if (currentCount >= expectedCount) break;
        if (currentCount == previousCount && previousCount != 0) break;

        previousCount = currentCount;

        // Last visible row pe scroll karo — next batch trigger hoga
        WebElement lastRow = rows.get(rows.size() - 1);
        js.executeScript("arguments[0].scrollIntoView(true)", lastRow);

        int countBeforeWait = currentCount;
        new WebDriverWait(m_Driver, Duration.ofSeconds(30)).until(driver ->
            driver.findElements(By.xpath("//table/tbody/tr")).size() > countBeforeWait
        );
    }

    int actualCount = m_Driver.findElements(By.xpath("//table/tbody/tr")).size();
    Assert.assertEquals(actualCount, expectedCount,
        "Row count mismatch — Expected: " + expectedCount + ", Actual: " + actualCount);

    Reporter.log("✓ All " + actualCount + " rows loaded and verified.", true);
}


public void verifyAllRowsLoadedByScrollingRunPayrollPage() throws InterruptedException {
    JavascriptExecutor js = (JavascriptExecutor) m_Driver;

    WebDriverWait wait = new WebDriverWait(m_Driver, Duration.ofSeconds(60));
    WebElement totalRecordLabel = wait.until(driver -> {
        WebElement el = driver.findElement(
            By.xpath("(//*[contains(text(),'Total Record')])[1]"));
        String text = el.getText().replaceAll("[^0-9]", "").trim();
        return text.isEmpty() ? null : el;
    });

    int expectedCount = Integer.parseInt(
        totalRecordLabel.getText().replaceAll("[^0-9]", "").trim());
    Reporter.log("Expected row count: " + expectedCount, true);

    int previousCount = 0;
    while (true) {
        List<WebElement> rows = m_Driver.findElements(By.xpath("//*[@class=\"table-responsive empGridScroll\"]/table/tbody/tr"));
        int currentCount = rows.size();
        Reporter.log("Rows loaded so far: " + currentCount, true);

        if (currentCount >= expectedCount) break;
        if (currentCount == previousCount && previousCount != 0) break;

        previousCount = currentCount;

        // Last visible row pe scroll karo — next batch trigger hoga
        WebElement lastRow = rows.get(rows.size() - 1);
        js.executeScript("arguments[0].scrollIntoView(true)", lastRow);

        int countBeforeWait = currentCount;
        new WebDriverWait(m_Driver, Duration.ofSeconds(30)).until(driver ->
            driver.findElements(By.xpath("//*[@class='table-responsive empGridScroll']/table/tbody/tr")).size() > countBeforeWait
        );
    }

    int actualCount = m_Driver.findElements(By.xpath("//*[@class='table-responsive empGridScroll']/table/tbody/tr")).size();
    Assert.assertEquals(actualCount, expectedCount,
        "Row count mismatch — Expected: " + expectedCount + ", Actual: " + actualCount);

    Reporter.log("✓ All " + actualCount + " rows loaded and verified.", true);
}



public void selectAllEmployeeCheckboxes() {

    List<WebElement> employeeCheckboxes = m_Driver.findElements(
            By.xpath("//input[contains(@class,'chkEmployee')]"));

    Assert.assertTrue(employeeCheckboxes.size() > 0,
            "No employee checkboxes found");

    Reporter.log("Total Employee Checkboxes : " + employeeCheckboxes.size(), true);

    for (WebElement checkbox : employeeCheckboxes) {

        if (!checkbox.isSelected()) {
            ((JavascriptExecutor) m_Driver).executeScript(
                    "arguments[0].click();", checkbox);
        }

        Assert.assertTrue(checkbox.isSelected(),
                "Checkbox is not selected");

        Reporter.log("Checkbox Selected Successfully", true);
    }
}


public void verifyDraftPayslipPdfOpened(int expectedPayslips) throws IOException, Exception {

    m_Driver.findElement(By.xpath("//*[@id='hrefPreviewPayslipsPopup']")).click();
	Thread.sleep(9000);
	utilities.ChangeWindow.tabswitch(m_Driver);
	Thread.sleep(2000);

    String pdfUrl = m_Driver.getCurrentUrl();

    Reporter.log("PDF URL : " + pdfUrl, true);

    Assert.assertTrue(
            pdfUrl.contains("PreviewPayslip")
            && pdfUrl.contains(".pdf"),
            "Draft Payslip PDF is not opened."
    );
    Reporter.log("Draft Payslip PDF opened successfully.", true);

    
    // Load PDF from URL
    InputStream inputStream = new URL(pdfUrl).openStream();

    PDDocument document = PDDocument.load(inputStream.readAllBytes());

    int actualPages = document.getNumberOfPages();

    Reporter.log("Expected Payslips : " + expectedPayslips, true);
    Reporter.log("Actual PDF Pages : " + actualPages, true);

    Assert.assertEquals(actualPages, expectedPayslips,
            "Payslip count mismatch.");

    Reporter.log("Payslip count verified successfully.", true);

    document.close();
    inputStream.close();

    // Close PDF tab
    m_Driver.close();

}
public void verifyAllCheckboxesAreTicked() {

    List<WebElement> checkboxes = m_Driver.findElements(
            By.xpath("//span[contains(@class,'rowCheckbox')]//input[@type='checkbox']"));

    Assert.assertTrue(checkboxes.size() > 0,
            "No checkboxes found.");

    Reporter.log("Total Checkboxes Found : " + checkboxes.size(), true);

    int checkedCount = 0;

    for (int i = 0; i < checkboxes.size(); i++) {

        WebElement checkbox = checkboxes.get(i);

        boolean isChecked = checkbox.isSelected()
                || "checked".equalsIgnoreCase(checkbox.getAttribute("checked"));

        Reporter.log(
                "Checkbox " + (i + 1)
                + " | Selected = " + checkbox.isSelected()
                + " | Checked Attribute = " + checkbox.getAttribute("checked"),
                true);

        Assert.assertTrue(
                isChecked,
                "Checkbox at index " + (i + 1) + " is not ticked.");

        checkedCount++;
    }

    Reporter.log(
            "Verified all checkboxes are ticked successfully. Total Checked : "
                    + checkedCount,
            true);
}


public void unTickAllCheckboxesAndVerify() {

    List<WebElement> checkboxes = m_Driver
    		.findElements(
            By.xpath("//span[contains(@class,'rowCheckbox')]//input[@type='checkbox']"));

    Assert.assertTrue(checkboxes.size() > 0,
            "No checkboxes found.");

    Reporter.log("Total Checkboxes Found : " + checkboxes.size(), true);

    // Untick all selected checkboxes
    for (int i = 0; i < checkboxes.size(); i++) {

        WebElement checkbox = checkboxes.get(i);

        if (checkbox.isSelected()) {

            ((JavascriptExecutor) m_Driver)
                    .executeScript("arguments[0].click();", checkbox);

            Reporter.log("Unticked Checkbox : " + (i + 1), true);
        }
    }

    // Verify all are unticked
    for (int i = 0; i < checkboxes.size(); i++) {

        WebElement checkbox = checkboxes.get(i);

        Reporter.log(
                "Checkbox " + (i + 1)
                + " | Selected = " + checkbox.isSelected(),
                true);

        Assert.assertFalse(
                checkbox.isSelected(),
                "Checkbox at index " + (i + 1) + " is still ticked.");
    }

    Reporter.log("Verified all checkboxes are unticked successfully.", true);
}


public void selectRequiredEmployeesAndUntickRest(int employeeCount) {

    List<WebElement> checkboxes = m_Driver.findElements(
            By.xpath("//span[contains(@class,'rowCheckbox')]//input[@type='checkbox']"));

    Assert.assertTrue(checkboxes.size() > 0,
            "No checkboxes found.");

    Assert.assertTrue(employeeCount <= checkboxes.size(),
            "Requested employee count is greater than available checkboxes.");

    Reporter.log("Total Checkboxes Found : " + checkboxes.size(), true);
    Reporter.log("Employees To Keep Selected : " + employeeCount, true);

    for (int i = 0; i < checkboxes.size(); i++) {

        WebElement checkbox = checkboxes.get(i);

        if (i < employeeCount) {

            // Keep selected
            if (!checkbox.isSelected()) {
                ((JavascriptExecutor) m_Driver)
                        .executeScript("arguments[0].click();", checkbox);
            }

            Reporter.log("Selected Employee : " + (i + 1), true);

        } else {

            // Untick remaining
            if (checkbox.isSelected()) {
                ((JavascriptExecutor) m_Driver)
                        .executeScript("arguments[0].click();", checkbox);
            }

            Reporter.log("Unticked Employee : " + (i + 1), true);
        }
    }

    // Verification
    for (int i = 0; i < checkboxes.size(); i++) {

        boolean actualState = checkboxes.get(i).isSelected();

        if (i < employeeCount) {
            Assert.assertTrue(actualState,
                    "Employee " + (i + 1) + " should be selected.");
        } else {
            Assert.assertFalse(actualState,
                    "Employee " + (i + 1) + " should be unselected.");
        }
    }

    Reporter.log("Selection verification completed successfully.", true);
}


public void verifyTotalRecordDashboard(String expectedText) throws InterruptedException {
   
        WebElement el = m_Driver.findElement(
            By.xpath("(//*[contains(text(),'Total Record')])[2]"));
        String text = el.getText().replaceAll("[^0-9]", "").trim();
        
        assertEquals(text, expectedText);
        Reporter.log("Selection verification completed successfully.", true);

        
    }


public void verifyEmailWarning(String expectedText) throws InterruptedException {
   
        WebElement el = m_Driver.findElement(
            By.xpath("//*[contains(@class,'alert') and .//*[contains(text(),'Important')]]"));
        String text = el.getText().trim();
        
        assertEquals(text, expectedText);
        Reporter.log("verifyEmailWarning", true);

        
    }






public void verifyTotalRecordRunPayroll(String expectedText) throws InterruptedException {
   
        WebElement el = m_Driver.findElement(
            By.xpath("(//*[contains(text(),'Total Record')])[1]"));
        String text = el.getText().replaceAll("[^0-9]", "").trim();
        
        assertEquals(text, expectedText);
        Reporter.log("Selection verification completed successfully.", true);

        
    }
public void verifyPayslipWithSummary(int count) throws InterruptedException
	{
		Thread.sleep(3000);
			
			List<WebElement> attachmentsEmplyeeList = m_Driver.findElements(By.xpath("//a[contains(.,'.pdf')]"));
			
		
			int payslipCount = attachmentsEmplyeeList.size();
			System.out.println("Payslip attachement count = "+payslipCount);
			assertEquals(payslipCount, count);
			
		
			Reporter.log("verifyPayslipWithSummary");

	

	}
	




public void verifyRecievedEmployeePayslip(int recordsToVerify) throws Exception
{
    try {

    	
    	WebDriverWait wait = new WebDriverWait(m_Driver, Duration.ofSeconds(60));

		wait.until(ExpectedConditions.presenceOfElementLocated(
		    By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a")));

        List<WebElement> list = m_Driver.findElements(
                By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));

        System.out.println("Total Emails : " + list.size());

        Assert.assertFalse(list.isEmpty(), "No emails found");

        for (int i = 0; i < recordsToVerify; i++)
        {
            List<WebElement> list1 = m_Driver.findElements(
                    By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));

            WebElement elem = list1.get(i);
            elem.click();

            Thread.sleep(3000);
            utilities.ChangeWindow.Switchwindow(3, m_Driver);

            WebElement tagData = m_Driver.findElement(
                    By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[4]/div/div/div[2]/div[2]/div/p[1]/span[2]"));

            String name = tagData.getText();
            System.out.println("Employee Name : " + name);

            WebElement payslipdata = m_Driver.findElement(
                    By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b"));

            String[] payslipname = payslipdata.getText().split(" ");

            System.out.println("Payslip Name : " + payslipname[4]);

            Assert.assertEquals(name, payslipname[4],
                    "Employee name mismatch in payslip");

            List<WebElement> attachmentsList = m_Driver.findElements(
                    By.xpath("//*[contains(text(),'Employee Payslip')]"));

            int count = attachmentsList.size();
            System.out.println("Payslip attachment count = " + count);

            Assert.assertEquals(count, 1,
                    "Payslip attachment count mismatch");

            WebElement backBtn = m_Driver.findElement(
                    By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/div/a"));

            backBtn.click();

            Thread.sleep(4000);
            utilities.ChangeWindow.Switchwindow(1, m_Driver);
        }

        Reporter.log("verifyRecievedEmployeePayslip", true);

    } catch (Exception e) {
        System.out.println("Issue In verifyRecievedEmployeePayslip : " + e);
        Assert.fail("Issue In verifyRecievedEmployeePayslip : " + e.getMessage());
    }
}



public void verifyRecievedEmployeePayslip1(int recordsToVerify) throws Exception
{
    try {

    	
    	WebDriverWait wait = new WebDriverWait(m_Driver, Duration.ofSeconds(60));

		wait.until(ExpectedConditions.presenceOfElementLocated(
		    By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a")));

        List<WebElement> list = m_Driver.findElements(
                By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));

        System.out.println("Total Emails : " + list.size());

        Assert.assertFalse(list.isEmpty(), "No emails found");

        for (int i = 1; i < recordsToVerify; i++)
        {
            List<WebElement> list1 = m_Driver.findElements(
                    By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));

            WebElement elem = list1.get(i);
            elem.click();

            Thread.sleep(3000);
            utilities.ChangeWindow.Switchwindow(4, m_Driver);

            WebElement tagData = m_Driver.findElement(
                    By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[4]/div/div/div[2]/div[2]/div/p[1]/span[2]"));

            String name = tagData.getText();
            System.out.println("Employee Name : " + name);

            WebElement payslipdata = m_Driver.findElement(
                    By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b"));

            String[] payslipname = payslipdata.getText().split(" ");

            System.out.println("Payslip Name : " + payslipname[4]);

            Assert.assertEquals(name, payslipname[4],
                    "Employee name mismatch in payslip");

            List<WebElement> attachmentsList = m_Driver.findElements(
                    By.xpath("//*[contains(text(),'Employee Payslip')]"));

            int count = attachmentsList.size();
            System.out.println("Payslip attachment count = " + count);

            Assert.assertEquals(count, 1,
                    "Payslip attachment count mismatch");

            WebElement backBtn = m_Driver.findElement(
                    By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/div/a"));

            backBtn.click();

            Thread.sleep(4000);
            utilities.ChangeWindow.Switchwindow(1, m_Driver);
        }

        Reporter.log("verifyRecievedEmployeePayslip", true);

    } catch (Exception e) {
        System.out.println("Issue In verifyRecievedEmployeePayslip : " + e);
        Assert.fail("Issue In verifyRecievedEmployeePayslip : " + e.getMessage());
    }
}


	  public void assertAll()
	  {
		soft.assertAll();
	   	
	}
}
