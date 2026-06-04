package _5630OffPayrollWorker;

import org.testng.annotations.Test;

import pages.EmployeePage;
import tests.TestBase;
import utilities.ExcelData;

public class TC271_OffPayWorker_MidTaxYear extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void validateOffPayWorkerTaxPayment() throws Exception {

		sTestCaseID = "TC271";
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
	
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

        pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);
		
	    edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickYesOffPayWorker();
		edit.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		_5630OffPayrollWorkerPage.VerifyOffPayroll verify= new _5630OffPayrollWorkerPage.VerifyOffPayroll(driver);
	
	     payroll.Run_Payroll();
	     
	     pages.FilingManagement filling= new  pages.FilingManagement(driver);
	     filling.Click_gotoFilingManagement();
	     filling.clickFps();
	     
	     _2154EmployeeOpeningBalance_Page.FillingManagement xml= new _2154EmployeeOpeningBalance_Page.FillingManagement(driver);
	     xml.getXMLData();
	     xml.verifyOffPayWorker(data[5]);
	     payroll.Click_PayrollDashboard();
	     payroll.Undo_LastPayroll();
	     edit.clickEmployeeName();
		 edit.editEmployeeDetails();
		 edit.clickMandotoryPayroll();
		 edit.clickNoOffPayWorker();
		 edit.clickSaveBtn();

	     xml.assertAll();
	
	}
	
	
	@Test(priority=2)

	public void validateOffPayrollStudentLoanDisable() throws Exception {

		sTestCaseID = "TC271";
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
	
     
        pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);
		
	    edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickYesOffPayWorker();
//		edit.clickYesBtn();
		_5630OffPayrollWorkerPage.VerifyOffPayroll verify= new _5630OffPayrollWorkerPage.VerifyOffPayroll(driver);
		edit.clickPaydetails();
		
	    verify.verifyStudentLoanDisable();
		verify.assertAll();

}
	
	@Test(priority=3)

	public void validateOffPayrollPopupAppear() throws Exception {

		sTestCaseID = "TC271";
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
	
     
        pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);
		
	    edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
//		edit.clickYesOffPayWorker();
		edit.clickOffPayWorker();

		_5630OffPayrollWorkerPage.VerifyOffPayroll verify= new _5630OffPayrollWorkerPage.VerifyOffPayroll(driver);
		
		verify.verifyOffPayWorkerPopupAppear(data[6]);
		verify.assertAll();

}
	
	

	@Test(priority=4)

	public void validateOffPayrollPopupClickNO() throws Exception {

		sTestCaseID = "TC271";
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
	
        pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);
		
	    edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickOffPayWorker();
		edit.clickNoBtn();
		_5630OffPayrollWorkerPage.VerifyOffPayroll verify= new _5630OffPayrollWorkerPage.VerifyOffPayroll(driver);
		
	    verify.verifyOffPayWorkerNotSelected();
		verify.assertAll();

}
	
	
	@Test(priority=5)

	public void validateOffPayrollPopupClickYes() throws Exception {

		sTestCaseID = "TC271";
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
	
     
        pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);
		
	    edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickYesOffPayWorker();
//		edit.clickYesBtn();
		_5630OffPayrollWorkerPage.VerifyOffPayroll verify= new _5630OffPayrollWorkerPage.VerifyOffPayroll(driver);
		
	    verify.verifyOffPayWorkerSelected();
		verify.assertAll();

}
	
	
	@Test(priority=6)

	public void validateOffPayWorkerNetPayCalculator() throws Exception {

		sTestCaseID = "TC271";
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
	
	   
        pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);
		
	    edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		
		edit.clickYesOffPayWorker();
