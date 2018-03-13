import java.util.*;
public class parking2
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		int ans = 0;
		for (int i = 0; i < testCases; i++)
		{
			ans = 0;
			int n = scan.nextInt();
			int array[] = new int[n];
			for(int q = 0; q < n; q++)
			{
				array[q] = scan.nextInt();
			}
			Arrays.sort(array);
			for (int q = 0; q<n-1; q++)
			{
				ans = ans + (array[q+1] - array[q]);
			}
			ans = ans + (array[array.length-1]-array[0]);
			System.out.println(ans);

		}
	}
}
