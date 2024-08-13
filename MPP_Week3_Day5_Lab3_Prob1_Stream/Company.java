package MPP_Week3_Day5_Lab3_Prob1_Stream;

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
    
	/*
	 * public double getSalary() { double totalSalary =0.0; for(Department d:
	 * departments) { totalSalary += d.getSalary(); } return totalSalary; }
	 */
    
    public double getSalary() {
     double totalSalary=0.0;
     totalSalary=departments.stream()
    		 .mapToDouble(Department:: getSalary)
    		 .sum();     
     return totalSalary;
    }
        
	/*
	 * public void print() {
	 * System.out.print("**********************************************\n");
	 * System.out.println("Company: " + name + " Total Salary: "+ getSalary()); for
	 * (Department department : departments) {
	 * System.out.print("**********************************************\n");
	 * department.print(); } }
	 */
    
  public void print() {
	  System.out.print("**********************************************\n");
	  System.out.println("Company: " + name + " Total Salary: "+ getSalary());	  
	  departments.forEach(department -> {
		  System.out.print("**********************************************\n");
		  department.print();
	  });
  }
}