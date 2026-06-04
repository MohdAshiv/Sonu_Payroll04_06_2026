package _6440_Page;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import pages.BasePage;

public class VerifyData  extends BasePage{
	private static String PDFtext;

	public VerifyData(WebDriver driver) {
		super(driver);
	}
	
	WebElement textArea1;
	WebElement pension;
     
	private By getXMLDataElem = By.xpath("//TEXTAREA[@name='ctl00$ctl00$ParentContent$cPH$txtData']");

	SoftAssert soft= new SoftAssert();

	public void verifyEmployeeNI(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11)
	{
		
		try {
			 List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[3]"));
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
				ar.add(data9);
				ar.add(data10);
				ar.add(data11);

			
				boolean con=list.isEmpty();
			     soft.assertFalse(con);
				
			 for (int i =0;i<=list.size()-1;i++)
			 {
				 
				 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[3]"));

				 WebElement elem = list1.get(i);
				 
				String actualData = elem.getText();
				actualData = actualData.replaceAll("[£]", "");
				actualData = actualData.replaceAll("[,]", "");

				System.out.println(actualData);
				 soft.assertEquals(actualData, ar.get(i));
				
			 }
			 
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verifyEmployeeNI"+e);
		}
		
		Reporter.log("verifyEmployeeNI");
	}
	
	
	
	public void verifyFortightlyEmployeeNI(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,
		String data12,String data13,String data14, String data15, String data16, String data17, String data18, String data19,String data20, String data21,String data22, String data23, String data24, String data25,String data26	)
	{
		
		try {
			 List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[3]"));
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
				ar.add(data9);
				ar.add(data10);
				ar.add(data11);
				ar.add(data12);

				ar.add(data13);
				ar.add(data14);
				ar.add(data15);
				ar.add(data16);
				ar.add(data17);
				ar.add(data18);
				ar.add(data19);
				ar.add(data20);
				ar.add(data21);
				ar.add(data22);
				ar.add(data23);
				ar.add(data24);
				ar.add(data25);
				ar.add(data26);

				

			
				boolean con=list.isEmpty();
			     soft.assertFalse(con);
				
			 for (int i =0;i<=list.size()-1;i++)
			 {
				 
				 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[3]"));

				 WebElement elem = list1.get(i);
				 
				String actualData = elem.getText();
				actualData = actualData.replaceAll("[£]", "");
				actualData = actualData.replaceAll("[,]", "");

				System.out.println(actualData);
				 soft.assertEquals(actualData, ar.get(i));
				
			 }
			 
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verifyFortightlyEmployeeNI"+e);
		}
		
		Reporter.log("verifyFortightlyEmployeeNI");
	}
	
	
	public void verify4WeeklyEmployeeNI(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,
			String data12, String data13	)
		{
			
			try {
				 List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[3]"));
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
					ar.add(data9);
					ar.add(data10);
					ar.add(data11);
					ar.add(data12);
					ar.add(data13);


				

				
					boolean con=list.isEmpty();
				     soft.assertFalse(con);
					
				 for (int i =0;i<=list.size()-1;i++)
				 {
					 
					 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[3]"));

					 WebElement elem = list1.get(i);
					 
					String actualData = elem.getText();
					actualData = actualData.replaceAll("[£]", "");
					actualData = actualData.replaceAll("[,]", "");

					System.out.println(actualData);
					 soft.assertEquals(actualData, ar.get(i));
					
				 }
				 
			} catch (Exception e) {
			    soft.assertFalse(true,"welcome to catch block");

				System.out.println("Issue IN verify4WeeklyEmployeeNI"+e);
			}
			
			Reporter.log("verify4WeeklyEmployeeNI");
		}
		
	

	public void verifyFortightlyEmployeePension(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,
		String data12,String data13,String data14, String data15, String data16, String data17, String data18, String data19,String data20, String data21,String data22, String data23, String data24, String data25,String data26	)
	{
		
		try {
			 List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[4]"));
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
				ar.add(data9);
				ar.add(data10);
				ar.add(data11);
				ar.add(data12);

				ar.add(data13);
				ar.add(data14);
				ar.add(data15);
				ar.add(data16);
				ar.add(data17);
				ar.add(data18);
				ar.add(data19);
				ar.add(data20);
				ar.add(data21);
				ar.add(data22);
				ar.add(data23);
				ar.add(data24);
				ar.add(data25);
				ar.add(data26);

				

			
				boolean con=list.isEmpty();
			     soft.assertFalse(con);
				
			 for (int i =0;i<=list.size()-1;i++)
			 {
				 
				 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[4]"));

				 WebElement elem = list1.get(i);
				 
				String actualData = elem.getText();
				actualData = actualData.replaceAll("[£]", "");
				actualData = actualData.replaceAll("[,]", "");

				System.out.println(actualData);
				 soft.assertEquals(actualData, ar.get(i));
				
			 }
			 
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verifyFortightlyEmployeeNI"+e);
		}
		
		Reporter.log("verifyFortightlyEmployeePension");
	}
	
	
	

	public void verifyFortightlyEmployerPension(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,
		String data12,String data13,String data14, String data15, String data16, String data17, String data18, String data19,String data20, String data21,String data22, String data23, String data24, String data25,String data26	)
	{
		
		try {
			 List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[7]"));
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
				ar.add(data9);
				ar.add(data10);
				ar.add(data11);
				ar.add(data12);

				ar.add(data13);
				ar.add(data14);
				ar.add(data15);
				ar.add(data16);
				ar.add(data17);
				ar.add(data18);
				ar.add(data19);
				ar.add(data20);
				ar.add(data21);
				ar.add(data22);
				ar.add(data23);
				ar.add(data24);
				ar.add(data25);
				ar.add(data26);

				

			
				boolean con=list.isEmpty();
			     soft.assertFalse(con);
				
			 for (int i =0;i<=list.size()-1;i++)
			 {
				 
				 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[7]"));

				 WebElement elem = list1.get(i);
				 
				String actualData = elem.getText();
				actualData = actualData.replaceAll("[£]", "");
				actualData = actualData.replaceAll("[,]", "");

				System.out.println(actualData);
				 soft.assertEquals(actualData, ar.get(i));
				
			 }
			 
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verifyFortightlyEmployerPension"+e);
		}
		
		Reporter.log("verifyFortightlyEmployerPension");
	}
	
	
	
	
	public void verifyEmployeeNIWeekly(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,String data12,
			
			String data13, String data14,String data15,String data16,String data17, String data18, String data19, String data20, String data21,String data22,String data23,String data24,String data25,String data26,String data27,
			
			String data28,String data29,String data30, String data31, String data32, String data33, String data34,String data35,String data36,String data37,String data38,String data39,String data40,
			String data41,String data42,String data43, String data44, String data45, String data46, String data47,String data48,String data49,String data50,String data51,String data52)
	{
		
		try {
			 List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[3]"));
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
				ar.add(data9);
				ar.add(data10);
				ar.add(data11);
				ar.add(data12);

				ar.add(data13);
				ar.add(data14);
				ar.add(data15);
				ar.add(data16);
				ar.add(data17);
				ar.add(data18);
				ar.add(data19);
				ar.add(data20);
				ar.add(data21);
				ar.add(data22);
				ar.add(data23);
				ar.add(data24);
				ar.add(data25);
				ar.add(data26);
				ar.add(data27);
				ar.add(data28);
				ar.add(data29);
				ar.add(data30);
				ar.add(data31);
				ar.add(data32);
				ar.add(data33);
				ar.add(data34);
				ar.add(data35);
				ar.add(data36);
				ar.add(data37);
				ar.add(data38);
				ar.add(data39);
				ar.add(data40);
				ar.add(data41);
				ar.add(data42);
				ar.add(data43);
				ar.add(data44);
				ar.add(data45);
				ar.add(data46);
				ar.add(data47);
				ar.add(data48);
				ar.add(data49);
				ar.add(data50);
				ar.add(data51);
				ar.add(data52);


				boolean con=list.isEmpty();
			     soft.assertFalse(con);
				
			 for (int i =0;i<=list.size()-1;i++)
			 {
				 
				 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[3]"));

				 WebElement elem = list1.get(i);
				 
				String actualData = elem.getText();
				actualData = actualData.replaceAll("[£]", "");
				actualData = actualData.replaceAll("[,]", "");

				System.out.println(actualData);
				 soft.assertEquals(actualData, ar.get(i));
				
			 }
			 
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verifyEmployeeNI"+e);
		}
		
		Reporter.log("verifyEmployeeNI");
	}

	
public void verifyEmployerNIWeekly(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,String data12,
			
			String data13, String data14,String data15,String data16,String data17, String data18, String data19, String data20, String data21,String data22,String data23,String data24,String data25,String data26,String data27,
			
			String data28,String data29,String data30, String data31, String data32, String data33, String data34,String data35,String data36,String data37,String data38,String data39,String data40,
			String data41,String data42,String data43, String data44, String data45, String data46, String data47,String data48,String data49,String data50,String data51,String data52)
	{
		
		try {
			 List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[6]"));
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
				ar.add(data9);
				ar.add(data10);
				ar.add(data11);
				ar.add(data12);

				ar.add(data13);
				ar.add(data14);
				ar.add(data15);
				ar.add(data16);
				ar.add(data17);
				ar.add(data18);
				ar.add(data19);
				ar.add(data20);
				ar.add(data21);
				ar.add(data22);
				ar.add(data23);
				ar.add(data24);
				ar.add(data25);
				ar.add(data26);
				ar.add(data27);
				ar.add(data28);
				ar.add(data29);
				ar.add(data30);
				ar.add(data31);
				ar.add(data32);
				ar.add(data33);
				ar.add(data34);
				ar.add(data35);
				ar.add(data36);
				ar.add(data37);
				ar.add(data38);
				ar.add(data39);
				ar.add(data40);
				ar.add(data41);
				ar.add(data42);
				ar.add(data43);
				ar.add(data44);
				ar.add(data45);
				ar.add(data46);
				ar.add(data47);
				ar.add(data48);
				ar.add(data49);
				ar.add(data50);
				ar.add(data51);
				ar.add(data52);


				boolean con=list.isEmpty();
			     soft.assertFalse(con);
				
			 for (int i =0;i<=list.size()-1;i++)
			 {
				 
				 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[6]"));

				 WebElement elem = list1.get(i);
				 
				String actualData = elem.getText();
				actualData = actualData.replaceAll("[£]", "");
				actualData = actualData.replaceAll("[,]", "");

				System.out.println(actualData);
				 soft.assertEquals(actualData, ar.get(i));
				
			 }
			 
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verifyEmployeeNI"+e);
		}
		
		Reporter.log("verifyEmployeeNI");
	}

	
	public void verifyEmployerNI(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11)
	{
		
		try {
			 List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[5]"));
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
				ar.add(data9);
				ar.add(data10);
				ar.add(data11);

			
				boolean con=list.isEmpty();
			     soft.assertFalse(con);
				
			 for (int i =0;i<=list.size()-1;i++)
			 {
				 
				 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[5]"));

				 WebElement elem = list1.get(i);
				 
				String actualData = elem.getText();
				actualData = actualData.replaceAll("[£]", "");
				actualData = actualData.replaceAll("[,]", "");

				System.out.println(actualData);
				 soft.assertEquals(actualData, ar.get(i));
				
			 }
			 
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verifyEmployeeNI"+e);
		}
		
		Reporter.log("verifyEmployerNI");

	}
	
	public void verifyFortightlyEmployerNI(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,
			String data12,String data13,String data14, String data15, String data16, String data17, String data18, String data19,String data20, String data21,String data22, String data23, String data24, String data25,String data26	)
		{
			
			try {
				 List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[5]"));
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
					ar.add(data9);
					ar.add(data10);
					ar.add(data11);
					ar.add(data12);

					ar.add(data13);
					ar.add(data14);
					ar.add(data15);
					ar.add(data16);
					ar.add(data17);
					ar.add(data18);
					ar.add(data19);
					ar.add(data20);
					ar.add(data21);
					ar.add(data22);
					ar.add(data23);
					ar.add(data24);
					ar.add(data25);
					ar.add(data26);

					

				
					boolean con=list.isEmpty();
				     soft.assertFalse(con);
					
				 for (int i =0;i<=list.size()-1;i++)
				 {
					 
					 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[5]"));

					 WebElement elem = list1.get(i);
					 
					String actualData = elem.getText();
					actualData = actualData.replaceAll("[£]", "");
					actualData = actualData.replaceAll("[,]", "");

					System.out.println(actualData);
					 soft.assertEquals(actualData, ar.get(i));
					
				 }
				 
			} catch (Exception e) {
			    soft.assertFalse(true,"welcome to catch block");

				System.out.println("Issue IN verifyFortightlyEmployerNI"+e);
			}
			
			Reporter.log("verifyFortightlyEmployerNI");
		}
	
	public void verify4WeeklyEmployerNI(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,
			String data12, String data13	)
		{
			
			try {
				 List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[5]"));
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
					ar.add(data9);
					ar.add(data10);
					ar.add(data11);
					ar.add(data12);
					ar.add(data13);

				

				
					boolean con=list.isEmpty();
				     soft.assertFalse(con);
					
				 for (int i =0;i<=list.size()-1;i++)
				 {
					 
					 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[5]"));

					 WebElement elem = list1.get(i);
					 
					String actualData = elem.getText();
					actualData = actualData.replaceAll("[£]", "");
					actualData = actualData.replaceAll("[,]", "");

					System.out.println(actualData);
					 soft.assertEquals(actualData, ar.get(i));
					
				 }
				 
			} catch (Exception e) {
			    soft.assertFalse(true,"welcome to catch block");

				System.out.println("Issue IN verify4WeeklyEmployerNI"+e);
			}
			
			Reporter.log("verify4WeeklyEmployerNI");
		}
		
	
	public void verify4WeeklyEmployerNI1(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,
			String data12, String data13	)
		{
			
			try {
				 List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[6]"));
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
					ar.add(data9);
					ar.add(data10);
					ar.add(data11);
					ar.add(data12);
					ar.add(data13);

				

				
					boolean con=list.isEmpty();
				     soft.assertFalse(con);
					
				 for (int i =0;i<=list.size()-1;i++)
				 {
					 
					 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[6]"));

					 WebElement elem = list1.get(i);
					 
					String actualData = elem.getText();
					actualData = actualData.replaceAll("[£]", "");
					actualData = actualData.replaceAll("[,]", "");

					System.out.println(actualData);
					 soft.assertEquals(actualData, ar.get(i));
					
				 }
				 
			} catch (Exception e) {
			    soft.assertFalse(true,"welcome to catch block");

				System.out.println("Issue IN verify4WeeklyEmployerNI"+e);
			}
			
			Reporter.log("verify4WeeklyEmployerNI");
		}
		
	
	public void verifyFortightlyEmployerNI1(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,
			String data12,String data13,String data14, String data15, String data16, String data17, String data18, String data19,String data20, String data21,String data22, String data23, String data24, String data25,String data26	)
		{
			
			try {
				 List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[6]"));
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
					ar.add(data9);
					ar.add(data10);
					ar.add(data11);
					ar.add(data12);

					ar.add(data13);
					ar.add(data14);
					ar.add(data15);
					ar.add(data16);
					ar.add(data17);
					ar.add(data18);
					ar.add(data19);
					ar.add(data20);
					ar.add(data21);
					ar.add(data22);
					ar.add(data23);
					ar.add(data24);
					ar.add(data25);
					ar.add(data26);

					

				
					boolean con=list.isEmpty();
				     soft.assertFalse(con);
					
				 for (int i =0;i<=list.size()-1;i++)
				 {
					 
					 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[6]"));

					 WebElement elem = list1.get(i);
					 
					String actualData = elem.getText();
					actualData = actualData.replaceAll("[£]", "");
					actualData = actualData.replaceAll("[,]", "");

					System.out.println(actualData);
					 soft.assertEquals(actualData, ar.get(i));
					
				 }
				 
			} catch (Exception e) {
			    soft.assertFalse(true,"welcome to catch block");

				System.out.println("Issue IN verifyFortightlyEmployerNI"+e);
			}
			
			Reporter.log("verifyFortightlyEmployerNI");
		}
	public void verifyEmployerNI1(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11)
	{
		
		try {
			 List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[6]"));
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
				ar.add(data9);
				ar.add(data10);
				ar.add(data11);

			
				boolean con=list.isEmpty();
			     soft.assertFalse(con);
				
			 for (int i =0;i<=list.size()-1;i++)
			 {
				 
				 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[6]"));

				 WebElement elem = list1.get(i);
				 
				String actualData = elem.getText();
				actualData = actualData.replaceAll("[£]", "");
				actualData = actualData.replaceAll("[,]", "");

				System.out.println(actualData);
				 soft.assertEquals(actualData, ar.get(i));
				
			 }
			 
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verifyEmployeeNI"+e);
		}
		
		Reporter.log("verifyEmployerNI");

	}
	
public void verifyTaxWeekly(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,String data12,
			
			String data13, String data14,String data15,String data16,String data17, String data18, String data19, String data20, String data21,String data22,String data23,String data24,String data25,String data26,String data27,
			
			String data28,String data29,String data30, String data31, String data32, String data33, String data34,String data35,String data36,String data37,String data38,String data39,String data40,
			String data41,String data42,String data43, String data44, String data45, String data46, String data47,String data48,String data49,String data50,String data51,String data52)
	{
		
		try {
			 List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/following-sibling::tr/td[2]"));
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
				ar.add(data9);
				ar.add(data10);
				ar.add(data11);
				ar.add(data12);

				ar.add(data13);
				ar.add(data14);
				ar.add(data15);
				ar.add(data16);
				ar.add(data17);
				ar.add(data18);
				ar.add(data19);
				ar.add(data20);
				ar.add(data21);
				ar.add(data22);
				ar.add(data23);
				ar.add(data24);
				ar.add(data25);
				ar.add(data26);
				ar.add(data27);
				ar.add(data28);
				ar.add(data29);
				ar.add(data30);
				ar.add(data31);
				ar.add(data32);
				ar.add(data33);
				ar.add(data34);
				ar.add(data35);
				ar.add(data36);
				ar.add(data37);
				ar.add(data38);
				ar.add(data39);
				ar.add(data40);
				ar.add(data41);
				ar.add(data42);
				ar.add(data43);
				ar.add(data44);
				ar.add(data45);
				ar.add(data46);
				ar.add(data47);
				ar.add(data48);
				ar.add(data49);
				ar.add(data50);
				ar.add(data51);
				ar.add(data52);


				boolean con=list.isEmpty();
			     soft.assertFalse(con);
				
			 for (int i =0;i<=list.size()-1;i++)
			 {
				 
				 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/following-sibling::tr/td[2]"));

				 WebElement elem = list1.get(i);
				 
				String actualData = elem.getText();
				actualData = actualData.replaceAll("[£]", "");
				actualData = actualData.replaceAll("[,]", "");

				System.out.println(actualData);
				 soft.assertEquals(actualData, ar.get(i));
				
			 }
			 
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verifyTaxWeekly"+e);
		}
		
		Reporter.log("verifyTaxWeekly");
	}
	
public void verifyFortightlyTax(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,
		String data12,String data13,String data14, String data15, String data16, String data17, String data18, String data19,String data20, String data21,String data22, String data23, String data24, String data25,String data26	)
	{
		
		try {
			 List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/following-sibling::tr/td[2]"));
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
				ar.add(data9);
				ar.add(data10);
				ar.add(data11);
				ar.add(data12);

				ar.add(data13);
				ar.add(data14);
				ar.add(data15);
				ar.add(data16);
				ar.add(data17);
				ar.add(data18);
				ar.add(data19);
				ar.add(data20);
				ar.add(data21);
				ar.add(data22);
				ar.add(data23);
				ar.add(data24);
				ar.add(data25);
				ar.add(data26);

				

			
				boolean con=list.isEmpty();
			     soft.assertFalse(con);
				
			 for (int i =0;i<=list.size()-1;i++)
			 {
				 
				 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/following-sibling::tr/td[2]"));

				 WebElement elem = list1.get(i);
				 
				String actualData = elem.getText();
				actualData = actualData.replaceAll("[£]", "");
				actualData = actualData.replaceAll("[,]", "");

				System.out.println(actualData);
				 soft.assertEquals(actualData, ar.get(i));
				
			 }
			 
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verifyFortightlyTax"+e);
		}
		
		Reporter.log("verifyFortightlyTax");
	}

public void verify4WeeklyTax(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,
		String data12, String data13	)
	{
		
		try {
			 List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/following-sibling::tr/td[2]"));
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
				ar.add(data9);
				ar.add(data10);
				ar.add(data11);
				ar.add(data12);
				ar.add(data13);

			

			
				boolean con=list.isEmpty();
			     soft.assertFalse(con);
				
			 for (int i =0;i<=list.size()-1;i++)
			 {
				 
				 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/following-sibling::tr/td[2]"));

				 WebElement elem = list1.get(i);
				 
				String actualData = elem.getText();
				actualData = actualData.replaceAll("[£]", "");
				actualData = actualData.replaceAll("[,]", "");

				System.out.println(actualData);
				 soft.assertEquals(actualData, ar.get(i));
				
			 }
			 
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verify4WeeklyTax"+e);
		}
		
		Reporter.log("verify4WeeklyTax");
	}
	


