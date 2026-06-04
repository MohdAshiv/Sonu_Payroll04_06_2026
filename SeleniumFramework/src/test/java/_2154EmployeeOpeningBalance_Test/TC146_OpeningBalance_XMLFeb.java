package _2154EmployeeOpeningBalance_Test;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC146_OpeningBalance_XMLFeb extends TestBase {

	public String sTestCaseID = null;
	String Sheet = null;
	String[] data = null;
	@Test

	public void validateXmlFeb() throws Exception {

		sTestCaseID = "TC146";
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
	   
		_2154EmployeeOpeningBalance_Page.FillingManagement xml=new _2154EmployeeOpeningBalance_Page.FillingManagement(driver);
		
		xml.Click_gotoFilingManagement();
		xml.clickFPS2();
		xml.getXMLData1();
		xml.verifyXML1(data[5], data[6],data[7], data[8], data[9], data[10], data[11], data[12], data[13], data[14], data[15], data[16],data[17],data[18]);
  	    xml.assertAll();
  
}
	
}
