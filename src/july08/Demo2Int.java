package july08;

public class Demo2Int {

	public static void main(String[] args) {
		IDemo i1=new IDemo() {
			
			@Override
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
		};
		System.out.println(i1.add(5, 10));

	}

}
