package principleOfOop.GooglePayupirelation;
import java.util.Scanner;

public class Bank {
	private long accNo;
	private double balance;
	private String name;
	private String bankName;
	private String ifscCode;
	private long phNo;
	private int pin;
	private long aadharNo;
	DebitCard d1;
	GooglePay gpay1;
	
	static Scanner sc = new Scanner(System.in);
	
	private Bank() {
	}

	public Bank(String name,long acc, String bank, String ifsc, long ph, long arNo,int pin) {
		if((acc==0||bank==null||ifsc==null||ph==0||arNo==0))
		{
			System.out.println("Error incomplete information");
		}
		else
		{
			this.name=name;
			this.accNo = acc;
			this.bankName = bank;
			this.ifscCode = ifsc;
			this.phNo = ph;
			this.aadharNo = arNo;
			this.pin=pin;
			System.out.println("Acount created!");
		}
	}
	
	public void createGooglePay(Bank b)
	{
		System.out.print("Enter phone no: ");
		long phn = sc.nextLong();
		System.out.print("Enter gamil: ");
		String gmail = sc.next();
		System.out.print("Enter pin: ");
		int pin = sc.nextInt();
		
		if(this.phNo==phn&&phNo==phn&&this.pin==pin)
		{
			gpay1 = new GooglePay(gmail, b.getName(), phn, d1.getDebitCardNo(), b.getAccNo(), b,pin);
		}
		else
		{
			System.out.println("Wrong information!");
		}
		
	}
	
	public void applyDebitcard(String bankName,long acc,int pin)
	{
			d1 = new DebitCard(bankName, acc, pin);
	}

	public void credit(long acc,long pin,double amt)
	{
		if(!(accNo==acc&&this.pin==pin))
		{
			System.out.println("Wrong credentials");
		}
		else
		{
			if(amt>0)
			{
				balance+=amt;
			}
			else
			{
				System.out.println("Wrong amount");
			}
		}
	}
	public void debit(long acc,long pin,double amt)
	{
		if(!(accNo==acc&&this.pin==pin))
		{
			System.out.println("Wrong credentials");
		}
		else
		{
			if(amt>0&&balance-amt>1000)
			{
				balance-=amt;
			}
			else
			{
				System.out.println("Wrong amount");
			}
		}
	}
	
	public long getAccNo() {
		return accNo;
	}

	public double getBalance(long acc,int pin) {
		if(accNo==acc&&this.pin==pin)
			return balance;
		else
		{
			System.out.println("Wrong credentials");
			return 0;
		}
	}
	
	public String getName()
	{
		return name;
	}

	public String getBankName() {
		return bankName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public long getPhNo() {
		return phNo;
	}

	public long getAadharNo() {
		return aadharNo;
	}
	
	
	
}
