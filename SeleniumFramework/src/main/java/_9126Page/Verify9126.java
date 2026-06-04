package _9126Page;

import static org.testng.Assert.fail;

import java.io.File;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import pages.BasePage;

public class Verify9126 extends BasePage {

	public Verify9126(WebDriver driver) {
		super(driver);
	}
	 String path="E:\\GITCLONE\\SonuPayrollNew2\\SeleniumFramework\\PdfFile\\";

	
	private By editMainContactElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_rptrContactDetails_ctl00_btnEditEmployee']");

	
	
	SoftAssert soft= new SoftAssert();

	public void verifyDepartment(String data,String data1,String data2, String data3, String data4)
	{
		
		try {
			 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[1]"));
			 ArrayList<String> ar= new ArrayList<String>();
				ar.add(data);
				ar.add(data1);
				ar.add(data2);
				ar.add(data3);
				ar.add(data4);
		
				boolean con=list.isEmpty();
			     soft.assertFalse(con);
				
			 for (int i =0;i<=list.size()-1;i++)
			 {
				 
				 List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[1]"));

				 WebElement elem = list1.get(i);
				 
				String actualData = elem.getText();
				actualData = actualData.replaceAll("[£]", "");
				actualData = actualData.replaceAll("[,]", "");

				System.out.println(actualData);
				 soft.assertEquals(actualData, ar.get(i));
				
			 }
			 
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verifyDepartment"+e);
		}
		Reporter.log("verifyDepartment");

	}
	
	
	
	public void verifyDataGroup() {
		
		List<WebElement> rows = m_Driver.findElements(By.cssSelector("tr[data-group]"));
        int j=0;
		 ArrayList<String> ar= new ArrayList<String>();
			ar.add("Mr. Employee C");
			ar.add("Mr. Employee D");
			ar.add("Mr. Employee A");
			ar.add("Mr. Employee B");
			ar.add("Mr. Employee E");

			
		for (WebElement r : rows) {
		  String grp = r.getAttribute("data-group");
		 WebElement icn = r.findElement(By.xpath("//*[@data-group='"+grp+"']/th[14]"));
		String data = icn.getText().trim();
		   if(data.equals("[+]"))
		   {
			   icn.click();  
		   }
		   else {
			   
			   System.out.println("plus Icn Alerady extended");
		   }
		   
		   List<WebElement> list = r.findElements(By.xpath("//tr[@class='"+grp+"']/td[1]"));
		   
		   for(int i=0;i<=list.size()-1;i++) {
			   
			   String name=list.get(i).getText();
		 System.err.println(name);
		 soft.assertEquals(name, ar.get(j));
	
             j++;
		   }
		   
		}
		
		
	}
	
	
	
	
	public void verifyDataGroupFrequencyWise(String department, String DepartmentName) {
		
		List<WebElement> rows = m_Driver.findElements(By.xpath("//th[normalize-space()='"+department+"']/parent::tr"));
        int j=0;
		 ArrayList<String> ar= new ArrayList<String>();
			
			ar.add(DepartmentName);			
		for (WebElement r : rows) {
		  String grp = r.getAttribute("data-group");
		 WebElement icn = r.findElement(By.xpath("//*[@data-group='"+grp+"']/th[14]"));
		String data = icn.getText().trim();
		   if(data.equals("[+]"))
		   {
			   icn.click();  
		   }
		   else {
			   
			   System.out.println("plus Icn Alerady extended");
		   }
		   
		   List<WebElement> list = r.findElements(By.xpath("//tr[@class='"+grp+"']/td[1]"));
		   
		   for(int i=0;i<=list.size()-1;i++) {
			   
			   String name=list.get(i).getText();
		 System.err.println(name);
		 soft.assertEquals(name, ar.get(j));
	
             j++;
		   }
		   
		}
		
		
	}
	
	public void verifyHeaderRow(String data,String data1,String data2, String data3, String data4,String data5,String data6,String data7,String data8)
	{
		
		try {
			 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/th"));
			 ArrayList<String> ar= new ArrayList<String>();
				ar.add(data);
				ar.add(data1);
				ar.add(data2);
				ar.add(data3);
				ar.add(data4);
				ar.add(data5);
				ar.add(data6);
				ar.add(data7);
				ar.add(data8);

				boolean con=list.isEmpty();
			     soft.assertFalse(con);
				
			 for (int i =0;i<=list.size()-1;i++)
			 {
				 
				 List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/th"));

				 WebElement elem = list1.get(i);
				 
				String actualData = elem.getText();
				actualData = actualData.replaceAll("[£]", "");
				actualData = actualData.replaceAll("[,]", "");

				System.out.println(actualData);
				 soft.assertEquals(actualData, ar.get(i));
				
			 }
			 
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verifyDepartment"+e);
		}
		Reporter.log("verifyDepartment");

	}
	
