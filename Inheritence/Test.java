package Week3.Inheritence;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		LoanAccount la = new LoanAccount(123,"Neha ","axyz",4568,"7-9-2001",7690);
		la.closeAccount();
		la.payEMI();
		la.repayment();
		la.topUpLoan();
		
		System.out.println(la.getAccountNo());
		System.out.println(la.getAddress());
		System.out.println(la.getDob());
		System.out.println(la.getName());
		System.out.println(la.getPhoneNo());
		
		
		
		SavingAccount sa= new SavingAccount(456,"Vanshika","abc",78652,"7-11-2011",4657);
		sa.closeAccount();
		sa.withdraw();
		sa.deposit();
		sa.fixedDeposit();
		
		System.out.println(sa.getAccountNo());
		System.out.println(sa.getAddress());
		System.out.println(sa.getBalance());
		System.out.println(sa.getDob());
		System.out.println(sa.getName());
		System.out.println(sa.getPhoneNo());
		
	}

}
