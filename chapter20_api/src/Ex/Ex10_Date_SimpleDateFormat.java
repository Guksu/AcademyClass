package Ex;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex10_Date_SimpleDateFormat {
	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date);
		
		//년 :yy, yyyy
		//월 :M,MM
		//일:d,dd
		//요일 :E
		//오전 오후: a
		//시 : hh(12시각제),HH(24시각제)
		//분:mm
		//초:ss
		
		SimpleDateFormat  format1, format2, format3;
		format1 = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		System.out.println(format1.format(date));
		format2 = new SimpleDateFormat("yy/MM/dd");
		System.out.println(format2.format(date));
		format3 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		System.out.println(format3.format(date));
	}
}
