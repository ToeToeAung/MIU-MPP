package MPP_Week2_Day1_Lab5_1;

public class SalarriedEmployee extends Employee{
	private double salary;
	public SalarriedEmployee(int empId, String name,double salary) {
		super(empId, name);
		this.salary =salary;
	}
	@Override
	public double calcGrossPay() {
		return salary;
	}
	
	
}
