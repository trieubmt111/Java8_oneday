package training.Lambda_expressions;

public class Lambda_systax {
	interface SUM {
		int ad(int a, int b);
	}

	interface SUM1 {
		public int a();
	}

	interface SUM2 {
		public void a(String s);
	}

	public static void main(String[] args) {
		SUM ad1=(int a, int b)->(a*b);
		System.out.println(ad1.ad(10,30));
		
		SUM ad2= (a,b) -> (a-b);
		System.out.println(ad2.ad(50,20));
		
		SUM1 ad3 = () -> { return 99;} ;
		System.out.println(ad3.a());
//		sum2 s = (String s) -> { 
//			System.out.println(s);
//			return;
//		};
	}

}
