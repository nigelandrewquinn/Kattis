import java.util.Scanner;
public class mixedfractions
{
    public static void main(String args[])
    {
        int num1 = 1;
        int num2 = 1;
        Scanner scan = new Scanner(System.in);
        while((num1 = scan.nextInt()) != 0 && (num2 = scan.nextInt()) != 0)
        {
        	int whole = num1 / num2;
            num1 = num1 % num2;
            System.out.println(whole + " " + num1 + " / " + num2);
        }
    }
}
