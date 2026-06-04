package UITestAgentPage;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC004_Submit_P11D  extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;

	@Test(priority=1)

	public void TC01validateSubmitP11D() throws Exception {

		String loc = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UI\\" + "\\";
		String locofDiff = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiffSacreenShot\\" + "\\";
		String locofDiff2 = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiff2\\" + "\\";
	
		sTestCaseID = "TC004";
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
		agentpage.clickSubmitP11DBtn();

		UITestPage.UIPage ui = new UITestPage.UIPage(driver);
	//	ui.TakeScreenShot("SubmitP11D.png");
		ui.TakeScreenShotForVerify();
		ui.verifyScreenShot(loc + "SubmitP11D.png", locofDiff + "SubmitP11D_PageDiff.png");
		ui.verifySS(loc + "SubmitP11D.png", locofDiff2 + "SubmitP11D_PageDiff.png");
        ui.assertAll();
}
	
	

	@Test(priority=2)

	public void TC02validateSubmitHmrc() throws Exception {

		String loc = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UI\\" + "\\";
		String locofDiff = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiffSacreenShot\\" + "\\";
		String locofDiff2 = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiff2\\" + "\\";
	
		sTestCaseID = "TC004";
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
		agentpage.clickSubmitP11DBtn();
		agentpage.clickP11DSubmitToHmrc();
		UITestPage.UIPage ui = new UITestPage.UIPage(driver);
		ui.TakeScreenShot("SubmitP11D_SubmitHmrc.png");
		ui.TakeScreenShotForVerify();
		ui.verifyScreenShot(loc + "SubmitP11D_SubmitHmrc.png", locofDiff + "SubmitP11D_SubmitHmrc_PageDiff.png");
		ui.verifySS(loc + "SubmitP11D_SubmitHmrc.png", locofDiff2 + "SubmitP11D_SubmitHmrc_PageDiff.png");
        ui.assertAll();
}
	
	@Test(priority=3)

	public void TC03validateNotToSubmit() throws Exception {

		String loc = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UI\\" + "\\";
		String locofDiff = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiffSacreenShot\\" + "\\";
		String locofDiff2 = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiff2\\" + "\\";
	
		sTestCaseID = "TC004";
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
		agentpage.clickSubmitP11DBtn();
		agentpage.clickP11DNotToSubmit();
		driver.switchTo().alert().accept();
		
		UITestPage.UIPage ui = new UITestPage.UIPage(driver);
	//	ui.TakeScreenShot("SubmitP11D_NotToSubmit.png");
		ui.TakeScreenShotForVerify();
		ui.verifyScreenShot(loc + "SubmitP11D_NotToSubmit.png", locofDiff + "SubmitP11D_NotToSubmit_PageDiff.png");
		ui.verifySS(loc + "SubmitP11D_NotToSubmit.png", locofDiff2 + "SubmitP11D_NotToSubmit_PageDiff.png");
        ui.assertAll();
}
	
	
	@Test(priority=4)

	public void TC04validateXml() throws Exception {

		String loc = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UI\\" + "\\";
		String locofDiff = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiffSacreenShot\\" + "\\";
		String locofDiff2 = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiff2\\" + "\\";
	
		sTestCaseID = "TC004";
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
		agentpage.clickSubmitP11DBtn();
		agentpage.clickP11Dxml();
		UITestPage.UIPage ui = new UITestPage.UIPage(driver);
     //	ui.TakeScreenShot("SubmitP11D_xml.png");
		ui.TakeScreenShotForVerify();
		ui.verifyScreenShot(loc + "SubmitP11D_xml.png", locofDiff + "SubmitP11D_xml_PageDiff.png");
		ui.verifySS(loc + "SubmitP11D_xml.png", locofDiff2 + "SubmitP11D_xml_PageDiff.png");
        ui.assertAll();
}
	

	@Test(priority=5)

	public void TC05validateSendEmail() throws Exception {

		String loc = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UI\\" + "\\";
		String locofDiff = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiffSacreenShot\\" + "\\";
		String locofDiff2 = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiff2\\" + "\\";
	
		sTestCaseID = "TC004";
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
		agentpage.clickSubmitP11DBtn();
		agentpage.clickP11DSelectEmolyee();
		agentpage.clickP11DSendEmail();
		
		UITestPage.UIPage ui = new UITestPage.UIPage(driver);
      //  ui.TakeScreenShot("SubmitP11D_SendEmail.png");
		ui.TakeScreenShotForVerify();
		ui.verifyScreenShot(loc + "SubmitP11D_SendEmail.png", locofDiff + "SubmitP11D_SendEmail_PageDiff.png");
		ui.verifySS(loc + "SubmitP11D_SendEmail.png", locofDiff2 + "SubmitP11D_SendEmail_PageDiff.png");
        ui.assertAll();
}
	
	

	@Test(priority=6)

	public void TC06validateCompany() throws Exception {

		String loc = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UI\\" + "\\";
		String locofDiff = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiffSacreenShot\\" + "\\";
		String locofDiff2 = System.getProperty("user.dir") + "\\As_Screenshot\\" + "\\UIDiff2\\" + "\\";
	
		sTestCaseID = "TC004";
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
		agentpage.clickSubmitP11DBtn();
		agentpage.clickP11DCompany();
		
		UITestPage.UIPage ui = new UITestPage.UIPage(driver);
        ui.TakeScreenShot("SubmitP11D_Company.png");
		ui.TakeScreenShotForVerify();
		ui.verifyScreenShot(loc + "SubmitP11D_Company.png", locofDiff + "SubmitP11D_Company_PageDiff.png");
		ui.verifySS(loc + "SubmitP11D_Company.png", locofDiff2 + "SubmitP11D_Company_PageDiff.png");
        ui.assertAll();
}

	
	
	
	
	
	
	
}
