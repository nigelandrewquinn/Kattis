import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class anothercandies {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int  n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
        	
        	String nothing = br.readLine();
        	int x = Integer.parseInt(br.readLine());
            long total=0;
            for(int j = 0; j < x; j++){
                total += Long.parseLong(br.readLine())%x;
            }
            if(total%x==0)
            	bw.write("YES"+"\n");
            else 
            	bw.write("NO"+"\n");
            bw.flush();
        }
	}
}
