import java.util.Scanner;
public class oddities
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int array [] = new int [a];
        String oddeven[] = new String[a];
        for(int i = 0; i <array.length; i++)
        {
            int n = scan.nextInt();
            if (n%2== 0)
            {
                array[i] = n;
                oddeven[i] = "even";
            }
            else
            {
                array[i] = n;
                oddeven[i] = "odd";
            }
        }
        for(int i = 0; i <array.length; i++)
        {
            System.out.println(array[i] + " is " + oddeven[i]);
        }
        
    }
}
