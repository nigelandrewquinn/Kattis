import java.util.Scanner;
public class sumkindofproblem
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 1; i <= n; i++)
		{
			int useless = scan.nextInt();
			int num = scan.nextInt();
	
			System.out.print(i + " ");
			System.out.print((num * (num + 1) / 2) + " ");
			System.out.print(num * num + " ");
			System.out.println(num * (num + 1) + " ");
		}
	}
}
