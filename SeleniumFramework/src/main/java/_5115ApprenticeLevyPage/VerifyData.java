package _5115ApprenticeLevyPage;

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
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import pages.BasePage;

public class VerifyData  extends BasePage{

	public VerifyData(WebDriver driver) {
		super(driver);
	
	}
	SoftAssert soft= new SoftAssert();
	static String PDFtext;
	 String actualdatasum;
	 String actuallevyDue;
	
	public void AprenticeshipApril(String expectedWages, String expectedDue,String expectedAllowance,String expectedPayable)
	
	{
		List<WebElement> elem = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td [contains(text(),'£')]"));
		
		String cumulativeWages = elem.get(1).getText();
	    System.out.println("Wages = "+cumulativeWages);
	    soft.assertEquals(cumulativeWages, expectedWages);
	    
		String  cumulativeLevyDue= elem.get(2).getText();
	    System.out.println("Leavy Due = "+cumulativeLevyDue);
	    soft.assertEquals(cumulativeLevyDue, expectedDue);

		String  allowance= elem.get(3).getText();
	    System.out.println("Allowance = "+allowance);
	    soft. assertEquals(allowance, expectedAllowance);

		String  leavyPayable= elem.get(4).getText();
	    System.out.println("Leavy Payable = "+leavyPayable);
	    soft.assertEquals(leavyPayable, expectedPayable);


		Reporter.log("verify Aprenticeship April");
	}

public void AprenticeshipMay(String expectedWages, String expectedDue,String expectedAllowance,String expectedPayable)
	
	{
		List<WebElement> elem = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td [contains(text(),'£')]"));
		
		String cumulativeWages = elem.get(6).getText();
	    System.out.println("Wages = "+cumulativeWages);
	    soft. assertEquals(cumulativeWages, expectedWages);
	    
		String  cumulativeLevyDue= elem.get(7).getText();
	    System.out.println("Leavy Due = "+cumulativeLevyDue);
	    soft. assertEquals(cumulativeLevyDue, expectedDue);

		String  allowance= elem.get(8).getText();
	    System.out.println("Allowance = "+allowance);
	    soft.assertEquals(allowance, expectedAllowance);

		String  leavyPayable= elem.get(9).getText();
	    System.out.println("Leavy Payable = "+leavyPayable);
	    soft. assertEquals(leavyPayable, expectedPayable);
		Reporter.log("verify Aprenticeship May");
		
	}
   

   public void PayrollSummary(String AprenticeshipLeavy)
   {
	   
	   jsExec.executeScript("window.scrollBy(0,200)");

	   String actualAprenticeshipLeavy=m_Driver.findElement(By.xpath("(//*[@style='width:30.36mm;min-width: 30.36mm;'])[4]")).getText();
	   System.out.println("Aprenticeship Leavy = "+actualAprenticeshipLeavy);
	   soft. assertEquals(actualAprenticeshipLeavy, AprenticeshipLeavy);
	   Reporter.log("verify Aprenticeship May");


	   
   }
   
   public void PayrollSummaryNegativeAprenticeshp(String AprenticeshipLeavy)
   {
	   
	   jsExec.executeScript("window.scrollBy(0,200)");

	   String actualAprenticeshipLeavy=m_Driver.findElement(By.xpath("//*[contains(text(),'-£')]")).getText();
	   System.out.println("Aprenticeship Leavy = "+actualAprenticeshipLeavy);
	   soft. assertEquals(actualAprenticeshipLeavy, AprenticeshipLeavy);
	   Reporter.log("verify PayrollSummaryNegativeAprenticeshp May");


	   
   }
   
