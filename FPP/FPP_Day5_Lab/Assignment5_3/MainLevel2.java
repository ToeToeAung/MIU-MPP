package FPP.FPP_Day5_Lab.Assignment5_3;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class MainLevel2 {

	public static void main(String[] args) {
		List<Employee> arr2=new ArrayList<>();
		Employee e4=new Employee("John Smith");
		Employee e5=new Employee("Anne Beech");
		Employee e6=new Employee("Tom Jones");
		arr2.add(e4);
		arr2.add(e5);
		arr2.add(e6);
		
		 Account checkingAcc=new CheckingAccount(arr2.get(0),7000);	
		 arr2.get(0).addAccount(checkingAcc); 		  
		 Account savinggAcc=new  SavingsAccount(arr2.get(0),6500); 
		 arr2.get(0).addAccount(savinggAcc);		 
		 Account retirementgAcc=new RetirementAccount(arr2.get(0),10000);
		 arr2.get(0).addAccount(retirementgAcc);		  
		  
		 Account checkingAcc1=new CheckingAccount(arr2.get(1),8000);
		 arr2.get(1).addAccount(checkingAcc1); 		 
		 Account savinggAcc1=new SavingsAccount(arr2.get(1),7500); 
		 arr2.get(1).addAccount(savinggAcc1);	
		 
		  Account checkingAcc2=new CheckingAccount(arr2.get(2),9000);
		  arr2.get(2).addAccount(checkingAcc2);			
		  Account retirementgAcc2=new RetirementAccount(arr2.get(2),12000);
		  arr2.get(2).addAccount(retirementgAcc2);
		 
		 forAllEmployeesTotalOfAllBalances(arr2);
		
	}
	

	private static void forAllEmployeesTotalOfAllBalances(List<Employee> empList) {
		StringBuilder sb=new StringBuilder();	
		for(Employee emp:empList) {
			double total=0.0;
			for(Account acc:emp.getAccounts()) {
				total += acc.getBalance();
			}
			String formattedTotal = String.format("%.2f", total);
			sb.append(emp.getName() +" $"+formattedTotal+"\r\n");		
			
		}
		
		System.out.println(sb.toString());
	}
	
	
}
