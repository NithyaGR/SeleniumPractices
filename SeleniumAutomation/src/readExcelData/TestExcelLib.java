package readExcelData;

public class TestExcelLib {

	public static void main(String[] args) {
		
		ExcelLib XLLib = new ExcelLib();
		int row = XLLib.getRowCount(0);
		System.out.println("No Of rows: "+row);
		//XLLib.getCellData();
		for (int i=0;i<row; i++){
			String rowData = XLLib.getCellData(0, i, 0);
			String colData = XLLib.getCellData(0, i, 1);
			System.out.println(rowData+" "+colData);
		}
		

		
	}

}
