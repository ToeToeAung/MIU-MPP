package MPP_Week1_Day1_Level3;
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
	    
	    public void findStudentsByFaculty(String facultyName) {
	        Faculty foundFaculty = null;
	        for (Person p : members) {
	            if (p instanceof Faculty && p.getName().equalsIgnoreCase(facultyName)) {
	                foundFaculty = (Faculty) p;
	                break;
	            }
	        }
	        if (foundFaculty == null) {
	            System.out.println("Faculty member not found.");
	            return;
	        }

	        List<Course> facultyCourses = foundFaculty.getCourses();
	        System.out.println("Students taught by " + facultyName + ":");
	        for (Person p : members) {
	            if (p instanceof Student) {
	                Student s = (Student) p;
	                for (Course sc : s.getCourses()) {
	                    if (facultyCourses.contains(sc)) {
	                        System.out.println(s.getName());
	                        break;
	                    }
	                }
	            }
	        }
	    }
	 
}
