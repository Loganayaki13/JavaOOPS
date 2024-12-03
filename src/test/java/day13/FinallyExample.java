package day13;

public class FinallyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 0;
		int c;

		try {
			c = a / b;
			System.out.println("The div value :" + c);
		} catch (ArithmeticException e) {

			// System.out.println("Before exit");
			System.out.println("Exception ocuured");
			// System.exit(0); When System.exit(0); is used somewhere before the finally
			// block, then finally will not be executed.
			// System.out.println("After exit");

		}

		finally //Block of code, that will be executed whether or not the exception is occurred/handled
		{
			

			System.out.println("Final block of code");
			
		}
	}
}
