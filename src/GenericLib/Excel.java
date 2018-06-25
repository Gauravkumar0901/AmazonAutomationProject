package GenericLib;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel implements Constant {
	public static void main(String[] args) {
		String u = getExcelData(path,"Sheet1",0, 1);
		System.out.println(u);
	}
	
	public static String getExcelData(String filePath,String sheetName , int rowNum, int colNum)
			
			
	{
		String s="";
		try{
			
			
		FileInputStream fis = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(fis);
	 s = wb.getSheet(sheetName).getRow(rowNum).getCell(colNum).getStringCellValue();
		}
		
		catch(Exception e )
		{
			System.out.println("file not found ");
		}
			
		return s;
	}
	
	
	}

