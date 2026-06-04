package UITestAgentPage;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC003_SubmitRti extends TestBase {

	
	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void TC01validateSubmitRti() throws Exception {

		String loc = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UI\\" + "\\";
		String locofDiff = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiffSacreenShot\\" + "\\";
		String locofDiff2 = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiff2\\" + "\\";
	
		sTestCaseID = "TC003";
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
		agentpage.clicKSubmitRti();

		UITestPage.UIPage ui = new UITestPage.UIPage(driver);
	//	ui.TakeScreenShot("SubmitRti.png");
		ui.TakeScreenShotForVerify();
		ui.verifyScreenShot(loc + "SubmitRti.png", locofDiff + "SubmitRti_PageDiff.png");
		ui.verifySS(loc + "SubmitRti.png", locofDiff2 + "SubmitRti_PageDiff.png");
        ui.assertAll();
}
	
	
	@Test(priority=2)

	public void TC02validateUndoPayroll() throws Exception {

		String loc = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UI\\" + "\\";
		String locofDiff = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiffSacreenShot\\" + "\\";
		String locofDiff2 = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiff2\\" + "\\";
	
		sTestCaseID = "TC003";
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
		agentpage.clicKSubmitRti();
		agentpage.clicKUndoPayroll();
		UITestPage.UIPage ui = new UITestPage.UIPage(driver);

	//	ui.TakeScreenShot("SubmitRti_UndoPayroll.png");
		ui.TakeScreenShotForVerify();
		ui.verifyScreenShot(loc + "SubmitRti_UndoPayroll.png", locofDiff + "SubmitRti_UndoPayroll_PageDiff.png");
		ui.verifySS(loc + "SubmitRti_UndoPayroll.png", locofDiff2 + "SubmitRti_UndoPayroll_PageDiff.png");
        ui.assertAll();
}
	

	

	@Test(priority=3)

	public void TC03validateFPS() throws Exception {

		String loc = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UI\\" + "\\";
		String locofDiff = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiffSacreenShot\\" + "\\";
		String locofDiff2 = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiff2\\" + "\\";
	
		sTestCaseID = "TC003";
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
		agentpage.clicKSubmitRti();
		agentpage.clickFPS();
		
		UITestPage.UIPage ui = new UITestPage.UIPage(driver);

		//ui.TakeScreenShot("SubmitRti_FPS.png");
		ui.TakeScreenShotForVerify();
		ui.verifyScreenShot(loc + "SubmitRti_FPS.png", locofDiff + "SubmitRti_FPS_PageDiff.png");
		ui.verifySS(loc + "SubmitRti_FPS.png", locofDiff2 + "SubmitRti_FPS_PageDiff.png");
        ui.assertAll();
}

	@Test(priority=4)

	public void TC04validateEPS() throws Exception {

		String loc = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UI\\" + "\\";
		String locofDiff = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiffSacreenShot\\" + "\\";
		String locofDiff2 = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiff2\\" + "\\";
	
		sTestCaseID = "TC003";
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
		agentpage.clicKSubmitRti();
		agentpage.clickEPS();
		
		UITestPage.UIPage ui = new UITestPage.UIPage(driver);
	//  ui.TakeScreenShot("SubmitRti_EPS.png");
		ui.TakeScreenShotForVerify();
		ui.verifyScreenShot(loc + "SubmitRti_EPS.png", locofDiff + "SubmitRti_EPS_PageDiff.png");
		ui.verifySS(loc + "SubmitRti_EPS.png", locofDiff2 + "SubmitRti_EPS_PageDiff.png");
        ui.assertAll();
}
	
	

	@Test(priority=5)

	public void TC05validateInlineDropDown() throws Exception {

		String loc = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UI\\" + "\\";
		String locofDiff = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiffSacreenShot\\" + "\\";
		String locofDiff2 = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiff2\\" + "\\";
	
		sTestCaseID = "TC003";
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
		agentpage.clicKSubmitRti();
		agentpage.clickInlineDropDown();
		
		UITestPage.UIPage ui = new UITestPage.UIPage(driver);
//	    ui.TakeScreenShot("SubmitRti_InlineDrop.png");
		ui.TakeScreenShotForVerify();
		ui.verifyScreenShot(loc + "SubmitRti_InlineDrop.png", locofDiff + "SubmitRti_InlineDrop_PageDiff.png");
		ui.verifySS(loc + "SubmitRti_InlineDrop.png", locofDiff2 + "SubmitRti_InlineDrop_PageDiff.png");
        ui.assertAll();
}

	

	@Test(priority=6)

	public void TC06validateSubmitHmrc() throws Exception {

		String loc = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UI\\" + "\\";
		String locofDiff = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiffSacreenShot\\" + "\\";
		String locofDiff2 = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiff2\\" + "\\";
	
		sTestCaseID = "TC003";
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
		agentpage.clicKSubmitRti();
		agentpage.clickValidateSubmitHmrc();
		
		UITestPage.UIPage ui = new UITestPage.UIPage(driver);
	 //   ui.TakeScreenShot("SubmitRti_SubmitHmrc.png");
		ui.TakeScreenShotForVerify();
		ui.verifyScreenShot(loc + "SubmitRti_SubmitHmrc.png", locofDiff + "SubmitRti_SubmitHmrc_PageDiff.png");
		ui.verifySS(loc + "SubmitRti_SubmitHmrc.png", locofDiff2 + "SubmitRti_SubmitHmrc_PageDiff.png");
        ui.assertAll();
}

	@Test(priority=7)

	public void TC07validateNotToSubmit() throws Exception {

		String loc = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UI\\" + "\\";
		String locofDiff = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiffSacreenShot\\" + "\\";
		String locofDiff2 = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiff2\\" + "\\";
	
		sTestCaseID = "TC003";
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
		agentpage.clicKSubmitRti();
		agentpage.clickNotToSubmit();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
	 	UITestPage.UIPage ui = new UITestPage.UIPage(driver);
	//    ui.TakeScreenShot("SubmitRti_NotToSubmit.png");
	 	ui.TakeScreenShotForVerify();
		ui.verifyScreenShot(loc + "SubmitRti_NotToSubmit.png", locofDiff + "SubmitRti_NotToSubmit_PageDiff.png");
		ui.verifySS(loc + "SubmitRti_NotToSubmit.png", locofDiff2 + "SubmitRti_NotToSubmit_PageDiff.png");
        ui.assertAll();
}

	
	@Test(priority=8)

	public void TC08validatePending() throws Exception {

		String loc = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UI\\" + "\\";
		String locofDiff = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiffSacreenShot\\" + "\\";
		String locofDiff2 = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiff2\\" + "\\";
	
		sTestCaseID = "TC003";
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
		agentpage.clicKSubmitRti();
		agentpage.clickPending();
	
	 	UITestPage.UIPage ui = new UITestPage.UIPage(driver);
	//   ui.TakeScreenShot("SubmitRti_Pending.png");
	 	ui.TakeScreenShotForVerify();
		ui.verifyScreenShot(loc + "SubmitRti_Pending.png", locofDiff + "SubmitRti_Pending_PageDiff.png");
		ui.verifySS(loc + "SubmitRti_Pending.png", locofDiff2 + "SubmitRti_Pending_PageDiff.png");
        ui.assertAll();
}
	
	
	@Test(priority=9)

	public void TC09validateSendEmail() throws Exception {

		String loc = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UI\\" + "\\";
		String locofDiff = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiffSacreenShot\\" + "\\";
		String locofDiff2 = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiff2\\" + "\\";
	
		sTestCaseID = "TC003";
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
		agentpage.clicKSubmitRti();
		agentpage.clickSubmitRtiCheckBox();
		agentpage.clickSendEmailSubmitRti();
		
	 	UITestPage.UIPage ui = new UITestPage.UIPage(driver);
//	    ui.TakeScreenShot("SubmitRti_SendEmail.png");
	 	ui.TakeScreenShotForVerify();
		ui.verifyScreenShot(loc + "SubmitRti_SendEmail.png", locofDiff + "SubmitRti_SendEmail_PageDiff.png");
		ui.verifySS(loc + "SubmitRti_SendEmail.png", locofDiff2 + "SubmitRti_SendEmail.png");
        ui.assertAll();
}

}
