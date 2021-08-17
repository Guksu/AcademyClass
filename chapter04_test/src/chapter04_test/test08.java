package chapter04_test;

import java.util.Scanner;

public class test08 {

	public static void main(String[] args) {
//		Q.Up-Down 게임
//		1 ~ 100 사이에서 임의의 숫자를 하나 결정한 뒤
//		해당 숫자를 맞추는 게임
//		입력 받은 숫자의 크기에 따라 "Up!", "Down!", "Answer!" 로 나눠서 출력하고
//		맞출때까지 몇 번 진행했는지 횟수도 함께 출력
//		실행 예)
//		입력 >> 30
//		Up!
//		입력 >> 40
//		Down!
//		입력 >> 35
//		Down!
//		입력 >> 33
//		Answer!
//		총 4회만에 성공!

		Scanner sc = new Scanner(System.in);
		System.out.println("답을 입력하시오");
		int answer = sc.nextInt();
		System.out.println("숫자를 입력하시오");
		int num = sc.nextInt();
		
		if(answer == num) {
			System.out.println("Answer!");// + +"번에 성공 !");
		}else {
			while(answer != num) {
				if (answer < num) {
					System.out.println("Down!");
				}else if (answer > num) {
					System.out.println("Up!");
				}
				sc.nextInt();
			}
			System.out.println("Answer!");//+ +"번에 성공 !");
		}
		sc.close();
	}
}
