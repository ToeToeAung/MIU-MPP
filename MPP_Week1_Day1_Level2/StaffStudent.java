package MPP_Week1_Day1_Level2;

import java.util.Date;

public class StaffStudent extends Person {
    private Staff staff;
    private Student student;
    private Date firstCourseStartDate;

    public StaffStudent(String name, String phone, int age, double salary, double gpa, Date firstCourseStartDate) {
        super(name, phone, age);
        this.staff = new Staff(name, phone, age, salary);
        this.student = new Student(name, phone, age, gpa);
        this.firstCourseStartDate = firstCourseStartDate;
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
