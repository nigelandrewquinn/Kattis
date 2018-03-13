import java.util.Scanner;
public class sevenwonders {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int countT = 0;
        int countC = 0;
        int countG = 0;
        int bonus = 0;
        for ( int i = 0; i<input.length();i++)
        {
            if (input.charAt(i)=='T')
            {
                countT++;
            }
            if (input.charAt(i)=='C')
            {
                countC++;
            }
            if (input.charAt(i)=='G')
            {
                countG++;
            }
        }
        for(int i=0; i < 20; i++)
        {
        if (countT >i && countC >i && countG >i)
        {
            bonus = bonus + 7;
        }
        }
        int ans = ((countC*countC)+(countT*countT)+(countG*countG)+bonus);
        System.out.println(ans);

    }
}
