import java.util.Scanner;
public class timeloop
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        for (int i = 1; i <= x; i++)
        {
            System.out.println(i + " " + "Abracadabra");
        }
    }
}