	public void verifyTax(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11)
	{
		
		try {
			 List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/following-sibling::tr/td[2]"));
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
				ar.add(data9);
				ar.add(data10);
				ar.add(data11);

			
				boolean con=list.isEmpty();
			     soft.assertFalse(con);
				
			 for (int i =0;i<=list.size()-1;i++)
			 {
				 
				 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/following-sibling::tr/td[2]"));

				 WebElement elem = list1.get(i);
				 
				String actualData = elem.getText();
				actualData = actualData.replaceAll("[£]", "");
				actualData = actualData.replaceAll("[,]", "");

				System.out.println(actualData);
				 soft.assertEquals(actualData, ar.get(i));
				
			 }
			 
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verifyTax"+e);
		}
		Reporter.log("verifyTax");

	}
	
	
	public void verifyStudentLoan(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,String data12)
	{
		
		try {
			 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='tblRptIndivisualPaySlip']/tbody/tr/td[10]"));
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
				ar.add(data9);
				ar.add(data10);
				ar.add(data11);

			

				boolean con=list.isEmpty();
			     soft.assertFalse(con);
				String totalStudentLoan = m_Driver.findElements(By.xpath("//*[@class='rowFinal']/td")).get(7).getText();
				
				totalStudentLoan = totalStudentLoan.replaceAll("[£]", "");
				totalStudentLoan = totalStudentLoan.replaceAll("[,]", "");
				soft.assertEquals(totalStudentLoan, data12, "not as expected finla row");
				
			 for (int i =0;i<=list.size()-1;i++)
			 {
				 
				 if(i==12) {
					 
					 break;
				 }
				 List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@id='tblRptIndivisualPaySlip']/tbody/tr/td[10]"));

				 WebElement elem = list1.get(i);
				 
				String actualData = elem.getText();
				actualData = actualData.replaceAll("[£]", "");
				actualData = actualData.replaceAll("[,]", "");

				System.out.println(actualData);
				 soft.assertEquals(actualData, ar.get(i));
				
			 }
			 
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verifyStudentLoan"+e);
		}
		Reporter.log("verifyStudentLoan");

	}
	
	

	public void verifyPostGraduateLoan(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,String data12)
	{
		
		try {
			 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='tblRptIndivisualPaySlip']/tbody/tr/td[11]"));
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
				ar.add(data9);
				ar.add(data10);
				ar.add(data11);

			

				boolean con=list.isEmpty();
			     soft.assertFalse(con);
				String totalPLoan = m_Driver.findElements(By.xpath("//*[@class='rowFinal']/td")).get(8).getText();
				
				totalPLoan = totalPLoan.replaceAll("[£]", "");
				totalPLoan = totalPLoan.replaceAll("[,]", "");
				soft.assertEquals(totalPLoan, data12, "totalPLoan not as expected finla row");
				
			 for (int i =0;i<=list.size()-1;i++)
			 {
				 
				 if(i==12) {
					 
					 break;
				 }
				 List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@id='tblRptIndivisualPaySlip']/tbody/tr/td[11]"));

				 WebElement elem = list1.get(i);
				 
				String actualData = elem.getText();
				actualData = actualData.replaceAll("[£]", "");
				actualData = actualData.replaceAll("[,]", "");

				System.out.println(actualData);
				 soft.assertEquals(actualData, ar.get(i));
				
			 }
			 
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verifyStudentLoan"+e);
		}
		Reporter.log("verifyStudentLoan");

	}
	
	
	public void verifyTax1(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11)
	{
		
		try {
			 List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/following-sibling::tr/td[2]"));
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
				ar.add(data9);
				ar.add(data10);
				ar.add(data11);

			
				boolean con=list.isEmpty();
			     soft.assertFalse(con);
				
			 for (int i =0;i<=list.size()-1;i++)
			 {
				 
				 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/following-sibling::tr/td[2]"));

				 WebElement elem = list1.get(i);
				 
				String actualData = elem.getText();
				actualData = actualData.replaceAll("[£]", "");
				actualData = actualData.replaceAll("[,]", "");

				System.out.println(actualData);
				 soft.assertEquals(actualData, ar.get(i));
				
			 }
			 
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verifyTax"+e);
		}
		Reporter.log("verifyTax");

	}

	
	public void verifyTaxDashBoard(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11)
	{
		
		try {
			 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[6]"));
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
				ar.add(data9);
				ar.add(data10);
				ar.add(data11);

			
				boolean con=list.isEmpty();
			     soft.assertFalse(con);
				
			 for (int i =0;i<=list.size()-1;i++)
			 {
				 
				 List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@class='table table-head-bg']/tbody/tr/td[6]"));

				 WebElement elem = list1.get(i);
				 
				String actualData = elem.getText();
				actualData = actualData.replaceAll("[£]", "");
				actualData = actualData.replaceAll("[,]", "");

				System.out.println(actualData);
				 soft.assertEquals(actualData, ar.get(i));
				
			 }
			 
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verifyTax"+e);
		}
		Reporter.log("verifyTax");

	}

	
	
	
	
public void verifyFortightlyNetPay(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,
		String data12,String data13,String data14, String data15, String data16, String data17, String data18, String data19,String data20, String data21,String data22, String data23, String data24, String data25,String data26	)
	{
		
		try {
			 List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[4]"));
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
				ar.add(data9);
				ar.add(data10);
				ar.add(data11);
				ar.add(data12);

				ar.add(data13);
				ar.add(data14);
				ar.add(data15);
				ar.add(data16);
				ar.add(data17);
				ar.add(data18);
				ar.add(data19);
				ar.add(data20);
				ar.add(data21);
				ar.add(data22);
				ar.add(data23);
				ar.add(data24);
				ar.add(data25);
				ar.add(data26);

				

			
				boolean con=list.isEmpty();
			     soft.assertFalse(con);
				
			 for (int i =0;i<=list.size()-1;i++)
			 {
				 
				 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[4]"));

				 WebElement elem = list1.get(i);
				 
				String actualData = elem.getText();
				actualData = actualData.replaceAll("[£]", "");
				actualData = actualData.replaceAll("[,]", "");

				System.out.println(actualData);
				 soft.assertEquals(actualData, ar.get(i));
				
			 }
			 
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verifyFortightlyNetPay"+e);
		}
		
		Reporter.log("verifyFortightlyNetPay");
	}


public void verify4WeeklyNetPay(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,
		String data12, String data13	)
	{
		
		try {
			 List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[4]"));
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
				ar.add(data9);
				ar.add(data10);
				ar.add(data11);
				ar.add(data12);
				ar.add(data13);


			
			
				boolean con=list.isEmpty();
			     soft.assertFalse(con);
				
			 for (int i =0;i<=list.size()-1;i++)
			 {
				 
				 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[4]"));

				 WebElement elem = list1.get(i);
				 
				String actualData = elem.getText();
				actualData = actualData.replaceAll("[£]", "");
				actualData = actualData.replaceAll("[,]", "");

				System.out.println(actualData);
				 soft.assertEquals(actualData, ar.get(i));
				
			 }
			 
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verify4WeeklyNetPay"+e);
		}
		
		Reporter.log("verify4WeeklyNetPay");
	}



public void verify4WeeklyEmployeePension(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,
		String data12, String data13	)
	{
		
		try {
			 List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[4]"));
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
				ar.add(data9);
				ar.add(data10);
				ar.add(data11);
				ar.add(data12);
				ar.add(data13);


			
			
				boolean con=list.isEmpty();
			     soft.assertFalse(con);
				
			 for (int i =0;i<=list.size()-1;i++)
			 {
				 
				 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[4]"));

				 WebElement elem = list1.get(i);
				 
				String actualData = elem.getText();
				actualData = actualData.replaceAll("[£]", "");
				actualData = actualData.replaceAll("[,]", "");

				System.out.println(actualData);
				 soft.assertEquals(actualData, ar.get(i));
				
			 }
			 
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verify4WeeklyEmployeePension"+e);
		}
		
		Reporter.log("verify4WeeklyEmployeePension");
	}




public void verify4WeeklyEmployerPension(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,
		String data12, String data13	)
	{
		
		try {
			 List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[7]"));
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
				ar.add(data9);
				ar.add(data10);
				ar.add(data11);
				ar.add(data12);
				ar.add(data13);


			
			
				boolean con=list.isEmpty();
			     soft.assertFalse(con);
				
			 for (int i =0;i<=list.size()-1;i++)
			 {
				 
				 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[7]"));

				 WebElement elem = list1.get(i);
				 
				String actualData = elem.getText();
				actualData = actualData.replaceAll("[£]", "");
				actualData = actualData.replaceAll("[,]", "");

				System.out.println(actualData);
				 soft.assertEquals(actualData, ar.get(i));
				
			 }
			 
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verify4WeeklyEmployeePension"+e);
		}
		
		Reporter.log("verify4WeeklyEmployeePension");
	}
public void verify4WeeklyNetPay1(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,
		String data12, String data13	)
	{
		
		try {
			 List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[5]"));
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
				ar.add(data9);
				ar.add(data10);
				ar.add(data11);
				ar.add(data12);
				ar.add(data13);


			
			
				boolean con=list.isEmpty();
			     soft.assertFalse(con);
				
			 for (int i =0;i<=list.size()-1;i++)
			 {
				 
				 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[5]"));

				 WebElement elem = list1.get(i);
				 
				String actualData = elem.getText();
				actualData = actualData.replaceAll("[£]", "");
				actualData = actualData.replaceAll("[,]", "");

				System.out.println(actualData);
				 soft.assertEquals(actualData, ar.get(i));
				
			 }
			 
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verify4WeeklyNetPay"+e);
		}
		
		Reporter.log("verify4WeeklyNetPay");
	}


public void verifyFortightlyNetPay1(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,
	String data12,String data13,String data14, String data15, String data16, String data17, String data18, String data19,String data20, String data21,String data22, String data23, String data24, String data25,String data26	)
{
	
	try {
		 List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[5]"));
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
			ar.add(data9);
			ar.add(data10);
			ar.add(data11);
			ar.add(data12);

			ar.add(data13);
			ar.add(data14);
			ar.add(data15);
			ar.add(data16);
			ar.add(data17);
			ar.add(data18);
			ar.add(data19);
			ar.add(data20);
			ar.add(data21);
			ar.add(data22);
			ar.add(data23);
			ar.add(data24);
			ar.add(data25);
			ar.add(data26);

			

		
			boolean con=list.isEmpty();
		     soft.assertFalse(con);
			
		 for (int i =0;i<=list.size()-1;i++)
		 {
			 
			 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[5]"));

			 WebElement elem = list1.get(i);
			 
			String actualData = elem.getText();
			actualData = actualData.replaceAll("[£]", "");
			actualData = actualData.replaceAll("[,]", "");

			System.out.println(actualData);
			 soft.assertEquals(actualData, ar.get(i));
			
		 }
		 
	} catch (Exception e) {
	    soft.assertFalse(true,"welcome to catch block");

		System.out.println("Issue IN verifyFortightlyNetPay"+e);
	}
	
	Reporter.log("verifyFortightlyNetPay");
}


	public void verifyNetPay(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11)
	{
		
		try {
			 List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[4]"));
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
				ar.add(data9);
				ar.add(data10);
				ar.add(data11);

			
				boolean con=list.isEmpty();
			     soft.assertFalse(con);
				
			 for (int i =0;i<=list.size()-1;i++)
			 {
				 
				 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[4]"));

				 WebElement elem = list1.get(i);
				 
				String actualData = elem.getText();
				actualData = actualData.replaceAll("[£]", "");
				actualData = actualData.replaceAll("[,]", "");

				System.out.println(actualData);
				 soft.assertEquals(actualData, ar.get(i));
				
			 }
			 
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verifyEmployeeNI"+e);
		}
		Reporter.log("verifyNetPay");

	}
	
	
public void verifyNetpayWeekly(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,String data12,
			
			String data13, String data14,String data15,String data16,String data17, String data18, String data19, String data20, String data21,String data22,String data23,String data24,String data25,String data26,String data27,
			
			String data28,String data29,String data30, String data31, String data32, String data33, String data34,String data35,String data36,String data37,String data38,String data39,String data40,
			String data41,String data42,String data43, String data44, String data45, String data46, String data47,String data48,String data49,String data50,String data51,String data52)
	{
		
		try {
			 List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[5]"));
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
				ar.add(data9);
				ar.add(data10);
				ar.add(data11);
				ar.add(data12);

				ar.add(data13);
				ar.add(data14);
				ar.add(data15);
				ar.add(data16);
				ar.add(data17);
				ar.add(data18);
				ar.add(data19);
				ar.add(data20);
				ar.add(data21);
				ar.add(data22);
				ar.add(data23);
				ar.add(data24);
				ar.add(data25);
				ar.add(data26);
				ar.add(data27);
				ar.add(data28);
				ar.add(data29);
				ar.add(data30);
				ar.add(data31);
				ar.add(data32);
				ar.add(data33);
				ar.add(data34);
				ar.add(data35);
				ar.add(data36);
				ar.add(data37);
				ar.add(data38);
				ar.add(data39);
				ar.add(data40);
				ar.add(data41);
				ar.add(data42);
				ar.add(data43);
				ar.add(data44);
				ar.add(data45);
				ar.add(data46);
				ar.add(data47);
				ar.add(data48);
				ar.add(data49);
				ar.add(data50);
				ar.add(data51);
				ar.add(data52);


				boolean con=list.isEmpty();
			     soft.assertFalse(con);
				
			 for (int i =0;i<=list.size()-1;i++)
			 {
				 
				 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[5]"));

				 WebElement elem = list1.get(i);
				 
				String actualData = elem.getText();
				actualData = actualData.replaceAll("[£]", "");
				actualData = actualData.replaceAll("[,]", "");

				System.out.println(actualData);
				 soft.assertEquals(actualData, ar.get(i));
				
			 }
			 
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verifyNetpayWeekly"+e);
		}
		
		Reporter.log("verifyNetpayWeekly");
	}
	
	
	
	public void verifyNetPay1(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11)
	{
		
		try {
			 List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[5]"));
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
				ar.add(data9);
				ar.add(data10);
				ar.add(data11);

			
				boolean con=list.isEmpty();
			     soft.assertFalse(con);
				
			 for (int i =0;i<=list.size()-1;i++)
			 {
				 
				 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[5]"));

				 WebElement elem = list1.get(i);
				 
				String actualData = elem.getText();
				actualData = actualData.replaceAll("[£]", "");
				actualData = actualData.replaceAll("[,]", "");

				System.out.println(actualData);
				 soft.assertEquals(actualData, ar.get(i));
				
			 }
			 
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verifyNetPay1"+e);
		}
		Reporter.log("verifyNetPay1");

	}
	

