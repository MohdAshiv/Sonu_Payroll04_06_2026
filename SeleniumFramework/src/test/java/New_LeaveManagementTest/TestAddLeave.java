package New_LeaveManagementTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TestAddLeave extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority = 0)
	public void TC01_AddLeaves() throws Exception {

		sTestCaseID = "TC30";
		Sheet = "Sheet10";
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
	

		pages.PayrollRun payroll= new pages.PayrollRun (driver);
//		payroll.Click_PayrollDashboard();
//		payroll.FullUndoPayroll();
		
		pages.LeaveManagement leaves = new pages.LeaveManagement(driver);
		leaves.clickLeaveManagement();
		for(int i=358;i<=400;i++)
		{
			leaves.clickAddLeaves();
			String EMPName = leaves.selectEmployeeByIndex(i);
			if(i%2==0)
			{
				
				    leaves.selectLeaveType("Sick Leave");
					leaves.Enter_LeaverStartDateSick("01/07/2025");
					leaves.Enter_LeaverEndDateSick("30/07/2025");
				//	leaves.Enter_AWESick("200");
				//	leaves.enterLeaveReson(data[20]);
					leaves.clickSaveBtn();	
					
					
//				leaves.selectLeaveType("Statutory Paternity Pay");
//				leaves.Enter_ActualBirthDate("06/06/2025");
//			//	leaves.Enter_LeaverStartDateSSP(data[9]);
//			//	leaves.enterAwe("200");
//				leaves.enterTotalWeeks("1");
//			//	String Lastdate=leaves.GetLastDate();
//				leaves.clickSaveBtn();
				
				
//				leaves.selectLeaveType("Maternity");
//				leaves.Enter_ExpectedBirthDate("01/06/2025");
//				leaves.Enter_ActualBirthDateInMaternity("01/06/2025");
//				leaves.Enter_LeaverStartDate("01/06/2025");
//				leaves.enterMaternityTotalWeeks("5");
//				leaves.clickSaveBtn();	
			}
			else
			{
			    leaves.selectLeaveType("Sick Leave");
				leaves.Enter_LeaverStartDateSick("01/11/2025");
				leaves.Enter_LeaverEndDateSick("30/11/2025");
			//	leaves.Enter_AWESick("200");
			//	leaves.enterLeaveReson(data[20]);
				leaves.clickSaveBtn();	
				
//				leaves.selectLeaveType("Statutory Paternity Pay");
//				leaves.Enter_ActualBirthDate("01/01/2025");
//			//	leaves.Enter_LeaverStartDateSSP(data[9]);
//			//	leaves.enterAwe("200");
//				leaves.enterTotalWeeks("1");
//			//	String Lastdate=leaves.GetLastDate();
//				leaves.clickSaveBtn();
//				
//				
//				
//					leaves.selectLeaveType("Maternity");
//					leaves.Enter_ExpectedBirthDate("01/01/2025");
//					leaves.Enter_ActualBirthDateInMaternity("01/01/2025");
//					leaves.Enter_LeaverStartDate("01/01/2025");
//					leaves.enterMaternityTotalWeeks("5");
//					leaves.clickSaveBtn();	
				
				
				
			}
			System.out.println("Leavesssssssssssssssss : "+i);
		}
		
				
			
			
			
			
			
		
		
		
		
		
		
		
		
	
		
		leaves.assertAll();
	}
	
}