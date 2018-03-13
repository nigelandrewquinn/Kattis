import java.util.Scanner;
public class j
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int needs = scan.nextInt();
        int has = scan.nextInt();
        int ans1 = has-needs;
        int ans2 = needs-has;
        if (has>needs)
        {
            if (has-needs>1){
            System.out.println("Dr. Chaz will have " + (ans1) +" pieces of chicken left over!");}
            else 
            {
                System.out.println("Dr. Chaz will have " + (ans1) +" piece of chicken left over!");
            }
        }
        else if (has<needs)
        {
            if (needs-has>1){
            System.out.println("Dr. Chaz needs "+ (ans2) +" more pieces of chicken!");
            }
            else
            {
                System.out.println("Dr. Chaz needs "+ (ans2) +" more piece of chicken!");
            }
        }
    }
}
