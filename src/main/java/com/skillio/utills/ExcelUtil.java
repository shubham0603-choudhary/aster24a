package com.skillio.utills;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelUtil {

	public Object[][] readExcel() {
		Object[][] data=null;
		Workbook book=null;
		try {
			FileInputStream fls=new FileInputStream("/D:/My work space/aster24b/Pune_Pincodes.xlsx");
			book=new XSSFWorkbook(fls);
			Sheet sheet=book.getSheet("pin_codes");		
			int lastrownum=sheet.getLastRowNum();
			data=new Object[lastrownum][2];
			for (int i = 1; i <=lastrownum; i++) {
				Row row=sheet.getRow(i);
				for (int j = 0; j < row.getLastCellNum(); j++) {
					Cell cell=row.getCell(j);
					switch(cell.getCellType()) {
					case STRING:
						String value=cell.getStringCellValue();
						data[i-1][j]=value;
						break;
					case NUMERIC:
						int val= (int) cell.getNumericCellValue();
						data[i-1][j]=val;
					}
				
					
				}
			
				System.out.println();	
			}
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				book.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		return data;
	}
}
