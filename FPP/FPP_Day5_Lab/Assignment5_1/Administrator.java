package FPP.FPP_Day5_Lab.Assignment5_1;
import java.util.Date;
public class Administrator extends DeptEmployee{
    private double numOfHours;
	public Administrator(String name,double salary,Date hireDate) {
		super(name,salary,hireDate);
	}
	
	public double getnumOfHours() {
		return numOfHours;
	}
	
	public void setOvertimeHours(double numOfHours) {
		this.numOfHours=numOfHours;
	}
	
	public double computeSalary() {
		return (20 * numOfHours);
	}
}
