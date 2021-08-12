package org.min.ex;

public class Ex06_continue {
	public static void main(String[] args) {

		//Q.1~10중 3의 배수는 제외
		for(int i=1; i<11; i++ ) {
			if(i%3 ==0) { //i를3으로 나눈 나머지가 0이면
				continue;  //그 값은 넘어간다는 의미
			}
			System.out.println(i);
		}
		System.out.println("----------");	
		
		//Q.1~10중 2의 배수는 제외
		int num1 = 0;
		while(num1<10) {
			num1++;
			
			if(num1 % 2 ==0) {
				continue;
			}
			System.out.println(num1);
		}
	}
}
