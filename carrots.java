import java.util.Scanner;
public class carrots 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int carrots = scan.nextInt();
        String S[] = new String[n];
        for (int i = 0; i < n; i++)
        {
            S[i] = scan.nextLine();
        }
        System.out.println(carrots);
    }
}
