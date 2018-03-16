import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class battlesimulation{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String attack = br.readLine();
        for(int i = 0; i<attack.length(); i++){
        	if(i < attack.length()-2){
        		if(attack.substring(i,i+3).matches("RBL") || attack.substring(i,i+3).matches("RLB") || 
        				attack.substring(i,i+3).matches("BLR") || attack.substring(i,i+3).matches("BRL") || 
        				attack.substring(i,i+3).matches("LRB") || attack.substring(i,i+3).matches("LBR")) {
        			bw.write("C");
        			i += 2;
        			continue;
        		}	
        	}
        	if(attack.charAt(i) == 'R')
        			bw.write("S");
        	if(attack.charAt(i) == 'B')
        			bw.write("K");
        	if(attack.charAt(i) == 'L')
        			bw.write("H");

       }
        bw.flush();
	}
}

        
