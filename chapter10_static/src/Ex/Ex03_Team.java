package Ex;

public class Ex03_Team {

	String name;
	static int count = 0;
	
	public Ex03_Team(String name) {
		this.name = name;
		count++;
	}
	
	void output() {
		System.out.println("팀원 "+ name);
		System.out.println("팀원수 "+ count+"명");
	}
}
