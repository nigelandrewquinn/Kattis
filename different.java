import java.util.*;
public class different
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext())
        {

            long a = scan.nextLong();
            long b = scan.nextLong();
            long ans = 0;
            a = Math.abs(a);
            b = Math.abs(b);
            if ( a > b)
            {
                ans = a-b;
            }
            else if ( a < b)
            {
                ans = b-a;
            }
            System.out.println(ans);
        }


    }
}
