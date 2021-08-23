package ex;

public class Ex02_BookMain {
	public static void main(String[] args) {
		
		Ex02_Book book1 = new Ex02_Book("A","B",200);
		Ex02_Book book2 = new Ex02_Book("C",200);
		
		book1.output();
		book2.output();
	}
}
