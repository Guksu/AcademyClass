package Ex;

	//예외 클레스를 상속 받는 방법

class MyException extends Exception{
	private static final long serialVersionUID = 1L;  //이건 그냥 경고 없애려고 넣은 의미없는 코드
	
	public MyException(String message) {
		super(message);
	}
}
public class Ex05_exception {
	public static void main(String[] args) {

		try {
			throw new MyException("내가 만든 예외");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
