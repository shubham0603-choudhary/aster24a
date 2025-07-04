package com.skillio;
import org.testng.annotations.DataProvider;
import com.skillio.utills.ExcelUtil;
public class DataProviderClass {
	@DataProvider(name="pincodes")
	public Object[][] pincodesData(){
		ExcelUtil excel=new ExcelUtil();
		Object[][] pincodes= excel.readExcel();
				return pincodes;				
	}
}
