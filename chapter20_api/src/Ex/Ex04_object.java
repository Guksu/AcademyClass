package Ex;

public class Ex04_object {
	public static void main(String[] args) {

		for(int i =0; i<10; i++) {
			System.out.println(i);

			try {
				if(i ==5) {
					System.exit(i);
				}
			} catch (SecurityException e) {
				e.printStackTrace();
			}
		}

	}
}
