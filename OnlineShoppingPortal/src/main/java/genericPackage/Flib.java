package genericPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
	public String readExcelData(String excelPath, String sheetName ,int rowNo ,int cellNo ) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream(excelPath);
		 Workbook wb = WorkbookFactory.create(fis);
		 Sheet sheet = wb.getSheet(sheetName);
		 Row row = sheet.getRow(rowNo);
		 
		 Cell Cell = row.getCell(cellNo);
		 String data = Cell.toString();
		return data;
	}
	
	public String readpropertydata(String propPath, String key)	throws IOException{
		FileInputStream fis = new FileInputStream(propPath);
		 Properties prop = new Properties(); 
		 prop.load(fis);
	 	String data = prop.getProperty(key); 
	 	return data;
	}
	
	public int getLastRowCount(String excelPath, String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int rc = sheet.getLastRowNum();
		
		return rc;
		
	}
	public String readNumbricExcelData(String excelPath, String sheetName ,int rowNo ,int cellNo ) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream(excelPath);
		 Workbook wb = WorkbookFactory.create(fis);
		 Sheet sheet = wb.getSheet(sheetName);
		 Row row = sheet.getRow(rowNo);
		 Cell cell = row.getCell(cellNo);
		 long data =(long) cell.getNumericCellValue();
		 String data1 = String.valueOf(data);
		 return data1;
	
	}
}
