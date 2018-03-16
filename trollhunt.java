import java.util.*;
public class trollhunt {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt()-1;
		int b = scan.nextInt()/scan.nextInt();
		if ( a % b == 0)
			System.out.print(a/b);
		else
			System.out.print((a/b)+1);
	} 
}
