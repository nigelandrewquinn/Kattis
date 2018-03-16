import java.util.Scanner;
public class JudgingMoose{
	public static void main(String args[]){ 
    	Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
    	int y = scan.nextInt();
    	if(x==0 && y==0)
            System.out.print("Not a moose");
        else if(x==y)
        	System.out.print("Even " + x*2);
        else if(x>y)
        	System.out.print("Odd " + x*2);
        else if(x<y)
        	System.out.print("Odd " + y*2);
    }
}
