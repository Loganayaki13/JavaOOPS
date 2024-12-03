package day13;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ThrowsExample {

public void fileHandle() throws FileNotFoundException {
		
		FileOutputStream file = new FileOutputStream("C:\\Users\\Asus\\eclipse-workspace\\JavaOOPS\\src\\test\\java\\day1//sample.txt");

	}
	
	public void file() throws FileNotFoundException {
		
		fileHandle();
	}
	
	public static void main(String[] args) {
		

		ThrowsExample obj  = new ThrowsExample();
		try {
			obj.file();
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
	}


}
