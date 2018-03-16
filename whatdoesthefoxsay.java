import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class whatdoesthefoxsay {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
        	String temp = br.readLine();
        	String ar[] = temp.split(" ");
        	while(true) {
        		temp = br.readLine(); 
            	if(temp.equals("what does the fox say?"))
            		break;
            	String array[] = temp.split(" ");
            	for(int j = 0; j < ar.length; j++) {
            		if(ar[j].equals(array[2]))
            			ar[j] = "0";
            	}
            		
        	}
        	for(int j = 0; j < ar.length; j++) {
        		if(ar[j]!="0")
        			bw.write(ar[j] + " ");
        	}
        	bw.write("\n");
        }
		bw.flush();
	}
}

