package BuilderDesignPattern.BankExample2.ConcreateBuilder;

import BuilderDesignPattern.BankExample2.Builder.AccountBuilder;
import BuilderDesignPattern.BankExample2.Product.Account;

public class SavingAccountBuilder implements AccountBuilder {
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
		account.setBalance(500);

	}

	@Override
	public void addInterestRate(double interestRate) {
		// TODO Auto-generated method stub
		return;

	}

	@Override
	public void addLoanAmount(long loanAmount) {
		// TODO Auto-generated method stub
		return;

	}

	@Override
	public String toString() {
		return "SavingAccountBuilder [account=" + account + "]";
	}

	@Override
	public Account getAccount() {
		// TODO Auto-generated method stub
		return account;
	}

}
