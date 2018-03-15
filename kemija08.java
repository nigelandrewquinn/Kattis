import java.util.Scanner;
public class kemija08 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		for( int i = 0; i < s.length(); i++)
		{
			if( s.charAt(i) == 'a'|| s.charAt(i) =='e'||s.charAt(i) =='i'||s.charAt(i) =='o'||s.charAt(i) =='u' )
			{
				System.out.print(s.charAt(i));
				i +=2;
			}
			else
			{
				System.out.print(s.charAt(i));
			}
		}
	}
}
