package _5115ApprenticeLevyTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC125_ApprenticeLevy_EPS  extends TestBase{

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority = 1)

	public void validateAprenticeshipLevy() throws Exception {

		sTestCaseID = "TC125";
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
        
	    _5115ApprenticeLevyPage.FillingManagement verify = new _5115ApprenticeLevyPage.FillingManagement(driver);
	    
	    verify.Click_gotoFilingManagement();
	    verify.clickEPS();
	    verify.getXMLData();
	    verify.verifyLevyDue(data[7]);
		

	    payroll.scrollClickPayrollDashboard();
	    
	    employee.clickEmployeeName();
		employee.editEmployeeDetails();
		employee.clickPaydetails();
		employee.enterBasicSalary(data[6]);
		employee.clickSaveBtn();
			
	    payroll.Click_PayrollDashboard();
        for(int i=0;i<=4;i++){payroll.Run_Payroll();}
        
        verify.Click_gotoFilingManagement();
		utilities.TakeScreenshot.Getscreenshot("TC125_ Aprenticeship levyDue", "5115", driver);

        payroll.Click_PayrollDashboard();
	    for(int i=0;i<=8;i++){payroll.Undo_LastPayroll();}
	    
	    verify.assertAll();
	    
	
	}
}
