import java.io.*;
import java.util.*;
public class tajna{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		String a[] = s.split("");
		int n = (int) Math.sqrt(s.length());
        int r = n, c = 1;
        for (int i = n; i > 0; i--) {
            if (s.length() % i == 0) {
                r = i;
                c = s.length() / i;
                break;
            }
        }
        String ar[][] = new String[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ar[j][i] = a[j*r+i];
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                bw.write(ar[j][i]);
            }
        }

        bw.flush();
		
	}
}
