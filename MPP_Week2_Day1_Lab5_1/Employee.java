package MPP_Week2_Day1_Lab5_1;

import java.time.LocalDateTime;

public abstract class Employee {
private int empId;
private String name;
public Employee(int empId,String name) {
	this.empId = empId;
	this.name = name;
}

public abstract double calcGrossPay();
public PayCheck calcCompensation(int month,int year) {
	  double grossPay= calcGrossPay();
      double fica = 0.23 * grossPay;
      double state = 0.05 * grossPay;
      double local=0.01 * grossPay;
      double medicare=0.03 * grossPay;
      double socialSecurity= 0.075 * grossPay;
      LocalDateTime now =LocalDateTime.now();      
      String payPeriod = now.getMonth().name() + " " + now.getYear();      
      double netPay = grossPay - (fica + state + local + medicare + socialSecurity);      
      return new PayCheck( grossPay,  fica,  state,  local,  medicare,  socialSecurity,  netPay,  payPeriod);
}
}
