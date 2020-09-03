package basic_prog;

import java.io.Serializable;

public class Employee implements Serializable{
	public int eid;
	public String name;
	public double salary;
	
	public Employee(int eid, String name, double salary)
	{
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	
	}
	

}