//		edit.clickYesBtn();
		edit.clickSaveBtn();
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);
		_5630OffPayrollWorkerPage.VerifyOffPayroll verify= new _5630OffPayrollWorkerPage.VerifyOffPayroll(driver);

		
		payroll.Click_PayrollDashboard();
		
		
		_1566AdditionDeductionPage.ProcessPay processPay= new _1566AdditionDeductionPage.ProcessPay(driver);
		 processPay.click3Dots();
		 processPay.clickProcessPay();
		 processPay.clickNetPayCalculator();
		 processPay.enterNetPayInput(data[7]);
		 processPay.clickCalculatBtn();
		 processPay.clickSaveBtn();
		 verify.verifyNetPay(data[8]);
		 processPay.click3Dots();
		 processPay.clickProcessPay();
		 
		 processPay.enterBasicPay(data[9]);
		 processPay.clickSaveBtn();
		
		edit.clickEmployeeName();
		edit.editEmployeeDetails();
	    edit.clickMandotoryPayroll();
		
		edit.clickNoOffPayWorker();
			
		edit.clickSaveBtn();		
	    verify.assertAll();

	}
	

	@Test(priority=7)

	public void validateNotinalPay() throws Exception {

		sTestCaseID = "TC271";
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
	
	   
        pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);
		
	    edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		_5630OffPayrollWorkerPage.VerifyOffPayroll verify= new _5630OffPayrollWorkerPage.VerifyOffPayroll(driver);
		
		edit.clickYesOffPayWorker();
//		edit.clickYesBtn();
		edit.clickSaveBtn();
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);
	    
		
		payroll.Click_PayrollDashboard();
		
		
		_1566AdditionDeductionPage.ProcessPay processPay= new _1566AdditionDeductionPage.ProcessPay(driver);
		 processPay.click3Dots();
		 processPay.clickProcessPay();
		 processPay.selectCheckBx();
		 processPay.clickDeletBtn();
		 processPay.clickAddMore(); 
		 processPay.enterAccountCode(data[10]);
		 processPay.enterDescription(data[11]);
		 processPay.enterAmount(data[12]);
		 processPay.clickApplyBtn();
		 processPay.checkedAllOption();
		 processPay.clickSaveBtn();

        verify.verifyNetPay(data[13]);
        
		processPay.click3Dots();
		processPay.clickProcessPay();
		processPay.selectCheckBx();
		processPay.clickDeletBtn();
		processPay.clickSaveBtn();

        edit.clickEmployeeName();
 		edit.editEmployeeDetails();
 		edit.clickMandotoryPayroll();
 		edit.clickNoOffPayWorker();
		
		edit.clickSaveBtn();
	    verify.assertAll();

	}
	
	@Test(priority = 8)
	public void validateOffPayWorkerRecurringAdditionDeduction() throws Exception {

		sTestCaseID = "TC271";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4 loginpage = new pages.loginpage4(driver);
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
		
		pages.Recurring recurring = new pages.Recurring(driver);
		pages.ProcessPay processPay  = new pages.ProcessPay (driver);
		pages.EmployeePage employee= new EmployeePage(driver);
		pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);
		
	    edit.clickEmployeeName();
		edit.editEmployeeDetails();
        edit.clickMandotoryPayroll();
		
		edit.clickYesOffPayWorker();
