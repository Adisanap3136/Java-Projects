package principleOfOop;

public class BankEncapsulation {
	private String bankName;
	private String ifsc;
	private String username;
	private long accNo;
	private double balance;
	private int pin;
		
	public BankEncapsulation(String bankname, String ifsc, String username, long accNo, int pin) {
		bankName = bankname;
		this.ifsc = ifsc;
		this.username = username;
		this.accNo = accNo;
		this.pin = pin;
	}
	public String getUserName()
	{
		return username;
	}
	public String getBankName()
	{
		return bankName;
	}
	public long getAccNo()
	{
		return accNo;
	}
	public String getIfsc()
	{
		return ifsc;
	}
	public void setPin(long acc,int pin,int newPin)
	{
		if(accNo==acc && this.pin==pin)
		{
			this.pin = newPin;
			System.out.println("Pin updated successfully!");
		}
		else
		{
			System.out.println("Invalid credentials");
		}
	}
	public double getBalance(long acc,int pin)
	{
		if(accNo==acc && this.pin==pin)
		{
			return balance;
		}
		else
		{
			System.out.println("Invalid Credential");
			return balance;
		}
	}
	public void credit(long acc,int pin,double amt)
	{
		if(accNo==acc&&this.pin==pin)
		{
			if(amt>0)
			{
				balance+=amt;
				System.out.println("Credied successfully!");
			}
			else
			{
				System.out.println("Invalid Amount");
			}
		}
		else
		{
			System.out.println("Invalid Credential for credit");
		}
	}
	public void debit(int acc,int pin,double amt)
	{
		if(accNo==acc&&this.pin==pin)
		{
			if(amt>0)
			{
				if(balance-amt>100)
				{
					balance-=amt;
					System.out.println("Debited Successfully");
				}
			}
			else
			{
				System.out.println("Invalid Amount!");
			}
		}
		else
		{
			System.err.println("Invalid credentials for debit");
		}
	}
	
}
