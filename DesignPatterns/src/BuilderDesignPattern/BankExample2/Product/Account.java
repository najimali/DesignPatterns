package BuilderDesignPattern.BankExample2.Product;

public class Account {
	private String userName;
	private String password;
	private long loanAmount;
	private long accountNo;
	private double Balance;
	private double interestRate;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public String toString() {
		return "\n Account [\n userName=" + userName + "\n password=" + password + "\n loanAmount=" + loanAmount
				+ "\n accountNo=" + accountNo + "\n Balance=" + Balance + "\n interestRate=" + interestRate + "\n]";
	}

}
