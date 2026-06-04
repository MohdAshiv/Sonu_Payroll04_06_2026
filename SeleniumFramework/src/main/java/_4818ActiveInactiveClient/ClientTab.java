package _4818ActiveInactiveClient;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import pages.BasePage;
import utilities.ChangeWindow;
import utilities.WaitUtility;

public class ClientTab extends BasePage{

	WaitUtility wt=new WaitUtility();
	
	public ClientTab(WebDriver driver) {
		super(driver);
	
	}

	private By clientLnkElem =By .xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_businessMenu']/a/span");
	
	private By ClientstatusElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddStatus']");
	
	private By clientNameElem  =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_txtSearchCompany']");
	
	private By clientServiceElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlService']");
	
	private By clientSearchElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");
	
	private By editClientElem  =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl05_hrefEditClient']");
	
	private By editClientElem1  =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl08_hrefEditClient']");
	
	private By companyStatusElem =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_ddlCompanyActive']");
	
	private By payrollDetailsElem =By.xpath("//*[@id='__tab_ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails']");
	
	private By payeRefrenceNoElem= By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_txtOfficeNo\"]");
	
	private By payeRefrenceNOElem1 = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_txtPayeRefNo\"]");
	
	private By officeRefrenceNumElem= By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_txtAORef\"]");
	
	private By saveBtnElem =By.xpath("//*[@id='btnSave']");
	
	private By closePopupElem= By.xpath("//*[@id='cboxClose']");
	
	private By resetEditClientStatusElem =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_hrefEditClient']");
	
	public void clkClient() throws InterruptedException 
	{
		
		WebElement elem = getWebElement(clientLnkElem);
	   Thread.sleep(3000);
		elem.click();
		Reporter.log("Clicked Client Tab");
	}
	
	public void enterClientStatus(String ClientStatus)
	{
		WebElement elem = getWebElement(ClientstatusElem);
		wt.explicitWait_visibilityOf(m_Driver, 900, elem);
		elem.sendKeys(ClientStatus);
		Reporter.log("Enter Client Status= "+ClientStatus);
	
	}
	
	public void enterClientName(String ClientName)
	{
		WebElement elem = getWebElement(clientNameElem);
		wt.explicitWait_visibilityOf(m_Driver, 500, elem);
		elem.sendKeys(ClientName);
	
	}
	public void enterClientService(String ClientService)
	{
		WebElement elem = getWebElement(clientServiceElem);
		elem.sendKeys(ClientService);
	
	}
	public void clickClientSearch()
	{
		WebElement elem = getWebElement(clientSearchElem);
		elem.click();
		Reporter.log("Search Client");
	}
	
	public void clickEditClient() throws InterruptedException
	{
		WebElement elem = getWebElement(editClientElem);
		elem.click();
		Reporter.log("Edit InactiveClient");
		Thread.sleep(2000);
	}
	
	public void clickEditClient1() throws InterruptedException
	{
		WebElement elem = getWebElement(editClientElem1);
		elem.click();
		Thread.sleep(2000);
	}
	public void enterCompanyStatus(String CompanyStatus) throws InterruptedException  
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='cboxLoadedContent']/iframe")));	
		WebElement elem = getWebElement(companyStatusElem);
		
		Thread.sleep(5000);
		elem.sendKeys(CompanyStatus);
		Reporter.log("Enter company Status= "+CompanyStatus);
		m_Driver.switchTo().defaultContent();
		
	}
	
	public void clickPayrollDetails() throws InterruptedException
	{
		Thread.sleep(2000);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='cboxLoadedContent']/iframe")));
		WebElement elem = getWebElement(payrollDetailsElem);
		elem.click();
		m_Driver.switchTo().defaultContent();
		
	}
	
	public void enterPayeRefrenceNum(String EnterPayeRefrenceNumber)
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='cboxLoadedContent']/iframe")));
		WebElement elem = getWebElement(payeRefrenceNoElem);
		elem.sendKeys(EnterPayeRefrenceNumber);
		m_Driver.switchTo().defaultContent();
		
	}
	
	public void enterPayeRefrenceNum1(String EnterPayeRefrenceNumber1)
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='cboxLoadedContent']/iframe")));
		WebElement elem = getWebElement(payeRefrenceNOElem1);
		elem.sendKeys(EnterPayeRefrenceNumber1);
		m_Driver.switchTo().defaultContent();
		
	}
	public void enterOfficeRefrence (String EnterOfficeRefrenceNum)
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='cboxLoadedContent']/iframe")));
		WebElement elem = getWebElement(officeRefrenceNumElem);
		elem.sendKeys(EnterOfficeRefrenceNum);
		m_Driver.switchTo().defaultContent();
		
	}
	public void saveBtn()
	{
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='cboxLoadedContent']/iframe")));
		WebElement elem = getWebElement(saveBtnElem);
		//JavascriptExecutor js = (JavascriptExecutor) m_Driver;
		//js.executeScript("arguments[0].scrollIntoView(true);", elem);
		wt.explicitWait_visibilityOf(m_Driver, 900, elem);
		elem.click();
		Reporter.log("Click on Save Btn");
		m_Driver.switchTo().defaultContent();
		
	}
	public void clickClosePopup() throws InterruptedException
	{
	
		WebElement elem = getWebElement(closePopupElem);
		Thread.sleep(3000);
		elem.click();
		Reporter.log("Closed Popup Icon");
	
	}
	public void verifyAllDataForInactive(String CN,String ST,String Status)
	{
		List<WebElement>list=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_rowCompany']/td"));
		
		for(int i=0;i<=5;i++)
		{
			List<WebElement>list1=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_rowCompany']/td"));
			String Expected=list1.get(i).getText();
			
			if(Expected.equals(CN))
			{
				assertEquals(Expected, CN);
				Reporter.log("Client name match="+CN);
				System.out.println("CN Match");
			}
			if(Expected.equals(ST))
			{
				assertEquals(Expected, ST);
				Reporter.log("Service Type match="+ST);
				System.out.println("ST Match");
			}
			if(Expected.equals(Status))
			{
				assertEquals(Expected, Status);
				Reporter.log("Status match="+Status);
				System.out.println("Status Match");
				Reporter.log("Verifyied the all data for inactive client");
			}
		}
		
	}
	
	public void verifyAllDataForAactive(String CN,String ST,String Status)
	{
		List<WebElement>list=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_rowCompany']/td"));
		
		for(int i=0;i<=5;i++)
		{
			List<WebElement>list1=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_rowCompany']/td"));
			String Expected=list1.get(i).getText();
			
			if(Expected.equals(CN))
			{
				assertEquals(Expected, CN);
				Reporter.log("Client name match ="+CN);
				System.out.println("CN Match");
			}
			if(Expected.equals(ST))
			{
				assertEquals(Expected, ST);
				Reporter.log("Service Type match= "+ST);
				System.out.println("ST Match");
			}
			if(Expected.equals(Status))
			{
				assertEquals(Expected, Status);
				Reporter.log("Status match ="+Status);
				System.out.println("Status Match");
				Reporter.log("Verifyied the all data for active client");
			}
		}
		
	}
	
	public void resetClientStatus() throws InterruptedException
	{
		WebElement elem = getWebElement(resetEditClientStatusElem);

		wt.explicitWait_visibilityOf(m_Driver, 500, elem);
		elem.click();
		Reporter.log("Reset the client status");
	}
}