import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Soylent {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
        	int x = Integer.parseInt(br.readLine());
        	if(x%400==0)
        		bw.write(x/400 + "\n"); 
        	else
        		bw.write(((x/400)+1) + "\n"); 
        }       
        bw.flush();
	}
}
