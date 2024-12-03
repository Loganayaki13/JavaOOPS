package day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysToList {

	public static void main(String[] args) {
		
		
		
		String arr[]= {"apple","orange","banana","guva","grapes"};
		
		System.out.println("Using Arrays.asList()");
		
		List<String> aslist=Arrays.asList(arr);
		System.out.println(aslist);
		
		System.out.println("Using collection.addAll()");
		ArrayList<String> list = new ArrayList<String>();
		Collections.addAll(list, arr);
		System.out.println(list);
		
		
		System.out.println("Converting  List.newArrayList()");
        String[] array = list.toArray(new String[0]);
        
		System.out.println(Arrays.toString(array));
		
		
		
		
		
	}

}
