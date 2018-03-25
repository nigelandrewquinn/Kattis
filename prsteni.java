import java.io.*;
public class prsteni{
		public static void main(String[] args) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int n = Integer.parseInt(br.readLine());
			String s[] = br.readLine().split(" ");
			int x = Integer.parseInt(s[0]);
			for(int i = 1; i < n; i++) {
				int y = Integer.parseInt(s[i]);
				int	den = den(x, y);
				bw.write((x / den) + "/" + (y / den)+"\n");
			}     
			bw.flush();
		}
		public static int den(int x, int y) {
			return y == 0 ? x : den(y, x % y);
		}							
}
