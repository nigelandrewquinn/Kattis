import java.util.Scanner;
public class filip
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String num1 = new String(new StringBuilder(scan.next()).reverse());
        String num2 = new String(new StringBuilder(scan.next()).reverse());

        int A = Integer.parseInt(num1);
        int B = Integer.parseInt(num2);
        
        if (A>B)
        {
            System.out.println(A);
        }
        else if(A<B)
        {
            System.out.println(B);
        }
    }
}
