import java.util.Scanner;
public class cold
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count=0;
        for ( int i = 0; i < n; i++)
        {
            int a = scan.nextInt();
            if ( a < 0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