	public void verifySelectedDepartment(String data,String data1,String data2, String data3, String data4)
	{
		
		try {
			 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[1]"));
			 ArrayList<String> ar= new ArrayList<String>();
				ar.add(data);
				ar.add(data1);
				ar.add(data2);
				ar.add(data3);
				ar.add(data4);
		
				boolean con=list.isEmpty();
			     soft.assertFalse(con);
			     
			     soft.assertEquals(list.size(), 1);
				
			 for (int i =0;i<=list.size()-1;i++)
			 {
				 
				 List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[1]"));

				 WebElement elem = list1.get(i);
				 
				String actualData = elem.getText();
				actualData = actualData.replaceAll("[£]", "");
				actualData = actualData.replaceAll("[,]", "");

				System.out.println(actualData);
				soft.assertEquals(actualData, ar.get(i));
				
			 }
			 
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verifyDepartment"+e);
		}
		Reporter.log("verifyDepartment");

	}
	
	
	public void verifyHeader(String expectedData) {
		
		
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div[1]/div[3]/header/h2/span"));
		
		String actualData=elem.getText();
		
		soft.assertEquals(actualData, expectedData);
		
		Reporter.log("verifyHeader");

	}
	
	

	public void verifyDateFieldEnable(String expectedData) {
		
		
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='dvCustomRange']/div/label"));
		
		String actualData=elem.getText();
		System.out.println(actualData);
		
		soft.assertEquals(actualData, expectedData);
		
