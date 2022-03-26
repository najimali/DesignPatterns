package BuilderDesignPattern.BankExample2;

import BuilderDesignPattern.BankExample2.Builder.AccountBuilder;
import BuilderDesignPattern.BankExample2.ConcreateBuilder.LoanAccountBuilder;
import BuilderDesignPattern.BankExample2.ConcreateBuilder.SavingAccountBuilder;
import BuilderDesignPattern.BankExample2.Director.AccountConfigurationBuilder;
import BuilderDesignPattern.BankExample2.Product.Account;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountConfigurationBuilder config = new AccountConfigurationBuilder();
		AccountBuilder builder = new SavingAccountBuilder();

		Account account = config.BuildSavingAccount(builder);
		System.out.println(account);

		builder = new LoanAccountBuilder();
		account = config.BuildLoanAccount(builder);
		System.out.println(account);
	}

}
