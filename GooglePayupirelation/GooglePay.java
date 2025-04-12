package principleOfOop.GooglePayupirelation;

public class GooglePay {
	private String gmail;
	private String name;
	private long phno;
	private long debitCardNo;
	private long accNo;
	private int pin ;
	Bank b1;
	
	private GooglePay() {
	}

	public GooglePay(String gmail, String name, long phno, long debitCardNo, long accNo, Bank b1,int pin) {
		this.gmail = gmail;
		this.name = name;
		this.phno = phno;
		this.debitCardNo = debitCardNo;
		this.accNo = accNo;
		this.b1 = b1;
		this.pin=pin;
		System.out.println("Gpay Created");		
	}
	public void checkGpay()
	{
		System.out.println(b1.getBalance(accNo, pin));
	}
}
