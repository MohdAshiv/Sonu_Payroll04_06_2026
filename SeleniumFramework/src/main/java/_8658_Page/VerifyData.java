package _8658_Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import pages.BasePage;

public class VerifyData extends BasePage{

	public VerifyData(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	SoftAssert soft= new SoftAssert();

	
	
	public void PageNavigationWithCheckboxUntick() throws Exception
	{
		
		 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='paginationInner clearfix']/ul/li/a"));

		 
		 List<WebElement> chckboxList = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[1]/input"));
	    
			boolean con=list.isEmpty();
		     soft.assertFalse(con);

		 for(int j=0;j<=chckboxList.size()-1;j++) {
			 
			WebElement data1 = chckboxList.get(j);
			 
			boolean unchecked = data1.isSelected();
			System.out.println(unchecked);
			soft.assertFalse(unchecked);
			 
		 }
		 
		
		for(int i=1;i<=list.size()-2;i++) {
			
			 List<WebElement> list2 = m_Driver.findElements(By.xpath("//*[@class='paginationInner clearfix']/ul/li/a"));
			
			
			if(i==1)
			{
			WebElement data = list2.get(i);
			
			data.click();
            Thread.sleep(1000);
	         System.out.println("_____________________________________________________________");

			 for(int j=0;j<=chckboxList.size()-1;j++) {
				 List<WebElement> chckboxList1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[1]/input"));

				WebElement data1 = chckboxList1.get(j);
				 
				boolean unchecked = data1.isSelected();
				
				System.out.println(unchecked);
				soft.assertFalse(unchecked);
				 
			 }
			 
			}
			
			else
			
			{
				int a=i+1;
				WebElement data = list2.get(a);
				
				data.click();
				
		          Thread.sleep(1000);

         System.out.println("_____________________________________________________________");
                 List<WebElement> chckboxList2 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[1]/input"));

				 for(int j=0;j<=chckboxList2.size()-1;j++) {

					WebElement data1 = chckboxList2.get(j);
					 
					boolean unchecked = data1.isSelected();
					
					System.out.println(unchecked);
					soft.assertFalse(unchecked);
					 
				 }
				 
			}
		}
		
		Reporter.log("PageNavigationWithCheckboxUntick");
	}
	
	
	
	

	public void PageNavigationWithCheckboxUntick_P11D() throws Exception
	{
		
		 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ReportP11DUC_DvP11Page']/ul/li/a"));

		 
		 List<WebElement> chckboxList = m_Driver.findElements(By.xpath("//*[@id='tblRptP11D']/tbody/tr/td/span/input"));
	    
			boolean con=list.isEmpty();
		     soft.assertFalse(con);

		 for(int j=0;j<=chckboxList.size()-1;j++) {
			 
			WebElement data1 = chckboxList.get(j);
			 
			boolean unchecked = data1.isSelected();
			System.out.println(unchecked);
			soft.assertFalse(unchecked);
			 
		 }
		 
		
		for(int i=1;i<=list.size()-2;i++) {
			
			 List<WebElement> list2 = m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ReportP11DUC_DvP11Page']/ul/li/a"));
			
			
			if(i==1)
			{
			WebElement data = list2.get(i);
			
			data.click();
            Thread.sleep(1000);
	         System.out.println("_____________________________________________________________");

			 for(int j=0;j<=chckboxList.size()-1;j++) {
				 List<WebElement> chckboxList1 = m_Driver.findElements(By.xpath("//*[@id='tblRptP11D']/tbody/tr/td/span/input"));

				WebElement data1 = chckboxList1.get(j);
				 
				boolean unchecked = data1.isSelected();
				
				System.out.println(unchecked);
				soft.assertFalse(unchecked);
				 
			 }
			 
			}
			
			else
			
			{
				int a=i+1;
				WebElement data = list2.get(a);
				
				data.click();
				
		          Thread.sleep(1000);

         System.out.println("_____________________________________________________________");
                 List<WebElement> chckboxList2 = m_Driver.findElements(By.xpath("//*[@id='tblRptP11D']/tbody/tr/td/span/input"));

				 for(int j=0;j<=chckboxList2.size()-1;j++) {

					WebElement data1 = chckboxList2.get(j);
					 
					boolean unchecked = data1.isSelected();
					
					System.out.println(unchecked);
					soft.assertFalse(unchecked);
					 
				 }
				 
			}
		}
		
		Reporter.log("PageNavigationWithCheckboxUntick_P11D");
	}
	
	
	
	public void PageNavigationWithCheckboxTick_P11D() throws Exception
	{
		
		m_Driver.findElement(By.xpath("//*[@id='chkAllP11D']")).click();
		
		Thread.sleep(1000);
		 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ReportP11DUC_DvP11Page']/ul/li/a"));

		 
		 List<WebElement> chckboxList = m_Driver.findElements(By.xpath("//*[@id='tblRptP11D']/tbody/tr/td/span/input"));
	    
		 boolean con=list.isEmpty();
	     soft.assertFalse(con);

		 for(int j=0;j<=chckboxList.size()-1;j++) {
			 
			WebElement data1 = chckboxList.get(j);
			 
			boolean unchecked = data1.isSelected();
			
			System.out.println(unchecked);
			soft.assertTrue(unchecked);
			 
		 }
		 
		
		for(int i=1;i<=list.size()-2;i++) {
			
			 List<WebElement> list2 = m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ReportP11DUC_DvP11Page']/ul/li/a"));

			
			
			if(i==1)
			{
			WebElement data = list2.get(i);
			
			data.click();
          Thread.sleep(1000);
	         System.out.println("_____________________________________________________________");


			 for(int j=0;j<=chckboxList.size()-1;j++) {
				 List<WebElement> chckboxList1 = m_Driver.findElements(By.xpath("//*[@id='tblRptP11D']/tbody/tr/td/span/input"));

				 
				WebElement data1 = chckboxList1.get(j);
				 
				boolean unchecked = data1.isSelected();
				
				System.out.println(unchecked);
				soft.assertTrue(unchecked);
				 
			 }
			 
			 
			}
			
			else
			
			{
				int a=i+1;
				WebElement data = list2.get(a);
				
				data.click();
				
		          Thread.sleep(1000);

         System.out.println("_____________________________________________________________");
                 List<WebElement> chckboxList2 = m_Driver.findElements(By.xpath("//*[@id='tblRptP11D']/tbody/tr/td/span/input"));

				 for(int j=0;j<=chckboxList2.size()-1;j++) {

					WebElement data1 = chckboxList2.get(j);
					 
					boolean unchecked = data1.isSelected();
					
					System.out.println(unchecked);
					soft.assertTrue(unchecked);
					 
				 }
				 
			}
		}
		
		Reporter.log("PageNavigationWithCheckboxUntick");
	}
	
	

