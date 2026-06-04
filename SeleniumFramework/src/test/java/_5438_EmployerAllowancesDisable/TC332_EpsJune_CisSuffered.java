package _5438_EmployerAllowancesDisable;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC332_EpsJune_CisSuffered  extends TestBase{

	

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)
	public void validateEPS_CIS() throws Exception {

		sTestCaseID = "TC332";
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

        pages.EditCompany company= new pages.EditCompany(driver);
	  
	    for(int i=0;i<=1;i++) {payroll.Run_Payroll();}
	    
	    pages.reports report= new pages.reports(driver);
		
		report.clickTaxPayment();
		
	
		_5885BuisnessLevelPopUP_Page.BuisnessPage cis= new _5885BuisnessLevelPopUP_Page.BuisnessPage(driver);
        
		cis.clickCisSufferd();
		cis.enterMayCIS(data[5]);
		cis.saveCIS();
		
		payroll.Click_PayrollDashboard();
		
		payroll.Run_Payroll();
	    	

	    pages.FilingManagement filling= new  pages.FilingManagement(driver);
	    filling.Click_gotoFilingManagement();
	    
	    _5438_EmployerAllowancesDisable_Page.EmployerAllowancePage xml1= new  _5438_EmployerAllowancesDisable_Page.EmployerAllowancePage(driver);
	     xml1.clickJuneEps();

	    _5438_EmployerAllowancesDisable_Page.VerifyData verify= new  _5438_EmployerAllowancesDisable_Page.VerifyData(driver);
	     verify.getXMLData();  
	     
	     verify.verifyEPSCisTag(data[6]);
	   
         payroll.scrollClickPayrollDashboard();
 	     for(int i=0;i<=2;i++) {payroll.Undo_LastPayroll();Thread.sleep(2000);}
 	    
 	    report.clickTaxPayment();
 	   
 		cis.clickCisSufferd();
		cis.enterMayCIS(data[7]);
		cis.saveCIS();
		
        verify.assertAll();
    
}	
	

	@Test(priority=2)
	public void validateEPS_CISWithNOEmployee() throws Exception {

		sTestCaseID = "TC332";
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
		OpenClient.Enter_EnterClientName(data[8]);
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
	
	    pages.PayrollRun payroll= new  pages.PayrollRun(driver);

        pages.EditCompany company= new pages.EditCompany(driver);
	  
	    pages.reports report= new pages.reports(driver);
		
	    company.Click_gotoEditCompany();
	    company.Click_clickPayrollDetails();
	    company.Click_AllowancesSchemes();
	    company.clickYesEmployementAllownaces();
	    company.clickEnabledEmployementAllownaces();
	
	    payroll.Click_PayrollDashboard();
		report.clickTaxPayment();
		
		_5885BuisnessLevelPopUP_Page.BuisnessPage cis= new _5885BuisnessLevelPopUP_Page.BuisnessPage(driver);
        
		cis.clickCisSufferd();
		cis.enterAprilCIS(data[9]);
		cis.saveCIS();
		
		payroll.Click_PayrollDashboard();
		
		payroll.Run_Payroll();
		
	    pages.FilingManagement filling= new  pages.FilingManagement(driver);
	    filling.Click_gotoFilingManagement();
	    
	    _5438_EmployerAllowancesDisable_Page.EmployerAllowancePage xml1= new  _5438_EmployerAllowancesDisable_Page.EmployerAllowancePage(driver);
	     xml1.clickEps();

	    _5438_EmployerAllowancesDisable_Page.VerifyData verify= new  _5438_EmployerAllowancesDisable_Page.VerifyData(driver);
		verify.getXMLData();

		verify.verifyEPSCisTag(data[10]);

		payroll.scrollClickPayrollDashboard();
		payroll.Undo_LastPayroll();
		
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		company.Click_AllowancesSchemes();

		company.clickNoEmployementAllownaces();
		payroll.Click_PayrollDashboard();
		report.clickTaxPayment();
 	   
 		cis.clickCisSufferd();
		cis.enterAprilCIS(data[7]);
		cis.saveCIS();
        verify.assertAll();
    
}	
}
