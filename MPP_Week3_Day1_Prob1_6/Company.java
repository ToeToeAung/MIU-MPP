package MPP_Week3_Day1_Prob1_6;

import java.util.ArrayList;
import java.util.List;

class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    
    public void addDepartment(Department d) {
    	departments.add(d);
    }
    
    public void print() {
    	System.out.print("*********************\n");
        System.out.println("Company: " + name);
        for (Department department : departments) {
        	System.out.print("*********************\n");
            department.print();
        }
    }
}