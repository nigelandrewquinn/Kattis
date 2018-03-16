import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class dvds {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            int x = Integer.parseInt(br.readLine());
            String s = br.readLine();
            String array[] = s.split(" ");
            int count = 0;
            int k = 1;
            for(int j = 0; j < array.length; j++) {
            	if(k != Integer.parseInt(array[j]))
            		count++;
            	else
            		k++;
            }
            bw.write(count + "\n");  
          }
        bw.flush();
	}
}