		Reporter.log("verifyDateFieldEnable");

	}

	
	public void verifyAlert(String data)
	{
		
		try {
			

			String alert = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/main/div[1]/div[3]/div/div[1]")).getText();
			
			String alertMsg = alert.replaceAll("×", "").trim();
			System.out.println(alertMsg);
			soft.assertEquals(alertMsg, data);
			
			
		} catch (Exception e) {
			System.out.println("Issue in verifyDepatrmentSavedMsg"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}
		Reporter.log("verifyDepatrmentSavedMsg");
	}
	
	public void verifyTagsAndText()
	{
		
		
		WebElement select_drop_down = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_DdlPeriodEnd']"));
		
		Select select = new Select(select_drop_down);
		
		String [] verify=  {"31/03/2024","29/02/2024","31/01/2024","31/12/2023","30/11/2023","31/10/2023","30/09/2023","31/08/2023","31/07/2023","30/06/2023","31/05/2023","30/04/2023","Custom"};
	    int k=0;
		List<WebElement> all_options = select.getOptions();
		
		int data=all_options.size();
		System.out.println(data);
		
		for(int i=0;i<=all_options.size()-1;i++)
		{
		List<WebElement> all_options2 = select.getOptions();

		
		String value=all_options2.get(i).getText();
		System.out.println(value);
		
		soft .assertEquals(verify[k], value);
	     k++;
			
		}
//		
//		boolean text = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_tbContainer_tppayrollDetails_textPassword2']")).isEnabled();
//		
//		soft.assertTrue(text,"Password text Not Enabled");

		
	}
	
	

	public void verifyTagsAndTextDepatmrnt()
	{
		
		
		WebElement select_drop_down = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_DdlDepartment']"));
		
		Select select = new Select(select_drop_down);
		
		String [] verify=  {"All","Nomisma","Outbooks","Tester"};
	    int k=0;
		List<WebElement> all_options = select.getOptions();
		
		int data=all_options.size();
		System.out.println(data);
		
		for(int i=0;i<=all_options.size()-1;i++)
		{
		List<WebElement> all_options2 = select.getOptions();

		
		String value=all_options2.get(i).getText();
		System.out.println(value);
		
		soft .assertEquals(verify[k], value);
	     k++;
			
		}

		
	}
	
	
	public void verifyTagsAndTextReoortType()
	{
		
		
		WebElement select_drop_down = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_DdlReportType']"));
		
		Select select = new Select(select_drop_down);
		
		String [] verify=  {"Summarized","Detailed"};
	    int k=0;
		List<WebElement> all_options = select.getOptions();
		
		int data=all_options.size();
		System.out.println(data);
		
		for(int i=0;i<=all_options.size()-1;i++)
		{
		List<WebElement> all_options2 = select.getOptions();

		
		String value=all_options2.get(i).getText();
		System.out.println(value);
		
		soft .assertEquals(verify[k], value);
	     k++;
			
		}

	}
	

	public void verifyTagsAndTextFrequency()
	{
		
		
		WebElement select_drop_down = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_DdlFrequency']"));
		
		Select select = new Select(select_drop_down);
		
		String [] verify=  {"All","Monthly","Weekly","Fortnightly","Fourweekly","Annually"};
	    int k=0;
		List<WebElement> all_options = select.getOptions();
		
		int data=all_options.size();
		System.out.println(data);
		
		for(int i=0;i<=all_options.size()-1;i++)
		{
		List<WebElement> all_options2 = select.getOptions();

		
		String value=all_options2.get(i).getText();
		System.out.println(value);
		
		soft .assertEquals(verify[k], value);
	     k++;
			
		}

		
	}
	
	public void verifyDetailedReport(String data)
	{
         String actualData = m_Driver.findElement(By.xpath("//*[@id='d1']/table/tbody/tr[2]/td[3]")).getText();
		
         System.out.println(actualData);
         soft.assertEquals(actualData, data);
         
         Reporter.log("verifyDetailedReport");
  
	}
	
	
	
	
	
	
	
	public void verifyAlertWithDate(String data)
	{
		
		
		String actualData=m_Driver.switchTo().alert().getText();
		   
		System.err.println(actualData);
		soft .assertEquals(actualData, data);

		Reporter.log("verifyAlertWithNADate");
		
	
	}
	
	public  void verifyFromDatePicker()
	{
		boolean con=m_Driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]/span")).isDisplayed();
		soft.assertTrue(con, "icon visible");
		Reporter.log("verifyFromDatePicker");
		
	}
	
	public  void verifytToDatePicker()
	{
		boolean con=m_Driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]/span")).isDisplayed();
		soft.assertTrue(con, "icon visible");
		Reporter.log("verifyFromDatePicker");
		
	}
	
	
	
	public void verifyEmailCancelBtn() throws Exception
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

		WebElement cancel = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cphFooter_btnCancel']"));

	     cancel.click();
	
		m_Driver.switchTo().defaultContent();

		Thread.sleep(3000);
		boolean close = m_Driver.findElement(By.xpath("//*[@id='PopUpClose1']")).isDisplayed();
			 
		soft. assertFalse(close);
	
		Thread.sleep(2000);
		
		Reporter.log("verifyEmailCancelBtn");
		
		
	}
	
	

	public void verifyEmailCloseBtn() throws Exception
	{
	
		WebElement closeBtn = m_Driver.findElement(By.xpath("//*[@id='PopUpClose1']"));

	     closeBtn.click();
	
		Thread.sleep(5000);
		boolean close = m_Driver.findElement(By.xpath("//*[@id='PopUpClose1']")).isDisplayed();
		 
		
		soft. assertFalse(close);
		Reporter.log("verifyEmailCloseBtn");
	}
	
	
	
	public void verifyEmailPopUpHeader()
	{
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

		String actualData = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/header/h2/span")).getText();
		System.out.println(actualData);
		soft.assertEquals(actualData, "Departmental Analysis Report");

		m_Driver.switchTo().defaultContent();

	}
	
	
	public void verifyEmailPopUpAlert()
	{
		
		try {
			
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

			String alert = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]")).getText();
			
			String alertMsg = alert.replaceAll("×", "").trim();
			System.out.println(alertMsg);
			soft.assertEquals(alertMsg, "Error! Please enter a valid email address or select one of the below mentioned email addresses");
			
			
			
		} catch (Exception e) {
			System.out.println("Issue in verifyDepatrmentSavedMsg"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}
		Reporter.log("verifyEmailPopUpAlert");
	}
	
	
	
	public void verifyEmailPopUpAlert1()
	{
		
		try {
			
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

			String alert = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]")).getText();
			
			String alertMsg = alert.replaceAll("×", "").trim();
			System.out.println(alertMsg);
			soft.assertEquals(alertMsg, "Email Sent Successfully!");
			
			
			
		} catch (Exception e) {
			System.out.println("Issue in verifyDepatrmentSavedMsg"+e);
		    soft.assertFalse(true,"welcome to catch block");

		}
		Reporter.log("verifyEmailPopUpAlert1");
	}
	
	
	
	
	
	
	    public void verifyCheckBoxSelected() {
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

		boolean elemSelected = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ChkDeptReport']")).isSelected();
		
		System.out.println(elemSelected);
		soft. assertTrue(elemSelected);

		m_Driver.switchTo().defaultContent();
		Reporter.log("verifyCheckBoxSelected");
		
		
	}
	
	    
	    public void verifyCompanyEmailCheckBoxNotSelected() {
			
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

			boolean elemSelected = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_chkCustomerEmail']")).isSelected();
			
			System.out.println(elemSelected);
			soft. assertFalse(elemSelected);

			m_Driver.switchTo().defaultContent();
			Reporter.log("verifyCompanyEmailCheckBoxNotSelected");
			
			
		}
	    
	    
	    public void verifyCompanyEmailCheckBoxSelected() {
			
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

			boolean elemSelected = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_chkCustomerEmail']")).isSelected();
			
			System.out.println(elemSelected);
			soft. assertTrue(elemSelected);

			m_Driver.switchTo().defaultContent();
			Reporter.log("verifyCompanyEmailCheckBoxSelected");
			
			
		}
	
	    
           public void verifyMyselfEmailCheckBoxNotSelected() {
			
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

			boolean elemSelected = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_chkMarkMySelf']")).isSelected();
			
			System.out.println(elemSelected);
			soft. assertFalse(elemSelected);

			m_Driver.switchTo().defaultContent();
			Reporter.log("verifyCheckBoxSelected");
			
			
		}
           
           
           
           public void verifySubjectInsideEmailPopup(String expectedSubject) {
   			
   			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

   		   String actualSubject = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_txtSubject']")).getAttribute("value");
   			
   			System.out.println(actualSubject);
   			soft.assertEquals(actualSubject, expectedSubject, "subject Not as expected");

   			m_Driver.switchTo().defaultContent();
   			Reporter.log("verifySubjectInsideEmailPopup");
   			
   			
   		}
           
           
           public void verifySubjectInsideEmailLog(String expectedSubject) throws Exception {
      			
               m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailLog_ctl00_lbtnViewEmail_sub']")).click();
				utilities.ChangeWindow.Switchwindow(3, m_Driver);

               Thread.sleep(3000);
      		   String actualSubject = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[3]/div/div/div[1]/div/div/div/h4")).getText();
      			
      			System.out.println(actualSubject);
      			soft.assertEquals(actualSubject, expectedSubject, "subject Not as expected");

      			Reporter.log("verifySubjectInsideEmailPopup");
      			
      			
      		}
           
           
           public void verifyEmailPopupAttachement(String periodEnd,String ReportType) throws  Exception
			{
//   			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));
//
//			 m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_dvsummary']/div/table/tbody/tr/td/label/a")).click();
//			 
//			 Thread.sleep(9000);
//			
//					File file = new File(path+"DepartmentalAnalysisReport_vqjrZJnmI.pdf");
//					PDDocument document = PDDocument.load(file);
//					PDFTextStripper pdfStripper = new PDFTextStripper();
//				String	PDFtext = pdfStripper.getText(document);
//					
//					System.out.println(PDFtext);
//					document.close();
					utilities.DownloadPdf pdf= new  utilities.DownloadPdf(m_Driver);
					String data=pdf.PDFtext;

				soft.assertTrue(data.contains(periodEnd),"periodEnd Not as expexted");
				
				soft.assertTrue(data.contains(ReportType),"ReportType Not as expexted ");
				//pdf.ReadPDF();
				
//				String file = pdf.FileName;
//				
//				Reporter.log("verifyEmailPopupAttachement");
//			
//						   if(file.delete())
//						    System.out.println("file deleted");
			}
           
           
           
