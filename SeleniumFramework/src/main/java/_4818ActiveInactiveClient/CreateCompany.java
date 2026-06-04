package _4818ActiveInactiveClient;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import pages.BasePage;

public class CreateCompany extends BasePage {

	public CreateCompany(WebDriver driver)
	{
		super(driver);
		
	}
	
    private By newClientElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnAdd']/p");
	
	private By clickLtdCompanyElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnLimitedCompany']/div/div");
	
	private By clickManualLtdCompanyElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ltBussinessName']");
	
	private By enterbuisnessNameElem =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtCompanyName']");
	
	private By enterRegNoElem  =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtRegNo']");
	
	private By enterRegBuisDateElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtCRegDate']");
	
	private By enterFirstNameElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtFirstName1']");
	
	private By enterLastNameElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtLastName1']");
	
	private By clickSaveBtnElem   = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnSave']");
	
	private By clientSectionElem  = By.xpath("//*[@id='aspnetForm']/main/header/div/div[2]/ul/li[4]/a");
	
	private By newClientBtnElem   = By.xpath("//*[@id='ctl00_ctl00_ParentContent_btnAdd']/span/p");
	
	
	
	public void Click_NewClient()
	{
		
		WebElement elem = getWebElement(newClientElem);
 		if (elem == null)
 		{
 			Assert.fail("Unable to locate object: " + newClientElem.toString());
 			
 		}
 		elem.click();
	}
	
	public void Click_limitedCompany() throws InterruptedException
	{
		WebElement elem = getWebElement(clickLtdCompanyElem);
 		Thread.sleep(2000);
 		elem.click();
	}
	
	public void Click_ManualLtdCompany()
	{
		WebElement elem = getWebElement(clickManualLtdCompanyElem);
 		if (elem == null)
 		{
 			Assert.fail("Unable to locate object: " + clickManualLtdCompanyElem.toString());
 			
 		}
 		elem.click();
	}
	
	public void Enter_buisnessName(String EnterBuisnessName)
	{
		WebElement elem = getWebElement(enterbuisnessNameElem);
 		if (elem == null)
 		{
 			
 			Assert.fail("Unable to locate object: " + enterbuisnessNameElem.toString());
 		}
 		elem.sendKeys(EnterBuisnessName);
	}
	
	public void Enter_RegNo(String EnterRegiststrationNo)
	{
		WebElement elem = getWebElement(enterRegNoElem);
 		if (elem == null)
 		{
 			
 			Assert.fail("Unable to locate object: " + enterRegNoElem.toString());
 		}
 		elem.sendKeys(EnterRegiststrationNo);
		
	}
	
	public void Enter_RegBuisDate(String EnterRegBuisnessDate)
	{
		WebElement elem = getWebElement(enterRegBuisDateElem);
 		if (elem == null)
 		{
 			
 			Assert.fail("Unable to locate object: " + enterRegBuisDateElem.toString());
 		}
 		elem.sendKeys(EnterRegBuisnessDate);
	}
	
	public void Enter_FirstName(String EnterFirstName)
	{
		WebElement elem = getWebElement(enterFirstNameElem);
 		if (elem == null)
 		{
 			
 			Assert.fail("Unable to locate object: " + enterFirstNameElem.toString());
 		}
 		elem.sendKeys(EnterFirstName);
		
	}
	
	public void Enter_LastName(String EnterLastName)
	{
		WebElement elem = getWebElement(enterLastNameElem);
 		if (elem == null)
 		{
 			
 			Assert.fail("Unable to locate object: " + enterLastNameElem.toString());
 		}
 		elem.sendKeys(EnterLastName);
		
	}
		
	public void Click_SaveBtn()
	{
		WebElement elem = getWebElement(clickSaveBtnElem);
 		if (elem == null)
 		{
 			Assert.fail("Unable to locate object: " + clickSaveBtnElem.toString());
 			
 		}
 		elem.click();
	}
	
	public void Click_ClientSection()
	{
		WebElement elem = getWebElement(clientSectionElem);
		elem.click();
	}
	
	public void Click_ClientTab()
	{
		WebElement elem = getWebElement(newClientBtnElem);
		elem.click();
	}
}




