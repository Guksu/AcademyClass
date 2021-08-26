package Test03;

public class SalesWorker extends SalaryWorker{

	 double salesIncentive;

	public SalesWorker(String name, String dept, int salary, double salesIncentive) {
		super(name, dept, salary);
		this.salesIncentive = salesIncentive;
	}
	 
	 int pay(int salary) {
		 return salary;
	 }
	 
	 int salesPay(int salesIncentive) {
		 return salesIncentive;
	 }
	 
	 void output() {
		 System.out.println("name :"+name);
		 System.out.println("dept :"+dept);
		 System.out.println("salary :"+salary);
		 System.out.println("salesIncentive :"+salesIncentive);
	 }
}
