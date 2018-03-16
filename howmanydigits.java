import java.util.Scanner;
public class howmanydigits {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			while (scan.hasNextInt()){
				int n = scan.nextInt();
				System.out.println((int)(Math.log10(Math.sqrt(2 * n * Math.PI)) + n*Math.log10(n / Math.E)) + 1);
			}
	}
}
