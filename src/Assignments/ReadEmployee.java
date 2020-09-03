package Assignments;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import basic_prog.Employee;

public class ReadEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee(1, "Sandip", 10000.00);
		
		FileOutputStream fos = new FileOutputStream("/Selenium_New/EmpData.txt");
		
	    ObjectOutputStream	os = new ObjectOutputStream(fos);
		 os.writeObject(e);
		 
		 
		 
		 System.out.println("App End");
		
		

	}

}
