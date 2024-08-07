package MPP_Week1_Day1_Level1;
import java.util.List;
import java.util.ArrayList;

public class Department {
	List<Person> members;
	private String Name;
	public Department(String Name) {
		this.Name = Name;// Department Name
		members = new ArrayList();	
	}	
	
	public String getDepartmentName() {
		return Name;
	}
	public void addMember(Person p) {
		members.add(p);
	}
	
	public double getTotalSalaryWithInstanceOf() {
		double totalSalary=0.0;
		for(Person p: members) {
			if (p instanceof Faculty) {
                totalSalary += ((Faculty) p).getSalary();
            } else if (p instanceof Staff) {
                totalSalary += ((Staff) p).getSalary();
            }			
		}		
		return totalSalary;
	}
	
	 public double getTotalSalaryWithPolymorphism() {
	        double totalSalary = 0.0;
	        for (Person p : members) {
	            totalSalary += p.getSalary();
	        }
	        return totalSalary;
	 }
	 
	 
	 public void showAllMembers() {
	        for (Person p : members) {
	            String type = p.getClass().getSimpleName();
	         //   System.out.println("Show All members "+ type.toString());
	            System.out.println("Name: " + p.getName() + ", Phone: " + p.getPhone() + ", Age: " + p.getAge());
	        }
	 }
	 
	
	    public void unitsPerFacultyWithInstanceOf(List<Course> courses) {
	        for (Person p : members) {
	            if (p instanceof Faculty) {
	                Faculty f = (Faculty) p;
	                System.out.println("Faculty: " + f.getName() + ", Total Units: " + f.getTotalUnitsByFaculty(courses));
	            }
	        }
	    }

	
	    public void unitsPerFacultyWithClassName(List<Course> courses) {
	        for (Person p : members) {
	            if (p.getClass().getSimpleName().equals("Faculty")) {
	                Faculty f = (Faculty) p;
	                System.out.println("Faculty: " + f.getName() + ", Total Units: " + f.getTotalUnitsByFaculty(courses));
	            }
	        }
	    }
	 
}
