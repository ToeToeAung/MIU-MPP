package FPP.FPP_Day5_Lab.Assignment5_3;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class MainLevel1 {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<>();
		Employee e1=new Employee("Jim Daley");
		Employee e2=new Employee("Bob Reuben");
		Employee e3=new Employee("Susan Randolph");
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		
		// System.out.println(empList.get(0).getName());
		 Account checkingAcc=new CheckingAccount(empList.get(0),7000);
		// System.out.println(checkingAcc.getBalance());
		
		 empList.get(0).addAccount(checkingAcc); 
		  
		     Account savinggAcc=new
		 SavingsAccount(empList.get(0),6500); empList.get(0).addAccount(savinggAcc);
		  Account retirementgAcc=new RetirementAccount(empList.get(0),10000);
		  empList.get(0).addAccount(retirementgAcc);
		  
		  
		  Account checkingAcc1=new CheckingAccount(empList.get(1),8000);
		  empList.get(1).addAccount(checkingAcc1); Account savinggAcc1=new
		  SavingsAccount(empList.get(1),7500); empList.get(1).addAccount(savinggAcc1);
		  
		  Account checkingAcc2=new CheckingAccount(empList.get(2),9000);
		  empList.get(2).addAccount(checkingAcc2);
		 
		/*Account savinggAcc2=new SavingsAccount(empList.get(2),8500);
		empList.get(2).addAccount(savinggAcc2);		*/
		Account retirementgAcc2=new RetirementAccount(empList.get(2),12000);
		empList.get(2).addAccount(retirementgAcc2); 
		
			Scanner sc=new Scanner(System.in);
		
			System.out.println("A. See a report of all accounts.");
			System.out.println("B. Make a deposit.");
			System.out.println("C. Make a withdrawal.");
			System.out.println("Make a selection (A/B/C):");
			
			String userChoice=sc.nextLine().toUpperCase();
			switch(userChoice) {
			case "A":  
				for(Employee emp:empList) {
				System.out.println(emp.getFormattedAccountInfo());
				}
				break;
			case "B":
				makeDeposit(sc,empList);
				break;		
			case "C":
				makeWithdraw(sc,empList);
				break;
			default :
				System.out.println("An Invalid choice. Try again.");
			} 
		
			
			
			
			
		
	}
	
	private static void makeDeposit(Scanner sc,List<Employee> empList) {
		int empIndex=selectEmployeeNo(sc,empList);
		Employee emp=empList.get(empIndex);		
		int accIndex=selectAccountType(sc,emp.getAccounts());						
		Account account=emp.getAccounts().get(accIndex);
		
		System.out.println("Deposit amount :");
		double amount=sc.nextDouble();
		account.deposit(amount);
		sc.nextLine(); 
		/*$300.00 has been deposited in the savings account of Susan Randolph */
		//String formattedAmount = String.format("%.2f", account);
		System.out.println("$"+amount+" has been deposited in the \r\n"
				+ "savings account of "+emp.getName());	
		
		}
				
	
	
	private static void makeWithdraw(Scanner sc,List<Employee> empList) {
		int empIndex=selectEmployeeNo(sc,empList);
		Employee emp=empList.get(empIndex);
		
				int accIndex=selectAccountType(sc,emp.getAccounts());			
				Account account=emp.getAccounts().get(accIndex);				
				System.out.println("Deposit amount :");
				double amount=sc.nextDouble();
				
				boolean isWithdraw=account.withdraw(amount);
			//	String formattedAmount = String.format("%.2f", amount);
				if(isWithdraw) {
					System.out.println("$"+amount+" has been deposited in the savings account of "+emp.getName());		
				}
					
	}
	
	
	private static int selectEmployeeNo(Scanner sc,List<Employee> empList) {
		int empIndex=0;
		for(int i=0;i<empList.size();i++){
			System.out.println(i +"."+empList.get(i).getName());
		}
		System.out.println("Select an employee: (type a number)");
		empIndex=sc.nextInt();		
		return empIndex;
	}
	
	private static int selectAccountType(Scanner sc,List<Account> accounts) {
		int accIndex=0;
		for(int i=0;i<accounts.size();i++) {
			System.out.println(i +"."+accounts.get(i).getAcctType());
		}
		System.out.println("Select an account: (type a number)");
		accIndex=sc.nextInt();		
		return accIndex;
	}
	
	private static double totalOfAllBalances(List<Employee> empList) {
		double total=0.0;
		for(Employee emp:empList) {
			for(Account acc:emp.getAccounts()) {
				total += acc.getBalance();
			}
		}
		
		return total;
	}
	
	private static void forAllEmployeesTotalOfAllBalances(List<Employee> empList) {
		StringBuilder sb=new StringBuilder();	
		for(Employee emp:empList) {
			double total=0.0;
			for(Account acc:emp.getAccounts()) {
				total += acc.getBalance();
			}
			String formattedTotal = String.format("%.2f", total);
			sb.append(emp.getName() +" $"+formattedTotal);		
			
		}
		System.out.println(sb.toString());
	}
	
	
}
