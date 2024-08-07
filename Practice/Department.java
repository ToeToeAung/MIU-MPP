package Practice;

import java.util.List;

public class Department {
    private List<Painter> painters;

    public void printOutPainterInfo() {
        for (Painter painter : painters) {
            System.out.println("Name: " + painter.getName());
            System.out.println("Age: " + painter.getAge());
            System.out.println("Salary: " + painter.getSalary());
        }
    }
}