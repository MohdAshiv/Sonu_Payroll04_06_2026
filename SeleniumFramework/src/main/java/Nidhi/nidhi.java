package Nidhi;

import pages.BasePage;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;



import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ClosePopup;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/bc0851cc-b525-43b0-8c3c-dfaa4bb3dba9
@TestModellerModule(guid = "bc0851cc-b525-43b0-8c3c-dfaa4bb3dba9")
public class nidhi extends BasePage
{
	
	static List<WebElement> data1=new ArrayList<WebElement>();
	
	int count=0;
	int i;
	int size;
	

	public nidhi (WebDriver driver)
	{
		super(driver);
	}


	
	private By ExpenditureElem = By.xpath("//*[@id='ctl00_SideMenu1_ExpensesMenu']/a");

	private By New_Elem = By.xpath("//*[@id='ctl00_divMainContent']/header/div/div[3]/a");

	private By _New_Supplier_Bill_Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnAdd']");

	private By getDropdounDataElem = By.xpath("//SPAN[@id='select2-ctl00_cPH_rptrProduct_ctl00_ltAccount-container']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/SupplierBillEditor.aspx?FYCode=117161&CompanyCode=16833&id=0&action=Add&bt=Bmenuid=0");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/SupplierBillEditor.aspx?FYCode=117161&CompanyCode=16833&id=0&action=Add&bt=Bmenuid=0");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/SupplierBillEditor.aspx?FYCode=117161&CompanyCode=16833&id=0&action=Add&bt=Bmenuid=0");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/SupplierBillEditor.aspx?FYCode=117161&CompanyCode=16833&id=0&action=Add&bt=Bmenuid=0";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/SupplierBillEditor.aspx?FYCode=117161&CompanyCode=16833&id=0&action=Add&bt=Bmenuid=0")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Expenditure
	 * @throws InterruptedException 
     * @name Click Expenditure
     */
	public void Click_Expenditure() throws InterruptedException
	{
        
		WebElement elem = getWebElement(ExpenditureElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Expenditure", "Click_Expenditure failed. Unable to locate object: " + ExpenditureElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Expenditure", "Click_Expenditure failed. Unable to locate object: " + ExpenditureElem.toString());

			Assert.fail("Unable to locate object: " + ExpenditureElem.toString());
        }

		ClosePopup.ValidateAndPopUp(m_Driver);
		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Expenditure");

		TestModellerLogger.PassStep(m_Driver, "Click_Expenditure");
	}

     
	/**
 	 * Click New 
     * @name Click New 
     */
	public void Click_New_()
	{
        
		WebElement elem = getWebElement(New_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_New_", "Click_New_ failed. Unable to locate object: " + New_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_New_", "Click_New_ failed. Unable to locate object: " + New_Elem.toString());

			Assert.fail("Unable to locate object: " + New_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_New_");

		TestModellerLogger.PassStep(m_Driver, "Click_New_");
	}

     
	/**
 	 * Click  New Supplier Bill 
     * @name Click  New Supplier Bill 
     */
	public void Click__New_Supplier_Bill_()
	{
        
		WebElement elem = getWebElement(_New_Supplier_Bill_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__New_Supplier_Bill_", "Click__New_Supplier_Bill_ failed. Unable to locate object: " + _New_Supplier_Bill_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__New_Supplier_Bill_", "Click__New_Supplier_Bill_ failed. Unable to locate object: " + _New_Supplier_Bill_Elem.toString());

			Assert.fail("Unable to locate object: " + _New_Supplier_Bill_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__New_Supplier_Bill_");

		TestModellerLogger.PassStep(m_Driver, "Click__New_Supplier_Bill_");
	}

     
	/**
 	 * Click getDropdounData
	 * @throws IOException 
	 * @throws InvalidFormatException 
	 * @throws EncryptedDocumentException 
	 * @name Click getDropdounData
     */
	public void Click_getDropdounData() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
        
		WebElement elem = getWebElement(getDropdounDataElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getDropdounData", "Click_getDropdounData failed. Unable to locate object: " + getDropdounDataElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getDropdounData", "Click_getDropdounData failed. Unable to locate object: " + getDropdounDataElem.toString());

			Assert.fail("Unable to locate object: " + getDropdounDataElem.toString());
        }

		elem.click();
		
		List<WebElement> ExpenditureData=m_Driver.findElements(By.xpath("//*[@id='select2-ctl00_cPH_rptrProduct_ctl00_ltAccount-results']/li/ul/li")); 
          System.out.println(ExpenditureData.size());
		
		String[] ExpData=new String[ExpenditureData.size()];
		
		int i=0;
		for(WebElement dd:ExpenditureData)
		{
			String out=dd.getText();
		//	System.out.println(out);
			ExpData[i]=out;
////			System.out.println(ExpData[i]);
			i++;
		}
		
/**
 * Declare Third list		
 */
//		List<Array> li3=new ArrayList<Array>();
		List<String> li4=new ArrayList<String>();
	//	li4.add(0, "string");
/**
 * Reading Excel		
 */
		FileInputStream fis = new FileInputStream("D:\\vikash\\Ticets Detail\\Pending Tickets\\Test cases PAYR-2078- Payment for Month(Tester status).xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sht = wb.getSheet("Sheet1");
		int iRowNum= sht.getLastRowNum();
		System.out.println("Excel totoal records :"+iRowNum);

		 String[] arr=new String[iRowNum];
		for(int j=1; j<=iRowNum; j++)
		{
		String ste=sht.getRow(j).getCell(0).toString();
		arr[j-1]=ste;
////		System.out.println("Excel List :" +ste);
		}
		
		
	int indexcount=0;	
		
/**
 * Matching Data		
 */
		for(int l=0;l<ExpenditureData.size();l++)
		{
			
			for(int n=0;n<iRowNum;n++)
			{
				
				if(ExpData[l].contains(arr[n]))
						{
							count++;
							System.out.println(arr[n]+"="+ExpData[l]);
							
							
							li4.add(indexcount, arr[n]);
				//			li3.add(arr[n]);
						//	System.out.println("li3="+li3[indexcount]);
							indexcount++;
						
							
						}
				
			}
			
		}
		SoftAssert af=new SoftAssert();	
int index2count=0;
		for(int i2=0; i2<arr.length;i2++)
		{
			
		//	System.out.println(li4.get(i2));
			index2count=0;
			for(int j=0;j<li4.size();j++)
			{
				
				if(arr[i2].equalsIgnoreCase(li4.get(j)))
				{
					
					System.out.println(arr[i2]+"="+li4.get(j));
					
					
					index2count++;
					break;
	
				}
//				else
//				{
//					index2count++;
//					assertEquals(arr[i2], 0,"Text not match"+arr[i2]);
//				}
				
			}
			
			
			
			if(index2count==0)
			{
				
				af.assertEquals(0, 1,"Text not match="+arr[i2]);
				
			}
		
		}
		
		af.assertAll();

		ExtentReportManager.passStep(m_Driver, "Click_getDropdounData");

		TestModellerLogger.PassStep(m_Driver, "Click_getDropdounData");
		
		
	}
	
	
	/**
	 * Bank rules TC2
	 * 
	 */
	public void tc2bank()
	{
		
		
		m_Driver.findElement(By.xpath("//*[@id='ctl00_SideMenu1_bankingMenu']/a")).click();
		
		m_Driver.findElement(By.xpath("//A[contains(text(),'View')]")).click();
		
		m_Driver.findElement(By.xpath("//A[@id='ctl00_cpHeaderRight_LinkButtonEx3']")).click();
		
		
		
	}
	
	
	/**
	 * Save rule data
	 * @throws IOException 
	 * @throws InvalidFormatException 
	 * @throws EncryptedDocumentException 
	 */
	public void enterFrsmedata() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
			m_Driver.findElement(By.xpath("//A[@id='ctl00_cpHeaderRight_btnAdd']")).click();	
		//	m_Driver.navigate().refresh();
			
			
			
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/div/div/div[2]/iframe")));
			
			System.out.println("switched");
			
			Thread.sleep(1000);
			
			m_Driver.findElement(By.xpath("//*[@id='select2-ctl00_cPH_rptrParam_ctl01_ltAccount-container']")).click();
			
		data1=m_Driver.findElements(By.xpath("//*[@id='select2-ctl00_cPH_rptrParam_ctl01_ltAccount-results']/li/ul/li"));
//		System.out.println(data1.get(0).getText());

		
		
		size=data1.size();
		System.out.println(size+"list size");
		

		for(i=0;i<size;i++)
		{

		System.out.println(data1.get(i).getText());

		}
		
//		WebElement save1=m_Driver.findElement(By.xpath("//A[@id='ctl00_cphFooter_btnSave']")); 
 //		jsExec.executeScript("arguments[0].scrollIntoView();", save1);
 		
 		System.out.println("Hello1");
 	//	Thread.sleep(1000);
 //		jsExec.executeScript("arguments[0].click();", save1);
 		m_Driver.findElement(By.xpath("//*[contains(text(),'VATRateType')]")).click();
		

		m_Driver.switchTo().defaultContent();
		

				        for(i=0;i<size;i++)
				        {
				        	
				        	if(i!=0)
				        	{
				        //		m_Driver.findElement(By.xpath("//A[@id='ctl00_cpHeaderRight_btnAdd']")).click();	
				        		jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//A[@id='ctl00_cpHeaderRight_btnAdd']")));
				        	//	m_Driver.navigate().refresh();
				        	}
				        	
				        	System.out.println("value of i="+i);
				        	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/div/div/div[2]/iframe")));
				        	
				        	System.out.println("value of i after switched="+i);
//				        	jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='select2-ctl00_cPH_rptrParam_ctl01_ltAccount-container']")));
				        	m_Driver.findElement(By.xpath("//*[@id='select2-ctl00_cPH_rptrParam_ctl01_ltAccount-container']")).click();
				        	
				        	data1=m_Driver.findElements(By.xpath("//*[@id='select2-ctl00_cPH_rptrParam_ctl01_ltAccount-results']/li/ul/li"));
				        	
				        	


					  String p =data1.get(i).getText();
			        	System.out.print("box2==" +p );
		//	        	 Thread.sleep(1000);
				  		 m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(p); 
		//		  		 Thread.sleep(1000);
				  		m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
		//		  		 Thread.sleep(3000);
				  		String filled="Rule1 is"+i;
		        	m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrParam_ctl00_txtParamValue']")).sendKeys(filled);
		//        	 Thread.sleep(1000);
				        	m_Driver.findElement(By.xpath("//*[contains(text(),'VATRateType')]")).click();
		//		        	 Thread.sleep(1000);
				  		 //Vat Rate Type Selection
				  		 WebElement elem1=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPH$rptrParam$ctl02$ddVatRateType']")); 
				  		Select dropdown1 = new Select(elem1);

				 		dropdown1.selectByVisibleText("Standard Rate");
		//		 		 Thread.sleep(1000);
				 		System.out.println("Hello1");
				 		
				 		//Transaction Type Code
				 		
				 		WebElement elem2=m_Driver.findElement(By.xpath("//SELECT[@name='ctl00$cPH$rptrParam$ctl03$ddType']")); 
				  		Select dropdown2 = new Select(elem2);

				 		dropdown2.selectByVisibleText("Both");
				 		
				 		System.out.println("Hello2");
				 		
				 		utilities.nidhiexcel.rulecreate("Sheet1", i, 5, filled);
				 		
				 		//Click Save
		//		 		Thread.sleep(1000);
				 		WebElement save1=m_Driver.findElement(By.xpath("//A[@id='ctl00_cphFooter_btnSave']")); 
				 		jsExec.executeScript("arguments[0].scrollIntoView();", save1);
				 		
				 		System.out.println("Hello1");
				 	//	Thread.sleep(1000);
				 		save1.click();
				 		
				 		Thread.sleep(2000);
				 		
				 		
				 		/**
				 		 * Reading Excel		
				 		 */
//				 				File src=new File("D:\\vikash\\Ticets Detail\\Done Tickets\\Test cases PAYR-2078- Payment for Month(Tester status).xlsx");
//				 				FileInputStream fis = new FileInputStream(src);
//				 				Workbook wb = WorkbookFactory.create(fis);
//				 				Sheet sht = wb.getSheet("Sheet1");
//					 				sht.getRow(i).createCell(1).setCellValue(filled);
//					 		//		sht.cre
//				 				FileOutputStream fout=new FileOutputStream(src);
//				 				wb.write(fout);
//				 				wb.close();

				 		
						m_Driver.switchTo().defaultContent();
				  		  
				  		  
				        }
				        
				        
				        
	
	}
	
	
	
	
}