package day14;

import java.util.LinkedList;

public class LinkedListSample {

	public static void main(String[] args) {

		LinkedList<String> names = new LinkedList<String>();
		names.add("Logu");
		names.add("Anand");
		names.add("Saindhanya");
		names.add("Priya");
		System.out.println(names);
		
		System.out.println(" ");

		System.out.println("using for-each loop");
		for (String name : names) {
			System.out.println(name);

		}
		names.remove("Priya");
		System.out.println(names);
		names.removeFirst();
		names.removeLast();
		System.out.println(names);
	}

}
