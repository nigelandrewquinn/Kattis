import java.util.Scanner;
public class TheEasiestProblemIsThisOne 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		while (true)
		{
			String n = scan.nextLine();
			if (n.equals("0"))
				break;
			String [] s = n.split("");
			int sum = 0;
			for(int i = 0; i < s.length; i++)
			{
				sum = sum + Integer.parseInt(s[i]);
			}
			//sum is the sum of the digits imputed
			int x = Integer.parseInt(n);
			int count= 11;
			int temp = 0;
			String tem = "";
			while(true)
			{
				temp = x*count;
				tem = "" + temp;
				String [] b = tem.split("");
				int add = 0;
				for(int i = 0; i < b.length; i++)
				{
					add = add + Integer.parseInt(b[i]);
				}
				if( add == sum)
					break;
				count++;
				add = 0;
			}
			System.out.println(count);
		}
	}

}
