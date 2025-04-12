package principleOfOop.GooglePayupirelation;

public class DebitCard {
	private String bankName;
	private long accNo;
	private int pin;
	private long debitCardNo;
	
	private DebitCard() {
	}

	public DebitCard(String bankName, long accNo, int pin) {
		this.bankName = bankName;
		this.accNo = accNo;
		this.pin = pin;
		debitCardNo=(long)(Math.random()*10000000000l);
		System.out.println("Credit Card generated!");
	}

	public String getBankName() {
		return bankName;
	}

	public long getAccNo() {
		return accNo;
	}

	public long getDebitCardNo() {
		return debitCardNo;
	}
	
	
}
