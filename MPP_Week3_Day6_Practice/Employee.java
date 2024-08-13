package MPP_Week3_Day6_Practice;

import java.util.Date;

public class Employee {
	
	String name;
	double salary;
	Date dob;
	
	@Override
	public boolean equals(Object obj){
		if(this == obj) return true;
		if(obj == null || getClass() !=this.getClass()) return false;
		Employee e=(Employee)obj;			
		return e.name.equals(name) && e.salary== salary && e.dob.equals(dob);
	}

}
