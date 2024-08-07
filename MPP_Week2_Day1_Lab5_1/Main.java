package MPP_Week2_Day1_Lab5_1;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Main {
public static void main(String[] args) {

	//LocalDateTime now = LocalDateTime.now();
  //  String payPeriod = now.getMonth().name() +" " + now.getYear();
   // System.out.println( " Pay Period "+ payPeriod);
	
	 Employee hourlyEmployee = new HourlyEmployee(1, "Jue", 25, 160);  
     List<Employee> employees = new ArrayList<>();
     employees.add(hourlyEmployee);
     employees.add(new SalarriedEmployee(2, "Jane", 3000));
     List<Order> orders = new ArrayList<>();
    
     orders.add(new Order("ORD_001",LocalDate.now(),200.00));
     orders.add(new Order("ORD_002",LocalDate.now(),300.00));
     employees.add(new CommissionedEmployee(3, "Samuel", 0.07,3000, orders));

     for (Employee employee : employees) {
         PayCheck payCheck = employee.calcCompensation(7, 2024);
         System.out.println(employee.getClass().getSimpleName() + " " +payCheck);
     }
}
}
