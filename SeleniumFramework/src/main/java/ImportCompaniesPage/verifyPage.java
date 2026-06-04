package ImportCompaniesPage;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import pages.BasePage;

public class verifyPage extends BasePage {

	public verifyPage(WebDriver driver) {
		super(driver);
	}
	
	SoftAssert soft= new SoftAssert();

	public void verifyImportCompanies() throws Exception
	{
		
		WebElement elem = m_Driver.findElement(By.xpath("//*[contains(text(),'Successfully')]"));
		
		String actualText = elem.getText();
		
		System.out.println(actualText);
		soft.assertEquals(actualText, "1 Companies from CSV Imported Successfully.");
		
		
		Reporter.log("verifyImportCompanies");
		
		Thread.sleep(2000);
	}
	
	public void verifyImportCompanywithNUll(String data)
	{
		

		String alert = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[1]/div")).getText();
		
		String alertMsg = alert.replaceAll("×", "").trim();
		System.out.println(alertMsg);
		soft.assertEquals(alertMsg, data);
		Reporter.log("verifyImportCompanywithAllNUll");

		 
	}
	
	public void pensionNotEnabled() throws Exception
	{
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_CompanyPensionYesNo_1']"));

		boolean selected = elem.isSelected();
		
		System.out.println(selected);
         soft. assertTrue(selected,"Element is not selected");
        Thread.sleep(3000);
		Reporter.log("pensionNotEnabled ");
  
      
	}

	
	public void pensionEnabled() throws Exception
	{
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_CompanyPensionYesNo_0']"));

		boolean selected = elem.isSelected();
		
		System.out.println(selected);
       soft. assertTrue(selected,"Element is not selected");
        Thread.sleep(3000);
		Reporter.log("pensionNotEnabled ");
  
      
	}
	
	
	public void p11DSelected() throws Exception
	{
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rbP11D_0']"));

		boolean selected = elem.isSelected();
		
		System.out.println(selected);
         soft. assertTrue(selected,"Element is not selected");
    
        Thread.sleep(3000);
		Reporter.log("p11DSelected ");
  
      
	}
	
	
	public void paymentManagementSelected() throws Exception
	{
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rbPaymentManagement_0']"));

		boolean selected = elem.isSelected();
		
		System.out.println(selected);
         soft. assertTrue(selected,"Element is not selected");
    
        Thread.sleep(3000);
		Reporter.log("paymentManagementSelected ");
  
      
	}
	
	

	public void paymentManagementNoSelected() throws Exception
	{
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rbPaymentManagement_1']"));

		boolean selected = elem.isSelected();
		
		System.out.println(selected);
         soft. assertTrue(selected,"Element is not selected");
    
        Thread.sleep(3000);
		Reporter.log("paymentManagementNoSelected ");
  
      
	}
	
	
	
	public void rejisterdCisSelected() throws Exception
	{
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rblRegforCis_0']"));

		boolean selected = elem.isSelected();
		
		System.out.println(selected);
         soft. assertTrue(selected,"Element is not selected");
    
        Thread.sleep(3000);
		Reporter.log("rejisterdCisSelected ");
  
      
	}
	
	
	public void rejisterdCisNoSelected() throws Exception
	{
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rblRegforCis_1']"));

		boolean selected = elem.isSelected();
		
		System.out.println(selected);
         soft. assertTrue(selected,"Element is not selected");
    
        Thread.sleep(3000);
		Reporter.log("rejisterdCisNoSelected ");
  
      
	}
	

	public void DisplayLeaveSelected() throws Exception
	{
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_RadioLeaveOnPayslip_0']"));

		boolean selected = elem.isSelected();
		
		System.out.println(selected);
         soft. assertTrue(selected,"Element is not selected");
    
        Thread.sleep(3000);
		Reporter.log("DisplayLeaveSelected ");
  
      
	}
	
	
	public void DisplayLeaveNoSelected() throws Exception
	{
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_RadioLeaveOnPayslip_1']"));

		boolean selected = elem.isSelected();
		
		System.out.println(selected);
         soft. assertTrue(selected,"Element is not selected");
    
        Thread.sleep(3000);
		Reporter.log("DisplayLeaveNoSelected ");
  
      
	}
	
	
	
	
	
	public void p11DNoSelected() throws Exception
	{
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rbP11D_1']"));

		boolean selected = elem.isSelected();
		
		System.out.println(selected);
         soft. assertTrue(selected,"Element is not selected");
    
        Thread.sleep(3000);
		Reporter.log("p11DNoSelected ");
  
      
	}
	
	
	public void quarterlyPaySchemeSelected() throws Exception
	{
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rbQuarterlyPayeScheme_0']"));

		boolean selected = elem.isSelected();
		
		System.out.println(selected);
         soft. assertTrue(selected,"Element is notSelected");
    
        Thread.sleep(3000);
		Reporter.log("quarterlyPaySchemeSelected");
  
      
	}
	
	public void quarterlyPaySchemeNoSelected() throws Exception
	{
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rbQuarterlyPayeScheme_1']"));

		boolean selected = elem.isSelected();
		
		System.out.println(selected);
         soft. assertTrue(selected,"Element is not selected");
    
        Thread.sleep(3000);
		Reporter.log("quarterlyPaySchemeNoSelected");
  
      
	}
	
	
	public void smallEmployerYes() throws Exception
	{
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rbSmallEmployer_0']"));

		boolean selected = elem.isSelected();
		
		System.out.println(selected);
         soft. assertTrue(selected,"Element is not selected");
    
        Thread.sleep(3000);
		Reporter.log("smallEmployerYes");
  
      
	}
	
