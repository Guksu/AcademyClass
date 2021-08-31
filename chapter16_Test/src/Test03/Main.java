package Test03;

public class Main {
	public static void main(String[] args) {
		//		Q. 주어진 데이터 내의 
		//		"HTML5"과 "하이브리드앱"라는 단어가 몇번 노출되는 지
		//		노출 횟수를 resultNum이라는 배열명으로 저장하여 출력
		//
		//	2) DataClass
		//		배열 이용하여 값저장
		//	3) MainClass
		//		데이터를 받아서 데이터 처리
		//		
		//	+OperClass를 추가하여 처리부분 가능b

		Data data = new Data();
		int[] resultNum = new int[2];
		String[] sp = data.str.split(" ");  // 데이터의 문자를 빈공간을 기준으로 나누는 코드
		
		String key1 = "HTML5";
		String key2 = "하이브리드앱";
		
		for(int i =0; i<sp.length; i++) {
			if(sp[i].contains(key1)) {
				resultNum[0]++;
			}
			if(sp[i].contains(key2)) {
				resultNum[1]++;
			}
		}
		
		System.out.println(resultNum[0]);
		System.out.println(resultNum[1]);
	}
}
