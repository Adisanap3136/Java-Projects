import java.util.Scanner;
class StonePaper
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int rNum =  0;      //store random number between 1 to 3
		for (; ; )
		{
			//Math.random() generate a double value from 0.00 something
			//we multiply with value by 10;
			//and then to get an integer value we use typecasting.
			int num = (int)(Math.random()*10);
			if (num>=1&&num<=3)   //check digit in between 1 to 3
			{
				rNum = num;      //then only store
				break; //if digit found between 1 to 3 then terminate loop.
			}
		}   // for loop end heres
		//whether the random value is generated we need to map it with options
		String codeOpt = null;
		if (rNum==1)
		{
			codeOpt = "STONE";
		}
		else if (rNum==2)
		{
			codeOpt= "PAPER";
		}
		else if (rNum==3)
		{
			codeOpt = "SCISSOR";
		}
		//else{System.out.println();}

		System.out.println("\n         WELCOME \n");
		System.out.println("1.STONE  2.PAPER  3.SCISSOR \n");
		System.out.print("Enter the option: ");
		int opt = sc.nextInt();

		String userOpt = null;
		if (opt==1)
		{
			userOpt = "STONE";
		}
		else if (opt==2)
		{
			userOpt = "PAPER";
		}
		else if (opt==3)
		{
			userOpt = "SCISSOR";
		}
		else
		{
			System.out.println("INVALID INPUT");
			return;  //invalid option get treminate the execution.
		}

		System.out.println("User : "+userOpt+ " BOT: "+codeOpt );
		if ((opt==1&&rNum==3)||(opt==2&&rNum==1)||(opt==3&&rNum==2))
		{
			System.out.println("user Wins");
		}
		else if ((opt==1&&rNum==2)||(opt==2&&rNum==3)||(opt==3&&rNum==1))
		{
			System.out.println("BOT Wins");
		}
		else
		{
			System.out.println("DRAW THE GAME");
		}
	}
}