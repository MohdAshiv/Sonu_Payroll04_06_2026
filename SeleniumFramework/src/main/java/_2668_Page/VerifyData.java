package _2668_Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import pages.BasePage;

public class VerifyData extends BasePage{

	public VerifyData(WebDriver driver) {
		super(driver);
	}

	
	SoftAssert soft= new SoftAssert();
	
	

public void verifyPayrollDashboard( String expectedData1, String expectedData2)
{
	
	
	try {
		

		  WebElement list = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[2]/td[5]"));
		   String gross = list.getText();
		   gross = gross.replaceAll("[£]", "");
		   gross = gross.replaceAll("[,]", "");
		   
		   
		   WebElement list2 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[3]/td[5]"));
		   String gross2 = list2.getText();
		   gross2 = gross2.replaceAll("[£]", "");
		   gross2 = gross2.replaceAll("[,]", "");
		   
		  soft.assertEquals(gross, expectedData1);
		  soft.assertEquals(gross2, expectedData2);

		
	} catch (Exception e) {
	    soft.assertFalse(true,"welcome to catch block");

		System.out.println("Issue In verifyPayrollDashboard"+e);
	}
	
	Reporter.log("verifyPayrollDashboard");
}



public void verifyPayrollDashboardAllDetails( String expectedData1, String expectedData2,String expectedData3)
{
	
	
	try {
		

		  WebElement list = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[2]/td[5]"));
		   String gross = list.getText();
		   gross = gross.replaceAll("[£]", "");
		   gross = gross.replaceAll("[,]", "");
		   
		   
		   WebElement list2 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[2]/td[2]"));
		   String taxCode = list2.getText();
		   taxCode = taxCode.replaceAll("[£]", "");
		   taxCode = taxCode.replaceAll("[,]", "");
		   
		   WebElement list3 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[2]/td[1]"));
		   String emloloyee = list3.getText();
		   emloloyee = emloloyee.replaceAll("[£]", "");
		   emloloyee = emloloyee.replaceAll("[,]", "");
		   
		   
		  soft.assertEquals(gross, expectedData1);
		  soft.assertEquals(taxCode, expectedData2);
		  soft.assertEquals(emloloyee, expectedData3);

		
	} catch (Exception e) {
	    soft.assertFalse(true,"welcome to catch block");

		System.out.println("Issue In verifyPayrollDashboard"+e);
	}
	
	Reporter.log("verifyPayrollDashboard");
}


public void verifyPayrollDashboard3Employee( String expectedData1, String expectedData2,String expectedData3)
{
	
	
	try {
		

		  WebElement list = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[2]/td[5]"));
		   String gross = list.getText();
		   gross = gross.replaceAll("[£]", "");
		   gross = gross.replaceAll("[,]", "");
		   
		   
		   WebElement list2 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[3]/td[5]"));
		   String gross2 = list2.getText();
		   gross2 = gross2.replaceAll("[£]", "");
		   gross2 = gross2.replaceAll("[,]", "");
		   
		   WebElement list3 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[4]/td[5]"));
		   String gross3 = list3.getText();
		   gross3 = gross3.replaceAll("[£]", "");
		   gross3 = gross3.replaceAll("[,]", "");
		   
		  soft.assertEquals(gross, expectedData1);
		  soft.assertEquals(gross2, expectedData2);
		  soft.assertEquals(gross3, expectedData3);

		
	} catch (Exception e) {
	    soft.assertFalse(true,"welcome to catch block");

		System.out.println("Issue In verifyPayrollDashboard"+e);
	}
	
	Reporter.log("verifyPayrollDashboard");
}




public void verifyPayrollDashboard4Employee( String expectedData1, String expectedData2,String expectedData3,String expectedData4)
{
	
	try {
		

		  WebElement list = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[2]/td[5]"));
		   String gross = list.getText();
		   gross = gross.replaceAll("[£]", "");
		   gross = gross.replaceAll("[,]", "");
		   
		   
		   WebElement list2 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[3]/td[5]"));
		   String gross2 = list2.getText();
		   gross2 = gross2.replaceAll("[£]", "");
		   gross2 = gross2.replaceAll("[,]", "");
		   
		   WebElement list3 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[4]/td[5]"));
		   String gross3 = list3.getText();
		   gross3 = gross3.replaceAll("[£]", "");
		   gross3 = gross3.replaceAll("[,]", "");
		   
		   WebElement list4 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[5]/td[5]"));
		   String gross4 = list4.getText();
		   gross4 = gross4.replaceAll("[£]", "");
		   gross4 = gross4.replaceAll("[,]", "");
		   
		  soft.assertEquals(gross, expectedData1);
		  soft.assertEquals(gross2, expectedData2);
		  soft.assertEquals(gross3, expectedData3);

		  soft.assertEquals(gross4, expectedData4);

		
	} catch (Exception e) {
	    soft.assertFalse(true,"welcome to catch block");

		System.out.println("Issue In verifyPayrollDashboard"+e);
	}
	
	Reporter.log("verifyPayrollDashboard");
}


public void verifyNavigatedEmployee( String expectedname)
{
	
	
	try {
		

	       WebElement elem = m_Driver.findElement(By.xpath("//*[@id='select2-ddlEmployee-container']"));
	     
			String employee=elem.getText();
			
			System.out.println(employee);
		  
		  String[] name = employee.split(" ");
		  
		  System.out.println(name[2]);
			
			soft.assertEquals(name[2], expectedname);
		
		   

		
	} catch (Exception e) {
	    soft.assertFalse(true,"welcome to catch block");

		System.out.println("Issue In verifyNavigatedEmployee"+e);
	}
	
	Reporter.log("verifyNavigatedEmployee");
}



public void verifyNavigatedEmployeeEditPage( String expectedname)
{
	
	
	try {
		

		  WebElement employee = m_Driver.findElement(By.xpath("//*[@id='select2-ddlEmployee-container']"));
		  
		  String[] name = employee.getText().split(" ");
		  
		  System.out.println(name[2]);
			
			soft.assertEquals(name[2], expectedname);
		
		   

		
	} catch (Exception e) {
	    soft.assertFalse(true,"welcome to c atch block");

		System.out.println("Issue In verifyNavigatedEmployee"+e);
	}
	
	Reporter.log("verifyNavigatedEmployee");
}


public void verifyGrossOnProcessPay( String expectedGross)
{
	
	
	try {
		

		  WebElement employee = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtBasicPay']"));
		  
		 String gross = employee.getAttribute("Value");
		  
			
		 soft.assertEquals(gross, expectedGross);
		
		   

		
	} catch (Exception e) {
	    soft.assertFalse(true,"welcome to catch block");

		System.out.println("Issue In verifyGrossEmployeeH"+e);
	}
	
	Reporter.log("verifyGrossEmployeeH");
}


public void verifAdditionProcessPay( String expectdAdditon)
{
	
	try {
		

		  WebElement employee = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpAdditions_rptrAllowance_ctl00_txtAmount']"));
		  
		 String additonAmout = employee.getAttribute("Value");
		  
			
		 soft.assertEquals(additonAmout, expectdAdditon);
		
		   

		
	} catch (Exception e) {
	    soft.assertFalse(true,"welcome to catch block");

		System.out.println("Issue In verifAdditionProcessPay"+e);
	}
	
	Reporter.log("verifAdditionProcessPay");
}



