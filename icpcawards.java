import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class icpcawards {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    int n = Integer.parseInt(br.readLine());
	    String array[] = new String[12];
	    int count = 1;
	    int total = 1;
	    array[0] = br.readLine();
	    bw.write(array[0]+"\n");
	    
	    while(count < 12) {
	    	
	    		String temp = br.readLine();
	    		total++;
	    		String first[] = temp.split(" ");
	    		int tc = 0;
	    		for(int i = 0; i < count; i++) {
	    			if(array[i].startsWith(first[0]))
	    				tc++;
	    		}
	    		
	    		if(tc==0){
	    			array[count]=temp;
	    			count++;
	    			bw.write(temp+"\n");
	    	}
	    }
	    n = n-total;
	    if(n>0) 
	    	for(int i = 0; i < n; i++) {
	    		String temp = br.readLine();
	    }
	   	bw.flush();
	}
}
