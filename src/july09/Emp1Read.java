package july09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class Emp1Read {

	public static void main(String[] args) throws Exception {
		//Emp1 emp = new Emp1();
		FileInputStream fi = new FileInputStream("data2.txt");
		ObjectInputStream obj1 = new ObjectInputStream(fi);
		Object o1= obj1.readObject();
		if(o1 instanceof Emp1) {
			Emp1 o2=(Emp1)o1;
			System.out.println(o2.id+" "+o2.name+" "+o2.sec);
		}
		obj1.close();
		fi.close();

	}

}
