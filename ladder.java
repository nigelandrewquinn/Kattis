import java.util.*;
public class ladder
{

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
       int h = scan.nextInt();
       double   v = scan.nextInt();
       int ans = ((int)Math.ceil(h/Math.sin((Math.toRadians(v)))));
       System.out.println(ans);
    }
}
