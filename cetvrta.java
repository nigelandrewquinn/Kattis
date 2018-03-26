import java.io.*;
public class cetvrta{
		public static void main(String[] args) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			String s = br.readLine();
			int a1 = Integer.parseInt(s.split(" ")[0]);
			int a2 = Integer.parseInt(s.split(" ")[1]);
			s = br.readLine();
			int b1 = Integer.parseInt(s.split(" ")[0]);
			int b2 = Integer.parseInt(s.split(" ")[1]);
			s = br.readLine();
			int c1 = Integer.parseInt(s.split(" ")[0]);
			int c2 = Integer.parseInt(s.split(" ")[1]);
			
			if(a1==b1)bw.write("" + c1 + " ");
			else if(b1==c1)bw.write("" + a1 + " ");
			else bw.write("" + b1 + " ");
			
			if(a2==b2)bw.write("" + c2);
			else if(b2==c2)bw.write("" + a2);
			else bw.write("" + b2);
			bw.flush();
		}
}
