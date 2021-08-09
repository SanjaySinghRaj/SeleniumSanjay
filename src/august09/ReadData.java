package august09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		String path ="D:\\demo1.xlsx";
		FileInputStream fis = new FileInputStream(path);
		//FileInputStream fis = new FileInputStream("D:\\demo1.xlsx");// if FileInputStream is not working properly so we create String path ="D:\\demo1.xlsx"; and pass path in FileInputStream(path).  
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Cell cl = sh.getRow(2).getCell(0);
		System.out.println(cl);

	}

}
