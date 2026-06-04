package UITestAgentPage;
import org.testng.annotations.Test;
import tests.TestBase;
import utilities.ExcelData;


public class TC005_SubmitPensionContribution extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	@Test(priority=1)

	public void TC01validateSubmitPensionContribution() throws Exception {

		String loc = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UI\\" + "\\";
		String locofDiff = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiffSacreenShot\\" + "\\";
		String locofDiff2 = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiff2\\" + "\\";
	
		sTestCaseID = "TC005";
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
		agentpage.clickSubmitPensionCotribution();

		UITestPage.UIPage ui = new UITestPage.UIPage(driver);
		
	//	ui.TakeScreenShot("SubmitPensionCotribution.png");
		ui.TakeScreenShotForVerify();
		ui.verifyScreenShot(loc + "SubmitPensionCotribution.png", locofDiff + "SubmitPensionCotribution_PageDiff.png");
		ui.verifySS(loc + "SubmitPensionCotribution.png", locofDiff2 + "SubmitPensionCotribution_PageDiff.png");
        ui.assertAll();
}

	
	@Test(priority=2)

	public void TC02validateSubmit() throws Exception {

		String loc = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UI\\" + "\\";
		String locofDiff = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiffSacreenShot\\" + "\\";
		String locofDiff2 = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiff2\\" + "\\";
	
		sTestCaseID = "TC005";
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
		agentpage.clickSubmitPensionCotribution();

		UITestPage.UIPage ui = new UITestPage.UIPage(driver);
		
	//	ui.TakeScreenShot("SubmitPensionCotribution_Submit.png");
		ui.TakeScreenShotForVerify();
		ui.verifyScreenShot(loc + "SubmitPensionCotribution_Submit.png", locofDiff + "SubmitPensionCotribution_Submit_PageDiff.png");
		ui.verifySS(loc + "SubmitPensionCotribution_Submit.png", locofDiff2 + "SubmitPensionCotribution_Submit_PageDiff.png");
        ui.assertAll();
}

	
	@Test(priority=3)

	public void TC03validateNotToSubmit() throws Exception {

		String loc = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UI\\" + "\\";
		String locofDiff = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiffSacreenShot\\" + "\\";
		String locofDiff2 = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiff2\\" + "\\";
	
		sTestCaseID = "TC005";
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
		
		agentpage.clickSubmitPensionCotribution();

		agentpage.clickSubmitPensionCotributionNotToSubmit();
		
		driver.switchTo().alert().accept();
		Thread.sleep(3000);

		UITestPage.UIPage ui = new UITestPage.UIPage(driver);
		
	//	ui.TakeScreenShot("SubmitPensionCotribution_NotToSubmit.png");
		ui.TakeScreenShotForVerify();
		ui.verifyScreenShot(loc + "SubmitPensionCotribution_NotToSubmit.png", locofDiff + "SubmitPensionCotribution_NotToSubmit_PageDiff.png");
		ui.verifySS(loc + "SubmitPensionCotribution_NotToSubmit.png", locofDiff2 + "SubmitPensionCotribution_NotToSubmit_PageDiff.png");
        ui.assertAll();
}


	
	@Test(priority=4)

	public void TC04validateAssign() throws Exception {

		String loc = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UI\\" + "\\";
		String locofDiff = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiffSacreenShot\\" + "\\";
		String locofDiff2 = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiff2\\" + "\\";
	
		sTestCaseID = "TC005";
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
		agentpage.clickSubmitPensionCotribution();

		agentpage.clickSubmitPensionCotributionAssign();

		UITestPage.UIPage ui = new UITestPage.UIPage(driver);
		
		//ui.TakeScreenShot("SubmitPensionCotribution_Assign.png");
		ui.TakeScreenShotForVerify();
		ui.verifyScreenShot(loc + "SubmitPensionCotribution_Assign.png", locofDiff + "SubmitPensionCotribution_Assign_PageDiff.png");
		ui.verifySS(loc + "SubmitPensionCotribution_Assign.png", locofDiff2 + "SubmitPensionCotribution_Assign_PageDiff.png");
        ui.assertAll();
}
	
	
	

	@Test(priority=5)

	public void TC05validateNotStarted() throws Exception {

		String loc = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UI\\" + "\\";
		String locofDiff = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiffSacreenShot\\" + "\\";
		String locofDiff2 = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiff2\\" + "\\";
	
		sTestCaseID = "TC005";
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
		agentpage.clickSubmitPensionCotribution();

		agentpage.clickSubmitPensionCotributionNotStarted();

		UITestPage.UIPage ui = new UITestPage.UIPage(driver);
		
	//	ui.TakeScreenShot("SubmitPensionCotribution_NotStarted.png");
		ui.TakeScreenShotForVerify();
		ui.verifyScreenShot(loc + "SubmitPensionCotribution_NotStarted.png", locofDiff + "SubmitPensionCotribution_NotStarted_PageDiff.png");
		ui.verifySS(loc + "SubmitPensionCotribution_NotStarted.png", locofDiff2 + "SubmitPensionCotribution_NotStarted_PageDiff.png");
        ui.assertAll();
}
	
	

	@Test(priority=6)

	public void TC06validateInlineDropDown() throws Exception {

		String loc = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UI\\" + "\\";
		String locofDiff = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiffSacreenShot\\" + "\\";
		String locofDiff2 = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiff2\\" + "\\";
	
		sTestCaseID = "TC005";
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
		agentpage.clickSubmitPensionCotribution();

		agentpage.clickSubmitPensionCotributionInlineDropdown();

		UITestPage.UIPage ui = new UITestPage.UIPage(driver);
		
	//	ui.TakeScreenShot("SubmitPensionCotribution_InlineDropdown.png");
		ui.TakeScreenShotForVerify();
		ui.verifyScreenShot(loc + "SubmitPensionCotribution_InlineDropdown.png", locofDiff + "SubmitPensionCotribution_InlineDropdown_PageDiff.png");
		ui.verifySS(loc + "SubmitPensionCotribution_InlineDropdown.png", locofDiff2 + "SubmitPensionCotribution_InlineDropdown_PageDiff.png");
        ui.assertAll();
}
	
	
	@Test(priority=7)

	public void TC07validateInlinexml() throws Exception {

		String loc = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UI\\" + "\\";
		String locofDiff = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiffSacreenShot\\" + "\\";
		String locofDiff2 = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiff2\\" + "\\";
	
		sTestCaseID = "TC005";
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
		agentpage.clickSubmitPensionCotribution();

		agentpage.clickSubmitPensionCotributionInlineDropdown();
		agentpage.clickSubmitPensionCotributionxml();
		UITestPage.UIPage ui = new UITestPage.UIPage(driver);
		
	//	ui.TakeScreenShot("SubmitPensionCotribution_Xml.png");
		ui.TakeScreenShotForVerify();
		ui.verifyScreenShot(loc + "SubmitPensionCotribution_Xml.png", locofDiff + "SubmitPensionCotribution_Xml_PageDiff.png");
		ui.verifySS(loc + "SubmitPensionCotribution_Xml.png", locofDiff2 + "SubmitPensionCotribution_Xml_PageDiff.png");
        ui.assertAll();
}
	
	
	@Test(priority=8)

	public void TC08validateInlineEdit() throws Exception {

		String loc = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UI\\" + "\\";
		String locofDiff = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiffSacreenShot\\" + "\\";
		String locofDiff2 = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiff2\\" + "\\";
	
		sTestCaseID = "TC005";
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
		agentpage.clickSubmitPensionCotribution();

		agentpage.clickSubmitPensionCotributionInlineDropdown();
		
		agentpage.clickSubmitPensionCotributionEdit();
		UITestPage.UIPage ui = new UITestPage.UIPage(driver);
		
	//	ui.TakeScreenShot("SubmitPensionCotribution_Edit.png");
		ui.TakeScreenShotForVerify();
		ui.verifyScreenShot(loc + "SubmitPensionCotribution_Edit.png", locofDiff + "SubmitPensionCotribution_Edit_PageDiff.png");
		ui.verifySS(loc + "SubmitPensionCotribution_Edit.png", locofDiff2 + "SubmitPensionCotribution_Edit_PageDiff.png");
        ui.assertAll();
}
	
	
	
	@Test(priority=9)

	public void TC09validateSendEmail() throws Exception {

		String loc = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UI\\" + "\\";
		String locofDiff = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiffSacreenShot\\" + "\\";
		String locofDiff2 = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiff2\\" + "\\";
	
		sTestCaseID = "TC005";
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
		agentpage.clickSubmitPensionCotribution();
		agentpage.selectSubmitPensionCotributionCompany();


		agentpage.ClickSubmitPensionCotributionSendEmail();
		
		UITestPage.UIPage ui = new UITestPage.UIPage(driver);

	//	ui.TakeScreenShot("SubmitPensionCotribution_SendEmail.png");
		ui.TakeScreenShotForVerify();
		ui.verifyScreenShot(loc + "SubmitPensionCotribution_SendEmail.png", locofDiff + "SubmitPensionCotribution_SendEmail__PageDiff.png");
		ui.verifySS(loc + "SubmitPensionCotribution_SendEmail.png", locofDiff2 + "SubmitPensionCotribution_SendEmail_PageDiff.png");
        ui.assertAll();
}
	
	
}
