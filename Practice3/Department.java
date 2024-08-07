package Practice3;
import java.util.List;
public class Department {
    private List<Student> students;
    private List<Staff> staff;

    public void printAllFacultyAdvisers() {
        for (Student student : students) {
            System.out.println("Student's Faculty Adviser: " + student.getFacultyAdviser());
        }
        for (Staff staffMember : staff) {
            System.out.println("Staff's Faculty Adviser: " + staffMember.getFacultyAdviser());
        }
    }
}