   public void PayrollSummary1(String expectedData)
   {
	   
	   jsExec.executeScript("window.scrollBy(0,200)");

	    List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@style='width:30.36mm;min-width: 30.36mm;'])[4]"));
	  
	        int data = list.size();
	       String actualData= Integer.toString(data);
	    
	     System.out.println(data);
	    
	  soft. assertEquals(actualData, expectedData); 
	  
	  Reporter.log("Verify there is no Apprenticelevy");

	   
   }
   

     
   
     public void verifyCumulativeWages(double expectedvalue)
     {
    	 
    	 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[3]"));
    	 
    	
    	
    	 int k=1;
         System.out.println("____verifyCumulativeWages____");

    	 for(int i=0;i<=list.size()-1;i++)
    	 {
    		 
    	  String data = list.get(i).getText();
			data = data.replaceAll("£", "");
			data = data.replaceAll(",", "");
            
           String actualvalue = String.format("%.2f",expectedvalue*k);

           System.out.println(actualvalue);
           soft. assertEquals(actualvalue, data);
          k++;
    	 
    	 }
    	 Reporter.log("verify Cumulative Wages");

    	 
    	 
     }
     
    
     public void verifyCumulativeWagesSum(String expectedvalue)
     {
    	 
    	 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[3]"));
    
   	   double value=0;
        System.out.println("verifyCumulativeWagesSum");

   	      for(int i=0;i<=list.size()-1;i++)
   	      {
   		 
   	        String data = list.get(i).getText();
			data = data.replaceAll("£", "");
			data = data.replaceAll(",", "");
           
			value=value + Double.parseDouble(data);
            System.out.println(data);
           actualdatasum = String.format("%.2f",value);
            
            
   	 
   	 }
   	 
   	 soft. assertEquals(actualdatasum, expectedvalue);
	 Reporter.log("verifyCumulativeWagesSum");

   	 
    }
   
     
     public void verifyCumulativeLevyDue(double expectedvalue)
     {
    	 
    	 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[4]"));
    	 
    	
    	
    	 int k=1;
         System.out.println("____verifyCumulativeLevyDue____");

    	 for(int i=0;i<=list.size()-1;i++)
    	 {
    		 
    	  String data = list.get(i).getText();
			data = data.replaceAll("£", "");
			data = data.replaceAll(",", "");
            
           String actualvalue = String.format("%.2f",expectedvalue*k);

           System.out.println(actualvalue);
           soft. assertEquals(actualvalue, data);
          k++;
    	 
    	 }
    	 
    	 Reporter.log("verify Cumulative Levy Due");

     }
     
     String   actualdata;
     public void verifyCumulativeLevyDue2(String expectedvalue)
     {
    	 
    	 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[4]"));
    	 
    	
    	
    	  double value=0;
         System.out.println("____verifyCumulativeLevyDue____");

    	 for(int i=0;i<=list.size()-1;i++)
    	 {
    		 
    	  String data = list.get(i).getText();
			data = data.replaceAll("£", "");
			data = data.replaceAll(",", "");
            
			value=value + Double.parseDouble(data);
             System.out.println(data);
            actualdata = String.format("%.2f",value);
             
             
    	 
    	 }
    	 
    	 soft. assertEquals(actualdata, expectedvalue);
    	 
    	 Reporter.log("Verify levyDue");
     }
     
     
     
     public void verifyCumulativeLevyDue(String expectedvalue)
     {
    	 
    	 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[4]"));
    	 
    	
    	
    	
         System.out.println("____verifyCumulativeLevyDue____");

    	 for(int i=0;i<=list.size()-1;i++)
    	 {
    		 
    	  String data = list.get(i).getText();
		
            
			
             System.out.println(data);
         
            soft. assertEquals(data, expectedvalue);
       	 
    	 
    	 }
    	 
    	 Reporter.log("Verify levyDue");
     }
     public void verifyCumulativeLevyDue1( String expectedvalue)
     {
    	 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[4]"));
    	 
     	
   	  double value=0;
         System.out.println("verifyCumulativeWagesSum");

    	      for(int i=0;i<=list.size()-1;i++)
    	      {
    		 
    	        String data = list.get(i).getText();
 			data = data.replaceAll("£", "");
 			data = data.replaceAll(",", "");
            
 			value=value + Double.parseDouble(data);
             System.out.println(data);
            actuallevyDue = String.format("%.2f",value);
             
             
    	 
    	 }
    	 
    	 soft. assertEquals(actuallevyDue, expectedvalue);
 	 Reporter.log("verifyCumulative Levy Due");

    	 
     }
    
    

   
     
     public void verifyCumulativeAllownce(double expectedvalue)
     {
    	 
    	 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[5]"));
    	 
    	
    	 int k=1;
         System.out.println("____verifyCumulativeLAllownce____");

    	 for(int i=0;i<=list.size()-1;i++)
    	 {
    		 
    	  String data = list.get(i).getText();
			data = data.replaceAll("£", "");
			data = data.replaceAll(",", "");
            
           String actualvalue = String.format("%.2f",expectedvalue*k);
           
           System.out.println(actualvalue);
           soft.assertEquals(actualvalue, data);
          k++;
    	 
    	 }
    	
    	 Reporter.log("verify Cumulative Allownce ");
     }
     
     public void verifyLevyPayble(String expectedData)
     {
    	 
    	 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[6]"));
    	 
    	
    	
    	 
    	 for(int i=0;i<=list.size()-1;i++)
    	 {
    		 
    	  String data = list.get(i).getText();
    	  
    	     System.out.println(data);
			
           soft. assertEquals(data, expectedData);
            
          
    	 }
    	 
    	 Reporter.log("Verify Levy Payble ");

     }
     
     public void verifyLevyPayble2(String expectedData)
     {
    	 
    	 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[6]"));
    	 
    	
    	
    	 
    	 for(int i=0;i<=list.size()-1;i++)
    	 {
    		 
    	  String data = list.get(i).getText();
    	  data=data.substring(0, 4);
    	     System.out.println(data);
			
           soft. assertEquals(data, expectedData);
            
          
    	 }
    	 Reporter.log("Verify Levy Payble ");

    	 
     }
     public void verifyLevyPayble1(String aprilData, String juneData,String octdata, String novData)
     {
    	 
    	 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[6]"));
    	 
    	
    	
    	 
    	
    		 
    	   String aprilLevyPay = list.get(0).getText();
    	  
    	     System.out.println("aprilLevyPay  ="+aprilLevyPay);
			
           soft. assertEquals(aprilLevyPay, aprilData);
            
          
           String juneLevyPay = list.get(2).getText();
     	  
  	       System.out.println("juneLevyPay  ="+aprilLevyPay);
			
           soft. assertEquals(juneLevyPay, juneData);
            
            
           String octLevyPay = list.get(6).getText();
      	  
  	       System.out.println("octLevyPay  ="+octLevyPay);
			
           soft. assertEquals(octLevyPay, octdata);
           
           String NovLevyPay = list.get(7).getText();
      	  
  	       System.out.println("NoveLevyPay  ="+NovLevyPay);
			
           soft. assertEquals(NovLevyPay, novData);
    	 
    	 
           Reporter.log("Verify LevyPay");
    	 
     }

   
   
   
   
   public void VerifyRecivedPayrollSummary(String ApprenticeLevy) throws  Exception
	{
	
		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl01_lbtnFileName']")).click();
		
		
		Thread.sleep(11000);
//		Robot robot = new Robot();
//
//
//		for (int i = 0; i <= 1; i++) {
//			robot.keyPress(KeyEvent.VK_TAB);
//			robot.keyRelease(KeyEvent.VK_TAB);
//			Thread.sleep(1000);
//		}
//
//		robot.keyPress(KeyEvent.VK_ENTER);
//
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_UP);
//		robot.keyRelease(KeyEvent.VK_UP);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//
//           Thread.sleep(3000);
			File file = new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2022-04-29.pdf");
			PDDocument document = PDDocument.load(file);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			PDFtext = pdfStripper.getText(document);
			
			//System.out.println(PDFtext);
			document.close();
			
			System.out.println(PDFtext);
			
		
			
			Assert.assertTrue(PDFtext.contains(ApprenticeLevy));
		
	
				    if(file.delete())
				    System.out.println("file deleted");
				  Reporter.log("Verify Verify Recived Payroll Summary ");
					
	}
   
   
   public void VerifyRecivedPayrollSummary1(String ApprenticeLevy) throws  Exception
	{
	
		m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayEmailAttachments_ctl01_lbtnFileName']")).click();
		
		
		Thread.sleep(11000);
//		Robot robot = new Robot();
//
//
//		for (int i = 0; i <= 1; i++) {
//			robot.keyPress(KeyEvent.VK_TAB);
//			robot.keyRelease(KeyEvent.VK_TAB);
//			Thread.sleep(3000);
//		}
//
//		robot.keyPress(KeyEvent.VK_ENTER);
//
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(3000);
//		robot.keyPress(KeyEvent.VK_UP);
//		robot.keyRelease(KeyEvent.VK_UP);
//		Thread.sleep(3000);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//
//		Thread.sleep(3000);
		File file = new File("C:\\Users\\Sonu\\Downloads\\Employer's Summary -2022-06-03.pdf");
		PDDocument document = PDDocument.load(file);
		PDFTextStripper pdfStripper = new PDFTextStripper();
		PDFtext = pdfStripper.getText(document);

		// System.out.println(PDFtext);
		document.close();

		System.out.println(PDFtext);

	Assert.assertTrue(PDFtext.contains(ApprenticeLevy));
	
				    if(file.delete())
				    System.out.println("file deleted");
				  Reporter.log("Verify Verify Recived Payroll Summary ");
					
	}
   
   
   
   
   public void assertAll()
	{
		soft.assertAll();
		
	}
}
