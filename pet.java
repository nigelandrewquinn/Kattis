import java.util.*;
public class pet
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		int ans = 0;
			for(int q = 0; q<4; q++)
			{
				int input = scan.nextInt();
				num1 = num1 + input;
			}
			for(int q = 0; q<4; q++)
			{
				int input = scan.nextInt();
				num2 = num2 + input;
			}
			for(int q = 0; q<4; q++)
			{
				int input = scan.nextInt();
				num3 = num3 + input;
			}
			for(int q = 0; q<4; q++)
			{
				int input = scan.nextInt();
				num4 = num4 + input;
			}
			for(int q = 0; q<4; q++)
			{
				int input = scan.nextInt();
				num5 = num5 + input;
			}
		
		if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5)
		{
			System.out.println("1 " + num1);
		}
		if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5)
		{
			System.out.println("2 " + num2);
		}
		if (num3 > num2 && num3 > num1 && num3 > num4 && num3 > num5)
		{
			System.out.println("3 " + num3);
		}
		if (num4 > num2 && num4 > num3 && num4 > num1 && num4 > num5)
		{
			System.out.println("4 " + num4);
		}
		if (num5 > num2 && num5 > num3 && num5 > num4 && num5 > num1)
		{
			System.out.println("5 " + num5);
		}



	}
}
