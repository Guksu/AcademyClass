package Test03;

public class PartTimeWorker extends Employee{

	int workTime, payPerHour;

	public PartTimeWorker(String name, String dept, int workTime, int payPerHour) {
		super(name, dept);
		this.workTime = workTime;
		this.payPerHour = payPerHour;
	}
	
	int pay() {
		return workTime*payPerHour;
	}
	
	void output() {
		 System.out.println("name :"+name);
		 System.out.println("dept :"+dept);
		 System.out.println("pay :" +pay());
	}
}
