package MPP_Week1_StandardExam.prob2;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		double totalBalance=0.0;
		for(Employee emp: list) {
			for(Account account: emp.getAccount()) {
			//	System.out.println("EmployeeName : " +emp.getName());
				totalBalance += account.computeUpdatedBalance();
			}
			
		}		
		return totalBalance;
	}
}
