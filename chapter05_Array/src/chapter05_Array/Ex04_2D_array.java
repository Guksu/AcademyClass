package chapter05_Array;

public class Ex04_2D_array {
	public static void main(String[] args) {

		int[][] arr = new int[3][4];   // 3행 4열
		int[][] arr2 = {{1,2,3,4}, {1,2,3}}; //2행n열

		for(int i=0; i<arr2.length;i++) {

			for(int j=0; j<arr2[i].length; j++) {
				System.out.print(arr2[i][j]+"\t");
			}
		System.out.println("");
		}
	}
}
