package july08;

public class Hero {

	public static void main(String[] args) {
		Bike b1=new Bike() {
			
			@Override
			public String giveBike() {
				// TODO Auto-generated method stub
				return "HeroHonda";
			}
		};
		String s1 = b1.giveBike();
		System.out.println(s1);

	}

}
