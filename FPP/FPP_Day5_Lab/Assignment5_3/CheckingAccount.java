package FPP.FPP_Day5_Lab.Assignment5_3;


public class CheckingAccount extends Account  {
	
	public CheckingAccount(Employee emp,double balance) {
		super(emp,balance);
	}
	
	
	public String getAcctType() {
		return "CHECKING";
	}

	public double getBalance() {
		double balance =super.getBalance();
		balance -=0.20;
		setBalance(balance);
		return balance;
	}

}
