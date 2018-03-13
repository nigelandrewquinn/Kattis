import java.util.*;
public class sibice
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), w = scan.nextInt(), h = scan.nextInt();
        double l = Math.sqrt((w*w)+(h*h));
        String array[] = new String[n];
        String da = "DA";
        String ne = "NE";
        for (int i = 0; i<array.length; i++)
        {
            int temp = scan.nextInt();
            if (temp<=l)
            {
                array[i] = da;
            }
            else
            {
                array[i] = ne;
            }
        }
        for ( int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
}
