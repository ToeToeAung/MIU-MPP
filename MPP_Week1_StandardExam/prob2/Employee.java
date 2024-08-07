package MPP_Week1_StandardExam.prob2;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private List<Account> accounts;
	public Employee(String name) {
		this.name =name;
		accounts=new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name =name;
	}
	
	public void addAccount(Account acc){
		accounts.add(acc);		
	}
	
	public List<Account> getAccount(){
		return accounts;
	}	
}
