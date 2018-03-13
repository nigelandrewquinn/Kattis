import java.util.*;
public class kattis1
{
    public static void main(String[] args)
    { Scanner scan = new Scanner(System.in);
        while (1==1)
        {
            int n= scan.nextInt();
            if (n== -1)
            {
                break;
            }
            int prev = 0;
            int result = 0;
            for (int i= 0; i < n; i++)
            {
                int miles = scan.nextInt();
                int time= scan.nextInt();
                result += miles * (time - prev);
                prev = time;
            }
            System.out.println(result + " miles");
        }
    }
}
