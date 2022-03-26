package BuilderDesignPattern.BankExample2.Builder;

import BuilderDesignPattern.BankExample2.Product.Account;

public interface AccountBuilder {

	void addAccountNumber(long accountNumber);

	void addCredential(String userName, String password);

	void addSavingBalance();

	void addInterestRate(double interestRate);

	void addLoanAmount(long loanAmount);

	Account getAccount();
}
