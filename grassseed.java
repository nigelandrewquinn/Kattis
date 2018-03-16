import java.util.Scanner;
public class grassseed {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		double cost = scan.nextDouble();
		double number = scan.nextDouble();
		double ans = 0;
		for(int i = 0; i < number; i++) {
			ans = ans + (scan.nextDouble()*scan.nextDouble());
		}
		System.out.println(ans*cost);
	}
}
