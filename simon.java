import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class simon
{
    public static void main(String args[]) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < n; i++){
            String s = br.readLine();
            if (s.startsWith("simon says")&& !s.equals("simon says")){
                bw.write(s.substring(11) + "\n");
            }
            else{
            	bw.write("" + "\n");
            }
        }
        bw.flush();
    }
}
