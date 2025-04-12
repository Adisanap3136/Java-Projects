package principleOfOop;

public class BankEncapsulationDriver {
	public static void main(String [] args)
	{
		BankEncapsulation b1 = new BankEncapsulation("SBI", "SBIN2025", "Raju", 123456789, 3136);
		System.out.println("Bank: "+b1.getBankName());
		System.out.println("IFSC Code: "+b1.getIfsc());
		System.out.println("User Name: "+b1.getUserName());
		
		b1.credit(123456789, 3136, 19999);
		
		System.out.println("Balance: "+b1.getBalance(123456789,3136));
		
		b1.setPin(123456789, 3136, 9850);

		b1.debit(123456789, 0000,9000);
		
		System.out.println("Balance: "+b1.getBalance(123456789,3136));
	}

}