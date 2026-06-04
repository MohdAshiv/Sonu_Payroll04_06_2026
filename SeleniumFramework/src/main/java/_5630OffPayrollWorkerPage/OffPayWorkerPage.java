package _5630OffPayrollWorkerPage;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Driver;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import au.com.bytecode.opencsv.CSVReader;
import pages.BasePage;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;

public class OffPayWorkerPage extends BasePage {

	public OffPayWorkerPage(WebDriver driver) {
		super(driver);
		
	}

	SoftAssert sf= new SoftAssert();
	
//	   public static String ExcelMonth="";
//       public static String ExcelPayPeriod="";
       public static String ExcelEENI="";
       public static String ExcelERNI="";
       public static String ExcelERNIonTerminationAsfard="";
       public static String ExcelStudentLoan="";
       public static String ExcelPostGraduateLoan="";
       public static String ExcelStatPayFunding="";
       public static String ExcelTaxRefundFunding="";
       public static String ExcelStatPayRecovery="";
       public static String ExcelPreviousYearOverpayment="";
       public static String ExcelIncomeTax="";
       public static String ExcelEmploymentAllowance="";
       public static String ExcelCISDue="";
       public static String ExcelCISSuffered="";
       public static String ExcelAmountDueToHMRC="";
       public static String ExcelAmountPaid="";
       public static String ExcelBalanceduetoHMRC="";
	
		private By p60PdfElem = By.xpath("(//*[@data-original-title='P60 PDF Document'])[1]");

		private By p60PdfElem1 = By.xpath("(//*[@data-original-title='P60 PDF Document'])[2]");

		private By CsvElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_Lnkbtncsv']");
		private By fpsElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl13_lnkTaxReturnType']");

		private By payslipIcn= By.xpath("//*[@id='myTable1']/tbody/tr[2]/td[23]/a");
		
