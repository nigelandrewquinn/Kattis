import java.util.*;
public class apaxiaaans
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		for ( int i = 0; i < s.length()-1; i++)
		{
			if(s.charAt(i) != s.charAt(i+1))
			{
				System.out.print(s.charAt(i));
			}
		}
		System.out.print(s.charAt(s.length()-1));
	}
}
