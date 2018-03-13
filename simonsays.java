import java.util.*;
public class simonsays
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < n; i++)
		{
			String s = scan.nextLine();
			if (s.startsWith("Simon says"))
			{
				System.out.println(s.substring(11));
			}
		}
	}
}
