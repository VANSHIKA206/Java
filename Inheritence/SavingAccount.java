
package Week3.Inheritence;

public class SavingAccount extends Account{

	public SavingAccount(int accountNo, String name, String address, int phoneNo, String dob, double balance) {
		super(accountNo, name, address, phoneNo, dob, balance);
		// TODO Auto-generated constructor stub
	}
     
	public void withdraw() {
		System.out.println("withdraw Method");
	}
	public void deposit() {
		System.out.println("deposit Method");
	}
	public void fixedDeposit() {
		System.out.println("fixed deposit Method");
	}
}
