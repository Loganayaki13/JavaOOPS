package day13;

public class ThrowExample {
int age =15;
	
	public void checkAge()  {
		try {
		if(age < 18) {
			
			throw new InvalidAgeException();
		}
		} catch (InvalidAgeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		ThrowExample obj = new ThrowExample();
		obj.checkAge();
		
		
	}


}
