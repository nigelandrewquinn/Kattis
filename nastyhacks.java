import java.util.Scanner;
public class nastyhacks {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 0; i < n; i++) {
			int r = scan.nextInt();
			int e = scan.nextInt();
			int c = scan.nextInt();
			if(r > e-c)
				System.out.println("do not advertise");
			else if(r == e-c)
				System.out.println("does not matter");
			else
				System.out.println("advertise");
			
		}
	}
}