//			 public void ReadCSVFile(String value) throws IOException, InterruptedException, AWTException {
////		            WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnExport']"));
//
//
////		           elem.click();
//		            Thread.sleep(9000);
//
//		            CSVReader reader = new CSVReader(
//		                    new FileReader("C:\\Users\\Swarupa\\Downloads\\IndividualEmployeePaySchedule-Mr. Prod Issue Emp.csv"));
//
//
//		           List<String[]> list = reader.readAll();
//		            System.out.println("Total rows which we have is " + list.size());
//
//
//		           // create Iterator reference
//		            Iterator<String[]> iterator = list.iterator();
//
//
//		           // Iterate all values
//		            while (iterator.hasNext()) {
//
//
//		               String[] str = iterator.next();
//
//
//		               // System.out.print(" Values are ");
//		                for (int i = 0; i < str.length; i++) {
//
//
//		                   // System.out.print(" "+str[i]);
//
//
//		                   if (str[i].contains(value))
//
//
//		                   {
//		                        // Thread.sleep(100);
//		                        Assert.assertTrue(str[i].contains(value));
//
//
//		                       System.out.println("pass");
//		                        break;
//		                    }
//
//
//		               }
//		                System.out.println("   ");
//
//
//		           }
//		            // utilities.ChangeWindow.Switchwindow(2, m_Driver);
//		            Reporter.log("verify Addition Amount csv File");
//
//
//		       }


	       		

           public void verifyAttachement(int data)
           {
        	  List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl00_lbtnFileName']"));
        	   
        	 int count= list.size();
        	 
        	 System.out.println(count);
        	 soft.assertEquals(count, data);
        	 
        	 Reporter.log("verifyAttachement");
        	  
           }
           
           
	
	public void assertAll()
	{
		soft.assertAll();
		
	}
	

}
