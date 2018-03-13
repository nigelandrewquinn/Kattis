import java.util.*;
public class j
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int e = scan.nextInt(), f = scan.nextInt(), c = scan.nextInt();
        int count = 0, newCount=0, total = e+f;
        while (total >0)
        {
            total--;
            count++;
            if (count==c)
            {
                total++;
                count=0;
                newCount++;
            }

        }
        System.out.println(newCount);
    }
}
