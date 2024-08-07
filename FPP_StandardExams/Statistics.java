package FPP_StandardExams;
import java.util.*;
public class Statistics  {
	/** 
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
	 */
	public static double computeSumOfSalaries(List<EmployeeData> aList) {
		double sumOfSalary=0.0;
		for(EmployeeData ep :aList) {
			sumOfSalary +=ep.getSalary();
		}
		return sumOfSalary;
	}
}
