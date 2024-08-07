package MPP_Week2_Day1_Lab5_1;

public class HourlyEmployee extends Employee {

	private double hourlyRate;
	private int hourWorked;
	
	public HourlyEmployee(int empId, String name,double hourlyRate,int hourWorked) {
		super(empId, name);
		this.hourlyRate =hourlyRate;
		this.hourWorked = hourWorked;
	}

	@Override
	public double calcGrossPay() {		
		return hourlyRate * hourWorked;
	}
	
	

}
