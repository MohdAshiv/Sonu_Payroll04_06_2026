package _2155Page;

import static org.testng.Assert.assertEquals;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import pages.BasePage;
import utilities.ChangeWindow;

public class Verify_ExpectedResults  extends BasePage{

	public Verify_ExpectedResults(WebDriver driver) {
		super(driver);
		
	}

	static String PDFtext;
	SoftAssert soft= new SoftAssert();
	
	public void payWorkedOut(String expectedDropdown, String expectedUnit,String expectedRate )
	{
		
		Select select = new Select(m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrUnit_ctl00_ddlPayrollContractTypeCode']")));
		WebElement option = select.getFirstSelectedOption();
	    String SelectedText = option.getText();
		
	    soft.assertEquals(SelectedText, expectedDropdown, "not as expected");
	    
	   String unit= m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrUnit_ctl00_txtUnit10']")).getAttribute("value");
		
	   soft.assertEquals(unit, expectedUnit, "expected unit not matched");
	   
	   
	   String rate= m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrUnit_ctl00_txtUnit10Rate']")).getAttribute("value");
	   soft. assertEquals(rate, expectedRate, "expected rate not matched");
	   
	   Reporter.log("Verify Unit Rates under process pay");
	}
	
	
	
	
	
	
	
	
	
	public void payWorkedOut1(String expectedDropdown,String expectedRate )
	{
		
		Select select = new Select(m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrUnit_ctl00_ddlPayrollContractTypeCode']")));
		WebElement option = select.getFirstSelectedOption();
	    String SelectedText = option.getText();
		
	    soft.assertEquals(SelectedText, expectedDropdown, "not as expected");
	    
	    String rate= m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrUnit_ctl00_txtUnit10Rate']")).getAttribute("value");
	   soft. assertEquals(rate, expectedRate, "expected rate not matched");
	   
	   Reporter.log("Verify Unit Rates under process pay");
	}
	
	
	
	
	public void verifyFuturePayroll(String expectedGross)
	{
		
		     List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div[2]/div/div/div/table/tbody/tr/td[1]"));
		
		     
		     for(int i=1;i<=list.size()-1;i++)
		     {
		    	 
		    	    String ActualGross = list.get(i).getText();
		    	soft.assertEquals(ActualGross, expectedGross);
		    	    
		    	
		     }
		     
		     Reporter.log("Verify future payroll");
		
	}
	
	public void verifyFuturePayroll1(String expectedGross)
	{
		
		     List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div[2]/div/div/div/table/tbody/tr/td[1]"));
		
		     
		     for(int i=2;i<=list.size()-1;i++)
		     {
		    	
		    	    String ActualGross = list.get(i).getText();
		    	soft.assertEquals(ActualGross, expectedGross);
		    	    
		    	
		     }
		     
		     Reporter.log("Verify future payroll");
		
	}
	
	public void payslip( String grosspay,String unit,String rate) throws  Exception
	{
		
		
	  m_Driver.findElement(By.xpath("//*[@id='myTable1']/tbody/tr[2]/td[23]/a")).click(); 
		ChangeWindow.tabswitch(m_Driver);
		
		Thread.sleep(6000);
		
		utilities.TakeScreenshot.Getscreenshot("TC094_Verify payslip ", "2155", m_Driver);
		Robot robot = new Robot();
		// press Ctrl+S the Robot's way
		
		
		for (int i = 0; i <= 7; i++) {
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(2000);
		}
		
	
			 robot.keyPress(KeyEvent.VK_ENTER);
	         robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
	
			 robot.keyPress(KeyEvent.VK_ENTER);
	         robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
	
          
			File file = new File("C:\\Users\\Sonu\\Downloads\\Employee-Payslip-Mr. Sonu Rajput-30_04_2023.pdf");
			PDDocument document = PDDocument.load(file);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			PDFtext = pdfStripper.getText(document);
			
			//System.out.println(PDFtext);
			document.close();
			
		Assert.assertTrue(PDFtext.contains(grosspay),"grosspay");
		Assert.assertTrue(PDFtext.contains(unit),"unit");
		Assert.assertTrue(PDFtext.contains(rate),"rate");
		
		
	
		Reporter.log("Verify All data on payslip");
	
				    if(file.delete())
				    System.out.println("file deleted");
				
	}
	
	public void payslip2( String grosspay,String unit,String rate) throws  Exception
	{
		
		
	  m_Driver.findElement(By.xpath("//*[@id='myTable1']/tbody/tr[2]/td[23]/a")).click(); 
		ChangeWindow.tabswitch(m_Driver);
		
		Thread.sleep(6000);
		
		utilities.TakeScreenshot.Getscreenshot("TC096_Verify payslip ", "2155", m_Driver);
		Robot robot = new Robot();
		// press Ctrl+S the Robot's way
		
		
		for (int i = 0; i <= 7; i++) {
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(2000);
		}
		
		
			 robot.keyPress(KeyEvent.VK_ENTER);
	         robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
		
			 robot.keyPress(KeyEvent.VK_ENTER);
	         robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
		
			File file = new File("C:\\Users\\Sonu\\Downloads\\Employee-Payslip-Mr. Sonu Rajput-30_04_2023.pdf");
			PDDocument document = PDDocument.load(file);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			PDFtext = pdfStripper.getText(document);
			
			//System.out.println(PDFtext);
			document.close();
			
		Assert.assertTrue(PDFtext.contains(grosspay),"grosspay");
		Assert.assertTrue(PDFtext.contains(unit),"unit");
		Assert.assertTrue(PDFtext.contains(rate),"rate");
		
		
	
		Reporter.log("Verify All data on payslip");
	
				    if(file.delete())
				    System.out.println("file deleted");
				
	}
	public void payrollDashboard(String Gross)
	{
		
	String	actualGross=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[2]/td[5]")).getText();
		
	 soft. assertEquals(actualGross, Gross );
	 
	 Reporter.log("Verify Payroll Dashboard");
	}
	
	
	public void individualEmployeePaySchedule(String Gross)
	{
		
		String	actualGross=m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[3]/div/div/div/div/div/table/tbody/tr[3]/td[3]")).getText();
		
		soft. assertEquals(actualGross, Gross );
		 
		Reporter.log("Verify Individual Employee Pay Schedule");
	}
	
	public void payrollSummary(String Gross)
	{
		
		String actualGross=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Sonu Rajput')]//following::td/div/div")).get(8).getText();
		
		soft. assertEquals(actualGross, Gross );
		 
		Reporter.log("Verify Payroll Summary");
	}
	
	
	public void payrollReportingPeriodSummary(String basicPay)
	{
		
		String	actualBacisPay=m_Driver.findElement(By.xpath("//*[@class='rowFinal']/td[3]")).getText();
		
		soft. assertEquals(actualBacisPay, basicPay );
		
		Reporter.log("Verify Payroll Reporting Period Summary");
	}
	
	
	public void assertAll()
	{
		soft.assertAll();
		
		
	}
}
