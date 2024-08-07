package MPP_Week1_Day1_Level2;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class Faculty extends Person {
	private double Salary;
	private List<Course> courses;
	public Faculty(String Name,String Phone,int Age,double Salary) {
		super(Name,Phone,Age);
		this.Salary = Salary;
		this.courses = new ArrayList<>();
	}
	
	public void addCourse(Course course) {
	   courses.add(course);
	}
	
	public double getSalary() {
		return Salary;
	}
			
	public int getTotalUnitByFaculty() {
        int totalUnits = 0;
        for (Course course : courses) {
            totalUnits += course.getUnits();
        }
        return totalUnits;
    }
	
	 public static Map<String, Integer> getTotalUnitsByFaculty(List<Course> courses) {
	        Map<String, Integer> totalUnitsByFaculty = new HashMap<>();

	        for (Course course : courses) {
	            String faculty = course.getFaculty();
	            int units = course.getUnits();
	            totalUnitsByFaculty.put(faculty, totalUnitsByFaculty.getOrDefault(faculty, 0) + units);
	        }

	        return totalUnitsByFaculty;
	    }
}
