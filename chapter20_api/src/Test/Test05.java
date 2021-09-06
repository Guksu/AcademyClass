package Test;

public class Test05 {

	public static void main(String[] args) {
//		Q5.Test05.java
//		성(lastName), 이름(firstName)을 각각 입력 받아
//		하나의 이름(fullName)을 완성하시오. StringBuffer 클래스를 이용하시오.
//		위의 방식으로 두 이름을 입력 받아 두 이름(fullName)의 동등 비교를 진행하시오.
//b

		StringBuffer str1 = new StringBuffer();
		str1.append("김");
		str1.append("종민");
		StringBuffer str2 = new StringBuffer();
		str2.append("김");
		str2.append("민종");
		
		System.out.println(str1.equals(str2)? "같은사람":"다른사람");
	}
}
