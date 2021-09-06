package Ex;

public class Ex05_object {
	public static void main(String[] args) {

		String a = "apple";
		String b = "apple";
		//같은 저장공간을 공유하므로 (참조형태) 둘은 같다고 판단된다
		System.out.println(a == b ? "apple 1" : "apple 2");
		System.out.println("============");
		String c = new String("apple");
		String d = new String("apple");
		System.out.println(c == d ? "apple 1" : "apple 2");
		//split()
		System.out.println("==============");
		String sn = "00000-12345";
		String[] snArr = sn.split("-");
		//향상된 for문
		for(String i : snArr) {
			System.out.println(i);
		}
		System.out.println("==============");
		String num = "010-1111-1111";
		String[] numArr = num.split("-");
		//일반 for문
		for(int i =0; i<numArr.length; i++) {
			System.out.println(numArr[i]);
		}
		System.out.println("==============");
		String today = "2021.09.06";
		String[] ymd = today.split("\\."); //.은 특수문자이므로 \\를 붙인다
		// 특수문자 종류 : | ? * () [] { ] \
		for(String arr : ymd) {
			System.out.println(arr);
		}
		System.out.println("==============");
		//String.join("추가할 문자", "대상 arr 혹은 list")
		System.out.println(String.join("-", ymd));
		
		//정수 ->문자
		//String.valueOf(num);
		//Integer.toString(num);
		System.out.println("==============");
		//substring()
		String phone = "010-4545-7878";
		System.out.println(phone.substring(0, 3));
		System.out.println(phone.substring(4, 8));
		System.out.println(phone.substring(9));
	}
}