		private By payslipIcnEmployerView= By.xpath("//*[@id='myTable2']/tbody/tr[2]/td[23]/a");
		
		
       public void clickCsvIcn() throws InterruptedException
		{
	        
			WebElement elem = getWebElement(CsvElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickCsvIcn", "clickCsvIcn failed. Unable to locate object: " + CsvElem.toString());

				Assert.fail("Unable to locate object: " + CsvElem.toString());
	        }
		
			elem.click();
			Thread.sleep(6000);
			ExtentReportManager.passStep(m_Driver, "clickCsvIcn");
			
			 Reporter.log("clickCsvIcn");
	}
	
       
       public void getData() throws IOException, InterruptedException 
       {
    	   
    	   
    	 //  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_Lnkbtncsv']")).click();
       
         Thread.sleep(2000);
          String Path = "C:\\Users\\Sonu\\Downloads\\TaxPaymentReconciliation-2022-2023.csv";
          
           System.out.println("download file reading");
           Reader reader = new FileReader(Path);



      CSVReader csvreader = new CSVReader(reader);
       
           List<String[]> list = csvreader.readAll();
           
           Iterator<String[]>ite= list.iterator();
           
           while(ite.hasNext()){
               String[] data = ite.next();
           //System.out.println(data[0]+","+data[1]+","+data[2]+","+data[3]+","+data[4]+","+data[5]);
           if(data.length==18)
           {
               HashMap<String, String>hm=new HashMap<String,String>();
               hm.put(data[2], data[3]);
               System.out.println(hm);
           
               HashMap<String, String>hm1=new HashMap<String,String>();
               hm1.put(data[4], data[5]);
               //System.out.println(hm);
               System.out.println(hm1);
               
               HashMap<String, String>hm2=new HashMap<String,String>();
               hm2.put(data[6], data[7]);
               System.out.println(hm2);
               
               HashMap<String, String>hm3=new HashMap<String,String>();
               hm3.put(data[8], data[9]);
               System.out.println(hm3);
               
               HashMap<String, String>hm4=new HashMap<String,String>();
               hm4.put(data[10],data[11]);
               System.out.println(hm4);
               
               
               HashMap<String, String>hm5=new HashMap<String,String>();
               hm5.put(data[12],data[13]);
               System.out.println(hm5);
               
               
               HashMap<String, String>hm6=new HashMap<String,String>();
               hm6.put(data[14],data[15]);
               System.out.println(hm6);
               
               
               HashMap<String, String>hm7=new HashMap<String,String>();
               hm7.put(data[16], data[17]);
               System.out.println(hm7);
               
             
            
            
               
//               for(Map.Entry<String , String>dd:hm.entrySet())
//               {
//            	   ExcelMonth=ExcelMonth+"~"+dd.getKey();
//            	   ExcelPayPeriod=ExcelPayPeriod+"~"+dd.getValue();
//                   
//               }
               for(Map.Entry<String , String>dd1:hm.entrySet())
               {
            	 
            	   
            	   ExcelEENI=ExcelEENI+"~"+dd1.getKey().substring(0, dd1.getKey().length()-2);
            	 
            	   
            	   ExcelERNI=ExcelERNI+"~"+dd1.getValue().substring(0, dd1.getValue().length()-2);
            	   
            	   System.out.println("xyz");
                   
               }
               for(Map.Entry<String , String>dd1:hm1.entrySet())
               {
            	   ExcelERNIonTerminationAsfard=ExcelERNIonTerminationAsfard+"~"+dd1.getKey().substring(0, dd1.getKey().length()-2);
            	   ExcelStudentLoan=ExcelStudentLoan+"~"+dd1.getValue().substring(0, dd1.getValue().length()-2);
           
               }
               for(Map.Entry<String , String>dd1:hm2.entrySet())
               {
            	   ExcelPostGraduateLoan=ExcelPostGraduateLoan+"~"+dd1.getKey().substring(0, dd1.getKey().length()-2);
            	   ExcelStatPayFunding=ExcelStatPayFunding+"~"+dd1.getValue().substring(0, dd1.getValue().length()-2);
           
               }
               
               for(Map.Entry<String , String>dd1:hm3.entrySet())
               {
            	   ExcelTaxRefundFunding=ExcelTaxRefundFunding+"~"+dd1.getKey().substring(0, dd1.getKey().length()-2);
            	   ExcelStatPayRecovery=ExcelStatPayRecovery+"~"+dd1.getValue().substring(0, dd1.getValue().length()-2);
           
               }
               for(Map.Entry<String , String>dd1:hm4.entrySet())
               {
            	   ExcelPreviousYearOverpayment=ExcelPreviousYearOverpayment+"~"+dd1.getKey().substring(0, dd1.getKey().length()-2);
            	   ExcelIncomeTax=ExcelIncomeTax+"~"+dd1.getValue().substring(0, dd1.getValue().length()-2);
           
               }
               
               for(Map.Entry<String , String>dd1:hm5.entrySet())
               {
            	   ExcelEmploymentAllowance=ExcelEmploymentAllowance+"~"+dd1.getKey().substring(0, dd1.getKey().length()-2);
            	   ExcelCISDue=ExcelCISDue+"~"+dd1.getValue().substring(0, dd1.getValue().length()-2);
           
               }
               
               
               for(Map.Entry<String , String>dd1:hm6.entrySet())
               {
            	   ExcelCISSuffered=ExcelCISSuffered+"~"+dd1.getKey().substring(0, dd1.getKey().length()-2);
            	   ExcelAmountDueToHMRC=ExcelAmountDueToHMRC+"~"+dd1.getValue().substring(0, dd1.getValue().length()-2);
           
               }
             
               
               for(Map.Entry<String , String>dd1:hm7.entrySet())
               {
            	   ExcelAmountPaid=ExcelAmountPaid+"~"+dd1.getKey().substring(0, dd1.getKey().length()-2);
            	   
            	if(ExcelAmountPaid.contains("94621.14"))
            	{
            		break;
            	}
            		

            	   ExcelBalanceduetoHMRC=ExcelBalanceduetoHMRC+"~"+dd1.getValue().substring(0, dd1.getValue().length()-2);
               }
           }
           
           
           }
               
           System.out.println("xyz");
       }
	
       
     
       
       public void Dataverify()
       {
          // String AA="";
           
           int p=2;
           int p1=1;
       
            String  EENI []= ExcelEENI.split("~");
            String  ERNI[]= ExcelERNI.split("~");
            String ERNIonTerminationAsfard[]=ExcelERNIonTerminationAsfard.split("~");
            String StudentLoan[]=ExcelStudentLoan.split("~");
            String PostGraduateLoan[]=ExcelPostGraduateLoan.split("~");
            String StatPayFunding[]=ExcelStatPayFunding.split("~");
            String TaxRefundFunding[]=ExcelTaxRefundFunding.split("~");
            String StatPayRecovery[]=ExcelStatPayRecovery.split("~");
            String PreviousYearOverpayment[]=ExcelPreviousYearOverpayment.split("~");
            String IncomeTax[]=ExcelIncomeTax.split("~");

            String EmploymentAllowance[]=ExcelEmploymentAllowance.split("~");


            String CISDue[]=ExcelCISDue.split("~");

            String CISSuffered[]=ExcelCISSuffered.split("~");

            String AmountDueToHMRC[]=ExcelAmountDueToHMRC.split("~");

            String AmountPaid[]=ExcelAmountPaid.split("~");

            String BalanceduetoHMRC[]=ExcelBalanceduetoHMRC.split("~");

           System.out.println(EENI[p]);
           System.out.println(ERNI[p]);
           System.out.println(ERNIonTerminationAsfard[p]);
           System.out.println(StudentLoan[p]);
           System.out.println(PostGraduateLoan[p]);
           System.out.println(StatPayFunding[p]);
           System.out.println(TaxRefundFunding[p]);
           System.out.println(StatPayRecovery[p]);
           System.out.println(PreviousYearOverpayment[p]);
           System.out.println(IncomeTax[p]);
           System.out.println(EmploymentAllowance[p]);
           System.out.println(CISDue[p]);
           System.out.println(CISSuffered[p]);
           System.out.println(AmountDueToHMRC[p]);
           System.out.println(AmountPaid[p]);
           System.out.println(BalanceduetoHMRC[p]);


           List<WebElement>list=m_Driver.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr"));
           
           for(int i=1;i<=list.size();i++)
           {
               List<WebElement>list1=m_Driver.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr["+i+"]/td"));
               for(int k=0;k<=list1.size()-1;k++)
               {
                 List<WebElement>list2=m_Driver.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr["+i+"]/td"));
                //   String A=list3.get(k).getText();
                   
//                   if(!EENI[p].trim().equals(list3.get(1).getText()))
//                   {
//                       sfebElement Sorting=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_grdDisplayRecords']/tbody/tr[1]/th[2]/a"));
//                       Sorting.click();
//                   }
                   
                 //  List<sfebElement>list2=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_grdDisplayRecords']/tbody/tr["+i+"]/td"));
                       sf .assertEquals(EENI[p].trim(), list2.get(0).getText().replaceAll("£", "").replaceAll(",", ""));
                       System.out.println(EENI[p].trim()+"="+list2.get(0).getText().replaceAll("£", "").replaceAll(",", ""));
                       
                       sf.assertEquals(ERNI[p].trim(), list2.get(1).getText().replaceAll("£", "").replaceAll(",", ""));
                       System.out.println(ERNI[p].trim()+"="+list2.get(1).getText().replaceAll("£", "").replaceAll(",", ""));
                       
                       sf.assertEquals(ERNIonTerminationAsfard[p].trim(), list2.get(2).getText().replaceAll("£", "").replaceAll(",", ""));
                       System.out.println(ERNIonTerminationAsfard[p].trim()+"="+list2.get(2).getText().replaceAll("£", "").replaceAll(",", ""));
                       
                       sf.assertEquals(StudentLoan[p].trim(), list2.get(3).getText().replaceAll("£", "").replaceAll(",", ""));
                       System.out.println(StudentLoan[p].trim()+"="+list2.get(3).getText().replaceAll("£", "").replaceAll(",", ""));
                       
                       sf.assertEquals(PostGraduateLoan[p].trim(), list2.get(4).getText().replaceAll("£", "").replaceAll(",", ""));
                       System.out.println(PostGraduateLoan[p].trim()+"="+list2.get(4).getText().replaceAll("£", "").replaceAll(",", ""));
                       
                       
                       
                       sf.assertEquals(StatPayFunding[p].trim(), list2.get(5).getText().replaceAll("£", "").replaceAll(",", ""));
                       System.out.println(StatPayFunding[p].trim()+"="+list2.get(5).getText().replaceAll("£", "").replaceAll(",", ""));
                       
                       
                       sf.assertEquals(TaxRefundFunding[p].trim(), list2.get(6).getText().replaceAll("£", "").replaceAll(",", ""));
                       System.out.println(TaxRefundFunding[p].trim()+"="+list2.get(6).getText().replaceAll("£", "").replaceAll(",", ""));
                       
                       
                       sf.assertEquals(StatPayRecovery[p].trim(), list2.get(7).getText().replaceAll("£", "").replaceAll(",", ""));
                       System.out.println(StatPayRecovery[p].trim()+"="+list2.get(7).getText().replaceAll("£", "").replaceAll(",", ""));
                       
                       
                       sf.assertEquals(PreviousYearOverpayment[p].trim(), list2.get(8).getText().replaceAll("£", "").replaceAll(",", ""));
                       System.out.println(PreviousYearOverpayment[p].trim()+"="+list2.get(8).getText().replaceAll("£", "").replaceAll(",", ""));
                       
                       
                       sf.assertEquals(IncomeTax[p].trim(), list2.get(9).getText().replaceAll("£", "").replaceAll(",", ""));
                       System.out.println(IncomeTax[p].trim()+"="+list2.get(9).getText().replaceAll("£", "").replaceAll(",", ""));
                       
                       
                       sf.assertEquals(EmploymentAllowance[p].trim(), list2.get(10).getText().replaceAll("£", "").replaceAll(",", ""));
                       System.out.println(EmploymentAllowance[p].trim()+"="+list2.get(10).getText().replaceAll("£", "").replaceAll(",", ""));
                       
                       
                       sf.assertEquals(CISDue[p].trim(), list2.get(11).getText().replaceAll("£", "").replaceAll(",", ""));
                       System.out.println(CISDue[p].trim()+"="+list2.get(11).getText().replaceAll("£", "").replaceAll(",", ""));
                       
                       
                       sf.assertEquals(CISSuffered[p].trim(), list2.get(12).getText().replaceAll("£", "").replaceAll(",", ""));
                       System.out.println(CISSuffered[p].trim()+"="+list2.get(12).getText().replaceAll("£", "").replaceAll(",", ""));
                       
                       
                       sf.assertEquals(AmountDueToHMRC[p].trim(), list2.get(13).getText().replaceAll("£", "").replaceAll(",", ""));
                       System.out.println(AmountDueToHMRC[p].trim()+"="+list2.get(13).getText().replaceAll("£", "").replaceAll(",", ""));
                       
                       
                       sf.assertEquals(AmountPaid[p].trim(), list2.get(14).getText().replaceAll("£", "").replaceAll(",", ""));
                       System.out.println(AmountPaid[p].trim()+"="+list2.get(14).getText().replaceAll("£", "").replaceAll(",", ""));
                       
                       if(AmountPaid[p].contains("94621.14"))
                       {
                    	   
                    	   break;
                       }
                       sf.assertEquals(BalanceduetoHMRC[p].trim(), list2.get(15).getText().replaceAll("£", "").replaceAll(",", ""));
                       System.out.println(BalanceduetoHMRC[p].trim()+"="+list2.get(15).getText().replaceAll("£", "").replaceAll(",", ""));
                   
                       break;
               }
           
               p++;
                   
               }
               
           
           

       
       	
       	
       }
   	public void clickP60PdfIcn() throws Exception
   	{
   		
   			WebElement elem = getWebElement(p60PdfElem);

   			if (elem == null) {
   	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickP60PdfIcn", "clickP60PdfIcn failed. Unable to locate object: " + p60PdfElem.toString());


   				Assert.fail("Unable to locate object: " + p60PdfElem.toString());
   	        }

   			elem.click();
   			Thread.sleep(9000);
   			
   		    utilities.ChangeWindow.Switchwindow(3, m_Driver);
   			Robot robot = new Robot();
   			Thread.sleep(4000);
   		
           

   			robot.keyPress(KeyEvent.VK_CONTROL);
   			robot.keyPress(KeyEvent.VK_S);
   			robot.keyRelease(KeyEvent.VK_CONTROL);    
   			robot.keyRelease(KeyEvent.VK_S);

   			Thread.sleep(4000);
   			robot.keyPress(KeyEvent.VK_ENTER);
   			robot.keyRelease(KeyEvent.VK_ENTER);
   			Thread.sleep(4000);

   			ExtentReportManager.passStep(m_Driver, "clickP60PdfIcn");

   			
   			Reporter.log("clickP60PdfIcn");
   	

   }
   	
   	
 	public void clickP60PdfIcn2() throws Exception
   	{
   		
   			WebElement elem = getWebElement(p60PdfElem1);

   			if (elem == null) {
   	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickP60PdfIcn2", "clickP60PdfIcn2 failed. Unable to locate object: " + p60PdfElem1.toString());


   				Assert.fail("Unable to locate object: " + p60PdfElem1.toString());
   	        }

   			elem.click();
   			Thread.sleep(9000);
   			
   		    utilities.ChangeWindow.Switchwindow(3, m_Driver);
   			Robot robot = new Robot();
   			//Thread.sleep(2000);
   		
           

   			robot.keyPress(KeyEvent.VK_CONTROL);
   			robot.keyPress(KeyEvent.VK_S);
   			robot.keyRelease(KeyEvent.VK_CONTROL);    
   			robot.keyRelease(KeyEvent.VK_S);

   			Thread.sleep(3000);
   			robot.keyPress(KeyEvent.VK_ENTER);
   			robot.keyRelease(KeyEvent.VK_ENTER);
   			Thread.sleep(3000);

   			ExtentReportManager.passStep(m_Driver, "clickP60PdfIcn2");

   			
   			Reporter.log("clickP60PdfIcn2");
   	

   }
 	
 	
 	
