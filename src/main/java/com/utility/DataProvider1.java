package com.utility;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass;


public class DataProvider1 {
	
	
	@Test(dataProvider="dtestdata")
	public void test1(String uname,String pwd) {
		System.out.println(uname);
	
	}
	@DataProvider(name="dtestdata")
	public Object[][] getdata() {
		
	String path = System.getProperty("user.dir") + "\\src\\test\\resources\\Test-Data\\TestData.xlsx";
     Object data [][]=testData(path,"cred");
 
		return data;
	} 
	
	public Object[][] testData(String excelpath,String sheetname) {
		 Excelutils excel = new Excelutils(excelpath,sheetname);
	 int rowcount =	excel.getRowCount();
	 int colCount = excel.getcolCount();
	 Object[][] data=new Object[rowcount-1][colCount];
	 for(int i=1;i<rowcount;i++) {
	 	for(int j=0;j<colCount;j++) {
			String cellData =excel.getstringCellData(i, j);
			data[i-1][j]=cellData;
		}

	}
	return data;

	
}

}

