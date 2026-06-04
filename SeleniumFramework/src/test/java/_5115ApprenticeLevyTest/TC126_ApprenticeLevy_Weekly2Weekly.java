package _5115ApprenticeLevyTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC126_ApprenticeLevy_Weekly2Weekly extends TestBase {


	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test

	public void validateAprenticeshipLevy() throws Exception {

		sTestCaseID = "TC126";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4  loginpage = new pages.loginpage4(driver);
		loginpage.GoToUrl();
		loginpage.AssertUrl();
		loginpage.Enter_EnterUsername(data[1]);
		loginpage.Enter_Enterpassword(data[2]);
		loginpage.Click_LoginButton();

		pages.agentpage agentpage = new pages.agentpage(driver);
		agentpage.Enter_SearchAgentName(data[3]);
		agentpage.Click_ClickSearch();
		agentpage.Click_ClickAgent();

		pages.OpenClient OpenClient = new pages.OpenClient(driver);
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName(data[4]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EmployeeEditAndRateChanges employee= new   pages.EmployeeEditAndRateChanges(driver);

		employee.clickEmployeeName();
		employee.editEmployeeDetails();
		employee.clickPaydetails();
		employee.enterBasicSalary(data[5]);
		employee.clickSaveBtn();
		
		
	    pages.PayrollRun payroll= new   pages.PayrollRun(driver);
	    payroll.Click_PayrollDashboard();
        for(int i=0;i<=3;i++){payroll.Run_Payroll();}
        
        	
	    pages.reports report= new   pages.reports(driver);
	    report.Click__Reports_();
	    report.Click_Payroll_Summary();
	    
	    _5115ApprenticeLevyPage.VerifyData verify= new  _5115ApprenticeLevyPage.VerifyData(driver);

	    verify.PayrollSummary(data[7]);
		utilities.TakeScreenshot.Getscreenshot("TC126_ Aprenticeship levy ", "5115", driver);

	    
	    payroll.scrollClickPayrollDashboard();
	    
	    employee.clickEmployeeName();
		employee.editEmployeeDetails();
		employee.clickPaydetails();
		employee.enterBasicSalary(data[6]);
		employee.clickSaveBtn();
		
		payroll.Click_PayrollDashboard();
	    
	    for(int i=0;i<=4;i++){payroll.Run_Payroll();}
	    
	    report.Click__Reports_();
	    report.Click_Payroll_Summary();
	    verify.PayrollSummary(data[8]);
		utilities.TakeScreenshot.Getscreenshot("TC126_ Aprenticeship levy ", "5115", driver);

	    payroll.scrollClickPayrollDashboard();
	    report.Click__Reports_();
	    report.Click_Apprenticeship_Levy();
	    
	    verify.AprenticeshipApril(data[9], data[10], data[11], data[12]);
	   
		utilities.TakeScreenshot.Getscreenshot("TC126_ Aprenticeship April ", "5115", driver);

	    
	    payroll.Click_PayrollDashboard();
	    for(int i=0;i<=8;i++){payroll.Undo_LastPayroll(); Thread.sleep(2000);}
	    
	    verify.assertAll();
	  
	
	}

}
