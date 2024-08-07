package FPP.FPP_Day5_Lab.Assignment5_3;


public class RetirementAccount extends Account {

	public RetirementAccount(Employee emp,double balance) {
		super(emp,balance);
	}
	
	public String getAcctType() {
		return "RETIREMENT";
	}
	
	public boolean withdraw(double amount) {
		double balance=super.getBalance();
		if(balance>=amount +1.00) {
			balance -= (amount +1.00);
			setBalance(balance);
			return true;
		}else {
			System.out.println("Insufficient fund.");
			return false;
		}
		
	}
	
}
