import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
public class Planina {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int ans = 4;
		int count = 0;
		int input = Integer.parseInt(br.readLine());
		while(count!=input) {
			ans = (int) Math.pow(((Math.sqrt(ans)*2)-1),2);
			count++;
		}
		System.out.println(ans);
		
	}
}
