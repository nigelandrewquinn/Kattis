import java.util.*;
public class fizzbuzz
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int n = scan.nextInt();
        String f = "Fizz";
        String b = "Buzz";
        for( int i = 1; i <= n; i++)
        {
            if(i%x==0&&i%y==0)
            {
                System.out.println(f + b);
            }
            else if (i%x==0)
            {
                System.out.println(f);
            }
            else if (i%y==0)
            {
                System.out.println(b);
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}
