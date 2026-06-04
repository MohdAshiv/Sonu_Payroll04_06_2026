package Generic;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;




public class SeleniumLib {
/*Common Link on Page*/
	@FindBy (xpath  = "//span[text()='Expenses']")
	public static WebElement ExpenseLink;
	@FindBy (xpath  = "//span[text()='Dashboard']")
	public static WebElement DashboardLink;
	@FindBy (xpath  = "//span[text()='Accountant']")
	public static WebElement AccountantLink;
	@FindBy (xpath  = "//span[text()='Reports']")
	public static WebElement ReportLink;
	
/*search*/	
	@FindBy (id="ctl00_cPHFilter_btnSearch")
	public static WebElement SearchButton;
	@FindBy (id="ctl00_cPHFilter_dd_Search")
	public static WebElement SearchCategory;
	@FindBy (id="ctl00_cPHFilter_txtSearch")
	public static WebElement TextBox;
/*Validation Common Message*/	
	@FindBy (xpath ="//div[@id='ctl00_divSubContent']//div[1]/div[@class='alert alert-success']")
	public static WebElement SuccessMessage;
	@FindBy (xpath ="//div[@id='ctl00_divSubContent']//div[@class='alert alert-success']")
	public static WebElement SuccessMessage2;
	
	
	@FindBy(xpath="//img[@src='../commonv2/images/plud_ico.png']")
	public static  WebElement HeadPlusLink;
	@FindBy(xpath="//a/p[text()='Add Supplier']")
	public static  WebElement AddSupplierHead;
	@FindBy(xpath="//a/p[text()='Add Supplier Bill']")
	public static  WebElement AddSupplierBillHeadLnk;
	
/*more/less btn*/
	@FindBy (id="imgentry")
	public static WebElement Morebtn;
/*Financial Year*/	
	@FindBy (id="ctl00_ddlFinancialYear")
	public static WebElement FinancialYear;
	
/*Setting IMg And Component*/	
	
