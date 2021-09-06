package Ex;

public class Ex07_Wrapper {
	public static void main(String[] args) {
		Integer a = new Integer(10);
		Integer b = new Integer(10);
		
		System.out.println("저장된 위치 비교" + (a==b));
		System.out.println("저장된 값 비교" + a.equals(b));
		//a<b =-1  | a>b = 1 | a=b = 0
		System.out.println("저장된 값 크기 비교" + a.compareTo(b));

	}
}
