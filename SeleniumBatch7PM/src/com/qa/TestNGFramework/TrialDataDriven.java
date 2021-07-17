package com.qa.TestNGFramework;

import java.io.File;
import java.io.IOException;

/*import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;*/

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class TrialDataDriven {

			
		public static void main(String[] args) throws BiffException, IOException
		{
		System.out.println("Getting the file");
		File myFile = new File("C:\\Users\\Nithyakalyani\\Desktop\\Login.xls");
		
		System.out.println("Creating the workbook myWB");
		Workbook myWB = Workbook.getWorkbook(myFile);
		
		System.out.println("Sheet");
		Sheet mySheet = myWB.getSheet("Sheet1");
		
		int rows = mySheet.getRows();
		System.out.println(rows);
		
		
		int col = mySheet.getColumns();
		System.out.println(col);
		
		String inputData [][] = new String[rows][col];
		//Reading the data
		
		for (int i=0;i<rows;i++)
		{
			for (int j=0; j<col; j++)
			{
				Cell myCell = mySheet.getCell(j, i);
				inputData[i][j]= myCell.getContents();
				System.out.println(inputData[i][j]);
			}
		}
		//return inputData;
				
	}
	
}
