package day12interfaceExample;

public class InterfaceImplementation implements Printable {

	public static void main(String[] args) {

		InterfaceImplementation obj = new InterfaceImplementation();
		obj.print();
		System.out.println(obj.printReturn());
		obj.add();

	}
  //giving definition to the abstract method (abstract method created in the Printable class)
	@Override
	public void print() {
		System.out.println("Printable");

	}

	@Override
	public int printReturn() {

		return 10;
	}

	@Override
	public void add() {

		System.out.println("Addition");

	}
	/*
	 * 2nd way of creating interface
	 * 
	 *overriding only one method means no need to create object and make it to abstract class/
	 * 
	 * public abstract class InterfaceImplementation implements Printable {
	 * 
	 * @Override
	 *  public void print() { 
	 * 
	 * System.out.println("Printable"); 
	 * }
	 * 
	 * 
	 * }
	 */
}
