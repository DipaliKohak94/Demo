package basic_prog;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOpr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       Set<String> s = new HashSet<>();
		
		s.add("Dipali");
		s.add("Alia");
		s.add("sandip");
		s.add("zirpe");
		
		for(Object value : s)
		{
			System.out.println("Befor Removing "+value);
		}
		
		s.remove("Alia");
		
		System.out.println("=======================");
		
		for(Object value : s)
		{
			System.out.println("After Removing "+value);
		}
		
		
	}

}
