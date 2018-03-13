import java.util.*;
public class pot
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        double ans = 0;
        for (int i = 0; i < x; i++)
        {
            int q = scan.nextInt();
            int num = q/10;
            int pow = q%10;
            ans = ans + Math.pow(num,pow);
        
        }
         int fans = (int) ans;
        System.out.println(fans);
    }
}
