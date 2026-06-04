package UITestAgentPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import tests.TestBase;
import utilities.ExcelData;

public class TC002_RunPayrollPage extends TestBase {
	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void TC01validateRunPayroll() throws Exception {

		String loc = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UI\\" + "\\";
		String locofDiff = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiffSacreenShot\\" + "\\";
		String locofDiff2 = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiff2\\" + "\\";
	
		sTestCaseID = "TC002";
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
		agentpage.clickRunPayroll();
		UITestPage.UIPage ui = new UITestPage.UIPage(driver);

	//	ui.TakeScreenShot("RunPayroll.png");
		ui.TakeScreenShotForVerify();
		ui.verifyScreenShot(loc + "RunPayroll.png", locofDiff + "RunPayroll_PageDiff.png");
		ui.verifySS(loc + "RunPayroll.png", locofDiff2 + "RunPayroll_PageDiff.png");
        ui.assertAll();
}
	
	
	@Test(priority=2)
	public void TC02validateRunPayrollAssign() throws Exception {

		String loc = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UI\\" + "\\";
		String locofDiff = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiffSacreenShot\\" + "\\";
		String locofDiff2 = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiff2\\" + "\\";
	
		sTestCaseID = "TC002";
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
		agentpage.clickRunPayroll();
		agentpage.clickAssign();
		UITestPage.UIPage ui = new UITestPage.UIPage(driver);

	//	ui.TakeScreenShot("RunPayroll_Assign.png");
		ui.TakeScreenShotForVerify();
		
		ui.verifyScreenShot(loc + "RunPayroll_Assign.png", locofDiff + "RunPayroll_Assign_PageDiff.png");
		ui.verifySS(loc + "RunPayroll_Assign.png", locofDiff2 + "RunPayroll_Assign_PageDiff.png");

        ui.assertAll();
		
		
}
	
	@Test(priority=3)
	public void TC03validateRunPayrollNotStarted() throws Exception {

		String loc = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UI\\" + "\\";
		String locofDiff = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiffSacreenShot\\" + "\\";
		String locofDiff2 = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiff2\\" + "\\";
	
		sTestCaseID = "TC002";
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
		agentpage.clickRunPayroll();
		agentpage.clickNotStarted();
		UITestPage.UIPage ui = new UITestPage.UIPage(driver);

	//	ui.TakeScreenShot("RunPayroll_NotStarted.png");
		ui.TakeScreenShotForVerify();
		
		ui.verifyScreenShot(loc + "RunPayroll_NotStarted.png", locofDiff + "RunPayroll_NotStarted_PageDiff.png");
		ui.verifySS(loc + "RunPayroll_NotStarted.png", locofDiff2 + "RunPayroll_NotStarted_PageDiff.png");

        ui.assertAll();
		
		
}

	
	@Test(priority=4)
	public void TC04validateRunPayroll2() throws Exception {

		String loc = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UI\\" + "\\";
		String locofDiff = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiffSacreenShot\\" + "\\";
		String locofDiff2 = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiff2\\" + "\\";
	
		sTestCaseID = "TC002";
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
		agentpage.clickRunPayroll();
		agentpage.clickRunPayroll2();
		UITestPage.UIPage ui = new UITestPage.UIPage(driver);

		ui.TakeScreenShot("RunPayroll2.png");
		ui.TakeScreenShotForVerify();
		
		ui.verifyScreenShot(loc + "RunPayroll2.png", locofDiff + "RunPayroll2_PageDiff.png");
		ui.verifySS(loc + "RunPayroll2.png", locofDiff2 + "RunPayroll2_PageDiff.png");
        ui.assertAll();
		
}

	
	@Test(priority=5)
	public void TC05validateRunPayrollSendEmail() throws Exception {

		String loc = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UI\\" + "\\";
		String locofDiff = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiffSacreenShot\\" + "\\";
		String locofDiff2 = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiff2\\" + "\\";
	
		sTestCaseID = "TC002";
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
		agentpage.clickRunPayroll();
		agentpage.clicKCheckBox();
		agentpage.clicKSendEmail();
		UITestPage.UIPage ui = new UITestPage.UIPage(driver);
		
	   //ui.TakeScreenShot("RunPayroll_SendEmail.png");
		ui.TakeScreenShotForVerify();
		
		ui.verifyScreenShot(loc + "RunPayroll_SendEmail.png", locofDiff + "RunPayroll_SendEmail.png");
		ui.verifySS(loc + "RunPayroll_SendEmail.png", locofDiff2 + "RunPayroll_SendEmail.png");
        ui.assertAll();
}
}
