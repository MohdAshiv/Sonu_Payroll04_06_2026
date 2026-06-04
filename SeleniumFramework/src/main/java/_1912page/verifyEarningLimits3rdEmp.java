package _1912page;

import pages.BasePage;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/b9be32f3-920b-47fc-9d05-8c2c56459c18
@TestModellerModule(guid = "b9be32f3-920b-47fc-9d05-8c2c56459c18")
public class verifyEarningLimits3rdEmp extends BasePage
{
	
	static String LELinReportsP11="0.00";
	static String PTinReportsP11="0.00";
	static String UELinReportsP11="0.00";
	WebElement textArea1;
	
	public verifyEarningLimits3rdEmp (WebDriver driver)
	{
		super(driver);
	}


	
	private By gotoReportsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefReports']");

	private By P11Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefReportP11']");

	private By getcLELElem = By.xpath("//*[starts-with(text(), 'Earnings at the LEL')]");

	private By getPTElem = By.xpath("//*[starts-with(text(), 'Earnings at the LEL')]");

	private By getUELElem = By.xpath("//*[starts-with(text(), 'Earnings at the LEL')]");

	private By gotoFiling_ManagementElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefFilingMangment']");

	private By selectTaxYearsElem = By.xpath("//label[normalize-space()= 'Tax Year:']/../select");

	private By getDeatilFPSElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl12_lnkTaxReturnType']");
	
	private By getXMLDataElem = By.xpath("//TEXTAREA[@name='ctl00$ctl00$ParentContent$cPH$txtData']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/FilingManagment.aspx?PayrollCompanyCode=12584");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/FilingManagment.aspx?PayrollCompanyCode=12584");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/FilingManagment.aspx?PayrollCompanyCode=12584");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/FilingManagment.aspx?PayrollCompanyCode=12584";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/FilingManagment.aspx?PayrollCompanyCode=12584")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click gotoReports
     * @name Click gotoReports
     */
	public void Click_gotoReports()
	{
        
		WebElement elem = getWebElement(gotoReportsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoReports", "Click_gotoReports failed. Unable to locate object: " + gotoReportsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoReports", "Click_gotoReports failed. Unable to locate object: " + gotoReportsElem.toString());

			Assert.fail("Unable to locate object: " + gotoReportsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoReports");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoReports");
	}
              
   
	/**
 	 * Click P11
     * @name Click P11
     */
	public void Click_P11()
	{
        
		WebElement elem = getWebElement(P11Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_P11", "Click_P11 failed. Unable to locate object: " + P11Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_P11", "Click_P11 failed. Unable to locate object: " + P11Elem.toString());

			Assert.fail("Unable to locate object: " + P11Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_P11");

		TestModellerLogger.PassStep(m_Driver, "Click_P11");
	}
	
	
	/**
	 * Select Employee For P11
	 * 
	 */
	public void SelectEmp(String EmpName)
	{
		WebElement EnterEmployee=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlEmployee']"));
		Select dropdown = new Select(EnterEmployee);

 		dropdown.selectByVisibleText(EmpName);
		
	}

     
	/**
 	 * Click getcLEL
     * @name Click getcLEL
     */
	public void getEarningsP11()
	{
        
		
		int Tablesize=m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div/div[2]/table/tbody/tr/td[3]")).size();
		System.out.println(Tablesize);
		for(int i=Tablesize; i<=Tablesize;i++)
		{
			
		int 	j=i+1;
			System.out.println(j);
			LELinReportsP11=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div/div[2]/table/tbody/tr["+j+"]/td[3]")).getText();
			PTinReportsP11=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div/div[2]/table/tbody/tr["+j+"]/td[4]")).getText();
			UELinReportsP11=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div/div[2]/table/tbody/tr["+j+"]/td[5]")).getText();
			
		}
		LELinReportsP11=LELinReportsP11.replaceAll("[�]", "");
		LELinReportsP11=LELinReportsP11.replaceAll("[,]", "");
		
		PTinReportsP11=PTinReportsP11.replaceAll("[�]", "");
		PTinReportsP11=PTinReportsP11.replaceAll("[,]", "");
		
		UELinReportsP11=UELinReportsP11.replaceAll("[�]", "");
		UELinReportsP11=UELinReportsP11.replaceAll("[,]", "");
		
		System.out.println("LEL in P11="+LELinReportsP11);
		System.out.println("PT in P11="+PTinReportsP11);
		System.out.println("UEL in P11="+UELinReportsP11);
          	

		
	}

     
	/**
 	 * Click getPT
     * @name Click getPT
     */
	public void Click_getPT()
	{
        
		WebElement elem = getWebElement(getPTElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getPT", "Click_getPT failed. Unable to locate object: " + getPTElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getPT", "Click_getPT failed. Unable to locate object: " + getPTElem.toString());

			Assert.fail("Unable to locate object: " + getPTElem.toString());
        }

		PTinReportsP11=elem.getText();
		
		
          	

		ExtentReportManager.passStep(m_Driver, "Click_getPT");

		TestModellerLogger.PassStep(m_Driver, "Click_getPT");
	}

     
	/**
 	 * Click getUEL
     * @name Click getUEL
     */
	public void Click_getUEL()
	{
        
		WebElement elem = getWebElement(getUELElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getUEL", "Click_getUEL failed. Unable to locate object: " + getUELElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getUEL", "Click_getUEL failed. Unable to locate object: " + getUELElem.toString());

			Assert.fail("Unable to locate object: " + getUELElem.toString());
        }

		UELinReportsP11=elem.getText();
		
		
          	

		ExtentReportManager.passStep(m_Driver, "Click_getUEL");

		TestModellerLogger.PassStep(m_Driver, "Click_getUEL");
	}

     
	/**
 	 * Click gotoFiling Management
     * @name Click gotoFiling Management
     */
	public void Click_gotoFiling_Management()
	{
        
		WebElement elem = getWebElement(gotoFiling_ManagementElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_gotoFiling_Management", "Click_gotoFiling_Management failed. Unable to locate object: " + gotoFiling_ManagementElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_gotoFiling_Management", "Click_gotoFiling_Management failed. Unable to locate object: " + gotoFiling_ManagementElem.toString());

			Assert.fail("Unable to locate object: " + gotoFiling_ManagementElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_gotoFiling_Management");

		TestModellerLogger.PassStep(m_Driver, "Click_gotoFiling_Management");
	}

    
	/**
 	 * Select selectTaxYears
     * @name Select selectTaxYears
     */
    public void Select_selectTaxYears(String selectTaxYears)
 	{
 	    
 		WebElement elem = getWebElement(selectTaxYearsElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_selectTaxYears", "Select_selectTaxYears failed. Unable to locate object: " + selectTaxYearsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_selectTaxYears", "Select_selectTaxYears failed. Unable to locate object: " + selectTaxYearsElem.toString());

 			Assert.fail("Unable to locate object: " + selectTaxYearsElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(selectTaxYears);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_selectTaxYears " + selectTaxYears);

 		TestModellerLogger.PassStep(m_Driver, "Select_selectTaxYears " + selectTaxYears);
 	}

     
	/**
 	 * Click getDeatilFPS
     * @name Click getDeatilFPS
     */
	public void ClickFPS()
	{
        
		int FPScount=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'FPS')]")).size();
		FPScount-=1;
		System.out.println(FPScount);
		
		m_Driver.findElements(By.xpath("//*[starts-with(text(), 'FPS')]")).get(FPScount).click();
		
		
		
	}
	
	
	
	/**
 	 * Enter getXMLData
     * @name Enter getXMLData
     */
 	public void Enter_getXMLData()
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(getXMLDataElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_getXMLData", "Enter_getXMLData failed. Unable to locate object: " + getXMLDataElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_getXMLData", "Enter_getXMLData failed. Unable to locate object: " + getXMLDataElem.toString());

 			Assert.fail("Unable to locate object: " + getXMLDataElem.toString());
         }

 		elem.click();
 		textArea1=elem;
 //		clickFpselem=elem;
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_getXMLData " + getXMLDataElem);

  		TestModellerLogger.PassStep(m_Driver, "Enter_getXMLData " + getXMLDataElem);
 	}
	
	
	//Read data from XML File
    public void checkLEL() throws ParserConfigurationException, SAXException, IOException 
    {
    	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));