	@FindBy (xpath = "(//a/img[@src='../commonv2/images/cogs.png'])[1]")
	public static WebElement SettingImgLink;
	@FindBy (id = "ctl00_cPH_rptrDisplayRecords_ctl00_imgEdit")
	public static WebElement EditImgLink;
	@FindBy (id = "ctl00_cPH_rptrDisplayRecords_ctl00_lnkDelete")
	public static WebElement DeleteImgLink;
	@FindBy (id = "ctl00_cPH_rptrDisplayRecords_ctl00_lnkCopy")
	public static WebElement CopyImgLink;
	@FindBy (id = "ctl00_cPH_rptrDisplayRecords_ctl00_hrefDoc")
	public static WebElement DocImgLink;
	@FindBy (id = "ctl00_cPH_rptrDisplayRecords_ctl00_lnkDescription")
	public static WebElement DescriptionImgLink;
	@FindBy (id = "ctl00_cPH_rptrDisplayRecords_ctl00_lnkNotes")
	public static WebElement NotesImgLink;
	@FindBy (id = "ctl00_cPH_rptrDisplayRecords_ctl00_lnkExpenseType")
	public static WebElement ExpenseTypeImgLink;
/*Company Setting Component*/
	@FindBy (id = "ctl00_mnuSetup")
	public static WebElement SettingCompanyimgLink;
	@FindBy (xpath = "//a[text()='Settings']")
	public static WebElement SettingCompanyLink;
	@FindBy (id = "__tab_ctl00_cPH_tbContainer_TbSalesInvoice")
	public static WebElement SalesinvoiceTab;
	@FindBy (id = "ctl00_cpHeaderRight_btnEdit")
	public static WebElement EditCompanyTab;
	@FindBy (id = "ctl00_cPH_tbContainer_TbSalesInvoice_ddCISRate")
	public static WebElement SAleInvoiceCisSelect;
	@FindBy (id = "ctl00_cPH_tbContainer_TbSalesInvoice_chkHasSubcontractorCIS")
	public static WebElement SubcontractorCisChkBx;
	@FindBy (id = "ctl00_cPH_tbContainer_TbSalesInvoice_btnSSave")
	public static WebElement Savesalesinvoice;
	
	
/*Save*/
	@FindBy (id = "ctl00_cpHFooter_btnSave")
	public static WebElement SaveHFooter;
	@FindBy (id = "ctl00_cphFooter_btnSave")
	public static WebElement SavehFooter;
/*Upload Common*/
	@FindBy (id = "ctl00_cPH_FileUpload1")
	public static WebElement ChooseFile;
	@FindBy (id = "ctl00_cPH_btnUploadBatch")
	public static WebElement UploadBatch;
	@FindBy (id = "ctl00_cPH_btnImport")
	public static WebElement Import;
	
	
/*Variables*/	
	  WebDriver driver;
	  WaitStatementLib wt;
//constructor	  
	  public SeleniumLib(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wt = new WaitStatementLib();
	}	
	  
//Switch into frame	  
      public void switchFrameNew(WebDriver driver, WebElement element){
		//Thread.sleep(2000);
		//driver.switchTo().defaultContent();
		driver.switchTo().frame(element);
	  }
//Switch To Default Content
      public void switchDefaultContent(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
//Switch To Parent Frame
      public void switchToParentFrame(WebDriver driver) {
		driver.switchTo().parentFrame();
	}
//mouse Hover     
      public void mouseHover(WebElement element) {
    	  Actions act = new Actions(driver);
    	  act.moveToElement(element).perform();
		
	 }
/*Mouse Click*/
      public void mouseClick(WebElement element) {
    	  Actions act = new Actions(driver);
    	  act.moveToElement(element).perform();
    	  act.click(element).perform();
		
	 }
//Select operation      
      public void selectByVisibleText(WebElement element,String text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
//file Uploading
      public Boolean isFileDownloadedinDir() throws InterruptedException{
    	Thread.sleep(2000);
    	Boolean flag=false;
  	    File dir = new File("C:\\Users\\Administrator\\Downloads");
  	    File[] files = dir.listFiles();
  	    if (files == null || files.length == 0) {
  	        return null;
  	    }
  	
  	    File lastModifiedFile = files[0];
  	    for (int i = 1; i < files.length; i++) {
  	       if (lastModifiedFile.lastModified() < files[i].lastModified()) {
  	           lastModifiedFile = files[i];
  	       }
  	    }
  	  
       System.out.println(lastModifiedFile.getName());
       if(lastModifiedFile!=null) {
  		flag=true;
        }
       return flag;
  	}
// Check the file from a specific directory with extension 
  	public boolean isFileDownloaded_Ext(String ext) throws InterruptedException{
  		Thread.sleep(2000);
  		boolean flag=false;
  	    File dir = new File("C:\\Users\\Administrator\\Downloads");
  	    File[] files = dir.listFiles();
  	    if (files == null || files.length == 0) {
  	        flag = false;
  	    }
  	    
  	    for (int i = 1; i < files.length; i++) {
  	    	if(files[i].getName().contains(ext)) {
  	    		flag=true;
  	    	}
  	    }
  	    return flag;
  	}      
 //Window Handling     
      public void switchwindowForward(WebDriver driver)  {
  		@SuppressWarnings({ "rawtypes", "unchecked" })
  		ArrayList tabs = new ArrayList (driver.getWindowHandles());
  		System.out.println(tabs.size());
  		driver.switchTo().window((String) tabs.get(tabs.size()-1));
  		//Thread.sleep(2000);
  	}
  	public void switchwindowBackward(WebDriver driver) throws InterruptedException {
  		@SuppressWarnings({ "rawtypes", "unchecked" })
  		ArrayList tabs = new ArrayList (driver.getWindowHandles());
  		System.out.println(tabs.size());
  		driver.switchTo().window((String) tabs.get(tabs.size()-2));
  		//Thread.sleep(2000);
  	}
//Random String Generation
  	public String RandomString(String str)  {
		Random rd= new Random();
		int in = rd.nextInt(1000);
		return (str+in);
  	}
//Add Days
  	public Date addDays(Date d, int days)
    {
		
        d.setTime(d.getTime() + days * 1000 * 60 * 60 * 24);
        return d;
         
    }
//PopUp Handling
  	public void popUpHandlingOk(WebDriver driver) {
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}
  	public void popUpHandlingCancel(WebDriver driver) {
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
	}
/*ScrollHEight_javaScriptExecutor*/
public void ScrollHeight(WebDriver driver) {
  		JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
 /*ScrollHeightUsingPixel*/
public void ScrollHeightPixel(WebDriver driver,int pixel) {
  	    JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,250)");
	}
/*ScrollHEight_javaScriptExecutor*/
public void ScrollToElement(WebDriver driver,WebElement element) {
	    //WebElement element = driver.findElement(By.id("id_of_element"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	    try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 	
  	
/*ArrowDown1_mouseOperationSelect*/  	
  	public void ArrowDownSelect(WebDriver driver,WebElement element,String ledger) {
  		
  	  	try {
  	  		Thread.sleep(1000);
  	  	} catch (InterruptedException e1) {
  	  	e1.printStackTrace();
  	  	}	
    element.click();
    try {
	  		Thread.sleep(1000);
	  	} catch (InterruptedException e1) {
	  	e1.printStackTrace();
	  	}	
  	element.sendKeys(ledger);
  	try {
  		Thread.sleep(1000);
  	} catch (InterruptedException e1) {
  	e1.printStackTrace();
  	}
  	wt.explicitWait_attributeToBeNotEmpty(driver, 5, element, "value");
  	Actions act = new Actions(driver);
  	act.sendKeys(Keys.ARROW_DOWN).perform();
  	act.sendKeys(Keys.ENTER).perform();	
  	}
/*ArrowDownFirst*/  	
	public void ArrowDownSelect2(WebDriver driver,WebElement element,String ledger) {
		try {
	  		Thread.sleep(3000);
	  	} catch (InterruptedException e1) {
	  	e1.printStackTrace();
	  	}
		element.click();
		try {
	  		Thread.sleep(3000);
	  	} catch (InterruptedException e1) {
	  	e1.printStackTrace();
	  	}
	  	element.sendKeys(ledger);
	  	try {
	  		Thread.sleep(3000);
	  	} catch (InterruptedException e1) {
	  	e1.printStackTrace();
	  	}
	  	//element.sendKeys(Keys.ARROW_DOWN);
	  	//element.sendKeys(Keys.ENTER);
	  	Actions act = new Actions(driver);
	  	act.sendKeys(Keys.ARROW_DOWN).perform();
	  	act.sendKeys(Keys.ARROW_DOWN).perform();
	  	act.sendKeys(Keys.ENTER).perform();	
	  	}
	public void ArrowDownSelect3(WebDriver driver,WebElement element,String ledger) {
		try {
	  		Thread.sleep(3000);
	  	} catch (InterruptedException e1) {
	  	e1.printStackTrace();
	  	}

		element.click();
		try {
	  		Thread.sleep(3000);
	  	} catch (InterruptedException e1) {
	  	e1.printStackTrace();
	  	}
	  	element.sendKeys(ledger);
	  	try {
	  		Thread.sleep(3000);
	  	} catch (InterruptedException e1) {
	  	e1.printStackTrace();
	  	}
	  	//element.sendKeys(Keys.ARROW_DOWN);
	  	//element.sendKeys(Keys.ENTER);
	  	Actions act = new Actions(driver);
	  	act.sendKeys(Keys.ARROW_DOWN).perform();
	  	act.sendKeys(Keys.ARROW_DOWN).perform();
	  	act.sendKeys(Keys.ARROW_DOWN).perform();
	  	act.sendKeys(Keys.ENTER).perform();	
	  	}
	public class WaitStatementLib {

		public void implictWaitForSeconds(WebDriver driver, int time){
			driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		}
		
		public void implictWaitForMinutes(WebDriver driver, int time){
			driver.manage().timeouts().implicitlyWait(time, TimeUnit.MINUTES);
		}
		
		public void explicitWait_visibilityOfElementLocated(WebDriver driver, int time, By locator){
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}
		
		public void explicitWait_visibilityOf(WebDriver driver, int time, WebElement locator){
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
			wait.until(ExpectedConditions.visibilityOf(locator));
		}
		public void explicitiWait_presenceOfElementLocated(WebDriver driver, int time, By locator){
			WebDriverWait iwait = new WebDriverWait(driver, Duration.ofSeconds(time));
			iwait.until(ExpectedConditions.presenceOfElementLocated(locator));
			
		}
		
//		public void fluentWait(WebDriver driver, int totalTime,int pollingTime, WebElement element){
//			
//			FluentWait<WebDriver> fw = new FluentWait<WebDriver>(driver);
//			fw.withTimeout(totalTime, TimeUnit.SECONDS);
//			fw.pollingEvery(pollingTime, TimeUnit.SECONDS);
//			fw.ignoring(NoSuchElementException.class);
//			fw.until(ExpectedConditions.visibilityOf(element));
//		}
		
		public void explicitWait_elementToBeClickable(WebDriver driver, int time, WebElement element){
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
			wait.until(ExpectedConditions.elementToBeClickable(element));	
		}
		
		public void explicitWait_attributeToBeNotEmpty(WebDriver driver, int time, WebElement element, String attribute){
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
			wait.until(ExpectedConditions.attributeToBeNotEmpty(element,attribute));
		}
		
		public void explicitWait_textToBePresentInElementValue(WebDriver driver, int time, WebElement element, String value){
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
			wait.until(ExpectedConditions.textToBePresentInElementValue(element, value));
		}

	public String lastmonthdatefromtoday()
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		 
		Calendar c = Calendar.getInstance();
		//c.setTime(date);
		//Calendar c = Calendar.getInstance();
		c.add(Calendar.MONTH, -1);
		//c.add(Calendar.DATE,interval);  //not sure
		 
		String gfgfg = dateFormat.format(c.getTime());
		//System.out.println(gfgfg);
		return gfgfg;
	}
	public String todaydate()
	{
		Date date =new Date();
				//date.before("25");
	    SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
	    String td = sdf.format(date);
		return td;
	}
	
  	
  	
	}
}
