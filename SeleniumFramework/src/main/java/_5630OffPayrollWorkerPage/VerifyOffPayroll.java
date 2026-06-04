package _5630OffPayrollWorkerPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import pages.BasePage;
import utilities.ChangeWindow;

public class VerifyOffPayroll extends BasePage {

	public VerifyOffPayroll(WebDriver driver) {
		super(driver);
	
	}

	private static String PDFtext;
	private static String gross;
	
	private static String incomeTax;

	private static String employeeNI;
	private static String netPay;
	private static String employerNI;
	SoftAssert soft= new SoftAssert();
	
	
	WebElement textArea1;
	private By getXMLDataElem = By.xpath("//TEXTAREA[@name='ctl00$ctl00$ParentContent$cPH$txtData']");

	public void verifyOffPayWorkerDisable()
	{
		try {
			
		WebElement yes = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_rblOffPayWorker_0']"));
			
	
		System.out.println("OffPayrollReturning--"+yes.isEnabled());
		
		soft.assertFalse(yes.isEnabled());
		Reporter.log("verifyOffPayWorkerDisable");

		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verifyOffPayWorkerDisable"+e);
		}
		
		
	}
	
	
	
	
	public void verifyOffPayWorkerDirectorDisable()
	{
		try {
			
		jsExec.executeScript("window.scrollBy(0,250)", "");
		WebElement yes = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_rbIsDirector_0']"));
			
	
		System.out.println("Director returning--"+yes.isEnabled());
		
		soft.assertFalse(yes.isEnabled());
		Thread.sleep(1000);
		} catch (Exception e) {
		
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verifyOffPayWorkerDirectorDisable"+e);
		}
		
		Reporter.log("verifyOffPayWorkerDirectorDisable");
		
	}
	

	public void verifyStudentLoanDisable()
	{
		try {
			
		WebElement StudentLoan = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_ddlStudentLoan']"));
			
	
		System.out.println("StudentLoan returning--"+StudentLoan.isEnabled());
		
		soft.assertFalse(StudentLoan.isEnabled());
		Thread.sleep(1000);
		
		
		WebElement PostgraduateLoan = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_ddlPostGraduateLoan']"));
		
		
		System.out.println("PostgraduateLoan returning--"+PostgraduateLoan.isEnabled());
		
		soft.assertFalse(PostgraduateLoan.isEnabled());
		Thread.sleep(2000);
		
		
		
		} catch (Exception e) {
		
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verifyStudentLoanDisable"+e);
		}
		
		Reporter.log("verifyStudentLoanDisable");
		
	}
	
	
	
	public void verifyOffPayWorkerNotSelected()
	{
		try {
			
		WebElement yes = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_rblOffPayWorker_0']"));
			
	
		System.out.println("OffPayrollReturning--"+yes.isSelected());
		
		soft.assertFalse(yes.isSelected());
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");
			
			System.out.println("Issue IN verifyOffPayWorkerNotSelected"+e);
		}
		
		Reporter.log("verifyOffPayWorkerNotSelected");
		
	}
	
	

	public void verifyOffPayWorkerSelected()
	{
		try {
			
		WebElement yes = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_rblOffPayWorker_0']"));
			
	
		System.out.println("OffPayrollReturning--"+yes.isSelected());
		
		soft.assertTrue(yes.isSelected());
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			
			System.out.println("Issue IN verifyOffPayWorkerSelected"+e);
		}
		
		Reporter.log("verifyOffPayWorkerSelected");
		
	}
	
	
	
	

	public void verifyOffPayWorkerEnabled()
	{
		try {
			
		WebElement yes = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_rblOffPayWorker_0']"));
			
	
		System.out.println("OffPayrollReturning--"+yes.isEnabled());
		
		soft.assertTrue(yes.isEnabled());
		} catch (Exception e) {
		
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verifyOffPayWorkerDisable"+e);
		}
		
		Reporter.log("verifyOffPayWorkerEnabled");
		
	}
	
	

	
	
	
	
