package principleOfOop.GooglePayupirelation;

public class BankDriver {
	public static void main(String[] args) {
		Bank b1 = new Bank("Arjun",123456798l, "SBI", "SBINPD", 8888888888l, 987654321l,1234);
		b1.applyDebitcard(b1.getBankName(),b1.getAccNo(),1234);
		b1.createGooglePay(b1);
		b1.credit(123456798l, 1234, 999999);
		b1.gpay1.checkGpay();
		System.out.println(b1.getBalance(123456798l, 1234));
		System.out.println(b1.getName());
		System.out.println(b1.getBankName());
		System.out.println(b1.getAccNo());
		System.out.println(b1.d1.getDebitCardNo());
		System.out.println("---------------------------");
		Bank b2 = new Bank("Bhahubali",987654321l, "BOM", "MAHB1649", 999999999l, 31516468484l,3333);
		b2.applyDebitcard(b2.getBankName(), b2.getAccNo(), 3333);
		b2.createGooglePay(b2);
		b2.credit(987654321l, 3333, 7777777);
		b2.gpay1.checkGpay();
		System.out.println(b2.getBalance(987654321l, 3333));
		System.out.println(b2.getName());
		System.out.println(b2.getBankName());
		System.out.println(b2.getAccNo());
		System.out.println(b2.d1.getDebitCardNo());
	}
}