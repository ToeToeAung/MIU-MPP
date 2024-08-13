package MPP_Week3_Day5_Lab3_Prob1_Stream;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Application {

	public static void main(String[] args) {				
		LocalDate dateOfBirthJohn = LocalDate.parse("1990-01-01", DateTimeFormatter.ISO_LOCAL_DATE);
		Employee e1=new Employee(1,"John", "Moore","Smith",dateOfBirthJohn,"SSN1",10000);
		LocalDate dateOfBirthMary = LocalDate.parse("1980-02-02", DateTimeFormatter.ISO_LOCAL_DATE);
		Employee e2=new Employee(2,"Mary", "Moore","Smith",dateOfBirthMary,"SSN1",12000);		
		LocalDate dateOfBirthSamuel= LocalDate.parse("1976-03-03", DateTimeFormatter.ISO_LOCAL_DATE);
		Employee e3=new Employee(3,"Samuel", "Moore","Wong",dateOfBirthSamuel,"SSN1",14000);
		
	    Position p1=new Position("Software Engineer","Software Engineer");
	    p1.setEmployee(e1);
	    
	    Position p2=new Position("Accountant","Accountant");
	    p2.setEmployee(e2);
	    
	    Position p3=new Position("Elecronic Engineer","Elecronic Engineer");
	    p3.setEmployee(e3);
	    
	    Department d1=new Department("IT Department", "Fairfield IT");
	    d1.addPosition(p1);
	    
	    Department d2=new Department("HR Department", "Fairfield HR");
	    d2.addPosition(p2);
	    
	    Department d3=new Department("Engineering Department", "Fairfield Engineering");
	    d3.addPosition(p3);
	    
	    Company c1=new Company("Microsoft");
	    c1.addDepartment(d1);
	    c1.addDepartment(d2);
	    c1.addDepartment(d3);	    
	    c1.print();  	    	    
	}
}
