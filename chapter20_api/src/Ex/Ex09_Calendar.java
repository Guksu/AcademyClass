package Ex;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex09_Calendar {
	public static void main(String[] args) {
		//Calendar는 추상클래스여서 객체를 생성할 수 없다
		//Calendar 클래스를 구현한 getInstance()를 사용하여 반환
		
		Calendar cal = Calendar.getInstance(); // 현재시간으로 자동 설정된다
		
		cal.set(1994, 05, 25);
		System.out.println(cal.get(Calendar.YEAR)+"년" + cal.get(Calendar.MONTH)+"월"+cal.get(Calendar.DATE)+"일");
		//java에선 월을 0~11월로 잡으므로 원하는 월을 구할땐 +1해야한다
		System.out.println("요일번호:"+cal.get(Calendar.DAY_OF_WEEK));//월 =1 ~~ 일 =7
		
		Calendar cal2 = Calendar.getInstance();
		Date now = cal2.getTime();
		SimpleDateFormat format1 = new SimpleDateFormat("a hh시 mm분 ss초");
		System.out.println(format1.format(now));
	}
}
