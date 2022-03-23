package BuilderDesignPattern.BankAccountExample;

public class LoanAccountBuilder {
	private String userName;
	private String password;
	private long loanAmount;
	private long accountNo;
	private boolean loanStatus;
	private double interestRate;

	public LoanAccountBuilder setUserName(String userName) {
		this.userName = userName;
		return this;
	}

	public LoanAccountBuilder setPassword(String password) {
		this.password = password;
		return this;
	}

	public LoanAccountBuilder setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
		return this;
	}

	public LoanAccountBuilder setAccountNo(long accountNo) {
		this.accountNo = accountNo;
		return this;
	}

	public LoanAccountBuilder setLoanStatus(boolean loanStatus) {
		this.loanStatus = loanStatus;
		return this;
	}

	public LoanAccountBuilder setInterestRate(double interestRate) {
		this.interestRate = interestRate;
		return this;
	}

	@Override
	public String toString() {
		return "LoanAccountBuilder [userName=" + userName + ", password=" + password + ", loanAmount=" + loanAmount
				+ ", accountNo=" + accountNo + ", loanStatus=" + loanStatus + ", interestRate=" + interestRate + "]";
	}

	private boolean canBuild() {

		return this.accountNo > 10000;
	}

	public LoanAccountBuilder build() {

		return this;
	}

}
