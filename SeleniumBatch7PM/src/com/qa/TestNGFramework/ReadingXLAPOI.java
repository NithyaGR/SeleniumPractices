package com.qa.TestNGFramework;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

//import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import com.utility.Xls_Reader;
//This is from SoftwareTestingMAterial
public class ReadingXLAPOI {

	public static void main(String[] args) throws IOException   {
		// TODO Auto-generated method stub

		/*Xls_Reader reader = new Xls_Reader("C:\\Users\\Nithyakalyani\\Desktop\\Login.xlsx");
		int rows = reader.getRowCount("Login");
		System.out.println(rows);
		String username1 = reader.getCellData("");*/

		FileInputStream fis = new FileInputStream("C:\\Users\\Nithyakalyani\\Desktop\\Login.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		System.out.println("Workbook");
		XSSFSheet sheet1 = workbook.getSheet("Login");
		// XSSFSheet sheet = workbook.getSheetAt(0);

		Row row = sheet1.getRow(0);
		Cell cell = row.getCell(0);
		System.out.println(cell);
		System.out.println(sheet1.getRow(0).getCell(0));


		/* String inputData[][] = new String [rows][col];
		 * for (int i=0;i<2;i++)

				for (int j=0; j<col; j++)
				{
					Cell cell = mySheet.getCell(j, i);
					inputData[i][j]= myCell.getContents();
					System.out.println(inputData[i][j]);
				}
			}*/
		//String cellval = cell.getStringCellValue();
		//System.out.println(cellval);
		workbook.close();
	}

}
