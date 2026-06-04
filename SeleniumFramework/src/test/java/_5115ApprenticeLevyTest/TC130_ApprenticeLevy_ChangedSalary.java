package _5115ApprenticeLevyTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC130_ApprenticeLevy_ChangedSalary extends TestBase{

	


	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test

	public void validateAprenticeshipLevy() throws Exception {

		sTestCaseID = "TC130";
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
		
        pages.ProcessPay processPay= new pages.ProcessPay(driver);
		 pages.PayrollRun payroll= new   pages.PayrollRun(driver);

		pages.Recurring recurring= new pages.Recurring(driver);
		
		 int j=5;
		 for(int i=0;i<=7;i++){
		 processPay.click3Dots();
		 processPay.clickProcessPay();
		 processPay.enterBasicPay(data[j++]);
		 processPay.clickSaveBtn();
		 payroll.Run_Payroll();
		 
		 }
		
		 pages.reports report= new   pages.reports(driver);
		 
		 
		 report.Click__Reports_();
		 report.Click_Apprenticeship_Levy();
		 
		 

	     _5115ApprenticeLevyPage.VerifyData verify= new  _5115ApprenticeLevyPage.VerifyData(driver);

		 
		 verify. verifyCumulativeAllownce(1250);
		 verify.verifyLevyPayble1(data[13],data[14],data[15],data[16]);

		 utilities.TakeScreenshot.Getscreenshot("TC130_ Aprenticeship levy ", "5115", driver);


			payroll.Click_PayrollDashboard();
			for (int i = 0; i <= 3; i++) {payroll.Undo_LastPayroll();}

			report.Click__Reports_();
			report.Click_Payroll_Summary();
			verify.PayrollSummary(data[17]);
			utilities.TakeScreenshot.Getscreenshot("TC130_ Aprenticeship levy ", "5115", driver);

			payroll.scrollClickPayrollDashboard();

			for (int i = 0; i <= 1; i++) {payroll.Undo_LastPayroll();}

			report.Click__Reports_();
			report.Click_Payroll_Summary();
			verify.PayrollSummary(data[18]);
	    	 utilities.TakeScreenshot.Getscreenshot("TC130_ Aprenticeship levy ", "5115", driver);


			payroll.scrollClickPayrollDashboard();

			for (int i =0;i<=1;i++){payroll.Undo_LastPayroll();}
		

	        verify.assertAll();
	
	
}
	
	
	
}
