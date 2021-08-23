package Test03;

public class Grade {

	int kor, eng, mat;
	double average;
	char grade;

	public Grade(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	double getAverage(){
		average =(double)(kor +eng + mat)/3;
		return average;
	}
	
	char getGrade() {
		if(average>=90) {
			grade = 'A';
		}else if(average>=80) {
			grade = 'B';
		}else if(average>=70) {
			grade = 'C';
		}else if(average>=60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		return grade;
	}
}
