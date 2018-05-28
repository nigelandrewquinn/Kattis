import java.io.*;
import java.util.*;
public class encodedmessage{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());

		for(int i = 0; i < n; i++){
			String s = br.readLine();
			int x = (int) Math.sqrt(s.length());
			String twoD[][] = new String [x][x];
			String ar[] = s.split("");
			int c = 0;
			s = "";

			for (int j = 0; j < twoD.length; j++) 
    			for (int k = 0; k < twoD[0].length; k++) {
        			twoD[j][k] = ar[c];
        			c++;
    			}
    		
			for(int j = x-1; j >= 0; j--){
				for(int k = 0; k < x; k++){		
					s += twoD[k][j];
				}
			}
			bw.write(s + "\n");	
		}	
		        
		bw.flush();		
	}
}
