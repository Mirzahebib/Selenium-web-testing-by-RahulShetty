import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {

	// identify test cases column by scanning entire first row
	// Once column is identified then scan entire testcases column to identify
	// purchase test case row
	// after you grab purchase testcase row = pull out all data from that data row
	// and feed it into test

	public ArrayList<String> getData(String testcaseName) throws IOException
	{
		ArrayList<String> a=new ArrayList<String>();

		FileInputStream fis = new FileInputStream("D:\\Selenium-Webdriver with Java-Basics to Advanced+Frameworks\\Section 26 -Framework part 6 - Excel data driven testing\\Testdataxls.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		int sheets = workbook.getNumberOfSheets();
		for (int i = 0; i < sheets; i++) 
		{
			if (workbook.getSheetName(i).equalsIgnoreCase("Testdata1")) 
			{
				XSSFSheet sheet = workbook.getSheetAt(i);
				// identify test cases column scanning entire first row

				Iterator<Row> rows = sheet.iterator();  //sheet is collection of rows
				Row firstrow = rows.next();
				Iterator <Cell> ce = firstrow.cellIterator(); //row is collection of cells
				
				int k=0;
				int column = 0;
				while(ce.hasNext())
				{
					Cell value=ce.next();
					if(value.getStringCellValue().equalsIgnoreCase("Testcases"))
					{
						column=k;
					}
					
					k++;
					
				}
				
				System.out.println(column);
				// Once column is identified then scan entire testcases column to identify
				while(rows.hasNext())
				{
					Row r = rows.next();
					if (r.getCell(column).getStringCellValue().equalsIgnoreCase(testcaseName))
					{
						// after you grab purchase testcase row = pull out all data from that row
						Iterator<Cell> cv= r.cellIterator();
								while(cv.hasNext())
								{
									Cell  c = cv.next();
									if(c.getCellType()==CellType.STRING)
                                  {
	                                a.add(c.getStringCellValue());
                                  }
									else {
									
									a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
									
									}
									
								}
					}
				
				}
				
				
			}

		}
		return a;

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// fileInputStream argument

	}
}