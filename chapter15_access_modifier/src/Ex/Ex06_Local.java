package Ex;

public class Ex06_Local {

	private String name, sn;
	private int age;
	private boolean isKorean;
	
	public Ex06_Local() {}
	
	public Ex06_Local(String name, int age) {
		this.name = name;
		this.age = age;	
	}
	
	public Ex06_Local(String name, int age, String sn) {
		this.name = name;
		this.age = age;
		this.sn = sn;
		if(sn != null) {
			isKorean = (sn.charAt(7)<='4') ? true : false;
		}else {
			isKorean = false;
		}
	}

	public void output() {
		System.out.println("이름 :"+ name);
		System.out.println("나이 :"+ age);
		System.out.println("주민번호 :"+ sn);
		System.out.println("국적 :"+ (isKorean? "한국인" : "외국인"));
	}
}
