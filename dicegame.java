import java.util.Scanner;
public class dicegame {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int e = 0;
		int g = 0;
		for(int i = 0; i < 4; i++) {
			g = g + scan.nextInt();
		}
		for(int i = 0; i < 4; i++) {
			e = e + scan.nextInt();
		}
		if(e > g)
			System.out.println("Emma");
		else if(e < g)
			System.out.println("Gunnar");
		else
			System.out.println("Tie");
	}
}
