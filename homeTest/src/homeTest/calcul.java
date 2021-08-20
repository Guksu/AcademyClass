package homeTest;

public class calcul {

//		======return이 없는 경우======	
//		void sum(int a,int b){		
//			System.out.println(a+b);
//		}
//		
//		void minus(int a , int b) {
//			System.out.println(a-b);
//		}
//		
//		void multiplication(int a , int b) {
//			System.out.println(a*b);
//		}
//		
//		void division(int a , int b) {
//			System.out.println(a/b);
//		}

//     =======return값이 있는 경우======	
		int sum(int a , int b) {
			return a+b;
		}
		
		int minus(int a , int b) {
			return a-b;
		}
		
		int multiplication(int a , int b) {
			return a*b;
		}
		
		double division(int a , int b) {
			return (double)a/b;
		}

}
