package ProductionIssueTest;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC008_RunPayrollAgentLevel extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void validateViewIcnWorkingFine() throws Exception {

		sTestCaseID = "TC008";
		Sheet = "Sheet7";
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

		agentpage.clickPayroll();
		agentpage.clickRunPayroll();
		ProductionIssuePage.ProductionPage page = new ProductionIssuePage.ProductionPage(driver);
        page.clickviewIcn();
		ProductionIssuePage.VerifyResult verify= new ProductionIssuePage.VerifyResult(driver);
		verify.verifyViewIcnWorkingFine(data[4]);
		verify.assertAll();
}
	
	
	@Test(priority=2)

	public void validateEditIcnWorkingFine() throws Exception {

		sTestCaseID = "TC008";
		Sheet = "Sheet7";
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

		agentpage.clickPayroll();
		agentpage.clickRunPayroll();
		ProductionIssuePage.ProductionPage page = new ProductionIssuePage.ProductionPage(driver);
        page.clickEditIcn();
		ProductionIssuePage.VerifyResult verify= new ProductionIssuePage.VerifyResult(driver);
		verify.verifyEditIcnWorkingFine(data[5]);
		verify.assertAll();
}


	
	@Test(priority=3)
	
	public void validateViewAndEditIcnWorkingFine() throws Exception {

		sTestCaseID = "TC008";
		Sheet = "Sheet7";
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

		agentpage.clickPayroll();
		agentpage.clickRunPayroll();
		ProductionIssuePage.ProductionPage page = new ProductionIssuePage.ProductionPage(driver);
        page.clickViewandEditIcn();
		ProductionIssuePage.VerifyResult verify= new ProductionIssuePage.VerifyResult(driver);
		verify.verifyViewAndEditIcnWorkingFine(data[6]);
		verify.assertAll();
}
	
	

	@Test(priority=4)
	
	public void validateInlineDropdown() throws Exception {

		sTestCaseID = "TC008";
		Sheet = "Sheet7";
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

		agentpage.clickPayroll();
		agentpage.clickRunPayroll();
		ProductionIssuePage.ProductionPage page = new ProductionIssuePage.ProductionPage(driver);
        page.click3Dots();
        page.clickEdit();
		ProductionIssuePage.VerifyResult verify= new ProductionIssuePage.VerifyResult(driver);
		verify.verifyEditIcnWorkingFine(data[5]);
//		utilities.ChangeWindow.Switchwindow(1, driver);
//		page.click3Dots();
//	    page.clickViewAndEdit();
//	    verify.verifyViewAndEditIcnWorkingFine(data[6]);
//		utilities.ChangeWindow.Switchwindow(1, driver);
//		page.click3Dots();
//	    page.clickOpen();
//		verify.verifyViewIcnWorkingFine(data[4]);
		verify.assertAll();
}

	
    @Test(priority=5)
	public void validateXML() throws Exception {

		sTestCaseID = "TC008";
		Sheet = "Sheet7";
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

		agentpage.clickPayroll();
		agentpage.clickRunPayroll();
		ProductionIssuePage.ProductionPage page = new ProductionIssuePage.ProductionPage(driver);
        page.clickcheckBox1();
        page.clickRunPayrollBtn();
        page.clickRunPayrollBtn1();
   
        agentpage.clickPensionSubmitBtn();
        page.click3Dots1();
        page.clickXml();
        _2154EmployeeOpeningBalance_Page.FillingManagement xml= new _2154EmployeeOpeningBalance_Page.FillingManagement(driver);
	    xml.getXMLDataRunPayrollPage();
	    xml.verifyxmlRunPayroll(data[7]);
        
		ProductionIssuePage.VerifyResult verify= new ProductionIssuePage.VerifyResult(driver);
		verify.assertAll();
}
    
    
    @Test(priority=6)
  	public void validateAccountManager() throws Exception {

  		sTestCaseID = "TC008";
  		Sheet = "Sheet7";
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

  	
  		ProductionIssuePage.ProductionPage page = new ProductionIssuePage.ProductionPage(driver);
         
		agentpage.clickPayroll();
		agentpage.clickRunPayroll();
		agentpage.clickPensionSubmitBtn();
		page.selectAccountManger(data[8]);
		page.clickUpdateBtn();
		_2154EmployeeOpeningBalance_Page.FillingManagement xml = new _2154EmployeeOpeningBalance_Page.FillingManagement(driver);

  		ProductionIssuePage.VerifyResult verify= new ProductionIssuePage.VerifyResult(driver);
  		
  		verify.verifyFilter(data[8]);
  		verify.assertAll();
  }
    
    
    
    @Test(priority=7)
  	public void validateCompanyFilter() throws Exception {

  		sTestCaseID = "TC008";
  		Sheet = "Sheet7";
  		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

  		pages.loginpage4  loginpage = new pages.loginpage4(driver);
  		loginpage.GoToUrl();	
  		loginpage.AssertUrl();
  		loginpage.Enter_EnterUsername(data[1]);
  		loginpage.Enter_Enterpassword(data[2]);
  		loginpage.Click_LoginButton();
  		pages.agentpage agentpage = new pages.agentpage(driver);
  		agentpage.Enter_SearchAgentName(data[10]);
  		agentpage.Click_ClickSearch();
  		agentpage.Click_ClickAgent();

  	
  		ProductionIssuePage.ProductionPage page = new ProductionIssuePage.ProductionPage(driver);
         
		agentpage.clickPayroll();
		agentpage.clickRunPayroll();
		agentpage.clickPensionSubmitBtn();
		page.enterCompanyName(data[9]);
		page.clickUpdateBtn();
		_2154EmployeeOpeningBalance_Page.FillingManagement xml = new _2154EmployeeOpeningBalance_Page.FillingManagement(driver);

  		ProductionIssuePage.VerifyResult verify= new ProductionIssuePage.VerifyResult(driver);
  		
  		verify.verifyFilter1(data[9]);
  		verify.assertAll();
  }
    
    
    @Test(priority=8)
   	public void validateStatusFilter() throws Exception {

   		sTestCaseID = "TC008";
   		Sheet = "Sheet7";
   		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

   		pages.loginpage4  loginpage = new pages.loginpage4(driver);
   		loginpage.GoToUrl();	
   		loginpage.AssertUrl();
   		loginpage.Enter_EnterUsername(data[1]);
   		loginpage.Enter_Enterpassword(data[2]);
   		loginpage.Click_LoginButton();
   		pages.agentpage agentpage = new pages.agentpage(driver);
   		agentpage.Enter_SearchAgentName(data[10]);
   		agentpage.Click_ClickSearch();
   		agentpage.Click_ClickAgent();

   	
   		ProductionIssuePage.ProductionPage page = new ProductionIssuePage.ProductionPage(driver);
          
 		agentpage.clickPayroll();
 	
 		agentpage.clickPensionSubmitBtn();
 		page.selectStatusFilter(data[11]);
 		page.clickUpdateBtn();
 		_2154EmployeeOpeningBalance_Page.FillingManagement xml = new _2154EmployeeOpeningBalance_Page.FillingManagement(driver);

   		ProductionIssuePage.VerifyResult verify= new ProductionIssuePage.VerifyResult(driver);
   		
   		verify.verifyStatusFilter(data[12]);
   		page.selectStatusFilter(data[13]);
   		page.clickUpdateBtn();
 		page.selectStatusFilter(data[13]);

   		verify.assertAll();
   }
    
    
    
    
    @Test(priority=9)
   	public void validateSubmitNotSubmitBtn() throws Exception {

   		sTestCaseID = "TC008";
   		Sheet = "Sheet7";
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

   	
   		ProductionIssuePage.ProductionPage page = new ProductionIssuePage.ProductionPage(driver);
          
 		agentpage.clickPayroll();
 		agentpage.clickPensionSubmitBtn();
 	
 	

   		ProductionIssuePage.VerifyResult verify= new ProductionIssuePage.VerifyResult(driver);
   		
   		page.clickSubmitBtn();
   		verify.verifySubmitAlert();
   		page.enterTextNotes(data[14]);
   		page.clickNotToSubmitBtn();
   		verify.verifyNotSubmitAlert();


   		verify.assertAll();
   }
    
    @Test(priority=10)
   	public void validateRunPayroll() throws Exception {

   		sTestCaseID = "TC008";
   		Sheet = "Sheet7";
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

   	
   		ProductionIssuePage.ProductionPage page = new ProductionIssuePage.ProductionPage(driver);
          
 		agentpage.clickPayroll();
 		agentpage.clickRunPayroll();
 	
   		ProductionIssuePage.VerifyResult verify= new ProductionIssuePage.VerifyResult(driver);
		page.clickcheckBox1();
		page.clickRunPayrollBtn();
		page.clickRunPayrollBtn2();
 
   		verify.verifyRunPayroll();
   		

   		verify.assertAll();
   }
    
    
    @Test(priority=11)
   	public void validateSendEmailWorkingFine() throws Exception {

   		sTestCaseID = "TC008";
   		Sheet = "Sheet7";
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

   	
   		ProductionIssuePage.ProductionPage page = new ProductionIssuePage.ProductionPage(driver);
          
 		agentpage.clickPayroll();
 		agentpage.clickRunPayroll();
 	
   		ProductionIssuePage.VerifyResult verify= new ProductionIssuePage.VerifyResult(driver);
		page.clickcheckBox1();
		
		page.clickEmailBtn();
		page.Click_SendBtn();
		
   		verify.verifySendEmaill();
   		

   		verify.assertAll();
   }
    
	@Test(priority=12)

	public void validateViewIcnWorkingFineOnSubmitRti() throws Exception {

		sTestCaseID = "TC008";
		Sheet = "Sheet7";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4  loginpage = new pages.loginpage4(driver);
		loginpage.GoToUrl();	
		loginpage.AssertUrl();
		loginpage.Enter_EnterUsername(data[1]);
		loginpage.Enter_Enterpassword(data[2]);
		loginpage.Click_LoginButton();
		pages.agentpage agentpage = new pages.agentpage(driver);
		agentpage.Enter_SearchAgentName(data[10]);
		agentpage.Click_ClickSearch();
		agentpage.Click_ClickAgent();

		agentpage.clickPayroll();
		agentpage.clickSubmitRtiBtn();
		ProductionIssuePage.ProductionPage page = new ProductionIssuePage.ProductionPage(driver);
        page.clickviewIcn1();
		ProductionIssuePage.VerifyResult verify= new ProductionIssuePage.VerifyResult(driver);
		verify.verifyViewIcnWorkingFine(data[4]);
		verify.assertAll();
}
	
	

	@Test(priority=13)

	public void validateEditIcnWorkingFineOnSubmitRti() throws Exception {

		sTestCaseID = "TC008";
		Sheet = "Sheet7";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4  loginpage = new pages.loginpage4(driver);
		loginpage.GoToUrl();	
		loginpage.AssertUrl();
		loginpage.Enter_EnterUsername(data[1]);
		loginpage.Enter_Enterpassword(data[2]);
		loginpage.Click_LoginButton();
		pages.agentpage agentpage = new pages.agentpage(driver);
		agentpage.Enter_SearchAgentName(data[10]);
		agentpage.Click_ClickSearch();
		agentpage.Click_ClickAgent();

		agentpage.clickPayroll();
		agentpage.clickSubmitRtiBtn();
		ProductionIssuePage.ProductionPage page = new ProductionIssuePage.ProductionPage(driver);
        page.clickEditIcn1();
		ProductionIssuePage.VerifyResult verify= new ProductionIssuePage.VerifyResult(driver);
		verify.verifyEditIcnWorkingFine(data[6]);
		verify.assertAll();
}
	
	

	@Test(priority=14)
	
	public void validateInlineDropdownOnSubmitBtn() throws Exception {

		sTestCaseID = "TC008";
		Sheet = "Sheet7";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4  loginpage = new pages.loginpage4(driver);
		loginpage.GoToUrl();	
		loginpage.AssertUrl();
		loginpage.Enter_EnterUsername(data[1]);
		loginpage.Enter_Enterpassword(data[2]);
		loginpage.Click_LoginButton();
		pages.agentpage agentpage = new pages.agentpage(driver);
		agentpage.Enter_SearchAgentName(data[10]);
		agentpage.Click_ClickSearch();
		agentpage.Click_ClickAgent();

		agentpage.clickPayroll();
		agentpage.clickSubmitRtiBtn();
		ProductionIssuePage.ProductionPage page = new ProductionIssuePage.ProductionPage(driver);
        page.click3Dots2();
        page.clickEdit1();
		ProductionIssuePage.VerifyResult verify= new ProductionIssuePage.VerifyResult(driver);
		verify.verifyEditIcnWorkingFine(data[15]);
//		utilities.ChangeWindow.Switchwindow(1, driver);
//		page.click3Dots();
//	    page.clickViewAndEdit();
//	    verify.verifyViewAndEditIcnWorkingFine(data[6]);
//		utilities.ChangeWindow.Switchwindow(1, driver);
//		page.click3Dots();
//	    page.clickOpen();
//		verify.verifyViewIcnWorkingFine(data[4]);
		verify.assertAll();
}
	
	
	
	 @Test(priority=15)
	   	public void validateRunPayrollFilterEmoloyees() throws Exception {

	   		sTestCaseID = "TC008";
	   		Sheet = "Sheet7";
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

	   	
	   		ProductionIssuePage.ProductionPage page = new ProductionIssuePage.ProductionPage(driver);
	          
	 		agentpage.clickPayroll();
	 		agentpage.clickRunPayroll();
	 	
	   		ProductionIssuePage.VerifyResult verify= new ProductionIssuePage.VerifyResult(driver);
			page.clickcheckBox1();
			page.clickRunPayrollBtn();
			
			page.selectRunPayrollFilter(data[16]);
			page.clickRunPayrollBtn2();
	   		verify.verifyRunPayrollFilter(data[19]);
	   		

	   		verify.assertAll();
	   }
	    
	 
	 
	   @Test(priority=16)
	   	public void validateRunPayrollFilterEmoloyer() throws Exception {

	   		sTestCaseID = "TC008";
	   		Sheet = "Sheet7";
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

	   	
	   		ProductionIssuePage.ProductionPage page = new ProductionIssuePage.ProductionPage(driver);
	          
	 		agentpage.clickPayroll();
	 		agentpage.clickRunPayroll();
	 	
	   		ProductionIssuePage.VerifyResult verify= new ProductionIssuePage.VerifyResult(driver);
			page.clickcheckBox1();
			page.clickRunPayrollBtn();
			
			page.selectRunPayrollFilter(data[17]);
			page.clickRunPayrollBtn2();
	   		verify.verifyRunPayrollFilter(data[20]);
	   		
	   		verify.assertAll();
	   }
	   
	   
	   
	   @Test(priority=17)
	   	public void validateRunPayrollFilterBoth() throws Exception {

	   		sTestCaseID = "TC008";
	   		Sheet = "Sheet7";
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

	   	
	   		ProductionIssuePage.ProductionPage page = new ProductionIssuePage.ProductionPage(driver);
	          
	 		agentpage.clickPayroll();
	 		agentpage.clickRunPayroll();
	 	
	   		ProductionIssuePage.VerifyResult verify= new ProductionIssuePage.VerifyResult(driver);
			page.clickcheckBox1();
			page.clickRunPayrollBtn();
			
			page.selectRunPayrollFilter(data[18]);
			page.clickRunPayrollBtn2();
	   		verify.verifyRunPayrollFilter(data[21]);
	   		
	   		verify.assertAll();
	   }
	   
	   
	   
	   @Test(priority=18)
	   	public void validateAlertRunPayrollWithoutSelectClient() throws Exception {

	   		sTestCaseID = "TC008";
	   		Sheet = "Sheet7";
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

	   	
	   		ProductionIssuePage.ProductionPage page = new ProductionIssuePage.ProductionPage(driver);
	          
	 		agentpage.clickPayroll();
	 		agentpage.clickRunPayroll();
	 	
	   		ProductionIssuePage.VerifyResult verify= new ProductionIssuePage.VerifyResult(driver);
			
			page.clickRunPayrollBtn();
			
	   		verify.verifyRunPayrollWarning();
	   		
	   		verify.assertAll();
	   }
	
	   
	   
	   @Test(priority=19)
	   	public void validateSubmitPensionContribution() throws Exception {

	   		sTestCaseID = "TC008";
	   		Sheet = "Sheet7";
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

	   		ProductionIssuePage.ProductionPage page = new ProductionIssuePage.ProductionPage(driver);
	          
	 		agentpage.clickPayroll();
	 		agentpage.clickPensionSubmitBtn();
	
	   		ProductionIssuePage.VerifyResult verify= new ProductionIssuePage.VerifyResult(driver);
			
	   		verify.verifySubmitPensionContribution();
	
	   		verify.assertAll();
	   }

	   
	   
	   @Test(priority=20)
	   	public void validateUndoLastPayrollOnAgentLevel() throws Exception {

	   		sTestCaseID = "TC008";
	   		Sheet = "Sheet7";
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

	   		ProductionIssuePage.ProductionPage page = new ProductionIssuePage.ProductionPage(driver);
	          
	 		agentpage.clickPayroll();
	 		agentpage.clickSubmitRtiBtn();
	
	 		page.clickUndoPayroll();
	   		ProductionIssuePage.VerifyResult verify= new ProductionIssuePage.VerifyResult(driver);
			
	   		verify.verifyUndoLastPayroll();
	
	   		verify.assertAll();
	   }
}
