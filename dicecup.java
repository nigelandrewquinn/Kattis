import java.io.*;
public class dicecup{
		public static void main(String[] args) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			String s[] = br.readLine().split(" ");
			int x = Integer.parseInt(s[0]);
			int y = Integer.parseInt(s[1]);
			if (x <= y) 
				for (int i = x + 1; i <= y + 1; i++) 
					bw.write(i+"\n");			
			else 
				for (int i = y + 1; i <= x + 1; i++) 
					bw.write(i+"\n");       
			bw.flush();
		}
}
