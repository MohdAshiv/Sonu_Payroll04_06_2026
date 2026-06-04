package Nidhi;

import pages.BasePage;
//import pages.SaleCreditNote;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.GetScreenShot;
import utilities.testmodeller.TestModellerLogger;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/a226b6d2-34bc-4f26-b18a-f50616deb4ed
@TestModellerModule(guid = "a226b6d2-34bc-4f26-b18a-f50616deb4ed")
public class Trans_BANKTRN extends BasePage
{
     public static String krno1;
     List<WebElement> l1;
     int i;
     
	public Trans_BANKTRN (WebDriver driver)
	{
		super(driver);
	}
	


	private By BK_SELECTElem = By.xpath("//*[@id='ctl00_cPH_ddlAccount']");
	
	//private By BK_SELECTElem=By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div/div/div/div/div/div/select");
	////*[@id="ctl00_cPH_ddlAccount"];
	private By NDateElem = By.xpath("//INPUT[@id='ctl00_cPH_rptRecord_ctl00_txtDate']");

	private By n_descElem = By.cssSelector("INPUT[id='ctl00_cPH_rptRecord_ctl00_txtDescription']");
	
	private By Recived_amtElem = By.xpath("//INPUT[@id='ctl00_cPH_rptRecord_ctl00_txtDbAmount']");

	private By spnt_amtElem = By.cssSelector("INPUT[id='ctl00_cPH_rptRecord_ctl00_txtAmount']");

	private By Select_VATRateElem = By.xpath("//SELECT[@id='ctl00_cPH_rptRecord_ctl00_ddVATRate']");

	private By cal_amtElem = By.xpath("//INPUT[@id='ctl00_cPH_rptRecord_ctl00_ltVATAmount']");

	private By Select_Option1Elem = By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl00_ltAccount-container']");
	
	private By BOX2Elem= By.xpath("/html/body/span/span/span[1]/input");

      

	private By _Save_Elem = By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/a[1]");
	
	public void GoToUrl()
	{
	
		m_Driver.get("	http://sandbox3.nomismasolution.co.uk/AccountUI/BankTranEditor.aspx?FYCode=116996&CompanyCode=16673&menuid=0");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL -	http://sandbox3.nomismasolution.co.uk/AccountUI/BankTranEditor.aspx?FYCode=116996&CompanyCode=16673&menuid=0");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL -	http://sandbox3.nomismasolution.co.uk/AccountUI/BankTranEditor.aspx?FYCode=116996&CompanyCode=16673&menuid=0");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
//   public void AssertUrl()
//    {
//        String currentUrl = m_Driver.getCurrentUrl();
//        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/BankTranEditor.aspx?FYCode=52444&CompanyCode=13236&menuid=0";
//
//        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/BankTranEditor.aspx?FYCode=52444&CompanyCode=13236&menuid=0")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//        }
//    }

    
	/**
 	 * Select BK_SELECT
	 * @throws InterruptedException 
	 * @throws IOException 
     * @name Select BK_SELECT
     */
    public void Select_BK_SELECT(String BK_SELECT) throws InterruptedException, IOException
 	{
 	    
 		WebElement elem = getWebElement(BK_SELECTElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_BK_SELECT", "Select_BK_SELECT failed. Unable to locate object: " + BK_SELECTElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_BK_SELECT", "Select_BK_SELECT failed. Unable to locate object: " + BK_SELECTElem.toString());

 			Assert.fail("Unable to locate object: " + BK_SELECTElem.toString());
         }
 		System.out.println("1"+BK_SELECT);
			Select dropdown = new Select(elem);

			dropdown.selectByVisibleText(BK_SELECT);
 
 	
 		
 		GetScreenShot.captureAsImage(m_Driver, BK_SELECT);
 		
 		ExtentReportManager.passStep(m_Driver, "Select_BK_SELECT " + BK_SELECT);

 		TestModellerLogger.PassStep(m_Driver, "Select_BK_SELECT " + BK_SELECT);
 		
 		//elem.sendKeys(Keys.TAB); 		
 	}

      
	/**
 	 * Enter NDate
	 * @throws InterruptedException 
     * @name Enter NDate
     */
 	public void Enter_NDate(String NDate) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(NDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_NDate", "Enter_NDate failed. Unable to locate object: " + NDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_NDate", "Enter_NDate failed. Unable to locate object: " + NDateElem.toString());

