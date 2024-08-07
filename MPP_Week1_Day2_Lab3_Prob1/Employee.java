package MPP_Week1_Day2_Lab3_Prob1;

import java.time.LocalDate;
import java.util.Date;

public class Employee {
	
	private int employeeId;
	private String firstName;
	private String middleInitial;
	private String lastName;
	private LocalDate birthDate;
	private String SSN;
	private double salary;
	
	public Employee(int employeeId,
	 String firstName,
	 String middleInitial,
	 String lastName,
	 LocalDate birthDate,
	 String SSN,
	 double salary) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.SSN = SSN;
		this.salary =salary;
	}
	
	public String getName() {
		return firstName + " " +middleInitial + " " + lastName;
	}	
	
	public void print() {
	System.out.println("Employee Id: "+ employeeId + " "+ "Employee Name: " +firstName +" " + middleInitial + " "+ lastName +" Salary: " + salary);	
	}

}
