package Test;

public class Main {
	public static void main(String[] args) {

		System.out.println(Data.str.size()); //ArrayList의 크기를 알아보는 코드   // 현재는 생성자가 없으므로 초기화가 안 되서 배열의 크기는 0
		new Data();//Data클래스에서 사용할 변수가 없으므로 생성자만 사용  // 즉 객체를 생성해도 그 객체를 사용할 필요가 없으므로 생성자만 사용
		System.out.println(Data.str.size()); //ArrayList의 크기를 알아보는 코드
		//str은 static 이므로 객체 생성이  필요없다.
		
		Oper.sum();//sum은 static 형식이므로 객체 없이 사용가능
		System.out.println(Oper.PI);
	}
}
