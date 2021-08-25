package ex;

public class Ex01_PersonMain {
	public static void main(String[] args) {

		Ex01_Person[] people = new Ex01_Person[3]; //배열선언
		
		for(int i =0; i<people.length; i++) {      //객체 생성
			people[i] = new Ex01_Person();
		}
		
		people[0].name = "kim";
		people[0].age = 28;
		people[0].height = 178;
		people[0].gender = '남';
		people[0].info();
	}
}
