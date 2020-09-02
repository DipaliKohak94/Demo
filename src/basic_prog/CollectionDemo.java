package basic_prog;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Object> s = new HashSet<>();
		
		s.add("Dipali");
		s.add(1234);
		s.add(15.456);
		s.add(false);
		
		List<Object> lst = new ArrayList<>(s);
		
		for(Object val : lst)
		{
			System.out.println("In 1st List "+val);
		}
		
		System.out.println("Extra "+lst.get(2).getClass());
	    System.out.println("================");
	    
	    List<Object> l = new ArrayList<>(s);
	    
	    l.addAll(s);
	    
	    for(Object val : l)
		{
			System.out.println("In 2nd List  "+val);
		}
		
		
		
	}

}
