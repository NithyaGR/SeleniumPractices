package readExcelData;

import java.io.File;
import java.io.FileInputStream;

//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLib {

	XSSFWorkbook wb;
	public ExcelLib(){
		try{
			
			File src = new File("./TestData/TestData.xlsx");
		    FileInputStream fis = new FileInputStream(src);
		    wb = new XSSFWorkbook(fis);
			
		}
		catch(Exception e){
			System.out.println("Fine not found "+e.getMessage());
		}
	}
	public int getRowCount(int SheetNum){
		
		int count = wb.getSheetAt(SheetNum).getLastRowNum()+1;
		return count;
		
	}
	//public void getCellData(){
	public String getCellData(int SheetNum, int row, int col){
		String cellData = wb.getSheetAt(SheetNum).getRow(row).getCell(col).toString();
		return cellData;
		/*String inputData[][]=new String[2][2];
		for (int i=0; i<2; i++)
		{
			for (int j=0; j<2; j++){
				String rowData = wb.getSheetAt(0).getRow(i).getCell(j).toString();
				inputData[i][j]= rowData;
				String colData = wb.getSheetAt(0).getRow(i).getCell(j).toString();
				inputData[i][j]= colData;
							
				System.out.println(inputData[i][j]);
							}
		}	   */
		    
		 
		
	}
	

}
