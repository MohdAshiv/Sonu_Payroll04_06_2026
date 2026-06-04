package _5115ApprenticeLevyTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC135_ApprenticeLevy_MultipleAddition extends TestBase {


	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test

	public void validateAprenticeshipLevy() throws Exception {

		sTestCaseID = "TC135";
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
		
		pages.Recurring recurring= new pages.Recurring(driver);

		 processPay.click3Dots();
		 recurring.clickAdditionDeductions();
		 processPay.selectCheckBx();
		 processPay.clickDeletBtn();
		 processPay.clickAddMore();
		 recurring.enterFrequency(data[5]);
		 recurring.enterFromDate(data[6]);
		 recurring.enterAcountCode(data[7]);
		 recurring.enterdescription(data[8]);
		 recurring.enterAmount(data[9]);
		 recurring.applyOnBtn();
		 processPay.onlyCheckPayeTax();
		 
		 processPay.clickAddMore();
		 recurring.enterFrequency1(data[5]);
		 recurring.enterFromDate1(data[6]);
		 recurring.enterAcountCode1(data[7]);
		 recurring.enterDescription1(data[10]);
		 recurring.enterAmount1(data[11]);
		 recurring.applyOnBtn1();
		 processPay.niableOnly3();
	
		 processPay.clickSaveBtn(); 
		 pages.PayrollRun payroll= new   pages.PayrollRun(driver);

		 for (int i = 0; i <= 11; i++) {payroll.Run_Payroll();}
			
			
	      pages.reports report= new   pages.reports(driver);
			 
			 
		  report.Click__Reports_();
	      report.Click_Apprenticeship_Levy();
			 
		  _5115ApprenticeLevyPage.VerifyData verify= new  _5115ApprenticeLevyPage.VerifyData(driver);

		   verify.verifyCumulativeWagesSum(data[12]);
		   verify.verifyCumulativeLevyDue2(data[13]);
		   verify. verifyCumulativeAllownce(1250);
			
			utilities.TakeScreenshot.Getscreenshot("TC135_ Aprenticeship levy ", "5115", driver);

			payroll.Click_PayrollDashboard();

			report.Click__Reports_();
			report.Click_Payroll_Summary();
			verify.PayrollSummary1(data[14]);

			payroll.scrollClickPayrollDashboard();
			utilities.TakeScreenshot.Getscreenshot("TC135_ No Aprenticeship levy ", "5115", driver);

			for (int i = 0; i <= 11; i++) {	payroll.Undo_LastPayroll();}

		     verify.assertAll();
	
	}
}
