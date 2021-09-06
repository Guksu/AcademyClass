package Test;

import java.util.Calendar;

public class Test07 {

	public static void main(String[] args) {
		//		Q7.Test07.java
		//		현재 날짜를 StringBuffer, Calendar 클래스를 이용하여
		//		"2019년 10월 21일 월요일 오후 1시 10분" 과 같은 형식으로 완성하고 출력하시오.
		//		StringBuffer.append() 이용

		StringBuffer str = new StringBuffer();
		Calendar car = Calendar.getInstance();
		
		str.append(car.get(Calendar.YEAR)+"년 ");
		str.append((car.get(Calendar.MONTH)+1)+"월 ");
		str.append(car.get(Calendar.DATE)+"일 ");
		switch (car.get(Calendar.DAY_OF_WEEK)) {
		case 0: str.append("월요일");
		break;
		case 1: str.append("화요일");
		break;
		case 2: str.append("수요일");
		break;
		case 3: str.append("목요일");
		break;
		case 4: str.append("금요일");
		break;
		case 5: str.append("토요일");
		break;
		case 6: str.append("일요일");
		break;
		default:
			break;
		}
		if(car.get(Calendar.AM_PM) ==1) {
			str.append(" 오후 ");
		}else {
			str.append(" 오전 ");
		}
		str.append(car.get(Calendar.HOUR)+"시 ");
		str.append(car.get(Calendar.MINUTE)+"분");
		System.out.println(str);
	}
}
