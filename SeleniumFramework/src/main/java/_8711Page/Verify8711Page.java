package _8711Page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import pages.BasePage;

public class Verify8711Page  extends BasePage{

	public Verify8711Page(WebDriver driver) {
		super(driver);
	}

	
	SoftAssert soft= new SoftAssert();

	
	
	public void verifyPermmisonDropDownAllOptionsShouldSelectted(){
		
		
		List<WebElement> list = getWebElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[1]/li/a/input"));
		
		boolean con=list.isEmpty();
	     soft.assertFalse(con);
		for(int i=0;i<=list.size()-1;i++)
		{
			
			WebElement elem = list.get(i);
			boolean selected = elem.isSelected();
			
			System.out.println(selected);
	        soft. assertTrue(selected,"Element is not selected");
			
			
		}
		
		Reporter.log("verifyPermmisonDropDown");
		
		
	
	}
	
	
public void verifyAllOptionsSelected(){
		
		
		List<WebElement> list = getWebElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_chkPermission']/tbody/tr/td/input"));
		
		boolean con=list.isEmpty();
	     soft.assertFalse(con);
		for(int i=0;i<=list.size()-1;i++)
		{
			
			WebElement elem = list.get(i);
			boolean selected = elem.isSelected();
			
			System.out.println(selected);
	        soft. assertTrue(selected,"Element is not selected");
			
			
		}
		
		Reporter.log("verifyPermmisonDropDown");
		
		
	
	}
	
	
	
	
public void verifyPermmisonDropDownAllOptionsShouldDisable(){
		
		
		List<WebElement> list = getWebElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[1]/li/a/input[@disabled='disabled']"));
		
		boolean con=list.isEmpty();
	     soft.assertFalse(con);
		for(int i=0;i<=list.size()-1;i++)
		{
			
			WebElement elem = list.get(i);
			boolean enable = elem.isEnabled();
			
			System.out.println(enable);
	        soft. assertFalse(enable,"Element is not enable");
			
			
		}
		
		Reporter.log("verifyPermmisonDropDown");
		
		
	
	}
	
	
public void verifyPermissonDropDownAllOptionsShouldUnchecked(){
		
		
		List<WebElement> list = getWebElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[2]/li/a/input"));
		
		boolean con=list.isEmpty();
	     soft.assertFalse(con);
		for(int i=0;i<=list.size()-1;i++)
		{
			
			WebElement elem = list.get(i);
			boolean selected = elem.isSelected();
			
			System.out.println(selected);
	        soft. assertFalse(selected,"Element is selected");
			
			
		}
		
		Reporter.log("verifyPermmisonDropDown");
		
		
	
	}



public void verifyOnlyTimesheetOptionSelected(){
	
	
	List<WebElement> list = getWebElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[2]/li/a/input"));
	
	boolean con=list.isEmpty();
     soft.assertFalse(con);
	for(int i=0;i<=list.size()-1;i++)
	{
		
		if(i==1) {
		WebElement elem = list.get(i);
		boolean selected = elem.isSelected();
		
		System.out.println(selected);
        soft. assertTrue(selected,"Element is selected");
		
		}
	
		else
		{
			
			WebElement elem = list.get(i);
			boolean selected = elem.isSelected();
			
			System.out.println(selected);
	        soft. assertFalse(selected,"Element is selected");
			
		}
		
		
	}
	
	Reporter.log("verifyPermmisonDropDown");
	
	

}



public void verifyAllOptionsNotSelected(){
	
	
	List<WebElement> list = getWebElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_chkPermission']/tbody/tr/td/input"));
	
	boolean con=list.isEmpty();
     soft.assertFalse(con);
	for(int i=0;i<=list.size()-1;i++)
	{
		
		WebElement elem = list.get(i);
		boolean selected = elem.isSelected();
		
		System.out.println(selected);
        soft. assertFalse(selected,"Element is selected");
		
		
	}
	
	Reporter.log("verifyPermmisonDropDown");
	
	

}

	
        public void verifyPermmisonDropDownText(String data1, String data2,String data3, String data4){
		
		
		List<WebElement> list = getWebElements(By.xpath("(//*[@class='dropdown-menu dropdown-menu-left'])[1]/li/a"));
		 ArrayList<String> ar= new ArrayList<String>();
			ar.add(data1);
			ar.add(data2);
			ar.add(data3);
			ar.add(data4);
		boolean con=list.isEmpty();
	     soft.assertFalse(con);
		for(int i=0;i<=list.size()-1;i++)
		{
			
			WebElement elem = list.get(i);
			
			String text = elem.getText().trim();
			
			System.out.println(text);
			 soft.assertEquals(text, ar.get(i));
			
			
		}
		
		Reporter.log("verifyPermmisonDropDownText");
		
		
	}
	
	
//        
//        public void verifyEmailContact(String emailexpected )
//    	{
//    		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/div[2]/div[1]/div[1]"));
//    		
//    		
//    		String[] query = elem.getText().split(" ");
//    		
//    		System.out.println(query[3].replaceAll("\\n", " "));
//    		
//
//    		soft.assertEquals(query[3].replaceAll("\\n", " "),emailexpected);
//    		
//    		
//    		
//    		Reporter.log("verifyQueryEmail");
//
//    	}
//        
        
        
        public void verifyEmailContact(String emailContact, String subject )
    	{
    		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[4]/div/div/div[2]/div[1]/div[1]/b"));
    		
    		WebElement elem2 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[4]/div/div/div[1]/div/div/div/h4"));

    		String actualSubject=elem2.getText().trim();
    		
    		System.out.println(actualSubject);
    		
    		String[] query = elem.getText().split(" ");
    		
    		System.out.println(query[3].replaceAll("\\n", " "));
    		
    		soft.assertEquals(query[3].replaceAll("\\n", " "),emailContact);
    		
    		soft.assertEquals(actualSubject,subject);
    		
    		Reporter.log("verifyEmailContact1");

    	}
         
        
        public void verifyAlert(String expectedAlert)
        {
        	   WebElement elem = getWebElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[1]"));
        	
        	   String actualAlert  =elem.getText();
        	   
   			String alert = actualAlert.replaceAll("×", "").trim();

        	
        	   System.out.println(alert);
       	   	  soft.assertEquals(alert,expectedAlert);
       		
       		  Reporter.log("verifyAlert");
        }
        
        public void verifyAlert1(String expectedAlert)
        {
        	   WebElement elem = getWebElement(By.xpath("//*[@class='alert alert-danger alert-dismissible']"));
        	
        	   String actualAlert  =elem.getText();
        	   
   			   String alert = actualAlert.replaceAll("×", "").trim();

        	
        	   System.out.println(alert);
       	   	  soft.assertEquals(alert,expectedAlert);
       		
       		  Reporter.log("verifyAlert");
        }
         
        
        public void verifyEmailContanctInfo(String expectedType, String expectedFirstName,String expectedEmail  )
        {
        	
        List<WebElement> list = getWebElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td"));
        	
         String actualType =list.get(0).getText();
         System.out.println(actualType);
  	     soft.assertEquals(actualType,expectedType);

         String  actualFirstName =list.get(2).getText();
         System.out.println(actualFirstName);
  	     soft.assertEquals(actualFirstName,expectedFirstName);

         
         String actualEmail =list.get(4).getText();
         System.out.println(actualEmail);
  	     soft.assertEquals(actualEmail,expectedEmail);
  	     
  	     Reporter.log("verifycontanctInfo");

        	 
        }
        
        
        
        
        
	 public void assertAll()
	   {
		   soft.assertAll();
		   
	   }
}
