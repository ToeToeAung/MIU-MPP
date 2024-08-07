package FPP.FPP_Day5_Lab.Assignment5_3;

public abstract  class Account {

    private double balance;
    private Employee employee;
    
    public Account(Employee emp,double balance) {
    	this.employee = emp;
    	this.balance = balance;
    }
    
    public abstract String getAcctType();
    
    public double getBalance() {
    	return balance;
    }
    public void setBalance(double balance) {
    	this.balance = balance;
    }
    public void deposit(double amount) {
    	balance +=amount;
    }
    
    public boolean withdraw(double amount) {
    	if(balance >= amount) {
    		balance -= amount;
    		return true;
    	}else {
    		System.out.println("Withdrawal cannot be made because of insufficient funds.");
    		return false;
    	}    	
    }  

}
