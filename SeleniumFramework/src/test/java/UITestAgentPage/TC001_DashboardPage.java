package UITestAgentPage;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC001_DashboardPage extends TestBase {
	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;


	@Test(priority=1)

	public void TC01validateAgentDashboard() throws Exception {

		String loc = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UI\\" + "\\";
		String locofDiff = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiffSacreenShot\\" + "\\";
		String locofDiff2 = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiff2\\" + "\\";
	
		
		sTestCaseID = "TC001";
		Sheet = "VisualTest";
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

		agentpage.clickAgentDashboard();
		UITestPage.UIPage ui = new UITestPage.UIPage(driver);

	//	ui.TakeScreenShot("AgentDashboard.png");
		ui.TakeScreenShotForVerify();
		ui.verifyScreenShot(loc + "AgentDashboard.png", locofDiff + "AgentDashboard_PageDiff.png");
		ui.verifySS(loc + "AgentDashboard.png", locofDiff2 + "AgentDashboard_PageDiff.png");
		

		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");   

//		ui.TakeScreenShot("AgentDashboard1.png");
		ui.TakeScreenShotForVerify();
		ui.verifyScreenShot(loc + "AgentDashboard1.png", locofDiff + "AgentDashboard1_PageDiff.png");
		ui.verifySS(loc + "AgentDashboard1.png", locofDiff2 + "AgentDashboard1_PageDiff.png");
			
        ui.assertAll();
		
		
}
	
	@Test(priority=2)

	public void TC02validateImportCompany() throws Exception {

		String loc = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UI\\" + "\\";
		String locofDiff = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiffSacreenShot\\" + "\\";
		String locofDiff2 = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiff2\\" + "\\";
	
		
		sTestCaseID = "TC001";
		Sheet = "VisualTest";
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
		agentpage.clickAgentDashboard();
		agentpage.clickImportCompany();
		UITestPage.UIPage ui = new UITestPage.UIPage(driver);

	//    ui.TakeScreenShot("AgentDashboard_ImportCompanies.png");
		ui.TakeScreenShotForVerify();
		ui.verifyScreenShot(loc + "AgentDashboard_ImportCompanies.png", locofDiff + "AgentDashboard_ImportCompanies_PageDiff.png");
		ui.verifySS(loc + "AgentDashboard_ImportCompanies.png", locofDiff2 + "AgentDashboard_ImportCompanies_PageDiff.png");

        ui.assertAll();
		
		
}
	
	
	@Test(priority=3)

	public void TC03validateImportEmployees() throws Exception {

		String loc = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UI\\" + "\\";
		String locofDiff = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiffSacreenShot\\" + "\\";
		String locofDiff2 = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiff2\\" + "\\";
	
		
		sTestCaseID = "TC001";
		Sheet = "VisualTest";
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
		agentpage.clickAgentDashboard();
		agentpage.clickImportEmployee();
		UITestPage.UIPage ui = new UITestPage.UIPage(driver);

	//	ui.TakeScreenShot("AgentDashboard_ImportEmployees.png");
		ui.TakeScreenShotForVerify();
		ui.verifyScreenShot(loc + "AgentDashboard_ImportEmployees.png", locofDiff + "AgentDashboard_ImportEmployees_PageDiff.png");
		ui.verifySS(loc + "AgentDashboard_ImportEmployees.png", locofDiff2 + "AgentDashboard_ImportEmployees_PageDiff.png");

        ui.assertAll();
		
		
}
	
	
	@Test(priority=4)

	public void TC04validateCreateCrmInstance() throws Exception {

		String loc = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UI\\" + "\\";
		String locofDiff = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiffSacreenShot\\" + "\\";
		String locofDiff2 = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiff2\\" + "\\";
		
		sTestCaseID = "TC001";
		Sheet = "VisualTest";
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
		agentpage.clickAgentDashboard();
		agentpage.createCrmInstance();
		UITestPage.UIPage ui = new UITestPage.UIPage(driver);

	// ui.TakeScreenShot("AgentDashboard_CreateCrmInstance.png");
		ui.TakeScreenShotForVerify();
		ui.verifyScreenShot(loc + "AgentDashboard_CreateCrmInstance.png", locofDiff + "AgentDashboard_CreateCrmInstance_PageDiff.png");
		ui.verifySS(loc + "AgentDashboard_CreateCrmInstance.png", locofDiff2 + "AgentDashboard_CreateCrmInstance_PageDiff.png");
        ui.assertAll();
		
}
	
	@Test(priority=5)

	public void TC05validateNewClient() throws Exception {

		String loc = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UI\\" + "\\";
		String locofDiff = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiffSacreenShot\\" + "\\";
		String locofDiff2 = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiff2\\" + "\\";
		
		sTestCaseID = "TC001";
		Sheet = "VisualTest";
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
		agentpage.clickAgentDashboard();
		agentpage.createNewClient();
		UITestPage.UIPage ui = new UITestPage.UIPage(driver);

	  ui.TakeScreenShot("AgentDashboard_NewClient.png");
		ui.TakeScreenShotForVerify();
		ui.verifyScreenShot(loc + "AgentDashboard_NewClient.png", locofDiff + "AgentDashboard_NewClient_PageDiff.png");
		ui.verifySS(loc + "AgentDashboard_NewClient.png", locofDiff2 + "AgentDashboard_NewClient_PageDiff.png");
        ui.assertAll();
		
}
	
	@Test(priority=6)

	public void TC06validateAutoPayrolls() throws Exception {

		String loc = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UI\\" + "\\";
		String locofDiff = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiffSacreenShot\\" + "\\";
		String locofDiff2 = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiff2\\" + "\\";
		
		sTestCaseID = "TC001";
		Sheet = "VisualTest";
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
		agentpage.clickAgentDashboard();
		agentpage.clickAutoPayrolls();
		UITestPage.UIPage ui = new UITestPage.UIPage(driver);

	//    ui.TakeScreenShot("AgentDashboard_AutoPayrolls.png");
		ui.TakeScreenShotForVerify();
		ui.verifyScreenShot(loc + "AgentDashboard_AutoPayrolls.png", locofDiff + "AgentDashboard_AutoPayrolls_PageDiff.png");
		ui.verifySS(loc + "AgentDashboard_AutoPayrolls.png", locofDiff2 + "AgentDashboard_AutoPayrolls_PageDiff.png");
        ui.assertAll();
		
}
	
	@Test(priority=7)

	public void TC07validateManualPayrolls() throws Exception {

		String loc = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UI\\" + "\\";
		String locofDiff = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiffSacreenShot\\" + "\\";
		String locofDiff2 = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiff2\\" + "\\";
		
		sTestCaseID = "TC001";
		Sheet = "VisualTest";
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
		agentpage.clickAgentDashboard();
		agentpage.clickManualPayrolls();
		UITestPage.UIPage ui = new UITestPage.UIPage(driver);

	 //   ui.TakeScreenShot("AgentDashboard_ManualPayrolls.png");
		ui.TakeScreenShotForVerify();
		ui.verifyScreenShot(loc + "AgentDashboard_ManualPayrolls.png", locofDiff + "AgentDashboard_ManualPayrolls_PageDiff.png");
		ui.verifySS(loc + "AgentDashboard_ManualPayrolls.png", locofDiff2 + "AgentDashboard_ManualPayrolls_PageDiff.png");
        ui.assertAll();
		
}
	
	
	@Test(priority=8)

	public void TC08validatePensions() throws Exception {

		String loc = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UI\\" + "\\";
		String locofDiff = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiffSacreenShot\\" + "\\";
		String locofDiff2 = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiff2\\" + "\\";
		
		sTestCaseID = "TC001";
		Sheet = "VisualTest";
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
		agentpage.clickAgentDashboard();
		agentpage.clickPension();
		UITestPage.UIPage ui = new UITestPage.UIPage(driver);

	//    ui.TakeScreenShot("AgentDashboard_Pensions.png");
		ui.TakeScreenShotForVerify();
		ui.verifyScreenShot(loc + "AgentDashboard_Pensions.png", locofDiff + "AgentDashboard_Pensions_PageDiff.png");
		ui.verifySS(loc + "AgentDashboard_Pensions.png", locofDiff2 + "AgentDashboard_Pensions_PageDiff.png");
        ui.assertAll();
		
}
	

	@Test(priority=9)

	public void TC09validateP11D() throws Exception {

		String loc = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UI\\" + "\\";
		String locofDiff = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiffSacreenShot\\" + "\\";
		String locofDiff2 = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiff2\\" + "\\";
		
		sTestCaseID = "TC001";
		Sheet = "VisualTest";
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
		agentpage.clickAgentDashboard();
		agentpage.clickP11D();
		UITestPage.UIPage ui = new UITestPage.UIPage(driver);

   //	  ui.TakeScreenShot("AgentDashboard_P11D.png");
		ui.TakeScreenShotForVerify();
		ui.verifyScreenShot(loc + "AgentDashboard_P11D.png", locofDiff + "AgentDashboard_P11D.png");
		ui.verifySS(loc + "AgentDashboard_P11D.png", locofDiff2 + "AgentDashboard_P11D.png");
        ui.assertAll();
		
}
	
	

	@Test(priority=10)

	public void TC10validateTotalClients() throws Exception {

		String loc = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UI\\" + "\\";
		String locofDiff = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiffSacreenShot\\" + "\\";
		String locofDiff2 = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiff2\\" + "\\";
		
		sTestCaseID = "TC001";
		Sheet = "VisualTest";
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
		agentpage.clickAgentDashboard();
		agentpage.clickTotalClients();
		UITestPage.UIPage ui = new UITestPage.UIPage(driver);

	//  ui.TakeScreenShot("AgentDashboard_TotalClients.png");
		ui.TakeScreenShotForVerify();
		ui.verifyScreenShot(loc + "AgentDashboard_TotalClients.png", locofDiff + "AgentDashboard_TotalClients.png");
		ui.verifySS(loc + "AgentDashboard_TotalClients.png", locofDiff2 + "AgentDashboard_TotalClients.png");
        ui.assertAll();
		
}
}
