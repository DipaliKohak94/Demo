package basic_prog;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.FileAlreadyExistsException;

public class ReadEmployee {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Employee e = new Employee(1,"Dipali",50000.00);
		
	  /*  e.eid(1);
		e.name("Dipali");
		e.salary(50000.00);*/
		
		
		
			FileOutputStream fos = new FileOutputStream("EmpData.txt");
			
		    ObjectOutputStream	os = new ObjectOutputStream(fos);
			 os.writeObject(e);
			 
			 System.out.println("App End");
			
		

	}
 
}
