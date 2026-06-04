package _2855Page;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import pages.BasePage;

public class VerifyLeaveManagement extends BasePage {

	public VerifyLeaveManagement(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	SoftAssert soft= new SoftAssert();

	
	
	
	public void verifyCancelLeavesHeader(String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String expectedData)
	{
		
		 String actualData = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[4]/header/h2/span")).getText();
		
		 System.out.println("cancel leave page header-"+actualData);
	      soft.assertEquals(actualData,expectedData );

		
		
		  List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/th"));
		
		  boolean con=list.isEmpty();
		     soft.assertFalse(con);
		     ArrayList<String> ar= new ArrayList<String>();
			 
				ar.add(data1);
				ar.add(data2);
				ar.add(data3);
				ar.add(data4);
				ar.add(data5);
				ar.add(data6);
				ar.add(data7);
				ar.add(data8);
		     
		     for(int i=0;i<=list.size()-1;i++)
		     {
		    	 if(i==8) {break;}
  
		        String columnsName = list.get(i).getText();
		    	 
		        System.out.println(ar.get(i));
		        soft.assertEquals(columnsName, ar.get(i));
		     
		     }
		     
		     
		     Reporter.log("verifyCancelLeavesHeader");
		     
	}
	
	
	
	public void verifyCancelLeavesDetails(String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8)
	{
		

		  List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td"));
		
		  boolean con=list.isEmpty();
		     soft.assertFalse(con);
		     ArrayList<String> ar= new ArrayList<String>();
			 
				ar.add(data1);
				ar.add(data2);
				ar.add(data3);
				ar.add(data4);
				ar.add(data5);
				ar.add(data6);
				ar.add(data7);
				ar.add(data8);
		     
		     for(int i=0;i<=list.size()-1;i++)
		     {
		    	 if(i==8) {break;}

		        String columnsName = list.get(i).getText();
		    	 
		        System.out.println(ar.get(i));
		        soft.assertEquals(columnsName, ar.get(i));
		     
		     }
		     
		     
		     Reporter.log("verifyCancelLeavesHeader");
		     
	}
	
	
	public void verifyNoRecordsCancelLeavePageForApprovedLeaves()
	{
		

		  List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td"));
		
		  boolean con=list.isEmpty();
		     soft.assertTrue(con);

		     Reporter.log("verifyNoRecordsCancelLeavePageForApprovedLeaves");
   
	}
	
	
	
	public void verifyleaveApprovedMsg()
	{
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[1]"));
		
		String actualMsg = elem.getText();
		
		soft.assertEquals(actualMsg, "Success! Leave approved successfully.");
		
		Reporter.log("verifyleaveApprovedMsg");
	}
	
	
	public void verifyTotal_Pending_ApplyLeaveRedirectPage(String expectedHistory)
	{
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[4]/header/h2/span"));
		
		String actualHistory = elem.getText();
		
		soft.assertEquals(actualHistory, expectedHistory);
		
		Reporter.log("verifyTotalLeaveTakenRedirectPage");
	}
	
	
	
	public void verifyTotalLeaveTakenCount(String expected) throws Exception
	{
		Thread.sleep(3000);
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[4]/div/div[2]/div/div[4]/a/div/div[1]/h3"));
		
		String actual = elem.getText();
		
		System.out.println(actual);
		soft.assertEquals(actual, expected);
		
		Reporter.log("verifyTotalLeaveTakenCount");
	}
	
	
	public void verifyLeaveBalance(String expected) throws Exception
	{
		Thread.sleep(3000);
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/header/h2/span"));
		
		String actual = elem.getText();
		
		System.out.println(actual);
		soft.assertEquals(actual, expected);
		
		m_Driver.switchTo().defaultContent();
		Reporter.log("verifyLeaveBalance");
	}
	
	
	public void verifySppLeaveDateField(String expectedDate, String expectedDuration,String expectedWeek) throws Exception
	{
		Thread.sleep(3000);

		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtEndDatePaternity']"));
		
		String actualDate = elem.getAttribute("value");
		
		System.out.println(actualDate);
		soft.assertEquals(actualDate, expectedDate);
		
		
        WebElement elem1 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtDurationSPP']"));
		
		String actualDuration = elem1.getAttribute("value");
		
		System.out.println(actualDuration);
		soft.assertEquals(actualDuration, expectedDuration);

		WebElement elem2 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtNoOfWeekPaternity']"));

		String actualWeek = elem2.getAttribute("value");

		System.out.println(actualWeek);
		soft.assertEquals(actualWeek, expectedWeek);
			
		
		Reporter.log("verifySppLeaveDateField");
	}
	
	
	public void verifySmpLeaveDateField(String expectedDate, String expectedDuration,String expectedWeek) throws Exception
	{
		Thread.sleep(3000);

		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtEndDate']"));
		
		String actualDate = elem.getAttribute("value");
		
		System.out.println(actualDate);
		soft.assertEquals(actualDate, expectedDate);
		
		
        WebElement elem1 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtDurationSMP']"));
		
		String actualDuration = elem1.getAttribute("value");
		
		System.out.println(actualDuration);
		soft.assertEquals(actualDuration, expectedDuration);

		WebElement elem2 = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtNoOfWeek']"));

		String actualWeek = elem2.getAttribute("value");

		System.out.println(actualWeek);
		soft.assertEquals(actualWeek, expectedWeek);
			
		
		Reporter.log("verifySmpLeaveDateField");
	}
	
	public void verifyPendingLeaves(String expected) throws Exception
	{
		Thread.sleep(3000);
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='hrefLeavePending']/div/div[1]/h3"));
		
		String actual = elem.getText();
		
		soft.assertEquals(actual, expected);
		
		Reporter.log("verifyPendingLeaves");
	}
	
	
	public void verifyHolidayLeaveDuration(String expected) throws Exception
	{
		Thread.sleep(3000);
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtDurationOther']"));
		
		String actual = elem.getAttribute("value");
		
		soft.assertEquals(actual, expected);
		
		Reporter.log("verifyHalfDayDuration");
	}
	
	
	public void verifySickLeaveDuration(String expected) throws Exception
	{
		Thread.sleep(3000);
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtSickDuration']"));
		
		String actual = elem.getAttribute("value");
		
		soft.assertEquals(actual, expected);
		
		Reporter.log("verifySickLeaveDuration");
	}
	
	
	
