package basic_prog;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionFileOprDemo implements Serializable {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
            
       List<Object> s = new ArrayList<>();
		
		s.add("Dipali");
		s.add(1234);
		s.add(15.456);
		s.add(false);
		
		FileOutputStream fos = new FileOutputStream("EmpData.txt");
		
		ObjectOutputStream os = new ObjectOutputStream(fos);
		 os.writeObject(s);
		 
		 System.out.println("SuccessFully Done ");
		
	}

}
