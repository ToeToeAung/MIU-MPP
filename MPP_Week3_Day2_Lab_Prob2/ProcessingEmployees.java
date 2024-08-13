package MPP_Week3_Day2_Lab_Prob2;
// Program 4: ProcessingEmployees.java
// Processing streams of Employee objects.
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcessingEmployees
{
   public static void main(String[] args)
   {
      // initialize array of Employees
      Employee[] employees = {
         new Employee("Jason", "Red", 5000, "IT"),
         new Employee("Ashley", "Green", 7600, "IT"),
         new Employee("Matthew", "Indigo", 3587.5, "Sales"),
         new Employee("James", "Indigo", 4700.77, "Marketing"),
         new Employee("Luke", "Indigo", 6200, "IT"),
         new Employee("Jason", "Blue", 3200, "Sales"),
         new Employee("Wendy", "Brown", 4236.4, "Marketing")};

      // get List view of the Employees
      List<Employee> list = Arrays.asList(employees);

      // display all Employees
      System.out.println("Complete Employee list:");
      list.stream().forEach(System.out::println);   //A method reference.

      // To test Collectors.joining
      // Convert elements to strings and concatenate them, separated by commas
      String joined = list.stream()
              .map(Object::toString)  //  this DOES go to the overridden method  toString  inside Employee!!  Yes!!

                                     //  joining method needs Strings coming in.  

              //.map(Employee::toString)  //  this also DOES work!!  Yes!!
              .collect(Collectors.joining(", "));

      System.out.println("\n\n" + joined);
      System.out.println("\n\n**************************************************************");
      System.out.println("Solutions of the problems in Week3 Day2 are as follows : ");
      //# a.1) 1)  Count the number of last names that begin with the letter  ‘B’.  Print out this number.
      long count = list.stream()
    		  .filter(emp -> emp.getLastName().startsWith("B"))
    		  .count();
    		  
      System.out.println("Count the number of last names that begin with the letter B is " + count);
      
  	  System.out.println("[a.2]----------------------------------------------------------");
  	
      //# a.2) Print out all of the Employee objects whose last name begins with the letter  ‘B’  in sorted order.  
      
      		  list.stream()
    		  .filter(emp -> emp.getLastName().startsWith("B"))
    		  .sorted(Comparator.comparing(Employee :: getLastName))
    		  .forEach(System.out :: println);
      
      System.out.println("[a.3]----------------------------------------------------------");
       //# a.3 Print out all of the Employee objects whose last name begins with the letter  ‘B’  and change their first name and last name to be All capital letters.                                                     
      		  
      		list.stream()
  		  .filter(emp -> emp.getLastName().startsWith("B"))
  		  .sorted(Comparator.comparing(Employee :: getLastName))
  		  .map(emp -> emp.getFirstName().toUpperCase() + "\t" + emp.getLastName().toUpperCase()
  				  + "\t" + emp.getSalary() + "\t" + emp.getDepartment())
  		  .forEach(System.out :: println);
      		
      		/* To practice again and again
      		 // 3. Print out all of the Employee objects whose last name begins with the letter ‘B’ and change their first and last names to be All capital letters.
            // First way: Without changing the original list
            List<Employee> upperCaseBLastNames = employees.stream()
                    .filter(e -> e.getLastName().startsWith("B"))
                    .map(e -> new Employee(e.getFirstName().toUpperCase(), e.getLastName().toUpperCase()))
                    .collect(Collectors.toList());

            System.out.println("Employees with last names starting with 'B' (first and last names in uppercase) - Without changing original list:");
            upperCaseBLastNames.forEach(System.out::println);

            // Second way: Changing the original list
            employees.stream()
                    .filter(e -> e.getLastName().startsWith("B"))
                    .forEach(e -> {
                        e.setFirstName(e.getFirstName().toUpperCase());
                        e.setLastName(e.getLastName().toUpperCase());
                    });

            System.out.println("Employees with last names starting with 'B' (first and last names in uppercase) - Changing original list:");
            employees.stream()
                    .filter(e -> e.getLastName().startsWith("B"))
                    .forEach(System.out::println);
            
            
      		*/
      		System.out.println("[a.4]----------------------------------------------------------");
      		  
       //# a.4 Print out All of the employee objects, 
      		//but if the last name begins with the letter  ‘B’,  
      		//then capitalize all the letters in the last name.  
      		
      		list.stream()
    		  .filter(emp -> emp.getLastName().startsWith("B"))
    		  .sorted(Comparator.comparing(Employee :: getLastName))
    		  .map(emp -> emp.getFirstName() + "\t" + emp.getLastName().toUpperCase()
    				  + "\t" + emp.getSalary() + "\t" + emp.getDepartment())
    		  .forEach(System.out :: println);
      		
      		System.out.println("[a4.1]----------------------------------------------------------");
      		
      	//# a.4.1
      		String empString=list.stream()
      		.map(emp -> {
      			if(emp.getLastName().startsWith("B")) {
      				emp.setLastName(emp.getLastName().toUpperCase());	
      				return emp;
      			}else {
      				return emp;
      			}      			
      		})
      		.map(Employee:: toString)
      		.collect(Collectors.joining(","));
      		System.out.println(empString);
      		
     		System.out.println("[a4.2] ----------------------------------------------------------");
     		  
      	//# a4.2
      		String empString1=list.stream()
      	      		.map(emp -> {
      	      			if(emp.getLastName().startsWith("B")) {
      	      				emp.setLastName(emp.getLastName().toUpperCase());	
      	      				return emp;
      	      			}else {
      	      				return emp;
      	      			}      			
      	      		})
      	      		.map(Employee:: toString)
      	      		.collect(Collectors.joining("---\n---"));
      	      		System.out.println(empString1);
      	//# a.5
      	      
      	   		System.out.println("[a 5] ----------------------------------------------------------");
      	   	  
      	      	list.stream()
      		  .filter(emp -> emp.getLastName().startsWith("I"))
      		  .map(Employee::getLastName)
      		  .distinct()
      		  .sorted()      		 
      		  .forEach(System.out :: println);
      
       //# a.6 
      	  	System.out.println("[a 6]----------------------------------------------------------");
       	   
      		Double avgSalary=list.stream()
      				.collect(Collectors.summarizingDouble(Employee::getSalary))
      				.getAverage();      		
      		System.out.println("The average of all the salaries is "+ avgSalary);
      		
      	//#a.7	
      	  	System.out.println("[a 7]----------------------------------------------------------");
            
      	  	System.out.printf("The total salary of all employees $%.2f%n",
      		list.stream()
      		.mapToDouble(Employee :: getSalary)
      		.reduce(0,(val1,val2) -> val1+val2));
      		
      	//#a.8	
      		System.out.println("[a 8]----------------------------------------------------------");
        //    System.out.printf("The first names of all the employees %s",
            list.stream()
            .map(Employee::getFirstName)
            .forEach(System.out::println);	
            
        //#a.9
     		System.out.println("[a 9]----------------------------------------------------------");
     	     Stream.iterate(2,n->n+2)
     	     .limit(20)
     	     .forEach(System.out::println);
   } // end main
} // end class ProcessingEmployees


