import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class lineup {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int  n = Integer.parseInt(br.readLine());
        String array[] = new String [n]; 
        for(int i = 0; i < n; i++) {
        	array[i] = br.readLine();
        }
        boolean increasing = true;
        boolean decreasing = true;
        for(int i = 0; i < array.length-1; i++) {
        	if(array[i].compareTo(array[i+1])>0)
        		increasing = false;
        	if(array[i].compareTo(array[i+1])<0)
        		decreasing = false;
        	if(decreasing == false && increasing == false) {
        		bw.write("NEITHER");
        		break;
        	}	
        }
        if(decreasing == true)
        	bw.write("DECREASING");
        else if(increasing == true)
        	bw.write("INCREASING");        
        bw.flush();
	}
}
