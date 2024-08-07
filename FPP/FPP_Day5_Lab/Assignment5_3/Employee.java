package FPP.FPP_Day5_Lab.Assignment5_3;
import java.util.List;
import java.util.ArrayList;

public class Employee {
	private String name;
	private List<Account> accounts;
	
	public Employee(String name) {
		this.name= name;
		this.accounts = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public void addAccount(Account account) {
		accounts.add(account);
	}
	
	public List<Account> getAccounts(){
		return accounts;
	}
	
	public String getFormattedAccountInfo(){
		StringBuilder sb=new StringBuilder();
		for(Account acc :accounts) {
			sb.append(acc.getAcctType()).append(" $: ");
			sb.append(acc.getBalance());			
		}
		return sb.toString();
	}
}