 	public void clickP60PdfIcn5() throws Exception
   	{
   		
WebElement elem = m_Driver.findElement(By.xpath("//*[@id='dvP60']/div/div/div/div/div/table/tbody/tr[6]/td[8]/a"));
   			if (elem == null) {
   	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickP60PdfIcn2", "clickP60PdfIcn2 failed. Unable to locate object: " + p60PdfElem1.toString());


   				Assert.fail("Unable to locate object: " + p60PdfElem1.toString());
   	        }

   			elem.click();
   			Thread.sleep(9000);
   			
   		    utilities.ChangeWindow.Switchwindow(3, m_Driver);
   			Robot robot = new Robot();
   			//Thread.sleep(2000);
   		
           

   			robot.keyPress(KeyEvent.VK_CONTROL);
   			robot.keyPress(KeyEvent.VK_S);
   			robot.keyRelease(KeyEvent.VK_CONTROL);    
   			robot.keyRelease(KeyEvent.VK_S);

   			Thread.sleep(3000);
   			robot.keyPress(KeyEvent.VK_ENTER);
   			robot.keyRelease(KeyEvent.VK_ENTER);
   			Thread.sleep(3000);

   			ExtentReportManager.passStep(m_Driver, "clickP60PdfIcn2");

   			
   			Reporter.log("clickP60PdfIcn5");
   	

   }
 	
