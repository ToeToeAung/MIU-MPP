package MPP_Week4_Java8_Homework_Level3;
// Program 4: ProcessingEmployees.java
// Processing streams of Employee objects.
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProcessingEmployees
{
   public static void main(String[] args)
   {
      // initialize array of Employees
      List<Employee> employees = Arrays.asList(
         new Employee("Jason", "Red", 5000, "IT"),
         new Employee("Ashley", "Green", 7600, "IT"),
         new Employee("Matthew", "Indigo", 3587.5, "Sales"),
         new Employee("James", "Indigo", 4700.77, "Marketing"),
         new Employee("Luke", "Indigo", 6200, "IT"),
         new Employee("Jason", "Blue", 3200, "Sales"),
         new Employee("Wendy", "Brown", 4236.4, "Marketing"));

        Map<String, Double> avgSalaryByDept = employees.stream()
              .collect(Collectors.groupingBy(
                  Employee::getDepartment,
                  Collectors.averagingDouble(Employee::getSalary)
              ));

          System.out.println("Average salary by department:");
          avgSalaryByDept.forEach((dept, avgSalary) -> 
               System.out.printf("%s: %.2f%n", dept, avgSalary)
          );
          
          System.out.println("********************************");

          Map<String, Optional<Employee>> maxSalaryByDept = employees.stream()
        		    .collect(Collectors.groupingBy(
        		        Employee::getDepartment,
        		        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
        		    ));

          
          
        System.out.println("Maximum salary by department:");
        		maxSalaryByDept.forEach((dept, emp) -> 
        		    System.out.printf("%s : %.2f%n",dept , emp.map(Employee::getSalary).orElse(0.0))
       );
        		
      System.out.println("********************************");
        		 
      Map<String, List<Employee>> employeesByDept = employees.stream()
        			.collect(Collectors.groupingBy(Employee::getDepartment));
        			System.out.println("Employees by department:");
        			employeesByDept.forEach((dept, empList) -> {
        			    System.out.println(dept + ": ");
        			    empList.forEach(emp -> System.out.println("  " + emp.getName()));
        			});

          
   } // end main
} // end class ProcessingEmployees


