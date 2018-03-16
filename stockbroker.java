import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class stockbroker {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));         
        long money = 100, shares = 0;
		int price = 0;
		boolean up = false;
		for (int d = Integer.parseInt(br.readLine()) - 1, previous = Integer.parseInt(br.readLine()); --d >= 0; previous = price) {
			price = Integer.parseInt(br.readLine());
			if (up && price < previous) {
				money += shares * previous;
				shares = 0;
				up = false;
			}
			if (!up && price > previous) {
				shares = Math.min(money/ previous, 100000L);
				money -= shares * previous;
				up = true;
			}
		}
		System.out.print(money + (shares * price));
        
	}
}