	public void verifyleaveApprovedOrRejectMsg()
	{
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[4]/div/div[1]"));
		
		String actualMsg = elem.getText();
		
		soft.assertEquals(actualMsg,"Success! Leave approved successfully.");
		
		Reporter.log("verifyleaveApprovedOrRejectMsg");
	}
	
	public void verifyleaveRejectMsg()
	{
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[4]/div/div[1]"));
		
		String actualMsg = elem.getText();
		
		soft.assertEquals(actualMsg,"Success! Leave rejected successfully.");
		
		Reporter.log("verifyleaveRejectMsg");
	}
	
	public void verifyCancelBtn(String expectedPAGE)
	{
		
		String actualPage = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[4]/header/h2/span")).getText();
		soft.assertEquals(actualPage, expectedPAGE);

		String actualMsg = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[4]/div/div[1]")).getText();

		soft.assertEquals(actualMsg, "Success! Leave Record Deleted Successfully");

		Reporter.log("verifyCancelBtn");

	}
	
	
	
	public void verifyApprovedOrRejectLeavesLeaves(String data1,String data2, String data3, String data4)
	{
		
		
		List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[4]"));
		

		  boolean con=list.isEmpty();
		   soft.assertFalse(con);
		   
		   ArrayList<String> ar= new ArrayList<String>();
			 
			ar.add(data1);
			ar.add(data2);
			ar.add(data3);
			ar.add(data4);
		   
		   
		   
		   for(int i=0;i<=list.size()-1;i++) {
			   
			    WebElement elem = list.get(i);	   
			   String actualText = elem.getText();
			   
			   String LeaveName = list.get(i).getText();
		    	 
		        System.out.println(ar.get(i));
		        soft.assertEquals(LeaveName, ar.get(i));
		     
			   
			   
		   }
		   
		   Reporter.log("verifyApprovedOrRejectLeavesLeaves");
		  
		
		
	}
	
	
	public void verifyApprovedOrRejectLeavesLeavesFromEmployee(String data1,String data2, String data3, String data4)
	{
		
		
		List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[1]"));
		

		  boolean con=list.isEmpty();
		   soft.assertFalse(con);
		   
		   ArrayList<String> ar= new ArrayList<String>();
			 
			ar.add(data1);
			ar.add(data2);
			ar.add(data3);
			ar.add(data4);
		   
		   
		   for(int i=0;i<=list.size()-1;i++) {
			   
			    WebElement elem = list.get(i);	   
			   String actualText = elem.getText();
			   
			   String LeaveName = list.get(i).getText();
		    	 
		        System.out.println(ar.get(i));
		        soft.assertEquals(LeaveName, ar.get(i));
		     			   
		   }
		   
		   Reporter.log("verifyApprovedOrRejectLeavesLeavesFromEmployee");
	
		
	}
	
	
	
