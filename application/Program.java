package application;

import entities.Account;
import entities.Business_Account;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acc = new Account(1001, "Alex", 0.0);
		
		Business_Account bacc = new Business_Account (1002, "Maria", 0.0, 500.00);
		
		// UPCASTING
		
		Account acc1 = bacc;
	
		Account acc2 = new Business_Account(1003, "Bob", 0.0, 200.00);
		
		Account acc3 = new SavingsAccount (1004, "Ana", 0.0, 0.01);
		
		
		// DOWNCASTING
		
		Business_Account acc4 = (Business_Account) acc2;
		
		acc4.loan(100.0);
		
		// Business_Account acc5 = (Business_Account) acc3;
		
		if(acc3 instanceof Business_Account) {
			Business_Account acc5 = (Business_Account) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}

}
