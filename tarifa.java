import java.util.Scanner;
public class tarifa
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int n = scan.nextInt();
        int ans = 0;
        for (int i = 0; i <n; i++)
        {
          int p = scan.nextInt();
          ans = (ans+x) - p;
        }
        ans += x;
        System.out.println(ans);
    }
}
