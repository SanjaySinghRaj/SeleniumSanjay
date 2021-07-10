package july09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class WriteData {

	public static void main(String[] args) throws IOException {
		Employee e1=new Employee();
		e1.id=07;
		e1.name="Happy";
		e1.salary=10000;
		e1.dept="Testing";
		e1.profile="sste";
		e1.phone=852369741;
		FileOutputStream fi=new FileOutputStream("data.txt");
		ObjectOutputStream os = new ObjectOutputStream(fi);
		os.writeObject(e1);
		fi.close();
		os.close();
		System.out.println("App End");

	}

}
