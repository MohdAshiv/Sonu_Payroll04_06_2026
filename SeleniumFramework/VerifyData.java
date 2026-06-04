package SmokePage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import pages.BasePage;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

public class VerifyData extends BasePage{

	public VerifyData(WebDriver driver) {
		super(driver);
	}

	public static String client;

	
	SoftAssert soft= new SoftAssert();

	
	
	public void verifyLimitedCompany() throws Exception
 	{
		
		 WebElement elem = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/header/div/div[2]/span"));
 	    
 		
		String actualdata = elem.getText().toUpperCase();
 		
		System.out.println(actualdata);
		
 		TakeScreenshot.takeScreenshot(m_Driver, "AgentPageError");
 		pages.CreateClient abc= new 	pages.CreateClient(m_Driver);
 		
 		String data = abc.client.toUpperCase();

 		soft.assertEquals(actualdata, data);
 	//	ClosePopup.ValidateAndPopUp(m_Driver);
 		
 		
  
  		Reporter.log("Enter_EnterClientName - "+data);
 	}
	
	public void verifyLimitedCompany1(String data) throws Exception
 	{
		
		 WebElement elem = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/header/div/div[2]/span"));
 	    
 		
		String actualdata = elem.getText();
 		
		System.out.println(actualdata);
		
// 		TakeScreenshot.takeScreenshot(m_Driver, "AgentPageError");
// 		pages.CreateClient abc= new 	pages.CreateClient(m_Driver);
// 		
// 		String data = abc.client.toUpperCase();

 		soft.assertEquals(actualdata, data);
 	//	ClosePopup.ValidateAndPopUp(m_Driver);
 		
 		
  
  		Reporter.log("Enter_EnterClientName - "+data);
 	}
	
	
	