 	public void clickP60PdfIcn6() throws Exception
   	{
   		
WebElement elem = m_Driver.findElement(By.xpath("//*[@id='dvP60']/div/div/div/div/div/table/tbody/tr[6]/td[8]/a"));
   			
   			elem.click();
   			Thread.sleep(9000);
   			
   		   
   			Reporter.log("clickP60PdfIcn5");
   	

   }
 	
 	
	
 	public void clickP60PdfIcn7() throws Exception
   	{
   		
WebElement elem = m_Driver.findElement(By.xpath("//*[@id='dvP60']/div/div/div/div/div/table/tbody/tr[2]/td[8]/a"));
   			
   			elem.click();
       Thread.sleep(9000);
   			
   		    utilities.ChangeWindow.Switchwindow(3, m_Driver);
   			Robot robot = new Robot();
   			Thread.sleep(4000);
   		
           

   			robot.keyPress(KeyEvent.VK_CONTROL);
   			robot.keyPress(KeyEvent.VK_S);
   			robot.keyRelease(KeyEvent.VK_CONTROL);    
   			robot.keyRelease(KeyEvent.VK_S);

   			Thread.sleep(4000);
   			robot.keyPress(KeyEvent.VK_ENTER);
   			robot.keyRelease(KeyEvent.VK_ENTER);
   			Thread.sleep(4000);

   			ExtentReportManager.passStep(m_Driver, "clickP60PdfIcn");

   			
   			Reporter.log("clickP60PdfIcn");
   			
   		   
   	

   }
 	
 	
 	public void clickPayslipIcn() throws Exception
   	{
   		
   			WebElement elem = getWebElement(payslipIcn);

   			if (elem == null) {
   	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickPayslipIcn", "clickPayslipIcn failed. Unable to locate object: " + payslipIcn.toString());


   				Assert.fail("Unable to locate object: " + payslipIcn.toString());
   	        }

   			elem.click();
   			Thread.sleep(9000);
   			
   		    utilities.ChangeWindow.Switchwindow(3, m_Driver);
   			Robot robot = new Robot();
   			//Thread.sleep(2000);
   		
           

   			robot.keyPress(KeyEvent.VK_CONTROL);
   			robot.keyPress(KeyEvent.VK_S);
   			robot.keyRelease(KeyEvent.VK_CONTROL);    
   			robot.keyRelease(KeyEvent.VK_S);

   			Thread.sleep(3000);
   			robot.keyPress(KeyEvent.VK_ENTER);
   			robot.keyRelease(KeyEvent.VK_ENTER);
   			Thread.sleep(3000);

   			ExtentReportManager.passStep(m_Driver, "clickP60PdfIcn2");

   			
   			Reporter.log("clickPayslipIcn");
   	

   }
 	
