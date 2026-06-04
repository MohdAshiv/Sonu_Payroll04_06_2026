package _2185Net_Pay_Arrangement_Page;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import pages.BasePage;
import utilities.ChangeWindow;
import utilities.WaitUtility;

public class RTI_Submission  extends BasePage{

	double TaxAmount=0;
		double EmployeeNIAmount=0;
		double EmployerNIAmount=0;
		double TotalCoast=0;
		double EmployerPensionAmount=0;
		double TotalAmount=0;
		double BalanceOwedAmount=0;
		double NetPayAmount=0;
		double GrossAmountt=0;
	WaitUtility wt=new WaitUtility();
	public RTI_Submission(WebDriver driver) {
		super(driver);
		
		
		
	}

	private By inputText= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtNotes']");
	
	private By selectReson= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ddlSubmitReason']");
	
	private By submitHMRC= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnSubmitRTI']");
	
    private By reportAgent=By.xpath("//*[@id='ctl00_ctl00_ParentContent_SideMenu1_reportsMenu']/a");
    
    private By rtiReport=By.xpath("//*[@id='Reports']/table/tbody/tr[6]/td/a");
    
    private By taxYear=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear']");
    
    private By company =By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlCompany']");
    
    private By employerView= By.xpath("//*[@id='ctl00_ctl00_ParentContent_hrefEmployerDashboard']");
    
    
    
    
    
    
	public void selectChekBx()
	{
		
		List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='aspnetForm']//tr/td[1]"));
		System.out.println(list.size());
		for(int i=0;i<=list.size()-1;i++)
		{
			List<WebElement> list2 = m_Driver.findElements(By.xpath("//*[@id='aspnetForm']//tr/td[1]"));
			 WebElement data = list2.get(i);
				
			if(i==7)	
			{
				jsExec.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", data);
		    	data.click();
	
			}
			else
			{
				data.click();
			}
		}		
		
		
	}
	
	public void Enter_Input()
	{
		
		WebElement elem = getWebElement(inputText);
		wt.explicitWait_visibilityOf(m_Driver, 500, elem);
		elem.sendKeys("xyz");
		Reporter.log("enter notes");
	}

	public void Select_Reson() throws InterruptedException
	{
		WebElement elem = getWebElement(selectReson);
		Select sel = new Select(elem);
		Thread.sleep(1000);
		sel.selectByVisibleText("Notional payment: Payment to Expat by third party or overseas employer");
		
		Reporter.log("Select reson");
	}
	
	public void Submit_HMRC() throws InterruptedException
	{
		
		WebElement elem = getWebElement(submitHMRC);
		wt.explicitWait_visibilityOf(m_Driver, 500, elem);
		Thread.sleep(1000);
		elem.click();
		Reporter.log("Submit HMRC");
		Thread.sleep(5000);
	   ChangeWindow.tabswitch(m_Driver);
	}
	
	public void Click_AgentReport()
	{
		WebElement elem = getWebElement(reportAgent);
		wt.explicitWait_visibilityOf(m_Driver, 500, elem);
		elem.click();
		Reporter.log("click report on Agent level");
		
	}
	
	public void Click_RTI_Report()
	{
		WebElement elem = getWebElement(rtiReport);
		wt.explicitWait_visibilityOf(m_Driver, 500, elem);
		elem.click();
		Reporter.log("click RTI submission report");
		
	}
	
	public void Click_EmployerView() throws InterruptedException
	{
		WebElement elem = getWebElement(employerView);
		wt.explicitWait_visibilityOf(m_Driver, 500, elem);
		elem.click();
		Thread.sleep(2000);
		Reporter.log("click Employer View");
		utilities.ChangeWindow.tabswitch(m_Driver);
		
	}
	
	
	public void Select_Taxyear(String value)
	{
		WebElement elem = getWebElement(taxYear);
		Select sel = new Select(elem);
		sel.selectByVisibleText(value);
		Reporter.log("Selected Tax Year = "+value);
	
	}
	

	public void Select_Company(String value)
	{
		WebElement elem = getWebElement(company);
		Select sel = new Select(elem);
		sel.selectByVisibleText(value);
		Reporter.log("Selected Company = "+value);
	
	
}
	
	public void verifySubmissionRTI()
  	{
  		
  		
  	 
  	//Gross Finding
	  
	    String Gross=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']//td")).get(6).getText();
      	//System.out.println(Tax);
      	String Grossstr=Gross.replaceAll("[£]", "");
      	String GrossAmount = Grossstr.replaceAll(",", "");
  		System.out.println("This is Gross amount"+GrossAmount);
  		assertEquals(GrossAmount, "2000.00");
  		
  		
	  
  	//Tax Finding
  	      	
  	      	String Tax=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']//td")).get(7).getText();
  	      	//System.out.println(Tax);
  	      	String str=Tax.replaceAll("[^0-9]", "");
  	      	
  	  		double number = Double.parseDouble(str);
  	  		number=number/100;
  	  		
  	  		TaxAmount=TaxAmount+number;
  	  	    assertEquals(TaxAmount, 171.4);
  	  		System.out.println("This is Tax amount"+TaxAmount);
  	  	
  	      	
  	  		
  	//Employee NI Finding
  	  		
  	  		String EmployeeNI=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']//td")).get(8).getText();
  	      	//System.out.println(EmployeeNI);
  	  		String EmployeeNIstr=EmployeeNI.replaceAll("[^0-9]", "");
  	      	
  	  		double number1 = Double.parseDouble(EmployeeNIstr);
  	  		number1=number1/100;
  	  		
  	  		EmployeeNIAmount=EmployeeNIAmount+number1;
  	      	 assertEquals(EmployeeNIAmount, 144.96);
  	  		System.out.println("This is EmployeeNI amount"+EmployeeNIAmount);
  	  		
  	      	
  	      	
  	//Employer NI Finding
  	      	
  	      	String EmployerNI=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']//td")).get(9).getText();
  	      	//System.out.println(EmployerNI);
  	      	String EmployerNIstr=EmployerNI.replaceAll("[^0-9]", "");
  	      	
  	  		double number2 = Double.parseDouble(EmployerNIstr);
  	  		number2=number2/100;
  	  		
  	  		EmployerNIAmount=EmployerNIAmount+number2;
  	  	   assertEquals(EmployerNIAmount, 174.98);
  	  		System.out.println("This is EmployerNI amount"+EmployerNIAmount);
  	  		
  	  		
// Net Pay Finding
  	  		
  	  		String NetPay=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']//td")).get(10).getText();
  	      	String NetPaystr=NetPay.replaceAll("[^0-9]", "");
  	      	
  	  		double number5 = Double.parseDouble(NetPaystr);
  	  		number5=number5/100;
  	  		
  	  		NetPayAmount=NetPayAmount+number5;
  	  		System.out.println("This is NetPAY amaount amount"+NetPayAmount);
  	  	    assertEquals(NetPayAmount, 1583.64);
  	  		
  
  	     	
  	    //Total coast Findin
  	  		
  	  		
  	  		String Totalcoast=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']//td")).get(11).getText();
  	      	String Totalcoaststr=Totalcoast.replaceAll("[^0-9]", "");
  	      	
  	  		double number4 = Double.parseDouble(Totalcoaststr);
  	  		number4=number4/100;
  	  	    TotalCoast=TotalCoast+number4;
  	  	    assertEquals(TotalCoast, 2174.98);
  	  		System.out.println("This is TotalCoast amaount amount"+TotalCoast);
  	
  	  	    Reporter.log("Verify RTI Submission Report");
  	     	utilities.TakeScreenshot.Getscreenshot("TC032_ Rti submission Report ", "2185", m_Driver);
      
}
	
	public void veryfyEmployerView(String actualname,String actualtaxcode,String actualGross)
	{
		
		   List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']//td"));
		    
		      String name = list.get(0).getText();
		      System.out.println("Employee Name = "+name);
		      assertEquals(actualname, name);
		      
		      String taxcode = list.get(1).getText();
		      System.out.println("Tax code = "+taxcode);
		      assertEquals(actualtaxcode, taxcode);
		      
		      
		      String gross = list.get(4).getText();
		      gross= gross.replaceAll("£", "");
		      gross= gross.replaceAll(",", "");
		      System.out.println("Gross = "+gross);
		      assertEquals(actualGross, gross);
		      utilities.TakeScreenshot.Getscreenshot("TC033_ Verify Employer view figure ", "2185", m_Driver);
		   // utilities.ChangeWindow.Switchwindow(3, m_Driver)
		    
		      
	}
	
	public void undoSubmittedRTI() throws InterruptedException
	{
		
		List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='aspnetForm']//tr/td[16]"));
		System.out.println(list.size());
		for(int i=0;i<=list.size()-1;i++)
		{
			List<WebElement> list2 = m_Driver.findElements(By.xpath("//*[@id='aspnetForm']//tr/td[16]"));
			 WebElement data = list2.get(i);
				
			if(i==7)	
			{
				jsExec.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", data);
		    	data.click();
		    	
		    	m_Driver.switchTo().alert().accept();
		    	Thread.sleep(1000);
			}
			else
			{
				data.click();
				
				m_Driver.switchTo().alert().accept();
				Thread.sleep(1000);
			}
		}		
}
}