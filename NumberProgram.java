import java.util.Scanner;
class NumberProgram
{
	public static void main(String[] args)
	{
		while(true){
			Scanner sc =new Scanner(System.in);
			System.out.println("1. Check Num is Prime or Not");
			System.out.println("2. Prime Number Range");
			System.out.println("3. Check Num is Even Or Odd");
			System.out.println("4. Find the Power of Num");
			System.out.println("5. Find the factorial of Num");
			System.out.println("6. Reverse the Number: ");
			System.out.println("7. Reverse the String: ");
			System.out.println("8. Armstrong Number: ");
			System.out.println("Enter any value to exit");
			System.out.print("Enter the choice: ");
			int ch=sc.nextInt();
			System.out.println();
			switch(ch)
			{
				case 1:{
					System.out.print("Enter the num: ");
					int n=sc.nextInt();
					primeOrNot(n);//method calling
					break;
				}
				case 2:{
					System.out.print("Enter the Range: ");
					int n=sc.nextInt();
					primeRange(n);
					break;
				}
				case 3:{
					System.out.print("Enter the num: ");
					int n=sc.nextInt();
					evenOrNot(n);
					break;
				}
				case 4: {
					System.out.print("Enter the Num: ");
					int n=sc.nextInt();
					System.out.print("Enter the Power: ");
					int m=sc.nextInt();
					Power(n,m);
					break;
				}
				case 5:{
					System.out.print("Enter the num: ");
					int n=sc.nextInt();
					factorial(n);
					break;
				}
				case 6:{
					System.out.print("Enter the Range: ");
					int n=sc.nextInt();
					reverseNum(n);
					break;
				}
				case 7:{
					System.out.print("Enter the String: ");
					String str=sc.next();
					reverseString(str);
					break;
				}
				case 8:{
					System.out.print("Enter the number: ");
					int n=sc.nextInt();
					armStrong(n);
					break;
				}
				default: System.out.println("Invalid Input!"); return;
			}
			System.out.println();
		}
	}
	public static void primeOrNot(int a)
	{
		//this code only check if a number is prime or not
		boolean flag=true;
		for(int i=2;i<a;i++)
		{
			if(a%i==0){
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println(a+" is Prime");
		else
			System.out.println(a+" is NOT Prime");
	}

	public static void primeRange(int a)
	{
		//this code print prime number range
		System.out.println("The Number range 1 to: "+a);
		for(int i=2;i<=a;i++)
		{
			boolean flag=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0){
					flag=false;
					break;
				}
			}
			if(flag)
				System.out.print(i+"  ");
		}
	}

	public static void evenOrNot(int a)
	{
		//this code check if a number is even or not
		System.out.println();
		if(a%2==0)
			System.out.println(a+" is Even Number");
		else
			System.out.println(a+" is Odd Number");
	}

	public static void Power(int num,int p)
	{
		//this code find the power of number
		int pow=1;
		for(int i=1;i<=p;i++)
			pow*=num;
		System.out.println(num+"^"+p+" = "+pow);
	}

	public static void factorial(int a)
	{
		//this code can find the factorial of number
		int fact=1;
		for(int i=1;i<=a;i++)
			fact*=i;
		System.out.println(a+" factorial is: "+fact);
	}

	public static void reverseNum(int a)
	{
		//this code can reverse the number;
		boolean flag=true;
		if(a<0)
		{
			flag =false;
			a=a*(-1);
		}
		int rev=0;
		for(int i=a;i>0;i/=10)
			rev=rev*10+(i%10);
		if(!flag)
		{
			rev=rev*(-1);
			System.out.println(a+" Now reverse is: "+rev);
		}else
			System.out.println(a+" Now reverse is: "+rev);
	}

	public static void reverseString(String ch)
	{
		//this code reverse the String
		String rev="";
		for(int i=0;i<ch.length();i++)
		{
			char c =ch.charAt(i);
			rev=c+rev;
		}
		System.out.println(ch+" reversed string is: "+rev);
	}

	public static void armStrong(int a)
	{
		//this code check the num is armstrong or not
		int len=0;
		for(int i=a;i>0;i/=10)
			len++;
		int sum=0;
		for(int j=a;j>0;j/=10)
		{
			int pow=1;
			for(int i=1;i<=len;i++)
				pow*=(j%10);
			sum+=pow;
		}
		System.out.println(sum==a?+a+" is Armstrong Number":a+" is NOT Armstrong Number");
	}
}