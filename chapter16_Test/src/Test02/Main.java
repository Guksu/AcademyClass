package Test02;

public class Main {
	public static void main(String[] args) {
		//		Q. 주어진 데이터 내의 
		//		원하는 년도의 입사한 사원들의 이름,
		//		현재년도를 기준으로 평균 재직년수를 출력 
		//		
		//	1) InfoClass
		//		필드 : int empNo(사번), String eName(사원명), String job(직책), String hireDate(입사일)
		//				int sale(급여), int commission(성과급), int deptNo(부서번호)
		//		생성자 : 기본 생성자 및 데이터 셋팅 생성자
		//	2) DataClass
		//		필드 : InfoClass[]
		//		생성자 : 기본생성자 - InfoClass 객체에 생성
		//	3) MainClass
		//		(1) OperClass를 이용한 메소드 실행
		//	4) OperClass
		//		메소드 : avgHireDate(InfoClass[]) - 평균 재직 년수
		//				search(InfoClass[], searchYear) - 사원 출력
		//	
		
		Oper person = new Oper();
		
		System.out.println("평균 재직년수 :"+ person.avgHireDate()+"년");
		System.out.println("==============");
		person.search(2007);
	}
}
