package BuilderDesignPattern.BankAccountExample;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoanAccountBuilder loanAccountBuilder = new LoanAccountBuilder().setAccountNo(111).setUserName("Najim")
				.setPassword("Password").setInterestRate(4.6);
		System.out.println(loanAccountBuilder);

	}

}