 	public void clickPayslipIcnEmployerView() throws Exception
   	{
   		
   			WebElement elem = getWebElement(payslipIcnEmployerView);

   			if (elem == null) {
   	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickPayslipIcn", "clickPayslipIcn failed. Unable to locate object: " + payslipIcnEmployerView.toString());


   				Assert.fail("Unable to locate object: " + payslipIcnEmployerView.toString());
   	        }

   			elem.click();
   			Thread.sleep(9000);
   			
   		    utilities.ChangeWindow.Switchwindow(4, m_Driver);
   			Robot robot = new Robot();
   		//	Thread.sleep(4000);
   		
           

   			robot.keyPress(KeyEvent.VK_CONTROL);
   			robot.keyPress(KeyEvent.VK_S);
   			robot.keyRelease(KeyEvent.VK_CONTROL);    
   			robot.keyRelease(KeyEvent.VK_S);

   			Thread.sleep(4000);
   			robot.keyPress(KeyEvent.VK_ENTER);
   			robot.keyRelease(KeyEvent.VK_ENTER);
   			Thread.sleep(4000);

   			ExtentReportManager.passStep(m_Driver, "clickPayslipIcnEmployerView");

   			
   			Reporter.log("clickPayslipIcnEmployerView");
   	

   }
 	
