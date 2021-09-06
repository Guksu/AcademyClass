package Ex;

import java.util.Calendar;

public class Ex11_Dday {
	public static void main(String[] args) {

		Calendar ca1 = Calendar.getInstance();
		Calendar ca2 = Calendar.getInstance();
		
		ca1.set(2021,Calendar.DECEMBER,25);
		//밀리초 단위로 계산
		long Millisc = ca1.getTimeInMillis() - ca2.getTimeInMillis();
		//1000밀리초 = 1초 ,60초 =1분, 60분=1시간, 24시간 = 1일
		long d_day = (Millisc/1000) / (60*60*24); //밀리초를 초 단위로 변환것을 분,시간,일단위로 나누어준다
		System.out.println(d_day);
	}
}
