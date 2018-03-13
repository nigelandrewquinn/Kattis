import java.util.Scanner;
public class helpaphd
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		String ns = scan.nextLine();
		String p = "P=NP";
		int n = Integer.parseInt(ns);
		for ( int i = 0; i < n; i++)
		{
			String s = scan.nextLine();
			if (s.equals(p))
			{
				System.out.println("skipped");
			}
			for ( int q = 0; q < s.length(); q++)
			{
				if (s.charAt(q)=='+')
				{
					int n1 = Integer.parseInt(s.substring(0,q));
					int n2 = Integer.parseInt(s.substring((q+1)));
					System.out.println(n1 + n2);
				}
			}
		}

	}
}