//    	pages.Library lib=new pages.Library(m_Driver);
    	
    	
    	
    	String xmlText=textArea1.getText();
 
    //	System.out.println(xmlText);
    	
/*
 * XML Data verification
 *     	
 */
    	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    	DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();

        
    	
    	InputSource src = new InputSource();
    	src.setCharacterStream(new StringReader(xmlText));
    	Document doc = dBuilder.parse(src);
    	String XMLLELValue = doc.getElementsByTagName("AtLELYTD").item(2).getTextContent();
    	
    	System.out.println("LEL in xml="+XMLLELValue);
    	
    	
    	
    	
 
    	m_Driver.switchTo().defaultContent();
    }
    
    
  //Read data from XML File
    public void checkPT() throws ParserConfigurationException, SAXException, IOException 
    {
    	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));
//    	pages.Library lib=new pages.Library(m_Driver);
    	
    	
    	
    	String xmlText=textArea1.getText();
 
    //	System.out.println(xmlText);
    	
/*
 * XML Data verification
 *     	
 */
    	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    	DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();

        
    	
    	InputSource src = new InputSource();
    	src.setCharacterStream(new StringReader(xmlText));
    	Document doc = dBuilder.parse(src);
    	String XMLPTValue = doc.getElementsByTagName("LELtoPTYTD").item(2).getTextContent();
    	
    	System.out.println("PT in xml="+XMLPTValue);
    	
    	
    	
    	
 
    	m_Driver.switchTo().defaultContent();
    }
    
    
  //Read data from XML File
    public void checkUEL() throws ParserConfigurationException, SAXException, IOException 
    {
    	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));
//    	pages.Library lib=new pages.Library(m_Driver);
    	
    	
    	
    	String xmlText=textArea1.getText();
 
    //	System.out.println(xmlText);
    	
/*
 * XML Data verification
 *     	
 */
    	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    	DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();

        
    	
    	InputSource src = new InputSource();
    	src.setCharacterStream(new StringReader(xmlText));
    	Document doc = dBuilder.parse(src);
    	String XMLUELValue = doc.getElementsByTagName("PTtoUELYTD").item(2).getTextContent();
    	
    	System.out.println("UEL in xml"+XMLUELValue);
    	
    	
    	
    	
 
    	m_Driver.switchTo().defaultContent();
    }
	
}