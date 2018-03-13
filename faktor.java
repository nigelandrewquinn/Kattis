import java.util.Scanner;
public class faktor
{

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int i = scan.nextInt();
        double x = a*i;
        while ((--x / a) > i - 1)
        {
        }
        System.out.println((int)++x);
    }
}