	public void verifyRecievedLeaveRequest(String data1,String data2, String data3, String data4, String expectedBody) throws Exception
	{
		
		try {
			
		
			 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[1]/a"));
			
			 System.out.println(list.size());
			boolean con=list.isEmpty();
		     soft.assertFalse(con);
		    
		     ArrayList<String> ar= new ArrayList<String>();
			 
				ar.add(data1);
				ar.add(data2);
				ar.add(data3);
				ar.add(data4);
				
			for (int i=0;i<=list.size()-1;i++)
			{
				
				if(i==4)
				{
					
					break;
				}
				List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[1]/a"));

				WebElement elem = list1.get(i);
				elem.click();
				
				Thread.sleep(3000);
			  
				
				//String Subject = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/div[1]/div/div/div/h4")).getText();
				String Subject = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/div[1]/div/div/div/h4")).getText();

			
				soft.assertEquals(Subject, ar.get(i));
				
				
				String body = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/div[2]/div[2]/div")).getText();
				
				String emailBody = body.replaceAll("\\n", " ");

				System.out.println(emailBody);
				
				soft.assertEquals(emailBody, expectedBody);
						
//				WebElement backBtn = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/div/a"));
//				backBtn.click();
				m_Driver.navigate().back();
				Thread.sleep(4000);
				///  utilities.ChangeWindow.tabswitch(m_Driver);

			}
			Reporter.log("verifyRecievedLeaveRequest");

		} catch (Exception e) {
         System.out.println("Issue In verifyRecievedLeaveRequest"+e);
 	    soft.assertFalse(true,"welcome to catch block");

		}
		
	}
	
	public void verifyRecievedLeaveRequest2Employee(String data1,String data2, String data3, String data4, String data5,String data6,String data7,String data8,String expectedBody) throws Exception
	{
		
		try {
			
		
			 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));
			
			 System.out.println(list.size());
			boolean con=list.isEmpty();
		     soft.assertFalse(con);
		    
		     ArrayList<String> ar= new ArrayList<String>();
			 
