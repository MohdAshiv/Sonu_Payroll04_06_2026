package utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;



import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import pages.BasePage;

public class DownloadPdf extends BasePage {
	
	
	public DownloadPdf (WebDriver driver)
	{
		super(driver); 
	}

	public static String PDFtext;
	public static String str;

	//String PDFtext;
	public static String FileName;
	static String path ="E:\\GITCLONE\\SonuPayrollNew2\\SeleniumFramework\\SonuPDF\\File\\";
	public void DownloadPDF(WebDriver m_Driver,String xPath)
    {

		
        try
        {
            WebElement ExportToPdfBtn = m_Driver.findElement(By.xpath(xPath));
            ExportToPdfBtn.click();
            System.out.println("Download Pdf File");
            Reporter.log("Download Pdf File");
            m_Driver.switchTo().defaultContent();
            File folder = new File(System.getProperty("user.dir")+"\\SonuPDF\\"+"File");
            //List the files on that folder
            Thread.sleep(15000);
            File[] listOfFiles = folder.listFiles();
            boolean found = false;
            File f = null;
                 //Look for the file in the files
                 // You should write smart REGEX according to the filename
                 for (File listOfFile : listOfFiles) {
                     if (listOfFile.isFile()) {
                          String fileName = listOfFile.getName();
                           System.out.println("File " + listOfFile.getName());
                           if (fileName.matches(fileName)) {
                               f = new File(fileName);
                               found = true;
                               FileName=fileName;
                            }
                        }
                    }
            Assert.assertTrue(found, "Downloaded document is not found");
            f.deleteOnExit();



        }
        catch (Exception e)
        {
        System.out.println("Issue in DwonloadPdf = "+e);
        }



    }
	
	
	
	
	






	public void ReadPDF() throws InterruptedException, IOException
	{
		
			Thread.sleep(3000);
			
			File file = new File(path +FileName);
			PDDocument document = PDDocument.load(file);
			//Instantiate PDFTextStripper class
			PDFTextStripper pdfStripper = new PDFTextStripper();
			//Retrieving text from PDF document
			 PDFtext = pdfStripper.getText(document);
			 
			 System.out.println(PDFtext);
			 
//				String[] splitedString= PDFtext.split("Emp");
//				//		 String[] splitedString=new String[1];
//						 System.out.println(splitedString.length);
//						 for(int i=0; i<splitedString.length;i++)
//						 {
//							 Reporter.log(i+"+="+splitedString[i]);
//						 }
						 
//			 Reporter.log("\n"+PDFtext);
			//Closing the document
			document.close();
						 
							 
			  if(file.delete())
			  {
					
				  System.out.println("PDF file Deleted.");
				
			  }
								
					  

				 Reporter.log("PDF file verified.");
	}
	
	
	 public void ReadCSVFile() throws IOException, Exception  {
//         WebElement elem = m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPH_btnExport']"));


//        elem.click();
		 
		 
			
	       
         Thread.sleep(9000);

      CSVReader reader = new CSVReader(
          new FileReader("path +FileName)"));

//
//         CSVReader reader = new CSVReader(
//                 new FileReader("C:\\Users\\Swarupa\\Downloads\\IndividualEmployeePaySchedule-Mr. Prod Issue Emp.csv"));


        List<String[]> list = reader.readAll();
         System.out.println("Total rows which we have is " + list.size());


        // create Iterator reference
         Iterator<String[]> iterator = list.iterator();


        // Iterate all values
         while (iterator.hasNext()) {


            String[] str = iterator.next();


            // System.out.print(" Values are ");
             for (int i = 0; i < str.length; i++) {


                // System.out.print(" "+str[i]);


//                if (str[i].contains(value))
//
//
//                {
//                     // Thread.sleep(100);
//                     Assert.assertTrue(str[i].contains(value));
//
//
//                    System.out.println("pass");
//                     break;
//                 }


            }
             System.out.println("   ");


        }
         // utilities.ChangeWindow.Switchwindow(2, m_Driver);
         Reporter.log("ReadCSVFile");


    }
	
	
	
	
}
