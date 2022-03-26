package BuilderDesignPattern.BankExample2.Director;

import BuilderDesignPattern.BankExample2.Builder.AccountBuilder;
import BuilderDesignPattern.BankExample2.Product.Account;

public class AccountConfigurationBuilder {
	public Account BuildLoanAccount(AccountBuilder builder) {
		builder.addAccountNumber(78698750);
		builder.addLoanAmount(100000);
		builder.addInterestRate(8.6);
		builder.addCredential("Loan Account", "Password");

		return builder.getAccount();
	}

	public Account BuildSavingAccount(AccountBuilder builder) {

		builder.addAccountNumber(32987304);
		builder.addSavingBalance();
		builder.addCredential("Saving Account", "Password");

		return builder.getAccount();
	}
}