public void verifyEmployeePensionWeekly(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,String data12,
			
			String data13, String data14,String data15,String data16,String data17, String data18, String data19, String data20, String data21,String data22,String data23,String data24,String data25,String data26,String data27,
			
			String data28,String data29,String data30, String data31, String data32, String data33, String data34,String data35,String data36,String data37,String data38,String data39,String data40,
			String data41,String data42,String data43, String data44, String data45, String data46, String data47,String data48,String data49,String data50,String data51,String data52)
	{
		
		try {
			 List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[4]"));
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
				ar.add(data9);
				ar.add(data10);
				ar.add(data11);
				ar.add(data12);

				ar.add(data13);
				ar.add(data14);
				ar.add(data15);
				ar.add(data16);
				ar.add(data17);
				ar.add(data18);
				ar.add(data19);
				ar.add(data20);
				ar.add(data21);
				ar.add(data22);
				ar.add(data23);
				ar.add(data24);
				ar.add(data25);
				ar.add(data26);
				ar.add(data27);
				ar.add(data28);
				ar.add(data29);
				ar.add(data30);
				ar.add(data31);
				ar.add(data32);
				ar.add(data33);
				ar.add(data34);
				ar.add(data35);
				ar.add(data36);
				ar.add(data37);
				ar.add(data38);
				ar.add(data39);
				ar.add(data40);
				ar.add(data41);
				ar.add(data42);
				ar.add(data43);
				ar.add(data44);
				ar.add(data45);
				ar.add(data46);
				ar.add(data47);
				ar.add(data48);
				ar.add(data49);
				ar.add(data50);
				ar.add(data51);
				ar.add(data52);


				boolean con=list.isEmpty();
			     soft.assertFalse(con);
				
			 for (int i =0;i<=list.size()-1;i++)
			 {
				 
				 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[4]"));

				 WebElement elem = list1.get(i);
				 
				String actualData = elem.getText();
				actualData = actualData.replaceAll("[£]", "");
				actualData = actualData.replaceAll("[,]", "");

				System.out.println(actualData);
				 soft.assertEquals(actualData, ar.get(i));
				
			 }
			 
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verifyEmployeePensionWeekly"+e);
		}
		
		Reporter.log("verifyEmployeePensionWeekly");
	}
	
	public void verifyEmployeePension(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11)
	{
		
		try {
			 List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[4]"));
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
				ar.add(data9);
				ar.add(data10);
				ar.add(data11);

			
				boolean con=list.isEmpty();
			     soft.assertFalse(con);
				
			 for (int i =0;i<=list.size()-1;i++)
			 {
				 
				 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[4]"));

				 WebElement elem = list1.get(i);
				 
				String actualData = elem.getText();
				actualData = actualData.replaceAll("[£]", "");
				actualData = actualData.replaceAll("[,]", "");

				System.out.println(actualData);
				 soft.assertEquals(actualData, ar.get(i));
				
			 }
			 
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verifyEmployeePension"+e);
		}
		Reporter.log("verifyEmployeePension");

	}
	
	
