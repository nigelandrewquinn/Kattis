import java.util.Scanner;
public class quickestimate
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		int n = Integer.parseInt(a);
		for (int i = 0; i < n; i++)
		{
			String s = scan.nextLine();
			System.out.println(s.length());
		}
	}
}
