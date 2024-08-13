package MPP_Week3_Day2_Lab_Prob5_Level3;
import java.util.List;
import java.util.ArrayList;

public class Student extends Person {
	
	List<Course> courses;	
	private double GPA;
	public Student(String Name,String Phone,int Age,double GPA) {
		super(Name,Phone,Age);
		this.GPA =GPA;
	}
	
	public void addCourse(Course course) {
		this.courses.add(course);
	}
	
	public double getSalary() {
		return 0;
	}

}
