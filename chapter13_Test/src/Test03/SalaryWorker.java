package Test03;

public class SalaryWorker extends Employee{

	int salary;

	public SalaryWorker(String name, String dept, int salary) {
		super(name, dept);
		this.salary = salary;
	}
	
	int pay(int salary) {
		return salary;
	}
	
	void output() {
		System.out.println("name :"+name);
		System.out.println("dept :"+dept);
		System.out.println("salary :"+salary);
	}
}
