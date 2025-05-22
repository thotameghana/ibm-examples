package com.oops;

interface Bank{
	void diposite(int balance);
	void withdraw(int amount);
	void display();
}
class BankAccount implements Bank{
	private int accountNumber;
	private String accountHolderName;
	private float balance;
	public BankAccount() {
		// TODO Auto-generated constructor stub
	}
	public BankAccount(int accountNumber, String accountHolderName, float balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	@Override
	public void diposite(int balance) {
		this.balance+=balance;
	}
	@Override
	public void withdraw(int amount) {
		if(amount<balance) {
			System.out.println("Here is your Amount...."+amount);
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
	@Override
	public void display() {
		System.out.println(accountNumber+", "+accountHolderName+", "+balance);
	}
}
public class EncapsulationBank {
	public static void main(String[] args) {
		BankAccount ba=new BankAccount(101, "Meghana", 50000);
		ba.display();
		ba.diposite(50000);
		ba.withdraw(40000);
		ba.display();
	}
}
