package readExcelData;

import java.io.File;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		
		File src = new File("./TestData/TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		int rowCount = wb.getSheetAt(0).getLastRowNum()+1;
		System.out.println("Total numbe of rows :"+rowCount);
		
		for (int i=0;i<rowCount; i++){
			String row = wb.getSheetAt(0).getRow(i).getCell(0).toString();
			String col = wb.getSheetAt(0).getRow(i).getCell(1).toString();
			System.out.println(row+" "+col);
		}
		wb.close();

	}

}