public void verifyEmployerPensionWeekly(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,String data12,
			
			String data13, String data14,String data15,String data16,String data17, String data18, String data19, String data20, String data21,String data22,String data23,String data24,String data25,String data26,String data27,
			
			String data28,String data29,String data30, String data31, String data32, String data33, String data34,String data35,String data36,String data37,String data38,String data39,String data40,
			String data41,String data42,String data43, String data44, String data45, String data46, String data47,String data48,String data49,String data50,String data51,String data52)
	{
		
		try {
			 List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[7]"));
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
				ar.add(data9);
				ar.add(data10);
				ar.add(data11);
				ar.add(data12);

				ar.add(data13);
				ar.add(data14);
				ar.add(data15);
				ar.add(data16);
				ar.add(data17);
				ar.add(data18);
				ar.add(data19);
				ar.add(data20);
				ar.add(data21);
				ar.add(data22);
				ar.add(data23);
				ar.add(data24);
				ar.add(data25);
				ar.add(data26);
				ar.add(data27);
				ar.add(data28);
				ar.add(data29);
				ar.add(data30);
				ar.add(data31);
				ar.add(data32);
				ar.add(data33);
				ar.add(data34);
				ar.add(data35);
				ar.add(data36);
				ar.add(data37);
				ar.add(data38);
				ar.add(data39);
				ar.add(data40);
				ar.add(data41);
				ar.add(data42);
				ar.add(data43);
				ar.add(data44);
				ar.add(data45);
				ar.add(data46);
				ar.add(data47);
				ar.add(data48);
				ar.add(data49);
				ar.add(data50);
				ar.add(data51);
				ar.add(data52);


				boolean con=list.isEmpty();
			     soft.assertFalse(con);
				
			 for (int i =0;i<=list.size()-1;i++)
			 {
				 
				 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[7]"));

				 WebElement elem = list1.get(i);
				 
				String actualData = elem.getText();
				actualData = actualData.replaceAll("[£]", "");
				actualData = actualData.replaceAll("[,]", "");

				System.out.println(actualData);
				 soft.assertEquals(actualData, ar.get(i));
				
			 }
			 
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verifyEmployerPensionWeekly"+e);
		}
		
		Reporter.log("verifyEmployerPensionWeekly");
	}
	
	
	public void verifyEmployerPension(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11)
	{
		
		try {
			 List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[7]"));
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
				ar.add(data9);
				ar.add(data10);
				ar.add(data11);

			
				boolean con=list.isEmpty();
			     soft.assertFalse(con);
				
			 for (int i =0;i<=list.size()-1;i++)
			 {
				 
				 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//*[@class='panel panel-default'])[2]/div/div/table/tbody/tr/td[7]"));

				 WebElement elem = list1.get(i);
				 
				String actualData = elem.getText();
				actualData = actualData.replaceAll("[£]", "");
				actualData = actualData.replaceAll("[,]", "");

				System.out.println(actualData);
				 soft.assertEquals(actualData, ar.get(i));
				
			 }
			 
		} catch (Exception e) {
		    soft.assertFalse(true,"welcome to catch block");

			System.out.println("Issue IN verifyEmployerPension"+e);
		}
		Reporter.log("verifyEmployerPension");

	}
	
	
	public void netTaxNIYTD1(String expextedTax , String expectedEmployeeNI,String expectedEmployerNI, String expectedNet )
	{
		 m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));
		 
		String taxYTD = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[16]/div")).getText();
		String employeeNI = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[14]/div")).getText();
		String employerNI = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[17]/div")).getText();
		String net = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[15]/div")).getText();
		
		soft.assertEquals(taxYTD, expextedTax, "expected result not matched");
		soft.assertEquals(employeeNI, expectedEmployeeNI, "expected result not matched");
		soft.assertEquals(employerNI, expectedEmployerNI, "expected result not matched");
		soft.assertEquals(net, expectedNet, "expected result not matched");
	
		
		m_Driver.switchTo().defaultContent();
		Reporter.log("Verify net tax NI figure");
		
	}
	

	public void netTaxNIGrossYTD(String expextedTax , String expectedEmployeeNI,String expectedEmployerNI, String expectedNet , String expectedGross)
	{
		 m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));
		 
		String taxYTD = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[16]/div")).getText();
		String employeeNI = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[14]/div")).getText();
		String employerNI = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[17]/div")).getText();
		String net = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[15]/div")).getText();
		
		String gross = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[13]/div")).getText();

		soft.assertEquals(taxYTD, expextedTax, "expected  tax result not matched");
		soft.assertEquals(employeeNI, expectedEmployeeNI, "expected  EENI result not matched");
		soft.assertEquals(employerNI, expectedEmployerNI, "expected  ErNIresult not matched");
		soft.assertEquals(net, expectedNet, "expected netPay result not matched");
		soft.assertEquals(gross, expectedGross, "expected  gross result not matched");

		
		m_Driver.switchTo().defaultContent();
		Reporter.log("Verify net tax NI figure");
		
	}
	

	public void grossnetTaxNIPensionYTD(String expectedGross, String expextedTax , String expectedEmployeeNI,String expectedEmployerNI, String expectedNet,String employeePension,String employerPension )
	{
		 m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));
			String gross = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[13]/div")).getText();

		String taxYTD = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[16]/div")).getText();
		String employeeNI = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[14]/div")).getText();
		String employerNI = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[17]/div")).getText();
		String net = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[15]/div")).getText();
		
		String actualEmployeePension = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[18]/div")).getText();
		String actualEmployerPension = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[19]/div")).getText();
		soft.assertEquals(gross, expectedGross, "expected result not matched");

		soft.assertEquals(taxYTD, expextedTax, "expected result not matched");
		soft.assertEquals(employeeNI, expectedEmployeeNI, "expected result not matched");
		soft.assertEquals(employerNI, expectedEmployerNI, "expected result not matched");
		soft.assertEquals(net, expectedNet, "expected result not matched");
	
		soft.assertEquals(actualEmployeePension, employeePension, "expected result not matched");

		soft.assertEquals(actualEmployerPension, employerPension, "expected result not matched");

		
		m_Driver.switchTo().defaultContent();
		Reporter.log("Verify net tax NI gross Pension figure");
		
	}
	
	
	
	public void netTaxNIPensionYTD(String expextedTax , String expectedEmployeeNI,String expectedEmployerNI, String expectedNet,String employeePension,String employerPension )
	{
		 m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));
		 
		String taxYTD = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[16]/div")).getText();
		String employeeNI = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[14]/div")).getText();
		String employerNI = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[17]/div")).getText();
		String net = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[15]/div")).getText();
		
		String actualEmployeePension = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[18]/div")).getText();
		String actualEmployerPension = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div/div[19]/div")).getText();

		soft.assertEquals(taxYTD, expextedTax, "expected result not matched");
		soft.assertEquals(employeeNI, expectedEmployeeNI, "expected result not matched");
		soft.assertEquals(employerNI, expectedEmployerNI, "expected result not matched");
		soft.assertEquals(net, expectedNet, "expected result not matched");
	
		soft.assertEquals(actualEmployeePension, employeePension, "expected result not matched");

		soft.assertEquals(actualEmployerPension, employerPension, "expected result not matched");
		m_Driver.switchTo().defaultContent();
		Reporter.log("Verify net tax NI Pension figure");
		
	}
	
	public void verifyP60OffPayWorker(String pay, String taxDeducted, String lel,String pt, String uel ,String employeePT) throws  Exception
	{
		
	
			File file = new File("C:\\Users\\Sonu\\Downloads\\P60-2023-2024-Mr. Ankit Singh.pdf");
			PDDocument document = PDDocument.load(file);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			PDFtext = pdfStripper.getText(document);
			
			//System.out.println(PDFtext);
			document.close();
			
			
		soft.assertTrue(PDFtext.contains(pay));
		soft.assertTrue(PDFtext.contains(taxDeducted), "tax not as expected ");
		soft.assertTrue(PDFtext.contains(lel),"lel not match");
		soft.assertTrue(PDFtext.contains(pt),"pt not match");
		soft.assertTrue(PDFtext.contains(uel),"uel not match");
		soft.assertTrue(PDFtext.contains(employeePT),"employeePT not match");

		Reporter.log("verifyP60OffPayWorker");
	
				    if(file.delete())
				    System.out.println("file deleted");
				
	}
	
	
	public void verifyP60OffPayWorker2(String pay, String taxDeducted,String currentemployementPay,String currentemployementTax,String TotalYearPay,String totalYearTax, String lel,String pt, String uel ,String employeePT) throws  Exception
	{
		
	
			File file = new File("C:\\Users\\Sonu\\Downloads\\P60-2023-2024-Mr. Prince Singh.pdf");
			PDDocument document = PDDocument.load(file);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			PDFtext = pdfStripper.getText(document);
			
			//System.out.println(PDFtext);
			document.close();
			
			
		soft.assertTrue(PDFtext.contains(pay));
		soft.assertTrue(PDFtext.contains(taxDeducted), "tax not as expected ");
		soft.assertTrue(PDFtext.contains(currentemployementPay));
		soft.assertTrue(PDFtext.contains(currentemployementTax));
		soft.assertTrue(PDFtext.contains(TotalYearPay));
		soft.assertTrue(PDFtext.contains(totalYearTax));

		soft.assertTrue(PDFtext.contains(lel));
		soft.assertTrue(PDFtext.contains(pt));
		soft.assertTrue(PDFtext.contains(uel));
		soft.assertTrue(PDFtext.contains(employeePT),"employeePT not as expected");

		Reporter.log("verifyP60OffPayWorker");
	
				    if(file.delete())
				    System.out.println("file deleted");
				
	}
	
	public void verifyP60(String pay, String taxDeducted, String lel,String pt, String uel ,String employeePT) throws  Exception
	{
		
	
			File file = new File("C:\\Users\\Sonu\\Downloads\\P60-2023-2024-Mr. Prince Singh.pdf");
			PDDocument document = PDDocument.load(file);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			PDFtext = pdfStripper.getText(document);
			
			//System.out.println(PDFtext);
			document.close();
			
			
		soft.assertTrue(PDFtext.contains(pay),"pay not as expected");
		soft.assertTrue(PDFtext.contains(taxDeducted), "taxDeducted  not as expected ");
		soft.assertTrue(PDFtext.contains(lel),"lel not as expected");
		soft.assertTrue(PDFtext.contains(pt),"pt not as expected");
		soft.assertTrue(PDFtext.contains(uel),"uel not as expected ");
		soft.assertTrue(PDFtext.contains(employeePT),"employeePT not as expected ");
		Reporter.log("verifyP60OffPayWorker");
	
				    if(file.delete())
				    System.out.println("file deleted");
				
	}
	
	
	public void verifyP60OffPayWorker1(String pay, String taxDeducted, String lel,String pt, String uel ,String employeePT) throws  Exception
	{
		
	
			File file = new File("C:\\Users\\Sonu\\Downloads\\P60-2023-2024-Mr. Pihu Singh.pdf");
			PDDocument document = PDDocument.load(file);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			PDFtext = pdfStripper.getText(document);
			
			//System.out.println(PDFtext);
			document.close();
			
			
		soft.assertTrue(PDFtext.contains(pay));
		soft.assertTrue(PDFtext.contains(taxDeducted), "tax not as expected ");
		soft.assertTrue(PDFtext.contains(lel));
		soft.assertTrue(PDFtext.contains(pt));
		soft.assertTrue(PDFtext.contains(uel));
		soft.assertTrue(PDFtext.contains(employeePT));

		Reporter.log("verifyP60OffPayWorker");
	
				    if(file.delete())
				    System.out.println("file deleted");
				
	}
	
	
	public void verifyFortightlyStudentLoan(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,
			String data12,String data13,String data14, String data15, String data16, String data17, String data18, String data19,String data20, String data21,String data22, String data23, String data24, String data25,String data26,String data27)
		{
			
			try {
				 List<WebElement> list = m_Driver.findElements(By.xpath("//*[@id='tblRptIndivisualPaySlip']/tbody/tr/td[10]"));
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
					ar.add(data9);
					ar.add(data10);
					ar.add(data11);
					ar.add(data12);

					ar.add(data13);
					ar.add(data14);
					ar.add(data15);
					ar.add(data16);
					ar.add(data17);
					ar.add(data18);
					ar.add(data19);
					ar.add(data20);
					ar.add(data21);
					ar.add(data22);
					ar.add(data23);
					ar.add(data24);
					ar.add(data25);
					ar.add(data26);

					

				
					boolean con=list.isEmpty();
				     soft.assertFalse(con);
					String totalStudentLoan = m_Driver.findElements(By.xpath("//*[@class='rowFinal']/td")).get(7).getText();
					soft.assertEquals(totalStudentLoan, data27);

					
				 for (int i =0;i<=list.size()-1;i++)
				 {
					 
					 if(i==27)
					 {
						 break;
					 }
					 List<WebElement> list1 = m_Driver.findElements(By.xpath("//*[@id='tblRptIndivisualPaySlip']/tbody/tr/td[10]"));

					 WebElement elem = list1.get(i);
					 
					String actualData = elem.getText();
					actualData = actualData.replaceAll("[£]", "");
					actualData = actualData.replaceAll("[,]", "");

					System.out.println(actualData);
					 soft.assertEquals(actualData, ar.get(i));
					
				 }
				 
			} catch (Exception e) {
			    soft.assertFalse(true,"welcome to catch block");

				System.out.println("Issue IN verifyFortightlyStudentLoan"+e);
			}
			
			Reporter.log("verifyFortightlyStudentLoan");
		}
	
	
	 
	 
	 public void verifyP11EarningsAtTheLEL(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,String data12)
		{
			
			try {
				 List<WebElement> list = m_Driver.findElements(By.xpath("(//div[@class='table-responsive'])[1]//td[3]"));
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
					ar.add(data9);
					ar.add(data10);
					ar.add(data11);
					ar.add(data12);
				
					boolean con=list.isEmpty();
				     soft.assertFalse(con);
					
				 for (int i =0;i<=list.size()-1;i++)
				 {
					 
					 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//div[@class='table-responsive'])[1]//td[3]"));

					 WebElement elem = list1.get(i);
					 
					String actualData = elem.getText();
					actualData = actualData.replaceAll("[£]", "");
					actualData = actualData.replaceAll("[,]", "");

					System.out.println(actualData);
					 soft.assertEquals(actualData, ar.get(i));
					
				 }
				 
			} catch (Exception e) {
			    soft.assertFalse(true,"welcome to catch block");

				System.out.println("Issue IN verifyEarningsAtTheLEL"+e);
			}
			
			Reporter.log("verifyEarningsAtTheLEL");
		}
	 
	 
	 
	 public void verifyP11EarningsAtTheLELWeekly(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,String data12,
				
				String data13, String data14,String data15,String data16,String data17, String data18, String data19, String data20, String data21,String data22,String data23,String data24,String data25,String data26,String data27,
				
				String data28,String data29,String data30, String data31, String data32, String data33, String data34,String data35,String data36,String data37,String data38,String data39,String data40,
				String data41,String data42,String data43, String data44, String data45, String data46, String data47,String data48,String data49,String data50,String data51,String data52,String  data53)
		{
			
			try {
				 List<WebElement> list = m_Driver.findElements(By.xpath("(//div[@class='table-responsive'])[1]//td[3]"));
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
					ar.add(data9);
					ar.add(data10);
					ar.add(data11);
					ar.add(data12);

					ar.add(data13);
					ar.add(data14);
					ar.add(data15);
					ar.add(data16);
					ar.add(data17);
					ar.add(data18);
					ar.add(data19);
					ar.add(data20);
					ar.add(data21);
					ar.add(data22);
					ar.add(data23);
					ar.add(data24);
					ar.add(data25);
					ar.add(data26);
					ar.add(data27);
					ar.add(data28);
					ar.add(data29);
					ar.add(data30);
					ar.add(data31);
					ar.add(data32);
					ar.add(data33);
					ar.add(data34);
					ar.add(data35);
					ar.add(data36);
					ar.add(data37);
					ar.add(data38);
					ar.add(data39);
					ar.add(data40);
					ar.add(data41);
					ar.add(data42);
					ar.add(data43);
					ar.add(data44);
					ar.add(data45);
					ar.add(data46);
					ar.add(data47);
					ar.add(data48);
					ar.add(data49);
					ar.add(data50);
					ar.add(data51);
					ar.add(data52);
					ar.add(data53);


				
					boolean con=list.isEmpty();
				     soft.assertFalse(con);
					
				 for (int i =0;i<=list.size()-1;i++)
				 {
					 
					 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//div[@class='table-responsive'])[1]//td[3]"));

					 WebElement elem = list1.get(i);
					 
					String actualData = elem.getText();
					actualData = actualData.replaceAll("[£]", "");
					actualData = actualData.replaceAll("[,]", "");

					System.out.println(actualData);
					 soft.assertEquals(actualData, ar.get(i));
					
				 }
				 
			} catch (Exception e) {
			    soft.assertFalse(true,"welcome to catch block");

				System.out.println("Issue IN verifyEarningsAtTheLEL"+e);
			}
			
			Reporter.log("verifyEarningsAtTheLEL");
		}
	 
	 
	 
	 public void verifyP11EarningsAboveTheLEL(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,String data12)
		{
			
			try {
				 List<WebElement> list = m_Driver.findElements(By.xpath("(//div[@class='table-responsive'])[1]//td[4]"));
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
					ar.add(data9);
					ar.add(data10);
					ar.add(data11);
					ar.add(data12);
				
					boolean con=list.isEmpty();
				     soft.assertFalse(con);
					
				 for (int i =0;i<=list.size()-1;i++)
				 {
					 
					 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//div[@class='table-responsive'])[1]//td[4]"));

					 WebElement elem = list1.get(i);
					 
					String actualData = elem.getText();
					actualData = actualData.replaceAll("[£]", "");
					actualData = actualData.replaceAll("[,]", "");

					System.out.println(actualData);
					 soft.assertEquals(actualData, ar.get(i));
					
				 }
				 
			} catch (Exception e) {
			    soft.assertFalse(true,"welcome to catch block");

				System.out.println("Issue IN verifyEarningsAboveTheLEL"+e);
			}
			
			Reporter.log("verifyEarningsAboveTheLEL");
		}
		
	 
	 
	 

	 public void verifyP11EarningsAboveTheLELWeekly(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,String data12,
				
				String data13, String data14,String data15,String data16,String data17, String data18, String data19, String data20, String data21,String data22,String data23,String data24,String data25,String data26,String data27,
				
				String data28,String data29,String data30, String data31, String data32, String data33, String data34,String data35,String data36,String data37,String data38,String data39,String data40,
				String data41,String data42,String data43, String data44, String data45, String data46, String data47,String data48,String data49,String data50,String data51,String data52,String  data53)
		{
			
			try {
				 List<WebElement> list = m_Driver.findElements(By.xpath("(//div[@class='table-responsive'])[1]//td[4]"));
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
					ar.add(data9);
					ar.add(data10);
					ar.add(data11);
					ar.add(data12);

					ar.add(data13);
					ar.add(data14);
					ar.add(data15);
					ar.add(data16);
					ar.add(data17);
					ar.add(data18);
					ar.add(data19);
					ar.add(data20);
					ar.add(data21);
					ar.add(data22);
					ar.add(data23);
					ar.add(data24);
					ar.add(data25);
					ar.add(data26);
					ar.add(data27);
					ar.add(data28);
					ar.add(data29);
					ar.add(data30);
					ar.add(data31);
					ar.add(data32);
					ar.add(data33);
					ar.add(data34);
					ar.add(data35);
					ar.add(data36);
					ar.add(data37);
					ar.add(data38);
					ar.add(data39);
					ar.add(data40);
					ar.add(data41);
					ar.add(data42);
					ar.add(data43);
					ar.add(data44);
					ar.add(data45);
					ar.add(data46);
					ar.add(data47);
					ar.add(data48);
					ar.add(data49);
					ar.add(data50);
					ar.add(data51);
					ar.add(data52);
					ar.add(data53);


				
					boolean con=list.isEmpty();
				     soft.assertFalse(con);
					
				 for (int i =0;i<=list.size()-1;i++)
				 {
					 
					 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//div[@class='table-responsive'])[1]//td[4]"));

					 WebElement elem = list1.get(i);
					 
					String actualData = elem.getText();
					actualData = actualData.replaceAll("[£]", "");
					actualData = actualData.replaceAll("[,]", "");

					System.out.println(actualData);
					 soft.assertEquals(actualData, ar.get(i));
					
				 }
				 
			} catch (Exception e) {
			    soft.assertFalse(true,"welcome to catch block");

				System.out.println("Issue IN verifyEarningsAboveTheLEL"+e);
			}
			
			Reporter.log("verifyEarningsAboveTheLEL");
		}
		
	 
	 public void verifyP11EarningsAboveThePT(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,String data12)
		{
			
			try {
				 List<WebElement> list = m_Driver.findElements(By.xpath("(//div[@class='table-responsive'])[1]//td[5]"));
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
					ar.add(data9);
					ar.add(data10);
					ar.add(data11);
					ar.add(data12);
				
					boolean con=list.isEmpty();
				     soft.assertFalse(con);
					
				 for (int i =0;i<=list.size()-1;i++)
				 {
					 
					 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//div[@class='table-responsive'])[1]//td[5]"));

					 WebElement elem = list1.get(i);
					 
					String actualData = elem.getText();
					actualData = actualData.replaceAll("[£]", "");
					actualData = actualData.replaceAll("[,]", "");

					System.out.println(actualData);
					 soft.assertEquals(actualData, ar.get(i));
					
				 }
				 
			} catch (Exception e) {
			    soft.assertFalse(true,"welcome to catch block");

				System.out.println("Issue IN verifyEarningsAboveThePT"+e);
			}
			
			Reporter.log("verifyEarningsAboveThePT");
		}
		
	 
	 
	 
	 public void verifyP11EarningsAboveThePTWeekly(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,String data12,
				
				String data13, String data14,String data15,String data16,String data17, String data18, String data19, String data20, String data21,String data22,String data23,String data24,String data25,String data26,String data27,
				
				String data28,String data29,String data30, String data31, String data32, String data33, String data34,String data35,String data36,String data37,String data38,String data39,String data40,
				String data41,String data42,String data43, String data44, String data45, String data46, String data47,String data48,String data49,String data50,String data51,String data52,String  data53)
		{
			
			try {
				 List<WebElement> list = m_Driver.findElements(By.xpath("(//div[@class='table-responsive'])[1]//td[5]"));
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
					ar.add(data9);
					ar.add(data10);
					ar.add(data11);
					ar.add(data12);

					ar.add(data13);
					ar.add(data14);
					ar.add(data15);
					ar.add(data16);
					ar.add(data17);
					ar.add(data18);
					ar.add(data19);
					ar.add(data20);
					ar.add(data21);
					ar.add(data22);
					ar.add(data23);
					ar.add(data24);
					ar.add(data25);
					ar.add(data26);
					ar.add(data27);
					ar.add(data28);
					ar.add(data29);
					ar.add(data30);
					ar.add(data31);
					ar.add(data32);
					ar.add(data33);
					ar.add(data34);
					ar.add(data35);
					ar.add(data36);
					ar.add(data37);
					ar.add(data38);
					ar.add(data39);
					ar.add(data40);
					ar.add(data41);
					ar.add(data42);
					ar.add(data43);
					ar.add(data44);
					ar.add(data45);
					ar.add(data46);
					ar.add(data47);
					ar.add(data48);
					ar.add(data49);
					ar.add(data50);
					ar.add(data51);
					ar.add(data52);
					ar.add(data53);
					boolean con=list.isEmpty();
				     soft.assertFalse(con);
					
				 for (int i =0;i<=list.size()-1;i++)
				 {
					 
					 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//div[@class='table-responsive'])[1]//td[5]"));

					 WebElement elem = list1.get(i);
					 
					String actualData = elem.getText();
					actualData = actualData.replaceAll("[£]", "");
					actualData = actualData.replaceAll("[,]", "");

					System.out.println(actualData);
					 soft.assertEquals(actualData, ar.get(i));
					
				 }
				 
			} catch (Exception e) {
			    soft.assertFalse(true,"welcome to catch block");

				System.out.println("Issue IN verifyEarningsAboveThePT"+e);
			}
			
			Reporter.log("verifyEarningsAboveThePT");
		}
		
	 
	 

	 public void verifyP11TotalContributions(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,String data12)
		{
			
			try {
				 List<WebElement> list = m_Driver.findElements(By.xpath("(//div[@class='table-responsive'])[1]//td[6]"));
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
					ar.add(data9);
					ar.add(data10);
					ar.add(data11);
					ar.add(data12);
				
					boolean con=list.isEmpty();
				     soft.assertFalse(con);
					
				 for (int i =0;i<=list.size()-1;i++)
				 {
					 
					 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//div[@class='table-responsive'])[1]//td[6]"));

					 WebElement elem = list1.get(i);
					 
					String actualData = elem.getText();
					actualData = actualData.replaceAll("[£]", "");
					actualData = actualData.replaceAll("[,]", "");

					System.out.println(actualData);
					 soft.assertEquals(actualData, ar.get(i));
					
				 }
				 
			} catch (Exception e) {
			    soft.assertFalse(true,"welcome to catch block");

				System.out.println("Issue IN verifyTotalContributions"+e);
			}
			
			Reporter.log("verifyTotalContributions");
		}
	 
	 
	 
	 public void verifyP11TotalContributionsWeekly(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,String data12,
				
				String data13, String data14,String data15,String data16,String data17, String data18, String data19, String data20, String data21,String data22,String data23,String data24,String data25,String data26,String data27,
				
				String data28,String data29,String data30, String data31, String data32, String data33, String data34,String data35,String data36,String data37,String data38,String data39,String data40,
				String data41,String data42,String data43, String data44, String data45, String data46, String data47,String data48,String data49,String data50,String data51,String data52,String  data53)
		{
			
			try {
				 List<WebElement> list = m_Driver.findElements(By.xpath("(//div[@class='table-responsive'])[1]//td[6]"));
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
					ar.add(data9);
					ar.add(data10);
					ar.add(data11);
					ar.add(data12);

					ar.add(data13);
					ar.add(data14);
					ar.add(data15);
					ar.add(data16);
					ar.add(data17);
					ar.add(data18);
					ar.add(data19);
					ar.add(data20);
					ar.add(data21);
					ar.add(data22);
					ar.add(data23);
					ar.add(data24);
					ar.add(data25);
					ar.add(data26);
					ar.add(data27);
					ar.add(data28);
					ar.add(data29);
					ar.add(data30);
					ar.add(data31);
					ar.add(data32);
					ar.add(data33);
					ar.add(data34);
					ar.add(data35);
					ar.add(data36);
					ar.add(data37);
					ar.add(data38);
					ar.add(data39);
					ar.add(data40);
					ar.add(data41);
					ar.add(data42);
					ar.add(data43);
					ar.add(data44);
					ar.add(data45);
					ar.add(data46);
					ar.add(data47);
					ar.add(data48);
					ar.add(data49);
					ar.add(data50);
					ar.add(data51);
					ar.add(data52);
					ar.add(data53);
					boolean con=list.isEmpty();
				     soft.assertFalse(con);
					
				 for (int i =0;i<=list.size()-1;i++)
				 {
					 
					 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//div[@class='table-responsive'])[1]//td[6]"));

					 WebElement elem = list1.get(i);
					 
					String actualData = elem.getText();
					actualData = actualData.replaceAll("[£]", "");
					actualData = actualData.replaceAll("[,]", "");

					System.out.println(actualData);
					 soft.assertEquals(actualData, ar.get(i));
					
				 }
				 
			} catch (Exception e) {
			    soft.assertFalse(true,"welcome to catch block");

				System.out.println("Issue IN verifyTotalContributions"+e);
			}
			
			Reporter.log("verifyTotalContributions");
		}
		
		
 
	 
	 public void verifyP11EmployeeContributions(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,String data12)
		{
			
			try {
				 List<WebElement> list = m_Driver.findElements(By.xpath("(//div[@class='table-responsive'])[1]//td[7]"));
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
					ar.add(data9);
					ar.add(data10);
					ar.add(data11);
					ar.add(data12);
				
					boolean con=list.isEmpty();
				     soft.assertFalse(con);
					
				 for (int i =0;i<=list.size()-1;i++)
				 {
					 
					 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//div[@class='table-responsive'])[1]//td[7]"));

					 WebElement elem = list1.get(i);
					 
					String actualData = elem.getText();
					actualData = actualData.replaceAll("[£]", "");
					actualData = actualData.replaceAll("[,]", "");

					System.out.println(actualData);
					 soft.assertEquals(actualData, ar.get(i));
					
				 }
				 
			} catch (Exception e) {
			    soft.assertFalse(true,"welcome to catch block");

				System.out.println("Issue IN verifyP11EmployeeContributions"+e);
			}
			
			Reporter.log("verifyP11EmployeeContributions");
		}
	 
	 
 
	 public void verifyP11EmployeeContributionsWeekly(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,String data12,
				
				String data13, String data14,String data15,String data16,String data17, String data18, String data19, String data20, String data21,String data22,String data23,String data24,String data25,String data26,String data27,
				
				String data28,String data29,String data30, String data31, String data32, String data33, String data34,String data35,String data36,String data37,String data38,String data39,String data40,
				String data41,String data42,String data43, String data44, String data45, String data46, String data47,String data48,String data49,String data50,String data51,String data52,String  data53)
		{
			
			try {
				 List<WebElement> list = m_Driver.findElements(By.xpath("(//div[@class='table-responsive'])[1]//td[7]"));
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
					ar.add(data9);
					ar.add(data10);
					ar.add(data11);
					ar.add(data12);

					ar.add(data13);
					ar.add(data14);
					ar.add(data15);
					ar.add(data16);
					ar.add(data17);
					ar.add(data18);
					ar.add(data19);
					ar.add(data20);
					ar.add(data21);
					ar.add(data22);
					ar.add(data23);
					ar.add(data24);
					ar.add(data25);
					ar.add(data26);
					ar.add(data27);
					ar.add(data28);
					ar.add(data29);
					ar.add(data30);
					ar.add(data31);
					ar.add(data32);
					ar.add(data33);
					ar.add(data34);
					ar.add(data35);
					ar.add(data36);
					ar.add(data37);
					ar.add(data38);
					ar.add(data39);
					ar.add(data40);
					ar.add(data41);
					ar.add(data42);
					ar.add(data43);
					ar.add(data44);
					ar.add(data45);
					ar.add(data46);
					ar.add(data47);
					ar.add(data48);
					ar.add(data49);
					ar.add(data50);
					ar.add(data51);
					ar.add(data52);
					ar.add(data53);
				
					boolean con=list.isEmpty();
				     soft.assertFalse(con);
					
				 for (int i =0;i<=list.size()-1;i++)
				 {
					 
					 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//div[@class='table-responsive'])[1]//td[7]"));

					 WebElement elem = list1.get(i);
					 
					String actualData = elem.getText();
					actualData = actualData.replaceAll("[£]", "");
					actualData = actualData.replaceAll("[,]", "");

					System.out.println(actualData);
					 soft.assertEquals(actualData, ar.get(i));
					
				 }
				 
			} catch (Exception e) {
			    soft.assertFalse(true,"welcome to catch block");

				System.out.println("Issue IN verifyP11EmployeeContributions"+e);
			}
			
			Reporter.log("verifyP11EmployeeContributions");
		}
	 
	 

	 
	 public void verifyP11TotalPayToDate(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11)
		{
			
			try {
				 List<WebElement> list = m_Driver.findElements(By.xpath("(//div[@class='table-responsive'])[3]//td[4]"));
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
					ar.add(data9);
					ar.add(data10);
					ar.add(data11);
				
					boolean con=list.isEmpty();
				     soft.assertFalse(con);
					
				 for (int i =0;i<=list.size()-1;i++)
				 {
					 
					 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//div[@class='table-responsive'])[3]//td[4]"));

					 WebElement elem = list1.get(i);
					 
					String actualData = elem.getText();
					actualData = actualData.replaceAll("[£]", "");
					actualData = actualData.replaceAll("[,]", "");

					System.out.println(actualData);
					 soft.assertEquals(actualData, ar.get(i));
					
				 }
				 
			} catch (Exception e) {
			    soft.assertFalse(true,"welcome to catch block");

				System.out.println("Issue IN verifyP11TotalPayToDate"+e);
			}
			
			Reporter.log("verifyP11TotalPayToDate");
		}
	 
	 
	 
	 public void verifyP11TotalPayToDateWeekly(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,String data12,
				
				String data13, String data14,String data15,String data16,String data17, String data18, String data19, String data20, String data21,String data22,String data23,String data24,String data25,String data26,String data27,
				
				String data28,String data29,String data30, String data31, String data32, String data33, String data34,String data35,String data36,String data37,String data38,String data39,String data40,
				String data41,String data42,String data43, String data44, String data45, String data46, String data47,String data48,String data49,String data50,String data51,String data52  )
		{
			
			try {
				 List<WebElement> list = m_Driver.findElements(By.xpath("(//div[@class='table-responsive'])[3]//td[4]"));
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
					ar.add(data9);
					ar.add(data10);
					ar.add(data11);
					ar.add(data12);

					ar.add(data13);
					ar.add(data14);
					ar.add(data15);
					ar.add(data16);
					ar.add(data17);
					ar.add(data18);
					ar.add(data19);
					ar.add(data20);
					ar.add(data21);
					ar.add(data22);
					ar.add(data23);
					ar.add(data24);
					ar.add(data25);
					ar.add(data26);
					ar.add(data27);
					ar.add(data28);
					ar.add(data29);
					ar.add(data30);
					ar.add(data31);
					ar.add(data32);
					ar.add(data33);
					ar.add(data34);
					ar.add(data35);
					ar.add(data36);
					ar.add(data37);
					ar.add(data38);
					ar.add(data39);
					ar.add(data40);
					ar.add(data41);
					ar.add(data42);
					ar.add(data43);
					ar.add(data44);
					ar.add(data45);
					ar.add(data46);
					ar.add(data47);
					ar.add(data48);
					ar.add(data49);
					ar.add(data50);
					ar.add(data51);
					ar.add(data52);
				
					boolean con=list.isEmpty();
				     soft.assertFalse(con);
					
				 for (int i =0;i<=list.size()-1;i++)
				 {
					 
					 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//div[@class='table-responsive'])[3]//td[4]"));

				    WebElement elem = list1.get(i);
					 
					String actualData = elem.getText();
					actualData = actualData.replaceAll("[£]", "");
					actualData = actualData.replaceAll("[,]", "");

					System.out.println(actualData);
					 soft.assertEquals(actualData, ar.get(i));
					
				 }
				 
			} catch (Exception e) {
			    soft.assertFalse(true,"welcome to catch block");

				System.out.println("Issue IN verifyP11TotalPayToDate"+e);
			}
			
			Reporter.log("verifyP11TotalPayToDate");
		}
	 
	 
	 
	 public void verifyP11Total_FreePayToDate(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11)
		{
			
			try {
				 List<WebElement> list = m_Driver.findElements(By.xpath("(//div[@class='table-responsive'])[3]//td[5]"));
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
					ar.add(data9);
					ar.add(data10);
					ar.add(data11);
				
					boolean con=list.isEmpty();
				     soft.assertFalse(con);
					
				 for (int i =0;i<=list.size()-1;i++)
				 {
					 
					 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//div[@class='table-responsive'])[3]//td[5]"));

					 WebElement elem = list1.get(i);
					 
					String actualData = elem.getText();
					actualData = actualData.replaceAll("[£]", "");
					actualData = actualData.replaceAll("[,]", "");

					System.out.println(actualData);
					 soft.assertEquals(actualData, ar.get(i));
					
				 }
				 
			} catch (Exception e) {
			    soft.assertFalse(true,"welcome to catch block");

				System.out.println("Issue IN verifyP11Total_FreePayToDate"+e);
			}
			
			Reporter.log("verifyP11Total_FreePayToDate");
		}
	 
	 
	 
	 public void verifyP11Total_FreePayToDateWeekly(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,String data12,
				
				String data13, String data14,String data15,String data16,String data17, String data18, String data19, String data20, String data21,String data22,String data23,String data24,String data25,String data26,String data27,
				
				String data28,String data29,String data30, String data31, String data32, String data33, String data34,String data35,String data36,String data37,String data38,String data39,String data40,
				String data41,String data42,String data43, String data44, String data45, String data46, String data47,String data48,String data49,String data50,String data51,String data52,String  data53)
		{
			
			try {
				 List<WebElement> list = m_Driver.findElements(By.xpath("(//div[@class='table-responsive'])[3]//td[5]"));
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
					ar.add(data9);
					ar.add(data10);
					ar.add(data11);
					ar.add(data12);

					ar.add(data13);
					ar.add(data14);
					ar.add(data15);
					ar.add(data16);
					ar.add(data17);
					ar.add(data18);
					ar.add(data19);
					ar.add(data20);
					ar.add(data21);
					ar.add(data22);
					ar.add(data23);
					ar.add(data24);
					ar.add(data25);
					ar.add(data26);
					ar.add(data27);
					ar.add(data28);
					ar.add(data29);
					ar.add(data30);
					ar.add(data31);
					ar.add(data32);
					ar.add(data33);
					ar.add(data34);
					ar.add(data35);
					ar.add(data36);
					ar.add(data37);
					ar.add(data38);
					ar.add(data39);
					ar.add(data40);
					ar.add(data41);
					ar.add(data42);
					ar.add(data43);
					ar.add(data44);
					ar.add(data45);
					ar.add(data46);
					ar.add(data47);
					ar.add(data48);
					ar.add(data49);
					ar.add(data50);
					ar.add(data51);
					ar.add(data52);
					ar.add(data53);
				
					boolean con=list.isEmpty();
				     soft.assertFalse(con);
					
				 for (int i =0;i<=list.size()-1;i++)
				 {
					 
					 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//div[@class='table-responsive'])[3]//td[5]"));

					 WebElement elem = list1.get(i);
					 
					String actualData = elem.getText();
					actualData = actualData.replaceAll("[£]", "");
					actualData = actualData.replaceAll("[,]", "");

					System.out.println(actualData);
					 soft.assertEquals(actualData, ar.get(i));
					
				 }
				 
			} catch (Exception e) {
			    soft.assertFalse(true,"welcome to catch block");

				System.out.println("Issue IN verifyP11Total_FreePayToDate"+e);
			}
			
			Reporter.log("verifyP11Total_FreePayToDate");
		}
	 
	 
	 public void verifyP11TotalTaxablePayToDate(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11)
		{
			
			try {
				 List<WebElement> list = m_Driver.findElements(By.xpath("(//div[@class='table-responsive'])[3]//td[6]"));
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
					ar.add(data9);
					ar.add(data10);
					ar.add(data11);
				
					boolean con=list.isEmpty();
				     soft.assertFalse(con);
					
				 for (int i =0;i<=list.size()-1;i++)
				 {
					 
					 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//div[@class='table-responsive'])[3]//td[6]"));

					 WebElement elem = list1.get(i);
					 
					String actualData = elem.getText();
					actualData = actualData.replaceAll("[£]", "");
					actualData = actualData.replaceAll("[,]", "");

					System.out.println(actualData);
					 soft.assertEquals(actualData, ar.get(i));
					
				 }
				 
			} catch (Exception e) {
			    soft.assertFalse(true,"welcome to catch block");

				System.out.println("Issue IN verifyP11TotalTaxablePayToDate"+e);
			}
			
			Reporter.log("verifyP11TotalTaxablePayToDate");
		}
	 
	 
	 
	 public void verifyP11TotalTaxablePayToDateWeekly(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,String data12,
				
				String data13, String data14,String data15,String data16,String data17, String data18, String data19, String data20, String data21,String data22,String data23,String data24,String data25,String data26,String data27,
				
				String data28,String data29,String data30, String data31, String data32, String data33, String data34,String data35,String data36,String data37,String data38,String data39,String data40,
				String data41,String data42,String data43, String data44, String data45, String data46, String data47,String data48,String data49,String data50,String data51,String data52)
		{
			
			try {
				 List<WebElement> list = m_Driver.findElements(By.xpath("(//div[@class='table-responsive'])[3]//td[6]"));
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
					ar.add(data9);
					ar.add(data10);
					ar.add(data11);
					ar.add(data12);

					ar.add(data13);
					ar.add(data14);
					ar.add(data15);
					ar.add(data16);
					ar.add(data17);
					ar.add(data18);
					ar.add(data19);
					ar.add(data20);
					ar.add(data21);
					ar.add(data22);
					ar.add(data23);
					ar.add(data24);
					ar.add(data25);
					ar.add(data26);
					ar.add(data27);
					ar.add(data28);
					ar.add(data29);
					ar.add(data30);
					ar.add(data31);
					ar.add(data32);
					ar.add(data33);
					ar.add(data34);
					ar.add(data35);
					ar.add(data36);
					ar.add(data37);
					ar.add(data38);
					ar.add(data39);
					ar.add(data40);
					ar.add(data41);
					ar.add(data42);
					ar.add(data43);
					ar.add(data44);
					ar.add(data45);
					ar.add(data46);
					ar.add(data47);
					ar.add(data48);
					ar.add(data49);
					ar.add(data50);
					ar.add(data51);
					ar.add(data52);
				
				
					boolean con=list.isEmpty();
				     soft.assertFalse(con);
					
				 for (int i =0;i<=list.size()-1;i++)
				 {
					 
					 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//div[@class='table-responsive'])[3]//td[6]"));

					 WebElement elem = list1.get(i);
					 
					String actualData = elem.getText();
					actualData = actualData.replaceAll("[£]", "");
					actualData = actualData.replaceAll("[,]", "");

					System.out.println(actualData);
					 soft.assertEquals(actualData, ar.get(i));
					
				 }
				 
			} catch (Exception e) {
			    soft.assertFalse(true,"welcome to catch block");

				System.out.println("Issue IN verifyP11TotalTaxablePayToDate"+e);
			}
			
			Reporter.log("verifyP11TotalTaxablePayToDate");
		}
	 
	 
	 
	 
	 public void verifyP11TotalTaxDueTodate(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,String exptotalPay,String expTaxDeducted )
		{
			
			try {
				 List<WebElement> list = m_Driver.findElements(By.xpath("(//div[@class='table-responsive'])[3]//td[7]"));
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
					ar.add(data9);
					ar.add(data10);
					ar.add(data11);
				
					boolean con=list.isEmpty();
				     soft.assertFalse(con);
					
				 for (int i =0;i<=list.size()-1;i++)
				 {
					 
					 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//div[@class='table-responsive'])[3]//td[7]"));

					 WebElement elem = list1.get(i);
					 
					String actualData = elem.getText();
					actualData = actualData.replaceAll("[£]", "");
					actualData = actualData.replaceAll("[,]", "");

					System.out.println(actualData);
					 soft.assertEquals(actualData, ar.get(i));
					
				 }
				 
			} catch (Exception e) {
			    soft.assertFalse(true,"welcome to catch block");

				System.out.println("Issue IN verifyP11TotalTaxDueTodate"+e);
			}
			
			
			
			
			String acttotalPay = m_Driver.findElement(By.xpath("(//*[contains(text(),'Total for year')])[1]/following-sibling::td[1]")).getText().replaceAll("[£]", "");
			acttotalPay= acttotalPay.replaceAll("[,]", "");
			soft.assertEquals( acttotalPay, exptotalPay);
			
			Reporter.log("Verified Total Pay.");
			
			
			String ActTaxDeducted = m_Driver.findElement(By.xpath("(//*[contains(text(),'Total for year')])[1]/following-sibling::td[2]")).getText().replaceAll("[£]", "");
			ActTaxDeducted= ActTaxDeducted.replaceAll("[,]", "");
			
			soft.assertEquals( ActTaxDeducted, expTaxDeducted);
			
			Reporter.log("Verified Tax Deducted.");
			
			
			
			
			Reporter.log("verifyP11TotalTaxDueTodate");
		}

	 
	 
	 public void verifyP11TotalTaxDueTodateWeekly(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,String data12,
				
				String data13, String data14,String data15,String data16,String data17, String data18, String data19, String data20, String data21,String data22,String data23,String data24,String data25,String data26,String data27,
				
				String data28,String data29,String data30, String data31, String data32, String data33, String data34,String data35,String data36,String data37,String data38,String data39,String data40,
				String data41,String data42,String data43, String data44, String data45, String data46, String data47,String data48,String data49,String data50,String data51,String data52, String exptotalPay, String  expTaxDeducted)
		{
			
			try {
				 List<WebElement> list = m_Driver.findElements(By.xpath("(//div[@class='table-responsive'])[3]//td[7]"));
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
					ar.add(data9);
					ar.add(data10);
					ar.add(data11);
					ar.add(data12);

					ar.add(data13);
					ar.add(data14);
					ar.add(data15);
					ar.add(data16);
					ar.add(data17);
					ar.add(data18);
					ar.add(data19);
					ar.add(data20);
					ar.add(data21);
					ar.add(data22);
					ar.add(data23);
					ar.add(data24);
					ar.add(data25);
					ar.add(data26);
					ar.add(data27);
					ar.add(data28);
					ar.add(data29);
					ar.add(data30);
					ar.add(data31);
					ar.add(data32);
					ar.add(data33);
					ar.add(data34);
					ar.add(data35);
					ar.add(data36);
					ar.add(data37);
					ar.add(data38);
					ar.add(data39);
					ar.add(data40);
					ar.add(data41);
					ar.add(data42);
					ar.add(data43);
					ar.add(data44);
					ar.add(data45);
					ar.add(data46);
					ar.add(data47);
					ar.add(data48);
					ar.add(data49);
					ar.add(data50);
					ar.add(data51);
					ar.add(data52);
					boolean con=list.isEmpty();
				     soft.assertFalse(con);
					
				 for (int i =0;i<=list.size()-1;i++)
				 {
					 
					 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//div[@class='table-responsive'])[3]//td[7]"));

					 WebElement elem = list1.get(i);
					 
					String actualData = elem.getText();
					actualData = actualData.replaceAll("[£]", "");
					actualData = actualData.replaceAll("[,]", "");

					System.out.println(actualData);
					 soft.assertEquals(actualData, ar.get(i));
					
				 }
				 
			} catch (Exception e) {
			    soft.assertFalse(true,"welcome to catch block");

				System.out.println("Issue IN verifyP11TotalTaxDueTodate"+e);
			}
			
			
			
			
			String acttotalPay = m_Driver.findElement(By.xpath("(//*[contains(text(),'Total for year')])[1]/following-sibling::td[1]")).getText().replaceAll("[£]", "");
			acttotalPay= acttotalPay.replaceAll("[,]", "");
			soft.assertEquals( acttotalPay, exptotalPay);
			
			Reporter.log("Verified Total Pay.");
			
			
			String ActTaxDeducted = m_Driver.findElement(By.xpath("(//*[contains(text(),'Total for year')])[1]/following-sibling::td[2]")).getText().replaceAll("[£]", "");
			ActTaxDeducted= ActTaxDeducted.replaceAll("[,]", "");
			
			soft.assertEquals( ActTaxDeducted, expTaxDeducted);
			
			Reporter.log("Verified Tax Deducted.");
			
			
			
			
			Reporter.log("verifyP11TotalTaxDueTodate");
		}

	 
	 public void verifyXML1(String Taxable,String TotalTax,String expectedTaxablePay,String PayAfterStatDedns, String TaxDeductedOrRefunded,String GrossEarningsForNICsInPd,String GrossEarningsForNICsYTD,String AtLELYTD,String LELtoPTYTD
				,String PTtoUELYTD, String TotalEmpNICInPd, String TotalEmpNICYTD,String EmpeeContribnsInPd,String EmpeeContribnsYTD) throws ParserConfigurationException, SAXException, IOException, InterruptedException {
			
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

			String xmlText=textArea1.getText();

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();

			InputSource src = new InputSource();
			src.setCharacterStream(new StringReader(xmlText));
			Document doc = dBuilder.parse(src);
			
			String actualTaxablePay1 = doc.getElementsByTagName("TaxablePay").item(0).getTextContent();
			System.out.println("TaxablePay1 ="+actualTaxablePay1);
			
			
			String actualTax = doc.getElementsByTagName("TotalTax").item(0).getTextContent();
			System.out.println("TotalTax ="+actualTax);
			
			
			
			String actualPayAfterStatDedns = doc.getElementsByTagName("PayAfterStatDedns").item(0).getTextContent();
			System.out.println("PayAfterStatDedns ="+actualPayAfterStatDedns);
			
			String actualTaxablePay = doc.getElementsByTagName("TaxablePay").item(1).getTextContent();
			System.out.println("TaxablePay ="+actualTaxablePay);
			
			String actualTaxDeductedOrRefunded = doc.getElementsByTagName("TaxDeductedOrRefunded").item(0).getTextContent();
			System.out.println("TaxDeductedOrRefunded ="+actualTaxDeductedOrRefunded);

			String actualGrossEarningsForNICsInPd = doc.getElementsByTagName("GrossEarningsForNICsInPd").item(0).getTextContent();
			System.out.println("GrossEarningsForNICsInPd ="+actualGrossEarningsForNICsInPd);

			String actualGrossEarningsForNICsYTD = doc.getElementsByTagName("GrossEarningsForNICsYTD").item(0).getTextContent();
			System.out.println("GrossEarningsForNICsYTD ="+actualGrossEarningsForNICsYTD);

			String actualAtLELYTD = doc.getElementsByTagName("AtLELYTD").item(0).getTextContent();

			System.out.println("AtLELYTD ="+actualAtLELYTD);
			
			String actualLELtoPTYTD = doc.getElementsByTagName("LELtoPTYTD").item(0).getTextContent();
			System.out.println("LELtoPTYTD ="+actualLELtoPTYTD);

			String actualPTtoUELYTD = doc.getElementsByTagName("PTtoUELYTD").item(0).getTextContent();
			System.out.println("PTtoUELYTD ="+actualPTtoUELYTD);
			
			String actualTotalEmpNICInPd = doc.getElementsByTagName("TotalEmpNICInPd").item(0).getTextContent();
			System.out.println("TotalEmpNICInPd ="+actualTotalEmpNICInPd);
			
			String actualTotalEmpNICYTD = doc.getElementsByTagName("TotalEmpNICYTD").item(0).getTextContent();
			System.out.println("TotalEmpNICYTD ="+actualTotalEmpNICYTD);
			
			String actualEmpeeContribnsInPd = doc.getElementsByTagName("EmpeeContribnsInPd").item(0).getTextContent();
			System.out.println("EmpeeContribnsInPd ="+actualEmpeeContribnsInPd);

			String actualEmpeeContribnsYTD = doc.getElementsByTagName("EmpeeContribnsYTD").item(0).getTextContent();
			System.out.println("EmpeeContribnsYTD ="+EmpeeContribnsYTD);
			
			
			soft.assertEquals(actualTaxablePay1, Taxable);
			
			soft.assertEquals(actualTax, TotalTax);
			
			
			soft.assertEquals(actualTaxablePay, expectedTaxablePay);

			soft.assertEquals(actualPayAfterStatDedns, PayAfterStatDedns);
			
			soft.assertEquals(actualTaxDeductedOrRefunded, TaxDeductedOrRefunded);
		     
		    soft.assertEquals(actualGrossEarningsForNICsYTD, GrossEarningsForNICsYTD);

		    soft.assertEquals(actualGrossEarningsForNICsInPd, GrossEarningsForNICsInPd);

		    soft.assertEquals(actualAtLELYTD, AtLELYTD);

		    soft.assertEquals(actualLELtoPTYTD, LELtoPTYTD);

		    soft.assertEquals(actualPTtoUELYTD, PTtoUELYTD);

		    soft.assertEquals(actualTotalEmpNICInPd, TotalEmpNICInPd);

		    soft.assertEquals(actualTotalEmpNICYTD, TotalEmpNICYTD);

		    soft.assertEquals(actualEmpeeContribnsInPd, EmpeeContribnsInPd);

		    soft.assertEquals(actualEmpeeContribnsYTD, EmpeeContribnsYTD);

		   

			
			
			m_Driver.switchTo().defaultContent();
			
			
			jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//button[@type='button']")));
			Thread.sleep(5000);
				


			

			Reporter.log("verify XML");	
		} 
	 
	 
	 public void verifyXML3(String Taxable,String TotalTax,String expectedTaxablePay,String PayAfterStatDedns, String TaxDeductedOrRefunded,String GrossEarningsForNICsInPd,String GrossEarningsForNICsYTD,String AtLELYTD,String LELtoPTYTD
				,String PTtoUELYTD, String TotalEmpNICInPd, String TotalEmpNICYTD,String EmpeeContribnsInPd,String EmpeeContribnsYTD,String nontax) throws ParserConfigurationException, SAXException, IOException, InterruptedException {
			
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

			String xmlText=textArea1.getText();

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();

			InputSource src = new InputSource();
			src.setCharacterStream(new StringReader(xmlText));
			Document doc = dBuilder.parse(src);
			
			String actualTaxablePay1 = doc.getElementsByTagName("TaxablePay").item(0).getTextContent();
			System.out.println("TaxablePay1 ="+actualTaxablePay1);
			
			
			String actualTax = doc.getElementsByTagName("TotalTax").item(0).getTextContent();
			System.out.println("TotalTax ="+actualTax);
			
			
			
			String actualPayAfterStatDedns = doc.getElementsByTagName("PayAfterStatDedns").item(0).getTextContent();
			System.out.println("PayAfterStatDedns ="+actualPayAfterStatDedns);
			
			String actualTaxablePay = doc.getElementsByTagName("TaxablePay").item(1).getTextContent();
			System.out.println("TaxablePay ="+actualTaxablePay);
			
			String actualTaxDeductedOrRefunded = doc.getElementsByTagName("TaxDeductedOrRefunded").item(0).getTextContent();
			System.out.println("TaxDeductedOrRefunded ="+actualTaxDeductedOrRefunded);

			String actualGrossEarningsForNICsInPd = doc.getElementsByTagName("GrossEarningsForNICsInPd").item(0).getTextContent();
			System.out.println("GrossEarningsForNICsInPd ="+actualGrossEarningsForNICsInPd);

			String actualGrossEarningsForNICsYTD = doc.getElementsByTagName("GrossEarningsForNICsYTD").item(0).getTextContent();
			System.out.println("GrossEarningsForNICsYTD ="+actualGrossEarningsForNICsYTD);

			String actualAtLELYTD = doc.getElementsByTagName("AtLELYTD").item(0).getTextContent();

			System.out.println("AtLELYTD ="+actualAtLELYTD);
			
			String actualLELtoPTYTD = doc.getElementsByTagName("LELtoPTYTD").item(0).getTextContent();
			System.out.println("LELtoPTYTD ="+actualLELtoPTYTD);

			String actualPTtoUELYTD = doc.getElementsByTagName("PTtoUELYTD").item(0).getTextContent();
			System.out.println("PTtoUELYTD ="+actualPTtoUELYTD);
			
			String actualTotalEmpNICInPd = doc.getElementsByTagName("TotalEmpNICInPd").item(0).getTextContent();
			System.out.println("TotalEmpNICInPd ="+actualTotalEmpNICInPd);
			
			String actualTotalEmpNICYTD = doc.getElementsByTagName("TotalEmpNICYTD").item(0).getTextContent();
			System.out.println("TotalEmpNICYTD ="+actualTotalEmpNICYTD);
			
			String actualEmpeeContribnsInPd = doc.getElementsByTagName("EmpeeContribnsInPd").item(0).getTextContent();
			System.out.println("EmpeeContribnsInPd ="+actualEmpeeContribnsInPd);

			String actualEmpeeContribnsYTD = doc.getElementsByTagName("EmpeeContribnsYTD").item(0).getTextContent();
			System.out.println("EmpeeContribnsYTD ="+EmpeeContribnsYTD);
			
			
			String NonTaxOrNICPmt = doc.getElementsByTagName("NonTaxOrNICPmt").item(0).getTextContent();
			System.out.println("NonTaxOrNICPmt ="+NonTaxOrNICPmt);
			
			soft.assertEquals(actualTaxablePay1, Taxable);
			
			soft.assertEquals(actualTax, TotalTax);
			
			
			soft.assertEquals(actualTaxablePay, expectedTaxablePay);

			soft.assertEquals(actualPayAfterStatDedns, PayAfterStatDedns);
			
			soft.assertEquals(actualTaxDeductedOrRefunded, TaxDeductedOrRefunded);
		     
		    soft.assertEquals(actualGrossEarningsForNICsYTD, GrossEarningsForNICsYTD);

		    soft.assertEquals(actualGrossEarningsForNICsInPd, GrossEarningsForNICsInPd);

		    soft.assertEquals(actualAtLELYTD, AtLELYTD);

		    soft.assertEquals(actualLELtoPTYTD, LELtoPTYTD);

		    soft.assertEquals(actualPTtoUELYTD, PTtoUELYTD);

		    soft.assertEquals(actualTotalEmpNICInPd, TotalEmpNICInPd);

		    soft.assertEquals(actualTotalEmpNICYTD, TotalEmpNICYTD);

		    soft.assertEquals(actualEmpeeContribnsInPd, EmpeeContribnsInPd);

		    soft.assertEquals(actualEmpeeContribnsYTD, EmpeeContribnsYTD);

		   

		    soft.assertEquals(NonTaxOrNICPmt, nontax);

			
			
			m_Driver.switchTo().defaultContent();
			
			
			jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//button[@type='button']")));
			Thread.sleep(2000);
				
//			jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeading_ddlPayrollFrequency']")));
			

			Reporter.log("verify XML");	
		} 
	 
	 
	 
	 
	 public void verifyXML4(String Taxable,String TotalTax,String expectedTaxablePay,String PayAfterStatDedns, String TaxDeductedOrRefunded,String GrossEarningsForNICsInPd,String GrossEarningsForNICsYTD,String AtLELYTD,String LELtoPTYTD
				,String PTtoUELYTD, String TotalEmpNICInPd, String TotalEmpNICYTD,String EmpeeContribnsInPd,String EmpeeContribnsYTD) throws ParserConfigurationException, SAXException, IOException, InterruptedException {
			
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

			String xmlText=textArea1.getText();

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();

			InputSource src = new InputSource();
			src.setCharacterStream(new StringReader(xmlText));
			Document doc = dBuilder.parse(src);
			
			String actualTaxablePay1 = doc.getElementsByTagName("TaxablePay").item(0).getTextContent();
			System.out.println("TaxablePay1 ="+actualTaxablePay1);
			
			
			String actualTax = doc.getElementsByTagName("TotalTax").item(0).getTextContent();
			System.out.println("TotalTax ="+actualTax);
			
			
			
			String actualPayAfterStatDedns = doc.getElementsByTagName("PayAfterStatDedns").item(0).getTextContent();
			System.out.println("PayAfterStatDedns ="+actualPayAfterStatDedns);
			
			String actualTaxablePay = doc.getElementsByTagName("TaxablePay").item(1).getTextContent();
			System.out.println("TaxablePay ="+actualTaxablePay);
			
			String actualTaxDeductedOrRefunded = doc.getElementsByTagName("TaxDeductedOrRefunded").item(0).getTextContent();
			System.out.println("TaxDeductedOrRefunded ="+actualTaxDeductedOrRefunded);

			String actualGrossEarningsForNICsInPd = doc.getElementsByTagName("GrossEarningsForNICsInPd").item(0).getTextContent();
			System.out.println("GrossEarningsForNICsInPd ="+actualGrossEarningsForNICsInPd);

			String actualGrossEarningsForNICsYTD = doc.getElementsByTagName("GrossEarningsForNICsYTD").item(0).getTextContent();
			System.out.println("GrossEarningsForNICsYTD ="+actualGrossEarningsForNICsYTD);

			String actualAtLELYTD = doc.getElementsByTagName("AtLELYTD").item(0).getTextContent();

			System.out.println("AtLELYTD ="+actualAtLELYTD);
			
			String actualLELtoPTYTD = doc.getElementsByTagName("LELtoPTYTD").item(0).getTextContent();
			System.out.println("LELtoPTYTD ="+actualLELtoPTYTD);

			String actualPTtoUELYTD = doc.getElementsByTagName("PTtoUELYTD").item(0).getTextContent();
			System.out.println("PTtoUELYTD ="+actualPTtoUELYTD);
			
			String actualTotalEmpNICInPd = doc.getElementsByTagName("TotalEmpNICInPd").item(0).getTextContent();
			System.out.println("TotalEmpNICInPd ="+actualTotalEmpNICInPd);
			
			String actualTotalEmpNICYTD = doc.getElementsByTagName("TotalEmpNICYTD").item(0).getTextContent();
			System.out.println("TotalEmpNICYTD ="+actualTotalEmpNICYTD);
			
			String actualEmpeeContribnsInPd = doc.getElementsByTagName("EmpeeContribnsInPd").item(0).getTextContent();
			System.out.println("EmpeeContribnsInPd ="+actualEmpeeContribnsInPd);

			String actualEmpeeContribnsYTD = doc.getElementsByTagName("EmpeeContribnsYTD").item(0).getTextContent();
			System.out.println("EmpeeContribnsYTD ="+EmpeeContribnsYTD);
			
			
//			String NonTaxOrNICPmt = doc.getElementsByTagName("NonTaxOrNICPmt").item(0).getTextContent();
//			System.out.println("NonTaxOrNICPmt ="+NonTaxOrNICPmt);
//			
			soft.assertEquals(actualTaxablePay1, Taxable);
			
			soft.assertEquals(actualTax, TotalTax);
			
			
			soft.assertEquals(actualTaxablePay, expectedTaxablePay);

			soft.assertEquals(actualPayAfterStatDedns, PayAfterStatDedns);
			
			soft.assertEquals(actualTaxDeductedOrRefunded, TaxDeductedOrRefunded);
		     
		    soft.assertEquals(actualGrossEarningsForNICsYTD, GrossEarningsForNICsYTD);

		    soft.assertEquals(actualGrossEarningsForNICsInPd, GrossEarningsForNICsInPd);

		    soft.assertEquals(actualAtLELYTD, AtLELYTD);

		    soft.assertEquals(actualLELtoPTYTD, LELtoPTYTD);

		    soft.assertEquals(actualPTtoUELYTD, PTtoUELYTD);

		    soft.assertEquals(actualTotalEmpNICInPd, TotalEmpNICInPd);

		    soft.assertEquals(actualTotalEmpNICYTD, TotalEmpNICYTD);

		    soft.assertEquals(actualEmpeeContribnsInPd, EmpeeContribnsInPd);

		    soft.assertEquals(actualEmpeeContribnsYTD, EmpeeContribnsYTD);

		   

		  //  soft.assertEquals(NonTaxOrNICPmt, nontax);

			
			
			m_Driver.switchTo().defaultContent();
			
			
			jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//button[@type='button']")));
			Thread.sleep(2000);
				
//			jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeading_ddlPayrollFrequency']")));
			

			Reporter.log("verify XML");	
		} 
	 
	
	 public void verifyTaxRegime(String Taxable,String TotalTax,String expectedTaxablePay,String PayAfterStatDedns, String TaxDeductedOrRefunded,String GrossEarningsForNICsInPd,String GrossEarningsForNICsYTD,String AtLELYTD,String LELtoPTYTD
				,String PTtoUELYTD, String TotalEmpNICInPd, String TotalEmpNICYTD,String EmpeeContribnsInPd,String EmpeeContribnsYTD,String expectedTaxCode) throws ParserConfigurationException, SAXException, IOException, InterruptedException {
			
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

			String xmlText=textArea1.getText();

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();

			InputSource src = new InputSource();
			src.setCharacterStream(new StringReader(xmlText));
			Document doc = dBuilder.parse(src);
			
			String actualTaxablePay1 = doc.getElementsByTagName("TaxablePay").item(0).getTextContent();
			System.out.println("TaxablePay1 ="+actualTaxablePay1);
			
			
			String actualTax = doc.getElementsByTagName("TotalTax").item(0).getTextContent();
			System.out.println("TotalTax ="+actualTax);
			
			
			
			String actualPayAfterStatDedns = doc.getElementsByTagName("PayAfterStatDedns").item(0).getTextContent();
			System.out.println("PayAfterStatDedns ="+actualPayAfterStatDedns);
			
			String actualTaxablePay = doc.getElementsByTagName("TaxablePay").item(1).getTextContent();
			System.out.println("TaxablePay ="+actualTaxablePay);
			
			String actualTaxDeductedOrRefunded = doc.getElementsByTagName("TaxDeductedOrRefunded").item(0).getTextContent();
			System.out.println("TaxDeductedOrRefunded ="+actualTaxDeductedOrRefunded);

			String actualGrossEarningsForNICsInPd = doc.getElementsByTagName("GrossEarningsForNICsInPd").item(0).getTextContent();
			System.out.println("GrossEarningsForNICsInPd ="+actualGrossEarningsForNICsInPd);

			String actualGrossEarningsForNICsYTD = doc.getElementsByTagName("GrossEarningsForNICsYTD").item(0).getTextContent();
			System.out.println("GrossEarningsForNICsYTD ="+actualGrossEarningsForNICsYTD);

			String actualAtLELYTD = doc.getElementsByTagName("AtLELYTD").item(0).getTextContent();

			System.out.println("AtLELYTD ="+actualAtLELYTD);
			
			String actualLELtoPTYTD = doc.getElementsByTagName("LELtoPTYTD").item(0).getTextContent();
			System.out.println("LELtoPTYTD ="+actualLELtoPTYTD);

			String actualPTtoUELYTD = doc.getElementsByTagName("PTtoUELYTD").item(0).getTextContent();
			System.out.println("PTtoUELYTD ="+actualPTtoUELYTD);
			
			String actualTotalEmpNICInPd = doc.getElementsByTagName("TotalEmpNICInPd").item(0).getTextContent();
			System.out.println("TotalEmpNICInPd ="+actualTotalEmpNICInPd);
			
			String actualTotalEmpNICYTD = doc.getElementsByTagName("TotalEmpNICYTD").item(0).getTextContent();
			System.out.println("TotalEmpNICYTD ="+actualTotalEmpNICYTD);
			
			String actualEmpeeContribnsInPd = doc.getElementsByTagName("EmpeeContribnsInPd").item(0).getTextContent();
			System.out.println("EmpeeContribnsInPd ="+actualEmpeeContribnsInPd);

			String actualEmpeeContribnsYTD = doc.getElementsByTagName("EmpeeContribnsYTD").item(0).getTextContent();
			System.out.println("EmpeeContribnsYTD ="+EmpeeContribnsYTD);
			
			
			String TaxCode = doc.getElementsByTagName("TaxCode").item(0).getTextContent();
			System.out.println("TaxCode TaxRegime ="+TaxCode);
			
			soft.assertEquals(actualTaxablePay1, Taxable);
			
			soft.assertEquals(actualTax, TotalTax);
			
			
			soft.assertEquals(actualTaxablePay, expectedTaxablePay);

			soft.assertEquals(actualPayAfterStatDedns, PayAfterStatDedns);
			
			soft.assertEquals(actualTaxDeductedOrRefunded, TaxDeductedOrRefunded);
		     
		    soft.assertEquals(actualGrossEarningsForNICsYTD, GrossEarningsForNICsYTD);

		    soft.assertEquals(actualGrossEarningsForNICsInPd, GrossEarningsForNICsInPd);

		    soft.assertEquals(actualAtLELYTD, AtLELYTD);

		    soft.assertEquals(actualLELtoPTYTD, LELtoPTYTD);

		    soft.assertEquals(actualPTtoUELYTD, PTtoUELYTD);

		    soft.assertEquals(actualTotalEmpNICInPd, TotalEmpNICInPd);

		    soft.assertEquals(actualTotalEmpNICYTD, TotalEmpNICYTD);

		    soft.assertEquals(actualEmpeeContribnsInPd, EmpeeContribnsInPd);

		    soft.assertEquals(actualEmpeeContribnsYTD, EmpeeContribnsYTD);

		   

		    soft.assertEquals(TaxCode, expectedTaxCode);

			
			
			m_Driver.switchTo().defaultContent();
			
			
			jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//button[@type='button']")));
			Thread.sleep(2000);
				
//			jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeading_ddlPayrollFrequency']")));
			

			Reporter.log("verify XML");	
		} 
	 
	 
	 

	 public void verifyWorkHours(String Taxable,String TotalTax,String expectedTaxablePay,String PayAfterStatDedns, String TaxDeductedOrRefunded,String GrossEarningsForNICsInPd,String GrossEarningsForNICsYTD,String AtLELYTD,String LELtoPTYTD
				,String PTtoUELYTD, String TotalEmpNICInPd, String TotalEmpNICYTD,String EmpeeContribnsInPd,String EmpeeContribnsYTD,String expectedHoursWorked) throws ParserConfigurationException, SAXException, IOException, InterruptedException {
			
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

			String xmlText=textArea1.getText();

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();

			InputSource src = new InputSource();
			src.setCharacterStream(new StringReader(xmlText));
			Document doc = dBuilder.parse(src);
			
			String actualTaxablePay1 = doc.getElementsByTagName("TaxablePay").item(0).getTextContent();
			System.out.println("TaxablePay1 ="+actualTaxablePay1);
			
			
			String actualTax = doc.getElementsByTagName("TotalTax").item(0).getTextContent();
			System.out.println("TotalTax ="+actualTax);
			
			
			
			String actualPayAfterStatDedns = doc.getElementsByTagName("PayAfterStatDedns").item(0).getTextContent();
			System.out.println("PayAfterStatDedns ="+actualPayAfterStatDedns);
			
			String actualTaxablePay = doc.getElementsByTagName("TaxablePay").item(1).getTextContent();
			System.out.println("TaxablePay ="+actualTaxablePay);
			
			String actualTaxDeductedOrRefunded = doc.getElementsByTagName("TaxDeductedOrRefunded").item(0).getTextContent();
			System.out.println("TaxDeductedOrRefunded ="+actualTaxDeductedOrRefunded);

			String actualGrossEarningsForNICsInPd = doc.getElementsByTagName("GrossEarningsForNICsInPd").item(0).getTextContent();
			System.out.println("GrossEarningsForNICsInPd ="+actualGrossEarningsForNICsInPd);

			String actualGrossEarningsForNICsYTD = doc.getElementsByTagName("GrossEarningsForNICsYTD").item(0).getTextContent();
			System.out.println("GrossEarningsForNICsYTD ="+actualGrossEarningsForNICsYTD);

			String actualAtLELYTD = doc.getElementsByTagName("AtLELYTD").item(0).getTextContent();

			System.out.println("AtLELYTD ="+actualAtLELYTD);
			
			String actualLELtoPTYTD = doc.getElementsByTagName("LELtoPTYTD").item(0).getTextContent();
			System.out.println("LELtoPTYTD ="+actualLELtoPTYTD);

			String actualPTtoUELYTD = doc.getElementsByTagName("PTtoUELYTD").item(0).getTextContent();
			System.out.println("PTtoUELYTD ="+actualPTtoUELYTD);
			
			String actualTotalEmpNICInPd = doc.getElementsByTagName("TotalEmpNICInPd").item(0).getTextContent();
			System.out.println("TotalEmpNICInPd ="+actualTotalEmpNICInPd);
			
			String actualTotalEmpNICYTD = doc.getElementsByTagName("TotalEmpNICYTD").item(0).getTextContent();
			System.out.println("TotalEmpNICYTD ="+actualTotalEmpNICYTD);
			
			String actualEmpeeContribnsInPd = doc.getElementsByTagName("EmpeeContribnsInPd").item(0).getTextContent();
			System.out.println("EmpeeContribnsInPd ="+actualEmpeeContribnsInPd);

			String actualEmpeeContribnsYTD = doc.getElementsByTagName("EmpeeContribnsYTD").item(0).getTextContent();
			System.out.println("EmpeeContribnsYTD ="+EmpeeContribnsYTD);
			
			
			String HoursWorked = doc.getElementsByTagName("HoursWorked").item(0).getTextContent();
			System.out.println(" HoursWorked ="+HoursWorked);
			
			soft.assertEquals(actualTaxablePay1, Taxable);
			
			soft.assertEquals(actualTax, TotalTax);
			
			
			soft.assertEquals(actualTaxablePay, expectedTaxablePay);

			soft.assertEquals(actualPayAfterStatDedns, PayAfterStatDedns);
			
			soft.assertEquals(actualTaxDeductedOrRefunded, TaxDeductedOrRefunded);
		     
		    soft.assertEquals(actualGrossEarningsForNICsYTD, GrossEarningsForNICsYTD);

		    soft.assertEquals(actualGrossEarningsForNICsInPd, GrossEarningsForNICsInPd);

		    soft.assertEquals(actualAtLELYTD, AtLELYTD);

		    soft.assertEquals(actualLELtoPTYTD, LELtoPTYTD);

		    soft.assertEquals(actualPTtoUELYTD, PTtoUELYTD);

		    soft.assertEquals(actualTotalEmpNICInPd, TotalEmpNICInPd);

		    soft.assertEquals(actualTotalEmpNICYTD, TotalEmpNICYTD);

		    soft.assertEquals(actualEmpeeContribnsInPd, EmpeeContribnsInPd);

		    soft.assertEquals(actualEmpeeContribnsYTD, EmpeeContribnsYTD);

		   

		    soft.assertEquals(HoursWorked, expectedHoursWorked);

			
			
			m_Driver.switchTo().defaultContent();
			
			
			jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//button[@type='button']")));
			Thread.sleep(2000);
				
//			jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeading_ddlPayrollFrequency']")));
			

			Reporter.log("verify XML");	
		}
	 
	 
	 public void verifyXML4(String Taxable,String TotalTax,String expectedTaxablePay,String PayAfterStatDedns, String TaxDeductedOrRefunded,String GrossEarningsForNICsInPd,String GrossEarningsForNICsYTD,String AtLELYTD,String LELtoPTYTD
				,String PTtoUELYTD, String TotalEmpNICInPd, String TotalEmpNICYTD,String EmpeeContribnsInPd,String EmpeeContribnsYTD,String nontax,String DednsFromNetPay) throws ParserConfigurationException, SAXException, IOException, InterruptedException {
			
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

			String xmlText=textArea1.getText();

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();

			InputSource src = new InputSource();
			src.setCharacterStream(new StringReader(xmlText));
			Document doc = dBuilder.parse(src);
			
			String actualTaxablePay1 = doc.getElementsByTagName("TaxablePay").item(0).getTextContent();
			System.out.println("TaxablePay1 ="+actualTaxablePay1);
			
			
			String actualTax = doc.getElementsByTagName("TotalTax").item(0).getTextContent();
			System.out.println("TotalTax ="+actualTax);
			
			
			
			String actualPayAfterStatDedns = doc.getElementsByTagName("PayAfterStatDedns").item(0).getTextContent();
			System.out.println("PayAfterStatDedns ="+actualPayAfterStatDedns);
			
			String actualTaxablePay = doc.getElementsByTagName("TaxablePay").item(1).getTextContent();
			System.out.println("TaxablePay ="+actualTaxablePay);
			
			String actualTaxDeductedOrRefunded = doc.getElementsByTagName("TaxDeductedOrRefunded").item(0).getTextContent();
			System.out.println("TaxDeductedOrRefunded ="+actualTaxDeductedOrRefunded);

			String actualGrossEarningsForNICsInPd = doc.getElementsByTagName("GrossEarningsForNICsInPd").item(0).getTextContent();
			System.out.println("GrossEarningsForNICsInPd ="+actualGrossEarningsForNICsInPd);

			String actualGrossEarningsForNICsYTD = doc.getElementsByTagName("GrossEarningsForNICsYTD").item(0).getTextContent();
			System.out.println("GrossEarningsForNICsYTD ="+actualGrossEarningsForNICsYTD);

			String actualAtLELYTD = doc.getElementsByTagName("AtLELYTD").item(0).getTextContent();

			System.out.println("AtLELYTD ="+actualAtLELYTD);
			
			String actualLELtoPTYTD = doc.getElementsByTagName("LELtoPTYTD").item(0).getTextContent();
			System.out.println("LELtoPTYTD ="+actualLELtoPTYTD);

			String actualPTtoUELYTD = doc.getElementsByTagName("PTtoUELYTD").item(0).getTextContent();
			System.out.println("PTtoUELYTD ="+actualPTtoUELYTD);
			
			String actualTotalEmpNICInPd = doc.getElementsByTagName("TotalEmpNICInPd").item(0).getTextContent();
			System.out.println("TotalEmpNICInPd ="+actualTotalEmpNICInPd);
			
			String actualTotalEmpNICYTD = doc.getElementsByTagName("TotalEmpNICYTD").item(0).getTextContent();
			System.out.println("TotalEmpNICYTD ="+actualTotalEmpNICYTD);
			
			String actualEmpeeContribnsInPd = doc.getElementsByTagName("EmpeeContribnsInPd").item(0).getTextContent();
			System.out.println("EmpeeContribnsInPd ="+actualEmpeeContribnsInPd);

			String actualEmpeeContribnsYTD = doc.getElementsByTagName("EmpeeContribnsYTD").item(0).getTextContent();
			System.out.println("EmpeeContribnsYTD ="+actualEmpeeContribnsYTD);
			
			
			String NonTaxOrNICPmt = doc.getElementsByTagName("NonTaxOrNICPmt").item(0).getTextContent();
			System.out.println("NonTaxOrNICPmt ="+NonTaxOrNICPmt);
			
			
			String actualDednsFromNetPay = doc.getElementsByTagName("DednsFromNetPay").item(0).getTextContent();
			System.out.println("DednsFromNetPay ="+actualDednsFromNetPay);
			
			soft.assertEquals(actualTaxablePay1, Taxable);
			
			soft.assertEquals(actualTax, TotalTax);
			
			
			soft.assertEquals(actualTaxablePay, expectedTaxablePay);

			soft.assertEquals(actualPayAfterStatDedns, PayAfterStatDedns);
			
			soft.assertEquals(actualTaxDeductedOrRefunded, TaxDeductedOrRefunded);
		     
		    soft.assertEquals(actualGrossEarningsForNICsYTD, GrossEarningsForNICsYTD);

		    soft.assertEquals(actualGrossEarningsForNICsInPd, GrossEarningsForNICsInPd);

		    soft.assertEquals(actualAtLELYTD, AtLELYTD);

		    soft.assertEquals(actualLELtoPTYTD, LELtoPTYTD);

		    soft.assertEquals(actualPTtoUELYTD, PTtoUELYTD);

		    soft.assertEquals(actualTotalEmpNICInPd, TotalEmpNICInPd);

		    soft.assertEquals(actualTotalEmpNICYTD, TotalEmpNICYTD);

		    soft.assertEquals(actualEmpeeContribnsInPd, EmpeeContribnsInPd);

		    soft.assertEquals(actualEmpeeContribnsYTD, EmpeeContribnsYTD);

		   

		    soft.assertEquals(NonTaxOrNICPmt, nontax);

		    soft.assertEquals(actualDednsFromNetPay, DednsFromNetPay);

			
			
			m_Driver.switchTo().defaultContent();
			
			
			jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//button[@type='button']")));
			Thread.sleep(2000);
				
//			jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeading_ddlPayrollFrequency']")));
			

			Reporter.log("verify XML");	
		} 
	 
	 
	 public void verify1StEmployeeXml(String Taxable,String TotalTax,String expectedTaxablePay,String PayAfterStatDedns, String TaxDeductedOrRefunded,String GrossEarningsForNICsInPd,String GrossEarningsForNICsYTD,String AtLELYTD,String LELtoPTYTD
				,String PTtoUELYTD, String TotalEmpNICInPd, String TotalEmpNICYTD,String EmpeeContribnsInPd,String EmpeeContribnsYTD) throws ParserConfigurationException, SAXException, IOException, InterruptedException {
			
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

			String xmlText=textArea1.getText();

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();

			InputSource src = new InputSource();
			src.setCharacterStream(new StringReader(xmlText));
			Document doc = dBuilder.parse(src);
			
			String actualTaxablePay1 = doc.getElementsByTagName("TaxablePay").item(0).getTextContent();
			System.out.println("TaxablePay1 ="+actualTaxablePay1);
			
			
			String actualTax = doc.getElementsByTagName("TotalTax").item(0).getTextContent();
			System.out.println("TotalTax ="+actualTax);
			
			
			
			String actualPayAfterStatDedns = doc.getElementsByTagName("PayAfterStatDedns").item(0).getTextContent();
			System.out.println("PayAfterStatDedns ="+actualPayAfterStatDedns);
			
			String actualTaxablePay = doc.getElementsByTagName("TaxablePay").item(1).getTextContent();
			System.out.println("TaxablePay ="+actualTaxablePay);
			
			String actualTaxDeductedOrRefunded = doc.getElementsByTagName("TaxDeductedOrRefunded").item(0).getTextContent();
			System.out.println("TaxDeductedOrRefunded ="+actualTaxDeductedOrRefunded);

			String actualGrossEarningsForNICsInPd = doc.getElementsByTagName("GrossEarningsForNICsInPd").item(0).getTextContent();
			System.out.println("GrossEarningsForNICsInPd ="+actualGrossEarningsForNICsInPd);

			String actualGrossEarningsForNICsYTD = doc.getElementsByTagName("GrossEarningsForNICsYTD").item(0).getTextContent();
			System.out.println("GrossEarningsForNICsYTD ="+actualGrossEarningsForNICsYTD);

			String actualAtLELYTD = doc.getElementsByTagName("AtLELYTD").item(0).getTextContent();

			System.out.println("AtLELYTD ="+actualAtLELYTD);
			
			String actualLELtoPTYTD = doc.getElementsByTagName("LELtoPTYTD").item(0).getTextContent();
			System.out.println("LELtoPTYTD ="+actualLELtoPTYTD);

			String actualPTtoUELYTD = doc.getElementsByTagName("PTtoUELYTD").item(0).getTextContent();
			System.out.println("PTtoUELYTD ="+actualPTtoUELYTD);
			
			String actualTotalEmpNICInPd = doc.getElementsByTagName("TotalEmpNICInPd").item(0).getTextContent();
			System.out.println("TotalEmpNICInPd ="+actualTotalEmpNICInPd);
			
			String actualTotalEmpNICYTD = doc.getElementsByTagName("TotalEmpNICYTD").item(0).getTextContent();
			System.out.println("TotalEmpNICYTD ="+actualTotalEmpNICYTD);
			
			String actualEmpeeContribnsInPd = doc.getElementsByTagName("EmpeeContribnsInPd").item(0).getTextContent();
			System.out.println("EmpeeContribnsInPd ="+actualEmpeeContribnsInPd);

			String actualEmpeeContribnsYTD = doc.getElementsByTagName("EmpeeContribnsYTD").item(0).getTextContent();
			System.out.println("EmpeeContribnsYTD ="+actualEmpeeContribnsYTD);
			
			

			
			
//			String NonTaxOrNICPmt = doc.getElementsByTagName("NonTaxOrNICPmt").item(0).getTextContent();
//			System.out.println("NonTaxOrNICPmt ="+NonTaxOrNICPmt);
//			
//			
//			String actualDednsFromNetPay = doc.getElementsByTagName("DednsFromNetPay").item(0).getTextContent();
//			System.out.println("DednsFromNetPay ="+actualDednsFromNetPay);
//			
			soft.assertEquals(actualTaxablePay1, Taxable);
			
			soft.assertEquals(actualTax, TotalTax);
			
			
			soft.assertEquals(actualTaxablePay, expectedTaxablePay);

			soft.assertEquals(actualPayAfterStatDedns, PayAfterStatDedns);
			
			soft.assertEquals(actualTaxDeductedOrRefunded, TaxDeductedOrRefunded);
		     
		    soft.assertEquals(actualGrossEarningsForNICsYTD, GrossEarningsForNICsYTD);

		    soft.assertEquals(actualGrossEarningsForNICsInPd, GrossEarningsForNICsInPd);

		    soft.assertEquals(actualAtLELYTD, AtLELYTD);

		    soft.assertEquals(actualLELtoPTYTD, LELtoPTYTD);

		    soft.assertEquals(actualPTtoUELYTD, PTtoUELYTD);

		    soft.assertEquals(actualTotalEmpNICInPd, TotalEmpNICInPd);

		    soft.assertEquals(actualTotalEmpNICYTD, TotalEmpNICYTD);

		    soft.assertEquals(actualEmpeeContribnsInPd, EmpeeContribnsInPd);

		    soft.assertEquals(actualEmpeeContribnsYTD, EmpeeContribnsYTD);

		   

//		    soft.assertEquals(NonTaxOrNICPmt, nontax);
//
//		    soft.assertEquals(actualDednsFromNetPay, DednsFromNetPay);

			
			
			m_Driver.switchTo().defaultContent();
			
			
			jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//button[@type='button']")));
			Thread.sleep(3000);
				
//			jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeading_ddlPayrollFrequency']")));
			

			Reporter.log("verify XML");	
		} 
	 
	 
	 public void verify1StEmployeeXmlWithPension(String Taxable,String TotalTax,String expectedTaxablePay,String PayAfterStatDedns, String TaxDeductedOrRefunded,String GrossEarningsForNICsInPd,String GrossEarningsForNICsYTD,String AtLELYTD,String LELtoPTYTD
				,String PTtoUELYTD, String TotalEmpNICInPd, String TotalEmpNICYTD,String EmpeeContribnsInPd,String EmpeeContribnsYTD,String expectedPension) throws ParserConfigurationException, SAXException, IOException, InterruptedException {
			
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

			String xmlText=textArea1.getText();

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();

			InputSource src = new InputSource();
			src.setCharacterStream(new StringReader(xmlText));
			Document doc = dBuilder.parse(src);
			
			String actualTaxablePay1 = doc.getElementsByTagName("TaxablePay").item(0).getTextContent();
			System.out.println("TaxablePay1 ="+actualTaxablePay1);
			
			
			String actualTax = doc.getElementsByTagName("TotalTax").item(0).getTextContent();
			System.out.println("TotalTax ="+actualTax);
			
			
			
			String actualPayAfterStatDedns = doc.getElementsByTagName("PayAfterStatDedns").item(0).getTextContent();
			System.out.println("PayAfterStatDedns ="+actualPayAfterStatDedns);
			
			String actualTaxablePay = doc.getElementsByTagName("TaxablePay").item(1).getTextContent();
			System.out.println("TaxablePay ="+actualTaxablePay);
			
			String actualTaxDeductedOrRefunded = doc.getElementsByTagName("TaxDeductedOrRefunded").item(0).getTextContent();
			System.out.println("TaxDeductedOrRefunded ="+actualTaxDeductedOrRefunded);

			String actualGrossEarningsForNICsInPd = doc.getElementsByTagName("GrossEarningsForNICsInPd").item(0).getTextContent();
			System.out.println("GrossEarningsForNICsInPd ="+actualGrossEarningsForNICsInPd);

			String actualGrossEarningsForNICsYTD = doc.getElementsByTagName("GrossEarningsForNICsYTD").item(0).getTextContent();
			System.out.println("GrossEarningsForNICsYTD ="+actualGrossEarningsForNICsYTD);

			String actualAtLELYTD = doc.getElementsByTagName("AtLELYTD").item(0).getTextContent();

			System.out.println("AtLELYTD ="+actualAtLELYTD);
			
			String actualLELtoPTYTD = doc.getElementsByTagName("LELtoPTYTD").item(0).getTextContent();
			System.out.println("LELtoPTYTD ="+actualLELtoPTYTD);

			String actualPTtoUELYTD = doc.getElementsByTagName("PTtoUELYTD").item(0).getTextContent();
			System.out.println("PTtoUELYTD ="+actualPTtoUELYTD);
			
			String actualTotalEmpNICInPd = doc.getElementsByTagName("TotalEmpNICInPd").item(0).getTextContent();
			System.out.println("TotalEmpNICInPd ="+actualTotalEmpNICInPd);
			
			String actualTotalEmpNICYTD = doc.getElementsByTagName("TotalEmpNICYTD").item(0).getTextContent();
			System.out.println("TotalEmpNICYTD ="+actualTotalEmpNICYTD);
			
			String actualEmpeeContribnsInPd = doc.getElementsByTagName("EmpeeContribnsInPd").item(0).getTextContent();
			System.out.println("EmpeeContribnsInPd ="+actualEmpeeContribnsInPd);

			String actualEmpeeContribnsYTD = doc.getElementsByTagName("EmpeeContribnsYTD").item(0).getTextContent();
			System.out.println("EmpeeContribnsYTD ="+actualEmpeeContribnsYTD);
			

			String EmpeePenContribnsNotPaid = doc.getElementsByTagName("EmpeePenContribnsNotPaid").item(0).getTextContent();
			System.out.println("EmpeePenContribnsNotPaid ="+EmpeePenContribnsNotPaid);
				

				soft.assertEquals(actualTaxablePay1, Taxable);
			
			soft.assertEquals(actualTax, TotalTax);
			
			
			soft.assertEquals(actualTaxablePay, expectedTaxablePay);

			soft.assertEquals(actualPayAfterStatDedns, PayAfterStatDedns);
			
			soft.assertEquals(actualTaxDeductedOrRefunded, TaxDeductedOrRefunded);
		     
		    soft.assertEquals(actualGrossEarningsForNICsYTD, GrossEarningsForNICsYTD);

		    soft.assertEquals(actualGrossEarningsForNICsInPd, GrossEarningsForNICsInPd);

		    soft.assertEquals(actualAtLELYTD, AtLELYTD);

		    soft.assertEquals(actualLELtoPTYTD, LELtoPTYTD);

		    soft.assertEquals(actualPTtoUELYTD, PTtoUELYTD);

		    soft.assertEquals(actualTotalEmpNICInPd, TotalEmpNICInPd);

		    soft.assertEquals(actualTotalEmpNICYTD, TotalEmpNICYTD);

		    soft.assertEquals(actualEmpeeContribnsInPd, EmpeeContribnsInPd);

		    soft.assertEquals(actualEmpeeContribnsYTD, EmpeeContribnsYTD);

		    soft.assertEquals(EmpeePenContribnsNotPaid, expectedPension);

		   

//		    soft.assertEquals(NonTaxOrNICPmt, nontax);
//
//		    soft.assertEquals(actualDednsFromNetPay, DednsFromNetPay);

			
			
			m_Driver.switchTo().defaultContent();
			
			
			jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//button[@type='button']")));
			Thread.sleep(3000);
				
//			jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeading_ddlPayrollFrequency']")));
			

			Reporter.log("verify XML");	
		} 
	 
	 public void verify2ndEmployeeXml(String Taxable,String TotalTax,String expectedTaxablePay,String PayAfterStatDedns, String TaxDeductedOrRefunded,String GrossEarningsForNICsInPd,String GrossEarningsForNICsYTD,String AtLELYTD,String LELtoPTYTD
				,String PTtoUELYTD, String TotalEmpNICInPd, String TotalEmpNICYTD,String EmpeeContribnsInPd,String EmpeeContribnsYTD) throws ParserConfigurationException, SAXException, IOException, InterruptedException {
			
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

			String xmlText=textArea1.getText();

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();

			InputSource src = new InputSource();
			src.setCharacterStream(new StringReader(xmlText));
			Document doc = dBuilder.parse(src);
			
			String actualTaxablePay1 = doc.getElementsByTagName("TaxablePay").item(2).getTextContent();
			System.out.println("TaxablePay1 ="+actualTaxablePay1);
			
			
			String actualTax = doc.getElementsByTagName("TotalTax").item(1).getTextContent();
			System.out.println("TotalTax ="+actualTax);
			
			
			
			String actualPayAfterStatDedns = doc.getElementsByTagName("PayAfterStatDedns").item(1).getTextContent();
			System.out.println("PayAfterStatDedns ="+actualPayAfterStatDedns);
			
			String actualTaxablePay = doc.getElementsByTagName("TaxablePay").item(3).getTextContent();
			System.out.println("TaxablePay ="+actualTaxablePay);
			
			String actualTaxDeductedOrRefunded = doc.getElementsByTagName("TaxDeductedOrRefunded").item(1).getTextContent();
			System.out.println("TaxDeductedOrRefunded ="+actualTaxDeductedOrRefunded);

			String actualGrossEarningsForNICsInPd = doc.getElementsByTagName("GrossEarningsForNICsInPd").item(1).getTextContent();
			System.out.println("GrossEarningsForNICsInPd ="+actualGrossEarningsForNICsInPd);

			String actualGrossEarningsForNICsYTD = doc.getElementsByTagName("GrossEarningsForNICsYTD").item(1).getTextContent();
			System.out.println("GrossEarningsForNICsYTD ="+actualGrossEarningsForNICsYTD);

			String actualAtLELYTD = doc.getElementsByTagName("AtLELYTD").item(1).getTextContent();

			System.out.println("AtLELYTD ="+actualAtLELYTD);
			
			String actualLELtoPTYTD = doc.getElementsByTagName("LELtoPTYTD").item(1).getTextContent();
			System.out.println("LELtoPTYTD ="+actualLELtoPTYTD);

			String actualPTtoUELYTD = doc.getElementsByTagName("PTtoUELYTD").item(1).getTextContent();
			System.out.println("PTtoUELYTD ="+actualPTtoUELYTD);
			
			String actualTotalEmpNICInPd = doc.getElementsByTagName("TotalEmpNICInPd").item(1).getTextContent();
			System.out.println("TotalEmpNICInPd ="+actualTotalEmpNICInPd);
			
			String actualTotalEmpNICYTD = doc.getElementsByTagName("TotalEmpNICYTD").item(1).getTextContent();
			System.out.println("TotalEmpNICYTD ="+actualTotalEmpNICYTD);
			
			String actualEmpeeContribnsInPd = doc.getElementsByTagName("EmpeeContribnsInPd").item(1).getTextContent();
			System.out.println("EmpeeContribnsInPd ="+actualEmpeeContribnsInPd);

			String actualEmpeeContribnsYTD = doc.getElementsByTagName("EmpeeContribnsYTD").item(1).getTextContent();
			System.out.println("EmpeeContribnsYTD ="+actualEmpeeContribnsYTD);
			
			
//			String NonTaxOrNICPmt = doc.getElementsByTagName("NonTaxOrNICPmt").item(0).getTextContent();
//			System.out.println("NonTaxOrNICPmt ="+NonTaxOrNICPmt);
//			
//			
//			String actualDednsFromNetPay = doc.getElementsByTagName("DednsFromNetPay").item(0).getTextContent();
//			System.out.println("DednsFromNetPay ="+actualDednsFromNetPay);
//			
			soft.assertEquals(actualTaxablePay1, Taxable);
			
			soft.assertEquals(actualTax, TotalTax);
			
			
			soft.assertEquals(actualTaxablePay, expectedTaxablePay);

			soft.assertEquals(actualPayAfterStatDedns, PayAfterStatDedns);
			
			soft.assertEquals(actualTaxDeductedOrRefunded, TaxDeductedOrRefunded);
		     
		    soft.assertEquals(actualGrossEarningsForNICsYTD, GrossEarningsForNICsYTD);

		    soft.assertEquals(actualGrossEarningsForNICsInPd, GrossEarningsForNICsInPd);

		    soft.assertEquals(actualAtLELYTD, AtLELYTD);

		    soft.assertEquals(actualLELtoPTYTD, LELtoPTYTD);

		    soft.assertEquals(actualPTtoUELYTD, PTtoUELYTD);

		    soft.assertEquals(actualTotalEmpNICInPd, TotalEmpNICInPd);

		    soft.assertEquals(actualTotalEmpNICYTD, TotalEmpNICYTD);

		    soft.assertEquals(actualEmpeeContribnsInPd, EmpeeContribnsInPd);

		    soft.assertEquals(actualEmpeeContribnsYTD, EmpeeContribnsYTD);

		   

//		    soft.assertEquals(NonTaxOrNICPmt, nontax);
//
//		    soft.assertEquals(actualDednsFromNetPay, DednsFromNetPay);

			
			
			m_Driver.switchTo().defaultContent();
			
			
			jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//button[@type='button']")));
			Thread.sleep(2000);
				
//			jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeading_ddlPayrollFrequency']")));
			

			Reporter.log("verify XML");	
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
		public void verifyEmployementAllowance(String data,String data1,String data2, String data3, String data4, String data5, String data6,String data7,String data8,String data9,String data10,String data11,String data12)
		{
			
			try {
				 List<WebElement> list = m_Driver.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr/td[11]"));
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
					ar.add(data9);
					ar.add(data10);
					ar.add(data11);
					ar.add(data12);

				
					boolean con=list.isEmpty();
				     soft.assertFalse(con);
					
				 for (int i =0;i<=list.size()-1;i++)
				 {
					 
					 List<WebElement> list1 = m_Driver.findElements(By.xpath("(//*[@class='table table-head-bg'])[2]/tbody/tr/td[11]"));

					 WebElement elem = list1.get(i);
					 
					String actualData = elem.getText();
					actualData = actualData.replaceAll("[£]", "");
					actualData = actualData.replaceAll("[,]", "");

					System.out.println(actualData);
					 soft.assertEquals(actualData, ar.get(i));
					
				 }
				 
				
			} catch (Exception e) {
			    soft.assertFalse(true,"welcome to catch block");

				System.out.println("Issue IN verifyEmployementAllowance"+e);
			}
		}
		
		
		
		
		public void verifyjournalsEntries(String expectedData) throws InterruptedException {
			
			WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkPopup']"));
			
			elem.click();
			
			Thread.sleep(2000);
			
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

			String actualData = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div[2]/div/div/div/div/table/tbody/tr[8]/td[3]")).getText();
			
			soft.assertEquals(actualData, expectedData);
			
			
			m_Driver.switchTo().defaultContent();
			
			m_Driver.findElement(By.xpath("//*[@id='PopUpClose']/span")).click();
			
		  jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl11_lnkPopup']")));

			
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

			
	    String actualData1 = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div[2]/div/div/div/div/table/tbody/tr[8]/td[3]")).getText();
			
			soft.assertEquals(actualData1, expectedData);
			
			m_Driver.switchTo().defaultContent();

		}
		
		
		
		public void verifyjournalsEntrie2s(String expectedData) throws InterruptedException {
			
			WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkPopup']"));
			
			elem.click();
			
			Thread.sleep(2000);
			
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

			String actualData = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div[2]/div/div/div/div/table/tbody/tr[8]/td[3]")).getText();
			
			soft.assertEquals(actualData, expectedData);
			
			
			m_Driver.switchTo().defaultContent();
			
			m_Driver.findElement(By.xpath("//*[@id='PopUpClose']/span")).click();
			
//		  jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl11_lnkPopup']")));
//
//			
//			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));
//
//			
//	    String actualData1 = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div[2]/div/div/div/div/table/tbody/tr[8]/td[3]")).getText();
//			
//			soft.assertEquals(actualData1, expectedData);
//			
			m_Driver.switchTo().defaultContent();
//
		}
		
		
		

		public void verifyjournalsEntries1(String expectedData) throws InterruptedException {
			
			WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkPopup']"));
			
			elem.click();
			
			Thread.sleep(2000);
			
			m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='PopUpFrame']")));

			String actualData = m_Driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div[1]/div[2]/div/div/div/div/table/tbody/tr[6]/td[2]")).getText();
			
			soft.assertEquals(actualData, expectedData);
			
			
			m_Driver.switchTo().defaultContent();
		

		}
		
		
		

  public void verifyEA_Tag(String expectedTag ) throws ParserConfigurationException, SAXException, IOException, InterruptedException {
	
	m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div/div[3]/div/div[5]/div/div/div[2]/iframe")));

	String xmlText=textArea1.getText();

	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();

	InputSource src = new InputSource();
	src.setCharacterStream(new StringReader(xmlText));
	Document doc = dBuilder.parse(src);
	String XMLLELValue1 = doc.getElementsByTagName("EmpAllceInd").item(0).getTextContent();
	
	System.out.println("EmpAllceInd= "+XMLLELValue1);
	
	soft.assertEquals(XMLLELValue1, expectedTag);
	

	m_Driver.switchTo().defaultContent();
	
	
	jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//button[@type='button']")));
	Thread.sleep(2000);
		
//	jsExec.executeScript("arguments[0].scrollIntoView();", m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cpHeading_ddlPayrollFrequency']")));
	

	Reporter.log("verifyEA_Tag");
}



