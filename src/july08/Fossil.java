package july08;

public class Fossil implements Watch{

	

	@Override
	public String giveWatch() {
		// TODO Auto-generated method stub
		return "Fossil";
	}
	public static void main(String[] args) {
		Fossil f1=new Fossil();
	    System.out.println(f1.giveWatch());

	}

}
