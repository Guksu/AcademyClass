package Test;

import java.util.HashSet;
import java.util.Set;

public class Test02 {
	public static void main(String[] args) {
//		Q2. Test02.java
//		로또 & 빙고 (빙고가 어려우면 로또부터 해보기)
//		Set을 이용하여 5 X 5 Bingo 배열을 생성하시오. (1 ~ 25)
//		Set에 랜덤 생성 -> Bingo 2차원 배열에 저장 
		
		Set<Integer> set1 = new HashSet<>();
		for(int i =0; i<45; i++) {
			set1.add(i);
		}
		Set<Integer> set2 = new HashSet<>();
		for(int i =0; i<25; i++) {
			set2.add(i+1);
		}
		System.out.println(set1);
		System.out.println(set2);
	}
}
