import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class aboveaverage {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n; i++) {
            
            String s = br.readLine();
            String array[] = s.split(" ");
            int ppl = Integer.parseInt(array[0]);
            int count = 0;
            double avg = 0;
            
            for(int j = 1; j < array.length; j++) {
            	avg += Integer.parseInt(array[j]);	
            }
            avg = avg/ppl;
            for(int j = 1; j < array.length; j++) {
            	if(Integer.parseInt(array[j])> avg)
            		count++;
            }  
            float ans = (float)count*100/ppl;
            System.out.printf("%.3f",ans);
            System.out.print("%\n");
        }
        
	}
}
