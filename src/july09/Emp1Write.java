package july09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Emp1Write {

	public static void main(String[] args) throws IOException {
		Emp1 emp = new Emp1();
		emp.id=2;
		emp.name="sundra";
		emp.sec='a';
		FileOutputStream fi=new FileOutputStream("data2.txt");
		ObjectOutputStream obj1=new ObjectOutputStream(fi);
		obj1.writeObject(emp);
		obj1.close();
		fi.close();
		System.out.println("App End");

	}
	

}
