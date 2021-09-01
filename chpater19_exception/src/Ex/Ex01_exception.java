package Ex;

import java.util.Scanner;

public class Ex01_exception {
	public static void main(String[] args) {

		//모든 예외는 java.lang.Exception 클래스로 처리할 수 있다
		
		//예외처리형식
		//		trt {    

		//			예외가 발생할 가능성이 있는 구역

		//		} catch (예외를 받는 매개변수) {

		//			받는 예외를 처리하는 구역
		//		
		//		} finally(<-이건  필수는 아님) {

		//			예외유무를 떠나 무조건 실행되는 구역
		//		}

		
		//정수를 0으로 나눌 수 없는 경우 발생하는 에러를 확인하는 코드
		Scanner sc = new Scanner(System.in);
		int num1 , num2;
	
		try {
			num1=sc.nextInt();
			num2=sc.nextInt();
			System.out.println((num1+num2));
			System.out.println((num1-num2));
			System.out.println((num1*num2));
			System.out.println((num1/num2));
			
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다");
			
		}finally {
			sc.close();
		}
		
	}
}
