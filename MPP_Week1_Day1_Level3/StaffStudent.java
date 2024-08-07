package MPP_Week1_Day1_Level3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StaffStudent extends Person {
    private Staff staff;
    private Student student;
    private Date firstCourseStartDate;
    private List<Course> courses;

    public StaffStudent(String name, String phone, int age, double salary, double gpa, Date firstCourseStartDate) {
        super(name, phone, age);
        this.staff = new Staff(name, phone, age, salary);
        this.student = new Student(name, phone, age, gpa);
        this.firstCourseStartDate = firstCourseStartDate;
    	this.courses=new ArrayList<>();
    }

    public double getSalary() {
        return staff.getSalary();
    }

    public double getGPA() {
        return student.getGPA();
    }

    public Date getFirstCourseStartDate() {
        return firstCourseStartDate;
    }
}
