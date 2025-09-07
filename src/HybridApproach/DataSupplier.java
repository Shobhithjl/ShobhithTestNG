package HybridApproach;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataSupplier 
{
	@DataProvider(name="ExcelData")
	
	public String[][] testData() throws Exception
	{
		FileInputStream fis = new FileInputStream("D:\\Book1.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheet("Sheet1");
		int lastRow=sheet.getLastRowNum();
		short lc = sheet.getRow(0).getLastCellNum();
		String[][] cred = new String[lastRow+1][lc];
		
		for(int r=0;r<=lastRow;r++)
		{
			XSSFRow row = sheet.getRow(r);
			for(int c=0;c<row.getLastCellNum();c++)
			{
				XSSFCell cell = row.getCell(c);
				String val = cell.getStringCellValue();
				cred[r][c]= val;
				System.out.println(cred[r][c]);
			}
		}
		book.close();
		fis.close();
		return cred;
	}
}
