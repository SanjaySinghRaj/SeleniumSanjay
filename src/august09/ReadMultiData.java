package august09;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultiData {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		FileInputStream fis = new FileInputStream("D:\\demo1.xlsx");// if FileInputStream is not working properly so we create String path ="D:\\demo1.xlsx"; and pass path in FileInputStream(path).  
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
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