 			Assert.fail("Unable to locate object: " + NDateElem.toString());
         }
 		//elem.sendKeys(Keys.ENTER);
 		elem.sendKeys(NDate);
 		 		
 		elem.sendKeys(Keys.TAB); 	
  		ExtentReportManager.passStep(m_Driver, "Enter_NDate " + NDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_NDate " + NDate);
 	}

      
	/**
 	 * Enter n_desc
	 * @throws InterruptedException 
     * @name Enter n_desc
     */
 	public void Enter_n_desc(String n_desc) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(n_descElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_n_desc", "Enter_n_desc failed. Unable to locate object: " + n_descElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_n_desc", "Enter_n_desc failed. Unable to locate object: " + n_descElem.toString());

 			Assert.fail("Unable to locate object: " + n_descElem.toString());
         }

 		elem.sendKeys(n_desc);
 	//	Thread.sleep(2000);
 		elem.sendKeys(Keys.TAB); 	
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_n_desc " + n_desc);

  		TestModellerLogger.PassStep(m_Driver, "Enter_n_desc " + n_desc);
 	}

      
	/**
 	 * Enter Recived_amt
	 * @throws InterruptedException 
     * @name Enter Recived_amt
     */
 	public void Enter_Recived_amt(String Recived_amt) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(Recived_amtElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Recived_amt", "Enter_Recived_amt failed. Unable to locate object: " + Recived_amtElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Recived_amt", "Enter_Recived_amt failed. Unable to locate object: " + Recived_amtElem.toString());

 			Assert.fail("Unable to locate object: " + Recived_amtElem.toString());
         }

 		elem.sendKeys(Recived_amt);
 			
 				ExtentReportManager.passStep(m_Driver, "Enter_Recived_amt " + Recived_amt);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Recived_amt " + Recived_amt);
  		elem.sendKeys(Keys.TAB); 	
 	}

      
	/**
 	 * Enter spnt_amt
	 * @throws InterruptedException 
     * @name Enter spnt_amt
     */
 	public void Enter_spnt_amt(String spnt_amt) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(spnt_amtElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_spnt_amt", "Enter_spnt_amt failed. Unable to locate object: " + spnt_amtElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_spnt_amt", "Enter_spnt_amt failed. Unable to locate object: " + spnt_amtElem.toString());

 			Assert.fail("Unable to locate object: " + spnt_amtElem.toString());
         }

 		elem.sendKeys(spnt_amt);
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_spnt_amt " + spnt_amt);

  		TestModellerLogger.PassStep(m_Driver, "Enter_spnt_amt " + spnt_amt);
  		elem.sendKeys(Keys.TAB); 	
 	}

    
	/**
 	 * Select Select_VATRate
	 * @throws InterruptedException 
     * @name Select Select_VATRate
     */
    public void Select_Select_VATRate(String Select_VATRate) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(Select_VATRateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_VATRate", "Select_Select_VATRate failed. Unable to locate object: " + Select_VATRateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_VATRate", "Select_Select_VATRate failed. Unable to locate object: " + Select_VATRateElem.toString());

 			Assert.fail("Unable to locate object: " + Select_VATRateElem.toString());
         }
 		//elem.sendKeys(Keys.ENTER);
 		System.out.println("vat selected");
 		//elem.sendKeys(Keys.ARROW_DOWN);
		Select dropdown = new Select(elem);
		
 		dropdown.selectByVisibleText(Select_VATRate);

 		ExtentReportManager.passStep(m_Driver, "Select_Select_VATRate " + Select_VATRate);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_VATRate " + Select_VATRate);
 	}

      
	/**
 	 * Enter cal_amt
	 * @throws InterruptedException 
     * @name Enter cal_amt
     */
 	public void Enter_cal_amt(String cal_amt) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(cal_amtElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_cal_amt", "Enter_cal_amt failed. Unable to locate object: " + cal_amtElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_cal_amt", "Enter_cal_amt failed. Unable to locate object: " + cal_amtElem.toString());

 			Assert.fail("Unable to locate object: " + cal_amtElem.toString());
         }

 		elem.sendKeys(cal_amt);
 		System.out.println("amount:");
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_cal_amt " + cal_amt);

  		TestModellerLogger.PassStep(m_Driver, "Enter_cal_amt " + cal_amt);
 	}

     
	/**
 	 * Click Select_Option1
	 * @throws InterruptedException 
     * @name Click Select_Option1
     */
	public void Click_Select_Option1() throws InterruptedException
	{
        		WebElement elem = getWebElement(Select_Option1Elem);

		if (elem == null) 
		{
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Select_Option1", "Click_Select_Option1 failed. Unable to locate object: " + Select_Option1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Select_Option1", "Click_Select_Option1 failed. Unable to locate object: " + Select_Option1Elem.toString());

			Assert.fail("Unable to locate object: " + Select_Option1Elem.toString());
        }
