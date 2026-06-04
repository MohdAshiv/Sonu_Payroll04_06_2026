package _2185Net_Pay_Arrangement_Page;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import pages.BasePage;
import pages.reports;
import utilities.WaitUtility;

public class Pension_Dashboard extends BasePage {
	WaitUtility wt=new WaitUtility();
	public Pension_Dashboard(WebDriver driver) {
		super(driver);
		
	}

	
	private By PensionLnkElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPension']/span");
	
	private By viewSchemElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefViewScheme']");
	
	private By editSchemeElem = By.xpath("//*[@id=\"aspnetForm\"]/main/div/div[3]/div/div[2]/div/div/div/div/table/tbody/tr[2]/td[5]/a");
	
	private By calculationBasisElem= By .xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ddlCalculationBasis']");
	
	private By saveBtnElem= By .xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']");
	
	private By payrollDahboardElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefPayroll']/span");
	
	private By pensionableAmountElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[2]/td[5]");
	
	private By UpperMonthlyElem =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtuppermonthly']");
	
	private By eePension= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr/td [10]");
	
	private By erPension= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr/td [13]");
	
	
	
	public void Click_Pension () throws InterruptedException
	{
		WebElement elem = getWebElement(PensionLnkElem);
		wt.explicitWait_visibilityOf(m_Driver, 500, elem);
		elem.click();
		Reporter.log("click on pension Section");
		
	}
	
	
	public void Click_ViewScheme ()
	{
		WebElement elem = getWebElement(viewSchemElem);
		wt.explicitWait_visibilityOf(m_Driver, 500, elem);
		elem.click();
		Reporter.log("click On View Scheme");
		
	}
	
	public void Click_EditScheme () throws InterruptedException
	{
		WebElement elem = getWebElement(editSchemeElem);
		wt.explicitWait_visibilityOf(m_Driver, 500, elem);
		elem.click();
		Thread.sleep(3000);
		Reporter.log("click On Edit Scheme");
		
	}
	
	public void Open_CalculationBasis (String Method) throws InterruptedException
	{  
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));
		WebElement elem = getWebElement(calculationBasisElem);
		wt.explicitWait_visibilityOf(m_Driver, 500, elem);
		Select sel = new Select(elem);
		sel.selectByVisibleText(Method);
		m_Driver.switchTo().defaultContent();
		Reporter.log("Select Calculation basis= "+Method);
		
	}
	public void Click_SaveBtn ()
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));
		WebElement elem = getWebElement(saveBtnElem);
		wt.explicitWait_visibilityOf(m_Driver, 500, elem);
		elem.click();
		m_Driver.switchTo().defaultContent();
		Reporter.log("Save data");
		
	}
	
	public void Click_PayrollDashBoard()
	{
		WebElement elem = getWebElement(payrollDahboardElem);
		wt.explicitWait_visibilityOf(m_Driver, 500, elem);
		elem.click();
		Reporter.log("Click PayrollDashboard");
		
	}
	
	public void Verify_PensionableAmount(String value )
	{
		WebElement elem = getWebElement(pensionableAmountElem);
	    String actualamount = elem.getText();
	    actualamount=actualamount.replaceAll("£", "");
	    actualamount=actualamount.replaceAll(",", "");
	  
	    
	    System.out.println("pensionable ammount= "+actualamount);
	    assertEquals(actualamount,value);
	    Reporter.log("Verifying Pensionable Amount = "+actualamount);
	   
	}

	public void Enter_UpperMonthlyLimit(String Limit)
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));
		WebElement elem = getWebElement(UpperMonthlyElem);
		wt.explicitWait_visibilityOf(m_Driver, 500, elem);
		elem.clear();
		elem.sendKeys(Limit);
		m_Driver.switchTo().defaultContent();
		Reporter.log("Set upper monthly earnings = "+Limit);
		
	}
	
	public void Verifydata(int Data1) {
		List<WebElement>list=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr/td[@class='text-right']"));
		int size=list.size();
		String Data;
		for(int i=0;i<=size-1;i++)
		{
			List<WebElement>list1=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr/td[@class='text-right']"));
		     Data=list1.get(i).getText();
		if(i==3)
		{
			
			String expected=Data.substring(1,4);
			int EEPValue=(Data1*5)/100;
			String actual=Integer.toString(EEPValue);
			assertEquals(actual, expected);
			System.out.println("Employee pension= "+expected);
		}
		if(i==6)
		{
			String expected1=Data.substring(1,4);
			int ERPension=(Data1*3)/100;
			String actual1=Integer.toString(ERPension);
			assertEquals(actual1, expected1);
			System.out.println("Employer pension= "+expected1);
		}
		
		}
		
		Reporter.log("Verifying Employee Employer Pension");
		
	}
	public void Click_PayrollDashBoardScroll()
	{
		WebElement elem = getWebElement(payrollDahboardElem);
		jsExec.executeScript("arguments[0].click();", elem);
		
		Reporter.log("click payrolldashboard");
		
	}
	

} 



