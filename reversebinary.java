import java.util.Scanner;
public class reversebinary
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        String binary = Integer.toBinaryString(x);
        String reverse = new StringBuffer(binary).reverse().toString();
        int ans = Integer.parseInt(reverse, 2);
        System.out.println(ans);

    }
}