				ar.add(data1);
				ar.add(data2);
				ar.add(data3);
				ar.add(data4);
				ar.add(data5);
				ar.add(data6);
				ar.add(data7);
				ar.add(data8);

				
			for (int i=0;i<=list.size()-1;i++)
			{
				
				if(i==8)
				{
					
					break;
				}
				List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));

				WebElement elem = list1.get(i);
				elem.click();
				
				Thread.sleep(3000);
				
				String Subject = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/div[1]/div/div/div/h4")).getText();
				
			
				soft.assertEquals(Subject, ar.get(i));
				
				
				String body = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/div[2]/div[2]/div")).getText();
				
				String emailBody = body.replaceAll("\\n", " ");

				System.out.println(emailBody);
				
				soft.assertEquals(emailBody, expectedBody);
		
				WebElement backBtn = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeaderRight_lbtn_ViewEmail']"));
				backBtn.click();
				Thread.sleep(4000);
			
			}
			Reporter.log("verifyRecievedLeaveRequest");

		} catch (Exception e) {
         System.out.println("Issue In verifyRecievedLeaveRequest"+e);
 	    soft.assertFalse(true,"welcome to catch block");

		}
		
	}
	
	
	
	public void verifyRecievedLeaveRequest1(String data1, String expectedBody) throws Exception
	{
	
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailLog_ctl01_lbtnViewEmail_sub']"));
		elem.click();
		Thread.sleep(3000);
		
		utilities.ChangeWindow.tabswitch(m_Driver);
		String Subject = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/div[1]/div/div/div/h4")).getText();
		
		
		soft.assertEquals(Subject, data1);
		
		
		 String body = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/div[2]/div[2]/div")).getText();
		
		String emailBody = body.replaceAll("\\n", " ");


		
		
		String[] data = emailBody.split(" ");
		System.out.println(data[20]);

		
	soft.assertEquals(data[20], expectedBody);
		
		
	}
	
	
	public void verifyGoBackBtn(String expectedText)
	{
		
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/header/h2/span"));
		
		String actualText=elem.getText();
		
		soft.assertEquals(actualText, expectedText);
		
		
		Reporter.log("verifyGoBackBtn");
		
		
	}
	
	
	public void verifyNotificationNumber(String expectedText)
	{

		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_lblMessageCount']"));
		
		String actualText=elem.getText();
		System.out.println(actualText);
		
		soft.assertEquals(actualText, expectedText);
		
		
		Reporter.log("verifyNotificationNumber");
		
		
	}
	
	
	public void verifyLeaveNotificationDirection(String expectedText)
	{

		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[4]/header/h2/span"));
		
		String actualText=elem.getText();
		
		soft.assertEquals(actualText, expectedText);
		
		
		Reporter.log("verifyLeaveNotificationDirection");
		
		
	}
	
	public void verifyConcideDuration(String expectedText)
	{
		
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div/div[4]/div/div[1]"));
		 
		String actualText=elem.getText();
		
		 actualText = actualText.replaceAll("×", "").trim();
		System.out.println(actualText);
		soft.assertEquals(actualText, expectedText);
	
		Reporter.log("verifyGoBackBtn");
		
	}
	
	public void verifyLeaveResonField(String exxpectedReson)
	{
		
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtReason']"));
		String actualReson = elem.getAttribute("value");
		System.out.println(actualReson);
		System.out.println(exxpectedReson);
		soft.assertEquals(actualReson, exxpectedReson);

		Reporter.log("verifyLeaveResonField");
		
		
	}
	
	
	public void verifySMPLeave(String data1,String data2, String data3, String data4, String data5, String data6,String data7)
	{
		

		  List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td"));
		
		  boolean con=list.isEmpty();
		     soft.assertFalse(con);

		     ArrayList<String> ar= new ArrayList<String>();
			 
				ar.add(data1);
				ar.add(data2);
				ar.add(data3);
				ar.add(data4);
				ar.add(data5);
				ar.add(data6);
				ar.add(data7);
		     
		     for(int i=0;i<=list.size()-1;i++)
		     {
		    	 if(i==7) {break;}

		        String columnsName = list.get(i).getText();
		    	 
		        System.out.println(ar.get(i));
		        soft.assertEquals(columnsName, ar.get(i));
		     
		     }
		     
		     
		     Reporter.log("verifySMPLeave");
		     
	}
	
	
	public void verifySMPLeave1(String data1,String data2, String data3, String data4, String data5, String data6,String data7)
	{
		

		  List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td"));
		
		  boolean con=list.isEmpty();
		     soft.assertFalse(con);

		     ArrayList<String> ar= new ArrayList<String>();
			 
				ar.add(data1);
				ar.add(data2);
				ar.add(data3);
				ar.add(data4);
				ar.add(data5);
				ar.add(data6);
				ar.add(data7);
		     
		     for(int i=0;i<=list.size()-1;i++)
		     {
		    	 if(i==6) {break;}

		        String columnsName = list.get(i).getText();
		    	 
		        System.out.println(ar.get(i));
		        soft.assertEquals(columnsName, ar.get(i));
		     
		     }
		     
		     
		     Reporter.log("verifySMPLeave");
		     
	}
	
	public void verifyDateFilter(String data1,String data2, String data3, String data4, String data5, String data6,String data7)
	{
		

		  List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td"));
		
		  boolean con=list.isEmpty();
		     soft.assertFalse(con);

		     ArrayList<String> ar= new ArrayList<String>();
			 
				ar.add(data1);
				ar.add(data2);
				ar.add(data3);
				ar.add(data4);
				ar.add(data5);
				ar.add(data6);
				ar.add(data7);
		     
		     for(int i=0;i<=list.size()-1;i++)
		     {
		    	 if(i==7) {break;}

		        String columnsName = list.get(i).getText();
		    	 
		        System.out.println(ar.get(i));
		        soft.assertEquals(columnsName, ar.get(i));
		     
		     }
		     
		     
		     Reporter.log("verifySMPLeave");
		     
	}
	
	public void verifyLeaveBalance1(String data1,String data2, String data3, String data4, String data5, String data6)
	{
		
		//m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));


		  List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td"));
		
		  boolean con=list.isEmpty();
		     soft.assertFalse(con);

		     ArrayList<String> ar= new ArrayList<String>();
			 
				ar.add(data1);
				ar.add(data2);
				ar.add(data3);
				ar.add(data4);
				ar.add(data5);
				ar.add(data6);
		     
		     for(int i=1;i<=list.size()-1;i++)
		     {
		    	 if(i==5||i==6||i==7||i==8) {continue;}

		        String columnsName = list.get(i).getAttribute("value");
		    	 
		        System.out.println(columnsName);
		        System.out.println(ar.get(i));
		        soft.assertEquals(columnsName, ar.get(i));
		     
		     }
		     
		     
		     Reporter.log("verifySMPLeave");
		     
	}
	
	public void verifyRejectedComment(String expectedComment)
	{
		
		
		List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[10]"));
		

		    boolean con=list.isEmpty();
		    soft.assertFalse(con);
			   soft.assertEquals(list.size(), 4);

		   for(int i=0;i<=list.size()-1;i++) {
			   
			    WebElement elem = list.get(i);	   
			   String actualText = elem.getText();
			   System.out.println(actualText);
			
		       soft.assertEquals(actualText, expectedComment);
		 
		   }
		   
		   Reporter.log("verifyRejectedComment");
		  
		
		
	}
	
	
	
	public void verifyPendingApprovedAndRejectedLeaves(String expectedText)
	{
		
		
		List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[7]"));
		

		  System.out.println(list.size());
		  boolean con=list.isEmpty();
		   soft.assertFalse(con);
		
		 //  soft.assertEquals(list.size(), 8);
		   
		   for(int i=0;i<=list.size()-1;i++) {
			   
			    WebElement elem = list.get(i);	   
			   String actualText = elem.getText();
			   System.out.println(actualText);
			
		       soft.assertEquals(actualText, expectedText);
		 
		   }
		   
		   Reporter.log("verifyPendingApprovedAndRejectedLeaves");

	}
	
	
	public void verifyPendingApprovedAndRejectedLeaves1(String expectedText)
	{
		
		
		List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[6]"));
		

		  System.out.println(list.size());
		  boolean con=list.isEmpty();
		   soft.assertFalse(con);
		
		 //  soft.assertEquals(list.size(), 8);
		   
		   for(int i=0;i<=list.size()-1;i++) {
			   
			    WebElement elem = list.get(i);	   
			   String actualText = elem.getText();
			   System.out.println(actualText);
			
		       soft.assertEquals(actualText, expectedText);
		 
		   }
		   
		   Reporter.log("verifyPendingApprovedAndRejectedLeaves");

	}
	
	public void verifyEmployeeName(String expectedText)
	{
		
		
		List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[1]"));
		

		  System.out.println(list.size());
		  boolean con=list.isEmpty();
		   soft.assertFalse(con);
		
		 //  soft.assertEquals(list.size(), 8);
		   
		   for(int i=0;i<=list.size()-1;i++) {
			   
			    WebElement elem = list.get(i);	   
			   String actualText = elem.getText();
			   System.out.println(actualText);
			
		       soft.assertEquals(actualText, expectedText);
		 
		   }
		   
		   Reporter.log("verifyEmployeeName");

	}
	
	public void verifyRejectedComment1(String expectedComment)
	{
		
		
		List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[9]"));
		

		  boolean con=list.isEmpty();
		   soft.assertFalse(con);
		   soft.assertEquals(list.size(), 4);

		
		   for(int i=0;i<=list.size()-1;i++) {
			   
			    WebElement elem = list.get(i);	   
			   String actualText = elem.getText();
			   System.out.println(actualText);
			
		       soft.assertEquals(actualText, expectedComment);
		 
		   }
		   
		   Reporter.log("verifyRejectedComment");
		  
		
		
	}
	
	
	public  void verifyAttachments()
	{
		
		  List<WebElement> list = getWebElements(By.xpath("//*[@id='aspnetForm']/main/div/div[3]/div/div[2]/div/div/div/div/table/tbody/tr[2]/td[8]/a[1]"));
		
		   System.out.println(list.size());
		   
		   soft.assertEquals(list.size(), 1);
		   
		   Reporter.log("verifyAttachments");
	}
	
	 public void assertAll()
	   {
		   soft.assertAll();
		   
	   }
}
