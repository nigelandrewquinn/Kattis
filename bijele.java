import java.util.Scanner;
public class bijele
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int king = scan.nextInt();
        int queen = scan.nextInt();
        int rooks = scan.nextInt();
        int bishops = scan.nextInt();
        int knights = scan.nextInt();
        int pawns = scan.nextInt();
        System.out.print((1-king)+" "+(1-queen)+" "+(2-rooks)+" "+(2-bishops)+" "+(2-knights)+" "+(8-pawns));
    }
}
/*One king
One queen
Two rooks
Two bishops
Two knights
Eight pawns*/
