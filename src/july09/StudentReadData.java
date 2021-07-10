package july09;

import java.io.FileInputStream;

import java.io.ObjectInputStream;

public class StudentReadData {

	public static void main(String[] args) throws Exception {
		FileInputStream f1=new FileInputStream("data1.tex");
		ObjectInputStream o1=new ObjectInputStream(f1);
		Object o =o1.readObject();
		if(o instanceof Student) {
			Student s1=(Student) o;
			System.out.println(s1.id+" "+s1.name+" "+s1.section);
		}
		f1.close();
		o1.close();

	}

}
