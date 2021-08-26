package Test01;

public class Worker extends Human{
	String job;

	public Worker(String name, int age, String job) {
		super(name, age);
		this.job = job;
	}
	
	void output() {
		super.output();
		System.out.println("job :" +job);
	}
}