//	WebDriverWait wait = new WebDriverWait(m_Driver,20);
//		WebElement t = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("INPUT[aria-autocomplete='list']")));
//				
//		
//			t.click();	
	elem.click();
	Thread.sleep(1000);
    	
      		
	}

      
	/**
 	 * Enter BOX2
	 * @throws InterruptedException 
     * @name Enter BOX2
     */
 	public void Enter_BOX2(String BOX2) throws InterruptedException
 	{
 	    
 		//WebElement elem = getWebElement(BOX2Elem);

// 		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_BOX2", "Enter_BOX2 failed. Unable to locate object: " + BOX2Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_BOX2", "Enter_BOX2 failed. Unable to locate object: " + BOX2Elem.toString());
//
// 			Assert.fail("Unable to locate object: " + BOX2Elem.toString());
//         }
 		

 	         String p =BOX2;
 	         System.out.print("box2"   +p );
 	         m_Driver.findElement(By.xpath("//*[contains(text(),'" +p+ "')]")).click();
 	         Thread.sleep(2000);
 
 	}

     
	/**
 	 * Click 1400 - DATA
	 * @throws InterruptedException 
     * @name Click 1400 - DATA
     */
	public void Bank_transaction_withcodes() throws InterruptedException
	{
//		 jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_divMainContent']/header/div/div[2]/a")));
//		 jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHeaderRight_btnAdd']")));
		WebElement elem2=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_ddlAccount']")); 
		elem2.click();
        Select bnkdropdown2 = new Select(elem2);
  //      bnkdropdown2.selectByVisibleText("bank_2");
        bnkdropdown2.selectByVisibleText("nidhi2");

//
          m_Driver.findElement(By.xpath("//*[@id='tableID']/tbody/tr[1]/td[14]/span")).click();
		l1=m_Driver.findElements(By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl00_ltAccount-results']/li/ul/li"));
		int size=l1.size();
		  System.out.println("list size"+size);
        for(i=0;i<size;i++)
        {
            WebElement date=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDate']")));
        	//WebElement date=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDate']"));
        	date.sendKeys("21/08/2021");
        	date.sendKeys(Keys.TAB);
        	Thread.sleep(2000);

	WebElement des=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDescription']")));
	des.sendKeys("code"+i+"vk");

	des=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDescription']")));
	des.sendKeys(Keys.TAB);
		WebElement amt=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDbAmount']")));
amt.sendKeys("500");	
des.sendKeys(Keys.TAB);
//des.sendKeys(Keys.TAB);
//des.sendKeys(Keys.TAB);
/* select vattype*/
WebElement vt= jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//SELECT[@id='ctl00_cPH_rptRecord_ctl00_ddVATRate']")));
vt.click();
Select dropdown1 = new Select(vt);
dropdown1.selectByVisibleText("Standard Rate");
             Thread.sleep(3000);//updated data from 3000 to 1000
/* click on ledger code drop down 1st*/
  m_Driver.findElement(By.xpath("//*[@id='tableID']/tbody/tr[1]/td[14]/span")).click();

Thread.sleep(1000);
/* get list of ledger codes*/
	l1=m_Driver.findElements(By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl00_ltAccount-results']/li/ul/li"));
   
String p =l1.get(i).getText();
Thread.sleep(1000);
System.out.print("box2==" +p );
/* after selection click on code to show in input box*/
WebElement elem3=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/span/span/span[1]/input")));
elem3.sendKeys(p);

WebElement elem4=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/span/span/span[1]/input")));
elem4.sendKeys(Keys.ENTER);
Thread.sleep(1000);//change from 5000 to 1000
String vattype=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_ddVATRate']//option[@selected='selected']")).getText();
System.out.println("Select vata tyep /t"     +vattype);

WebElement save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));
jsExec.executeScript("arguments[0].click()", save);
Thread.sleep(1000);

        }
			
		}
		
	
	/**
 	 * Click 1400 - DATA
	 * @throws InterruptedException 
     * @name Click 1400 - DATA
     */
	public void Bank_transaction_withcodes1() throws InterruptedException
	{

		WebElement elem2=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_ddlAccount']")); 
		elem2.click();
        Select bnkdropdown2 = new Select(elem2);
         bnkdropdown2.selectByVisibleText("nidhi2");


         WebElement clickSelect= m_Driver.findElement(By.xpath("//*[@id='tableID']/tbody/tr[1]/td[14]/span"));
         clickSelect.click();
		l1=m_Driver.findElements(By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl00_ltAccount-results']/li/ul/li"));
		int size=l1.size();
		  System.out.println("list size"+size);
		  
		  
		  WebElement des=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDescription']")));
			WebElement amt=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDbAmount']"));
		WebElement vt= m_Driver.findElement(By.xpath("//SELECT[@id='ctl00_cPH_rptRecord_ctl00_ddVATRate']"));
			WebElement allocateTo= m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		WebElement save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));
		  
        for(i=0;i<size;i++)
        {
            WebElement date=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDate']")));
            	date.sendKeys("21/08/2021");
        	date.sendKeys(Keys.TAB);
        	Thread.sleep(3000);

	des=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDescription']")));
	des.sendKeys("code"+i+"vk");
	des.sendKeys(Keys.TAB);
	
	
	amt=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_txtDbAmount']"));
amt.sendKeys("500");	
des.sendKeys(Keys.TAB);

vt= m_Driver.findElement(By.xpath("//SELECT[@id='ctl00_cPH_rptRecord_ctl00_ddVATRate']"));

Select dropdown1 = new Select(vt);
dropdown1.selectByVisibleText("Standard Rate");
des.sendKeys(Keys.TAB);
             Thread.sleep(2000);
             
             clickSelect= m_Driver.findElement(By.xpath("//*[@id='tableID']/tbody/tr[1]/td[14]/span"));
             clickSelect.click();
             
 // m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).click();


	l1=m_Driver.findElements(By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl00_ltAccount-results']/li/ul/li"));
	
	 allocateTo= m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
	
	allocateTo.sendKeys(l1.get(i).getText());
   
	allocateTo.sendKeys(Keys.TAB);
	
	Thread.sleep(2000);
	
	
String vattype=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_ddVATRate']//option[@selected='selected']")).getText();
System.out.println("Select vata tyep /t"     +vattype);

save=jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']")));
jsExec.executeScript("arguments[0].click()", save);
Thread.sleep(1000);
	
	
	
        }
	}
		
		
       

	/**
 	 * Click  Save 
	 * @throws InterruptedException 
     * @name Click  Save 
     */
	public void Click__Save_() throws InterruptedException
	{
        
		WebElement elem = getWebElement(_Save_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Save_", "Click__Save_ failed. Unable to locate object: " + _Save_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Save_", "Click__Save_ failed. Unable to locate object: " + _Save_Elem.toString());

			Assert.fail("Unable to locate object: " + _Save_Elem.toString());
        }
		
//		elem.click();
		JavascriptExecutor jse = (JavascriptExecutor)m_Driver;
		jse.executeScript("arguments[0].click()", elem);
		Thread.sleep(2000);
		 WebElement s=m_Driver.findElement(By.xpath("html/body/form/main/div[11]/div[3]/div/div[1]/div"));
	     String transnno=s.getText();
	     String arr[]=transnno.split(" ");
	     String stn=arr[2];
	      krno1=stn.substring(1);
	    System.out.println("Transaction number is"    +krno1);	
		ExtentReportManager.passStep(m_Driver, "Click__Save_");

	    TestModellerLogger.PassStep(m_Driver, "Click__Save_");
			       
			
	}
	
	public String confirmation() 
	{
		System.out.println("Confirmation "    +krno1);	
		return krno1;
		
		
	}
	
	
	
	
	
}