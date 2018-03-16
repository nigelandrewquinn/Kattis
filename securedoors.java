import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
public class securedoors {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<String> ppl = new ArrayList<String>();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
        	String s = br.readLine();
        	String name = s.split(" ")[1];
        	if(s.startsWith("entry")) {
        		if(ppl.contains(name))
        			bw.write(name + " entered (ANOMALY)" + "\n");
        		else {
        			bw.write(name + " entered" + "\n");
        			ppl.add(name);
        		}
        	}
        	else {
        		if(!ppl.contains(name))
        			bw.write(name + " exited (ANOMALY)" + "\n");
        		else {
        			bw.write(name + " exited" + "\n");
        			ppl.remove(name);
        		}
        		
        	}
        	
        }
		
        bw.write("\n");        
        bw.flush();
	}
}
