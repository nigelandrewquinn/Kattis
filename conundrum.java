import java.util.Scanner;
public class CryptographersConundrum
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		String array[] = scan.nextLine().split("");
		int counter = 0;
		for (int i = 0; i < array.length; i++)
		{
	    if (array[i].compareTo("P") != 0)
	    {
		counter++;
	    }
	    if (array[i + 1].compareTo("E") != 0)
	    {
		counter++;
	    }
	    if (array[i + 2].compareTo("R") != 0)
	    {
		counter++;
	    }
	    i += 2;
		}
		System.out.println(counter);
	}
}
