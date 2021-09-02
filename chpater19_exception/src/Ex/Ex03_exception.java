package Ex;

public class Ex03_exception {
	public static void main(String[] args) {

		String data1 = "100";
		String data2 = "a100";
		
		try {
			System.out.println(Integer.parseInt(data1));
			System.out.println(Integer.parseInt(data2));
		}catch (NumberFormatException e) {
			System.out.println("형 변환 실패!");
		}
		
	}
}
