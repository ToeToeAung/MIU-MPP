package MPP_Week3_Day5_Lab3_Prob3;

import java.util.ArrayList;
import java.util.List;


class Company {
    private String name;
    private List<Department> departments;
    private Position topExecutive;
    
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
    
    public void setTopExecutive(Position topExecutive) {
    	this.topExecutive = topExecutive;
    }
    
    public Position getTopExecutive() {
    	return this.topExecutive;
    }
         

    public void printReportingHierarchy() {
        System.out.print("******************************************************\n");
        System.out.println("Reporting Hierarchy for Company: " + name);
        System.out.print("******************************************************\n");
        if (topExecutive != null) {
            System.out.println("Top Executive: " + topExecutive.getTitle() + " - " + topExecutive.getEmployee().getName());
        } else {
            System.out.println("Top Executive: [Unfilled]");
        }
        for (Department department : departments) {
            department.printReportingHierarchy();
        }
    }
    
}