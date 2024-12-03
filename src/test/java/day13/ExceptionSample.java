package day13;

import java.util.Scanner;

public class ExceptionSample {

	int a;
	int b;
	int c;
    int[] arr=new int[5];
    String str=null;
	public void div() {

		try {
			// here we can mention critical statement in the try block like when we come to know example code will get error/
						//know it will throw error that code we can mention in the try block
			//and we cant use two critical statement in the single try block , either you can use another catch block


			c = a / b; 
			arr[1]=c;
			System.out.println(str.length());
		} catch (ArithmeticException e) { // here we can mention normal statement in the catch block

			arr[1]=c;
			System.out.println(arr[1]);
			System.out.println("Index is beyond the list so adding 1st position");
			
		}
		catch(Exception e)
		{
			System.out.println("Exception occured, Please check the code");
			//e.printStackTrace();//print the what kind of exception if its
		}
		
		
		System.out.println("The div value of a and b :" + c);
	}

	public static void main(String[] args) {
		ExceptionSample obj = new ExceptionSample();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		obj.a = sc.nextInt();
		System.out.println("Enter the value of b: ");
		obj.b = sc.nextInt();
		obj.div();

	}

}
