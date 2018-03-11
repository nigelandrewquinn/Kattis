import java.util.Scanner;
public class spavanac
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int m = scan.nextInt();
        int temp = 0;
        if (m <45 && h!=0)
        {
            h = h-1;
            m = m-45;
            m = 60+m;
            System.out.println( h + " " + m);
        }
        else if (m <45 && h==0)
        {
            h = 23;
            m = m-45;
            m = 60+m;
            System.out.println( h + " " + m);
        }
        else
        {
            m = m-45;
            System.out.println( h + " " + m);

        }

    }
}
