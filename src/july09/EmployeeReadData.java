package july09;
import java.io.FileInputStream;

import java.io.ObjectInputStream;

public class EmployeeReadData {

	public static void main(String[] args) throws Exception {
		FileInputStream f1=new FileInputStream("data.txt");
		ObjectInputStream o1=new ObjectInputStream(f1);
		Object o2=o1.readObject();
		if(o2 instanceof Employee) {
			Employee e=(Employee)o2;
			System.out.println(e.id+" "+e.name+" "+e.profile+" "+e.dept+" "+e.phone+" "+e.salary);
		}
		f1.close();
		o1.close();
				

	}

}
