package MPP_Week1_Day1_Level2;
import java.util.List;
import java.util.ArrayList;

public class Student extends Person {
	
	List<Course> courses;	
	private double GPA;
	public Student(String Name,String Phone,int Age,double GPA) {
		super(Name,Phone,Age);
		this.GPA =GPA;
		this.courses=new ArrayList<>();
	}
	
	public void addCourse(Course course) {
		this.courses.add(course);
	}
	
	public double getSalary() {
		return 0;
	}
	
	public double getGPA() {
		return GPA;
	}

}
