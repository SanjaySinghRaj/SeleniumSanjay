package july08;

public class Tissot {

	public static void main(String[] args) {
		Watch w1=new Watch() {
			
			@Override
			public String giveWatch() {
				// TODO Auto-generated method stub
				return "Tissot Warch";
			}
		};
		String s1=w1.giveWatch();
		System.out.println(s1);

	}

}
