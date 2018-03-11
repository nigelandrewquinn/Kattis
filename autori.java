import java.util.Scanner;
public class autori
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.print(s.charAt(0));
        for (int i = 1; i <s.length()-1; i++)
        {
            if (s.charAt(i)=='-')
            {
                //String s1 = "" + s.charAt(i+1);
                System.out.print(s.charAt(i+1));
            }
        }
    }
}
