package Test01;

public class Main {

	public static void main(String[] args) {
		Student stu = new Student("kim", 28, "k");
		Worker wk = new Worker("nim", 30, "dev");
		
		stu.output();
		wk.output();
	}
}
