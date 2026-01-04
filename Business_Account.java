package entities;

public class Business_Account extends Account {  // Herdou os dados da classe Account.
	
	private Double loanLimit;
	
	public Business_Account() {
		
	}

	public Business_Account(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	public void loan (double amount) {
		if (amount <= loanLimit) {
		balance += amount - 10.0;
		}
	}
	@Override
	public void withdraw (double amount) {
		super.withdraw(amount);
		balance -= 2.0;

	}
}
	

