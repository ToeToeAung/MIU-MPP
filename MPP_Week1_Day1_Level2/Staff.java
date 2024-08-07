package MPP_Week1_Day1_Level2;

public class Staff extends Person{
	private double Salary;
	public Staff(String Name,String Phone,int Age,double Salary) {
		super(Name,Phone,Age);
		this.Salary =Salary;
	}
	
	public double getSalary() {
		return Salary;
	}
}
