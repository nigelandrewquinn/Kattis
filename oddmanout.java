import java.util.*;
public class oddmanout 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		int count = 1;
		for(int i = 0; i < test; i++)
		{
			long result = 0;
			int n = scan.nextInt();
	        for (int j = 0; j < n; j++) 
	        {
	                int x = scan.nextInt();
	                result ^= x;
	        }
	        System.out.println("Case #" + count + ": " + result);
	        count++;
		}
	}
}
