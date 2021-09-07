package Test;

public class Test01 {

	public static void main(String[] args) {
		//		Q1. Test01. java
		//		Run - Run Configuration - arguments 를 통해 정수 2개를 전달하면 해당 정수의 사칙연산 결과를 출력하시오.
		//		★
		//		catch에 여러 예외처리를 할 수 있다.
		//		ArrayIndexOutOfBoundsException : 입력을 안하거나 배열길이 이상으로 입력했을떄
		//		ArithmeticException: / by zero : 0 이입력되었을때
		//		NumberFormatException : 정수만 입력해야되는데 실수 입력했을때
		//		 나머지는 exception 으로 처리

		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		try {
			System.out.println(num1+num2);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}catch (ArithmeticException c) {
			System.out.println(c.getMessage());
		}catch (NumberFormatException d) {
			System.out.println(d.getMessage());
		}catch (Exception f) {
			System.out.println(f.getMessage());
		}
	}
}
