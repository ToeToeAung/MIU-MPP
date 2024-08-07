package MPP_Week1_Day2_Lab3_Prob2;

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
    
    public double getSalary() {
    	double totalSalary =0.0;
    	for(Department d: departments) {
    		totalSalary += d.getSalary();
    	}
    	return totalSalary;
    }
    
        
    public void print() {
    	System.out.print("**********************************************\n");
        System.out.println("Company: " + name + " Total Salary: "+ getSalary());
        for (Department department : departments) {
        	System.out.print("**********************************************\n");
            department.print();
        }
    }
    
  
}