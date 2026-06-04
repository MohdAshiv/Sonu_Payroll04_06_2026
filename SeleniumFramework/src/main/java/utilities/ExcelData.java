package utilities;

 

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

 

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

 

public class ExcelData 

 

{

 

    public static String[] toReadExcelData(String sTestCaseID,String sheet)
    {
        String sData[]=null;
        try
        {
        	String loc=System.getProperty("user.dir")+"\\TestData\\"+"\\testdataS4.xlsx";
            FileInputStream fis = new FileInputStream(new File(loc));
            Workbook wb =  WorkbookFactory.create(fis);
            Sheet sht = wb.getSheet(sheet);
            int iRowNum= sht.getLastRowNum();
           
            for(int i=1; i<=iRowNum; i++)
            {
                if(sht.getRow(i).getCell(0).toString().equals(sTestCaseID))
                {
                    int iCellNum=sht.getRow(i).getLastCellNum();
                    sData= new String[iCellNum];
                   
                    for(int j=0; j<iCellNum; j++)
                    {
                        DataFormatter formatter = new DataFormatter();
                        Cell cell = sht.getRow(i).getCell(j);
                        sData[j] = formatter.formatCellValue(cell);
                         
                        //sData[j]=sht.getRow(i).getCell(j).getStringCellValue();
                    }
                   
                    break;
                }
            }
       
   
        }
       
    catch(EncryptedDocumentException ex){
        ex.printStackTrace();
    }
    catch(InvalidFormatException ex){
        ex.printStackTrace();
    }
    catch(IOException ex){
        ex.printStackTrace();
    }
        return sData;
       
     }

 

}
