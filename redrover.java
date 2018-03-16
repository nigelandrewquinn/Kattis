import java.util.Scanner;
public class redrover
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String line = scan.next();
		int ans = line.length();
		for (int i = 0; i < line.length() - 1; i++)
		{
			for (int j = i + 1; j < line.length(); j++)
			{
				String substring = line.substring(i, j + 1);
				int length = line.replaceAll(substring, "M").length() + substring.length();
				if (length < ans)
				{
					ans = length;
				}
			}
		}
		System.out.println(ans);
	}
}
