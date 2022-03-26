package BuilderDesignPattern.BankAccountExample;
//Idea of builder pattern is remove dependencies on number of paramter 

// ideally a constructor should max have 2 paramaters if it is 3 
// then there should be clear explantions 
// In the LoanAccountBuilder we have 6 parameters 
//userName;
//password;
//loanAmount;
//accountNo;
//loanStatus;
//interestRate;
// when we required to create LoanAccout object we need to pass all 
// for eg 

//LoanAccountBuilder(params1,params2,...)
//so in order to reduce this dependency we break large constructor
// into small one by using LoanAccountBuilder setParam1(params1){ this.params1 = parasm1; return this}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoanAccountBuilder loanAccountBuilder = new LoanAccountBuilder().setAccountNo(111).setUserName("Najim")
				.setPassword("Password").setInterestRate(4.6);
		System.out.println(loanAccountBuilder);

	}

}