	public void PageNavigationWithCheckboxTick() throws Exception
	{
		
		m_Driver.findElement(By.xpath("//*[@id='chkSelectAll']")).click();
		
		Thread.sleep(1000);
		 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='paginationInner clearfix']/ul/li/a"));

		 
		 List<WebElement> chckboxList = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[1]/input"));
	    
		 boolean con=list.isEmpty();
	     soft.assertFalse(con);

		 for(int j=0;j<=chckboxList.size()-1;j++) {
			 
			WebElement data1 = chckboxList.get(j);
			 
			boolean unchecked = data1.isSelected();
			
			System.out.println(unchecked);
			soft.assertTrue(unchecked);
			 
		 }
		 
		
		for(int i=1;i<=list.size()-2;i++) {
			
			 List<WebElement> list2 = m_Driver.findElements(By.xpath("//*[@class='paginationInner clearfix']/ul/li/a"));

			
			
			if(i==1)
			{
			WebElement data = list2.get(i);
			
			data.click();
          Thread.sleep(1000);
	         System.out.println("_____________________________________________________________");


			 for(int j=0;j<=chckboxList.size()-1;j++) {
				 List<WebElement> chckboxList1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[1]/input"));

				 
				WebElement data1 = chckboxList1.get(j);
				 
				boolean unchecked = data1.isSelected();
				
				System.out.println(unchecked);
				soft.assertTrue(unchecked);
				 
			 }
			 
			 
			}
			
			else
			
			{
				int a=i+1;
				WebElement data = list2.get(a);
				
				data.click();
				
		          Thread.sleep(1000);

         System.out.println("_____________________________________________________________");
                 List<WebElement> chckboxList2 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[1]/input"));

				 for(int j=0;j<=chckboxList2.size()-1;j++) {

					WebElement data1 = chckboxList2.get(j);
					 
					boolean unchecked = data1.isSelected();
					
					System.out.println(unchecked);
					soft.assertTrue(unchecked);
					 
				 }
				 
			}
		}
		
