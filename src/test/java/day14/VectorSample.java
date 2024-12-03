package day14;

import java.util.Vector;

public class VectorSample {

	public static void main(String[] args) {

		Vector<String> names = new Vector<String>();

		names.add("Logu");
		names.add("Anand");
		names.add("Saindhanya");
		names.add("Priya");
		System.out.println(names.size());
		names.remove(0);
		System.out.println(names);

		System.out.println("Using for each");
		for (String name : names) {
			System.out.println(name);

		}
		System.out.println(names.get(1));
	}

}
