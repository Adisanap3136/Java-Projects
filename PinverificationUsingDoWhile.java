import java.util.Scanner;
class PinverificationUsingDoWhile 
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc =new Scanner(System.in);
		int storePin =3136;
		int seconds=5000;
		 outerLoop:
		for(;;)
		{
			 int attempts = 3;
			 do
			{
				 System.out.print("Enter the pin: ");
				 int pin= sc.nextInt();
				 if(storePin==pin)
				{
					 System.out.println("Phone unlocked");
					 break outerLoop;
				 }
				 else
				{
					System.out.println("Wrong pin");
					System.out.println("attempt left: "+(attempts-1));		
				 }
				 attempts--;
			 }while(attempts>=1);
			 System.out.println();
			 System.out.println("phone is Locked for: "+(seconds/1000)+" seconds" );
			 Thread.sleep(seconds);
			 seconds*=2;
			 System.out.println();

		 }
	}
}
