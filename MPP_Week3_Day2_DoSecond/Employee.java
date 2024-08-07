package MPP_Week3_Day2_DoSecond;

public class Employee
{
   String name;
  // private String firstName;
  // private String lastName;
   double salary; 
  // private String department;
   
   // constructor 
   public Employee(String name,
		   //String firstName, String lastName, 
      double salary)
      //, String department)
   {
	   this.name=name;
     // this.firstName = firstName;
     // this.lastName = lastName;
      this.salary = salary;
      //this.department = department;
   } 

   public void setName(String name) {
	   this.name=name;
   }
   // set firstName
	/*
	 * public void setFirstName(String firstName) { this.firstName = firstName; }
	 * 
	 * public String getName() { return name; } // get firstName public String
	 * getFirstName() { return firstName; }
	 * 
	 * // set lastName public void setLastName(String lastName) { this.lastName =
	 * lastName; }
	 * 
	 * // get lastName public String getLastName() { return lastName; }
	 */
   // set salary
   public void setSalary(double salary)
   {
      this.salary = salary;
   }

   // get salary
   public double getSalary()
   {
      return salary;
   }

	/*
	 * // set department public void setDepartment(String department) {
	 * this.department = department; }
	 * 
	 * // get department public String getDepartment() { return department; }
	 * 
	 * // return Employee's first and last name combined public String getName() {
	 * return String.format("%s %s", getFirstName(), getLastName()); }
	 * 
	 * // return a String containing the Employee's information
	 * 
	 * @Override public String toString() { return
	 * String.format("%-8s %-8s %8.2f   %s", getFirstName(), getLastName(),
	 * getSalary(), getDepartment()); } // end method toString
	 */} // end class Employee