      public void saveNextBtnDisable()
      {
	      List<WebElement> elem = m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_lnkSaveNext'][@disabled='disabled']"));
	 
	     int count = elem.size();
	     System.out.println(count);
	     soft.assertEquals(count, 1,"saveNextBtn is enabled");
	     //  boolean enable = elem.isEnabled();
//	       System.out.println(enable);
//	       soft.assertFalse(enable," element is enable");
	       
	       Reporter.log("saveNextDisable");
	      
     }
      
      
     

      
      public void savePreviousBtnDisable()
      {
	      List<WebElement> elem = m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_lnkSavePrevious'][@disabled='disabled']"));
	 
	     int count = elem.size();
	     System.out.println(count);
	     soft.assertEquals(count, 1,"savePreviousBtn is enabled");
	     //  boolean enable = elem.isEnabled();
//	       System.out.println(enable);
//	       soft.assertFalse(enable," element is enable");
	       
	       Reporter.log("saveNextDisable");
	      
     }

      
      public void saveBtnDisable()
      {
	      List<WebElement> elem = m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSave'][@disabled='disabled']"));
	 
	     int count = elem.size();
	     System.out.println(count);
	     soft.assertEquals(count, 1,"SaveBtn is enabled");
	     //  boolean enable = elem.isEnabled();
//	       System.out.println(enable);
//	       soft.assertFalse(enable," element is enable");
	       Reporter.log("saveBtnDisable");
	      
     }
      
      
      public void saveBtnEnable()
      {
	      List<WebElement> elem = m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_btnSave']"));
	 
	     int count = elem.size();
	     System.out.println(count);
	     soft.assertEquals(count, 1,"SaveBtn is disable");
	
	       Reporter.log("saveBtnDisable");
	      
     }

      public void NextBtnDisable()
      {
	      List<WebElement> elem = m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_lnkSaveNext'][@disabled='disabled']"));
	 
	     int count = elem.size();
	     System.out.println(count);
	     soft.assertEquals(count, 1,"NextBtn is enabled");
//	      boolean enable = elem.isEnabled();
//	       System.out.println(enable);
//	       soft.assertFalse(enable," element is enable");
	       Reporter.log("NextBtnDisable");
	      
     }
      
      public void PreviousBtnDisable()
      {
	      List<WebElement> elem = m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHFooter_lnkSavePrevious'][@disabled='disabled']"));
	 
	     int count = elem.size();
	     System.out.println(count);
	     soft.assertEquals(count, 1,"previousBtn is enabled");
	     //  boolean enable = elem.isEnabled();
//	       System.out.println(enable);
//	       soft.assertFalse(enable," element is enable");
	       Reporter.log("NextBtnDisable");
	      
     }
      

public void verifyAddressEditEmployee( String expectedAddress)
{
	
	
	try {
		

		  WebElement employee = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtAddress1']"));
		  
		 String address = employee.getAttribute("Value");
		  
			
		 soft.assertEquals(address, expectedAddress);
		
		   

		
	} catch (Exception e) {
	    soft.assertFalse(true,"welcome to catch block");

		System.out.println("Issue In verifyAddressEditEmployee"+e);
	}
	
	Reporter.log("verifyAddressEditEmployee");
}



	 public void assertAll()
	   {
		   soft.assertAll();
		   
	   }
	 
	 
}
