import java.util.Scanner;
public class Trik 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int ball = 0;
		for (int i = 0; i < s.length(); i++)
		{
		    if (s.charAt(i) == 'A' && ball != 2)
		    {
		        ball = 1-ball;
		    }
		    if (s.charAt(i) == 'B' && ball != 0)
		    {
		    	ball = 3-ball;
		    }
		    if (s.charAt(i) == 'C' && ball != 1)
		    {
		    	ball = 2-ball;
		    }	
		}
		System.out.println(ball + 1);
	}
}
