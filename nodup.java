import java.util.*;
public class nodup {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String string = scan.nextLine();
		String array[] = string.split(" ");
		Arrays.sort(array);
		int count = 0;
		for(int i = 0; i < array.length-1; i++)
		{
			String s1 = array[i];
			String s2 = array[i+1];
			if (s1.equals(s2))
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

}
