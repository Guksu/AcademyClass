package Test;

class Score {
	private int kor, eng, mat;

	public Score(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	@Override
	public String toString() {
		return "국어:"+kor +",영어 :"+eng+",수학:"+mat;
	}

	@Override
	public boolean equals(Object obj) {
		 if(obj != null && obj instanceof Score) {
			 return kor ==((Score)obj).kor &&
					eng ==((Score)obj).eng &&
					mat ==((Score)obj).mat ;
		 }else {
			 return false;
		 }
	}
	
}

public class Test01 {

	public static void main(String[] args) {
//		Q1. Test01.java
//		Score 클래스 					필드 : int kor, eng, mat
//									메소드 : Constructor, toString(), equals()
//		Score 인스턴스를 2개 생성하고, 동등 비교(세과목이 모두 같으면 동등) 결과 출력
//		각 인스턴스 정보는 toString 메소드를 통해 출력

		Score sr1 = new Score(80, 80, 80);
		Score sr2 = new Score(80, 80, 80);
	
		System.out.println(sr1.toString());
		System.out.println(sr1.equals(sr2));
	}

}
