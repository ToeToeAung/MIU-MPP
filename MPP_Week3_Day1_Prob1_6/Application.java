package MPP_Week3_Day1_Prob1_6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Application {

	public static void main(String[] args) throws ParseException, CloneNotSupportedException {				
		/*LocalDate dateOfBirthJohn = LocalDate.parse("1990-01-01", DateTimeFormatter.ISO_LOCAL_DATE);
		Employee e1=new Employee(1,"John", "Moore","Smith",dateOfBirthJohn,"SSN1",10000);
		LocalDate dateOfBirthMary = LocalDate.parse("1980-02-02", DateTimeFormatter.ISO_LOCAL_DATE);
		Employee e2=new Employee(1,"Mary", "Moore","Smith",dateOfBirthMary,"SSN2",12000);		
		LocalDate dateOfBirthSamuel= LocalDate.parse("1976-03-03", DateTimeFormatter.ISO_LOCAL_DATE);
		Employee e3=new Employee(1,"Samuel", "Moore","Wong",dateOfBirthSamuel,"SSN3",14000);
		
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
	    c1.print();    */ 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = sdf.parse("1997-01-01");
        Date date2 = sdf.parse("1992-02-02");
	    Employee e7 = new Employee(1, "John", "A", "Moore", date1, "123-45-1489", 50000);
        Employee e8 = new Employee(1, "John", "A", "Moore", date1, "123-45-1489", 50000);
        Employee e9 = new Employee(2, "Mary", "B", "Moore", date2, "987-65-4321", 60000);
        	
        Position p1=new Position("Software Engineer","Software Engineer");
	    p1.setEmployee(e7);
	        
	    Position p2=new Position("Accountant","Accountant");
	    p2.setEmployee(e8);
	    
	    Position p3=new Position("Elecronic Engineer","Elecronic Engineer");
	    p3.setEmployee(e9);

        Position p4=new Position("Software Engineer","Software Engineer");
	    p4.setEmployee(e7);
	    
	    Department d1=new Department("IT Department", "Fairfield IT");
	    d1.addPosition(p1);
	    
	    Department d2=new Department("HR Department", "Fairfield HR");
	    d2.addPosition(p2);
	    
	    Department d3=new Department("Engineering Department", "Fairfield Engineering");
	    d3.addPosition(p3);	    

	    Department d4=new Department("IT Department", "Fairfield IT");
	    d4.addPosition(p1);
	        
	    
        System.out.println("Employee E7 and E8 are equals: " +e7.equals(e8));
        System.out.println("Employee E8 and E9 are equals: " + e8.equals(e9));   
                
        System.out.println("Position P1 and P4 are equals: " + p1.equals(p4));
        System.out.println("Position P1 and P2 are equals: " + p1.equals(p2));        

        System.out.println("Department d1 and d4 are equals: " + d1.equals(d4));
        System.out.println("Department d1 and d2 are equals: " + d1.equals(d2));
        
        System.out.println(e7.toString());
        System.out.println(e9.toString());
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        
        System.out.println("HashCode of "+e7.getName() + ":"+e7.hashCode());
        System.out.println("HashCode of "+e8.getName() + ":"+e8.hashCode());
       
        System.out.println("HashCode of "+p1.getTitle() + ":"+p1.hashCode());
        System.out.println("HashCode of "+p2.getTitle() + ":"+p2.hashCode());  
        
        Position originalPosition= new Position("IT Manager","Manages the team");
        Employee e10 = new Employee(1, "Joe", "A", "Biden", date1, "123-45-1489", 50000);
        originalPosition.setEmployee(e10);
        
        Position clonedPosition = (Position) originalPosition.clone();
        
        System.out.println("Original Position: " + originalPosition);
        
        System.out.println("Cloned Position: " + clonedPosition);
        
        System.out.println("The result of the objects are the same:  " + (originalPosition == clonedPosition));

        System.out.println("The objects are equal: " + originalPosition.equals(clonedPosition));

            
        
	  }
}
