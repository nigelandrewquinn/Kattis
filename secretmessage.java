import java.io.*;
import java.util.*;
public class secretmessage{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for (int i = Integer.parseInt(br.readLine()); i > 0; i--){
			String s = br.readLine();
			int n = 1;
	
			while (n*n < s.length())
				n++;

			for (int x = 0; x < n*n - s.length(); x++)
				s += "*";

			char ar [][]= new char[n][n];
	
			for (int r = 0; r < ar.length; r++)
				for (int c = 0; c < ar.length; c++)
					ar[r][c] = s.charAt(n*r + c);
	
			for (int c = 0; c < ar.length; c++)
				for (int r = ar.length - 1; r >= 0; r--)
					if (ar[r][c] != '*')
						bw.write(ar[r][c]);

			bw.write("\n");
		}
		bw.flush();
	}
}
