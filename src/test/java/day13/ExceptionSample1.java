package day13;

import java.util.Scanner;

public class ExceptionSample1 {

	// we have to execute all the critical and normal statement means, we can use try catch block separately for each critical/normal statement
		int a;
		int b;
		int c;

		int[] arr = new int[5];
		
		String str = null;
		
		public void div() {
			
			try {
				
			System.out.println(str.length());
			
			} catch (Exception e) {
				
				System.out.println("Exception occured, please check");
				e.printStackTrace();
				
			}
			
			try {
				
				c= a/b;
			}
			catch(ArithmeticException e) {
				
				c = a / 1;
				System.out.println("Please enter a value that is not 0");
				
				
				
			} 
			
			try{
				
				arr[5]=c;
				
			} catch(ArrayIndexOutOfBoundsException e) {
				
				arr[1]=c;
				System.out.println(arr[1]);
				System.out.println("Index is beyond the limit so adding in first position");
				
			} 
			
			System.out.println("The div value of a and b " +c);
		}
		
		public static void main (String[] args) {
			
			ExceptionSample1 obj = new ExceptionSample1();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value for a: ");
			obj.a=sc.nextInt();
			System.out.println("Enter the value for b: ");
			obj.b=sc.nextInt();
			obj.div();
		}

	}


