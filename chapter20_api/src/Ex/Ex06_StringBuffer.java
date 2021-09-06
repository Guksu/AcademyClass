package Ex;

public class Ex06_StringBuffer {
	public static void main(String[] args) {

		//StringBuffer는 문자열을 만들어내는 경우 사용한다
		StringBuffer sb1 = new StringBuffer("apple");
		StringBuffer sb2 = new StringBuffer("apple");
	
		System.out.println("sb1주소값"+sb1.hashCode());
		System.out.println("sb1주소값"+sb2.hashCode());
		//기본버퍼 크기
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("Hello");
		sb.append(" world");
		//chainning기법
		System.out.println(sb);
		StringBuffer phone = new StringBuffer();
		phone.append("010-4444-7777");
		phone.delete(0, 3);
		System.out.println(phone);
		phone.deleteCharAt(0);
		System.out.println(phone);
				
	}
}