	public void smallEmployerNo() throws Exception
	{
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rbSmallEmployer_1']"));

		boolean selected = elem.isSelected();
		
		System.out.println(selected);
         soft. assertTrue(selected,"Element is not Selected");
    
        Thread.sleep(3000);
		Reporter.log("smallEmployerNo");
  
      
	}
	
	
	public void employmentAllowanceYes() throws Exception
	{
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rbEmploymentAllowance_0']"));

		boolean selected = elem.isSelected();
		
		System.out.println(selected);
         soft. assertTrue(selected,"Element is notselected");
    
        Thread.sleep(3000);
		Reporter.log("employmentAllowanceYes");
  
	}
	
	

	public void employmentAllowanceNo() throws Exception
	{
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_rbEmploymentAllowance_1']"));

		boolean selected = elem.isSelected();
		
		System.out.println(selected);
         soft. assertTrue(selected,"Element is not selected");
    
        Thread.sleep(3000);
		Reporter.log("employmentAllowanceYes");
  
	}
	
	public void verifyAnnuallyPayDate() throws Exception
	{
		WebElement elem = m_Driver.findElement(By.xpath("//*[@placeholder='Annual Pay Date']"));

		
		String actualAnnualyPaydate = elem.getAttribute("value");
		System.out.println(actualAnnualyPaydate);
 		ImportCompaniesPage.CompanyImportPage abc= new 	ImportCompaniesPage.CompanyImportPage(m_Driver);
 		
 		String expectedAnnualyPaydate = abc.Paydate;
		String date = expectedAnnualyPaydate.replaceAll("-", "/");
		System.out.println(date);
		soft.assertEquals(actualAnnualyPaydate, date,"AnnuallyPayDate not as expected");

        Thread.sleep(3000);
		Reporter.log("verifyAnnuallyPayDate ");
  
      
	}
	
	
	public void verifyWeeklyPayDate() throws Exception
	{
		WebElement elem = m_Driver.findElement(By.xpath("//*[@placeholder='Weekly Pay Date']"));

		
		String actualPaydate = elem.getAttribute("value");
		System.out.println(actualPaydate);
 		ImportCompaniesPage.CompanyImportPage abc= new 	ImportCompaniesPage.CompanyImportPage(m_Driver);
 		
 		String expectedPaydate = abc.Paydate;
		String date = expectedPaydate.replaceAll("-", "/");
		System.out.println(date);
		soft.assertEquals(actualPaydate, date,"AnnuallyPayDate not as expected");

        Thread.sleep(3000);
		Reporter.log("verifyWeeklyPayDate ");
  
      
	}
	
	
	
	
	public void verifyFourWeeklyPayDate() throws Exception
	{
		WebElement elem = m_Driver.findElement(By.xpath("//*[@placeholder='FourWeekly Pay Date']"));

		
		String actualPaydate = elem.getAttribute("value");
		System.out.println(actualPaydate);
 		ImportCompaniesPage.CompanyImportPage abc= new 	ImportCompaniesPage.CompanyImportPage(m_Driver);
 		
 		String expectedPaydate = abc.Paydate;
		String date = expectedPaydate.replaceAll("-", "/");
		System.out.println(date);
		soft.assertEquals(actualPaydate, date,"FourWeeklyPayDate not as expected");

        Thread.sleep(3000);
		Reporter.log("verifyFourWeeklyPayDate");
  
      
	}
	
	
	public void verifyFortNightlyPayDate() throws Exception
	{
		WebElement elem = m_Driver.findElement(By.xpath("//*[@placeholder='Fortnightly Pay Date']"));

		
		String actualPaydate = elem.getAttribute("value");
		System.out.println(actualPaydate);
 		ImportCompaniesPage.CompanyImportPage abc= new 	ImportCompaniesPage.CompanyImportPage(m_Driver);
 		
 		String expectedPaydate = abc.Paydate;
		String date = expectedPaydate.replaceAll("-", "/");
		System.out.println(date);
		soft.assertEquals(actualPaydate, date,"FortnightlyPayDate not as expected");

        Thread.sleep(3000);
		Reporter.log("verifyFourWeeklyPayDate ");
  
      
	}
	
	public void verifyMonthlyPaydate()
	{
		
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_ddlMonthlyPayDay']/option[@selected='selected']"));
		
		
		String actualdate = elem.getText();
 		System.out.println(actualdate);

 		ImportCompaniesPage.CompanyImportPage abc= new 	ImportCompaniesPage.CompanyImportPage(m_Driver);
 		String expectedPaydate = abc.MonthlyPaydate;
 		System.out.println(expectedPaydate);
		soft.assertEquals(actualdate, expectedPaydate,"MonthlyPaydate not as expected");

		
	}
	
	
	
	public void verifyFrequency(String frequency)
	{
		
		  List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='col-sm-2 pr-0']/div/div/select[@disabled='disabled']"));

