package _8566Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC596_PayrollSummaryPension_42EmployeeMay extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	@Test(priority=1)

	public void TC01validatePayrollSummarMay() throws Exception {

		sTestCaseID = "TC596";
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
		
		pages.PayrollRun payroll = new pages.PayrollRun(driver);


	    pages.reports report= new  pages.reports(driver);
//	    
//		_1566AdditionDeductionPage.ProcessPay ProcessPay = new _1566AdditionDeductionPage.ProcessPay(driver);
//
//		ProcessPay.click3Dots();
//		ProcessPay.clickProcessPay();
//	    ProcessPay.enterBasicPay(data[5]);
//		ProcessPay.clickSaveBtn();
//
//		
//		ProcessPay.click3Dot2();
//		ProcessPay.clickProcessPay2();
//	    ProcessPay.enterBasicPay(data[6]);
//		ProcessPay.clickSaveBtn();
//
//		ProcessPay.click3Dot3();
//		ProcessPay.clickProcessPay3();
//	    ProcessPay.enterBasicPay(data[7]);
//		ProcessPay.clickSaveBtn();
//
//		ProcessPay.click3Dot4();
//		ProcessPay.clickProcessPay4();
//	    ProcessPay.enterBasicPay(data[8]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot5();
//		ProcessPay.clickProcessPay5();
//	    ProcessPay.enterBasicPay(data[9]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot6();
//		ProcessPay.clickProcessPay6();
//	    ProcessPay.enterBasicPay(data[10]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot7();
//		ProcessPay.clickProcessPay7();
//	    ProcessPay.enterBasicPay(data[11]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot8();
//		ProcessPay.clickProcessPay8();
//	    ProcessPay.enterBasicPay(data[12]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot9();
//		ProcessPay.clickProcessPay9();
//	    ProcessPay.enterBasicPay(data[13]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot10();
//		ProcessPay.clickProcessPay10();
//	    ProcessPay.enterBasicPay(data[14]);
//		ProcessPay.clickSaveBtn();
//		
//
//		payroll.NavigateNextPage();
//		
//		
//		ProcessPay.click3Dots();
//		ProcessPay.clickProcessPay();
//	    ProcessPay.enterBasicPay(data[15]);
//		ProcessPay.clickSaveBtn();
//
//		
//		ProcessPay.click3Dot2();
//		ProcessPay.clickProcessPay2();
//	    ProcessPay.enterBasicPay(data[16]);
//		ProcessPay.clickSaveBtn();
//
//		ProcessPay.click3Dot3();
//		ProcessPay.clickProcessPay3();
//	    ProcessPay.enterBasicPay(data[17]);
//		ProcessPay.clickSaveBtn();
//
//		ProcessPay.click3Dot4();
//		ProcessPay.clickProcessPay4();
//	    ProcessPay.enterBasicPay(data[18]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot5();
//		ProcessPay.clickProcessPay5();
//	    ProcessPay.enterBasicPay(data[19]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot6();
//		ProcessPay.clickProcessPay6();
//	    ProcessPay.enterBasicPay(data[20]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot7();
//		ProcessPay.clickProcessPay7();
//	    ProcessPay.enterBasicPay(data[21]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot8();
//		ProcessPay.clickProcessPay8();
//	    ProcessPay.enterBasicPay(data[22]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot9();
//		ProcessPay.clickProcessPay9();
//	    ProcessPay.enterBasicPay(data[23]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot10();
//		ProcessPay.clickProcessPay10();
//	    ProcessPay.enterBasicPay(data[24]);
//		ProcessPay.clickSaveBtn();
//		
//
//		payroll.NavigateNextPage();
//		
//		
//		
//		ProcessPay.click3Dots();
//		ProcessPay.clickProcessPay();
//	    ProcessPay.enterBasicPay(data[25]);
//		ProcessPay.clickSaveBtn();
//
//		
//		ProcessPay.click3Dot2();
//		ProcessPay.clickProcessPay2();
//	    ProcessPay.enterBasicPay(data[26]);
//		ProcessPay.clickSaveBtn();
//
//		ProcessPay.click3Dot3();
//		ProcessPay.clickProcessPay3();
//	    ProcessPay.enterBasicPay(data[27]);
//		ProcessPay.clickSaveBtn();
//
//		ProcessPay.click3Dot4();
//		ProcessPay.clickProcessPay4();
//	    ProcessPay.enterBasicPay(data[28]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot5();
//		ProcessPay.clickProcessPay5();
//	    ProcessPay.enterBasicPay(data[29]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot6();
//		ProcessPay.clickProcessPay6();
//	    ProcessPay.enterBasicPay(data[30]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot7();
//		ProcessPay.clickProcessPay7();
//	    ProcessPay.enterBasicPay(data[31]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot8();
//		ProcessPay.clickProcessPay8();
//	    ProcessPay.enterBasicPay(data[32]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot9();
//		ProcessPay.clickProcessPay9();
//	    ProcessPay.enterBasicPay(data[33]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot10();
//		ProcessPay.clickProcessPay10();
//	    ProcessPay.enterBasicPay(data[34]);
//		ProcessPay.clickSaveBtn();
//		
//
//		payroll.NavigateNextPage();
//		
//		ProcessPay.click3Dots();
//		ProcessPay.clickProcessPay();
//	    ProcessPay.enterBasicPay(data[35]);
//		ProcessPay.clickSaveBtn();
//
//		
//		ProcessPay.click3Dot2();
//		ProcessPay.clickProcessPay2();
//	    ProcessPay.enterBasicPay(data[36]);
//		ProcessPay.clickSaveBtn();
//
//		ProcessPay.click3Dot3();
//		ProcessPay.clickProcessPay3();
//	    ProcessPay.enterBasicPay(data[37]);
//		ProcessPay.clickSaveBtn();
//
//		ProcessPay.click3Dot4();
//		ProcessPay.clickProcessPay4();
//	    ProcessPay.enterBasicPay(data[38]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot5();
//		ProcessPay.clickProcessPay5();
//	    ProcessPay.enterBasicPay(data[39]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot6();
//		ProcessPay.clickProcessPay6();
//	    ProcessPay.enterBasicPay(data[40]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot7();
//		ProcessPay.clickProcessPay7();
//	    ProcessPay.enterBasicPay(data[41]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot8();
//		ProcessPay.clickProcessPay8();
//	    ProcessPay.enterBasicPay(data[42]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot9();
//		ProcessPay.clickProcessPay9();
//	    ProcessPay.enterBasicPay(data[43]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot10();
//		ProcessPay.clickProcessPay10();
//	    ProcessPay.enterBasicPay(data[44]);
//		ProcessPay.clickSaveBtn();
//		
//
//		payroll.NavigateNextPage();
//		
//		
//		ProcessPay.click3Dots();
//		ProcessPay.clickProcessPay();
//	    ProcessPay.enterBasicPay(data[45]);
//		ProcessPay.clickSaveBtn();
//
//		
//		ProcessPay.click3Dot2();
//		ProcessPay.clickProcessPay2();
//	    ProcessPay.enterBasicPay(data[46]);
//		ProcessPay.clickSaveBtn();
//
//		ProcessPay.click3Dot3();
//		ProcessPay.clickProcessPay3();
//	    ProcessPay.enterBasicPay(data[47]);
//		ProcessPay.clickSaveBtn();
//
//	
//		payroll.Run_Payroll();
//		
		
		report.Click__Reports_();
		report.Click_Payroll_Summary();
		
		payroll.SelecPeriodEndDate(data[93]);
		
		_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);


		verify.verifySummaryPension42Employee(data[94], data[95], data[96], data[97], data[98], data[99], data[100], data[101], data[102], data[103], data[104], data[105], data[106]);
		
		verify.assertAll();
}
	
	
	@Test(priority=2)

	public void TC02validatePayrollSummaryMayEmail() throws Exception {

		sTestCaseID = "TC596";
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
		
		 pages.reports report= new  pages.reports(driver);
		    
	    pages.PayrollRun payroll = new pages.PayrollRun(driver);

		report.Click__Reports_();
		report.Click_Payroll_Summary();
		payroll.SelecPeriodEndDate(data[93]);

		
		_4942PasswordProtection_Page.EmailPage email = new _4942PasswordProtection_Page.EmailPage(driver);
		
		email.clickEmailBtn();

		email.clickSendBtn();

		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);

		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
		
		_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);
         verify.VerifyRecivedEmailPayrollSummary(data[107],data[108],data[109],data[110],data[111],data[112],data[113]);
	
		verify.assertAll();
}
	
	
	
	@Test(priority=3)

	public void TC03validatePayrollSummarJune() throws Exception {

		sTestCaseID = "TC596";
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
		
		pages.PayrollRun payroll = new pages.PayrollRun(driver);



	    pages.reports report= new  pages.reports(driver);
//	    
//		_1566AdditionDeductionPage.ProcessPay ProcessPay = new _1566AdditionDeductionPage.ProcessPay(driver);
//
//		ProcessPay.click3Dots();
//		ProcessPay.clickProcessPay();
//	    ProcessPay.enterBasicPay(data[49]);
//		ProcessPay.clickSaveBtn();
//
//		
//		ProcessPay.click3Dot2();
//		ProcessPay.clickProcessPay2();
//	    ProcessPay.enterBasicPay(data[50]);
//		ProcessPay.clickSaveBtn();
//
//		ProcessPay.click3Dot3();
//		ProcessPay.clickProcessPay3();
//	    ProcessPay.enterBasicPay(data[51]);
//		ProcessPay.clickSaveBtn();
//
//		ProcessPay.click3Dot4();
//		ProcessPay.clickProcessPay4();
//	    ProcessPay.enterBasicPay(data[52]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot5();
//		ProcessPay.clickProcessPay5();
//	    ProcessPay.enterBasicPay(data[53]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot6();
//		ProcessPay.clickProcessPay6();
//	    ProcessPay.enterBasicPay(data[54]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot7();
//		ProcessPay.clickProcessPay7();
//	    ProcessPay.enterBasicPay(data[55]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot8();
//		ProcessPay.clickProcessPay8();
//	    ProcessPay.enterBasicPay(data[56]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot9();
//		ProcessPay.clickProcessPay9();
//	    ProcessPay.enterBasicPay(data[57]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot10();
//		ProcessPay.clickProcessPay10();
//	    ProcessPay.enterBasicPay(data[58]);
//		ProcessPay.clickSaveBtn();
//		
//
//		payroll.NavigateNextPage();
//		
//		
//		ProcessPay.click3Dots();
//		ProcessPay.clickProcessPay();
//	    ProcessPay.enterBasicPay(data[59]);
//		ProcessPay.clickSaveBtn();
//
//		
//		ProcessPay.click3Dot2();
//		ProcessPay.clickProcessPay2();
//	    ProcessPay.enterBasicPay(data[60]);
//		ProcessPay.clickSaveBtn();
//
//		ProcessPay.click3Dot3();
//		ProcessPay.clickProcessPay3();
//	    ProcessPay.enterBasicPay(data[61]);
//		ProcessPay.clickSaveBtn();
//
//		ProcessPay.click3Dot4();
//		ProcessPay.clickProcessPay4();
//	    ProcessPay.enterBasicPay(data[62]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot5();
//		ProcessPay.clickProcessPay5();
//	    ProcessPay.enterBasicPay(data[63]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot6();
//		ProcessPay.clickProcessPay6();
//	    ProcessPay.enterBasicPay(data[64]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot7();
//		ProcessPay.clickProcessPay7();
//	    ProcessPay.enterBasicPay(data[65]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot8();
//		ProcessPay.clickProcessPay8();
//	    ProcessPay.enterBasicPay(data[66]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot9();
//		ProcessPay.clickProcessPay9();
//	    ProcessPay.enterBasicPay(data[67]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot10();
//		ProcessPay.clickProcessPay10();
//	    ProcessPay.enterBasicPay(data[68]);
//		ProcessPay.clickSaveBtn();
//		
//
//		payroll.NavigateNextPage();
//		
//		
//		
//		ProcessPay.click3Dots();
//		ProcessPay.clickProcessPay();
//	    ProcessPay.enterBasicPay(data[69]);
//		ProcessPay.clickSaveBtn();
//
//		
//		ProcessPay.click3Dot2();
//		ProcessPay.clickProcessPay2();
//	    ProcessPay.enterBasicPay(data[70]);
//		ProcessPay.clickSaveBtn();
//
//		ProcessPay.click3Dot3();
//		ProcessPay.clickProcessPay3();
//	    ProcessPay.enterBasicPay(data[71]);
//		ProcessPay.clickSaveBtn();
//
//		ProcessPay.click3Dot4();
//		ProcessPay.clickProcessPay4();
//	    ProcessPay.enterBasicPay(data[72]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot5();
//		ProcessPay.clickProcessPay5();
//	    ProcessPay.enterBasicPay(data[73]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot6();
//		ProcessPay.clickProcessPay6();
//	    ProcessPay.enterBasicPay(data[74]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot7();
//		ProcessPay.clickProcessPay7();
//	    ProcessPay.enterBasicPay(data[75]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot8();
//		ProcessPay.clickProcessPay8();
//	    ProcessPay.enterBasicPay(data[76]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot9();
//		ProcessPay.clickProcessPay9();
//	    ProcessPay.enterBasicPay(data[77]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot10();
//		ProcessPay.clickProcessPay10();
//	    ProcessPay.enterBasicPay(data[78]);
//		ProcessPay.clickSaveBtn();
//		
//
//		payroll.NavigateNextPage();
//		
//		ProcessPay.click3Dots();
//		ProcessPay.clickProcessPay();
//	    ProcessPay.enterBasicPay(data[79]);
//		ProcessPay.clickSaveBtn();
//
//		
//		ProcessPay.click3Dot2();
//		ProcessPay.clickProcessPay2();
//	    ProcessPay.enterBasicPay(data[80]);
//		ProcessPay.clickSaveBtn();
//
//		ProcessPay.click3Dot3();
//		ProcessPay.clickProcessPay3();
//	    ProcessPay.enterBasicPay(data[81]);
//		ProcessPay.clickSaveBtn();
//
//		ProcessPay.click3Dot4();
//		ProcessPay.clickProcessPay4();
//	    ProcessPay.enterBasicPay(data[82]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot5();
//		ProcessPay.clickProcessPay5();
//	    ProcessPay.enterBasicPay(data[83]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot6();
//		ProcessPay.clickProcessPay6();
//	    ProcessPay.enterBasicPay(data[84]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot7();
//		ProcessPay.clickProcessPay7();
//	    ProcessPay.enterBasicPay(data[85]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot8();
//		ProcessPay.clickProcessPay8();
//	    ProcessPay.enterBasicPay(data[86]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot9();
//		ProcessPay.clickProcessPay9();
//	    ProcessPay.enterBasicPay(data[87]);
//		ProcessPay.clickSaveBtn();
//		
//		ProcessPay.click3Dot10();
//		ProcessPay.clickProcessPay10();
//	    ProcessPay.enterBasicPay(data[88]);
//		ProcessPay.clickSaveBtn();
//		
//
//		payroll.NavigateNextPage();
//		
//		
//		ProcessPay.click3Dots();
//		ProcessPay.clickProcessPay();
//	    ProcessPay.enterBasicPay(data[89]);
//		ProcessPay.clickSaveBtn();
//
//		
//		ProcessPay.click3Dot2();
//		ProcessPay.clickProcessPay2();
//	    ProcessPay.enterBasicPay(data[90]);
//		ProcessPay.clickSaveBtn();
//
//		ProcessPay.click3Dot3();
//		ProcessPay.clickProcessPay3();
//	    ProcessPay.enterBasicPay(data[91]);
//		ProcessPay.clickSaveBtn();
//
//	
//		payroll.Run_Payroll();
		
		
		report.Click__Reports_();
		report.Click_Payroll_Summary();
		
		payroll.SelecPeriodEndDate(data[114]);
		
		_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);

		verify.verifySummaryPension42Employee(data[115], data[116], data[117], data[118], data[119], data[120], data[121], data[122], data[123], data[124], data[125], data[126], data[127]);
		
		verify.assertAll();
}
	
	
	@Test(priority=4)

	public void TC04validatePayrollSummaryJuneEmail() throws Exception {

		sTestCaseID = "TC596";
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
		

		 pages.reports report= new  pages.reports(driver);
		    
	    pages.PayrollRun payroll = new pages.PayrollRun(driver);

		report.Click__Reports_();
		report.Click_Payroll_Summary();
		payroll.SelecPeriodEndDate(data[114]);

		
		_4942PasswordProtection_Page.EmailPage email = new _4942PasswordProtection_Page.EmailPage(driver);
		
		email.clickEmailBtn();

		email.clickSendBtn();

		pages.AgentLevelEmailLog emaillog = new pages.AgentLevelEmailLog(driver);

		emaillog.clickEmailDropDown();
		emaillog.clickEmailLog();
		emaillog.clickRecievedEmail();
		
		_8566Page.VerifyData verify = new _8566Page.VerifyData(driver);
         verify.VerifyRecivedEmailPayrollSummary(data[128],data[129],data[130],data[131],data[132],data[133],data[134]);
	
		verify.assertAll();
}
}
