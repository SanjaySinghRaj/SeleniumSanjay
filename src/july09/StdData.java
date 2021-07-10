package july09;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StdData {

	public static void main(String[] args) throws IOException {
		Student s1=new Student();
		s1.id=05;
		s1.name="ram";
		s1.section=5;
		FileOutputStream f1=new FileOutputStream("data1.tex");
		ObjectOutputStream o1 = new ObjectOutputStream(f1);
		o1.writeObject(s1);
		f1.close();
		o1.close();
		System.out.println("App Done");

	}

}
