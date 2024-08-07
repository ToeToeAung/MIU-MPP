package FPP_StandardExams_Jan_2017_Solution;

import java.util.List;

public class AccountManager {
	public static double computeAccountBalanceSum(List<Employee> emps) {
		double totalBalanceSum=0.0;
		for(Employee emp: emps) {
		 for(Account acc:emp.getAccounts()) {
			 totalBalanceSum += acc.getBalance();
		 }		  
		}
		return totalBalanceSum;
	}
}
