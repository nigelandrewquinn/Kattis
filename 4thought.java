import java.io.*;
public class 4thought{
		public static void main(String[] args) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int n = Integer.parseInt(br.readLine());
			for(int i = 0; i < n; i++) {
				int x = Integer.parseInt(br.readLine());				
				if(4+4+4/4==x)
					bw.write("4 + 4 + 4 / 4 = " + x + "\n");
	            else if(4+4+4*4==x)
	            	bw.write("4 + 4 + 4 * 4 = " + x + "\n");
	            else if(4+4+4+4==x)
	            	bw.write("4 + 4 + 4 + 4 = " + x + "\n");
	            else if(4+4+4-4==x)
	            	bw.write("4 + 4 + 4 - 4 = " + x + "\n");
	            else if(4+4-4/4==x)
	            	bw.write("4 + 4 - 4 / 4 = " + x + "\n");
	            else if(4+4-4*4==x)
	            	bw.write("4 + 4 - 4 * 4 = " + x + "\n");
	            else if(4+4-4+4==x)
	            	bw.write("4 + 4 - 4 + 4 = " + x + "\n");
	            else if(4+4-4-4==x)
	            	bw.write("4 + 4 - 4 - 4 = " + x + "\n");
	            else if(4+4*4/4==x)
	            	bw.write("4 + 4 * 4 / 4 = " + x + "\n");
	            else if(4+4*4*4==x)
	            	bw.write("4 + 4 * 4 * 4 = " + x + "\n");
	            else if(4+4*4+4==x)
	            	bw.write("4 + 4 * 4 + 4 = " + x + "\n");
	            else if(4+4*4-4==x)
	            	bw.write("4 + 4 * 4 - 4 = " + x + "\n");
	            else if(4+4/4/4==x)
	            	bw.write("4 + 4 / 4 / 4 = " + x + "\n");
	            else if(4+4/4*4==x)
	            	bw.write("4 + 4 / 4 * 4 = " + x + "\n");
	            else if(4+4/4+4==x)
	            	bw.write("4 + 4 / 4 + 4 = " + x + "\n");
	            else if(4+4/4-4==x)
	            	bw.write("4 + 4 / 4 - 4 = " + x + "\n");
	            else if(4-4+4/4==x)
	            	bw.write("4 - 4 + 4 / 4 = " + x + "\n");
	            else if(4-4+4*4==x)
	            	bw.write("4 - 4 + 4 * 4 = " + x + "\n");
	            else if(4-4+4+4==x)
	            	bw.write("4 - 4 + 4 + 4 = " + x + "\n");
	            else if(4-4+4-4==x)
	            	bw.write("4 - 4 + 4 - 4 = " + x + "\n");
	            else if(4-4-4/4==x)
	            	bw.write("4 - 4 - 4 / 4 = " + x + "\n");
	            else if(4-4-4*4==x)
	            	bw.write("4 - 4 - 4 * 4 = " + x + "\n");
	            else if(4-4-4+4==x)
	            	bw.write("4 - 4 - 4 + 4 = " + x + "\n");
	            else if(4-4-4-4==x)
	            	bw.write("4 - 4 - 4 - 4 = " + x + "\n");
	            else if(4-4*4/4==x)
	            	bw.write("4 - 4 * 4 / 4 = " + x + "\n");
	            else if(4-4*4*4==x)
	            	bw.write("4 - 4 * 4 * 4 = " + x + "\n");
	            else if(4-4*4+4==x)
	            	bw.write("4 - 4 * 4 + 4 = " + x + "\n");
	            else if(4-4*4-4==x)
	            	bw.write("4 - 4 * 4 - 4 = " + x + "\n");
	            else if(4-4/4/4==x)
	            	bw.write("4 - 4 / 4 / 4 = " + x + "\n");
	            else if(4-4/4*4==x)
	            	bw.write("4 - 4 / 4 * 4 = " + x + "\n");
	            else if(4-4/4+4==x)
	            	bw.write("4 - 4 / 4 + 4 = " + x + "\n");
	            else if(4-4/4-4==x)
	            	bw.write("4 - 4 / 4 - 4 = " + x + "\n");	            
	            else if(4*4+4/4==x)
	            	bw.write("4 * 4 + 4 / 4 = " + x + "\n");
	            else if(4*4+4*4==x)
	            	bw.write("4 * 4 + 4 * 4 = " + x + "\n");
	            else if(4*4+4+4==x)
	            	bw.write("4 * 4 + 4 + 4 = " + x + "\n");
	            else if(4*4+4-4==x)
	            	bw.write("4 * 4 + 4 - 4 = " + x + "\n");
	            else if(4*4-4/4==x)
	            	bw.write("4 * 4 - 4 / 4 = " + x + "\n");
	            else if(4*4-4*4==x)
	            	bw.write("4 * 4 - 4 * 4 = " + x + "\n");
	            else if(4*4-4+4==x)
	            	bw.write("4 * 4 - 4 + 4 = " + x + "\n");
	            else if(4*4-4-4==x)
	            	bw.write("4 * 4 - 4 - 4 = " + x + "\n");
	            else if(4*4*4/4==x)
	            	bw.write("4 * 4 * 4 / 4 = " + x + "\n");
	            else if(4*4*4*4==x)
	            	bw.write("4 * 4 * 4 * 4 = " + x + "\n");
	            else if(4*4*4+4==x)
	            	bw.write("4 * 4 * 4 + 4 = " + x + "\n");
	            else if(4*4*4-4==x)
	            	bw.write("4 * 4 * 4 - 4 = " + x + "\n");
	            else if(4*4/4/4==x)
	            	bw.write("4 * 4 / 4 / 4 = " + x + "\n");
	            else if(4*4/4*4==x)
	            	bw.write("4 * 4 / 4 * 4 = " + x + "\n");
	            else if(4*4/4+4==x)
	            	bw.write("4 * 4 / 4 + 4 = " + x + "\n");
	            else if(4*4/4-4==x)
	            	bw.write("4 * 4 / 4 - 4 = " + x + "\n");	            
	            else if(4/4+4/4==x)
	            	bw.write("4 / 4 + 4 / 4 = " + x + "\n");
	            else if(4/4+4*4==x)
	            	bw.write("4 / 4 + 4 * 4 = " + x + "\n");
	            else if(4/4+4+4==x)
	            	bw.write("4 / 4 + 4 + 4 = " + x + "\n");
	            else if(4/4+4-4==x)
	            	bw.write("4 / 4 + 4 - 4 = " + x + "\n");
	            else if(4/4-4/4==x)
	            	bw.write("4 / 4 - 4 / 4 = " + x + "\n");
	            else if(4/4-4*4==x)
	            	bw.write("4 / 4 - 4 * 4 = " + x + "\n");
	            else if(4/4-4+4==x)
	            	bw.write("4 / 4 - 4 + 4 = " + x + "\n");
	            else if(4/4-4-4==x)
	            	bw.write("4 / 4 - 4 - 4 = " + x + "\n");
	            else if(4/4*4/4==x)
	            	bw.write("4 / 4 * 4 / 4 = " + x + "\n");
	            else if(4/4*4*4==x)
	            	bw.write("4 / 4 * 4 * 4 = " + x + "\n");
	            else if(4/4*4+4==x)
	            	bw.write("4 / 4 * 4 + 4 = " + x + "\n");
	            else if(4/4*4-4==x)
	            	bw.write("4 / 4 * 4 - 4 = " + x + "\n");
	            else if(4/4/4/4==x)
	            	bw.write("4 / 4 / 4 / 4 = " + x + "\n");
	            else if(4/4/4*4==x)
	            	bw.write("4 / 4 / 4 * 4 = " + x + "\n");
	            else if(4/4/4+4==x)
	            	bw.write("4 / 4 / 4 + 4 = " + x + "\n");
	            else if(4/4/4-4==x)
	            	bw.write("4 / 4 / 4 - 4 = " + x + "\n");
	            else 
	            	bw.write("no solution" + "\n");
			}       
			bw.flush();
		}
}
