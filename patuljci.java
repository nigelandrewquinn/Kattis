import java.util.Scanner;
public class patuljci
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int array[] = new int[9];
		int sum = 0;
		int n1 = 0;
		int n2 = 0;
		for( int i = 0; i < 9; i++)
		{
			array[i] = scan.nextInt();
			sum = sum + array[i];
		}
		int dif = sum - 100;
		boolean found = false;
		for(int i = 0; i < 9; i++)
		{
			int temp = array[i];
			for (int q = 0; q < 9; q++)
			{
				if (temp!= array[q] && temp+array[q]==dif)
					{
						n1 = temp;
						n2 = array[q];
						found = true;
						break;

					}
					if (found == true)
					{
						break;
					}
			}
		}

		for ( int i = 0; i < 9; i++)
		{
			if (array[i] != n1 && array[i] != n2)
			{
				System.out.println(array[i]);
			}
		}
	}
}
