import java.util.*;
public class everywhere
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < n; i++)
		{
			int count = 0;
			int t = Integer.parseInt(scan.nextLine());
			String array[] = new String[t];
			for(int q = 0; q<t; q++)
			{
				array[q] = scan.nextLine();
			}
			Arrays.sort(array);
			for (int q = 0; q < t-1; q++)
			{
				if ( array[q].equals(array[q+1]))
				{
					count++;
				}
			}
			int ans = t - count;
			System.out.println(ans);
		}
	}
}
