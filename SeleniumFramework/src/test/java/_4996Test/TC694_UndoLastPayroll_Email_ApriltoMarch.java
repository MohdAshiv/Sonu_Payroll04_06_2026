package _4996Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC694_UndoLastPayroll_Email_ApriltoMarch  extends TestBase{


	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)
	public void TC01validateUndoLastPayrollToMain() throws Exception {
		sTestCaseID = "TC694";
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
		
		
	pages.PayrollRun payroll= new pages.PayrollRun (driver);

	
	 for (int i=0;i<=10;i++){payroll.Run_Payroll();}
		    _4996Page.Page4996 page = new _4996Page.Page4996(driver);
			page.clickUndoLastPayrollBtn();
			page.clickNameCheckBox();
			page.tickEmployee2();
			page.clickUndoBtn1();
			page.SwithToDefault();
			

			payroll.runPayroll(); 
			payroll.selectType(data[29]);
			payroll.runPayroll2();
			payroll.sendEmailFromRunPayroll();

	    _4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);

		verify.verifyTax(data[82], data[83], data[84], data[85], data[86], data[87], data[88], data[89], data[90], data[91], data[92], data[93]);
		verify.verifyEmployeeNI(data[94], data[95], data[96], data[97], data[98], data[99], data[100], data[101], data[102], data[103], data[104], data[105]);
		verify.verifyEmployerNI(data[106], data[107], data[108], data[109], data[110], data[111], data[112], data[113], data[114], data[115], data[116], data[117]);

		
		verify.assertAll();
	}
		
	
	

	@Test(priority=2)
	public void TC02validateTaxNIEmailToBoth() throws Exception {
		sTestCaseID = "TC694";
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
		
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

			
		    payroll.Undo_LastPayroll();
		    
		    driver.navigate().refresh();
		    payroll.Run_Payroll();
		    _4996Page.Page4996 page = new _4996Page.Page4996(driver);
			page.clickUndoLastPayrollBtn();
			page.clickNameCheckBox();
			page.tickEmployee2();
			page.clickUndoBtn1();
			page.SwithToDefault();
			

			payroll.runPayroll(); 
			payroll.selectType(data[53]);
			payroll.runPayroll2();
			payroll.Click_SendBtnEmployee();
			payroll.sendEmailFromRunPayroll();


			_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
			verify.verifyTax(data[82], data[83], data[84], data[85], data[86], data[87], data[88], data[89], data[90], data[91], data[92], data[93]);
			verify.verifyEmployeeNI(data[94], data[95], data[96], data[97], data[98], data[99], data[100], data[101], data[102], data[103], data[104], data[105]);
			verify.verifyEmployerNI(data[106], data[107], data[108], data[109], data[110], data[111], data[112], data[113], data[114], data[115], data[116], data[117]);

			
			verify.assertAll();
	}
	
	
	@Test(priority=3)
	public void TC03validateTaxNIEmailToEmloyees() throws Exception {
		sTestCaseID = "TC694";
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
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
			
		    payroll.Undo_LastPayroll();
		    
		    driver.navigate().refresh();
		    payroll.Run_Payroll();
		    _4996Page.Page4996 page = new _4996Page.Page4996(driver);
			page.clickUndoLastPayrollBtn();
			page.clickNameCheckBox();
			page.tickEmployee2();
			page.clickUndoBtn1();
			page.SwithToDefault();
			

			payroll.runPayroll(); 
			payroll.selectType(data[28]);
			payroll.runPayroll2();
			payroll.sendEmailFromRunPayroll();

			_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
			verify.verifyTax(data[82], data[83], data[84], data[85], data[86], data[87], data[88], data[89], data[90], data[91], data[92], data[93]);
			verify.verifyEmployeeNI(data[94], data[95], data[96], data[97], data[98], data[99], data[100], data[101], data[102], data[103], data[104], data[105]);
			verify.verifyEmployerNI(data[106], data[107], data[108], data[109], data[110], data[111], data[112], data[113], data[114], data[115], data[116], data[117]);
			verify.assertAll();
	}
	
	
	@Test(priority=4)
	public void TC04validateTaxNIEmailDontSend() throws Exception {
		sTestCaseID = "TC694";
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
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
			
		    payroll.Undo_LastPayroll();
		    
		    driver.navigate().refresh();
		    payroll.Run_Payroll();
		    _4996Page.Page4996 page = new _4996Page.Page4996(driver);
			page.clickUndoLastPayrollBtn();
			page.clickNameCheckBox();
			page.tickEmployee2();
			page.clickUndoBtn1();
			page.SwithToDefault();
			

			payroll.Run_Payroll();
			_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
			verify.verifyTax(data[82], data[83], data[84], data[85], data[86], data[87], data[88], data[89], data[90], data[91], data[92], data[93]);
			verify.verifyEmployeeNI(data[94], data[95], data[96], data[97], data[98], data[99], data[100], data[101], data[102], data[103], data[104], data[105]);
			verify.verifyEmployerNI(data[106], data[107], data[108], data[109], data[110], data[111], data[112], data[113], data[114], data[115], data[116], data[117]);
			verify.assertAll();
	}
	
	


	@Test(priority=5)
	public void TC05validateTaxNIEmailToBothUndo3() throws Exception {
		sTestCaseID = "TC694";
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
		
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

			
		    payroll.Undo_LastPayroll();
		    
		    driver.navigate().refresh();
		    payroll.Run_Payroll();
		    _4996Page.Page4996 page = new _4996Page.Page4996(driver);
			page.clickUndoLastPayrollBtn();
			page.clickNameCheckBox();
			page.tickEmployee2();
			page.tickEmployee5();
			page.tickEmployee6();

			page.clickUndoBtn1();
			page.SwithToDefault();
			

			payroll.runPayroll(); 
			payroll.selectType(data[53]);
			payroll.runPayroll2();
			payroll.Click_SendBtnEmployee();
			payroll.sendEmailFromRunPayroll();


			_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
			verify.verifyTax(data[82], data[83], data[84], data[85], data[86], data[87], data[88], data[89], data[90], data[91], data[92], data[93]);
			verify.verifyEmployeeNI(data[94], data[95], data[96], data[97], data[98], data[99], data[100], data[101], data[102], data[103], data[104], data[105]);
			verify.verifyEmployerNI(data[106], data[107], data[108], data[109], data[110], data[111], data[112], data[113], data[114], data[115], data[116], data[117]);
			
			verify.assertAll();
	}
	
	
	@Test(priority=6)
	public void TC06validateTaxNIEmailToEmloyees() throws Exception {
		sTestCaseID = "TC694";
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
		
		pages.PayrollRun payroll= new pages.PayrollRun (driver);
			
		    payroll.Undo_LastPayroll();
		    driver.navigate().refresh();
		    
		    
		    _4996Page.Page4996 page = new _4996Page.Page4996(driver);
		    payroll.Run_Payroll();
			page.clickUndoLastPayrollBtn();
			page.clickNameCheckBox();
			page.tickEmployee2();
			page.tickEmployee5();
			page.tickEmployee6();

			page.clickUndoBtn1();
			page.SwithToDefault();
			
			payroll.runPayroll(); 
			payroll.selectType(data[28]);
			payroll.runPayroll2();
			payroll.sendEmailFromRunPayroll();

			_4996Page.Verify4996 verify = new _4996Page.Verify4996(driver);
			verify.verifyTax(data[82], data[83], data[84], data[85], data[86], data[87], data[88], data[89], data[90], data[91], data[92], data[93]);
			verify.verifyEmployeeNI(data[94], data[95], data[96], data[97], data[98], data[99], data[100], data[101], data[102], data[103], data[104], data[105]);
			verify.verifyEmployerNI(data[106], data[107], data[108], data[109], data[110], data[111], data[112], data[113], data[114], data[115], data[116], data[117]);
			verify.assertAll();
	}
	
}
