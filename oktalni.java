import java.util.*;
public class Oktalni 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String ans = "";
		String array[] = s.split("");
		if (array.length % 3 == 1) 
		{
            ans = "1";
		}
		else if (array.length % 3 == 2)
		{
            ans = "" + Integer.parseInt(("01" + array[1]), 2);
        }
		for (int i = array.length % 3; i < array.length; i += 3) 
		{
            ans = ans + Integer.parseInt((array[i] + array[i + 1] + array[i + 2]), 2);
        }
        System.out.println(ans);
	}
}
