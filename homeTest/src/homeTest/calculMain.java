package homeTest;

public class calculMain {

	public static void main(String[] args) {
		
		calcul ca = new calcul();
		
		
//		=====return값이 없는 경우 =====
//		ca.sum(4,5);
//		ca.minus(4, 6);
//		ca.division(10, 2);
//		ca.multiplication(5, 5);
		
//	     =======return값이 있는 경우======			
		int s =ca.sum(2, 3);
		int m =ca.minus(5, 8); 
		double d =ca.division(10, 2);
		int ml = ca.multiplication(5, 5);
		System.out.println(s);
		System.out.println(m);
		System.out.println(d);
		System.out.println(ml);
	
		
	}
}
