package Ex;


import java.util.Arrays;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		//Q, 임의값 6개(중복제거) ,입력받는 값6개를 비교하여 맞는 개수와 해당 번호를 출력(로또45번호까지)

		Scanner sc = new Scanner(System.in);
		int[] num = new int[6];
		int[] rotto = new int[6];
		
		//로또 번호 출력//
		for(int i=0; i<rotto.length; i++) {
			rotto[i] = (int)(Math.random()*44+1);
			//중복제거//
			for(int j=0; j<i; j++) {
				if(rotto[i]== rotto[j]) {
					i--; //다시 돌아간다는 뜻(중복번호 이전의i로 돌아간다)
				}
			}
		}
		
		Arrays.sort(rotto);  // 오름차순 정렬

		//입력 번호 출력//
		System.out.println("6개 숫자를 입력하시오");
		for(int i =0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		Arrays.sort(num);  // 오름차순 정렬
		
		//당첨확인//
		System.out.println("로또번호 :"+ Arrays.toString(rotto));
		System.out.println("입력번호:"+ Arrays.toString(num));
		
		int sameNum =0;
		String same= "";
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<rotto.length; j++)
			if(num[i] == rotto[j]) {
				same += Integer.toString(num[i])+" ";
				sameNum++;
			}
		}
		System.out.println("당첨 번호 갯수 :" +sameNum);
		System.out.println("일치 번호 :"+same);
		sc.close();
	}
}
