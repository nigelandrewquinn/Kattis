import java.util.*;
public class deathknight
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String d = "CD";
		int count = 0;
		for (int i = 0; i <= n; i ++)
		{
			String s = scan.nextLine();
			if (s.contains(d))
			{
				count++;
			}

		}
		System.out.println(n-count);
	}
}
