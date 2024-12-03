package day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListSample {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Object> names1 = new ArrayList<Object>();// when you want to have combination of two OR more  datatypes use OBJECT wrapper class

		names.add("Logu");
		names.add("Anand");
		names.add("Saindhanya");
		names.add("Priya");
		//names1.add(1); // integer data types

		System.out.println(names);

		System.out.println(" ");

		System.out.println("using for-each loop");
		//for (Object name : names) 
		for (String name : names) 
		{
			System.out.println(name);

		}
		System.out.println(" ");
		System.out.println("Using for loop :");

		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		System.out.println(" ");
		System.out.println("Using iterator");// to fetch the element

		Iterator<String> itr = names.iterator();
		//Iterator<Object> itr = names.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		// access the element
		System.out.println(" ");
		System.out.println("Get and Set method");
		System.out.println("Before :" + names.get(1));
		names.set(1, " AnandLogu");
		System.out.println("After :" + names.get(1));

		// sorting

		System.out.println("Sorting");
		System.out.println("Before sorting " + names);
		Collections.sort(names);
		System.out.println("After sorting " + names);

	}

}
