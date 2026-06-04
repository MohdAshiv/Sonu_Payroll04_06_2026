package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	 public static String getdata(String path, int row,int coulum) {
     	
     	String data="";
     	try {
     	FileInputStream fis= new FileInputStream(path);
     	XSSFWorkbook wb = new XSSFWorkbook(fis);
     	XSSFSheet sheet=wb.getSheetAt(0);
     	
     	data=sheet.getRow(row).getCell(coulum).getStringCellValue();
     	} catch(Exception e)
     	{
     		System.out.println(e);
     		
     	}
		return data;
     
     }
     
     public static void main(String[] args) throws IOException {
			
     	String path="C:\\Users\\Sonu\\Desktop\\Test cases- PAYR-2081- Recurring Addition-Deduction(Tester status). (1).xlsx";
     	String out1=getdata(path,5,3);
     	System.out.println(out1);
		}
	
     
}

