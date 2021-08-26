package Test02;

public class Main {

	public static void main(String[] args) {
		Notebook notebook = new Notebook("new", 100, 2020);
		Tablet tablet = new Tablet("old", 50, 20000, "apple");

		notebook.output();
		tablet.output();
	}
}
