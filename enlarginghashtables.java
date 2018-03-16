import java.util.Scanner;
public class enlarginghashtables 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			int n = scan.nextInt();
			int test = 0;
			if ( n == 0)
			{
				break;
			}
			if ( checkPrime(n) == true)
			{
				test = 2*n;
				while(true)
				{
					if (checkPrime(test)==true)
					{
						System.out.println(test);
						break;
					}
					else
					{
						test++;
					}
				}
			}
			else if ( checkPrime(n) == false)
			{
				test = 2*n;
				while(true)
				{
					if (checkPrime(test)==true)
					{
						System.out.println(test + (" (" + n + " is not prime)"));
						break;
					}
					else
					{
						test++;
					}
				}
			}
		}
	}
	public static boolean checkPrime(int n)
	{
		for(int i = 2; i <=Math.sqrt(n); i++)
		{
			if (n%i==0)
			{
				return false;
			}
		}
		return true;		
	}
}
