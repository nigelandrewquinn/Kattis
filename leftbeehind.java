import java.util.Scanner;
public class leftbeehind
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		while (1==1)
		{
			int a = scan.nextInt();
			int b = scan.nextInt();
			if ( a == 0 && b == 0)
			{
				break;
			}
			else if(a+b == 13)
			{
				System.out.println("Never speak again.");
			}
			else if (a>b)
			{
				System.out.println("To the convention.");
			}
			else if (a<b)
			{
				System.out.println("Left beehind.");
			}
			else if (a==b)
			{
				System.out.println("Undecided.");
			}
		}
	}
}
