package utilities;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.EmptyFileException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class read_PDF_fromurl 
{
	static String output;
	public static  String readPDFInURL(String url) throws EmptyFileException, IOException 
	{
		
		
		System.out.println(url+"======");
	//	 WebDriver driver = new ChromeDriver();
       // page with example pdf document
	//	 m_Driver.get("https://assets.publishing.service.gov.uk/government/uploads/system/uploads/attachment_data/file/983259/CA44-2021_2022.pdf");
		URL url1 = new URL(url);
		
		System.out.println(url+"-----");
		
	//	URL url1=new URL("http://sandbox4.nomismasolution.co.uk/PayrollUI/AccessFiles.aspx?type=paysummary&id=1105015&PayrollCompanyCode=12261");
		
       InputStream is= url1.openStream();
		
       BufferedInputStream fileToParse = new BufferedInputStream(is);

       PDDocument document = null;

       try {

           document = PDDocument.load(fileToParse);

            output = new PDFTextStripper().getText(document);
            
            System.out.println(output);

       } finally {

           if (document != null) {

               document.close();

           }

           fileToParse.close();

           is.close();

       }

       return output;
       
    }

}
