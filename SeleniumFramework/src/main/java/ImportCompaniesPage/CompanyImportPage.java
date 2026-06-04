package ImportCompaniesPage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import pages.BasePage;
import utilities.GernateRandomNumber;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

public class CompanyImportPage  extends BasePage{

	public CompanyImportPage(WebDriver driver) {
		super(driver);
	}
	
	public static String Paydate="07-06-2022";
	public static String Paydate1="07-04-2025";
	public static String Paydate2="06-04-2022";

	public static   String data;
	
	public static String MonthlyPaydate="23";

	public static String client;
	
	public static String input;
	public static String input1="0";
	public static String input2="POX 1AS";

	public static String input3="adfm@gmail.com";

	 private static String fileDownloadpath = "C:\\Users\\Sonu\\Downloads";

	String filePath="C:\\Users\\Sonu\\Downloads\\PayrollCompany.csv";
	private By importCompaniesElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_lnlBtnImportCompanies']");
	 

	private By csvIcnElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnExportSample']");

	private By uploadElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnUpload']");
	private By chooseFileElem= By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_FileUpload1']");
	
    private  By importElem = By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_LnlBtnImport']");
    
    private By dateSelect=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ddlDateFormatNew']");

	private By EnterClientNameElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPHFilter$txtSearchCompany']");
	private By importEmployeeElem = By.xpath("//a[@id='ctl00_ctl00_ParentContent_cPH_btnImportEmployees']");
	
    private By dateSelect1=By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_ddlDateFormat']");

