import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
public class akcija {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(prices);
        int ans = 0;
        for (int i = n-1; i >= 0; i--) {
            int price = prices[i];
            if ((i + 1) >= 3) {
                int currentPrice = prices[i] + prices[i - 1] + prices[i - 2];
                price = Math.min(prices[i], prices[i - 1]);
                price = currentPrice - Math.min(price, prices[i - 2]);
                i -= 2;
            }
            ans += price;
        }
        bw.write(ans + "\n");
        bw.flush();
	}
}
