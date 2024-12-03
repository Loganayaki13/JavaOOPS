package day14;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		
		Stack<String> stk=new Stack<String>();
		
		//to add
		stk.push("apple");
		stk.push("orange");
		stk.push("banana");
		stk.push("guva");
		
		System.out.println("Stack :"+stk);
		
		stk.pop();// it will remove last element
		System.out.println(stk);
		System.out.println(stk.peek());//it will retrieve last element
		
		int location=stk.search("orange"); // location will start from 1
		System.out.println(location);
		
		
		

	}

}
