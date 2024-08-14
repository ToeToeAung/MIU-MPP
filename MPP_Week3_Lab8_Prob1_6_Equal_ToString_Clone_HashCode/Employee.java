package MPP_Week3_Lab8_Prob1_6_Equal_ToString_Clone_HashCode;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Employee implements Cloneable {
	
	private int employeeId;
	private String firstName;
	private String middleInitial;
	private String lastName;
	private Date birthDate;
	private String SSN;
	private double salary;
	
	public Employee(int employeeId,
	 String firstName,
	 String middleInitial,
	 String lastName,
	 Date localDate,
	 String SSN,
	 double salary) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.birthDate = localDate;
		this.SSN = SSN;
		this.salary =salary;
	}
	
	public String getName() {
		return firstName + " " +middleInitial + " " + lastName;
	}	
	
	public void print() {
	System.out.println("Employee Id: "+ employeeId + " "+ "Employee Name: " +firstName +" " + middleInitial + " "+ lastName +" Salary: " + salary);	
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		Employee employee = (Employee) obj;
		return employeeId == employee.employeeId && 
				Double.compare(employee.salary,salary) ==0 && 
				firstName.equals(employee.firstName) && 
			   	Objects.equals(middleInitial,employee.middleInitial) &&
				lastName.equals(employee.lastName) && 
				birthDate.equals(employee.birthDate)  &&
				SSN.equals(employee.SSN);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(employeeId,salary,firstName,middleInitial,lastName,lastName,birthDate,SSN);
	}
	
	@Override
	public String toString() {
		return "Employee {employeeId=" +employeeId + " ,Salary="+ salary
				+" ,First Name="+ firstName + " ,Middle Initial ="+middleInitial
				+" ,Last Name="+ lastName + " , Birth Date ="+ birthDate
				+", SSN="+ SSN+"}";
	}
	
	public Employee clone() throws CloneNotSupportedException{
	Employee employeeCopy= (Employee) super.clone();
	employeeCopy.birthDate = (Date) birthDate.clone();
	return employeeCopy;
	}
	
}
