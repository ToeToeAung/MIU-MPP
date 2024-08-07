package Practice1;
import java.util.List;

public class Department {
    private List<Student> students;

    public void printOutAllGPAsForAllStudents() {
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", GPA: " + student.getGPA());
        }
    }
}