 	public void clickFps() throws Exception
	{
        
		WebElement elem = getWebElement(fpsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickFps", "clickFps failed. Unable to locate object: " + fpsElem.toString());


			Assert.fail("Unable to locate object: " + fpsElem.toString());
        }

		jsExec.executeScript("arguments[0].scrollIntoView(true);",elem);	
		elem.click();
		Thread.sleep(3000);
		
		TakeScreenshot.takeScreenshot(m_Driver, "clickFps");
          	

		ExtentReportManager.passStep(m_Driver, "clickFps");

	}
	
 	
 	  public void getDataEmployerView() throws IOException, InterruptedException 
      {
   	   
   	   
   	 //  m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_Lnkbtncsv']")).click();
      
        Thread.sleep(2000);
         String Path = "C:\\Users\\Sonu\\Downloads\\TaxPaymentReconciliation-2022-2023.csv";
         
          System.out.println("Dosfnload file reading");
          Reader reader = new FileReader(Path);



         CSVReader csvreader = new CSVReader(reader);
      
          List<String[]> list = csvreader.readAll();
          
          Iterator<String[]>ite= list.iterator();
          
          while(ite.hasNext()){
              String[] data = ite.next();
          //System.out.println(data[0]+","+data[1]+","+data[2]+","+data[3]+","+data[4]+","+data[5]);
          if(data.length==18)
          {
              HashMap<String, String>hm=new HashMap<String,String>();
              hm.put(data[2], data[3]);
              System.out.println(hm);
          
              HashMap<String, String>hm1=new HashMap<String,String>();
              hm1.put(data[4], data[5]);
              //System.out.println(hm);
              System.out.println(hm1);
              
              HashMap<String, String>hm2=new HashMap<String,String>();
              hm2.put(data[6], data[7]);
              System.out.println(hm2);
              
              HashMap<String, String>hm3=new HashMap<String,String>();
              hm3.put(data[8], data[9]);
              System.out.println(hm3);
              
              HashMap<String, String>hm4=new HashMap<String,String>();
              hm4.put(data[10],data[11]);
              System.out.println(hm4);
              
              
              HashMap<String, String>hm5=new HashMap<String,String>();
              hm5.put(data[12],data[13]);
              System.out.println(hm5);
              
              
              HashMap<String, String>hm6=new HashMap<String,String>();
              hm6.put(data[14],data[15]);
              System.out.println(hm6);
              
              
              HashMap<String, String>hm7=new HashMap<String,String>();
              hm7.put(data[16], data[17]);
              System.out.println(hm7);
              
            
           
           
              
//              for(Map.Entry<String , String>dd:hm.entrySet())
//              {
//           	   ExcelMonth=ExcelMonth+"~"+dd.getKey();
//           	   ExcelPayPeriod=ExcelPayPeriod+"~"+dd.getValue();
//                  
//              }
              for(Map.Entry<String , String>dd1:hm.entrySet())
              {
           	 
           	   
           	   ExcelEENI=ExcelEENI+"~"+dd1.getKey().substring(0, dd1.getKey().length()-2);
           	 
           	   
           	   ExcelERNI=ExcelERNI+"~"+dd1.getValue().substring(0, dd1.getValue().length()-2);
           	   
           	   System.out.println("xyz");
                  
              }
              for(Map.Entry<String , String>dd1:hm1.entrySet())
              {
           	   ExcelERNIonTerminationAsfard=ExcelERNIonTerminationAsfard+"~"+dd1.getKey().substring(0, dd1.getKey().length()-2);
           	   ExcelStudentLoan=ExcelStudentLoan+"~"+dd1.getValue().substring(0, dd1.getValue().length()-2);
          
              }
              for(Map.Entry<String , String>dd1:hm2.entrySet())
              {
           	   ExcelPostGraduateLoan=ExcelPostGraduateLoan+"~"+dd1.getKey().substring(0, dd1.getKey().length()-2);
           	   ExcelStatPayFunding=ExcelStatPayFunding+"~"+dd1.getValue().substring(0, dd1.getValue().length()-2);
          
              }
              
              for(Map.Entry<String , String>dd1:hm3.entrySet())
              {
           	   ExcelTaxRefundFunding=ExcelTaxRefundFunding+"~"+dd1.getKey().substring(0, dd1.getKey().length()-2);
           	   ExcelStatPayRecovery=ExcelStatPayRecovery+"~"+dd1.getValue().substring(0, dd1.getValue().length()-2);
          
              }
              for(Map.Entry<String , String>dd1:hm4.entrySet())
              {
           	   ExcelPreviousYearOverpayment=ExcelPreviousYearOverpayment+"~"+dd1.getKey().substring(0, dd1.getKey().length()-2);
           	   ExcelIncomeTax=ExcelIncomeTax+"~"+dd1.getValue().substring(0, dd1.getValue().length()-2);
          
              }
              
              for(Map.Entry<String , String>dd1:hm5.entrySet())
              {
           	   ExcelEmploymentAllowance=ExcelEmploymentAllowance+"~"+dd1.getKey().substring(0, dd1.getKey().length()-2);
           	   ExcelCISDue=ExcelCISDue+"~"+dd1.getValue().substring(0, dd1.getValue().length()-2);
          
              }
              
              
              for(Map.Entry<String , String>dd1:hm6.entrySet())
              {
           	   ExcelCISSuffered=ExcelCISSuffered+"~"+dd1.getKey().substring(0, dd1.getKey().length()-2);
           	   ExcelAmountDueToHMRC=ExcelAmountDueToHMRC+"~"+dd1.getValue().substring(0, dd1.getValue().length()-2);
          
              }
            
              
              for(Map.Entry<String , String>dd1:hm7.entrySet())
              {
           	   ExcelAmountPaid=ExcelAmountPaid+"~"+dd1.getKey().substring(0, dd1.getKey().length()-2);
           	   
           	if(ExcelBalanceduetoHMRC.contains("0.00"))
           	{
           		break;
           	}
           		

           	   ExcelBalanceduetoHMRC=ExcelBalanceduetoHMRC+"~"+dd1.getValue().substring(0, dd1.getValue().length()-2);
              }
          }
          
          
          }
              
          System.out.println("xyz");
      }
	
      
      public void DataverifyEmployerView()
      {
         // String AA="";
          
          int p=2;
          int p1=1;
      
           String  EENI []= ExcelEENI.split("~");
           String  ERNI[]= ExcelERNI.split("~");
           String ERNIonTerminationAsfard[]=ExcelERNIonTerminationAsfard.split("~");
           String StudentLoan[]=ExcelStudentLoan.split("~");
           String PostGraduateLoan[]=ExcelPostGraduateLoan.split("~");
           String StatPayFunding[]=ExcelStatPayFunding.split("~");
           String TaxRefundFunding[]=ExcelTaxRefundFunding.split("~");
           String StatPayRecovery[]=ExcelStatPayRecovery.split("~");
           String PreviousYearOverpayment[]=ExcelPreviousYearOverpayment.split("~");
           String IncomeTax[]=ExcelIncomeTax.split("~");

           String EmploymentAllowance[]=ExcelEmploymentAllowance.split("~");


           String CISDue[]=ExcelCISDue.split("~");

           String CISSuffered[]=ExcelCISSuffered.split("~");

           String AmountDueToHMRC[]=ExcelAmountDueToHMRC.split("~");

           String AmountPaid[]=ExcelAmountPaid.split("~");

           String BalanceduetoHMRC[]=ExcelBalanceduetoHMRC.split("~");


          System.out.println(EENI[p]);
          System.out.println(ERNI[p]);
          System.out.println(ERNIonTerminationAsfard[p]);
          System.out.println(StudentLoan[p]);
          System.out.println(PostGraduateLoan[p]);
          System.out.println(StatPayFunding[p]);
          System.out.println(TaxRefundFunding[p]);
          System.out.println(StatPayRecovery[p]);
          System.out.println(PreviousYearOverpayment[p]);
          System.out.println(IncomeTax[p]);
          System.out.println(EmploymentAllowance[p]);
          System.out.println(CISDue[p]);
          System.out.println(CISSuffered[p]);
          System.out.println(AmountDueToHMRC[p]);
          System.out.println(AmountPaid[p]);
          System.out.println(BalanceduetoHMRC[p]);


          List<WebElement>list=m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr"));
          
          for(int i=2;i<=list.size();i++)
          {

              List<WebElement>list1=m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr["+i+"]/td"));
              for(int k=0;k<=list1.size()-1;k++)
              {
                List<WebElement>list2=m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr["+i+"]/td"));
               //   String A=list3.get(k).getText();
                  
//                  if(!EENI[p].trim().equals(list3.get(1).getText()))
//                  {
//                      sfebElement Sorting=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_grdDisplayRecords']/tbody/tr[1]/th[2]/a"));
//                      Sorting.click();
//                  }
                
                
                  
                //  List<sfebElement>list2=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_grdDisplayRecords']/tbody/tr["+i+"]/td"));
                      sf .assertEquals(EENI[p].trim(), list2.get(2).getText().replaceAll("£", "").replaceAll(",", ""));
                      System.out.println(EENI[p].trim()+"="+list2.get(2).getText().replaceAll("£", "").replaceAll(",", ""));
                      
                      sf.assertEquals(ERNI[p].trim(), list2.get(3).getText().replaceAll("£", "").replaceAll(",", ""));
                      System.out.println(ERNI[p].trim()+"="+list2.get(3).getText().replaceAll("£", "").replaceAll(",", ""));
                      
                      sf.assertEquals(ERNIonTerminationAsfard[p].trim(), list2.get(4).getText().replaceAll("£", "").replaceAll(",", ""));
                      System.out.println(ERNIonTerminationAsfard[p].trim()+"="+list2.get(4).getText().replaceAll("£", "").replaceAll(",", ""));
                      
                      sf.assertEquals(StudentLoan[p].trim(), list2.get(5).getText().replaceAll("£", "").replaceAll(",", ""));
                      System.out.println(StudentLoan[p].trim()+"="+list2.get(5).getText().replaceAll("£", "").replaceAll(",", ""));
                      
                      sf.assertEquals(PostGraduateLoan[p].trim(), list2.get(6).getText().replaceAll("£", "").replaceAll(",", ""));
                      System.out.println(PostGraduateLoan[p].trim()+"="+list2.get(6).getText().replaceAll("£", "").replaceAll(",", ""));
                      
                      
                      
                      sf.assertEquals(StatPayFunding[p].trim(), list2.get(7).getText().replaceAll("£", "").replaceAll(",", ""));
                      System.out.println(StatPayFunding[p].trim()+"="+list2.get(7).getText().replaceAll("£", "").replaceAll(",", ""));
                      
                      
                      sf.assertEquals(TaxRefundFunding[p].trim(), list2.get(8).getText().replaceAll("£", "").replaceAll(",", ""));
                      System.out.println(TaxRefundFunding[p].trim()+"="+list2.get(8).getText().replaceAll("£", "").replaceAll(",", ""));
                      
                      
                      sf.assertEquals(StatPayRecovery[p].trim(), list2.get(9).getText().replaceAll("£", "").replaceAll(",", ""));
                      System.out.println(StatPayRecovery[p].trim()+"="+list2.get(9).getText().replaceAll("£", "").replaceAll(",", ""));
                      
                      
                      sf.assertEquals(PreviousYearOverpayment[p].trim(), list2.get(10).getText().replaceAll("£", "").replaceAll(",", ""));
                      System.out.println(PreviousYearOverpayment[p].trim()+"="+list2.get(10).getText().replaceAll("£", "").replaceAll(",", ""));
                      
                      
                      sf.assertEquals(IncomeTax[p].trim(), list2.get(11).getText().replaceAll("£", "").replaceAll(",", ""));
                      System.out.println(IncomeTax[p].trim()+"="+list2.get(11).getText().replaceAll("£", "").replaceAll(",", ""));
                      
                      
                      sf.assertEquals(EmploymentAllowance[p].trim(), list2.get(12).getText().replaceAll("£", "").replaceAll(",", ""));
                      System.out.println(EmploymentAllowance[p].trim()+"="+list2.get(12).getText().replaceAll("£", "").replaceAll(",", ""));
                      
                      
                      sf.assertEquals(CISDue[p].trim(), list2.get(13).getText().replaceAll("£", "").replaceAll(",", ""));
                      System.out.println(CISDue[p].trim()+"="+list2.get(13).getText().replaceAll("£", "").replaceAll(",", ""));
                      
                      
                      sf.assertEquals(CISSuffered[p].trim(), list2.get(14).getText().replaceAll("£", "").replaceAll(",", ""));
                      System.out.println(CISSuffered[p].trim()+"="+list2.get(14).getText().replaceAll("£", "").replaceAll(",", ""));
                      
                      
                      sf.assertEquals(AmountDueToHMRC[p].trim(), list2.get(15).getText().replaceAll("£", "").replaceAll(",", ""));
                      System.out.println(AmountDueToHMRC[p].trim()+"="+list2.get(15).getText().replaceAll("£", "").replaceAll(",", ""));
                      
                      
                      sf.assertEquals(AmountPaid[p].trim(), list2.get(16).getText().replaceAll("£", "").replaceAll(",", ""));
                      System.out.println(AmountPaid[p].trim()+"="+list2.get(16).getText().replaceAll("£", "").replaceAll(",", ""));
                      
                    
//                      sf.assertEquals(BalanceduetoHMRC[p].trim(), list2.get(17).getText().replaceAll("£", "").replaceAll(",", ""));
//                      System.out.println(BalanceduetoHMRC[p].trim()+"="+list2.get(17).getText().replaceAll("£", "").replaceAll(",", ""));
//                      
                      
                 
                  
                      break;
              }
          
              p++;
                  
              }
              
          
          

      
      	
      	
      }
      
      
      public void deletCsv()
      {
			File file = new File("C:\\Users\\Sonu\\Downloads\\TaxPaymentReconciliation-2022-2023.csv");
			 if(file.delete())
				    System.out.println("file deleted");
    	  
      }
 	
       
       public void asertall()
       {
    	   sf.assertAll();
    	   
       }
}
