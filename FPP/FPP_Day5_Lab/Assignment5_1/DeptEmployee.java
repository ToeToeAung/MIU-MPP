package FPP.FPP_Day5_Lab.Assignment5_1;
import java.util.Date;

class DeptEmployee {
		private String name;
		private double salary;
		private Date hireDate;
		
	//constructor
		public DeptEmployee(String aName, 
		double aSalary, 
		Date hireDate) { 
			name = aName;
			salary = aSalary;
			this.hireDate= hireDate;	  
	}
	
	public double computeSalary() {
			return salary;
	}	
		
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public Date getHireDate() {
		return hireDate;
	}
	
	public void setHireDate(Date hireDate) {
		this.hireDate=hireDate;
	}
}
