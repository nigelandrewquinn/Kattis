import java.util.Scanner;
public class mirror 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int x = Integer.parseInt(scan.next());
		for(int i = 0; i < x; i++)
		{
			int y = Integer.parseInt(scan.next());
			int z = Integer.parseInt(scan.next());
			String array [] = new String [y];
			for(int j = 0; j < y; j++)
			{
				array[j] = scan.next();
			}

			int k = 1+i;
			System.out.println("Test " + k);
			
			for(int j = array.length-1; j >= 0; j--)
			{
				String string = array[j];
				String reverse = new StringBuffer(string).reverse().toString();
				System.out.println(reverse);				
			}
		}
	}

}
