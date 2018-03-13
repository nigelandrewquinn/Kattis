import java.util.Scanner;
public class hissingmicrophone
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        boolean hiss = false;
        for(int i = 0; i < s.length()-1; i++)
        {
            if (s.charAt(i)== 's' && s.charAt(i+1) == 's')
            {
                hiss = true;
            }
        }
        if (hiss == true)
        {
            System.out.println("hiss");
        }
        else
        {
            System.out.println("no hiss");
        }
    }
}
