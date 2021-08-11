package org.min.ex;

public class Ex03_operator02 {
	public static void main(String[] args) {

		//shift연산자
		int a = 8;
		System.out.println(a<<1);  //왼쪽으로 한 칸 이동하겠다
		System.out.println(a>>1);  //오른쪽으로 한 칸 이동하겠다.
		//컴퓨터는 2진수 이기 때문에 <왼쪽>2^(n+3)/2^(n+2)/2^(n+1)/2^<오른쪽>
		//따라서 왼쪽으로 이동시 한 칸 당 2배가 늘어나고 오른쪽으로 이동하면 그 반대이다.
	
		//증감
		int b =10;
		System.out.println(b++);  	//  b= b+1  //출력 후 증감
		System.out.println(++b);	//  b+1 = b //증감 후 출력
	}
}
