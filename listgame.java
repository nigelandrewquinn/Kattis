import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class listgame {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int  n = Integer.parseInt(br.readLine());
        int x = n, count = 0, divisor = 2;
        while(n >= (divisor*divisor) && x > 1) {
        	while(x%divisor==0) {
        		x /= divisor;
        		count++;
        	}
        	divisor++;
        }
        if(x > 1) 
        	count++;
        bw.write(count + "\n");
		bw.flush();
	}
}