		 for (int i=0;i<=list1.size()-1;i++)
		 {
			
			  List<WebElement> list2 = m_Driver.findElements(By.xpath("//*[@class='col-sm-2 pr-0']/div/div/select[@disabled='disabled']"));

			 WebElement abc= list2.get(i);
			
			 Select sel = new Select(abc);
			 
			 WebElement o = sel.getFirstSelectedOption();
			  String selectedoption = o.getText();
			  System.out.println("Selected element: " + selectedoption);
			
			  if(selectedoption.equals(frequency))
			  {
				soft.assertNotEquals(selectedoption,frequency );

				  
			  }
			 
		 }
		  
     
		
	}
	
	
	
	public void verifyImportFrequency(String frequency1)
	{
		
		String lst[]=frequency1.split("-");
		
		  List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='col-sm-2 pr-0']/div/div/select[@disabled='disabled']"));
		 soft.assertEquals(lst.length, list1.size());

		 for (int i=0;i<=lst.length-1;i++)
		 {
			 boolean con=false;
			 
			 List<WebElement> list2 = m_Driver.findElements(By.xpath("//*[@class='col-sm-2 pr-0']/div/div/select[@disabled='disabled']"));

			 WebElement abc= list2.get(i);
			
			 Select sel = new Select(abc);
			 
			 WebElement o = sel.getFirstSelectedOption();
			  String selectedoption = o.getText();
			  System.out.println("Selected element: " + selectedoption);
			 for(int k=0;k<=lst.length-1;k++)
			 {
				 if(selectedoption.equals(lst[k]))
				 {
					con=true;
					 soft.assertTrue(con);
					 
				 }
			 }
			 
			 soft.assertTrue(con);			 
		 }
	
	}
	
	public void verifySelectedPasswordType(String expectedPasswordType)
	{
		
		try {
			
		
	
       WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_chkPwdProtectPaySlips1']/option[@selected='selected']"));
     
		String actualPasswodrType=elem.getText();
		
		
		System.out.println(actualPasswodrType);
		soft.assertEquals(actualPasswodrType, expectedPasswordType,"PasswordType not as expected");
		
		} catch (Exception e) {
			
			System.out.println("Issue in verifySelectedPasswordType"+e);
			soft.assertFalse(true,"welcome to catch block");
		}
		Reporter.log("verifySelectedPasswordType");
		
	}
	
	
	public void verifyAllWorkingDaysSelected()
	{
	
		jsExec.executeScript("window.scrollBy(0,500)", "");
		List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='NormalWorking']/div/input"));
		
		
		 System.out.println(list.size());
			boolean con=list.isEmpty();
		     soft.assertFalse(con);
		for(int i=0;i<=list.size()-1;i++)
		{
			List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@id='NormalWorking']/div/input"));

			WebElement elem = list1.get(i);
			boolean selected = elem.isSelected();
			
			System.out.println(selected);
	        soft. assertTrue(selected,"Element is not selected");
	     
		}
		 utilities.TakeScreenshot.Getscreenshot("TC393_01validateCompanyImportWithAllWorkingDaysYes" , "ImportCompanies", m_Driver);

		Reporter.log("verifyAllWorkingDaysSelected");
	
	}
	
	
	public void verifyAllWorkingDaysNotSelected()
	{
	
		jsExec.executeScript("window.scrollBy(0,500)", "");
		List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='NormalWorking']/div/input"));
		
		
		 System.out.println(list.size());
			boolean con=list.isEmpty();
		     soft.assertFalse(con);
		for(int i=0;i<=list.size()-1;i++)
		{
			List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@id='NormalWorking']/div/input"));

			WebElement elem = list1.get(i);
			boolean selected = elem.isSelected();
			
			System.out.println(selected);
	        soft. assertFalse(selected,"Element is selected");
	     
		}
		 utilities.TakeScreenshot.Getscreenshot("TC393_02validateCompanyImportWithAllWorkingDaysNo" , "ImportCompanies", m_Driver);

		Reporter.log("verifyAllWorkingDaysSelected");
	
	}
	
	
	
	public void verifyWorkingDaysCheckBoxSelection()
	{
	
		jsExec.executeScript("window.scrollBy(0,500)", "");
		List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='NormalWorking']/div/input"));
		
		
		 System.out.println(list.size());
			boolean con=list.isEmpty();
		     soft.assertFalse(con);
		     
		for(int i=0;i<=list.size()-1;i++)
		{
			List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@id='NormalWorking']/div/input"));

			if(i<=4)
			{
				WebElement elem = list1.get(i);
				boolean selected = elem.isSelected();
				
				System.out.println(selected);
		        soft. assertTrue(selected,"Element is not selected");
			}
			
			else
			{
			WebElement elem = list1.get(i);
			boolean selected = elem.isSelected();
			
			System.out.println(selected);
	        soft. assertFalse(selected,"Element is selected");
			
			
			}
	     
		}
		 utilities.TakeScreenshot.Getscreenshot("TC393_TC03validateCompanyImportWithAllWorkingDaysMondayToFridayYesRestNo" , "ImportCompanies", m_Driver);

		Reporter.log("verifyWorkingDaysSelectedNotSelected");
	
	}
	
	public void verifyWorkingDaysCheckBoxSelection2()
	{
	
		jsExec.executeScript("window.scrollBy(0,500)", "");
		List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='NormalWorking']/div/input"));
		
		
		 System.out.println(list.size());
			boolean con=list.isEmpty();
		     soft.assertFalse(con);
		     
		for(int i=0;i<=list.size()-1;i++)
		{
			List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@id='NormalWorking']/div/input"));

			if(i==0||i==4)
			{
				WebElement elem = list1.get(i);
				boolean selected = elem.isSelected();
				
				System.out.println(selected);
		        soft. assertTrue(selected,"Element is not selected");
			}
			
			else
			{
			WebElement elem = list1.get(i);
			boolean selected = elem.isSelected();
			
			System.out.println(selected);
	        soft. assertFalse(selected,"Element is selected");
			
			
			}
	     
		}
		 utilities.TakeScreenshot.Getscreenshot("TC393_TC04validateCompanyImportWithAllWorkingDaysMondayAndFridayYesRestNo" , "ImportCompanies", m_Driver);

		 Reporter.log("verifyWorkingDaysSelectedNotSelected");
	}
	
	
		public void verifyWorkingDaysCheckBoxSelection3()
		{
		
			jsExec.executeScript("window.scrollBy(0,500)", "");
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='NormalWorking']/div/input"));
			
			
			 System.out.println(list.size());
				boolean con=list.isEmpty();
			     soft.assertFalse(con);
			     
			for(int i=0;i<=list.size()-1;i++)
			{
				List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@id='NormalWorking']/div/input"));

				if(i==0||i==2||i==5)
				{
					WebElement elem = list1.get(i);
					boolean selected = elem.isSelected();
					
					System.out.println(selected);
			        soft. assertTrue(selected,"Element is not selected");
				}
				
				else
				{
				WebElement elem = list1.get(i);
				boolean selected = elem.isSelected();
				
				System.out.println(selected);
		        soft. assertFalse(selected,"Element is selected");
				
				
				}
		     
			}
		 utilities.TakeScreenshot.Getscreenshot("TC393_TC05validateCompanyImportWithAllWorkingDaysMondayWednesdaySaturdayYesRestNo" , "ImportCompanies", m_Driver);

		Reporter.log("verifyWorkingDaysSelectedNotSelected");
	
	}
		
		
		public void verifyWorkingDaysCheckBoxSelection4()
		{
		
			jsExec.executeScript("window.scrollBy(0,500)", "");
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='NormalWorking']/div/input"));
			
			
			 System.out.println(list.size());
				boolean con=list.isEmpty();
			     soft.assertFalse(con);
			     
			for(int i=0;i<=list.size()-1;i++)
			{
				List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@id='NormalWorking']/div/input"));

				if(i==0||i==2||i==3)
				{
					WebElement elem = list1.get(i);
					boolean selected = elem.isSelected();
					
					System.out.println(selected);
			        soft. assertTrue(selected,"Element is not selected");
				}
				
				else
				{
				WebElement elem = list1.get(i);
				boolean selected = elem.isSelected();
				
				System.out.println(selected);
		        soft. assertFalse(selected,"Element is selected");
				
				
				}
		     
			}
		 utilities.TakeScreenshot.Getscreenshot("TC393_TC06validateCompanyImportWithAllWorkingDaysMondayWednesdayThursdayYesRestNo" , "ImportCompanies", m_Driver);

		Reporter.log("verifyWorkingDaysSelectedNotSelected");
	
	}
		
		public void verifyWorkingDaysCheckBoxSelection5()
		{
		
			jsExec.executeScript("window.scrollBy(0,500)", "");
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='NormalWorking']/div/input"));
			
			
			 System.out.println(list.size());
				boolean con=list.isEmpty();
			     soft.assertFalse(con);
			     
			for(int i=0;i<=list.size()-1;i++)
			{
				List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@id='NormalWorking']/div/input"));

				if(i==1||i==3||i==4)
				{
					WebElement elem = list1.get(i);
					boolean selected = elem.isSelected();
					
					System.out.println(selected);
			        soft. assertTrue(selected,"Element is not selected");
				}
				
				else
				{
				WebElement elem = list1.get(i);
				boolean selected = elem.isSelected();
				
				System.out.println(selected);
		        soft. assertFalse(selected,"Element is selected");
				
				
				}
		     
			}
		 utilities.TakeScreenshot.Getscreenshot("TC393_TC07validateCompanyImportWithAllWorkingDaysTuesdayThursdayFridayYesRestNo" , "ImportCompanies", m_Driver);

		Reporter.log("verifyWorkingDaysSelectedNotSelected");
	
	}
		
		public void verifyWorkingDaysCheckBoxSelection6()
		{
		
			jsExec.executeScript("window.scrollBy(0,500)", "");
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='NormalWorking']/div/input"));
			
			
			 System.out.println(list.size());
				boolean con=list.isEmpty();
			     soft.assertFalse(con);
			     
			for(int i=0;i<=list.size()-1;i++)
			{
				List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@id='NormalWorking']/div/input"));

				if(i==0||i==4||i==5)
				{
					WebElement elem = list1.get(i);
					boolean selected = elem.isSelected();
					
					System.out.println(selected);
			        soft. assertTrue(selected,"Element is not selected");
				}
				
				else
				{
				WebElement elem = list1.get(i);
				boolean selected = elem.isSelected();
				
				System.out.println(selected);
		        soft. assertFalse(selected,"Element is selected");
				
				
				}
		     
			}
		 utilities.TakeScreenshot.Getscreenshot("TC393_TC08validateCompanyImportWithAllWorkingDaysMondayFridaySaturdayYesRestNo" , "ImportCompanies", m_Driver);

		Reporter.log("verifyWorkingDaysSelectedNotSelected");
	
	}
		
		
		
		public void verifyWorkingDaysCheckBoxSelection7()
		{
		
			jsExec.executeScript("window.scrollBy(0,500)", "");
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='NormalWorking']/div/input"));
			
			
			 System.out.println(list.size());
				boolean con=list.isEmpty();
			     soft.assertFalse(con);
			     
			for(int i=0;i<=list.size()-1;i++)
			{
				List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@id='NormalWorking']/div/input"));

				if(i==4||i==5||i==6)
				{
					WebElement elem = list1.get(i);
					boolean selected = elem.isSelected();
					
					System.out.println(selected);
			        soft. assertTrue(selected,"Element is not selected");
				}
				
				else
				{
				WebElement elem = list1.get(i);
				boolean selected = elem.isSelected();
				
				System.out.println(selected);
		        soft. assertFalse(selected,"Element is selected");
				
				
				}
		     
			}
		 utilities.TakeScreenshot.Getscreenshot("TC393_TC09validateCompanyImportWithAllWorkingDaysMondayFridaySaturdayYesRestNo" , "ImportCompanies", m_Driver);

		Reporter.log("verifyWorkingDaysSelectedNotSelected");
	
	}
		
		
		public void verifyWorkingDaysCheckBoxSelection8()
		{
		
			jsExec.executeScript("window.scrollBy(0,500)", "");
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='NormalWorking']/div/input"));
			
			
			 System.out.println(list.size());
				boolean con=list.isEmpty();
			     soft.assertFalse(con);
			     
			for(int i=0;i<=list.size()-1;i++)
			{
				List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@id='NormalWorking']/div/input"));

				if(i==0||i==1||i==2||i==3)
				{
					WebElement elem = list1.get(i);
					boolean selected = elem.isSelected();
					
					System.out.println(selected);
			        soft. assertTrue(selected,"Element is not selected");
				}
				
				else
				{
				WebElement elem = list1.get(i);
				boolean selected = elem.isSelected();
				
				System.out.println(selected);
		        soft. assertFalse(selected,"Element is selected");
				
				
				}
		     
			}
		 utilities.TakeScreenshot.Getscreenshot("TC393_TC10validateCompanyImportWithAllWorkingDaysMTWTYesRestNo" , "ImportCompanies", m_Driver);

		Reporter.log("verifyWorkingDaysSelectedNotSelected");
	
	}
		
		
		public void verifyOpeningBalanceInputField(String expectedData)
		{
			 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpOpeningBalances']/div/div/div/div/input"));
			
			for(int i=0;i<=list.size()-1;i++)
			{
				 
				 List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpOpeningBalances']/div/div/div/div/input"));

				WebElement elem = list1.get(i);
				
		    	 String data =elem.getAttribute("value");
		    	 System.out.println(data);
		 		soft.assertEquals(data, expectedData," not as expected");

			}
			
			
		}
		
		
		public void verifyOpeningBalanceApprenticeshipLevy()
		{
			 WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpOpeningBalances_txtApprenticeshipLevy']"));
			
			
			     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
			     String actualdata = abc.data;
		    	 System.out.println(actualdata);

		    	 String value =elem.getAttribute("value");
		    
			 	 soft.assertEquals(actualdata,value," not as expected");
		}
		
		
		public void verifyOpeningBalanceCisSufferd()
		{
			 WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpOpeningBalances_txtCISSuffered']"));
			
			
			     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
			     String actualdata = abc.data;
		    	 System.out.println(actualdata);

		    	 String value =elem.getAttribute("value");
		    
			 	 soft.assertEquals(actualdata,value," not as expected");
			 	 
			 	 Reporter.log("verifyOpeningBalanceCisSufferd");
		}
		

		public void verifyOpeningBalanceCisSufferdTaxPayment()
		{
			 WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr[2]/td[13]"));
			
			
			     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
			     String actualdata = abc.data;
		    	 System.out.println(actualdata);

		    	 String value =elem.getText();
		    	 
		    	 String data=value.substring(2, 10);
		    
		    	 String data1 = data.replaceAll(",", "");
			 	 soft.assertEquals(actualdata,data1," not as expected");
			 	 
			 	 Reporter.log("verifyOpeningBalanceCisSufferdTaxPayment");
		}
		
		
		public void verifyOpeningBalanceCisTaxPayment()
		{
			 WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRec']/tbody/tr[2]/td[12]"));
			
			     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
			     String actualdata = abc.data;
		    	 System.out.println(actualdata);

		    	 String value =elem.getText();
		    	 String data=value.substring(1, 9);
				    
		    	 String data1 = data.replaceAll(",", "");
		    
			 	 soft.assertEquals(actualdata,data1," not as expected");
			 	 Reporter.log("verifyOpeningBalanceCisTaxPayment");
		}
		
		
		public void verifyOpeningBalanceCisTax()
		{
			 WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpOpeningBalances_txtCISTax']"));
			
			
			     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
			     String actualdata = abc.data;
		    	 System.out.println(actualdata);

		    	 String value =elem.getAttribute("value");
		    
			 	 soft.assertEquals(actualdata,value," not as expected");
			 	 
			 	 Reporter.log("verifyOpeningBalanceCisTax");
		}
		
		
		public void verifyOpeningBalanceSMPRecoverd()
		{
			 WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpOpeningBalances_txtSMPRecovered']"));
			
			
			     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
			     String actualdata = abc.data;
		    	 System.out.println(actualdata);

		    	 String value =elem.getAttribute("value");
		    
			 	 soft.assertEquals(actualdata,value," not as expected");
			 	 
			 	 Reporter.log("verifyOpeningBalanceSMPRecoverd");
		}
		
		
		public void verifyOpeningBalanceNicCompensationSMP()
		{
			 WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpOpeningBalances_txtNICCompensationOnSMP']"));
			
			
			     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
			     String actualdata = abc.data;
		    	 System.out.println(actualdata);

		    	 String value =elem.getAttribute("value");
		    
			 	 soft.assertEquals(actualdata,value," not as expected");
			 	 
			 	 Reporter.log("verifyOpeningBalanceNicCompensationSMP");
		}
		
		
		
		public void verifyOpeningBalanceSPPRecoverd()
		{
			 WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpOpeningBalances_txtSPPRecovered']"));
			
			
			     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
			     String actualdata = abc.data;
		    	 System.out.println(actualdata);

		    	 String value =elem.getAttribute("value");
		    
			 	 soft.assertEquals(actualdata,value," not as expected");
			 	 
			 	 Reporter.log("verifyOpeningBalanceSPPRecoverd");
		}
		
		
		public void verifyOpeningBalanceNicCompensationSSP()
		{
			 WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpOpeningBalances_txtNICCompensationOnSPP']"));
			
			
			     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
			     String actualdata = abc.data;
		    	 System.out.println(actualdata);

		    	 String value =elem.getAttribute("value");
		    
			 	 soft.assertEquals(actualdata,value," not as expected");
			 	 
			 	 Reporter.log("verifyOpeningBalanceNicCompensationSSP");
		}
		
		
		
		  public void verifyBankName()
		  {
			 WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtBankName']"));
			
			     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
			     String actualdata = abc.input;
		    	 System.out.println(actualdata);

		    	 String value =elem.getAttribute("value");
		    
			 	 soft.assertEquals(actualdata,value," not as expected");
			 	 
			 	 Reporter.log("verifyBankName");
		}
		
		  
		  public void verifyAlertMsgNull(String expectedData) throws Exception
		  {
			  
			  Thread.sleep(7000);
			 WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[1]/div"));
			
			   String alert = elem.getText();
				String alertMsg = alert.replaceAll("×", "").trim();

				System.out.println(alertMsg);
		    
			 	 soft.assertEquals(alertMsg,expectedData," not as expected");
			 	 
			 	 Reporter.log("verifyAlertMsgNull");
		}
		

		  
		  public void verifySortCode()
		  {
			    WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtBankAccountSortCode']"));
			
			     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
			     String actualdata = abc.input;
		    	 System.out.println(actualdata);

		    	 String value =elem.getAttribute("value");
		    
			 	 soft.assertEquals(actualdata,value," not as expected");
			 	 
			 	 Reporter.log("verifySortCode");
		}
		
		  
		  public void verifyAccountNumber()
		  {
			    WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtBankAccount']"));
			
			     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
			     String actualdata = abc.input;
		    	 System.out.println(actualdata);

		    	 String value =elem.getAttribute("value");
		    
			 	 soft.assertEquals(actualdata,value," not as expected");
			 	 
			 	 Reporter.log("verifyAccountNumber");
		}
		
		  
		  public void verifyCutOffDate()
		  {
			    WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtCutOffDate']"));
			
			     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
			     String actualdata = abc.Paydate;
			    String actualData= actualdata.replaceAll("-", "/");

		    	 String value =elem.getAttribute("value");
		    
			 	 soft.assertEquals(value,actualData," not as expected");
			 	 
			 	 Reporter.log("verifyCutOffDate");
		}
		
		  
		  public void verifyMaxSicDays()
		  {
			    WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtPaySicknessDaysMax']"));
			
			     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
			     String actualData = abc.input;

		    	 String value =elem.getAttribute("value");
		    	 
		    	  String value1 = value.substring(0,2);
		    
			 	 soft.assertEquals(value1,actualData," not as expected");
			 	 
			 	 Reporter.log("verifyMaxSicDays");
		}
		  
		  public void verifyMaxSicDaysZero()
		  {
			    WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtPaySicknessDaysMax']"));
			
			     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
			     String actualData = abc.input1;

		    	 String value =elem.getAttribute("value");
		    	 
		    	  String value1 = value.substring(0,1);
		    
			 	 soft.assertEquals(value1,actualData," not as expected");
			 	 
			 	 Reporter.log("verifyMaxSicDays");
		}
		  
		  public void verifyNoticePeriod()
		  {
			    WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtNoticeWeeks']"));
			
			     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
			     String actualData = abc.input;

		    	 String value =elem.getAttribute("value");
		    	 
		    	  String value1 = value.substring(0,2);
		         System.out.println(value1);
		    	  
			 	 soft.assertEquals(value1,actualData," not as expected");
			 	 
			 	 Reporter.log("verifyNoticePeriod");
		}
		 
		  public void verifyNoticePeriodZeo()
		  {
			    WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtNoticeWeeks']"));
			
			     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
			     String actualData = abc.input1;

		    	 String value =elem.getAttribute("value");
		    	 
		    	  String value1 = value.substring(0,1);
		         System.out.println(value1);
		    	  
			 	 soft.assertEquals(value1,actualData," not as expected");
			 	 
			 	 Reporter.log("verifyNoticePeriodZeo");
		}
		  public void verifyRetiermentAgeMale()
		  {
			    WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtRetirementAgeMale']"));
			
			     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
			     String actualData = abc.input;

		    	 String value =elem.getAttribute("value");
		    	 
		    	  String value1 = value.substring(0,2);
		         System.out.println(value1);
		    	  
			 	 soft.assertEquals(value1,actualData," not as expected");
			 	 
			 	 Reporter.log("verifyRetiermentAgeMale");
		}
		  
		  
		  public void verifyRetiermentAgeMaleZero()
		  {
			    WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtRetirementAgeMale']"));
			
			     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
			     String actualData = abc.input1;

		    	 String value =elem.getAttribute("value");
		    	 
		    	  String value1 = value.substring(0,1);
		         System.out.println(value1);
		    	  
			 	 soft.assertEquals(value1,actualData," not as expected");
			 	 
			 	 Reporter.log("verifyRetiermentAgeMale");
		}
		  
		  public void verifyRetiermentAgeFemale()
		  {
			    WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtRetirementAgeFemale']"));
			
			     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
			     String actualData = abc.input;
		          System.out.println(actualData);

		    	 String value =elem.getAttribute("value");
		    	 
		    	  String value1 = value.substring(0,2);
		          System.out.println(value1);
		    	  
			 	 soft.assertEquals(value1,actualData," not as expected");
			 	 
			 	 Reporter.log("verifyRetiermentAgeFemale");
		}
		  
		  
		  
		  public void verifyRetiermentAgeFemaleZero()
		  {
			    WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtRetirementAgeFemale']"));
			
			     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
			     String actualData = abc.input1;
		          System.out.println(actualData);

		    	 String value =elem.getAttribute("value");
		    	 
		    	  String value1 = value.substring(0,1);
		          System.out.println(value1);
		    	  
			 	 soft.assertEquals(value1,actualData," not as expected");
			 	 
			 	 Reporter.log("verifyRetiermentAgeFemaleZero");
		}
		  
		  
		  public void verifyUpdateLeaveDays()
		  {
			    WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtAnnualLeaveDays']"));
			
			     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
			     String actualData = abc.input;

		    	 String value =elem.getAttribute("value");
		    	 
		    	  String value1 = value.substring(0,2);
		         System.out.println(value1);
		    	  
			 	 soft.assertEquals(value1,actualData," not as expected");
			 	 
			 	 Reporter.log("verifyUpdateLeaveDays");
		}
		  
		  
		  public void verifyUpdateHolidayPayRte()
		  {
			    WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtHourlyRate']"));
			
			     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
			     String actualData = abc.input;

		    	 String value =elem.getAttribute("value");
		    	 
		    	  String value1 = value.substring(0,1);
		         System.out.println(value1);
		    	  
			 	 soft.assertEquals(value1,actualData," not as expected");
			 	 
			 	 Reporter.log("verifyUpdateHolidayPayRte");
		}
		  
		  
		  public void verifyMaxCarryOver()
		  {
			    WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtCarryForward']"));
			
			     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
			     String actualData = abc.input;

		    	 String value =elem.getAttribute("value");
		    	 
		    	  String value1 = value.substring(0,1);
		         System.out.println(value1);
		    	  
			 	 soft.assertEquals(value1,actualData," not as expected");
			 	 
			 	 Reporter.log("verifyUpdateHolidayPayRte");
		}
		  
		  public void verifyWeeklyWorkingHours()
		  {
			    WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtWorkingHoursWeekly']"));
			
			     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
			     String actualData = abc.input;

		    	 String value =elem.getAttribute("value");
		    	 
		    	  String value1 = value.substring(0,1);
		         System.out.println(value1);
		    	  
			 	 soft.assertEquals(value1,actualData," not as expected");
			 	 
			 	 Reporter.log("verifyUpdateHolidayPayRte");
		}
		  
		  
			public void verifyLeaveYearStart() throws Exception
			{
				WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtStartDate']"));

				
				String actualLeaveYearStart = elem.getAttribute("value");
				System.out.println(actualLeaveYearStart);
		 		ImportCompaniesPage.CompanyImportPage abc= new 	ImportCompaniesPage.CompanyImportPage(m_Driver);
		 		
		 		String expectedLeaveYearStart = abc.Paydate;
		 		
		 		
				String date = expectedLeaveYearStart.replaceAll("-", "/");
				System.out.println(date);
				soft.assertEquals(actualLeaveYearStart, date,"AnnuallyPayDate not as expected");

		        Thread.sleep(3000);
				Reporter.log("verifyAnnuallyPayDate ");
		  
		      
			}
			
			
			  public void verifyCompanyName()
			  {
				    WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_txtCompanyName']"));
				
				     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
				     String expecteddata = abc.client;

			    	 String value =elem.getAttribute("value");
			    
				 	 soft.assertEquals(value,expecteddata," not as expected");
				 	 
				 	 Reporter.log("verifyCompanyName");
			}
		  
			  
			  public void verifyAddressLine1()
			  {
				    WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_txtAddress1']"));
				
				     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
				     String actualdata = abc.input;

			    	 String value =elem.getAttribute("value");
			    
				 	 soft.assertEquals(value,actualdata," not as expected");
				 	 
				 	 Reporter.log("verifyAddressLine1");
			}
			  
			  
			  public void verifyAddressLine2()
			  {
				    WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_txtAddress2']"));
				
				     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
				     String actualdata = abc.input;

			    	 String value =elem.getAttribute("value");
			    
				 	 soft.assertEquals(value,actualdata," not as expected");
				 	 
				 	 Reporter.log("verifyAddressLine2");
			}	  
			  
			  
			  public void verifyAddressLine3()
			  {
				    WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_txtAddress2']"));
				
			    	 String value =elem.getAttribute("value");
			    
				 	 soft.assertEquals(value,""," not as expected");
				 	 
				 	 Reporter.log("verifyAddressLine3");
			}	  
			  
			  
			  public void verifyCity()
			  {
				    WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_txtAddress3']"));
				
				     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
				     String actualdata = abc.input;

			    	 String value =elem.getAttribute("value");
			    
				 	 soft.assertEquals(value,actualdata," not as expected");
				 	 
				 	 Reporter.log("verifyCity");
			}	
			  
		
			  public void verifyCountry()
			  {
				    WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_txtAddress4']"));
				
				     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
				     String actualdata = abc.input;

			    	 String value =elem.getAttribute("value");
			    
				 	 soft.assertEquals(value,actualdata," not as expected");
				 	 
				 	 Reporter.log("verifyCountry");
			}	
			  

			  public void verifyPostCode()
			  {
				    WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_txtPostCode']"));
				
//				     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
//				     String actualdata = abc.input;

			    	 String value =elem.getAttribute("value");
			    
				 	 soft.assertEquals(value,"POX 1AS"," not as expected");
				 	 
				 	 Reporter.log("verifyPostCode");
			}	
			  
			  
			  public void verifyPostCodeNull()
			  {
				    WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_txtPostCode']"));
				
				     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
				     String actualdata = abc.input;

			    	 String value =elem.getAttribute("value");
			    
				 	 soft.assertEquals(value,actualdata," not as expected");
				 	 
				 	 Reporter.log("verifyPostCode");
			}	
			  
			  public void verifyStagingDate()
			  {
				    WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAutoEnrolment_txtStagingDate']"));
				
				     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
				 	String date = abc.Paydate;
					String expecteddata = date.replaceAll("-", "/");
					System.out.println(expecteddata);				     
			    	 String value =elem.getAttribute("value");
			    
				 	 soft.assertEquals(value,expecteddata," not as expected");
				 	 
				 	 Reporter.log("verifyStagingDate");
			}
			  
			  public void verifyComplienceDate()
			  {
				    WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAutoEnrolment_txtComplDate']"));
				
				     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
				 	String date = abc.Paydate;
					String expecteddata = date.replaceAll("-", "/");
					System.out.println(expecteddata);				     
			    	 String value =elem.getAttribute("value");
			    
				 	 soft.assertEquals(value,expecteddata," not as expected");
				 	 
				 	 Reporter.log("verifyComplienceDate");
			}
		  
			  public void verifyReEnrolmentDate()
			  {
					WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAutoEnrolment_txtNextCyclicalEnrolDate']"));

					ImportCompaniesPage.CompanyImportPage abc = new ImportCompaniesPage.CompanyImportPage(m_Driver);
					String date = abc.Paydate1;
					String expecteddata = date.replaceAll("-", "/");
					System.out.println(expecteddata);
					String value = elem.getAttribute("value");

					soft.assertEquals(value, expecteddata, " not as expected");

					Reporter.log("verifyReEnrolmentDate");
			}
			  
			  public void verifySignatoryTitle()
			  {
					WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAutoEnrolment_txtSignatoryTitle']"));

					ImportCompaniesPage.CompanyImportPage abc = new ImportCompaniesPage.CompanyImportPage(m_Driver);
					String date = abc.input;
					
					String value = elem.getAttribute("value");

					soft.assertEquals(value, date, " not as expected");

					Reporter.log("verifySignatoryTitle");
			}
			  
			  
			  
			  public void verifySignatoryName()
			  {
					WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAutoEnrolment_txtSignatoryName']"));

					ImportCompaniesPage.CompanyImportPage abc = new ImportCompaniesPage.CompanyImportPage(m_Driver);
					String date = abc.input;
					
					String value = elem.getAttribute("value");

					soft.assertEquals(value, date, " not as expected");

					Reporter.log("verifySignatoryName");
			}
			  
			  
			  public void verifyEmail()
			  {
					WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAutoEnrolment_txtEmailAE']"));

					ImportCompaniesPage.CompanyImportPage abc = new ImportCompaniesPage.CompanyImportPage(m_Driver);
					String date = abc.input3;
					
					String value = elem.getAttribute("value");

					soft.assertEquals(value, date, " not as expected");

					Reporter.log("verifyEmail");
			}
			  
			  
			  public void verifyNumber()
			  {
					WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAutoEnrolment_txtContactNumber']"));

					ImportCompaniesPage.CompanyImportPage abc = new ImportCompaniesPage.CompanyImportPage(m_Driver);
					String date = abc.input;
					
					String value = elem.getAttribute("value");

					soft.assertEquals(value, date, " not as expected");

					Reporter.log("verifyNumber");
			}
			  
			  public void verifyPensionID()
			  {
					WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAutoEnrolment_txtPSEmployerID']"));

					ImportCompaniesPage.CompanyImportPage abc = new ImportCompaniesPage.CompanyImportPage(m_Driver);
					String date = abc.input;
					
					String value = elem.getAttribute("value");

					soft.assertEquals(value, date, " not as expected");

					Reporter.log("verifyNumber");
			}
			  
			  public void verifyOutNumber()
			  {
					WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAutoEnrolment_txtECON']"));

					ImportCompaniesPage.CompanyImportPage abc = new ImportCompaniesPage.CompanyImportPage(m_Driver);
					String date = abc.input;
					
					String value = elem.getAttribute("value");

					soft.assertEquals(value, date, " not as expected");
					Reporter.log("verifyNumber");
			}
			  
			  
			  public void verifyFirstName()
			  {
				    WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ContactDetails']/div[1]/div/div/div/table/tbody/tr[2]/td[3]"));
				
				     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
				     String actualdata = abc.input;

			    	 String value =elem.getText();
			    
				 	 soft.assertEquals(value,actualdata," not as expected");
				 	 
				 	 Reporter.log("verifyFirstName");
			}
			  
			  public void verifyLastName()
			  {
				    WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ContactDetails']/div[1]/div/div/div/table/tbody/tr[2]/td[4]"));
				
				     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
				     String actualdata = abc.input;

			    	 String value =elem.getText();
			    
				 	 soft.assertEquals(value,actualdata," not as expected");
				 	 
				 	 Reporter.log("verifyLastName");
			}
			  
			  public void verifyPhoneNumber()
			  {
				    WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ContactDetails']/div[1]/div/div/div/table/tbody/tr[2]/td[6]"));
				
				     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
				     String actualdata = abc.input;

				     System.out.println(actualdata);
			    	 String value =elem.getText();
			    
				 	 soft.assertEquals(value,actualdata," not as expected");
				 	 
				 	 Reporter.log("verifyPhoneNumber");
			}
			  
			  public void verifyEmailid()
			  {
				    WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ContactDetails']/div[1]/div/div/div/table/tbody/tr[2]/td[5]"));
				
				     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
				     String actualdata = abc.input3;

				     System.out.println(actualdata);
			    	 String value =elem.getText();
			    
				 	 soft.assertEquals(value,actualdata," not as expected");
				 	 
				 	 Reporter.log("verifyEmailid");
			}
			  
			  
			  public void verifyLastNameNull()
			  {
				    WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ContactDetails']/div[1]/div/div/div/table/tbody/tr[2]/td[4]"));
				
				     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
				     String actualdata = abc.input;

			    	 String value =elem.getText();
			    
				 	 soft.assertEquals(value,actualdata," not as expected");
				 	 
				 	 Reporter.log("verifyLastName");
			}
			  
			  public void verifyRegistraionDate()
			  {
				    WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_txtPayeRegDate']"));
				
				     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
				     String date = abc.Paydate;

						String actualDate = date.replaceAll("-", "/");

			    	 String value =elem.getAttribute("value");
			    
				 	 soft.assertEquals(value,actualDate," not as expected");
				 	 
				 	 Reporter.log("verifyRegistraionDate");
			}
			  
			  public void verifyRegistraionDateNull()
			  {
				    WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_txtPayeRegDate']"));
				
				     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
				     String date = abc.input;


			    	 String value =elem.getAttribute("value");
			    
				 	 soft.assertEquals(value,date," not as expected");
				 	 
				 	 Reporter.log("verifyRegistraionDate");
			}
			  
			  
			  public void verifyCompanyUTR()
			  {
				    WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_txtUtrNo']"));
				
				     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
				     String actualdata = abc.input;

			    	 String value =elem.getAttribute("value");
			    
				 	 soft.assertEquals(value,actualdata," not as expected");
				 	 
				 	 Reporter.log("verifyCompanyUTR");
			}
			  
			  public void verifyPayRefrence()
			  {
				    WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_txtPayeRefNo']"));
				
				     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
				     String expecteda = abc.input;

			    	 String value =elem.getAttribute("value");
			    
			        String actualData 	= value.substring(1, 4);
				 	 soft.assertEquals(actualData,expecteda," not as expected");
				 	 
				 	 Reporter.log("verifyPayRefrence");
			}
			  
			  
			  public void verifyAccountOfficeNumber()
			  {
				    WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_txtAORef']"));
				
				     ImportCompaniesPage.CompanyImportPage abc= new  ImportCompaniesPage.CompanyImportPage(m_Driver);
				     String expecteda = abc.input;

			    	 String value =elem.getAttribute("value");
			    
				 	 soft.assertEquals(value,expecteda," not as expected");
				 	 
				 	 Reporter.log("verifyAccountOfficeNumber");
			}
			  
	 public void assertAll()
	   {
		   soft.assertAll();
		   
	   }
}
