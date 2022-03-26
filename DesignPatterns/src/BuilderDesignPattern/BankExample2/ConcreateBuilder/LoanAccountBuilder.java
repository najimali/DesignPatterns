package BuilderDesignPattern.BankExample2.ConcreateBuilder;

import BuilderDesignPattern.BankExample2.Builder.AccountBuilder;
import BuilderDesignPattern.BankExample2.Product.Account;

public class LoanAccountBuilder implements AccountBuilder {
	Account account = new Account();

	@Override
	public void addAccountNumber(long accountNumber) {
		// TODO Auto-generated method stub
		account.setAccountNo(accountNumber);

	}

	@Override
	public void addCredential(String userName, String password) {
		// TODO Auto-generated method stub
		account.setUserName(userName);
		account.setPassword(password);

	}

	@Override
	public void addSavingBalance() {
		// TODO Auto-generated method stub
		account.setBalance(1000);

	}

	@Override
	public void addInterestRate(double interestRate) {
		// TODO Auto-generated method stub
		account.setInterestRate(interestRate);

	}

	@Override
	public void addLoanAmount(long loanAmount) {
		// TODO Auto-generated method stub
		account.setLoanAmount(loanAmount);

	}

	@Override
	public Account getAccount() {
		// TODO Auto-generated method stub
		return account;
	}

}
