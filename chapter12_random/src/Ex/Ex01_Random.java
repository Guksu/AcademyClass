package Ex;

import java.util.Random;

public class Ex01_Random {
	public static void main(String[] args) {

		Random random = new Random();
		
		System.out.println(random.nextInt());  
		System.out.println(random.nextInt(10));  //0~9 랜덤 출력
		System.out.println(random.nextInt(10)+1);  //1~10 랜덤 출력
		
		System.out.println(random.nextDouble()); // 0~0.999999까지 랜덤 출력
		System.out.println(random.nextDouble()*10); // 0~9.99999까지 랜덤 출력
	
		System.out.println((double)random.nextInt(6)+1); //1~6랜덤 출력(double)
		
		System.out.println(Math.random()*6+1);	//1~6랜덤 출력(double)   //Math.random은 기본적으로 0~1사이의 실수를 출력한다..
	}
}
