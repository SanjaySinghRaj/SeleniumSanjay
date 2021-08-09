package august09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataMethod {
	public static void readData(String filename , String sheetname ) throws Throwable {
		FileInputStream fis = new FileInputStream(filename);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		int rCount = sh.getPhysicalNumberOfRows();
		int cCount = sh.getRow(0).getLastCellNum();
		System.out.println(rCount+"    "+cCount);
		for (int row = 0; row < rCount; row++) {
			for (int cell = 0; cell < cCount; cell++) {
				Cell cl = sh.getRow(row).getCell(cell);
				System.out.print(cl); System.out.print("    ");
				
			}System.out.println();
			
		}
	}
	
	
}