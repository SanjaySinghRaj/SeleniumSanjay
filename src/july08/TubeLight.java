package july08;

public class TubeLight {

	public static void main(String[] args) {
		Light l1=new Light() {
			
			@Override
			public String giveLight() {
				// TODO Auto-generated method stub
				return "TubeLight";
			}
		}; 
		String r1=l1.giveLight();
			System.out.println(r1);
	}

}
