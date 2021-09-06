package Test;

import java.math.BigInteger;

public class Test06 {

	public static void main(String[] args) {

		//		 Q6.Test06.java
		//		1! ~ 99! 까지 전체 결과를 출력하시오.
		//		1! (1 팩토리얼) = 1
		//		2! (2 팩토리얼) = 1 * 2 = 2
		//		3! (3 팩토리얼) = 1 * 2 * 3 = 6
		//		4! (4 팩토리얼) = 1 * 2 * 3 * 4 = 24
		//		...
		//		n!: (n-1) * n
		//
		//		ex)
		//		1! = 1
		//		2! = 2
		//		3! = 6
		//		4! = 24
		//		5! = 120
		//		...
		//		99!

		
		BigInteger result = new BigInteger("1");
		for(int i=1; i<100; i++) {
			result = result.multiply(new BigInteger(String.valueOf(i)));
			System.out.println(i+"! "+" = " + result);
		}
		
	}
}