//		edit.clickYesBtn();
		 edit.clickSaveBtn();
		 pages.PayrollRun payroll= new  pages.PayrollRun(driver);
		 payroll.Click_PayrollDashboard();
	 
		 processPay.click3Dots();
		 recurring.clickAdditionDeductions();
		 processPay.selectCheckBx();
		 processPay.clickDeletBtn();
		 processPay.clickAddMore();
		 recurring.enterFrequency(data[14]);
		 recurring.enterFromDate(data[15]);
	     recurring.Enter_toDate(data[16]);
		 recurring.enterAcountCode(data[17]);
		 recurring.enterdescription(data[18]);
		 recurring.enterAmount(data[19]);
		 
		 recurring.clickdeductionTab();
		 recurring.enterFromDateDeduction(data[15]);
		 recurring.enterToDateDeduction(data[16]);
		 recurring.enterAcountCodeDeduction(data[17]);
		 recurring.enterDescriptionDeduction(data[20]);
		 recurring.enterAmountDeduction(data[21]);
		 processPay.clickSaveBtn();
		 
		 processPay.clickEmployeeName();
		 processPay.clickEmployeeSalaryDetails2();
		_5630OffPayrollWorkerPage.VerifyOffPayroll verify= new _5630OffPayrollWorkerPage.VerifyOffPayroll(driver);

		verify.netTaxNIGrossYTD1(data[22], data[23], data[24], data[25], data[26]);

		
		payroll.closePopup();
		payroll.Click_PayrollDashboard();

		
		  
		 processPay.click3Dots();
		 recurring.clickAdditionDeductions();
		 processPay.selectCheckBx();
		 processPay.clickDeletBtn();
		 recurring.clickdeductionTab();
		 processPay.selectCheckBx1();
		 processPay.clickDeletBtn();
		 processPay.clickSaveBtn();
		
		edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();

		edit.clickNoOffPayWorker();
		
		edit.clickSaveBtn();
		
		verify.assertAll();
		
}
	
	@Test(priority=9)

	public void validateOffPayrollAOE() throws Exception {

		sTestCaseID = "TC271";
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
	
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);
       
        pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);
		
	    edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickYesOffPayWorker();
		edit.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		_5630OffPayrollWorkerPage.VerifyOffPayroll verify= new _5630OffPayrollWorkerPage.VerifyOffPayroll(driver);
	
		
		pages.Addition_DeductionAOEPage aOE= new 	pages.Addition_DeductionAOEPage (driver);
		aOE.Click_click_three_dots();
		
		aOE.Click_clickAdditionDeductionAOE();
		aOE.Click_clickAOE();
		aOE.Click_clickAddMore();
		aOE.Select_AOEDropDownList(data[27]);
		aOE.Enter_DatetoApplyFrom(data[28]);
		aOE.Enter_MonthlyAmount(data[29]);
		aOE.Click_clickSave();
		//aOE.Click_closeButton();
		payroll.Click_PayrollDashboard();
		edit.clickEmployeeName();
		verify.verifyAoePayement(data[30]);
		payroll.Click_PayrollDashboard();
		
		aOE.Click_click_three_dots();

		aOE.Click_clickAdditionDeductionAOE();
		aOE.Click_clickAOE();
		aOE.Click_Check_toDeleteAOE();
		aOE.Click_DeleteBtnAOE();
		payroll.Click_PayrollDashboard();
		edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickNoOffPayWorker();
		edit.clickSaveBtn();
		verify.assertAll();

	}
	
	

	@Test(priority=10)

	public void validateOffPayrollLeaveAlert() throws Exception {

		sTestCaseID = "TC271";
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
		OpenClient.Enter_EnterClientName(data[31]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
	
	   
        pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);
		
	    edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		_5630OffPayrollWorkerPage.VerifyOffPayroll verify= new _5630OffPayrollWorkerPage.VerifyOffPayroll(driver);
		
		edit.clickYesOffPayWorker();
//		edit.clickYesBtn();
		edit.clickSaveBtn();
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);
	    payroll.Click_PayrollDashboard();
	    
	    edit.clickEmployeeName1();
	  	edit.editEmployeeDetails();
	  	edit.clickMandotoryPayroll();
		
		edit.clickYesOffPayWorker();
