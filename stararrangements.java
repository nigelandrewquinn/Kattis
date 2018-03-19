import java.io.*;
public class stararrangements {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		bw.write(n + ":" +  "\n"); 
		for(int i = 2; i < n; i++) {
			if (n%(i+i-1)==0 || n%(i+i-1)==i)
				bw.write(i + "," + (i-1) + "\n");
			if(n%i == 0)
				bw.write(i + "," + i + "\n");		
		}      
		bw.flush();
	}
}
