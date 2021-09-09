package Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test02 {
	public static void main(String[] args) {
//		Q2. Test02.java
//		로또 & 빙고 (빙고가 어려우면 로또부터 해보기)
//		Set을 이용하여 5 X 5 Bingo 배열을 생성하시오. (1 ~ 25)
//		Set에 랜덤 생성 -> Bingo 2차원 배열에 저장 
		
		
		//왜 무작위가 아닌가 ?
		///////////////로또///////////////////
		Set<Integer> set1 = new HashSet<>();
		for(int i =0; set1.size()<45; i++) {
			set1.add(i+1);
		}
		Iterator<Integer> itr1 = set1.iterator();
		
		for(int i =0; i<8; i++) {
			System.out.println(itr1.next());
		}
		
		System.out.println("=================");
		
		///////////////빙고///////////////////
		Set<Integer> set2 = new HashSet<>();
		int[][] bingo = new int[5][5];
		
		for (int i =0; set2.size()<25; i++) {
			set2.add(((int) (Math.random()*25))+1);
		}
		

		Iterator<Integer> itr2 = set2.iterator();
		
		for(int i=0; i<bingo.length; i++) {
			for(int z= 0; z<bingo[i].length; z++) {
				bingo[i][z] = itr2.next();
				System.out.print((bingo[i][z] <10? "  " :" ")+bingo[i][z]+"");
			}
			System.out.println();
		}
	}
}
