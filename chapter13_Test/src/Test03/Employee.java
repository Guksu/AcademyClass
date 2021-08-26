package Test03;

public class Employee {
//	Q3. Test03.java 상속 관계로 구현하시오.
//	SalaryWorker.java			- 필드 : String name, String dept, int salary
//								- 메소드 : Constructor, int pay(), output()	
//	SalesWorker.java			- 필드 : String name, String dept, int salary , double salesIncentive
//								- 메소드 : Constructor, int pay(), output(), int salesPay()
//	PartTimeWorker.java			- 필드 : String name, String dept, int workTime, int payPerHour
//								- 메소드 : Constructor, int pay(), output()
//	→ 부모클래스는 알아서 만들어보자!(Employee)
//	SalaryWorker extends Employee
//	SalesWorker extends SalaryWorker
//	PartTimeWorker extends Employee
//		
//	String name : 이름
//	String dept : 부서
//	int salary : 기본급(월급)
//	double salesIncentive : 판매 인센티브
//	int workTime : 근무시간
//	int payPerHour : 시급
	
	String name,dept;
	
	public Employee(String name, String dept) {
		super();
		this.name = name;
		this.dept = dept;
	}
	
}
