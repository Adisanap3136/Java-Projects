import java.util.Scanner;
class OtpValidation
{
	public static void main(String[] args)
	{
		String otp="";
		for(int i=1;i<=1;)
		{
			otp += (int)(Math.random()*1000000);
			if(otp.length()==6)
			{
				i++;
				System.out.println(otp);
			}
			System.out.print("Enter the otp: ");
			String op=new Scanner(System.in).nextLine();
			if (otp.equals(op))
			{
				System.out.println("Login Successful!");
			}
			else
			{
				System.out.println("Invalid otp");
			}
		}
	}
}
