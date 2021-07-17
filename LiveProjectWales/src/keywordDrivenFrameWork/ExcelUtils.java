package keywordDrivenFrameWork;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class ExcelUtils {



	private static XSSFSheet excelWSheet;
	private static XSSFWorkbook excelWBook;
	private static XSSFCell cell;

	//This method is to set the File path and to open the Excel file
	//Pass Excel Path and SheetName as Arguments to this method
	public static void setExcelFile(String Path,String SheetName) throws Exception {
		FileInputStream ExcelFile = new FileInputStream(Path);
		excelWBook = new XSSFWorkbook(ExcelFile);
		excelWSheet = excelWBook.getSheet(SheetName);
	}

	//This method is to read the test data from the Excel cell
	//In this we are passing parameters/arguments as Row Num and Col Num
	public static String getCellData(int RowNum, int ColNum) throws Exception{

		//XSSFSheet
		cell = excelWSheet.getRow(RowNum).getCell(ColNum);
		String CellData = cell.getStringCellValue();
		return CellData;
	}
	public static void writeCellData(int RowNum, int ColNum,String result) throws Exception{
		cell = excelWSheet.getRow(RowNum).createCell(ColNum);
		cell.setCellType(CellType.STRING);
		cell.setCellValue(result);
		FileOutputStream fos=new FileOutputStream("inputData.xlsx");
		excelWBook.write(fos);
		fos.close();

	}
	public static int getNoOfRows()
	{
		return excelWSheet.getLastRowNum();
	}

	public static void run(WebDriver driver,String fileName,String sheetName) throws Exception{

		// Here we are passing the Excel path and SheetName as arguments to connect with Excel file 
		ExcelUtils.setExcelFile(fileName, sheetName);
		int rowCount = ExcelUtils.getNoOfRows();
		System.out.println("Number of rows" +rowCount);
		int iRow=1;
		try
		{
			do
			{
				//Reading the row and storing in variables..

				String description=ExcelUtils.getCellData(iRow, 1);
				System.out.println(description);
				String action =ExcelUtils.getCellData(iRow, 2);
				String elementReference = ExcelUtils.getCellData(iRow, 3);
				String referenceValue = ExcelUtils.getCellData(iRow, 4);
				String data=ExcelUtils.getCellData(iRow, 5);




				System.out.println(description+"--"+action+"--"+elementReference+"--"+referenceValue+"--"+data);


				//ExcelUtils.writeCellData(iRow, 6);
				if (action.equals("Load"))
				{
					try
					{
						driver.get(referenceValue);	             	            
						Thread.sleep(1000);
					}
					catch (Exception e)
					{
						System.out.println(e); 	              	           
						Thread.sleep(1000);
						break;
					}
				}
				else if(action.equals("VerifyText"))
				{
					try
					{

						String actual = findElement(elementReference, referenceValue, driver).getText();
						if(actual.contains(data))
						{
							System.out.println("Expected is equal to actual");
							writeCellData(iRow,6,"Pass");
						}
						else
						{
							writeCellData(iRow,6,"Fail");
						}
						Thread.sleep(1000L);
					}
					catch (Exception e)
					{
						System.out.println(e); 	              	           
						Thread.sleep(1000L);
						break;
					}
				}
				else if (action.equals("InsertData"))
				{
					try
					{	 
						findElement(elementReference, referenceValue, driver).clear();
						findElement(elementReference, referenceValue, driver).sendKeys(data);
						Thread.sleep(1000L);
					}
					catch (Exception e)
					{
						System.out.println(e); 	              	           
						Thread.sleep(1000L);
						break;
					}
				}
				else if (action.equals("Click"))
				{
					try
					{
						findElement(elementReference, referenceValue, driver).click();		              		            
					}
					catch (Exception e)
					{
						System.out.println(e); 		               
						Thread.sleep(100L);
						driver.manage().deleteAllCookies();
						break;
					}
				} 
				else if (action.equals("Dropdown"))
				{
					try
					{
						dropDownSelect(elementReference, referenceValue, driver, data);

						Thread.sleep(700L);
					}
					catch (Exception e)
					{
						System.out.println(e); 		               
						Thread.sleep(100L);
						break;
					}
				}
				else if (action.equals("Select"))
				{
					try
					{
						selectValueFromListbox(elementReference, referenceValue, driver, data);

						Thread.sleep(700L);
					}
					catch (Exception e)
					{
						System.out.println(e); 		               
						Thread.sleep(100L);
						break;
					}
				}
				iRow++;
			}while(iRow<=rowCount);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}
	public static void selectValueFromListbox(String locatorType,String locatorValue,WebDriver driver,String data) throws Exception
	{
		WebElement e = findElement(locatorType,locatorValue,driver);
		Select select = new Select(e);
		select.selectByVisibleText(data);

	}
	public static void dropDownSelect(String elementReference, String element, WebDriver driver,String data)
			throws Exception
	{
		try
		{
			WebElement select = findElement(elementReference, element, driver);
			List<WebElement> dropDownSelection = select.findElements(By.tagName("option"));
			for (WebElement option : dropDownSelection)
			{
				if (data.trim().equals(option.getText().trim()))
				{
					option.click();
					Thread.sleep(1000L);
					break;
				}
				Thread.sleep(1000L);
			}
		}
		catch (Exception e)
		{
			System.out.println(e);

		}
	}
	public static WebElement findElement(String ElementReference, String referenceValue, WebDriver driver)
			throws Exception
	{
		WebElement x = null;
		try
		{
			if (ElementReference.equalsIgnoreCase("id"))
			{
				x = driver.findElement(By.id(referenceValue));
			}
			else if (ElementReference.equalsIgnoreCase("ClassName"))
			{
				x = driver.findElement(By.className(referenceValue));
			}
			else if (ElementReference.equalsIgnoreCase("Name"))
			{
				x = driver.findElement(By.name(referenceValue));
			}
			else if (ElementReference.equalsIgnoreCase("CSS"))
			{
				x = driver.findElement(By.cssSelector(referenceValue));
			}
			else if (ElementReference.equalsIgnoreCase("Tagname"))
			{
				x = driver.findElement(By.tagName(referenceValue));
			}
			else if (ElementReference.equalsIgnoreCase("Text"))
			{
				x = driver.findElement(By.linkText(referenceValue));
			}
			else if (ElementReference.equalsIgnoreCase("x-path"))
			{
				x = driver.findElement(By.xpath(referenceValue));
			}
			else if (ElementReference.equalsIgnoreCase("cssSelectorID"))
			{
				referenceValue = "'" + referenceValue + "'";
				x = driver.findElement(By.cssSelector("[id=" + referenceValue + "]"));
			}
			else if (ElementReference.equalsIgnoreCase("cssSelectorClass"))
			{
				referenceValue = "'" + referenceValue + "'";
				x = driver.findElement(By.cssSelector("[class=" + referenceValue + "]"));
			}
		}
		catch (Exception e)
		{
			e.getMessage();

		}
		return x;
	}
}

