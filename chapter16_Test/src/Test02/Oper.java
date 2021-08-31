package Test02;

public class Oper {

	Data data = new Data();
	int date ;
	
	public int avgHireDate() {
		for(int i =0; i<data.info.length; i++) {
			date +=(2021-Integer.parseInt(data.info[i].hireDate.substring(0,4)));
		}
		return date/(data.info.length);
	}
		
	public void search(int searchYear) {
		for(int i=0; i<data.info.length; i++) {
			if(searchYear == Integer.parseInt(data.info[i].hireDate.substring(0,4))){
				System.out.println(searchYear+"년도에 입사한 사원 : "+data.info[i].eName);
			}
		}
	}
}