	public void verifyOffPayWorkerPopupAppear(String expectedTitle)
	{
		try {
			
		WebElement title = m_Driver.findElement(By.xpath("//*[@id='dvOffPayrollWorkerPopup']/div/div/div[1]/h4"));
			
	
		System.out.println("OffPayrollTitle--"+title.getText());
		
		soft.assertEquals(title.getText(), expectedTitle);
		Thread.sleep(2000);
		} catch (Exception e) {
		
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verifyOffPayWorkerPopupAppear"+e);
		}
		
		Reporter.log("verifyOffPayWorkerPopupAppear");
		
	}
	
	
	public void getPayrollCaluclations()
	{
		
		 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr[2]/td[contains(text(),'£')]"));
		
		   gross = list.get(0).getText();
		   

		   incomeTax = list.get(1).getText();
		   
			employeeNI = list.get(2).getText();
		
			netPay=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords_ctl02_lblNetSalary']")).getText();
		  
			employerNI = list.get(3).getText();

		
	}
	
	

	
	public void verifyPayrollCalculations()
	{
		
		try {
			
			 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr[2]/td[contains(text(),'£')]"));

			
			soft.assertEquals(gross, list.get(0).getText(), "gross Not as expected");
			
			soft.assertEquals(incomeTax, list.get(1).getText(), "incomeTax Not as expected");

			soft.assertEquals(employeeNI, list.get(2).getText(), "employeeNI Not as expected");

			soft.assertEquals(netPay, m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords_ctl02_lblNetSalary']")).getText(), "netPay Not as expected");

			soft.assertEquals(employerNI,  list.get(3).getText(), "employerNI Not as expected");

			
			
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

		System.out.println("Issue IN verifyPayrollCalculations"+e);
		}
		
		Reporter.log("verifyPayrollCalculations");
	}
	
	public void verifyPayrollCalculationsEmployerView()
	{
		
		try {
			 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr[2]/td[contains(text(),'£')]"));
			
			
			soft.assertEquals(gross, list.get(0).getText() , "gross Not as expected");
			
			soft.assertEquals(incomeTax, list.get(1).getText(), "incomeTax Not as expected");

			soft.assertEquals(employeeNI, list.get(2).getText(), "employeeNI Not as expected");

			soft.assertEquals(netPay, list.get(3).getText(), "netPay Not as expected");

			soft.assertEquals(employerNI,  list.get(4).getText(), "employerNI Not as expected");

			
			
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

		System.out.println("Issue IN verifyPayrollCalculations"+e);
		}
		
		Reporter.log("verifyPayrollCalculations");
	}
	
	
	public void verifyAlertMsg()
	{
		
		try {
			String alert = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[1]")).getText();
			
			String alertMsg = alert.replaceAll("×", "").trim();
			System.out.println(alertMsg);
			soft.assertEquals(alertMsg, "Error! This type of leave cannot be claimed by an off-payroll worker.");
			
			
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue in verifyAlertMsg"+e);
		}
		Reporter.log("verifyAlertMsg");
	}
	
	
	
	
	public void verifyLeaveAddAlertMsg()
	{
		
		try {
			String alert = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[1]")).getText();
			
			String alertMsg = alert.replaceAll("×", "").trim();
			System.out.println(alertMsg);
			soft.assertEquals(alertMsg, "Success! Leave record is Saved successfully.");
			
			
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue in verifyAlertMsg"+e);
		}
		Reporter.log("verifyAlertMsg");
	}
	
	
	public void verifyTagsAndText()
	{
		
		String value3 ="Statutory Paternity Pay";
		WebElement select_drop_down = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ddlLeaveType']"));
		
		Select select = new Select(select_drop_down);
		
		String [] verify=  {"Maternity","Sick Leave","Holiday","Unpaid Leave","Other"};
	     int k=0;
		List<WebElement> all_options = select.getOptions();
		
		int data=all_options.size();
		
		

		for(int j=0;j<=all_options.size()-1;j++)
		{
			

			boolean con =false;
			List<WebElement> all_options2 = select.getOptions();
			String value=all_options2.get(j).getText();
			System.out.println(value);
	
			if(!value.equals(value3))
			{
				con=true;
			
			
			}
			soft.assertTrue(con);
			
			if(con==false)
			{
				
				System.out.println("This value should not visble-"+value);
				Reporter.log("----" +value+ "Should not Contains----");
			}
			
			
			//soft .assertEquals(verify[k], value);
			
			
		}
		
		k++;	
		}
		
	
		
	
	public void verifyListCountDropdown()
	{
		
		
		try {
			
			WebElement select_drop_down = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ddlLeaveType']"));
			
			Select select = new Select(select_drop_down);
			
			List<WebElement> all_options = select.getOptions();
			
			int data=all_options.size();
			
			soft.assertEquals(data, 5);
			
			
			
		

		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue In dropdownList"+e);
		}
		
		Reporter.log("verifyListCountDropdown");
		
	}
	
	
	
	
	
	public void verifyNetPay(String expectedNetPay)
	{
		
		try {
			String netPayment = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords_ctl02_lblNetSalary']")).getText();

			System.out.println("NetPayment--"+netPayment);
			
			soft.assertEquals(netPayment, expectedNetPay);

			
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue in verifyNotinalPay"+e);
		}
		
		Reporter.log("verifyNotinalPay");
		
	}
	
	
	
	
	
	public void netTaxNIGrossYTD1(String expextedTax , String expectedEmployeeNI,String expectedEmployerNI, String expectedNet,String expectedGross )
	{
		try {
			 m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));
			 
				String taxYTD = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[16]/div")).getText();
				String employeeNI = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[14]/div")).getText();
				String employerNI = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[17]/div")).getText();
				String net = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[15]/div")).getText();
			    String gross= m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[13]/div")).getText();
			     
			     
			    
				soft.assertEquals(taxYTD, expextedTax, "expected result not matched");
				soft.assertEquals(employeeNI, expectedEmployeeNI, "expected result not matched");
				soft.assertEquals(employerNI, expectedEmployerNI, "expected result not matched");
				soft.assertEquals(net, expectedNet, "expected result not matched");
				soft.assertEquals(gross, expectedGross, "expected result not matched");
				
			
				
				m_Driver.switchTo().defaultContent();
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue In netTaxNIGrossYTD1"+e);
		}
		
		
		Reporter.log("Verify net tax NI figure");
		
		
	}
	
	public void verifyAoePayement(String expectedaOE)
	{
		try {
			 String aOE = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div/div[1]/div[2]/div/div[2]/div/div[2]")).getText();
			
			 
			 System.out.println("verifyAoePayement"+ aOE);
			 soft.assertEquals(aOE, expectedaOE, "expected result not matched");

		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

		  System.out.println("Issue In verifyAoePayement"+e);
		}
		
	}
	
	
	public void verifyEmployeeEmployerPension(String expectedEmployeePension, String expectedEmployerPension)
	{
		try {
			
			 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr[2]/td[contains(text(),'£')]"));
				
			 String  employeePension = list.get(3).getText();
			   
             System.out.println( "employeePension= "+employeePension);
			 String employerPension = list.get(5).getText();
			 
			 System.out.println( "employerPension= "+employerPension);
			 
			 soft.assertEquals(employeePension, expectedEmployeePension, "expected employee Pension result not matched");

			 soft.assertEquals(employerPension, expectedEmployerPension, "expected employer Pension result not matched");

		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Isssue In verifyPension"+e);
		}
		
		Reporter.log("verifyEmployeeEmployerPension");
	}
	
	public void verifyEmployeeEmployerPension2(String expectedEmployeePension, String expectedEmployerPension)
	{
		try {
			
			 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr[3]/td[contains(text(),'£')]"));
				
			 String  employeePension = list.get(3).getText();
			   
             System.out.println( "employeePension= "+employeePension);
			 String employerPension = list.get(5).getText();
			 
			 System.out.println( "employerPension= "+employerPension);
			 
			 soft.assertEquals(employeePension, expectedEmployeePension, "expected employee Pension result not matched");

			 soft.assertEquals(employerPension, expectedEmployerPension, "expected employer Pension result not matched");

		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Isssue In verifyPension"+e);
		}
		
		Reporter.log("verifyEmployeeEmployerPension");
	}
	
	
	public void verifyTaxPaymentReport(String incomeTax, String employeeNI, String employerNI,String employementAllowance)
	{
		double valueSum = 0;
		double valueSum1 = 0;

		double valueSum2 = 0;
		double valueSum3 = 0;


		String totalTaxSum = null;
		String totalEmployeeNI = null;
		String totalEmployerNI = null;
		String totalEmploymentAllownce = null;
		
		try {
			List<WebElement> list = m_Driver
					.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr/td[10]"));

		
			
			for (int i = 0; i < list.size() - 1; i++) {
				
				String value = list.get(i).getText();
				value = value.replaceAll("[£]", "");
				value = value.replaceAll("[,]", "");

				valueSum = valueSum + Double.parseDouble(value);
				totalTaxSum = String.format("%.2f", valueSum);

			}
			System.out.println("totalTax Sum- "+totalTaxSum);

			soft.assertEquals(totalTaxSum, incomeTax);

			List<WebElement> list1 = m_Driver
					.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr/td[1]"));

			for (int i = 0; i < list.size() - 1; i++) {
				String value = list1.get(i).getText();
				value = value.replaceAll("[£]", "");
				value = value.replaceAll("[,]", "");

				valueSum1 = valueSum1 + Double.parseDouble(value);
				totalEmployeeNI = String.format("%.2f", valueSum1);

			}
			System.out.println("totalEmployeeNI- "+totalEmployeeNI);

			soft.assertEquals(totalEmployeeNI, employeeNI);

			List<WebElement> list2 = m_Driver
					.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr/td[2]"));

			for (int i = 0; i < list.size() - 1; i++) {
				String value = list2.get(i).getText();
				value = value.replaceAll("[£]", "");
				value = value.replaceAll("[,]", "");

				valueSum2 = valueSum2 + Double.parseDouble(value);
				totalEmployerNI = String.format("%.2f", valueSum2);

			}
			System.out.println("totalEmployerNI- "+totalEmployerNI);


			soft.assertEquals(totalEmployerNI, employerNI);

			List<WebElement> list3 = m_Driver
					.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr/td[11]"));

			for (int i = 0; i < list.size() - 1; i++) {
				String value = list3.get(i).getText();
				value = value.replaceAll("[£]", "");
				value = value.replaceAll("[,]", "");

				valueSum3 = valueSum3 + Double.parseDouble(value);
				totalEmploymentAllownce = String.format("%.2f", valueSum3);

			}
			System.out.println("totalEmploymentAllownce- "+totalEmploymentAllownce);

			soft.assertEquals(totalEmploymentAllownce, employementAllowance);

		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue in verifyTaxPaymentReport " + e);
		}

		Reporter.log("Verify Employe Allowances");
        
	}
	
	
	public void verifyTaxPaymentReportEmployerView(String incomeTax, String employeeNI, String employerNI,String employementAllowance)
	{
		double valueSum = 0;
		double valueSum1 = 0;

		double valueSum2 = 0;
		double valueSum3 = 0;


		String totalTaxSum = null;
		String totalEmployeeNI = null;
		String totalEmployerNI = null;
		String totalEmploymentAllownce = null;
		
		try {
			List<WebElement> list = m_Driver
					.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[12]"));

		
			
			for (int i = 0; i < list.size() - 1; i++) {
				
				String value = list.get(i).getText();
				value = value.replaceAll("[£]", "");
				value = value.replaceAll("[,]", "");

				valueSum = valueSum + Double.parseDouble(value);
				totalTaxSum = String.format("%.2f", valueSum);

			}
			System.out.println("totalTax Sum- "+totalTaxSum);

			soft.assertEquals(totalTaxSum, incomeTax);

			List<WebElement> list1 = m_Driver
					.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[3]"));

			for (int i = 0; i < list.size() - 1; i++) {
				String value = list1.get(i).getText();
				value = value.replaceAll("[£]", "");
				value = value.replaceAll("[,]", "");

				valueSum1 = valueSum1 + Double.parseDouble(value);
				totalEmployeeNI = String.format("%.2f", valueSum1);

			}
			System.out.println("totalEmployeeNI- "+totalEmployeeNI);

			soft.assertEquals(totalEmployeeNI, employeeNI);

			List<WebElement> list2 = m_Driver
					.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[4]"));

			for (int i = 0; i < list.size() - 1; i++) {
				String value = list2.get(i).getText();
				value = value.replaceAll("[£]", "");
				value = value.replaceAll("[,]", "");

				valueSum2 = valueSum2 + Double.parseDouble(value);
				totalEmployerNI = String.format("%.2f", valueSum2);

			}
			System.out.println("totalEmployerNI- "+totalEmployerNI);


			soft.assertEquals(totalEmployerNI, employerNI);

			List<WebElement> list3 = m_Driver
					.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[13]"));

			for (int i = 0; i < list.size() - 1; i++) {
				String value = list3.get(i).getText();
				value = value.replaceAll("[£]", "");
				value = value.replaceAll("[,]", "");

				valueSum3 = valueSum3 + Double.parseDouble(value);
				totalEmploymentAllownce = String.format("%.2f", valueSum3);

			}
			System.out.println("totalEmploymentAllownce- "+totalEmploymentAllownce);

			soft.assertEquals(totalEmploymentAllownce, employementAllowance);

		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue in verifyTaxPaymentReport " + e);
		}

		Reporter.log("Verify Employe Allowances");
        
	}
	
	
	
	public void verifyIndividualPaySchedule(String incomeTax, String employeeNI, String employerNI,String netPayment)
	{
		try {
			
		     List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='rowFinal']/td"));
		     
		     String taxPayment = list.get(4).getText();
		     taxPayment = taxPayment.replaceAll("[£]", "");
		     taxPayment = taxPayment.replaceAll("[,]", "");
		     
			 System.out.println("taxPayment-- "+taxPayment);
			
		     soft.assertEquals(taxPayment, incomeTax);

			 String employeeNi = list.get(5).getText();
			 employeeNi = employeeNi.replaceAll("[£]", "");
		     employeeNi = employeeNi.replaceAll("[,]", "");
			 System.out.println("employeeNi--"+employeeNi);
			 
		     soft.assertEquals(employeeNi, employeeNI);

			 
			 String employerNi = list.get(10).getText();
			 employerNi = employerNi.replaceAll("[£]", "");
			 employerNi = employerNi.replaceAll("[,]", "");
			 System.out.println("employerNi--"+employerNi);
			 
		     soft.assertEquals(employerNi, employerNI);

			 
			 String netPay = list.get(9).getText();
			 netPay = netPay.replaceAll("[£]", "");
			 netPay = netPay.replaceAll("[,]", "");
			 System.out.println("netPay--"+netPay);
		     
		     soft.assertEquals(netPay, netPayment);

			System.out.println("taxPayment--"+taxPayment);
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue In verifyIndividualPaySchedule"+e);
		}
		
		Reporter.log(" verifyIndividualPaySchedule");

        
	}
	
	
	public void verifyPayrollSummary(String incomeTax, String employeeNI, String employerNI,String netPayment)
	{
		try {
			
		     List<WebElement> list = m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Total')]//following::td/div/div"));
		     
		     System.out.println(list.size());
		     String taxPayment = list.get(1).getText();
		     taxPayment = taxPayment.replaceAll("[£]", "");
		     taxPayment = taxPayment.replaceAll("[,]", "");
		     
			 System.out.println("taxPayment-- "+taxPayment);
			
		     soft.assertEquals(taxPayment, incomeTax);

			 String employeeNi = list.get(4).getText();
			 employeeNi = employeeNi.replaceAll("[£]", "");
		     employeeNi = employeeNi.replaceAll("[,]", "");
			 System.out.println("employeeNi--"+employeeNi);
			 
		     soft.assertEquals(employeeNi, employeeNI);

			 
			 String employerNi = list.get(6).getText();
			 employerNi = employerNi.replaceAll("[£]", "");
			 employerNi = employerNi.replaceAll("[,]", "");
			 System.out.println("employerNi--"+employerNi);
			 
		     soft.assertEquals(employerNi, employerNI);

			 
			 String netPay = list.get(5).getText();
			 netPay = netPay.replaceAll("[£]", "");
			 netPay = netPay.replaceAll("[,]", "");
			 System.out.println("netPay--"+netPay);
		     
		     soft.assertEquals(netPay, netPayment);

			System.out.println("taxPayment--"+taxPayment);
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue In verifyPayrollSummary"+e);
		}
		
		
		Reporter.log("verifyPayrollSummary");
        
	}
	
	
	public void verifyPayrollReportingPeriodSummary(String incomeTax, String employeeNI, String employerNI,String netPayment)
	{
		try {
			
		     List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='rowFinal']/td"));
		     
		     System.out.println(list.size());
		     String taxPayment = list.get(4).getText();
		     taxPayment = taxPayment.replaceAll("[£]", "");
		     taxPayment = taxPayment.replaceAll("[,]", "");
		     
			 System.out.println("taxPayment-- "+taxPayment);
			
		     soft.assertEquals(taxPayment, incomeTax);

			 String employeeNi = list.get(5).getText();
			 employeeNi = employeeNi.replaceAll("[£]", "");
		     employeeNi = employeeNi.replaceAll("[,]", "");
			 System.out.println("employeeNi--"+employeeNi);
			 
		     soft.assertEquals(employeeNi, employeeNI);

			 
			 String employerNi = list.get(10).getText();
			 employerNi = employerNi.replaceAll("[£]", "");
			 employerNi = employerNi.replaceAll("[,]", "");
			 System.out.println("employerNi--"+employerNi);
			 
		     soft.assertEquals(employerNi, employerNI);

			 
			 String netPay = list.get(9).getText();
			 netPay = netPay.replaceAll("[£]", "");
			 netPay = netPay.replaceAll("[,]", "");
			 System.out.println("netPay--"+netPay);
		     
		     soft.assertEquals(netPay, netPayment);

			System.out.println("taxPayment--"+taxPayment);
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue In PayrollReportingPeriodSummary"+e);
		}
		
		
		Reporter.log("verifyPayrollReportingPeriodSummary");
        
	}
	
	
	public void verifyTaxPaymentReport2(String incomeTax, String employeeNI, String employerNI,String employementAllowance, String AmountDueTOHmrc)
	{
		double valueSum = 0;
		double valueSum1 = 0;

		double valueSum2 = 0;
		double valueSum3 = 0;
         double valueSum4=0;

		String totalTaxSum = null;
		String totalEmployeeNI = null;
		String totalEmployerNI = null;
		String totalEmploymentAllownce = null;
		String totalAmountDueTOHmrc=null;
		try {
			List<WebElement> list = m_Driver
					.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr/td[10]"));

		
			
			for (int i = 0; i < list.size() - 1; i++) {
				
				String value = list.get(i).getText();
				value = value.replaceAll("[£]", "");
				value = value.replaceAll("[,]", "");

				valueSum = valueSum + Double.parseDouble(value);
				totalTaxSum = String.format("%.2f", valueSum);

			}
			System.out.println("totalTax Sum- "+totalTaxSum);

			soft.assertEquals(totalTaxSum, incomeTax);

			List<WebElement> list1 = m_Driver
					.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr/td[1]"));

			for (int i = 0; i < list.size() - 1; i++) {
				String value = list1.get(i).getText();
				value = value.replaceAll("[£]", "");
				value = value.replaceAll("[,]", "");

				valueSum1 = valueSum1 + Double.parseDouble(value);
				totalEmployeeNI = String.format("%.2f", valueSum1);

			}
			System.out.println("totalEmployeeNI- "+totalEmployeeNI);

			soft.assertEquals(totalEmployeeNI, employeeNI);

			List<WebElement> list2 = m_Driver
					.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr/td[2]"));

			for (int i = 0; i < list.size() - 1; i++) {
				String value = list2.get(i).getText();
				value = value.replaceAll("[£]", "");
				value = value.replaceAll("[,]", "");

				valueSum2 = valueSum2 + Double.parseDouble(value);
				totalEmployerNI = String.format("%.2f", valueSum2);

			}
			System.out.println("totalEmployerNI- "+totalEmployerNI);


			soft.assertEquals(totalEmployerNI, employerNI);

			List<WebElement> list3 = m_Driver
					.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr/td[11]"));

			for (int i = 0; i < list.size() - 1; i++) {
				String value = list3.get(i).getText();
				value = value.replaceAll("[£]", "");
				value = value.replaceAll("[,]", "");

				valueSum3 = valueSum3 + Double.parseDouble(value);
				totalEmploymentAllownce = String.format("%.2f", valueSum3);

			}
			System.out.println("totalEmploymentAllownce- "+totalEmploymentAllownce);

			soft.assertEquals(totalEmploymentAllownce, employementAllowance);

			List<WebElement> list4 = m_Driver
					.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr/td[14]"));

			
			for (int i = 0; i < list.size() - 1; i++) {
				String value = list4.get(i).getText();
				value = value.replaceAll("[£]", "");
				value = value.replaceAll("[,]", "");

				valueSum4 = valueSum4 + Double.parseDouble(value);
				totalAmountDueTOHmrc = String.format("%.2f", valueSum4);

			}
			System.out.println("totalAmountDueTOHmrc- "+totalAmountDueTOHmrc);

			soft.assertEquals(totalAmountDueTOHmrc, AmountDueTOHmrc);

		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue in verifyTaxPaymentReport " + e);
		}

		Reporter.log("Verify Employe Allowances");
        
	}
	
	public void verifyP60OffPayWorker(String pay, String taxDeducted, String lel,String pt, String uel ,String employeePT) throws  Exception
	{
		
	
			File file = new File("C:\\Users\\Sonu\\Downloads\\P60-2022-2023-Mr. Manish Sharma.pdf");
			PDDocument document = PDDocument.load(file);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			PDFtext = pdfStripper.getText(document);
			
			//System.out.println(PDFtext);
			document.close();
			
			
		soft.assertTrue(PDFtext.contains(pay));
		soft.assertTrue(PDFtext.contains(taxDeducted));
		soft.assertTrue(PDFtext.contains(lel));
		soft.assertTrue(PDFtext.contains(pt));
		soft.assertTrue(PDFtext.contains(uel));
		soft.assertTrue(PDFtext.contains(employeePT));

		Reporter.log("verifyP60OffPayWorker");
	
				    if(file.delete())
				    System.out.println("file deleted");
				
	}
	
	
	public void verifyP60OffPayWorkerEmployee(String path,String pay, String taxDeducted, String lel,String pt, String uel ,String employeePT) throws  Exception
	{
		
	
			File file = new File(path);
			PDDocument document = PDDocument.load(file);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			PDFtext = pdfStripper.getText(document);
			
			//System.out.println(PDFtext);
			document.close();
			
			
		soft.assertTrue(PDFtext.contains(pay));
		soft.assertTrue(PDFtext.contains(taxDeducted));
		soft.assertTrue(PDFtext.contains(lel));
		soft.assertTrue(PDFtext.contains(pt));
		soft.assertTrue(PDFtext.contains(uel));
		soft.assertTrue(PDFtext.contains(employeePT));

		Reporter.log("verifyP60OffPayWorker");
	
				    if(file.delete())
				    System.out.println("file deleted");
				
	}
	
	public void verifyP60Director(String pay, String taxDeducted, String lel,String pt, String uel ,String employeePT) throws  Exception
	{
		
	
      // Thread.sleep(4000);
			File file = new File("C:\\Users\\Sonu\\Downloads\\P60-2022-2023-Mr. Sonu Kumar.pdf");
			PDDocument document = PDDocument.load(file);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			PDFtext = pdfStripper.getText(document);
			
			//System.out.println(PDFtext);
			document.close();
			
			
		soft.assertTrue(PDFtext.contains(pay));
		soft.assertTrue(PDFtext.contains(taxDeducted));
		soft.assertTrue(PDFtext.contains(lel));
		soft.assertTrue(PDFtext.contains(pt));
		soft.assertTrue(PDFtext.contains(uel));
		soft.assertTrue(PDFtext.contains(employeePT));

		Reporter.log("verifyP60Director");
	
				    if(file.delete())
				    System.out.println("file deleted");
				
	}
	
	
	
	
	public void verifyPaySlip(String netPay, String taxDeduction, String totalPayment) throws  Exception
	{
		
	
     //  Thread.sleep(4000);
			File file = new File("C:\\Users\\Sonu\\Downloads\\Employee-Payslip-Mr. Manish Kumar-31_10_2022.pdf");
			PDDocument document = PDDocument.load(file);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			PDFtext = pdfStripper.getText(document);
			
			System.out.println(PDFtext);
			document.close();
			
			
		soft.assertTrue(PDFtext.contains(netPay));
		soft.assertTrue(PDFtext.contains(taxDeduction));
		soft.assertTrue(PDFtext.contains(totalPayment));
		

		Reporter.log("verifyPaySlip");
	
				    if(file.delete())
				    System.out.println("file deleted");
				
	}
	
	
	public void verifyPaySlipEmployerView(String netPay, String taxDeduction, String totalPayment) throws  Exception
	{
		
	
       //Thread.sleep(4000);
			File file = new File("C:\\Users\\Sonu\\Downloads\\Employee-Payslip-Mr. Manish Sharma-30_04_2022.pdf");
			PDDocument document = PDDocument.load(file);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			PDFtext = pdfStripper.getText(document);
			
			//System.out.println(PDFtext);
			document.close();
			
			
		soft.assertTrue(PDFtext.contains(netPay));
		soft.assertTrue(PDFtext.contains(taxDeduction));
		soft.assertTrue(PDFtext.contains(totalPayment));
		

		Reporter.log("verifyPaySlipEmployerView");
	
				    if(file.delete())
				    System.out.println("file deleted");
				
	}
	
	public void verifyP45EmployerView( String taxDeduction, String totalPayment) throws  Exception
	{
		
	
       //Thread.sleep(4000);
			File file = new File("C:\\Users\\Sonu\\Downloads\\P45-2022-2023-Mr. Manish Sharma.pdf");
			PDDocument document = PDDocument.load(file);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			PDFtext = pdfStripper.getText(document);
			
			//System.out.println(PDFtext);
			document.close();
			
			

		soft.assertTrue(PDFtext.contains(taxDeduction));
		soft.assertTrue(PDFtext.contains(totalPayment));
		

		Reporter.log("verifyP45EmployerView");
	
				    if(file.delete())
				    System.out.println("file deleted");
				
	}
	public void verifyPayslipData(String taxableGross,String incomeTax, String employeeNI, String employerNI, String netPay) throws  Exception
	{
		
	
     //  Thread.sleep(4000);
			File file = new File("C:\\Users\\Sonu\\Downloads\\Employee-Payslip-Mr. Manish Kumar-31_10_2022.pdf");
			PDDocument document = PDDocument.load(file);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			PDFtext = pdfStripper.getText(document);
			
			//System.out.println(PDFtext);
			document.close();
			
			
		soft.assertTrue(PDFtext.contains(taxableGross));
		soft.assertTrue(PDFtext.contains(incomeTax));
		soft.assertTrue(PDFtext.contains(employeeNI));
		
		soft.assertTrue(PDFtext.contains(employerNI));

		soft.assertTrue(PDFtext.contains(netPay));

		Reporter.log("verifyPaySlip");
	
				    if(file.delete())
				    System.out.println("file deleted");
				
	}
	
	
	public void verifyPayslipDataWeekly(String taxableGross,String incomeTax, String employeeNI, String employerNI, String netPay) throws  Exception
	{
		
	
     //  Thread.sleep(4000);
			File file = new File("C:\\Users\\Sonu\\Downloads\\Employee-Payslip-Mr. Shivam Singh-11_11_2022.pdf");
			PDDocument document = PDDocument.load(file);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			PDFtext = pdfStripper.getText(document);
			
			//System.out.println(PDFtext);
			document.close();
			
			
		soft.assertTrue(PDFtext.contains(taxableGross));
		soft.assertTrue(PDFtext.contains(incomeTax));
		soft.assertTrue(PDFtext.contains(employeeNI));
		
		soft.assertTrue(PDFtext.contains(employerNI));

		soft.assertTrue(PDFtext.contains(netPay));

		Reporter.log("verifyPaySlip");
	
				    if(file.delete())
				    System.out.println("file deleted");
				
	}

	
	public void getXMLData() throws InterruptedException
 	{

		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(getXMLDataElem);
 		//m_Driver.findElement(By.xpath("//a[starts-with(text(), 'Regenerate Rti Xml')]")).click();
 		
 		Thread.sleep(2000);
 		elem=m_Driver.findElement(By.xpath("//TEXTAREA[@name='ctl00$ctl00$ParentContent$cPH$txtData']"));
 		elem.click();
 		textArea1=elem;

		m_Driver.switchTo().defaultContent();
		
		Reporter.log("Go to Xmldata");
 	
}

	
   public void verifyXMLOffPayWorker(String Nic,String NICYtd,String AtLELYTD,String LELtoPTYTD, String PTtoUELYTD,String TotalEmpNICInPd,String TotalEmpNICYTD,String EmpeeContribnsInPd,String EmpeeContribnsYTD, String OffPayrollWorker ) throws ParserConfigurationException, SAXException, IOException, InterruptedException {
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

    	String xmlText=textArea1.getText();

    	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    	DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();

    	InputSource src = new InputSource();
    	src.setCharacterStream(new StringReader(xmlText));
    	Document doc = dBuilder.parse(src);
//    	String XMLLELValue1 = doc.getElementsByTagName("TaxablePay").item(1).getTextContent();
//    	System.out.println("TaxablePay ="+XMLLELValue1);
//    	String XMLLELValue2 = doc.getElementsByTagName("TaxDeductedOrRefunded").item(0).getTextContent();
//    	System.out.println("TaxDeductedOrRefunded ="+XMLLELValue2);

    	String XMLLELValue1 = doc.getElementsByTagName("GrossEarningsForNICsInPd").item(0).getTextContent();
    	System.out.println("GrossEarningsForNICsInPd ="+XMLLELValue1);

    	String XMLLELValue2 = doc.getElementsByTagName("GrossEarningsForNICsYTD").item(0).getTextContent();
    	System.out.println("GrossEarningsForNICsYTD ="+XMLLELValue2);

    	String XMLLELValue3 = doc.getElementsByTagName("AtLELYTD").item(0).getTextContent();

    	System.out.println("AtLELYTD ="+XMLLELValue3);
    	
    	String XMLLELValue4 = doc.getElementsByTagName("LELtoPTYTD").item(0).getTextContent();
    	System.out.println("LELtoPTYTD ="+XMLLELValue4);

    	String XMLLELValue5 = doc.getElementsByTagName("PTtoUELYTD").item(0).getTextContent();
    	System.out.println("PTtoUELYTD ="+XMLLELValue5);


    	String XMLLELValue6 = doc.getElementsByTagName("TotalEmpNICInPd").item(0).getTextContent();
    	System.out.println("TotalEmpNICInPd ="+XMLLELValue6);

    	String XMLLELValue7 = doc.getElementsByTagName("TotalEmpNICYTD").item(0).getTextContent();
    	System.out.println("TotalEmpNICYTD ="+XMLLELValue7);

    	String XMLLELValue8 = doc.getElementsByTagName("EmpeeContribnsInPd").item(0).getTextContent();
    	System.out.println("EmpeeContribnsInPd ="+XMLLELValue8);

    	String XMLLELValue9 = doc.getElementsByTagName("EmpeeContribnsYTD").item(0).getTextContent();
    	System.out.println("EmpeeContribnsYTD ="+XMLLELValue9);


    	String XMLLELValue10 = doc.getElementsByTagName("OffPayrollWorker").item(0).getTextContent();
    	System.out.println("OffPayrollWorker ="+XMLLELValue10);

    	
    	
    	
    	
    	soft.assertEquals(XMLLELValue1, Nic);
    	
    	soft.assertEquals(XMLLELValue2, NICYtd);
    	
    	soft.assertEquals(XMLLELValue3, AtLELYTD);
         
        soft.assertEquals(XMLLELValue4, LELtoPTYTD);

        soft.assertEquals(XMLLELValue5, PTtoUELYTD);
        soft.assertEquals(XMLLELValue6, TotalEmpNICInPd);
        soft.assertEquals(XMLLELValue7, TotalEmpNICYTD);
        soft.assertEquals(XMLLELValue8, EmpeeContribnsInPd);
        soft.assertEquals(XMLLELValue9, EmpeeContribnsYTD);
        soft.assertEquals(XMLLELValue10, OffPayrollWorker);

    	
    	
    	m_Driver.switchTo().defaultContent();
    	
    	
    	jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//button[@type='button']")));
		Thread.sleep(2000);
 		
	//	jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeading_ddlPayrollFrequency']")));
    	
   
    	Reporter.log("verify XML");	
}

	
   
   public void verifyXMLDirector(String Nic,String NICYtd,String AtLELYTD,String LELtoPTYTD, String PTtoUELYTD,String TotalEmpNICInPd,String TotalEmpNICYTD,String EmpeeContribnsInPd,String EmpeeContribnsYTD ) throws ParserConfigurationException, SAXException, IOException, InterruptedException {
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

   	String xmlText=textArea1.getText();

   	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
   	DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();

   	InputSource src = new InputSource();
   	src.setCharacterStream(new StringReader(xmlText));
   	Document doc = dBuilder.parse(src);
//   	String XMLLELValue1 = doc.getElementsByTagName("TaxablePay").item(1).getTextContent();
//   	System.out.println("TaxablePay ="+XMLLELValue1);
//   	String XMLLELValue2 = doc.getElementsByTagName("TaxDeductedOrRefunded").item(0).getTextContent();
//   	System.out.println("TaxDeductedOrRefunded ="+XMLLELValue2);

   	String XMLLELValue1 = doc.getElementsByTagName("GrossEarningsForNICsInPd").item(1).getTextContent();
   	System.out.println("GrossEarningsForNICsInPd ="+XMLLELValue1);

   	String XMLLELValue2 = doc.getElementsByTagName("GrossEarningsForNICsYTD").item(1).getTextContent();
   	System.out.println("GrossEarningsForNICsYTD ="+XMLLELValue2);

   	String XMLLELValue3 = doc.getElementsByTagName("AtLELYTD").item(1).getTextContent();

   	System.out.println("AtLELYTD ="+XMLLELValue3);
   	
   	String XMLLELValue4 = doc.getElementsByTagName("LELtoPTYTD").item(1).getTextContent();
   	System.out.println("LELtoPTYTD ="+XMLLELValue4);

   	String XMLLELValue5 = doc.getElementsByTagName("PTtoUELYTD").item(1).getTextContent();
   	System.out.println("PTtoUELYTD ="+XMLLELValue5);


   	String XMLLELValue6 = doc.getElementsByTagName("TotalEmpNICInPd").item(1).getTextContent();
   	System.out.println("TotalEmpNICInPd ="+XMLLELValue6);

   	String XMLLELValue7 = doc.getElementsByTagName("TotalEmpNICYTD").item(1).getTextContent();
   	System.out.println("TotalEmpNICYTD ="+XMLLELValue7);

   	String XMLLELValue8 = doc.getElementsByTagName("EmpeeContribnsInPd").item(1).getTextContent();
   	System.out.println("EmpeeContribnsInPd ="+XMLLELValue8);

   	String XMLLELValue9 = doc.getElementsByTagName("EmpeeContribnsYTD").item(1).getTextContent();
   	System.out.println("EmpeeContribnsYTD ="+XMLLELValue9);


   	
	soft.assertEquals(XMLLELValue1, Nic);

	soft.assertEquals(XMLLELValue2, NICYtd);

	soft.assertEquals(XMLLELValue3, AtLELYTD);

	soft.assertEquals(XMLLELValue4, LELtoPTYTD);

	soft.assertEquals(XMLLELValue5, PTtoUELYTD);
	soft.assertEquals(XMLLELValue6, TotalEmpNICInPd);
	soft.assertEquals(XMLLELValue7, TotalEmpNICYTD);
	soft.assertEquals(XMLLELValue8, EmpeeContribnsInPd);
	soft.assertEquals(XMLLELValue9, EmpeeContribnsYTD);

   	
   	
   	m_Driver.switchTo().defaultContent();
   	
   	
   	jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//button[@type='button']")));
		Thread.sleep(2000);
		
	//	jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeading_ddlPayrollFrequency']")));
   	
  
   	Reporter.log("verifyXMLDirector");	
}

	

	
	
	
	  public void assertAll()
	   {
		   soft.assertAll();
		   
	   }
	
}