		Reporter.log("PageNavigationWithCheckboxUntick");
	}
	
	
	

	public void PageNavigationWithCheckboxTickP45() throws Exception
	{
		
		m_Driver.findElement(By.xpath("//*[@id='chkAll']")).click();
		
		Thread.sleep(1000);
		 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='paginationInner clearfix']/ul/li/a"));

		 
		 List<WebElement> chckboxList = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[1]/input"));
	    
		 boolean con=list.isEmpty();
	     soft.assertFalse(con);

		 for(int j=0;j<=chckboxList.size()-1;j++) {
			 
			WebElement data1 = chckboxList.get(j);
			 
			boolean unchecked = data1.isSelected();
			
			System.out.println(unchecked);
			soft.assertTrue(unchecked);
			 
		 }
		 
		
		for(int i=1;i<=list.size()-2;i++) {
			
			 List<WebElement> list2 = m_Driver.findElements(By.xpath("//*[@class='paginationInner clearfix']/ul/li/a"));

			
			
			if(i==1)
			{
			WebElement data = list2.get(i);
			
			data.click();
          Thread.sleep(1000);
	         System.out.println("_____________________________________________________________");


			 for(int j=0;j<=chckboxList.size()-1;j++) {
				 List<WebElement> chckboxList1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[1]/input"));

				 
				WebElement data1 = chckboxList1.get(j);
				 
				boolean unchecked = data1.isSelected();
				
				System.out.println(unchecked);
				soft.assertTrue(unchecked);
				 
			 }
			 
			 
			}
			
			else
			
			{
				int a=i+1;
				WebElement data = list2.get(a);
				
				data.click();
				
		          Thread.sleep(1000);

         System.out.println("_____________________________________________________________");
                 List<WebElement> chckboxList2 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[1]/input"));

				 for(int j=0;j<=chckboxList2.size()-1;j++) {

					WebElement data1 = chckboxList2.get(j);
					 
					boolean unchecked = data1.isSelected();
					
					System.out.println(unchecked);
					soft.assertTrue(unchecked);
					 
				 }
				 
			}
		}
		
		Reporter.log("PageNavigationWithCheckboxUntick");
	}
	
	
	public void PageNavigationWithCheckboxTickP45EmployerView() throws Exception
	{
		
		m_Driver.findElement(By.xpath("//*[@id='chkAll']")).click();
		
		Thread.sleep(1000);
		 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='paginationInner clearfix']/ul/li/a"));

		 
		 List<WebElement> chckboxList = m_Driver.findElements(By.xpath("//*[@id='tblP45']/tbody/tr/td[1]/input[@id='chkemail']"));
	    
		 boolean con=list.isEmpty();
	     soft.assertFalse(con);

		 for(int j=0;j<=chckboxList.size()-1;j++) {
			 
			WebElement data1 = chckboxList.get(j);
			 
			boolean unchecked = data1.isSelected();
			
			System.out.println(unchecked);
			soft.assertTrue(unchecked);
			 
		 }
		 
		
		for(int i=1;i<=list.size()-2;i++) {
			
			 List<WebElement> list2 = m_Driver.findElements(By.xpath("//*[@class='paginationInner clearfix']/ul/li/a"));

			
			
			if(i==1)
			{
			WebElement data = list2.get(i);
			
			data.click();
          Thread.sleep(1000);
	         System.out.println("_____________________________________________________________");


			 for(int j=0;j<=chckboxList.size()-1;j++) {
				 List<WebElement> chckboxList1 = m_Driver.findElements(By.xpath("//*[@id='tblP45']/tbody/tr/td[1]/input[@id='chkemail']"));

				 
				WebElement data1 = chckboxList1.get(j);
				 
				boolean unchecked = data1.isSelected();
				
				System.out.println(unchecked);
				soft.assertTrue(unchecked);
				 
			 }
			 
			 
			}
			
			else
			
			{
				int a=i+1;
				WebElement data = list2.get(a);
				
				data.click();
				
		          Thread.sleep(1000);

         System.out.println("_____________________________________________________________");
                 List<WebElement> chckboxList2 = m_Driver.findElements(By.xpath("//*[@id='tblP45']/tbody/tr/td[1]/input[@id='chkemail']"));

				 for(int j=0;j<=chckboxList2.size()-1;j++) {

					WebElement data1 = chckboxList2.get(j);
					 
					boolean unchecked = data1.isSelected();
					
					System.out.println(unchecked);
					soft.assertTrue(unchecked);
					 
				 }
				 
			}
		}
		
		Reporter.log("PageNavigationWithCheckboxTickP45EmployerView");
	}
	
	
	
	public void verifyP60forEmployer(int data)
	{
		
		try {
			
       List<WebElement> attachmentsEmployerList = m_Driver.findElements(By.xpath("//*[contains(text(),'.pdf')]"));
			
			int p60Reports = attachmentsEmployerList.size();
			System.out.println("p60 attachement count = "+p60Reports);
			soft.assertEquals(p60Reports, data);
			Reporter.log("verifyP60forEmployer");

		} catch (Exception e) {
		
			System.out.println("Issue In verifyP60forEmployer"+ e);
		    soft.assertFalse(true,"welcome to catch block");

		}

	}
	
	
	
	public void verifyRecievedEmployeeP60()
	{
		
	
		
		try {
			
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));
			
			boolean con=list.isEmpty();
		     soft.assertFalse(con);
			for (int i=0;i<=list.size()-1;i++)
			{
				
				List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));

				WebElement elem = list1.get(i);
				elem.click();
				
				Thread.sleep(3000);
				utilities.ChangeWindow.Switchwindow(3, m_Driver);
				WebElement tagData = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/div[2]/div[2]/div/p[1]/span[1]"));
				
				String[] name = tagData.getText().split(" ");
				
				System.out.println(name[1]);
				
	            WebElement  p60data= m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b"));
				
				String[] p60dataIndividual = p60data.getText().split(" ");
				
				System.out.println(p60dataIndividual[1]);

				soft.assertEquals(name[1].replaceAll(",", ""), p60dataIndividual[1]);
				
				List<WebElement> attachmentsList = m_Driver.findElements(By.xpath("//*[contains(text(),'.pdf')]"));
				
				int Count = attachmentsList.size();
				System.out.println("Payslip attachement count = "+Count);
				
			    soft.assertEquals(Count, 2);
			    WebElement backBtn = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/div/a"));

				backBtn.click();
				Thread.sleep(5000);
				utilities.ChangeWindow.Switchwindow(1, m_Driver);
			}
	
			  WebElement elem = m_Driver.findElement(By.xpath("//*[@class='next']/a"));
			  jsExec.executeScript("arguments[0].click()", elem);
			  Thread.sleep(4000);
			
			Reporter.log("verifyRecievedEmployeeP60");

		} catch (Exception e) {
			System.out.println("Issue In verifyRecievedEmployeeP60"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}
		
	}
	
	
	

	public void verifyRecievedEmployeeP60EmployerView()
	{
		
	
		
		try {
			
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));
			
			boolean con=list.isEmpty();
		     soft.assertFalse(con);
			for (int i=0;i<=list.size()-1;i++)
			{
				
				List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));

				WebElement elem = list1.get(i);
				elem.click();
				
				Thread.sleep(3000);
				utilities.ChangeWindow.Switchwindow(4, m_Driver);
				WebElement tagData = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/div[2]/div[2]/div/p[1]/span[1]"));
				
				String[] name = tagData.getText().split(" ");
				
				System.out.println(name[1]);
				
	            WebElement  p60data= m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b"));
				
				String[] p60dataIndividual = p60data.getText().split(" ");
				
				System.out.println(p60dataIndividual[1]);

				soft.assertEquals(name[1].replaceAll(",", ""), p60dataIndividual[1]);
				
				List<WebElement> attachmentsList = m_Driver.findElements(By.xpath("//*[contains(text(),'.pdf')]"));
				
				int Count = attachmentsList.size();
				System.out.println("Payslip attachement count = "+Count);
				
			    soft.assertEquals(Count, 2);
			    WebElement backBtn = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/div/a"));

				backBtn.click();
				Thread.sleep(5000);
				utilities.ChangeWindow.Switchwindow(1, m_Driver);
			}
	
			  WebElement elem = m_Driver.findElement(By.xpath("//*[@class='next']/a"));
			  jsExec.executeScript("arguments[0].click()", elem);
			  Thread.sleep(4000);
			
			Reporter.log("verifyRecievedEmployeeP60");

		} catch (Exception e) {
			System.out.println("Issue In verifyRecievedEmployeeP60"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}
		
	}
	

	
	
	public void verifyRecieved12EmployeeP60()
	{
		
	
		
		try {
			
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));
			
			boolean con=list.isEmpty();
		     soft.assertFalse(con);
			for (int i=0;i<=11;i++)
			{
				
				List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));

				WebElement elem = list1.get(i);
				elem.click();
				
				Thread.sleep(3000);
				utilities.ChangeWindow.Switchwindow(3, m_Driver);
				WebElement tagData = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/div[2]/div[2]/div/p[1]/span[1]"));
				
				String[] name = tagData.getText().split(" ");
				
				System.out.println(name[1]);
				
	            WebElement  p60data= m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b"));
				
				String[] p60dataIndividual = p60data.getText().split(" ");
				
				System.out.println(p60dataIndividual[1]);

				soft.assertEquals(name[1].replaceAll(",", ""), p60dataIndividual[1]);
				
				List<WebElement> attachmentsList = m_Driver.findElements(By.xpath("//*[contains(text(),'.pdf')]"));
				
				int Count = attachmentsList.size();
				System.out.println("Payslip attachement count = "+Count);
				
			    soft.assertEquals(Count, 2);
			    WebElement backBtn = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/div/a"));

				backBtn.click();
				Thread.sleep(5000);
				utilities.ChangeWindow.Switchwindow(1, m_Driver);
			}
	
			 
			Reporter.log("verifyRecievedEmployeeP60");

		} catch (Exception e) {
			System.out.println("Issue In verifyRecievedEmployeeP60"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}
		
	}
	
	
	public void verifyRecieved3EmployeeP60()
	{
		
	
		
		try {
			
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));
			
			boolean con=list.isEmpty();
		     soft.assertFalse(con);
			for (int i=0;i<=2;i++)
			{
				
				List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));

				WebElement elem = list1.get(i);
				elem.click();
				
				Thread.sleep(3000);
				utilities.ChangeWindow.Switchwindow(3, m_Driver);
				WebElement tagData = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/div[2]/div[2]/div/p[1]/span[1]"));
				
				String[] name = tagData.getText().split(" ");
				
				System.out.println(name[1]);
				
	            WebElement  p60data= m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b"));
				
				String[] p60dataIndividual = p60data.getText().split(" ");
				
				System.out.println(p60dataIndividual[1]);

				soft.assertEquals(name[1].replaceAll(",", ""), p60dataIndividual[1]);
				
				List<WebElement> attachmentsList = m_Driver.findElements(By.xpath("//*[contains(text(),'.pdf')]"));
				
				int Count = attachmentsList.size();
				System.out.println("Payslip attachement count = "+Count);
				
			    soft.assertEquals(Count, 2);
			    WebElement backBtn = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/div/a"));

				backBtn.click();
				Thread.sleep(5000);
				utilities.ChangeWindow.Switchwindow(1, m_Driver);
			}
	
			 
			Reporter.log("verifyRecievedEmployeeP60");

		} catch (Exception e) {
			System.out.println("Issue In verifyRecievedEmployeeP60"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}
		
	}
	
	
	public void verifyRecieved3EmployeeEmployerViewP60()
	{
		
	
		
		try {
			
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));
			
			boolean con=list.isEmpty();
		     soft.assertFalse(con);
			for (int i=0;i<=2;i++)
			{
				
				List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));

				WebElement elem = list1.get(i);
				elem.click();
				
				Thread.sleep(3000);
				utilities.ChangeWindow.Switchwindow(4, m_Driver);
				WebElement tagData = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/div[2]/div[2]/div/p[1]/span[1]"));
				
				String[] name = tagData.getText().split(" ");
				
				System.out.println(name[1]);
				
	            WebElement  p60data= m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b"));
				
				String[] p60dataIndividual = p60data.getText().split(" ");
				
				System.out.println(p60dataIndividual[1]);

				soft.assertEquals(name[1].replaceAll(",", ""), p60dataIndividual[1]);
				
				List<WebElement> attachmentsList = m_Driver.findElements(By.xpath("//*[contains(text(),'.pdf')]"));
				
				int Count = attachmentsList.size();
				System.out.println("Payslip attachement count = "+Count);
				
			    soft.assertEquals(Count, 2);
			    WebElement backBtn = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/div/a"));

				backBtn.click();
				Thread.sleep(5000);
				utilities.ChangeWindow.Switchwindow(1, m_Driver);
			}
	
			 
			Reporter.log("verifyRecievedEmployeeP60");

		} catch (Exception e) {
			System.out.println("Issue In verifyRecievedEmployeeP60"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}
		
	}
	public void verifyRecieved12EmployeeP60EmployerView()
	{
		
		
		try {
			
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));
			
			boolean con=list.isEmpty();
		     soft.assertFalse(con);
			for (int i=0;i<=11;i++)
			{
				
				List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));

				WebElement elem = list1.get(i);
				elem.click();
				
				Thread.sleep(3000);
				utilities.ChangeWindow.Switchwindow(4, m_Driver);
				WebElement tagData = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/div[2]/div[2]/div/p[1]/span[1]"));
				
				String[] name = tagData.getText().split(" ");
				
				System.out.println(name[1]);
				
	            WebElement  p60data= m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b"));
				
				String[] p60dataIndividual = p60data.getText().split(" ");
				
				System.out.println(p60dataIndividual[1]);

				soft.assertEquals(name[1].replaceAll(",", ""), p60dataIndividual[1]);
				
				List<WebElement> attachmentsList = m_Driver.findElements(By.xpath("//*[contains(text(),'.pdf')]"));
				
				int Count = attachmentsList.size();
				System.out.println("Payslip attachement count = "+Count);
				
			    soft.assertEquals(Count, 2);
			    WebElement backBtn = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/div/a"));

				backBtn.click();
				Thread.sleep(5000);
				utilities.ChangeWindow.Switchwindow(1, m_Driver);
			}
	
			 
			Reporter.log("verifyRecievedEmployeeP60");

		} catch (Exception e) {
			System.out.println("Issue In verifyRecievedEmployeeP60"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}
		
	}
	
	
	public void assertAll()
	   {
		   soft.assertAll();
		   
	   }
	
	
	
	public void SelectFirstEmployeeFromEveryPage() throws Exception
	{
		
		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_chkGenerate']")).click();
		
		Thread.sleep(1000);
		 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='paginationInner clearfix']/ul/li/a"));

		
		 boolean con=list.isEmpty();
	     soft.assertFalse(con);
		for(int i=1;i<=list.size()-2;i++) {
			
			 List<WebElement> list2 = m_Driver.findElements(By.xpath("//*[@class='paginationInner clearfix']/ul/li/a"));

			
			if(i==1)
			{
			WebElement data = list2.get(i);
			
			data.click();
       
			m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_chkGenerate']")).click();
			
			Thread.sleep(1000);
			}
			
			else
			
			{
				int a=i+1;
				WebElement data = list2.get(a);
				
				data.click();
				
				m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_chkGenerate']")).click();
				
				Thread.sleep(1000); 
				 
			}
		}
		
		Reporter.log("SelectFirstEmployeeFromEveryPage");
	}
	

	
	
	public void UntickOnlyOneEmployee() throws Exception
	{
		
		
		 
		 List<WebElement> chckboxList = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[1]/input"));
	    
		 boolean con=chckboxList.isEmpty();
	     soft.assertFalse(con);

		 for(int j=0;j<=chckboxList.size()-1;j++) {
			 
			 
			 
			 if (j==1)
			 {
				 WebElement data1 = chckboxList.get(j);
				 
					boolean unchecked = data1.isSelected();
					
					System.out.println(unchecked);
					soft.assertFalse(unchecked);
				 
				 
			 }
			 else
			 {
				 
				 
					WebElement data1 = chckboxList.get(j);
					 
					boolean unchecked = data1.isSelected();
					
					System.out.println(unchecked);
					soft.assertTrue(unchecked);
					  
			 }
		
		 }
		 
		
		Reporter.log("UntickOnlyOneEmployee");
	}
	
	
	
	public void UntickOnlyOneEmployeeP11D() throws Exception
	{
		
		
		 
		 List<WebElement> chckboxList = m_Driver.findElements(By.xpath("//*[@id='tblRptP11D']/tbody/tr/td/span/input"));
	    
		 boolean con=chckboxList.isEmpty();
	     soft.assertFalse(con);

		 for(int j=0;j<=chckboxList.size()-1;j++) {
			 
			 
			 
			 if (j==1)
			 {
				 WebElement data1 = chckboxList.get(j);
				 
					boolean unchecked = data1.isSelected();
					
					System.out.println(unchecked);
					soft.assertFalse(unchecked);
				 
				 
			 }
			 else
			 {
				 
					WebElement data1 = chckboxList.get(j);
					 
					boolean unchecked = data1.isSelected();
					
					System.out.println(unchecked);
					soft.assertTrue(unchecked);
					  
			 }
		
		 }
		 
		
		Reporter.log("UntickOnlyOneEmployee");
	}
	
	public void verifyP45forEmployer(int data)
	{
		
		try {
			
			//utilities.ChangeWindow.Switchwindow(3, m_Driver);

            WebElement subData = m_Driver.findElement(By.xpath("//*[contains(text(),'2023')]"));
				
				String[] subject = subData.getText().split(" ");
				
				System.out.println(subject[3]);
				
				soft.assertEquals(subject[3], "P45");
			
       List<WebElement> attachmentsEmployerList = m_Driver.findElements(By.xpath("//*[contains(text(),'.pdf')]"));
			
			int p45DReports = attachmentsEmployerList.size();
			System.out.println("p45 attachement count = "+p45DReports);
			soft.assertEquals(p45DReports, data);
			Reporter.log("verifyP60forEmployer");

		} catch (Exception e) {
		
			System.out.println("Issue In verifyP45forEmployer"+ e);
		    soft.assertFalse(true,"welcome to catch block");

		}

	}
	
	
	public void verifyRecievedP45()
	{
		
		
		try {
			
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));
			
			boolean con=list.isEmpty();
		     soft.assertFalse(con);
			for (int i=0;i<=list.size()-1;i++)
			{
		
				List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));

				WebElement elem = list1.get(i);
				elem.click();
				utilities.ChangeWindow.Switchwindow(3, m_Driver);

				Thread.sleep(3000);
				
				
               WebElement subData = m_Driver.findElement(By.xpath("//*[contains(text(),'2023')]"));
				
				String[] subject = subData.getText().split(" ");
				
				System.out.println(subject[2]);
				
				soft.assertEquals(subject[2], "P45");
				
				
				WebElement tagData = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/div[2]/div[2]/div/p[1]/font/span"));
				
				String[] name = tagData.getText().split(" ");
				
				System.out.println(name[1]);
				
	            WebElement  p11data= m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b"));
				
				String[] p11dataIndividual = p11data.getText().split(" ");
				
				System.out.println(p11dataIndividual[1]);

				soft.assertEquals(name[1].replaceAll(",", ""), p11dataIndividual[1]);
				
				List<WebElement> attachmentsList = m_Driver.findElements(By.xpath("//*[contains(text(),'.pdf')]"));
				
				int Count = attachmentsList.size();
				System.out.println("P11D attachement count = "+Count);
				
			    soft.assertEquals(Count, 2);
				WebElement backBtn = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/div/a"));
				
				backBtn.click();
				Thread.sleep(5000);
				utilities.ChangeWindow.Switchwindow(1, m_Driver);
			}
			
			  WebElement elem = m_Driver.findElement(By.xpath("//*[@class='next']/a"));
			  jsExec.executeScript("arguments[0].click()", elem);
			  Thread.sleep(4000);
			
			Reporter.log("verifyRecievedP45");

		} catch (Exception e) {
			System.out.println("Issue In verifyRecievedP45"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}
		
	}
	
	
	public void verifyRecievedP45EmployerView()
	{
		
		
		try {
			
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));
			
			boolean con=list.isEmpty();
		     soft.assertFalse(con);
			for (int i=0;i<=list.size()-1;i++)
			{
		
				List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));

				WebElement elem = list1.get(i);
				elem.click();
				utilities.ChangeWindow.Switchwindow(4, m_Driver);

				Thread.sleep(3000);
				
				
               WebElement subData = m_Driver.findElement(By.xpath("//*[contains(text(),'2023')]"));
				
				String[] subject = subData.getText().split(" ");
				
				System.out.println(subject[2]);
				
				soft.assertEquals(subject[2], "P45");
				
				
				WebElement tagData = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/div[2]/div[2]/div/p[1]/font/span"));
				
				String[] name = tagData.getText().split(" ");
				
				System.out.println(name[1]);
				
	            WebElement  p11data= m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b"));
				
				String[] p11dataIndividual = p11data.getText().split(" ");
				
				System.out.println(p11dataIndividual[1]);

				soft.assertEquals(name[1].replaceAll(",", ""), p11dataIndividual[1]);
				
				List<WebElement> attachmentsList = m_Driver.findElements(By.xpath("//*[contains(text(),'.pdf')]"));
				
				int Count = attachmentsList.size();
				System.out.println("P11D attachement count = "+Count);
				
			    soft.assertEquals(Count, 2);
				WebElement backBtn = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/div/a"));
				
				backBtn.click();
				Thread.sleep(5000);
				utilities.ChangeWindow.Switchwindow(1, m_Driver);
			}
			
			  WebElement elem = m_Driver.findElement(By.xpath("//*[@class='next']/a"));
			  jsExec.executeScript("arguments[0].click()", elem);
			  Thread.sleep(4000);
			
			Reporter.log("verifyRecievedP45");

		} catch (Exception e) {
			System.out.println("Issue In verifyRecievedP45"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}
		
	}
	
	
	public void verifyRecievedP45For12Employee()
	{
		
		
		try {
			
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));
			
			boolean con=list.isEmpty();
		     soft.assertFalse(con);
			for (int i=0;i<=11;i++)
			{
		
				List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));

				WebElement elem = list1.get(i);
				elem.click();
				utilities.ChangeWindow.Switchwindow(3, m_Driver);

				Thread.sleep(3000);
				
				
               WebElement subData = m_Driver.findElement(By.xpath("//*[contains(text(),'2023')]"));
				
				String[] subject = subData.getText().split(" ");
				
				System.out.println(subject[2]);
				
				soft.assertEquals(subject[2], "P45");
				
				
				WebElement tagData = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/div[2]/div[2]/div/p[1]/font/span"));
				
				String[] name = tagData.getText().split(" ");
				
				System.out.println(name[1]);
				
	            WebElement  p11data= m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b"));
				
				String[] p11dataIndividual = p11data.getText().split(" ");
				
				System.out.println(p11dataIndividual[1]);

				soft.assertEquals(name[1].replaceAll(",", ""), p11dataIndividual[1]);
				
				List<WebElement> attachmentsList = m_Driver.findElements(By.xpath("//*[contains(text(),'.pdf')]"));
				
				int Count = attachmentsList.size();
				System.out.println("P11D attachement count = "+Count);
				
			    soft.assertEquals(Count, 2);
				WebElement backBtn = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/div/a"));
				
				backBtn.click();
				Thread.sleep(5000);
				utilities.ChangeWindow.Switchwindow(1, m_Driver);
			}
			
			Reporter.log("verifyRecievedP45For12Employee");

		} catch (Exception e) {
			System.out.println("Issue In verifyRecievedP45For12Employee"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}
		
	}
	
	
	public void verifyRecievedP45For12Employee_EmployerView()
	{
		
		
		try {
			
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));
			
			boolean con=list.isEmpty();
		     soft.assertFalse(con);
			for (int i=0;i<=11;i++)
			{
		
				List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));

				WebElement elem = list1.get(i);
				elem.click();
				utilities.ChangeWindow.Switchwindow(4, m_Driver);

				Thread.sleep(3000);
				
				
               WebElement subData = m_Driver.findElement(By.xpath("//*[contains(text(),'2023')]"));
				
				String[] subject = subData.getText().split(" ");
				
				System.out.println(subject[2]);
				
				soft.assertEquals(subject[2], "P45");
				
				
				WebElement tagData = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/div[2]/div[2]/div/p[1]/font/span"));
				
				String[] name = tagData.getText().split(" ");
				
				System.out.println(name[1]);
				
	            WebElement  p11data= m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b"));
				
				String[] p11dataIndividual = p11data.getText().split(" ");
				
				System.out.println(p11dataIndividual[1]);

				soft.assertEquals(name[1].replaceAll(",", ""), p11dataIndividual[1]);
				
				List<WebElement> attachmentsList = m_Driver.findElements(By.xpath("//*[contains(text(),'.pdf')]"));
				
				int Count = attachmentsList.size();
				System.out.println("P11D attachement count = "+Count);
				
			    soft.assertEquals(Count, 2);
				WebElement backBtn = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/div/a"));
				
				backBtn.click();
				Thread.sleep(5000);
				utilities.ChangeWindow.Switchwindow(1, m_Driver);
			}
			
			Reporter.log("verifyRecievedP45For12Employee");

		} catch (Exception e) {
			System.out.println("Issue In verifyRecievedP45For12Employee"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}
		
	}
	
	
	public void verifyRecievedP45For3Employee()
	{
		
		
		try {
			
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));
			
			boolean con=list.isEmpty();
		     soft.assertFalse(con);
			for (int i=0;i<=2;i++)
			{
		
				List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));

				WebElement elem = list1.get(i);
				elem.click();
				utilities.ChangeWindow.Switchwindow(3, m_Driver);

				Thread.sleep(3000);
				
				
               WebElement subData = m_Driver.findElement(By.xpath("//*[contains(text(),'2023')]"));
				
				String[] subject = subData.getText().split(" ");
				
				System.out.println(subject[2]);
				
				soft.assertEquals(subject[2], "P45");
				
				
				WebElement tagData = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/div[2]/div[2]/div/p[1]/font/span"));
				
				String[] name = tagData.getText().split(" ");
				
				System.out.println(name[1]);
				
	            WebElement  p11data= m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b"));
				
				String[] p11dataIndividual = p11data.getText().split(" ");
				
				System.out.println(p11dataIndividual[1]);

				soft.assertEquals(name[1].replaceAll(",", ""), p11dataIndividual[1]);
				
				List<WebElement> attachmentsList = m_Driver.findElements(By.xpath("//*[contains(text(),'.pdf')]"));
				
				int Count = attachmentsList.size();
				System.out.println("P11D attachement count = "+Count);
				
			    soft.assertEquals(Count, 2);
				WebElement backBtn = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/div/a"));
				
				backBtn.click();
				Thread.sleep(5000);
				utilities.ChangeWindow.Switchwindow(1, m_Driver);
			}
			
			Reporter.log("verifyRecievedP45For12Employee");

		} catch (Exception e) {
			System.out.println("Issue In verifyRecievedP45For12Employee"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}
		
	}
	
	
	public void verifyRecievedP45For3EmployeeEmployerView()
	{
		
		
		try {
			
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));
			
			boolean con=list.isEmpty();
		     soft.assertFalse(con);
			for (int i=0;i<=2;i++)
			{
		
				List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));

				WebElement elem = list1.get(i);
				elem.click();
				utilities.ChangeWindow.Switchwindow(4, m_Driver);

				Thread.sleep(3000);
				
				
               WebElement subData = m_Driver.findElement(By.xpath("//*[contains(text(),'2023')]"));
				
				String[] subject = subData.getText().split(" ");
				
				System.out.println(subject[2]);
				
				soft.assertEquals(subject[2], "P45");
				
				
				WebElement tagData = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/div[2]/div[2]/div/p[1]/font/span"));
				
				String[] name = tagData.getText().split(" ");
				
				System.out.println(name[1]);
				
	            WebElement  p11data= m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b"));
				
				String[] p11dataIndividual = p11data.getText().split(" ");
				
				System.out.println(p11dataIndividual[1]);

				soft.assertEquals(name[1].replaceAll(",", ""), p11dataIndividual[1]);
				
				List<WebElement> attachmentsList = m_Driver.findElements(By.xpath("//*[contains(text(),'.pdf')]"));
				
				int Count = attachmentsList.size();
				System.out.println("P11D attachement count = "+Count);
				
			    soft.assertEquals(Count, 2);
				WebElement backBtn = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/div/a"));
				
				backBtn.click();
				Thread.sleep(5000);
				utilities.ChangeWindow.Switchwindow(1, m_Driver);
			}
			
			Reporter.log("verifyRecievedP45For12Employee");

		} catch (Exception e) {
			System.out.println("Issue In verifyRecievedP45For12Employee"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}
		
	}
	
	
	public void UntickOnlyOneEmployeeEmployerViewP45() throws Exception
	{
		
		
		 
		 List<WebElement> chckboxList = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[1]/input[1]"));
	    
		 boolean con=chckboxList.isEmpty();
	     soft.assertFalse(con);

		 for(int j=0;j<=chckboxList.size()-1;j++) {
			 
			 
			 
			 if (j==1)
			 {
				 WebElement data1 = chckboxList.get(j);
				 
					boolean unchecked = data1.isSelected();
					
					System.out.println(unchecked);
					soft.assertFalse(unchecked);
				 
				 
			 }
			 else
			 {
				 
				 
					WebElement data1 = chckboxList.get(j);
					 
					boolean unchecked = data1.isSelected();
					
					System.out.println(unchecked);
					soft.assertTrue(unchecked);
					  
			 }
		
		 }
		 
		
		Reporter.log("UntickOnlyOneEmployee");
	}
	
	
	public void verifyP11DforEmployer(int count)
	{
		
		try {
			
			
		//	utilities.ChangeWindow.Switchwindow(3, m_Driver);
            WebElement subData = m_Driver.findElement(By.xpath("//*[contains(text(),'2022')]"));
				
				String[] subject = subData.getText().split(" ");
				
				System.out.println(subject[2]);
				
				soft.assertEquals(subject[2], "P11D");
			
       List<WebElement> attachmentsEmployerList = m_Driver.findElements(By.xpath("//*[contains(text(),'.pdf')]"));
			
			int p11DReports = attachmentsEmployerList.size();
			System.out.println("p60 attachement count = "+p11DReports);
			soft.assertEquals(p11DReports, count);
			Reporter.log("verifyP60forEmployer");

		} catch (Exception e) {
		
			System.out.println("Issue In verifyP60forEmployer"+ e);
		    soft.assertFalse(true,"welcome to catch block");

		}

	}
	
	
	public void verifyRecievedP11D()
	{
		
		
		try {
			
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));
			
			boolean con=list.isEmpty();
		     soft.assertFalse(con);
			for (int i=0;i<=list.size()-1;i++)
			{

				List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));

				WebElement elem = list1.get(i);
				elem.click();
				
				Thread.sleep(3000);
				utilities.ChangeWindow.Switchwindow(3, m_Driver);
				
               WebElement subData = m_Driver.findElement(By.xpath("//*[contains(text(),'2022')]"));
				
				String[] subject = subData.getText().split(" ");
				
				System.out.println(subject[3]);
				
				soft.assertEquals(subject[3], "P11D");
				
				
				WebElement tagData = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/div[2]/div[2]/div/p[1]/span[1]"));
				
				String[] name = tagData.getText().split(" ");
				
				System.out.println(name[1]);
				
	            WebElement  p11data= m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b"));
				
				String[] p11dataIndividual = p11data.getText().split(" ");
				
				System.out.println(p11dataIndividual[1]);

				soft.assertEquals(name[1].replaceAll(",", ""), p11dataIndividual[1]);
				
				List<WebElement> attachmentsList = m_Driver.findElements(By.xpath("//*[contains(text(),'.pdf')]"));
				
				int Count = attachmentsList.size();
				System.out.println("P11D attachement count = "+Count);
				
			    soft.assertEquals(Count, 2);
				WebElement backBtn = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/div/a"));
				backBtn.click();
				Thread.sleep(4000);
				utilities.ChangeWindow.Switchwindow(1, m_Driver);
			}
			
			  WebElement elem = m_Driver.findElement(By.xpath("//*[@class='next']/a"));
			  jsExec.executeScript("arguments[0].click()", elem);
			  Thread.sleep(4000);
			
			Reporter.log("verifyRecievedP11D");

		} catch (Exception e) {
			System.out.println("Issue In verifyRecievedP11D"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}
		
	}
	
	

	public void verifyRecievedP11D_EmployerView()
	{
		
		
		try {
			
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));
			
			boolean con=list.isEmpty();
		     soft.assertFalse(con);
			for (int i=0;i<=list.size()-1;i++)
			{

				List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));

				WebElement elem = list1.get(i);
				elem.click();
				
				Thread.sleep(3000);
				utilities.ChangeWindow.Switchwindow(4, m_Driver);
				
               WebElement subData = m_Driver.findElement(By.xpath("//*[contains(text(),'2022')]"));
				
				String[] subject = subData.getText().split(" ");
				
				System.out.println(subject[3]);
				
				soft.assertEquals(subject[3], "P11D");
				
				
				WebElement tagData = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/div[2]/div[2]/div/p[1]/span[1]"));
				
				String[] name = tagData.getText().split(" ");
				
				System.out.println(name[1]);
				
	            WebElement  p11data= m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b"));
				
				String[] p11dataIndividual = p11data.getText().split(" ");
				
				System.out.println(p11dataIndividual[1]);

				soft.assertEquals(name[1].replaceAll(",", ""), p11dataIndividual[1]);
				
				List<WebElement> attachmentsList = m_Driver.findElements(By.xpath("//*[contains(text(),'.pdf')]"));
				
				int Count = attachmentsList.size();
				System.out.println("P11D attachement count = "+Count);
				
			    soft.assertEquals(Count, 2);
				WebElement backBtn = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/div/a"));
				backBtn.click();
				Thread.sleep(4000);
				utilities.ChangeWindow.Switchwindow(1, m_Driver);
			}
			
			  WebElement elem = m_Driver.findElement(By.xpath("//*[@class='next']/a"));
			  jsExec.executeScript("arguments[0].click()", elem);
			  Thread.sleep(4000);
			
			Reporter.log("verifyRecievedP11D");

		} catch (Exception e) {
			System.out.println("Issue In verifyRecievedP11D"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}
		
	}
	
	public void verifyRecievedP11D12Employee()
	{
		
		
		try {
			
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));
			
			boolean con=list.isEmpty();
		     soft.assertFalse(con);
			for (int i=0;i<=11;i++)
			{

				List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));

				WebElement elem = list1.get(i);
				elem.click();
				
				Thread.sleep(3000);
				utilities.ChangeWindow.Switchwindow(3, m_Driver);
				
               WebElement subData = m_Driver.findElement(By.xpath("//*[contains(text(),'2022')]"));
				
				String[] subject = subData.getText().split(" ");
				
				System.out.println(subject[3]);
				
				soft.assertEquals(subject[3], "P11D");
				
				
				WebElement tagData = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/div[2]/div[2]/div/p[1]/span[1]"));
				
				String[] name = tagData.getText().split(" ");
				
				System.out.println(name[1]);
				
	            WebElement  p11data= m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b"));
				
				String[] p11dataIndividual = p11data.getText().split(" ");
				
				System.out.println(p11dataIndividual[1]);

				soft.assertEquals(name[1].replaceAll(",", ""), p11dataIndividual[1]);
				
				List<WebElement> attachmentsList = m_Driver.findElements(By.xpath("//*[contains(text(),'.pdf')]"));
				
				int Count = attachmentsList.size();
				System.out.println("P11D attachement count = "+Count);
				
			    soft.assertEquals(Count, 2);
				WebElement backBtn = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/div/a"));
				backBtn.click();
				Thread.sleep(4000);
				utilities.ChangeWindow.Switchwindow(1, m_Driver);
			}
			
			 
			
			Reporter.log("verifyRecievedP11D12Employee");

		} catch (Exception e) {
			System.out.println("Issue In verifyRecievedP11D12Employee"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}
		
	}
	
	public void verifyRecievedP11D12Employee_EmployerView()
	{
		
		
		try {
			
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));
			
			boolean con=list.isEmpty();
		     soft.assertFalse(con);
			for (int i=0;i<=11;i++)
			{

				List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));

				WebElement elem = list1.get(i);
				elem.click();
				
				Thread.sleep(3000);
				utilities.ChangeWindow.Switchwindow(4, m_Driver);
				
               WebElement subData = m_Driver.findElement(By.xpath("//*[contains(text(),'2022')]"));
				
				String[] subject = subData.getText().split(" ");
				
				System.out.println(subject[3]);
				
				soft.assertEquals(subject[3], "P11D");
				
				
				WebElement tagData = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/div[2]/div[2]/div/p[1]/span[1]"));
				
				String[] name = tagData.getText().split(" ");
				
				System.out.println(name[1]);
				
	            WebElement  p11data= m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b"));
				
				String[] p11dataIndividual = p11data.getText().split(" ");
				
				System.out.println(p11dataIndividual[1]);

				soft.assertEquals(name[1].replaceAll(",", ""), p11dataIndividual[1]);
				
				List<WebElement> attachmentsList = m_Driver.findElements(By.xpath("//*[contains(text(),'.pdf')]"));
				
				int Count = attachmentsList.size();
				System.out.println("P11D attachement count = "+Count);
				
			    soft.assertEquals(Count, 2);
				WebElement backBtn = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/div/a"));
				backBtn.click();
				Thread.sleep(4000);
				utilities.ChangeWindow.Switchwindow(1, m_Driver);
			}
			
			 
			
			Reporter.log("verifyRecievedP11D12Employee");

		} catch (Exception e) {
			System.out.println("Issue In verifyRecievedP11D12Employee"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}
		
	}
	
	public void verifyRecievedP11D3Employee()
	{
		
		
		try {
			
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));
			
			boolean con=list.isEmpty();
		     soft.assertFalse(con);
			for (int i=0;i<=2;i++)
			{

				List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));

				WebElement elem = list1.get(i);
				elem.click();
				
				Thread.sleep(3000);
				utilities.ChangeWindow.Switchwindow(3, m_Driver);
				
               WebElement subData = m_Driver.findElement(By.xpath("//*[contains(text(),'2022')]"));
				
				String[] subject = subData.getText().split(" ");
				
				System.out.println(subject[3]);
				
				soft.assertEquals(subject[3], "P11D");
				
				
				WebElement tagData = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/div[2]/div[2]/div/p[1]/span[1]"));
				
				String[] name = tagData.getText().split(" ");
				
				System.out.println(name[1]);
				
	            WebElement  p11data= m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b"));
				
				String[] p11dataIndividual = p11data.getText().split(" ");
				
				System.out.println(p11dataIndividual[1]);

				soft.assertEquals(name[1].replaceAll(",", ""), p11dataIndividual[1]);
				
				List<WebElement> attachmentsList = m_Driver.findElements(By.xpath("//*[contains(text(),'.pdf')]"));
				
				int Count = attachmentsList.size();
				System.out.println("P11D attachement count = "+Count);
				
			    soft.assertEquals(Count, 2);
				WebElement backBtn = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/div/a"));
				backBtn.click();
				Thread.sleep(4000);
				
				utilities.ChangeWindow.Switchwindow(1,m_Driver);
			}
			
			 
			
			Reporter.log("verifyRecievedP11D12Employee");

		} catch (Exception e) {
			System.out.println("Issue In verifyRecievedP11D12Employee"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}
		
	}
	
	
	public void verifyRecievedP11D3Employee_EmployerView()
	{
		
		
		try {
			
			List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));
			
			boolean con=list.isEmpty();
		     soft.assertFalse(con);
			for (int i=0;i<=2;i++)
			{

				List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[2]/a"));

				WebElement elem = list1.get(i);
				elem.click();
				
				Thread.sleep(3000);
				utilities.ChangeWindow.Switchwindow(4, m_Driver);
				
               WebElement subData = m_Driver.findElement(By.xpath("//*[contains(text(),'2022')]"));
				
				String[] subject = subData.getText().split(" ");
				
				System.out.println(subject[3]);
				
				soft.assertEquals(subject[3], "P11D");
				
				
				WebElement tagData = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/div[2]/div[2]/div/p[1]/span[1]"));
				
				String[] name = tagData.getText().split(" ");
				
				System.out.println(name[1]);
				
	            WebElement  p11data= m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']/b"));
				
				String[] p11dataIndividual = p11data.getText().split(" ");
				
				System.out.println(p11dataIndividual[1]);

				soft.assertEquals(name[1].replaceAll(",", ""), p11dataIndividual[1]);
				
				List<WebElement> attachmentsList = m_Driver.findElements(By.xpath("//*[contains(text(),'.pdf')]"));
				
				int Count = attachmentsList.size();
				System.out.println("P11D attachement count = "+Count);
				
			    soft.assertEquals(Count, 2);
				WebElement backBtn = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divMainContent']/header/div/a"));
				backBtn.click();
				Thread.sleep(4000);
				
				utilities.ChangeWindow.Switchwindow(1,m_Driver);
			}
			
			 
			
			Reporter.log("verifyRecievedP11D12Employee");

		} catch (Exception e) {
			System.out.println("Issue In verifyRecievedP11D12Employee"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}
		
	}
}
