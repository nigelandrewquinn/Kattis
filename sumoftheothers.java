import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class sumoftheothers{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long ans = 0;
        String sum = br.readLine();
        while(sum!=null) {
        	String array[] = sum.split(" ");
        	for(int i = 0; i < array.length; i++) {
                ans += Integer.parseInt(array[i]);
            }
        	bw.write(ans/2 + "\n");        
            bw.flush();
            ans = 0;
            sum = br.readLine();
        }
	}
}