public void verifyPayrollSummaryEA( String expectedData)
{
	
	
	try {
		

		  WebElement list = m_Driver.findElement(By.xpath("(//*[text()='Balance owed (b/f)']/ following::div[@aria-label='Report text']/div/ancestor::div)[10]"));
		   String EA = list.getText();
		   EA = EA.replaceAll("[£]", "");
		   EA = EA.replaceAll("[,]", "");
		  soft.assertEquals(EA, expectedData);

		
	} catch (Exception e) {
	    soft.assertFalse(true,"welcome to catch block");

		System.out.println("Issue In verifyPayrollSummaryEA"+e);
	}
	
	Reporter.log("verifyPayrollSummaryEA");
}


public void verifyPayrollDashboard( String expectedData)
{
	
	
	try {
		

		  WebElement list = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_gridDisplayRecords']/tbody/tr[2]/td[5]"));
		   String EA = list.getText();
		   EA = EA.replaceAll("[£]", "");
		   EA = EA.replaceAll("[,]", "");
		   
		   
		  soft.assertEquals(EA, expectedData);

		
	} catch (Exception e) {
	    soft.assertFalse(true,"welcome to catch block");

		System.out.println("Issue In verifyPayrollSummaryEA"+e);
	}
	
	Reporter.log("verifyPayrollSummaryEA");
}
	


public void verifyGrossOnPayrollSummary()
	{
		
		
	 
	//Gross Finding
  
    String Gross=m_Driver.findElements(By.xpath("//div[contains(text(),'£')]")).get(0).getText();
  	//System.out.println(Tax);
  	String Grossstr=Gross.replaceAll("[£]", "");
  	String GrossAmount = Grossstr.replaceAll(",", "");
		System.out.println("This is Gross amount"+GrossAmount);
	soft.assertEquals(GrossAmount, "6000.00");
		
	}
		
	 public void assertAll()
	   {
		   soft.assertAll();
		   
	   }
	 
	 
	 
	 

}
