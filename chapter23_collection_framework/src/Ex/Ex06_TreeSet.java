package Ex;

import java.util.TreeSet;

public class Ex06_TreeSet {
	public static void main(String[] args) {

		TreeSet<String> set = new TreeSet<String>();
		
		set.add("Airplane");
		set.add("Apple");
		set.add("Area");
		set.add("Dance");
		set.add("Disc");
		
		System.out.println(set.headSet("B"));
		System.out.println(set.subSet("A", "Aq"));
		System.out.println(set.tailSet("C"));
		
		TreeSet<Integer> set2 = new TreeSet<Integer>();
		set2.add(10);
		set2.add(20);
		set2.add(30);
		set2.add(40);
		set2.add(50);
		
		System.out.println(set2.headSet(15));
		System.out.println(set2.subSet(15,45));
		System.out.println(set2.tailSet(35));
	}
}
