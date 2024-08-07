package FPP.FPP_Day5_Lab.Assignment5_1;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
						
		Professor professor1=new Professor("Joeseph",180000,new Date(10000));
		Professor professor2=new Professor("Rhul",150000,new Date(12000));
		Professor professor3=new Professor("Smith",180000,new Date(16000));
		professor1.setNumberOfPublications(10);
		professor2.setNumberOfPublications(10);
		professor3.setNumberOfPublications(10);

		Secretary secretary1=new Secretary("Emily",180000,new Date(12000));
		Secretary secretary2=new Secretary("Susan",130000,new Date(17000));
		secretary1.setOvertimeHours(200);
		secretary2.setOvertimeHours(200);
		
		DeptEmployee[ ] department = {professor1,professor2,professor3,secretary1,secretary2};		
		System.out.print("Do you wish to see the sum of all salaries in the department? (Y/N): ");
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		if(input.equalsIgnoreCase("Y")) {
			double sum = 0.0;
			for(DeptEmployee dp: department) {
				sum+= dp.computeSalary();
			}
			System.out.println("Sum of all salaries: "+sum);
		}		
		
		System.out.print("Would you like to search for the details of an employee? (Y/N): ");			
		String inputAnswer=sc.next();
		if(inputAnswer.equalsIgnoreCase("Y")) {
			System.out.print("Enter employee name: ");
			String inputEmpName=sc.next();
			for(DeptEmployee dp: department) {
				if(dp.getName().toLowerCase().equals(inputEmpName.toLowerCase())){
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
					 String formattedDate = sdf.format(dp.getHireDate());
					 String output=getFormattedEmployeeDetail(dp.getName(),formattedDate,dp.computeSalary());
					 System.out.println(output);					
				}
			}
			

		}
		
	}
	
	public static String getFormattedEmployeeDetail(String name,String hireDate,double salary) {
		String newline = System.getProperty("line.separator");  			
		String theString = "Employee Details "+newline+newline;			
		theString += "Employee Name :"+ name + newline;
		theString += "Hire Date :"+hireDate + newline;
		theString += "Salary :"+ salary + newline;		
		return theString;		
	}

}