	public void updateCSV() throws Exception
	{
		
		
		CSVReader csv= new CSVReader(new FileReader(new File("E:\\SeleniumFramework\\SonuPayrollNew\\PayrollCompany.csv")));
		
		List<String[]> alldata = csv.readAll();
		
		
		for(int j=1;j<=200;j++)
		{
 		String s = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(s);
	    alldata.get(j)[0]=s;
		}
		for (int i =1; i<=200;i++)
		{
		 	String value = RandomStringUtils.randomNumeric(3); 

	      
	    System.out.println(value);
		alldata.get(i)[12]="635/A"+value;
		
		}
		
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File("E:\\SeleniumFramework\\SonuPayrollNew\\PayrollCompany.csv")));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		Reporter.log("CsvFileUpdated");

	}
	
	
	
	public void updateCSV1() throws Exception
	{
		
		
		CSVReader csv= new CSVReader(new FileReader(new File("C:\\Users\\Sonu\\Downloads\\PayrollCompany.csv")));
		

		List<String[]> alldata = csv.readAll();
		
		
	
 		 client = RandomStringUtils.randomAlphabetic(16); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
		 String value = RandomStringUtils.randomNumeric(3); 

	      
	    System.out.println(value);
		alldata.get(1)[12]="635/E"+value;
		
	
	    alldata.get(1)[21]="Y";

		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File("C:\\Users\\Sonu\\Downloads\\PayrollCompany.csv")));

		csvWriter.writeAll(alldata);
		csvWriter.flush();
		
		csv.close();
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	public void updateBlankCSVRegistrationDate() throws Exception
	{
		
		
		CSVReader csv= new CSVReader(new FileReader(new File("C:\\Users\\Sonu\\Downloads\\PayrollCompany.csv")));
		
		List<String[]> alldata = csv.readAll();
		
		
	
 		String s = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(s);
	    alldata.get(1)[0]=s;
		
	
	String value = RandomStringUtils.randomNumeric(3); 

	      
	    System.out.println(value);
		alldata.get(1)[12]="635/S"+value;
		
	    alldata.get(1)[11]=null;

		
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File("C:\\Users\\Sonu\\Downloads\\PayrollCompany.csv")));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		
		csv.close();
		
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	
	
	public void updateBlankCSVPayeRefrence() throws Exception
	{
		
		
		CSVReader csv= new CSVReader(new FileReader(new File("C:\\Users\\Sonu\\Downloads\\PayrollCompany.csv")));
		
		List<String[]> alldata = csv.readAll();
		
		
	
 		String s = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(s);
	    alldata.get(1)[0]=s;
		
	
	 String value = RandomStringUtils.randomNumeric(3); 

	      
	    System.out.println(value);
		alldata.get(1)[12]=null;
		

		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File("C:\\Users\\Sonu\\Downloads\\PayrollCompany.csv")));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		
		csv.close();
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	
	
	
	public void updateBlankContactDetails() throws Exception
	{
		
		
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
		List<String[]> alldata = csv.readAll();
		
		
	
 		String s = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(s);
	    alldata.get(1)[0]=s;
		
	
	   String value = RandomStringUtils.randomNumeric(3); 

	      
	    System.out.println(value);
		alldata.get(1)[12]="635/S"+value;
		
		for(int i=7;i<=10;i++)
		{
			 alldata.get(1)[i]=null;
			
		}

		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		
		csv.close();
		
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	
	public void updateBlankPostCode() throws Exception
	{
		
		
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
		List<String[]> alldata = csv.readAll();
		
		
	
 		client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	   String value = RandomStringUtils.randomNumeric(3); 

	      
	    System.out.println(value);
		alldata.get(1)[12]="635/S"+value;
		  input = RandomStringUtils.randomNumeric(0); 

	
			 alldata.get(1)[6]=input;
			
		

		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		
		csv.close();
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	
	public void updateBlankAnuallPaydate() throws Exception
	{
		
		
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
		List<String[]> alldata = csv.readAll();
		
		
	
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	   String value = RandomStringUtils.randomNumeric(3); 

	      
	    System.out.println(value);
		alldata.get(1)[12]="635/S"+value;
		
	
	    alldata.get(1)[70]=null;
			
		
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		csv.close();
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	
	
	public void updateOnlyMontly() throws Exception
	{
		
		
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
		List<String[]> alldata = csv.readAll();
	
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	   String value = RandomStringUtils.randomNumeric(3); 

	      
	    System.out.println(value);
		alldata.get(1)[12]="635/S"+value;
		
	 //   alldata.get(1)[23]=null;
			
	    for(int i=67;i<=70;i++)
	    {
		    alldata.get(1)[i]=null;

	    }
		
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		csv.close();
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	
	public void updateOpeningBalanceNull() throws Exception
	{
		
		
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
		List<String[]> alldata = csv.readAll();
	
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	    String value = RandomStringUtils.randomNumeric(3); 

	    System.out.println(value);
		alldata.get(1)[12]="635/D"+value;
		
			
	    for(int i=55;i<=65;i++)
	    {
		    alldata.get(1)[i]=null;

	    }
		
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		csv.close();
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	public void updateBankName() throws Exception
	{
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
		List<String[]> alldata = csv.readAll();
	
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	    String value = RandomStringUtils.randomNumeric(3); 

	    System.out.println(value);
		alldata.get(1)[12]="635/D"+value;
		
	    input = RandomStringUtils.randomAlphabetic(8); 
	
	    alldata.get(1)[35]=input;

		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		csv.close();
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	public void updateBankNameNull() throws Exception
	{
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
		List<String[]> alldata = csv.readAll();
	
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	    String value = RandomStringUtils.randomNumeric(3); 

	    System.out.println(value);
		alldata.get(1)[12]="635/D"+value;
		
	
	    alldata.get(1)[35]=null;

		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		csv.close();
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	
	
	public void updateSortCode() throws Exception
	{
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
		List<String[]> alldata = csv.readAll();
	
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	    String value = RandomStringUtils.randomNumeric(3); 

	    System.out.println(value);
		alldata.get(1)[12]="635/D"+value;
		
	    input =RandomStringUtils.randomNumeric(6);
	
	    alldata.get(1)[36]=input;

		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		csv.close();
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	public void updateSortCodeNull() throws Exception
	{
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
		List<String[]> alldata = csv.readAll();
	
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	    String value = RandomStringUtils.randomNumeric(3); 

	    System.out.println(value);
		alldata.get(1)[12]="635/D"+value;
		
	
	    alldata.get(1)[36]=null;

		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		csv.close();
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	public void updateAccountNumber() throws Exception
	{
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
		List<String[]> alldata = csv.readAll();
	
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	    String value = RandomStringUtils.randomNumeric(3); 

	    System.out.println(value);
		alldata.get(1)[12]="635/D"+value;
		
	    input =RandomStringUtils.randomNumeric(8);
	
	    alldata.get(1)[37]=input;

		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		csv.close();
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	public void updateAccountNumberNull() throws Exception
	{
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
		List<String[]> alldata = csv.readAll();
	
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	    String value = RandomStringUtils.randomNumeric(3); 

	    System.out.println(value);
		alldata.get(1)[12]="635/D"+value;
	
	    alldata.get(1)[37]=null;

		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		csv.close();
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	public void updateOpeningBalanceZero(String data) throws Exception
	{
		
		
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
		List<String[]> alldata = csv.readAll();
	
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	   String value = RandomStringUtils.randomNumeric(3); 

	    System.out.println(value);
		alldata.get(1)[12]="635/D"+value;
		
			
	    for(int i=55;i<=65;i++)
	    {
		    alldata.get(1)[i]=data;

	    }
		
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		csv.close();
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	

	
	public void updateOpeningBalance_ApprenticeshipLevy() throws Exception
	{
		
     String a=".00";
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
		List<String[]> alldata = csv.readAll();
	
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	   String  value = RandomStringUtils.randomNumeric(3); 

	    System.out.println(value);
		alldata.get(1)[12]="635/D"+value;
	 
		 String abc = RandomStringUtils.randomNumeric(4); 
        data = abc+a;
        
	    alldata.get(1)[55]=data;
	
	    System.out.println(data);
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		csv.close();
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	

	public void updateOpeningBalance_CisSufferd() throws Exception
	{
		
     String a=".00";
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
		List<String[]> alldata = csv.readAll();
	
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	   String  value = RandomStringUtils.randomNumeric(3); 

	    System.out.println(value);
		alldata.get(1)[12]="635/D"+value;
	 
		 String abc = RandomStringUtils.randomNumeric(4); 
        data = abc+a;
        
	    alldata.get(1)[56]=data;
	
	    System.out.println(data);
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		csv.close();
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	
	public void updateOpeningBalance_CisTax() throws Exception
	{
		
     String a=".00";
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
		List<String[]> alldata = csv.readAll();
	
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	   String  value = RandomStringUtils.randomNumeric(3); 

	    System.out.println(value);
		alldata.get(1)[12]="635/D"+value;
	 
		 String abc = RandomStringUtils.randomNumeric(4); 
        data = abc+a;
        
	    alldata.get(1)[57]=data;
	
	    System.out.println(data);
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		csv.close();
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	
	
	
	
	public void updateOpeningBalance_SMPRecoverd() throws Exception
	{
		
     String a=".00";
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
		List<String[]> alldata = csv.readAll();
	
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	   String  value = RandomStringUtils.randomNumeric(3); 

	    System.out.println(value);
		alldata.get(1)[12]="635/D"+value;
	 
		 String abc = RandomStringUtils.randomNumeric(4); 
        data = abc+a;
        
	    alldata.get(1)[61]=data;
	
	    System.out.println(data);
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		csv.close();
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	
	public void updateOpeningBalance_NicCompensationSMP() throws Exception
	{
		
     String a=".00";
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
		List<String[]> alldata = csv.readAll();
	
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	   String  value = RandomStringUtils.randomNumeric(3); 

	    System.out.println(value);
		alldata.get(1)[12]="635/D"+value;
	 
		 String abc = RandomStringUtils.randomNumeric(4); 
        data = abc+a;
        
	    alldata.get(1)[62]=data;
	
	    System.out.println(data);
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		csv.close();
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	
	
	public void updateOpeningBalance_SPPRecoverd() throws Exception
	{
		
     String a=".00";
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
		List<String[]> alldata = csv.readAll();
	
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	   String  value = RandomStringUtils.randomNumeric(3); 

	    System.out.println(value);
		alldata.get(1)[12]="635/D"+value;
	 
		 String abc = RandomStringUtils.randomNumeric(4); 
        data = abc+a;
        
	    alldata.get(1)[63]=data;
	
	    System.out.println(data);
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		csv.close();
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	public void updateOpeningBalance_NicCompensationSSP() throws Exception
	{
		
     String a=".00";
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
		List<String[]> alldata = csv.readAll();
	
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	   String  value = RandomStringUtils.randomNumeric(3); 

	    System.out.println(value);
		alldata.get(1)[12]="635/D"+value;
	 
		 String abc = RandomStringUtils.randomNumeric(4); 
        data = abc+a;
        
	    alldata.get(1)[64]=data;
	
	    System.out.println(data);
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		csv.close();
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	public void updateOnlyMontlyWeekly() throws Exception
	{
		
		
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
		List<String[]> alldata = csv.readAll();
	
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	   String value = RandomStringUtils.randomNumeric(3); 

	      
	    System.out.println(value);
		alldata.get(1)[12]="635/S"+value;
		
	//    alldata.get(1)[23]=null;
			
	    for(int i=68;i<=70;i++)
	    {
		    alldata.get(1)[i]=null;

	    }
		
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		csv.close();
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	

	public void updateOnlyMontlyFortnightly() throws Exception
	{
		
		
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
		List<String[]> alldata = csv.readAll();
	
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	   String value = RandomStringUtils.randomNumeric(3); 

	      
	    System.out.println(value);
		alldata.get(1)[12]="635/S"+value;
		
	   // alldata.get(1)[23]=null;
			
	    for(int i=67;i<=70;i++)
	    {
	    	if(i==68) {
	    		continue;
	    	}
	    	else {
		    alldata.get(1)[i]=null;
	    	}

	    }
		
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		csv.close();
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	public void updateOnlyFourWeekly() throws Exception
	{
		
		
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
		List<String[]> alldata = csv.readAll();
	
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	   String value = RandomStringUtils.randomNumeric(3); 

	      
	    System.out.println(value);
		alldata.get(1)[12]="635/S"+value;
		
	 //   alldata.get(1)[23]=null;
			
	    for(int i=66;i<=70;i++)
	    {
	    	if(i==69) {
	    		continue;
	    	}
	    	else {
		    alldata.get(1)[i]=null;
	    	}

	    }
		
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		csv.close();
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	
	public void updateOnlyTwoWeeklyFourWeekly() throws Exception
	{
		
		
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
		List<String[]> alldata = csv.readAll();
	
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	   String value = RandomStringUtils.randomNumeric(3); 

	      
	    System.out.println(value);
		alldata.get(1)[12]="635/S"+value;
		
	   // alldata.get(1)[23]=null;
			
	    for(int i=66;i<=70;i++)
	    {
	    	if(i==69||i==68) {
	    		continue;
	    	}
	    	else {
		    alldata.get(1)[i]=null;
	    	}	    
	    }
		
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		csv.close();
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	
	
	public void updateOnlyWeekly() throws Exception
	{
		
		
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
		List<String[]> alldata = csv.readAll();
	
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	   String value = RandomStringUtils.randomNumeric(3); 

	      
	    System.out.println(value);
		alldata.get(1)[12]="635/S"+value;
		
	  //  alldata.get(1)[23]=null;
			
	    for(int i=66;i<=70;i++)
	    {
	    	if(i==67)
	    	{
	    		continue;
	    		
	    	}
	    	else
	    	{
			    alldata.get(1)[i]=null;

	    	}
	    
	    }
		
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		csv.close();
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	
	
	public void updateOnlyFortnightly() throws Exception
	{
		
		
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
		List<String[]> alldata = csv.readAll();
	
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	   String value = RandomStringUtils.randomNumeric(3); 

	      
	    System.out.println(value);
		alldata.get(1)[12]="635/S"+value;
		
	   // alldata.get(1)[23]=null;
			
	    for(int i=66;i<=70;i++)
	    {
	    	if(i==68)
	    	{
	    		continue;
	    		
	    	}
	    	else
	    	{
			    alldata.get(1)[i]=null;

	    	}
	    
	    }
		
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		csv.close();
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	
	
	

	public void updateOnlyMonthlyAnnually() throws Exception
	{
		
		
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
		List<String[]> alldata = csv.readAll();
	
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	   String value = RandomStringUtils.randomNumeric(3); 

	      
	    System.out.println(value);
		alldata.get(1)[12]="635/S"+value;
		
			
	    for(int i=67;i<=69;i++)
	    {
		    alldata.get(1)[i]=null;
	    
	    }
		
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		csv.close();
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	
	public void updateOnlyAnnually() throws Exception
	{
		
		
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
		List<String[]> alldata = csv.readAll();
	
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	   String value = RandomStringUtils.randomNumeric(3); 

	      
	    System.out.println(value);
		alldata.get(1)[12]="635/S"+value;
		
	    for(int i=66;i<=69;i++)
	    {
	    
		    alldata.get(1)[i]=null;
	    	

	    }
		
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		csv.close();
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	public void updateAnnuallyPaydate( ) throws Exception
	{
		
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
	
		List<String[]> alldata = csv.readAll();
		
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	    String value = RandomStringUtils.randomNumeric(3); 

	    System.out.println(value);
		alldata.get(1)[12]="635/S"+value;
		
	
	    alldata.get(1)[70]= Paydate;
			
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		
		csv.close();
		
		csvWriter.close();
		
		Reporter.log("CsvFileUpdated");

		
	}
	
	
	public void updateWeeklyPaydate( ) throws Exception
	{
		
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
	
		List<String[]> alldata = csv.readAll();
		
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	    String value = RandomStringUtils.randomNumeric(3); 

	    System.out.println(value);
		alldata.get(1)[12]="635/S"+value;
		
	
	    alldata.get(1)[67]= Paydate;
			
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		
		csv.close();
		
		csvWriter.close();
		
		Reporter.log("CsvFileUpdated");

		
	}
	
	
	public void updateWeeklyPaydateNull( ) throws Exception
	{
		
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
	
		List<String[]> alldata = csv.readAll();
		
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	    String value = RandomStringUtils.randomNumeric(3); 

	    System.out.println(value);
		alldata.get(1)[12]="635/Z"+value;
		
	
	    alldata.get(1)[67]= null;
			
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		
		csv.close();
		
		csvWriter.close();
		
		Reporter.log("CsvFileUpdated");

		
	}
	
	
	public void updateFourWeeklyPaydate( ) throws Exception
	{
		
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
	
		List<String[]> alldata = csv.readAll();
		
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	    String value = RandomStringUtils.randomNumeric(3); 

	    System.out.println(value);
		alldata.get(1)[12]="635/S"+value;
		
	
	    alldata.get(1)[69]= Paydate;
			
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		
		csv.close();
		
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	public void updateFourWeeklyPaydateNull( ) throws Exception
	{
		
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
	
		List<String[]> alldata = csv.readAll();
		
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	    String value = RandomStringUtils.randomNumeric(3); 

	    System.out.println(value);
		alldata.get(1)[12]="635/S"+value;
		
	
	    alldata.get(1)[69]= null;
			
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		
		csv.close();
		
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	
	public void updateP11D(String input ) throws Exception
	{
		
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
	
		List<String[]> alldata = csv.readAll();
		
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	    String value = RandomStringUtils.randomNumeric(3); 

	    System.out.println(value);
		alldata.get(1)[12]="635/C"+value;
		
	    alldata.get(1)[14]= input;
			
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		
		csv.close();
		
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	
	public void updateP11DNull() throws Exception
	{
		
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
	
		List<String[]> alldata = csv.readAll();
		
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	    String value = RandomStringUtils.randomNumeric(3); 

	    System.out.println(value);
		alldata.get(1)[12]="635/C"+value;
		
	    alldata.get(1)[14]= null;
			
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		
		csv.close();
		
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	
	public void updatePaymentManagement(String input ) throws Exception
	{
		
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
	
		List<String[]> alldata = csv.readAll();
		
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	    String value = RandomStringUtils.randomNumeric(3); 

	    System.out.println(value);
		alldata.get(1)[12]="635/C"+value;
		
	    alldata.get(1)[15]= input;
			
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		
		csv.close();
		
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	
	public void updatePaymentManagementNull( ) throws Exception
	{
		
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
	
		List<String[]> alldata = csv.readAll();
		
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	    String value = RandomStringUtils.randomNumeric(3); 

	    System.out.println(value);
		alldata.get(1)[12]="635/C"+value;
		
	    alldata.get(1)[15]= null;
			
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		
		csv.close();
		
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	
	
	public void updateRejisterdCIS(String input ) throws Exception
	{
		
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
	
		List<String[]> alldata = csv.readAll();
		
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	    String value = RandomStringUtils.randomNumeric(3); 

	    System.out.println(value);
		alldata.get(1)[12]="635/C"+value;
		
	    alldata.get(1)[16]= input;
			
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		
		csv.close();
		
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	
	public void updateRejisterdCISNull( ) throws Exception
	{
		
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
	
		List<String[]> alldata = csv.readAll();
		
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	    String value = RandomStringUtils.randomNumeric(3); 

	    System.out.println(value);
		alldata.get(1)[12]="635/C"+value;
		
	    alldata.get(1)[16]= null;
			
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		
		csv.close();
		
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	
	public void updateDisplayLeave(String input ) throws Exception
	{
		
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
	
		List<String[]> alldata = csv.readAll();
		
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	    String value = RandomStringUtils.randomNumeric(3); 

	    System.out.println(value);
		alldata.get(1)[12]="635/C"+value;
		
	    alldata.get(1)[18]= input;
			
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		
		csv.close();
		
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	public void updateDisplayLeaveNull() throws Exception
	{
		
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
	
		List<String[]> alldata = csv.readAll();
		
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	    String value = RandomStringUtils.randomNumeric(3); 

	    System.out.println(value);
		alldata.get(1)[12]="635/C"+value;
		
	    alldata.get(1)[18]= null;
			
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		
		csv.close();
		
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	public void updateQuarterlyPayScheme(String input ) throws Exception
	{
		
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
	
		List<String[]> alldata = csv.readAll();
		
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	    String value = RandomStringUtils.randomNumeric(3); 

	    System.out.println(value);
		alldata.get(1)[12]="635/C"+value;
		
	    alldata.get(1)[23]= input;
			
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		
		csv.close();
		
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	public void updateQuarterlyPaySchemeNull( ) throws Exception
	{
		
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
	
		List<String[]> alldata = csv.readAll();
		
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	    String value = RandomStringUtils.randomNumeric(3); 

	    System.out.println(value);
		alldata.get(1)[12]="635/C"+value;
		
	    alldata.get(1)[23]= null;
			
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		
		csv.close();
		
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	

	public void updateSmallEmployer(String input ) throws Exception
	{
		
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
	
		List<String[]> alldata = csv.readAll();
		
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	    String value = RandomStringUtils.randomNumeric(3); 

	    System.out.println(value);
		alldata.get(1)[12]="635/C"+value;
		
	    alldata.get(1)[24]= input;
			
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		
		csv.close();
		
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}

	public void updateSmallEmployerNull() throws Exception
	{
		
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
	
		List<String[]> alldata = csv.readAll();
		
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	    String value = RandomStringUtils.randomNumeric(3); 

	    System.out.println(value);
		alldata.get(1)[12]="635/C"+value;
		
	    alldata.get(1)[24]= null;
			
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		
		csv.close();
		
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	public void updateEmploymentAllowance(String input ) throws Exception
	{
		
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
	
		List<String[]> alldata = csv.readAll();
		
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	    String value = RandomStringUtils.randomNumeric(3); 

	    System.out.println(value);
		alldata.get(1)[12]="635/B"+value;
		
	    alldata.get(1)[22]= input;
			
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		
		csv.close();
		
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	public void updateEmploymentAllowanceNull( ) throws Exception
	{
		
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
	
		List<String[]> alldata = csv.readAll();
		
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	    String value = RandomStringUtils.randomNumeric(3); 

	    System.out.println(value);
		alldata.get(1)[12]="635/B"+value;
		
	    alldata.get(1)[22]= null;
			
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		
		csv.close();
		
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	public void updateFortnightlyPaydate( ) throws Exception
	{
		
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
	
		List<String[]> alldata = csv.readAll();
		
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	    String value = RandomStringUtils.randomNumeric(3); 

	    System.out.println(value);
		alldata.get(1)[12]="635/S"+value;
		
	
	    alldata.get(1)[68]= Paydate;
			
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		
		csv.close();
		
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	
	public void updateFortnightlyPaydateNull( ) throws Exception
	{
		
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
	
		List<String[]> alldata = csv.readAll();
		
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	    String value = RandomStringUtils.randomNumeric(3); 

	    System.out.println(value);
		alldata.get(1)[12]="635/S"+value;
		
	
	    alldata.get(1)[68]= null;
			
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		
		csv.close();
		
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	
	public void updateMonthlyPaydate( ) throws Exception
	{
		
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
	
		List<String[]> alldata = csv.readAll();
		
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	    String value = RandomStringUtils.randomNumeric(3); 

	    System.out.println(value);
		alldata.get(1)[12]="635/S"+value;
		
	
	    alldata.get(1)[66]= MonthlyPaydate;
			
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		
		csv.close();
		
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	

	public void updateMonthlyPaydateNull( ) throws Exception
	{
		
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
	
		List<String[]> alldata = csv.readAll();
		
 		 client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	    String value = RandomStringUtils.randomNumeric(3); 

	    System.out.println(value);
		alldata.get(1)[12]="635/K"+value;
		
	
	    alldata.get(1)[66]= null;
			
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		
		csv.close();
		
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	
	
	public void updatePayeR( ) throws Exception
	{
		
//		   // Create an object of the File class
//        // Replace the file path with path of the directory
//        File file = new File("C:\\Users\\Sonu\\Downloads\\PayrollEmployee.csv");
//  
//        // Create an object of the File class
//        // Replace the file path with path of the directory
//        File rename = new File("C:\\Users\\Sonu\\Downloads\\PayrollEmployeeSonu.csv");
//  
//        // store the return value of renameTo() method in
//        // flag
//        boolean flag = file.renameTo(rename);
//  
//        // if renameTo() return true then if block is
//        // executed
//        if (flag == true) {
//            System.out.println("File Successfully Rename");
//        }
//        // if renameTo() return false then else block is
//        // executed
//        else {
//            System.out.println("Operation Failed");
//        }
        
    	
		CSVReader csv= new CSVReader(new FileReader(new File("C:\\Users\\Sonu\\Downloads\\PayrollEmployee.csv")));
		

		List<String[]> alldata = csv.readAll();
		
	
	     alldata.get(1)[0]="A6351568";
	   		
	     

		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File("C:\\Users\\Sonu\\Downloads\\PayrollEmployee.csv")));
		csvWriter.writeAll(alldata);
		csvWriter.writeNext();
		csvWriter.flush();
		
	
		
		csv.close();
		
		csvWriter.close();
	}
	
	
	
	public void updatePayeR1( ) throws Exception
	{
		
//		   // Create an object of the File class
//        // Replace the file path with path of the directory
//        File file = new File("C:\\Users\\Sonu\\Downloads\\PayrollEmployee.csv");
//  
//        // Create an object of the File class
//        // Replace the file path with path of the directory
//        File rename = new File("C:\\Users\\Sonu\\Downloads\\PayrollEmployeeSonu.csv");
//  
//        // store the return value of renameTo() method in
//        // flag
//        boolean flag = file.renameTo(rename);
//  
//        // if renameTo() return true then if block is
//        // executed
//        if (flag == true) {
//            System.out.println("File Successfully Rename");
//        }
//        // if renameTo() return false then else block is
//        // executed
//        else {
//            System.out.println("Operation Failed");
//        }
        
    	
		CSVReader csv= new CSVReader(new FileReader(new File("C:\\Users\\Sonu\\Downloads\\PayrollEmployee.csv")));
		

		List<String[]> alldata = csv.readAll();
		
		
	   alldata.get(1)[0]="A635";
	 

		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File("C:\\Users\\Sonu\\Downloads\\PayrollEmployee.csv")));
		csvWriter.writeAll(alldata);
		csvWriter.writeNext();
		csvWriter.flush();
		
	
		
		csv.close();
		
		csvWriter.close();
	}
	
	
	
	
	
	
	
	

	
	
	public void updateCSVCompanyPensionNO() throws Exception
	{
		
		
		CSVReader csv= new CSVReader(new FileReader(new File("C:\\Users\\Sonu\\Downloads\\PayrollCompany.csv")));
		
		List<String[]> alldata = csv.readAll();
		
		
	     client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	    String value = RandomStringUtils.randomNumeric(3); 

	      
	    System.out.println(value);
		alldata.get(1)[12]="635/N"+value;
		
	    alldata.get(1)[21]="N";

		
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File("C:\\Users\\Sonu\\Downloads\\PayrollCompany.csv")));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		
		csv.close();
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	
	public void updateCSVCompanyPensionNull() throws Exception
	{
		
		
		CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
		List<String[]> alldata = csv.readAll();
		
		
	     client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	    String value = RandomStringUtils.randomNumeric(3); 

	      
	    System.out.println(value);
		alldata.get(1)[12]="635/N"+value;
		
	    alldata.get(1)[21]=null;

		
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File("C:\\Users\\Sonu\\Downloads\\PayrollCompany.csv")));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		
		csv.close();
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	
	
	public void updateCSVPasswordProtectionType(String type) throws Exception
	{
		
		
		CSVReader csv= new CSVReader(new FileReader(new File("C:\\Users\\Sonu\\Downloads\\PayrollCompany.csv")));
		
		List<String[]> alldata = csv.readAll();
		
		
	     client = RandomStringUtils.randomAlphabetic(9); 

		System.out.println(client);
	    alldata.get(1)[0]=client;
		
	
	    String value = RandomStringUtils.randomNumeric(3); 

	      
	    System.out.println(value);
		alldata.get(1)[12]="635/N"+value;
		
	    alldata.get(1)[19]=type;

		
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File("C:\\Users\\Sonu\\Downloads\\PayrollCompany.csv")));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		
		csv.close();
		
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	
	
	
	public void updateCSVNull() throws Exception
	{
		
		
		CSVReader csv= new CSVReader(new FileReader(new File("C:\\Users\\Sonu\\Downloads\\PayrollCompany.csv")));
		
		List<String[]> alldata = csv.readAll();
		

    for(int i=0;i<=70;i++)
    {
    alldata.get(1)[i]=null;
	
     }
	
		CSVWriter csvWriter= new CSVWriter(new FileWriter(new File("C:\\Users\\Sonu\\Downloads\\PayrollCompany.csv")));
		csvWriter.writeAll(alldata);
		csvWriter.flush();
		
		csv.close();
		
		csvWriter.close();
		Reporter.log("CsvFileUpdated");

	}
	
	
	
	
	
	public void clickCsvIcn() throws Exception
	{
        
		WebElement elem = getWebElement(csvIcnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickCsvIcn", "clickCsvIcn failed. Unable to locate object: " + csvIcnElem.toString());


			Assert.fail("Unable to locate object: " + csvIcnElem.toString());
        }

		elem.click();
          	
		Thread.sleep(6000);
		Reporter.log("clickCsvIcn");

	}
	
	
	public void selectSubmitRtiStatus(String value) throws Exception
	{
        
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlStatusSearch']"));
		
		Select sel = new Select(elem);
		sel.selectByVisibleText( value);
		
		Thread.sleep(2000);
		
          	
		Reporter.log("selectSubmitRtiStatus");

	}
	
	public void saveCsv() throws AWTException, InterruptedException
	{
		
		Robot robot = new Robot();
		// press Ctrl+S the Robot's way
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_J);

		Thread.sleep(3000);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_J);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);

        robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(17000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_S);
		Thread.sleep(3000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_S);
		
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_F4);
		Thread.sleep(3000);
		robot.keyRelease(KeyEvent.VK_ALT);
		robot.keyRelease(KeyEvent.VK_F4);
		Thread.sleep(3000);
		utilities.ChangeWindow.Switchwindow(1, m_Driver);
		

	}
	
	
	
	
	
	public void clickImportCompanies() throws Exception
	{
        
		WebElement elem = getWebElement(importCompaniesElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickImportCompanies", "clickImportCompanies failed. Unable to locate object: " + importCompaniesElem.toString());


			Assert.fail("Unable to locate object: " + importCompaniesElem.toString());
        }

		elem.click();
          	
		Thread.sleep(3000);
		Reporter.log("clickImportCompanies");

	}
	
	
	
	

	public void clickImportEmployees() throws Exception
	{
        
		WebElement elem = getWebElement(importCompaniesElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickImportCompanies", "clickImportCompanies failed. Unable to locate object: " + importCompaniesElem.toString());


			Assert.fail("Unable to locate object: " + importCompaniesElem.toString());
        }

		elem.click();
          	
		Thread.sleep(3000);
		Reporter.log("clickImportCompanies");

	}
	
	
	
	public void clickUploadBtn() throws Exception
	{

		WebElement elem = getWebElement(uploadElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickUploadBtn", "clickUploadBtn failed. Unable to locate object: " + uploadElem.toString());


			Assert.fail("Unable to locate object: " + uploadElem.toString());
        }
		Thread.sleep(6000);

		elem.click();
          	
		Thread.sleep(3000);
		Reporter.log("clickUploadBtn");

	}
	
	
	public void chooseFile() throws Exception
	{
        
		WebElement elem = getWebElement(chooseFileElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "chooseFile", "chooseFile failed. Unable to locate object: " + chooseFileElem.toString());


			Assert.fail("Unable to locate object: " + chooseFileElem.toString());
        }

		elem.sendKeys("E:\\SeleniumFramework\\SonuPayrollNew\\PayrollCompany.csv");
          	
		Thread.sleep(3000);
		Reporter.log("chooseFile");

	}
	

	public void chooseFile1(String filename) throws Exception
	{
		Thread.sleep(5000);
		WebElement elem = getWebElement(chooseFileElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "chooseFile", "chooseFile failed. Unable to locate object: " + chooseFileElem.toString());


			Assert.fail("Unable to locate object: " + chooseFileElem.toString());
        }

		elem.sendKeys(filename);
          	
		Thread.sleep(3000);
		Reporter.log("chooseFile");

	}
	
	
	
	
	public void chooseFile2() throws Exception
	{
        
		WebElement elem = getWebElement(chooseFileElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "chooseFile", "chooseFile failed. Unable to locate object: " + chooseFileElem.toString());


			Assert.fail("Unable to locate object: " + chooseFileElem.toString());
        }

		elem.sendKeys("C:\\Users\\Sonu\\Downloads\\PayrollEmployee.csv");
          	
		Thread.sleep(3000);
		Reporter.log("chooseFile");

	}
	
	

	public void selectDateFormate(String data) throws Exception
	{
        
		WebElement elem = getWebElement(dateSelect);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectDateFormate", "selectDateFormate failed. Unable to locate object: " + dateSelect.toString());


			Assert.fail("Unable to locate object: " + dateSelect.toString());
        }

		Select sel= new Select(elem);
		sel.selectByVisibleText(data);
          	
		Thread.sleep(3000);
		Reporter.log("selectDateFormate");

	}
	
	
	
	
	public void selectDateFormate1() throws Exception
	{
        
		WebElement elem = getWebElement(dateSelect1);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectDateFormate", "selectDateFormate failed. Unable to locate object: " + dateSelect1.toString());


			Assert.fail("Unable to locate object: " + dateSelect1.toString());
        }

		Select sel= new Select(elem);
		sel.selectByVisibleText("dd-MMM-yy Ex: 30-Jan-13");
          	
		Thread.sleep(3000);
		Reporter.log("selectDateFormate1");

	}
	
	public void clickImportBtn1() throws InterruptedException
	{
        
//		WebElement elem = getWebElement(importElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickImportBtn", "clickImportBtn failed. Unable to locate object: " + importElem.toString());
//
//
//			Assert.fail("Unable to locate object: " + importElem.toString());
//        }
//
		WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_LinkButtonEx5']"));

		jsExec.executeScript("arguments[0].scrollIntoView(true);", elem);

		
		elem.click();
		Thread.sleep(9000);
          
		ExtentReportManager.passStep(m_Driver, "clickImportBtn");

		
		Reporter.log("clickImportBtn");
	}
	
	
	public void clickImportBtn() throws InterruptedException
	{
        
		WebElement elem = getWebElement(importElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickImportBtn", "clickImportBtn failed. Unable to locate object: " + importElem.toString());


			Assert.fail("Unable to locate object: " + importElem.toString());
        }


		jsExec.executeScript("arguments[0].scrollIntoView(true);", elem);

		
		elem.click();
		Thread.sleep(9000);
          
		ExtentReportManager.passStep(m_Driver, "clickImportBtn");

		
		Reporter.log("clickImportBtn");
	}
	
	
	

	public void clickImportBtn1Employee() throws InterruptedException
	{
        
		WebElement elem = getWebElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_LinkButtonEx5']"));

		

		jsExec.executeScript("arguments[0].scrollIntoView(true);", elem);

		
		elem.click();
		Thread.sleep(9000);
          
		ExtentReportManager.passStep(m_Driver, "clickImportBtn");

		
		Reporter.log("clickImportBtn1Employee");
	}
	
	
	 public void deletFilename(String fileName) throws Exception{

			String fileDownloadpath = "C:\\Users\\Sonu\\Downloads";

		

			File directory = new File(fileDownloadpath);

			File[] content = directory.listFiles();
			 
			
			 for (int i = 0; i < content.length; i++) {
			 if (content[i].getName().equals(fileName))
			 {
				 content[i].delete();

				 System.out.println("File Deleted ");
			      break;
			 }
			 }
				
			 
			 Thread.sleep(9000);
			 Reporter.log("Delet CSV File");
			}
	 
	 
	 
		public void Enter_EnterClientName() throws Exception
	 	{
	 	    
	 		WebElement elem = getWebElement(EnterClientNameElem);

	 		if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterClientName", "Enter_EnterClientName failed. Unable to locate object: " + EnterClientNameElem.toString());

	    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterClientName", "Enter_EnterClientName failed. Unable to locate object: " + EnterClientNameElem.toString());

	 			Assert.fail("Unable to locate object: " + EnterClientNameElem.toString());
	         }
	 		
	 		TakeScreenshot.takeScreenshot(m_Driver, "AgentPageError");

	 		elem.sendKeys(client);
	 	//	ClosePopup.ValidateAndPopUp(m_Driver);
	 		
	  		Reporter.log("Enter_EnterClientName - "+client);
	 	}
	 	
	 	
		public void updateWorkingDays(String input ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/D"+value;
			
			for(int i=48;i<=54;i++)
			{
		    alldata.get(1)[i]= input;
			}
				
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
		
		}
		
		public void updateWorkingDays1(String yes , String no ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/D"+value;
			
			for(int i=48;i<=54;i++)
			{
				if(i<=52)
				{
				    alldata.get(1)[i]= yes;

				}
				else
				{
				    alldata.get(1)[i]= no;

				}
				
			}
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
		
		}
		
		public void updateWorkingDays2(String yes , String no ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/D"+value;
			
			for(int i=48;i<=54;i++)
			{
				if(i==48||i==52)
				{
				    alldata.get(1)[i]= yes;

				}
				else
				{
				    alldata.get(1)[i]= no;

				}
				
			}
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
		
		}
		
		public void updateWorkingDays3(String yes , String no ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/D"+value;
			
			for(int i=48;i<=54;i++)
			{
				if(i==48||i==50||i==53)
				{
				    alldata.get(1)[i]= yes;

				}
				else
				{
				    alldata.get(1)[i]= no;

				}
				
			}
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
		
		}
		
		
		public void updateWorkingDays4(String yes , String no ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/D"+value;
			
			for(int i=48;i<=54;i++)
			{
				if(i==48||i==50||i==51)
				{
				    alldata.get(1)[i]= yes;

				}
				else
				{
				    alldata.get(1)[i]= no;

				}
				
			}
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
		
		}
		
		public void updateWorkingDays5(String yes , String no ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/D"+value;
			
			for(int i=48;i<=54;i++)
			{
				if(i==49||i==51||i==52)
				{
				    alldata.get(1)[i]= yes;

				}
				else
				{
				    alldata.get(1)[i]= no;

				}
				
			}
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvUpdated");
		
		}
		
		
		public void updateWorkingDays6(String yes , String no ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/D"+value;
			
			for(int i=48;i<=54;i++)
			{
				if(i==48||i==52||i==53)
				{
				    alldata.get(1)[i]= yes;

				}
				else
				{
				    alldata.get(1)[i]= no;

				}
				
			}
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvUpdated");
		
		}
		
		public void updateWorkingDays7(String yes , String no ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/D"+value;
			
			for(int i=48;i<=54;i++)
			{
				if(i==52||i==53||i==54)
				{
				    alldata.get(1)[i]= yes;

				}
				else
				{
				    alldata.get(1)[i]= no;

				}
				
			}
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvUpdated");
		
		}
		public void updateWorkingDays8(String yes , String no ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/D"+value;
			
			for(int i=48;i<=54;i++)
			{
				if(i==48||i==49||i==50||i==51)
				{
				    alldata.get(1)[i]= yes;

				}
				else
				{
				    alldata.get(1)[i]= no;

				}
				
			}
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvUpdated");
		
		}

		
		
		public void updateMondayToThursday( ) throws Exception
		{
	
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/D"+value;
			
			for(int i=48;i<=54;i++)
			{
				

				if(i==48||i==49||i==50||i==51)
				{
				    alldata.get(1)[i]= "Y";

				}
				else
				{
				    alldata.get(1)[i]= null;

				}
				
			}
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvUpdated");
		
		}
		
		public void updateAllWorkingDaysNull ()throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/D"+value;
			
			for(int i=48;i<=54;i++)
			{
				    alldata.get(1)[i]= null;

				
				
			}
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvUpdated");
		
		}

		
		
		public void clickImportEmployee() throws Exception
		{
	        
			WebElement elem = getWebElement(importEmployeeElem);

			if (elem == null) {
	    		ExtentReportManager.failStepWithScreenshot(m_Driver, "clickUploadBtn", "clickUploadBtn failed. Unable to locate object: " + uploadElem.toString());


				Assert.fail("Unable to locate object: " + uploadElem.toString());
	        }

			elem.click();
	          	
			Thread.sleep(3000);
			Reporter.log("clickImportEmployee");

		}
		
		
		
		public void updateCutOffDate( ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;
			
		
		    alldata.get(1)[42]= Paydate;
				
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}
		
		
		public void updateClientName( ) throws Exception
		{
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;
			
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}
		public void updatetFirstName( ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/Q"+value;
			
	 	    input = RandomStringUtils.randomAlphabetic(6); 
		    alldata.get(1)[7]=input;

			
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}
		
		
		public void updatetFirstNameNull( ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/Q"+value;
			
	 	    input = RandomStringUtils.randomAlphabetic(0); 
		    alldata.get(1)[7]=input;

			
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}
	
		public void updatetLastName( ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/Q"+value;
			
	 	    input = RandomStringUtils.randomAlphabetic(7); 
		    alldata.get(1)[8]=input;

			
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}
		
		public void updatetLastNameNull( ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/Q"+value;
			
	 	    input = RandomStringUtils.randomAlphabetic(0); 
		    alldata.get(1)[8]=input;

			
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}
				
		public void updatePhoneNumber() throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/Q"+value;
			
	 	    input = RandomStringUtils.randomNumeric(10); 
		    alldata.get(1)[10]=input;

			
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}
		
		
		public void updatePhoneNumberNull() throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/Q"+value;
			
	 	    input = RandomStringUtils.randomNumeric(0); 
		    alldata.get(1)[10]=input;

			
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}
		
		public void updateEmailid() throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/Q"+value;
			
		    alldata.get(1)[9]=input3;

			
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}
		
		public void updateEmailidNull() throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/Q"+value;
			
		    alldata.get(1)[9]=null;

			
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}
		
		
		
		public void updateClientNameNull() throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(0); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;
			
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}
		
		public void updateStagingDate( ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;
			
		    alldata.get(1)[26]=Paydate;

			alldata.get(1)[21]="Y";

			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}
		
		
		public void updateStagingDateNull( ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;
			
			
		    alldata.get(1)[26]=null;

			alldata.get(1)[21]="Y";

			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}
		
		public void updateComplienceDate( ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/K"+value;
			
		    alldata.get(1)[27]=Paydate;

			alldata.get(1)[21]="Y";

			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}
		
		public void updateRenErolment() throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;
			
		    alldata.get(1)[27]=null;

		    alldata.get(1)[28]=Paydate1;
			alldata.get(1)[21]="Y";

			
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}
		
		
		
		public void updateRenErolmentNull() throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;
			
		//    alldata.get(1)[28]=null;

		    alldata.get(1)[28]=Paydate1;
			alldata.get(1)[21]="Y";

			
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}
		
		public void updateSignatoryTitle( ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;
			
	 		 input = RandomStringUtils.randomAlphabetic(9); 

		    alldata.get(1)[29]=input;
			alldata.get(1)[21]="Y";

			
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}
		
		public void updateSignatoryTitleNull( ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;

		     alldata.get(1)[29]=null;
			 alldata.get(1)[21]="Y";

			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}
		
		
		public void updateSignatoryName( ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;
			
	 		 input = RandomStringUtils.randomAlphabetic(9); 

		    alldata.get(1)[30]=input;

			alldata.get(1)[21]="Y";

			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}
		public void updateSignatoryNameNull( ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;

		    alldata.get(1)[30]=null;
			alldata.get(1)[21]="Y";

			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}
		
		
		public void updateEmailAdd( ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;
			
		    alldata.get(1)[31]=input3;
			alldata.get(1)[21]="Y";

			
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

		}
		
		public void updateEmailAddNull( ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;
			
		    alldata.get(1)[31]=null;
			alldata.get(1)[21]="Y";

			
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

		}
		
		public void updatePhoneNumbe( ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;
		    input = RandomStringUtils.randomNumeric(10); 

		    alldata.get(1)[32]=input;
			alldata.get(1)[21]="Y";

			
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

		}
		
		public void updatePhoneNumbeNull( ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/R"+value;

		    alldata.get(1)[32]=null;
			alldata.get(1)[21]="Y";

			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

		}
		
		public void updatePensionID( ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;
		    input = RandomStringUtils.randomNumeric(7); 

		    alldata.get(1)[33]=input;
			alldata.get(1)[21]="Y";

			
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

		}
		
		
		
		public void updatePensionIDNull( ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;

		    alldata.get(1)[33]=null;
			alldata.get(1)[21]="Y";

			
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

		}
		public void updateOutNumber() throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;
		    input = RandomStringUtils.randomNumeric(6); 

		    alldata.get(1)[34]=input;
			alldata.get(1)[21]="Y";

			
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

		}
		
		
		public void updateAddressLine1( ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;
	 		 input = RandomStringUtils.randomAlphabetic(12); 

			
			alldata.get(1)[1]=input;

			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}
		
		public void updateAddressLine1Null( ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;
	 		 input = RandomStringUtils.randomAlphabetic(0); 

			alldata.get(1)[1]=input;

			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}
		
		

		public void updateAddressLine2( ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;
	 		 input = RandomStringUtils.randomAlphabetic(12); 

			
			alldata.get(1)[2]=input;

			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}
		
		public void updateAddressLine2Null( ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;
	 		 input = RandomStringUtils.randomAlphabetic(0); 

			
			alldata.get(1)[2]=input;

			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}
		
		
		public void updateCity( ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;
	 		 input = RandomStringUtils.randomAlphabetic(6); 

			
			alldata.get(1)[3]=input;

			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}
		
		public void updateCityNull( ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;
	 		 input = RandomStringUtils.randomAlphabetic(0); 

			
			alldata.get(1)[3]=input;

			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}

		
		public void updatePostCode1() throws Exception
		{
			
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
			
			List<String[]> alldata = csv.readAll();
			
			
		
	 		client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		   String value = RandomStringUtils.randomNumeric(3); 

		      
		    System.out.println(value);
			alldata.get(1)[12]="635/S"+value;
//			  input = RandomStringUtils.randomNumeric(0); 
//
//		
//				 alldata.get(1)[6]=input;
//				
			

			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			csvWriter.close();
			Reporter.log("CsvFileUpdated");

		}
		
		public void updateCountry( ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/M"+value;
	 		 input = RandomStringUtils.randomAlphabetic(6); 

			
			alldata.get(1)[4]=input;

			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}
		
		
		public void updateCountryNull( ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/M"+value;
	 		 input = RandomStringUtils.randomAlphabetic(0); 

			
			alldata.get(1)[4]=input;

			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}
		
		
		public void updatePostCode( ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/M"+value;
	 		 input2 = RandomStringUtils.randomAlphabetic(6); 

			
			alldata.get(1)[6]=input2;

			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}
		
		
		
		public void updateMaxSickDay() throws Exception
		{

			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;
			
		    input = RandomStringUtils.randomNumeric(2); 
           
		    alldata.get(1)[44]= input;
		   
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}
		
		
		public void updateMaxSickDayZero() throws Exception
		{
		   String a=".00";

			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;
			
		    alldata.get(1)[44]= input1;
		   
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}
		
		

		public void updateNoticePeriod() throws Exception
		{
		   String a=".00";

			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;
			
		    input = RandomStringUtils.randomNumeric(2); 
           
		    alldata.get(1)[45]= input;
		   
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}
		
		public void updateNoticePeriodZero() throws Exception
		{

			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;
			
           
		    alldata.get(1)[45]= input1;
		   
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}
		
		public void updateRetirementAgeMale() throws Exception
		{
		   String a=".00";

			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;
			
		    input = RandomStringUtils.randomNumeric(2); 
           
		    alldata.get(1)[46]= input;
		   
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}
		
		
		public void updateRetirementAgeMaleZero() throws Exception
		{

			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;
			
           
		    alldata.get(1)[46]= input1;
		   
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}
		public void updateRetirementAgeFemale() throws Exception
		{

			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;
			
		    input = RandomStringUtils.randomNumeric(2); 
           
		    alldata.get(1)[47]= input;
		   
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}
		
		public void updateRetirementAgeFemaleZero() throws Exception
		{

			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;
			
           
		    alldata.get(1)[47]= input1;
		   
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}
		
		
		public void updatLeaveDays() throws Exception
		{

			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;
			
		    input = RandomStringUtils.randomNumeric(2); 
           
		    alldata.get(1)[39]= input;
		   
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

		}
		
		
		public void updatLeaveDaysNull() throws Exception
		{

			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;
			
			
		    alldata.get(1)[39]= null;
		   
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

		}
		
		public void updateHolidayPayrate() throws Exception
		{

			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;
			
		    input = RandomStringUtils.randomNumeric(1); 
           
		    alldata.get(1)[40]= input;
		   
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

		}
		
		public void updateHolidayPayrateNull() throws Exception
		{

			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;
			
           
		    alldata.get(1)[40]= null;
		   
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

		}
		
		
		
		public void updateMaxCarryOver() throws Exception
		{

			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;
			
		    input = RandomStringUtils.randomNumeric(1); 
           
		    alldata.get(1)[41]= input;
		   
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

		}
		
		public void updateMaxCarryOverNull() throws Exception
		{

			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;
			
           
		    alldata.get(1)[41]= null;
		   
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

		}
		
		
		public void updateWeeklyWorkingHours() throws Exception
		{

			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;
			
		    input = RandomStringUtils.randomNumeric(1); 
           
		    alldata.get(1)[43]= input;
		   
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

		}
		
		public void updateWeeklyWorkingHoursNull() throws Exception
		{

			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;
			
           
		    alldata.get(1)[43]= null;
		   
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

		}
		
		
		public void updateLeaveYearStart() throws Exception
		{

			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/N"+value;
			
           
		    alldata.get(1)[20]= Paydate;

		    alldata.get(1)[38]= Paydate;
		   
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

		}
		
		
		public void updateLeaveYearStartNull() throws Exception
		{

			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/N"+value;
			
           
		    alldata.get(1)[20]= Paydate;

		    alldata.get(1)[38]= null;
		   
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

		}
		public void updateRegistrationDate( ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;
			
			
		    alldata.get(1)[11]=Paydate;

			
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}
		
		public void updateRegistrationDateNull( ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;
			input = RandomStringUtils.randomNumeric(0); 

			
		    alldata.get(1)[11]=input;

			
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}

		
		
		public void updateUTR( ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;
		    input = RandomStringUtils.randomNumeric(10); 

            alldata.get(1)[16]="Y";

			
		    alldata.get(1)[17]=input;

			
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}
		
		
		public void updateUTRNull( ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		    String value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;
		    input = RandomStringUtils.randomNumeric(0); 

		 //   alldata.get(1)[16]="Y";

			
		    alldata.get(1)[17]=input;

			
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}
		public void updatePayRefrence( ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
			
		
		     input = RandomStringUtils.randomNumeric(3); 

		    System.out.println(input);
			alldata.get(1)[12]="635/P"+input;
		 

			
			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}
		
		
		public void updateAccountOfficeNumber( ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
		
		    String  value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;
		 
            input = RandomStringUtils.randomNumeric(10); 

		    alldata.get(1)[13]=input;

			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}
		
		public void updateAccountOfficeNumberNull( ) throws Exception
		{
			
			CSVReader csv= new CSVReader(new FileReader(new File(filePath)));
		
			List<String[]> alldata = csv.readAll();
			
	 		 client = RandomStringUtils.randomAlphabetic(9); 

			System.out.println(client);
		    alldata.get(1)[0]=client;
		
		    String  value = RandomStringUtils.randomNumeric(3); 

		    System.out.println(value);
			alldata.get(1)[12]="635/P"+value;
		 
            input = RandomStringUtils.randomNumeric(0); 

		    alldata.get(1)[13]=input;

			CSVWriter csvWriter= new CSVWriter(new FileWriter(new File(filePath)));
			csvWriter.writeAll(alldata);
			csvWriter.flush();
			csv.close();
			
			csvWriter.close();
			
			Reporter.log("CsvFileUpdated");

			
		}
}
