package day13;
import day12.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CheckedExceptionSample {
	public static void main(String[] args) {
		

		try {
			FileOutputStream file = new FileOutputStream("C:\\Users\\Asus\\eclipse-workspace\\JavaOOPS\\src\\test\\java\\day1\\sample.txt");
			file.write(10);
		} catch (FileNotFoundException e) {
			
			System.out.println("Check the file path");
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	
	}


}
