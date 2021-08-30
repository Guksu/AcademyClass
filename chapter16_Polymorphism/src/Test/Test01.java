package Test;

class Employee{
	String name ,dept;

	public Employee(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}
	
	public int pay() {
		return 0;
	}
	
	public void output() {
		System.out.println("name :"+ name);
		System.out.println("dept :"+ dept);
	}
}

class SalaryWorker extends Employee{
	int salary;

	public SalaryWorker(String name, String dept, int salary) {
		super(name, dept);
		this.salary = salary;
	}
	@Override
	public int pay() {
		return salary;
	}
	
	@Override
	public void output() {
		super.output();
		System.out.println("pay :"+ pay());
	}
}

class SalesWorker extends SalaryWorker{
	int salesVolume;
	double salesIncentive;
	
	public SalesWorker(String name, String dept, int salary) {
		super(name, dept, salary);
	}
	
	public int pay() {
		return super.pay() + salesPay();
	}
	
	public int salesPay() {
		return (int)(salesVolume*salesIncentive);
	}
	
	public void setSalesVolume(int salesVolume) {
		this.salesVolume = salesVolume;
		
		if (salesVolume >=1000) {
			setSalesIncentive(0.1);
		}else if (salesVolume >=500) {
			setSalesIncentive(0.05);
		}else {
			setSalesIncentive(0.01);
		}
	}
	
	public void setSalesIncentive(double salesIncentive) {
		this.salesIncentive = salesIncentive;
	}
	
	public void output() {
		super.output();
		System.out.println("salesPay: "+ salesPay());
		System.out.println("pay: "+ pay());
	}
}

class PartTimeWorker extends Employee{
	int workTime, payPerHour;

	public PartTimeWorker(String name, String dept, int workTime, int payPerHour) {
		super(name, dept);
		this.workTime = workTime;
		this.payPerHour = payPerHour;
	}
	
	public int pay() {
		return workTime*payPerHour;
	}
	
	public void output() {
		super.output();
		System.out.println("pay :"+ pay());
	}
}

public class Test01 {
	public static void main(String[] args) {
		
		//		Q1.Test01.java
		//
		//		Employee 클래스			필드 : String name, String dept
		//								메소드 : Constructor, int pay(), void output()
		//		SalaryWorker 클래스		필드 : int salary
		//								메소드 : Constructor, int pay(), void output()
		//		SalesWorker 클래스		필드 : int salesVolume, double salesIncentive(1000이상 10퍼/ 500이상 5퍼 / 나머지 1퍼)
		//								메소드 : Constructor, int pay(), void output(),
		//										 int salesPay(),
		//										 void setSalesVolume(salesVolume), void setSalesIncentive(salesIncentive)
		//		PartTimeWorker 클래스	필드 : int workTime, int payPerHour
		//								메소드 : Constructor, int pay(), void output()
		//		★
		//		SalaryWorker extends Employee
		//		SalesWorker extends SalaryWorker
		//		PartTimeWorker extends Employee
		
		Employee[] emp = new Employee[3];
		
		emp[0] = new SalaryWorker("k", "K1", 1000);
		emp[1] = new SalesWorker("i", "I1", 2000);
		emp[2] = new PartTimeWorker("m", "M1", 9, 500);
		
		emp[0].output();
		System.out.println("============");
		((SalesWorker)emp[1]).setSalesVolume(500);
		emp[1].output();
		System.out.println("============");
		emp[2].output();
	}
}
