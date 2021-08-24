package Ex;

public class Ex03_TeamMain {
	public static void main(String[] args) {

		Ex03_Team man1 = new Ex03_Team("kim");				
		man1.output();
		Ex03_Team man2 = new Ex03_Team("mik");
		man2.output();
		System.out.println("전체팀원"+Ex03_Team.count+"명");
	}
}