	public void verifyLimitedLiablityCompany() throws Exception
 	{
		
		 WebElement elem = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/header/div/div[2]/span"));
 	    
 		
		String actualdata = elem.getText().toUpperCase();
 		
		System.out.println(actualdata);
		
 		TakeScreenshot.takeScreenshot(m_Driver, "AgentPageError");
 		pages.CreateClient abc= new 	pages.CreateClient(m_Driver);
 		
 		String data = abc.client.toUpperCase();

 		soft.assertEquals(actualdata, data);
 	//	ClosePopup.ValidateAndPopUp(m_Driver);
 		
 		
  
  		Reporter.log("Enter_EnterClientName - "+data);
 	}
	
	
	public void verifyPartnerShipClient() {
		
 		pages.CreateClient abc= new 	pages.CreateClient(m_Driver);
 		String data = abc.client;

		List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[3]"));
		boolean con = false ;

		for(int i=0;i<=list.size()-1;i++)
		{
			    WebElement data1 = list.get(i);
			    String name = data1.getText();
                 System.out.println(name);
			    if(name.equals(data)) {
			    	
				 con = true;
                break;
			    }
			 
		}
    	soft.assertTrue(con);


	}
	
	
	
	
	public void verifyAlertEditCompany(String data)
	{
		
		try {
			
			String alert = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div[1]/div[3]/div/div[1]")).getText();
			
			String alertMsg = alert.replaceAll("×", "").trim();
			System.out.println(alertMsg);
			soft.assertEquals(alertMsg, data);
			
			
		} catch (Exception e) {
			System.out.println("Issue in verifyAlertEditCompany"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}
		Reporter.log("verifyAlertEditCompany");
	}
	
	
	
       public void FrequencyOnDashboard(String data) {
    	   
    	   WebElement elem = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div[1]/div[3]/div/div[1]/div[1]/div[1]/h5/div/div[3]/strong/i"));
    	   
    	  String actualData = elem.getText();
    	  System.out.println(data);
	       soft.assertEquals(actualData, data);
			
		 Reporter.log("FrequencyOnDashboard");
    	   
    	   
       }
       
       
        public void verifyAddEmployee(String data) {
    	   
    	   WebElement elem = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div[1]/div[3]/header"));
    	   
    	  String actualData = elem.getText();
    	  System.out.println(data);
			soft.assertEquals(actualData, data);
			
		 Reporter.log("verifyAddEmployee");
    	  
    	   
    	   
       }
                

        public void verifyEmployeeBtnEnable() {
    	   
    	  WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_hrefAddEmployee']"));
    	  boolean enable = elem.isEnabled();
    	  System.out.println(enable);
    	  soft.assertTrue(enable);
    	  
    	
		 Reporter.log("verifyEmployeeBtnEnable");
 
       }
        
        
        public void verifyAddEmployeeSuccessfully(String data) {
    	   
    	   WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords_ctl02_lnkEditEmp']"));
    	   
    	  String actualData = elem.getText();
    	  System.out.println(data);
			soft.assertEquals(actualData, data);
			
		 Reporter.log("verifyAddEmployeeSuccessfully");
    	  
    	   
    	   
       }
        
        
        public void verifyDashBoard(String expectedName,String expectedTaxCode, String expectedGross, String expectedIncomeTax, String expectedEmployeeNI, String expectedNetpay, String expectedEmployerNi) {
        	
        	List<WebElement> elem = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td"));
        	
        	String name = elem.get(0).getText();
        	String taxcode = elem.get(1).getText();

        	String gross = elem.get(4).getText();
        	String incomeTax = elem.get(5).getText();
        	String EmployeeNi = elem.get(9).getText();
        	String Net = elem.get(10).getText();
        	String EmployerNi = elem.get(11).getText();

			soft.assertEquals(name, expectedName);
			soft.assertEquals(taxcode, expectedTaxCode);
			soft.assertEquals(gross, expectedGross);
			soft.assertEquals(incomeTax, expectedIncomeTax);
			soft.assertEquals(EmployeeNi, expectedEmployeeNI);
			soft.assertEquals(Net, expectedNetpay);
			soft.assertEquals(EmployerNi, expectedEmployerNi);
			
			Reporter.log("verifyDashBoard");

        }
        
        
   public void veriyPensionOnDashBoard(String expectedEmployeePension, String expectedEmployrPension ) {
        	
        	List<WebElement> elem = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td"));
        	
        	String employeePension = elem.get(10).getText();
        	employeePension	=employeePension.replaceAll("£", "");
        	employeePension=employeePension.replaceAll(",", "");

        	System.out.println("Employee Pension is--"+employeePension);
        	String employerPension = elem.get(13).getText();
        	
        	employerPension	=employerPension.replaceAll("£", "");
        	employerPension=employerPension.replaceAll(",", "");
        	System.out.println("Employer Pension is--"+employerPension);


			soft.assertEquals(employeePension, expectedEmployeePension);
			soft.assertEquals(employerPension, expectedEmployrPension);
			
			
			Reporter.log("veriyPensionOnDashBoard");

        }
        
   
   
public void veriyPensionOnPensionDashBoard(String expectedEmployeePension, String expectedEmployrPension ) {
    	
    	List<WebElement> elem = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td"));
    	
    	String employeePension = elem.get(7).getText();
    	employeePension	=employeePension.replaceAll("£", "");
    	employeePension=employeePension.replaceAll(",", "");

    	System.out.println("Employee Pension is--"+employeePension);
    	String employerPension = elem.get(8).getText();
    	
    	employerPension	=employerPension.replaceAll("£", "");
    	employerPension=employerPension.replaceAll(",", "");
    	System.out.println("Employer Pension is--"+employerPension);


		soft.assertEquals(employeePension, expectedEmployeePension);
		soft.assertEquals(employerPension, expectedEmployrPension);
		
		Reporter.log("veriyPensionOnPensionDashBoard");

    }


public void veriyPensionOnFilingManagement(String expectedEmployeePension, String expectedEmployrPension ) {
	
	List<WebElement> elem = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td"));
	
	String employeePension = elem.get(10).getText();
	employeePension	=employeePension.replaceAll("£", "");
	employeePension=employeePension.replaceAll(",", "");

	System.out.println("Employee Pension is--"+employeePension);
	String employerPension = elem.get(11).getText();
	
	employerPension	=employerPension.replaceAll("£", "");
	employerPension=employerPension.replaceAll(",", "");
	System.out.println("Employer Pension is--"+employerPension);


	soft.assertEquals(employeePension, expectedEmployeePension);
	soft.assertEquals(employerPension, expectedEmployrPension);
	
	Reporter.log("veriyPensionOnFilingManagement");

}


public void veriyPensionOnFilingManagementPension(String expectedEmployeePension, String expectedEmployrPension ) {
	
	List<WebElement> elem = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td"));
	
	String employeePension = elem.get(5).getText();
	employeePension	=employeePension.replaceAll("£", "");
	employeePension=employeePension.replaceAll(",", "");

	System.out.println("Employee Pension is--"+employeePension);
	String employerPension = elem.get(4).getText();
	
	employerPension	=employerPension.replaceAll("£", "");
	employerPension=employerPension.replaceAll(",", "");
	System.out.println("Employer Pension is--"+employerPension);


	soft.assertEquals(employeePension, expectedEmployeePension);
	soft.assertEquals(employerPension, expectedEmployrPension);
	
	Reporter.log("veriyPensionOnFilingManagement");

}
    
       

public void veriyPensionOnPayslip(String expectedEmployeePension, String expectedEmployrPension ) {
	
	List<WebElement> elem = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td"));
	
	String employeePension = elem.get(9).getText();
	employeePension	=employeePension.replaceAll("£", "");
	employeePension=employeePension.replaceAll(",", "");

	System.out.println("Employee Pension is--"+employeePension);
	String employerPension = elem.get(13).getText();
	
	employerPension	=employerPension.replaceAll("£", "");
	employerPension=employerPension.replaceAll(",", "");
	System.out.println("Employer Pension is--"+employerPension);


	soft.assertEquals(employeePension, expectedEmployeePension);
	soft.assertEquals(employerPension, expectedEmployrPension);
	
	Reporter.log("veriyPensionOnPayslip");

}



public void veriyPensionOnPayrollSummary(String expectedEmployeePension, String expectedEmployrPension ) {
	
	List<WebElement> elem = m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div"));
	
	String employeePension = elem.get(5).getText();
	employeePension	=employeePension.replaceAll("£", "");
	employeePension=employeePension.replaceAll(",", "");

	System.out.println("Employee Pension is--"+employeePension);
	String employerPension = elem.get(8).getText();
	
	employerPension	=employerPension.replaceAll("£", "");
	employerPension=employerPension.replaceAll(",", "");
	System.out.println("Employer Pension is--"+employerPension);


	soft.assertEquals(employeePension, expectedEmployeePension);
	soft.assertEquals(employerPension, expectedEmployrPension);
	
	Reporter.log("veriyPensionOnPayrollSummary");

}



public void veriyPensionOnPayrollReportingPeriodSummary(String expectedEmployeePension, String expectedEmployrPension ) {
  	
  	List<WebElement> elem = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td"));
  	
  	String employeePension = elem.get(7).getText();
  	employeePension	=employeePension.replaceAll("£", "");
  	employeePension=employeePension.replaceAll(",", "");

  	System.out.println("Employee Pension is--"+employeePension);
  	String employerPension = elem.get(12).getText();
  	
  	employerPension	=employerPension.replaceAll("£", "");
  	employerPension=employerPension.replaceAll(",", "");
  	System.out.println("Employer Pension is--"+employerPension);


		soft.assertEquals(employeePension, expectedEmployeePension);
		soft.assertEquals(employerPension, expectedEmployrPension);
		
		
		Reporter.log("veriyPensionOnDashBoard");

  }
  

public void veriyPensionOnPensionSummary(String expectedEmployeePension, String expectedEmployrPension ) {
  	
  	List<WebElement> elem = m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_RowTotalSummary']/th"));
  	
  	String employeePension = elem.get(5).getText();
  	employeePension	=employeePension.replaceAll("£", "");
  	employeePension=employeePension.replaceAll(",", "");

  	System.out.println("Employee Pension is--"+employeePension);
  	String employerPension = elem.get(6).getText();
  	
  	employerPension	=employerPension.replaceAll("£", "");
  	employerPension=employerPension.replaceAll(",", "");
  	System.out.println("Employer Pension is--"+employerPension);


		soft.assertEquals(employeePension, expectedEmployeePension);
		soft.assertEquals(employerPension, expectedEmployrPension);
		
		
		Reporter.log("veriyPensionOnDashBoard");

  }
  

public void veriyPensionOnIEPS(String expectedEmployeePension, String expectedEmployrPension ) {
  	
  	List<WebElement> elem = m_Driver.findElements(By.xpath("//*[@class='rowFinal']/td"));
  	
  	String employeePension = elem.get(6).getText();
  	employeePension	=employeePension.replaceAll("£", "");
  	employeePension=employeePension.replaceAll(",", "");

  	System.out.println("Employee Pension is--"+employeePension);
  	String employerPension = elem.get(11).getText();
  	
  	employerPension	=employerPension.replaceAll("£", "");
  	employerPension=employerPension.replaceAll(",", "");
  	System.out.println("Employer Pension is--"+employerPension);


		soft.assertEquals(employeePension, expectedEmployeePension);
		soft.assertEquals(employerPension, expectedEmployrPension);
		
		
		Reporter.log("veriyPensionOnIEPS");

  }
        

    	public void verifyAlertEditEmployee(String data)
    	{
    		
    		try {
    			
    			String alert = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div[1]/div[3]/div/div[1]")).getText();
    			
    			String alertMsg = alert.replaceAll("×", "").trim();
    			System.out.println(alertMsg);
    			soft.assertEquals(alertMsg, data);
    			
    			
    		} catch (Exception e) {
    			System.out.println("Issue in verifyAlertEditEmployee"+e);
    		    soft.assertFalse(true,"welcome to catch block");

    		}
    		Reporter.log("verifyAlertEditEmployee");
    	}
    	
    	

    	public void verifyAlertEmail(String data)
    	{
    		
    		try {
    			
    			String alert = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_RegularExpressionValidator22']")).getText();
    			
    			String alertMsg = alert.replaceAll("×", "").trim();
    			System.out.println(alertMsg);
    			soft.assertEquals(alertMsg, data);
    			
    			
    		} catch (Exception e) {
    			System.out.println("Issue in verifyAlertEmail"+e);
    		    soft.assertFalse(true,"welcome to catch block");

    		}
    		Reporter.log("verifyAlertEmail");
    	}
    	
    	
    	
    	
    	public void verifyNILetterFirst(String value)
    	{
    		
    		//String data = m_Driver. findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlPeriod']")).getText();
    		
    		Select select = new Select(m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_ddlNICategoryCode']")));
    		WebElement option = select.getFirstSelectedOption();
    		String defaultItem = option.getText();
    		System.out.println(defaultItem );
    		
    		soft.assertEquals(defaultItem, value);
    		
    		
    		Reporter.log("verifyNILetterFirst");
    		
    	}
    	
    	
    	
    	public void verifyGenderFirst(String value)
    	{
    		
    		//String data = m_Driver. findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlPeriod']")).getText();
    		
    		Select select = new Select(m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_ddlGender']")));
    		WebElement option = select.getFirstSelectedOption();
    		String defaultItem = option.getText();
    		System.out.println(defaultItem );
    		
    		soft.assertEquals(defaultItem, value);
    		
    		
    		Reporter.log("verifyNILetterFirst");
    		
    	}
    	
       
       
    	public void verifyUseEmailAlert(String data) {
    		
    		String actulAlert = m_Driver.switchTo().alert().getText();
    		
    		soft.assertEquals(actulAlert, data);

    		System.out.println(actulAlert);
    		
    		Reporter.log("verifyUseEmailAlert");

    		
    	}
    	
	
          public void verifyEmailUserName(String data) {
    		
       	   String actualData = m_Driver.findElement(By.xpath("//*[@id='txtLoginName']")).getAttribute("value");
    	   
    		
  		   System.out.println(actualData);

    		soft.assertEquals(actualData, data);

    		
    		Reporter.log("verifyEmailUserName");

    		
    	}
          
          
          
          public void verifyFPS(String data) {
      		
           String actualData = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl01_lnkTaxReturnType']")).getText();
       		
     		System.out.println(actualData);

       		soft.assertEquals(actualData, data);

       		
       		Reporter.log("verifyEmailUserName");

       		
       	}
          
          
          public void verifyEPS(String data) {
        		
              String actualData = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkTaxReturnType']")).getText();
          		
        		System.out.println(actualData);

          		soft.assertEquals(actualData, data);

          		
          		Reporter.log("verifyEmailUserName");

          		
          	}
      	
      	public void verifyPayslipWithSummary()
      	{
      		
      		try {
      			
      			List<WebElement> attachmentsEmplyeeList = m_Driver.findElements(By.xpath("//*[contains(text(),'Employee Payslip')]"));
      			
      		
      			int payslipCount = attachmentsEmplyeeList.size();
      			System.out.println("Payslip attachement count = "+payslipCount);
      			soft.assertEquals(payslipCount, 5);
      			
      			
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
      	
      	
      	
          
      	
      	public void verifyPayslipWithoutSummary()
    	{
    		
    		try {
    			
    			List<WebElement> attachmentsEmplyeeList = m_Driver.findElements(By.xpath("//*[contains(text(),'Employee Payslip')]"));

    			
    			
    			int payslipCount = attachmentsEmplyeeList.size();
    			System.out.println("Payslip attachement count = "+payslipCount);
    			soft.assertEquals(payslipCount, 5);
    			
    			
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
      	
      
      	
      	public void verifyRecievedEmployeePayslip() throws Exception
    	{
    		
    		try {
    			
    		
    			 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));
    			
    			 System.out.println(list.size());
    			boolean con=list.isEmpty();
    		     soft.assertFalse(con);
    		    
    			for (int i=0;i<=4;i++)
    			{
    				
    				List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));

    				WebElement elem = list1.get(i);
    				elem.click();
    				
    				Thread.sleep(3000);
    				utilities.ChangeWindow.Switchwindow(3, m_Driver);
    				
    				WebElement tagData = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/div[2]/div[2]/div/p[1]/span[2]"));

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
      	
      	
      	

      	public void verifyRecievedEmployeePayslip1() throws Exception
    	{
    		
    		try {
    			
    		
    			 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));
    			
    			 System.out.println(list.size());
    			boolean con=list.isEmpty();
    		     soft.assertFalse(con);
    		    
    			for (int i=1;i<=5;i++)
    			{
    				
    				List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));

    				WebElement elem = list1.get(i);
    				elem.click();
    				
    				Thread.sleep(3000);
    				utilities.ChangeWindow.Switchwindow(3, m_Driver);
    				
    				WebElement tagData = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/div[2]/div[2]/div/p[1]/span[2]"));

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
      	
        public void verifyEmailShouldNotTrigger() {
    		
            String actualData = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailLog_ctl00_lbtnViewEmail_sub']")).getText();
        		
            
            String[] subName = actualData.split("-");
			
			System.out.println(subName[0]);
			
			pages.CreateClient abc= new 	pages.CreateClient(m_Driver);
	 		
	 		String data = abc.client;

	 		System.out.println(data);
        	soft.assertNotEquals(subName[0],data );

        		
        	Reporter.log("verifyEmailShouldNotTrigger");

        		
        	}
        
        

public void verifyPayrollSummary(String expectedData)
{
	
	
	try {
		 List<WebElement> elem = m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Employer NI')]//following::td/div/div"));
		
		String data = elem.get(25).getText();
		data = data.replaceAll("[£]", "");
		data = data.replaceAll("[,]", "");
		soft.assertEquals(data, expectedData);

	} catch (Exception e) {
	    soft.assertFalse(true,"welcome to catch block");

		System.out.println("Issue In verifyPayrollSummary"+e);
	}
	
	Reporter.log("verifyPayrollSummary");
}
      



      public void verifyEmployemetAllowances(String expectedData) {
    	  
    	  
	    WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr[2]/td[11]"));
	                String data = elem.getText();
	                System.out.println(data);
	                
    				soft.assertEquals(data,expectedData );
             Reporter.log("verifyEmployemetAllowances");
	                
       }
      
      
      
      
      
	public void assertAll()
	   {
		   soft.assertAll();
		   
	   }
	
	
	
	
	
	
}
