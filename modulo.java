import java.util.Arrays;
import java.util.Scanner;
public class modulo {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int []array = new int[42];
		for(int i = 0; i < 10; i++){
			array[scan.nextInt() % 42]++;
		}
		int count = 0;
		for(int i = 0; i < 42; i++){
			if (array[i]> 0) 
				count++;
		}
		System.out.println(count);
	}
}
