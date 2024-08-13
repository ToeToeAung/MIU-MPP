package MPP_Week3_Day5_Lab3_Prob1_Stream;

import java.util.Optional;

public class Position {
    private String title;
    private String description;
    private Employee employee;
    public Position(String title,String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }
    
    public String getDescription() {
    	return description;
    }
    
    public void setEmployee(Employee employee) {    
    	this.employee=employee;
    }
    
    public Employee getEmployee() {
    	return this.employee;
    }
    
    public double getSalary() {
    	if(employee!=null) {
    		return employee.getSalary();
    	}else {
    		return 0.0;
    	}
    
    }
    
	/*
	 * public void print() { System.out.print("Position: " + title +
	 * " Description: "+ description); if (employee != null) {
	 * System.out.println(", Employee: " + employee.getName()); } else {
	 * System.out.println(", Employee: NA"); } }
	 */
    
    
    public void print() {
   	 System.out.print("Position: " + title + " Description: "+ description);   	 
   	Optional.ofNullable(employee)
   	.map(emp -> ", Employee: "+ emp.getName())
   	.ifPresentOrElse(System.out::println, () -> System.out.println(", Employee NA."));
        
   }
}