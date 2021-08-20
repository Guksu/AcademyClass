package homework;

public class LocalMain {

	public static void main(String[] args) {
		Ex02_Local person1 = new Ex02_Local();  //한국인
		Ex02_Local person2 = new Ex02_Local();	//외국인
		Ex02_Local person3 = new Ex02_Local();	//이상한 주민번호
		
		person1.setLocalInfo("Kim" , 28 , "111111-111111");
		person2.setLocalInfo("Jong" , 28);
		person3.setLocalInfo("Min" , 28 , "가나다라마바사아자차카");
		
		person1.output();
		System.out.println("===========");
		person2.output();
		System.out.println("===========");
		person3.output();
	}

}
