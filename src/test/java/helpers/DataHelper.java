package helpers;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
* The DataHelper class implements a functionality that reads the parameters
* values from the test data excel sheet 
* comments.
* @author  Puneet Khurana
* @version 1.0
* @since   2016-10-01 
*/
public class DataHelper {	
	/**
	* This method is used to reads the parameters
	* values from the test data excel sheet 
	* comments.
	* @author  Puneet Khurana
	* @return List. this returns the parameter name and value
	*/
	public static List<HashMap<String,String>> data()
	{
		List<HashMap<String,String>> mydata = null;
		try
		{
			FileInputStream fs = new FileInputStream("classpath:TestData-seleniumframework.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fs);
			XSSFSheet sheet = workbook.getSheet("feature");
			Row HeaderRow = sheet.getRow(0);
			for(int i=1;i<sheet.getPhysicalNumberOfRows();i++)
			{
				Row currentRow = sheet.getRow(i);
				HashMap<String,String> currentHash = new HashMap<String,String>();
				for(int j=0;j<currentRow.getPhysicalNumberOfCells();j++)
				{
					Cell currentCell = currentRow.getCell(j);
					switch (currentCell.getCellType())
					{
					case Cell.CELL_TYPE_STRING:
						System.out.print(currentCell.getStringCellValue() + "\t");

						currentHash.put(HeaderRow.getCell(j).getStringCellValue(), currentCell.getStringCellValue());
						break;
					}
				}
				mydata.add(currentHash);
			}
			fs.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}		
		return mydata;
	}
}
