package _5530FileNamePage;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import pages.BasePage;

public class VerifyFileNmae  extends BasePage{

	public VerifyFileNmae(WebDriver driver) {
		super(driver);
	
	}

	SoftAssert soft= new SoftAssert();

	 private static String fileDownloadpath = "C:\\Users\\Sonu Kumar\\Downloads";


	 
	 public void verifyDownloadFileName(String fileName){


		soft.assertTrue(isFileDownloaded(fileDownloadpath, fileName), "Failed to download Expected document");


		File directory = new File(fileDownloadpath);

		File[] content = directory.listFiles();
		 
		
		 for (int i = 0; i < content.length; i++) {
		 if (content[i].getName().equals(fileName))
		 {
			 content[i].delete();
			 System.out.println("File Deleted");
		      break;
		 }		 
		
		 }
				
		 Reporter.log("Verify Downloaded FileName");
		}

	 
	
		

	   public boolean isFileDownloaded(String fileDownloadpath, String fileName) {

		boolean flag = false;

		File directory = new File(fileDownloadpath);

		File[] content = directory.listFiles();
		 
		
		 for (int i = 0; i < content.length; i++) {
		 if (content[i].getName().equals(fileName))
		 {
			
			 System.out.println("hkh");
		return flag=true;
		

		 }
		  		}

		return flag;
	
		 }
	   
	   
	   
	   public void verifyDownloadFileNameContains(String fileName){


			soft.assertTrue(isFileDownloadedContains(fileDownloadpath, fileName), "Failed to download Expected document");


			File directory = new File(fileDownloadpath);

			File[] content = directory.listFiles();
			 
			
			 for (int i = 0; i < content.length; i++) {
			 if (content[i].getName().contains(fileName))
			 {
				 content[i].delete();
				 System.out.println("File Deleted");
			      break;
			 }
			 
			
			 }
					
			 Reporter.log("Verify Downloaded FileName");
			}
	 
	
		

	   public boolean isFileDownloadedContains(String fileDownloadpath, String fileName) {

		boolean flag = false;

		File directory = new File(fileDownloadpath);

		File[] content = directory.listFiles();
		 
		
		 for (int i = 0; i < content.length; i++) {
		 if (content[i].getName().contains(fileName))
		 {
			
		return flag=true;
		

		 }
		  		}

		return flag;
	
		 }
	   
	   
	   
	   public void asserAll()
	   {
		   soft.assertAll();
		   
	   }
}


