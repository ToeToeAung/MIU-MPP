package MPP_Week1_StandardExam.prob2;

public abstract class Account {
	private String accountId;	
	private double balance;
	
	public Account(String accountId,double balance) {
		this.accountId = accountId;
		this.balance =balance;
	}
	
	public String getAccountID(){
		return accountId;
	}
	
	public  double getBalance() {
		return balance;
	}
	
	public abstract double computeUpdatedBalance();	
}
