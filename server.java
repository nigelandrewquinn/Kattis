import java.util.Scanner;
public class server
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int time = scan.nextInt();
		int tasks[] = new int [t];
		int sum = 0;
		int count = 0;
		for (int i = 0; i < tasks.length; i++)
		{
			tasks[i] = scan.nextInt();
			sum = sum + tasks[i];
			if (sum <= time)
			{
				count++;
			}
		}
		System.out.println(count);

	}
}
