package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class nidhiexcel {

	
public static void rulecreate (String sheetName,int rowNum,int colNum,String des) throws EncryptedDocumentException, IOException, InvalidFormatException
    
    
    
    {
         File src=new File("D:\\vikash\\Ticets Detail\\Done Tickets\\Test cases PAYR-2078- Payment for Month(Tester status).xlsx");
         FileInputStream fis = new FileInputStream(src);
         Workbook wb = WorkbookFactory.create(fis);
         Sheet sht = wb.getSheet(sheetName);
            sht.getRow(rowNum).createCell(colNum).setCellValue(des);
         FileOutputStream fout=new FileOutputStream(src);
         wb.write(fout);
         wb.close();
        

 

    }
	
}
