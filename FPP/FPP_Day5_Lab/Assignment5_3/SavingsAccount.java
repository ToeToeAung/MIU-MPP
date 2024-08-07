package FPP.FPP_Day5_Lab.Assignment5_3;

public class SavingsAccount extends Account{

	public SavingsAccount(Employee emp,double balance) {
		super(emp,balance);
	}
	
	public String getAcctType() {
		return "SAVINGS";
	}
	
	public double getBalance() {
		double balance =super.getBalance();
		balance-=0.10;
		return balance;
	}
	
}
