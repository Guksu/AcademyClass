package Ex;

import java.math.BigInteger;

public class Ex08_BIg_Number {
	public static void main(String[] args) {
		
		//최댓값처럼 기울어진건 상수
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		//long타입 이상/이하 사용 가능
		BigInteger a = new BigInteger("1234567890123456789");
		BigInteger b = new BigInteger("12345678901234567891231231");
		System.out.println(BigInteger.ZERO);
		System.out.println(BigInteger.ONE);
		System.out.println(BigInteger.TEN);
		System.out.println(a.add(b));
		System.out.println(a.subtract(b));
		System.out.println(a.multiply(b));
		System.out.println(a.divide(b));
		//BigDecimal은 실수의 소수 자리를 제한없이 사용 가능
	}
}
