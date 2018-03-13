import java.util.Scanner;
public class oddgnome
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(), count = 0, temp = 0;
		for ( int i = 0; i < n; i++)
		{
			count = 1;
			int m = scan.nextInt();
			int array[] = new int[m];
			for ( int q = 0; q < m; q++)
			{
				array[q] = scan.nextInt();
			}
			for ( int q = 0; q < m-1; q++)
			{
				if ( array[q+1]-array[q]==1)
				{
					count++;
				}
				else
				{
					count++;
					System.out.println(count);
					break;
				}
			}

		}
	}
}
