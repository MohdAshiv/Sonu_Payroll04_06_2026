package _4818ActiveInactiveClient;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import pages.BasePage;
import utilities.ChangeWindow;
import utilities.TakeScreenshot;
import utilities.WaitUtility;

public class PayrollDashboard extends BasePage {

	WaitUtility wt=new WaitUtility();
	public PayrollDashboard(WebDriver driver) {
		
		super(driver);
		
	}
	
		
	private By clickPayrollLnkEle= By.xpath("//*[@id='payrollMenu']/a/span");
	
    private By clickDashboardLnkEle= By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_PRMenuChildren']/li[1]/a");
    
    private By EnterClientNameEle= By.xpath("//*[@id=\"search_input\"]");
    
    private By searchIcn= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnSearch']");
    
    private By errorMsg =By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[1]");
    
    private By totalClientElem =By.xpath("//*[text()='Total Clients']");
    
    private By verifyActiveCompanyElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_rowCompany']");
    
    private By verifyBlankCompanyElem =By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/table/tbody/tr/td");
    
    private By resetClientStatus2 = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_hrefEditClient']");

	public void Click_PayrollLnk() throws Exception
	{
		WebElement elem = getWebElement(clickPayrollLnkEle);
		elem.click();
		Reporter.log("Click On Payroll Lnk");
		Thread.sleep(2000);
	}
	
	public void Click_DashboardLnk() throws Exception
	{
		
		WebElement elem = getWebElement(clickDashboardLnkEle);
		elem.click();
		Thread.sleep(2000);
		Reporter.log("Click PayrollDashboard Lnk");
	}
	
		
	public void Enter_ClientName(String EnterClientName)
	{

 		WebElement elem = getWebElement(EnterClientNameEle);
 		elem.sendKeys(EnterClientName);
 		Reporter.log("Enter Client Name = "+EnterClientName);
	}
	
	public void Click_SearchIcn()
	{
		WebElement elem = getWebElement(searchIcn);
 		elem.click();
	}
	
	public void VerifyErrorMsg()
	{
		//String actualMsg="×"+"\n"+"Error! Please select the individual business name from the search list";
		String actualResult="Total Record : 0";
		//WebElement elem = getWebElement(errorMsg);
	
		//String expectedMsg=elem.getText();
	
		//System.out.println(expectedMsg);
		//Assert.assertEquals(actualMsg, expectedMsg);
		
		WebElement elem1 = getWebElement(verifyBlankCompanyElem);
		String expectedResult=elem1.getText();
		System.out.println("expected result ="+expectedResult);
		System.out.println("actual result ="+actualResult);
		Assert.assertEquals(actualResult, expectedResult);
	    Reporter.log("Verifying data for Inactive ABCD Ltd");
	    utilities.TakeScreenshot.Getscreenshot("Verify blank data for Inactive client", "4818", m_Driver);
		
		
	}
	public void TakeShot(String name) throws Exception
	{
		TakeScreenshot.takeScreenshot(m_Driver, name);	
	}
	
	public void verifyActiveCopany(String actualdata) throws Exception

	{
		
		WebElement elem = getWebElement(verifyActiveCompanyElem);
	    String expextedData = elem.getText();
	    System.out.println(expextedData);
	    Assert.assertEquals(actualdata, expextedData);	
	    Reporter.log("Verifyied the status Of Active Company");
	    utilities.TakeScreenshot.Getscreenshot("verify Active Company", "4818", m_Driver);
	   
	  
	}
	
	public void clickTotalClient()
	{
		Actions act= new Actions(m_Driver);
		
		  
		
		WebElement elem = getWebElement(totalClientElem);
		
		
		act.moveToElement(elem).click().build().perform();
		Reporter.log("Click on Totalclient");
		
	}
	
	public void resetClientStatus2() throws InterruptedException
	{
		WebElement elem = getWebElement(resetClientStatus2);
		Thread.sleep(3000);
		elem.click();
		Reporter.log("Click on edit client to reset status");
	}
}

