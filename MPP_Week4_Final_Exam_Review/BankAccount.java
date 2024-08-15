package MPP_Week4_Final_Exam_Review;

import java.util.Objects;

public class BankAccount implements Cloneable {

	String accountNumber;
	double balance;
	Customer c1;
	
	public BankAccount(String accountNumber, double balance,Customer c1) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.c1=c1;
	}
	
	@Override
	public boolean equals(Object obj) {
		//if(this == obj) return true;
		if(obj == null) return false;
		if(getClass()!=obj.getClass()) return false;
		BankAccount b =(BankAccount) obj;			
		return accountNumber.equals(b.accountNumber) && balance == b.balance && c1.equals(b.c1);
	}
	
	@Override
	public String toString() {
		return "Bank Account Number : " + accountNumber + " Balance :" + balance +" Customer: " +c1;
	}
	@Override
	public int hashCode() {
		//return Objects.hash(accountNumber);
		return Objects.hash(accountNumber,balance,c1);
		//return accountNumber.hashCode();
	}
	@Override
	public BankAccount clone() throws CloneNotSupportedException {
		BankAccount bankCopy=(BankAccount) super.clone();
		bankCopy.c1 = (Customer) c1.clone();
		return bankCopy;
	}
}
