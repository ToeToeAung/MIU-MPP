package MPP_Week1_StandardExam.prob2;

public class SavingsAccount extends Account{
	private double interestRate;
	
	public SavingsAccount(String accountId,double interestRate,double balance) {
		super(accountId,balance);
		this.interestRate =interestRate;
	}

	
	@Override
	public double computeUpdatedBalance() {
		return getBalance() + (interestRate * getBalance());
	}	
}
