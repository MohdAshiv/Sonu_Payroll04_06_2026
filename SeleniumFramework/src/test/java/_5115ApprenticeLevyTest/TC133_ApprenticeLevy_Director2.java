package _5115ApprenticeLevyTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC133_ApprenticeLevy_Director2 extends TestBase {


	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test

	public void validateAprenticeshipLevy() throws Exception {

		sTestCaseID = "TC133";
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
		
	   pages.PayrollRun payroll= new   pages.PayrollRun(driver);
	   

	   
		for (int i = 0; i <= 11; i++) {payroll.Run_Payroll();}
		
		
         pages.reports report= new   pages.reports(driver);
		 
		 
		 report.Click__Reports_();
		 report.Click_Apprenticeship_Levy();
		 
	     _5115ApprenticeLevyPage.VerifyData verify= new  _5115ApprenticeLevyPage.VerifyData(driver);

	     verify.verifyCumulativeWages(23535);
		 verify.verifyCumulativeLevyDue2(data[5]);
		 verify. verifyCumulativeAllownce(1250);
		
		 utilities.TakeScreenshot.Getscreenshot("TC133_ Aprenticeship levy ", "5115", driver);

		payroll.Click_PayrollDashboard();
		
		 report.Click__Reports_();
		 report.Click_Payroll_Summary();
		 verify.PayrollSummary1(data[7]);
		 
		 payroll.scrollClickPayrollDashboard();
		 utilities.TakeScreenshot.Getscreenshot("TC133_ No Aprenticeship levy ", "5115", driver);

		for (int i = 0; i <= 11; i++) {payroll.Undo_LastPayroll(); Thread.sleep(2000);}
		
		
		  verify.assertAll();

		
		
	}
}
	
	

