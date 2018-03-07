import java.util.Scanner;
public class aaah
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int count1 = 0, count2 = 0;
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        for (int i = 0; i < s1.length()-1; i++)
        {
            if ( s1.charAt(i)=='a')
            {
                count1++;
            }
        }
        for (int i = 0; i < s2.length()-1; i++)
        {
            if ( s2.charAt(i)=='a')
            {
                count2++;
            }
        }
        if(count2 <= count1)
        {
            System.out.println("go");
        }
        else
        {
            System.out.println("no");
        }
    }
}