//		edit.clickYesBtn();
		edit.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		
		
		    
	    pages.LeaveManagement leave= new  pages.LeaveManagement(driver);
        leave.clickLeaveManagement();
        leave.clickAddLeave();
        leave.selectEmployee(data[32]);
        
        for (int i=33;i<=37;i++)
        {
        leave.selectLeaveType(data[i]);
        verify.verifyAlertMsg();
	  
        }
        leave.selectEmployee(data[38]);
        
     //  verify.verifyTagsAndText();
        
        for (int i=39;i<=44;i++)
        {
        leave.selectLeaveType(data[i]);
        verify.verifyAlertMsg();
	  
        }
        payroll.Click_PayrollDashboard();
        edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickNoOffPayWorker();
		edit.clickSaveBtn();

		payroll.Click_PayrollDashboard();
		edit.clickEmployeeName1();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickNoOffPayWorker();
		edit.clickSaveBtn();
		verify.assertAll();

	}
	
	@Test(priority=11)

	public void validateOffPayWorkerPensionShouldNotCalculate() throws Exception {

		sTestCaseID = "TC271";
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
		OpenClient.Enter_EnterClientName(data[45]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
	
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

        pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);
		
	    edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickYesOffPayWorker();
		edit.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		_5630OffPayrollWorkerPage.VerifyOffPayroll verify= new _5630OffPayrollWorkerPage.VerifyOffPayroll(driver);
		
		verify.verifyEmployeeEmployerPension(data[46], data[47]);
		edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickNoOffPayWorker();
		edit.clickSaveBtn();
		edit.clickAutoEnrolment();
		
		edit.selectPensionScheme(data[50]);
		edit.clickAutoEnrolmentSaveBtn();
		payroll.Click_PayrollDashboard();
		verify.verifyEmployeeEmployerPension(data[48], data[49]);

		verify.assertAll();
		
		
	
	}	
	
	
	@Test(priority=12)

	public void validateOffPayWorkerShouldNotImpactOtherEmployee() throws Exception {

		sTestCaseID = "TC271";
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
		OpenClient.Enter_EnterClientName(data[45]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
	
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

        pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);
		
	    edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickYesOffPayWorker();
		edit.clickSaveBtn();
		payroll.Click_PayrollDashboard();
		_5630OffPayrollWorkerPage.VerifyOffPayroll verify= new _5630OffPayrollWorkerPage.VerifyOffPayroll(driver);
		
		verify.verifyEmployeeEmployerPension2(data[48], data[49]);
		edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickNoOffPayWorker();
		edit.clickSaveBtn();
		edit.clickAutoEnrolment();
		
		edit.selectPensionScheme(data[50]);
		edit.clickAutoEnrolmentSaveBtn();
		payroll.Click_PayrollDashboard();
		verify.verifyEmployeeEmployerPension2(data[48], data[49]);

		verify.assertAll();
		
	}	
	
	@Test(priority=13)

	public void validateOffPayWorkerCalculation() throws Exception {

		sTestCaseID = "TC271";
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
	
     
        pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);
		_5630OffPayrollWorkerPage.VerifyOffPayroll verify= new _5630OffPayrollWorkerPage.VerifyOffPayroll(driver);

        verify.getPayrollCaluclations();
        
	    edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickYesOffPayWorker();
//		edit.clickYesBtn();
		edit.clickSaveBtn();
		verify.verifyOffPayWorkerSelected();
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);
	    payroll.Click_PayrollDashboard();
	    
        verify.verifyPayrollCalculations();
			
        edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickNoOffPayWorker();
		
		edit.clickSaveBtn();
	    
		verify.assertAll();

}
	

	@Test(priority=14)

	public void validateOffPayrollPopupClickYesDirectorDisable() throws Exception {

		sTestCaseID = "TC271";
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
	
     
        pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);
		
	    edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		edit.clickYesOffPayWorker();
//		edit.clickYesBtn();
		_5630OffPayrollWorkerPage.VerifyOffPayroll verify= new _5630OffPayrollWorkerPage.VerifyOffPayroll(driver);
		
	    verify.verifyOffPayWorkerDirectorDisable();
		verify.assertAll();

}

	
	@Test(priority=15)

	public void validateOffPayrollForNewAndExistingEmployee() throws Exception {

		sTestCaseID = "TC271";
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
	
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);
        payroll.Run_Payroll();
        pages.EmployeeEditAndRateChanges edit = new pages.EmployeeEditAndRateChanges(driver);
		
	    edit.clickEmployeeName();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		_5630OffPayrollWorkerPage.VerifyOffPayroll verify= new _5630OffPayrollWorkerPage.VerifyOffPayroll(driver);
		
		verify.verifyOffPayWorkerDisable();
		payroll.Click_PayrollDashboard();
		edit.clickEmployeeName1();
		edit.editEmployeeDetails();
		edit.clickMandotoryPayroll();
		verify.verifyOffPayWorkerEnabled();
		payroll.Click_PayrollDashboard();
		payroll.Undo_LastPayroll();
		verify.assertAll();

	}
	
}
