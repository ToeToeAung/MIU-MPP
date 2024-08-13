package MPP_Week3_Day2_Lab_Prob5_Level3;

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
