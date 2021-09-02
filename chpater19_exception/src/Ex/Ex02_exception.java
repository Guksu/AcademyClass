package Ex;

public class Ex02_exception {
	public static void main(String[] args) {

		int[] arr = new int[3];

		try {
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;

			for(int i =0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("오류 발생 !!");
		}
	}
}
