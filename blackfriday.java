import java.util.*;
public class blackfriday
{
	private static Scanner scan;
	public static void main(String args[])
	{
		scan = new Scanner(System.in);
		int n = scan.nextInt();
		int array[] = new int[n];
		int temp[] = new int[n];
		for (int i = 0; i < array.length; i++)
		{
			array[i] = scan.nextInt();
			temp[i] = array[i];
		}
		Arrays.sort(temp);
		int k = 0;
		int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0;
			while(true)
			{
				if ( k == array.length)
				{
					break;
				}
				if (temp[k] == 1)
				{
					count1++;
				}
				else if (temp[k] !=1)
				{
					break;
				}
				k++;
			}
			while(true)
			{
				if ( k == array.length)
				{
					break;
				}
				if (temp[k] == 2)
				{
					count2++;
				}
				else if (temp[k] !=2)
				{
					break;
				}
				k++;
			}
			while(true)
			{
				if ( k == array.length)
				{
					break;
				}
				if (temp[k] == 3)
				{
					count3++;
				}
				else if (temp[k] !=3)
				{
					break;
				}
				k++;
			}
			while(true)
			{
				if ( k == array.length)
				{
					break;
				}
				if (temp[k] == 4)
				{
					count4++;
				}
				else if (temp[k] !=4)
				{
					break;
				}
				k++;
			}
			while(true)
			{
				if ( k == array.length)
				{
					break;
				}
				if (temp[k] == 5)
				{
					count5++;
				}
				else if (temp[k] !=5)
				{
					break;
				}
				k++;
			}
			while(true)
			{
				if ( k == array.length)
				{
					break;
				}
				if (temp[k] == 6)
				{
					count6++;
				}
				else if (temp[k] !=6)
				{
					break;
				}
				k++;
			}
			if ( count6 == 1)
			{
				for(int i = 0; i < array.length; i++)
				{
					if (array[i] == 6)
					{
						System.out.println(i+1);
					}
				}
			}
			else if (count5 == 1)
			{
				for(int i = 0; i < array.length; i++)
				{
					if (array[i] == 5)
					{
						System.out.println(i+1);
					}
				}
			}
			else if (count4 == 1)
			{
				for(int i = 0; i < array.length; i++)
				{
					if (array[i] == 4)
					{
						System.out.println(i+1);
					}
				}
			}
			else if (count3 == 1)
			{
				for(int i = 0; i < array.length; i++)
				{
					if (array[i] == 3)
					{
						System.out.println(i+1);
					}
				}
			}
			else if (count2 == 1)
			{
				for(int i = 0; i < array.length; i++)
				{
					if (array[i] == 2)
					{
						System.out.println(i+1);
					}
				}
			}
			else if (count1 == 1)
			{
				for(int i = 0; i < array.length; i++)
				{
					if (array[i] == 1)
					{
						System.out.println(i+1);
					}
				}
			}
			else
			{
				System.out.println("none");
			}
	}
}
